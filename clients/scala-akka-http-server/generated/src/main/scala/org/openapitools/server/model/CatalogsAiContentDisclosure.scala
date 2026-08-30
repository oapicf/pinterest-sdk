package org.openapitools.server.model


/**
 * AI content disclosure for a single asset of a catalog item.
 *
 * @param disclosure Disclosure labels that apply to this asset. for example: ''["ai_modified"]''
 * @param url URL of the asset. Must match one of image_link, additional_image_link, or video_link. for example: ''https://scene.example.com/image/image_v2.jpg''
*/
final case class CatalogsAiContentDisclosure (
  disclosure: Seq[CatalogsAiContentDisclosureLabel],
  url: String
)

