package `in`.zeromod.epoxymodelgroup

import android.widget.TextView
import com.airbnb.epoxy.*

@EpoxyModelClass(layout = R.layout.row_group)
abstract class RowGroup(models: List<EpoxyModel<*>>) : EpoxyModelGroup(R.layout.row_group, models) {
    @EpoxyAttribute
    lateinit var title: String

    override fun bind(holder: ModelGroupHolder) {
        super.bind(holder)
        holder.rootView.findViewById<TextView>(R.id.title_text_view).text = title
    }
}
