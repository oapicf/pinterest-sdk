#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotion_response_element.h"



static product_group_promotion_response_element_t *product_group_promotion_response_element_create_internal(
    char *id,
    char *ad_group_id,
    int bid_in_micro_currency,
    int included,
    char *definition,
    char *relative_definition,
    char *parent_id,
    char *slideshow_collections_title,
    char *slideshow_collections_description,
    int is_mdl,
    pinterest_rest_api_entity_status__e status,
    char *tracking_url,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    char *collections_hero_pin_id,
    char *collections_hero_destination_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    pinterest_rest_api_creative_type__e creative_type
    ) {
    product_group_promotion_response_element_t *product_group_promotion_response_element_local_var = malloc(sizeof(product_group_promotion_response_element_t));
    if (!product_group_promotion_response_element_local_var) {
        return NULL;
    }
    product_group_promotion_response_element_local_var->id = id;
    product_group_promotion_response_element_local_var->ad_group_id = ad_group_id;
    product_group_promotion_response_element_local_var->bid_in_micro_currency = bid_in_micro_currency;
    product_group_promotion_response_element_local_var->included = included;
    product_group_promotion_response_element_local_var->definition = definition;
    product_group_promotion_response_element_local_var->relative_definition = relative_definition;
    product_group_promotion_response_element_local_var->parent_id = parent_id;
    product_group_promotion_response_element_local_var->slideshow_collections_title = slideshow_collections_title;
    product_group_promotion_response_element_local_var->slideshow_collections_description = slideshow_collections_description;
    product_group_promotion_response_element_local_var->is_mdl = is_mdl;
    product_group_promotion_response_element_local_var->status = status;
    product_group_promotion_response_element_local_var->tracking_url = tracking_url;
    product_group_promotion_response_element_local_var->catalog_product_group_id = catalog_product_group_id;
    product_group_promotion_response_element_local_var->catalog_product_group_name = catalog_product_group_name;
    product_group_promotion_response_element_local_var->collections_hero_pin_id = collections_hero_pin_id;
    product_group_promotion_response_element_local_var->collections_hero_destination_url = collections_hero_destination_url;
    product_group_promotion_response_element_local_var->grid_click_type = grid_click_type;
    product_group_promotion_response_element_local_var->creative_type = creative_type;

    product_group_promotion_response_element_local_var->_library_owned = 1;
    return product_group_promotion_response_element_local_var;
}

__attribute__((deprecated)) product_group_promotion_response_element_t *product_group_promotion_response_element_create(
    char *id,
    char *ad_group_id,
    int bid_in_micro_currency,
    int included,
    char *definition,
    char *relative_definition,
    char *parent_id,
    char *slideshow_collections_title,
    char *slideshow_collections_description,
    int is_mdl,
    pinterest_rest_api_entity_status__e status,
    char *tracking_url,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    char *collections_hero_pin_id,
    char *collections_hero_destination_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    pinterest_rest_api_creative_type__e creative_type
    ) {
    return product_group_promotion_response_element_create_internal (
        id,
        ad_group_id,
        bid_in_micro_currency,
        included,
        definition,
        relative_definition,
        parent_id,
        slideshow_collections_title,
        slideshow_collections_description,
        is_mdl,
        status,
        tracking_url,
        catalog_product_group_id,
        catalog_product_group_name,
        collections_hero_pin_id,
        collections_hero_destination_url,
        grid_click_type,
        creative_type
        );
}

void product_group_promotion_response_element_free(product_group_promotion_response_element_t *product_group_promotion_response_element) {
    if(NULL == product_group_promotion_response_element){
        return ;
    }
    if(product_group_promotion_response_element->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_group_promotion_response_element_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotion_response_element->id) {
        free(product_group_promotion_response_element->id);
        product_group_promotion_response_element->id = NULL;
    }
    if (product_group_promotion_response_element->ad_group_id) {
        free(product_group_promotion_response_element->ad_group_id);
        product_group_promotion_response_element->ad_group_id = NULL;
    }
    if (product_group_promotion_response_element->definition) {
        free(product_group_promotion_response_element->definition);
        product_group_promotion_response_element->definition = NULL;
    }
    if (product_group_promotion_response_element->relative_definition) {
        free(product_group_promotion_response_element->relative_definition);
        product_group_promotion_response_element->relative_definition = NULL;
    }
    if (product_group_promotion_response_element->parent_id) {
        free(product_group_promotion_response_element->parent_id);
        product_group_promotion_response_element->parent_id = NULL;
    }
    if (product_group_promotion_response_element->slideshow_collections_title) {
        free(product_group_promotion_response_element->slideshow_collections_title);
        product_group_promotion_response_element->slideshow_collections_title = NULL;
    }
    if (product_group_promotion_response_element->slideshow_collections_description) {
        free(product_group_promotion_response_element->slideshow_collections_description);
        product_group_promotion_response_element->slideshow_collections_description = NULL;
    }
    if (product_group_promotion_response_element->tracking_url) {
        free(product_group_promotion_response_element->tracking_url);
        product_group_promotion_response_element->tracking_url = NULL;
    }
    if (product_group_promotion_response_element->catalog_product_group_id) {
        free(product_group_promotion_response_element->catalog_product_group_id);
        product_group_promotion_response_element->catalog_product_group_id = NULL;
    }
    if (product_group_promotion_response_element->catalog_product_group_name) {
        free(product_group_promotion_response_element->catalog_product_group_name);
        product_group_promotion_response_element->catalog_product_group_name = NULL;
    }
    if (product_group_promotion_response_element->collections_hero_pin_id) {
        free(product_group_promotion_response_element->collections_hero_pin_id);
        product_group_promotion_response_element->collections_hero_pin_id = NULL;
    }
    if (product_group_promotion_response_element->collections_hero_destination_url) {
        free(product_group_promotion_response_element->collections_hero_destination_url);
        product_group_promotion_response_element->collections_hero_destination_url = NULL;
    }
    free(product_group_promotion_response_element);
}

cJSON *product_group_promotion_response_element_convertToJSON(product_group_promotion_response_element_t *product_group_promotion_response_element) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotion_response_element->id
    if(product_group_promotion_response_element->id) {
    if(cJSON_AddStringToObject(item, "id", product_group_promotion_response_element->id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->ad_group_id
    if(product_group_promotion_response_element->ad_group_id) {
    if(cJSON_AddStringToObject(item, "ad_group_id", product_group_promotion_response_element->ad_group_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->bid_in_micro_currency
    if(product_group_promotion_response_element->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", product_group_promotion_response_element->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // product_group_promotion_response_element->included
    if(product_group_promotion_response_element->included) {
    if(cJSON_AddBoolToObject(item, "included", product_group_promotion_response_element->included) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion_response_element->definition
    if(product_group_promotion_response_element->definition) {
    if(cJSON_AddStringToObject(item, "definition", product_group_promotion_response_element->definition) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->relative_definition
    if(product_group_promotion_response_element->relative_definition) {
    if(cJSON_AddStringToObject(item, "relative_definition", product_group_promotion_response_element->relative_definition) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->parent_id
    if(product_group_promotion_response_element->parent_id) {
    if(cJSON_AddStringToObject(item, "parent_id", product_group_promotion_response_element->parent_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->slideshow_collections_title
    if(product_group_promotion_response_element->slideshow_collections_title) {
    if(cJSON_AddStringToObject(item, "slideshow_collections_title", product_group_promotion_response_element->slideshow_collections_title) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->slideshow_collections_description
    if(product_group_promotion_response_element->slideshow_collections_description) {
    if(cJSON_AddStringToObject(item, "slideshow_collections_description", product_group_promotion_response_element->slideshow_collections_description) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->is_mdl
    if(product_group_promotion_response_element->is_mdl) {
    if(cJSON_AddBoolToObject(item, "is_mdl", product_group_promotion_response_element->is_mdl) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion_response_element->status
    if(product_group_promotion_response_element->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(product_group_promotion_response_element->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion_response_element->tracking_url
    if(product_group_promotion_response_element->tracking_url) {
    if(cJSON_AddStringToObject(item, "tracking_url", product_group_promotion_response_element->tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->catalog_product_group_id
    if(product_group_promotion_response_element->catalog_product_group_id) {
    if(cJSON_AddStringToObject(item, "catalog_product_group_id", product_group_promotion_response_element->catalog_product_group_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->catalog_product_group_name
    if(product_group_promotion_response_element->catalog_product_group_name) {
    if(cJSON_AddStringToObject(item, "catalog_product_group_name", product_group_promotion_response_element->catalog_product_group_name) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->collections_hero_pin_id
    if(product_group_promotion_response_element->collections_hero_pin_id) {
    if(cJSON_AddStringToObject(item, "collections_hero_pin_id", product_group_promotion_response_element->collections_hero_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->collections_hero_destination_url
    if(product_group_promotion_response_element->collections_hero_destination_url) {
    if(cJSON_AddStringToObject(item, "collections_hero_destination_url", product_group_promotion_response_element->collections_hero_destination_url) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion_response_element->grid_click_type
    if(product_group_promotion_response_element->grid_click_type != pinterest_rest_api_grid_click_type__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(product_group_promotion_response_element->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion_response_element->creative_type
    if(product_group_promotion_response_element->creative_type != pinterest_rest_api_creative_type__NULL) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(product_group_promotion_response_element->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
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

product_group_promotion_response_element_t *product_group_promotion_response_element_parseFromJSON(cJSON *product_group_promotion_response_elementJSON){

    product_group_promotion_response_element_t *product_group_promotion_response_element_local_var = NULL;

    // define the local variable for product_group_promotion_response_element->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    // define the local variable for product_group_promotion_response_element->grid_click_type
    pinterest_rest_api_grid_click_type__e grid_click_type_local_nonprim = 0;

    // define the local variable for product_group_promotion_response_element->creative_type
    pinterest_rest_api_creative_type__e creative_type_local_nonprim = 0;

    // product_group_promotion_response_element->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (ad_group_id) { 
    if(!cJSON_IsString(ad_group_id) && !cJSON_IsNull(ad_group_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "bid_in_micro_currency");
    if (cJSON_IsNull(bid_in_micro_currency)) {
        bid_in_micro_currency = NULL;
    }
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // product_group_promotion_response_element->included
    cJSON *included = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "included");
    if (cJSON_IsNull(included)) {
        included = NULL;
    }
    if (included) { 
    if(!cJSON_IsBool(included))
    {
    goto end; //Bool
    }
    }

    // product_group_promotion_response_element->definition
    cJSON *definition = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "definition");
    if (cJSON_IsNull(definition)) {
        definition = NULL;
    }
    if (definition) { 
    if(!cJSON_IsString(definition) && !cJSON_IsNull(definition))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->relative_definition
    cJSON *relative_definition = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "relative_definition");
    if (cJSON_IsNull(relative_definition)) {
        relative_definition = NULL;
    }
    if (relative_definition) { 
    if(!cJSON_IsString(relative_definition) && !cJSON_IsNull(relative_definition))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "parent_id");
    if (cJSON_IsNull(parent_id)) {
        parent_id = NULL;
    }
    if (parent_id) { 
    if(!cJSON_IsString(parent_id) && !cJSON_IsNull(parent_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->slideshow_collections_title
    cJSON *slideshow_collections_title = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "slideshow_collections_title");
    if (cJSON_IsNull(slideshow_collections_title)) {
        slideshow_collections_title = NULL;
    }
    if (slideshow_collections_title) { 
    if(!cJSON_IsString(slideshow_collections_title) && !cJSON_IsNull(slideshow_collections_title))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->slideshow_collections_description
    cJSON *slideshow_collections_description = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "slideshow_collections_description");
    if (cJSON_IsNull(slideshow_collections_description)) {
        slideshow_collections_description = NULL;
    }
    if (slideshow_collections_description) { 
    if(!cJSON_IsString(slideshow_collections_description) && !cJSON_IsNull(slideshow_collections_description))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->is_mdl
    cJSON *is_mdl = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "is_mdl");
    if (cJSON_IsNull(is_mdl)) {
        is_mdl = NULL;
    }
    if (is_mdl) { 
    if(!cJSON_IsBool(is_mdl))
    {
    goto end; //Bool
    }
    }

    // product_group_promotion_response_element->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // product_group_promotion_response_element->tracking_url
    cJSON *tracking_url = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "tracking_url");
    if (cJSON_IsNull(tracking_url)) {
        tracking_url = NULL;
    }
    if (tracking_url) { 
    if(!cJSON_IsString(tracking_url) && !cJSON_IsNull(tracking_url))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->catalog_product_group_id
    cJSON *catalog_product_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "catalog_product_group_id");
    if (cJSON_IsNull(catalog_product_group_id)) {
        catalog_product_group_id = NULL;
    }
    if (catalog_product_group_id) { 
    if(!cJSON_IsString(catalog_product_group_id) && !cJSON_IsNull(catalog_product_group_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->catalog_product_group_name
    cJSON *catalog_product_group_name = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "catalog_product_group_name");
    if (cJSON_IsNull(catalog_product_group_name)) {
        catalog_product_group_name = NULL;
    }
    if (catalog_product_group_name) { 
    if(!cJSON_IsString(catalog_product_group_name) && !cJSON_IsNull(catalog_product_group_name))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->collections_hero_pin_id
    cJSON *collections_hero_pin_id = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "collections_hero_pin_id");
    if (cJSON_IsNull(collections_hero_pin_id)) {
        collections_hero_pin_id = NULL;
    }
    if (collections_hero_pin_id) { 
    if(!cJSON_IsString(collections_hero_pin_id) && !cJSON_IsNull(collections_hero_pin_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->collections_hero_destination_url
    cJSON *collections_hero_destination_url = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "collections_hero_destination_url");
    if (cJSON_IsNull(collections_hero_destination_url)) {
        collections_hero_destination_url = NULL;
    }
    if (collections_hero_destination_url) { 
    if(!cJSON_IsString(collections_hero_destination_url) && !cJSON_IsNull(collections_hero_destination_url))
    {
    goto end; //String
    }
    }

    // product_group_promotion_response_element->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "grid_click_type");
    if (cJSON_IsNull(grid_click_type)) {
        grid_click_type = NULL;
    }
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }

    // product_group_promotion_response_element->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_elementJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }


    product_group_promotion_response_element_local_var = product_group_promotion_response_element_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        ad_group_id && !cJSON_IsNull(ad_group_id) ? strdup(ad_group_id->valuestring) : NULL,
        bid_in_micro_currency ? bid_in_micro_currency->valuedouble : 0,
        included ? included->valueint : 0,
        definition && !cJSON_IsNull(definition) ? strdup(definition->valuestring) : NULL,
        relative_definition && !cJSON_IsNull(relative_definition) ? strdup(relative_definition->valuestring) : NULL,
        parent_id && !cJSON_IsNull(parent_id) ? strdup(parent_id->valuestring) : NULL,
        slideshow_collections_title && !cJSON_IsNull(slideshow_collections_title) ? strdup(slideshow_collections_title->valuestring) : NULL,
        slideshow_collections_description && !cJSON_IsNull(slideshow_collections_description) ? strdup(slideshow_collections_description->valuestring) : NULL,
        is_mdl ? is_mdl->valueint : 0,
        status ? status_local_nonprim : 0,
        tracking_url && !cJSON_IsNull(tracking_url) ? strdup(tracking_url->valuestring) : NULL,
        catalog_product_group_id && !cJSON_IsNull(catalog_product_group_id) ? strdup(catalog_product_group_id->valuestring) : NULL,
        catalog_product_group_name && !cJSON_IsNull(catalog_product_group_name) ? strdup(catalog_product_group_name->valuestring) : NULL,
        collections_hero_pin_id && !cJSON_IsNull(collections_hero_pin_id) ? strdup(collections_hero_pin_id->valuestring) : NULL,
        collections_hero_destination_url && !cJSON_IsNull(collections_hero_destination_url) ? strdup(collections_hero_destination_url->valuestring) : NULL,
        grid_click_type ? grid_click_type_local_nonprim : 0,
        creative_type ? creative_type_local_nonprim : 0
        );

    return product_group_promotion_response_element_local_var;
end:
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (grid_click_type_local_nonprim) {
        grid_click_type_local_nonprim = 0;
    }
    if (creative_type_local_nonprim) {
        creative_type_local_nonprim = 0;
    }
    return NULL;

}
