package org.openapitools.server.model


/**
 * = AdPreviewCreateFromImage =
 *
 * @param imageUrl Image URL. for example: ''https://somewebsite.com/someimage.jpg''
 * @param title Title displayed below ad. for example: ''My Preview Image''
*/
final case class AdPreviewCreateFromImage (
  imageUrl: String,
  title: String
)

