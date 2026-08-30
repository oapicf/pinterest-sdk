package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param answers Test lead answers. Should follow the creation order. for example: ''["John","Doe","abc@email.com","987654321"]''
*/
final case class LeadFormTestCreate (
  answers: Seq[String]
)

