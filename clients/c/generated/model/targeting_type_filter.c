#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_type_filter.h"


char* targeting_type_filter_targeting_types_ToString(pinterest_rest_api_targeting_type_filter__e targeting_types) {
    char *targeting_typesArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "AGE_BUCKET_AND_GENDER" };
    return targeting_typesArray[targeting_types - 1];
}

pinterest_rest_api_targeting_type_filter__e targeting_type_filter_targeting_types_FromString(char* targeting_types) {
    int stringToReturn = 0;
    char *targeting_typesArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "AGE_BUCKET_AND_GENDER" };
    size_t sizeofArray = sizeof(targeting_typesArray) / sizeof(targeting_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_types, targeting_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

targeting_type_filter_t *targeting_type_filter_create(
    list_t *targeting_types
    ) {
    targeting_type_filter_t *targeting_type_filter_local_var = malloc(sizeof(targeting_type_filter_t));
    if (!targeting_type_filter_local_var) {
        return NULL;
    }
    targeting_type_filter_local_var->targeting_types = targeting_types;

    return targeting_type_filter_local_var;
}


void targeting_type_filter_free(targeting_type_filter_t *targeting_type_filter) {
    if(NULL == targeting_type_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_type_filter->targeting_types) {
        list_ForEach(listEntry, targeting_type_filter->targeting_types) {
            ads_analytics_targeting_type_free(listEntry->data);
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
    goto fail; //nonprimitive container
    }

    listEntry_t *targeting_typesListEntry;
    if (targeting_type_filter->targeting_types) {
    list_ForEach(targeting_typesListEntry, targeting_type_filter->targeting_types) {
    cJSON *itemLocal = ads_analytics_targeting_type_convertToJSON((pinterest_rest_api_targeting_type_filter__e)targeting_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(targeting_types, itemLocal);
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
    if (targeting_types) { 
    cJSON *targeting_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(targeting_types)){
        goto end; //nonprimitive container
    }

    targeting_typesList = list_createList();

    cJSON_ArrayForEach(targeting_types_local_nonprimitive,targeting_types )
    {
        if(!cJSON_IsObject(targeting_types_local_nonprimitive)){
            goto end;
        }
        targeting_type_filter_ads_analytics_targeting_type_e targeting_typesItem = ads_analytics_targeting_type_parseFromJSON(targeting_types_local_nonprimitive);

        list_addElement(targeting_typesList, (void *)targeting_typesItem);
    }
    }


    targeting_type_filter_local_var = targeting_type_filter_create (
        targeting_types ? targeting_typesList : NULL
        );

    return targeting_type_filter_local_var;
end:
    if (targeting_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_typesList) {
            ads_analytics_targeting_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_typesList);
        targeting_typesList = NULL;
    }
    return NULL;

}
