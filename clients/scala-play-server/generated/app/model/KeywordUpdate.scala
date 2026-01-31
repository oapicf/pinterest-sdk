package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordUpdate.
  * @param archived Is keyword archived?
  * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param id Keyword ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class KeywordUpdate(
  archived: Option[Boolean],
  bid: Option[Int],
  id: String
)

object KeywordUpdate {
  implicit lazy val keywordUpdateJsonFormat: Format[KeywordUpdate] = Json.format[KeywordUpdate]
}

