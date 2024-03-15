#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_db_item.h"



catalogs_db_item_t *catalogs_db_item_create(
    char *created_at,
    char *id,
    char *updated_at
    ) {
    catalogs_db_item_t *catalogs_db_item_local_var = malloc(sizeof(catalogs_db_item_t));
    if (!catalogs_db_item_local_var) {
        return NULL;
    }
    catalogs_db_item_local_var->created_at = created_at;
    catalogs_db_item_local_var->id = id;
    catalogs_db_item_local_var->updated_at = updated_at;

    return catalogs_db_item_local_var;
}


void catalogs_db_item_free(catalogs_db_item_t *catalogs_db_item) {
    if(NULL == catalogs_db_item){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_db_item->created_at) {
        free(catalogs_db_item->created_at);
        catalogs_db_item->created_at = NULL;
    }
    if (catalogs_db_item->id) {
        free(catalogs_db_item->id);
        catalogs_db_item->id = NULL;
    }
    if (catalogs_db_item->updated_at) {
        free(catalogs_db_item->updated_at);
        catalogs_db_item->updated_at = NULL;
    }
    free(catalogs_db_item);
}

cJSON *catalogs_db_item_convertToJSON(catalogs_db_item_t *catalogs_db_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_db_item->created_at
    if(catalogs_db_item->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", catalogs_db_item->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_db_item->id
    if(catalogs_db_item->id) {
    if(cJSON_AddStringToObject(item, "id", catalogs_db_item->id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_db_item->updated_at
    if(catalogs_db_item->updated_at) {
    if(cJSON_AddStringToObject(item, "updated_at", catalogs_db_item->updated_at) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_db_item_t *catalogs_db_item_parseFromJSON(cJSON *catalogs_db_itemJSON){

    catalogs_db_item_t *catalogs_db_item_local_var = NULL;

    // catalogs_db_item->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_db_itemJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // catalogs_db_item->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_db_itemJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // catalogs_db_item->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_db_itemJSON, "updated_at");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }
    }


    catalogs_db_item_local_var = catalogs_db_item_create (
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL
        );

    return catalogs_db_item_local_var;
end:
    return NULL;

}
