#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list.h"



static customer_list_t *customer_list_create_internal(
    char *ad_account_id,
    double *created_time,
    object_t *exceptions,
    char *id,
    int *is_nca,
    char *name,
    double *num_batches,
    double *num_removed_user_records,
    double *num_uploaded_user_records,
    customer_list_status_t *status,
    char *type,
    double *updated_time
    ) {
    customer_list_t *customer_list_local_var = malloc(sizeof(customer_list_t));
    if (!customer_list_local_var) {
        return NULL;
    }
    memset(customer_list_local_var, 0, sizeof(customer_list_t));
    customer_list_local_var->_library_owned = 1;
    customer_list_local_var->ad_account_id = ad_account_id;
    customer_list_local_var->created_time = created_time;
    customer_list_local_var->exceptions = exceptions;
    customer_list_local_var->id = id;
    customer_list_local_var->is_nca = is_nca;
    customer_list_local_var->name = name;
    customer_list_local_var->num_batches = num_batches;
    customer_list_local_var->num_removed_user_records = num_removed_user_records;
    customer_list_local_var->num_uploaded_user_records = num_uploaded_user_records;
    customer_list_local_var->status = status;
    customer_list_local_var->type = type;
    customer_list_local_var->updated_time = updated_time;
    return customer_list_local_var;
}

__attribute__((deprecated)) customer_list_t *customer_list_create(
    char *ad_account_id,
    double *created_time,
    object_t *exceptions,
    char *id,
    int *is_nca,
    char *name,
    double *num_batches,
    double *num_removed_user_records,
    double *num_uploaded_user_records,
    customer_list_status_t *status,
    char *type,
    double *updated_time
    ) {
    double *created_time_copy = NULL;
    if (created_time) {
        created_time_copy = malloc(sizeof(double));
        if (created_time_copy) *created_time_copy = *created_time;
    }
    int *is_nca_copy = NULL;
    if (is_nca) {
        is_nca_copy = malloc(sizeof(int));
        if (is_nca_copy) *is_nca_copy = *is_nca;
    }
    double *num_batches_copy = NULL;
    if (num_batches) {
        num_batches_copy = malloc(sizeof(double));
        if (num_batches_copy) *num_batches_copy = *num_batches;
    }
    double *num_removed_user_records_copy = NULL;
    if (num_removed_user_records) {
        num_removed_user_records_copy = malloc(sizeof(double));
        if (num_removed_user_records_copy) *num_removed_user_records_copy = *num_removed_user_records;
    }
    double *num_uploaded_user_records_copy = NULL;
    if (num_uploaded_user_records) {
        num_uploaded_user_records_copy = malloc(sizeof(double));
        if (num_uploaded_user_records_copy) *num_uploaded_user_records_copy = *num_uploaded_user_records;
    }
    double *updated_time_copy = NULL;
    if (updated_time) {
        updated_time_copy = malloc(sizeof(double));
        if (updated_time_copy) *updated_time_copy = *updated_time;
    }
    customer_list_t *result = customer_list_create_internal (
        ad_account_id,
        created_time_copy,
        exceptions,
        id,
        is_nca_copy,
        name,
        num_batches_copy,
        num_removed_user_records_copy,
        num_uploaded_user_records_copy,
        status,
        type,
        updated_time_copy
        );
    if (!result) {
        free(created_time_copy);
        free(is_nca_copy);
        free(num_batches_copy);
        free(num_removed_user_records_copy);
        free(num_uploaded_user_records_copy);
        free(updated_time_copy);
    }
    return result;
}

void customer_list_free(customer_list_t *customer_list) {
    if(NULL == customer_list){
        return ;
    }
    if(customer_list->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list->ad_account_id) {
        free(customer_list->ad_account_id);
        customer_list->ad_account_id = NULL;
    }
    if (customer_list->created_time) {
        free(customer_list->created_time);
        customer_list->created_time = NULL;
    }
    if (customer_list->exceptions) {
        object_free(customer_list->exceptions);
        customer_list->exceptions = NULL;
    }
    if (customer_list->id) {
        free(customer_list->id);
        customer_list->id = NULL;
    }
    if (customer_list->is_nca) {
        free(customer_list->is_nca);
        customer_list->is_nca = NULL;
    }
    if (customer_list->name) {
        free(customer_list->name);
        customer_list->name = NULL;
    }
    if (customer_list->num_batches) {
        free(customer_list->num_batches);
        customer_list->num_batches = NULL;
    }
    if (customer_list->num_removed_user_records) {
        free(customer_list->num_removed_user_records);
        customer_list->num_removed_user_records = NULL;
    }
    if (customer_list->num_uploaded_user_records) {
        free(customer_list->num_uploaded_user_records);
        customer_list->num_uploaded_user_records = NULL;
    }
    if (customer_list->status) {
        customer_list_status_free(customer_list->status);
        customer_list->status = NULL;
    }
    if (customer_list->type) {
        free(customer_list->type);
        customer_list->type = NULL;
    }
    if (customer_list->updated_time) {
        free(customer_list->updated_time);
        customer_list->updated_time = NULL;
    }
    free(customer_list);
}

cJSON *customer_list_convertToJSON(customer_list_t *customer_list) {
    cJSON *item = cJSON_CreateObject();

    // customer_list->ad_account_id
    if(customer_list->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", customer_list->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // customer_list->created_time
    if(customer_list->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", *customer_list->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->exceptions
    if(customer_list->exceptions) {
    cJSON *exceptions_object = object_convertToJSON(customer_list->exceptions);
    if(exceptions_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // customer_list->id
    if (!customer_list->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", customer_list->id) == NULL) {
    goto fail; //String
    }


    // customer_list->is_nca
    if(customer_list->is_nca) {
    if(cJSON_AddBoolToObject(item, "is_nca", *customer_list->is_nca) == NULL) {
    goto fail; //Bool
    }
    }


    // customer_list->name
    if (!customer_list->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", customer_list->name) == NULL) {
    goto fail; //String
    }


    // customer_list->num_batches
    if(customer_list->num_batches) {
    if(cJSON_AddNumberToObject(item, "num_batches", *customer_list->num_batches) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->num_removed_user_records
    if(customer_list->num_removed_user_records) {
    if(cJSON_AddNumberToObject(item, "num_removed_user_records", *customer_list->num_removed_user_records) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->num_uploaded_user_records
    if(customer_list->num_uploaded_user_records) {
    if(cJSON_AddNumberToObject(item, "num_uploaded_user_records", *customer_list->num_uploaded_user_records) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->status
    if(customer_list->status) {
    cJSON *status_local_JSON = customer_list_status_convertToJSON(customer_list->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // customer_list->type
    if(customer_list->type) {
    if(cJSON_AddStringToObject(item, "type", customer_list->type) == NULL) {
    goto fail; //String
    }
    }


    // customer_list->updated_time
    if(customer_list->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", *customer_list->updated_time) == NULL) {
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

customer_list_t *customer_list_parseFromJSON(cJSON *customer_listJSON){

    customer_list_t *customer_list_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for customer_list->created_time
    double *created_time_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for customer_list->is_nca
    int *is_nca_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for customer_list->num_batches
    double *num_batches_local_var = NULL;

    // define the local variable for customer_list->num_removed_user_records
    double *num_removed_user_records_local_var = NULL;

    // define the local variable for customer_list->num_uploaded_user_records
    double *num_uploaded_user_records_local_var = NULL;

    // define the local variable for customer_list->status
    customer_list_status_t *status_local_nonprim = NULL;

    char *type_local_str = NULL;

    // define the local variable for customer_list->updated_time
    double *updated_time_local_var = NULL;

    // customer_list->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // customer_list->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    created_time_local_var = malloc(sizeof(double));
    if(!created_time_local_var)
    {
        goto end;
    }
    *created_time_local_var = created_time->valuedouble;
    }

    // customer_list->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    object_t *exceptions_local_object = NULL;
    if (exceptions) { 
    exceptions_local_object = object_parseFromJSON(exceptions); //object
    }

    // customer_list->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "id");
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

    // customer_list->is_nca
    cJSON *is_nca = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "is_nca");
    if (cJSON_IsNull(is_nca)) {
        is_nca = NULL;
    }
    if (is_nca) { 
    if(!cJSON_IsBool(is_nca))
    {
    goto end; //Bool
    }
    is_nca_local_var = malloc(sizeof(int));
    if(!is_nca_local_var)
    {
        goto end;
    }
    *is_nca_local_var = is_nca->valueint;
    }

    // customer_list->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "name");
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

    // customer_list->num_batches
    cJSON *num_batches = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "num_batches");
    if (cJSON_IsNull(num_batches)) {
        num_batches = NULL;
    }
    if (num_batches) { 
    if(!cJSON_IsNumber(num_batches))
    {
    goto end; //Numeric
    }
    num_batches_local_var = malloc(sizeof(double));
    if(!num_batches_local_var)
    {
        goto end;
    }
    *num_batches_local_var = num_batches->valuedouble;
    }

    // customer_list->num_removed_user_records
    cJSON *num_removed_user_records = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "num_removed_user_records");
    if (cJSON_IsNull(num_removed_user_records)) {
        num_removed_user_records = NULL;
    }
    if (num_removed_user_records) { 
    if(!cJSON_IsNumber(num_removed_user_records))
    {
    goto end; //Numeric
    }
    num_removed_user_records_local_var = malloc(sizeof(double));
    if(!num_removed_user_records_local_var)
    {
        goto end;
    }
    *num_removed_user_records_local_var = num_removed_user_records->valuedouble;
    }

    // customer_list->num_uploaded_user_records
    cJSON *num_uploaded_user_records = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "num_uploaded_user_records");
    if (cJSON_IsNull(num_uploaded_user_records)) {
        num_uploaded_user_records = NULL;
    }
    if (num_uploaded_user_records) { 
    if(!cJSON_IsNumber(num_uploaded_user_records))
    {
    goto end; //Numeric
    }
    num_uploaded_user_records_local_var = malloc(sizeof(double));
    if(!num_uploaded_user_records_local_var)
    {
        goto end;
    }
    *num_uploaded_user_records_local_var = num_uploaded_user_records->valuedouble;
    }

    // customer_list->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = customer_list_status_parseFromJSON(status); //custom
    }

    // customer_list->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // customer_list->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    updated_time_local_var = malloc(sizeof(double));
    if(!updated_time_local_var)
    {
        goto end;
    }
    *updated_time_local_var = updated_time->valuedouble;
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    customer_list_local_var = customer_list_create_internal (
        ad_account_id_local_str,
        created_time_local_var,
        exceptions ? exceptions_local_object : NULL,
        id_local_str,
        is_nca_local_var,
        name_local_str,
        num_batches_local_var,
        num_removed_user_records_local_var,
        num_uploaded_user_records_local_var,
        status ? status_local_nonprim : NULL,
        type_local_str,
        updated_time_local_var
        );

    if (!customer_list_local_var) {
        goto end;
    }

    return customer_list_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (created_time_local_var) {
        free(created_time_local_var);
        created_time_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (is_nca_local_var) {
        free(is_nca_local_var);
        is_nca_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (num_batches_local_var) {
        free(num_batches_local_var);
        num_batches_local_var = NULL;
    }
    if (num_removed_user_records_local_var) {
        free(num_removed_user_records_local_var);
        num_removed_user_records_local_var = NULL;
    }
    if (num_uploaded_user_records_local_var) {
        free(num_uploaded_user_records_local_var);
        num_uploaded_user_records_local_var = NULL;
    }
    if (status_local_nonprim) {
        customer_list_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    if (updated_time_local_var) {
        free(updated_time_local_var);
        updated_time_local_var = NULL;
    }
    return NULL;

}
