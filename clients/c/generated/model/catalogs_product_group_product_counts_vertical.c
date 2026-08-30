#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_product_counts_vertical.h"


char* catalogs_product_group_product_counts_vertical_catalog_type_ToString(pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalogs_product_group_product_counts_vertical_catalog_type_FromString(char* catalog_type){
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

static catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_create_internal(
    pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalog_type,
    double *in_stock,
    double *out_of_stock,
    double *preorder,
    double *total,
    double *videos,
    double *app_links,
    double *images
    ) {
    catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_local_var = malloc(sizeof(catalogs_product_group_product_counts_vertical_t));
    if (!catalogs_product_group_product_counts_vertical_local_var) {
        return NULL;
    }
    memset(catalogs_product_group_product_counts_vertical_local_var, 0, sizeof(catalogs_product_group_product_counts_vertical_t));
    catalogs_product_group_product_counts_vertical_local_var->_library_owned = 1;
    catalogs_product_group_product_counts_vertical_local_var->catalog_type = catalog_type;
    catalogs_product_group_product_counts_vertical_local_var->in_stock = in_stock;
    catalogs_product_group_product_counts_vertical_local_var->out_of_stock = out_of_stock;
    catalogs_product_group_product_counts_vertical_local_var->preorder = preorder;
    catalogs_product_group_product_counts_vertical_local_var->total = total;
    catalogs_product_group_product_counts_vertical_local_var->videos = videos;
    catalogs_product_group_product_counts_vertical_local_var->app_links = app_links;
    catalogs_product_group_product_counts_vertical_local_var->images = images;
    return catalogs_product_group_product_counts_vertical_local_var;
}

__attribute__((deprecated)) catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_create(
    pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalog_type,
    double *in_stock,
    double *out_of_stock,
    double *preorder,
    double *total,
    double *videos,
    double *app_links,
    double *images
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
    double *app_links_copy = NULL;
    if (app_links) {
        app_links_copy = malloc(sizeof(double));
        if (app_links_copy) *app_links_copy = *app_links;
    }
    double *images_copy = NULL;
    if (images) {
        images_copy = malloc(sizeof(double));
        if (images_copy) *images_copy = *images;
    }
    catalogs_product_group_product_counts_vertical_t *result = catalogs_product_group_product_counts_vertical_create_internal (
        catalog_type,
        in_stock_copy,
        out_of_stock_copy,
        preorder_copy,
        total_copy,
        videos_copy,
        app_links_copy,
        images_copy
        );
    if (!result) {
        free(in_stock_copy);
        free(out_of_stock_copy);
        free(preorder_copy);
        free(total_copy);
        free(videos_copy);
        free(app_links_copy);
        free(images_copy);
    }
    return result;
}

void catalogs_product_group_product_counts_vertical_free(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical) {
    if(NULL == catalogs_product_group_product_counts_vertical){
        return ;
    }
    if(catalogs_product_group_product_counts_vertical->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_product_counts_vertical_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_product_counts_vertical->in_stock) {
        free(catalogs_product_group_product_counts_vertical->in_stock);
        catalogs_product_group_product_counts_vertical->in_stock = NULL;
    }
    if (catalogs_product_group_product_counts_vertical->out_of_stock) {
        free(catalogs_product_group_product_counts_vertical->out_of_stock);
        catalogs_product_group_product_counts_vertical->out_of_stock = NULL;
    }
    if (catalogs_product_group_product_counts_vertical->preorder) {
        free(catalogs_product_group_product_counts_vertical->preorder);
        catalogs_product_group_product_counts_vertical->preorder = NULL;
    }
    if (catalogs_product_group_product_counts_vertical->total) {
        free(catalogs_product_group_product_counts_vertical->total);
        catalogs_product_group_product_counts_vertical->total = NULL;
    }
    if (catalogs_product_group_product_counts_vertical->videos) {
        free(catalogs_product_group_product_counts_vertical->videos);
        catalogs_product_group_product_counts_vertical->videos = NULL;
    }
    if (catalogs_product_group_product_counts_vertical->app_links) {
        free(catalogs_product_group_product_counts_vertical->app_links);
        catalogs_product_group_product_counts_vertical->app_links = NULL;
    }
    if (catalogs_product_group_product_counts_vertical->images) {
        free(catalogs_product_group_product_counts_vertical->images);
        catalogs_product_group_product_counts_vertical->images = NULL;
    }
    free(catalogs_product_group_product_counts_vertical);
}

cJSON *catalogs_product_group_product_counts_vertical_convertToJSON(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_product_counts_vertical->catalog_type
    if (pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_NULL == catalogs_product_group_product_counts_vertical->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_product_group_product_counts_vertical_catalog_type_ToString(catalogs_product_group_product_counts_vertical->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_product_group_product_counts_vertical->in_stock
    if (!catalogs_product_group_product_counts_vertical->in_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "in_stock", *catalogs_product_group_product_counts_vertical->in_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->out_of_stock
    if (!catalogs_product_group_product_counts_vertical->out_of_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "out_of_stock", *catalogs_product_group_product_counts_vertical->out_of_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->preorder
    if (!catalogs_product_group_product_counts_vertical->preorder) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "preorder", *catalogs_product_group_product_counts_vertical->preorder) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->total
    if (!catalogs_product_group_product_counts_vertical->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", *catalogs_product_group_product_counts_vertical->total) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->videos
    if (!catalogs_product_group_product_counts_vertical->videos) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "videos", *catalogs_product_group_product_counts_vertical->videos) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->app_links
    if (!catalogs_product_group_product_counts_vertical->app_links) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "app_links", *catalogs_product_group_product_counts_vertical->app_links) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->images
    if (!catalogs_product_group_product_counts_vertical->images) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "images", *catalogs_product_group_product_counts_vertical->images) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_parseFromJSON(cJSON *catalogs_product_group_product_counts_verticalJSON){

    catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->in_stock
    double *in_stock_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->out_of_stock
    double *out_of_stock_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->preorder
    double *preorder_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->total
    double *total_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->videos
    double *videos_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->app_links
    double *app_links_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->images
    double *images_local_var = NULL;

    // catalogs_product_group_product_counts_vertical->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_product_group_product_counts_vertical_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_product_group_product_counts_vertical->in_stock
    cJSON *in_stock = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "in_stock");
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

    // catalogs_product_group_product_counts_vertical->out_of_stock
    cJSON *out_of_stock = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "out_of_stock");
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

    // catalogs_product_group_product_counts_vertical->preorder
    cJSON *preorder = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "preorder");
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

    // catalogs_product_group_product_counts_vertical->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "total");
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

    // catalogs_product_group_product_counts_vertical->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "videos");
    if (cJSON_IsNull(videos)) {
        videos = NULL;
    }
    if (!videos) {
        goto end;
    }

    
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

    // catalogs_product_group_product_counts_vertical->app_links
    cJSON *app_links = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "app_links");
    if (cJSON_IsNull(app_links)) {
        app_links = NULL;
    }
    if (!app_links) {
        goto end;
    }

    
    if(!cJSON_IsNumber(app_links))
    {
    goto end; //Numeric
    }
    app_links_local_var = malloc(sizeof(double));
    if(!app_links_local_var)
    {
        goto end;
    }
    *app_links_local_var = app_links->valuedouble;

    // catalogs_product_group_product_counts_vertical->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "images");
    if (cJSON_IsNull(images)) {
        images = NULL;
    }
    if (!images) {
        goto end;
    }

    
    if(!cJSON_IsNumber(images))
    {
    goto end; //Numeric
    }
    images_local_var = malloc(sizeof(double));
    if(!images_local_var)
    {
        goto end;
    }
    *images_local_var = images->valuedouble;



    catalogs_product_group_product_counts_vertical_local_var = catalogs_product_group_product_counts_vertical_create_internal (
        catalog_typeVariable,
        in_stock_local_var,
        out_of_stock_local_var,
        preorder_local_var,
        total_local_var,
        videos_local_var,
        app_links_local_var,
        images_local_var
        );

    if (!catalogs_product_group_product_counts_vertical_local_var) {
        goto end;
    }

    return catalogs_product_group_product_counts_vertical_local_var;
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
    if (app_links_local_var) {
        free(app_links_local_var);
        app_links_local_var = NULL;
    }
    if (images_local_var) {
        free(images_local_var);
        images_local_var = NULL;
    }
    return NULL;

}
