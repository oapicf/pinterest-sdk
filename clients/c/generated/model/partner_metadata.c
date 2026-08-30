#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "partner_metadata.h"



static partner_metadata_t *partner_metadata_create_internal(
    char *subscriber_key
    ) {
    partner_metadata_t *partner_metadata_local_var = malloc(sizeof(partner_metadata_t));
    if (!partner_metadata_local_var) {
        return NULL;
    }
    memset(partner_metadata_local_var, 0, sizeof(partner_metadata_t));
    partner_metadata_local_var->_library_owned = 1;
    partner_metadata_local_var->subscriber_key = subscriber_key;
    return partner_metadata_local_var;
}

__attribute__((deprecated)) partner_metadata_t *partner_metadata_create(
    char *subscriber_key
    ) {
    partner_metadata_t *result = partner_metadata_create_internal (
        subscriber_key
        );
    if (!result) {
    }
    return result;
}

void partner_metadata_free(partner_metadata_t *partner_metadata) {
    if(NULL == partner_metadata){
        return ;
    }
    if(partner_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "partner_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (partner_metadata->subscriber_key) {
        free(partner_metadata->subscriber_key);
        partner_metadata->subscriber_key = NULL;
    }
    free(partner_metadata);
}

cJSON *partner_metadata_convertToJSON(partner_metadata_t *partner_metadata) {
    cJSON *item = cJSON_CreateObject();

    // partner_metadata->subscriber_key
    if(partner_metadata->subscriber_key) {
    if(cJSON_AddStringToObject(item, "subscriber_key", partner_metadata->subscriber_key) == NULL) {
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

partner_metadata_t *partner_metadata_parseFromJSON(cJSON *partner_metadataJSON){

    partner_metadata_t *partner_metadata_local_var = NULL;

    char *subscriber_key_local_str = NULL;

    // partner_metadata->subscriber_key
    cJSON *subscriber_key = cJSON_GetObjectItemCaseSensitive(partner_metadataJSON, "subscriber_key");
    if (cJSON_IsNull(subscriber_key)) {
        subscriber_key = NULL;
    }
    if (subscriber_key) { 
    if(!cJSON_IsString(subscriber_key) && !cJSON_IsNull(subscriber_key))
    {
    goto end; //String
    }
    }


    if (subscriber_key && !cJSON_IsNull(subscriber_key)) subscriber_key_local_str = strdup(subscriber_key->valuestring);

    partner_metadata_local_var = partner_metadata_create_internal (
        subscriber_key_local_str
        );

    if (!partner_metadata_local_var) {
        goto end;
    }

    return partner_metadata_local_var;
end:
    if (subscriber_key_local_str) {
        free(subscriber_key_local_str);
        subscriber_key_local_str = NULL;
    }
    return NULL;

}
