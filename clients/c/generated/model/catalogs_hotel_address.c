#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_address.h"



catalogs_hotel_address_t *catalogs_hotel_address_create(
    char *addr1,
    char *city,
    char *region,
    char *country,
    char *postal_code
    ) {
    catalogs_hotel_address_t *catalogs_hotel_address_local_var = malloc(sizeof(catalogs_hotel_address_t));
    if (!catalogs_hotel_address_local_var) {
        return NULL;
    }
    catalogs_hotel_address_local_var->addr1 = addr1;
    catalogs_hotel_address_local_var->city = city;
    catalogs_hotel_address_local_var->region = region;
    catalogs_hotel_address_local_var->country = country;
    catalogs_hotel_address_local_var->postal_code = postal_code;

    return catalogs_hotel_address_local_var;
}


void catalogs_hotel_address_free(catalogs_hotel_address_t *catalogs_hotel_address) {
    if(NULL == catalogs_hotel_address){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_address->addr1) {
        free(catalogs_hotel_address->addr1);
        catalogs_hotel_address->addr1 = NULL;
    }
    if (catalogs_hotel_address->city) {
        free(catalogs_hotel_address->city);
        catalogs_hotel_address->city = NULL;
    }
    if (catalogs_hotel_address->region) {
        free(catalogs_hotel_address->region);
        catalogs_hotel_address->region = NULL;
    }
    if (catalogs_hotel_address->country) {
        free(catalogs_hotel_address->country);
        catalogs_hotel_address->country = NULL;
    }
    if (catalogs_hotel_address->postal_code) {
        free(catalogs_hotel_address->postal_code);
        catalogs_hotel_address->postal_code = NULL;
    }
    free(catalogs_hotel_address);
}

cJSON *catalogs_hotel_address_convertToJSON(catalogs_hotel_address_t *catalogs_hotel_address) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_address->addr1
    if(catalogs_hotel_address->addr1) {
    if(cJSON_AddStringToObject(item, "addr1", catalogs_hotel_address->addr1) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_address->city
    if(catalogs_hotel_address->city) {
    if(cJSON_AddStringToObject(item, "city", catalogs_hotel_address->city) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_address->region
    if(catalogs_hotel_address->region) {
    if(cJSON_AddStringToObject(item, "region", catalogs_hotel_address->region) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_address->country
    if(catalogs_hotel_address->country) {
    if(cJSON_AddStringToObject(item, "country", catalogs_hotel_address->country) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_address->postal_code
    if(catalogs_hotel_address->postal_code) {
    if(cJSON_AddStringToObject(item, "postal_code", catalogs_hotel_address->postal_code) == NULL) {
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

catalogs_hotel_address_t *catalogs_hotel_address_parseFromJSON(cJSON *catalogs_hotel_addressJSON){

    catalogs_hotel_address_t *catalogs_hotel_address_local_var = NULL;

    // catalogs_hotel_address->addr1
    cJSON *addr1 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_addressJSON, "addr1");
    if (addr1) { 
    if(!cJSON_IsString(addr1) && !cJSON_IsNull(addr1))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_address->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_addressJSON, "city");
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_address->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_addressJSON, "region");
    if (region) { 
    if(!cJSON_IsString(region) && !cJSON_IsNull(region))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_address->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_addressJSON, "country");
    if (country) { 
    if(!cJSON_IsString(country) && !cJSON_IsNull(country))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_address->postal_code
    cJSON *postal_code = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_addressJSON, "postal_code");
    if (postal_code) { 
    if(!cJSON_IsString(postal_code) && !cJSON_IsNull(postal_code))
    {
    goto end; //String
    }
    }


    catalogs_hotel_address_local_var = catalogs_hotel_address_create (
        addr1 && !cJSON_IsNull(addr1) ? strdup(addr1->valuestring) : NULL,
        city && !cJSON_IsNull(city) ? strdup(city->valuestring) : NULL,
        region && !cJSON_IsNull(region) ? strdup(region->valuestring) : NULL,
        country && !cJSON_IsNull(country) ? strdup(country->valuestring) : NULL,
        postal_code && !cJSON_IsNull(postal_code) ? strdup(postal_code->valuestring) : NULL
        );

    return catalogs_hotel_address_local_var;
end:
    return NULL;

}
