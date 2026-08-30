#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_account_profile_image.h"


char* brand_account_profile_image_content_type_ToString(pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e content_type) {
    char* content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return content_typeArray[content_type];
}

pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e brand_account_profile_image_content_type_FromString(char* content_type){
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

static brand_account_profile_image_t *brand_account_profile_image_create_internal(
    pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e content_type,
    char *data
    ) {
    brand_account_profile_image_t *brand_account_profile_image_local_var = malloc(sizeof(brand_account_profile_image_t));
    if (!brand_account_profile_image_local_var) {
        return NULL;
    }
    memset(brand_account_profile_image_local_var, 0, sizeof(brand_account_profile_image_t));
    brand_account_profile_image_local_var->_library_owned = 1;
    brand_account_profile_image_local_var->content_type = content_type;
    brand_account_profile_image_local_var->data = data;
    return brand_account_profile_image_local_var;
}

__attribute__((deprecated)) brand_account_profile_image_t *brand_account_profile_image_create(
    pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e content_type,
    char *data
    ) {
    brand_account_profile_image_t *result = brand_account_profile_image_create_internal (
        content_type,
        data
        );
    if (!result) {
    }
    return result;
}

void brand_account_profile_image_free(brand_account_profile_image_t *brand_account_profile_image) {
    if(NULL == brand_account_profile_image){
        return ;
    }
    if(brand_account_profile_image->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_account_profile_image_free");
        return ;
    }
    listEntry_t *listEntry;
    if (brand_account_profile_image->data) {
        free(brand_account_profile_image->data);
        brand_account_profile_image->data = NULL;
    }
    free(brand_account_profile_image);
}

cJSON *brand_account_profile_image_convertToJSON(brand_account_profile_image_t *brand_account_profile_image) {
    cJSON *item = cJSON_CreateObject();

    // brand_account_profile_image->content_type
    if (pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_NULL == brand_account_profile_image->content_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content_type", brand_account_profile_image_content_type_ToString(brand_account_profile_image->content_type)) == NULL)
    {
    goto fail; //Enum
    }


    // brand_account_profile_image->data
    if (!brand_account_profile_image->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", brand_account_profile_image->data) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

brand_account_profile_image_t *brand_account_profile_image_parseFromJSON(cJSON *brand_account_profile_imageJSON){

    brand_account_profile_image_t *brand_account_profile_image_local_var = NULL;

    char *data_local_str = NULL;

    // brand_account_profile_image->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(brand_account_profile_imageJSON, "content_type");
    if (cJSON_IsNull(content_type)) {
        content_type = NULL;
    }
    if (!content_type) {
        goto end;
    }

    pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e content_typeVariable;
    
    if(!cJSON_IsString(content_type))
    {
    goto end; //Enum
    }
    content_typeVariable = brand_account_profile_image_content_type_FromString(content_type->valuestring);

    // brand_account_profile_image->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(brand_account_profile_imageJSON, "data");
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


    if (data && !cJSON_IsNull(data)) data_local_str = strdup(data->valuestring);

    brand_account_profile_image_local_var = brand_account_profile_image_create_internal (
        content_typeVariable,
        data_local_str
        );

    if (!brand_account_profile_image_local_var) {
        goto end;
    }

    return brand_account_profile_image_local_var;
end:
    if (data_local_str) {
        free(data_local_str);
        data_local_str = NULL;
    }
    return NULL;

}
