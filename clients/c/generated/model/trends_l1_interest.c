#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_l1_interest.h"


char* trends_l1_interest_trends_l1_interest_ToString(pinterest_rest_api_trends_l1_interest__e trends_l1_interest) {
    char *trends_l1_interestArray[] =  { "NULL", "animals", "architecture", "art", "beauty", "childrens_fashion", "design", "diy_and_crafts", "education", "electronics", "entertainment", "event_planning", "finance", "food_and_drinks", "gardening", "health", "home_decor", "mens_fashion", "parenting", "quotes", "sport", "travel", "vehicles", "wedding", "womens_fashion" };
    return trends_l1_interestArray[trends_l1_interest];
}

pinterest_rest_api_trends_l1_interest__e trends_l1_interest_trends_l1_interest_FromString(char* trends_l1_interest) {
    int stringToReturn = 0;
    char *trends_l1_interestArray[] =  { "NULL", "animals", "architecture", "art", "beauty", "childrens_fashion", "design", "diy_and_crafts", "education", "electronics", "entertainment", "event_planning", "finance", "food_and_drinks", "gardening", "health", "home_decor", "mens_fashion", "parenting", "quotes", "sport", "travel", "vehicles", "wedding", "womens_fashion" };
    size_t sizeofArray = sizeof(trends_l1_interestArray) / sizeof(trends_l1_interestArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(trends_l1_interest, trends_l1_interestArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *trends_l1_interest_convertToJSON(pinterest_rest_api_trends_l1_interest__e trends_l1_interest) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "trends_l1_interest", trends_l1_interest_trends_l1_interest_ToString(trends_l1_interest)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_trends_l1_interest__e trends_l1_interest_parseFromJSON(cJSON *trends_l1_interestJSON) {
    if(!cJSON_IsString(trends_l1_interestJSON) || (trends_l1_interestJSON->valuestring == NULL)) {
        return 0;
    }
    return trends_l1_interest_trends_l1_interest_FromString(trends_l1_interestJSON->valuestring);
}
