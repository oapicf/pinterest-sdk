#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_data_party.h"


char* audience_data_party_audience_data_party_ToString(pinterest_rest_api_audience_data_party__e audience_data_party) {
    char *audience_data_partyArray[] =  { "NULL", "1p", "3p" };
    return audience_data_partyArray[audience_data_party];
}

pinterest_rest_api_audience_data_party__e audience_data_party_audience_data_party_FromString(char* audience_data_party) {
    int stringToReturn = 0;
    char *audience_data_partyArray[] =  { "NULL", "1p", "3p" };
    size_t sizeofArray = sizeof(audience_data_partyArray) / sizeof(audience_data_partyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_data_party, audience_data_partyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_data_party_audience_data_party_convertToJSON(pinterest_rest_api_audience_data_party__e audience_data_party) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_data_party", audience_data_party_audience_data_party_ToString(audience_data_party)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_data_party__e audience_data_party_audience_data_party_parseFromJSON(cJSON *audience_data_partyJSON) {
    pinterest_rest_api_audience_data_party__e *audience_data_party = NULL;
    pinterest_rest_api_audience_data_party__e audience_data_partyVariable;
    cJSON *audience_data_partyVar = cJSON_GetObjectItemCaseSensitive(audience_data_partyJSON, "audience_data_party");
    if(!cJSON_IsString(audience_data_partyVar) || (audience_data_partyVar->valuestring == NULL)){
        goto end;
    }
    audience_data_partyVariable = audience_data_party_audience_data_party_FromString(audience_data_partyVar->valuestring);
    return audience_data_partyVariable;
end:
    return 0;
}
