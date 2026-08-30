#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_attributes.h"



static catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes_create_internal(
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
    char *visibility,
    list_t *ai_disclosures,
    char *image_link,
    char *video_link
    ) {
    catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes_local_var = malloc(sizeof(catalogs_creative_assets_attributes_t));
    if (!catalogs_creative_assets_attributes_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_attributes_local_var, 0, sizeof(catalogs_creative_assets_attributes_t));
    catalogs_creative_assets_attributes_local_var->_library_owned = 1;
    catalogs_creative_assets_attributes_local_var->android_deep_link = android_deep_link;
    catalogs_creative_assets_attributes_local_var->custom_label_0 = custom_label_0;
    catalogs_creative_assets_attributes_local_var->custom_label_1 = custom_label_1;
    catalogs_creative_assets_attributes_local_var->custom_label_2 = custom_label_2;
    catalogs_creative_assets_attributes_local_var->custom_label_3 = custom_label_3;
    catalogs_creative_assets_attributes_local_var->custom_label_4 = custom_label_4;
    catalogs_creative_assets_attributes_local_var->description = description;
    catalogs_creative_assets_attributes_local_var->google_product_category = google_product_category;
    catalogs_creative_assets_attributes_local_var->ios_deep_link = ios_deep_link;
    catalogs_creative_assets_attributes_local_var->link = link;
    catalogs_creative_assets_attributes_local_var->title = title;
    catalogs_creative_assets_attributes_local_var->visibility = visibility;
    catalogs_creative_assets_attributes_local_var->ai_disclosures = ai_disclosures;
    catalogs_creative_assets_attributes_local_var->image_link = image_link;
    catalogs_creative_assets_attributes_local_var->video_link = video_link;
    return catalogs_creative_assets_attributes_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes_create(
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
    char *visibility,
    list_t *ai_disclosures,
    char *image_link,
    char *video_link
    ) {
    catalogs_creative_assets_attributes_t *result = catalogs_creative_assets_attributes_create_internal (
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
        visibility,
        ai_disclosures,
        image_link,
        video_link
        );
    if (!result) {
    }
    return result;
}

void catalogs_creative_assets_attributes_free(catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes) {
    if(NULL == catalogs_creative_assets_attributes){
        return ;
    }
    if(catalogs_creative_assets_attributes->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_attributes_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_attributes->android_deep_link) {
        free(catalogs_creative_assets_attributes->android_deep_link);
        catalogs_creative_assets_attributes->android_deep_link = NULL;
    }
    if (catalogs_creative_assets_attributes->custom_label_0) {
        free(catalogs_creative_assets_attributes->custom_label_0);
        catalogs_creative_assets_attributes->custom_label_0 = NULL;
    }
    if (catalogs_creative_assets_attributes->custom_label_1) {
        free(catalogs_creative_assets_attributes->custom_label_1);
        catalogs_creative_assets_attributes->custom_label_1 = NULL;
    }
    if (catalogs_creative_assets_attributes->custom_label_2) {
        free(catalogs_creative_assets_attributes->custom_label_2);
        catalogs_creative_assets_attributes->custom_label_2 = NULL;
    }
    if (catalogs_creative_assets_attributes->custom_label_3) {
        free(catalogs_creative_assets_attributes->custom_label_3);
        catalogs_creative_assets_attributes->custom_label_3 = NULL;
    }
    if (catalogs_creative_assets_attributes->custom_label_4) {
        free(catalogs_creative_assets_attributes->custom_label_4);
        catalogs_creative_assets_attributes->custom_label_4 = NULL;
    }
    if (catalogs_creative_assets_attributes->description) {
        free(catalogs_creative_assets_attributes->description);
        catalogs_creative_assets_attributes->description = NULL;
    }
    if (catalogs_creative_assets_attributes->google_product_category) {
        free(catalogs_creative_assets_attributes->google_product_category);
        catalogs_creative_assets_attributes->google_product_category = NULL;
    }
    if (catalogs_creative_assets_attributes->ios_deep_link) {
        free(catalogs_creative_assets_attributes->ios_deep_link);
        catalogs_creative_assets_attributes->ios_deep_link = NULL;
    }
    if (catalogs_creative_assets_attributes->link) {
        free(catalogs_creative_assets_attributes->link);
        catalogs_creative_assets_attributes->link = NULL;
    }
    if (catalogs_creative_assets_attributes->title) {
        free(catalogs_creative_assets_attributes->title);
        catalogs_creative_assets_attributes->title = NULL;
    }
    if (catalogs_creative_assets_attributes->visibility) {
        free(catalogs_creative_assets_attributes->visibility);
        catalogs_creative_assets_attributes->visibility = NULL;
    }
    if (catalogs_creative_assets_attributes->ai_disclosures) {
        list_ForEach(listEntry, catalogs_creative_assets_attributes->ai_disclosures) {
            catalogs_ai_content_disclosure_free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_attributes->ai_disclosures);
        catalogs_creative_assets_attributes->ai_disclosures = NULL;
    }
    if (catalogs_creative_assets_attributes->image_link) {
        free(catalogs_creative_assets_attributes->image_link);
        catalogs_creative_assets_attributes->image_link = NULL;
    }
    if (catalogs_creative_assets_attributes->video_link) {
        free(catalogs_creative_assets_attributes->video_link);
        catalogs_creative_assets_attributes->video_link = NULL;
    }
    free(catalogs_creative_assets_attributes);
}

cJSON *catalogs_creative_assets_attributes_convertToJSON(catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_attributes->android_deep_link
    if(catalogs_creative_assets_attributes->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", catalogs_creative_assets_attributes->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->custom_label_0
    if(catalogs_creative_assets_attributes->custom_label_0) {
    if(cJSON_AddStringToObject(item, "custom_label_0", catalogs_creative_assets_attributes->custom_label_0) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->custom_label_1
    if(catalogs_creative_assets_attributes->custom_label_1) {
    if(cJSON_AddStringToObject(item, "custom_label_1", catalogs_creative_assets_attributes->custom_label_1) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->custom_label_2
    if(catalogs_creative_assets_attributes->custom_label_2) {
    if(cJSON_AddStringToObject(item, "custom_label_2", catalogs_creative_assets_attributes->custom_label_2) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->custom_label_3
    if(catalogs_creative_assets_attributes->custom_label_3) {
    if(cJSON_AddStringToObject(item, "custom_label_3", catalogs_creative_assets_attributes->custom_label_3) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->custom_label_4
    if(catalogs_creative_assets_attributes->custom_label_4) {
    if(cJSON_AddStringToObject(item, "custom_label_4", catalogs_creative_assets_attributes->custom_label_4) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->description
    if(catalogs_creative_assets_attributes->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_creative_assets_attributes->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->google_product_category
    if(catalogs_creative_assets_attributes->google_product_category) {
    if(cJSON_AddStringToObject(item, "google_product_category", catalogs_creative_assets_attributes->google_product_category) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->ios_deep_link
    if(catalogs_creative_assets_attributes->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", catalogs_creative_assets_attributes->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->link
    if(catalogs_creative_assets_attributes->link) {
    if(cJSON_AddStringToObject(item, "link", catalogs_creative_assets_attributes->link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->title
    if(catalogs_creative_assets_attributes->title) {
    if(cJSON_AddStringToObject(item, "title", catalogs_creative_assets_attributes->title) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->visibility
    if(catalogs_creative_assets_attributes->visibility) {
    if(cJSON_AddStringToObject(item, "visibility", catalogs_creative_assets_attributes->visibility) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->ai_disclosures
    if(catalogs_creative_assets_attributes->ai_disclosures) {
    cJSON *ai_disclosures = cJSON_AddArrayToObject(item, "ai_disclosures");
    if(ai_disclosures == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ai_disclosuresListEntry;
    if (catalogs_creative_assets_attributes->ai_disclosures) {
    list_ForEach(ai_disclosuresListEntry, catalogs_creative_assets_attributes->ai_disclosures) {
    cJSON *itemLocal = catalogs_ai_content_disclosure_convertToJSON(ai_disclosuresListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ai_disclosures, itemLocal);
    }
    }
    }


    // catalogs_creative_assets_attributes->image_link
    if(catalogs_creative_assets_attributes->image_link) {
    if(cJSON_AddStringToObject(item, "image_link", catalogs_creative_assets_attributes->image_link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_attributes->video_link
    if(catalogs_creative_assets_attributes->video_link) {
    if(cJSON_AddStringToObject(item, "video_link", catalogs_creative_assets_attributes->video_link) == NULL) {
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

catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes_parseFromJSON(cJSON *catalogs_creative_assets_attributesJSON){

    catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes_local_var = NULL;

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

    // define the local list for catalogs_creative_assets_attributes->ai_disclosures
    list_t *ai_disclosuresList = NULL;

    char *image_link_local_str = NULL;

    char *video_link_local_str = NULL;

    // catalogs_creative_assets_attributes->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "custom_label_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "custom_label_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "custom_label_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "custom_label_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "custom_label_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->google_product_category
    cJSON *google_product_category = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "google_product_category");
    if (cJSON_IsNull(google_product_category)) {
        google_product_category = NULL;
    }
    if (google_product_category) { 
    if(!cJSON_IsString(google_product_category) && !cJSON_IsNull(google_product_category))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "visibility");
    if (cJSON_IsNull(visibility)) {
        visibility = NULL;
    }
    if (visibility) { 
    if(!cJSON_IsString(visibility) && !cJSON_IsNull(visibility))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->ai_disclosures
    cJSON *ai_disclosures = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "ai_disclosures");
    if (cJSON_IsNull(ai_disclosures)) {
        ai_disclosures = NULL;
    }
    if (ai_disclosures) { 
    cJSON *ai_disclosures_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ai_disclosures)){
        goto end; //nonprimitive container
    }

    ai_disclosuresList = list_createList();

    cJSON_ArrayForEach(ai_disclosures_local_nonprimitive,ai_disclosures )
    {
        if(!cJSON_IsObject(ai_disclosures_local_nonprimitive)){
            goto end;
        }
        catalogs_ai_content_disclosure_t *ai_disclosuresItem = catalogs_ai_content_disclosure_parseFromJSON(ai_disclosures_local_nonprimitive);

        list_addElement(ai_disclosuresList, ai_disclosuresItem);
    }
    }

    // catalogs_creative_assets_attributes->image_link
    cJSON *image_link = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "image_link");
    if (cJSON_IsNull(image_link)) {
        image_link = NULL;
    }
    if (image_link) { 
    if(!cJSON_IsString(image_link) && !cJSON_IsNull(image_link))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_attributes->video_link
    cJSON *video_link = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_attributesJSON, "video_link");
    if (cJSON_IsNull(video_link)) {
        video_link = NULL;
    }
    if (video_link) { 
    if(!cJSON_IsString(video_link) && !cJSON_IsNull(video_link))
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
    if (image_link && !cJSON_IsNull(image_link)) image_link_local_str = strdup(image_link->valuestring);
    if (video_link && !cJSON_IsNull(video_link)) video_link_local_str = strdup(video_link->valuestring);

    catalogs_creative_assets_attributes_local_var = catalogs_creative_assets_attributes_create_internal (
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
        visibility_local_str,
        ai_disclosures ? ai_disclosuresList : NULL,
        image_link_local_str,
        video_link_local_str
        );

    if (!catalogs_creative_assets_attributes_local_var) {
        goto end;
    }

    return catalogs_creative_assets_attributes_local_var;
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
    if (ai_disclosuresList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ai_disclosuresList) {
            catalogs_ai_content_disclosure_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ai_disclosuresList);
        ai_disclosuresList = NULL;
    }
    if (image_link_local_str) {
        free(image_link_local_str);
        image_link_local_str = NULL;
    }
    if (video_link_local_str) {
        free(video_link_local_str);
        video_link_local_str = NULL;
    }
    return NULL;

}
