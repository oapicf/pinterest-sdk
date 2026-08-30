#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dynamic_titles_process_csv.h"



static dynamic_titles_process_csv_t *dynamic_titles_process_csv_create_internal(
    list_t *errors,
    char *status
    ) {
    dynamic_titles_process_csv_t *dynamic_titles_process_csv_local_var = malloc(sizeof(dynamic_titles_process_csv_t));
    if (!dynamic_titles_process_csv_local_var) {
        return NULL;
    }
    memset(dynamic_titles_process_csv_local_var, 0, sizeof(dynamic_titles_process_csv_t));
    dynamic_titles_process_csv_local_var->_library_owned = 1;
    dynamic_titles_process_csv_local_var->errors = errors;
    dynamic_titles_process_csv_local_var->status = status;
    return dynamic_titles_process_csv_local_var;
}

__attribute__((deprecated)) dynamic_titles_process_csv_t *dynamic_titles_process_csv_create(
    list_t *errors,
    char *status
    ) {
    dynamic_titles_process_csv_t *result = dynamic_titles_process_csv_create_internal (
        errors,
        status
        );
    if (!result) {
    }
    return result;
}

void dynamic_titles_process_csv_free(dynamic_titles_process_csv_t *dynamic_titles_process_csv) {
    if(NULL == dynamic_titles_process_csv){
        return ;
    }
    if(dynamic_titles_process_csv->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "dynamic_titles_process_csv_free");
        return ;
    }
    listEntry_t *listEntry;
    if (dynamic_titles_process_csv->errors) {
        list_ForEach(listEntry, dynamic_titles_process_csv->errors) {
            dynamic_titles_process_csv_error_free(listEntry->data);
        }
        list_freeList(dynamic_titles_process_csv->errors);
        dynamic_titles_process_csv->errors = NULL;
    }
    if (dynamic_titles_process_csv->status) {
        free(dynamic_titles_process_csv->status);
        dynamic_titles_process_csv->status = NULL;
    }
    free(dynamic_titles_process_csv);
}

cJSON *dynamic_titles_process_csv_convertToJSON(dynamic_titles_process_csv_t *dynamic_titles_process_csv) {
    cJSON *item = cJSON_CreateObject();

    // dynamic_titles_process_csv->errors
    if(dynamic_titles_process_csv->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (dynamic_titles_process_csv->errors) {
    list_ForEach(errorsListEntry, dynamic_titles_process_csv->errors) {
    cJSON *itemLocal = dynamic_titles_process_csv_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // dynamic_titles_process_csv->status
    if(dynamic_titles_process_csv->status) {
    if(cJSON_AddStringToObject(item, "status", dynamic_titles_process_csv->status) == NULL) {
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

dynamic_titles_process_csv_t *dynamic_titles_process_csv_parseFromJSON(cJSON *dynamic_titles_process_csvJSON){

    dynamic_titles_process_csv_t *dynamic_titles_process_csv_local_var = NULL;

    // define the local list for dynamic_titles_process_csv->errors
    list_t *errorsList = NULL;

    char *status_local_str = NULL;

    // dynamic_titles_process_csv->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(dynamic_titles_process_csvJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        dynamic_titles_process_csv_error_t *errorsItem = dynamic_titles_process_csv_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // dynamic_titles_process_csv->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(dynamic_titles_process_csvJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }


    if (status && !cJSON_IsNull(status)) status_local_str = strdup(status->valuestring);

    dynamic_titles_process_csv_local_var = dynamic_titles_process_csv_create_internal (
        errors ? errorsList : NULL,
        status_local_str
        );

    if (!dynamic_titles_process_csv_local_var) {
        goto end;
    }

    return dynamic_titles_process_csv_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            dynamic_titles_process_csv_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (status_local_str) {
        free(status_local_str);
        status_local_str = NULL;
    }
    return NULL;

}
