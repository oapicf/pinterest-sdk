#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image_metadata.h"


char* image_metadata_item_type_ToString(pinterest_rest_api_image_metadata_ITEMTYPE_e item_type) {
    char* item_typeArray[] =  { "NULL", "image" };
    return item_typeArray[item_type];
}

pinterest_rest_api_image_metadata_ITEMTYPE_e image_metadata_item_type_FromString(char* item_type){
    int stringToReturn = 0;
    char *item_typeArray[] =  { "NULL", "image" };
    size_t sizeofArray = sizeof(item_typeArray) / sizeof(item_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_type, item_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static image_metadata_t *image_metadata_create_internal(
    char *description,
    image_size_t *images,
    pinterest_rest_api_image_metadata_ITEMTYPE_e item_type,
    char *link,
    char *title
    ) {
    image_metadata_t *image_metadata_local_var = malloc(sizeof(image_metadata_t));
    if (!image_metadata_local_var) {
        return NULL;
    }
    memset(image_metadata_local_var, 0, sizeof(image_metadata_t));
    image_metadata_local_var->_library_owned = 1;
    image_metadata_local_var->description = description;
    image_metadata_local_var->images = images;
    image_metadata_local_var->item_type = item_type;
    image_metadata_local_var->link = link;
    image_metadata_local_var->title = title;
    return image_metadata_local_var;
}

__attribute__((deprecated)) image_metadata_t *image_metadata_create(
    char *description,
    image_size_t *images,
    pinterest_rest_api_image_metadata_ITEMTYPE_e item_type,
    char *link,
    char *title
    ) {
    image_metadata_t *result = image_metadata_create_internal (
        description,
        images,
        item_type,
        link,
        title
        );
    if (!result) {
    }
    return result;
}

void image_metadata_free(image_metadata_t *image_metadata) {
    if(NULL == image_metadata){
        return ;
    }
    if(image_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "image_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (image_metadata->description) {
        free(image_metadata->description);
        image_metadata->description = NULL;
    }
    if (image_metadata->images) {
        image_size_free(image_metadata->images);
        image_metadata->images = NULL;
    }
    if (image_metadata->link) {
        free(image_metadata->link);
        image_metadata->link = NULL;
    }
    if (image_metadata->title) {
        free(image_metadata->title);
        image_metadata->title = NULL;
    }
    free(image_metadata);
}

cJSON *image_metadata_convertToJSON(image_metadata_t *image_metadata) {
    cJSON *item = cJSON_CreateObject();

    // image_metadata->description
    if(image_metadata->description) {
    if(cJSON_AddStringToObject(item, "description", image_metadata->description) == NULL) {
    goto fail; //String
    }
    }


    // image_metadata->images
    if(image_metadata->images) {
    cJSON *images_local_JSON = image_size_convertToJSON(image_metadata->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // image_metadata->item_type
    if (pinterest_rest_api_image_metadata_ITEMTYPE_NULL == image_metadata->item_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_type", image_metadata_item_type_ToString(image_metadata->item_type)) == NULL)
    {
    goto fail; //Enum
    }


    // image_metadata->link
    if(image_metadata->link) {
    if(cJSON_AddStringToObject(item, "link", image_metadata->link) == NULL) {
    goto fail; //String
    }
    }


    // image_metadata->title
    if(image_metadata->title) {
    if(cJSON_AddStringToObject(item, "title", image_metadata->title) == NULL) {
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

image_metadata_t *image_metadata_parseFromJSON(cJSON *image_metadataJSON){

    image_metadata_t *image_metadata_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for image_metadata->images
    image_size_t *images_local_nonprim = NULL;

    char *link_local_str = NULL;

    char *title_local_str = NULL;

    // image_metadata->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // image_metadata->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "images");
    if (cJSON_IsNull(images)) {
        images = NULL;
    }
    if (images) { 
    images_local_nonprim = image_size_parseFromJSON(images); //nonprimitive
    }

    // image_metadata->item_type
    cJSON *item_type = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "item_type");
    if (cJSON_IsNull(item_type)) {
        item_type = NULL;
    }
    if (!item_type) {
        goto end;
    }

    pinterest_rest_api_image_metadata_ITEMTYPE_e item_typeVariable;
    
    if(!cJSON_IsString(item_type))
    {
    goto end; //Enum
    }
    item_typeVariable = image_metadata_item_type_FromString(item_type->valuestring);

    // image_metadata->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // image_metadata->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    image_metadata_local_var = image_metadata_create_internal (
        description_local_str,
        images ? images_local_nonprim : NULL,
        item_typeVariable,
        link_local_str,
        title_local_str
        );

    if (!image_metadata_local_var) {
        goto end;
    }

    return image_metadata_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (images_local_nonprim) {
        image_size_free(images_local_nonprim);
        images_local_nonprim = NULL;
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
