
package org.openapitools.client.model


case class SSIOAccountResponse (
    /* Advertiser eligible to create order lines */
    _eligible: Option[Boolean],
    /* Advertiser eligible to update order lines */
    _canEdit: Option[Boolean],
    /* An array of Salesforce account information that includes address, io terms, etc. */
    _billtoInfos: Option[List[SSIOAccountItem]],
    _currency: Option[String],
    _pmpNames: Option[List[SSIOAccountPMPName]],
    /* Error indicator from Salesforce which could be \"No Error\" */
    _error: Option[String]
)
object SSIOAccountResponse {
    def toStringBody(var_eligible: Object, var_canEdit: Object, var_billtoInfos: Object, var_currency: Object, var_pmpNames: Object, var_error: Object) =
        s"""
        | {
        | "eligible":$var_eligible,"canEdit":$var_canEdit,"billtoInfos":$var_billtoInfos,"currency":$var_currency,"pmpNames":$var_pmpNames,"error":$var_error
        | }
        """.stripMargin
}
