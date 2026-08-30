#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_create.h"



static ad_create_t *ad_create_create_internal(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    char *collection_items_destination_url_template,
    ad_collections_header_type_t *collections_header_type,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *ios_deep_link,
    int *is_carting,
    int *is_collage_accepted_terms,
    int *is_collage_single_destination,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    char *pin_id,
    quiz_pin_data_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url
    ) {
    ad_create_t *ad_create_local_var = malloc(sizeof(ad_create_t));
    if (!ad_create_local_var) {
        return NULL;
    }
    memset(ad_create_local_var, 0, sizeof(ad_create_t));
    ad_create_local_var->_library_owned = 1;
    ad_create_local_var->ad_group_id = ad_group_id;
    ad_create_local_var->android_deep_link = android_deep_link;
    ad_create_local_var->carousel_android_deep_links = carousel_android_deep_links;
    ad_create_local_var->carousel_destination_urls = carousel_destination_urls;
    ad_create_local_var->carousel_ios_deep_links = carousel_ios_deep_links;
    ad_create_local_var->click_tracking_url = click_tracking_url;
    ad_create_local_var->collection_items_destination_url_template = collection_items_destination_url_template;
    ad_create_local_var->collections_header_type = collections_header_type;
    ad_create_local_var->creative_type = creative_type;
    ad_create_local_var->customizable_cta_type = customizable_cta_type;
    ad_create_local_var->destination_url = destination_url;
    ad_create_local_var->disclosure_type = disclosure_type;
    ad_create_local_var->disclosure_url = disclosure_url;
    ad_create_local_var->grid_click_type = grid_click_type;
    ad_create_local_var->ios_deep_link = ios_deep_link;
    ad_create_local_var->is_carting = is_carting;
    ad_create_local_var->is_collage_accepted_terms = is_collage_accepted_terms;
    ad_create_local_var->is_collage_single_destination = is_collage_single_destination;
    ad_create_local_var->is_pin_deleted = is_pin_deleted;
    ad_create_local_var->is_removable = is_removable;
    ad_create_local_var->lead_form_id = lead_form_id;
    ad_create_local_var->name = name;
    ad_create_local_var->pin_id = pin_id;
    ad_create_local_var->quiz_pin_data = quiz_pin_data;
    ad_create_local_var->status = status;
    ad_create_local_var->tracking_urls = tracking_urls;
    ad_create_local_var->view_tracking_url = view_tracking_url;
    return ad_create_local_var;
}

__attribute__((deprecated)) ad_create_t *ad_create_create(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    char *collection_items_destination_url_template,
    ad_collections_header_type_t *collections_header_type,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *ios_deep_link,
    int *is_carting,
    int *is_collage_accepted_terms,
    int *is_collage_single_destination,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    char *pin_id,
    quiz_pin_data_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url
    ) {
    int *is_carting_copy = NULL;
    if (is_carting) {
        is_carting_copy = malloc(sizeof(int));
        if (is_carting_copy) *is_carting_copy = *is_carting;
    }
    int *is_collage_accepted_terms_copy = NULL;
    if (is_collage_accepted_terms) {
        is_collage_accepted_terms_copy = malloc(sizeof(int));
        if (is_collage_accepted_terms_copy) *is_collage_accepted_terms_copy = *is_collage_accepted_terms;
    }
    int *is_collage_single_destination_copy = NULL;
    if (is_collage_single_destination) {
        is_collage_single_destination_copy = malloc(sizeof(int));
        if (is_collage_single_destination_copy) *is_collage_single_destination_copy = *is_collage_single_destination;
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
    ad_create_t *result = ad_create_create_internal (
        ad_group_id,
        android_deep_link,
        carousel_android_deep_links,
        carousel_destination_urls,
        carousel_ios_deep_links,
        click_tracking_url,
        collection_items_destination_url_template,
        collections_header_type,
        creative_type,
        customizable_cta_type,
        destination_url,
        disclosure_type,
        disclosure_url,
        grid_click_type,
        ios_deep_link,
        is_carting_copy,
        is_collage_accepted_terms_copy,
        is_collage_single_destination_copy,
        is_pin_deleted_copy,
        is_removable_copy,
        lead_form_id,
        name,
        pin_id,
        quiz_pin_data,
        status,
        tracking_urls,
        view_tracking_url
        );
    if (!result) {
        free(is_carting_copy);
        free(is_collage_accepted_terms_copy);
        free(is_collage_single_destination_copy);
        free(is_pin_deleted_copy);
        free(is_removable_copy);
    }
    return result;
}

void ad_create_free(ad_create_t *ad_create) {
    if(NULL == ad_create){
        return ;
    }
    if(ad_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_create->ad_group_id) {
        free(ad_create->ad_group_id);
        ad_create->ad_group_id = NULL;
    }
    if (ad_create->android_deep_link) {
        free(ad_create->android_deep_link);
        ad_create->android_deep_link = NULL;
    }
    if (ad_create->carousel_android_deep_links) {
        list_ForEach(listEntry, ad_create->carousel_android_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_create->carousel_android_deep_links);
        ad_create->carousel_android_deep_links = NULL;
    }
    if (ad_create->carousel_destination_urls) {
        list_ForEach(listEntry, ad_create->carousel_destination_urls) {
            free(listEntry->data);
        }
        list_freeList(ad_create->carousel_destination_urls);
        ad_create->carousel_destination_urls = NULL;
    }
    if (ad_create->carousel_ios_deep_links) {
        list_ForEach(listEntry, ad_create->carousel_ios_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_create->carousel_ios_deep_links);
        ad_create->carousel_ios_deep_links = NULL;
    }
    if (ad_create->click_tracking_url) {
        free(ad_create->click_tracking_url);
        ad_create->click_tracking_url = NULL;
    }
    if (ad_create->collection_items_destination_url_template) {
        free(ad_create->collection_items_destination_url_template);
        ad_create->collection_items_destination_url_template = NULL;
    }
    if (ad_create->collections_header_type) {
        ad_collections_header_type_free(ad_create->collections_header_type);
        ad_create->collections_header_type = NULL;
    }
    if (ad_create->destination_url) {
        free(ad_create->destination_url);
        ad_create->destination_url = NULL;
    }
    if (ad_create->disclosure_url) {
        free(ad_create->disclosure_url);
        ad_create->disclosure_url = NULL;
    }
    if (ad_create->ios_deep_link) {
        free(ad_create->ios_deep_link);
        ad_create->ios_deep_link = NULL;
    }
    if (ad_create->is_carting) {
        free(ad_create->is_carting);
        ad_create->is_carting = NULL;
    }
    if (ad_create->is_collage_accepted_terms) {
        free(ad_create->is_collage_accepted_terms);
        ad_create->is_collage_accepted_terms = NULL;
    }
    if (ad_create->is_collage_single_destination) {
        free(ad_create->is_collage_single_destination);
        ad_create->is_collage_single_destination = NULL;
    }
    if (ad_create->is_pin_deleted) {
        free(ad_create->is_pin_deleted);
        ad_create->is_pin_deleted = NULL;
    }
    if (ad_create->is_removable) {
        free(ad_create->is_removable);
        ad_create->is_removable = NULL;
    }
    if (ad_create->lead_form_id) {
        free(ad_create->lead_form_id);
        ad_create->lead_form_id = NULL;
    }
    if (ad_create->name) {
        free(ad_create->name);
        ad_create->name = NULL;
    }
    if (ad_create->pin_id) {
        free(ad_create->pin_id);
        ad_create->pin_id = NULL;
    }
    if (ad_create->quiz_pin_data) {
        quiz_pin_data_free(ad_create->quiz_pin_data);
        ad_create->quiz_pin_data = NULL;
    }
    if (ad_create->tracking_urls) {
        tracking_urls_free(ad_create->tracking_urls);
        ad_create->tracking_urls = NULL;
    }
    if (ad_create->view_tracking_url) {
        free(ad_create->view_tracking_url);
        ad_create->view_tracking_url = NULL;
    }
    free(ad_create);
}

cJSON *ad_create_convertToJSON(ad_create_t *ad_create) {
    cJSON *item = cJSON_CreateObject();

    // ad_create->ad_group_id
    if (!ad_create->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", ad_create->ad_group_id) == NULL) {
    goto fail; //String
    }


    // ad_create->android_deep_link
    if(ad_create->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", ad_create->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->carousel_android_deep_links
    if(ad_create->carousel_android_deep_links) {
    cJSON *carousel_android_deep_links = cJSON_AddArrayToObject(item, "carousel_android_deep_links");
    if(carousel_android_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_android_deep_linksListEntry;
    list_ForEach(carousel_android_deep_linksListEntry, ad_create->carousel_android_deep_links) {
    if(cJSON_AddStringToObject(carousel_android_deep_links, "", carousel_android_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_create->carousel_destination_urls
    if(ad_create->carousel_destination_urls) {
    cJSON *carousel_destination_urls = cJSON_AddArrayToObject(item, "carousel_destination_urls");
    if(carousel_destination_urls == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_destination_urlsListEntry;
    list_ForEach(carousel_destination_urlsListEntry, ad_create->carousel_destination_urls) {
    if(cJSON_AddStringToObject(carousel_destination_urls, "", carousel_destination_urlsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_create->carousel_ios_deep_links
    if(ad_create->carousel_ios_deep_links) {
    cJSON *carousel_ios_deep_links = cJSON_AddArrayToObject(item, "carousel_ios_deep_links");
    if(carousel_ios_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_ios_deep_linksListEntry;
    list_ForEach(carousel_ios_deep_linksListEntry, ad_create->carousel_ios_deep_links) {
    if(cJSON_AddStringToObject(carousel_ios_deep_links, "", carousel_ios_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_create->click_tracking_url
    if(ad_create->click_tracking_url) {
    if(cJSON_AddStringToObject(item, "click_tracking_url", ad_create->click_tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->collection_items_destination_url_template
    if(ad_create->collection_items_destination_url_template) {
    if(cJSON_AddStringToObject(item, "collection_items_destination_url_template", ad_create->collection_items_destination_url_template) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->collections_header_type
    if(ad_create->collections_header_type) {
    cJSON *collections_header_type_local_JSON = ad_collections_header_type_convertToJSON(ad_create->collections_header_type);
    if(collections_header_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "collections_header_type", collections_header_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_create->creative_type
    if (pinterest_rest_api_creative_type__NULL == ad_create->creative_type) {
        goto fail;
    }
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(ad_create->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_create->customizable_cta_type
    if(ad_create->customizable_cta_type != pinterest_rest_api_customizable_cta_type__NULL) {
    cJSON *customizable_cta_type_local_JSON = customizable_cta_type_convertToJSON(ad_create->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_create->destination_url
    if(ad_create->destination_url) {
    if(cJSON_AddStringToObject(item, "destination_url", ad_create->destination_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->disclosure_type
    if(ad_create->disclosure_type != pinterest_rest_api_disclosure_type__NULL) {
    cJSON *disclosure_type_local_JSON = disclosure_type_convertToJSON(ad_create->disclosure_type);
    if(disclosure_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "disclosure_type", disclosure_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_create->disclosure_url
    if(ad_create->disclosure_url) {
    if(cJSON_AddStringToObject(item, "disclosure_url", ad_create->disclosure_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->grid_click_type
    if(ad_create->grid_click_type != pinterest_rest_api_grid_click_type__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(ad_create->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_create->ios_deep_link
    if(ad_create->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", ad_create->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->is_carting
    if(ad_create->is_carting) {
    if(cJSON_AddBoolToObject(item, "is_carting", *ad_create->is_carting) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_create->is_collage_accepted_terms
    if(ad_create->is_collage_accepted_terms) {
    if(cJSON_AddBoolToObject(item, "is_collage_accepted_terms", *ad_create->is_collage_accepted_terms) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_create->is_collage_single_destination
    if(ad_create->is_collage_single_destination) {
    if(cJSON_AddBoolToObject(item, "is_collage_single_destination", *ad_create->is_collage_single_destination) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_create->is_pin_deleted
    if(ad_create->is_pin_deleted) {
    if(cJSON_AddBoolToObject(item, "is_pin_deleted", *ad_create->is_pin_deleted) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_create->is_removable
    if(ad_create->is_removable) {
    if(cJSON_AddBoolToObject(item, "is_removable", *ad_create->is_removable) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_create->lead_form_id
    if(ad_create->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", ad_create->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->name
    if(ad_create->name) {
    if(cJSON_AddStringToObject(item, "name", ad_create->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_create->pin_id
    if (!ad_create->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", ad_create->pin_id) == NULL) {
    goto fail; //String
    }


    // ad_create->quiz_pin_data
    if(ad_create->quiz_pin_data) {
    cJSON *quiz_pin_data_local_JSON = quiz_pin_data_convertToJSON(ad_create->quiz_pin_data);
    if(quiz_pin_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quiz_pin_data", quiz_pin_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_create->status
    if(ad_create->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_create->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_create->tracking_urls
    if(ad_create->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(ad_create->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_create->view_tracking_url
    if(ad_create->view_tracking_url) {
    if(cJSON_AddStringToObject(item, "view_tracking_url", ad_create->view_tracking_url) == NULL) {
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

ad_create_t *ad_create_parseFromJSON(cJSON *ad_createJSON){

    ad_create_t *ad_create_local_var = NULL;

    char *ad_group_id_local_str = NULL;

    char *android_deep_link_local_str = NULL;

    // define the local list for ad_create->carousel_android_deep_links
    list_t *carousel_android_deep_linksList = NULL;

    // define the local list for ad_create->carousel_destination_urls
    list_t *carousel_destination_urlsList = NULL;

    // define the local list for ad_create->carousel_ios_deep_links
    list_t *carousel_ios_deep_linksList = NULL;

    char *click_tracking_url_local_str = NULL;

    char *collection_items_destination_url_template_local_str = NULL;

    // define the local variable for ad_create->collections_header_type
    ad_collections_header_type_t *collections_header_type_local_nonprim = NULL;

    // define the local variable for ad_create->creative_type
    pinterest_rest_api_creative_type__e creative_type_local_nonprim = 0;

    // define the local variable for ad_create->customizable_cta_type
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type_local_nonprim = 0;

    char *destination_url_local_str = NULL;

    // define the local variable for ad_create->disclosure_type
    pinterest_rest_api_disclosure_type__e disclosure_type_local_nonprim = 0;

    char *disclosure_url_local_str = NULL;

    // define the local variable for ad_create->grid_click_type
    pinterest_rest_api_grid_click_type__e grid_click_type_local_nonprim = 0;

    char *ios_deep_link_local_str = NULL;

    // define the local variable for ad_create->is_carting
    int *is_carting_local_var = NULL;

    // define the local variable for ad_create->is_collage_accepted_terms
    int *is_collage_accepted_terms_local_var = NULL;

    // define the local variable for ad_create->is_collage_single_destination
    int *is_collage_single_destination_local_var = NULL;

    // define the local variable for ad_create->is_pin_deleted
    int *is_pin_deleted_local_var = NULL;

    // define the local variable for ad_create->is_removable
    int *is_removable_local_var = NULL;

    char *lead_form_id_local_str = NULL;

    char *name_local_str = NULL;

    char *pin_id_local_str = NULL;

    // define the local variable for ad_create->quiz_pin_data
    quiz_pin_data_t *quiz_pin_data_local_nonprim = NULL;

    // define the local variable for ad_create->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    // define the local variable for ad_create->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    char *view_tracking_url_local_str = NULL;

    // ad_create->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }

    // ad_create->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // ad_create->carousel_android_deep_links
    cJSON *carousel_android_deep_links = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "carousel_android_deep_links");
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

    // ad_create->carousel_destination_urls
    cJSON *carousel_destination_urls = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "carousel_destination_urls");
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

    // ad_create->carousel_ios_deep_links
    cJSON *carousel_ios_deep_links = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "carousel_ios_deep_links");
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

    // ad_create->click_tracking_url
    cJSON *click_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "click_tracking_url");
    if (cJSON_IsNull(click_tracking_url)) {
        click_tracking_url = NULL;
    }
    if (click_tracking_url) { 
    if(!cJSON_IsString(click_tracking_url) && !cJSON_IsNull(click_tracking_url))
    {
    goto end; //String
    }
    }

    // ad_create->collection_items_destination_url_template
    cJSON *collection_items_destination_url_template = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "collection_items_destination_url_template");
    if (cJSON_IsNull(collection_items_destination_url_template)) {
        collection_items_destination_url_template = NULL;
    }
    if (collection_items_destination_url_template) { 
    if(!cJSON_IsString(collection_items_destination_url_template) && !cJSON_IsNull(collection_items_destination_url_template))
    {
    goto end; //String
    }
    }

    // ad_create->collections_header_type
    cJSON *collections_header_type = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "collections_header_type");
    if (cJSON_IsNull(collections_header_type)) {
        collections_header_type = NULL;
    }
    if (collections_header_type) { 
    collections_header_type_local_nonprim = ad_collections_header_type_parseFromJSON(collections_header_type); //custom
    }

    // ad_create->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (!creative_type) {
        goto end;
    }

    
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom

    // ad_create->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // ad_create->destination_url
    cJSON *destination_url = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "destination_url");
    if (cJSON_IsNull(destination_url)) {
        destination_url = NULL;
    }
    if (destination_url) { 
    if(!cJSON_IsString(destination_url) && !cJSON_IsNull(destination_url))
    {
    goto end; //String
    }
    }

    // ad_create->disclosure_type
    cJSON *disclosure_type = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "disclosure_type");
    if (cJSON_IsNull(disclosure_type)) {
        disclosure_type = NULL;
    }
    if (disclosure_type) { 
    disclosure_type_local_nonprim = disclosure_type_parseFromJSON(disclosure_type); //custom
    }

    // ad_create->disclosure_url
    cJSON *disclosure_url = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "disclosure_url");
    if (cJSON_IsNull(disclosure_url)) {
        disclosure_url = NULL;
    }
    if (disclosure_url) { 
    if(!cJSON_IsString(disclosure_url) && !cJSON_IsNull(disclosure_url))
    {
    goto end; //String
    }
    }

    // ad_create->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "grid_click_type");
    if (cJSON_IsNull(grid_click_type)) {
        grid_click_type = NULL;
    }
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }

    // ad_create->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // ad_create->is_carting
    cJSON *is_carting = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "is_carting");
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

    // ad_create->is_collage_accepted_terms
    cJSON *is_collage_accepted_terms = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "is_collage_accepted_terms");
    if (cJSON_IsNull(is_collage_accepted_terms)) {
        is_collage_accepted_terms = NULL;
    }
    if (is_collage_accepted_terms) { 
    if(!cJSON_IsBool(is_collage_accepted_terms))
    {
    goto end; //Bool
    }
    is_collage_accepted_terms_local_var = malloc(sizeof(int));
    if(!is_collage_accepted_terms_local_var)
    {
        goto end;
    }
    *is_collage_accepted_terms_local_var = is_collage_accepted_terms->valueint;
    }

    // ad_create->is_collage_single_destination
    cJSON *is_collage_single_destination = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "is_collage_single_destination");
    if (cJSON_IsNull(is_collage_single_destination)) {
        is_collage_single_destination = NULL;
    }
    if (is_collage_single_destination) { 
    if(!cJSON_IsBool(is_collage_single_destination))
    {
    goto end; //Bool
    }
    is_collage_single_destination_local_var = malloc(sizeof(int));
    if(!is_collage_single_destination_local_var)
    {
        goto end;
    }
    *is_collage_single_destination_local_var = is_collage_single_destination->valueint;
    }

    // ad_create->is_pin_deleted
    cJSON *is_pin_deleted = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "is_pin_deleted");
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

    // ad_create->is_removable
    cJSON *is_removable = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "is_removable");
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

    // ad_create->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // ad_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_create->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }

    // ad_create->quiz_pin_data
    cJSON *quiz_pin_data = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "quiz_pin_data");
    if (cJSON_IsNull(quiz_pin_data)) {
        quiz_pin_data = NULL;
    }
    if (quiz_pin_data) { 
    quiz_pin_data_local_nonprim = quiz_pin_data_parseFromJSON(quiz_pin_data); //nonprimitive
    }

    // ad_create->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_create->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // ad_create->view_tracking_url
    cJSON *view_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_createJSON, "view_tracking_url");
    if (cJSON_IsNull(view_tracking_url)) {
        view_tracking_url = NULL;
    }
    if (view_tracking_url) { 
    if(!cJSON_IsString(view_tracking_url) && !cJSON_IsNull(view_tracking_url))
    {
    goto end; //String
    }
    }


    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (android_deep_link && !cJSON_IsNull(android_deep_link)) android_deep_link_local_str = strdup(android_deep_link->valuestring);
    if (click_tracking_url && !cJSON_IsNull(click_tracking_url)) click_tracking_url_local_str = strdup(click_tracking_url->valuestring);
    if (collection_items_destination_url_template && !cJSON_IsNull(collection_items_destination_url_template)) collection_items_destination_url_template_local_str = strdup(collection_items_destination_url_template->valuestring);
    if (destination_url && !cJSON_IsNull(destination_url)) destination_url_local_str = strdup(destination_url->valuestring);
    if (disclosure_url && !cJSON_IsNull(disclosure_url)) disclosure_url_local_str = strdup(disclosure_url->valuestring);
    if (ios_deep_link && !cJSON_IsNull(ios_deep_link)) ios_deep_link_local_str = strdup(ios_deep_link->valuestring);
    if (lead_form_id && !cJSON_IsNull(lead_form_id)) lead_form_id_local_str = strdup(lead_form_id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);
    if (view_tracking_url && !cJSON_IsNull(view_tracking_url)) view_tracking_url_local_str = strdup(view_tracking_url->valuestring);

    ad_create_local_var = ad_create_create_internal (
        ad_group_id_local_str,
        android_deep_link_local_str,
        carousel_android_deep_links ? carousel_android_deep_linksList : NULL,
        carousel_destination_urls ? carousel_destination_urlsList : NULL,
        carousel_ios_deep_links ? carousel_ios_deep_linksList : NULL,
        click_tracking_url_local_str,
        collection_items_destination_url_template_local_str,
        collections_header_type ? collections_header_type_local_nonprim : NULL,
        creative_type_local_nonprim,
        customizable_cta_type ? customizable_cta_type_local_nonprim : 0,
        destination_url_local_str,
        disclosure_type ? disclosure_type_local_nonprim : 0,
        disclosure_url_local_str,
        grid_click_type ? grid_click_type_local_nonprim : 0,
        ios_deep_link_local_str,
        is_carting_local_var,
        is_collage_accepted_terms_local_var,
        is_collage_single_destination_local_var,
        is_pin_deleted_local_var,
        is_removable_local_var,
        lead_form_id_local_str,
        name_local_str,
        pin_id_local_str,
        quiz_pin_data ? quiz_pin_data_local_nonprim : NULL,
        status ? status_local_nonprim : 0,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        view_tracking_url_local_str
        );

    if (!ad_create_local_var) {
        goto end;
    }

    return ad_create_local_var;
end:
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
    if (collection_items_destination_url_template_local_str) {
        free(collection_items_destination_url_template_local_str);
        collection_items_destination_url_template_local_str = NULL;
    }
    if (collections_header_type_local_nonprim) {
        ad_collections_header_type_free(collections_header_type_local_nonprim);
        collections_header_type_local_nonprim = NULL;
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
    if (is_collage_accepted_terms_local_var) {
        free(is_collage_accepted_terms_local_var);
        is_collage_accepted_terms_local_var = NULL;
    }
    if (is_collage_single_destination_local_var) {
        free(is_collage_single_destination_local_var);
        is_collage_single_destination_local_var = NULL;
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
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    if (quiz_pin_data_local_nonprim) {
        quiz_pin_data_free(quiz_pin_data_local_nonprim);
        quiz_pin_data_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (view_tracking_url_local_str) {
        free(view_tracking_url_local_str);
        view_tracking_url_local_str = NULL;
    }
    return NULL;

}
