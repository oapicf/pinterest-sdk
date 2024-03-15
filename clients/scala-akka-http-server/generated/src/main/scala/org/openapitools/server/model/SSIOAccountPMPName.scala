package org.openapitools.server.model


/**
 * @param name Display name for example: ''Bidalgo''
 * @param id Salesforce id for PMP for example: ''0011N00001LW2aSQAT''
*/
final case class SSIOAccountPMPName (
  name: Option[String] = None,
  id: Option[String] = None
)

