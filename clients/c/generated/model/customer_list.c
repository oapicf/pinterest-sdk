#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list.h"


char* customer_list_status_ToString(pinterest_rest_api_customer_list_STATUS_e status) {
    char* statusArray[] =  { "NULL", "PROCESSING", "READY", "TOO_SMALL", "UPLOADING" };
    return statusArray[status];
}

pinterest_rest_api_customer_list_STATUS_e customer_list_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "PROCESSING", "READY", "TOO_SMALL", "UPLOADING" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

customer_list_t *customer_list_create(
    char *ad_account_id,
    double created_time,
    char *id,
    char *name,
    double num_batches,
    double num_removed_user_records,
    double num_uploaded_user_records,
    pinterest_rest_api_customer_list_STATUS_e status,
    char *type,
    double updated_time,
    object_t *exceptions
    ) {
    customer_list_t *customer_list_local_var = malloc(sizeof(customer_list_t));
    if (!customer_list_local_var) {
        return NULL;
    }
    customer_list_local_var->ad_account_id = ad_account_id;
    customer_list_local_var->created_time = created_time;
    customer_list_local_var->id = id;
    customer_list_local_var->name = name;
    customer_list_local_var->num_batches = num_batches;
    customer_list_local_var->num_removed_user_records = num_removed_user_records;
    customer_list_local_var->num_uploaded_user_records = num_uploaded_user_records;
    customer_list_local_var->status = status;
    customer_list_local_var->type = type;
    customer_list_local_var->updated_time = updated_time;
    customer_list_local_var->exceptions = exceptions;

    return customer_list_local_var;
}


void customer_list_free(customer_list_t *customer_list) {
    if(NULL == customer_list){
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list->ad_account_id) {
        free(customer_list->ad_account_id);
        customer_list->ad_account_id = NULL;
    }
    if (customer_list->id) {
        free(customer_list->id);
        customer_list->id = NULL;
    }
    if (customer_list->name) {
        free(customer_list->name);
        customer_list->name = NULL;
    }
    if (customer_list->type) {
        free(customer_list->type);
        customer_list->type = NULL;
    }
    if (customer_list->exceptions) {
        object_free(customer_list->exceptions);
        customer_list->exceptions = NULL;
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
    if(cJSON_AddNumberToObject(item, "created_time", customer_list->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->id
    if(customer_list->id) {
    if(cJSON_AddStringToObject(item, "id", customer_list->id) == NULL) {
    goto fail; //String
    }
    }


    // customer_list->name
    if(customer_list->name) {
    if(cJSON_AddStringToObject(item, "name", customer_list->name) == NULL) {
    goto fail; //String
    }
    }


    // customer_list->num_batches
    if(customer_list->num_batches) {
    if(cJSON_AddNumberToObject(item, "num_batches", customer_list->num_batches) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->num_removed_user_records
    if(customer_list->num_removed_user_records) {
    if(cJSON_AddNumberToObject(item, "num_removed_user_records", customer_list->num_removed_user_records) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->num_uploaded_user_records
    if(customer_list->num_uploaded_user_records) {
    if(cJSON_AddNumberToObject(item, "num_uploaded_user_records", customer_list->num_uploaded_user_records) == NULL) {
    goto fail; //Numeric
    }
    }


    // customer_list->status
    if(customer_list->status != pinterest_rest_api_customer_list_STATUS_NULL) {
    if(cJSON_AddStringToObject(item, "status", statuscustomer_list_ToString(customer_list->status)) == NULL)
    {
    goto fail; //Enum
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
    if(cJSON_AddNumberToObject(item, "updated_time", customer_list->updated_time) == NULL) {
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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

customer_list_t *customer_list_parseFromJSON(cJSON *customer_listJSON){

    customer_list_t *customer_list_local_var = NULL;

    // customer_list->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // customer_list->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // customer_list->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // customer_list->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // customer_list->num_batches
    cJSON *num_batches = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "num_batches");
    if (num_batches) { 
    if(!cJSON_IsNumber(num_batches))
    {
    goto end; //Numeric
    }
    }

    // customer_list->num_removed_user_records
    cJSON *num_removed_user_records = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "num_removed_user_records");
    if (num_removed_user_records) { 
    if(!cJSON_IsNumber(num_removed_user_records))
    {
    goto end; //Numeric
    }
    }

    // customer_list->num_uploaded_user_records
    cJSON *num_uploaded_user_records = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "num_uploaded_user_records");
    if (num_uploaded_user_records) { 
    if(!cJSON_IsNumber(num_uploaded_user_records))
    {
    goto end; //Numeric
    }
    }

    // customer_list->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "status");
    pinterest_rest_api_customer_list_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = customer_list_status_FromString(status->valuestring);
    }

    // customer_list->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // customer_list->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "updated_time");
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }

    // customer_list->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(customer_listJSON, "exceptions");
    object_t *exceptions_local_object = NULL;
    if (exceptions) { 
    exceptions_local_object = object_parseFromJSON(exceptions); //object
    }


    customer_list_local_var = customer_list_create (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        num_batches ? num_batches->valuedouble : 0,
        num_removed_user_records ? num_removed_user_records->valuedouble : 0,
        num_uploaded_user_records ? num_uploaded_user_records->valuedouble : 0,
        status ? statusVariable : pinterest_rest_api_customer_list_STATUS_NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        updated_time ? updated_time->valuedouble : 0,
        exceptions ? exceptions_local_object : NULL
        );

    return customer_list_local_var;
end:
    return NULL;

}
