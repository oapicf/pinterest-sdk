package org.openapitools.server.model


/**
 * @param archived  for example: ''false''
 * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''null''
 * @param id Keyword ID . for example: ''383791336903426391''
*/
final case class KeywordUpdateItem (
  archived: Option[Boolean] = None,
  bid: Option[Int] = None,
  id: String
)

