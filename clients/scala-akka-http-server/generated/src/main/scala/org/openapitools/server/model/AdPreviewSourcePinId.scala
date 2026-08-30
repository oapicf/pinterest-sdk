package org.openapitools.server.model


/**
 * = AdPreviewCreateFromPin =
 *
 * Ad preview source from an existing Pin.
 *
 * @param creativeType Creative type of the ad preview. for example: ''MAX_WIDTH_VIDEO_COLLECTION''
 * @param pinId Pin ID. for example: ''7389479023''
*/
final case class AdPreviewSourcePinId (
  creativeType: Option[AdPinPreviewCreativeType] = None,
  pinId: String
)

