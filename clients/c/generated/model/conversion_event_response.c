#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_event_response.h"


char* conversion_event_response_conversion_event_ToString(pinterest_rest_api_conversion_event_response__e conversion_event) {
    char* conversion_eventArray[] =  { "NULL", "PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT" };
    return conversion_eventArray[conversion_event];
}

pinterest_rest_api_conversion_event_response__e conversion_event_response_conversion_event_FromString(char* conversion_event){
    int stringToReturn = 0;
    char *conversion_eventArray[] =  { "NULL", "PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT" };
    size_t sizeofArray = sizeof(conversion_eventArray) / sizeof(conversion_eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_event, conversion_eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

conversion_event_response_t *conversion_event_response_create(
    conversion_tag_type_t *conversion_event,
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

    return conversion_event_response_local_var;
}


void conversion_event_response_free(conversion_event_response_t *conversion_event_response) {
    if(NULL == conversion_event_response){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_event_response->conversion_event) {
        conversion_tag_type_free(conversion_event_response->conversion_event);
        conversion_event_response->conversion_event = NULL;
    }
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
    if(conversion_event_response->conversion_event != pinterest_rest_api_conversion_event_response__NULL) {
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
    conversion_tag_type_t *conversion_event_local_nonprim = NULL;

    // conversion_event_response->conversion_event
    cJSON *conversion_event = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "conversion_event");
    if (conversion_event) { 
    conversion_event_local_nonprim = conversion_tag_type_parseFromJSON(conversion_event); //custom
    }

    // conversion_event_response->conversion_tag_id
    cJSON *conversion_tag_id = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "conversion_tag_id");
    if (conversion_tag_id) { 
    if(!cJSON_IsString(conversion_tag_id) && !cJSON_IsNull(conversion_tag_id))
    {
    goto end; //String
    }
    }

    // conversion_event_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // conversion_event_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(conversion_event_responseJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }


    conversion_event_response_local_var = conversion_event_response_create (
        conversion_event ? conversion_event_local_nonprim : NULL,
        conversion_tag_id && !cJSON_IsNull(conversion_tag_id) ? strdup(conversion_tag_id->valuestring) : NULL,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0
        );

    return conversion_event_response_local_var;
end:
    if (conversion_event_local_nonprim) {
        conversion_tag_type_free(conversion_event_local_nonprim);
        conversion_event_local_nonprim = NULL;
    }
    return NULL;

}
