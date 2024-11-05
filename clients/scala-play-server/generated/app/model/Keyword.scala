package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Keyword.
  * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param value Keyword value (120 chars max).
  * @param id Keyword ID .
  * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
  * @param parentType Parent entity type
  * @param `type` Always keyword
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class Keyword(
  bid: Option[Int],
  matchType: MatchTypeResponse,
  value: String,
  archived: Option[Boolean],
  id: Option[String],
  parentId: Option[String],
  parentType: Option[String],
  `type`: Option[String]
  additionalProperties: 
)

object Keyword {
  implicit lazy val keywordJsonFormat: Format[Keyword] = {
    val realJsonFormat = Json.format[Keyword]
    val declaredPropNames = Set("bid", "matchType", "value", "archived", "id", "parentId", "parentType", "`type`")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { keyword =>
        val jsObj = realJsonFormat.writes(keyword)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

