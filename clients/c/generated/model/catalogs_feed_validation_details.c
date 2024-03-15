#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_validation_details.h"



catalogs_feed_validation_details_t *catalogs_feed_validation_details_create(
    catalogs_feed_validation_errors_t *errors,
    catalogs_feed_validation_warnings_t *warnings
    ) {
    catalogs_feed_validation_details_t *catalogs_feed_validation_details_local_var = malloc(sizeof(catalogs_feed_validation_details_t));
    if (!catalogs_feed_validation_details_local_var) {
        return NULL;
    }
    catalogs_feed_validation_details_local_var->errors = errors;
    catalogs_feed_validation_details_local_var->warnings = warnings;

    return catalogs_feed_validation_details_local_var;
}


void catalogs_feed_validation_details_free(catalogs_feed_validation_details_t *catalogs_feed_validation_details) {
    if(NULL == catalogs_feed_validation_details){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_validation_details->errors) {
        catalogs_feed_validation_errors_free(catalogs_feed_validation_details->errors);
        catalogs_feed_validation_details->errors = NULL;
    }
    if (catalogs_feed_validation_details->warnings) {
        catalogs_feed_validation_warnings_free(catalogs_feed_validation_details->warnings);
        catalogs_feed_validation_details->warnings = NULL;
    }
    free(catalogs_feed_validation_details);
}

cJSON *catalogs_feed_validation_details_convertToJSON(catalogs_feed_validation_details_t *catalogs_feed_validation_details) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_validation_details->errors
    if (!catalogs_feed_validation_details->errors) {
        goto fail;
    }
    cJSON *errors_local_JSON = catalogs_feed_validation_errors_convertToJSON(catalogs_feed_validation_details->errors);
    if(errors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "errors", errors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed_validation_details->warnings
    if (!catalogs_feed_validation_details->warnings) {
        goto fail;
    }
    cJSON *warnings_local_JSON = catalogs_feed_validation_warnings_convertToJSON(catalogs_feed_validation_details->warnings);
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

catalogs_feed_validation_details_t *catalogs_feed_validation_details_parseFromJSON(cJSON *catalogs_feed_validation_detailsJSON){

    catalogs_feed_validation_details_t *catalogs_feed_validation_details_local_var = NULL;

    // define the local variable for catalogs_feed_validation_details->errors
    catalogs_feed_validation_errors_t *errors_local_nonprim = NULL;

    // define the local variable for catalogs_feed_validation_details->warnings
    catalogs_feed_validation_warnings_t *warnings_local_nonprim = NULL;

    // catalogs_feed_validation_details->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_detailsJSON, "errors");
    if (!errors) {
        goto end;
    }

    
    errors_local_nonprim = catalogs_feed_validation_errors_parseFromJSON(errors); //nonprimitive

    // catalogs_feed_validation_details->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_detailsJSON, "warnings");
    if (!warnings) {
        goto end;
    }

    
    warnings_local_nonprim = catalogs_feed_validation_warnings_parseFromJSON(warnings); //nonprimitive


    catalogs_feed_validation_details_local_var = catalogs_feed_validation_details_create (
        errors_local_nonprim,
        warnings_local_nonprim
        );

    return catalogs_feed_validation_details_local_var;
end:
    if (errors_local_nonprim) {
        catalogs_feed_validation_errors_free(errors_local_nonprim);
        errors_local_nonprim = NULL;
    }
    if (warnings_local_nonprim) {
        catalogs_feed_validation_warnings_free(warnings_local_nonprim);
        warnings_local_nonprim = NULL;
    }
    return NULL;

}
