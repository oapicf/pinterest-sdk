package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.SSIOAccountAddress;

@Canonical
class SSIOAccountItem {
    /* Salesforce id for billto_info */
    String id
    /* Salesforce id for IO Terms and Conditions */
    String ioTermsId
    /* Salesforce text for IO Terms and Conditions */
    String ioTerms
    /* Salesforce id for US Terms and Conditions */
    String usTermsId
    /* Salesforce text for US Terms and Conditions */
    String usTerms
    /* Salesforce id for Rest of the World Terms and Conditions */
    String rowTermsId
    /* Salesforce text for Rest of the World Terms and Conditions */
    String rowTerms
    /* Insertion Order Type - Pinterest Paper or Agency Paper */
    String ioType
    /* Address information that is associated with this account. */
    List<SSIOAccountAddress> addresses = new ArrayList<>()
}
