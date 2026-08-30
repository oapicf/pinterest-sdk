#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_segment.h"



static customer_segment_t *customer_segment_create_internal(
    char *ad_account_id,
    list_t *audience_ids,
    int *created_time,
    char *id,
    char *name,
    targeting_template_status_t *status,
    int *updated_time
    ) {
    customer_segment_t *customer_segment_local_var = malloc(sizeof(customer_segment_t));
    if (!customer_segment_local_var) {
        return NULL;
    }
    memset(customer_segment_local_var, 0, sizeof(customer_segment_t));
    customer_segment_local_var->_library_owned = 1;
    customer_segment_local_var->ad_account_id = ad_account_id;
    customer_segment_local_var->audience_ids = audience_ids;
    customer_segment_local_var->created_time = created_time;
    customer_segment_local_var->id = id;
    customer_segment_local_var->name = name;
    customer_segment_local_var->status = status;
    customer_segment_local_var->updated_time = updated_time;
    return customer_segment_local_var;
}

__attribute__((deprecated)) customer_segment_t *customer_segment_create(
    char *ad_account_id,
    list_t *audience_ids,
    int *created_time,
    char *id,
    char *name,
    targeting_template_status_t *status,
    int *updated_time
    ) {
    int *created_time_copy = NULL;
    if (created_time) {
        created_time_copy = malloc(sizeof(int));
        if (created_time_copy) *created_time_copy = *created_time;
    }
    int *updated_time_copy = NULL;
    if (updated_time) {
        updated_time_copy = malloc(sizeof(int));
        if (updated_time_copy) *updated_time_copy = *updated_time;
    }
    customer_segment_t *result = customer_segment_create_internal (
        ad_account_id,
        audience_ids,
        created_time_copy,
        id,
        name,
        status,
        updated_time_copy
        );
    if (!result) {
        free(created_time_copy);
        free(updated_time_copy);
    }
    return result;
}

void customer_segment_free(customer_segment_t *customer_segment) {
    if(NULL == customer_segment){
        return ;
    }
    if(customer_segment->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_segment_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_segment->ad_account_id) {
        free(customer_segment->ad_account_id);
        customer_segment->ad_account_id = NULL;
    }
    if (customer_segment->audience_ids) {
        list_ForEach(listEntry, customer_segment->audience_ids) {
            free(listEntry->data);
        }
        list_freeList(customer_segment->audience_ids);
        customer_segment->audience_ids = NULL;
    }
    if (customer_segment->created_time) {
        free(customer_segment->created_time);
        customer_segment->created_time = NULL;
    }
    if (customer_segment->id) {
        free(customer_segment->id);
        customer_segment->id = NULL;
    }
    if (customer_segment->name) {
        free(customer_segment->name);
        customer_segment->name = NULL;
    }
    if (customer_segment->status) {
        targeting_template_status_free(customer_segment->status);
        customer_segment->status = NULL;
    }
    if (customer_segment->updated_time) {
        free(customer_segment->updated_time);
        customer_segment->updated_time = NULL;
    }
    free(customer_segment);
}

cJSON *customer_segment_convertToJSON(customer_segment_t *customer_segment) {
    cJSON *item = cJSON_CreateObject();

    // customer_segment->ad_account_id
    if(customer_segment->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", customer_segment->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // customer_segment->audience_ids
    if (!customer_segment->audience_ids) {
        goto fail;
    }
    cJSON *audience_ids = cJSON_AddArrayToObject(item, "audience_ids");
    if(audience_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *audience_idsListEntry;
    list_ForEach(audience_idsListEntry, customer_segment->audience_ids) {
    if(cJSON_AddStringToObject(audience_ids, "", audience_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // customer_segment->created_time
    if(customer_segment->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", *customer_segment->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_segment->id
    if(customer_segment->id) {
    if(cJSON_AddStringToObject(item, "id", customer_segment->id) == NULL) {
    goto fail; //String
    }
    }


    // customer_segment->name
    if (!customer_segment->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", customer_segment->name) == NULL) {
    goto fail; //String
    }


    // customer_segment->status
    if(customer_segment->status) {
    cJSON *status_local_JSON = targeting_template_status_convertToJSON(customer_segment->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // customer_segment->updated_time
    if(customer_segment->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", *customer_segment->updated_time) == NULL) {
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

customer_segment_t *customer_segment_parseFromJSON(cJSON *customer_segmentJSON){

    customer_segment_t *customer_segment_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local list for customer_segment->audience_ids
    list_t *audience_idsList = NULL;

    // define the local variable for customer_segment->created_time
    int *created_time_local_var = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for customer_segment->status
    targeting_template_status_t *status_local_nonprim = NULL;

    // define the local variable for customer_segment->updated_time
    int *updated_time_local_var = NULL;

    // customer_segment->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(customer_segmentJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // customer_segment->audience_ids
    cJSON *audience_ids = cJSON_GetObjectItemCaseSensitive(customer_segmentJSON, "audience_ids");
    if (cJSON_IsNull(audience_ids)) {
        audience_ids = NULL;
    }
    if (!audience_ids) {
        goto end;
    }

    
    cJSON *audience_ids_local = NULL;
    if(!cJSON_IsArray(audience_ids)) {
        goto end;//primitive container
    }
    audience_idsList = list_createList();

    cJSON_ArrayForEach(audience_ids_local, audience_ids)
    {
        if(!cJSON_IsString(audience_ids_local))
        {
            goto end;
        }
        list_addElement(audience_idsList , strdup(audience_ids_local->valuestring));
    }

    // customer_segment->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(customer_segmentJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    created_time_local_var = malloc(sizeof(int));
    if(!created_time_local_var)
    {
        goto end;
    }
    *created_time_local_var = created_time->valuedouble;
    }

    // customer_segment->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(customer_segmentJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // customer_segment->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(customer_segmentJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // customer_segment->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(customer_segmentJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = targeting_template_status_parseFromJSON(status); //custom
    }

    // customer_segment->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(customer_segmentJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    updated_time_local_var = malloc(sizeof(int));
    if(!updated_time_local_var)
    {
        goto end;
    }
    *updated_time_local_var = updated_time->valuedouble;
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    customer_segment_local_var = customer_segment_create_internal (
        ad_account_id_local_str,
        audience_idsList,
        created_time_local_var,
        id_local_str,
        name_local_str,
        status ? status_local_nonprim : NULL,
        updated_time_local_var
        );

    if (!customer_segment_local_var) {
        goto end;
    }

    return customer_segment_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (audience_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, audience_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(audience_idsList);
        audience_idsList = NULL;
    }
    if (created_time_local_var) {
        free(created_time_local_var);
        created_time_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (status_local_nonprim) {
        targeting_template_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (updated_time_local_var) {
        free(updated_time_local_var);
        updated_time_local_var = NULL;
    }
    return NULL;

}
