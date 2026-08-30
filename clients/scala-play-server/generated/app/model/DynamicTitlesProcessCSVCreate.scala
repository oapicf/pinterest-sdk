package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param requestId The request_id returned from the GET uploads endpoint.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DynamicTitlesProcessCSVCreate(
  requestId: String
)

object DynamicTitlesProcessCSVCreate {
  implicit lazy val dynamicTitlesProcessCSVCreateJsonFormat: Format[DynamicTitlesProcessCSVCreate] = Json.format[DynamicTitlesProcessCSVCreate]
}

