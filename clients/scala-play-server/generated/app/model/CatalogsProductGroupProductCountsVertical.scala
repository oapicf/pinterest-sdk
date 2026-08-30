package model

import play.api.libs.json._

/**
  * Product counts for a CatalogsProductGroup
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupProductCountsVertical(
  catalogType: CatalogsProductGroupProductCountsVertical.CatalogType.Value,
  inStock: BigDecimal,
  outOfStock: BigDecimal,
  preorder: BigDecimal,
  total: BigDecimal,
  videos: BigDecimal,
  appLinks: BigDecimal,
  images: BigDecimal
  additionalProperties: 
)

object CatalogsProductGroupProductCountsVertical {
  implicit lazy val catalogsProductGroupProductCountsVerticalJsonFormat: Format[CatalogsProductGroupProductCountsVertical] = {
    val realJsonFormat = Json.format[CatalogsProductGroupProductCountsVertical]
    val declaredPropNames = Set("catalogType", "inStock", "outOfStock", "preorder", "total", "videos", "appLinks", "images")
    
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
      Writes { catalogsProductGroupProductCountsVertical =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupProductCountsVertical)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

