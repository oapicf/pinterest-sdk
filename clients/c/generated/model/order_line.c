#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line.h"



static order_line_t *order_line_create_internal(
    char *ad_account_id,
    double *budget,
    list_t *campaign_ids,
    double *end_time,
    char *id,
    char *name,
    double *paid_budget,
    order_line_paid_type_t *paid_type,
    char *purchase_order_id,
    double *start_time,
    order_line_status_t *status,
    char *type
    ) {
    order_line_t *order_line_local_var = malloc(sizeof(order_line_t));
    if (!order_line_local_var) {
        return NULL;
    }
    memset(order_line_local_var, 0, sizeof(order_line_t));
    order_line_local_var->_library_owned = 1;
    order_line_local_var->ad_account_id = ad_account_id;
    order_line_local_var->budget = budget;
    order_line_local_var->campaign_ids = campaign_ids;
    order_line_local_var->end_time = end_time;
    order_line_local_var->id = id;
    order_line_local_var->name = name;
    order_line_local_var->paid_budget = paid_budget;
    order_line_local_var->paid_type = paid_type;
    order_line_local_var->purchase_order_id = purchase_order_id;
    order_line_local_var->start_time = start_time;
    order_line_local_var->status = status;
    order_line_local_var->type = type;
    return order_line_local_var;
}

__attribute__((deprecated)) order_line_t *order_line_create(
    char *ad_account_id,
    double *budget,
    list_t *campaign_ids,
    double *end_time,
    char *id,
    char *name,
    double *paid_budget,
    order_line_paid_type_t *paid_type,
    char *purchase_order_id,
    double *start_time,
    order_line_status_t *status,
    char *type
    ) {
    double *budget_copy = NULL;
    if (budget) {
        budget_copy = malloc(sizeof(double));
        if (budget_copy) *budget_copy = *budget;
    }
    double *end_time_copy = NULL;
    if (end_time) {
        end_time_copy = malloc(sizeof(double));
        if (end_time_copy) *end_time_copy = *end_time;
    }
    double *paid_budget_copy = NULL;
    if (paid_budget) {
        paid_budget_copy = malloc(sizeof(double));
        if (paid_budget_copy) *paid_budget_copy = *paid_budget;
    }
    double *start_time_copy = NULL;
    if (start_time) {
        start_time_copy = malloc(sizeof(double));
        if (start_time_copy) *start_time_copy = *start_time;
    }
    order_line_t *result = order_line_create_internal (
        ad_account_id,
        budget_copy,
        campaign_ids,
        end_time_copy,
        id,
        name,
        paid_budget_copy,
        paid_type,
        purchase_order_id,
        start_time_copy,
        status,
        type
        );
    if (!result) {
        free(budget_copy);
        free(end_time_copy);
        free(paid_budget_copy);
        free(start_time_copy);
    }
    return result;
}

void order_line_free(order_line_t *order_line) {
    if(NULL == order_line){
        return ;
    }
    if(order_line->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "order_line_free");
        return ;
    }
    listEntry_t *listEntry;
    if (order_line->ad_account_id) {
        free(order_line->ad_account_id);
        order_line->ad_account_id = NULL;
    }
    if (order_line->budget) {
        free(order_line->budget);
        order_line->budget = NULL;
    }
    if (order_line->campaign_ids) {
        list_ForEach(listEntry, order_line->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(order_line->campaign_ids);
        order_line->campaign_ids = NULL;
    }
    if (order_line->end_time) {
        free(order_line->end_time);
        order_line->end_time = NULL;
    }
    if (order_line->id) {
        free(order_line->id);
        order_line->id = NULL;
    }
    if (order_line->name) {
        free(order_line->name);
        order_line->name = NULL;
    }
    if (order_line->paid_budget) {
        free(order_line->paid_budget);
        order_line->paid_budget = NULL;
    }
    if (order_line->paid_type) {
        order_line_paid_type_free(order_line->paid_type);
        order_line->paid_type = NULL;
    }
    if (order_line->purchase_order_id) {
        free(order_line->purchase_order_id);
        order_line->purchase_order_id = NULL;
    }
    if (order_line->start_time) {
        free(order_line->start_time);
        order_line->start_time = NULL;
    }
    if (order_line->status) {
        order_line_status_free(order_line->status);
        order_line->status = NULL;
    }
    if (order_line->type) {
        free(order_line->type);
        order_line->type = NULL;
    }
    free(order_line);
}

cJSON *order_line_convertToJSON(order_line_t *order_line) {
    cJSON *item = cJSON_CreateObject();

    // order_line->ad_account_id
    if (!order_line->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", order_line->ad_account_id) == NULL) {
    goto fail; //String
    }


    // order_line->budget
    if(order_line->budget) {
    if(cJSON_AddNumberToObject(item, "budget", *order_line->budget) == NULL) {
    goto fail; //Numeric
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
    if(cJSON_AddStringToObject(campaign_ids, "", campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // order_line->end_time
    if(order_line->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", *order_line->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_line->id
    if (!order_line->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", order_line->id) == NULL) {
    goto fail; //String
    }


    // order_line->name
    if(order_line->name) {
    if(cJSON_AddStringToObject(item, "name", order_line->name) == NULL) {
    goto fail; //String
    }
    }


    // order_line->paid_budget
    if(order_line->paid_budget) {
    if(cJSON_AddNumberToObject(item, "paid_budget", *order_line->paid_budget) == NULL) {
    goto fail; //Numeric
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


    // order_line->purchase_order_id
    if(order_line->purchase_order_id) {
    if(cJSON_AddStringToObject(item, "purchase_order_id", order_line->purchase_order_id) == NULL) {
    goto fail; //String
    }
    }


    // order_line->start_time
    if(order_line->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", *order_line->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_line->status
    if (!order_line->status) {
        goto fail;
    }
    cJSON *status_local_JSON = order_line_status_convertToJSON(order_line->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // order_line->type
    if (!order_line->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", order_line->type) == NULL) {
    goto fail; //String
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

    char *ad_account_id_local_str = NULL;

    // define the local variable for order_line->budget
    double *budget_local_var = NULL;

    // define the local list for order_line->campaign_ids
    list_t *campaign_idsList = NULL;

    // define the local variable for order_line->end_time
    double *end_time_local_var = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for order_line->paid_budget
    double *paid_budget_local_var = NULL;

    // define the local variable for order_line->paid_type
    order_line_paid_type_t *paid_type_local_nonprim = NULL;

    char *purchase_order_id_local_str = NULL;

    // define the local variable for order_line->start_time
    double *start_time_local_var = NULL;

    // define the local variable for order_line->status
    order_line_status_t *status_local_nonprim = NULL;

    char *type_local_str = NULL;

    // order_line->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // order_line->budget
    cJSON *budget = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "budget");
    if (cJSON_IsNull(budget)) {
        budget = NULL;
    }
    if (budget) { 
    if(!cJSON_IsNumber(budget))
    {
    goto end; //Numeric
    }
    budget_local_var = malloc(sizeof(double));
    if(!budget_local_var)
    {
        goto end;
    }
    *budget_local_var = budget->valuedouble;
    }

    // order_line->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "campaign_ids");
    if (cJSON_IsNull(campaign_ids)) {
        campaign_ids = NULL;
    }
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

    // order_line->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    end_time_local_var = malloc(sizeof(double));
    if(!end_time_local_var)
    {
        goto end;
    }
    *end_time_local_var = end_time->valuedouble;
    }

    // order_line->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // order_line->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // order_line->paid_budget
    cJSON *paid_budget = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "paid_budget");
    if (cJSON_IsNull(paid_budget)) {
        paid_budget = NULL;
    }
    if (paid_budget) { 
    if(!cJSON_IsNumber(paid_budget))
    {
    goto end; //Numeric
    }
    paid_budget_local_var = malloc(sizeof(double));
    if(!paid_budget_local_var)
    {
        goto end;
    }
    *paid_budget_local_var = paid_budget->valuedouble;
    }

    // order_line->paid_type
    cJSON *paid_type = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "paid_type");
    if (cJSON_IsNull(paid_type)) {
        paid_type = NULL;
    }
    if (paid_type) { 
    paid_type_local_nonprim = order_line_paid_type_parseFromJSON(paid_type); //custom
    }

    // order_line->purchase_order_id
    cJSON *purchase_order_id = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "purchase_order_id");
    if (cJSON_IsNull(purchase_order_id)) {
        purchase_order_id = NULL;
    }
    if (purchase_order_id) { 
    if(!cJSON_IsString(purchase_order_id) && !cJSON_IsNull(purchase_order_id))
    {
    goto end; //String
    }
    }

    // order_line->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    start_time_local_var = malloc(sizeof(double));
    if(!start_time_local_var)
    {
        goto end;
    }
    *start_time_local_var = start_time->valuedouble;
    }

    // order_line->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = order_line_status_parseFromJSON(status); //custom

    // order_line->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(order_lineJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (purchase_order_id && !cJSON_IsNull(purchase_order_id)) purchase_order_id_local_str = strdup(purchase_order_id->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    order_line_local_var = order_line_create_internal (
        ad_account_id_local_str,
        budget_local_var,
        campaign_idsList,
        end_time_local_var,
        id_local_str,
        name_local_str,
        paid_budget_local_var,
        paid_type ? paid_type_local_nonprim : NULL,
        purchase_order_id_local_str,
        start_time_local_var,
        status_local_nonprim,
        type_local_str
        );

    if (!order_line_local_var) {
        goto end;
    }

    return order_line_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (budget_local_var) {
        free(budget_local_var);
        budget_local_var = NULL;
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
    if (end_time_local_var) {
        free(end_time_local_var);
        end_time_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (paid_budget_local_var) {
        free(paid_budget_local_var);
        paid_budget_local_var = NULL;
    }
    if (paid_type_local_nonprim) {
        order_line_paid_type_free(paid_type_local_nonprim);
        paid_type_local_nonprim = NULL;
    }
    if (purchase_order_id_local_str) {
        free(purchase_order_id_local_str);
        purchase_order_id_local_str = NULL;
    }
    if (start_time_local_var) {
        free(start_time_local_var);
        start_time_local_var = NULL;
    }
    if (status_local_nonprim) {
        order_line_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    return NULL;

}
