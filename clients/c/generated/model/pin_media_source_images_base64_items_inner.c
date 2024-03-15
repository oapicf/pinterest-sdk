#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_images_base64_items_inner.h"


char* pin_media_source_images_base64_items_inner_content_type_ToString(pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e content_type) {
    char* content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return content_typeArray[content_type];
}

pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e pin_media_source_images_base64_items_inner_content_type_FromString(char* content_type){
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

pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner_create(
    char *title,
    char *description,
    char *link,
    pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e content_type,
    char *data
    ) {
    pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner_local_var = malloc(sizeof(pin_media_source_images_base64_items_inner_t));
    if (!pin_media_source_images_base64_items_inner_local_var) {
        return NULL;
    }
    pin_media_source_images_base64_items_inner_local_var->title = title;
    pin_media_source_images_base64_items_inner_local_var->description = description;
    pin_media_source_images_base64_items_inner_local_var->link = link;
    pin_media_source_images_base64_items_inner_local_var->content_type = content_type;
    pin_media_source_images_base64_items_inner_local_var->data = data;

    return pin_media_source_images_base64_items_inner_local_var;
}


void pin_media_source_images_base64_items_inner_free(pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner) {
    if(NULL == pin_media_source_images_base64_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_images_base64_items_inner->title) {
        free(pin_media_source_images_base64_items_inner->title);
        pin_media_source_images_base64_items_inner->title = NULL;
    }
    if (pin_media_source_images_base64_items_inner->description) {
        free(pin_media_source_images_base64_items_inner->description);
        pin_media_source_images_base64_items_inner->description = NULL;
    }
    if (pin_media_source_images_base64_items_inner->link) {
        free(pin_media_source_images_base64_items_inner->link);
        pin_media_source_images_base64_items_inner->link = NULL;
    }
    if (pin_media_source_images_base64_items_inner->data) {
        free(pin_media_source_images_base64_items_inner->data);
        pin_media_source_images_base64_items_inner->data = NULL;
    }
    free(pin_media_source_images_base64_items_inner);
}

cJSON *pin_media_source_images_base64_items_inner_convertToJSON(pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_images_base64_items_inner->title
    if(pin_media_source_images_base64_items_inner->title) {
    if(cJSON_AddStringToObject(item, "title", pin_media_source_images_base64_items_inner->title) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_base64_items_inner->description
    if(pin_media_source_images_base64_items_inner->description) {
    if(cJSON_AddStringToObject(item, "description", pin_media_source_images_base64_items_inner->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_base64_items_inner->link
    if(pin_media_source_images_base64_items_inner->link) {
    if(cJSON_AddStringToObject(item, "link", pin_media_source_images_base64_items_inner->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_base64_items_inner->content_type
    if (pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_NULL == pin_media_source_images_base64_items_inner->content_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content_type", content_typepin_media_source_images_base64_items_inner_ToString(pin_media_source_images_base64_items_inner->content_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_source_images_base64_items_inner->data
    if (!pin_media_source_images_base64_items_inner->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", pin_media_source_images_base64_items_inner->data) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner_parseFromJSON(cJSON *pin_media_source_images_base64_items_innerJSON){

    pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner_local_var = NULL;

    // pin_media_source_images_base64_items_inner->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_items_innerJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_base64_items_inner->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_items_innerJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_base64_items_inner->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_items_innerJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_base64_items_inner->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_items_innerJSON, "content_type");
    if (!content_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e content_typeVariable;
    
    if(!cJSON_IsString(content_type))
    {
    goto end; //Enum
    }
    content_typeVariable = pin_media_source_images_base64_items_inner_content_type_FromString(content_type->valuestring);

    // pin_media_source_images_base64_items_inner->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_items_innerJSON, "data");
    if (!data) {
        goto end;
    }

    
    if(!cJSON_IsString(data))
    {
    goto end; //String
    }


    pin_media_source_images_base64_items_inner_local_var = pin_media_source_images_base64_items_inner_create (
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        content_typeVariable,
        strdup(data->valuestring)
        );

    return pin_media_source_images_base64_items_inner_local_var;
end:
    return NULL;

}
