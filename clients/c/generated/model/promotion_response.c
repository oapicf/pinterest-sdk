#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotion_response.h"


char* promotion_response_discount_status_ToString(pinterest_rest_api_promotion_response_DISCOUNTSTATUS_e discount_status) {
    char* discount_statusArray[] =  { "NULL", "OTHER", "ACTIVE", "PAUSED", "SCHEDULED", "EXPIRED" };
    return discount_statusArray[discount_status];
}

pinterest_rest_api_promotion_response_DISCOUNTSTATUS_e promotion_response_discount_status_FromString(char* discount_status){
    int stringToReturn = 0;
    char *discount_statusArray[] =  { "NULL", "OTHER", "ACTIVE", "PAUSED", "SCHEDULED", "EXPIRED" };
    size_t sizeofArray = sizeof(discount_statusArray) / sizeof(discount_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(discount_status, discount_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static promotion_response_t *promotion_response_create_internal(
    pinterest_rest_api_promotion_response_DISCOUNTSTATUS_e discount_status,
    int end_time,
    char *external_id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int start_time,
    list_t *template_values,
    char *ad_account_id,
    char *id,
    pinterest_rest_api_entity_status__e status
    ) {
    promotion_response_t *promotion_response_local_var = malloc(sizeof(promotion_response_t));
    if (!promotion_response_local_var) {
        return NULL;
    }
    promotion_response_local_var->discount_status = discount_status;
    promotion_response_local_var->end_time = end_time;
    promotion_response_local_var->external_id = external_id;
    promotion_response_local_var->platform_type = platform_type;
    promotion_response_local_var->promotion_code = promotion_code;
    promotion_response_local_var->promotion_custom_id = promotion_custom_id;
    promotion_response_local_var->promotion_title = promotion_title;
    promotion_response_local_var->promotion_type = promotion_type;
    promotion_response_local_var->start_time = start_time;
    promotion_response_local_var->template_values = template_values;
    promotion_response_local_var->ad_account_id = ad_account_id;
    promotion_response_local_var->id = id;
    promotion_response_local_var->status = status;

    promotion_response_local_var->_library_owned = 1;
    return promotion_response_local_var;
}

__attribute__((deprecated)) promotion_response_t *promotion_response_create(
    pinterest_rest_api_promotion_response_DISCOUNTSTATUS_e discount_status,
    int end_time,
    char *external_id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int start_time,
    list_t *template_values,
    char *ad_account_id,
    char *id,
    pinterest_rest_api_entity_status__e status
    ) {
    return promotion_response_create_internal (
        discount_status,
        end_time,
        external_id,
        platform_type,
        promotion_code,
        promotion_custom_id,
        promotion_title,
        promotion_type,
        start_time,
        template_values,
        ad_account_id,
        id,
        status
        );
}

void promotion_response_free(promotion_response_t *promotion_response) {
    if(NULL == promotion_response){
        return ;
    }
    if(promotion_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "promotion_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (promotion_response->external_id) {
        free(promotion_response->external_id);
        promotion_response->external_id = NULL;
    }
    if (promotion_response->platform_type) {
        free(promotion_response->platform_type);
        promotion_response->platform_type = NULL;
    }
    if (promotion_response->promotion_code) {
        free(promotion_response->promotion_code);
        promotion_response->promotion_code = NULL;
    }
    if (promotion_response->promotion_custom_id) {
        free(promotion_response->promotion_custom_id);
        promotion_response->promotion_custom_id = NULL;
    }
    if (promotion_response->promotion_title) {
        free(promotion_response->promotion_title);
        promotion_response->promotion_title = NULL;
    }
    if (promotion_response->template_values) {
        list_ForEach(listEntry, promotion_response->template_values) {
            promotion_template_value_free(listEntry->data);
        }
        list_freeList(promotion_response->template_values);
        promotion_response->template_values = NULL;
    }
    if (promotion_response->ad_account_id) {
        free(promotion_response->ad_account_id);
        promotion_response->ad_account_id = NULL;
    }
    if (promotion_response->id) {
        free(promotion_response->id);
        promotion_response->id = NULL;
    }
    free(promotion_response);
}

cJSON *promotion_response_convertToJSON(promotion_response_t *promotion_response) {
    cJSON *item = cJSON_CreateObject();

    // promotion_response->discount_status
    if(promotion_response->discount_status != pinterest_rest_api_promotion_response_DISCOUNTSTATUS_NULL) {
    if(cJSON_AddStringToObject(item, "discount_status", promotion_response_discount_status_ToString(promotion_response->discount_status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // promotion_response->end_time
    if(promotion_response->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", promotion_response->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // promotion_response->external_id
    if(promotion_response->external_id) {
    if(cJSON_AddStringToObject(item, "external_id", promotion_response->external_id) == NULL) {
    goto fail; //String
    }
    }


    // promotion_response->platform_type
    if(promotion_response->platform_type) {
    if(cJSON_AddStringToObject(item, "platform_type", promotion_response->platform_type) == NULL) {
    goto fail; //String
    }
    }


    // promotion_response->promotion_code
    if(promotion_response->promotion_code) {
    if(cJSON_AddStringToObject(item, "promotion_code", promotion_response->promotion_code) == NULL) {
    goto fail; //String
    }
    }


    // promotion_response->promotion_custom_id
    if(promotion_response->promotion_custom_id) {
    if(cJSON_AddStringToObject(item, "promotion_custom_id", promotion_response->promotion_custom_id) == NULL) {
    goto fail; //String
    }
    }


    // promotion_response->promotion_title
    if(promotion_response->promotion_title) {
    if(cJSON_AddStringToObject(item, "promotion_title", promotion_response->promotion_title) == NULL) {
    goto fail; //String
    }
    }


    // promotion_response->promotion_type
    if(promotion_response->promotion_type != pinterest_rest_api_promotion_type__NULL) {
    cJSON *promotion_type_local_JSON = promotion_type_convertToJSON(promotion_response->promotion_type);
    if(promotion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "promotion_type", promotion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // promotion_response->start_time
    if(promotion_response->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", promotion_response->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // promotion_response->template_values
    if(promotion_response->template_values) {
    cJSON *template_values = cJSON_AddArrayToObject(item, "template_values");
    if(template_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *template_valuesListEntry;
    if (promotion_response->template_values) {
    list_ForEach(template_valuesListEntry, promotion_response->template_values) {
    cJSON *itemLocal = promotion_template_value_convertToJSON(template_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(template_values, itemLocal);
    }
    }
    }


    // promotion_response->ad_account_id
    if(promotion_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", promotion_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // promotion_response->id
    if(promotion_response->id) {
    if(cJSON_AddStringToObject(item, "id", promotion_response->id) == NULL) {
    goto fail; //String
    }
    }


    // promotion_response->status
    if(promotion_response->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(promotion_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
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

promotion_response_t *promotion_response_parseFromJSON(cJSON *promotion_responseJSON){

    promotion_response_t *promotion_response_local_var = NULL;

    // define the local variable for promotion_response->promotion_type
    pinterest_rest_api_promotion_type__e promotion_type_local_nonprim = 0;

    // define the local list for promotion_response->template_values
    list_t *template_valuesList = NULL;

    // define the local variable for promotion_response->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    // promotion_response->discount_status
    cJSON *discount_status = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "discount_status");
    if (cJSON_IsNull(discount_status)) {
        discount_status = NULL;
    }
    pinterest_rest_api_promotion_response_DISCOUNTSTATUS_e discount_statusVariable;
    if (discount_status) { 
    if(!cJSON_IsString(discount_status))
    {
    goto end; //Enum
    }
    discount_statusVariable = promotion_response_discount_status_FromString(discount_status->valuestring);
    }

    // promotion_response->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // promotion_response->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "external_id");
    if (cJSON_IsNull(external_id)) {
        external_id = NULL;
    }
    if (external_id) { 
    if(!cJSON_IsString(external_id) && !cJSON_IsNull(external_id))
    {
    goto end; //String
    }
    }

    // promotion_response->platform_type
    cJSON *platform_type = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "platform_type");
    if (cJSON_IsNull(platform_type)) {
        platform_type = NULL;
    }
    if (platform_type) { 
    if(!cJSON_IsString(platform_type) && !cJSON_IsNull(platform_type))
    {
    goto end; //String
    }
    }

    // promotion_response->promotion_code
    cJSON *promotion_code = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "promotion_code");
    if (cJSON_IsNull(promotion_code)) {
        promotion_code = NULL;
    }
    if (promotion_code) { 
    if(!cJSON_IsString(promotion_code) && !cJSON_IsNull(promotion_code))
    {
    goto end; //String
    }
    }

    // promotion_response->promotion_custom_id
    cJSON *promotion_custom_id = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "promotion_custom_id");
    if (cJSON_IsNull(promotion_custom_id)) {
        promotion_custom_id = NULL;
    }
    if (promotion_custom_id) { 
    if(!cJSON_IsString(promotion_custom_id) && !cJSON_IsNull(promotion_custom_id))
    {
    goto end; //String
    }
    }

    // promotion_response->promotion_title
    cJSON *promotion_title = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "promotion_title");
    if (cJSON_IsNull(promotion_title)) {
        promotion_title = NULL;
    }
    if (promotion_title) { 
    if(!cJSON_IsString(promotion_title) && !cJSON_IsNull(promotion_title))
    {
    goto end; //String
    }
    }

    // promotion_response->promotion_type
    cJSON *promotion_type = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "promotion_type");
    if (cJSON_IsNull(promotion_type)) {
        promotion_type = NULL;
    }
    if (promotion_type) { 
    promotion_type_local_nonprim = promotion_type_parseFromJSON(promotion_type); //custom
    }

    // promotion_response->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // promotion_response->template_values
    cJSON *template_values = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "template_values");
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

    // promotion_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // promotion_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // promotion_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(promotion_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }


    promotion_response_local_var = promotion_response_create_internal (
        discount_status ? discount_statusVariable : pinterest_rest_api_promotion_response_DISCOUNTSTATUS_NULL,
        end_time ? end_time->valuedouble : 0,
        external_id && !cJSON_IsNull(external_id) ? strdup(external_id->valuestring) : NULL,
        platform_type && !cJSON_IsNull(platform_type) ? strdup(platform_type->valuestring) : NULL,
        promotion_code && !cJSON_IsNull(promotion_code) ? strdup(promotion_code->valuestring) : NULL,
        promotion_custom_id && !cJSON_IsNull(promotion_custom_id) ? strdup(promotion_custom_id->valuestring) : NULL,
        promotion_title && !cJSON_IsNull(promotion_title) ? strdup(promotion_title->valuestring) : NULL,
        promotion_type ? promotion_type_local_nonprim : 0,
        start_time ? start_time->valuedouble : 0,
        template_values ? template_valuesList : NULL,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        status ? status_local_nonprim : 0
        );

    return promotion_response_local_var;
end:
    if (promotion_type_local_nonprim) {
        promotion_type_local_nonprim = 0;
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
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    return NULL;

}
