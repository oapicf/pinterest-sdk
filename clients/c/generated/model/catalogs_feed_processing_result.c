#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_processing_result.h"


char* catalogs_feed_processing_result_status_ToString(pinterest_rest_api_catalogs_feed_processing_result__e status) {
    char* statusArray[] =  { "NULL", "COMPLETED", "COMPLETED_EARLY", "DISAPPROVED", "FAILED", "PROCESSING", "QUEUED_FOR_PROCESSING", "UNDER_APPEAL", "UNDER_REVIEW" };
    return statusArray[status];
}

pinterest_rest_api_catalogs_feed_processing_result__e catalogs_feed_processing_result_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "COMPLETED", "COMPLETED_EARLY", "DISAPPROVED", "FAILED", "PROCESSING", "QUEUED_FOR_PROCESSING", "UNDER_APPEAL", "UNDER_REVIEW" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_feed_processing_result_t *catalogs_feed_processing_result_create(
    char *created_at,
    char *id,
    char *updated_at,
    catalogs_feed_ingestion_details_t *ingestion_details,
    catalogs_feed_processing_status_t *status,
    catalogs_feed_product_counts_t *product_counts,
    catalogs_feed_validation_details_t *validation_details
    ) {
    catalogs_feed_processing_result_t *catalogs_feed_processing_result_local_var = malloc(sizeof(catalogs_feed_processing_result_t));
    if (!catalogs_feed_processing_result_local_var) {
        return NULL;
    }
    catalogs_feed_processing_result_local_var->created_at = created_at;
    catalogs_feed_processing_result_local_var->id = id;
    catalogs_feed_processing_result_local_var->updated_at = updated_at;
    catalogs_feed_processing_result_local_var->ingestion_details = ingestion_details;
    catalogs_feed_processing_result_local_var->status = status;
    catalogs_feed_processing_result_local_var->product_counts = product_counts;
    catalogs_feed_processing_result_local_var->validation_details = validation_details;

    return catalogs_feed_processing_result_local_var;
}


void catalogs_feed_processing_result_free(catalogs_feed_processing_result_t *catalogs_feed_processing_result) {
    if(NULL == catalogs_feed_processing_result){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_processing_result->created_at) {
        free(catalogs_feed_processing_result->created_at);
        catalogs_feed_processing_result->created_at = NULL;
    }
    if (catalogs_feed_processing_result->id) {
        free(catalogs_feed_processing_result->id);
        catalogs_feed_processing_result->id = NULL;
    }
    if (catalogs_feed_processing_result->updated_at) {
        free(catalogs_feed_processing_result->updated_at);
        catalogs_feed_processing_result->updated_at = NULL;
    }
    if (catalogs_feed_processing_result->ingestion_details) {
        catalogs_feed_ingestion_details_free(catalogs_feed_processing_result->ingestion_details);
        catalogs_feed_processing_result->ingestion_details = NULL;
    }
    if (catalogs_feed_processing_result->status) {
        catalogs_feed_processing_status_free(catalogs_feed_processing_result->status);
        catalogs_feed_processing_result->status = NULL;
    }
    if (catalogs_feed_processing_result->product_counts) {
        catalogs_feed_product_counts_free(catalogs_feed_processing_result->product_counts);
        catalogs_feed_processing_result->product_counts = NULL;
    }
    if (catalogs_feed_processing_result->validation_details) {
        catalogs_feed_validation_details_free(catalogs_feed_processing_result->validation_details);
        catalogs_feed_processing_result->validation_details = NULL;
    }
    free(catalogs_feed_processing_result);
}

cJSON *catalogs_feed_processing_result_convertToJSON(catalogs_feed_processing_result_t *catalogs_feed_processing_result) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_processing_result->created_at
    if(catalogs_feed_processing_result->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", catalogs_feed_processing_result->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_feed_processing_result->id
    if(catalogs_feed_processing_result->id) {
    if(cJSON_AddStringToObject(item, "id", catalogs_feed_processing_result->id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_feed_processing_result->updated_at
    if(catalogs_feed_processing_result->updated_at) {
    if(cJSON_AddStringToObject(item, "updated_at", catalogs_feed_processing_result->updated_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_feed_processing_result->ingestion_details
    if (!catalogs_feed_processing_result->ingestion_details) {
        goto fail;
    }
    cJSON *ingestion_details_local_JSON = catalogs_feed_ingestion_details_convertToJSON(catalogs_feed_processing_result->ingestion_details);
    if(ingestion_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ingestion_details", ingestion_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed_processing_result->status
    if (pinterest_rest_api_catalogs_feed_processing_result__NULL == catalogs_feed_processing_result->status) {
        goto fail;
    }
    cJSON *status_local_JSON = catalogs_feed_processing_status_convertToJSON(catalogs_feed_processing_result->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed_processing_result->product_counts
    if (!catalogs_feed_processing_result->product_counts) {
        goto fail;
    }
    cJSON *product_counts_local_JSON = catalogs_feed_product_counts_convertToJSON(catalogs_feed_processing_result->product_counts);
    if(product_counts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "product_counts", product_counts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed_processing_result->validation_details
    if (!catalogs_feed_processing_result->validation_details) {
        goto fail;
    }
    cJSON *validation_details_local_JSON = catalogs_feed_validation_details_convertToJSON(catalogs_feed_processing_result->validation_details);
    if(validation_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "validation_details", validation_details_local_JSON);
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

catalogs_feed_processing_result_t *catalogs_feed_processing_result_parseFromJSON(cJSON *catalogs_feed_processing_resultJSON){

    catalogs_feed_processing_result_t *catalogs_feed_processing_result_local_var = NULL;

    // define the local variable for catalogs_feed_processing_result->ingestion_details
    catalogs_feed_ingestion_details_t *ingestion_details_local_nonprim = NULL;

    // define the local variable for catalogs_feed_processing_result->status
    catalogs_feed_processing_status_t *status_local_nonprim = NULL;

    // define the local variable for catalogs_feed_processing_result->product_counts
    catalogs_feed_product_counts_t *product_counts_local_nonprim = NULL;

    // define the local variable for catalogs_feed_processing_result->validation_details
    catalogs_feed_validation_details_t *validation_details_local_nonprim = NULL;

    // catalogs_feed_processing_result->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_resultJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // catalogs_feed_processing_result->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_resultJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // catalogs_feed_processing_result->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_resultJSON, "updated_at");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }
    }

    // catalogs_feed_processing_result->ingestion_details
    cJSON *ingestion_details = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_resultJSON, "ingestion_details");
    if (!ingestion_details) {
        goto end;
    }

    
    ingestion_details_local_nonprim = catalogs_feed_ingestion_details_parseFromJSON(ingestion_details); //nonprimitive

    // catalogs_feed_processing_result->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_resultJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = catalogs_feed_processing_status_parseFromJSON(status); //custom

    // catalogs_feed_processing_result->product_counts
    cJSON *product_counts = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_resultJSON, "product_counts");
    if (!product_counts) {
        goto end;
    }

    
    product_counts_local_nonprim = catalogs_feed_product_counts_parseFromJSON(product_counts); //nonprimitive

    // catalogs_feed_processing_result->validation_details
    cJSON *validation_details = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_resultJSON, "validation_details");
    if (!validation_details) {
        goto end;
    }

    
    validation_details_local_nonprim = catalogs_feed_validation_details_parseFromJSON(validation_details); //nonprimitive


    catalogs_feed_processing_result_local_var = catalogs_feed_processing_result_create (
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL,
        ingestion_details_local_nonprim,
        status_local_nonprim,
        product_counts_local_nonprim,
        validation_details_local_nonprim
        );

    return catalogs_feed_processing_result_local_var;
end:
    if (ingestion_details_local_nonprim) {
        catalogs_feed_ingestion_details_free(ingestion_details_local_nonprim);
        ingestion_details_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        catalogs_feed_processing_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (product_counts_local_nonprim) {
        catalogs_feed_product_counts_free(product_counts_local_nonprim);
        product_counts_local_nonprim = NULL;
    }
    if (validation_details_local_nonprim) {
        catalogs_feed_validation_details_free(validation_details_local_nonprim);
        validation_details_local_nonprim = NULL;
    }
    return NULL;

}
