package org.openapitools.server.model


/**
 * @param creationTime Salesforce insertion order creation time for example: ''2017-06-21T23:11:11.000Z''
 * @param pinOrderId Salesforce order id for example: ''0Q01N0000015hekSAB''
 * @param status Salesforce insertion order status for example: ''Approved''
*/
final case class SSIOInsertionOrderStatusResponse (
  creationTime: Option[String] = None,
  pinOrderId: Option[String] = None,
  status: Option[String] = None
)

