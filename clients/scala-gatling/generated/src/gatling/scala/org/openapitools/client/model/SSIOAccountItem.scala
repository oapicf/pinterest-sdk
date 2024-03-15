
package org.openapitools.client.model


case class SSIOAccountItem (
    /* Salesforce id for billto_info */
    _id: Option[String],
    /* Salesforce id for IO Terms and Conditions */
    _ioTermsId: Option[String],
    /* Salesforce text for IO Terms and Conditions */
    _ioTerms: Option[String],
    /* Salesforce id for US Terms and Conditions */
    _usTermsId: Option[String],
    /* Salesforce text for US Terms and Conditions */
    _usTerms: Option[String],
    /* Salesforce id for Rest of the World Terms and Conditions */
    _rowTermsId: Option[String],
    /* Salesforce text for Rest of the World Terms and Conditions */
    _rowTerms: Option[String],
    /* Insertion Order Type - Pinterest Paper or Agency Paper */
    _ioType: Option[String],
    /* Address information that is associated with this account. */
    _addresses: Option[List[SSIOAccountAddress]]
)
object SSIOAccountItem {
    def toStringBody(var_id: Object, var_ioTermsId: Object, var_ioTerms: Object, var_usTermsId: Object, var_usTerms: Object, var_rowTermsId: Object, var_rowTerms: Object, var_ioType: Object, var_addresses: Object) =
        s"""
        | {
        | "id":$var_id,"ioTermsId":$var_ioTermsId,"ioTerms":$var_ioTerms,"usTermsId":$var_usTermsId,"usTerms":$var_usTerms,"rowTermsId":$var_rowTermsId,"rowTerms":$var_rowTerms,"ioType":$var_ioType,"addresses":$var_addresses
        | }
        """.stripMargin
}
