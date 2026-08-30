package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsAttributes.
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
  * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): 'visible', 'hidden'.
  * @param aiDisclosures AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL.
  * @param imageLink The creative assets image.
  * @param videoLink The creative assets video.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsAttributes(
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
  visibility: Option[String],
  aiDisclosures: Option[List[CatalogsAiContentDisclosure]],
  imageLink: Option[String],
  videoLink: Option[String]
  additionalProperties: 
)

object CatalogsCreativeAssetsAttributes {
  implicit lazy val catalogsCreativeAssetsAttributesJsonFormat: Format[CatalogsCreativeAssetsAttributes] = {
    val realJsonFormat = Json.format[CatalogsCreativeAssetsAttributes]
    val declaredPropNames = Set("androidDeepLink", "customLabel0", "customLabel1", "customLabel2", "customLabel3", "customLabel4", "description", "googleProductCategory", "iosDeepLink", "link", "title", "visibility", "aiDisclosures", "imageLink", "videoLink")
    
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
      Writes { catalogsCreativeAssetsAttributes =>
        val jsObj = realJsonFormat.writes(catalogsCreativeAssetsAttributes)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

