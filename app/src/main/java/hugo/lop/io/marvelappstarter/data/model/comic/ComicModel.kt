package hugo.lop.io.marvelappstarter.data.model.comic

import com.google.gson.annotations.SerializedName
import hugo.lop.io.marvelappstarter.data.model.ThumbnailModel
import java.io.Serializable

data class ComicModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val descrption: String,
    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
): Serializable