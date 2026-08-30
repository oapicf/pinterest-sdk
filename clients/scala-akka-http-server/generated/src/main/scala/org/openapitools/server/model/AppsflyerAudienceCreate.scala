package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param name The name of the audience for example: ''null''
 * @param platform The platform of the audience for example: ''null''
*/
final case class AppsflyerAudienceCreate (
  name: String,
  platform: AppsflyerPlatform
)

