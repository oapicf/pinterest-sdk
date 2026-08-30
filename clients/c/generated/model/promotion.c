#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotion.h"



static promotion_t *promotion_create_internal(
    char *ad_account_id,
    pinterest_rest_api_discount_status__e discount_status,
    int *end_time,
    char *external_id,
    char *id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int *start_time,
    entity_status_t *status,
    list_t *template_values
    ) {
    promotion_t *promotion_local_var = malloc(sizeof(promotion_t));
    if (!promotion_local_var) {
        return NULL;
    }
    memset(promotion_local_var, 0, sizeof(promotion_t));
    promotion_local_var->_library_owned = 1;
    promotion_local_var->ad_account_id = ad_account_id;
    promotion_local_var->discount_status = discount_status;
    promotion_local_var->end_time = end_time;
    promotion_local_var->external_id = external_id;
    promotion_local_var->id = id;
    promotion_local_var->platform_type = platform_type;
    promotion_local_var->promotion_code = promotion_code;
    promotion_local_var->promotion_custom_id = promotion_custom_id;
    promotion_local_var->promotion_title = promotion_title;
    promotion_local_var->promotion_type = promotion_type;
    promotion_local_var->start_time = start_time;
    promotion_local_var->status = status;
    promotion_local_var->template_values = template_values;
    return promotion_local_var;
}

__attribute__((deprecated)) promotion_t *promotion_create(
    char *ad_account_id,
    pinterest_rest_api_discount_status__e discount_status,
    int *end_time,
    char *external_id,
    char *id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int *start_time,
    entity_status_t *status,
    list_t *template_values
    ) {
    int *end_time_copy = NULL;
    if (end_time) {
        end_time_copy = malloc(sizeof(int));
        if (end_time_copy) *end_time_copy = *end_time;
    }
    int *start_time_copy = NULL;
    if (start_time) {
        start_time_copy = malloc(sizeof(int));
        if (start_time_copy) *start_time_copy = *start_time;
    }
    promotion_t *result = promotion_create_internal (
        ad_account_id,
        discount_status,
        end_time_copy,
        external_id,
        id,
        platform_type,
        promotion_code,
        promotion_custom_id,
        promotion_title,
        promotion_type,
        start_time_copy,
        status,
        template_values
        );
    if (!result) {
        free(end_time_copy);
        free(start_time_copy);
    }
    return result;
}

void promotion_free(promotion_t *promotion) {
    if(NULL == promotion){
        return ;
    }
    if(promotion->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "promotion_free");
        return ;
    }
    listEntry_t *listEntry;
    if (promotion->ad_account_id) {
        free(promotion->ad_account_id);
        promotion->ad_account_id = NULL;
    }
    if (promotion->end_time) {
        free(promotion->end_time);
        promotion->end_time = NULL;
    }
    if (promotion->external_id) {
        free(promotion->external_id);
        promotion->external_id = NULL;
    }
    if (promotion->id) {
        free(promotion->id);
        promotion->id = NULL;
    }
    if (promotion->platform_type) {
        free(promotion->platform_type);
        promotion->platform_type = NULL;
    }
    if (promotion->promotion_code) {
        free(promotion->promotion_code);
        promotion->promotion_code = NULL;
    }
    if (promotion->promotion_custom_id) {
        free(promotion->promotion_custom_id);
        promotion->promotion_custom_id = NULL;
    }
    if (promotion->promotion_title) {
        free(promotion->promotion_title);
        promotion->promotion_title = NULL;
    }
    if (promotion->start_time) {
        free(promotion->start_time);
        promotion->start_time = NULL;
    }
    if (promotion->status) {
        entity_status_free(promotion->status);
        promotion->status = NULL;
    }
    if (promotion->template_values) {
        list_ForEach(listEntry, promotion->template_values) {
            promotion_template_value_free(listEntry->data);
        }
        list_freeList(promotion->template_values);
        promotion->template_values = NULL;
    }
    free(promotion);
}

cJSON *promotion_convertToJSON(promotion_t *promotion) {
    cJSON *item = cJSON_CreateObject();

    // promotion->ad_account_id
    if (!promotion->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", promotion->ad_account_id) == NULL) {
    goto fail; //String
    }


    // promotion->discount_status
    if(promotion->discount_status != pinterest_rest_api_discount_status__NULL) {
    cJSON *discount_status_local_JSON = discount_status_convertToJSON(promotion->discount_status);
    if(discount_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "discount_status", discount_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // promotion->end_time
    if(promotion->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", *promotion->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // promotion->external_id
    if(promotion->external_id) {
    if(cJSON_AddStringToObject(item, "external_id", promotion->external_id) == NULL) {
    goto fail; //String
    }
    }


    // promotion->id
    if (!promotion->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", promotion->id) == NULL) {
    goto fail; //String
    }


    // promotion->platform_type
    if(promotion->platform_type) {
    if(cJSON_AddStringToObject(item, "platform_type", promotion->platform_type) == NULL) {
    goto fail; //String
    }
    }


    // promotion->promotion_code
    if(promotion->promotion_code) {
    if(cJSON_AddStringToObject(item, "promotion_code", promotion->promotion_code) == NULL) {
    goto fail; //String
    }
    }


    // promotion->promotion_custom_id
    if(promotion->promotion_custom_id) {
    if(cJSON_AddStringToObject(item, "promotion_custom_id", promotion->promotion_custom_id) == NULL) {
    goto fail; //String
    }
    }


    // promotion->promotion_title
    if (!promotion->promotion_title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "promotion_title", promotion->promotion_title) == NULL) {
    goto fail; //String
    }


    // promotion->promotion_type
    if (pinterest_rest_api_promotion_type__NULL == promotion->promotion_type) {
        goto fail;
    }
    cJSON *promotion_type_local_JSON = promotion_type_convertToJSON(promotion->promotion_type);
    if(promotion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "promotion_type", promotion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // promotion->start_time
    if(promotion->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", *promotion->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // promotion->status
    if(promotion->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(promotion->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // promotion->template_values
    if(promotion->template_values) {
    cJSON *template_values = cJSON_AddArrayToObject(item, "template_values");
    if(template_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *template_valuesListEntry;
    if (promotion->template_values) {
    list_ForEach(template_valuesListEntry, promotion->template_values) {
    cJSON *itemLocal = promotion_template_value_convertToJSON(template_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(template_values, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promotion_t *promotion_parseFromJSON(cJSON *promotionJSON){

    promotion_t *promotion_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for promotion->discount_status
    pinterest_rest_api_discount_status__e discount_status_local_nonprim = 0;

    // define the local variable for promotion->end_time
    int *end_time_local_var = NULL;

    char *external_id_local_str = NULL;

    char *id_local_str = NULL;

    char *platform_type_local_str = NULL;

    char *promotion_code_local_str = NULL;

    char *promotion_custom_id_local_str = NULL;

    char *promotion_title_local_str = NULL;

    // define the local variable for promotion->promotion_type
    pinterest_rest_api_promotion_type__e promotion_type_local_nonprim = 0;

    // define the local variable for promotion->start_time
    int *start_time_local_var = NULL;

    // define the local variable for promotion->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local list for promotion->template_values
    list_t *template_valuesList = NULL;

    // promotion->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(promotionJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // promotion->discount_status
    cJSON *discount_status = cJSON_GetObjectItemCaseSensitive(promotionJSON, "discount_status");
    if (cJSON_IsNull(discount_status)) {
        discount_status = NULL;
    }
    if (discount_status) { 
    discount_status_local_nonprim = discount_status_parseFromJSON(discount_status); //custom
    }

    // promotion->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(promotionJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    end_time_local_var = malloc(sizeof(int));
    if(!end_time_local_var)
    {
        goto end;
    }
    *end_time_local_var = end_time->valuedouble;
    }

    // promotion->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(promotionJSON, "external_id");
    if (cJSON_IsNull(external_id)) {
        external_id = NULL;
    }
    if (external_id) { 
    if(!cJSON_IsString(external_id) && !cJSON_IsNull(external_id))
    {
    goto end; //String
    }
    }

    // promotion->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(promotionJSON, "id");
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

    // promotion->platform_type
    cJSON *platform_type = cJSON_GetObjectItemCaseSensitive(promotionJSON, "platform_type");
    if (cJSON_IsNull(platform_type)) {
        platform_type = NULL;
    }
    if (platform_type) { 
    if(!cJSON_IsString(platform_type) && !cJSON_IsNull(platform_type))
    {
    goto end; //String
    }
    }

    // promotion->promotion_code
    cJSON *promotion_code = cJSON_GetObjectItemCaseSensitive(promotionJSON, "promotion_code");
    if (cJSON_IsNull(promotion_code)) {
        promotion_code = NULL;
    }
    if (promotion_code) { 
    if(!cJSON_IsString(promotion_code) && !cJSON_IsNull(promotion_code))
    {
    goto end; //String
    }
    }

    // promotion->promotion_custom_id
    cJSON *promotion_custom_id = cJSON_GetObjectItemCaseSensitive(promotionJSON, "promotion_custom_id");
    if (cJSON_IsNull(promotion_custom_id)) {
        promotion_custom_id = NULL;
    }
    if (promotion_custom_id) { 
    if(!cJSON_IsString(promotion_custom_id) && !cJSON_IsNull(promotion_custom_id))
    {
    goto end; //String
    }
    }

    // promotion->promotion_title
    cJSON *promotion_title = cJSON_GetObjectItemCaseSensitive(promotionJSON, "promotion_title");
    if (cJSON_IsNull(promotion_title)) {
        promotion_title = NULL;
    }
    if (!promotion_title) {
        goto end;
    }

    
    if(!cJSON_IsString(promotion_title))
    {
    goto end; //String
    }

    // promotion->promotion_type
    cJSON *promotion_type = cJSON_GetObjectItemCaseSensitive(promotionJSON, "promotion_type");
    if (cJSON_IsNull(promotion_type)) {
        promotion_type = NULL;
    }
    if (!promotion_type) {
        goto end;
    }

    
    promotion_type_local_nonprim = promotion_type_parseFromJSON(promotion_type); //custom

    // promotion->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(promotionJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    start_time_local_var = malloc(sizeof(int));
    if(!start_time_local_var)
    {
        goto end;
    }
    *start_time_local_var = start_time->valuedouble;
    }

    // promotion->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(promotionJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // promotion->template_values
    cJSON *template_values = cJSON_GetObjectItemCaseSensitive(promotionJSON, "template_values");
    if (cJSON_IsNull(template_values)) {
        template_values = NULL;
    }
    if (template_values) { 
    cJSON *template_values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(template_values)){
        goto end; //nonprimitive container
    }

    template_valuesList = list_createList();

    cJSON_ArrayForEach(template_values_local_nonprimitive,template_values )
    {
        if(!cJSON_IsObject(template_values_local_nonprimitive)){
            goto end;
        }
        promotion_template_value_t *template_valuesItem = promotion_template_value_parseFromJSON(template_values_local_nonprimitive);

        list_addElement(template_valuesList, template_valuesItem);
    }
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (external_id && !cJSON_IsNull(external_id)) external_id_local_str = strdup(external_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (platform_type && !cJSON_IsNull(platform_type)) platform_type_local_str = strdup(platform_type->valuestring);
    if (promotion_code && !cJSON_IsNull(promotion_code)) promotion_code_local_str = strdup(promotion_code->valuestring);
    if (promotion_custom_id && !cJSON_IsNull(promotion_custom_id)) promotion_custom_id_local_str = strdup(promotion_custom_id->valuestring);
    if (promotion_title && !cJSON_IsNull(promotion_title)) promotion_title_local_str = strdup(promotion_title->valuestring);

    promotion_local_var = promotion_create_internal (
        ad_account_id_local_str,
        discount_status ? discount_status_local_nonprim : 0,
        end_time_local_var,
        external_id_local_str,
        id_local_str,
        platform_type_local_str,
        promotion_code_local_str,
        promotion_custom_id_local_str,
        promotion_title_local_str,
        promotion_type_local_nonprim,
        start_time_local_var,
        status ? status_local_nonprim : NULL,
        template_values ? template_valuesList : NULL
        );

    if (!promotion_local_var) {
        goto end;
    }

    return promotion_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (discount_status_local_nonprim) {
        discount_status_local_nonprim = 0;
    }
    if (end_time_local_var) {
        free(end_time_local_var);
        end_time_local_var = NULL;
    }
    if (external_id_local_str) {
        free(external_id_local_str);
        external_id_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (platform_type_local_str) {
        free(platform_type_local_str);
        platform_type_local_str = NULL;
    }
    if (promotion_code_local_str) {
        free(promotion_code_local_str);
        promotion_code_local_str = NULL;
    }
    if (promotion_custom_id_local_str) {
        free(promotion_custom_id_local_str);
        promotion_custom_id_local_str = NULL;
    }
    if (promotion_title_local_str) {
        free(promotion_title_local_str);
        promotion_title_local_str = NULL;
    }
    if (promotion_type_local_nonprim) {
        promotion_type_local_nonprim = 0;
    }
    if (start_time_local_var) {
        free(start_time_local_var);
        start_time_local_var = NULL;
    }
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (template_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, template_valuesList) {
            promotion_template_value_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(template_valuesList);
        template_valuesList = NULL;
    }
    return NULL;

}
