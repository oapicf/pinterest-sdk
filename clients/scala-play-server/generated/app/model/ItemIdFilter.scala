package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemIdFilter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class ItemIdFilter(
  ITEM_ID: CatalogsProductGroupCurrencyCriteria
  additionalProperties: 
)

object ItemIdFilter {
  implicit lazy val itemIdFilterJsonFormat: Format[ItemIdFilter] = {
    val realJsonFormat = Json.format[ItemIdFilter]
    val declaredPropNames = Set("ITEM_ID")
    
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
      Writes { itemIdFilter =>
        val jsObj = realJsonFormat.writes(itemIdFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

