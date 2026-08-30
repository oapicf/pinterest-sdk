package api

import model.AdvertiserDefinedEventsCreate200Response
import model.AdvertiserDefinedEventsCreateRequest
import model.AdvertiserDefinedEventsGet200Response
import model.Error

/**
  * Provides a default implementation for [[ConversionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ConversionsApiImpl extends ConversionsApi {
  /**
    * @inheritdoc
    */
  override def advertiserDefinedEventsCreate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): AdvertiserDefinedEventsCreate200Response = {
    // TODO: Implement better logic

    AdvertiserDefinedEventsCreate200Response(List.empty[AdvertiserDefinedEventProcessingRecord])
  }

  /**
    * @inheritdoc
    */
  override def advertiserDefinedEventsDelete(adAccountId: String, eventNames: List[String]): AdvertiserDefinedEventsCreate200Response = {
    // TODO: Implement better logic

    AdvertiserDefinedEventsCreate200Response(List.empty[AdvertiserDefinedEventProcessingRecord])
  }

  /**
    * @inheritdoc
    */
  override def advertiserDefinedEventsGet(adAccountId: String): AdvertiserDefinedEventsGet200Response = {
    // TODO: Implement better logic

    AdvertiserDefinedEventsGet200Response(List.empty[AdvertiserDefinedEvent])
  }

  /**
    * @inheritdoc
    */
  override def advertiserDefinedEventsUpdate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): AdvertiserDefinedEventsCreate200Response = {
    // TODO: Implement better logic

    AdvertiserDefinedEventsCreate200Response(List.empty[AdvertiserDefinedEventProcessingRecord])
  }
}
