package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordUpdateBody.
  * @param keywords Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class KeywordUpdateBody(
  keywords: List[KeywordUpdate]
)

object KeywordUpdateBody {
  implicit lazy val keywordUpdateBodyJsonFormat: Format[KeywordUpdateBody] = Json.format[KeywordUpdateBody]
}

