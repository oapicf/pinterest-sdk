package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsUpdatableCreativeAssetsAttributes.
  * @param title The name of the creative assets.
  * @param description Brief description of the creative assets.
  * @param link Link to the creative assets page.
  * @param iosDeepLink IOS deep link to the creative assets page.
  * @param androidDeepLink Link to the creative assets page.
  * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  * @param customLabel0 Custom grouping of creative assets.
  * @param customLabel1 Custom grouping of creative assets.
  * @param customLabel2 Custom grouping of creative assets.
  * @param customLabel3 Custom grouping of creative assets.
  * @param customLabel4 Custom grouping of creative assets.
  * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsUpdatableCreativeAssetsAttributes(
  title: Option[String],
  description: Option[String],
  link: Option[String],
  iosDeepLink: Option[String],
  androidDeepLink: Option[String],
  googleProductCategory: Option[String],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  visibility: Option[String]
)

object CatalogsUpdatableCreativeAssetsAttributes {
  implicit lazy val catalogsUpdatableCreativeAssetsAttributesJsonFormat: Format[CatalogsUpdatableCreativeAssetsAttributes] = Json.format[CatalogsUpdatableCreativeAssetsAttributes]
}

