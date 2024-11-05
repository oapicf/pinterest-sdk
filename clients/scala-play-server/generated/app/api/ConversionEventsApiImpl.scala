package api

import model.ConversionApiResponse
import model.ConversionEvents
import model.DetailedError
import model.Error

/**
  * Provides a default implementation for [[ConversionEventsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class ConversionEventsApiImpl extends ConversionEventsApi {
  /**
    * @inheritdoc
    */
  override def eventsCreate(adAccountId: String, conversionEvents: ConversionEvents, test: Option[Boolean]): ConversionApiResponse = {
    // TODO: Implement better logic

    ConversionApiResponse(0, 0, List.empty[ConversionApiResponseEventsInner])
  }
}
