package `in`.zeromod.epoxymodelgroup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.delay

class MainViewModel : ViewModel() {
    val items = liveData {
        emit(
            listOf(
                Item(
                    "Title 1",
                    listOf(
                        "Attribute 1",
                        "Attribute 2",
                        "Attribute 3"
                    )
                )
            )
        )
        delay(5000)
        emit(
            listOf(
                Item(
                    "Title 2",
                    listOf(
                        "Attribute 4",
                        "Attribute 5",
                        "Attribute 6"
                    )
                )
            )
        )
    }
}