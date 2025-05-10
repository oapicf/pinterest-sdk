#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_credit_redeem_request.h"



static ads_credit_redeem_request_t *ads_credit_redeem_request_create_internal(
    char *offer_code_hash,
    int validate_only
    ) {
    ads_credit_redeem_request_t *ads_credit_redeem_request_local_var = malloc(sizeof(ads_credit_redeem_request_t));
    if (!ads_credit_redeem_request_local_var) {
        return NULL;
    }
    ads_credit_redeem_request_local_var->offer_code_hash = offer_code_hash;
    ads_credit_redeem_request_local_var->validate_only = validate_only;

    ads_credit_redeem_request_local_var->_library_owned = 1;
    return ads_credit_redeem_request_local_var;
}

__attribute__((deprecated)) ads_credit_redeem_request_t *ads_credit_redeem_request_create(
    char *offer_code_hash,
    int validate_only
    ) {
    return ads_credit_redeem_request_create_internal (
        offer_code_hash,
        validate_only
        );
}

void ads_credit_redeem_request_free(ads_credit_redeem_request_t *ads_credit_redeem_request) {
    if(NULL == ads_credit_redeem_request){
        return ;
    }
    if(ads_credit_redeem_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_credit_redeem_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_credit_redeem_request->offer_code_hash) {
        free(ads_credit_redeem_request->offer_code_hash);
        ads_credit_redeem_request->offer_code_hash = NULL;
    }
    free(ads_credit_redeem_request);
}

cJSON *ads_credit_redeem_request_convertToJSON(ads_credit_redeem_request_t *ads_credit_redeem_request) {
    cJSON *item = cJSON_CreateObject();

    // ads_credit_redeem_request->offer_code_hash
    if (!ads_credit_redeem_request->offer_code_hash) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerCodeHash", ads_credit_redeem_request->offer_code_hash) == NULL) {
    goto fail; //String
    }


    // ads_credit_redeem_request->validate_only
    if (!ads_credit_redeem_request->validate_only) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "validateOnly", ads_credit_redeem_request->validate_only) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ads_credit_redeem_request_t *ads_credit_redeem_request_parseFromJSON(cJSON *ads_credit_redeem_requestJSON){

    ads_credit_redeem_request_t *ads_credit_redeem_request_local_var = NULL;

    // ads_credit_redeem_request->offer_code_hash
    cJSON *offer_code_hash = cJSON_GetObjectItemCaseSensitive(ads_credit_redeem_requestJSON, "offerCodeHash");
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

    // ads_credit_redeem_request->validate_only
    cJSON *validate_only = cJSON_GetObjectItemCaseSensitive(ads_credit_redeem_requestJSON, "validateOnly");
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


    ads_credit_redeem_request_local_var = ads_credit_redeem_request_create_internal (
        strdup(offer_code_hash->valuestring),
        validate_only->valueint
        );

    return ads_credit_redeem_request_local_var;
end:
    return NULL;

}
