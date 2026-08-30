package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordUpdateGenerated.
  * @param archived Is keyword archived?
  * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param id Keyword ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeywordUpdateGenerated(
  archived: Option[Boolean],
  bid: Option[Int],
  id: String
)

object KeywordUpdateGenerated {
  implicit lazy val keywordUpdateGeneratedJsonFormat: Format[KeywordUpdateGenerated] = Json.format[KeywordUpdateGenerated]
}

