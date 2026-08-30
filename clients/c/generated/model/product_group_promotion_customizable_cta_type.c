#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotion_customizable_cta_type.h"


char* product_group_promotion_customizable_cta_type_product_group_promotion_customizable_cta_type_ToString(pinterest_rest_api_product_group_promotion_customizable_cta_type__e product_group_promotion_customizable_cta_type) {
    char *product_group_promotion_customizable_cta_typeArray[] =  { "NULL", "GET_OFFER", "LEARN_MORE", "ORDER_NOW", "SHOP_NOW", "SIGN_UP", "SUBSCRIBE", "BUY_NOW", "CONTACT_US", "GET_QUOTE", "VISIT_SITE", "APPLY_NOW", "BOOK_NOW", "REGISTER_NOW", "FIND_A_DEALER", "WATCH_NOW", "READ_MORE", "BUY_TICKETS", "DONATE_NOW", "DOWNLOAD", "EXPLORE_MORE", "FIND_A_LOCATION", "GET_DEAL", "GET_RECIPE", "GET_SHOWTIMES", "ON_SALE", "PLAY_GAME", "TRY_IT", "BUY_ONLINE_PICKUP_IN_STORE", "SHOP_ON_ADVERTISER", "SHOP_THE_COLLECTION", "GET_IT_NOW", "TAKE_A_PEEK", "TAKE_A_CLOSER_LOOK" };
    return product_group_promotion_customizable_cta_typeArray[product_group_promotion_customizable_cta_type];
}

pinterest_rest_api_product_group_promotion_customizable_cta_type__e product_group_promotion_customizable_cta_type_product_group_promotion_customizable_cta_type_FromString(char* product_group_promotion_customizable_cta_type) {
    int stringToReturn = 0;
    char *product_group_promotion_customizable_cta_typeArray[] =  { "NULL", "GET_OFFER", "LEARN_MORE", "ORDER_NOW", "SHOP_NOW", "SIGN_UP", "SUBSCRIBE", "BUY_NOW", "CONTACT_US", "GET_QUOTE", "VISIT_SITE", "APPLY_NOW", "BOOK_NOW", "REGISTER_NOW", "FIND_A_DEALER", "WATCH_NOW", "READ_MORE", "BUY_TICKETS", "DONATE_NOW", "DOWNLOAD", "EXPLORE_MORE", "FIND_A_LOCATION", "GET_DEAL", "GET_RECIPE", "GET_SHOWTIMES", "ON_SALE", "PLAY_GAME", "TRY_IT", "BUY_ONLINE_PICKUP_IN_STORE", "SHOP_ON_ADVERTISER", "SHOP_THE_COLLECTION", "GET_IT_NOW", "TAKE_A_PEEK", "TAKE_A_CLOSER_LOOK" };
    size_t sizeofArray = sizeof(product_group_promotion_customizable_cta_typeArray) / sizeof(product_group_promotion_customizable_cta_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_group_promotion_customizable_cta_type, product_group_promotion_customizable_cta_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_group_promotion_customizable_cta_type_convertToJSON(pinterest_rest_api_product_group_promotion_customizable_cta_type__e product_group_promotion_customizable_cta_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "product_group_promotion_customizable_cta_type", product_group_promotion_customizable_cta_type_product_group_promotion_customizable_cta_type_ToString(product_group_promotion_customizable_cta_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_group_promotion_customizable_cta_type__e product_group_promotion_customizable_cta_type_parseFromJSON(cJSON *product_group_promotion_customizable_cta_typeJSON) {
    if(!cJSON_IsString(product_group_promotion_customizable_cta_typeJSON) || (product_group_promotion_customizable_cta_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return product_group_promotion_customizable_cta_type_product_group_promotion_customizable_cta_type_FromString(product_group_promotion_customizable_cta_typeJSON->valuestring);
}
