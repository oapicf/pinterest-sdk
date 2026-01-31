package model

import play.api.libs.json._

/**
  * The resource was successfully deleted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Status204(
  statusCode: Status204.StatusCode.Value
)

object Status204 {
  implicit lazy val pinterestLibStatus204JsonFormat: Format[Status204] = Json.format[Status204]

  // noinspection TypeAnnotation
  object StatusCode extends Enumeration {
    val _204 = Value("204")

    type StatusCode = Value
    implicit lazy val StatusCodeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

