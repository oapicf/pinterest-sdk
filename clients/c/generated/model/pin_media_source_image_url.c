#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_image_url.h"


char* pin_media_source_image_url_source_type_ToString(pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_type) {
    char* source_typeArray[] =  { "NULL", "image_url" };
    return source_typeArray[source_type];
}

pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e pin_media_source_image_url_source_type_FromString(char* source_type){
    int stringToReturn = 0;
    char *source_typeArray[] =  { "NULL", "image_url" };
    size_t sizeofArray = sizeof(source_typeArray) / sizeof(source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_type, source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pin_media_source_image_url_t *pin_media_source_image_url_create_internal(
    int *is_standard,
    pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_type,
    char *url
    ) {
    pin_media_source_image_url_t *pin_media_source_image_url_local_var = malloc(sizeof(pin_media_source_image_url_t));
    if (!pin_media_source_image_url_local_var) {
        return NULL;
    }
    memset(pin_media_source_image_url_local_var, 0, sizeof(pin_media_source_image_url_t));
    pin_media_source_image_url_local_var->_library_owned = 1;
    pin_media_source_image_url_local_var->is_standard = is_standard;
    pin_media_source_image_url_local_var->source_type = source_type;
    pin_media_source_image_url_local_var->url = url;
    return pin_media_source_image_url_local_var;
}

__attribute__((deprecated)) pin_media_source_image_url_t *pin_media_source_image_url_create(
    int *is_standard,
    pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_type,
    char *url
    ) {
    int *is_standard_copy = NULL;
    if (is_standard) {
        is_standard_copy = malloc(sizeof(int));
        if (is_standard_copy) *is_standard_copy = *is_standard;
    }
    pin_media_source_image_url_t *result = pin_media_source_image_url_create_internal (
        is_standard_copy,
        source_type,
        url
        );
    if (!result) {
        free(is_standard_copy);
    }
    return result;
}

void pin_media_source_image_url_free(pin_media_source_image_url_t *pin_media_source_image_url) {
    if(NULL == pin_media_source_image_url){
        return ;
    }
    if(pin_media_source_image_url->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_source_image_url_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_image_url->is_standard) {
        free(pin_media_source_image_url->is_standard);
        pin_media_source_image_url->is_standard = NULL;
    }
    if (pin_media_source_image_url->url) {
        free(pin_media_source_image_url->url);
        pin_media_source_image_url->url = NULL;
    }
    free(pin_media_source_image_url);
}

cJSON *pin_media_source_image_url_convertToJSON(pin_media_source_image_url_t *pin_media_source_image_url) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_image_url->is_standard
    if(pin_media_source_image_url->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", *pin_media_source_image_url->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_media_source_image_url->source_type
    if (pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_NULL == pin_media_source_image_url->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", pin_media_source_image_url_source_type_ToString(pin_media_source_image_url->source_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_source_image_url->url
    if (!pin_media_source_image_url->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pin_media_source_image_url->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_source_image_url_t *pin_media_source_image_url_parseFromJSON(cJSON *pin_media_source_image_urlJSON){

    pin_media_source_image_url_t *pin_media_source_image_url_local_var = NULL;

    // define the local variable for pin_media_source_image_url->is_standard
    int *is_standard_local_var = NULL;

    char *url_local_str = NULL;

    // pin_media_source_image_url->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_urlJSON, "is_standard");
    if (cJSON_IsNull(is_standard)) {
        is_standard = NULL;
    }
    if (is_standard) { 
    if(!cJSON_IsBool(is_standard))
    {
    goto end; //Bool
    }
    is_standard_local_var = malloc(sizeof(int));
    if(!is_standard_local_var)
    {
        goto end;
    }
    *is_standard_local_var = is_standard->valueint;
    }

    // pin_media_source_image_url->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_urlJSON, "source_type");
    if (cJSON_IsNull(source_type)) {
        source_type = NULL;
    }
    if (!source_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_typeVariable;
    
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_image_url_source_type_FromString(source_type->valuestring);

    // pin_media_source_image_url->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_urlJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    pin_media_source_image_url_local_var = pin_media_source_image_url_create_internal (
        is_standard_local_var,
        source_typeVariable,
        url_local_str
        );

    if (!pin_media_source_image_url_local_var) {
        goto end;
    }

    return pin_media_source_image_url_local_var;
end:
    if (is_standard_local_var) {
        free(is_standard_local_var);
        is_standard_local_var = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
