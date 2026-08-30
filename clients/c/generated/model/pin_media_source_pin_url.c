#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_pin_url.h"


char* pin_media_source_pin_url_source_type_ToString(pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e source_type) {
    char* source_typeArray[] =  { "NULL", "pin_url" };
    return source_typeArray[source_type];
}

pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e pin_media_source_pin_url_source_type_FromString(char* source_type){
    int stringToReturn = 0;
    char *source_typeArray[] =  { "NULL", "pin_url" };
    size_t sizeofArray = sizeof(source_typeArray) / sizeof(source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_type, source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pin_media_source_pin_url_t *pin_media_source_pin_url_create_internal(
    int *is_affiliate_link,
    pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e source_type
    ) {
    pin_media_source_pin_url_t *pin_media_source_pin_url_local_var = malloc(sizeof(pin_media_source_pin_url_t));
    if (!pin_media_source_pin_url_local_var) {
        return NULL;
    }
    memset(pin_media_source_pin_url_local_var, 0, sizeof(pin_media_source_pin_url_t));
    pin_media_source_pin_url_local_var->_library_owned = 1;
    pin_media_source_pin_url_local_var->is_affiliate_link = is_affiliate_link;
    pin_media_source_pin_url_local_var->source_type = source_type;
    return pin_media_source_pin_url_local_var;
}

__attribute__((deprecated)) pin_media_source_pin_url_t *pin_media_source_pin_url_create(
    int *is_affiliate_link,
    pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e source_type
    ) {
    int *is_affiliate_link_copy = NULL;
    if (is_affiliate_link) {
        is_affiliate_link_copy = malloc(sizeof(int));
        if (is_affiliate_link_copy) *is_affiliate_link_copy = *is_affiliate_link;
    }
    pin_media_source_pin_url_t *result = pin_media_source_pin_url_create_internal (
        is_affiliate_link_copy,
        source_type
        );
    if (!result) {
        free(is_affiliate_link_copy);
    }
    return result;
}

void pin_media_source_pin_url_free(pin_media_source_pin_url_t *pin_media_source_pin_url) {
    if(NULL == pin_media_source_pin_url){
        return ;
    }
    if(pin_media_source_pin_url->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_source_pin_url_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_pin_url->is_affiliate_link) {
        free(pin_media_source_pin_url->is_affiliate_link);
        pin_media_source_pin_url->is_affiliate_link = NULL;
    }
    free(pin_media_source_pin_url);
}

cJSON *pin_media_source_pin_url_convertToJSON(pin_media_source_pin_url_t *pin_media_source_pin_url) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_pin_url->is_affiliate_link
    if(pin_media_source_pin_url->is_affiliate_link) {
    if(cJSON_AddBoolToObject(item, "is_affiliate_link", *pin_media_source_pin_url->is_affiliate_link) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_media_source_pin_url->source_type
    if (pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_NULL == pin_media_source_pin_url->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", pin_media_source_pin_url_source_type_ToString(pin_media_source_pin_url->source_type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_source_pin_url_t *pin_media_source_pin_url_parseFromJSON(cJSON *pin_media_source_pin_urlJSON){

    pin_media_source_pin_url_t *pin_media_source_pin_url_local_var = NULL;

    // define the local variable for pin_media_source_pin_url->is_affiliate_link
    int *is_affiliate_link_local_var = NULL;

    // pin_media_source_pin_url->is_affiliate_link
    cJSON *is_affiliate_link = cJSON_GetObjectItemCaseSensitive(pin_media_source_pin_urlJSON, "is_affiliate_link");
    if (cJSON_IsNull(is_affiliate_link)) {
        is_affiliate_link = NULL;
    }
    if (is_affiliate_link) { 
    if(!cJSON_IsBool(is_affiliate_link))
    {
    goto end; //Bool
    }
    is_affiliate_link_local_var = malloc(sizeof(int));
    if(!is_affiliate_link_local_var)
    {
        goto end;
    }
    *is_affiliate_link_local_var = is_affiliate_link->valueint;
    }

    // pin_media_source_pin_url->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_pin_urlJSON, "source_type");
    if (cJSON_IsNull(source_type)) {
        source_type = NULL;
    }
    if (!source_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e source_typeVariable;
    
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_pin_url_source_type_FromString(source_type->valuestring);



    pin_media_source_pin_url_local_var = pin_media_source_pin_url_create_internal (
        is_affiliate_link_local_var,
        source_typeVariable
        );

    if (!pin_media_source_pin_url_local_var) {
        goto end;
    }

    return pin_media_source_pin_url_local_var;
end:
    if (is_affiliate_link_local_var) {
        free(is_affiliate_link_local_var);
        is_affiliate_link_local_var = NULL;
    }
    return NULL;

}
