#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_create.h"



static customer_list_create_t *customer_list_create_create_internal(
    int *is_nca,
    user_list_type_t *list_type,
    char *name,
    char *records,
    list_t *records_v2
    ) {
    customer_list_create_t *customer_list_create_local_var = malloc(sizeof(customer_list_create_t));
    if (!customer_list_create_local_var) {
        return NULL;
    }
    memset(customer_list_create_local_var, 0, sizeof(customer_list_create_t));
    customer_list_create_local_var->_library_owned = 1;
    customer_list_create_local_var->is_nca = is_nca;
    customer_list_create_local_var->list_type = list_type;
    customer_list_create_local_var->name = name;
    customer_list_create_local_var->records = records;
    customer_list_create_local_var->records_v2 = records_v2;
    return customer_list_create_local_var;
}

__attribute__((deprecated)) customer_list_create_t *customer_list_create_create(
    int *is_nca,
    user_list_type_t *list_type,
    char *name,
    char *records,
    list_t *records_v2
    ) {
    int *is_nca_copy = NULL;
    if (is_nca) {
        is_nca_copy = malloc(sizeof(int));
        if (is_nca_copy) *is_nca_copy = *is_nca;
    }
    customer_list_create_t *result = customer_list_create_create_internal (
        is_nca_copy,
        list_type,
        name,
        records,
        records_v2
        );
    if (!result) {
        free(is_nca_copy);
    }
    return result;
}

void customer_list_create_free(customer_list_create_t *customer_list_create) {
    if(NULL == customer_list_create){
        return ;
    }
    if(customer_list_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_create->is_nca) {
        free(customer_list_create->is_nca);
        customer_list_create->is_nca = NULL;
    }
    if (customer_list_create->list_type) {
        user_list_type_free(customer_list_create->list_type);
        customer_list_create->list_type = NULL;
    }
    if (customer_list_create->name) {
        free(customer_list_create->name);
        customer_list_create->name = NULL;
    }
    if (customer_list_create->records) {
        free(customer_list_create->records);
        customer_list_create->records = NULL;
    }
    if (customer_list_create->records_v2) {
        list_ForEach(listEntry, customer_list_create->records_v2) {
            customer_list_record_row_free(listEntry->data);
        }
        list_freeList(customer_list_create->records_v2);
        customer_list_create->records_v2 = NULL;
    }
    free(customer_list_create);
}

cJSON *customer_list_create_convertToJSON(customer_list_create_t *customer_list_create) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_create->is_nca
    if(customer_list_create->is_nca) {
    if(cJSON_AddBoolToObject(item, "is_nca", *customer_list_create->is_nca) == NULL) {
    goto fail; //Bool
    }
    }


    // customer_list_create->list_type
    if(customer_list_create->list_type) {
    cJSON *list_type_local_JSON = user_list_type_convertToJSON(customer_list_create->list_type);
    if(list_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "list_type", list_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // customer_list_create->name
    if (!customer_list_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", customer_list_create->name) == NULL) {
    goto fail; //String
    }


    // customer_list_create->records
    if(customer_list_create->records) {
    if(cJSON_AddStringToObject(item, "records", customer_list_create->records) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_create->records_v2
    if(customer_list_create->records_v2) {
    cJSON *records_v2 = cJSON_AddArrayToObject(item, "records_v2");
    if(records_v2 == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *records_v2ListEntry;
    if (customer_list_create->records_v2) {
    list_ForEach(records_v2ListEntry, customer_list_create->records_v2) {
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

customer_list_create_t *customer_list_create_parseFromJSON(cJSON *customer_list_createJSON){

    customer_list_create_t *customer_list_create_local_var = NULL;

    // define the local variable for customer_list_create->is_nca
    int *is_nca_local_var = NULL;

    // define the local variable for customer_list_create->list_type
    user_list_type_t *list_type_local_nonprim = NULL;

    char *name_local_str = NULL;

    char *records_local_str = NULL;

    // define the local list for customer_list_create->records_v2
    list_t *records_v2List = NULL;

    // customer_list_create->is_nca
    cJSON *is_nca = cJSON_GetObjectItemCaseSensitive(customer_list_createJSON, "is_nca");
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

    // customer_list_create->list_type
    cJSON *list_type = cJSON_GetObjectItemCaseSensitive(customer_list_createJSON, "list_type");
    if (cJSON_IsNull(list_type)) {
        list_type = NULL;
    }
    if (list_type) { 
    list_type_local_nonprim = user_list_type_parseFromJSON(list_type); //custom
    }

    // customer_list_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(customer_list_createJSON, "name");
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

    // customer_list_create->records
    cJSON *records = cJSON_GetObjectItemCaseSensitive(customer_list_createJSON, "records");
    if (cJSON_IsNull(records)) {
        records = NULL;
    }
    if (records) { 
    if(!cJSON_IsString(records) && !cJSON_IsNull(records))
    {
    goto end; //String
    }
    }

    // customer_list_create->records_v2
    cJSON *records_v2 = cJSON_GetObjectItemCaseSensitive(customer_list_createJSON, "records_v2");
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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (records && !cJSON_IsNull(records)) records_local_str = strdup(records->valuestring);

    customer_list_create_local_var = customer_list_create_create_internal (
        is_nca_local_var,
        list_type ? list_type_local_nonprim : NULL,
        name_local_str,
        records_local_str,
        records_v2 ? records_v2List : NULL
        );

    if (!customer_list_create_local_var) {
        goto end;
    }

    return customer_list_create_local_var;
end:
    if (is_nca_local_var) {
        free(is_nca_local_var);
        is_nca_local_var = NULL;
    }
    if (list_type_local_nonprim) {
        user_list_type_free(list_type_local_nonprim);
        list_type_local_nonprim = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
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
