package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordUpdate.
  * @param id Keyword ID.
  * @param archived Is keyword archived?
  * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class KeywordUpdate(
  id: String,
  archived: Option[Boolean],
  bid: Option[Int]
)

object KeywordUpdate {
  implicit lazy val keywordUpdateJsonFormat: Format[KeywordUpdate] = Json.format[KeywordUpdate]
}

