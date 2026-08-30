#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_local_stores_delete_200_response_inner.h"



static catalogs_local_stores_delete_200_response_inner_t *catalogs_local_stores_delete_200_response_inner_create_internal(
    char *id,
    campaign_ad_preview_delete_200_response_inner_status_t *status
    ) {
    catalogs_local_stores_delete_200_response_inner_t *catalogs_local_stores_delete_200_response_inner_local_var = malloc(sizeof(catalogs_local_stores_delete_200_response_inner_t));
    if (!catalogs_local_stores_delete_200_response_inner_local_var) {
        return NULL;
    }
    memset(catalogs_local_stores_delete_200_response_inner_local_var, 0, sizeof(catalogs_local_stores_delete_200_response_inner_t));
    catalogs_local_stores_delete_200_response_inner_local_var->_library_owned = 1;
    catalogs_local_stores_delete_200_response_inner_local_var->id = id;
    catalogs_local_stores_delete_200_response_inner_local_var->status = status;
    return catalogs_local_stores_delete_200_response_inner_local_var;
}

__attribute__((deprecated)) catalogs_local_stores_delete_200_response_inner_t *catalogs_local_stores_delete_200_response_inner_create(
    char *id,
    campaign_ad_preview_delete_200_response_inner_status_t *status
    ) {
    catalogs_local_stores_delete_200_response_inner_t *result = catalogs_local_stores_delete_200_response_inner_create_internal (
        id,
        status
        );
    if (!result) {
    }
    return result;
}

void catalogs_local_stores_delete_200_response_inner_free(catalogs_local_stores_delete_200_response_inner_t *catalogs_local_stores_delete_200_response_inner) {
    if(NULL == catalogs_local_stores_delete_200_response_inner){
        return ;
    }
    if(catalogs_local_stores_delete_200_response_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_local_stores_delete_200_response_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_local_stores_delete_200_response_inner->id) {
        free(catalogs_local_stores_delete_200_response_inner->id);
        catalogs_local_stores_delete_200_response_inner->id = NULL;
    }
    if (catalogs_local_stores_delete_200_response_inner->status) {
        campaign_ad_preview_delete_200_response_inner_status_free(catalogs_local_stores_delete_200_response_inner->status);
        catalogs_local_stores_delete_200_response_inner->status = NULL;
    }
    free(catalogs_local_stores_delete_200_response_inner);
}

cJSON *catalogs_local_stores_delete_200_response_inner_convertToJSON(catalogs_local_stores_delete_200_response_inner_t *catalogs_local_stores_delete_200_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_local_stores_delete_200_response_inner->id
    if (!catalogs_local_stores_delete_200_response_inner->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_local_stores_delete_200_response_inner->id) == NULL) {
    goto fail; //String
    }


    // catalogs_local_stores_delete_200_response_inner->status
    if (!catalogs_local_stores_delete_200_response_inner->status) {
        goto fail;
    }
    cJSON *status_local_JSON = campaign_ad_preview_delete_200_response_inner_status_convertToJSON(catalogs_local_stores_delete_200_response_inner->status);
    if(status_local_JSON == NULL) {
    goto fail; //model
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

catalogs_local_stores_delete_200_response_inner_t *catalogs_local_stores_delete_200_response_inner_parseFromJSON(cJSON *catalogs_local_stores_delete_200_response_innerJSON){

    catalogs_local_stores_delete_200_response_inner_t *catalogs_local_stores_delete_200_response_inner_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for catalogs_local_stores_delete_200_response_inner->status
    campaign_ad_preview_delete_200_response_inner_status_t *status_local_nonprim = NULL;

    // catalogs_local_stores_delete_200_response_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_delete_200_response_innerJSON, "id");
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

    // catalogs_local_stores_delete_200_response_inner->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_delete_200_response_innerJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = campaign_ad_preview_delete_200_response_inner_status_parseFromJSON(status); //nonprimitive


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    catalogs_local_stores_delete_200_response_inner_local_var = catalogs_local_stores_delete_200_response_inner_create_internal (
        id_local_str,
        status_local_nonprim
        );

    if (!catalogs_local_stores_delete_200_response_inner_local_var) {
        goto end;
    }

    return catalogs_local_stores_delete_200_response_inner_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (status_local_nonprim) {
        campaign_ad_preview_delete_200_response_inner_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
