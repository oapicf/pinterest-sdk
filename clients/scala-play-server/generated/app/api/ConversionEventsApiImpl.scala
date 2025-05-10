package api

import model.ConversionApiResponse
import model.ConversionEvents
import model.DetailedError
import model.Error

/**
  * Provides a default implementation for [[ConversionEventsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
class ConversionEventsApiImpl extends ConversionEventsApi {
  /**
    * @inheritdoc
    */
  override def eventsCreate(adAccountId: String, conversionEvents: ConversionEvents, test: Option[Boolean]): ConversionApiResponse = {
    // TODO: Implement better logic

    ConversionApiResponse(0, 0, List.empty[ConversionApiResponseEventsInner])
  }
}
