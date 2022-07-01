package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedValidationWarnings.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CatalogsFeedValidationWarnings(
  titleLengthTooLong: Option[Int],
  descriptionLengthTooLong: Option[Int],
  genderInvalid: Option[Int],
  ageGroupInvalid: Option[Int],
  sizeTypeInvalid: Option[Int],
  linkFormatWarning: Option[Int],
  duplicateProducts: Option[Int],
  duplicateLinks: Option[Int],
  salesPriceInvalid: Option[Int],
  productCategoryDepthWarning: Option[Int],
  adwordsSameAsLink: Option[Int],
  duplicateHeaders: Option[Int],
  fetchSameSignature: Option[Int],
  adwordsFormatWarning: Option[Int],
  additionalImageLinkWarning: Option[Int],
  imageLinkWarning: Option[Int],
  shippingInvalid: Option[Int],
  taxInvalid: Option[Int],
  shippingWeightInvalid: Option[Int],
  expirationDateInvalid: Option[Int],
  availabilityDateInvalid: Option[Int],
  saleDateInvalid: Option[Int],
  weightUnitInvalid: Option[Int],
  isBundleInvalid: Option[Int],
  updatedTimeInvalid: Option[Int],
  customLabelLengthTooLong: Option[Int],
  productTypeLengthTooLong: Option[Int],
  tooManyAdditionalImageLinks: Option[Int],
  multipackInvalid: Option[Int],
  indexedProductCountLargeDelta: Option[Int],
  itemAdditionalImageDownloadFailure: Option[Int],
  optionalProductCategoryMissing: Option[Int],
  optionalProductCategoryInvalid: Option[Int],
  optionalConditionMissing: Option[Int],
  optionalConditionInvalid: Option[Int],
  iosDeepLinkInvalid: Option[Int],
  androidDeepLinkInvalid: Option[Int],
  availabilityNormalized: Option[Int],
  conditionNormalized: Option[Int],
  genderNormalized: Option[Int],
  sizeTypeNormalized: Option[Int],
  ageGroupNormalized: Option[Int],
  utmSourceAutoCorrected: Option[Int],
  countryDoesNotMapToCurrency: Option[Int],
  minAdPriceInvalid: Option[Int]
  additionalProperties: 
)

object CatalogsFeedValidationWarnings {
  implicit lazy val catalogsFeedValidationWarningsJsonFormat: Format[CatalogsFeedValidationWarnings] = {
    val realJsonFormat = Json.format[CatalogsFeedValidationWarnings]
    val declaredPropNames = Set("titleLengthTooLong", "descriptionLengthTooLong", "genderInvalid", "ageGroupInvalid", "sizeTypeInvalid", "linkFormatWarning", "duplicateProducts", "duplicateLinks", "salesPriceInvalid", "productCategoryDepthWarning", "adwordsSameAsLink", "duplicateHeaders", "fetchSameSignature", "adwordsFormatWarning", "additionalImageLinkWarning", "imageLinkWarning", "shippingInvalid", "taxInvalid", "shippingWeightInvalid", "expirationDateInvalid", "availabilityDateInvalid", "saleDateInvalid", "weightUnitInvalid", "isBundleInvalid", "updatedTimeInvalid", "customLabelLengthTooLong", "productTypeLengthTooLong", "tooManyAdditionalImageLinks", "multipackInvalid", "indexedProductCountLargeDelta", "itemAdditionalImageDownloadFailure", "optionalProductCategoryMissing", "optionalProductCategoryInvalid", "optionalConditionMissing", "optionalConditionInvalid", "iosDeepLinkInvalid", "androidDeepLinkInvalid", "availabilityNormalized", "conditionNormalized", "genderNormalized", "sizeTypeNormalized", "ageGroupNormalized", "utmSourceAutoCorrected", "countryDoesNotMapToCurrency", "minAdPriceInvalid")
    
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
      Writes { catalogsFeedValidationWarnings =>
        val jsObj = realJsonFormat.writes(catalogsFeedValidationWarnings)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

