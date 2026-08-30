package org.openapitools.server.model


/**
 * @param leadFormId Lead form ID. for example: ''null''
 * @param webhookUrl Standard HTTPS webhook URL. for example: ''null''
*/
final case class LeadSubscriptionCreate (
  leadFormId: Option[String] = None,
  webhookUrl: String
)

