package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class IntegrationsGetList200Response (
  items: Seq[IntegrationRecord],
  bookmark: Option[String] = None
)

