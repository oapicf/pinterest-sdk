#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_bulk_create_request.h"



static label_bulk_create_request_t *label_bulk_create_request_create_internal(
    list_t *labels,
    char *parent_id
    ) {
    label_bulk_create_request_t *label_bulk_create_request_local_var = malloc(sizeof(label_bulk_create_request_t));
    if (!label_bulk_create_request_local_var) {
        return NULL;
    }
    memset(label_bulk_create_request_local_var, 0, sizeof(label_bulk_create_request_t));
    label_bulk_create_request_local_var->_library_owned = 1;
    label_bulk_create_request_local_var->labels = labels;
    label_bulk_create_request_local_var->parent_id = parent_id;
    return label_bulk_create_request_local_var;
}

__attribute__((deprecated)) label_bulk_create_request_t *label_bulk_create_request_create(
    list_t *labels,
    char *parent_id
    ) {
    label_bulk_create_request_t *result = label_bulk_create_request_create_internal (
        labels,
        parent_id
        );
    if (!result) {
    }
    return result;
}

void label_bulk_create_request_free(label_bulk_create_request_t *label_bulk_create_request) {
    if(NULL == label_bulk_create_request){
        return ;
    }
    if(label_bulk_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_bulk_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_bulk_create_request->labels) {
        list_ForEach(listEntry, label_bulk_create_request->labels) {
            label_create_item_free(listEntry->data);
        }
        list_freeList(label_bulk_create_request->labels);
        label_bulk_create_request->labels = NULL;
    }
    if (label_bulk_create_request->parent_id) {
        free(label_bulk_create_request->parent_id);
        label_bulk_create_request->parent_id = NULL;
    }
    free(label_bulk_create_request);
}

cJSON *label_bulk_create_request_convertToJSON(label_bulk_create_request_t *label_bulk_create_request) {
    cJSON *item = cJSON_CreateObject();

    // label_bulk_create_request->labels
    if (!label_bulk_create_request->labels) {
        goto fail;
    }
    cJSON *labels = cJSON_AddArrayToObject(item, "labels");
    if(labels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *labelsListEntry;
    if (label_bulk_create_request->labels) {
    list_ForEach(labelsListEntry, label_bulk_create_request->labels) {
    cJSON *itemLocal = label_create_item_convertToJSON(labelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(labels, itemLocal);
    }
    }


    // label_bulk_create_request->parent_id
    if (!label_bulk_create_request->parent_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "parent_id", label_bulk_create_request->parent_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

label_bulk_create_request_t *label_bulk_create_request_parseFromJSON(cJSON *label_bulk_create_requestJSON){

    label_bulk_create_request_t *label_bulk_create_request_local_var = NULL;

    // define the local list for label_bulk_create_request->labels
    list_t *labelsList = NULL;

    char *parent_id_local_str = NULL;

    // label_bulk_create_request->labels
    cJSON *labels = cJSON_GetObjectItemCaseSensitive(label_bulk_create_requestJSON, "labels");
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

    // label_bulk_create_request->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(label_bulk_create_requestJSON, "parent_id");
    if (cJSON_IsNull(parent_id)) {
        parent_id = NULL;
    }
    if (!parent_id) {
        goto end;
    }

    
    if(!cJSON_IsString(parent_id))
    {
    goto end; //String
    }


    if (parent_id && !cJSON_IsNull(parent_id)) parent_id_local_str = strdup(parent_id->valuestring);

    label_bulk_create_request_local_var = label_bulk_create_request_create_internal (
        labelsList,
        parent_id_local_str
        );

    if (!label_bulk_create_request_local_var) {
        goto end;
    }

    return label_bulk_create_request_local_var;
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
    if (parent_id_local_str) {
        free(parent_id_local_str);
        parent_id_local_str = NULL;
    }
    return NULL;

}
