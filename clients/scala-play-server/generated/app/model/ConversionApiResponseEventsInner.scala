package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionApiResponse_events_inner.
  * @param errorMessage Error message containing more information about why the event failed to be processed.
  * @param status Whether the event was processed successfully.
  * @param warningMessage Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionApiResponseEventsInner(
  errorMessage: Option[String],
  status: ConversionApiResponseEventsInner.Status.Value,
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

