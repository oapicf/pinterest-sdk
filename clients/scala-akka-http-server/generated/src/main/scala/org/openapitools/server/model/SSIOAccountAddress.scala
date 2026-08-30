package org.openapitools.server.model


/**
 * Salesforce address information.
 *
 * @param addressId Salesforce id for address for example: ''a1C1N000004MUrLUAW''
 * @param display Address display for example: ''475 Brannan Street, San Francisco, CA 94103''
 * @param orderLegalEntity Legal entity for this insertion order for example: ''PIN US OU''
 * @param purpose Purpose for which the address is used, usually Billing or Businness for example: ''Billing''
*/
final case class SSIOAccountAddress (
  addressId: Option[String] = None,
  display: Option[String] = None,
  orderLegalEntity: Option[String] = None,
  purpose: Option[String] = None
)

