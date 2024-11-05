package model

import play.api.libs.json._

/**
  * Request object for creating a feed.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsVerticalFeedsCreateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: String,
  format: CatalogsFormat,
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  credentials: Option[CatalogsFeedCredentials],
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  catalogType: CatalogsType,
  defaultCountry: Country,
  defaultAvailability: Option[ProductAvailabilityType],
  status: Option[CatalogsStatus],
  catalogId: Option[String]
  additionalProperties: 
)

object CatalogsVerticalFeedsCreateRequest {
  implicit lazy val catalogsVerticalFeedsCreateRequestJsonFormat: Format[CatalogsVerticalFeedsCreateRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalFeedsCreateRequest]
    val declaredPropNames = Set("defaultCurrency", "name", "format", "defaultLocale", "credentials", "location", "preferredProcessingSchedule", "catalogType", "defaultCountry", "defaultAvailability", "status", "catalogId")
    
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
      Writes { catalogsVerticalFeedsCreateRequest =>
        val jsObj = realJsonFormat.writes(catalogsVerticalFeedsCreateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

