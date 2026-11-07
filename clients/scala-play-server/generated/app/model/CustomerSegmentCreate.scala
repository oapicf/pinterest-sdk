package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param audienceIds Audience IDs included in the customer segment.
  * @param name Customer segment name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomerSegmentCreate(
  audienceIds: List[String],
  name: String
)

object CustomerSegmentCreate {
  implicit lazy val customerSegmentCreateJsonFormat: Format[CustomerSegmentCreate] = Json.format[CustomerSegmentCreate]
}

