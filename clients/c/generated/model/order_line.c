#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line.h"



order_line_t *order_line_create(
    char *id,
    char *type,
    char *ad_account_id,
    char *purchase_order_id,
    double start_time,
    double end_time,
    double budget,
    double paid_budget,
    order_line_status_t *status,
    char *name,
    order_line_paid_type_t *paid_type,
    list_t *campaign_ids
    ) {
    order_line_t *order_line_local_var = malloc(sizeof(order_line_t));
    if (!order_line_local_var) {
        return NULL;
    }
    order_line_local_var->id = id;
    order_line_local_var->type = type;
    order_line_local_var->ad_account_id = ad_account_id;
    order_line_local_var->purchase_order_id = purchase_order_id;
    order_line_local_var->start_time = start_time;
    order_line_local_var->end_time = end_time;
    order_line_local_var->budget = budget;
    order_line_local_var->paid_budget = paid_budget;
    order_line_local_var->status = status;
    order_line_local_var->name = name;
    order_line_local_var->paid_type = paid_type;
    order_line_local_var->campaign_ids = campaign_ids;

    return order_line_local_var;
}


void order_line_free(order_line_t *order_line) {
    if(NULL == order_line){
        return ;
    }
    listEntry_t *listEntry;
    if (order_line->id) {
        free(order_line->id);
        order_line->id = NULL;
    }
    if (order_line->type) {
        free(order_line->type);
        order_line->type = NULL;
    }
    if (order_line->ad_account_id) {
        free(order_line->ad_account_id);
        order_line->ad_account_id = NULL;
    }
    if (order_line->purchase_order_id) {
        free(order_line->purchase_order_id);
        order_line->purchase_order_id = NULL;
    }
    if (order_line->status) {
        order_line_status_free(order_line->status);
        order_line->status = NULL;
    }
    if (order_line->name) {
        free(order_line->name);
        order_line->name = NULL;
    }
    if (order_line->paid_type) {
        order_line_paid_type_free(order_line->paid_type);
        order_line->paid_type = NULL;
    }
    if (order_line->campaign_ids) {
        list_ForEach(listEntry, order_line->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(order_line->campaign_ids);
        order_line->campaign_ids = NULL;
    }
    free(order_line);
}

cJSON *order_line_convertToJSON(order_line_t *order_line) {
    cJSON *item = cJSON_CreateObject();

    // order_line->id
    if(order_line->id) {
    if(cJSON_AddStringToObject(item, "id", order_line->id) == NULL) {
    goto fail; //String
    }
    }


    // order_line->type
    if(order_line->type) {
    if(cJSON_AddStringToObject(item, "type", order_line->type) == NULL) {
    goto fail; //String
    }
    }


    // order_line->ad_account_id
    if(order_line->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", order_line->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // order_line->purchase_order_id
    if(order_line->purchase_order_id) {
    if(cJSON_AddStringToObject(item, "purchase_order_id", order_line->purchase_order_id) == NULL) {
    goto fail; //String
    }
    }


    // order_line->start_time
    if(order_line->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", order_line->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_line->end_time
    if(order_line->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", order_line->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_line->budget
    if(order_line->budget) {
    if(cJSON_AddNumberToObject(item, "budget", order_line->budget) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_line->paid_budget
    if(order_line->paid_budget) {
    if(cJSON_AddNumberToObject(item, "paid_budget", order_line->paid_budget) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_line->status
    if(order_line->status) {
    cJSON *status_local_JSON = order_line_status_convertToJSON(order_line->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_line->name
    if(order_line->name) {
    if(cJSON_AddStringToObject(item, "name", order_line->name) == NULL) {
    goto fail; //String
    }
    }


    // order_line->paid_type
    if(order_line->paid_type) {
    cJSON *paid_type_local_JSON = order_line_paid_type_convertToJSON(order_line->paid_type);
    if(paid_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "paid_type", paid_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_line->campaign_ids
    if (!order_line->campaign_ids) {
        goto fail;
    }
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaign_ids");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, order_line->campaign_ids) {
    if(cJSON_AddStringToObject(campaign_ids, "", (char*)campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_line_t *order_line_parseFromJSON(cJSON *order_lineJSON){

    order_line_t *order_line_local_var = NULL;

    // define the local variable for order_line->status
    order_line_status_t *status_local_nonprim = NULL;

    // define the local variable for order_line->paid_type
    order_line_paid_type_t *paid_type_local_nonprim = NULL;

    // define the local list for order_line->campaign_ids
    list_t *campaign_idsList = NULL;

    // order_line->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // order_line->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // order_line->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // order_line->purchase_order_id
    cJSON *purchase_order_id = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "purchase_order_id");
    if (purchase_order_id) { 
    if(!cJSON_IsString(purchase_order_id) && !cJSON_IsNull(purchase_order_id))
    {
    goto end; //String
    }
    }

    // order_line->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // order_line->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "end_time");
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // order_line->budget
    cJSON *budget = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "budget");
    if (budget) { 
    if(!cJSON_IsNumber(budget))
    {
    goto end; //Numeric
    }
    }

    // order_line->paid_budget
    cJSON *paid_budget = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "paid_budget");
    if (paid_budget) { 
    if(!cJSON_IsNumber(paid_budget))
    {
    goto end; //Numeric
    }
    }

    // order_line->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "status");
    if (status) { 
    status_local_nonprim = order_line_status_parseFromJSON(status); //custom
    }

    // order_line->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // order_line->paid_type
    cJSON *paid_type = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "paid_type");
    if (paid_type) { 
    paid_type_local_nonprim = order_line_paid_type_parseFromJSON(paid_type); //custom
    }

    // order_line->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "campaign_ids");
    if (!campaign_ids) {
        goto end;
    }

    
    cJSON *campaign_ids_local = NULL;
    if(!cJSON_IsArray(campaign_ids)) {
        goto end;//primitive container
    }
    campaign_idsList = list_createList();

    cJSON_ArrayForEach(campaign_ids_local, campaign_ids)
    {
        if(!cJSON_IsString(campaign_ids_local))
        {
            goto end;
        }
        list_addElement(campaign_idsList , strdup(campaign_ids_local->valuestring));
    }


    order_line_local_var = order_line_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        purchase_order_id && !cJSON_IsNull(purchase_order_id) ? strdup(purchase_order_id->valuestring) : NULL,
        start_time ? start_time->valuedouble : 0,
        end_time ? end_time->valuedouble : 0,
        budget ? budget->valuedouble : 0,
        paid_budget ? paid_budget->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        paid_type ? paid_type_local_nonprim : NULL,
        campaign_idsList
        );

    return order_line_local_var;
end:
    if (status_local_nonprim) {
        order_line_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (paid_type_local_nonprim) {
        order_line_paid_type_free(paid_type_local_nonprim);
        paid_type_local_nonprim = NULL;
    }
    if (campaign_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idsList);
        campaign_idsList = NULL;
    }
    return NULL;

}
