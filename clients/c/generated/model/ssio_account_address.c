#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_account_address.h"



ssio_account_address_t *ssio_account_address_create(
    char *display,
    char *purpose,
    char *address_id,
    char *order_legal_entity
    ) {
    ssio_account_address_t *ssio_account_address_local_var = malloc(sizeof(ssio_account_address_t));
    if (!ssio_account_address_local_var) {
        return NULL;
    }
    ssio_account_address_local_var->display = display;
    ssio_account_address_local_var->purpose = purpose;
    ssio_account_address_local_var->address_id = address_id;
    ssio_account_address_local_var->order_legal_entity = order_legal_entity;

    return ssio_account_address_local_var;
}


void ssio_account_address_free(ssio_account_address_t *ssio_account_address) {
    if(NULL == ssio_account_address){
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_account_address->display) {
        free(ssio_account_address->display);
        ssio_account_address->display = NULL;
    }
    if (ssio_account_address->purpose) {
        free(ssio_account_address->purpose);
        ssio_account_address->purpose = NULL;
    }
    if (ssio_account_address->address_id) {
        free(ssio_account_address->address_id);
        ssio_account_address->address_id = NULL;
    }
    if (ssio_account_address->order_legal_entity) {
        free(ssio_account_address->order_legal_entity);
        ssio_account_address->order_legal_entity = NULL;
    }
    free(ssio_account_address);
}

cJSON *ssio_account_address_convertToJSON(ssio_account_address_t *ssio_account_address) {
    cJSON *item = cJSON_CreateObject();

    // ssio_account_address->display
    if(ssio_account_address->display) {
    if(cJSON_AddStringToObject(item, "display", ssio_account_address->display) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_address->purpose
    if(ssio_account_address->purpose) {
    if(cJSON_AddStringToObject(item, "purpose", ssio_account_address->purpose) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_address->address_id
    if(ssio_account_address->address_id) {
    if(cJSON_AddStringToObject(item, "address_id", ssio_account_address->address_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_address->order_legal_entity
    if(ssio_account_address->order_legal_entity) {
    if(cJSON_AddStringToObject(item, "order_legal_entity", ssio_account_address->order_legal_entity) == NULL) {
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

ssio_account_address_t *ssio_account_address_parseFromJSON(cJSON *ssio_account_addressJSON){

    ssio_account_address_t *ssio_account_address_local_var = NULL;

    // ssio_account_address->display
    cJSON *display = cJSON_GetObjectItemCaseSensitive(ssio_account_addressJSON, "display");
    if (display) { 
    if(!cJSON_IsString(display) && !cJSON_IsNull(display))
    {
    goto end; //String
    }
    }

    // ssio_account_address->purpose
    cJSON *purpose = cJSON_GetObjectItemCaseSensitive(ssio_account_addressJSON, "purpose");
    if (purpose) { 
    if(!cJSON_IsString(purpose) && !cJSON_IsNull(purpose))
    {
    goto end; //String
    }
    }

    // ssio_account_address->address_id
    cJSON *address_id = cJSON_GetObjectItemCaseSensitive(ssio_account_addressJSON, "address_id");
    if (address_id) { 
    if(!cJSON_IsString(address_id) && !cJSON_IsNull(address_id))
    {
    goto end; //String
    }
    }

    // ssio_account_address->order_legal_entity
    cJSON *order_legal_entity = cJSON_GetObjectItemCaseSensitive(ssio_account_addressJSON, "order_legal_entity");
    if (order_legal_entity) { 
    if(!cJSON_IsString(order_legal_entity) && !cJSON_IsNull(order_legal_entity))
    {
    goto end; //String
    }
    }


    ssio_account_address_local_var = ssio_account_address_create (
        display && !cJSON_IsNull(display) ? strdup(display->valuestring) : NULL,
        purpose && !cJSON_IsNull(purpose) ? strdup(purpose->valuestring) : NULL,
        address_id && !cJSON_IsNull(address_id) ? strdup(address_id->valuestring) : NULL,
        order_legal_entity && !cJSON_IsNull(order_legal_entity) ? strdup(order_legal_entity->valuestring) : NULL
        );

    return ssio_account_address_local_var;
end:
    return NULL;

}
