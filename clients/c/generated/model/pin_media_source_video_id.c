#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_video_id.h"


char* pin_media_source_video_id_source_type_ToString(pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type) {
    char* source_typeArray[] =  { "NULL", "video_id" };
    return source_typeArray[source_type];
}

pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e pin_media_source_video_id_source_type_FromString(char* source_type){
    int stringToReturn = 0;
    char *source_typeArray[] =  { "NULL", "video_id" };
    size_t sizeofArray = sizeof(source_typeArray) / sizeof(source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_type, source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* pin_media_source_video_id_cover_image_content_type_ToString(pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e cover_image_content_type) {
    char* cover_image_content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return cover_image_content_typeArray[cover_image_content_type];
}

pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e pin_media_source_video_id_cover_image_content_type_FromString(char* cover_image_content_type){
    int stringToReturn = 0;
    char *cover_image_content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    size_t sizeofArray = sizeof(cover_image_content_typeArray) / sizeof(cover_image_content_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(cover_image_content_type, cover_image_content_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

pin_media_source_video_id_t *pin_media_source_video_id_create(
    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type,
    char *cover_image_url,
    pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e cover_image_content_type,
    char *cover_image_data,
    char *media_id,
    int is_standard
    ) {
    pin_media_source_video_id_t *pin_media_source_video_id_local_var = malloc(sizeof(pin_media_source_video_id_t));
    if (!pin_media_source_video_id_local_var) {
        return NULL;
    }
    pin_media_source_video_id_local_var->source_type = source_type;
    pin_media_source_video_id_local_var->cover_image_url = cover_image_url;
    pin_media_source_video_id_local_var->cover_image_content_type = cover_image_content_type;
    pin_media_source_video_id_local_var->cover_image_data = cover_image_data;
    pin_media_source_video_id_local_var->media_id = media_id;
    pin_media_source_video_id_local_var->is_standard = is_standard;

    return pin_media_source_video_id_local_var;
}


void pin_media_source_video_id_free(pin_media_source_video_id_t *pin_media_source_video_id) {
    if(NULL == pin_media_source_video_id){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_video_id->cover_image_url) {
        free(pin_media_source_video_id->cover_image_url);
        pin_media_source_video_id->cover_image_url = NULL;
    }
    if (pin_media_source_video_id->cover_image_data) {
        free(pin_media_source_video_id->cover_image_data);
        pin_media_source_video_id->cover_image_data = NULL;
    }
    if (pin_media_source_video_id->media_id) {
        free(pin_media_source_video_id->media_id);
        pin_media_source_video_id->media_id = NULL;
    }
    free(pin_media_source_video_id);
}

cJSON *pin_media_source_video_id_convertToJSON(pin_media_source_video_id_t *pin_media_source_video_id) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_video_id->source_type
    if (pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_NULL == pin_media_source_video_id->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", source_typepin_media_source_video_id_ToString(pin_media_source_video_id->source_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_source_video_id->cover_image_url
    if(pin_media_source_video_id->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", pin_media_source_video_id->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_video_id->cover_image_content_type
    if(pin_media_source_video_id->cover_image_content_type != pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "cover_image_content_type", cover_image_content_typepin_media_source_video_id_ToString(pin_media_source_video_id->cover_image_content_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // pin_media_source_video_id->cover_image_data
    if(pin_media_source_video_id->cover_image_data) {
    if(cJSON_AddStringToObject(item, "cover_image_data", pin_media_source_video_id->cover_image_data) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_video_id->media_id
    if (!pin_media_source_video_id->media_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_id", pin_media_source_video_id->media_id) == NULL) {
    goto fail; //String
    }


    // pin_media_source_video_id->is_standard
    if(pin_media_source_video_id->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", pin_media_source_video_id->is_standard) == NULL) {
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

pin_media_source_video_id_t *pin_media_source_video_id_parseFromJSON(cJSON *pin_media_source_video_idJSON){

    pin_media_source_video_id_t *pin_media_source_video_id_local_var = NULL;

    // pin_media_source_video_id->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "source_type");
    if (!source_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_typeVariable;
    
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_video_id_source_type_FromString(source_type->valuestring);

    // pin_media_source_video_id->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "cover_image_url");
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // pin_media_source_video_id->cover_image_content_type
    cJSON *cover_image_content_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "cover_image_content_type");
    pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e cover_image_content_typeVariable;
    if (cover_image_content_type) { 
    if(!cJSON_IsString(cover_image_content_type))
    {
    goto end; //Enum
    }
    cover_image_content_typeVariable = pin_media_source_video_id_cover_image_content_type_FromString(cover_image_content_type->valuestring);
    }

    // pin_media_source_video_id->cover_image_data
    cJSON *cover_image_data = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "cover_image_data");
    if (cover_image_data) { 
    if(!cJSON_IsString(cover_image_data) && !cJSON_IsNull(cover_image_data))
    {
    goto end; //String
    }
    }

    // pin_media_source_video_id->media_id
    cJSON *media_id = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "media_id");
    if (!media_id) {
        goto end;
    }

    
    if(!cJSON_IsString(media_id))
    {
    goto end; //String
    }

    // pin_media_source_video_id->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "is_standard");
    if (is_standard) { 
    if(!cJSON_IsBool(is_standard))
    {
    goto end; //Bool
    }
    }


    pin_media_source_video_id_local_var = pin_media_source_video_id_create (
        source_typeVariable,
        cover_image_url && !cJSON_IsNull(cover_image_url) ? strdup(cover_image_url->valuestring) : NULL,
        cover_image_content_type ? cover_image_content_typeVariable : pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_NULL,
        cover_image_data && !cJSON_IsNull(cover_image_data) ? strdup(cover_image_data->valuestring) : NULL,
        strdup(media_id->valuestring),
        is_standard ? is_standard->valueint : 0
        );

    return pin_media_source_video_id_local_var;
end:
    return NULL;

}
