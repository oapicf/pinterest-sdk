#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_report_stats_parameters.h"


char* catalogs_retail_report_stats_parameters_catalog_type_ToString(pinterest_rest_api_catalogs_retail_report_stats_parameters_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_report_stats_parameters_CATALOGTYPE_e catalogs_retail_report_stats_parameters_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_retail_report_stats_parameters_t *catalogs_retail_report_stats_parameters_create_internal(
    pinterest_rest_api_catalogs_retail_report_stats_parameters_CATALOGTYPE_e catalog_type,
    catalogs_retail_report_stats_parameters_report_t *report
    ) {
    catalogs_retail_report_stats_parameters_t *catalogs_retail_report_stats_parameters_local_var = malloc(sizeof(catalogs_retail_report_stats_parameters_t));
    if (!catalogs_retail_report_stats_parameters_local_var) {
        return NULL;
    }
    memset(catalogs_retail_report_stats_parameters_local_var, 0, sizeof(catalogs_retail_report_stats_parameters_t));
    catalogs_retail_report_stats_parameters_local_var->_library_owned = 1;
    catalogs_retail_report_stats_parameters_local_var->catalog_type = catalog_type;
    catalogs_retail_report_stats_parameters_local_var->report = report;
    return catalogs_retail_report_stats_parameters_local_var;
}

__attribute__((deprecated)) catalogs_retail_report_stats_parameters_t *catalogs_retail_report_stats_parameters_create(
    pinterest_rest_api_catalogs_retail_report_stats_parameters_CATALOGTYPE_e catalog_type,
    catalogs_retail_report_stats_parameters_report_t *report
    ) {
    catalogs_retail_report_stats_parameters_t *result = catalogs_retail_report_stats_parameters_create_internal (
        catalog_type,
        report
        );
    if (!result) {
    }
    return result;
}

void catalogs_retail_report_stats_parameters_free(catalogs_retail_report_stats_parameters_t *catalogs_retail_report_stats_parameters) {
    if(NULL == catalogs_retail_report_stats_parameters){
        return ;
    }
    if(catalogs_retail_report_stats_parameters->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_report_stats_parameters_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_report_stats_parameters->report) {
        catalogs_retail_report_stats_parameters_report_free(catalogs_retail_report_stats_parameters->report);
        catalogs_retail_report_stats_parameters->report = NULL;
    }
    free(catalogs_retail_report_stats_parameters);
}

cJSON *catalogs_retail_report_stats_parameters_convertToJSON(catalogs_retail_report_stats_parameters_t *catalogs_retail_report_stats_parameters) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_report_stats_parameters->catalog_type
    if (pinterest_rest_api_catalogs_retail_report_stats_parameters_CATALOGTYPE_NULL == catalogs_retail_report_stats_parameters->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_report_stats_parameters_catalog_type_ToString(catalogs_retail_report_stats_parameters->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_report_stats_parameters->report
    if (!catalogs_retail_report_stats_parameters->report) {
        goto fail;
    }
    cJSON *report_local_JSON = catalogs_retail_report_stats_parameters_report_convertToJSON(catalogs_retail_report_stats_parameters->report);
    if(report_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "report", report_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_report_stats_parameters_t *catalogs_retail_report_stats_parameters_parseFromJSON(cJSON *catalogs_retail_report_stats_parametersJSON){

    catalogs_retail_report_stats_parameters_t *catalogs_retail_report_stats_parameters_local_var = NULL;

    // define the local variable for catalogs_retail_report_stats_parameters->report
    catalogs_retail_report_stats_parameters_report_t *report_local_nonprim = NULL;

    // catalogs_retail_report_stats_parameters->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_report_stats_parametersJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_report_stats_parameters_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_report_stats_parameters_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_report_stats_parameters->report
    cJSON *report = cJSON_GetObjectItemCaseSensitive(catalogs_retail_report_stats_parametersJSON, "report");
    if (cJSON_IsNull(report)) {
        report = NULL;
    }
    if (!report) {
        goto end;
    }

    
    report_local_nonprim = catalogs_retail_report_stats_parameters_report_parseFromJSON(report); //nonprimitive



    catalogs_retail_report_stats_parameters_local_var = catalogs_retail_report_stats_parameters_create_internal (
        catalog_typeVariable,
        report_local_nonprim
        );

    if (!catalogs_retail_report_stats_parameters_local_var) {
        goto end;
    }

    return catalogs_retail_report_stats_parameters_local_var;
end:
    if (report_local_nonprim) {
        catalogs_retail_report_stats_parameters_report_free(report_local_nonprim);
        report_local_nonprim = NULL;
    }
    return NULL;

}
