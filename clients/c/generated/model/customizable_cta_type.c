#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customizable_cta_type.h"


char* customizable_cta_type_customizable_cta_type_ToString(pinterest_rest_api_customizable_cta_type__e customizable_cta_type) {
    char *customizable_cta_typeArray[] =  { "NULL", "GET_OFFER", "LEARN_MORE", "ORDER_NOW", "SHOP_NOW", "SIGN_UP", "SUBSCRIBE", "BUY_NOW", "CONTACT_US", "GET_QUOTE", "VISIT_SITE", "APPLY_NOW", "BOOK_NOW", "REQUEST_DEMO", "REGISTER_NOW", "FIND_A_DEALER", "ADD_TO_CART", "WATCH_NOW", "READ_MORE", "BUY_TICKETS", "DONATE_NOW", "DOWNLOAD", "EXPLORE_MORE", "FIND_A_LOCATION", "GET_DEAL", "GET_RECIPE", "GET_SHOWTIMES", "ON_SALE", "PLAY_GAME", "TRY_IT", "" };
    return customizable_cta_typeArray[customizable_cta_type];
}

pinterest_rest_api_customizable_cta_type__e customizable_cta_type_customizable_cta_type_FromString(char* customizable_cta_type) {
    int stringToReturn = 0;
    char *customizable_cta_typeArray[] =  { "NULL", "GET_OFFER", "LEARN_MORE", "ORDER_NOW", "SHOP_NOW", "SIGN_UP", "SUBSCRIBE", "BUY_NOW", "CONTACT_US", "GET_QUOTE", "VISIT_SITE", "APPLY_NOW", "BOOK_NOW", "REQUEST_DEMO", "REGISTER_NOW", "FIND_A_DEALER", "ADD_TO_CART", "WATCH_NOW", "READ_MORE", "BUY_TICKETS", "DONATE_NOW", "DOWNLOAD", "EXPLORE_MORE", "FIND_A_LOCATION", "GET_DEAL", "GET_RECIPE", "GET_SHOWTIMES", "ON_SALE", "PLAY_GAME", "TRY_IT", "" };
    size_t sizeofArray = sizeof(customizable_cta_typeArray) / sizeof(customizable_cta_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(customizable_cta_type, customizable_cta_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *customizable_cta_type_convertToJSON(pinterest_rest_api_customizable_cta_type__e customizable_cta_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "customizable_cta_type", customizable_cta_type_customizable_cta_type_ToString(customizable_cta_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_customizable_cta_type__e customizable_cta_type_parseFromJSON(cJSON *customizable_cta_typeJSON) {
    if(!cJSON_IsString(customizable_cta_typeJSON) || (customizable_cta_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return customizable_cta_type_customizable_cta_type_FromString(customizable_cta_typeJSON->valuestring);
}
