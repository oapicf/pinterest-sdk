package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionApiResponseEventsItems.
  * @param errorMessage Error message containing more information about why the event failed to be processed.
  * @param status Whether the event was processed successfully.
  * @param warningMessage Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionApiResponseEventsItems(
  errorMessage: Option[String],
  status: EventProcessingStatus,
  warningMessage: Option[String]
)

object ConversionApiResponseEventsItems {
  implicit lazy val conversionApiResponseEventsItemsJsonFormat: Format[ConversionApiResponseEventsItems] = Json.format[ConversionApiResponseEventsItems]
}

