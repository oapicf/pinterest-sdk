package api

import model.Error
import model.NotificationPostRequest
import model.NotificationResponse

/**
  * Provides a default implementation for [[NotificationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class NotificationApiImpl extends NotificationApi {
  /**
    * @inheritdoc
    */
  override def notificationPost(notificationPostRequest: NotificationPostRequest): NotificationResponse = {
    // TODO: Implement better logic

    NotificationResponse(None, None, None)
  }
}
