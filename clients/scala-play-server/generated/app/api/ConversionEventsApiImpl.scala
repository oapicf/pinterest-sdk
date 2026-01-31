package api

import model.ConversionApiResponse
import model.ConversionEvents
import model.DetailedError
import model.Error

/**
  * Provides a default implementation for [[ConversionEventsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ConversionEventsApiImpl extends ConversionEventsApi {
  /**
    * @inheritdoc
    */
  override def eventsCreate(adAccountId: String, conversionEvents: ConversionEvents, test: Option[Boolean]): ConversionApiResponse = {
    // TODO: Implement better logic

    ConversionApiResponse(List.empty[ConversionApiResponseEventsInner], 0, 0)
  }
}
