package org.openapitools.server.model


/**
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 *
 * @param subscriptionId Subscription ID. for example: ''8078432025948590686''
*/
final case class LeadFormTest (
  subscriptionId: Option[String] = None
)

