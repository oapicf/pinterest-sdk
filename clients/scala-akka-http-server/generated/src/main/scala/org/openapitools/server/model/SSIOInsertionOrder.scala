package org.openapitools.server.model


/**
 * An SSIO insertion order.
 *
 * @param pinOrderId Salesforce order id for example: ''9991h00000046NyCAI''
*/
final case class SSIOInsertionOrder (
  pinOrderId: Option[String] = None
)

