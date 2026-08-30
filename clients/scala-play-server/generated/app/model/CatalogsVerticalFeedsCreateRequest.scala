package model

import play.api.libs.json._

/**
  * Request object for creating a feed.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsVerticalFeedsCreateRequest(
  catalogId: Option[String],
  catalogType: CatalogsVerticalFeedsCreateRequest.CatalogType.Value,
  credentials: Option[CatalogsFeedCredentials],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
  additionalProperties: 
)

object CatalogsVerticalFeedsCreateRequest {
  implicit lazy val catalogsVerticalFeedsCreateRequestJsonFormat: Format[CatalogsVerticalFeedsCreateRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalFeedsCreateRequest]
    val declaredPropNames = Set("catalogId", "catalogType", "credentials", "defaultAvailability", "defaultCountry", "defaultCurrency", "defaultLocale", "format", "location", "name", "preferredProcessingSchedule", "status")
    
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

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

