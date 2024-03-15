package org.openapitools.server.model


/**
 * = LeadFormTestRequest =
 *
 * Request to create test data for lead data test API.
 *
 * @param answers Test lead answers. Should follow the creation order. for example: ''["John","Doe","abc@email.com","987654321"]''
*/
final case class LeadFormTestRequest (
  answers: Seq[String]
)

