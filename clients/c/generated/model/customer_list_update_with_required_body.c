#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_update_with_required_body.h"



static customer_list_update_with_required_body_t *customer_list_update_with_required_body_create_internal(
    user_list_operation_type_t *operation_type,
    char *records,
    list_t *records_v2
    ) {
    customer_list_update_with_required_body_t *customer_list_update_with_required_body_local_var = malloc(sizeof(customer_list_update_with_required_body_t));
    if (!customer_list_update_with_required_body_local_var) {
        return NULL;
    }
    memset(customer_list_update_with_required_body_local_var, 0, sizeof(customer_list_update_with_required_body_t));
    customer_list_update_with_required_body_local_var->_library_owned = 1;
    customer_list_update_with_required_body_local_var->operation_type = operation_type;
    customer_list_update_with_required_body_local_var->records = records;
    customer_list_update_with_required_body_local_var->records_v2 = records_v2;
    return customer_list_update_with_required_body_local_var;
}

__attribute__((deprecated)) customer_list_update_with_required_body_t *customer_list_update_with_required_body_create(
    user_list_operation_type_t *operation_type,
    char *records,
    list_t *records_v2
    ) {
    customer_list_update_with_required_body_t *result = customer_list_update_with_required_body_create_internal (
        operation_type,
        records,
        records_v2
        );
    if (!result) {
    }
    return result;
}

void customer_list_update_with_required_body_free(customer_list_update_with_required_body_t *customer_list_update_with_required_body) {
    if(NULL == customer_list_update_with_required_body){
        return ;
    }
    if(customer_list_update_with_required_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_update_with_required_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_update_with_required_body->operation_type) {
        user_list_operation_type_free(customer_list_update_with_required_body->operation_type);
        customer_list_update_with_required_body->operation_type = NULL;
    }
    if (customer_list_update_with_required_body->records) {
        free(customer_list_update_with_required_body->records);
        customer_list_update_with_required_body->records = NULL;
    }
    if (customer_list_update_with_required_body->records_v2) {
        list_ForEach(listEntry, customer_list_update_with_required_body->records_v2) {
            customer_list_record_row_free(listEntry->data);
        }
        list_freeList(customer_list_update_with_required_body->records_v2);
        customer_list_update_with_required_body->records_v2 = NULL;
    }
    free(customer_list_update_with_required_body);
}

cJSON *customer_list_update_with_required_body_convertToJSON(customer_list_update_with_required_body_t *customer_list_update_with_required_body) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_update_with_required_body->operation_type
    if (!customer_list_update_with_required_body->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = user_list_operation_type_convertToJSON(customer_list_update_with_required_body->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // customer_list_update_with_required_body->records
    if(customer_list_update_with_required_body->records) {
    if(cJSON_AddStringToObject(item, "records", customer_list_update_with_required_body->records) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_update_with_required_body->records_v2
    if(customer_list_update_with_required_body->records_v2) {
    cJSON *records_v2 = cJSON_AddArrayToObject(item, "records_v2");
    if(records_v2 == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *records_v2ListEntry;
    if (customer_list_update_with_required_body->records_v2) {
    list_ForEach(records_v2ListEntry, customer_list_update_with_required_body->records_v2) {
    cJSON *itemLocal = customer_list_record_row_convertToJSON(records_v2ListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(records_v2, itemLocal);
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

customer_list_update_with_required_body_t *customer_list_update_with_required_body_parseFromJSON(cJSON *customer_list_update_with_required_bodyJSON){

    customer_list_update_with_required_body_t *customer_list_update_with_required_body_local_var = NULL;

    // define the local variable for customer_list_update_with_required_body->operation_type
    user_list_operation_type_t *operation_type_local_nonprim = NULL;

    char *records_local_str = NULL;

    // define the local list for customer_list_update_with_required_body->records_v2
    list_t *records_v2List = NULL;

    // customer_list_update_with_required_body->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(customer_list_update_with_required_bodyJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = user_list_operation_type_parseFromJSON(operation_type); //custom

    // customer_list_update_with_required_body->records
    cJSON *records = cJSON_GetObjectItemCaseSensitive(customer_list_update_with_required_bodyJSON, "records");
    if (cJSON_IsNull(records)) {
        records = NULL;
    }
    if (records) { 
    if(!cJSON_IsString(records) && !cJSON_IsNull(records))
    {
    goto end; //String
    }
    }

    // customer_list_update_with_required_body->records_v2
    cJSON *records_v2 = cJSON_GetObjectItemCaseSensitive(customer_list_update_with_required_bodyJSON, "records_v2");
    if (cJSON_IsNull(records_v2)) {
        records_v2 = NULL;
    }
    if (records_v2) { 
    cJSON *records_v2_local_nonprimitive = NULL;
    if(!cJSON_IsArray(records_v2)){
        goto end; //nonprimitive container
    }

    records_v2List = list_createList();

    cJSON_ArrayForEach(records_v2_local_nonprimitive,records_v2 )
    {
        if(!cJSON_IsObject(records_v2_local_nonprimitive)){
            goto end;
        }
        customer_list_record_row_t *records_v2Item = customer_list_record_row_parseFromJSON(records_v2_local_nonprimitive);

        list_addElement(records_v2List, records_v2Item);
    }
    }


    if (records && !cJSON_IsNull(records)) records_local_str = strdup(records->valuestring);

    customer_list_update_with_required_body_local_var = customer_list_update_with_required_body_create_internal (
        operation_type_local_nonprim,
        records_local_str,
        records_v2 ? records_v2List : NULL
        );

    if (!customer_list_update_with_required_body_local_var) {
        goto end;
    }

    return customer_list_update_with_required_body_local_var;
end:
    if (operation_type_local_nonprim) {
        user_list_operation_type_free(operation_type_local_nonprim);
        operation_type_local_nonprim = NULL;
    }
    if (records_local_str) {
        free(records_local_str);
        records_local_str = NULL;
    }
    if (records_v2List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, records_v2List) {
            customer_list_record_row_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(records_v2List);
        records_v2List = NULL;
    }
    return NULL;

}
