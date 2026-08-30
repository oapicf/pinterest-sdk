package org.openapitools.server.model


/**
 * Pinterest marketing partner name.
 *
 * @param id Salesforce id for PMP for example: ''0011N00001LW2aSQAT''
 * @param name Display name for example: ''Bidalgo''
*/
final case class SSIOAccountPMPName (
  id: Option[String] = None,
  name: Option[String] = None
)

