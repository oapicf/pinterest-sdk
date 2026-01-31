package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordUpdateBody.
  * @param keywords Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class KeywordUpdateBody(
  keywords: List[KeywordUpdate]
)

object KeywordUpdateBody {
  implicit lazy val keywordUpdateBodyJsonFormat: Format[KeywordUpdateBody] = Json.format[KeywordUpdateBody]
}

