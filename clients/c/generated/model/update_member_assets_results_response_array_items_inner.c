#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_assets_results_response_array_items_inner.h"



update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner_create(
    users_for_individual_asset_response_t *response
    ) {
    update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner_local_var = malloc(sizeof(update_member_assets_results_response_array_items_inner_t));
    if (!update_member_assets_results_response_array_items_inner_local_var) {
        return NULL;
    }
    update_member_assets_results_response_array_items_inner_local_var->response = response;

    return update_member_assets_results_response_array_items_inner_local_var;
}


void update_member_assets_results_response_array_items_inner_free(update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner) {
    if(NULL == update_member_assets_results_response_array_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_assets_results_response_array_items_inner->response) {
        users_for_individual_asset_response_free(update_member_assets_results_response_array_items_inner->response);
        update_member_assets_results_response_array_items_inner->response = NULL;
    }
    free(update_member_assets_results_response_array_items_inner);
}

cJSON *update_member_assets_results_response_array_items_inner_convertToJSON(update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // update_member_assets_results_response_array_items_inner->response
    if(update_member_assets_results_response_array_items_inner->response) {
    cJSON *response_local_JSON = users_for_individual_asset_response_convertToJSON(update_member_assets_results_response_array_items_inner->response);
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

update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner_parseFromJSON(cJSON *update_member_assets_results_response_array_items_innerJSON){

    update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner_local_var = NULL;

    // define the local variable for update_member_assets_results_response_array_items_inner->response
    users_for_individual_asset_response_t *response_local_nonprim = NULL;

    // update_member_assets_results_response_array_items_inner->response
    cJSON *response = cJSON_GetObjectItemCaseSensitive(update_member_assets_results_response_array_items_innerJSON, "response");
    if (response) { 
    response_local_nonprim = users_for_individual_asset_response_parseFromJSON(response); //nonprimitive
    }


    update_member_assets_results_response_array_items_inner_local_var = update_member_assets_results_response_array_items_inner_create (
        response ? response_local_nonprim : NULL
        );

    return update_member_assets_results_response_array_items_inner_local_var;
end:
    if (response_local_nonprim) {
        users_for_individual_asset_response_free(response_local_nonprim);
        response_local_nonprim = NULL;
    }
    return NULL;

}
