#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_subscription_post_params_create_all_of_partner_metadata.h"



static lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata_create_internal(
    char *subscriber_key
    ) {
    lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata_local_var = malloc(sizeof(lead_subscription_post_params_create_all_of_partner_metadata_t));
    if (!lead_subscription_post_params_create_all_of_partner_metadata_local_var) {
        return NULL;
    }
    lead_subscription_post_params_create_all_of_partner_metadata_local_var->subscriber_key = subscriber_key;

    lead_subscription_post_params_create_all_of_partner_metadata_local_var->_library_owned = 1;
    return lead_subscription_post_params_create_all_of_partner_metadata_local_var;
}

__attribute__((deprecated)) lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata_create(
    char *subscriber_key
    ) {
    return lead_subscription_post_params_create_all_of_partner_metadata_create_internal (
        subscriber_key
        );
}

void lead_subscription_post_params_create_all_of_partner_metadata_free(lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata) {
    if(NULL == lead_subscription_post_params_create_all_of_partner_metadata){
        return ;
    }
    if(lead_subscription_post_params_create_all_of_partner_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_subscription_post_params_create_all_of_partner_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_subscription_post_params_create_all_of_partner_metadata->subscriber_key) {
        free(lead_subscription_post_params_create_all_of_partner_metadata->subscriber_key);
        lead_subscription_post_params_create_all_of_partner_metadata->subscriber_key = NULL;
    }
    free(lead_subscription_post_params_create_all_of_partner_metadata);
}

cJSON *lead_subscription_post_params_create_all_of_partner_metadata_convertToJSON(lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata) {
    cJSON *item = cJSON_CreateObject();

    // lead_subscription_post_params_create_all_of_partner_metadata->subscriber_key
    if(lead_subscription_post_params_create_all_of_partner_metadata->subscriber_key) {
    if(cJSON_AddStringToObject(item, "subscriber_key", lead_subscription_post_params_create_all_of_partner_metadata->subscriber_key) == NULL) {
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

lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata_parseFromJSON(cJSON *lead_subscription_post_params_create_all_of_partner_metadataJSON){

    lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata_local_var = NULL;

    // lead_subscription_post_params_create_all_of_partner_metadata->subscriber_key
    cJSON *subscriber_key = cJSON_GetObjectItemCaseSensitive(lead_subscription_post_params_create_all_of_partner_metadataJSON, "subscriber_key");
    if (cJSON_IsNull(subscriber_key)) {
        subscriber_key = NULL;
    }
    if (subscriber_key) { 
    if(!cJSON_IsString(subscriber_key) && !cJSON_IsNull(subscriber_key))
    {
    goto end; //String
    }
    }


    lead_subscription_post_params_create_all_of_partner_metadata_local_var = lead_subscription_post_params_create_all_of_partner_metadata_create_internal (
        subscriber_key && !cJSON_IsNull(subscriber_key) ? strdup(subscriber_key->valuestring) : NULL
        );

    return lead_subscription_post_params_create_all_of_partner_metadata_local_var;
end:
    return NULL;

}
