#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_asset_result_item.h"



static update_member_asset_result_item_t *update_member_asset_result_item_create_internal(
    users_for_individual_asset_response_t *response
    ) {
    update_member_asset_result_item_t *update_member_asset_result_item_local_var = malloc(sizeof(update_member_asset_result_item_t));
    if (!update_member_asset_result_item_local_var) {
        return NULL;
    }
    memset(update_member_asset_result_item_local_var, 0, sizeof(update_member_asset_result_item_t));
    update_member_asset_result_item_local_var->_library_owned = 1;
    update_member_asset_result_item_local_var->response = response;
    return update_member_asset_result_item_local_var;
}

__attribute__((deprecated)) update_member_asset_result_item_t *update_member_asset_result_item_create(
    users_for_individual_asset_response_t *response
    ) {
    update_member_asset_result_item_t *result = update_member_asset_result_item_create_internal (
        response
        );
    if (!result) {
    }
    return result;
}

void update_member_asset_result_item_free(update_member_asset_result_item_t *update_member_asset_result_item) {
    if(NULL == update_member_asset_result_item){
        return ;
    }
    if(update_member_asset_result_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_member_asset_result_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_asset_result_item->response) {
        users_for_individual_asset_response_free(update_member_asset_result_item->response);
        update_member_asset_result_item->response = NULL;
    }
    free(update_member_asset_result_item);
}

cJSON *update_member_asset_result_item_convertToJSON(update_member_asset_result_item_t *update_member_asset_result_item) {
    cJSON *item = cJSON_CreateObject();

    // update_member_asset_result_item->response
    if(update_member_asset_result_item->response) {
    cJSON *response_local_JSON = users_for_individual_asset_response_convertToJSON(update_member_asset_result_item->response);
    if(response_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "response", response_local_JSON);
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

update_member_asset_result_item_t *update_member_asset_result_item_parseFromJSON(cJSON *update_member_asset_result_itemJSON){

    update_member_asset_result_item_t *update_member_asset_result_item_local_var = NULL;

    // define the local variable for update_member_asset_result_item->response
    users_for_individual_asset_response_t *response_local_nonprim = NULL;

    // update_member_asset_result_item->response
    cJSON *response = cJSON_GetObjectItemCaseSensitive(update_member_asset_result_itemJSON, "response");
    if (cJSON_IsNull(response)) {
        response = NULL;
    }
    if (response) { 
    response_local_nonprim = users_for_individual_asset_response_parseFromJSON(response); //nonprimitive
    }



    update_member_asset_result_item_local_var = update_member_asset_result_item_create_internal (
        response ? response_local_nonprim : NULL
        );

    if (!update_member_asset_result_item_local_var) {
        goto end;
    }

    return update_member_asset_result_item_local_var;
end:
    if (response_local_nonprim) {
        users_for_individual_asset_response_free(response_local_nonprim);
        response_local_nonprim = NULL;
    }
    return NULL;

}
