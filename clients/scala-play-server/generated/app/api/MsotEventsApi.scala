package api

import play.api.libs.json._
import model.ConversionMSOTEventsCreate
import model.Error
import model.JsObject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait MsotEventsApi {
  /**
    * Send Measurement Source Of Truth (MSOT) attributed conversion events
    * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
    * @param adAccountId Unique identifier of an ad account.
    */
  def msotEventsCreate(adAccountId: String, conversionMSOTEventsCreate: ConversionMSOTEventsCreate): Unit
}
