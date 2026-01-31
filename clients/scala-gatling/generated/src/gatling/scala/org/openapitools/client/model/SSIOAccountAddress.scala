
package org.openapitools.client.model


case class SSIOAccountAddress (
    /* Salesforce id for address */
    _addressId: Option[String],
    /* Address display */
    _display: Option[String],
    /* Legal entity for this insertion order */
    _orderLegalEntity: Option[String],
    /* Purpose for which the address is used, usually Billing or Businness */
    _purpose: Option[String]
)
object SSIOAccountAddress {
    def toStringBody(var_addressId: Object, var_display: Object, var_orderLegalEntity: Object, var_purpose: Object) =
        s"""
        | {
        | "addressId":$var_addressId,"display":$var_display,"orderLegalEntity":$var_orderLegalEntity,"purpose":$var_purpose
        | }
        """.stripMargin
}
