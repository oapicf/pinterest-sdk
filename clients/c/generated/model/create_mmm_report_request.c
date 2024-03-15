#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_mmm_report_request.h"


char* create_mmm_report_request_granularity_ToString(pinterest_rest_api_create_mmm_report_request_GRANULARITY_e granularity) {
    char* granularityArray[] =  { "NULL", "DAY", "WEEK" };
    return granularityArray[granularity];
}

pinterest_rest_api_create_mmm_report_request_GRANULARITY_e create_mmm_report_request_granularity_FromString(char* granularity){
    int stringToReturn = 0;
    char *granularityArray[] =  { "NULL", "DAY", "WEEK" };
    size_t sizeofArray = sizeof(granularityArray) / sizeof(granularityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(granularity, granularityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_mmm_report_request_level_ToString(pinterest_rest_api_create_mmm_report_request_LEVEL_e level) {
    char* levelArray[] =  { "NULL", "CAMPAIGN_TARGETING", "AD_GROUP_TARGETING" };
    return levelArray[level];
}

pinterest_rest_api_create_mmm_report_request_LEVEL_e create_mmm_report_request_level_FromString(char* level){
    int stringToReturn = 0;
    char *levelArray[] =  { "NULL", "CAMPAIGN_TARGETING", "AD_GROUP_TARGETING" };
    size_t sizeofArray = sizeof(levelArray) / sizeof(levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(level, levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_mmm_report_request_targeting_types_ToString(pinterest_rest_api_create_mmm_report_request__e targeting_types) {
    char *targeting_typesArray[] =  { "NULL", "APPTYPE", "COUNTRY", "CREATIVE_TYPE", "GENDER", "LOCATION" };
    return targeting_typesArray[targeting_types - 1];
}

pinterest_rest_api_create_mmm_report_request__e create_mmm_report_request_targeting_types_FromString(char* targeting_types) {
    int stringToReturn = 0;
    char *targeting_typesArray[] =  { "NULL", "APPTYPE", "COUNTRY", "CREATIVE_TYPE", "GENDER", "LOCATION" };
    size_t sizeofArray = sizeof(targeting_typesArray) / sizeof(targeting_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_types, targeting_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_mmm_report_request_columns_ToString(pinterest_rest_api_create_mmm_report_request__e columns) {
    char *columnsArray[] =  { "NULL", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "ECTR", "CAMPAIGN_NAME", "TOTAL_ENGAGEMENT", "EENGAGEMENT_RATE", "ECPM_IN_DOLLAR", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "AD_GROUP_NAME", "CLICKTHROUGH_1", "IMPRESSION_1", "CLICKTHROUGH_2", "IMPRESSION_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "ADVERTISER_NAME", "SPEND_ORDER_LINE_PAID_TYPE" };
    return columnsArray[columns - 1];
}

pinterest_rest_api_create_mmm_report_request__e create_mmm_report_request_columns_FromString(char* columns) {
    int stringToReturn = 0;
    char *columnsArray[] =  { "NULL", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "ECTR", "CAMPAIGN_NAME", "TOTAL_ENGAGEMENT", "EENGAGEMENT_RATE", "ECPM_IN_DOLLAR", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "AD_GROUP_NAME", "CLICKTHROUGH_1", "IMPRESSION_1", "CLICKTHROUGH_2", "IMPRESSION_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "ADVERTISER_NAME", "SPEND_ORDER_LINE_PAID_TYPE" };
    size_t sizeofArray = sizeof(columnsArray) / sizeof(columnsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(columns, columnsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_mmm_report_request_countries_ToString(pinterest_rest_api_create_mmm_report_request__e countries) {
    char *countriesArray[] =  { "NULL", "US", "GB", "CA", "IE", "AU", "NZ", "FR", "SE", "IL", "DE", "AT", "IT", "ES", "NL", "BE", "PT", "CH", "HK", "JP", "KR", "SG", "NO", "DK", "FI", "CY", "LU", "MT", "PL", "RO", "HU", "CZ", "GR", "SK", "BR", "MX", "AR", "CL", "CO" };
    return countriesArray[countries - 1];
}

pinterest_rest_api_create_mmm_report_request__e create_mmm_report_request_countries_FromString(char* countries) {
    int stringToReturn = 0;
    char *countriesArray[] =  { "NULL", "US", "GB", "CA", "IE", "AU", "NZ", "FR", "SE", "IL", "DE", "AT", "IT", "ES", "NL", "BE", "PT", "CH", "HK", "JP", "KR", "SG", "NO", "DK", "FI", "CY", "LU", "MT", "PL", "RO", "HU", "CZ", "GR", "SK", "BR", "MX", "AR", "CL", "CO" };
    size_t sizeofArray = sizeof(countriesArray) / sizeof(countriesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(countries, countriesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

create_mmm_report_request_t *create_mmm_report_request_create(
    char *report_name,
    char *start_date,
    char *end_date,
    pinterest_rest_api_create_mmm_report_request_GRANULARITY_e granularity,
    pinterest_rest_api_create_mmm_report_request_LEVEL_e level,
    list_t *targeting_types,
    list_t *columns,
    list_t *countries
    ) {
    create_mmm_report_request_t *create_mmm_report_request_local_var = malloc(sizeof(create_mmm_report_request_t));
    if (!create_mmm_report_request_local_var) {
        return NULL;
    }
    create_mmm_report_request_local_var->report_name = report_name;
    create_mmm_report_request_local_var->start_date = start_date;
    create_mmm_report_request_local_var->end_date = end_date;
    create_mmm_report_request_local_var->granularity = granularity;
    create_mmm_report_request_local_var->level = level;
    create_mmm_report_request_local_var->targeting_types = targeting_types;
    create_mmm_report_request_local_var->columns = columns;
    create_mmm_report_request_local_var->countries = countries;

    return create_mmm_report_request_local_var;
}


void create_mmm_report_request_free(create_mmm_report_request_t *create_mmm_report_request) {
    if(NULL == create_mmm_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_mmm_report_request->report_name) {
        free(create_mmm_report_request->report_name);
        create_mmm_report_request->report_name = NULL;
    }
    if (create_mmm_report_request->start_date) {
        free(create_mmm_report_request->start_date);
        create_mmm_report_request->start_date = NULL;
    }
    if (create_mmm_report_request->end_date) {
        free(create_mmm_report_request->end_date);
        create_mmm_report_request->end_date = NULL;
    }
    if (create_mmm_report_request->targeting_types) {
        list_ForEach(listEntry, create_mmm_report_request->targeting_types) {
            mmm_reporting_targeting_type_free(listEntry->data);
        }
        list_freeList(create_mmm_report_request->targeting_types);
        create_mmm_report_request->targeting_types = NULL;
    }
    if (create_mmm_report_request->columns) {
        list_ForEach(listEntry, create_mmm_report_request->columns) {
            mmm_reporting_column_free(listEntry->data);
        }
        list_freeList(create_mmm_report_request->columns);
        create_mmm_report_request->columns = NULL;
    }
    if (create_mmm_report_request->countries) {
        list_ForEach(listEntry, create_mmm_report_request->countries) {
            targeting_advertiser_country_free(listEntry->data);
        }
        list_freeList(create_mmm_report_request->countries);
        create_mmm_report_request->countries = NULL;
    }
    free(create_mmm_report_request);
}

cJSON *create_mmm_report_request_convertToJSON(create_mmm_report_request_t *create_mmm_report_request) {
    cJSON *item = cJSON_CreateObject();

    // create_mmm_report_request->report_name
    if (!create_mmm_report_request->report_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "report_name", create_mmm_report_request->report_name) == NULL) {
    goto fail; //String
    }


    // create_mmm_report_request->start_date
    if (!create_mmm_report_request->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", create_mmm_report_request->start_date) == NULL) {
    goto fail; //String
    }


    // create_mmm_report_request->end_date
    if (!create_mmm_report_request->end_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "end_date", create_mmm_report_request->end_date) == NULL) {
    goto fail; //String
    }


    // create_mmm_report_request->granularity
    if (pinterest_rest_api_create_mmm_report_request_GRANULARITY_NULL == create_mmm_report_request->granularity) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "granularity", granularitycreate_mmm_report_request_ToString(create_mmm_report_request->granularity)) == NULL)
    {
    goto fail; //Enum
    }


    // create_mmm_report_request->level
    if (pinterest_rest_api_create_mmm_report_request_LEVEL_NULL == create_mmm_report_request->level) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "level", levelcreate_mmm_report_request_ToString(create_mmm_report_request->level)) == NULL)
    {
    goto fail; //Enum
    }


    // create_mmm_report_request->targeting_types
    if (pinterest_rest_api_create_mmm_report_request_TARGETINGTYPES_NULL == create_mmm_report_request->targeting_types) {
        goto fail;
    }
    cJSON *targeting_types = cJSON_AddArrayToObject(item, "targeting_types");
    if(targeting_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *targeting_typesListEntry;
    if (create_mmm_report_request->targeting_types) {
    list_ForEach(targeting_typesListEntry, create_mmm_report_request->targeting_types) {
    cJSON *itemLocal = mmm_reporting_targeting_type_convertToJSON((pinterest_rest_api_create_mmm_report_request__e)targeting_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(targeting_types, itemLocal);
    }
    }


    // create_mmm_report_request->columns
    if (pinterest_rest_api_create_mmm_report_request_COLUMNS_NULL == create_mmm_report_request->columns) {
        goto fail;
    }
    cJSON *columns = cJSON_AddArrayToObject(item, "columns");
    if(columns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *columnsListEntry;
    if (create_mmm_report_request->columns) {
    list_ForEach(columnsListEntry, create_mmm_report_request->columns) {
    cJSON *itemLocal = mmm_reporting_column_convertToJSON((pinterest_rest_api_create_mmm_report_request__e)columnsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(columns, itemLocal);
    }
    }


    // create_mmm_report_request->countries
    if(create_mmm_report_request->countries != pinterest_rest_api_create_mmm_report_request_COUNTRIES_NULL) {
    cJSON *countries = cJSON_AddArrayToObject(item, "countries");
    if(countries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *countriesListEntry;
    if (create_mmm_report_request->countries) {
    list_ForEach(countriesListEntry, create_mmm_report_request->countries) {
    cJSON *itemLocal = targeting_advertiser_country_convertToJSON((pinterest_rest_api_create_mmm_report_request__e)countriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(countries, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_mmm_report_request_t *create_mmm_report_request_parseFromJSON(cJSON *create_mmm_report_requestJSON){

    create_mmm_report_request_t *create_mmm_report_request_local_var = NULL;

    // define the local list for create_mmm_report_request->targeting_types
    list_t *targeting_typesList = NULL;

    // define the local list for create_mmm_report_request->columns
    list_t *columnsList = NULL;

    // define the local list for create_mmm_report_request->countries
    list_t *countriesList = NULL;

    // create_mmm_report_request->report_name
    cJSON *report_name = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "report_name");
    if (!report_name) {
        goto end;
    }

    
    if(!cJSON_IsString(report_name))
    {
    goto end; //String
    }

    // create_mmm_report_request->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "start_date");
    if (!start_date) {
        goto end;
    }

    
    if(!cJSON_IsString(start_date))
    {
    goto end; //String
    }

    // create_mmm_report_request->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "end_date");
    if (!end_date) {
        goto end;
    }

    
    if(!cJSON_IsString(end_date))
    {
    goto end; //String
    }

    // create_mmm_report_request->granularity
    cJSON *granularity = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "granularity");
    if (!granularity) {
        goto end;
    }

    pinterest_rest_api_create_mmm_report_request_GRANULARITY_e granularityVariable;
    
    if(!cJSON_IsString(granularity))
    {
    goto end; //Enum
    }
    granularityVariable = create_mmm_report_request_granularity_FromString(granularity->valuestring);

    // create_mmm_report_request->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "level");
    if (!level) {
        goto end;
    }

    pinterest_rest_api_create_mmm_report_request_LEVEL_e levelVariable;
    
    if(!cJSON_IsString(level))
    {
    goto end; //Enum
    }
    levelVariable = create_mmm_report_request_level_FromString(level->valuestring);

    // create_mmm_report_request->targeting_types
    cJSON *targeting_types = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "targeting_types");
    if (!targeting_types) {
        goto end;
    }

    
    cJSON *targeting_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(targeting_types)){
        goto end; //nonprimitive container
    }

    targeting_typesList = list_createList();

    cJSON_ArrayForEach(targeting_types_local_nonprimitive,targeting_types )
    {
        if(!cJSON_IsObject(targeting_types_local_nonprimitive)){
            goto end;
        }
        create_mmm_report_request_mmm_reporting_targeting_type_e targeting_typesItem = mmm_reporting_targeting_type_parseFromJSON(targeting_types_local_nonprimitive);

        list_addElement(targeting_typesList, (void *)targeting_typesItem);
    }

    // create_mmm_report_request->columns
    cJSON *columns = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "columns");
    if (!columns) {
        goto end;
    }

    
    cJSON *columns_local_nonprimitive = NULL;
    if(!cJSON_IsArray(columns)){
        goto end; //nonprimitive container
    }

    columnsList = list_createList();

    cJSON_ArrayForEach(columns_local_nonprimitive,columns )
    {
        if(!cJSON_IsObject(columns_local_nonprimitive)){
            goto end;
        }
        create_mmm_report_request_mmm_reporting_column_e columnsItem = mmm_reporting_column_parseFromJSON(columns_local_nonprimitive);

        list_addElement(columnsList, (void *)columnsItem);
    }

    // create_mmm_report_request->countries
    cJSON *countries = cJSON_GetObjectItemCaseSensitive(create_mmm_report_requestJSON, "countries");
    if (countries) { 
    cJSON *countries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(countries)){
        goto end; //nonprimitive container
    }

    countriesList = list_createList();

    cJSON_ArrayForEach(countries_local_nonprimitive,countries )
    {
        if(!cJSON_IsObject(countries_local_nonprimitive)){
            goto end;
        }
        create_mmm_report_request_targeting_advertiser_country_e countriesItem = targeting_advertiser_country_parseFromJSON(countries_local_nonprimitive);

        list_addElement(countriesList, (void *)countriesItem);
    }
    }


    create_mmm_report_request_local_var = create_mmm_report_request_create (
        strdup(report_name->valuestring),
        strdup(start_date->valuestring),
        strdup(end_date->valuestring),
        granularityVariable,
        levelVariable,
        targeting_typesList,
        columnsList,
        countries ? countriesList : NULL
        );

    return create_mmm_report_request_local_var;
end:
    if (targeting_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_typesList) {
            mmm_reporting_targeting_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_typesList);
        targeting_typesList = NULL;
    }
    if (columnsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, columnsList) {
            mmm_reporting_column_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(columnsList);
        columnsList = NULL;
    }
    if (countriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, countriesList) {
            targeting_advertiser_country_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(countriesList);
        countriesList = NULL;
    }
    return NULL;

}
