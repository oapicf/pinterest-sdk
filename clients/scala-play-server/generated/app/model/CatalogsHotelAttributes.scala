package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelAttributes.
  * @param name The hotel's name.
  * @param link Link to the product page
  * @param description Brief description of the hotel.
  * @param brand The brand to which this hotel belongs to.
  * @param latitude Latitude of the hotel.
  * @param longitude Longitude of the hotel.
  * @param neighborhood A list of neighborhoods where the hotel is located
  * @param customLabel0 Custom grouping of hotels
  * @param customLabel1 Custom grouping of hotels
  * @param customLabel2 Custom grouping of hotels
  * @param customLabel3 Custom grouping of hotels
  * @param customLabel4 Custom grouping of hotels
  * @param category The type of property. The category can be any type of internal description desired.
  * @param basePrice Base price of the hotel room per night followed by the ISO currency code
  * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  * @param additionalImageLink <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelAttributes(
  name: Option[String],
  link: Option[String],
  description: Option[String],
  brand: Option[String],
  latitude: Option[BigDecimal],
  longitude: Option[BigDecimal],
  neighborhood: Option[List[String]],
  address: Option[CatalogsHotelAddress],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  category: Option[String],
  basePrice: Option[String],
  salePrice: Option[String],
  guestRatings: Option[CatalogsHotelGuestRatings],
  mainImage: Option[CatalogsHotelAttributesAllOfMainImage],
  additionalImageLink: Option[List[String]]
  additionalProperties: 
)

object CatalogsHotelAttributes {
  implicit lazy val catalogsHotelAttributesJsonFormat: Format[CatalogsHotelAttributes] = {
    val realJsonFormat = Json.format[CatalogsHotelAttributes]
    val declaredPropNames = Set("name", "link", "description", "brand", "latitude", "longitude", "neighborhood", "address", "customLabel0", "customLabel1", "customLabel2", "customLabel3", "customLabel4", "category", "basePrice", "salePrice", "guestRatings", "mainImage", "additionalImageLink")
    
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

