package org.openapitools.server.model


/**
 * @param title The name of the creative assets. for example: ''null''
 * @param description Brief description of the creative assets. for example: ''null''
 * @param link Link to the creative assets page. for example: ''null''
 * @param iosDeepLink IOS deep link to the creative assets page. for example: ''null''
 * @param androidDeepLink Link to the creative assets page. for example: ''null''
 * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. for example: ''null''
 * @param customLabel0 Custom grouping of creative assets. for example: ''null''
 * @param customLabel1 Custom grouping of creative assets. for example: ''null''
 * @param customLabel2 Custom grouping of creative assets. for example: ''null''
 * @param customLabel3 Custom grouping of creative assets. for example: ''null''
 * @param customLabel4 Custom grouping of creative assets. for example: ''null''
 * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. for example: ''null''
 * @param imageLink The creative assets image. for example: ''https://scene.example.com/image/image_v2.jpg''
 * @param videoLink The creative assets video. for example: ''https://scene.example.com/image/image_v2.mp4''
*/
final case class CatalogsCreativeAssetsAttributes (
  title: Option[String] = None,
  description: Option[String] = None,
  link: Option[String] = None,
  iosDeepLink: Option[String] = None,
  androidDeepLink: Option[String] = None,
  googleProductCategory: Option[String] = None,
  customLabel0: Option[String] = None,
  customLabel1: Option[String] = None,
  customLabel2: Option[String] = None,
  customLabel3: Option[String] = None,
  customLabel4: Option[String] = None,
  visibility: Option[String] = None,
  imageLink: Option[String] = None,
  videoLink: Option[String] = None
)

