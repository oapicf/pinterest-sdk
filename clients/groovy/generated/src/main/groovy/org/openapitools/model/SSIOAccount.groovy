package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;

@Canonical
class SSIOAccount {
    /* An array of Salesforce account information that includes address, io terms, etc. */
    List<SSIOAccountItem> billtoInfos = new ArrayList<>()
    /* Advertiser eligible to update order lines */
    Boolean canEdit
    
    String currency
    /* Advertiser eligible to create order lines */
    Boolean eligible
    /* Error indicator from Salesforce which could be \"No Error\" */
    String error
    
    List<SSIOAccountPMPName> pmpNames = new ArrayList<>()
}
