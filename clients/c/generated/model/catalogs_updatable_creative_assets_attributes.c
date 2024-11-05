#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_updatable_creative_assets_attributes.h"



catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes_create(
    char *title,
    char *description,
    char *link,
    char *ios_deep_link,
    char *android_deep_link,
    char *google_product_category,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *visibility
    ) {
    catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes_local_var = malloc(sizeof(catalogs_updatable_creative_assets_attributes_t));
    if (!catalogs_updatable_creative_assets_attributes_local_var) {
        return NULL;
    }
    catalogs_updatable_creative_assets_attributes_local_var->title = title;
    catalogs_updatable_creative_assets_attributes_local_var->description = description;
    catalogs_updatable_creative_assets_attributes_local_var->link = link;
    catalogs_updatable_creative_assets_attributes_local_var->ios_deep_link = ios_deep_link;
    catalogs_updatable_creative_assets_attributes_local_var->android_deep_link = android_deep_link;
    catalogs_updatable_creative_assets_attributes_local_var->google_product_category = google_product_category;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_0 = custom_label_0;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_1 = custom_label_1;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_2 = custom_label_2;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_3 = custom_label_3;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_4 = custom_label_4;
    catalogs_updatable_creative_assets_attributes_local_var->visibility = visibility;

    return catalogs_updatable_creative_assets_attributes_local_var;
}


void catalogs_updatable_creative_assets_attributes_free(catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes) {
    if(NULL == catalogs_updatable_creative_assets_attributes){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_updatable_creative_assets_attributes->title) {
        free(catalogs_updatable_creative_assets_attributes->title);
        catalogs_updatable_creative_assets_attributes->title = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->description) {
        free(catalogs_updatable_creative_assets_attributes->description);
        catalogs_updatable_creative_assets_attributes->description = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->link) {
        free(catalogs_updatable_creative_assets_attributes->link);
        catalogs_updatable_creative_assets_attributes->link = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->ios_deep_link) {
        free(catalogs_updatable_creative_assets_attributes->ios_deep_link);
        catalogs_updatable_creative_assets_attributes->ios_deep_link = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->android_deep_link) {
        free(catalogs_updatable_creative_assets_attributes->android_deep_link);
        catalogs_updatable_creative_assets_attributes->android_deep_link = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->google_product_category) {
        free(catalogs_updatable_creative_assets_attributes->google_product_category);
        catalogs_updatable_creative_assets_attributes->google_product_category = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->custom_label_0) {
        free(catalogs_updatable_creative_assets_attributes->custom_label_0);
        catalogs_updatable_creative_assets_attributes->custom_label_0 = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->custom_label_1) {
        free(catalogs_updatable_creative_assets_attributes->custom_label_1);
        catalogs_updatable_creative_assets_attributes->custom_label_1 = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->custom_label_2) {
        free(catalogs_updatable_creative_assets_attributes->custom_label_2);
        catalogs_updatable_creative_assets_attributes->custom_label_2 = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->custom_label_3) {
        free(catalogs_updatable_creative_assets_attributes->custom_label_3);
        catalogs_updatable_creative_assets_attributes->custom_label_3 = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->custom_label_4) {
        free(catalogs_updatable_creative_assets_attributes->custom_label_4);
        catalogs_updatable_creative_assets_attributes->custom_label_4 = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->visibility) {
        free(catalogs_updatable_creative_assets_attributes->visibility);
        catalogs_updatable_creative_assets_attributes->visibility = NULL;
    }
    free(catalogs_updatable_creative_assets_attributes);
}

cJSON *catalogs_updatable_creative_assets_attributes_convertToJSON(catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_updatable_creative_assets_attributes->title
    if(catalogs_updatable_creative_assets_attributes->title) {
    if(cJSON_AddStringToObject(item, "title", catalogs_updatable_creative_assets_attributes->title) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->description
    if(catalogs_updatable_creative_assets_attributes->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_updatable_creative_assets_attributes->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->link
    if(catalogs_updatable_creative_assets_attributes->link) {
    if(cJSON_AddStringToObject(item, "link", catalogs_updatable_creative_assets_attributes->link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->ios_deep_link
    if(catalogs_updatable_creative_assets_attributes->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", catalogs_updatable_creative_assets_attributes->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->android_deep_link
    if(catalogs_updatable_creative_assets_attributes->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", catalogs_updatable_creative_assets_attributes->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->google_product_category
    if(catalogs_updatable_creative_assets_attributes->google_product_category) {
    if(cJSON_AddStringToObject(item, "google_product_category", catalogs_updatable_creative_assets_attributes->google_product_category) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->custom_label_0
    if(catalogs_updatable_creative_assets_attributes->custom_label_0) {
    if(cJSON_AddStringToObject(item, "custom_label_0", catalogs_updatable_creative_assets_attributes->custom_label_0) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->custom_label_1
    if(catalogs_updatable_creative_assets_attributes->custom_label_1) {
    if(cJSON_AddStringToObject(item, "custom_label_1", catalogs_updatable_creative_assets_attributes->custom_label_1) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->custom_label_2
    if(catalogs_updatable_creative_assets_attributes->custom_label_2) {
    if(cJSON_AddStringToObject(item, "custom_label_2", catalogs_updatable_creative_assets_attributes->custom_label_2) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->custom_label_3
    if(catalogs_updatable_creative_assets_attributes->custom_label_3) {
    if(cJSON_AddStringToObject(item, "custom_label_3", catalogs_updatable_creative_assets_attributes->custom_label_3) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->custom_label_4
    if(catalogs_updatable_creative_assets_attributes->custom_label_4) {
    if(cJSON_AddStringToObject(item, "custom_label_4", catalogs_updatable_creative_assets_attributes->custom_label_4) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->visibility
    if(catalogs_updatable_creative_assets_attributes->visibility) {
    if(cJSON_AddStringToObject(item, "visibility", catalogs_updatable_creative_assets_attributes->visibility) == NULL) {
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

catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes_parseFromJSON(cJSON *catalogs_updatable_creative_assets_attributesJSON){

    catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes_local_var = NULL;

    // catalogs_updatable_creative_assets_attributes->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "ios_deep_link");
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "android_deep_link");
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->google_product_category
    cJSON *google_product_category = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "google_product_category");
    if (google_product_category) { 
    if(!cJSON_IsString(google_product_category) && !cJSON_IsNull(google_product_category))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_0");
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_1");
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_2");
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_3");
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_4");
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "visibility");
    if (visibility) { 
    if(!cJSON_IsString(visibility) && !cJSON_IsNull(visibility))
    {
    goto end; //String
    }
    }


    catalogs_updatable_creative_assets_attributes_local_var = catalogs_updatable_creative_assets_attributes_create (
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        ios_deep_link && !cJSON_IsNull(ios_deep_link) ? strdup(ios_deep_link->valuestring) : NULL,
        android_deep_link && !cJSON_IsNull(android_deep_link) ? strdup(android_deep_link->valuestring) : NULL,
        google_product_category && !cJSON_IsNull(google_product_category) ? strdup(google_product_category->valuestring) : NULL,
        custom_label_0 && !cJSON_IsNull(custom_label_0) ? strdup(custom_label_0->valuestring) : NULL,
        custom_label_1 && !cJSON_IsNull(custom_label_1) ? strdup(custom_label_1->valuestring) : NULL,
        custom_label_2 && !cJSON_IsNull(custom_label_2) ? strdup(custom_label_2->valuestring) : NULL,
        custom_label_3 && !cJSON_IsNull(custom_label_3) ? strdup(custom_label_3->valuestring) : NULL,
        custom_label_4 && !cJSON_IsNull(custom_label_4) ? strdup(custom_label_4->valuestring) : NULL,
        visibility && !cJSON_IsNull(visibility) ? strdup(visibility->valuestring) : NULL
        );

    return catalogs_updatable_creative_assets_attributes_local_var;
end:
    return NULL;

}
