package api

import model.Error
import model.NotificationPostRequest
import model.NotificationResponse

/**
  * Provides a default implementation for [[NotificationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class NotificationApiImpl extends NotificationApi {
  /**
    * @inheritdoc
    */
  override def notificationPost(notificationPostRequest: NotificationPostRequest): NotificationResponse = {
    // TODO: Implement better logic

    NotificationResponse(None, None, None)
  }
}
