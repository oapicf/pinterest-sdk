package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordUpdate.
  * @param id Keyword ID.
  * @param archived Is keyword archived?
  * @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class KeywordUpdate(
  id: String,
  archived: Option[Boolean],
  bid: Option[Int]
)

object KeywordUpdate {
  implicit lazy val keywordUpdateJsonFormat: Format[KeywordUpdate] = Json.format[KeywordUpdate]
}

