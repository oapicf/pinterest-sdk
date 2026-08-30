package org.openapitools.server.model


/**
 * Request model for creating an AppsFlyer audience
 *
 * @param containerId The ID of the audience container for example: ''null''
 * @param name The name of the audience for example: ''null''
 * @param platform The platform of the audience for example: ''null''
*/
final case class AppsflyerAudience (
  containerId: String,
  name: String,
  platform: AppsflyerPlatform
)

