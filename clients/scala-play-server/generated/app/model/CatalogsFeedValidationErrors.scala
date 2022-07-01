package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedValidationErrors.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CatalogsFeedValidationErrors(
  fetchError: Option[Int],
  fetchInactiveFeedError: Option[Int],
  encodingError: Option[Int],
  delimiterError: Option[Int],
  requiredColumnsMissing: Option[Int],
  imageLinkInvalid: Option[Int],
  itemidMissing: Option[Int],
  titleMissing: Option[Int],
  descriptionMissing: Option[Int],
  productCategoryInvalid: Option[Int],
  productLinkMissing: Option[Int],
  imageLinkMissing: Option[Int],
  availabilityInvalid: Option[Int],
  productPriceInvalid: Option[Int],
  linkFormatInvalid: Option[Int],
  parseLineError: Option[Int],
  adwordsFormatInvalid: Option[Int],
  productCategoryMissing: Option[Int],
  internalServiceError: Option[Int],
  noVerifiedDomain: Option[Int],
  adultInvalid: Option[Int],
  invalidDomain: Option[Int],
  feedLengthTooLong: Option[Int],
  linkLengthTooLong: Option[Int],
  malformedXml: Option[Int],
  redirectInvalid: Option[Int],
  priceMissing: Option[Int],
  feedTooSmall: Option[Int],
  conditionInvalid: Option[Int],
  shopifyNoProducts: Option[Int],
  maxItemsPerItemGroupExceeded: Option[Int],
  itemMainImageDownloadFailure: Option[Int],
  pinjoinContentUnsafe: Option[Int],
  blocklistedImageSignature: Option[Int]
  additionalProperties: 
)

object CatalogsFeedValidationErrors {
  implicit lazy val catalogsFeedValidationErrorsJsonFormat: Format[CatalogsFeedValidationErrors] = {
    val realJsonFormat = Json.format[CatalogsFeedValidationErrors]
    val declaredPropNames = Set("fetchError", "fetchInactiveFeedError", "encodingError", "delimiterError", "requiredColumnsMissing", "imageLinkInvalid", "itemidMissing", "titleMissing", "descriptionMissing", "productCategoryInvalid", "productLinkMissing", "imageLinkMissing", "availabilityInvalid", "productPriceInvalid", "linkFormatInvalid", "parseLineError", "adwordsFormatInvalid", "productCategoryMissing", "internalServiceError", "noVerifiedDomain", "adultInvalid", "invalidDomain", "feedLengthTooLong", "linkLengthTooLong", "malformedXml", "redirectInvalid", "priceMissing", "feedTooSmall", "conditionInvalid", "shopifyNoProducts", "maxItemsPerItemGroupExceeded", "itemMainImageDownloadFailure", "pinjoinContentUnsafe", "blocklistedImageSignature")
    
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
      Writes { catalogsFeedValidationErrors =>
        val jsObj = realJsonFormat.writes(catalogsFeedValidationErrors)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

