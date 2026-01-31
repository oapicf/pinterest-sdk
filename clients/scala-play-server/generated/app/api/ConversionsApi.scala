package api

import play.api.libs.json._
import model.AdvertiserDefinedEventsResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ConversionsApi {
  /**
    * Get advertiser defined events
    * &lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsGet(adAccountId: String): AdvertiserDefinedEventsResponse
}
