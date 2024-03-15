package org.openapitools.server.model


/**
 * @param display Address display for example: ''475 Brannan Street, San Francisco, CA 94103''
 * @param purpose Purpose for which the address is used, usually Billing or Businness for example: ''Billing''
 * @param addressId Salesforce id for address for example: ''a1C1N000004MUrLUAW''
 * @param orderLegalEntity Legal entity for this insertion order for example: ''PIN US OU''
*/
final case class SSIOAccountAddress (
  display: Option[String] = None,
  purpose: Option[String] = None,
  addressId: Option[String] = None,
  orderLegalEntity: Option[String] = None
)

