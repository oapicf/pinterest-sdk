#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_account_profile_image_update.h"


char* brand_account_profile_image_update_content_type_ToString(pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e content_type) {
    char* content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return content_typeArray[content_type];
}

pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e brand_account_profile_image_update_content_type_FromString(char* content_type){
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

static brand_account_profile_image_update_t *brand_account_profile_image_update_create_internal(
    pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e content_type,
    char *data
    ) {
    brand_account_profile_image_update_t *brand_account_profile_image_update_local_var = malloc(sizeof(brand_account_profile_image_update_t));
    if (!brand_account_profile_image_update_local_var) {
        return NULL;
    }
    memset(brand_account_profile_image_update_local_var, 0, sizeof(brand_account_profile_image_update_t));
    brand_account_profile_image_update_local_var->_library_owned = 1;
    brand_account_profile_image_update_local_var->content_type = content_type;
    brand_account_profile_image_update_local_var->data = data;
    return brand_account_profile_image_update_local_var;
}

__attribute__((deprecated)) brand_account_profile_image_update_t *brand_account_profile_image_update_create(
    pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e content_type,
    char *data
    ) {
    brand_account_profile_image_update_t *result = brand_account_profile_image_update_create_internal (
        content_type,
        data
        );
    if (!result) {
    }
    return result;
}

void brand_account_profile_image_update_free(brand_account_profile_image_update_t *brand_account_profile_image_update) {
    if(NULL == brand_account_profile_image_update){
        return ;
    }
    if(brand_account_profile_image_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_account_profile_image_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (brand_account_profile_image_update->data) {
        free(brand_account_profile_image_update->data);
        brand_account_profile_image_update->data = NULL;
    }
    free(brand_account_profile_image_update);
}

cJSON *brand_account_profile_image_update_convertToJSON(brand_account_profile_image_update_t *brand_account_profile_image_update) {
    cJSON *item = cJSON_CreateObject();

    // brand_account_profile_image_update->content_type
    if(brand_account_profile_image_update->content_type != pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "content_type", brand_account_profile_image_update_content_type_ToString(brand_account_profile_image_update->content_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // brand_account_profile_image_update->data
    if(brand_account_profile_image_update->data) {
    if(cJSON_AddStringToObject(item, "data", brand_account_profile_image_update->data) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

brand_account_profile_image_update_t *brand_account_profile_image_update_parseFromJSON(cJSON *brand_account_profile_image_updateJSON){

    brand_account_profile_image_update_t *brand_account_profile_image_update_local_var = NULL;

    char *data_local_str = NULL;

    // brand_account_profile_image_update->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(brand_account_profile_image_updateJSON, "content_type");
    if (cJSON_IsNull(content_type)) {
        content_type = NULL;
    }
    pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e content_typeVariable;
    if (content_type) { 
    if(!cJSON_IsString(content_type))
    {
    goto end; //Enum
    }
    content_typeVariable = brand_account_profile_image_update_content_type_FromString(content_type->valuestring);
    }

    // brand_account_profile_image_update->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(brand_account_profile_image_updateJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    if(!cJSON_IsString(data) && !cJSON_IsNull(data))
    {
    goto end; //String
    }
    }


    if (data && !cJSON_IsNull(data)) data_local_str = strdup(data->valuestring);

    brand_account_profile_image_update_local_var = brand_account_profile_image_update_create_internal (
        content_type ? content_typeVariable : pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_NULL,
        data_local_str
        );

    if (!brand_account_profile_image_update_local_var) {
        goto end;
    }

    return brand_account_profile_image_update_local_var;
end:
    if (data_local_str) {
        free(data_local_str);
        data_local_str = NULL;
    }
    return NULL;

}
