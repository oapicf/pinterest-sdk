#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "reports_stats_parameters_parameter.h"



static reports_stats_parameters_parameter_t *reports_stats_parameters_parameter_create_internal(
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_hotel_report_stats_parameters_report_t *report
    ) {
    reports_stats_parameters_parameter_t *reports_stats_parameters_parameter_local_var = malloc(sizeof(reports_stats_parameters_parameter_t));
    if (!reports_stats_parameters_parameter_local_var) {
        return NULL;
    }
    reports_stats_parameters_parameter_local_var->catalog_type = catalog_type;
    reports_stats_parameters_parameter_local_var->report = report;

    reports_stats_parameters_parameter_local_var->_library_owned = 1;
    return reports_stats_parameters_parameter_local_var;
}

__attribute__((deprecated)) reports_stats_parameters_parameter_t *reports_stats_parameters_parameter_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_hotel_report_stats_parameters_report_t *report
    ) {
    return reports_stats_parameters_parameter_create_internal (
        catalog_type,
        report
        );
}

void reports_stats_parameters_parameter_free(reports_stats_parameters_parameter_t *reports_stats_parameters_parameter) {
    if(NULL == reports_stats_parameters_parameter){
        return ;
    }
    if(reports_stats_parameters_parameter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "reports_stats_parameters_parameter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (reports_stats_parameters_parameter->report) {
        catalogs_hotel_report_stats_parameters_report_free(reports_stats_parameters_parameter->report);
        reports_stats_parameters_parameter->report = NULL;
    }
    free(reports_stats_parameters_parameter);
}

cJSON *reports_stats_parameters_parameter_convertToJSON(reports_stats_parameters_parameter_t *reports_stats_parameters_parameter) {
    cJSON *item = cJSON_CreateObject();

    // reports_stats_parameters_parameter->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == reports_stats_parameters_parameter->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(reports_stats_parameters_parameter->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // reports_stats_parameters_parameter->report
    if (!reports_stats_parameters_parameter->report) {
        goto fail;
    }
    cJSON *report_local_JSON = catalogs_hotel_report_stats_parameters_report_convertToJSON(reports_stats_parameters_parameter->report);
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

reports_stats_parameters_parameter_t *reports_stats_parameters_parameter_parseFromJSON(cJSON *reports_stats_parameters_parameterJSON){

    reports_stats_parameters_parameter_t *reports_stats_parameters_parameter_local_var = NULL;

    // define the local variable for reports_stats_parameters_parameter->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // define the local variable for reports_stats_parameters_parameter->report
    catalogs_hotel_report_stats_parameters_report_t *report_local_nonprim = NULL;

    // reports_stats_parameters_parameter->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(reports_stats_parameters_parameterJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // reports_stats_parameters_parameter->report
    cJSON *report = cJSON_GetObjectItemCaseSensitive(reports_stats_parameters_parameterJSON, "report");
    if (cJSON_IsNull(report)) {
        report = NULL;
    }
    if (!report) {
        goto end;
    }

    
    report_local_nonprim = catalogs_hotel_report_stats_parameters_report_parseFromJSON(report); //nonprimitive


    reports_stats_parameters_parameter_local_var = reports_stats_parameters_parameter_create_internal (
        catalog_type_local_nonprim,
        report_local_nonprim
        );

    return reports_stats_parameters_parameter_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    if (report_local_nonprim) {
        catalogs_hotel_report_stats_parameters_report_free(report_local_nonprim);
        report_local_nonprim = NULL;
    }
    return NULL;

}
