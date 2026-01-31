package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelAttributes.
  * @param basePrice Base price of the hotel room per night followed by the ISO currency code
  * @param brand The brand to which this hotel belongs to.
  * @param category The type of property. The category can be any type of internal description desired.
  * @param customLabel0 Custom grouping of hotels
  * @param customLabel1 Custom grouping of hotels
  * @param customLabel2 Custom grouping of hotels
  * @param customLabel3 Custom grouping of hotels
  * @param customLabel4 Custom grouping of hotels
  * @param description Brief description of the hotel.
  * @param latitude Latitude of the hotel.
  * @param link Link to the product page
  * @param longitude Longitude of the hotel.
  * @param name The hotel's name.
  * @param neighborhood A list of neighborhoods where the hotel is located
  * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  * @param additionalImageLink <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelAttributes(
  address: Option[CatalogsHotelAddress],
  basePrice: Option[String],
  brand: Option[String],
  category: Option[String],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  description: Option[String],
  guestRatings: Option[CatalogsHotelGuestRatings],
  latitude: Option[BigDecimal],
  link: Option[String],
  longitude: Option[BigDecimal],
  name: Option[String],
  neighborhood: Option[List[String]],
  salePrice: Option[String],
  additionalImageLink: Option[List[String]],
  mainImage: Option[CatalogsHotelAttributesAllOfMainImage]
  additionalProperties: 
)

object CatalogsHotelAttributes {
  implicit lazy val catalogsHotelAttributesJsonFormat: Format[CatalogsHotelAttributes] = {
    val realJsonFormat = Json.format[CatalogsHotelAttributes]
    val declaredPropNames = Set("address", "basePrice", "brand", "category", "customLabel0", "customLabel1", "customLabel2", "customLabel3", "customLabel4", "description", "guestRatings", "latitude", "link", "longitude", "name", "neighborhood", "salePrice", "additionalImageLink", "mainImage")
    
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
      Writes { catalogsHotelAttributes =>
        val jsObj = realJsonFormat.writes(catalogsHotelAttributes)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

