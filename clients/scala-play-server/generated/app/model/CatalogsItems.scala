package model

import play.api.libs.json._

/**
  * Response object of catalogs items
  * @param items Array with catalogs items
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CatalogsItems(
  items: Option[List[ItemBatchRecord]]
  additionalProperties: 
)

object CatalogsItems {
  implicit lazy val catalogsItemsJsonFormat: Format[CatalogsItems] = {
    val realJsonFormat = Json.format[CatalogsItems]
    val declaredPropNames = Set("items")
    
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
      Writes { catalogsItems =>
        val jsObj = realJsonFormat.writes(catalogsItems)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

