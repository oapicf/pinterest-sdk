package api

import play.api.libs.json._
import model.Error
import model.NotificationPostRequest
import model.NotificationResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait NotificationApi {
  /**
    * Receive notifications from external partners.
    * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.
    */
  def notificationPost(notificationPostRequest: NotificationPostRequest): NotificationResponse
}
