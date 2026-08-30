#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_updatable_creative_assets_attributes.h"



static catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes_create_internal(
    char *android_deep_link,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *description,
    char *google_product_category,
    char *ios_deep_link,
    char *link,
    char *title,
    char *visibility
    ) {
    catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes_local_var = malloc(sizeof(catalogs_updatable_creative_assets_attributes_t));
    if (!catalogs_updatable_creative_assets_attributes_local_var) {
        return NULL;
    }
    memset(catalogs_updatable_creative_assets_attributes_local_var, 0, sizeof(catalogs_updatable_creative_assets_attributes_t));
    catalogs_updatable_creative_assets_attributes_local_var->_library_owned = 1;
    catalogs_updatable_creative_assets_attributes_local_var->android_deep_link = android_deep_link;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_0 = custom_label_0;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_1 = custom_label_1;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_2 = custom_label_2;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_3 = custom_label_3;
    catalogs_updatable_creative_assets_attributes_local_var->custom_label_4 = custom_label_4;
    catalogs_updatable_creative_assets_attributes_local_var->description = description;
    catalogs_updatable_creative_assets_attributes_local_var->google_product_category = google_product_category;
    catalogs_updatable_creative_assets_attributes_local_var->ios_deep_link = ios_deep_link;
    catalogs_updatable_creative_assets_attributes_local_var->link = link;
    catalogs_updatable_creative_assets_attributes_local_var->title = title;
    catalogs_updatable_creative_assets_attributes_local_var->visibility = visibility;
    return catalogs_updatable_creative_assets_attributes_local_var;
}

__attribute__((deprecated)) catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes_create(
    char *android_deep_link,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *description,
    char *google_product_category,
    char *ios_deep_link,
    char *link,
    char *title,
    char *visibility
    ) {
    catalogs_updatable_creative_assets_attributes_t *result = catalogs_updatable_creative_assets_attributes_create_internal (
        android_deep_link,
        custom_label_0,
        custom_label_1,
        custom_label_2,
        custom_label_3,
        custom_label_4,
        description,
        google_product_category,
        ios_deep_link,
        link,
        title,
        visibility
        );
    if (!result) {
    }
    return result;
}

void catalogs_updatable_creative_assets_attributes_free(catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes) {
    if(NULL == catalogs_updatable_creative_assets_attributes){
        return ;
    }
    if(catalogs_updatable_creative_assets_attributes->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_updatable_creative_assets_attributes_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_updatable_creative_assets_attributes->android_deep_link) {
        free(catalogs_updatable_creative_assets_attributes->android_deep_link);
        catalogs_updatable_creative_assets_attributes->android_deep_link = NULL;
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
    if (catalogs_updatable_creative_assets_attributes->description) {
        free(catalogs_updatable_creative_assets_attributes->description);
        catalogs_updatable_creative_assets_attributes->description = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->google_product_category) {
        free(catalogs_updatable_creative_assets_attributes->google_product_category);
        catalogs_updatable_creative_assets_attributes->google_product_category = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->ios_deep_link) {
        free(catalogs_updatable_creative_assets_attributes->ios_deep_link);
        catalogs_updatable_creative_assets_attributes->ios_deep_link = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->link) {
        free(catalogs_updatable_creative_assets_attributes->link);
        catalogs_updatable_creative_assets_attributes->link = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->title) {
        free(catalogs_updatable_creative_assets_attributes->title);
        catalogs_updatable_creative_assets_attributes->title = NULL;
    }
    if (catalogs_updatable_creative_assets_attributes->visibility) {
        free(catalogs_updatable_creative_assets_attributes->visibility);
        catalogs_updatable_creative_assets_attributes->visibility = NULL;
    }
    free(catalogs_updatable_creative_assets_attributes);
}

cJSON *catalogs_updatable_creative_assets_attributes_convertToJSON(catalogs_updatable_creative_assets_attributes_t *catalogs_updatable_creative_assets_attributes) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_updatable_creative_assets_attributes->android_deep_link
    if(catalogs_updatable_creative_assets_attributes->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", catalogs_updatable_creative_assets_attributes->android_deep_link) == NULL) {
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


    // catalogs_updatable_creative_assets_attributes->description
    if(catalogs_updatable_creative_assets_attributes->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_updatable_creative_assets_attributes->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->google_product_category
    if(catalogs_updatable_creative_assets_attributes->google_product_category) {
    if(cJSON_AddStringToObject(item, "google_product_category", catalogs_updatable_creative_assets_attributes->google_product_category) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->ios_deep_link
    if(catalogs_updatable_creative_assets_attributes->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", catalogs_updatable_creative_assets_attributes->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->link
    if(catalogs_updatable_creative_assets_attributes->link) {
    if(cJSON_AddStringToObject(item, "link", catalogs_updatable_creative_assets_attributes->link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_creative_assets_attributes->title
    if(catalogs_updatable_creative_assets_attributes->title) {
    if(cJSON_AddStringToObject(item, "title", catalogs_updatable_creative_assets_attributes->title) == NULL) {
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

    char *android_deep_link_local_str = NULL;

    char *custom_label_0_local_str = NULL;

    char *custom_label_1_local_str = NULL;

    char *custom_label_2_local_str = NULL;

    char *custom_label_3_local_str = NULL;

    char *custom_label_4_local_str = NULL;

    char *description_local_str = NULL;

    char *google_product_category_local_str = NULL;

    char *ios_deep_link_local_str = NULL;

    char *link_local_str = NULL;

    char *title_local_str = NULL;

    char *visibility_local_str = NULL;

    // catalogs_updatable_creative_assets_attributes->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "custom_label_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->google_product_category
    cJSON *google_product_category = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "google_product_category");
    if (cJSON_IsNull(google_product_category)) {
        google_product_category = NULL;
    }
    if (google_product_category) { 
    if(!cJSON_IsString(google_product_category) && !cJSON_IsNull(google_product_category))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_creative_assets_attributes->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_creative_assets_attributesJSON, "visibility");
    if (cJSON_IsNull(visibility)) {
        visibility = NULL;
    }
    if (visibility) { 
    if(!cJSON_IsString(visibility) && !cJSON_IsNull(visibility))
    {
    goto end; //String
    }
    }


    if (android_deep_link && !cJSON_IsNull(android_deep_link)) android_deep_link_local_str = strdup(android_deep_link->valuestring);
    if (custom_label_0 && !cJSON_IsNull(custom_label_0)) custom_label_0_local_str = strdup(custom_label_0->valuestring);
    if (custom_label_1 && !cJSON_IsNull(custom_label_1)) custom_label_1_local_str = strdup(custom_label_1->valuestring);
    if (custom_label_2 && !cJSON_IsNull(custom_label_2)) custom_label_2_local_str = strdup(custom_label_2->valuestring);
    if (custom_label_3 && !cJSON_IsNull(custom_label_3)) custom_label_3_local_str = strdup(custom_label_3->valuestring);
    if (custom_label_4 && !cJSON_IsNull(custom_label_4)) custom_label_4_local_str = strdup(custom_label_4->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (google_product_category && !cJSON_IsNull(google_product_category)) google_product_category_local_str = strdup(google_product_category->valuestring);
    if (ios_deep_link && !cJSON_IsNull(ios_deep_link)) ios_deep_link_local_str = strdup(ios_deep_link->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (visibility && !cJSON_IsNull(visibility)) visibility_local_str = strdup(visibility->valuestring);

    catalogs_updatable_creative_assets_attributes_local_var = catalogs_updatable_creative_assets_attributes_create_internal (
        android_deep_link_local_str,
        custom_label_0_local_str,
        custom_label_1_local_str,
        custom_label_2_local_str,
        custom_label_3_local_str,
        custom_label_4_local_str,
        description_local_str,
        google_product_category_local_str,
        ios_deep_link_local_str,
        link_local_str,
        title_local_str,
        visibility_local_str
        );

    if (!catalogs_updatable_creative_assets_attributes_local_var) {
        goto end;
    }

    return catalogs_updatable_creative_assets_attributes_local_var;
end:
    if (android_deep_link_local_str) {
        free(android_deep_link_local_str);
        android_deep_link_local_str = NULL;
    }
    if (custom_label_0_local_str) {
        free(custom_label_0_local_str);
        custom_label_0_local_str = NULL;
    }
    if (custom_label_1_local_str) {
        free(custom_label_1_local_str);
        custom_label_1_local_str = NULL;
    }
    if (custom_label_2_local_str) {
        free(custom_label_2_local_str);
        custom_label_2_local_str = NULL;
    }
    if (custom_label_3_local_str) {
        free(custom_label_3_local_str);
        custom_label_3_local_str = NULL;
    }
    if (custom_label_4_local_str) {
        free(custom_label_4_local_str);
        custom_label_4_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (google_product_category_local_str) {
        free(google_product_category_local_str);
        google_product_category_local_str = NULL;
    }
    if (ios_deep_link_local_str) {
        free(ios_deep_link_local_str);
        ios_deep_link_local_str = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    if (visibility_local_str) {
        free(visibility_local_str);
        visibility_local_str = NULL;
    }
    return NULL;

}
