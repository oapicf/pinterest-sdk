package api

import model.ConversionApiResponse
import model.ConversionEvents
import model.DetailedError
import model.Error

/**
  * Provides a default implementation for [[ConversionEventsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class ConversionEventsApiImpl extends ConversionEventsApi {
  /**
    * @inheritdoc
    */
  override def eventsCreate(adAccountId: String, conversionEvents: ConversionEvents, test: Option[Boolean]): ConversionApiResponse = {
    // TODO: Implement better logic

    ConversionApiResponse(0, 0, List.empty[ConversionApiResponseEventsInner])
  }
}
