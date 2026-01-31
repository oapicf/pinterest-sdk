#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_objectives_filter.h"


char* campaign_objectives_filter_campaign_objective_types_ToString(pinterest_rest_api_campaign_objectives_filter__e campaign_objective_types) {
    char *campaign_objective_typesArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION" };
    return campaign_objective_typesArray[campaign_objective_types - 1];
}

pinterest_rest_api_campaign_objectives_filter__e campaign_objectives_filter_campaign_objective_types_FromString(char* campaign_objective_types) {
    int stringToReturn = 0;
    char *campaign_objective_typesArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION" };
    size_t sizeofArray = sizeof(campaign_objective_typesArray) / sizeof(campaign_objective_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_objective_types, campaign_objective_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static campaign_objectives_filter_t *campaign_objectives_filter_create_internal(
    list_t *campaign_objective_types
    ) {
    campaign_objectives_filter_t *campaign_objectives_filter_local_var = malloc(sizeof(campaign_objectives_filter_t));
    if (!campaign_objectives_filter_local_var) {
        return NULL;
    }
    campaign_objectives_filter_local_var->campaign_objective_types = campaign_objective_types;

    campaign_objectives_filter_local_var->_library_owned = 1;
    return campaign_objectives_filter_local_var;
}

__attribute__((deprecated)) campaign_objectives_filter_t *campaign_objectives_filter_create(
    list_t *campaign_objective_types
    ) {
    return campaign_objectives_filter_create_internal (
        campaign_objective_types
        );
}

void campaign_objectives_filter_free(campaign_objectives_filter_t *campaign_objectives_filter) {
    if(NULL == campaign_objectives_filter){
        return ;
    }
    if(campaign_objectives_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_objectives_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_objectives_filter->campaign_objective_types) {
        list_ForEach(listEntry, campaign_objectives_filter->campaign_objective_types) {
            objective_type_free(listEntry->data);
        }
        list_freeList(campaign_objectives_filter->campaign_objective_types);
        campaign_objectives_filter->campaign_objective_types = NULL;
    }
    free(campaign_objectives_filter);
}

cJSON *campaign_objectives_filter_convertToJSON(campaign_objectives_filter_t *campaign_objectives_filter) {
    cJSON *item = cJSON_CreateObject();

    // campaign_objectives_filter->campaign_objective_types
    if(campaign_objectives_filter->campaign_objective_types != pinterest_rest_api_list_CAMPAIGNOBJECTIVETYPES_NULL) {
    cJSON *campaign_objective_types = cJSON_AddArrayToObject(item, "campaign_objective_types");
    if(campaign_objective_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaign_objective_typesListEntry;
    if (campaign_objectives_filter->campaign_objective_types) {
    list_ForEach(campaign_objective_typesListEntry, campaign_objectives_filter->campaign_objective_types) {
    cJSON *itemLocal = objective_type_convertToJSON((pinterest_rest_api_campaign_objectives_filter__e)campaign_objective_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaign_objective_types, itemLocal);
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

campaign_objectives_filter_t *campaign_objectives_filter_parseFromJSON(cJSON *campaign_objectives_filterJSON){

    campaign_objectives_filter_t *campaign_objectives_filter_local_var = NULL;

    // define the local list for campaign_objectives_filter->campaign_objective_types
    list_t *campaign_objective_typesList = NULL;

    // campaign_objectives_filter->campaign_objective_types
    cJSON *campaign_objective_types = cJSON_GetObjectItemCaseSensitive(campaign_objectives_filterJSON, "campaign_objective_types");
    if (cJSON_IsNull(campaign_objective_types)) {
        campaign_objective_types = NULL;
    }
    if (campaign_objective_types) { 
    cJSON *campaign_objective_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(campaign_objective_types)){
        goto end; //nonprimitive container
    }

    campaign_objective_typesList = list_createList();

    cJSON_ArrayForEach(campaign_objective_types_local_nonprimitive,campaign_objective_types )
    {
        if(!cJSON_IsObject(campaign_objective_types_local_nonprimitive)){
            goto end;
        }
        campaign_objectives_filter_objective_type_e campaign_objective_typesItem = objective_type_parseFromJSON(campaign_objective_types_local_nonprimitive);

        list_addElement(campaign_objective_typesList, (void *)campaign_objective_typesItem);
    }
    }


    campaign_objectives_filter_local_var = campaign_objectives_filter_create_internal (
        campaign_objective_types ? campaign_objective_typesList : NULL
        );

    return campaign_objectives_filter_local_var;
end:
    if (campaign_objective_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_objective_typesList) {
            objective_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_objective_typesList);
        campaign_objective_typesList = NULL;
    }
    return NULL;

}
