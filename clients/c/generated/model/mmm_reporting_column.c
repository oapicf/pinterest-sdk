#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mmm_reporting_column.h"


char* mmm_reporting_column_mmm_reporting_column_ToString(pinterest_rest_api_mmm_reporting_column__e mmm_reporting_column) {
    char *mmm_reporting_columnArray[] =  { "NULL", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "ECTR", "CAMPAIGN_NAME", "TOTAL_ENGAGEMENT", "EENGAGEMENT_RATE", "ECPM_IN_DOLLAR", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "AD_GROUP_NAME", "CLICKTHROUGH_1", "IMPRESSION_1", "CLICKTHROUGH_2", "IMPRESSION_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "ADVERTISER_NAME", "SPEND_ORDER_LINE_PAID_TYPE", "CAMPAIGN_OBJECTIVE_TYPE", "PINNER_LIST_NAME", "ADS_CREDIT_SPEND_IN_DOLLAR", "ADVERTISER_PAID_SPEND_IN_DOLLAR", "ADVERTISER_PAID_ECPC_IN_DOLLAR", "ADVERTISER_PAID_ECPM_IN_DOLLAR" };
    return mmm_reporting_columnArray[mmm_reporting_column];
}

pinterest_rest_api_mmm_reporting_column__e mmm_reporting_column_mmm_reporting_column_FromString(char* mmm_reporting_column) {
    int stringToReturn = 0;
    char *mmm_reporting_columnArray[] =  { "NULL", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "ECTR", "CAMPAIGN_NAME", "TOTAL_ENGAGEMENT", "EENGAGEMENT_RATE", "ECPM_IN_DOLLAR", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "AD_GROUP_NAME", "CLICKTHROUGH_1", "IMPRESSION_1", "CLICKTHROUGH_2", "IMPRESSION_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "ADVERTISER_NAME", "SPEND_ORDER_LINE_PAID_TYPE", "CAMPAIGN_OBJECTIVE_TYPE", "PINNER_LIST_NAME", "ADS_CREDIT_SPEND_IN_DOLLAR", "ADVERTISER_PAID_SPEND_IN_DOLLAR", "ADVERTISER_PAID_ECPC_IN_DOLLAR", "ADVERTISER_PAID_ECPM_IN_DOLLAR" };
    size_t sizeofArray = sizeof(mmm_reporting_columnArray) / sizeof(mmm_reporting_columnArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(mmm_reporting_column, mmm_reporting_columnArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *mmm_reporting_column_convertToJSON(pinterest_rest_api_mmm_reporting_column__e mmm_reporting_column) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "mmm_reporting_column", mmm_reporting_column_mmm_reporting_column_ToString(mmm_reporting_column)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_mmm_reporting_column__e mmm_reporting_column_parseFromJSON(cJSON *mmm_reporting_columnJSON) {
    if(!cJSON_IsString(mmm_reporting_columnJSON) || (mmm_reporting_columnJSON->valuestring == NULL)) {
        return 0;
    }
    return mmm_reporting_column_mmm_reporting_column_FromString(mmm_reporting_columnJSON->valuestring);
}
