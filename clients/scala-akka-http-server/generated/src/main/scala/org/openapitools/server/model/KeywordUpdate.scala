package org.openapitools.server.model


/**
 * = KeywordUpdate =
 *
 * @param id Keyword ID. for example: ''2886364308355''
 * @param archived Is keyword archived? for example: ''false''
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''null''
*/
final case class KeywordUpdate (
  id: String,
  archived: Option[Boolean] = None,
  bid: Option[Int] = None
)

