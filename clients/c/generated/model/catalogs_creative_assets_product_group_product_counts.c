#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_group_product_counts.h"


char* catalogs_creative_assets_product_group_product_counts_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_e catalogs_creative_assets_product_group_product_counts_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts_create(
    pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double total,
    double videos
    ) {
    catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts_local_var = malloc(sizeof(catalogs_creative_assets_product_group_product_counts_t));
    if (!catalogs_creative_assets_product_group_product_counts_local_var) {
        return NULL;
    }
    catalogs_creative_assets_product_group_product_counts_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_product_group_product_counts_local_var->total = total;
    catalogs_creative_assets_product_group_product_counts_local_var->videos = videos;

    return catalogs_creative_assets_product_group_product_counts_local_var;
}


void catalogs_creative_assets_product_group_product_counts_free(catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts) {
    if(NULL == catalogs_creative_assets_product_group_product_counts){
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_creative_assets_product_group_product_counts);
}

cJSON *catalogs_creative_assets_product_group_product_counts_convertToJSON(catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group_product_counts->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_NULL == catalogs_creative_assets_product_group_product_counts->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_creative_assets_product_group_product_counts_ToString(catalogs_creative_assets_product_group_product_counts->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_creative_assets_product_group_product_counts->total
    if (!catalogs_creative_assets_product_group_product_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", catalogs_creative_assets_product_group_product_counts->total) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_creative_assets_product_group_product_counts->videos
    if (!catalogs_creative_assets_product_group_product_counts->videos) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "videos", catalogs_creative_assets_product_group_product_counts->videos) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts_parseFromJSON(cJSON *catalogs_creative_assets_product_group_product_countsJSON){

    catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts_local_var = NULL;

    // catalogs_creative_assets_product_group_product_counts->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_product_group_product_counts_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_product_group_product_counts->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "total");
    if (!total) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }

    // catalogs_creative_assets_product_group_product_counts->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "videos");
    if (!videos) {
        goto end;
    }

    
    if(!cJSON_IsNumber(videos))
    {
    goto end; //Numeric
    }


    catalogs_creative_assets_product_group_product_counts_local_var = catalogs_creative_assets_product_group_product_counts_create (
        catalog_typeVariable,
        total->valuedouble,
        videos->valuedouble
        );

    return catalogs_creative_assets_product_group_product_counts_local_var;
end:
    return NULL;

}
