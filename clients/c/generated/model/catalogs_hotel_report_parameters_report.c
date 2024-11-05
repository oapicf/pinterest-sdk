#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_report_parameters_report.h"


char* catalogs_hotel_report_parameters_report_report_type_ToString(pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e report_type) {
    char* report_typeArray[] =  { "NULL", "FEED_INGESTION_ISSUES", "DISTRIBUTION_ISSUES" };
    return report_typeArray[report_type];
}

pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e catalogs_hotel_report_parameters_report_report_type_FromString(char* report_type){
    int stringToReturn = 0;
    char *report_typeArray[] =  { "NULL", "FEED_INGESTION_ISSUES", "DISTRIBUTION_ISSUES" };
    size_t sizeofArray = sizeof(report_typeArray) / sizeof(report_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_type, report_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report_create(
    pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e report_type,
    char *feed_id,
    char *processing_result_id,
    char *catalog_id
    ) {
    catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report_local_var = malloc(sizeof(catalogs_hotel_report_parameters_report_t));
    if (!catalogs_hotel_report_parameters_report_local_var) {
        return NULL;
    }
    catalogs_hotel_report_parameters_report_local_var->report_type = report_type;
    catalogs_hotel_report_parameters_report_local_var->feed_id = feed_id;
    catalogs_hotel_report_parameters_report_local_var->processing_result_id = processing_result_id;
    catalogs_hotel_report_parameters_report_local_var->catalog_id = catalog_id;

    return catalogs_hotel_report_parameters_report_local_var;
}


void catalogs_hotel_report_parameters_report_free(catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report) {
    if(NULL == catalogs_hotel_report_parameters_report){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_report_parameters_report->feed_id) {
        free(catalogs_hotel_report_parameters_report->feed_id);
        catalogs_hotel_report_parameters_report->feed_id = NULL;
    }
    if (catalogs_hotel_report_parameters_report->processing_result_id) {
        free(catalogs_hotel_report_parameters_report->processing_result_id);
        catalogs_hotel_report_parameters_report->processing_result_id = NULL;
    }
    if (catalogs_hotel_report_parameters_report->catalog_id) {
        free(catalogs_hotel_report_parameters_report->catalog_id);
        catalogs_hotel_report_parameters_report->catalog_id = NULL;
    }
    free(catalogs_hotel_report_parameters_report);
}

cJSON *catalogs_hotel_report_parameters_report_convertToJSON(catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_report_parameters_report->report_type
    if(catalogs_hotel_report_parameters_report->report_type != pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "report_type", report_typecatalogs_hotel_report_parameters_report_ToString(catalogs_hotel_report_parameters_report->report_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_hotel_report_parameters_report->feed_id
    if (!catalogs_hotel_report_parameters_report->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_hotel_report_parameters_report->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_report_parameters_report->processing_result_id
    if(catalogs_hotel_report_parameters_report->processing_result_id) {
    if(cJSON_AddStringToObject(item, "processing_result_id", catalogs_hotel_report_parameters_report->processing_result_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_report_parameters_report->catalog_id
    if(catalogs_hotel_report_parameters_report->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_hotel_report_parameters_report->catalog_id) == NULL) {
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

catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report_parseFromJSON(cJSON *catalogs_hotel_report_parameters_reportJSON){

    catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report_local_var = NULL;

    // catalogs_hotel_report_parameters_report->report_type
    cJSON *report_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_report_parameters_reportJSON, "report_type");
    pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e report_typeVariable;
    if (report_type) { 
    if(!cJSON_IsString(report_type))
    {
    goto end; //Enum
    }
    report_typeVariable = catalogs_hotel_report_parameters_report_report_type_FromString(report_type->valuestring);
    }

    // catalogs_hotel_report_parameters_report->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_report_parameters_reportJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // catalogs_hotel_report_parameters_report->processing_result_id
    cJSON *processing_result_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_report_parameters_reportJSON, "processing_result_id");
    if (processing_result_id) { 
    if(!cJSON_IsString(processing_result_id) && !cJSON_IsNull(processing_result_id))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_report_parameters_report->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_report_parameters_reportJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }


    catalogs_hotel_report_parameters_report_local_var = catalogs_hotel_report_parameters_report_create (
        report_type ? report_typeVariable : pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_NULL,
        strdup(feed_id->valuestring),
        processing_result_id && !cJSON_IsNull(processing_result_id) ? strdup(processing_result_id->valuestring) : NULL,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL
        );

    return catalogs_hotel_report_parameters_report_local_var;
end:
    return NULL;

}
