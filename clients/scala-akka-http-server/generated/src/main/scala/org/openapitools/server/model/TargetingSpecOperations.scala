package org.openapitools.server.model


/**
 * @param field  for example: ''null''
 * @param operation  for example: ''null''
 * @param values  for example: ''null''
 * @param value  for example: ''null''
*/
final case class TargetingSpecOperations (
  field: String,
  operation: String,
  values: Seq[TargetingSpecShoppingRetargeting],
  value: String
)

