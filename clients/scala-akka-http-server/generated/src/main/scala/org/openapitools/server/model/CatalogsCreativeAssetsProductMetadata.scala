package org.openapitools.server.model


/**
 * Creative assets product metadata entity
 *
 * @param creativeAssetsId The user-created unique ID that represents the creative assets item. for example: ''123abc''
 * @param visibility  for example: ''null''
*/
final case class CatalogsCreativeAssetsProductMetadata (
  creativeAssetsId: String,
  visibility: CreativeAssetsVisibilityType
)

