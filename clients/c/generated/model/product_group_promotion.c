#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotion.h"



static product_group_promotion_t *product_group_promotion_create_internal(
    char *ad_group_id,
    int *bid_in_micro_currency,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    pinterest_rest_api_collections_header_type__e collections_header_type,
    char *collections_hero_destination_url,
    char *collections_hero_pin_id,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_product_group_promotion_customizable_cta_type__e customizable_cta_type,
    char *definition,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *id,
    int *included,
    int *is_generate_background,
    int *is_image_auto_resizing,
    int *is_mdl,
    char *parent_id,
    pinterest_rest_api_preferred_media_type__e preferred_media_type,
    char *relative_definition,
    char *selected_image_tag,
    char *selected_video_tag,
    char *slideshow_collections_description,
    char *slideshow_collections_title,
    pinterest_rest_api_entity_status__e status,
    char *tracking_url
    ) {
    product_group_promotion_t *product_group_promotion_local_var = malloc(sizeof(product_group_promotion_t));
    if (!product_group_promotion_local_var) {
        return NULL;
    }
    memset(product_group_promotion_local_var, 0, sizeof(product_group_promotion_t));
    product_group_promotion_local_var->_library_owned = 1;
    product_group_promotion_local_var->ad_group_id = ad_group_id;
    product_group_promotion_local_var->bid_in_micro_currency = bid_in_micro_currency;
    product_group_promotion_local_var->catalog_product_group_id = catalog_product_group_id;
    product_group_promotion_local_var->catalog_product_group_name = catalog_product_group_name;
    product_group_promotion_local_var->collections_header_type = collections_header_type;
    product_group_promotion_local_var->collections_hero_destination_url = collections_hero_destination_url;
    product_group_promotion_local_var->collections_hero_pin_id = collections_hero_pin_id;
    product_group_promotion_local_var->creative_type = creative_type;
    product_group_promotion_local_var->customizable_cta_type = customizable_cta_type;
    product_group_promotion_local_var->definition = definition;
    product_group_promotion_local_var->grid_click_type = grid_click_type;
    product_group_promotion_local_var->id = id;
    product_group_promotion_local_var->included = included;
    product_group_promotion_local_var->is_generate_background = is_generate_background;
    product_group_promotion_local_var->is_image_auto_resizing = is_image_auto_resizing;
    product_group_promotion_local_var->is_mdl = is_mdl;
    product_group_promotion_local_var->parent_id = parent_id;
    product_group_promotion_local_var->preferred_media_type = preferred_media_type;
    product_group_promotion_local_var->relative_definition = relative_definition;
    product_group_promotion_local_var->selected_image_tag = selected_image_tag;
    product_group_promotion_local_var->selected_video_tag = selected_video_tag;
    product_group_promotion_local_var->slideshow_collections_description = slideshow_collections_description;
    product_group_promotion_local_var->slideshow_collections_title = slideshow_collections_title;
    product_group_promotion_local_var->status = status;
    product_group_promotion_local_var->tracking_url = tracking_url;
    return product_group_promotion_local_var;
}

__attribute__((deprecated)) product_group_promotion_t *product_group_promotion_create(
    char *ad_group_id,
    int *bid_in_micro_currency,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    pinterest_rest_api_collections_header_type__e collections_header_type,
    char *collections_hero_destination_url,
    char *collections_hero_pin_id,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_product_group_promotion_customizable_cta_type__e customizable_cta_type,
    char *definition,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *id,
    int *included,
    int *is_generate_background,
    int *is_image_auto_resizing,
    int *is_mdl,
    char *parent_id,
    pinterest_rest_api_preferred_media_type__e preferred_media_type,
    char *relative_definition,
    char *selected_image_tag,
    char *selected_video_tag,
    char *slideshow_collections_description,
    char *slideshow_collections_title,
    pinterest_rest_api_entity_status__e status,
    char *tracking_url
    ) {
    int *bid_in_micro_currency_copy = NULL;
    if (bid_in_micro_currency) {
        bid_in_micro_currency_copy = malloc(sizeof(int));
        if (bid_in_micro_currency_copy) *bid_in_micro_currency_copy = *bid_in_micro_currency;
    }
    int *included_copy = NULL;
    if (included) {
        included_copy = malloc(sizeof(int));
        if (included_copy) *included_copy = *included;
    }
    int *is_generate_background_copy = NULL;
    if (is_generate_background) {
        is_generate_background_copy = malloc(sizeof(int));
        if (is_generate_background_copy) *is_generate_background_copy = *is_generate_background;
    }
    int *is_image_auto_resizing_copy = NULL;
    if (is_image_auto_resizing) {
        is_image_auto_resizing_copy = malloc(sizeof(int));
        if (is_image_auto_resizing_copy) *is_image_auto_resizing_copy = *is_image_auto_resizing;
    }
    int *is_mdl_copy = NULL;
    if (is_mdl) {
        is_mdl_copy = malloc(sizeof(int));
        if (is_mdl_copy) *is_mdl_copy = *is_mdl;
    }
    product_group_promotion_t *result = product_group_promotion_create_internal (
        ad_group_id,
        bid_in_micro_currency_copy,
        catalog_product_group_id,
        catalog_product_group_name,
        collections_header_type,
        collections_hero_destination_url,
        collections_hero_pin_id,
        creative_type,
        customizable_cta_type,
        definition,
        grid_click_type,
        id,
        included_copy,
        is_generate_background_copy,
        is_image_auto_resizing_copy,
        is_mdl_copy,
        parent_id,
        preferred_media_type,
        relative_definition,
        selected_image_tag,
        selected_video_tag,
        slideshow_collections_description,
        slideshow_collections_title,
        status,
        tracking_url
        );
    if (!result) {
        free(bid_in_micro_currency_copy);
        free(included_copy);
        free(is_generate_background_copy);
        free(is_image_auto_resizing_copy);
        free(is_mdl_copy);
    }
    return result;
}

void product_group_promotion_free(product_group_promotion_t *product_group_promotion) {
    if(NULL == product_group_promotion){
        return ;
    }
    if(product_group_promotion->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_group_promotion_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotion->ad_group_id) {
        free(product_group_promotion->ad_group_id);
        product_group_promotion->ad_group_id = NULL;
    }
    if (product_group_promotion->bid_in_micro_currency) {
        free(product_group_promotion->bid_in_micro_currency);
        product_group_promotion->bid_in_micro_currency = NULL;
    }
    if (product_group_promotion->catalog_product_group_id) {
        free(product_group_promotion->catalog_product_group_id);
        product_group_promotion->catalog_product_group_id = NULL;
    }
    if (product_group_promotion->catalog_product_group_name) {
        free(product_group_promotion->catalog_product_group_name);
        product_group_promotion->catalog_product_group_name = NULL;
    }
    if (product_group_promotion->collections_hero_destination_url) {
        free(product_group_promotion->collections_hero_destination_url);
        product_group_promotion->collections_hero_destination_url = NULL;
    }
    if (product_group_promotion->collections_hero_pin_id) {
        free(product_group_promotion->collections_hero_pin_id);
        product_group_promotion->collections_hero_pin_id = NULL;
    }
    if (product_group_promotion->definition) {
        free(product_group_promotion->definition);
        product_group_promotion->definition = NULL;
    }
    if (product_group_promotion->id) {
        free(product_group_promotion->id);
        product_group_promotion->id = NULL;
    }
    if (product_group_promotion->included) {
        free(product_group_promotion->included);
        product_group_promotion->included = NULL;
    }
    if (product_group_promotion->is_generate_background) {
        free(product_group_promotion->is_generate_background);
        product_group_promotion->is_generate_background = NULL;
    }
    if (product_group_promotion->is_image_auto_resizing) {
        free(product_group_promotion->is_image_auto_resizing);
        product_group_promotion->is_image_auto_resizing = NULL;
    }
    if (product_group_promotion->is_mdl) {
        free(product_group_promotion->is_mdl);
        product_group_promotion->is_mdl = NULL;
    }
    if (product_group_promotion->parent_id) {
        free(product_group_promotion->parent_id);
        product_group_promotion->parent_id = NULL;
    }
    if (product_group_promotion->relative_definition) {
        free(product_group_promotion->relative_definition);
        product_group_promotion->relative_definition = NULL;
    }
    if (product_group_promotion->selected_image_tag) {
        free(product_group_promotion->selected_image_tag);
        product_group_promotion->selected_image_tag = NULL;
    }
    if (product_group_promotion->selected_video_tag) {
        free(product_group_promotion->selected_video_tag);
        product_group_promotion->selected_video_tag = NULL;
    }
    if (product_group_promotion->slideshow_collections_description) {
        free(product_group_promotion->slideshow_collections_description);
        product_group_promotion->slideshow_collections_description = NULL;
    }
    if (product_group_promotion->slideshow_collections_title) {
        free(product_group_promotion->slideshow_collections_title);
        product_group_promotion->slideshow_collections_title = NULL;
    }
    if (product_group_promotion->tracking_url) {
        free(product_group_promotion->tracking_url);
        product_group_promotion->tracking_url = NULL;
    }
    free(product_group_promotion);
}

cJSON *product_group_promotion_convertToJSON(product_group_promotion_t *product_group_promotion) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotion->ad_group_id
    if(product_group_promotion->ad_group_id) {
    if(cJSON_AddStringToObject(item, "ad_group_id", product_group_promotion->ad_group_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->bid_in_micro_currency
    if(product_group_promotion->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", *product_group_promotion->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // product_group_promotion->catalog_product_group_id
    if(product_group_promotion->catalog_product_group_id) {
    if(cJSON_AddStringToObject(item, "catalog_product_group_id", product_group_promotion->catalog_product_group_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->catalog_product_group_name
    if(product_group_promotion->catalog_product_group_name) {
    if(cJSON_AddStringToObject(item, "catalog_product_group_name", product_group_promotion->catalog_product_group_name) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->collections_header_type
    if(product_group_promotion->collections_header_type != pinterest_rest_api_collections_header_type__NULL) {
    cJSON *collections_header_type_local_JSON = collections_header_type_convertToJSON(product_group_promotion->collections_header_type);
    if(collections_header_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "collections_header_type", collections_header_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion->collections_hero_destination_url
    if(product_group_promotion->collections_hero_destination_url) {
    if(cJSON_AddStringToObject(item, "collections_hero_destination_url", product_group_promotion->collections_hero_destination_url) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->collections_hero_pin_id
    if(product_group_promotion->collections_hero_pin_id) {
    if(cJSON_AddStringToObject(item, "collections_hero_pin_id", product_group_promotion->collections_hero_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->creative_type
    if(product_group_promotion->creative_type != pinterest_rest_api_creative_type__NULL) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(product_group_promotion->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion->customizable_cta_type
    if(product_group_promotion->customizable_cta_type != pinterest_rest_api_product_group_promotion_customizable_cta_type__NULL) {
    cJSON *customizable_cta_type_local_JSON = product_group_promotion_customizable_cta_type_convertToJSON(product_group_promotion->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion->definition
    if(product_group_promotion->definition) {
    if(cJSON_AddStringToObject(item, "definition", product_group_promotion->definition) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->grid_click_type
    if(product_group_promotion->grid_click_type != pinterest_rest_api_grid_click_type__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(product_group_promotion->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion->id
    if(product_group_promotion->id) {
    if(cJSON_AddStringToObject(item, "id", product_group_promotion->id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->included
    if(product_group_promotion->included) {
    if(cJSON_AddBoolToObject(item, "included", *product_group_promotion->included) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion->is_generate_background
    if(product_group_promotion->is_generate_background) {
    if(cJSON_AddBoolToObject(item, "is_generate_background", *product_group_promotion->is_generate_background) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion->is_image_auto_resizing
    if(product_group_promotion->is_image_auto_resizing) {
    if(cJSON_AddBoolToObject(item, "is_image_auto_resizing", *product_group_promotion->is_image_auto_resizing) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion->is_mdl
    if(product_group_promotion->is_mdl) {
    if(cJSON_AddBoolToObject(item, "is_mdl", *product_group_promotion->is_mdl) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion->parent_id
    if(product_group_promotion->parent_id) {
    if(cJSON_AddStringToObject(item, "parent_id", product_group_promotion->parent_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->preferred_media_type
    if(product_group_promotion->preferred_media_type != pinterest_rest_api_preferred_media_type__NULL) {
    cJSON *preferred_media_type_local_JSON = preferred_media_type_convertToJSON(product_group_promotion->preferred_media_type);
    if(preferred_media_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "preferred_media_type", preferred_media_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion->relative_definition
    if(product_group_promotion->relative_definition) {
    if(cJSON_AddStringToObject(item, "relative_definition", product_group_promotion->relative_definition) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->selected_image_tag
    if(product_group_promotion->selected_image_tag) {
    if(cJSON_AddStringToObject(item, "selected_image_tag", product_group_promotion->selected_image_tag) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->selected_video_tag
    if(product_group_promotion->selected_video_tag) {
    if(cJSON_AddStringToObject(item, "selected_video_tag", product_group_promotion->selected_video_tag) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->slideshow_collections_description
    if(product_group_promotion->slideshow_collections_description) {
    if(cJSON_AddStringToObject(item, "slideshow_collections_description", product_group_promotion->slideshow_collections_description) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->slideshow_collections_title
    if(product_group_promotion->slideshow_collections_title) {
    if(cJSON_AddStringToObject(item, "slideshow_collections_title", product_group_promotion->slideshow_collections_title) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->status
    if(product_group_promotion->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(product_group_promotion->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion->tracking_url
    if(product_group_promotion->tracking_url) {
    if(cJSON_AddStringToObject(item, "tracking_url", product_group_promotion->tracking_url) == NULL) {
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

product_group_promotion_t *product_group_promotion_parseFromJSON(cJSON *product_group_promotionJSON){

    product_group_promotion_t *product_group_promotion_local_var = NULL;

    char *ad_group_id_local_str = NULL;

    // define the local variable for product_group_promotion->bid_in_micro_currency
    int *bid_in_micro_currency_local_var = NULL;

    char *catalog_product_group_id_local_str = NULL;

    char *catalog_product_group_name_local_str = NULL;

    // define the local variable for product_group_promotion->collections_header_type
    pinterest_rest_api_collections_header_type__e collections_header_type_local_nonprim = 0;

    char *collections_hero_destination_url_local_str = NULL;

    char *collections_hero_pin_id_local_str = NULL;

    // define the local variable for product_group_promotion->creative_type
    pinterest_rest_api_creative_type__e creative_type_local_nonprim = 0;

    // define the local variable for product_group_promotion->customizable_cta_type
    pinterest_rest_api_product_group_promotion_customizable_cta_type__e customizable_cta_type_local_nonprim = 0;

    char *definition_local_str = NULL;

    // define the local variable for product_group_promotion->grid_click_type
    pinterest_rest_api_grid_click_type__e grid_click_type_local_nonprim = 0;

    char *id_local_str = NULL;

    // define the local variable for product_group_promotion->included
    int *included_local_var = NULL;

    // define the local variable for product_group_promotion->is_generate_background
    int *is_generate_background_local_var = NULL;

    // define the local variable for product_group_promotion->is_image_auto_resizing
    int *is_image_auto_resizing_local_var = NULL;

    // define the local variable for product_group_promotion->is_mdl
    int *is_mdl_local_var = NULL;

    char *parent_id_local_str = NULL;

    // define the local variable for product_group_promotion->preferred_media_type
    pinterest_rest_api_preferred_media_type__e preferred_media_type_local_nonprim = 0;

    char *relative_definition_local_str = NULL;

    char *selected_image_tag_local_str = NULL;

    char *selected_video_tag_local_str = NULL;

    char *slideshow_collections_description_local_str = NULL;

    char *slideshow_collections_title_local_str = NULL;

    // define the local variable for product_group_promotion->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    char *tracking_url_local_str = NULL;

    // product_group_promotion->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (ad_group_id) { 
    if(!cJSON_IsString(ad_group_id) && !cJSON_IsNull(ad_group_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "bid_in_micro_currency");
    if (cJSON_IsNull(bid_in_micro_currency)) {
        bid_in_micro_currency = NULL;
    }
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    bid_in_micro_currency_local_var = malloc(sizeof(int));
    if(!bid_in_micro_currency_local_var)
    {
        goto end;
    }
    *bid_in_micro_currency_local_var = bid_in_micro_currency->valuedouble;
    }

    // product_group_promotion->catalog_product_group_id
    cJSON *catalog_product_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "catalog_product_group_id");
    if (cJSON_IsNull(catalog_product_group_id)) {
        catalog_product_group_id = NULL;
    }
    if (catalog_product_group_id) { 
    if(!cJSON_IsString(catalog_product_group_id) && !cJSON_IsNull(catalog_product_group_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->catalog_product_group_name
    cJSON *catalog_product_group_name = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "catalog_product_group_name");
    if (cJSON_IsNull(catalog_product_group_name)) {
        catalog_product_group_name = NULL;
    }
    if (catalog_product_group_name) { 
    if(!cJSON_IsString(catalog_product_group_name) && !cJSON_IsNull(catalog_product_group_name))
    {
    goto end; //String
    }
    }

    // product_group_promotion->collections_header_type
    cJSON *collections_header_type = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "collections_header_type");
    if (cJSON_IsNull(collections_header_type)) {
        collections_header_type = NULL;
    }
    if (collections_header_type) { 
    collections_header_type_local_nonprim = collections_header_type_parseFromJSON(collections_header_type); //custom
    }

    // product_group_promotion->collections_hero_destination_url
    cJSON *collections_hero_destination_url = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "collections_hero_destination_url");
    if (cJSON_IsNull(collections_hero_destination_url)) {
        collections_hero_destination_url = NULL;
    }
    if (collections_hero_destination_url) { 
    if(!cJSON_IsString(collections_hero_destination_url) && !cJSON_IsNull(collections_hero_destination_url))
    {
    goto end; //String
    }
    }

    // product_group_promotion->collections_hero_pin_id
    cJSON *collections_hero_pin_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "collections_hero_pin_id");
    if (cJSON_IsNull(collections_hero_pin_id)) {
        collections_hero_pin_id = NULL;
    }
    if (collections_hero_pin_id) { 
    if(!cJSON_IsString(collections_hero_pin_id) && !cJSON_IsNull(collections_hero_pin_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // product_group_promotion->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = product_group_promotion_customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // product_group_promotion->definition
    cJSON *definition = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "definition");
    if (cJSON_IsNull(definition)) {
        definition = NULL;
    }
    if (definition) { 
    if(!cJSON_IsString(definition) && !cJSON_IsNull(definition))
    {
    goto end; //String
    }
    }

    // product_group_promotion->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "grid_click_type");
    if (cJSON_IsNull(grid_click_type)) {
        grid_click_type = NULL;
    }
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }

    // product_group_promotion->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->included
    cJSON *included = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "included");
    if (cJSON_IsNull(included)) {
        included = NULL;
    }
    if (included) { 
    if(!cJSON_IsBool(included))
    {
    goto end; //Bool
    }
    included_local_var = malloc(sizeof(int));
    if(!included_local_var)
    {
        goto end;
    }
    *included_local_var = included->valueint;
    }

    // product_group_promotion->is_generate_background
    cJSON *is_generate_background = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "is_generate_background");
    if (cJSON_IsNull(is_generate_background)) {
        is_generate_background = NULL;
    }
    if (is_generate_background) { 
    if(!cJSON_IsBool(is_generate_background))
    {
    goto end; //Bool
    }
    is_generate_background_local_var = malloc(sizeof(int));
    if(!is_generate_background_local_var)
    {
        goto end;
    }
    *is_generate_background_local_var = is_generate_background->valueint;
    }

    // product_group_promotion->is_image_auto_resizing
    cJSON *is_image_auto_resizing = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "is_image_auto_resizing");
    if (cJSON_IsNull(is_image_auto_resizing)) {
        is_image_auto_resizing = NULL;
    }
    if (is_image_auto_resizing) { 
    if(!cJSON_IsBool(is_image_auto_resizing))
    {
    goto end; //Bool
    }
    is_image_auto_resizing_local_var = malloc(sizeof(int));
    if(!is_image_auto_resizing_local_var)
    {
        goto end;
    }
    *is_image_auto_resizing_local_var = is_image_auto_resizing->valueint;
    }

    // product_group_promotion->is_mdl
    cJSON *is_mdl = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "is_mdl");
    if (cJSON_IsNull(is_mdl)) {
        is_mdl = NULL;
    }
    if (is_mdl) { 
    if(!cJSON_IsBool(is_mdl))
    {
    goto end; //Bool
    }
    is_mdl_local_var = malloc(sizeof(int));
    if(!is_mdl_local_var)
    {
        goto end;
    }
    *is_mdl_local_var = is_mdl->valueint;
    }

    // product_group_promotion->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "parent_id");
    if (cJSON_IsNull(parent_id)) {
        parent_id = NULL;
    }
    if (parent_id) { 
    if(!cJSON_IsString(parent_id) && !cJSON_IsNull(parent_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->preferred_media_type
    cJSON *preferred_media_type = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "preferred_media_type");
    if (cJSON_IsNull(preferred_media_type)) {
        preferred_media_type = NULL;
    }
    if (preferred_media_type) { 
    preferred_media_type_local_nonprim = preferred_media_type_parseFromJSON(preferred_media_type); //custom
    }

    // product_group_promotion->relative_definition
    cJSON *relative_definition = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "relative_definition");
    if (cJSON_IsNull(relative_definition)) {
        relative_definition = NULL;
    }
    if (relative_definition) { 
    if(!cJSON_IsString(relative_definition) && !cJSON_IsNull(relative_definition))
    {
    goto end; //String
    }
    }

    // product_group_promotion->selected_image_tag
    cJSON *selected_image_tag = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "selected_image_tag");
    if (cJSON_IsNull(selected_image_tag)) {
        selected_image_tag = NULL;
    }
    if (selected_image_tag) { 
    if(!cJSON_IsString(selected_image_tag) && !cJSON_IsNull(selected_image_tag))
    {
    goto end; //String
    }
    }

    // product_group_promotion->selected_video_tag
    cJSON *selected_video_tag = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "selected_video_tag");
    if (cJSON_IsNull(selected_video_tag)) {
        selected_video_tag = NULL;
    }
    if (selected_video_tag) { 
    if(!cJSON_IsString(selected_video_tag) && !cJSON_IsNull(selected_video_tag))
    {
    goto end; //String
    }
    }

    // product_group_promotion->slideshow_collections_description
    cJSON *slideshow_collections_description = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "slideshow_collections_description");
    if (cJSON_IsNull(slideshow_collections_description)) {
        slideshow_collections_description = NULL;
    }
    if (slideshow_collections_description) { 
    if(!cJSON_IsString(slideshow_collections_description) && !cJSON_IsNull(slideshow_collections_description))
    {
    goto end; //String
    }
    }

    // product_group_promotion->slideshow_collections_title
    cJSON *slideshow_collections_title = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "slideshow_collections_title");
    if (cJSON_IsNull(slideshow_collections_title)) {
        slideshow_collections_title = NULL;
    }
    if (slideshow_collections_title) { 
    if(!cJSON_IsString(slideshow_collections_title) && !cJSON_IsNull(slideshow_collections_title))
    {
    goto end; //String
    }
    }

    // product_group_promotion->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // product_group_promotion->tracking_url
    cJSON *tracking_url = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "tracking_url");
    if (cJSON_IsNull(tracking_url)) {
        tracking_url = NULL;
    }
    if (tracking_url) { 
    if(!cJSON_IsString(tracking_url) && !cJSON_IsNull(tracking_url))
    {
    goto end; //String
    }
    }


    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (catalog_product_group_id && !cJSON_IsNull(catalog_product_group_id)) catalog_product_group_id_local_str = strdup(catalog_product_group_id->valuestring);
    if (catalog_product_group_name && !cJSON_IsNull(catalog_product_group_name)) catalog_product_group_name_local_str = strdup(catalog_product_group_name->valuestring);
    if (collections_hero_destination_url && !cJSON_IsNull(collections_hero_destination_url)) collections_hero_destination_url_local_str = strdup(collections_hero_destination_url->valuestring);
    if (collections_hero_pin_id && !cJSON_IsNull(collections_hero_pin_id)) collections_hero_pin_id_local_str = strdup(collections_hero_pin_id->valuestring);
    if (definition && !cJSON_IsNull(definition)) definition_local_str = strdup(definition->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (parent_id && !cJSON_IsNull(parent_id)) parent_id_local_str = strdup(parent_id->valuestring);
    if (relative_definition && !cJSON_IsNull(relative_definition)) relative_definition_local_str = strdup(relative_definition->valuestring);
    if (selected_image_tag && !cJSON_IsNull(selected_image_tag)) selected_image_tag_local_str = strdup(selected_image_tag->valuestring);
    if (selected_video_tag && !cJSON_IsNull(selected_video_tag)) selected_video_tag_local_str = strdup(selected_video_tag->valuestring);
    if (slideshow_collections_description && !cJSON_IsNull(slideshow_collections_description)) slideshow_collections_description_local_str = strdup(slideshow_collections_description->valuestring);
    if (slideshow_collections_title && !cJSON_IsNull(slideshow_collections_title)) slideshow_collections_title_local_str = strdup(slideshow_collections_title->valuestring);
    if (tracking_url && !cJSON_IsNull(tracking_url)) tracking_url_local_str = strdup(tracking_url->valuestring);

    product_group_promotion_local_var = product_group_promotion_create_internal (
        ad_group_id_local_str,
        bid_in_micro_currency_local_var,
        catalog_product_group_id_local_str,
        catalog_product_group_name_local_str,
        collections_header_type ? collections_header_type_local_nonprim : 0,
        collections_hero_destination_url_local_str,
        collections_hero_pin_id_local_str,
        creative_type ? creative_type_local_nonprim : 0,
        customizable_cta_type ? customizable_cta_type_local_nonprim : 0,
        definition_local_str,
        grid_click_type ? grid_click_type_local_nonprim : 0,
        id_local_str,
        included_local_var,
        is_generate_background_local_var,
        is_image_auto_resizing_local_var,
        is_mdl_local_var,
        parent_id_local_str,
        preferred_media_type ? preferred_media_type_local_nonprim : 0,
        relative_definition_local_str,
        selected_image_tag_local_str,
        selected_video_tag_local_str,
        slideshow_collections_description_local_str,
        slideshow_collections_title_local_str,
        status ? status_local_nonprim : 0,
        tracking_url_local_str
        );

    if (!product_group_promotion_local_var) {
        goto end;
    }

    return product_group_promotion_local_var;
end:
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    if (bid_in_micro_currency_local_var) {
        free(bid_in_micro_currency_local_var);
        bid_in_micro_currency_local_var = NULL;
    }
    if (catalog_product_group_id_local_str) {
        free(catalog_product_group_id_local_str);
        catalog_product_group_id_local_str = NULL;
    }
    if (catalog_product_group_name_local_str) {
        free(catalog_product_group_name_local_str);
        catalog_product_group_name_local_str = NULL;
    }
    if (collections_header_type_local_nonprim) {
        collections_header_type_local_nonprim = 0;
    }
    if (collections_hero_destination_url_local_str) {
        free(collections_hero_destination_url_local_str);
        collections_hero_destination_url_local_str = NULL;
    }
    if (collections_hero_pin_id_local_str) {
        free(collections_hero_pin_id_local_str);
        collections_hero_pin_id_local_str = NULL;
    }
    if (creative_type_local_nonprim) {
        creative_type_local_nonprim = 0;
    }
    if (customizable_cta_type_local_nonprim) {
        customizable_cta_type_local_nonprim = 0;
    }
    if (definition_local_str) {
        free(definition_local_str);
        definition_local_str = NULL;
    }
    if (grid_click_type_local_nonprim) {
        grid_click_type_local_nonprim = 0;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (included_local_var) {
        free(included_local_var);
        included_local_var = NULL;
    }
    if (is_generate_background_local_var) {
        free(is_generate_background_local_var);
        is_generate_background_local_var = NULL;
    }
    if (is_image_auto_resizing_local_var) {
        free(is_image_auto_resizing_local_var);
        is_image_auto_resizing_local_var = NULL;
    }
    if (is_mdl_local_var) {
        free(is_mdl_local_var);
        is_mdl_local_var = NULL;
    }
    if (parent_id_local_str) {
        free(parent_id_local_str);
        parent_id_local_str = NULL;
    }
    if (preferred_media_type_local_nonprim) {
        preferred_media_type_local_nonprim = 0;
    }
    if (relative_definition_local_str) {
        free(relative_definition_local_str);
        relative_definition_local_str = NULL;
    }
    if (selected_image_tag_local_str) {
        free(selected_image_tag_local_str);
        selected_image_tag_local_str = NULL;
    }
    if (selected_video_tag_local_str) {
        free(selected_video_tag_local_str);
        selected_video_tag_local_str = NULL;
    }
    if (slideshow_collections_description_local_str) {
        free(slideshow_collections_description_local_str);
        slideshow_collections_description_local_str = NULL;
    }
    if (slideshow_collections_title_local_str) {
        free(slideshow_collections_title_local_str);
        slideshow_collections_title_local_str = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (tracking_url_local_str) {
        free(tracking_url_local_str);
        tracking_url_local_str = NULL;
    }
    return NULL;

}
