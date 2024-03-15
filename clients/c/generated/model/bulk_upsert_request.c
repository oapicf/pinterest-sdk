#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_request.h"



bulk_upsert_request_t *bulk_upsert_request_create(
    bulk_upsert_request_create_t *create,
    bulk_upsert_request_update_t *update
    ) {
    bulk_upsert_request_t *bulk_upsert_request_local_var = malloc(sizeof(bulk_upsert_request_t));
    if (!bulk_upsert_request_local_var) {
        return NULL;
    }
    bulk_upsert_request_local_var->create = create;
    bulk_upsert_request_local_var->update = update;

    return bulk_upsert_request_local_var;
}


void bulk_upsert_request_free(bulk_upsert_request_t *bulk_upsert_request) {
    if(NULL == bulk_upsert_request){
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_upsert_request->create) {
        bulk_upsert_request_create_free(bulk_upsert_request->create);
        bulk_upsert_request->create = NULL;
    }
    if (bulk_upsert_request->update) {
        bulk_upsert_request_update_free(bulk_upsert_request->update);
        bulk_upsert_request->update = NULL;
    }
    free(bulk_upsert_request);
}

cJSON *bulk_upsert_request_convertToJSON(bulk_upsert_request_t *bulk_upsert_request) {
    cJSON *item = cJSON_CreateObject();

    // bulk_upsert_request->create
    if(bulk_upsert_request->create) {
    cJSON *create_local_JSON = bulk_upsert_request_create_convertToJSON(bulk_upsert_request->create);
    if(create_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "create", create_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // bulk_upsert_request->update
    if(bulk_upsert_request->update) {
    cJSON *update_local_JSON = bulk_upsert_request_update_convertToJSON(bulk_upsert_request->update);
    if(update_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "update", update_local_JSON);
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

bulk_upsert_request_t *bulk_upsert_request_parseFromJSON(cJSON *bulk_upsert_requestJSON){

    bulk_upsert_request_t *bulk_upsert_request_local_var = NULL;

    // define the local variable for bulk_upsert_request->create
    bulk_upsert_request_create_t *create_local_nonprim = NULL;

    // define the local variable for bulk_upsert_request->update
    bulk_upsert_request_update_t *update_local_nonprim = NULL;

    // bulk_upsert_request->create
    cJSON *create = cJSON_GetObjectItemCaseSensitive(bulk_upsert_requestJSON, "create");
    if (create) { 
    create_local_nonprim = bulk_upsert_request_create_parseFromJSON(create); //nonprimitive
    }

    // bulk_upsert_request->update
    cJSON *update = cJSON_GetObjectItemCaseSensitive(bulk_upsert_requestJSON, "update");
    if (update) { 
    update_local_nonprim = bulk_upsert_request_update_parseFromJSON(update); //nonprimitive
    }


    bulk_upsert_request_local_var = bulk_upsert_request_create (
        create ? create_local_nonprim : NULL,
        update ? update_local_nonprim : NULL
        );

    return bulk_upsert_request_local_var;
end:
    if (create_local_nonprim) {
        bulk_upsert_request_create_free(create_local_nonprim);
        create_local_nonprim = NULL;
    }
    if (update_local_nonprim) {
        bulk_upsert_request_update_free(update_local_nonprim);
        update_local_nonprim = NULL;
    }
    return NULL;

}
