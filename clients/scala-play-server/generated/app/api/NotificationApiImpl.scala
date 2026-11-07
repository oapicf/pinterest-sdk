package api

import model.Error
import model.NotificationPostRequest
import model.NotificationResponse

/**
  * Provides a default implementation for [[NotificationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class NotificationApiImpl extends NotificationApi {
  /**
    * @inheritdoc
    */
  override def notificationPost(notificationPostRequest: NotificationPostRequest): NotificationResponse = {
    // TODO: Implement better logic

    NotificationResponse(None, None, None)
  }
}
