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

static pin_media_source_image_base64_t *pin_media_source_image_base64_create_internal(
    pinterest_rest_api_content_type__e content_type,
    char *data,
    int *is_standard,
    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type
    ) {
    pin_media_source_image_base64_t *pin_media_source_image_base64_local_var = malloc(sizeof(pin_media_source_image_base64_t));
    if (!pin_media_source_image_base64_local_var) {
        return NULL;
    }
    memset(pin_media_source_image_base64_local_var, 0, sizeof(pin_media_source_image_base64_t));
    pin_media_source_image_base64_local_var->_library_owned = 1;
    pin_media_source_image_base64_local_var->content_type = content_type;
    pin_media_source_image_base64_local_var->data = data;
    pin_media_source_image_base64_local_var->is_standard = is_standard;
    pin_media_source_image_base64_local_var->source_type = source_type;
    return pin_media_source_image_base64_local_var;
}

__attribute__((deprecated)) pin_media_source_image_base64_t *pin_media_source_image_base64_create(
    pinterest_rest_api_content_type__e content_type,
    char *data,
    int *is_standard,
    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type
    ) {
    int *is_standard_copy = NULL;
    if (is_standard) {
        is_standard_copy = malloc(sizeof(int));
        if (is_standard_copy) *is_standard_copy = *is_standard;
    }
    pin_media_source_image_base64_t *result = pin_media_source_image_base64_create_internal (
        content_type,
        data,
        is_standard_copy,
        source_type
        );
    if (!result) {
        free(is_standard_copy);
    }
    return result;
}

void pin_media_source_image_base64_free(pin_media_source_image_base64_t *pin_media_source_image_base64) {
    if(NULL == pin_media_source_image_base64){
        return ;
    }
    if(pin_media_source_image_base64->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_source_image_base64_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_image_base64->data) {
        free(pin_media_source_image_base64->data);
        pin_media_source_image_base64->data = NULL;
    }
    if (pin_media_source_image_base64->is_standard) {
        free(pin_media_source_image_base64->is_standard);
        pin_media_source_image_base64->is_standard = NULL;
    }
    free(pin_media_source_image_base64);
}

cJSON *pin_media_source_image_base64_convertToJSON(pin_media_source_image_base64_t *pin_media_source_image_base64) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_image_base64->content_type
    if (pinterest_rest_api_content_type__NULL == pin_media_source_image_base64->content_type) {
        goto fail;
    }
    cJSON *content_type_local_JSON = content_type_convertToJSON(pin_media_source_image_base64->content_type);
    if(content_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "content_type", content_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
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
    if(cJSON_AddBoolToObject(item, "is_standard", *pin_media_source_image_base64->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_media_source_image_base64->source_type
    if (pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_NULL == pin_media_source_image_base64->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", pin_media_source_image_base64_source_type_ToString(pin_media_source_image_base64->source_type)) == NULL)
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

pin_media_source_image_base64_t *pin_media_source_image_base64_parseFromJSON(cJSON *pin_media_source_image_base64JSON){

    pin_media_source_image_base64_t *pin_media_source_image_base64_local_var = NULL;

    // define the local variable for pin_media_source_image_base64->content_type
    pinterest_rest_api_content_type__e content_type_local_nonprim = 0;

    char *data_local_str = NULL;

    // define the local variable for pin_media_source_image_base64->is_standard
    int *is_standard_local_var = NULL;

    // pin_media_source_image_base64->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "content_type");
    if (cJSON_IsNull(content_type)) {
        content_type = NULL;
    }
    if (!content_type) {
        goto end;
    }

    
    content_type_local_nonprim = content_type_parseFromJSON(content_type); //custom

    // pin_media_source_image_base64->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "data");
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

    // pin_media_source_image_base64->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "is_standard");
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

    // pin_media_source_image_base64->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_image_base64JSON, "source_type");
    if (cJSON_IsNull(source_type)) {
        source_type = NULL;
    }
    if (!source_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_typeVariable;
    
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_image_base64_source_type_FromString(source_type->valuestring);


    if (data && !cJSON_IsNull(data)) data_local_str = strdup(data->valuestring);

    pin_media_source_image_base64_local_var = pin_media_source_image_base64_create_internal (
        content_type_local_nonprim,
        data_local_str,
        is_standard_local_var,
        source_typeVariable
        );

    if (!pin_media_source_image_base64_local_var) {
        goto end;
    }

    return pin_media_source_image_base64_local_var;
end:
    if (content_type_local_nonprim) {
        content_type_local_nonprim = 0;
    }
    if (data_local_str) {
        free(data_local_str);
        data_local_str = NULL;
    }
    if (is_standard_local_var) {
        free(is_standard_local_var);
        is_standard_local_var = NULL;
    }
    return NULL;

}
