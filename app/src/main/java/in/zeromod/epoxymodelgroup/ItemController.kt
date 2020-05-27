package `in`.zeromod.epoxymodelgroup

import com.airbnb.epoxy.TypedEpoxyController

class ItemController : TypedEpoxyController<List<Item>>() {
    override fun buildModels(data: List<Item>) {
        data.forEachIndexed { itemIndex, item ->
            val models = item.attributes.mapIndexed { index, attribute ->
                ItemBindingModel_().apply {
                    id("attribute$itemIndex$index")
                    text(attribute)
                }
            }
            rowGroup(models) {
                id("item$itemIndex")
                title(item.title)
            }
        }
    }
}