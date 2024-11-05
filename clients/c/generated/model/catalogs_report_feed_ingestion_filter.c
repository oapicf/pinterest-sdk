#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_report_feed_ingestion_filter.h"


char* catalogs_report_feed_ingestion_filter_report_type_ToString(pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e report_type) {
    char* report_typeArray[] =  { "NULL", "FEED_INGESTION_ISSUES" };
    return report_typeArray[report_type];
}

pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e catalogs_report_feed_ingestion_filter_report_type_FromString(char* report_type){
    int stringToReturn = 0;
    char *report_typeArray[] =  { "NULL", "FEED_INGESTION_ISSUES" };
    size_t sizeofArray = sizeof(report_typeArray) / sizeof(report_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_type, report_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter_create(
    pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e report_type,
    char *feed_id,
    char *processing_result_id
    ) {
    catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter_local_var = malloc(sizeof(catalogs_report_feed_ingestion_filter_t));
    if (!catalogs_report_feed_ingestion_filter_local_var) {
        return NULL;
    }
    catalogs_report_feed_ingestion_filter_local_var->report_type = report_type;
    catalogs_report_feed_ingestion_filter_local_var->feed_id = feed_id;
    catalogs_report_feed_ingestion_filter_local_var->processing_result_id = processing_result_id;

    return catalogs_report_feed_ingestion_filter_local_var;
}


void catalogs_report_feed_ingestion_filter_free(catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter) {
    if(NULL == catalogs_report_feed_ingestion_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_report_feed_ingestion_filter->feed_id) {
        free(catalogs_report_feed_ingestion_filter->feed_id);
        catalogs_report_feed_ingestion_filter->feed_id = NULL;
    }
    if (catalogs_report_feed_ingestion_filter->processing_result_id) {
        free(catalogs_report_feed_ingestion_filter->processing_result_id);
        catalogs_report_feed_ingestion_filter->processing_result_id = NULL;
    }
    free(catalogs_report_feed_ingestion_filter);
}

cJSON *catalogs_report_feed_ingestion_filter_convertToJSON(catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_report_feed_ingestion_filter->report_type
    if (pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_NULL == catalogs_report_feed_ingestion_filter->report_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "report_type", report_typecatalogs_report_feed_ingestion_filter_ToString(catalogs_report_feed_ingestion_filter->report_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_report_feed_ingestion_filter->feed_id
    if (!catalogs_report_feed_ingestion_filter->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_report_feed_ingestion_filter->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_report_feed_ingestion_filter->processing_result_id
    if(catalogs_report_feed_ingestion_filter->processing_result_id) {
    if(cJSON_AddStringToObject(item, "processing_result_id", catalogs_report_feed_ingestion_filter->processing_result_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter_parseFromJSON(cJSON *catalogs_report_feed_ingestion_filterJSON){

    catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter_local_var = NULL;

    // catalogs_report_feed_ingestion_filter->report_type
    cJSON *report_type = cJSON_GetObjectItemCaseSensitive(catalogs_report_feed_ingestion_filterJSON, "report_type");
    if (!report_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e report_typeVariable;
    
    if(!cJSON_IsString(report_type))
    {
    goto end; //Enum
    }
    report_typeVariable = catalogs_report_feed_ingestion_filter_report_type_FromString(report_type->valuestring);

    // catalogs_report_feed_ingestion_filter->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_report_feed_ingestion_filterJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // catalogs_report_feed_ingestion_filter->processing_result_id
    cJSON *processing_result_id = cJSON_GetObjectItemCaseSensitive(catalogs_report_feed_ingestion_filterJSON, "processing_result_id");
    if (processing_result_id) { 
    if(!cJSON_IsString(processing_result_id) && !cJSON_IsNull(processing_result_id))
    {
    goto end; //String
    }
    }


    catalogs_report_feed_ingestion_filter_local_var = catalogs_report_feed_ingestion_filter_create (
        report_typeVariable,
        strdup(feed_id->valuestring),
        processing_result_id && !cJSON_IsNull(processing_result_id) ? strdup(processing_result_id->valuestring) : NULL
        );

    return catalogs_report_feed_ingestion_filter_local_var;
end:
    return NULL;

}
