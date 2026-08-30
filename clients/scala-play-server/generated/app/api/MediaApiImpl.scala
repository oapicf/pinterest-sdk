package api

import model.Error
import model.Media
import model.MediaList200Response
import model.MediaUpload
import model.MediaUploadCreate

/**
  * Provides a default implementation for [[MediaApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class MediaApiImpl extends MediaApi {
  /**
    * @inheritdoc
    */
  override def mediaCreate(mediaUploadCreate: MediaUploadCreate): MediaUpload = {
    // TODO: Implement better logic

    MediaUpload("", MediaUploadType(), None, None)
  }

  /**
    * @inheritdoc
    */
  override def mediaGet(mediaId: String): Media = {
    // TODO: Implement better logic

    Media("", MediaUploadType(), None)
  }

  /**
    * @inheritdoc
    */
  override def mediaList(bookmark: Option[String], pageSize: Option[Int]): MediaList200Response = {
    // TODO: Implement better logic

    MediaList200Response(None, List.empty[Media])
  }
}
