#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_type_filter.h"


char* targeting_type_filter_targeting_types_ToString(pinterest_rest_api_targeting_type_filter_TARGETINGTYPES_e targeting_types) {
    char *targeting_typesArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "MEDIA_TYPE", "AGE_BUCKET_AND_GENDER", "AUDIENCE_MULTIPLIER", "CREATIVE_ENHANCEMENTS", "LOCAL_ADS_STORE_CODE" };
    return targeting_typesArray[targeting_types - 1];
}

pinterest_rest_api_targeting_type_filter_TARGETINGTYPES_e targeting_type_filter_targeting_types_FromString(char* targeting_types) {
    int stringToReturn = 0;
    char *targeting_typesArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "MEDIA_TYPE", "AGE_BUCKET_AND_GENDER", "AUDIENCE_MULTIPLIER", "CREATIVE_ENHANCEMENTS", "LOCAL_ADS_STORE_CODE" };
    size_t sizeofArray = sizeof(targeting_typesArray) / sizeof(targeting_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_types, targeting_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_type_filter_t *targeting_type_filter_create_internal(
    list_t *targeting_types
    ) {
    targeting_type_filter_t *targeting_type_filter_local_var = malloc(sizeof(targeting_type_filter_t));
    if (!targeting_type_filter_local_var) {
        return NULL;
    }
    targeting_type_filter_local_var->targeting_types = targeting_types;

    targeting_type_filter_local_var->_library_owned = 1;
    return targeting_type_filter_local_var;
}

__attribute__((deprecated)) targeting_type_filter_t *targeting_type_filter_create(
    list_t *targeting_types
    ) {
    return targeting_type_filter_create_internal (
        targeting_types
        );
}

void targeting_type_filter_free(targeting_type_filter_t *targeting_type_filter) {
    if(NULL == targeting_type_filter){
        return ;
    }
    if(targeting_type_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_type_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_type_filter->targeting_types) {
        list_ForEach(listEntry, targeting_type_filter->targeting_types) {
            free(listEntry->data);
        }
        list_freeList(targeting_type_filter->targeting_types);
        targeting_type_filter->targeting_types = NULL;
    }
    free(targeting_type_filter);
}

cJSON *targeting_type_filter_convertToJSON(targeting_type_filter_t *targeting_type_filter) {
    cJSON *item = cJSON_CreateObject();

    // targeting_type_filter->targeting_types
    if(targeting_type_filter->targeting_types != pinterest_rest_api_targeting_type_filter_TARGETINGTYPES_NULL) {
    cJSON *targeting_types = cJSON_AddArrayToObject(item, "targeting_types");
    if(targeting_types == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *targeting_typesListEntry;
    list_ForEach(targeting_typesListEntry, targeting_type_filter->targeting_types) {
    if(cJSON_AddStringToObject(targeting_types, "", targeting_typesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

targeting_type_filter_t *targeting_type_filter_parseFromJSON(cJSON *targeting_type_filterJSON){

    targeting_type_filter_t *targeting_type_filter_local_var = NULL;

    // define the local list for targeting_type_filter->targeting_types
    list_t *targeting_typesList = NULL;

    // targeting_type_filter->targeting_types
    cJSON *targeting_types = cJSON_GetObjectItemCaseSensitive(targeting_type_filterJSON, "targeting_types");
    if (cJSON_IsNull(targeting_types)) {
        targeting_types = NULL;
    }
    if (targeting_types) { 
    cJSON *targeting_types_local = NULL;
    if(!cJSON_IsArray(targeting_types)) {
        goto end;//primitive container
    }
    targeting_typesList = list_createList();

    cJSON_ArrayForEach(targeting_types_local, targeting_types)
    {
        if(!cJSON_IsString(targeting_types_local))
        {
            goto end;
        }
        list_addElement(targeting_typesList , strdup(targeting_types_local->valuestring));
    }
    }


    targeting_type_filter_local_var = targeting_type_filter_create_internal (
        targeting_types ? targeting_typesList : NULL
        );

    return targeting_type_filter_local_var;
end:
    if (targeting_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_typesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_typesList);
        targeting_typesList = NULL;
    }
    return NULL;

}
