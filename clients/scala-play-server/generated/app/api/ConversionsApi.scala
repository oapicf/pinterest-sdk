package api

import play.api.libs.json._
import model.AdvertiserDefinedEventsCreate200Response
import model.AdvertiserDefinedEventsCreateRequest
import model.AdvertiserDefinedEventsGet200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait ConversionsApi {
  /**
    * Create advertiser defined events
    * Map advertiser defined events to standard events for the given ad account.
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsCreate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): AdvertiserDefinedEventsCreate200Response

  /**
    * Delete advertiser defined events
    * Untrack advertiser defined events for the given ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param eventNames List of event names to delete
    */
  def advertiserDefinedEventsDelete(adAccountId: String, eventNames: List[String]): AdvertiserDefinedEventsCreate200Response

  /**
    * Get advertiser defined events
    * Get advertiser defined events for the given ad account.
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsGet(adAccountId: String): AdvertiserDefinedEventsGet200Response

  /**
    * Update advertiser defined events
    * Update advertiser defined event names or mappings for the given ad account.
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsUpdate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): AdvertiserDefinedEventsCreate200Response
}
