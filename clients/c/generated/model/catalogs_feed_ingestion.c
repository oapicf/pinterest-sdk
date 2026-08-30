#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion.h"



static catalogs_feed_ingestion_t *catalogs_feed_ingestion_create_internal(
    char *created_at,
    char *feed_id,
    char *id,
    catalogs_feed_processing_status_t *status
    ) {
    catalogs_feed_ingestion_t *catalogs_feed_ingestion_local_var = malloc(sizeof(catalogs_feed_ingestion_t));
    if (!catalogs_feed_ingestion_local_var) {
        return NULL;
    }
    memset(catalogs_feed_ingestion_local_var, 0, sizeof(catalogs_feed_ingestion_t));
    catalogs_feed_ingestion_local_var->_library_owned = 1;
    catalogs_feed_ingestion_local_var->created_at = created_at;
    catalogs_feed_ingestion_local_var->feed_id = feed_id;
    catalogs_feed_ingestion_local_var->id = id;
    catalogs_feed_ingestion_local_var->status = status;
    return catalogs_feed_ingestion_local_var;
}

__attribute__((deprecated)) catalogs_feed_ingestion_t *catalogs_feed_ingestion_create(
    char *created_at,
    char *feed_id,
    char *id,
    catalogs_feed_processing_status_t *status
    ) {
    catalogs_feed_ingestion_t *result = catalogs_feed_ingestion_create_internal (
        created_at,
        feed_id,
        id,
        status
        );
    if (!result) {
    }
    return result;
}

void catalogs_feed_ingestion_free(catalogs_feed_ingestion_t *catalogs_feed_ingestion) {
    if(NULL == catalogs_feed_ingestion){
        return ;
    }
    if(catalogs_feed_ingestion->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_ingestion_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_ingestion->created_at) {
        free(catalogs_feed_ingestion->created_at);
        catalogs_feed_ingestion->created_at = NULL;
    }
    if (catalogs_feed_ingestion->feed_id) {
        free(catalogs_feed_ingestion->feed_id);
        catalogs_feed_ingestion->feed_id = NULL;
    }
    if (catalogs_feed_ingestion->id) {
        free(catalogs_feed_ingestion->id);
        catalogs_feed_ingestion->id = NULL;
    }
    if (catalogs_feed_ingestion->status) {
        catalogs_feed_processing_status_free(catalogs_feed_ingestion->status);
        catalogs_feed_ingestion->status = NULL;
    }
    free(catalogs_feed_ingestion);
}

cJSON *catalogs_feed_ingestion_convertToJSON(catalogs_feed_ingestion_t *catalogs_feed_ingestion) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion->created_at
    if (!catalogs_feed_ingestion->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", catalogs_feed_ingestion->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalogs_feed_ingestion->feed_id
    if (!catalogs_feed_ingestion->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_feed_ingestion->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_ingestion->id
    if (!catalogs_feed_ingestion->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_feed_ingestion->id) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_ingestion->status
    if (!catalogs_feed_ingestion->status) {
        goto fail;
    }
    cJSON *status_local_JSON = catalogs_feed_processing_status_convertToJSON(catalogs_feed_ingestion->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feed_ingestion_t *catalogs_feed_ingestion_parseFromJSON(cJSON *catalogs_feed_ingestionJSON){

    catalogs_feed_ingestion_t *catalogs_feed_ingestion_local_var = NULL;

    char *created_at_local_str = NULL;

    char *feed_id_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for catalogs_feed_ingestion->status
    catalogs_feed_processing_status_t *status_local_nonprim = NULL;

    // catalogs_feed_ingestion->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // catalogs_feed_ingestion->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "feed_id");
    if (cJSON_IsNull(feed_id)) {
        feed_id = NULL;
    }
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // catalogs_feed_ingestion->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalogs_feed_ingestion->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = catalogs_feed_processing_status_parseFromJSON(status); //custom


    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (feed_id && !cJSON_IsNull(feed_id)) feed_id_local_str = strdup(feed_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    catalogs_feed_ingestion_local_var = catalogs_feed_ingestion_create_internal (
        created_at_local_str,
        feed_id_local_str,
        id_local_str,
        status_local_nonprim
        );

    if (!catalogs_feed_ingestion_local_var) {
        goto end;
    }

    return catalogs_feed_ingestion_local_var;
end:
    if (created_at_local_str) {
        free(created_at_local_str);
        created_at_local_str = NULL;
    }
    if (feed_id_local_str) {
        free(feed_id_local_str);
        feed_id_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (status_local_nonprim) {
        catalogs_feed_processing_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
