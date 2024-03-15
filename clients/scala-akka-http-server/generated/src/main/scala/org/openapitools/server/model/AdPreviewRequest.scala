package org.openapitools.server.model


/**
 * @param imageUrl Image URL. for example: ''https://somewebsite.com/someimage.jpg''
 * @param title Title displayed below ad. for example: ''My Preview Image''
 * @param pinId Pin ID. for example: ''7389479023''
*/
final case class AdPreviewRequest (
  imageUrl: String,
  title: String,
  pinId: String
)

