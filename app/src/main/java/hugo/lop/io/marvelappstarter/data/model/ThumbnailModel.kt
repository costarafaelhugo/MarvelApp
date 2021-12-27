package hugo.lop.io.marvelappstarter.data.model

import com.google.gson.annotations.SerializedName

data class ThumbnailModel(

    @SerializedName("path_url")
    val path: String,
    @SerializedName("extension")
    val extension: String
)
