#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_product_group_product_counts.h"


char* catalogs_retail_product_group_product_counts_catalog_type_ToString(pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalogs_retail_product_group_product_counts_catalog_type_FromString(char* catalog_type){
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

catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_create(
    pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double in_stock,
    double out_of_stock,
    double preorder,
    double total,
    double videos
    ) {
    catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_local_var = malloc(sizeof(catalogs_retail_product_group_product_counts_t));
    if (!catalogs_retail_product_group_product_counts_local_var) {
        return NULL;
    }
    catalogs_retail_product_group_product_counts_local_var->catalog_type = catalog_type;
    catalogs_retail_product_group_product_counts_local_var->in_stock = in_stock;
    catalogs_retail_product_group_product_counts_local_var->out_of_stock = out_of_stock;
    catalogs_retail_product_group_product_counts_local_var->preorder = preorder;
    catalogs_retail_product_group_product_counts_local_var->total = total;
    catalogs_retail_product_group_product_counts_local_var->videos = videos;

    return catalogs_retail_product_group_product_counts_local_var;
}


void catalogs_retail_product_group_product_counts_free(catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts) {
    if(NULL == catalogs_retail_product_group_product_counts){
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_retail_product_group_product_counts);
}

cJSON *catalogs_retail_product_group_product_counts_convertToJSON(catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_product_group_product_counts->catalog_type
    if (pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_NULL == catalogs_retail_product_group_product_counts->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_retail_product_group_product_counts_ToString(catalogs_retail_product_group_product_counts->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_product_group_product_counts->in_stock
    if (!catalogs_retail_product_group_product_counts->in_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "in_stock", catalogs_retail_product_group_product_counts->in_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->out_of_stock
    if (!catalogs_retail_product_group_product_counts->out_of_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "out_of_stock", catalogs_retail_product_group_product_counts->out_of_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->preorder
    if (!catalogs_retail_product_group_product_counts->preorder) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "preorder", catalogs_retail_product_group_product_counts->preorder) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->total
    if (!catalogs_retail_product_group_product_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", catalogs_retail_product_group_product_counts->total) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->videos
    if(catalogs_retail_product_group_product_counts->videos) {
    if(cJSON_AddNumberToObject(item, "videos", catalogs_retail_product_group_product_counts->videos) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_parseFromJSON(cJSON *catalogs_retail_product_group_product_countsJSON){

    catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_local_var = NULL;

    // catalogs_retail_product_group_product_counts->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_product_group_product_counts_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_product_group_product_counts->in_stock
    cJSON *in_stock = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "in_stock");
    if (!in_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(in_stock))
    {
    goto end; //Numeric
    }

    // catalogs_retail_product_group_product_counts->out_of_stock
    cJSON *out_of_stock = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "out_of_stock");
    if (!out_of_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(out_of_stock))
    {
    goto end; //Numeric
    }

    // catalogs_retail_product_group_product_counts->preorder
    cJSON *preorder = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "preorder");
    if (!preorder) {
        goto end;
    }

    
    if(!cJSON_IsNumber(preorder))
    {
    goto end; //Numeric
    }

    // catalogs_retail_product_group_product_counts->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "total");
    if (!total) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }

    // catalogs_retail_product_group_product_counts->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "videos");
    if (videos) { 
    if(!cJSON_IsNumber(videos))
    {
    goto end; //Numeric
    }
    }


    catalogs_retail_product_group_product_counts_local_var = catalogs_retail_product_group_product_counts_create (
        catalog_typeVariable,
        in_stock->valuedouble,
        out_of_stock->valuedouble,
        preorder->valuedouble,
        total->valuedouble,
        videos ? videos->valuedouble : 0
        );

    return catalogs_retail_product_group_product_counts_local_var;
end:
    return NULL;

}
