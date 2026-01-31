#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotion_create_request.h"


char* promotion_create_request_discount_status_ToString(pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e discount_status) {
    char* discount_statusArray[] =  { "NULL", "OTHER", "ACTIVE", "PAUSED", "SCHEDULED", "EXPIRED" };
    return discount_statusArray[discount_status];
}

pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e promotion_create_request_discount_status_FromString(char* discount_status){
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

static promotion_create_request_t *promotion_create_request_create_internal(
    pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e discount_status,
    int end_time,
    char *external_id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int start_time,
    list_t *template_values
    ) {
    promotion_create_request_t *promotion_create_request_local_var = malloc(sizeof(promotion_create_request_t));
    if (!promotion_create_request_local_var) {
        return NULL;
    }
    promotion_create_request_local_var->discount_status = discount_status;
    promotion_create_request_local_var->end_time = end_time;
    promotion_create_request_local_var->external_id = external_id;
    promotion_create_request_local_var->platform_type = platform_type;
    promotion_create_request_local_var->promotion_code = promotion_code;
    promotion_create_request_local_var->promotion_custom_id = promotion_custom_id;
    promotion_create_request_local_var->promotion_title = promotion_title;
    promotion_create_request_local_var->promotion_type = promotion_type;
    promotion_create_request_local_var->start_time = start_time;
    promotion_create_request_local_var->template_values = template_values;

    promotion_create_request_local_var->_library_owned = 1;
    return promotion_create_request_local_var;
}

__attribute__((deprecated)) promotion_create_request_t *promotion_create_request_create(
    pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e discount_status,
    int end_time,
    char *external_id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int start_time,
    list_t *template_values
    ) {
    return promotion_create_request_create_internal (
        discount_status,
        end_time,
        external_id,
        platform_type,
        promotion_code,
        promotion_custom_id,
        promotion_title,
        promotion_type,
        start_time,
        template_values
        );
}

void promotion_create_request_free(promotion_create_request_t *promotion_create_request) {
    if(NULL == promotion_create_request){
        return ;
    }
    if(promotion_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "promotion_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (promotion_create_request->external_id) {
        free(promotion_create_request->external_id);
        promotion_create_request->external_id = NULL;
    }
    if (promotion_create_request->platform_type) {
        free(promotion_create_request->platform_type);
        promotion_create_request->platform_type = NULL;
    }
    if (promotion_create_request->promotion_code) {
        free(promotion_create_request->promotion_code);
        promotion_create_request->promotion_code = NULL;
    }
    if (promotion_create_request->promotion_custom_id) {
        free(promotion_create_request->promotion_custom_id);
        promotion_create_request->promotion_custom_id = NULL;
    }
    if (promotion_create_request->promotion_title) {
        free(promotion_create_request->promotion_title);
        promotion_create_request->promotion_title = NULL;
    }
    if (promotion_create_request->template_values) {
        list_ForEach(listEntry, promotion_create_request->template_values) {
            promotion_template_value_free(listEntry->data);
        }
        list_freeList(promotion_create_request->template_values);
        promotion_create_request->template_values = NULL;
    }
    free(promotion_create_request);
}

cJSON *promotion_create_request_convertToJSON(promotion_create_request_t *promotion_create_request) {
    cJSON *item = cJSON_CreateObject();

    // promotion_create_request->discount_status
    if(promotion_create_request->discount_status != pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_NULL) {
    if(cJSON_AddStringToObject(item, "discount_status", promotion_create_request_discount_status_ToString(promotion_create_request->discount_status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // promotion_create_request->end_time
    if(promotion_create_request->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", promotion_create_request->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // promotion_create_request->external_id
    if(promotion_create_request->external_id) {
    if(cJSON_AddStringToObject(item, "external_id", promotion_create_request->external_id) == NULL) {
    goto fail; //String
    }
    }


    // promotion_create_request->platform_type
    if(promotion_create_request->platform_type) {
    if(cJSON_AddStringToObject(item, "platform_type", promotion_create_request->platform_type) == NULL) {
    goto fail; //String
    }
    }


    // promotion_create_request->promotion_code
    if(promotion_create_request->promotion_code) {
    if(cJSON_AddStringToObject(item, "promotion_code", promotion_create_request->promotion_code) == NULL) {
    goto fail; //String
    }
    }


    // promotion_create_request->promotion_custom_id
    if(promotion_create_request->promotion_custom_id) {
    if(cJSON_AddStringToObject(item, "promotion_custom_id", promotion_create_request->promotion_custom_id) == NULL) {
    goto fail; //String
    }
    }


    // promotion_create_request->promotion_title
    if (!promotion_create_request->promotion_title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "promotion_title", promotion_create_request->promotion_title) == NULL) {
    goto fail; //String
    }


    // promotion_create_request->promotion_type
    if (pinterest_rest_api_promotion_type__NULL == promotion_create_request->promotion_type) {
        goto fail;
    }
    cJSON *promotion_type_local_JSON = promotion_type_convertToJSON(promotion_create_request->promotion_type);
    if(promotion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "promotion_type", promotion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // promotion_create_request->start_time
    if(promotion_create_request->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", promotion_create_request->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // promotion_create_request->template_values
    if(promotion_create_request->template_values) {
    cJSON *template_values = cJSON_AddArrayToObject(item, "template_values");
    if(template_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *template_valuesListEntry;
    if (promotion_create_request->template_values) {
    list_ForEach(template_valuesListEntry, promotion_create_request->template_values) {
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

promotion_create_request_t *promotion_create_request_parseFromJSON(cJSON *promotion_create_requestJSON){

    promotion_create_request_t *promotion_create_request_local_var = NULL;

    // define the local variable for promotion_create_request->promotion_type
    pinterest_rest_api_promotion_type__e promotion_type_local_nonprim = 0;

    // define the local list for promotion_create_request->template_values
    list_t *template_valuesList = NULL;

    // promotion_create_request->discount_status
    cJSON *discount_status = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "discount_status");
    if (cJSON_IsNull(discount_status)) {
        discount_status = NULL;
    }
    pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e discount_statusVariable;
    if (discount_status) { 
    if(!cJSON_IsString(discount_status))
    {
    goto end; //Enum
    }
    discount_statusVariable = promotion_create_request_discount_status_FromString(discount_status->valuestring);
    }

    // promotion_create_request->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // promotion_create_request->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "external_id");
    if (cJSON_IsNull(external_id)) {
        external_id = NULL;
    }
    if (external_id) { 
    if(!cJSON_IsString(external_id) && !cJSON_IsNull(external_id))
    {
    goto end; //String
    }
    }

    // promotion_create_request->platform_type
    cJSON *platform_type = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "platform_type");
    if (cJSON_IsNull(platform_type)) {
        platform_type = NULL;
    }
    if (platform_type) { 
    if(!cJSON_IsString(platform_type) && !cJSON_IsNull(platform_type))
    {
    goto end; //String
    }
    }

    // promotion_create_request->promotion_code
    cJSON *promotion_code = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "promotion_code");
    if (cJSON_IsNull(promotion_code)) {
        promotion_code = NULL;
    }
    if (promotion_code) { 
    if(!cJSON_IsString(promotion_code) && !cJSON_IsNull(promotion_code))
    {
    goto end; //String
    }
    }

    // promotion_create_request->promotion_custom_id
    cJSON *promotion_custom_id = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "promotion_custom_id");
    if (cJSON_IsNull(promotion_custom_id)) {
        promotion_custom_id = NULL;
    }
    if (promotion_custom_id) { 
    if(!cJSON_IsString(promotion_custom_id) && !cJSON_IsNull(promotion_custom_id))
    {
    goto end; //String
    }
    }

    // promotion_create_request->promotion_title
    cJSON *promotion_title = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "promotion_title");
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

    // promotion_create_request->promotion_type
    cJSON *promotion_type = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "promotion_type");
    if (cJSON_IsNull(promotion_type)) {
        promotion_type = NULL;
    }
    if (!promotion_type) {
        goto end;
    }

    
    promotion_type_local_nonprim = promotion_type_parseFromJSON(promotion_type); //custom

    // promotion_create_request->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // promotion_create_request->template_values
    cJSON *template_values = cJSON_GetObjectItemCaseSensitive(promotion_create_requestJSON, "template_values");
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


    promotion_create_request_local_var = promotion_create_request_create_internal (
        discount_status ? discount_statusVariable : pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_NULL,
        end_time ? end_time->valuedouble : 0,
        external_id && !cJSON_IsNull(external_id) ? strdup(external_id->valuestring) : NULL,
        platform_type && !cJSON_IsNull(platform_type) ? strdup(platform_type->valuestring) : NULL,
        promotion_code && !cJSON_IsNull(promotion_code) ? strdup(promotion_code->valuestring) : NULL,
        promotion_custom_id && !cJSON_IsNull(promotion_custom_id) ? strdup(promotion_custom_id->valuestring) : NULL,
        strdup(promotion_title->valuestring),
        promotion_type_local_nonprim,
        start_time ? start_time->valuedouble : 0,
        template_values ? template_valuesList : NULL
        );

    return promotion_create_request_local_var;
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
    return NULL;

}
