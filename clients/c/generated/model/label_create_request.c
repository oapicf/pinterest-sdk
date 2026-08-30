#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_create_request.h"



static label_create_request_t *label_create_request_create_internal(
    list_t *labels
    ) {
    label_create_request_t *label_create_request_local_var = malloc(sizeof(label_create_request_t));
    if (!label_create_request_local_var) {
        return NULL;
    }
    memset(label_create_request_local_var, 0, sizeof(label_create_request_t));
    label_create_request_local_var->_library_owned = 1;
    label_create_request_local_var->labels = labels;
    return label_create_request_local_var;
}

__attribute__((deprecated)) label_create_request_t *label_create_request_create(
    list_t *labels
    ) {
    label_create_request_t *result = label_create_request_create_internal (
        labels
        );
    if (!result) {
    }
    return result;
}

void label_create_request_free(label_create_request_t *label_create_request) {
    if(NULL == label_create_request){
        return ;
    }
    if(label_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_create_request->labels) {
        list_ForEach(listEntry, label_create_request->labels) {
            label_create_item_free(listEntry->data);
        }
        list_freeList(label_create_request->labels);
        label_create_request->labels = NULL;
    }
    free(label_create_request);
}

cJSON *label_create_request_convertToJSON(label_create_request_t *label_create_request) {
    cJSON *item = cJSON_CreateObject();

    // label_create_request->labels
    if (!label_create_request->labels) {
        goto fail;
    }
    cJSON *labels = cJSON_AddArrayToObject(item, "labels");
    if(labels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *labelsListEntry;
    if (label_create_request->labels) {
    list_ForEach(labelsListEntry, label_create_request->labels) {
    cJSON *itemLocal = label_create_item_convertToJSON(labelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(labels, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

label_create_request_t *label_create_request_parseFromJSON(cJSON *label_create_requestJSON){

    label_create_request_t *label_create_request_local_var = NULL;

    // define the local list for label_create_request->labels
    list_t *labelsList = NULL;

    // label_create_request->labels
    cJSON *labels = cJSON_GetObjectItemCaseSensitive(label_create_requestJSON, "labels");
    if (cJSON_IsNull(labels)) {
        labels = NULL;
    }
    if (!labels) {
        goto end;
    }

    
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
        label_create_item_t *labelsItem = label_create_item_parseFromJSON(labels_local_nonprimitive);

        list_addElement(labelsList, labelsItem);
    }



    label_create_request_local_var = label_create_request_create_internal (
        labelsList
        );

    if (!label_create_request_local_var) {
        goto end;
    }

    return label_create_request_local_var;
end:
    if (labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, labelsList) {
            label_create_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(labelsList);
        labelsList = NULL;
    }
    return NULL;

}
