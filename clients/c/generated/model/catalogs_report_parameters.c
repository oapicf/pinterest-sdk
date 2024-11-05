#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_report_parameters.h"


char* catalogs_report_parameters_catalog_type_ToString(pinterest_rest_api_catalogs_report_parameters__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_report_parameters__e catalogs_report_parameters_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_report_parameters_t *catalogs_report_parameters_create(
    catalogs_type_t *catalog_type,
    catalogs_hotel_report_parameters_report_t *report
    ) {
    catalogs_report_parameters_t *catalogs_report_parameters_local_var = malloc(sizeof(catalogs_report_parameters_t));
    if (!catalogs_report_parameters_local_var) {
        return NULL;
    }
    catalogs_report_parameters_local_var->catalog_type = catalog_type;
    catalogs_report_parameters_local_var->report = report;

    return catalogs_report_parameters_local_var;
}


void catalogs_report_parameters_free(catalogs_report_parameters_t *catalogs_report_parameters) {
    if(NULL == catalogs_report_parameters){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_report_parameters->catalog_type) {
        catalogs_type_free(catalogs_report_parameters->catalog_type);
        catalogs_report_parameters->catalog_type = NULL;
    }
    if (catalogs_report_parameters->report) {
        catalogs_hotel_report_parameters_report_free(catalogs_report_parameters->report);
        catalogs_report_parameters->report = NULL;
    }
    free(catalogs_report_parameters);
}

cJSON *catalogs_report_parameters_convertToJSON(catalogs_report_parameters_t *catalogs_report_parameters) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_report_parameters->catalog_type
    if (pinterest_rest_api_catalogs_report_parameters__NULL == catalogs_report_parameters->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_report_parameters->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_report_parameters->report
    if (!catalogs_report_parameters->report) {
        goto fail;
    }
    cJSON *report_local_JSON = catalogs_hotel_report_parameters_report_convertToJSON(catalogs_report_parameters->report);
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

catalogs_report_parameters_t *catalogs_report_parameters_parseFromJSON(cJSON *catalogs_report_parametersJSON){

    catalogs_report_parameters_t *catalogs_report_parameters_local_var = NULL;

    // define the local variable for catalogs_report_parameters->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local variable for catalogs_report_parameters->report
    catalogs_hotel_report_parameters_report_t *report_local_nonprim = NULL;

    // catalogs_report_parameters->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_report_parametersJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_report_parameters->report
    cJSON *report = cJSON_GetObjectItemCaseSensitive(catalogs_report_parametersJSON, "report");
    if (!report) {
        goto end;
    }

    
    report_local_nonprim = catalogs_hotel_report_parameters_report_parseFromJSON(report); //nonprimitive


    catalogs_report_parameters_local_var = catalogs_report_parameters_create (
        catalog_type_local_nonprim,
        report_local_nonprim
        );

    return catalogs_report_parameters_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    if (report_local_nonprim) {
        catalogs_hotel_report_parameters_report_free(report_local_nonprim);
        report_local_nonprim = NULL;
    }
    return NULL;

}
