#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_delivery_estimates_keywords_items.h"



static ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items_create_internal(
    nullalble_match_type_t *match_type,
    char *value
    ) {
    ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items_local_var = malloc(sizeof(ad_group_delivery_estimates_keywords_items_t));
    if (!ad_group_delivery_estimates_keywords_items_local_var) {
        return NULL;
    }
    memset(ad_group_delivery_estimates_keywords_items_local_var, 0, sizeof(ad_group_delivery_estimates_keywords_items_t));
    ad_group_delivery_estimates_keywords_items_local_var->_library_owned = 1;
    ad_group_delivery_estimates_keywords_items_local_var->match_type = match_type;
    ad_group_delivery_estimates_keywords_items_local_var->value = value;
    return ad_group_delivery_estimates_keywords_items_local_var;
}

__attribute__((deprecated)) ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items_create(
    nullalble_match_type_t *match_type,
    char *value
    ) {
    ad_group_delivery_estimates_keywords_items_t *result = ad_group_delivery_estimates_keywords_items_create_internal (
        match_type,
        value
        );
    if (!result) {
    }
    return result;
}

void ad_group_delivery_estimates_keywords_items_free(ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items) {
    if(NULL == ad_group_delivery_estimates_keywords_items){
        return ;
    }
    if(ad_group_delivery_estimates_keywords_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_delivery_estimates_keywords_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_delivery_estimates_keywords_items->match_type) {
        nullalble_match_type_free(ad_group_delivery_estimates_keywords_items->match_type);
        ad_group_delivery_estimates_keywords_items->match_type = NULL;
    }
    if (ad_group_delivery_estimates_keywords_items->value) {
        free(ad_group_delivery_estimates_keywords_items->value);
        ad_group_delivery_estimates_keywords_items->value = NULL;
    }
    free(ad_group_delivery_estimates_keywords_items);
}

cJSON *ad_group_delivery_estimates_keywords_items_convertToJSON(ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_delivery_estimates_keywords_items->match_type
    if (!ad_group_delivery_estimates_keywords_items->match_type) {
        goto fail;
    }
    cJSON *match_type_local_JSON = nullalble_match_type_convertToJSON(ad_group_delivery_estimates_keywords_items->match_type);
    if(match_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "match_type", match_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_group_delivery_estimates_keywords_items->value
    if (!ad_group_delivery_estimates_keywords_items->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", ad_group_delivery_estimates_keywords_items->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items_parseFromJSON(cJSON *ad_group_delivery_estimates_keywords_itemsJSON){

    ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items_local_var = NULL;

    // define the local variable for ad_group_delivery_estimates_keywords_items->match_type
    nullalble_match_type_t *match_type_local_nonprim = NULL;

    char *value_local_str = NULL;

    // ad_group_delivery_estimates_keywords_items->match_type
    cJSON *match_type = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimates_keywords_itemsJSON, "match_type");
    if (cJSON_IsNull(match_type)) {
        match_type = NULL;
    }
    if (!match_type) {
        goto end;
    }

    
    match_type_local_nonprim = nullalble_match_type_parseFromJSON(match_type); //custom

    // ad_group_delivery_estimates_keywords_items->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimates_keywords_itemsJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    ad_group_delivery_estimates_keywords_items_local_var = ad_group_delivery_estimates_keywords_items_create_internal (
        match_type_local_nonprim,
        value_local_str
        );

    if (!ad_group_delivery_estimates_keywords_items_local_var) {
        goto end;
    }

    return ad_group_delivery_estimates_keywords_items_local_var;
end:
    if (match_type_local_nonprim) {
        nullalble_match_type_free(match_type_local_nonprim);
        match_type_local_nonprim = NULL;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
