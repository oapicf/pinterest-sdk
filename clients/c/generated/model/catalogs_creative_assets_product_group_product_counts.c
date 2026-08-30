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

static catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts_create_internal(
    double *app_links,
    pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double *images,
    double *total,
    double *videos
    ) {
    catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts_local_var = malloc(sizeof(catalogs_creative_assets_product_group_product_counts_t));
    if (!catalogs_creative_assets_product_group_product_counts_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_product_group_product_counts_local_var, 0, sizeof(catalogs_creative_assets_product_group_product_counts_t));
    catalogs_creative_assets_product_group_product_counts_local_var->_library_owned = 1;
    catalogs_creative_assets_product_group_product_counts_local_var->app_links = app_links;
    catalogs_creative_assets_product_group_product_counts_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_product_group_product_counts_local_var->images = images;
    catalogs_creative_assets_product_group_product_counts_local_var->total = total;
    catalogs_creative_assets_product_group_product_counts_local_var->videos = videos;
    return catalogs_creative_assets_product_group_product_counts_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts_create(
    double *app_links,
    pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double *images,
    double *total,
    double *videos
    ) {
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
    catalogs_creative_assets_product_group_product_counts_t *result = catalogs_creative_assets_product_group_product_counts_create_internal (
        app_links_copy,
        catalog_type,
        images_copy,
        total_copy,
        videos_copy
        );
    if (!result) {
        free(app_links_copy);
        free(images_copy);
        free(total_copy);
        free(videos_copy);
    }
    return result;
}

void catalogs_creative_assets_product_group_product_counts_free(catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts) {
    if(NULL == catalogs_creative_assets_product_group_product_counts){
        return ;
    }
    if(catalogs_creative_assets_product_group_product_counts->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_product_group_product_counts_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_group_product_counts->app_links) {
        free(catalogs_creative_assets_product_group_product_counts->app_links);
        catalogs_creative_assets_product_group_product_counts->app_links = NULL;
    }
    if (catalogs_creative_assets_product_group_product_counts->images) {
        free(catalogs_creative_assets_product_group_product_counts->images);
        catalogs_creative_assets_product_group_product_counts->images = NULL;
    }
    if (catalogs_creative_assets_product_group_product_counts->total) {
        free(catalogs_creative_assets_product_group_product_counts->total);
        catalogs_creative_assets_product_group_product_counts->total = NULL;
    }
    if (catalogs_creative_assets_product_group_product_counts->videos) {
        free(catalogs_creative_assets_product_group_product_counts->videos);
        catalogs_creative_assets_product_group_product_counts->videos = NULL;
    }
    free(catalogs_creative_assets_product_group_product_counts);
}

cJSON *catalogs_creative_assets_product_group_product_counts_convertToJSON(catalogs_creative_assets_product_group_product_counts_t *catalogs_creative_assets_product_group_product_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group_product_counts->app_links
    if (!catalogs_creative_assets_product_group_product_counts->app_links) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "app_links", *catalogs_creative_assets_product_group_product_counts->app_links) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_creative_assets_product_group_product_counts->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_NULL == catalogs_creative_assets_product_group_product_counts->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_creative_assets_product_group_product_counts_catalog_type_ToString(catalogs_creative_assets_product_group_product_counts->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_creative_assets_product_group_product_counts->images
    if (!catalogs_creative_assets_product_group_product_counts->images) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "images", *catalogs_creative_assets_product_group_product_counts->images) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_creative_assets_product_group_product_counts->total
    if (!catalogs_creative_assets_product_group_product_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", *catalogs_creative_assets_product_group_product_counts->total) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_creative_assets_product_group_product_counts->videos
    if (!catalogs_creative_assets_product_group_product_counts->videos) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "videos", *catalogs_creative_assets_product_group_product_counts->videos) == NULL) {
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

    // define the local variable for catalogs_creative_assets_product_group_product_counts->app_links
    double *app_links_local_var = NULL;

    // define the local variable for catalogs_creative_assets_product_group_product_counts->images
    double *images_local_var = NULL;

    // define the local variable for catalogs_creative_assets_product_group_product_counts->total
    double *total_local_var = NULL;

    // define the local variable for catalogs_creative_assets_product_group_product_counts->videos
    double *videos_local_var = NULL;

    // catalogs_creative_assets_product_group_product_counts->app_links
    cJSON *app_links = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "app_links");
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

    // catalogs_creative_assets_product_group_product_counts->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_product_group_product_counts_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_product_group_product_counts_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_product_group_product_counts->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "images");
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

    // catalogs_creative_assets_product_group_product_counts->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "total");
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

    // catalogs_creative_assets_product_group_product_counts->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_product_countsJSON, "videos");
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



    catalogs_creative_assets_product_group_product_counts_local_var = catalogs_creative_assets_product_group_product_counts_create_internal (
        app_links_local_var,
        catalog_typeVariable,
        images_local_var,
        total_local_var,
        videos_local_var
        );

    if (!catalogs_creative_assets_product_group_product_counts_local_var) {
        goto end;
    }

    return catalogs_creative_assets_product_group_product_counts_local_var;
end:
    if (app_links_local_var) {
        free(app_links_local_var);
        app_links_local_var = NULL;
    }
    if (images_local_var) {
        free(images_local_var);
        images_local_var = NULL;
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
