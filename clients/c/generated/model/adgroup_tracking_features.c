#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "adgroup_tracking_features.h"


char* adgroup_tracking_features_enabled_ToString(pinterest_rest_api_adgroup_tracking_features__e enabled) {
    char *enabledArray[] =  { "NULL", "TRENDS", "CLONE_META", "BULK_EDITOR", "AD_ROTATION" };
    return enabledArray[enabled - 1];
}

pinterest_rest_api_adgroup_tracking_features__e adgroup_tracking_features_enabled_FromString(char* enabled) {
    int stringToReturn = 0;
    char *enabledArray[] =  { "NULL", "TRENDS", "CLONE_META", "BULK_EDITOR", "AD_ROTATION" };
    size_t sizeofArray = sizeof(enabledArray) / sizeof(enabledArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(enabled, enabledArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static adgroup_tracking_features_t *adgroup_tracking_features_create_internal(
    list_t *enabled
    ) {
    adgroup_tracking_features_t *adgroup_tracking_features_local_var = malloc(sizeof(adgroup_tracking_features_t));
    if (!adgroup_tracking_features_local_var) {
        return NULL;
    }
    memset(adgroup_tracking_features_local_var, 0, sizeof(adgroup_tracking_features_t));
    adgroup_tracking_features_local_var->_library_owned = 1;
    adgroup_tracking_features_local_var->enabled = enabled;
    return adgroup_tracking_features_local_var;
}

__attribute__((deprecated)) adgroup_tracking_features_t *adgroup_tracking_features_create(
    list_t *enabled
    ) {
    adgroup_tracking_features_t *result = adgroup_tracking_features_create_internal (
        enabled
        );
    if (!result) {
    }
    return result;
}

void adgroup_tracking_features_free(adgroup_tracking_features_t *adgroup_tracking_features) {
    if(NULL == adgroup_tracking_features){
        return ;
    }
    if(adgroup_tracking_features->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "adgroup_tracking_features_free");
        return ;
    }
    listEntry_t *listEntry;
    if (adgroup_tracking_features->enabled) {
        list_ForEach(listEntry, adgroup_tracking_features->enabled) {
            adgroup_tracking_feature_type_free(listEntry->data);
        }
        list_freeList(adgroup_tracking_features->enabled);
        adgroup_tracking_features->enabled = NULL;
    }
    free(adgroup_tracking_features);
}

cJSON *adgroup_tracking_features_convertToJSON(adgroup_tracking_features_t *adgroup_tracking_features) {
    cJSON *item = cJSON_CreateObject();

    // adgroup_tracking_features->enabled
    if(adgroup_tracking_features->enabled != pinterest_rest_api_list_ENABLED_NULL) {
    cJSON *enabled = cJSON_AddArrayToObject(item, "enabled");
    if(enabled == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *enabledListEntry;
    if (adgroup_tracking_features->enabled) {
    list_ForEach(enabledListEntry, adgroup_tracking_features->enabled) {
    cJSON *itemLocal = adgroup_tracking_feature_type_convertToJSON((pinterest_rest_api_adgroup_tracking_features__e)enabledListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(enabled, itemLocal);
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

adgroup_tracking_features_t *adgroup_tracking_features_parseFromJSON(cJSON *adgroup_tracking_featuresJSON){

    adgroup_tracking_features_t *adgroup_tracking_features_local_var = NULL;

    // define the local list for adgroup_tracking_features->enabled
    list_t *enabledList = NULL;

    // adgroup_tracking_features->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(adgroup_tracking_featuresJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    cJSON *enabled_local_nonprimitive = NULL;
    if(!cJSON_IsArray(enabled)){
        goto end; //nonprimitive container
    }

    enabledList = list_createList();

    cJSON_ArrayForEach(enabled_local_nonprimitive,enabled )
    {
        if(!cJSON_IsObject(enabled_local_nonprimitive)){
            goto end;
        }
        adgroup_tracking_features_adgroup_tracking_feature_type_e enabledItem = adgroup_tracking_feature_type_parseFromJSON(enabled_local_nonprimitive);

        list_addElement(enabledList, (void *)enabledItem);
    }
    }



    adgroup_tracking_features_local_var = adgroup_tracking_features_create_internal (
        enabled ? enabledList : NULL
        );

    if (!adgroup_tracking_features_local_var) {
        goto end;
    }

    return adgroup_tracking_features_local_var;
end:
    if (enabledList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, enabledList) {
            adgroup_tracking_feature_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(enabledList);
        enabledList = NULL;
    }
    return NULL;

}
