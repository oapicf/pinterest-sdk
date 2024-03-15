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

pin_media_source_image_url_t *pin_media_source_image_url_create(
    pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_type,
    char *url,
    int is_standard
    ) {
    pin_media_source_image_url_t *pin_media_source_image_url_local_var = malloc(sizeof(pin_media_source_image_url_t));
    if (!pin_media_source_image_url_local_var) {
        return NULL;
    }
    pin_media_source_image_url_local_var->source_type = source_type;
    pin_media_source_image_url_local_var->url = url;
    pin_media_source_image_url_local_var->is_standard = is_standard;

    return pin_media_source_image_url_local_var;
}


void pin_media_source_image_url_free(pin_media_source_image_url_t *pin_media_source_image_url) {
    if(NULL == pin_media_source_image_url){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_image_url->url) {
        free(pin_media_source_image_url->url);
        pin_media_source_image_url->url = NULL;
    }
    free(pin_media_source_image_url);
}

cJSON *pin_media_source_image_url_convertToJSON(pin_media_source_image_url_t *pin_media_source_image_url) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_image_url->source_type
    if (pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_NULL == pin_media_source_image_url->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", source_typepin_media_source_image_url_ToString(pin_media_source_image_url->source_type)) == NULL)
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


    // pin_media_source_image_url->is_standard
    if(pin_media_source_image_url->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", pin_media_source_image_url->is_standard) == NULL) {
    goto fail; //Bool
    }
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

    // pin_media_source_image_url->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_urlJSON, "source_type");
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
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // pin_media_source_image_url->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_urlJSON, "is_standard");
    if (is_standard) { 
    if(!cJSON_IsBool(is_standard))
    {
    goto end; //Bool
    }
    }


    pin_media_source_image_url_local_var = pin_media_source_image_url_create (
        source_typeVariable,
        strdup(url->valuestring),
        is_standard ? is_standard->valueint : 0
        );

    return pin_media_source_image_url_local_var;
end:
    return NULL;

}
