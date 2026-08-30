#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "labeled_entities.h"



static labeled_entities_t *labeled_entities_create_internal(
    list_t *entities_labels,
    list_t *errors
    ) {
    labeled_entities_t *labeled_entities_local_var = malloc(sizeof(labeled_entities_t));
    if (!labeled_entities_local_var) {
        return NULL;
    }
    memset(labeled_entities_local_var, 0, sizeof(labeled_entities_t));
    labeled_entities_local_var->_library_owned = 1;
    labeled_entities_local_var->entities_labels = entities_labels;
    labeled_entities_local_var->errors = errors;
    return labeled_entities_local_var;
}

__attribute__((deprecated)) labeled_entities_t *labeled_entities_create(
    list_t *entities_labels,
    list_t *errors
    ) {
    labeled_entities_t *result = labeled_entities_create_internal (
        entities_labels,
        errors
        );
    if (!result) {
    }
    return result;
}

void labeled_entities_free(labeled_entities_t *labeled_entities) {
    if(NULL == labeled_entities){
        return ;
    }
    if(labeled_entities->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "labeled_entities_free");
        return ;
    }
    listEntry_t *listEntry;
    if (labeled_entities->entities_labels) {
        list_ForEach(listEntry, labeled_entities->entities_labels) {
            entity_label_free(listEntry->data);
        }
        list_freeList(labeled_entities->entities_labels);
        labeled_entities->entities_labels = NULL;
    }
    if (labeled_entities->errors) {
        list_ForEach(listEntry, labeled_entities->errors) {
            entity_label_error_free(listEntry->data);
        }
        list_freeList(labeled_entities->errors);
        labeled_entities->errors = NULL;
    }
    free(labeled_entities);
}

cJSON *labeled_entities_convertToJSON(labeled_entities_t *labeled_entities) {
    cJSON *item = cJSON_CreateObject();

    // labeled_entities->entities_labels
    if(labeled_entities->entities_labels) {
    cJSON *entities_labels = cJSON_AddArrayToObject(item, "entities_labels");
    if(entities_labels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *entities_labelsListEntry;
    if (labeled_entities->entities_labels) {
    list_ForEach(entities_labelsListEntry, labeled_entities->entities_labels) {
    cJSON *itemLocal = entity_label_convertToJSON(entities_labelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(entities_labels, itemLocal);
    }
    }
    }


    // labeled_entities->errors
    if(labeled_entities->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (labeled_entities->errors) {
    list_ForEach(errorsListEntry, labeled_entities->errors) {
    cJSON *itemLocal = entity_label_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
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

labeled_entities_t *labeled_entities_parseFromJSON(cJSON *labeled_entitiesJSON){

    labeled_entities_t *labeled_entities_local_var = NULL;

    // define the local list for labeled_entities->entities_labels
    list_t *entities_labelsList = NULL;

    // define the local list for labeled_entities->errors
    list_t *errorsList = NULL;

    // labeled_entities->entities_labels
    cJSON *entities_labels = cJSON_GetObjectItemCaseSensitive(labeled_entitiesJSON, "entities_labels");
    if (cJSON_IsNull(entities_labels)) {
        entities_labels = NULL;
    }
    if (entities_labels) { 
    cJSON *entities_labels_local_nonprimitive = NULL;
    if(!cJSON_IsArray(entities_labels)){
        goto end; //nonprimitive container
    }

    entities_labelsList = list_createList();

    cJSON_ArrayForEach(entities_labels_local_nonprimitive,entities_labels )
    {
        if(!cJSON_IsObject(entities_labels_local_nonprimitive)){
            goto end;
        }
        entity_label_t *entities_labelsItem = entity_label_parseFromJSON(entities_labels_local_nonprimitive);

        list_addElement(entities_labelsList, entities_labelsItem);
    }
    }

    // labeled_entities->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(labeled_entitiesJSON, "errors");
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
        entity_label_error_t *errorsItem = entity_label_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }



    labeled_entities_local_var = labeled_entities_create_internal (
        entities_labels ? entities_labelsList : NULL,
        errors ? errorsList : NULL
        );

    if (!labeled_entities_local_var) {
        goto end;
    }

    return labeled_entities_local_var;
end:
    if (entities_labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, entities_labelsList) {
            entity_label_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(entities_labelsList);
        entities_labelsList = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            entity_label_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    return NULL;

}
