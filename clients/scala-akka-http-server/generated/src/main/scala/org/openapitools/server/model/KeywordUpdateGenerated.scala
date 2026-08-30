package org.openapitools.server.model


/**
 * = KeywordUpdateGenerated =
 *
 * @param archived Is keyword archived? for example: ''null''
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''null''
 * @param id Keyword ID. for example: ''null''
*/
final case class KeywordUpdateGenerated (
  archived: Option[Boolean] = None,
  bid: Option[Int] = None,
  id: String
)

