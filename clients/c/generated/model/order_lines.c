#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_lines.h"



order_lines_t *order_lines_create(
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
    order_line_paid_type_t *paid_type
    ) {
    order_lines_t *order_lines_local_var = malloc(sizeof(order_lines_t));
    if (!order_lines_local_var) {
        return NULL;
    }
    order_lines_local_var->id = id;
    order_lines_local_var->type = type;
    order_lines_local_var->ad_account_id = ad_account_id;
    order_lines_local_var->purchase_order_id = purchase_order_id;
    order_lines_local_var->start_time = start_time;
    order_lines_local_var->end_time = end_time;
    order_lines_local_var->budget = budget;
    order_lines_local_var->paid_budget = paid_budget;
    order_lines_local_var->status = status;
    order_lines_local_var->name = name;
    order_lines_local_var->paid_type = paid_type;

    return order_lines_local_var;
}


void order_lines_free(order_lines_t *order_lines) {
    if(NULL == order_lines){
        return ;
    }
    listEntry_t *listEntry;
    if (order_lines->id) {
        free(order_lines->id);
        order_lines->id = NULL;
    }
    if (order_lines->type) {
        free(order_lines->type);
        order_lines->type = NULL;
    }
    if (order_lines->ad_account_id) {
        free(order_lines->ad_account_id);
        order_lines->ad_account_id = NULL;
    }
    if (order_lines->purchase_order_id) {
        free(order_lines->purchase_order_id);
        order_lines->purchase_order_id = NULL;
    }
    if (order_lines->status) {
        order_line_status_free(order_lines->status);
        order_lines->status = NULL;
    }
    if (order_lines->name) {
        free(order_lines->name);
        order_lines->name = NULL;
    }
    if (order_lines->paid_type) {
        order_line_paid_type_free(order_lines->paid_type);
        order_lines->paid_type = NULL;
    }
    free(order_lines);
}

cJSON *order_lines_convertToJSON(order_lines_t *order_lines) {
    cJSON *item = cJSON_CreateObject();

    // order_lines->id
    if(order_lines->id) {
    if(cJSON_AddStringToObject(item, "id", order_lines->id) == NULL) {
    goto fail; //String
    }
    }


    // order_lines->type
    if(order_lines->type) {
    if(cJSON_AddStringToObject(item, "type", order_lines->type) == NULL) {
    goto fail; //String
    }
    }


    // order_lines->ad_account_id
    if(order_lines->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", order_lines->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // order_lines->purchase_order_id
    if(order_lines->purchase_order_id) {
    if(cJSON_AddStringToObject(item, "purchase_order_id", order_lines->purchase_order_id) == NULL) {
    goto fail; //String
    }
    }


    // order_lines->start_time
    if(order_lines->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", order_lines->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_lines->end_time
    if(order_lines->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", order_lines->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_lines->budget
    if(order_lines->budget) {
    if(cJSON_AddNumberToObject(item, "budget", order_lines->budget) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_lines->paid_budget
    if(order_lines->paid_budget) {
    if(cJSON_AddNumberToObject(item, "paid_budget", order_lines->paid_budget) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_lines->status
    if(order_lines->status) {
    cJSON *status_local_JSON = order_line_status_convertToJSON(order_lines->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_lines->name
    if(order_lines->name) {
    if(cJSON_AddStringToObject(item, "name", order_lines->name) == NULL) {
    goto fail; //String
    }
    }


    // order_lines->paid_type
    if(order_lines->paid_type) {
    cJSON *paid_type_local_JSON = order_line_paid_type_convertToJSON(order_lines->paid_type);
    if(paid_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "paid_type", paid_type_local_JSON);
    if(item->child == NULL) {
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

order_lines_t *order_lines_parseFromJSON(cJSON *order_linesJSON){

    order_lines_t *order_lines_local_var = NULL;

    // define the local variable for order_lines->status
    order_line_status_t *status_local_nonprim = NULL;

    // define the local variable for order_lines->paid_type
    order_line_paid_type_t *paid_type_local_nonprim = NULL;

    // order_lines->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // order_lines->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // order_lines->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // order_lines->purchase_order_id
    cJSON *purchase_order_id = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "purchase_order_id");
    if (purchase_order_id) { 
    if(!cJSON_IsString(purchase_order_id) && !cJSON_IsNull(purchase_order_id))
    {
    goto end; //String
    }
    }

    // order_lines->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // order_lines->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "end_time");
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // order_lines->budget
    cJSON *budget = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "budget");
    if (budget) { 
    if(!cJSON_IsNumber(budget))
    {
    goto end; //Numeric
    }
    }

    // order_lines->paid_budget
    cJSON *paid_budget = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "paid_budget");
    if (paid_budget) { 
    if(!cJSON_IsNumber(paid_budget))
    {
    goto end; //Numeric
    }
    }

    // order_lines->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "status");
    if (status) { 
    status_local_nonprim = order_line_status_parseFromJSON(status); //custom
    }

    // order_lines->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // order_lines->paid_type
    cJSON *paid_type = cJSON_GetObjectItemCaseSensitive(order_linesJSON, "paid_type");
    if (paid_type) { 
    paid_type_local_nonprim = order_line_paid_type_parseFromJSON(paid_type); //custom
    }


    order_lines_local_var = order_lines_create (
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
        paid_type ? paid_type_local_nonprim : NULL
        );

    return order_lines_local_var;
end:
    if (status_local_nonprim) {
        order_line_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (paid_type_local_nonprim) {
        order_line_paid_type_free(paid_type_local_nonprim);
        paid_type_local_nonprim = NULL;
    }
    return NULL;

}
