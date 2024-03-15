#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion_details.h"



catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details_create(
    catalogs_feed_ingestion_errors_t *errors,
    catalogs_feed_ingestion_info_t *info,
    catalogs_feed_ingestion_warnings_t *warnings
    ) {
    catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details_local_var = malloc(sizeof(catalogs_feed_ingestion_details_t));
    if (!catalogs_feed_ingestion_details_local_var) {
        return NULL;
    }
    catalogs_feed_ingestion_details_local_var->errors = errors;
    catalogs_feed_ingestion_details_local_var->info = info;
    catalogs_feed_ingestion_details_local_var->warnings = warnings;

    return catalogs_feed_ingestion_details_local_var;
}


void catalogs_feed_ingestion_details_free(catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details) {
    if(NULL == catalogs_feed_ingestion_details){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_ingestion_details->errors) {
        catalogs_feed_ingestion_errors_free(catalogs_feed_ingestion_details->errors);
        catalogs_feed_ingestion_details->errors = NULL;
    }
    if (catalogs_feed_ingestion_details->info) {
        catalogs_feed_ingestion_info_free(catalogs_feed_ingestion_details->info);
        catalogs_feed_ingestion_details->info = NULL;
    }
    if (catalogs_feed_ingestion_details->warnings) {
        catalogs_feed_ingestion_warnings_free(catalogs_feed_ingestion_details->warnings);
        catalogs_feed_ingestion_details->warnings = NULL;
    }
    free(catalogs_feed_ingestion_details);
}

cJSON *catalogs_feed_ingestion_details_convertToJSON(catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion_details->errors
    if (!catalogs_feed_ingestion_details->errors) {
        goto fail;
    }
    cJSON *errors_local_JSON = catalogs_feed_ingestion_errors_convertToJSON(catalogs_feed_ingestion_details->errors);
    if(errors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "errors", errors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed_ingestion_details->info
    if (!catalogs_feed_ingestion_details->info) {
        goto fail;
    }
    cJSON *info_local_JSON = catalogs_feed_ingestion_info_convertToJSON(catalogs_feed_ingestion_details->info);
    if(info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "info", info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed_ingestion_details->warnings
    if (!catalogs_feed_ingestion_details->warnings) {
        goto fail;
    }
    cJSON *warnings_local_JSON = catalogs_feed_ingestion_warnings_convertToJSON(catalogs_feed_ingestion_details->warnings);
    if(warnings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "warnings", warnings_local_JSON);
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

catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details_parseFromJSON(cJSON *catalogs_feed_ingestion_detailsJSON){

    catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_details->errors
    catalogs_feed_ingestion_errors_t *errors_local_nonprim = NULL;

    // define the local variable for catalogs_feed_ingestion_details->info
    catalogs_feed_ingestion_info_t *info_local_nonprim = NULL;

    // define the local variable for catalogs_feed_ingestion_details->warnings
    catalogs_feed_ingestion_warnings_t *warnings_local_nonprim = NULL;

    // catalogs_feed_ingestion_details->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_detailsJSON, "errors");
    if (!errors) {
        goto end;
    }

    
    errors_local_nonprim = catalogs_feed_ingestion_errors_parseFromJSON(errors); //nonprimitive

    // catalogs_feed_ingestion_details->info
    cJSON *info = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_detailsJSON, "info");
    if (!info) {
        goto end;
    }

    
    info_local_nonprim = catalogs_feed_ingestion_info_parseFromJSON(info); //nonprimitive

    // catalogs_feed_ingestion_details->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_detailsJSON, "warnings");
    if (!warnings) {
        goto end;
    }

    
    warnings_local_nonprim = catalogs_feed_ingestion_warnings_parseFromJSON(warnings); //nonprimitive


    catalogs_feed_ingestion_details_local_var = catalogs_feed_ingestion_details_create (
        errors_local_nonprim,
        info_local_nonprim,
        warnings_local_nonprim
        );

    return catalogs_feed_ingestion_details_local_var;
end:
    if (errors_local_nonprim) {
        catalogs_feed_ingestion_errors_free(errors_local_nonprim);
        errors_local_nonprim = NULL;
    }
    if (info_local_nonprim) {
        catalogs_feed_ingestion_info_free(info_local_nonprim);
        info_local_nonprim = NULL;
    }
    if (warnings_local_nonprim) {
        catalogs_feed_ingestion_warnings_free(warnings_local_nonprim);
        warnings_local_nonprim = NULL;
    }
    return NULL;

}
