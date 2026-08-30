package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsRetailReportAllItemsFilter {
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    String catalogId
    /* Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. */
    String productGroupId

    enum ReportTypeEnum {
    
        ALL_ITEMS("ALL_ITEMS")
    
        private final String value
    
        ReportTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    ReportTypeEnum reportType
}
