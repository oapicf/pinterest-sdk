#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_updatable_hotel_attributes.h"



catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes_create(
    char *name,
    char *link,
    char *description,
    char *brand,
    double latitude,
    double longitude,
    list_t *neighborhood,
    catalogs_hotel_address_t *address,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *category,
    char *base_price,
    char *sale_price,
    catalogs_hotel_guest_ratings_t *guest_ratings
    ) {
    catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes_local_var = malloc(sizeof(catalogs_updatable_hotel_attributes_t));
    if (!catalogs_updatable_hotel_attributes_local_var) {
        return NULL;
    }
    catalogs_updatable_hotel_attributes_local_var->name = name;
    catalogs_updatable_hotel_attributes_local_var->link = link;
    catalogs_updatable_hotel_attributes_local_var->description = description;
    catalogs_updatable_hotel_attributes_local_var->brand = brand;
    catalogs_updatable_hotel_attributes_local_var->latitude = latitude;
    catalogs_updatable_hotel_attributes_local_var->longitude = longitude;
    catalogs_updatable_hotel_attributes_local_var->neighborhood = neighborhood;
    catalogs_updatable_hotel_attributes_local_var->address = address;
    catalogs_updatable_hotel_attributes_local_var->custom_label_0 = custom_label_0;
    catalogs_updatable_hotel_attributes_local_var->custom_label_1 = custom_label_1;
    catalogs_updatable_hotel_attributes_local_var->custom_label_2 = custom_label_2;
    catalogs_updatable_hotel_attributes_local_var->custom_label_3 = custom_label_3;
    catalogs_updatable_hotel_attributes_local_var->custom_label_4 = custom_label_4;
    catalogs_updatable_hotel_attributes_local_var->category = category;
    catalogs_updatable_hotel_attributes_local_var->base_price = base_price;
    catalogs_updatable_hotel_attributes_local_var->sale_price = sale_price;
    catalogs_updatable_hotel_attributes_local_var->guest_ratings = guest_ratings;

    return catalogs_updatable_hotel_attributes_local_var;
}


void catalogs_updatable_hotel_attributes_free(catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes) {
    if(NULL == catalogs_updatable_hotel_attributes){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_updatable_hotel_attributes->name) {
        free(catalogs_updatable_hotel_attributes->name);
        catalogs_updatable_hotel_attributes->name = NULL;
    }
    if (catalogs_updatable_hotel_attributes->link) {
        free(catalogs_updatable_hotel_attributes->link);
        catalogs_updatable_hotel_attributes->link = NULL;
    }
    if (catalogs_updatable_hotel_attributes->description) {
        free(catalogs_updatable_hotel_attributes->description);
        catalogs_updatable_hotel_attributes->description = NULL;
    }
    if (catalogs_updatable_hotel_attributes->brand) {
        free(catalogs_updatable_hotel_attributes->brand);
        catalogs_updatable_hotel_attributes->brand = NULL;
    }
    if (catalogs_updatable_hotel_attributes->neighborhood) {
        list_ForEach(listEntry, catalogs_updatable_hotel_attributes->neighborhood) {
            free(listEntry->data);
        }
        list_freeList(catalogs_updatable_hotel_attributes->neighborhood);
        catalogs_updatable_hotel_attributes->neighborhood = NULL;
    }
    if (catalogs_updatable_hotel_attributes->address) {
        catalogs_hotel_address_free(catalogs_updatable_hotel_attributes->address);
        catalogs_updatable_hotel_attributes->address = NULL;
    }
    if (catalogs_updatable_hotel_attributes->custom_label_0) {
        free(catalogs_updatable_hotel_attributes->custom_label_0);
        catalogs_updatable_hotel_attributes->custom_label_0 = NULL;
    }
    if (catalogs_updatable_hotel_attributes->custom_label_1) {
        free(catalogs_updatable_hotel_attributes->custom_label_1);
        catalogs_updatable_hotel_attributes->custom_label_1 = NULL;
    }
    if (catalogs_updatable_hotel_attributes->custom_label_2) {
        free(catalogs_updatable_hotel_attributes->custom_label_2);
        catalogs_updatable_hotel_attributes->custom_label_2 = NULL;
    }
    if (catalogs_updatable_hotel_attributes->custom_label_3) {
        free(catalogs_updatable_hotel_attributes->custom_label_3);
        catalogs_updatable_hotel_attributes->custom_label_3 = NULL;
    }
    if (catalogs_updatable_hotel_attributes->custom_label_4) {
        free(catalogs_updatable_hotel_attributes->custom_label_4);
        catalogs_updatable_hotel_attributes->custom_label_4 = NULL;
    }
    if (catalogs_updatable_hotel_attributes->category) {
        free(catalogs_updatable_hotel_attributes->category);
        catalogs_updatable_hotel_attributes->category = NULL;
    }
    if (catalogs_updatable_hotel_attributes->base_price) {
        free(catalogs_updatable_hotel_attributes->base_price);
        catalogs_updatable_hotel_attributes->base_price = NULL;
    }
    if (catalogs_updatable_hotel_attributes->sale_price) {
        free(catalogs_updatable_hotel_attributes->sale_price);
        catalogs_updatable_hotel_attributes->sale_price = NULL;
    }
    if (catalogs_updatable_hotel_attributes->guest_ratings) {
        catalogs_hotel_guest_ratings_free(catalogs_updatable_hotel_attributes->guest_ratings);
        catalogs_updatable_hotel_attributes->guest_ratings = NULL;
    }
    free(catalogs_updatable_hotel_attributes);
}

cJSON *catalogs_updatable_hotel_attributes_convertToJSON(catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_updatable_hotel_attributes->name
    if(catalogs_updatable_hotel_attributes->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_updatable_hotel_attributes->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->link
    if(catalogs_updatable_hotel_attributes->link) {
    if(cJSON_AddStringToObject(item, "link", catalogs_updatable_hotel_attributes->link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->description
    if(catalogs_updatable_hotel_attributes->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_updatable_hotel_attributes->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->brand
    if(catalogs_updatable_hotel_attributes->brand) {
    if(cJSON_AddStringToObject(item, "brand", catalogs_updatable_hotel_attributes->brand) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->latitude
    if(catalogs_updatable_hotel_attributes->latitude) {
    if(cJSON_AddNumberToObject(item, "latitude", catalogs_updatable_hotel_attributes->latitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_updatable_hotel_attributes->longitude
    if(catalogs_updatable_hotel_attributes->longitude) {
    if(cJSON_AddNumberToObject(item, "longitude", catalogs_updatable_hotel_attributes->longitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_updatable_hotel_attributes->neighborhood
    if(catalogs_updatable_hotel_attributes->neighborhood) {
    cJSON *neighborhood = cJSON_AddArrayToObject(item, "neighborhood");
    if(neighborhood == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *neighborhoodListEntry;
    list_ForEach(neighborhoodListEntry, catalogs_updatable_hotel_attributes->neighborhood) {
    if(cJSON_AddStringToObject(neighborhood, "", (char*)neighborhoodListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_updatable_hotel_attributes->address
    if(catalogs_updatable_hotel_attributes->address) {
    cJSON *address_local_JSON = catalogs_hotel_address_convertToJSON(catalogs_updatable_hotel_attributes->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_updatable_hotel_attributes->custom_label_0
    if(catalogs_updatable_hotel_attributes->custom_label_0) {
    if(cJSON_AddStringToObject(item, "custom_label_0", catalogs_updatable_hotel_attributes->custom_label_0) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->custom_label_1
    if(catalogs_updatable_hotel_attributes->custom_label_1) {
    if(cJSON_AddStringToObject(item, "custom_label_1", catalogs_updatable_hotel_attributes->custom_label_1) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->custom_label_2
    if(catalogs_updatable_hotel_attributes->custom_label_2) {
    if(cJSON_AddStringToObject(item, "custom_label_2", catalogs_updatable_hotel_attributes->custom_label_2) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->custom_label_3
    if(catalogs_updatable_hotel_attributes->custom_label_3) {
    if(cJSON_AddStringToObject(item, "custom_label_3", catalogs_updatable_hotel_attributes->custom_label_3) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->custom_label_4
    if(catalogs_updatable_hotel_attributes->custom_label_4) {
    if(cJSON_AddStringToObject(item, "custom_label_4", catalogs_updatable_hotel_attributes->custom_label_4) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->category
    if(catalogs_updatable_hotel_attributes->category) {
    if(cJSON_AddStringToObject(item, "category", catalogs_updatable_hotel_attributes->category) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->base_price
    if(catalogs_updatable_hotel_attributes->base_price) {
    if(cJSON_AddStringToObject(item, "base_price", catalogs_updatable_hotel_attributes->base_price) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->sale_price
    if(catalogs_updatable_hotel_attributes->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", catalogs_updatable_hotel_attributes->sale_price) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_updatable_hotel_attributes->guest_ratings
    if(catalogs_updatable_hotel_attributes->guest_ratings) {
    cJSON *guest_ratings_local_JSON = catalogs_hotel_guest_ratings_convertToJSON(catalogs_updatable_hotel_attributes->guest_ratings);
    if(guest_ratings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "guest_ratings", guest_ratings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes_parseFromJSON(cJSON *catalogs_updatable_hotel_attributesJSON){

    catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes_local_var = NULL;

    // define the local list for catalogs_updatable_hotel_attributes->neighborhood
    list_t *neighborhoodList = NULL;

    // define the local variable for catalogs_updatable_hotel_attributes->address
    catalogs_hotel_address_t *address_local_nonprim = NULL;

    // define the local variable for catalogs_updatable_hotel_attributes->guest_ratings
    catalogs_hotel_guest_ratings_t *guest_ratings_local_nonprim = NULL;

    // catalogs_updatable_hotel_attributes->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "brand");
    if (brand) { 
    if(!cJSON_IsString(brand) && !cJSON_IsNull(brand))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "latitude");
    if (latitude) { 
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }
    }

    // catalogs_updatable_hotel_attributes->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "longitude");
    if (longitude) { 
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }
    }

    // catalogs_updatable_hotel_attributes->neighborhood
    cJSON *neighborhood = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "neighborhood");
    if (neighborhood) { 
    cJSON *neighborhood_local = NULL;
    if(!cJSON_IsArray(neighborhood)) {
        goto end;//primitive container
    }
    neighborhoodList = list_createList();

    cJSON_ArrayForEach(neighborhood_local, neighborhood)
    {
        if(!cJSON_IsString(neighborhood_local))
        {
            goto end;
        }
        list_addElement(neighborhoodList , strdup(neighborhood_local->valuestring));
    }
    }

    // catalogs_updatable_hotel_attributes->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "address");
    if (address) { 
    address_local_nonprim = catalogs_hotel_address_parseFromJSON(address); //nonprimitive
    }

    // catalogs_updatable_hotel_attributes->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "custom_label_0");
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "custom_label_1");
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "custom_label_2");
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "custom_label_3");
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "custom_label_4");
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "category");
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->base_price
    cJSON *base_price = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "base_price");
    if (base_price) { 
    if(!cJSON_IsString(base_price) && !cJSON_IsNull(base_price))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "sale_price");
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }

    // catalogs_updatable_hotel_attributes->guest_ratings
    cJSON *guest_ratings = cJSON_GetObjectItemCaseSensitive(catalogs_updatable_hotel_attributesJSON, "guest_ratings");
    if (guest_ratings) { 
    guest_ratings_local_nonprim = catalogs_hotel_guest_ratings_parseFromJSON(guest_ratings); //nonprimitive
    }


    catalogs_updatable_hotel_attributes_local_var = catalogs_updatable_hotel_attributes_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        brand && !cJSON_IsNull(brand) ? strdup(brand->valuestring) : NULL,
        latitude ? latitude->valuedouble : 0,
        longitude ? longitude->valuedouble : 0,
        neighborhood ? neighborhoodList : NULL,
        address ? address_local_nonprim : NULL,
        custom_label_0 && !cJSON_IsNull(custom_label_0) ? strdup(custom_label_0->valuestring) : NULL,
        custom_label_1 && !cJSON_IsNull(custom_label_1) ? strdup(custom_label_1->valuestring) : NULL,
        custom_label_2 && !cJSON_IsNull(custom_label_2) ? strdup(custom_label_2->valuestring) : NULL,
        custom_label_3 && !cJSON_IsNull(custom_label_3) ? strdup(custom_label_3->valuestring) : NULL,
        custom_label_4 && !cJSON_IsNull(custom_label_4) ? strdup(custom_label_4->valuestring) : NULL,
        category && !cJSON_IsNull(category) ? strdup(category->valuestring) : NULL,
        base_price && !cJSON_IsNull(base_price) ? strdup(base_price->valuestring) : NULL,
        sale_price && !cJSON_IsNull(sale_price) ? strdup(sale_price->valuestring) : NULL,
        guest_ratings ? guest_ratings_local_nonprim : NULL
        );

    return catalogs_updatable_hotel_attributes_local_var;
end:
    if (neighborhoodList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, neighborhoodList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(neighborhoodList);
        neighborhoodList = NULL;
    }
    if (address_local_nonprim) {
        catalogs_hotel_address_free(address_local_nonprim);
        address_local_nonprim = NULL;
    }
    if (guest_ratings_local_nonprim) {
        catalogs_hotel_guest_ratings_free(guest_ratings_local_nonprim);
        guest_ratings_local_nonprim = NULL;
    }
    return NULL;

}
