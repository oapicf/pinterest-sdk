package org.openapitools.server.model


/**
 * = KeywordUpdate =
 *
 * @param id Keyword ID. for example: ''2886364308355''
 * @param archived Is keyword archived? for example: ''false''
 * @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''200000''
*/
final case class KeywordUpdate (
  id: String,
  archived: Option[Boolean] = None,
  bid: Option[Int] = None
)

