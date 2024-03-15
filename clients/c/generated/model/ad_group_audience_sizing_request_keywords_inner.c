#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_audience_sizing_request_keywords_inner.h"


char* ad_group_audience_sizing_request_keywords_inner_match_type_ToString(pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__e match_type) {
    char* match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    return match_typeArray[match_type];
}

pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__e ad_group_audience_sizing_request_keywords_inner_match_type_FromString(char* match_type){
    int stringToReturn = 0;
    char *match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    size_t sizeofArray = sizeof(match_typeArray) / sizeof(match_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(match_type, match_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_create(
    match_type_response_t *match_type,
    char *value
    ) {
    ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_local_var = malloc(sizeof(ad_group_audience_sizing_request_keywords_inner_t));
    if (!ad_group_audience_sizing_request_keywords_inner_local_var) {
        return NULL;
    }
    ad_group_audience_sizing_request_keywords_inner_local_var->match_type = match_type;
    ad_group_audience_sizing_request_keywords_inner_local_var->value = value;

    return ad_group_audience_sizing_request_keywords_inner_local_var;
}


void ad_group_audience_sizing_request_keywords_inner_free(ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner) {
    if(NULL == ad_group_audience_sizing_request_keywords_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_audience_sizing_request_keywords_inner->match_type) {
        match_type_response_free(ad_group_audience_sizing_request_keywords_inner->match_type);
        ad_group_audience_sizing_request_keywords_inner->match_type = NULL;
    }
    if (ad_group_audience_sizing_request_keywords_inner->value) {
        free(ad_group_audience_sizing_request_keywords_inner->value);
        ad_group_audience_sizing_request_keywords_inner->value = NULL;
    }
    free(ad_group_audience_sizing_request_keywords_inner);
}

cJSON *ad_group_audience_sizing_request_keywords_inner_convertToJSON(ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_audience_sizing_request_keywords_inner->match_type
    if (pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__NULL == ad_group_audience_sizing_request_keywords_inner->match_type) {
        goto fail;
    }
    cJSON *match_type_local_JSON = match_type_response_convertToJSON(ad_group_audience_sizing_request_keywords_inner->match_type);
    if(match_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "match_type", match_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_group_audience_sizing_request_keywords_inner->value
    if (!ad_group_audience_sizing_request_keywords_inner->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", ad_group_audience_sizing_request_keywords_inner->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_parseFromJSON(cJSON *ad_group_audience_sizing_request_keywords_innerJSON){

    ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_local_var = NULL;

    // define the local variable for ad_group_audience_sizing_request_keywords_inner->match_type
    match_type_response_t *match_type_local_nonprim = NULL;

    // ad_group_audience_sizing_request_keywords_inner->match_type
    cJSON *match_type = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_request_keywords_innerJSON, "match_type");
    if (!match_type) {
        goto end;
    }

    
    match_type_local_nonprim = match_type_response_parseFromJSON(match_type); //custom

    // ad_group_audience_sizing_request_keywords_inner->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_request_keywords_innerJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    ad_group_audience_sizing_request_keywords_inner_local_var = ad_group_audience_sizing_request_keywords_inner_create (
        match_type_local_nonprim,
        strdup(value->valuestring)
        );

    return ad_group_audience_sizing_request_keywords_inner_local_var;
end:
    if (match_type_local_nonprim) {
        match_type_response_free(match_type_local_nonprim);
        match_type_local_nonprim = NULL;
    }
    return NULL;

}
