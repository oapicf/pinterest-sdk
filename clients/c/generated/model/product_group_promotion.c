#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotion.h"


char* product_group_promotion_status_ToString(pinterest_rest_api_product_group_promotion__e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return statusArray[status];
}

pinterest_rest_api_product_group_promotion__e product_group_promotion_status_FromString(char* status){
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
char* product_group_promotion_creative_type_ToString(pinterest_rest_api_product_group_promotion__e creative_type) {
    char* creative_typeArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA", "SHOWCASE", "QUIZ" };
    return creative_typeArray[creative_type];
}

pinterest_rest_api_product_group_promotion__e product_group_promotion_creative_type_FromString(char* creative_type){
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
char* product_group_promotion_grid_click_type_ToString(pinterest_rest_api_product_group_promotion__e grid_click_type) {
    char* grid_click_typeArray[] =  { "NULL", "CLOSEUP", "DIRECT_TO_DESTINATION" };
    return grid_click_typeArray[grid_click_type];
}

pinterest_rest_api_product_group_promotion__e product_group_promotion_grid_click_type_FromString(char* grid_click_type){
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

product_group_promotion_t *product_group_promotion_create(
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
    entity_status_t *status,
    char *tracking_url,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    creative_type_t *creative_type,
    char *collections_hero_pin_id,
    char *collections_hero_destination_url,
    grid_click_type_t *grid_click_type
    ) {
    product_group_promotion_t *product_group_promotion_local_var = malloc(sizeof(product_group_promotion_t));
    if (!product_group_promotion_local_var) {
        return NULL;
    }
    product_group_promotion_local_var->id = id;
    product_group_promotion_local_var->ad_group_id = ad_group_id;
    product_group_promotion_local_var->bid_in_micro_currency = bid_in_micro_currency;
    product_group_promotion_local_var->included = included;
    product_group_promotion_local_var->definition = definition;
    product_group_promotion_local_var->relative_definition = relative_definition;
    product_group_promotion_local_var->parent_id = parent_id;
    product_group_promotion_local_var->slideshow_collections_title = slideshow_collections_title;
    product_group_promotion_local_var->slideshow_collections_description = slideshow_collections_description;
    product_group_promotion_local_var->is_mdl = is_mdl;
    product_group_promotion_local_var->status = status;
    product_group_promotion_local_var->tracking_url = tracking_url;
    product_group_promotion_local_var->catalog_product_group_id = catalog_product_group_id;
    product_group_promotion_local_var->catalog_product_group_name = catalog_product_group_name;
    product_group_promotion_local_var->creative_type = creative_type;
    product_group_promotion_local_var->collections_hero_pin_id = collections_hero_pin_id;
    product_group_promotion_local_var->collections_hero_destination_url = collections_hero_destination_url;
    product_group_promotion_local_var->grid_click_type = grid_click_type;

    return product_group_promotion_local_var;
}


void product_group_promotion_free(product_group_promotion_t *product_group_promotion) {
    if(NULL == product_group_promotion){
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotion->id) {
        free(product_group_promotion->id);
        product_group_promotion->id = NULL;
    }
    if (product_group_promotion->ad_group_id) {
        free(product_group_promotion->ad_group_id);
        product_group_promotion->ad_group_id = NULL;
    }
    if (product_group_promotion->definition) {
        free(product_group_promotion->definition);
        product_group_promotion->definition = NULL;
    }
    if (product_group_promotion->relative_definition) {
        free(product_group_promotion->relative_definition);
        product_group_promotion->relative_definition = NULL;
    }
    if (product_group_promotion->parent_id) {
        free(product_group_promotion->parent_id);
        product_group_promotion->parent_id = NULL;
    }
    if (product_group_promotion->slideshow_collections_title) {
        free(product_group_promotion->slideshow_collections_title);
        product_group_promotion->slideshow_collections_title = NULL;
    }
    if (product_group_promotion->slideshow_collections_description) {
        free(product_group_promotion->slideshow_collections_description);
        product_group_promotion->slideshow_collections_description = NULL;
    }
    if (product_group_promotion->status) {
        entity_status_free(product_group_promotion->status);
        product_group_promotion->status = NULL;
    }
    if (product_group_promotion->tracking_url) {
        free(product_group_promotion->tracking_url);
        product_group_promotion->tracking_url = NULL;
    }
    if (product_group_promotion->catalog_product_group_id) {
        free(product_group_promotion->catalog_product_group_id);
        product_group_promotion->catalog_product_group_id = NULL;
    }
    if (product_group_promotion->catalog_product_group_name) {
        free(product_group_promotion->catalog_product_group_name);
        product_group_promotion->catalog_product_group_name = NULL;
    }
    if (product_group_promotion->creative_type) {
        creative_type_free(product_group_promotion->creative_type);
        product_group_promotion->creative_type = NULL;
    }
    if (product_group_promotion->collections_hero_pin_id) {
        free(product_group_promotion->collections_hero_pin_id);
        product_group_promotion->collections_hero_pin_id = NULL;
    }
    if (product_group_promotion->collections_hero_destination_url) {
        free(product_group_promotion->collections_hero_destination_url);
        product_group_promotion->collections_hero_destination_url = NULL;
    }
    if (product_group_promotion->grid_click_type) {
        grid_click_type_free(product_group_promotion->grid_click_type);
        product_group_promotion->grid_click_type = NULL;
    }
    free(product_group_promotion);
}

cJSON *product_group_promotion_convertToJSON(product_group_promotion_t *product_group_promotion) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotion->id
    if(product_group_promotion->id) {
    if(cJSON_AddStringToObject(item, "id", product_group_promotion->id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->ad_group_id
    if(product_group_promotion->ad_group_id) {
    if(cJSON_AddStringToObject(item, "ad_group_id", product_group_promotion->ad_group_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->bid_in_micro_currency
    if(product_group_promotion->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", product_group_promotion->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // product_group_promotion->included
    if(product_group_promotion->included) {
    if(cJSON_AddBoolToObject(item, "included", product_group_promotion->included) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion->definition
    if(product_group_promotion->definition) {
    if(cJSON_AddStringToObject(item, "definition", product_group_promotion->definition) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->relative_definition
    if(product_group_promotion->relative_definition) {
    if(cJSON_AddStringToObject(item, "relative_definition", product_group_promotion->relative_definition) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->parent_id
    if(product_group_promotion->parent_id) {
    if(cJSON_AddStringToObject(item, "parent_id", product_group_promotion->parent_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->slideshow_collections_title
    if(product_group_promotion->slideshow_collections_title) {
    if(cJSON_AddStringToObject(item, "slideshow_collections_title", product_group_promotion->slideshow_collections_title) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->slideshow_collections_description
    if(product_group_promotion->slideshow_collections_description) {
    if(cJSON_AddStringToObject(item, "slideshow_collections_description", product_group_promotion->slideshow_collections_description) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->is_mdl
    if(product_group_promotion->is_mdl) {
    if(cJSON_AddBoolToObject(item, "is_mdl", product_group_promotion->is_mdl) == NULL) {
    goto fail; //Bool
    }
    }


    // product_group_promotion->status
    if(product_group_promotion->status != pinterest_rest_api_product_group_promotion__NULL) {
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


    // product_group_promotion->creative_type
    if(product_group_promotion->creative_type != pinterest_rest_api_product_group_promotion__NULL) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(product_group_promotion->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // product_group_promotion->collections_hero_pin_id
    if(product_group_promotion->collections_hero_pin_id) {
    if(cJSON_AddStringToObject(item, "collections_hero_pin_id", product_group_promotion->collections_hero_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->collections_hero_destination_url
    if(product_group_promotion->collections_hero_destination_url) {
    if(cJSON_AddStringToObject(item, "collections_hero_destination_url", product_group_promotion->collections_hero_destination_url) == NULL) {
    goto fail; //String
    }
    }


    // product_group_promotion->grid_click_type
    if(product_group_promotion->grid_click_type != pinterest_rest_api_product_group_promotion__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(product_group_promotion->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
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

product_group_promotion_t *product_group_promotion_parseFromJSON(cJSON *product_group_promotionJSON){

    product_group_promotion_t *product_group_promotion_local_var = NULL;

    // define the local variable for product_group_promotion->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for product_group_promotion->creative_type
    creative_type_t *creative_type_local_nonprim = NULL;

    // define the local variable for product_group_promotion->grid_click_type
    grid_click_type_t *grid_click_type_local_nonprim = NULL;

    // product_group_promotion->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "ad_group_id");
    if (ad_group_id) { 
    if(!cJSON_IsString(ad_group_id) && !cJSON_IsNull(ad_group_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "bid_in_micro_currency");
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // product_group_promotion->included
    cJSON *included = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "included");
    if (included) { 
    if(!cJSON_IsBool(included))
    {
    goto end; //Bool
    }
    }

    // product_group_promotion->definition
    cJSON *definition = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "definition");
    if (definition) { 
    if(!cJSON_IsString(definition) && !cJSON_IsNull(definition))
    {
    goto end; //String
    }
    }

    // product_group_promotion->relative_definition
    cJSON *relative_definition = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "relative_definition");
    if (relative_definition) { 
    if(!cJSON_IsString(relative_definition) && !cJSON_IsNull(relative_definition))
    {
    goto end; //String
    }
    }

    // product_group_promotion->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "parent_id");
    if (parent_id) { 
    if(!cJSON_IsString(parent_id) && !cJSON_IsNull(parent_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->slideshow_collections_title
    cJSON *slideshow_collections_title = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "slideshow_collections_title");
    if (slideshow_collections_title) { 
    if(!cJSON_IsString(slideshow_collections_title) && !cJSON_IsNull(slideshow_collections_title))
    {
    goto end; //String
    }
    }

    // product_group_promotion->slideshow_collections_description
    cJSON *slideshow_collections_description = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "slideshow_collections_description");
    if (slideshow_collections_description) { 
    if(!cJSON_IsString(slideshow_collections_description) && !cJSON_IsNull(slideshow_collections_description))
    {
    goto end; //String
    }
    }

    // product_group_promotion->is_mdl
    cJSON *is_mdl = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "is_mdl");
    if (is_mdl) { 
    if(!cJSON_IsBool(is_mdl))
    {
    goto end; //Bool
    }
    }

    // product_group_promotion->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "status");
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // product_group_promotion->tracking_url
    cJSON *tracking_url = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "tracking_url");
    if (tracking_url) { 
    if(!cJSON_IsString(tracking_url) && !cJSON_IsNull(tracking_url))
    {
    goto end; //String
    }
    }

    // product_group_promotion->catalog_product_group_id
    cJSON *catalog_product_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "catalog_product_group_id");
    if (catalog_product_group_id) { 
    if(!cJSON_IsString(catalog_product_group_id) && !cJSON_IsNull(catalog_product_group_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->catalog_product_group_name
    cJSON *catalog_product_group_name = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "catalog_product_group_name");
    if (catalog_product_group_name) { 
    if(!cJSON_IsString(catalog_product_group_name) && !cJSON_IsNull(catalog_product_group_name))
    {
    goto end; //String
    }
    }

    // product_group_promotion->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "creative_type");
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // product_group_promotion->collections_hero_pin_id
    cJSON *collections_hero_pin_id = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "collections_hero_pin_id");
    if (collections_hero_pin_id) { 
    if(!cJSON_IsString(collections_hero_pin_id) && !cJSON_IsNull(collections_hero_pin_id))
    {
    goto end; //String
    }
    }

    // product_group_promotion->collections_hero_destination_url
    cJSON *collections_hero_destination_url = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "collections_hero_destination_url");
    if (collections_hero_destination_url) { 
    if(!cJSON_IsString(collections_hero_destination_url) && !cJSON_IsNull(collections_hero_destination_url))
    {
    goto end; //String
    }
    }

    // product_group_promotion->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(product_group_promotionJSON, "grid_click_type");
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }


    product_group_promotion_local_var = product_group_promotion_create (
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
        status ? status_local_nonprim : NULL,
        tracking_url && !cJSON_IsNull(tracking_url) ? strdup(tracking_url->valuestring) : NULL,
        catalog_product_group_id && !cJSON_IsNull(catalog_product_group_id) ? strdup(catalog_product_group_id->valuestring) : NULL,
        catalog_product_group_name && !cJSON_IsNull(catalog_product_group_name) ? strdup(catalog_product_group_name->valuestring) : NULL,
        creative_type ? creative_type_local_nonprim : NULL,
        collections_hero_pin_id && !cJSON_IsNull(collections_hero_pin_id) ? strdup(collections_hero_pin_id->valuestring) : NULL,
        collections_hero_destination_url && !cJSON_IsNull(collections_hero_destination_url) ? strdup(collections_hero_destination_url->valuestring) : NULL,
        grid_click_type ? grid_click_type_local_nonprim : NULL
        );

    return product_group_promotion_local_var;
end:
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (creative_type_local_nonprim) {
        creative_type_free(creative_type_local_nonprim);
        creative_type_local_nonprim = NULL;
    }
    if (grid_click_type_local_nonprim) {
        grid_click_type_free(grid_click_type_local_nonprim);
        grid_click_type_local_nonprim = NULL;
    }
    return NULL;

}
