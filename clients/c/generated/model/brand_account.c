#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_account.h"



static brand_account_t *brand_account_create_internal(
    char *brand_account_id
    ) {
    brand_account_t *brand_account_local_var = malloc(sizeof(brand_account_t));
    if (!brand_account_local_var) {
        return NULL;
    }
    memset(brand_account_local_var, 0, sizeof(brand_account_t));
    brand_account_local_var->_library_owned = 1;
    brand_account_local_var->brand_account_id = brand_account_id;
    return brand_account_local_var;
}

__attribute__((deprecated)) brand_account_t *brand_account_create(
    char *brand_account_id
    ) {
    brand_account_t *result = brand_account_create_internal (
        brand_account_id
        );
    if (!result) {
    }
    return result;
}

void brand_account_free(brand_account_t *brand_account) {
    if(NULL == brand_account){
        return ;
    }
    if(brand_account->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_account_free");
        return ;
    }
    listEntry_t *listEntry;
    if (brand_account->brand_account_id) {
        free(brand_account->brand_account_id);
        brand_account->brand_account_id = NULL;
    }
    free(brand_account);
}

cJSON *brand_account_convertToJSON(brand_account_t *brand_account) {
    cJSON *item = cJSON_CreateObject();

    // brand_account->brand_account_id
    if (!brand_account->brand_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "brand_account_id", brand_account->brand_account_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

brand_account_t *brand_account_parseFromJSON(cJSON *brand_accountJSON){

    brand_account_t *brand_account_local_var = NULL;

    char *brand_account_id_local_str = NULL;

    // brand_account->brand_account_id
    cJSON *brand_account_id = cJSON_GetObjectItemCaseSensitive(brand_accountJSON, "brand_account_id");
    if (cJSON_IsNull(brand_account_id)) {
        brand_account_id = NULL;
    }
    if (!brand_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(brand_account_id))
    {
    goto end; //String
    }


    if (brand_account_id && !cJSON_IsNull(brand_account_id)) brand_account_id_local_str = strdup(brand_account_id->valuestring);

    brand_account_local_var = brand_account_create_internal (
        brand_account_id_local_str
        );

    if (!brand_account_local_var) {
        goto end;
    }

    return brand_account_local_var;
end:
    if (brand_account_id_local_str) {
        free(brand_account_id_local_str);
        brand_account_id_local_str = NULL;
    }
    return NULL;

}
