package api

import model.ConversionEvents
import model.ConversionEventsCreate
import model.DetailedError
import model.Error

/**
  * Provides a default implementation for [[ConversionEventsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class ConversionEventsApiImpl extends ConversionEventsApi {
  /**
    * @inheritdoc
    */
  override def eventsCreate(adAccountId: String, conversionEventsCreate: ConversionEventsCreate, test: Option[Boolean]): ConversionEvents = {
    // TODO: Implement better logic

    ConversionEvents(List.empty[ConversionApiResponseEventsItems], 0, 0)
  }
}
