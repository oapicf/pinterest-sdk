package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemGroupIdFilter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class ItemGroupIdFilter(
  ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria
  additionalProperties: 
)

object ItemGroupIdFilter {
  implicit lazy val itemGroupIdFilterJsonFormat: Format[ItemGroupIdFilter] = {
    val realJsonFormat = Json.format[ItemGroupIdFilter]
    val declaredPropNames = Set("ITEM_GROUP_ID")
    
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
      Writes { itemGroupIdFilter =>
        val jsObj = realJsonFormat.writes(itemGroupIdFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

