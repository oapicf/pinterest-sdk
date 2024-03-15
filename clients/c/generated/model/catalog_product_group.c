#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalog_product_group.h"


char* catalog_product_group_status_ToString(pinterest_rest_api_catalog_product_group__e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return statusArray[status];
}

pinterest_rest_api_catalog_product_group__e catalog_product_group_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalog_product_group_t *catalog_product_group_create(
    char *id,
    char *merchant_id,
    char *name,
    object_t *filters,
    object_t *filter_v2,
    board_t *type,
    entity_status_t *status,
    char *feed_profile_id,
    int created_at,
    int last_update,
    int product_count,
    int featured_position
    ) {
    catalog_product_group_t *catalog_product_group_local_var = malloc(sizeof(catalog_product_group_t));
    if (!catalog_product_group_local_var) {
        return NULL;
    }
    catalog_product_group_local_var->id = id;
    catalog_product_group_local_var->merchant_id = merchant_id;
    catalog_product_group_local_var->name = name;
    catalog_product_group_local_var->filters = filters;
    catalog_product_group_local_var->filter_v2 = filter_v2;
    catalog_product_group_local_var->type = type;
    catalog_product_group_local_var->status = status;
    catalog_product_group_local_var->feed_profile_id = feed_profile_id;
    catalog_product_group_local_var->created_at = created_at;
    catalog_product_group_local_var->last_update = last_update;
    catalog_product_group_local_var->product_count = product_count;
    catalog_product_group_local_var->featured_position = featured_position;

    return catalog_product_group_local_var;
}


void catalog_product_group_free(catalog_product_group_t *catalog_product_group) {
    if(NULL == catalog_product_group){
        return ;
    }
    listEntry_t *listEntry;
    if (catalog_product_group->id) {
        free(catalog_product_group->id);
        catalog_product_group->id = NULL;
    }
    if (catalog_product_group->merchant_id) {
        free(catalog_product_group->merchant_id);
        catalog_product_group->merchant_id = NULL;
    }
    if (catalog_product_group->name) {
        free(catalog_product_group->name);
        catalog_product_group->name = NULL;
    }
    if (catalog_product_group->filters) {
        object_free(catalog_product_group->filters);
        catalog_product_group->filters = NULL;
    }
    if (catalog_product_group->filter_v2) {
        object_free(catalog_product_group->filter_v2);
        catalog_product_group->filter_v2 = NULL;
    }
    if (catalog_product_group->type) {
        board_free(catalog_product_group->type);
        catalog_product_group->type = NULL;
    }
    if (catalog_product_group->status) {
        entity_status_free(catalog_product_group->status);
        catalog_product_group->status = NULL;
    }
    if (catalog_product_group->feed_profile_id) {
        free(catalog_product_group->feed_profile_id);
        catalog_product_group->feed_profile_id = NULL;
    }
    free(catalog_product_group);
}

cJSON *catalog_product_group_convertToJSON(catalog_product_group_t *catalog_product_group) {
    cJSON *item = cJSON_CreateObject();

    // catalog_product_group->id
    if(catalog_product_group->id) {
    if(cJSON_AddStringToObject(item, "id", catalog_product_group->id) == NULL) {
    goto fail; //String
    }
    }


    // catalog_product_group->merchant_id
    if(catalog_product_group->merchant_id) {
    if(cJSON_AddStringToObject(item, "merchant_id", catalog_product_group->merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // catalog_product_group->name
    if(catalog_product_group->name) {
    if(cJSON_AddStringToObject(item, "name", catalog_product_group->name) == NULL) {
    goto fail; //String
    }
    }


    // catalog_product_group->filters
    if(catalog_product_group->filters) {
    cJSON *filters_object = object_convertToJSON(catalog_product_group->filters);
    if(filters_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalog_product_group->filter_v2
    if(catalog_product_group->filter_v2) {
    cJSON *filter_v2_object = object_convertToJSON(catalog_product_group->filter_v2);
    if(filter_v2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter_v2", filter_v2_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalog_product_group->type
    if(catalog_product_group->type) {
    cJSON *type_local_JSON = board_convertToJSON(catalog_product_group->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalog_product_group->status
    if(catalog_product_group->status != pinterest_rest_api_catalog_product_group__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(catalog_product_group->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalog_product_group->feed_profile_id
    if(catalog_product_group->feed_profile_id) {
    if(cJSON_AddStringToObject(item, "feed_profile_id", catalog_product_group->feed_profile_id) == NULL) {
    goto fail; //String
    }
    }


    // catalog_product_group->created_at
    if(catalog_product_group->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", catalog_product_group->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalog_product_group->last_update
    if(catalog_product_group->last_update) {
    if(cJSON_AddNumberToObject(item, "last_update", catalog_product_group->last_update) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalog_product_group->product_count
    if(catalog_product_group->product_count) {
    if(cJSON_AddNumberToObject(item, "product_count", catalog_product_group->product_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalog_product_group->featured_position
    if(catalog_product_group->featured_position) {
    if(cJSON_AddNumberToObject(item, "featured_position", catalog_product_group->featured_position) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalog_product_group_t *catalog_product_group_parseFromJSON(cJSON *catalog_product_groupJSON){

    catalog_product_group_t *catalog_product_group_local_var = NULL;

    // define the local variable for catalog_product_group->type
    board_t *type_local_nonprim = NULL;

    // define the local variable for catalog_product_group->status
    entity_status_t *status_local_nonprim = NULL;

    // catalog_product_group->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // catalog_product_group->merchant_id
    cJSON *merchant_id = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "merchant_id");
    if (merchant_id) { 
    if(!cJSON_IsString(merchant_id) && !cJSON_IsNull(merchant_id))
    {
    goto end; //String
    }
    }

    // catalog_product_group->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalog_product_group->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "filters");
    object_t *filters_local_object = NULL;
    if (filters) { 
    filters_local_object = object_parseFromJSON(filters); //object
    }

    // catalog_product_group->filter_v2
    cJSON *filter_v2 = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "filter_v2");
    object_t *filter_v2_local_object = NULL;
    if (filter_v2) { 
    filter_v2_local_object = object_parseFromJSON(filter_v2); //object
    }

    // catalog_product_group->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "type");
    if (type) { 
    type_local_nonprim = board_parseFromJSON(type); //nonprimitive
    }

    // catalog_product_group->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "status");
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // catalog_product_group->feed_profile_id
    cJSON *feed_profile_id = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "feed_profile_id");
    if (feed_profile_id) { 
    if(!cJSON_IsString(feed_profile_id) && !cJSON_IsNull(feed_profile_id))
    {
    goto end; //String
    }
    }

    // catalog_product_group->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    }

    // catalog_product_group->last_update
    cJSON *last_update = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "last_update");
    if (last_update) { 
    if(!cJSON_IsNumber(last_update))
    {
    goto end; //Numeric
    }
    }

    // catalog_product_group->product_count
    cJSON *product_count = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "product_count");
    if (product_count) { 
    if(!cJSON_IsNumber(product_count))
    {
    goto end; //Numeric
    }
    }

    // catalog_product_group->featured_position
    cJSON *featured_position = cJSON_GetObjectItemCaseSensitive(catalog_product_groupJSON, "featured_position");
    if (featured_position) { 
    if(!cJSON_IsNumber(featured_position))
    {
    goto end; //Numeric
    }
    }


    catalog_product_group_local_var = catalog_product_group_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        merchant_id && !cJSON_IsNull(merchant_id) ? strdup(merchant_id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        filters ? filters_local_object : NULL,
        filter_v2 ? filter_v2_local_object : NULL,
        type ? type_local_nonprim : NULL,
        status ? status_local_nonprim : NULL,
        feed_profile_id && !cJSON_IsNull(feed_profile_id) ? strdup(feed_profile_id->valuestring) : NULL,
        created_at ? created_at->valuedouble : 0,
        last_update ? last_update->valuedouble : 0,
        product_count ? product_count->valuedouble : 0,
        featured_position ? featured_position->valuedouble : 0
        );

    return catalog_product_group_local_var;
end:
    if (type_local_nonprim) {
        board_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
