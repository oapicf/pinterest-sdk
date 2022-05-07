package api

import model.Error
import model.JsObject
import model.MediaUpload
import model.MediaUploadDetails
import model.MediaUploadRequest
import model.Paginated

/**
  * Provides a default implementation for [[MediaApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
class MediaApiImpl extends MediaApi {
  /**
    * @inheritdoc
    */
  override def mediaCreate(mediaUploadRequest: MediaUploadRequest): MediaUpload = {
    // TODO: Implement better logic

    MediaUpload(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def mediaGet(mediaId: String): MediaUploadDetails = {
    // TODO: Implement better logic

    MediaUploadDetails(None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def mediaList(bookmark: Option[String], pageSize: Option[Int]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }
}
