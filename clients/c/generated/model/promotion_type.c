#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotion_type.h"


char* promotion_type_promotion_type_ToString(pinterest_rest_api_promotion_type__e promotion_type) {
    char *promotion_typeArray[] =  { "NULL", "VARIABLE", "SITEWIDE", "CHECKOUT", "SAVE_X_ON_Y", "BUY_X_GET_Y", "SPEND_X_SAVE_Y", "FREE_SHIPPING", "FREE_SHIPPING_MINIMUM", "FREE_SHIPPING_WITH_DISCOUNT", "SITEWIDE_IN_STORES", "EXTRA_PERCENT_OFF", "GIFT_WITH_PURCHASE", "GIFT_WITH_PURCHASE_MINIMUM", "FIXED", "PERCENT_OFF_CLEARANCE", "X_OFF_Y", "GIFT_WITH_FIRST_PURCHASE", "BUY_X_GET_ONE_FREE", "CASH_BACK", "POINTS_ON_ALL_PURCHASES", "BONUS", "POINTS_WITH_PURCHASE", "CUSTOM" };
    return promotion_typeArray[promotion_type];
}

pinterest_rest_api_promotion_type__e promotion_type_promotion_type_FromString(char* promotion_type) {
    int stringToReturn = 0;
    char *promotion_typeArray[] =  { "NULL", "VARIABLE", "SITEWIDE", "CHECKOUT", "SAVE_X_ON_Y", "BUY_X_GET_Y", "SPEND_X_SAVE_Y", "FREE_SHIPPING", "FREE_SHIPPING_MINIMUM", "FREE_SHIPPING_WITH_DISCOUNT", "SITEWIDE_IN_STORES", "EXTRA_PERCENT_OFF", "GIFT_WITH_PURCHASE", "GIFT_WITH_PURCHASE_MINIMUM", "FIXED", "PERCENT_OFF_CLEARANCE", "X_OFF_Y", "GIFT_WITH_FIRST_PURCHASE", "BUY_X_GET_ONE_FREE", "CASH_BACK", "POINTS_ON_ALL_PURCHASES", "BONUS", "POINTS_WITH_PURCHASE", "CUSTOM" };
    size_t sizeofArray = sizeof(promotion_typeArray) / sizeof(promotion_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(promotion_type, promotion_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *promotion_type_convertToJSON(pinterest_rest_api_promotion_type__e promotion_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "promotion_type", promotion_type_promotion_type_ToString(promotion_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_promotion_type__e promotion_type_parseFromJSON(cJSON *promotion_typeJSON) {
    if(!cJSON_IsString(promotion_typeJSON) || (promotion_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return promotion_type_promotion_type_FromString(promotion_typeJSON->valuestring);
}
