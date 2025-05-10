#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_event_response.h"



static conversion_event_response_t *conversion_event_response_create_internal(
    pinterest_rest_api_conversion_tag_type__e conversion_event,
    char *conversion_tag_id,
    char *ad_account_id,
    int created_time
    ) {
    conversion_event_response_t *conversion_event_response_local_var = malloc(sizeof(conversion_event_response_t));
    if (!conversion_event_response_local_var) {
        return NULL;
    }
    conversion_event_response_local_var->conversion_event = conversion_event;
    conversion_event_response_local_var->conversion_tag_id = conversion_tag_id;
    conversion_event_response_local_var->ad_account_id = ad_account_id;
    conversion_event_response_local_var->created_time = created_time;

    conversion_event_response_local_var->_library_owned = 1;
    return conversion_event_response_local_var;
}

__attribute__((deprecated)) conversion_event_response_t *conversion_event_response_create(
    pinterest_rest_api_conversion_tag_type__e conversion_event,
    char *conversion_tag_id,
    char *ad_account_id,
    int created_time
    ) {
    return conversion_event_response_create_internal (
        conversion_event,
        conversion_tag_id,
        ad_account_id,
        created_time
        );
}

void conversion_event_response_free(conversion_event_response_t *conversion_event_response) {
    if(NULL == conversion_event_response){
        return ;
    }
    if(conversion_event_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_event_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_event_response->conversion_tag_id) {
        free(conversion_event_response->conversion_tag_id);
        conversion_event_response->conversion_tag_id = NULL;
    }
    if (conversion_event_response->ad_account_id) {
        free(conversion_event_response->ad_account_id);
        conversion_event_response->ad_account_id = NULL;
    }
    free(conversion_event_response);
}

cJSON *conversion_event_response_convertToJSON(conversion_event_response_t *conversion_event_response) {
    cJSON *item = cJSON_CreateObject();

    // conversion_event_response->conversion_event
    if(conversion_event_response->conversion_event != pinterest_rest_api_conversion_tag_type__NULL) {
    cJSON *conversion_event_local_JSON = conversion_tag_type_convertToJSON(conversion_event_response->conversion_event);
    if(conversion_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_event", conversion_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_event_response->conversion_tag_id
    if(conversion_event_response->conversion_tag_id) {
    if(cJSON_AddStringToObject(item, "conversion_tag_id", conversion_event_response->conversion_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_response->ad_account_id
    if(conversion_event_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", conversion_event_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_response->created_time
    if(conversion_event_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", conversion_event_response->created_time) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_event_response_t *conversion_event_response_parseFromJSON(cJSON *conversion_event_responseJSON){

    conversion_event_response_t *conversion_event_response_local_var = NULL;

    // define the local variable for conversion_event_response->conversion_event
    pinterest_rest_api_conversion_tag_type__e conversion_event_local_nonprim = 0;

    // conversion_event_response->conversion_event
    cJSON *conversion_event = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "conversion_event");
    if (cJSON_IsNull(conversion_event)) {
        conversion_event = NULL;
    }
    if (conversion_event) { 
    conversion_event_local_nonprim = conversion_tag_type_parseFromJSON(conversion_event); //custom
    }

    // conversion_event_response->conversion_tag_id
    cJSON *conversion_tag_id = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "conversion_tag_id");
    if (cJSON_IsNull(conversion_tag_id)) {
        conversion_tag_id = NULL;
    }
    if (conversion_tag_id) { 
    if(!cJSON_IsString(conversion_tag_id) && !cJSON_IsNull(conversion_tag_id))
    {
    goto end; //String
    }
    }

    // conversion_event_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // conversion_event_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }


    conversion_event_response_local_var = conversion_event_response_create_internal (
        conversion_event ? conversion_event_local_nonprim : 0,
        conversion_tag_id && !cJSON_IsNull(conversion_tag_id) ? strdup(conversion_tag_id->valuestring) : NULL,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0
        );

    return conversion_event_response_local_var;
end:
    if (conversion_event_local_nonprim) {
        conversion_event_local_nonprim = 0;
    }
    return NULL;

}
