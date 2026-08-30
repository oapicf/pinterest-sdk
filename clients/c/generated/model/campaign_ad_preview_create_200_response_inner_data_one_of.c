#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_ad_preview_create_200_response_inner_data_one_of.h"



static campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of_create_internal(
    pinterest_lib_error_t *exceptions
    ) {
    campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of_local_var = malloc(sizeof(campaign_ad_preview_create_200_response_inner_data_one_of_t));
    if (!campaign_ad_preview_create_200_response_inner_data_one_of_local_var) {
        return NULL;
    }
    memset(campaign_ad_preview_create_200_response_inner_data_one_of_local_var, 0, sizeof(campaign_ad_preview_create_200_response_inner_data_one_of_t));
    campaign_ad_preview_create_200_response_inner_data_one_of_local_var->_library_owned = 1;
    campaign_ad_preview_create_200_response_inner_data_one_of_local_var->exceptions = exceptions;
    return campaign_ad_preview_create_200_response_inner_data_one_of_local_var;
}

__attribute__((deprecated)) campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of_create(
    pinterest_lib_error_t *exceptions
    ) {
    campaign_ad_preview_create_200_response_inner_data_one_of_t *result = campaign_ad_preview_create_200_response_inner_data_one_of_create_internal (
        exceptions
        );
    if (!result) {
    }
    return result;
}

void campaign_ad_preview_create_200_response_inner_data_one_of_free(campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of) {
    if(NULL == campaign_ad_preview_create_200_response_inner_data_one_of){
        return ;
    }
    if(campaign_ad_preview_create_200_response_inner_data_one_of->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_ad_preview_create_200_response_inner_data_one_of_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_ad_preview_create_200_response_inner_data_one_of->exceptions) {
        pinterest_lib_error_free(campaign_ad_preview_create_200_response_inner_data_one_of->exceptions);
        campaign_ad_preview_create_200_response_inner_data_one_of->exceptions = NULL;
    }
    free(campaign_ad_preview_create_200_response_inner_data_one_of);
}

cJSON *campaign_ad_preview_create_200_response_inner_data_one_of_convertToJSON(campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of) {
    cJSON *item = cJSON_CreateObject();

    // campaign_ad_preview_create_200_response_inner_data_one_of->exceptions
    if (!campaign_ad_preview_create_200_response_inner_data_one_of->exceptions) {
        goto fail;
    }
    cJSON *exceptions_local_JSON = pinterest_lib_error_convertToJSON(campaign_ad_preview_create_200_response_inner_data_one_of->exceptions);
    if(exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_local_JSON);
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

campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of_parseFromJSON(cJSON *campaign_ad_preview_create_200_response_inner_data_one_ofJSON){

    campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of_local_var = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data_one_of->exceptions
    pinterest_lib_error_t *exceptions_local_nonprim = NULL;

    // campaign_ad_preview_create_200_response_inner_data_one_of->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_data_one_ofJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (!exceptions) {
        goto end;
    }

    
    exceptions_local_nonprim = pinterest_lib_error_parseFromJSON(exceptions); //nonprimitive



    campaign_ad_preview_create_200_response_inner_data_one_of_local_var = campaign_ad_preview_create_200_response_inner_data_one_of_create_internal (
        exceptions_local_nonprim
        );

    if (!campaign_ad_preview_create_200_response_inner_data_one_of_local_var) {
        goto end;
    }

    return campaign_ad_preview_create_200_response_inner_data_one_of_local_var;
end:
    if (exceptions_local_nonprim) {
        pinterest_lib_error_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
