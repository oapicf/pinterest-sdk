#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_report_distribution_issue_filter.h"


char* catalogs_report_distribution_issue_filter_report_type_ToString(pinterest_rest_api_catalogs_report_distribution_issue_filter_REPORTTYPE_e report_type) {
    char* report_typeArray[] =  { "NULL", "DISTRIBUTION_ISSUES" };
    return report_typeArray[report_type];
}

pinterest_rest_api_catalogs_report_distribution_issue_filter_REPORTTYPE_e catalogs_report_distribution_issue_filter_report_type_FromString(char* report_type){
    int stringToReturn = 0;
    char *report_typeArray[] =  { "NULL", "DISTRIBUTION_ISSUES" };
    size_t sizeofArray = sizeof(report_typeArray) / sizeof(report_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_type, report_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_report_distribution_issue_filter_t *catalogs_report_distribution_issue_filter_create(
    pinterest_rest_api_catalogs_report_distribution_issue_filter_REPORTTYPE_e report_type,
    char *catalog_id
    ) {
    catalogs_report_distribution_issue_filter_t *catalogs_report_distribution_issue_filter_local_var = malloc(sizeof(catalogs_report_distribution_issue_filter_t));
    if (!catalogs_report_distribution_issue_filter_local_var) {
        return NULL;
    }
    catalogs_report_distribution_issue_filter_local_var->report_type = report_type;
    catalogs_report_distribution_issue_filter_local_var->catalog_id = catalog_id;

    return catalogs_report_distribution_issue_filter_local_var;
}


void catalogs_report_distribution_issue_filter_free(catalogs_report_distribution_issue_filter_t *catalogs_report_distribution_issue_filter) {
    if(NULL == catalogs_report_distribution_issue_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_report_distribution_issue_filter->catalog_id) {
        free(catalogs_report_distribution_issue_filter->catalog_id);
        catalogs_report_distribution_issue_filter->catalog_id = NULL;
    }
    free(catalogs_report_distribution_issue_filter);
}

cJSON *catalogs_report_distribution_issue_filter_convertToJSON(catalogs_report_distribution_issue_filter_t *catalogs_report_distribution_issue_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_report_distribution_issue_filter->report_type
    if (pinterest_rest_api_catalogs_report_distribution_issue_filter_REPORTTYPE_NULL == catalogs_report_distribution_issue_filter->report_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "report_type", report_typecatalogs_report_distribution_issue_filter_ToString(catalogs_report_distribution_issue_filter->report_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_report_distribution_issue_filter->catalog_id
    if(catalogs_report_distribution_issue_filter->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_report_distribution_issue_filter->catalog_id) == NULL) {
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

catalogs_report_distribution_issue_filter_t *catalogs_report_distribution_issue_filter_parseFromJSON(cJSON *catalogs_report_distribution_issue_filterJSON){

    catalogs_report_distribution_issue_filter_t *catalogs_report_distribution_issue_filter_local_var = NULL;

    // catalogs_report_distribution_issue_filter->report_type
    cJSON *report_type = cJSON_GetObjectItemCaseSensitive(catalogs_report_distribution_issue_filterJSON, "report_type");
    if (!report_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_report_distribution_issue_filter_REPORTTYPE_e report_typeVariable;
    
    if(!cJSON_IsString(report_type))
    {
    goto end; //Enum
    }
    report_typeVariable = catalogs_report_distribution_issue_filter_report_type_FromString(report_type->valuestring);

    // catalogs_report_distribution_issue_filter->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_report_distribution_issue_filterJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }


    catalogs_report_distribution_issue_filter_local_var = catalogs_report_distribution_issue_filter_create (
        report_typeVariable,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL
        );

    return catalogs_report_distribution_issue_filter_local_var;
end:
    return NULL;

}
