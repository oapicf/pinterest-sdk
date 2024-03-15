#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "optimization_goal_metadata_frequency_goal_metadata.h"


char* optimization_goal_metadata_frequency_goal_metadata_timerange_ToString(pinterest_rest_api_optimization_goal_metadata_frequency_goal_metadata_TIMERANGE_e timerange) {
    char* timerangeArray[] =  { "NULL", "THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR" };
    return timerangeArray[timerange];
}

pinterest_rest_api_optimization_goal_metadata_frequency_goal_metadata_TIMERANGE_e optimization_goal_metadata_frequency_goal_metadata_timerange_FromString(char* timerange){
    int stringToReturn = 0;
    char *timerangeArray[] =  { "NULL", "THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR" };
    size_t sizeofArray = sizeof(timerangeArray) / sizeof(timerangeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(timerange, timerangeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

optimization_goal_metadata_frequency_goal_metadata_t *optimization_goal_metadata_frequency_goal_metadata_create(
    int frequency,
    pinterest_rest_api_optimization_goal_metadata_frequency_goal_metadata_TIMERANGE_e timerange
    ) {
    optimization_goal_metadata_frequency_goal_metadata_t *optimization_goal_metadata_frequency_goal_metadata_local_var = malloc(sizeof(optimization_goal_metadata_frequency_goal_metadata_t));
    if (!optimization_goal_metadata_frequency_goal_metadata_local_var) {
        return NULL;
    }
    optimization_goal_metadata_frequency_goal_metadata_local_var->frequency = frequency;
    optimization_goal_metadata_frequency_goal_metadata_local_var->timerange = timerange;

    return optimization_goal_metadata_frequency_goal_metadata_local_var;
}


void optimization_goal_metadata_frequency_goal_metadata_free(optimization_goal_metadata_frequency_goal_metadata_t *optimization_goal_metadata_frequency_goal_metadata) {
    if(NULL == optimization_goal_metadata_frequency_goal_metadata){
        return ;
    }
    listEntry_t *listEntry;
    free(optimization_goal_metadata_frequency_goal_metadata);
}

cJSON *optimization_goal_metadata_frequency_goal_metadata_convertToJSON(optimization_goal_metadata_frequency_goal_metadata_t *optimization_goal_metadata_frequency_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // optimization_goal_metadata_frequency_goal_metadata->frequency
    if(optimization_goal_metadata_frequency_goal_metadata->frequency) {
    if(cJSON_AddNumberToObject(item, "frequency", optimization_goal_metadata_frequency_goal_metadata->frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // optimization_goal_metadata_frequency_goal_metadata->timerange
    if(optimization_goal_metadata_frequency_goal_metadata->timerange != pinterest_rest_api_optimization_goal_metadata_frequency_goal_metadata_TIMERANGE_NULL) {
    if(cJSON_AddStringToObject(item, "timerange", timerangeoptimization_goal_metadata_frequency_goal_metadata_ToString(optimization_goal_metadata_frequency_goal_metadata->timerange)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

optimization_goal_metadata_frequency_goal_metadata_t *optimization_goal_metadata_frequency_goal_metadata_parseFromJSON(cJSON *optimization_goal_metadata_frequency_goal_metadataJSON){

    optimization_goal_metadata_frequency_goal_metadata_t *optimization_goal_metadata_frequency_goal_metadata_local_var = NULL;

    // optimization_goal_metadata_frequency_goal_metadata->frequency
    cJSON *frequency = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_frequency_goal_metadataJSON, "frequency");
    if (frequency) { 
    if(!cJSON_IsNumber(frequency))
    {
    goto end; //Numeric
    }
    }

    // optimization_goal_metadata_frequency_goal_metadata->timerange
    cJSON *timerange = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_frequency_goal_metadataJSON, "timerange");
    pinterest_rest_api_optimization_goal_metadata_frequency_goal_metadata_TIMERANGE_e timerangeVariable;
    if (timerange) { 
    if(!cJSON_IsString(timerange))
    {
    goto end; //Enum
    }
    timerangeVariable = optimization_goal_metadata_frequency_goal_metadata_timerange_FromString(timerange->valuestring);
    }


    optimization_goal_metadata_frequency_goal_metadata_local_var = optimization_goal_metadata_frequency_goal_metadata_create (
        frequency ? frequency->valuedouble : 0,
        timerange ? timerangeVariable : pinterest_rest_api_optimization_goal_metadata_frequency_goal_metadata_TIMERANGE_NULL
        );

    return optimization_goal_metadata_frequency_goal_metadata_local_var;
end:
    return NULL;

}
