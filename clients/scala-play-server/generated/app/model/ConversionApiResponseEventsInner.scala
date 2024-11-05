package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionApiResponse_events_inner.
  * @param status Whether the event was processed successfully.
  * @param errorMessage Error message containing more information about why the event failed to be processed.
  * @param warningMessage Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ConversionApiResponseEventsInner(
  status: ConversionApiResponseEventsInner.Status.Value,
  errorMessage: Option[String],
  warningMessage: Option[String]
)

object ConversionApiResponseEventsInner {
  implicit lazy val conversionApiResponseEventsInnerJsonFormat: Format[ConversionApiResponseEventsInner] = Json.format[ConversionApiResponseEventsInner]

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Failed = Value("failed")
    val Processed = Value("processed")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

