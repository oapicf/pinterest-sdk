#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_account_item.h"



static ssio_account_item_t *ssio_account_item_create_internal(
    list_t *addresses,
    char *id,
    char *io_terms,
    char *io_terms_id,
    char *io_type,
    char *row_terms,
    char *row_terms_id,
    char *us_terms,
    char *us_terms_id
    ) {
    ssio_account_item_t *ssio_account_item_local_var = malloc(sizeof(ssio_account_item_t));
    if (!ssio_account_item_local_var) {
        return NULL;
    }
    memset(ssio_account_item_local_var, 0, sizeof(ssio_account_item_t));
    ssio_account_item_local_var->_library_owned = 1;
    ssio_account_item_local_var->addresses = addresses;
    ssio_account_item_local_var->id = id;
    ssio_account_item_local_var->io_terms = io_terms;
    ssio_account_item_local_var->io_terms_id = io_terms_id;
    ssio_account_item_local_var->io_type = io_type;
    ssio_account_item_local_var->row_terms = row_terms;
    ssio_account_item_local_var->row_terms_id = row_terms_id;
    ssio_account_item_local_var->us_terms = us_terms;
    ssio_account_item_local_var->us_terms_id = us_terms_id;
    return ssio_account_item_local_var;
}

__attribute__((deprecated)) ssio_account_item_t *ssio_account_item_create(
    list_t *addresses,
    char *id,
    char *io_terms,
    char *io_terms_id,
    char *io_type,
    char *row_terms,
    char *row_terms_id,
    char *us_terms,
    char *us_terms_id
    ) {
    ssio_account_item_t *result = ssio_account_item_create_internal (
        addresses,
        id,
        io_terms,
        io_terms_id,
        io_type,
        row_terms,
        row_terms_id,
        us_terms,
        us_terms_id
        );
    if (!result) {
    }
    return result;
}

void ssio_account_item_free(ssio_account_item_t *ssio_account_item) {
    if(NULL == ssio_account_item){
        return ;
    }
    if(ssio_account_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_account_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_account_item->addresses) {
        list_ForEach(listEntry, ssio_account_item->addresses) {
            ssio_account_address_free(listEntry->data);
        }
        list_freeList(ssio_account_item->addresses);
        ssio_account_item->addresses = NULL;
    }
    if (ssio_account_item->id) {
        free(ssio_account_item->id);
        ssio_account_item->id = NULL;
    }
    if (ssio_account_item->io_terms) {
        free(ssio_account_item->io_terms);
        ssio_account_item->io_terms = NULL;
    }
    if (ssio_account_item->io_terms_id) {
        free(ssio_account_item->io_terms_id);
        ssio_account_item->io_terms_id = NULL;
    }
    if (ssio_account_item->io_type) {
        free(ssio_account_item->io_type);
        ssio_account_item->io_type = NULL;
    }
    if (ssio_account_item->row_terms) {
        free(ssio_account_item->row_terms);
        ssio_account_item->row_terms = NULL;
    }
    if (ssio_account_item->row_terms_id) {
        free(ssio_account_item->row_terms_id);
        ssio_account_item->row_terms_id = NULL;
    }
    if (ssio_account_item->us_terms) {
        free(ssio_account_item->us_terms);
        ssio_account_item->us_terms = NULL;
    }
    if (ssio_account_item->us_terms_id) {
        free(ssio_account_item->us_terms_id);
        ssio_account_item->us_terms_id = NULL;
    }
    free(ssio_account_item);
}

cJSON *ssio_account_item_convertToJSON(ssio_account_item_t *ssio_account_item) {
    cJSON *item = cJSON_CreateObject();

    // ssio_account_item->addresses
    if(ssio_account_item->addresses) {
    cJSON *addresses = cJSON_AddArrayToObject(item, "addresses");
    if(addresses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *addressesListEntry;
    if (ssio_account_item->addresses) {
    list_ForEach(addressesListEntry, ssio_account_item->addresses) {
    cJSON *itemLocal = ssio_account_address_convertToJSON(addressesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(addresses, itemLocal);
    }
    }
    }


    // ssio_account_item->id
    if(ssio_account_item->id) {
    if(cJSON_AddStringToObject(item, "id", ssio_account_item->id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_item->io_terms
    if(ssio_account_item->io_terms) {
    if(cJSON_AddStringToObject(item, "io_terms", ssio_account_item->io_terms) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_item->io_terms_id
    if(ssio_account_item->io_terms_id) {
    if(cJSON_AddStringToObject(item, "io_terms_id", ssio_account_item->io_terms_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_item->io_type
    if(ssio_account_item->io_type) {
    if(cJSON_AddStringToObject(item, "io_type", ssio_account_item->io_type) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_item->row_terms
    if(ssio_account_item->row_terms) {
    if(cJSON_AddStringToObject(item, "row_terms", ssio_account_item->row_terms) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_item->row_terms_id
    if(ssio_account_item->row_terms_id) {
    if(cJSON_AddStringToObject(item, "row_terms_id", ssio_account_item->row_terms_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_item->us_terms
    if(ssio_account_item->us_terms) {
    if(cJSON_AddStringToObject(item, "us_terms", ssio_account_item->us_terms) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_item->us_terms_id
    if(ssio_account_item->us_terms_id) {
    if(cJSON_AddStringToObject(item, "us_terms_id", ssio_account_item->us_terms_id) == NULL) {
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

ssio_account_item_t *ssio_account_item_parseFromJSON(cJSON *ssio_account_itemJSON){

    ssio_account_item_t *ssio_account_item_local_var = NULL;

    // define the local list for ssio_account_item->addresses
    list_t *addressesList = NULL;

    char *id_local_str = NULL;

    char *io_terms_local_str = NULL;

    char *io_terms_id_local_str = NULL;

    char *io_type_local_str = NULL;

    char *row_terms_local_str = NULL;

    char *row_terms_id_local_str = NULL;

    char *us_terms_local_str = NULL;

    char *us_terms_id_local_str = NULL;

    // ssio_account_item->addresses
    cJSON *addresses = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "addresses");
    if (cJSON_IsNull(addresses)) {
        addresses = NULL;
    }
    if (addresses) { 
    cJSON *addresses_local_nonprimitive = NULL;
    if(!cJSON_IsArray(addresses)){
        goto end; //nonprimitive container
    }

    addressesList = list_createList();

    cJSON_ArrayForEach(addresses_local_nonprimitive,addresses )
    {
        if(!cJSON_IsObject(addresses_local_nonprimitive)){
            goto end;
        }
        ssio_account_address_t *addressesItem = ssio_account_address_parseFromJSON(addresses_local_nonprimitive);

        list_addElement(addressesList, addressesItem);
    }
    }

    // ssio_account_item->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // ssio_account_item->io_terms
    cJSON *io_terms = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "io_terms");
    if (cJSON_IsNull(io_terms)) {
        io_terms = NULL;
    }
    if (io_terms) { 
    if(!cJSON_IsString(io_terms) && !cJSON_IsNull(io_terms))
    {
    goto end; //String
    }
    }

    // ssio_account_item->io_terms_id
    cJSON *io_terms_id = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "io_terms_id");
    if (cJSON_IsNull(io_terms_id)) {
        io_terms_id = NULL;
    }
    if (io_terms_id) { 
    if(!cJSON_IsString(io_terms_id) && !cJSON_IsNull(io_terms_id))
    {
    goto end; //String
    }
    }

    // ssio_account_item->io_type
    cJSON *io_type = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "io_type");
    if (cJSON_IsNull(io_type)) {
        io_type = NULL;
    }
    if (io_type) { 
    if(!cJSON_IsString(io_type) && !cJSON_IsNull(io_type))
    {
    goto end; //String
    }
    }

    // ssio_account_item->row_terms
    cJSON *row_terms = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "row_terms");
    if (cJSON_IsNull(row_terms)) {
        row_terms = NULL;
    }
    if (row_terms) { 
    if(!cJSON_IsString(row_terms) && !cJSON_IsNull(row_terms))
    {
    goto end; //String
    }
    }

    // ssio_account_item->row_terms_id
    cJSON *row_terms_id = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "row_terms_id");
    if (cJSON_IsNull(row_terms_id)) {
        row_terms_id = NULL;
    }
    if (row_terms_id) { 
    if(!cJSON_IsString(row_terms_id) && !cJSON_IsNull(row_terms_id))
    {
    goto end; //String
    }
    }

    // ssio_account_item->us_terms
    cJSON *us_terms = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "us_terms");
    if (cJSON_IsNull(us_terms)) {
        us_terms = NULL;
    }
    if (us_terms) { 
    if(!cJSON_IsString(us_terms) && !cJSON_IsNull(us_terms))
    {
    goto end; //String
    }
    }

    // ssio_account_item->us_terms_id
    cJSON *us_terms_id = cJSON_GetObjectItemCaseSensitive(ssio_account_itemJSON, "us_terms_id");
    if (cJSON_IsNull(us_terms_id)) {
        us_terms_id = NULL;
    }
    if (us_terms_id) { 
    if(!cJSON_IsString(us_terms_id) && !cJSON_IsNull(us_terms_id))
    {
    goto end; //String
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (io_terms && !cJSON_IsNull(io_terms)) io_terms_local_str = strdup(io_terms->valuestring);
    if (io_terms_id && !cJSON_IsNull(io_terms_id)) io_terms_id_local_str = strdup(io_terms_id->valuestring);
    if (io_type && !cJSON_IsNull(io_type)) io_type_local_str = strdup(io_type->valuestring);
    if (row_terms && !cJSON_IsNull(row_terms)) row_terms_local_str = strdup(row_terms->valuestring);
    if (row_terms_id && !cJSON_IsNull(row_terms_id)) row_terms_id_local_str = strdup(row_terms_id->valuestring);
    if (us_terms && !cJSON_IsNull(us_terms)) us_terms_local_str = strdup(us_terms->valuestring);
    if (us_terms_id && !cJSON_IsNull(us_terms_id)) us_terms_id_local_str = strdup(us_terms_id->valuestring);

    ssio_account_item_local_var = ssio_account_item_create_internal (
        addresses ? addressesList : NULL,
        id_local_str,
        io_terms_local_str,
        io_terms_id_local_str,
        io_type_local_str,
        row_terms_local_str,
        row_terms_id_local_str,
        us_terms_local_str,
        us_terms_id_local_str
        );

    if (!ssio_account_item_local_var) {
        goto end;
    }

    return ssio_account_item_local_var;
end:
    if (addressesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, addressesList) {
            ssio_account_address_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(addressesList);
        addressesList = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (io_terms_local_str) {
        free(io_terms_local_str);
        io_terms_local_str = NULL;
    }
    if (io_terms_id_local_str) {
        free(io_terms_id_local_str);
        io_terms_id_local_str = NULL;
    }
    if (io_type_local_str) {
        free(io_type_local_str);
        io_type_local_str = NULL;
    }
    if (row_terms_local_str) {
        free(row_terms_local_str);
        row_terms_local_str = NULL;
    }
    if (row_terms_id_local_str) {
        free(row_terms_id_local_str);
        row_terms_id_local_str = NULL;
    }
    if (us_terms_local_str) {
        free(us_terms_local_str);
        us_terms_local_str = NULL;
    }
    if (us_terms_id_local_str) {
        free(us_terms_id_local_str);
        us_terms_id_local_str = NULL;
    }
    return NULL;

}
