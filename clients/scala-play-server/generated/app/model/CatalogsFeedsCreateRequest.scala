package model

import play.api.libs.json._

/**
  * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
  * @param name A human-friendly name associated to a given feed.
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CatalogsFeedsCreateRequest(
  defaultCountry: Option[Country],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCurrency: Option[NullableCurrency],
  name: String,
  format: CatalogsFormat,
  defaultLocale: Option[String],
  credentials: Option[CatalogsFeedCredentials],
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule]
  additionalProperties: 
)

object CatalogsFeedsCreateRequest {
  implicit lazy val catalogsFeedsCreateRequestJsonFormat: Format[CatalogsFeedsCreateRequest] = {
    val realJsonFormat = Json.format[CatalogsFeedsCreateRequest]
    val declaredPropNames = Set("defaultCountry", "defaultAvailability", "defaultCurrency", "name", "format", "defaultLocale", "credentials", "location", "preferredProcessingSchedule")
    
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
      Writes { catalogsFeedsCreateRequest =>
        val jsObj = realJsonFormat.writes(catalogsFeedsCreateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

