#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_report_all_items_filter.h"


char* catalogs_retail_report_all_items_filter_report_type_ToString(pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e report_type) {
    char* report_typeArray[] =  { "NULL", "ALL_ITEMS" };
    return report_typeArray[report_type];
}

pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e catalogs_retail_report_all_items_filter_report_type_FromString(char* report_type){
    int stringToReturn = 0;
    char *report_typeArray[] =  { "NULL", "ALL_ITEMS" };
    size_t sizeofArray = sizeof(report_typeArray) / sizeof(report_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_type, report_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter_create_internal(
    char *catalog_id,
    char *product_group_id,
    pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e report_type
    ) {
    catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter_local_var = malloc(sizeof(catalogs_retail_report_all_items_filter_t));
    if (!catalogs_retail_report_all_items_filter_local_var) {
        return NULL;
    }
    memset(catalogs_retail_report_all_items_filter_local_var, 0, sizeof(catalogs_retail_report_all_items_filter_t));
    catalogs_retail_report_all_items_filter_local_var->_library_owned = 1;
    catalogs_retail_report_all_items_filter_local_var->catalog_id = catalog_id;
    catalogs_retail_report_all_items_filter_local_var->product_group_id = product_group_id;
    catalogs_retail_report_all_items_filter_local_var->report_type = report_type;
    return catalogs_retail_report_all_items_filter_local_var;
}

__attribute__((deprecated)) catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter_create(
    char *catalog_id,
    char *product_group_id,
    pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e report_type
    ) {
    catalogs_retail_report_all_items_filter_t *result = catalogs_retail_report_all_items_filter_create_internal (
        catalog_id,
        product_group_id,
        report_type
        );
    if (!result) {
    }
    return result;
}

void catalogs_retail_report_all_items_filter_free(catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter) {
    if(NULL == catalogs_retail_report_all_items_filter){
        return ;
    }
    if(catalogs_retail_report_all_items_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_report_all_items_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_report_all_items_filter->catalog_id) {
        free(catalogs_retail_report_all_items_filter->catalog_id);
        catalogs_retail_report_all_items_filter->catalog_id = NULL;
    }
    if (catalogs_retail_report_all_items_filter->product_group_id) {
        free(catalogs_retail_report_all_items_filter->product_group_id);
        catalogs_retail_report_all_items_filter->product_group_id = NULL;
    }
    free(catalogs_retail_report_all_items_filter);
}

cJSON *catalogs_retail_report_all_items_filter_convertToJSON(catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_report_all_items_filter->catalog_id
    if(catalogs_retail_report_all_items_filter->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_retail_report_all_items_filter->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_report_all_items_filter->product_group_id
    if(catalogs_retail_report_all_items_filter->product_group_id) {
    if(cJSON_AddStringToObject(item, "product_group_id", catalogs_retail_report_all_items_filter->product_group_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_report_all_items_filter->report_type
    if (pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_NULL == catalogs_retail_report_all_items_filter->report_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "report_type", catalogs_retail_report_all_items_filter_report_type_ToString(catalogs_retail_report_all_items_filter->report_type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter_parseFromJSON(cJSON *catalogs_retail_report_all_items_filterJSON){

    catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter_local_var = NULL;

    char *catalog_id_local_str = NULL;

    char *product_group_id_local_str = NULL;

    // catalogs_retail_report_all_items_filter->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_report_all_items_filterJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_retail_report_all_items_filter->product_group_id
    cJSON *product_group_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_report_all_items_filterJSON, "product_group_id");
    if (cJSON_IsNull(product_group_id)) {
        product_group_id = NULL;
    }
    if (product_group_id) { 
    if(!cJSON_IsString(product_group_id) && !cJSON_IsNull(product_group_id))
    {
    goto end; //String
    }
    }

    // catalogs_retail_report_all_items_filter->report_type
    cJSON *report_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_report_all_items_filterJSON, "report_type");
    if (cJSON_IsNull(report_type)) {
        report_type = NULL;
    }
    if (!report_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e report_typeVariable;
    
    if(!cJSON_IsString(report_type))
    {
    goto end; //Enum
    }
    report_typeVariable = catalogs_retail_report_all_items_filter_report_type_FromString(report_type->valuestring);


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);
    if (product_group_id && !cJSON_IsNull(product_group_id)) product_group_id_local_str = strdup(product_group_id->valuestring);

    catalogs_retail_report_all_items_filter_local_var = catalogs_retail_report_all_items_filter_create_internal (
        catalog_id_local_str,
        product_group_id_local_str,
        report_typeVariable
        );

    if (!catalogs_retail_report_all_items_filter_local_var) {
        goto end;
    }

    return catalogs_retail_report_all_items_filter_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (product_group_id_local_str) {
        free(product_group_id_local_str);
        product_group_id_local_str = NULL;
    }
    return NULL;

}
