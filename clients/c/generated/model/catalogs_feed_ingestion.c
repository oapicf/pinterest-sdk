#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion.h"


char* catalogs_feed_ingestion_status_ToString(pinterest_rest_api_catalogs_feed_ingestion__e status) {
    char* statusArray[] =  { "NULL", "COMPLETED", "FAILED", "PROCESSING" };
    return statusArray[status];
}

pinterest_rest_api_catalogs_feed_ingestion__e catalogs_feed_ingestion_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "COMPLETED", "FAILED", "PROCESSING" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_feed_ingestion_t *catalogs_feed_ingestion_create(
    char *id,
    char *feed_id,
    char *created_at,
    catalogs_feed_processing_status_t *status
    ) {
    catalogs_feed_ingestion_t *catalogs_feed_ingestion_local_var = malloc(sizeof(catalogs_feed_ingestion_t));
    if (!catalogs_feed_ingestion_local_var) {
        return NULL;
    }
    catalogs_feed_ingestion_local_var->id = id;
    catalogs_feed_ingestion_local_var->feed_id = feed_id;
    catalogs_feed_ingestion_local_var->created_at = created_at;
    catalogs_feed_ingestion_local_var->status = status;

    return catalogs_feed_ingestion_local_var;
}


void catalogs_feed_ingestion_free(catalogs_feed_ingestion_t *catalogs_feed_ingestion) {
    if(NULL == catalogs_feed_ingestion){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_ingestion->id) {
        free(catalogs_feed_ingestion->id);
        catalogs_feed_ingestion->id = NULL;
    }
    if (catalogs_feed_ingestion->feed_id) {
        free(catalogs_feed_ingestion->feed_id);
        catalogs_feed_ingestion->feed_id = NULL;
    }
    if (catalogs_feed_ingestion->created_at) {
        free(catalogs_feed_ingestion->created_at);
        catalogs_feed_ingestion->created_at = NULL;
    }
    if (catalogs_feed_ingestion->status) {
        catalogs_feed_processing_status_free(catalogs_feed_ingestion->status);
        catalogs_feed_ingestion->status = NULL;
    }
    free(catalogs_feed_ingestion);
}

cJSON *catalogs_feed_ingestion_convertToJSON(catalogs_feed_ingestion_t *catalogs_feed_ingestion) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion->id
    if (!catalogs_feed_ingestion->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_feed_ingestion->id) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_ingestion->feed_id
    if (!catalogs_feed_ingestion->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_feed_ingestion->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_ingestion->created_at
    if (!catalogs_feed_ingestion->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", catalogs_feed_ingestion->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalogs_feed_ingestion->status
    if (pinterest_rest_api_catalogs_feed_ingestion__NULL == catalogs_feed_ingestion->status) {
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

    // define the local variable for catalogs_feed_ingestion->status
    catalogs_feed_processing_status_t *status_local_nonprim = NULL;

    // catalogs_feed_ingestion->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalogs_feed_ingestion->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // catalogs_feed_ingestion->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // catalogs_feed_ingestion->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestionJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = catalogs_feed_processing_status_parseFromJSON(status); //custom


    catalogs_feed_ingestion_local_var = catalogs_feed_ingestion_create (
        strdup(id->valuestring),
        strdup(feed_id->valuestring),
        strdup(created_at->valuestring),
        status_local_nonprim
        );

    return catalogs_feed_ingestion_local_var;
end:
    if (status_local_nonprim) {
        catalogs_feed_processing_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
