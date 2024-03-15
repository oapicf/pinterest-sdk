#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product_group_filter_keys.h"



catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys_create(
    catalogs_product_group_pricing_currency_criteria_t *price,
    catalogs_product_group_multiple_string_criteria_t *hotel_id,
    catalogs_product_group_multiple_string_criteria_t *brand,
    catalogs_product_group_multiple_string_criteria_t *custom_label_0,
    catalogs_product_group_multiple_string_criteria_t *custom_label_1,
    catalogs_product_group_multiple_string_criteria_t *custom_label_2,
    catalogs_product_group_multiple_string_criteria_t *custom_label_3,
    catalogs_product_group_multiple_string_criteria_t *custom_label_4,
    catalogs_product_group_multiple_countries_criteria_t *country
    ) {
    catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys_local_var = malloc(sizeof(catalogs_hotel_product_group_filter_keys_t));
    if (!catalogs_hotel_product_group_filter_keys_local_var) {
        return NULL;
    }
    catalogs_hotel_product_group_filter_keys_local_var->price = price;
    catalogs_hotel_product_group_filter_keys_local_var->hotel_id = hotel_id;
    catalogs_hotel_product_group_filter_keys_local_var->brand = brand;
    catalogs_hotel_product_group_filter_keys_local_var->custom_label_0 = custom_label_0;
    catalogs_hotel_product_group_filter_keys_local_var->custom_label_1 = custom_label_1;
    catalogs_hotel_product_group_filter_keys_local_var->custom_label_2 = custom_label_2;
    catalogs_hotel_product_group_filter_keys_local_var->custom_label_3 = custom_label_3;
    catalogs_hotel_product_group_filter_keys_local_var->custom_label_4 = custom_label_4;
    catalogs_hotel_product_group_filter_keys_local_var->country = country;

    return catalogs_hotel_product_group_filter_keys_local_var;
}


void catalogs_hotel_product_group_filter_keys_free(catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys) {
    if(NULL == catalogs_hotel_product_group_filter_keys){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_product_group_filter_keys->price) {
        catalogs_product_group_pricing_currency_criteria_free(catalogs_hotel_product_group_filter_keys->price);
        catalogs_hotel_product_group_filter_keys->price = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->hotel_id) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_hotel_product_group_filter_keys->hotel_id);
        catalogs_hotel_product_group_filter_keys->hotel_id = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->brand) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_hotel_product_group_filter_keys->brand);
        catalogs_hotel_product_group_filter_keys->brand = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->custom_label_0) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_hotel_product_group_filter_keys->custom_label_0);
        catalogs_hotel_product_group_filter_keys->custom_label_0 = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->custom_label_1) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_hotel_product_group_filter_keys->custom_label_1);
        catalogs_hotel_product_group_filter_keys->custom_label_1 = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->custom_label_2) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_hotel_product_group_filter_keys->custom_label_2);
        catalogs_hotel_product_group_filter_keys->custom_label_2 = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->custom_label_3) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_hotel_product_group_filter_keys->custom_label_3);
        catalogs_hotel_product_group_filter_keys->custom_label_3 = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->custom_label_4) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_hotel_product_group_filter_keys->custom_label_4);
        catalogs_hotel_product_group_filter_keys->custom_label_4 = NULL;
    }
    if (catalogs_hotel_product_group_filter_keys->country) {
        catalogs_product_group_multiple_countries_criteria_free(catalogs_hotel_product_group_filter_keys->country);
        catalogs_hotel_product_group_filter_keys->country = NULL;
    }
    free(catalogs_hotel_product_group_filter_keys);
}

cJSON *catalogs_hotel_product_group_filter_keys_convertToJSON(catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_product_group_filter_keys->price
    if (!catalogs_hotel_product_group_filter_keys->price) {
        goto fail;
    }
    cJSON *price_local_JSON = catalogs_product_group_pricing_currency_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->price);
    if(price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRICE", price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->hotel_id
    if (!catalogs_hotel_product_group_filter_keys->hotel_id) {
        goto fail;
    }
    cJSON *hotel_id_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->hotel_id);
    if(hotel_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "HOTEL_ID", hotel_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->brand
    if (!catalogs_hotel_product_group_filter_keys->brand) {
        goto fail;
    }
    cJSON *brand_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->brand);
    if(brand_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "BRAND", brand_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->custom_label_0
    if (!catalogs_hotel_product_group_filter_keys->custom_label_0) {
        goto fail;
    }
    cJSON *custom_label_0_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->custom_label_0);
    if(custom_label_0_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_0", custom_label_0_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->custom_label_1
    if (!catalogs_hotel_product_group_filter_keys->custom_label_1) {
        goto fail;
    }
    cJSON *custom_label_1_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->custom_label_1);
    if(custom_label_1_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_1", custom_label_1_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->custom_label_2
    if (!catalogs_hotel_product_group_filter_keys->custom_label_2) {
        goto fail;
    }
    cJSON *custom_label_2_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->custom_label_2);
    if(custom_label_2_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_2", custom_label_2_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->custom_label_3
    if (!catalogs_hotel_product_group_filter_keys->custom_label_3) {
        goto fail;
    }
    cJSON *custom_label_3_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->custom_label_3);
    if(custom_label_3_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_3", custom_label_3_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->custom_label_4
    if (!catalogs_hotel_product_group_filter_keys->custom_label_4) {
        goto fail;
    }
    cJSON *custom_label_4_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->custom_label_4);
    if(custom_label_4_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_4", custom_label_4_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_filter_keys->country
    if (!catalogs_hotel_product_group_filter_keys->country) {
        goto fail;
    }
    cJSON *country_local_JSON = catalogs_product_group_multiple_countries_criteria_convertToJSON(catalogs_hotel_product_group_filter_keys->country);
    if(country_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "COUNTRY", country_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys_parseFromJSON(cJSON *catalogs_hotel_product_group_filter_keysJSON){

    catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys_local_var = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->price
    catalogs_product_group_pricing_currency_criteria_t *price_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->hotel_id
    catalogs_product_group_multiple_string_criteria_t *hotel_id_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->brand
    catalogs_product_group_multiple_string_criteria_t *brand_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->custom_label_0
    catalogs_product_group_multiple_string_criteria_t *custom_label_0_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->custom_label_1
    catalogs_product_group_multiple_string_criteria_t *custom_label_1_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->custom_label_2
    catalogs_product_group_multiple_string_criteria_t *custom_label_2_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->custom_label_3
    catalogs_product_group_multiple_string_criteria_t *custom_label_3_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->custom_label_4
    catalogs_product_group_multiple_string_criteria_t *custom_label_4_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product_group_filter_keys->country
    catalogs_product_group_multiple_countries_criteria_t *country_local_nonprim = NULL;

    // catalogs_hotel_product_group_filter_keys->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "PRICE");
    if (!price) {
        goto end;
    }

    
    price_local_nonprim = catalogs_product_group_pricing_currency_criteria_parseFromJSON(price); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "HOTEL_ID");
    if (!hotel_id) {
        goto end;
    }

    
    hotel_id_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(hotel_id); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "BRAND");
    if (!brand) {
        goto end;
    }

    
    brand_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(brand); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "CUSTOM_LABEL_0");
    if (!custom_label_0) {
        goto end;
    }

    
    custom_label_0_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(custom_label_0); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "CUSTOM_LABEL_1");
    if (!custom_label_1) {
        goto end;
    }

    
    custom_label_1_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(custom_label_1); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "CUSTOM_LABEL_2");
    if (!custom_label_2) {
        goto end;
    }

    
    custom_label_2_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(custom_label_2); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "CUSTOM_LABEL_3");
    if (!custom_label_3) {
        goto end;
    }

    
    custom_label_3_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(custom_label_3); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "CUSTOM_LABEL_4");
    if (!custom_label_4) {
        goto end;
    }

    
    custom_label_4_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(custom_label_4); //nonprimitive

    // catalogs_hotel_product_group_filter_keys->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filter_keysJSON, "COUNTRY");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = catalogs_product_group_multiple_countries_criteria_parseFromJSON(country); //nonprimitive


    catalogs_hotel_product_group_filter_keys_local_var = catalogs_hotel_product_group_filter_keys_create (
        price_local_nonprim,
        hotel_id_local_nonprim,
        brand_local_nonprim,
        custom_label_0_local_nonprim,
        custom_label_1_local_nonprim,
        custom_label_2_local_nonprim,
        custom_label_3_local_nonprim,
        custom_label_4_local_nonprim,
        country_local_nonprim
        );

    return catalogs_hotel_product_group_filter_keys_local_var;
end:
    if (price_local_nonprim) {
        catalogs_product_group_pricing_currency_criteria_free(price_local_nonprim);
        price_local_nonprim = NULL;
    }
    if (hotel_id_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(hotel_id_local_nonprim);
        hotel_id_local_nonprim = NULL;
    }
    if (brand_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(brand_local_nonprim);
        brand_local_nonprim = NULL;
    }
    if (custom_label_0_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(custom_label_0_local_nonprim);
        custom_label_0_local_nonprim = NULL;
    }
    if (custom_label_1_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(custom_label_1_local_nonprim);
        custom_label_1_local_nonprim = NULL;
    }
    if (custom_label_2_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(custom_label_2_local_nonprim);
        custom_label_2_local_nonprim = NULL;
    }
    if (custom_label_3_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(custom_label_3_local_nonprim);
        custom_label_3_local_nonprim = NULL;
    }
    if (custom_label_4_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(custom_label_4_local_nonprim);
        custom_label_4_local_nonprim = NULL;
    }
    if (country_local_nonprim) {
        catalogs_product_group_multiple_countries_criteria_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    return NULL;

}
