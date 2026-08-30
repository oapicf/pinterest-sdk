#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_credit_redeem_create.h"



static ads_credit_redeem_create_t *ads_credit_redeem_create_create_internal(
    char *offer_code_hash,
    int *validate_only
    ) {
    ads_credit_redeem_create_t *ads_credit_redeem_create_local_var = malloc(sizeof(ads_credit_redeem_create_t));
    if (!ads_credit_redeem_create_local_var) {
        return NULL;
    }
    memset(ads_credit_redeem_create_local_var, 0, sizeof(ads_credit_redeem_create_t));
    ads_credit_redeem_create_local_var->_library_owned = 1;
    ads_credit_redeem_create_local_var->offer_code_hash = offer_code_hash;
    ads_credit_redeem_create_local_var->validate_only = validate_only;
    return ads_credit_redeem_create_local_var;
}

__attribute__((deprecated)) ads_credit_redeem_create_t *ads_credit_redeem_create_create(
    char *offer_code_hash,
    int *validate_only
    ) {
    int *validate_only_copy = NULL;
    if (validate_only) {
        validate_only_copy = malloc(sizeof(int));
        if (validate_only_copy) *validate_only_copy = *validate_only;
    }
    ads_credit_redeem_create_t *result = ads_credit_redeem_create_create_internal (
        offer_code_hash,
        validate_only_copy
        );
    if (!result) {
        free(validate_only_copy);
    }
    return result;
}

void ads_credit_redeem_create_free(ads_credit_redeem_create_t *ads_credit_redeem_create) {
    if(NULL == ads_credit_redeem_create){
        return ;
    }
    if(ads_credit_redeem_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_credit_redeem_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_credit_redeem_create->offer_code_hash) {
        free(ads_credit_redeem_create->offer_code_hash);
        ads_credit_redeem_create->offer_code_hash = NULL;
    }
    if (ads_credit_redeem_create->validate_only) {
        free(ads_credit_redeem_create->validate_only);
        ads_credit_redeem_create->validate_only = NULL;
    }
    free(ads_credit_redeem_create);
}

cJSON *ads_credit_redeem_create_convertToJSON(ads_credit_redeem_create_t *ads_credit_redeem_create) {
    cJSON *item = cJSON_CreateObject();

    // ads_credit_redeem_create->offer_code_hash
    if (!ads_credit_redeem_create->offer_code_hash) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerCodeHash", ads_credit_redeem_create->offer_code_hash) == NULL) {
    goto fail; //String
    }


    // ads_credit_redeem_create->validate_only
    if (!ads_credit_redeem_create->validate_only) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "validateOnly", *ads_credit_redeem_create->validate_only) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ads_credit_redeem_create_t *ads_credit_redeem_create_parseFromJSON(cJSON *ads_credit_redeem_createJSON){

    ads_credit_redeem_create_t *ads_credit_redeem_create_local_var = NULL;

    char *offer_code_hash_local_str = NULL;

    // define the local variable for ads_credit_redeem_create->validate_only
    int *validate_only_local_var = NULL;

    // ads_credit_redeem_create->offer_code_hash
    cJSON *offer_code_hash = cJSON_GetObjectItemCaseSensitive(ads_credit_redeem_createJSON, "offerCodeHash");
    if (cJSON_IsNull(offer_code_hash)) {
        offer_code_hash = NULL;
    }
    if (!offer_code_hash) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_code_hash))
    {
    goto end; //String
    }

    // ads_credit_redeem_create->validate_only
    cJSON *validate_only = cJSON_GetObjectItemCaseSensitive(ads_credit_redeem_createJSON, "validateOnly");
    if (cJSON_IsNull(validate_only)) {
        validate_only = NULL;
    }
    if (!validate_only) {
        goto end;
    }

    
    if(!cJSON_IsBool(validate_only))
    {
    goto end; //Bool
    }
    validate_only_local_var = malloc(sizeof(int));
    if(!validate_only_local_var)
    {
        goto end;
    }
    *validate_only_local_var = validate_only->valueint;


    if (offer_code_hash && !cJSON_IsNull(offer_code_hash)) offer_code_hash_local_str = strdup(offer_code_hash->valuestring);

    ads_credit_redeem_create_local_var = ads_credit_redeem_create_create_internal (
        offer_code_hash_local_str,
        validate_only_local_var
        );

    if (!ads_credit_redeem_create_local_var) {
        goto end;
    }

    return ads_credit_redeem_create_local_var;
end:
    if (offer_code_hash_local_str) {
        free(offer_code_hash_local_str);
        offer_code_hash_local_str = NULL;
    }
    if (validate_only_local_var) {
        free(validate_only_local_var);
        validate_only_local_var = NULL;
    }
    return NULL;

}
