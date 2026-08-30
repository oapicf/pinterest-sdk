#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_deletion_request_create.h"



static conversion_deletion_request_create_t *conversion_deletion_request_create_create_internal(
    conversion_deletion_request_targets_t *deletion_targets
    ) {
    conversion_deletion_request_create_t *conversion_deletion_request_create_local_var = malloc(sizeof(conversion_deletion_request_create_t));
    if (!conversion_deletion_request_create_local_var) {
        return NULL;
    }
    memset(conversion_deletion_request_create_local_var, 0, sizeof(conversion_deletion_request_create_t));
    conversion_deletion_request_create_local_var->_library_owned = 1;
    conversion_deletion_request_create_local_var->deletion_targets = deletion_targets;
    return conversion_deletion_request_create_local_var;
}

__attribute__((deprecated)) conversion_deletion_request_create_t *conversion_deletion_request_create_create(
    conversion_deletion_request_targets_t *deletion_targets
    ) {
    conversion_deletion_request_create_t *result = conversion_deletion_request_create_create_internal (
        deletion_targets
        );
    if (!result) {
    }
    return result;
}

void conversion_deletion_request_create_free(conversion_deletion_request_create_t *conversion_deletion_request_create) {
    if(NULL == conversion_deletion_request_create){
        return ;
    }
    if(conversion_deletion_request_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_deletion_request_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_deletion_request_create->deletion_targets) {
        conversion_deletion_request_targets_free(conversion_deletion_request_create->deletion_targets);
        conversion_deletion_request_create->deletion_targets = NULL;
    }
    free(conversion_deletion_request_create);
}

cJSON *conversion_deletion_request_create_convertToJSON(conversion_deletion_request_create_t *conversion_deletion_request_create) {
    cJSON *item = cJSON_CreateObject();

    // conversion_deletion_request_create->deletion_targets
    if (!conversion_deletion_request_create->deletion_targets) {
        goto fail;
    }
    cJSON *deletion_targets_local_JSON = conversion_deletion_request_targets_convertToJSON(conversion_deletion_request_create->deletion_targets);
    if(deletion_targets_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "deletion_targets", deletion_targets_local_JSON);
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

conversion_deletion_request_create_t *conversion_deletion_request_create_parseFromJSON(cJSON *conversion_deletion_request_createJSON){

    conversion_deletion_request_create_t *conversion_deletion_request_create_local_var = NULL;

    // define the local variable for conversion_deletion_request_create->deletion_targets
    conversion_deletion_request_targets_t *deletion_targets_local_nonprim = NULL;

    // conversion_deletion_request_create->deletion_targets
    cJSON *deletion_targets = cJSON_GetObjectItemCaseSensitive(conversion_deletion_request_createJSON, "deletion_targets");
    if (cJSON_IsNull(deletion_targets)) {
        deletion_targets = NULL;
    }
    if (!deletion_targets) {
        goto end;
    }

    
    deletion_targets_local_nonprim = conversion_deletion_request_targets_parseFromJSON(deletion_targets); //nonprimitive



    conversion_deletion_request_create_local_var = conversion_deletion_request_create_create_internal (
        deletion_targets_local_nonprim
        );

    if (!conversion_deletion_request_create_local_var) {
        goto end;
    }

    return conversion_deletion_request_create_local_var;
end:
    if (deletion_targets_local_nonprim) {
        conversion_deletion_request_targets_free(deletion_targets_local_nonprim);
        deletion_targets_local_nonprim = NULL;
    }
    return NULL;

}
