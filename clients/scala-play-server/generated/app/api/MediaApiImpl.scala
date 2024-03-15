package api

import model.Error
import model.MediaList200Response
import model.MediaUpload
import model.MediaUploadDetails
import model.MediaUploadRequest

/**
  * Provides a default implementation for [[MediaApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

    MediaUploadDetails(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def mediaList(bookmark: Option[String], pageSize: Option[Int]): MediaList200Response = {
    // TODO: Implement better logic

    MediaList200Response(List.empty[MediaUploadDetails], None)
  }
}
