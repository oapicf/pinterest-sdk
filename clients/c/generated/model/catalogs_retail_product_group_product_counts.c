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

static catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_create_internal(
    pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double *in_stock,
    double *out_of_stock,
    double *preorder,
    double *total,
    double *videos
    ) {
    catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_local_var = malloc(sizeof(catalogs_retail_product_group_product_counts_t));
    if (!catalogs_retail_product_group_product_counts_local_var) {
        return NULL;
    }
    memset(catalogs_retail_product_group_product_counts_local_var, 0, sizeof(catalogs_retail_product_group_product_counts_t));
    catalogs_retail_product_group_product_counts_local_var->_library_owned = 1;
    catalogs_retail_product_group_product_counts_local_var->catalog_type = catalog_type;
    catalogs_retail_product_group_product_counts_local_var->in_stock = in_stock;
    catalogs_retail_product_group_product_counts_local_var->out_of_stock = out_of_stock;
    catalogs_retail_product_group_product_counts_local_var->preorder = preorder;
    catalogs_retail_product_group_product_counts_local_var->total = total;
    catalogs_retail_product_group_product_counts_local_var->videos = videos;
    return catalogs_retail_product_group_product_counts_local_var;
}

__attribute__((deprecated)) catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_create(
    pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double *in_stock,
    double *out_of_stock,
    double *preorder,
    double *total,
    double *videos
    ) {
    double *in_stock_copy = NULL;
    if (in_stock) {
        in_stock_copy = malloc(sizeof(double));
        if (in_stock_copy) *in_stock_copy = *in_stock;
    }
    double *out_of_stock_copy = NULL;
    if (out_of_stock) {
        out_of_stock_copy = malloc(sizeof(double));
        if (out_of_stock_copy) *out_of_stock_copy = *out_of_stock;
    }
    double *preorder_copy = NULL;
    if (preorder) {
        preorder_copy = malloc(sizeof(double));
        if (preorder_copy) *preorder_copy = *preorder;
    }
    double *total_copy = NULL;
    if (total) {
        total_copy = malloc(sizeof(double));
        if (total_copy) *total_copy = *total;
    }
    double *videos_copy = NULL;
    if (videos) {
        videos_copy = malloc(sizeof(double));
        if (videos_copy) *videos_copy = *videos;
    }
    catalogs_retail_product_group_product_counts_t *result = catalogs_retail_product_group_product_counts_create_internal (
        catalog_type,
        in_stock_copy,
        out_of_stock_copy,
        preorder_copy,
        total_copy,
        videos_copy
        );
    if (!result) {
        free(in_stock_copy);
        free(out_of_stock_copy);
        free(preorder_copy);
        free(total_copy);
        free(videos_copy);
    }
    return result;
}

void catalogs_retail_product_group_product_counts_free(catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts) {
    if(NULL == catalogs_retail_product_group_product_counts){
        return ;
    }
    if(catalogs_retail_product_group_product_counts->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_product_group_product_counts_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_product_group_product_counts->in_stock) {
        free(catalogs_retail_product_group_product_counts->in_stock);
        catalogs_retail_product_group_product_counts->in_stock = NULL;
    }
    if (catalogs_retail_product_group_product_counts->out_of_stock) {
        free(catalogs_retail_product_group_product_counts->out_of_stock);
        catalogs_retail_product_group_product_counts->out_of_stock = NULL;
    }
    if (catalogs_retail_product_group_product_counts->preorder) {
        free(catalogs_retail_product_group_product_counts->preorder);
        catalogs_retail_product_group_product_counts->preorder = NULL;
    }
    if (catalogs_retail_product_group_product_counts->total) {
        free(catalogs_retail_product_group_product_counts->total);
        catalogs_retail_product_group_product_counts->total = NULL;
    }
    if (catalogs_retail_product_group_product_counts->videos) {
        free(catalogs_retail_product_group_product_counts->videos);
        catalogs_retail_product_group_product_counts->videos = NULL;
    }
    free(catalogs_retail_product_group_product_counts);
}

cJSON *catalogs_retail_product_group_product_counts_convertToJSON(catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_product_group_product_counts->catalog_type
    if (pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_NULL == catalogs_retail_product_group_product_counts->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_product_group_product_counts_catalog_type_ToString(catalogs_retail_product_group_product_counts->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_product_group_product_counts->in_stock
    if (!catalogs_retail_product_group_product_counts->in_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "in_stock", *catalogs_retail_product_group_product_counts->in_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->out_of_stock
    if (!catalogs_retail_product_group_product_counts->out_of_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "out_of_stock", *catalogs_retail_product_group_product_counts->out_of_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->preorder
    if (!catalogs_retail_product_group_product_counts->preorder) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "preorder", *catalogs_retail_product_group_product_counts->preorder) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->total
    if (!catalogs_retail_product_group_product_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", *catalogs_retail_product_group_product_counts->total) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_group_product_counts->videos
    if(catalogs_retail_product_group_product_counts->videos) {
    if(cJSON_AddNumberToObject(item, "videos", *catalogs_retail_product_group_product_counts->videos) == NULL) {
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

    // define the local variable for catalogs_retail_product_group_product_counts->in_stock
    double *in_stock_local_var = NULL;

    // define the local variable for catalogs_retail_product_group_product_counts->out_of_stock
    double *out_of_stock_local_var = NULL;

    // define the local variable for catalogs_retail_product_group_product_counts->preorder
    double *preorder_local_var = NULL;

    // define the local variable for catalogs_retail_product_group_product_counts->total
    double *total_local_var = NULL;

    // define the local variable for catalogs_retail_product_group_product_counts->videos
    double *videos_local_var = NULL;

    // catalogs_retail_product_group_product_counts->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
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
    if (cJSON_IsNull(in_stock)) {
        in_stock = NULL;
    }
    if (!in_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(in_stock))
    {
    goto end; //Numeric
    }
    in_stock_local_var = malloc(sizeof(double));
    if(!in_stock_local_var)
    {
        goto end;
    }
    *in_stock_local_var = in_stock->valuedouble;

    // catalogs_retail_product_group_product_counts->out_of_stock
    cJSON *out_of_stock = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "out_of_stock");
    if (cJSON_IsNull(out_of_stock)) {
        out_of_stock = NULL;
    }
    if (!out_of_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(out_of_stock))
    {
    goto end; //Numeric
    }
    out_of_stock_local_var = malloc(sizeof(double));
    if(!out_of_stock_local_var)
    {
        goto end;
    }
    *out_of_stock_local_var = out_of_stock->valuedouble;

    // catalogs_retail_product_group_product_counts->preorder
    cJSON *preorder = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "preorder");
    if (cJSON_IsNull(preorder)) {
        preorder = NULL;
    }
    if (!preorder) {
        goto end;
    }

    
    if(!cJSON_IsNumber(preorder))
    {
    goto end; //Numeric
    }
    preorder_local_var = malloc(sizeof(double));
    if(!preorder_local_var)
    {
        goto end;
    }
    *preorder_local_var = preorder->valuedouble;

    // catalogs_retail_product_group_product_counts->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "total");
    if (cJSON_IsNull(total)) {
        total = NULL;
    }
    if (!total) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }
    total_local_var = malloc(sizeof(double));
    if(!total_local_var)
    {
        goto end;
    }
    *total_local_var = total->valuedouble;

    // catalogs_retail_product_group_product_counts->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_product_countsJSON, "videos");
    if (cJSON_IsNull(videos)) {
        videos = NULL;
    }
    if (videos) { 
    if(!cJSON_IsNumber(videos))
    {
    goto end; //Numeric
    }
    videos_local_var = malloc(sizeof(double));
    if(!videos_local_var)
    {
        goto end;
    }
    *videos_local_var = videos->valuedouble;
    }



    catalogs_retail_product_group_product_counts_local_var = catalogs_retail_product_group_product_counts_create_internal (
        catalog_typeVariable,
        in_stock_local_var,
        out_of_stock_local_var,
        preorder_local_var,
        total_local_var,
        videos_local_var
        );

    if (!catalogs_retail_product_group_product_counts_local_var) {
        goto end;
    }

    return catalogs_retail_product_group_product_counts_local_var;
end:
    if (in_stock_local_var) {
        free(in_stock_local_var);
        in_stock_local_var = NULL;
    }
    if (out_of_stock_local_var) {
        free(out_of_stock_local_var);
        out_of_stock_local_var = NULL;
    }
    if (preorder_local_var) {
        free(preorder_local_var);
        preorder_local_var = NULL;
    }
    if (total_local_var) {
        free(total_local_var);
        total_local_var = NULL;
    }
    if (videos_local_var) {
        free(videos_local_var);
        videos_local_var = NULL;
    }
    return NULL;

}
