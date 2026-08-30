#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_images_base64_item.h"



static pin_media_source_images_base64_item_t *pin_media_source_images_base64_item_create_internal(
    pinterest_rest_api_content_type__e content_type,
    char *data,
    char *description,
    char *link,
    char *title
    ) {
    pin_media_source_images_base64_item_t *pin_media_source_images_base64_item_local_var = malloc(sizeof(pin_media_source_images_base64_item_t));
    if (!pin_media_source_images_base64_item_local_var) {
        return NULL;
    }
    memset(pin_media_source_images_base64_item_local_var, 0, sizeof(pin_media_source_images_base64_item_t));
    pin_media_source_images_base64_item_local_var->_library_owned = 1;
    pin_media_source_images_base64_item_local_var->content_type = content_type;
    pin_media_source_images_base64_item_local_var->data = data;
    pin_media_source_images_base64_item_local_var->description = description;
    pin_media_source_images_base64_item_local_var->link = link;
    pin_media_source_images_base64_item_local_var->title = title;
    return pin_media_source_images_base64_item_local_var;
}

__attribute__((deprecated)) pin_media_source_images_base64_item_t *pin_media_source_images_base64_item_create(
    pinterest_rest_api_content_type__e content_type,
    char *data,
    char *description,
    char *link,
    char *title
    ) {
    pin_media_source_images_base64_item_t *result = pin_media_source_images_base64_item_create_internal (
        content_type,
        data,
        description,
        link,
        title
        );
    if (!result) {
    }
    return result;
}

void pin_media_source_images_base64_item_free(pin_media_source_images_base64_item_t *pin_media_source_images_base64_item) {
    if(NULL == pin_media_source_images_base64_item){
        return ;
    }
    if(pin_media_source_images_base64_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_source_images_base64_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_images_base64_item->data) {
        free(pin_media_source_images_base64_item->data);
        pin_media_source_images_base64_item->data = NULL;
    }
    if (pin_media_source_images_base64_item->description) {
        free(pin_media_source_images_base64_item->description);
        pin_media_source_images_base64_item->description = NULL;
    }
    if (pin_media_source_images_base64_item->link) {
        free(pin_media_source_images_base64_item->link);
        pin_media_source_images_base64_item->link = NULL;
    }
    if (pin_media_source_images_base64_item->title) {
        free(pin_media_source_images_base64_item->title);
        pin_media_source_images_base64_item->title = NULL;
    }
    free(pin_media_source_images_base64_item);
}

cJSON *pin_media_source_images_base64_item_convertToJSON(pin_media_source_images_base64_item_t *pin_media_source_images_base64_item) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_images_base64_item->content_type
    if (pinterest_rest_api_content_type__NULL == pin_media_source_images_base64_item->content_type) {
        goto fail;
    }
    cJSON *content_type_local_JSON = content_type_convertToJSON(pin_media_source_images_base64_item->content_type);
    if(content_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "content_type", content_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // pin_media_source_images_base64_item->data
    if (!pin_media_source_images_base64_item->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", pin_media_source_images_base64_item->data) == NULL) {
    goto fail; //String
    }


    // pin_media_source_images_base64_item->description
    if(pin_media_source_images_base64_item->description) {
    if(cJSON_AddStringToObject(item, "description", pin_media_source_images_base64_item->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_base64_item->link
    if(pin_media_source_images_base64_item->link) {
    if(cJSON_AddStringToObject(item, "link", pin_media_source_images_base64_item->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_base64_item->title
    if(pin_media_source_images_base64_item->title) {
    if(cJSON_AddStringToObject(item, "title", pin_media_source_images_base64_item->title) == NULL) {
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

pin_media_source_images_base64_item_t *pin_media_source_images_base64_item_parseFromJSON(cJSON *pin_media_source_images_base64_itemJSON){

    pin_media_source_images_base64_item_t *pin_media_source_images_base64_item_local_var = NULL;

    // define the local variable for pin_media_source_images_base64_item->content_type
    pinterest_rest_api_content_type__e content_type_local_nonprim = 0;

    char *data_local_str = NULL;

    char *description_local_str = NULL;

    char *link_local_str = NULL;

    char *title_local_str = NULL;

    // pin_media_source_images_base64_item->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_itemJSON, "content_type");
    if (cJSON_IsNull(content_type)) {
        content_type = NULL;
    }
    if (!content_type) {
        goto end;
    }

    
    content_type_local_nonprim = content_type_parseFromJSON(content_type); //custom

    // pin_media_source_images_base64_item->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_itemJSON, "data");
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

    // pin_media_source_images_base64_item->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_itemJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_base64_item->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_itemJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_base64_item->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_base64_itemJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    if (data && !cJSON_IsNull(data)) data_local_str = strdup(data->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    pin_media_source_images_base64_item_local_var = pin_media_source_images_base64_item_create_internal (
        content_type_local_nonprim,
        data_local_str,
        description_local_str,
        link_local_str,
        title_local_str
        );

    if (!pin_media_source_images_base64_item_local_var) {
        goto end;
    }

    return pin_media_source_images_base64_item_local_var;
end:
    if (content_type_local_nonprim) {
        content_type_local_nonprim = 0;
    }
    if (data_local_str) {
        free(data_local_str);
        data_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
