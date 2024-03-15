
package org.openapitools.client.model


case class SSIOAccountAddress (
    /* Address display */
    _display: Option[String],
    /* Purpose for which the address is used, usually Billing or Businness */
    _purpose: Option[String],
    /* Salesforce id for address */
    _addressId: Option[String],
    /* Legal entity for this insertion order */
    _orderLegalEntity: Option[String]
)
object SSIOAccountAddress {
    def toStringBody(var_display: Object, var_purpose: Object, var_addressId: Object, var_orderLegalEntity: Object) =
        s"""
        | {
        | "display":$var_display,"purpose":$var_purpose,"addressId":$var_addressId,"orderLegalEntity":$var_orderLegalEntity
        | }
        """.stripMargin
}
