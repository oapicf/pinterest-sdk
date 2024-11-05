package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;

@Canonical
class SSIOAccountResponse {
    /* Advertiser eligible to create order lines */
    Boolean eligible
    /* Advertiser eligible to update order lines */
    Boolean canEdit
    /* An array of Salesforce account information that includes address, io terms, etc. */
    List<SSIOAccountItem> billtoInfos = new ArrayList<>()
    
    String currency
    
    List<SSIOAccountPMPName> pmpNames = new ArrayList<>()
    /* Error indicator from Salesforce which could be \"No Error\" */
    String error
}
