package api

import play.api.libs.json._
import model.Error
import model.Media
import model.MediaList200Response
import model.MediaUpload
import model.MediaUploadCreate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait MediaApi {
  /**
    * Register media upload
    * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    */
  def mediaCreate(mediaUploadCreate: MediaUploadCreate): MediaUpload

  /**
    * Get media upload details
    * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    */
  def mediaGet(mediaId: String): Media

  /**
    * List media uploads
    * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def mediaList(bookmark: Option[String], pageSize: Option[Int]): MediaList200Response
}
