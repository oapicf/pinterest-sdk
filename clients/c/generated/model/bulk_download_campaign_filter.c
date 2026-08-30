#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_download_campaign_filter.h"


char* bulk_download_campaign_filter_campaign_status_ToString(pinterest_rest_api_bulk_download_campaign_filter__e campaign_status) {
    char *campaign_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return campaign_statusArray[campaign_status - 1];
}

pinterest_rest_api_bulk_download_campaign_filter__e bulk_download_campaign_filter_campaign_status_FromString(char* campaign_status) {
    int stringToReturn = 0;
    char *campaign_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(campaign_statusArray) / sizeof(campaign_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_status, campaign_statusArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* bulk_download_campaign_filter_objective_type_ToString(pinterest_rest_api_bulk_download_campaign_filter__e objective_type) {
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    return objective_typeArray[objective_type - 1];
}

pinterest_rest_api_bulk_download_campaign_filter__e bulk_download_campaign_filter_objective_type_FromString(char* objective_type) {
    int stringToReturn = 0;
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    size_t sizeofArray = sizeof(objective_typeArray) / sizeof(objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(objective_type, objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static bulk_download_campaign_filter_t *bulk_download_campaign_filter_create_internal(
    list_t *campaign_status,
    char *end_time,
    char *name,
    list_t *objective_type,
    char *start_time
    ) {
    bulk_download_campaign_filter_t *bulk_download_campaign_filter_local_var = malloc(sizeof(bulk_download_campaign_filter_t));
    if (!bulk_download_campaign_filter_local_var) {
        return NULL;
    }
    memset(bulk_download_campaign_filter_local_var, 0, sizeof(bulk_download_campaign_filter_t));
    bulk_download_campaign_filter_local_var->_library_owned = 1;
    bulk_download_campaign_filter_local_var->campaign_status = campaign_status;
    bulk_download_campaign_filter_local_var->end_time = end_time;
    bulk_download_campaign_filter_local_var->name = name;
    bulk_download_campaign_filter_local_var->objective_type = objective_type;
    bulk_download_campaign_filter_local_var->start_time = start_time;
    return bulk_download_campaign_filter_local_var;
}

__attribute__((deprecated)) bulk_download_campaign_filter_t *bulk_download_campaign_filter_create(
    list_t *campaign_status,
    char *end_time,
    char *name,
    list_t *objective_type,
    char *start_time
    ) {
    bulk_download_campaign_filter_t *result = bulk_download_campaign_filter_create_internal (
        campaign_status,
        end_time,
        name,
        objective_type,
        start_time
        );
    if (!result) {
    }
    return result;
}

void bulk_download_campaign_filter_free(bulk_download_campaign_filter_t *bulk_download_campaign_filter) {
    if(NULL == bulk_download_campaign_filter){
        return ;
    }
    if(bulk_download_campaign_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_download_campaign_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_download_campaign_filter->campaign_status) {
        list_ForEach(listEntry, bulk_download_campaign_filter->campaign_status) {
            summary_status_free(listEntry->data);
        }
        list_freeList(bulk_download_campaign_filter->campaign_status);
        bulk_download_campaign_filter->campaign_status = NULL;
    }
    if (bulk_download_campaign_filter->end_time) {
        free(bulk_download_campaign_filter->end_time);
        bulk_download_campaign_filter->end_time = NULL;
    }
    if (bulk_download_campaign_filter->name) {
        free(bulk_download_campaign_filter->name);
        bulk_download_campaign_filter->name = NULL;
    }
    if (bulk_download_campaign_filter->objective_type) {
        list_ForEach(listEntry, bulk_download_campaign_filter->objective_type) {
            conversion_objective_type_free(listEntry->data);
        }
        list_freeList(bulk_download_campaign_filter->objective_type);
        bulk_download_campaign_filter->objective_type = NULL;
    }
    if (bulk_download_campaign_filter->start_time) {
        free(bulk_download_campaign_filter->start_time);
        bulk_download_campaign_filter->start_time = NULL;
    }
    free(bulk_download_campaign_filter);
}

cJSON *bulk_download_campaign_filter_convertToJSON(bulk_download_campaign_filter_t *bulk_download_campaign_filter) {
    cJSON *item = cJSON_CreateObject();

    // bulk_download_campaign_filter->campaign_status
    if(bulk_download_campaign_filter->campaign_status != pinterest_rest_api_list_CAMPAIGNSTATUS_NULL) {
    cJSON *campaign_status = cJSON_AddArrayToObject(item, "campaign_status");
    if(campaign_status == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaign_statusListEntry;
    if (bulk_download_campaign_filter->campaign_status) {
    list_ForEach(campaign_statusListEntry, bulk_download_campaign_filter->campaign_status) {
    cJSON *itemLocal = summary_status_convertToJSON((pinterest_rest_api_bulk_download_campaign_filter__e)campaign_statusListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaign_status, itemLocal);
    }
    }
    }


    // bulk_download_campaign_filter->end_time
    if(bulk_download_campaign_filter->end_time) {
    if(cJSON_AddStringToObject(item, "end_time", bulk_download_campaign_filter->end_time) == NULL) {
    goto fail; //String
    }
    }


    // bulk_download_campaign_filter->name
    if(bulk_download_campaign_filter->name) {
    if(cJSON_AddStringToObject(item, "name", bulk_download_campaign_filter->name) == NULL) {
    goto fail; //String
    }
    }


    // bulk_download_campaign_filter->objective_type
    if(bulk_download_campaign_filter->objective_type != pinterest_rest_api_list_OBJECTIVETYPE_NULL) {
    cJSON *objective_type = cJSON_AddArrayToObject(item, "objective_type");
    if(objective_type == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *objective_typeListEntry;
    if (bulk_download_campaign_filter->objective_type) {
    list_ForEach(objective_typeListEntry, bulk_download_campaign_filter->objective_type) {
    cJSON *itemLocal = conversion_objective_type_convertToJSON((pinterest_rest_api_bulk_download_campaign_filter__e)objective_typeListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(objective_type, itemLocal);
    }
    }
    }


    // bulk_download_campaign_filter->start_time
    if(bulk_download_campaign_filter->start_time) {
    if(cJSON_AddStringToObject(item, "start_time", bulk_download_campaign_filter->start_time) == NULL) {
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

bulk_download_campaign_filter_t *bulk_download_campaign_filter_parseFromJSON(cJSON *bulk_download_campaign_filterJSON){

    bulk_download_campaign_filter_t *bulk_download_campaign_filter_local_var = NULL;

    // define the local list for bulk_download_campaign_filter->campaign_status
    list_t *campaign_statusList = NULL;

    char *end_time_local_str = NULL;

    char *name_local_str = NULL;

    // define the local list for bulk_download_campaign_filter->objective_type
    list_t *objective_typeList = NULL;

    char *start_time_local_str = NULL;

    // bulk_download_campaign_filter->campaign_status
    cJSON *campaign_status = cJSON_GetObjectItemCaseSensitive(bulk_download_campaign_filterJSON, "campaign_status");
    if (cJSON_IsNull(campaign_status)) {
        campaign_status = NULL;
    }
    if (campaign_status) { 
    cJSON *campaign_status_local_nonprimitive = NULL;
    if(!cJSON_IsArray(campaign_status)){
        goto end; //nonprimitive container
    }

    campaign_statusList = list_createList();

    cJSON_ArrayForEach(campaign_status_local_nonprimitive,campaign_status )
    {
        if(!cJSON_IsObject(campaign_status_local_nonprimitive)){
            goto end;
        }
        bulk_download_campaign_filter_summary_status_e campaign_statusItem = summary_status_parseFromJSON(campaign_status_local_nonprimitive);

        list_addElement(campaign_statusList, (void *)campaign_statusItem);
    }
    }

    // bulk_download_campaign_filter->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(bulk_download_campaign_filterJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsString(end_time) && !cJSON_IsNull(end_time))
    {
    goto end; //String
    }
    }

    // bulk_download_campaign_filter->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(bulk_download_campaign_filterJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // bulk_download_campaign_filter->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(bulk_download_campaign_filterJSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (objective_type) { 
    cJSON *objective_type_local_nonprimitive = NULL;
    if(!cJSON_IsArray(objective_type)){
        goto end; //nonprimitive container
    }

    objective_typeList = list_createList();

    cJSON_ArrayForEach(objective_type_local_nonprimitive,objective_type )
    {
        if(!cJSON_IsObject(objective_type_local_nonprimitive)){
            goto end;
        }
        bulk_download_campaign_filter_conversion_objective_type_e objective_typeItem = conversion_objective_type_parseFromJSON(objective_type_local_nonprimitive);

        list_addElement(objective_typeList, (void *)objective_typeItem);
    }
    }

    // bulk_download_campaign_filter->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(bulk_download_campaign_filterJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsString(start_time) && !cJSON_IsNull(start_time))
    {
    goto end; //String
    }
    }


    if (end_time && !cJSON_IsNull(end_time)) end_time_local_str = strdup(end_time->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (start_time && !cJSON_IsNull(start_time)) start_time_local_str = strdup(start_time->valuestring);

    bulk_download_campaign_filter_local_var = bulk_download_campaign_filter_create_internal (
        campaign_status ? campaign_statusList : NULL,
        end_time_local_str,
        name_local_str,
        objective_type ? objective_typeList : NULL,
        start_time_local_str
        );

    if (!bulk_download_campaign_filter_local_var) {
        goto end;
    }

    return bulk_download_campaign_filter_local_var;
end:
    if (campaign_statusList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_statusList) {
            summary_status_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_statusList);
        campaign_statusList = NULL;
    }
    if (end_time_local_str) {
        free(end_time_local_str);
        end_time_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (objective_typeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, objective_typeList) {
            conversion_objective_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(objective_typeList);
        objective_typeList = NULL;
    }
    if (start_time_local_str) {
        free(start_time_local_str);
        start_time_local_str = NULL;
    }
    return NULL;

}
