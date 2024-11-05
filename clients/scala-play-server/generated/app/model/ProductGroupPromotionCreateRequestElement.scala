package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionCreateRequestElement.
  * @param id ID of the product group promotion.
  * @param adGroupId ID of the ad group the product group belongs to.
  * @param bidInMicroCurrency The bid in micro currency.
  * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  * @param definition The full product group definition path
  * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair
  * @param parentId The parent Product Group ID of this Product Group
  * @param slideshowCollectionsTitle Slideshow Collections Title
  * @param slideshowCollectionsDescription Slideshow Collections Description
  * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  * @param trackingUrl Tracking template for proudct group promotions. 4000 limit
  * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references
  * @param catalogProductGroupName Catalogs product group name
  * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
  * @param collectionsHeroDestinationUrl Collections Hero Destination Url
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ProductGroupPromotionCreateRequestElement(
  id: Option[String],
  adGroupId: Option[String],
  bidInMicroCurrency: Option[Int],
  included: Option[Boolean],
  definition: Option[String],
  relativeDefinition: Option[String],
  parentId: Option[String],
  slideshowCollectionsTitle: Option[String],
  slideshowCollectionsDescription: Option[String],
  isMdl: Option[Boolean],
  status: Option[EntityStatus],
  trackingUrl: Option[String],
  catalogProductGroupId: Option[String],
  catalogProductGroupName: Option[String],
  collectionsHeroPinId: Option[String],
  collectionsHeroDestinationUrl: Option[String],
  gridClickType: Option[GridClickType],
  creativeType: Option[CreativeType]
  additionalProperties: 
)

object ProductGroupPromotionCreateRequestElement {
  implicit lazy val productGroupPromotionCreateRequestElementJsonFormat: Format[ProductGroupPromotionCreateRequestElement] = {
    val realJsonFormat = Json.format[ProductGroupPromotionCreateRequestElement]
    val declaredPropNames = Set("id", "adGroupId", "bidInMicroCurrency", "included", "definition", "relativeDefinition", "parentId", "slideshowCollectionsTitle", "slideshowCollectionsDescription", "isMdl", "status", "trackingUrl", "catalogProductGroupId", "catalogProductGroupName", "collectionsHeroPinId", "collectionsHeroDestinationUrl", "gridClickType", "creativeType")
    
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
      Writes { productGroupPromotionCreateRequestElement =>
        val jsObj = realJsonFormat.writes(productGroupPromotionCreateRequestElement)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

