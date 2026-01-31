
package org.openapitools.client.model


case class SSIOAccountItem (
    /* Address information that is associated with this account. */
    _addresses: Option[List[SSIOAccountAddress]],
    /* Salesforce id for billto_info */
    _id: Option[String],
    /* Salesforce text for IO Terms and Conditions */
    _ioTerms: Option[String],
    /* Salesforce id for IO Terms and Conditions */
    _ioTermsId: Option[String],
    /* Insertion Order Type - Pinterest Paper or Agency Paper */
    _ioType: Option[String],
    /* Salesforce text for Rest of the World Terms and Conditions */
    _rowTerms: Option[String],
    /* Salesforce id for Rest of the World Terms and Conditions */
    _rowTermsId: Option[String],
    /* Salesforce text for US Terms and Conditions */
    _usTerms: Option[String],
    /* Salesforce id for US Terms and Conditions */
    _usTermsId: Option[String]
)
object SSIOAccountItem {
    def toStringBody(var_addresses: Object, var_id: Object, var_ioTerms: Object, var_ioTermsId: Object, var_ioType: Object, var_rowTerms: Object, var_rowTermsId: Object, var_usTerms: Object, var_usTermsId: Object) =
        s"""
        | {
        | "addresses":$var_addresses,"id":$var_id,"ioTerms":$var_ioTerms,"ioTermsId":$var_ioTermsId,"ioType":$var_ioType,"rowTerms":$var_rowTerms,"rowTermsId":$var_rowTermsId,"usTerms":$var_usTerms,"usTermsId":$var_usTermsId
        | }
        """.stripMargin
}
