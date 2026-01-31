#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "labels_response.h"



static labels_response_t *labels_response_create_internal(
    list_t *errors,
    list_t *labels
    ) {
    labels_response_t *labels_response_local_var = malloc(sizeof(labels_response_t));
    if (!labels_response_local_var) {
        return NULL;
    }
    labels_response_local_var->errors = errors;
    labels_response_local_var->labels = labels;

    labels_response_local_var->_library_owned = 1;
    return labels_response_local_var;
}

__attribute__((deprecated)) labels_response_t *labels_response_create(
    list_t *errors,
    list_t *labels
    ) {
    return labels_response_create_internal (
        errors,
        labels
        );
}

void labels_response_free(labels_response_t *labels_response) {
    if(NULL == labels_response){
        return ;
    }
    if(labels_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "labels_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (labels_response->errors) {
        list_ForEach(listEntry, labels_response->errors) {
            label_error_free(listEntry->data);
        }
        list_freeList(labels_response->errors);
        labels_response->errors = NULL;
    }
    if (labels_response->labels) {
        list_ForEach(listEntry, labels_response->labels) {
            label_free(listEntry->data);
        }
        list_freeList(labels_response->labels);
        labels_response->labels = NULL;
    }
    free(labels_response);
}

cJSON *labels_response_convertToJSON(labels_response_t *labels_response) {
    cJSON *item = cJSON_CreateObject();

    // labels_response->errors
    if(labels_response->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (labels_response->errors) {
    list_ForEach(errorsListEntry, labels_response->errors) {
    cJSON *itemLocal = label_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // labels_response->labels
    if(labels_response->labels) {
    cJSON *labels = cJSON_AddArrayToObject(item, "labels");
    if(labels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *labelsListEntry;
    if (labels_response->labels) {
    list_ForEach(labelsListEntry, labels_response->labels) {
    cJSON *itemLocal = label_convertToJSON(labelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(labels, itemLocal);
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

labels_response_t *labels_response_parseFromJSON(cJSON *labels_responseJSON){

    labels_response_t *labels_response_local_var = NULL;

    // define the local list for labels_response->errors
    list_t *errorsList = NULL;

    // define the local list for labels_response->labels
    list_t *labelsList = NULL;

    // labels_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(labels_responseJSON, "errors");
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
        label_error_t *errorsItem = label_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // labels_response->labels
    cJSON *labels = cJSON_GetObjectItemCaseSensitive(labels_responseJSON, "labels");
    if (cJSON_IsNull(labels)) {
        labels = NULL;
    }
    if (labels) { 
    cJSON *labels_local_nonprimitive = NULL;
    if(!cJSON_IsArray(labels)){
        goto end; //nonprimitive container
    }

    labelsList = list_createList();

    cJSON_ArrayForEach(labels_local_nonprimitive,labels )
    {
        if(!cJSON_IsObject(labels_local_nonprimitive)){
            goto end;
        }
        label_t *labelsItem = label_parseFromJSON(labels_local_nonprimitive);

        list_addElement(labelsList, labelsItem);
    }
    }


    labels_response_local_var = labels_response_create_internal (
        errors ? errorsList : NULL,
        labels ? labelsList : NULL
        );

    return labels_response_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            label_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, labelsList) {
            label_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(labelsList);
        labelsList = NULL;
    }
    return NULL;

}
