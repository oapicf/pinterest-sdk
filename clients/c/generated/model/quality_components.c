#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quality_components.h"



static quality_components_t *quality_components_create_internal(
    list_t* advertiser_external_id,
    list_t* click_id_epik,
    list_t* external_event_id,
    list_t* hashed_email,
    list_t* hashed_maid,
    list_t* ip_address,
    list_t* order_id,
    list_t* order_value,
    list_t* product_id,
    list_t* source_url,
    list_t* user_agent
    ) {
    quality_components_t *quality_components_local_var = malloc(sizeof(quality_components_t));
    if (!quality_components_local_var) {
        return NULL;
    }
    memset(quality_components_local_var, 0, sizeof(quality_components_t));
    quality_components_local_var->_library_owned = 1;
    quality_components_local_var->advertiser_external_id = advertiser_external_id;
    quality_components_local_var->click_id_epik = click_id_epik;
    quality_components_local_var->external_event_id = external_event_id;
    quality_components_local_var->hashed_email = hashed_email;
    quality_components_local_var->hashed_maid = hashed_maid;
    quality_components_local_var->ip_address = ip_address;
    quality_components_local_var->order_id = order_id;
    quality_components_local_var->order_value = order_value;
    quality_components_local_var->product_id = product_id;
    quality_components_local_var->source_url = source_url;
    quality_components_local_var->user_agent = user_agent;
    return quality_components_local_var;
}

__attribute__((deprecated)) quality_components_t *quality_components_create(
    list_t* advertiser_external_id,
    list_t* click_id_epik,
    list_t* external_event_id,
    list_t* hashed_email,
    list_t* hashed_maid,
    list_t* ip_address,
    list_t* order_id,
    list_t* order_value,
    list_t* product_id,
    list_t* source_url,
    list_t* user_agent
    ) {
    quality_components_t *result = quality_components_create_internal (
        advertiser_external_id,
        click_id_epik,
        external_event_id,
        hashed_email,
        hashed_maid,
        ip_address,
        order_id,
        order_value,
        product_id,
        source_url,
        user_agent
        );
    if (!result) {
    }
    return result;
}

void quality_components_free(quality_components_t *quality_components) {
    if(NULL == quality_components){
        return ;
    }
    if(quality_components->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "quality_components_free");
        return ;
    }
    listEntry_t *listEntry;
    if (quality_components->advertiser_external_id) {
        list_ForEach(listEntry, quality_components->advertiser_external_id) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->advertiser_external_id);
        quality_components->advertiser_external_id = NULL;
    }
    if (quality_components->click_id_epik) {
        list_ForEach(listEntry, quality_components->click_id_epik) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->click_id_epik);
        quality_components->click_id_epik = NULL;
    }
    if (quality_components->external_event_id) {
        list_ForEach(listEntry, quality_components->external_event_id) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->external_event_id);
        quality_components->external_event_id = NULL;
    }
    if (quality_components->hashed_email) {
        list_ForEach(listEntry, quality_components->hashed_email) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->hashed_email);
        quality_components->hashed_email = NULL;
    }
    if (quality_components->hashed_maid) {
        list_ForEach(listEntry, quality_components->hashed_maid) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->hashed_maid);
        quality_components->hashed_maid = NULL;
    }
    if (quality_components->ip_address) {
        list_ForEach(listEntry, quality_components->ip_address) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->ip_address);
        quality_components->ip_address = NULL;
    }
    if (quality_components->order_id) {
        list_ForEach(listEntry, quality_components->order_id) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->order_id);
        quality_components->order_id = NULL;
    }
    if (quality_components->order_value) {
        list_ForEach(listEntry, quality_components->order_value) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->order_value);
        quality_components->order_value = NULL;
    }
    if (quality_components->product_id) {
        list_ForEach(listEntry, quality_components->product_id) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->product_id);
        quality_components->product_id = NULL;
    }
    if (quality_components->source_url) {
        list_ForEach(listEntry, quality_components->source_url) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->source_url);
        quality_components->source_url = NULL;
    }
    if (quality_components->user_agent) {
        list_ForEach(listEntry, quality_components->user_agent) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(quality_components->user_agent);
        quality_components->user_agent = NULL;
    }
    free(quality_components);
}

cJSON *quality_components_convertToJSON(quality_components_t *quality_components) {
    cJSON *item = cJSON_CreateObject();

    // quality_components->advertiser_external_id
    if(quality_components->advertiser_external_id) {
    cJSON *advertiser_external_id = cJSON_AddObjectToObject(item, "advertiser_external_id");
    if(advertiser_external_id == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = advertiser_external_id;
    listEntry_t *advertiser_external_idListEntry;
    if (quality_components->advertiser_external_id) {
    list_ForEach(advertiser_external_idListEntry, quality_components->advertiser_external_id) {
        keyValuePair_t *localKeyValue = advertiser_external_idListEntry->data;
    }
    }
    }


    // quality_components->click_id_epik
    if(quality_components->click_id_epik) {
    cJSON *click_id_epik = cJSON_AddObjectToObject(item, "click_id_epik");
    if(click_id_epik == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = click_id_epik;
    listEntry_t *click_id_epikListEntry;
    if (quality_components->click_id_epik) {
    list_ForEach(click_id_epikListEntry, quality_components->click_id_epik) {
        keyValuePair_t *localKeyValue = click_id_epikListEntry->data;
    }
    }
    }


    // quality_components->external_event_id
    if(quality_components->external_event_id) {
    cJSON *external_event_id = cJSON_AddObjectToObject(item, "external_event_id");
    if(external_event_id == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = external_event_id;
    listEntry_t *external_event_idListEntry;
    if (quality_components->external_event_id) {
    list_ForEach(external_event_idListEntry, quality_components->external_event_id) {
        keyValuePair_t *localKeyValue = external_event_idListEntry->data;
    }
    }
    }


    // quality_components->hashed_email
    if(quality_components->hashed_email) {
    cJSON *hashed_email = cJSON_AddObjectToObject(item, "hashed_email");
    if(hashed_email == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = hashed_email;
    listEntry_t *hashed_emailListEntry;
    if (quality_components->hashed_email) {
    list_ForEach(hashed_emailListEntry, quality_components->hashed_email) {
        keyValuePair_t *localKeyValue = hashed_emailListEntry->data;
    }
    }
    }


    // quality_components->hashed_maid
    if(quality_components->hashed_maid) {
    cJSON *hashed_maid = cJSON_AddObjectToObject(item, "hashed_maid");
    if(hashed_maid == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = hashed_maid;
    listEntry_t *hashed_maidListEntry;
    if (quality_components->hashed_maid) {
    list_ForEach(hashed_maidListEntry, quality_components->hashed_maid) {
        keyValuePair_t *localKeyValue = hashed_maidListEntry->data;
    }
    }
    }


    // quality_components->ip_address
    if(quality_components->ip_address) {
    cJSON *ip_address = cJSON_AddObjectToObject(item, "ip_address");
    if(ip_address == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = ip_address;
    listEntry_t *ip_addressListEntry;
    if (quality_components->ip_address) {
    list_ForEach(ip_addressListEntry, quality_components->ip_address) {
        keyValuePair_t *localKeyValue = ip_addressListEntry->data;
    }
    }
    }


    // quality_components->order_id
    if(quality_components->order_id) {
    cJSON *order_id = cJSON_AddObjectToObject(item, "order_id");
    if(order_id == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = order_id;
    listEntry_t *order_idListEntry;
    if (quality_components->order_id) {
    list_ForEach(order_idListEntry, quality_components->order_id) {
        keyValuePair_t *localKeyValue = order_idListEntry->data;
    }
    }
    }


    // quality_components->order_value
    if(quality_components->order_value) {
    cJSON *order_value = cJSON_AddObjectToObject(item, "order_value");
    if(order_value == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = order_value;
    listEntry_t *order_valueListEntry;
    if (quality_components->order_value) {
    list_ForEach(order_valueListEntry, quality_components->order_value) {
        keyValuePair_t *localKeyValue = order_valueListEntry->data;
    }
    }
    }


    // quality_components->product_id
    if(quality_components->product_id) {
    cJSON *product_id = cJSON_AddObjectToObject(item, "product_id");
    if(product_id == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = product_id;
    listEntry_t *product_idListEntry;
    if (quality_components->product_id) {
    list_ForEach(product_idListEntry, quality_components->product_id) {
        keyValuePair_t *localKeyValue = product_idListEntry->data;
    }
    }
    }


    // quality_components->source_url
    if(quality_components->source_url) {
    cJSON *source_url = cJSON_AddObjectToObject(item, "source_url");
    if(source_url == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = source_url;
    listEntry_t *source_urlListEntry;
    if (quality_components->source_url) {
    list_ForEach(source_urlListEntry, quality_components->source_url) {
        keyValuePair_t *localKeyValue = source_urlListEntry->data;
    }
    }
    }


    // quality_components->user_agent
    if(quality_components->user_agent) {
    cJSON *user_agent = cJSON_AddObjectToObject(item, "user_agent");
    if(user_agent == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = user_agent;
    listEntry_t *user_agentListEntry;
    if (quality_components->user_agent) {
    list_ForEach(user_agentListEntry, quality_components->user_agent) {
        keyValuePair_t *localKeyValue = user_agentListEntry->data;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

quality_components_t *quality_components_parseFromJSON(cJSON *quality_componentsJSON){

    quality_components_t *quality_components_local_var = NULL;

    // define the local map for quality_components->advertiser_external_id
    list_t *advertiser_external_idList = NULL;

    // define the local map for quality_components->click_id_epik
    list_t *click_id_epikList = NULL;

    // define the local map for quality_components->external_event_id
    list_t *external_event_idList = NULL;

    // define the local map for quality_components->hashed_email
    list_t *hashed_emailList = NULL;

    // define the local map for quality_components->hashed_maid
    list_t *hashed_maidList = NULL;

    // define the local map for quality_components->ip_address
    list_t *ip_addressList = NULL;

    // define the local map for quality_components->order_id
    list_t *order_idList = NULL;

    // define the local map for quality_components->order_value
    list_t *order_valueList = NULL;

    // define the local map for quality_components->product_id
    list_t *product_idList = NULL;

    // define the local map for quality_components->source_url
    list_t *source_urlList = NULL;

    // define the local map for quality_components->user_agent
    list_t *user_agentList = NULL;

    // quality_components->advertiser_external_id
    cJSON *advertiser_external_id = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "advertiser_external_id");
    if (cJSON_IsNull(advertiser_external_id)) {
        advertiser_external_id = NULL;
    }
    if (advertiser_external_id) { 

    // The data type of the elements in quality_components->advertiser_external_id is currently not supported.

    }

    // quality_components->click_id_epik
    cJSON *click_id_epik = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "click_id_epik");
    if (cJSON_IsNull(click_id_epik)) {
        click_id_epik = NULL;
    }
    if (click_id_epik) { 

    // The data type of the elements in quality_components->click_id_epik is currently not supported.

    }

    // quality_components->external_event_id
    cJSON *external_event_id = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "external_event_id");
    if (cJSON_IsNull(external_event_id)) {
        external_event_id = NULL;
    }
    if (external_event_id) { 

    // The data type of the elements in quality_components->external_event_id is currently not supported.

    }

    // quality_components->hashed_email
    cJSON *hashed_email = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "hashed_email");
    if (cJSON_IsNull(hashed_email)) {
        hashed_email = NULL;
    }
    if (hashed_email) { 

    // The data type of the elements in quality_components->hashed_email is currently not supported.

    }

    // quality_components->hashed_maid
    cJSON *hashed_maid = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "hashed_maid");
    if (cJSON_IsNull(hashed_maid)) {
        hashed_maid = NULL;
    }
    if (hashed_maid) { 

    // The data type of the elements in quality_components->hashed_maid is currently not supported.

    }

    // quality_components->ip_address
    cJSON *ip_address = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "ip_address");
    if (cJSON_IsNull(ip_address)) {
        ip_address = NULL;
    }
    if (ip_address) { 

    // The data type of the elements in quality_components->ip_address is currently not supported.

    }

    // quality_components->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "order_id");
    if (cJSON_IsNull(order_id)) {
        order_id = NULL;
    }
    if (order_id) { 

    // The data type of the elements in quality_components->order_id is currently not supported.

    }

    // quality_components->order_value
    cJSON *order_value = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "order_value");
    if (cJSON_IsNull(order_value)) {
        order_value = NULL;
    }
    if (order_value) { 

    // The data type of the elements in quality_components->order_value is currently not supported.

    }

    // quality_components->product_id
    cJSON *product_id = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "product_id");
    if (cJSON_IsNull(product_id)) {
        product_id = NULL;
    }
    if (product_id) { 

    // The data type of the elements in quality_components->product_id is currently not supported.

    }

    // quality_components->source_url
    cJSON *source_url = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "source_url");
    if (cJSON_IsNull(source_url)) {
        source_url = NULL;
    }
    if (source_url) { 

    // The data type of the elements in quality_components->source_url is currently not supported.

    }

    // quality_components->user_agent
    cJSON *user_agent = cJSON_GetObjectItemCaseSensitive(quality_componentsJSON, "user_agent");
    if (cJSON_IsNull(user_agent)) {
        user_agent = NULL;
    }
    if (user_agent) { 

    // The data type of the elements in quality_components->user_agent is currently not supported.

    }



    quality_components_local_var = quality_components_create_internal (
        advertiser_external_id ? advertiser_external_idList : NULL,
        click_id_epik ? click_id_epikList : NULL,
        external_event_id ? external_event_idList : NULL,
        hashed_email ? hashed_emailList : NULL,
        hashed_maid ? hashed_maidList : NULL,
        ip_address ? ip_addressList : NULL,
        order_id ? order_idList : NULL,
        order_value ? order_valueList : NULL,
        product_id ? product_idList : NULL,
        source_url ? source_urlList : NULL,
        user_agent ? user_agentList : NULL
        );

    if (!quality_components_local_var) {
        goto end;
    }

    return quality_components_local_var;
end:

    // The data type of the elements in quality_components->advertiser_external_id is currently not supported.


    // The data type of the elements in quality_components->click_id_epik is currently not supported.


    // The data type of the elements in quality_components->external_event_id is currently not supported.


    // The data type of the elements in quality_components->hashed_email is currently not supported.


    // The data type of the elements in quality_components->hashed_maid is currently not supported.


    // The data type of the elements in quality_components->ip_address is currently not supported.


    // The data type of the elements in quality_components->order_id is currently not supported.


    // The data type of the elements in quality_components->order_value is currently not supported.


    // The data type of the elements in quality_components->product_id is currently not supported.


    // The data type of the elements in quality_components->source_url is currently not supported.


    // The data type of the elements in quality_components->user_agent is currently not supported.

    return NULL;

}
