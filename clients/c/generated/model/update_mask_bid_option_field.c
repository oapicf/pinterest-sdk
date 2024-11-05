#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_mask_bid_option_field.h"


char* update_mask_bid_option_field_update_mask_bid_option_field_ToString(pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field) {
    char *update_mask_bid_option_fieldArray[] =  { "NULL", "BID", "APP_TYPE_BID_MULTIPLIER_SET", "PLACEMENT_BID_MULTIPLIER_SET" };
    return update_mask_bid_option_fieldArray[update_mask_bid_option_field];
}

pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field_update_mask_bid_option_field_FromString(char* update_mask_bid_option_field) {
    int stringToReturn = 0;
    char *update_mask_bid_option_fieldArray[] =  { "NULL", "BID", "APP_TYPE_BID_MULTIPLIER_SET", "PLACEMENT_BID_MULTIPLIER_SET" };
    size_t sizeofArray = sizeof(update_mask_bid_option_fieldArray) / sizeof(update_mask_bid_option_fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(update_mask_bid_option_field, update_mask_bid_option_fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *update_mask_bid_option_field_update_mask_bid_option_field_convertToJSON(pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "update_mask_bid_option_field", update_mask_bid_option_field_update_mask_bid_option_field_ToString(update_mask_bid_option_field)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field_update_mask_bid_option_field_parseFromJSON(cJSON *update_mask_bid_option_fieldJSON) {
    pinterest_rest_api_update_mask_bid_option_field__e *update_mask_bid_option_field = NULL;
    pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_fieldVariable;
    cJSON *update_mask_bid_option_fieldVar = cJSON_GetObjectItemCaseSensitive(update_mask_bid_option_fieldJSON, "update_mask_bid_option_field");
    if(!cJSON_IsString(update_mask_bid_option_fieldVar) || (update_mask_bid_option_fieldVar->valuestring == NULL)){
        goto end;
    }
    update_mask_bid_option_fieldVariable = update_mask_bid_option_field_update_mask_bid_option_field_FromString(update_mask_bid_option_fieldVar->valuestring);
    return update_mask_bid_option_fieldVariable;
end:
    return 0;
}
