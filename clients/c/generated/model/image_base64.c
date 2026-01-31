#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image_base64.h"


char* image_base64_content_type_ToString(pinterest_rest_api_image_base64_CONTENTTYPE_e content_type) {
    char* content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return content_typeArray[content_type];
}

pinterest_rest_api_image_base64_CONTENTTYPE_e image_base64_content_type_FromString(char* content_type){
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

static image_base64_t *image_base64_create_internal(
    pinterest_rest_api_image_base64_CONTENTTYPE_e content_type,
    char *data
    ) {
    image_base64_t *image_base64_local_var = malloc(sizeof(image_base64_t));
    if (!image_base64_local_var) {
        return NULL;
    }
    image_base64_local_var->content_type = content_type;
    image_base64_local_var->data = data;

    image_base64_local_var->_library_owned = 1;
    return image_base64_local_var;
}

__attribute__((deprecated)) image_base64_t *image_base64_create(
    pinterest_rest_api_image_base64_CONTENTTYPE_e content_type,
    char *data
    ) {
    return image_base64_create_internal (
        content_type,
        data
        );
}

void image_base64_free(image_base64_t *image_base64) {
    if(NULL == image_base64){
        return ;
    }
    if(image_base64->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "image_base64_free");
        return ;
    }
    listEntry_t *listEntry;
    if (image_base64->data) {
        free(image_base64->data);
        image_base64->data = NULL;
    }
    free(image_base64);
}

cJSON *image_base64_convertToJSON(image_base64_t *image_base64) {
    cJSON *item = cJSON_CreateObject();

    // image_base64->content_type
    if (pinterest_rest_api_image_base64_CONTENTTYPE_NULL == image_base64->content_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content_type", image_base64_content_type_ToString(image_base64->content_type)) == NULL)
    {
    goto fail; //Enum
    }


    // image_base64->data
    if (!image_base64->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", image_base64->data) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

image_base64_t *image_base64_parseFromJSON(cJSON *image_base64JSON){

    image_base64_t *image_base64_local_var = NULL;

    // image_base64->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(image_base64JSON, "content_type");
    if (cJSON_IsNull(content_type)) {
        content_type = NULL;
    }
    if (!content_type) {
        goto end;
    }

    pinterest_rest_api_image_base64_CONTENTTYPE_e content_typeVariable;
    
    if(!cJSON_IsString(content_type))
    {
    goto end; //Enum
    }
    content_typeVariable = image_base64_content_type_FromString(content_type->valuestring);

    // image_base64->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(image_base64JSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    if(!cJSON_IsString(data))
    {
    goto end; //String
    }


    image_base64_local_var = image_base64_create_internal (
        content_typeVariable,
        strdup(data->valuestring)
        );

    return image_base64_local_var;
end:
    return NULL;

}
