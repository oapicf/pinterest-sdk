#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_accounts_create_200_response.h"



static brand_accounts_create_200_response_t *brand_accounts_create_200_response_create_internal(
    char *brand_account_id
    ) {
    brand_accounts_create_200_response_t *brand_accounts_create_200_response_local_var = malloc(sizeof(brand_accounts_create_200_response_t));
    if (!brand_accounts_create_200_response_local_var) {
        return NULL;
    }
    brand_accounts_create_200_response_local_var->brand_account_id = brand_account_id;

    brand_accounts_create_200_response_local_var->_library_owned = 1;
    return brand_accounts_create_200_response_local_var;
}

__attribute__((deprecated)) brand_accounts_create_200_response_t *brand_accounts_create_200_response_create(
    char *brand_account_id
    ) {
    return brand_accounts_create_200_response_create_internal (
        brand_account_id
        );
}

void brand_accounts_create_200_response_free(brand_accounts_create_200_response_t *brand_accounts_create_200_response) {
    if(NULL == brand_accounts_create_200_response){
        return ;
    }
    if(brand_accounts_create_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_accounts_create_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (brand_accounts_create_200_response->brand_account_id) {
        free(brand_accounts_create_200_response->brand_account_id);
        brand_accounts_create_200_response->brand_account_id = NULL;
    }
    free(brand_accounts_create_200_response);
}

cJSON *brand_accounts_create_200_response_convertToJSON(brand_accounts_create_200_response_t *brand_accounts_create_200_response) {
    cJSON *item = cJSON_CreateObject();

    // brand_accounts_create_200_response->brand_account_id
    if(brand_accounts_create_200_response->brand_account_id) {
    if(cJSON_AddStringToObject(item, "brand_account_id", brand_accounts_create_200_response->brand_account_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

brand_accounts_create_200_response_t *brand_accounts_create_200_response_parseFromJSON(cJSON *brand_accounts_create_200_responseJSON){

    brand_accounts_create_200_response_t *brand_accounts_create_200_response_local_var = NULL;

    // brand_accounts_create_200_response->brand_account_id
    cJSON *brand_account_id = cJSON_GetObjectItemCaseSensitive(brand_accounts_create_200_responseJSON, "brand_account_id");
    if (cJSON_IsNull(brand_account_id)) {
        brand_account_id = NULL;
    }
    if (brand_account_id) { 
    if(!cJSON_IsString(brand_account_id) && !cJSON_IsNull(brand_account_id))
    {
    goto end; //String
    }
    }


    brand_accounts_create_200_response_local_var = brand_accounts_create_200_response_create_internal (
        brand_account_id && !cJSON_IsNull(brand_account_id) ? strdup(brand_account_id->valuestring) : NULL
        );

    return brand_accounts_create_200_response_local_var;
end:
    return NULL;

}
