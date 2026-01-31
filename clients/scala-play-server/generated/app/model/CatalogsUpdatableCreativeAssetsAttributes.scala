package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsUpdatableCreativeAssetsAttributes.
  * @param androidDeepLink Link to the creative assets page.
  * @param customLabel0 Custom grouping of creative assets.
  * @param customLabel1 Custom grouping of creative assets.
  * @param customLabel2 Custom grouping of creative assets.
  * @param customLabel3 Custom grouping of creative assets.
  * @param customLabel4 Custom grouping of creative assets.
  * @param description Brief description of the creative assets.
  * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  * @param iosDeepLink IOS deep link to the creative assets page.
  * @param link Link to the creative assets page.
  * @param title The name of the creative assets.
  * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsUpdatableCreativeAssetsAttributes(
  androidDeepLink: Option[String],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  description: Option[String],
  googleProductCategory: Option[String],
  iosDeepLink: Option[String],
  link: Option[String],
  title: Option[String],
  visibility: Option[String]
)

object CatalogsUpdatableCreativeAssetsAttributes {
  implicit lazy val catalogsUpdatableCreativeAssetsAttributesJsonFormat: Format[CatalogsUpdatableCreativeAssetsAttributes] = Json.format[CatalogsUpdatableCreativeAssetsAttributes]
}

