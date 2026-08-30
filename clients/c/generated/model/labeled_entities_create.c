#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "labeled_entities_create.h"



static labeled_entities_create_t *labeled_entities_create_create_internal(
    list_t *entity_ids
    ) {
    labeled_entities_create_t *labeled_entities_create_local_var = malloc(sizeof(labeled_entities_create_t));
    if (!labeled_entities_create_local_var) {
        return NULL;
    }
    memset(labeled_entities_create_local_var, 0, sizeof(labeled_entities_create_t));
    labeled_entities_create_local_var->_library_owned = 1;
    labeled_entities_create_local_var->entity_ids = entity_ids;
    return labeled_entities_create_local_var;
}

__attribute__((deprecated)) labeled_entities_create_t *labeled_entities_create_create(
    list_t *entity_ids
    ) {
    labeled_entities_create_t *result = labeled_entities_create_create_internal (
        entity_ids
        );
    if (!result) {
    }
    return result;
}

void labeled_entities_create_free(labeled_entities_create_t *labeled_entities_create) {
    if(NULL == labeled_entities_create){
        return ;
    }
    if(labeled_entities_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "labeled_entities_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (labeled_entities_create->entity_ids) {
        list_ForEach(listEntry, labeled_entities_create->entity_ids) {
            free(listEntry->data);
        }
        list_freeList(labeled_entities_create->entity_ids);
        labeled_entities_create->entity_ids = NULL;
    }
    free(labeled_entities_create);
}

cJSON *labeled_entities_create_convertToJSON(labeled_entities_create_t *labeled_entities_create) {
    cJSON *item = cJSON_CreateObject();

    // labeled_entities_create->entity_ids
    if (!labeled_entities_create->entity_ids) {
        goto fail;
    }
    cJSON *entity_ids = cJSON_AddArrayToObject(item, "entity_ids");
    if(entity_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *entity_idsListEntry;
    list_ForEach(entity_idsListEntry, labeled_entities_create->entity_ids) {
    if(cJSON_AddStringToObject(entity_ids, "", entity_idsListEntry->data) == NULL)
    {
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

labeled_entities_create_t *labeled_entities_create_parseFromJSON(cJSON *labeled_entities_createJSON){

    labeled_entities_create_t *labeled_entities_create_local_var = NULL;

    // define the local list for labeled_entities_create->entity_ids
    list_t *entity_idsList = NULL;

    // labeled_entities_create->entity_ids
    cJSON *entity_ids = cJSON_GetObjectItemCaseSensitive(labeled_entities_createJSON, "entity_ids");
    if (cJSON_IsNull(entity_ids)) {
        entity_ids = NULL;
    }
    if (!entity_ids) {
        goto end;
    }

    
    cJSON *entity_ids_local = NULL;
    if(!cJSON_IsArray(entity_ids)) {
        goto end;//primitive container
    }
    entity_idsList = list_createList();

    cJSON_ArrayForEach(entity_ids_local, entity_ids)
    {
        if(!cJSON_IsString(entity_ids_local))
        {
            goto end;
        }
        list_addElement(entity_idsList , strdup(entity_ids_local->valuestring));
    }



    labeled_entities_create_local_var = labeled_entities_create_create_internal (
        entity_idsList
        );

    if (!labeled_entities_create_local_var) {
        goto end;
    }

    return labeled_entities_create_local_var;
end:
    if (entity_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, entity_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(entity_idsList);
        entity_idsList = NULL;
    }
    return NULL;

}
