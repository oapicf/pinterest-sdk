#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_common.h"


char* ad_common_creative_type_ToString(pinterest_rest_api_ad_common__e creative_type) {
    char* creative_typeArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA", "SHOWCASE", "QUIZ" };
    return creative_typeArray[creative_type];
}

pinterest_rest_api_ad_common__e ad_common_creative_type_FromString(char* creative_type){
    int stringToReturn = 0;
    char *creative_typeArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA", "SHOWCASE", "QUIZ" };
    size_t sizeofArray = sizeof(creative_typeArray) / sizeof(creative_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(creative_type, creative_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ad_common_status_ToString(pinterest_rest_api_ad_common__e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return statusArray[status];
}

pinterest_rest_api_ad_common__e ad_common_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ad_common_grid_click_type_ToString(pinterest_rest_api_ad_common__e grid_click_type) {
    char* grid_click_typeArray[] =  { "NULL", "CLOSEUP", "DIRECT_TO_DESTINATION" };
    return grid_click_typeArray[grid_click_type];
}

pinterest_rest_api_ad_common__e ad_common_grid_click_type_FromString(char* grid_click_type){
    int stringToReturn = 0;
    char *grid_click_typeArray[] =  { "NULL", "CLOSEUP", "DIRECT_TO_DESTINATION" };
    size_t sizeofArray = sizeof(grid_click_typeArray) / sizeof(grid_click_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(grid_click_type, grid_click_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ad_common_customizable_cta_type_ToString(pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e customizable_cta_type) {
    char* customizable_cta_typeArray[] =  { "NULL", "GET_OFFER", "LEARN_MORE", "ORDER_NOW", "SHOP_NOW", "SIGN_UP", "SUBSCRIBE", "BUY_NOW", "CONTACT_US", "GET_QUOTE", "VISIT_WEBSITE", "APPLY_NOW", "BOOK_NOW", "REQUEST_DEMO", "REGISTER_NOW", "FIND_A_DEALER", "ADD_TO_CART", "WATCH_NOW", "READ_MORE", "" };
    return customizable_cta_typeArray[customizable_cta_type];
}

pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e ad_common_customizable_cta_type_FromString(char* customizable_cta_type){
    int stringToReturn = 0;
    char *customizable_cta_typeArray[] =  { "NULL", "GET_OFFER", "LEARN_MORE", "ORDER_NOW", "SHOP_NOW", "SIGN_UP", "SUBSCRIBE", "BUY_NOW", "CONTACT_US", "GET_QUOTE", "VISIT_WEBSITE", "APPLY_NOW", "BOOK_NOW", "REQUEST_DEMO", "REGISTER_NOW", "FIND_A_DEALER", "ADD_TO_CART", "WATCH_NOW", "READ_MORE", "" };
    size_t sizeofArray = sizeof(customizable_cta_typeArray) / sizeof(customizable_cta_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(customizable_cta_type, customizable_cta_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

ad_common_t *ad_common_create(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    creative_type_t *creative_type,
    char *destination_url,
    char *ios_deep_link,
    int is_pin_deleted,
    int is_removable,
    char *name,
    entity_status_t *status,
    ad_common_tracking_urls_t *tracking_urls,
    char *view_tracking_url,
    char *lead_form_id,
    grid_click_type_t *grid_click_type,
    pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e customizable_cta_type,
    ad_common_quiz_pin_data_t *quiz_pin_data
    ) {
    ad_common_t *ad_common_local_var = malloc(sizeof(ad_common_t));
    if (!ad_common_local_var) {
        return NULL;
    }
    ad_common_local_var->ad_group_id = ad_group_id;
    ad_common_local_var->android_deep_link = android_deep_link;
    ad_common_local_var->carousel_android_deep_links = carousel_android_deep_links;
    ad_common_local_var->carousel_destination_urls = carousel_destination_urls;
    ad_common_local_var->carousel_ios_deep_links = carousel_ios_deep_links;
    ad_common_local_var->click_tracking_url = click_tracking_url;
    ad_common_local_var->creative_type = creative_type;
    ad_common_local_var->destination_url = destination_url;
    ad_common_local_var->ios_deep_link = ios_deep_link;
    ad_common_local_var->is_pin_deleted = is_pin_deleted;
    ad_common_local_var->is_removable = is_removable;
    ad_common_local_var->name = name;
    ad_common_local_var->status = status;
    ad_common_local_var->tracking_urls = tracking_urls;
    ad_common_local_var->view_tracking_url = view_tracking_url;
    ad_common_local_var->lead_form_id = lead_form_id;
    ad_common_local_var->grid_click_type = grid_click_type;
    ad_common_local_var->customizable_cta_type = customizable_cta_type;
    ad_common_local_var->quiz_pin_data = quiz_pin_data;

    return ad_common_local_var;
}


void ad_common_free(ad_common_t *ad_common) {
    if(NULL == ad_common){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_common->ad_group_id) {
        free(ad_common->ad_group_id);
        ad_common->ad_group_id = NULL;
    }
    if (ad_common->android_deep_link) {
        free(ad_common->android_deep_link);
        ad_common->android_deep_link = NULL;
    }
    if (ad_common->carousel_android_deep_links) {
        list_ForEach(listEntry, ad_common->carousel_android_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_common->carousel_android_deep_links);
        ad_common->carousel_android_deep_links = NULL;
    }
    if (ad_common->carousel_destination_urls) {
        list_ForEach(listEntry, ad_common->carousel_destination_urls) {
            free(listEntry->data);
        }
        list_freeList(ad_common->carousel_destination_urls);
        ad_common->carousel_destination_urls = NULL;
    }
    if (ad_common->carousel_ios_deep_links) {
        list_ForEach(listEntry, ad_common->carousel_ios_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_common->carousel_ios_deep_links);
        ad_common->carousel_ios_deep_links = NULL;
    }
    if (ad_common->click_tracking_url) {
        free(ad_common->click_tracking_url);
        ad_common->click_tracking_url = NULL;
    }
    if (ad_common->creative_type) {
        creative_type_free(ad_common->creative_type);
        ad_common->creative_type = NULL;
    }
    if (ad_common->destination_url) {
        free(ad_common->destination_url);
        ad_common->destination_url = NULL;
    }
    if (ad_common->ios_deep_link) {
        free(ad_common->ios_deep_link);
        ad_common->ios_deep_link = NULL;
    }
    if (ad_common->name) {
        free(ad_common->name);
        ad_common->name = NULL;
    }
    if (ad_common->status) {
        entity_status_free(ad_common->status);
        ad_common->status = NULL;
    }
    if (ad_common->tracking_urls) {
        ad_common_tracking_urls_free(ad_common->tracking_urls);
        ad_common->tracking_urls = NULL;
    }
    if (ad_common->view_tracking_url) {
        free(ad_common->view_tracking_url);
        ad_common->view_tracking_url = NULL;
    }
    if (ad_common->lead_form_id) {
        free(ad_common->lead_form_id);
        ad_common->lead_form_id = NULL;
    }
    if (ad_common->grid_click_type) {
        grid_click_type_free(ad_common->grid_click_type);
        ad_common->grid_click_type = NULL;
    }
    if (ad_common->quiz_pin_data) {
        ad_common_quiz_pin_data_free(ad_common->quiz_pin_data);
        ad_common->quiz_pin_data = NULL;
    }
    free(ad_common);
}

cJSON *ad_common_convertToJSON(ad_common_t *ad_common) {
    cJSON *item = cJSON_CreateObject();

    // ad_common->ad_group_id
    if(ad_common->ad_group_id) {
    if(cJSON_AddStringToObject(item, "ad_group_id", ad_common->ad_group_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->android_deep_link
    if(ad_common->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", ad_common->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->carousel_android_deep_links
    if(ad_common->carousel_android_deep_links) {
    cJSON *carousel_android_deep_links = cJSON_AddArrayToObject(item, "carousel_android_deep_links");
    if(carousel_android_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_android_deep_linksListEntry;
    list_ForEach(carousel_android_deep_linksListEntry, ad_common->carousel_android_deep_links) {
    if(cJSON_AddStringToObject(carousel_android_deep_links, "", (char*)carousel_android_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_common->carousel_destination_urls
    if(ad_common->carousel_destination_urls) {
    cJSON *carousel_destination_urls = cJSON_AddArrayToObject(item, "carousel_destination_urls");
    if(carousel_destination_urls == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_destination_urlsListEntry;
    list_ForEach(carousel_destination_urlsListEntry, ad_common->carousel_destination_urls) {
    if(cJSON_AddStringToObject(carousel_destination_urls, "", (char*)carousel_destination_urlsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_common->carousel_ios_deep_links
    if(ad_common->carousel_ios_deep_links) {
    cJSON *carousel_ios_deep_links = cJSON_AddArrayToObject(item, "carousel_ios_deep_links");
    if(carousel_ios_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_ios_deep_linksListEntry;
    list_ForEach(carousel_ios_deep_linksListEntry, ad_common->carousel_ios_deep_links) {
    if(cJSON_AddStringToObject(carousel_ios_deep_links, "", (char*)carousel_ios_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_common->click_tracking_url
    if(ad_common->click_tracking_url) {
    if(cJSON_AddStringToObject(item, "click_tracking_url", ad_common->click_tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->creative_type
    if(ad_common->creative_type != pinterest_rest_api_ad_common__NULL) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(ad_common->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_common->destination_url
    if(ad_common->destination_url) {
    if(cJSON_AddStringToObject(item, "destination_url", ad_common->destination_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->ios_deep_link
    if(ad_common->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", ad_common->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->is_pin_deleted
    if(ad_common->is_pin_deleted) {
    if(cJSON_AddBoolToObject(item, "is_pin_deleted", ad_common->is_pin_deleted) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_common->is_removable
    if(ad_common->is_removable) {
    if(cJSON_AddBoolToObject(item, "is_removable", ad_common->is_removable) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_common->name
    if(ad_common->name) {
    if(cJSON_AddStringToObject(item, "name", ad_common->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->status
    if(ad_common->status != pinterest_rest_api_ad_common__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_common->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_common->tracking_urls
    if(ad_common->tracking_urls) {
    cJSON *tracking_urls_local_JSON = ad_common_tracking_urls_convertToJSON(ad_common->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_common->view_tracking_url
    if(ad_common->view_tracking_url) {
    if(cJSON_AddStringToObject(item, "view_tracking_url", ad_common->view_tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->lead_form_id
    if(ad_common->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", ad_common->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_common->grid_click_type
    if(ad_common->grid_click_type != pinterest_rest_api_ad_common__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(ad_common->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_common->customizable_cta_type
    if(ad_common->customizable_cta_type != pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_NULL) {
    if(cJSON_AddStringToObject(item, "customizable_cta_type", customizable_cta_typead_common_ToString(ad_common->customizable_cta_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_common->quiz_pin_data
    if(ad_common->quiz_pin_data) {
    cJSON *quiz_pin_data_local_JSON = ad_common_quiz_pin_data_convertToJSON(ad_common->quiz_pin_data);
    if(quiz_pin_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quiz_pin_data", quiz_pin_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_common_t *ad_common_parseFromJSON(cJSON *ad_commonJSON){

    ad_common_t *ad_common_local_var = NULL;

    // define the local list for ad_common->carousel_android_deep_links
    list_t *carousel_android_deep_linksList = NULL;

    // define the local list for ad_common->carousel_destination_urls
    list_t *carousel_destination_urlsList = NULL;

    // define the local list for ad_common->carousel_ios_deep_links
    list_t *carousel_ios_deep_linksList = NULL;

    // define the local variable for ad_common->creative_type
    creative_type_t *creative_type_local_nonprim = NULL;

    // define the local variable for ad_common->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for ad_common->tracking_urls
    ad_common_tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for ad_common->grid_click_type
    grid_click_type_t *grid_click_type_local_nonprim = NULL;

    // define the local variable for ad_common->quiz_pin_data
    ad_common_quiz_pin_data_t *quiz_pin_data_local_nonprim = NULL;

    // ad_common->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "ad_group_id");
    if (ad_group_id) { 
    if(!cJSON_IsString(ad_group_id) && !cJSON_IsNull(ad_group_id))
    {
    goto end; //String
    }
    }

    // ad_common->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "android_deep_link");
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // ad_common->carousel_android_deep_links
    cJSON *carousel_android_deep_links = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "carousel_android_deep_links");
    if (carousel_android_deep_links) { 
    cJSON *carousel_android_deep_links_local = NULL;
    if(!cJSON_IsArray(carousel_android_deep_links)) {
        goto end;//primitive container
    }
    carousel_android_deep_linksList = list_createList();

    cJSON_ArrayForEach(carousel_android_deep_links_local, carousel_android_deep_links)
    {
        if(!cJSON_IsString(carousel_android_deep_links_local))
        {
            goto end;
        }
        list_addElement(carousel_android_deep_linksList , strdup(carousel_android_deep_links_local->valuestring));
    }
    }

    // ad_common->carousel_destination_urls
    cJSON *carousel_destination_urls = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "carousel_destination_urls");
    if (carousel_destination_urls) { 
    cJSON *carousel_destination_urls_local = NULL;
    if(!cJSON_IsArray(carousel_destination_urls)) {
        goto end;//primitive container
    }
    carousel_destination_urlsList = list_createList();

    cJSON_ArrayForEach(carousel_destination_urls_local, carousel_destination_urls)
    {
        if(!cJSON_IsString(carousel_destination_urls_local))
        {
            goto end;
        }
        list_addElement(carousel_destination_urlsList , strdup(carousel_destination_urls_local->valuestring));
    }
    }

    // ad_common->carousel_ios_deep_links
    cJSON *carousel_ios_deep_links = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "carousel_ios_deep_links");
    if (carousel_ios_deep_links) { 
    cJSON *carousel_ios_deep_links_local = NULL;
    if(!cJSON_IsArray(carousel_ios_deep_links)) {
        goto end;//primitive container
    }
    carousel_ios_deep_linksList = list_createList();

    cJSON_ArrayForEach(carousel_ios_deep_links_local, carousel_ios_deep_links)
    {
        if(!cJSON_IsString(carousel_ios_deep_links_local))
        {
            goto end;
        }
        list_addElement(carousel_ios_deep_linksList , strdup(carousel_ios_deep_links_local->valuestring));
    }
    }

    // ad_common->click_tracking_url
    cJSON *click_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "click_tracking_url");
    if (click_tracking_url) { 
    if(!cJSON_IsString(click_tracking_url) && !cJSON_IsNull(click_tracking_url))
    {
    goto end; //String
    }
    }

    // ad_common->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "creative_type");
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // ad_common->destination_url
    cJSON *destination_url = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "destination_url");
    if (destination_url) { 
    if(!cJSON_IsString(destination_url) && !cJSON_IsNull(destination_url))
    {
    goto end; //String
    }
    }

    // ad_common->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "ios_deep_link");
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // ad_common->is_pin_deleted
    cJSON *is_pin_deleted = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "is_pin_deleted");
    if (is_pin_deleted) { 
    if(!cJSON_IsBool(is_pin_deleted))
    {
    goto end; //Bool
    }
    }

    // ad_common->is_removable
    cJSON *is_removable = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "is_removable");
    if (is_removable) { 
    if(!cJSON_IsBool(is_removable))
    {
    goto end; //Bool
    }
    }

    // ad_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_common->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "status");
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_common->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "tracking_urls");
    if (tracking_urls) { 
    tracking_urls_local_nonprim = ad_common_tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // ad_common->view_tracking_url
    cJSON *view_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "view_tracking_url");
    if (view_tracking_url) { 
    if(!cJSON_IsString(view_tracking_url) && !cJSON_IsNull(view_tracking_url))
    {
    goto end; //String
    }
    }

    // ad_common->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "lead_form_id");
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // ad_common->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "grid_click_type");
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }

    // ad_common->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "customizable_cta_type");
    pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e customizable_cta_typeVariable;
    if (customizable_cta_type) { 
    if(!cJSON_IsString(customizable_cta_type))
    {
    goto end; //Enum
    }
    customizable_cta_typeVariable = ad_common_customizable_cta_type_FromString(customizable_cta_type->valuestring);
    }

    // ad_common->quiz_pin_data
    cJSON *quiz_pin_data = cJSON_GetObjectItemCaseSensitive(ad_commonJSON, "quiz_pin_data");
    if (quiz_pin_data) { 
    quiz_pin_data_local_nonprim = ad_common_quiz_pin_data_parseFromJSON(quiz_pin_data); //nonprimitive
    }


    ad_common_local_var = ad_common_create (
        ad_group_id && !cJSON_IsNull(ad_group_id) ? strdup(ad_group_id->valuestring) : NULL,
        android_deep_link && !cJSON_IsNull(android_deep_link) ? strdup(android_deep_link->valuestring) : NULL,
        carousel_android_deep_links ? carousel_android_deep_linksList : NULL,
        carousel_destination_urls ? carousel_destination_urlsList : NULL,
        carousel_ios_deep_links ? carousel_ios_deep_linksList : NULL,
        click_tracking_url && !cJSON_IsNull(click_tracking_url) ? strdup(click_tracking_url->valuestring) : NULL,
        creative_type ? creative_type_local_nonprim : NULL,
        destination_url && !cJSON_IsNull(destination_url) ? strdup(destination_url->valuestring) : NULL,
        ios_deep_link && !cJSON_IsNull(ios_deep_link) ? strdup(ios_deep_link->valuestring) : NULL,
        is_pin_deleted ? is_pin_deleted->valueint : 0,
        is_removable ? is_removable->valueint : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        view_tracking_url && !cJSON_IsNull(view_tracking_url) ? strdup(view_tracking_url->valuestring) : NULL,
        lead_form_id && !cJSON_IsNull(lead_form_id) ? strdup(lead_form_id->valuestring) : NULL,
        grid_click_type ? grid_click_type_local_nonprim : NULL,
        customizable_cta_type ? customizable_cta_typeVariable : pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_NULL,
        quiz_pin_data ? quiz_pin_data_local_nonprim : NULL
        );

    return ad_common_local_var;
end:
    if (carousel_android_deep_linksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_android_deep_linksList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_android_deep_linksList);
        carousel_android_deep_linksList = NULL;
    }
    if (carousel_destination_urlsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_destination_urlsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_destination_urlsList);
        carousel_destination_urlsList = NULL;
    }
    if (carousel_ios_deep_linksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_ios_deep_linksList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_ios_deep_linksList);
        carousel_ios_deep_linksList = NULL;
    }
    if (creative_type_local_nonprim) {
        creative_type_free(creative_type_local_nonprim);
        creative_type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        ad_common_tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (grid_click_type_local_nonprim) {
        grid_click_type_free(grid_click_type_local_nonprim);
        grid_click_type_local_nonprim = NULL;
    }
    if (quiz_pin_data_local_nonprim) {
        ad_common_quiz_pin_data_free(quiz_pin_data_local_nonprim);
        quiz_pin_data_local_nonprim = NULL;
    }
    return NULL;

}
