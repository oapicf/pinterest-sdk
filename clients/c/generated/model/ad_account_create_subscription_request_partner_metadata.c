#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_create_subscription_request_partner_metadata.h"



ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata_create(
    char *subscriber_key
    ) {
    ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata_local_var = malloc(sizeof(ad_account_create_subscription_request_partner_metadata_t));
    if (!ad_account_create_subscription_request_partner_metadata_local_var) {
        return NULL;
    }
    ad_account_create_subscription_request_partner_metadata_local_var->subscriber_key = subscriber_key;

    return ad_account_create_subscription_request_partner_metadata_local_var;
}


void ad_account_create_subscription_request_partner_metadata_free(ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata) {
    if(NULL == ad_account_create_subscription_request_partner_metadata){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_create_subscription_request_partner_metadata->subscriber_key) {
        free(ad_account_create_subscription_request_partner_metadata->subscriber_key);
        ad_account_create_subscription_request_partner_metadata->subscriber_key = NULL;
    }
    free(ad_account_create_subscription_request_partner_metadata);
}

cJSON *ad_account_create_subscription_request_partner_metadata_convertToJSON(ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_create_subscription_request_partner_metadata->subscriber_key
    if(ad_account_create_subscription_request_partner_metadata->subscriber_key) {
    if(cJSON_AddStringToObject(item, "subscriber_key", ad_account_create_subscription_request_partner_metadata->subscriber_key) == NULL) {
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

ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata_parseFromJSON(cJSON *ad_account_create_subscription_request_partner_metadataJSON){

    ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata_local_var = NULL;

    // ad_account_create_subscription_request_partner_metadata->subscriber_key
    cJSON *subscriber_key = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_request_partner_metadataJSON, "subscriber_key");
    if (subscriber_key) { 
    if(!cJSON_IsString(subscriber_key) && !cJSON_IsNull(subscriber_key))
    {
    goto end; //String
    }
    }


    ad_account_create_subscription_request_partner_metadata_local_var = ad_account_create_subscription_request_partner_metadata_create (
        subscriber_key && !cJSON_IsNull(subscriber_key) ? strdup(subscriber_key->valuestring) : NULL
        );

    return ad_account_create_subscription_request_partner_metadata_local_var;
end:
    return NULL;

}
