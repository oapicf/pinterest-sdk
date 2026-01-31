
package org.openapitools.client.model


case class SSIOAccountResponse (
    /* An array of Salesforce account information that includes address, io terms, etc. */
    _billtoInfos: Option[List[SSIOAccountItem]],
    /* Advertiser eligible to update order lines */
    _canEdit: Option[Boolean],
    _currency: Option[String],
    /* Advertiser eligible to create order lines */
    _eligible: Option[Boolean],
    /* Error indicator from Salesforce which could be \"No Error\" */
    _error: Option[String],
    _pmpNames: Option[List[SSIOAccountPMPName]]
)
object SSIOAccountResponse {
    def toStringBody(var_billtoInfos: Object, var_canEdit: Object, var_currency: Object, var_eligible: Object, var_error: Object, var_pmpNames: Object) =
        s"""
        | {
        | "billtoInfos":$var_billtoInfos,"canEdit":$var_canEdit,"currency":$var_currency,"eligible":$var_eligible,"error":$var_error,"pmpNames":$var_pmpNames
        | }
        """.stripMargin
}
