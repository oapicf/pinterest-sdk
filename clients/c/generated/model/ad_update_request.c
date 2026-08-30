#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_update_request.h"



static ad_update_request_t *ad_update_request_create_internal(
    char *id,
    char *pin_id,
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *ios_deep_link,
    int *is_carting,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    object_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    object_t *tracking_urls,
    char *view_tracking_url
    ) {
    ad_update_request_t *ad_update_request_local_var = malloc(sizeof(ad_update_request_t));
    if (!ad_update_request_local_var) {
        return NULL;
    }
    memset(ad_update_request_local_var, 0, sizeof(ad_update_request_t));
    ad_update_request_local_var->_library_owned = 1;
    ad_update_request_local_var->id = id;
    ad_update_request_local_var->pin_id = pin_id;
    ad_update_request_local_var->ad_group_id = ad_group_id;
    ad_update_request_local_var->android_deep_link = android_deep_link;
    ad_update_request_local_var->carousel_android_deep_links = carousel_android_deep_links;
    ad_update_request_local_var->carousel_destination_urls = carousel_destination_urls;
    ad_update_request_local_var->carousel_ios_deep_links = carousel_ios_deep_links;
    ad_update_request_local_var->click_tracking_url = click_tracking_url;
    ad_update_request_local_var->creative_type = creative_type;
    ad_update_request_local_var->customizable_cta_type = customizable_cta_type;
    ad_update_request_local_var->destination_url = destination_url;
    ad_update_request_local_var->disclosure_type = disclosure_type;
    ad_update_request_local_var->disclosure_url = disclosure_url;
    ad_update_request_local_var->grid_click_type = grid_click_type;
    ad_update_request_local_var->ios_deep_link = ios_deep_link;
    ad_update_request_local_var->is_carting = is_carting;
    ad_update_request_local_var->is_pin_deleted = is_pin_deleted;
    ad_update_request_local_var->is_removable = is_removable;
    ad_update_request_local_var->lead_form_id = lead_form_id;
    ad_update_request_local_var->name = name;
    ad_update_request_local_var->quiz_pin_data = quiz_pin_data;
    ad_update_request_local_var->status = status;
    ad_update_request_local_var->tracking_urls = tracking_urls;
    ad_update_request_local_var->view_tracking_url = view_tracking_url;
    return ad_update_request_local_var;
}

__attribute__((deprecated)) ad_update_request_t *ad_update_request_create(
    char *id,
    char *pin_id,
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *ios_deep_link,
    int *is_carting,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    object_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    object_t *tracking_urls,
    char *view_tracking_url
    ) {
    int *is_carting_copy = NULL;
    if (is_carting) {
        is_carting_copy = malloc(sizeof(int));
        if (is_carting_copy) *is_carting_copy = *is_carting;
    }
    int *is_pin_deleted_copy = NULL;
    if (is_pin_deleted) {
        is_pin_deleted_copy = malloc(sizeof(int));
        if (is_pin_deleted_copy) *is_pin_deleted_copy = *is_pin_deleted;
    }
    int *is_removable_copy = NULL;
    if (is_removable) {
        is_removable_copy = malloc(sizeof(int));
        if (is_removable_copy) *is_removable_copy = *is_removable;
    }
    ad_update_request_t *result = ad_update_request_create_internal (
        id,
        pin_id,
        ad_group_id,
        android_deep_link,
        carousel_android_deep_links,
        carousel_destination_urls,
        carousel_ios_deep_links,
        click_tracking_url,
        creative_type,
        customizable_cta_type,
        destination_url,
        disclosure_type,
        disclosure_url,
        grid_click_type,
        ios_deep_link,
        is_carting_copy,
        is_pin_deleted_copy,
        is_removable_copy,
        lead_form_id,
        name,
        quiz_pin_data,
        status,
        tracking_urls,
        view_tracking_url
        );
    if (!result) {
        free(is_carting_copy);
        free(is_pin_deleted_copy);
        free(is_removable_copy);
    }
    return result;
}

void ad_update_request_free(ad_update_request_t *ad_update_request) {
    if(NULL == ad_update_request){
        return ;
    }
    if(ad_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_update_request->id) {
        free(ad_update_request->id);
        ad_update_request->id = NULL;
    }
    if (ad_update_request->pin_id) {
        free(ad_update_request->pin_id);
        ad_update_request->pin_id = NULL;
    }
    if (ad_update_request->ad_group_id) {
        free(ad_update_request->ad_group_id);
        ad_update_request->ad_group_id = NULL;
    }
    if (ad_update_request->android_deep_link) {
        free(ad_update_request->android_deep_link);
        ad_update_request->android_deep_link = NULL;
    }
    if (ad_update_request->carousel_android_deep_links) {
        list_ForEach(listEntry, ad_update_request->carousel_android_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_update_request->carousel_android_deep_links);
        ad_update_request->carousel_android_deep_links = NULL;
    }
    if (ad_update_request->carousel_destination_urls) {
        list_ForEach(listEntry, ad_update_request->carousel_destination_urls) {
            free(listEntry->data);
        }
        list_freeList(ad_update_request->carousel_destination_urls);
        ad_update_request->carousel_destination_urls = NULL;
    }
    if (ad_update_request->carousel_ios_deep_links) {
        list_ForEach(listEntry, ad_update_request->carousel_ios_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_update_request->carousel_ios_deep_links);
        ad_update_request->carousel_ios_deep_links = NULL;
    }
    if (ad_update_request->click_tracking_url) {
        free(ad_update_request->click_tracking_url);
        ad_update_request->click_tracking_url = NULL;
    }
    if (ad_update_request->destination_url) {
        free(ad_update_request->destination_url);
        ad_update_request->destination_url = NULL;
    }
    if (ad_update_request->disclosure_url) {
        free(ad_update_request->disclosure_url);
        ad_update_request->disclosure_url = NULL;
    }
    if (ad_update_request->ios_deep_link) {
        free(ad_update_request->ios_deep_link);
        ad_update_request->ios_deep_link = NULL;
    }
    if (ad_update_request->is_carting) {
        free(ad_update_request->is_carting);
        ad_update_request->is_carting = NULL;
    }
    if (ad_update_request->is_pin_deleted) {
        free(ad_update_request->is_pin_deleted);
        ad_update_request->is_pin_deleted = NULL;
    }
    if (ad_update_request->is_removable) {
        free(ad_update_request->is_removable);
        ad_update_request->is_removable = NULL;
    }
    if (ad_update_request->lead_form_id) {
        free(ad_update_request->lead_form_id);
        ad_update_request->lead_form_id = NULL;
    }
    if (ad_update_request->name) {
        free(ad_update_request->name);
        ad_update_request->name = NULL;
    }
    if (ad_update_request->quiz_pin_data) {
        object_free(ad_update_request->quiz_pin_data);
        ad_update_request->quiz_pin_data = NULL;
    }
    if (ad_update_request->tracking_urls) {
        object_free(ad_update_request->tracking_urls);
        ad_update_request->tracking_urls = NULL;
    }
    if (ad_update_request->view_tracking_url) {
        free(ad_update_request->view_tracking_url);
        ad_update_request->view_tracking_url = NULL;
    }
    free(ad_update_request);
}

cJSON *ad_update_request_convertToJSON(ad_update_request_t *ad_update_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_update_request->id
    if (!ad_update_request->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad_update_request->id) == NULL) {
    goto fail; //String
    }


    // ad_update_request->pin_id
    if(ad_update_request->pin_id) {
    if(cJSON_AddStringToObject(item, "pin_id", ad_update_request->pin_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->ad_group_id
    if(ad_update_request->ad_group_id) {
    if(cJSON_AddStringToObject(item, "ad_group_id", ad_update_request->ad_group_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->android_deep_link
    if(ad_update_request->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", ad_update_request->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->carousel_android_deep_links
    if(ad_update_request->carousel_android_deep_links) {
    cJSON *carousel_android_deep_links = cJSON_AddArrayToObject(item, "carousel_android_deep_links");
    if(carousel_android_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_android_deep_linksListEntry;
    list_ForEach(carousel_android_deep_linksListEntry, ad_update_request->carousel_android_deep_links) {
    if(cJSON_AddStringToObject(carousel_android_deep_links, "", carousel_android_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_update_request->carousel_destination_urls
    if(ad_update_request->carousel_destination_urls) {
    cJSON *carousel_destination_urls = cJSON_AddArrayToObject(item, "carousel_destination_urls");
    if(carousel_destination_urls == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_destination_urlsListEntry;
    list_ForEach(carousel_destination_urlsListEntry, ad_update_request->carousel_destination_urls) {
    if(cJSON_AddStringToObject(carousel_destination_urls, "", carousel_destination_urlsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_update_request->carousel_ios_deep_links
    if(ad_update_request->carousel_ios_deep_links) {
    cJSON *carousel_ios_deep_links = cJSON_AddArrayToObject(item, "carousel_ios_deep_links");
    if(carousel_ios_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_ios_deep_linksListEntry;
    list_ForEach(carousel_ios_deep_linksListEntry, ad_update_request->carousel_ios_deep_links) {
    if(cJSON_AddStringToObject(carousel_ios_deep_links, "", carousel_ios_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_update_request->click_tracking_url
    if(ad_update_request->click_tracking_url) {
    if(cJSON_AddStringToObject(item, "click_tracking_url", ad_update_request->click_tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->creative_type
    if(ad_update_request->creative_type != pinterest_rest_api_creative_type__NULL) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(ad_update_request->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_update_request->customizable_cta_type
    if(ad_update_request->customizable_cta_type != pinterest_rest_api_customizable_cta_type__NULL) {
    cJSON *customizable_cta_type_local_JSON = customizable_cta_type_convertToJSON(ad_update_request->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_update_request->destination_url
    if(ad_update_request->destination_url) {
    if(cJSON_AddStringToObject(item, "destination_url", ad_update_request->destination_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->disclosure_type
    if(ad_update_request->disclosure_type != pinterest_rest_api_disclosure_type__NULL) {
    cJSON *disclosure_type_local_JSON = disclosure_type_convertToJSON(ad_update_request->disclosure_type);
    if(disclosure_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "disclosure_type", disclosure_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_update_request->disclosure_url
    if(ad_update_request->disclosure_url) {
    if(cJSON_AddStringToObject(item, "disclosure_url", ad_update_request->disclosure_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->grid_click_type
    if(ad_update_request->grid_click_type != pinterest_rest_api_grid_click_type__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(ad_update_request->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_update_request->ios_deep_link
    if(ad_update_request->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", ad_update_request->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->is_carting
    if(ad_update_request->is_carting) {
    if(cJSON_AddBoolToObject(item, "is_carting", *ad_update_request->is_carting) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_update_request->is_pin_deleted
    if(ad_update_request->is_pin_deleted) {
    if(cJSON_AddBoolToObject(item, "is_pin_deleted", *ad_update_request->is_pin_deleted) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_update_request->is_removable
    if(ad_update_request->is_removable) {
    if(cJSON_AddBoolToObject(item, "is_removable", *ad_update_request->is_removable) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_update_request->lead_form_id
    if(ad_update_request->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", ad_update_request->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->name
    if(ad_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", ad_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_update_request->quiz_pin_data
    if(ad_update_request->quiz_pin_data) {
    cJSON *quiz_pin_data_object = object_convertToJSON(ad_update_request->quiz_pin_data);
    if(quiz_pin_data_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quiz_pin_data", quiz_pin_data_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_update_request->status
    if(ad_update_request->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_update_request->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_update_request->tracking_urls
    if(ad_update_request->tracking_urls) {
    cJSON *tracking_urls_object = object_convertToJSON(ad_update_request->tracking_urls);
    if(tracking_urls_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_update_request->view_tracking_url
    if(ad_update_request->view_tracking_url) {
    if(cJSON_AddStringToObject(item, "view_tracking_url", ad_update_request->view_tracking_url) == NULL) {
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

ad_update_request_t *ad_update_request_parseFromJSON(cJSON *ad_update_requestJSON){

    ad_update_request_t *ad_update_request_local_var = NULL;

    char *id_local_str = NULL;

    char *pin_id_local_str = NULL;

    char *ad_group_id_local_str = NULL;

    char *android_deep_link_local_str = NULL;

    // define the local list for ad_update_request->carousel_android_deep_links
    list_t *carousel_android_deep_linksList = NULL;

    // define the local list for ad_update_request->carousel_destination_urls
    list_t *carousel_destination_urlsList = NULL;

    // define the local list for ad_update_request->carousel_ios_deep_links
    list_t *carousel_ios_deep_linksList = NULL;

    char *click_tracking_url_local_str = NULL;

    // define the local variable for ad_update_request->creative_type
    pinterest_rest_api_creative_type__e creative_type_local_nonprim = 0;

    // define the local variable for ad_update_request->customizable_cta_type
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type_local_nonprim = 0;

    char *destination_url_local_str = NULL;

    // define the local variable for ad_update_request->disclosure_type
    pinterest_rest_api_disclosure_type__e disclosure_type_local_nonprim = 0;

    char *disclosure_url_local_str = NULL;

    // define the local variable for ad_update_request->grid_click_type
    pinterest_rest_api_grid_click_type__e grid_click_type_local_nonprim = 0;

    char *ios_deep_link_local_str = NULL;

    // define the local variable for ad_update_request->is_carting
    int *is_carting_local_var = NULL;

    // define the local variable for ad_update_request->is_pin_deleted
    int *is_pin_deleted_local_var = NULL;

    // define the local variable for ad_update_request->is_removable
    int *is_removable_local_var = NULL;

    char *lead_form_id_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for ad_update_request->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    char *view_tracking_url_local_str = NULL;

    // ad_update_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // ad_update_request->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (pin_id) { 
    if(!cJSON_IsString(pin_id) && !cJSON_IsNull(pin_id))
    {
    goto end; //String
    }
    }

    // ad_update_request->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (ad_group_id) { 
    if(!cJSON_IsString(ad_group_id) && !cJSON_IsNull(ad_group_id))
    {
    goto end; //String
    }
    }

    // ad_update_request->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // ad_update_request->carousel_android_deep_links
    cJSON *carousel_android_deep_links = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "carousel_android_deep_links");
    if (cJSON_IsNull(carousel_android_deep_links)) {
        carousel_android_deep_links = NULL;
    }
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

    // ad_update_request->carousel_destination_urls
    cJSON *carousel_destination_urls = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "carousel_destination_urls");
    if (cJSON_IsNull(carousel_destination_urls)) {
        carousel_destination_urls = NULL;
    }
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

    // ad_update_request->carousel_ios_deep_links
    cJSON *carousel_ios_deep_links = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "carousel_ios_deep_links");
    if (cJSON_IsNull(carousel_ios_deep_links)) {
        carousel_ios_deep_links = NULL;
    }
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

    // ad_update_request->click_tracking_url
    cJSON *click_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "click_tracking_url");
    if (cJSON_IsNull(click_tracking_url)) {
        click_tracking_url = NULL;
    }
    if (click_tracking_url) { 
    if(!cJSON_IsString(click_tracking_url) && !cJSON_IsNull(click_tracking_url))
    {
    goto end; //String
    }
    }

    // ad_update_request->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // ad_update_request->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // ad_update_request->destination_url
    cJSON *destination_url = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "destination_url");
    if (cJSON_IsNull(destination_url)) {
        destination_url = NULL;
    }
    if (destination_url) { 
    if(!cJSON_IsString(destination_url) && !cJSON_IsNull(destination_url))
    {
    goto end; //String
    }
    }

    // ad_update_request->disclosure_type
    cJSON *disclosure_type = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "disclosure_type");
    if (cJSON_IsNull(disclosure_type)) {
        disclosure_type = NULL;
    }
    if (disclosure_type) { 
    disclosure_type_local_nonprim = disclosure_type_parseFromJSON(disclosure_type); //custom
    }

    // ad_update_request->disclosure_url
    cJSON *disclosure_url = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "disclosure_url");
    if (cJSON_IsNull(disclosure_url)) {
        disclosure_url = NULL;
    }
    if (disclosure_url) { 
    if(!cJSON_IsString(disclosure_url) && !cJSON_IsNull(disclosure_url))
    {
    goto end; //String
    }
    }

    // ad_update_request->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "grid_click_type");
    if (cJSON_IsNull(grid_click_type)) {
        grid_click_type = NULL;
    }
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }

    // ad_update_request->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // ad_update_request->is_carting
    cJSON *is_carting = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "is_carting");
    if (cJSON_IsNull(is_carting)) {
        is_carting = NULL;
    }
    if (is_carting) { 
    if(!cJSON_IsBool(is_carting))
    {
    goto end; //Bool
    }
    is_carting_local_var = malloc(sizeof(int));
    if(!is_carting_local_var)
    {
        goto end;
    }
    *is_carting_local_var = is_carting->valueint;
    }

    // ad_update_request->is_pin_deleted
    cJSON *is_pin_deleted = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "is_pin_deleted");
    if (cJSON_IsNull(is_pin_deleted)) {
        is_pin_deleted = NULL;
    }
    if (is_pin_deleted) { 
    if(!cJSON_IsBool(is_pin_deleted))
    {
    goto end; //Bool
    }
    is_pin_deleted_local_var = malloc(sizeof(int));
    if(!is_pin_deleted_local_var)
    {
        goto end;
    }
    *is_pin_deleted_local_var = is_pin_deleted->valueint;
    }

    // ad_update_request->is_removable
    cJSON *is_removable = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "is_removable");
    if (cJSON_IsNull(is_removable)) {
        is_removable = NULL;
    }
    if (is_removable) { 
    if(!cJSON_IsBool(is_removable))
    {
    goto end; //Bool
    }
    is_removable_local_var = malloc(sizeof(int));
    if(!is_removable_local_var)
    {
        goto end;
    }
    *is_removable_local_var = is_removable->valueint;
    }

    // ad_update_request->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // ad_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_update_request->quiz_pin_data
    cJSON *quiz_pin_data = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "quiz_pin_data");
    if (cJSON_IsNull(quiz_pin_data)) {
        quiz_pin_data = NULL;
    }
    object_t *quiz_pin_data_local_object = NULL;
    if (quiz_pin_data) { 
    quiz_pin_data_local_object = object_parseFromJSON(quiz_pin_data); //object
    }

    // ad_update_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_update_request->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    object_t *tracking_urls_local_object = NULL;
    if (tracking_urls) { 
    tracking_urls_local_object = object_parseFromJSON(tracking_urls); //object
    }

    // ad_update_request->view_tracking_url
    cJSON *view_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_update_requestJSON, "view_tracking_url");
    if (cJSON_IsNull(view_tracking_url)) {
        view_tracking_url = NULL;
    }
    if (view_tracking_url) { 
    if(!cJSON_IsString(view_tracking_url) && !cJSON_IsNull(view_tracking_url))
    {
    goto end; //String
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);
    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (android_deep_link && !cJSON_IsNull(android_deep_link)) android_deep_link_local_str = strdup(android_deep_link->valuestring);
    if (click_tracking_url && !cJSON_IsNull(click_tracking_url)) click_tracking_url_local_str = strdup(click_tracking_url->valuestring);
    if (destination_url && !cJSON_IsNull(destination_url)) destination_url_local_str = strdup(destination_url->valuestring);
    if (disclosure_url && !cJSON_IsNull(disclosure_url)) disclosure_url_local_str = strdup(disclosure_url->valuestring);
    if (ios_deep_link && !cJSON_IsNull(ios_deep_link)) ios_deep_link_local_str = strdup(ios_deep_link->valuestring);
    if (lead_form_id && !cJSON_IsNull(lead_form_id)) lead_form_id_local_str = strdup(lead_form_id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (view_tracking_url && !cJSON_IsNull(view_tracking_url)) view_tracking_url_local_str = strdup(view_tracking_url->valuestring);

    ad_update_request_local_var = ad_update_request_create_internal (
        id_local_str,
        pin_id_local_str,
        ad_group_id_local_str,
        android_deep_link_local_str,
        carousel_android_deep_links ? carousel_android_deep_linksList : NULL,
        carousel_destination_urls ? carousel_destination_urlsList : NULL,
        carousel_ios_deep_links ? carousel_ios_deep_linksList : NULL,
        click_tracking_url_local_str,
        creative_type ? creative_type_local_nonprim : 0,
        customizable_cta_type ? customizable_cta_type_local_nonprim : 0,
        destination_url_local_str,
        disclosure_type ? disclosure_type_local_nonprim : 0,
        disclosure_url_local_str,
        grid_click_type ? grid_click_type_local_nonprim : 0,
        ios_deep_link_local_str,
        is_carting_local_var,
        is_pin_deleted_local_var,
        is_removable_local_var,
        lead_form_id_local_str,
        name_local_str,
        quiz_pin_data ? quiz_pin_data_local_object : NULL,
        status ? status_local_nonprim : 0,
        tracking_urls ? tracking_urls_local_object : NULL,
        view_tracking_url_local_str
        );

    if (!ad_update_request_local_var) {
        goto end;
    }

    return ad_update_request_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    if (android_deep_link_local_str) {
        free(android_deep_link_local_str);
        android_deep_link_local_str = NULL;
    }
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
    if (click_tracking_url_local_str) {
        free(click_tracking_url_local_str);
        click_tracking_url_local_str = NULL;
    }
    if (creative_type_local_nonprim) {
        creative_type_local_nonprim = 0;
    }
    if (customizable_cta_type_local_nonprim) {
        customizable_cta_type_local_nonprim = 0;
    }
    if (destination_url_local_str) {
        free(destination_url_local_str);
        destination_url_local_str = NULL;
    }
    if (disclosure_type_local_nonprim) {
        disclosure_type_local_nonprim = 0;
    }
    if (disclosure_url_local_str) {
        free(disclosure_url_local_str);
        disclosure_url_local_str = NULL;
    }
    if (grid_click_type_local_nonprim) {
        grid_click_type_local_nonprim = 0;
    }
    if (ios_deep_link_local_str) {
        free(ios_deep_link_local_str);
        ios_deep_link_local_str = NULL;
    }
    if (is_carting_local_var) {
        free(is_carting_local_var);
        is_carting_local_var = NULL;
    }
    if (is_pin_deleted_local_var) {
        free(is_pin_deleted_local_var);
        is_pin_deleted_local_var = NULL;
    }
    if (is_removable_local_var) {
        free(is_removable_local_var);
        is_removable_local_var = NULL;
    }
    if (lead_form_id_local_str) {
        free(lead_form_id_local_str);
        lead_form_id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (view_tracking_url_local_str) {
        free(view_tracking_url_local_str);
        view_tracking_url_local_str = NULL;
    }
    return NULL;

}
