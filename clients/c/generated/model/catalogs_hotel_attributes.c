#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_attributes.h"



static catalogs_hotel_attributes_t *catalogs_hotel_attributes_create_internal(
    catalogs_hotel_address_t *address,
    char *base_price,
    char *brand,
    char *category,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *description,
    catalogs_hotel_guest_ratings_t *guest_ratings,
    double *latitude,
    char *link,
    double *longitude,
    char *name,
    list_t *neighborhood,
    char *sale_price,
    list_t *additional_image_link,
    list_t *ai_disclosures,
    catalogs_hotel_main_image_t *main_image
    ) {
    catalogs_hotel_attributes_t *catalogs_hotel_attributes_local_var = malloc(sizeof(catalogs_hotel_attributes_t));
    if (!catalogs_hotel_attributes_local_var) {
        return NULL;
    }
    memset(catalogs_hotel_attributes_local_var, 0, sizeof(catalogs_hotel_attributes_t));
    catalogs_hotel_attributes_local_var->_library_owned = 1;
    catalogs_hotel_attributes_local_var->address = address;
    catalogs_hotel_attributes_local_var->base_price = base_price;
    catalogs_hotel_attributes_local_var->brand = brand;
    catalogs_hotel_attributes_local_var->category = category;
    catalogs_hotel_attributes_local_var->custom_label_0 = custom_label_0;
    catalogs_hotel_attributes_local_var->custom_label_1 = custom_label_1;
    catalogs_hotel_attributes_local_var->custom_label_2 = custom_label_2;
    catalogs_hotel_attributes_local_var->custom_label_3 = custom_label_3;
    catalogs_hotel_attributes_local_var->custom_label_4 = custom_label_4;
    catalogs_hotel_attributes_local_var->description = description;
    catalogs_hotel_attributes_local_var->guest_ratings = guest_ratings;
    catalogs_hotel_attributes_local_var->latitude = latitude;
    catalogs_hotel_attributes_local_var->link = link;
    catalogs_hotel_attributes_local_var->longitude = longitude;
    catalogs_hotel_attributes_local_var->name = name;
    catalogs_hotel_attributes_local_var->neighborhood = neighborhood;
    catalogs_hotel_attributes_local_var->sale_price = sale_price;
    catalogs_hotel_attributes_local_var->additional_image_link = additional_image_link;
    catalogs_hotel_attributes_local_var->ai_disclosures = ai_disclosures;
    catalogs_hotel_attributes_local_var->main_image = main_image;
    return catalogs_hotel_attributes_local_var;
}

__attribute__((deprecated)) catalogs_hotel_attributes_t *catalogs_hotel_attributes_create(
    catalogs_hotel_address_t *address,
    char *base_price,
    char *brand,
    char *category,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *description,
    catalogs_hotel_guest_ratings_t *guest_ratings,
    double *latitude,
    char *link,
    double *longitude,
    char *name,
    list_t *neighborhood,
    char *sale_price,
    list_t *additional_image_link,
    list_t *ai_disclosures,
    catalogs_hotel_main_image_t *main_image
    ) {
    double *latitude_copy = NULL;
    if (latitude) {
        latitude_copy = malloc(sizeof(double));
        if (latitude_copy) *latitude_copy = *latitude;
    }
    double *longitude_copy = NULL;
    if (longitude) {
        longitude_copy = malloc(sizeof(double));
        if (longitude_copy) *longitude_copy = *longitude;
    }
    catalogs_hotel_attributes_t *result = catalogs_hotel_attributes_create_internal (
        address,
        base_price,
        brand,
        category,
        custom_label_0,
        custom_label_1,
        custom_label_2,
        custom_label_3,
        custom_label_4,
        description,
        guest_ratings,
        latitude_copy,
        link,
        longitude_copy,
        name,
        neighborhood,
        sale_price,
        additional_image_link,
        ai_disclosures,
        main_image
        );
    if (!result) {
        free(latitude_copy);
        free(longitude_copy);
    }
    return result;
}

void catalogs_hotel_attributes_free(catalogs_hotel_attributes_t *catalogs_hotel_attributes) {
    if(NULL == catalogs_hotel_attributes){
        return ;
    }
    if(catalogs_hotel_attributes->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_attributes_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_attributes->address) {
        catalogs_hotel_address_free(catalogs_hotel_attributes->address);
        catalogs_hotel_attributes->address = NULL;
    }
    if (catalogs_hotel_attributes->base_price) {
        free(catalogs_hotel_attributes->base_price);
        catalogs_hotel_attributes->base_price = NULL;
    }
    if (catalogs_hotel_attributes->brand) {
        free(catalogs_hotel_attributes->brand);
        catalogs_hotel_attributes->brand = NULL;
    }
    if (catalogs_hotel_attributes->category) {
        free(catalogs_hotel_attributes->category);
        catalogs_hotel_attributes->category = NULL;
    }
    if (catalogs_hotel_attributes->custom_label_0) {
        free(catalogs_hotel_attributes->custom_label_0);
        catalogs_hotel_attributes->custom_label_0 = NULL;
    }
    if (catalogs_hotel_attributes->custom_label_1) {
        free(catalogs_hotel_attributes->custom_label_1);
        catalogs_hotel_attributes->custom_label_1 = NULL;
    }
    if (catalogs_hotel_attributes->custom_label_2) {
        free(catalogs_hotel_attributes->custom_label_2);
        catalogs_hotel_attributes->custom_label_2 = NULL;
    }
    if (catalogs_hotel_attributes->custom_label_3) {
        free(catalogs_hotel_attributes->custom_label_3);
        catalogs_hotel_attributes->custom_label_3 = NULL;
    }
    if (catalogs_hotel_attributes->custom_label_4) {
        free(catalogs_hotel_attributes->custom_label_4);
        catalogs_hotel_attributes->custom_label_4 = NULL;
    }
    if (catalogs_hotel_attributes->description) {
        free(catalogs_hotel_attributes->description);
        catalogs_hotel_attributes->description = NULL;
    }
    if (catalogs_hotel_attributes->guest_ratings) {
        catalogs_hotel_guest_ratings_free(catalogs_hotel_attributes->guest_ratings);
        catalogs_hotel_attributes->guest_ratings = NULL;
    }
    if (catalogs_hotel_attributes->latitude) {
        free(catalogs_hotel_attributes->latitude);
        catalogs_hotel_attributes->latitude = NULL;
    }
    if (catalogs_hotel_attributes->link) {
        free(catalogs_hotel_attributes->link);
        catalogs_hotel_attributes->link = NULL;
    }
    if (catalogs_hotel_attributes->longitude) {
        free(catalogs_hotel_attributes->longitude);
        catalogs_hotel_attributes->longitude = NULL;
    }
    if (catalogs_hotel_attributes->name) {
        free(catalogs_hotel_attributes->name);
        catalogs_hotel_attributes->name = NULL;
    }
    if (catalogs_hotel_attributes->neighborhood) {
        list_ForEach(listEntry, catalogs_hotel_attributes->neighborhood) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_attributes->neighborhood);
        catalogs_hotel_attributes->neighborhood = NULL;
    }
    if (catalogs_hotel_attributes->sale_price) {
        free(catalogs_hotel_attributes->sale_price);
        catalogs_hotel_attributes->sale_price = NULL;
    }
    if (catalogs_hotel_attributes->additional_image_link) {
        list_ForEach(listEntry, catalogs_hotel_attributes->additional_image_link) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_attributes->additional_image_link);
        catalogs_hotel_attributes->additional_image_link = NULL;
    }
    if (catalogs_hotel_attributes->ai_disclosures) {
        list_ForEach(listEntry, catalogs_hotel_attributes->ai_disclosures) {
            catalogs_ai_content_disclosure_free(listEntry->data);
        }
        list_freeList(catalogs_hotel_attributes->ai_disclosures);
        catalogs_hotel_attributes->ai_disclosures = NULL;
    }
    if (catalogs_hotel_attributes->main_image) {
        catalogs_hotel_main_image_free(catalogs_hotel_attributes->main_image);
        catalogs_hotel_attributes->main_image = NULL;
    }
    free(catalogs_hotel_attributes);
}

cJSON *catalogs_hotel_attributes_convertToJSON(catalogs_hotel_attributes_t *catalogs_hotel_attributes) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_attributes->address
    if(catalogs_hotel_attributes->address) {
    cJSON *address_local_JSON = catalogs_hotel_address_convertToJSON(catalogs_hotel_attributes->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_hotel_attributes->base_price
    if(catalogs_hotel_attributes->base_price) {
    if(cJSON_AddStringToObject(item, "base_price", catalogs_hotel_attributes->base_price) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->brand
    if(catalogs_hotel_attributes->brand) {
    if(cJSON_AddStringToObject(item, "brand", catalogs_hotel_attributes->brand) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->category
    if(catalogs_hotel_attributes->category) {
    if(cJSON_AddStringToObject(item, "category", catalogs_hotel_attributes->category) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->custom_label_0
    if(catalogs_hotel_attributes->custom_label_0) {
    if(cJSON_AddStringToObject(item, "custom_label_0", catalogs_hotel_attributes->custom_label_0) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->custom_label_1
    if(catalogs_hotel_attributes->custom_label_1) {
    if(cJSON_AddStringToObject(item, "custom_label_1", catalogs_hotel_attributes->custom_label_1) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->custom_label_2
    if(catalogs_hotel_attributes->custom_label_2) {
    if(cJSON_AddStringToObject(item, "custom_label_2", catalogs_hotel_attributes->custom_label_2) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->custom_label_3
    if(catalogs_hotel_attributes->custom_label_3) {
    if(cJSON_AddStringToObject(item, "custom_label_3", catalogs_hotel_attributes->custom_label_3) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->custom_label_4
    if(catalogs_hotel_attributes->custom_label_4) {
    if(cJSON_AddStringToObject(item, "custom_label_4", catalogs_hotel_attributes->custom_label_4) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->description
    if(catalogs_hotel_attributes->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_hotel_attributes->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->guest_ratings
    if(catalogs_hotel_attributes->guest_ratings) {
    cJSON *guest_ratings_local_JSON = catalogs_hotel_guest_ratings_convertToJSON(catalogs_hotel_attributes->guest_ratings);
    if(guest_ratings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "guest_ratings", guest_ratings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_hotel_attributes->latitude
    if(catalogs_hotel_attributes->latitude) {
    if(cJSON_AddNumberToObject(item, "latitude", *catalogs_hotel_attributes->latitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_attributes->link
    if(catalogs_hotel_attributes->link) {
    if(cJSON_AddStringToObject(item, "link", catalogs_hotel_attributes->link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->longitude
    if(catalogs_hotel_attributes->longitude) {
    if(cJSON_AddNumberToObject(item, "longitude", *catalogs_hotel_attributes->longitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_attributes->name
    if(catalogs_hotel_attributes->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_hotel_attributes->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->neighborhood
    if(catalogs_hotel_attributes->neighborhood) {
    cJSON *neighborhood = cJSON_AddArrayToObject(item, "neighborhood");
    if(neighborhood == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *neighborhoodListEntry;
    list_ForEach(neighborhoodListEntry, catalogs_hotel_attributes->neighborhood) {
    if(cJSON_AddStringToObject(neighborhood, "", neighborhoodListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_hotel_attributes->sale_price
    if(catalogs_hotel_attributes->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", catalogs_hotel_attributes->sale_price) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes->additional_image_link
    if(catalogs_hotel_attributes->additional_image_link) {
    cJSON *additional_image_link = cJSON_AddArrayToObject(item, "additional_image_link");
    if(additional_image_link == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *additional_image_linkListEntry;
    list_ForEach(additional_image_linkListEntry, catalogs_hotel_attributes->additional_image_link) {
    if(cJSON_AddStringToObject(additional_image_link, "", additional_image_linkListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_hotel_attributes->ai_disclosures
    if(catalogs_hotel_attributes->ai_disclosures) {
    cJSON *ai_disclosures = cJSON_AddArrayToObject(item, "ai_disclosures");
    if(ai_disclosures == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ai_disclosuresListEntry;
    if (catalogs_hotel_attributes->ai_disclosures) {
    list_ForEach(ai_disclosuresListEntry, catalogs_hotel_attributes->ai_disclosures) {
    cJSON *itemLocal = catalogs_ai_content_disclosure_convertToJSON(ai_disclosuresListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ai_disclosures, itemLocal);
    }
    }
    }


    // catalogs_hotel_attributes->main_image
    if(catalogs_hotel_attributes->main_image) {
    cJSON *main_image_local_JSON = catalogs_hotel_main_image_convertToJSON(catalogs_hotel_attributes->main_image);
    if(main_image_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "main_image", main_image_local_JSON);
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

catalogs_hotel_attributes_t *catalogs_hotel_attributes_parseFromJSON(cJSON *catalogs_hotel_attributesJSON){

    catalogs_hotel_attributes_t *catalogs_hotel_attributes_local_var = NULL;

    // define the local variable for catalogs_hotel_attributes->address
    catalogs_hotel_address_t *address_local_nonprim = NULL;

    char *base_price_local_str = NULL;

    char *brand_local_str = NULL;

    char *category_local_str = NULL;

    char *custom_label_0_local_str = NULL;

    char *custom_label_1_local_str = NULL;

    char *custom_label_2_local_str = NULL;

    char *custom_label_3_local_str = NULL;

    char *custom_label_4_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for catalogs_hotel_attributes->guest_ratings
    catalogs_hotel_guest_ratings_t *guest_ratings_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_attributes->latitude
    double *latitude_local_var = NULL;

    char *link_local_str = NULL;

    // define the local variable for catalogs_hotel_attributes->longitude
    double *longitude_local_var = NULL;

    char *name_local_str = NULL;

    // define the local list for catalogs_hotel_attributes->neighborhood
    list_t *neighborhoodList = NULL;

    char *sale_price_local_str = NULL;

    // define the local list for catalogs_hotel_attributes->additional_image_link
    list_t *additional_image_linkList = NULL;

    // define the local list for catalogs_hotel_attributes->ai_disclosures
    list_t *ai_disclosuresList = NULL;

    // define the local variable for catalogs_hotel_attributes->main_image
    catalogs_hotel_main_image_t *main_image_local_nonprim = NULL;

    // catalogs_hotel_attributes->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "address");
    if (cJSON_IsNull(address)) {
        address = NULL;
    }
    if (address) { 
    address_local_nonprim = catalogs_hotel_address_parseFromJSON(address); //nonprimitive
    }

    // catalogs_hotel_attributes->base_price
    cJSON *base_price = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "base_price");
    if (cJSON_IsNull(base_price)) {
        base_price = NULL;
    }
    if (base_price) { 
    if(!cJSON_IsString(base_price) && !cJSON_IsNull(base_price))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "brand");
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (brand) { 
    if(!cJSON_IsString(brand) && !cJSON_IsNull(brand))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "category");
    if (cJSON_IsNull(category)) {
        category = NULL;
    }
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "custom_label_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "custom_label_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "custom_label_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "custom_label_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "custom_label_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->guest_ratings
    cJSON *guest_ratings = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "guest_ratings");
    if (cJSON_IsNull(guest_ratings)) {
        guest_ratings = NULL;
    }
    if (guest_ratings) { 
    guest_ratings_local_nonprim = catalogs_hotel_guest_ratings_parseFromJSON(guest_ratings); //nonprimitive
    }

    // catalogs_hotel_attributes->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "latitude");
    if (cJSON_IsNull(latitude)) {
        latitude = NULL;
    }
    if (latitude) { 
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }
    latitude_local_var = malloc(sizeof(double));
    if(!latitude_local_var)
    {
        goto end;
    }
    *latitude_local_var = latitude->valuedouble;
    }

    // catalogs_hotel_attributes->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "longitude");
    if (cJSON_IsNull(longitude)) {
        longitude = NULL;
    }
    if (longitude) { 
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }
    longitude_local_var = malloc(sizeof(double));
    if(!longitude_local_var)
    {
        goto end;
    }
    *longitude_local_var = longitude->valuedouble;
    }

    // catalogs_hotel_attributes->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->neighborhood
    cJSON *neighborhood = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "neighborhood");
    if (cJSON_IsNull(neighborhood)) {
        neighborhood = NULL;
    }
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

    // catalogs_hotel_attributes->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "sale_price");
    if (cJSON_IsNull(sale_price)) {
        sale_price = NULL;
    }
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes->additional_image_link
    cJSON *additional_image_link = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "additional_image_link");
    if (cJSON_IsNull(additional_image_link)) {
        additional_image_link = NULL;
    }
    if (additional_image_link) { 
    cJSON *additional_image_link_local = NULL;
    if(!cJSON_IsArray(additional_image_link)) {
        goto end;//primitive container
    }
    additional_image_linkList = list_createList();

    cJSON_ArrayForEach(additional_image_link_local, additional_image_link)
    {
        if(!cJSON_IsString(additional_image_link_local))
        {
            goto end;
        }
        list_addElement(additional_image_linkList , strdup(additional_image_link_local->valuestring));
    }
    }

    // catalogs_hotel_attributes->ai_disclosures
    cJSON *ai_disclosures = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "ai_disclosures");
    if (cJSON_IsNull(ai_disclosures)) {
        ai_disclosures = NULL;
    }
    if (ai_disclosures) { 
    cJSON *ai_disclosures_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ai_disclosures)){
        goto end; //nonprimitive container
    }

    ai_disclosuresList = list_createList();

    cJSON_ArrayForEach(ai_disclosures_local_nonprimitive,ai_disclosures )
    {
        if(!cJSON_IsObject(ai_disclosures_local_nonprimitive)){
            goto end;
        }
        catalogs_ai_content_disclosure_t *ai_disclosuresItem = catalogs_ai_content_disclosure_parseFromJSON(ai_disclosures_local_nonprimitive);

        list_addElement(ai_disclosuresList, ai_disclosuresItem);
    }
    }

    // catalogs_hotel_attributes->main_image
    cJSON *main_image = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributesJSON, "main_image");
    if (cJSON_IsNull(main_image)) {
        main_image = NULL;
    }
    if (main_image) { 
    main_image_local_nonprim = catalogs_hotel_main_image_parseFromJSON(main_image); //nonprimitive
    }


    if (base_price && !cJSON_IsNull(base_price)) base_price_local_str = strdup(base_price->valuestring);
    if (brand && !cJSON_IsNull(brand)) brand_local_str = strdup(brand->valuestring);
    if (category && !cJSON_IsNull(category)) category_local_str = strdup(category->valuestring);
    if (custom_label_0 && !cJSON_IsNull(custom_label_0)) custom_label_0_local_str = strdup(custom_label_0->valuestring);
    if (custom_label_1 && !cJSON_IsNull(custom_label_1)) custom_label_1_local_str = strdup(custom_label_1->valuestring);
    if (custom_label_2 && !cJSON_IsNull(custom_label_2)) custom_label_2_local_str = strdup(custom_label_2->valuestring);
    if (custom_label_3 && !cJSON_IsNull(custom_label_3)) custom_label_3_local_str = strdup(custom_label_3->valuestring);
    if (custom_label_4 && !cJSON_IsNull(custom_label_4)) custom_label_4_local_str = strdup(custom_label_4->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (sale_price && !cJSON_IsNull(sale_price)) sale_price_local_str = strdup(sale_price->valuestring);

    catalogs_hotel_attributes_local_var = catalogs_hotel_attributes_create_internal (
        address ? address_local_nonprim : NULL,
        base_price_local_str,
        brand_local_str,
        category_local_str,
        custom_label_0_local_str,
        custom_label_1_local_str,
        custom_label_2_local_str,
        custom_label_3_local_str,
        custom_label_4_local_str,
        description_local_str,
        guest_ratings ? guest_ratings_local_nonprim : NULL,
        latitude_local_var,
        link_local_str,
        longitude_local_var,
        name_local_str,
        neighborhood ? neighborhoodList : NULL,
        sale_price_local_str,
        additional_image_link ? additional_image_linkList : NULL,
        ai_disclosures ? ai_disclosuresList : NULL,
        main_image ? main_image_local_nonprim : NULL
        );

    if (!catalogs_hotel_attributes_local_var) {
        goto end;
    }

    return catalogs_hotel_attributes_local_var;
end:
    if (address_local_nonprim) {
        catalogs_hotel_address_free(address_local_nonprim);
        address_local_nonprim = NULL;
    }
    if (base_price_local_str) {
        free(base_price_local_str);
        base_price_local_str = NULL;
    }
    if (brand_local_str) {
        free(brand_local_str);
        brand_local_str = NULL;
    }
    if (category_local_str) {
        free(category_local_str);
        category_local_str = NULL;
    }
    if (custom_label_0_local_str) {
        free(custom_label_0_local_str);
        custom_label_0_local_str = NULL;
    }
    if (custom_label_1_local_str) {
        free(custom_label_1_local_str);
        custom_label_1_local_str = NULL;
    }
    if (custom_label_2_local_str) {
        free(custom_label_2_local_str);
        custom_label_2_local_str = NULL;
    }
    if (custom_label_3_local_str) {
        free(custom_label_3_local_str);
        custom_label_3_local_str = NULL;
    }
    if (custom_label_4_local_str) {
        free(custom_label_4_local_str);
        custom_label_4_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (guest_ratings_local_nonprim) {
        catalogs_hotel_guest_ratings_free(guest_ratings_local_nonprim);
        guest_ratings_local_nonprim = NULL;
    }
    if (latitude_local_var) {
        free(latitude_local_var);
        latitude_local_var = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (longitude_local_var) {
        free(longitude_local_var);
        longitude_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (neighborhoodList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, neighborhoodList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(neighborhoodList);
        neighborhoodList = NULL;
    }
    if (sale_price_local_str) {
        free(sale_price_local_str);
        sale_price_local_str = NULL;
    }
    if (additional_image_linkList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, additional_image_linkList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(additional_image_linkList);
        additional_image_linkList = NULL;
    }
    if (ai_disclosuresList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ai_disclosuresList) {
            catalogs_ai_content_disclosure_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ai_disclosuresList);
        ai_disclosuresList = NULL;
    }
    if (main_image_local_nonprim) {
        catalogs_hotel_main_image_free(main_image_local_nonprim);
        main_image_local_nonprim = NULL;
    }
    return NULL;

}
