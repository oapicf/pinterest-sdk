#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_image_base64.h"


char* pin_media_source_image_base64_source_type_ToString(pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type) {
    char* source_typeArray[] =  { "NULL", "image_base64" };
    return source_typeArray[source_type];
}

pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e pin_media_source_image_base64_source_type_FromString(char* source_type){
    int stringToReturn = 0;
    char *source_typeArray[] =  { "NULL", "image_base64" };
    size_t sizeofArray = sizeof(source_typeArray) / sizeof(source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_type, source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* pin_media_source_image_base64_content_type_ToString(pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e content_type) {
    char* content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return content_typeArray[content_type];
}

pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e pin_media_source_image_base64_content_type_FromString(char* content_type){
    int stringToReturn = 0;
    char *content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    size_t sizeofArray = sizeof(content_typeArray) / sizeof(content_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(content_type, content_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

pin_media_source_image_base64_t *pin_media_source_image_base64_create(
    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type,
    pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e content_type,
    char *data,
    int is_standard
    ) {
    pin_media_source_image_base64_t *pin_media_source_image_base64_local_var = malloc(sizeof(pin_media_source_image_base64_t));
    if (!pin_media_source_image_base64_local_var) {
        return NULL;
    }
    pin_media_source_image_base64_local_var->source_type = source_type;
    pin_media_source_image_base64_local_var->content_type = content_type;
    pin_media_source_image_base64_local_var->data = data;
    pin_media_source_image_base64_local_var->is_standard = is_standard;

    return pin_media_source_image_base64_local_var;
}


void pin_media_source_image_base64_free(pin_media_source_image_base64_t *pin_media_source_image_base64) {
    if(NULL == pin_media_source_image_base64){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_image_base64->data) {
        free(pin_media_source_image_base64->data);
        pin_media_source_image_base64->data = NULL;
    }
    free(pin_media_source_image_base64);
}

cJSON *pin_media_source_image_base64_convertToJSON(pin_media_source_image_base64_t *pin_media_source_image_base64) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_image_base64->source_type
    if (pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_NULL == pin_media_source_image_base64->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", source_typepin_media_source_image_base64_ToString(pin_media_source_image_base64->source_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_source_image_base64->content_type
    if (pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_NULL == pin_media_source_image_base64->content_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content_type", content_typepin_media_source_image_base64_ToString(pin_media_source_image_base64->content_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_source_image_base64->data
    if (!pin_media_source_image_base64->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", pin_media_source_image_base64->data) == NULL) {
    goto fail; //String
    }


    // pin_media_source_image_base64->is_standard
    if(pin_media_source_image_base64->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", pin_media_source_image_base64->is_standard) == NULL) {
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

pin_media_source_image_base64_t *pin_media_source_image_base64_parseFromJSON(cJSON *pin_media_source_image_base64JSON){

    pin_media_source_image_base64_t *pin_media_source_image_base64_local_var = NULL;

    // pin_media_source_image_base64->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "source_type");
    if (!source_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_typeVariable;
    
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_image_base64_source_type_FromString(source_type->valuestring);

    // pin_media_source_image_base64->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "content_type");
    if (!content_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e content_typeVariable;
    
    if(!cJSON_IsString(content_type))
    {
    goto end; //Enum
    }
    content_typeVariable = pin_media_source_image_base64_content_type_FromString(content_type->valuestring);

    // pin_media_source_image_base64->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "data");
    if (!data) {
        goto end;
    }

    
    if(!cJSON_IsString(data))
    {
    goto end; //String
    }

    // pin_media_source_image_base64->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "is_standard");
    if (is_standard) { 
    if(!cJSON_IsBool(is_standard))
    {
    goto end; //Bool
    }
    }


    pin_media_source_image_base64_local_var = pin_media_source_image_base64_create (
        source_typeVariable,
        content_typeVariable,
        strdup(data->valuestring),
        is_standard ? is_standard->valueint : 0
        );

    return pin_media_source_image_base64_local_var;
end:
    return NULL;

}
