#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mmm_report_create.h"


char* mmm_report_create_columns_ToString(pinterest_rest_api_mmm_report_create__e columns) {
    char *columnsArray[] =  { "NULL", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "ECTR", "CAMPAIGN_NAME", "TOTAL_ENGAGEMENT", "EENGAGEMENT_RATE", "ECPM_IN_DOLLAR", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "AD_GROUP_NAME", "CLICKTHROUGH_1", "IMPRESSION_1", "CLICKTHROUGH_2", "IMPRESSION_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "ADVERTISER_NAME", "SPEND_ORDER_LINE_PAID_TYPE", "CAMPAIGN_OBJECTIVE_TYPE", "PINNER_LIST_NAME", "ADS_CREDIT_SPEND_IN_DOLLAR", "ADVERTISER_PAID_SPEND_IN_DOLLAR", "ADVERTISER_PAID_ECPC_IN_DOLLAR", "ADVERTISER_PAID_ECPM_IN_DOLLAR" };
    return columnsArray[columns - 1];
}

pinterest_rest_api_mmm_report_create__e mmm_report_create_columns_FromString(char* columns) {
    int stringToReturn = 0;
    char *columnsArray[] =  { "NULL", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "ECTR", "CAMPAIGN_NAME", "TOTAL_ENGAGEMENT", "EENGAGEMENT_RATE", "ECPM_IN_DOLLAR", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "AD_GROUP_NAME", "CLICKTHROUGH_1", "IMPRESSION_1", "CLICKTHROUGH_2", "IMPRESSION_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "ADVERTISER_NAME", "SPEND_ORDER_LINE_PAID_TYPE", "CAMPAIGN_OBJECTIVE_TYPE", "PINNER_LIST_NAME", "ADS_CREDIT_SPEND_IN_DOLLAR", "ADVERTISER_PAID_SPEND_IN_DOLLAR", "ADVERTISER_PAID_ECPC_IN_DOLLAR", "ADVERTISER_PAID_ECPM_IN_DOLLAR" };
    size_t sizeofArray = sizeof(columnsArray) / sizeof(columnsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(columns, columnsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* mmm_report_create_countries_ToString(pinterest_rest_api_mmm_report_create__e countries) {
    char *countriesArray[] =  { "NULL", "US", "GB", "CA", "IE", "AU", "NZ", "FR", "SE", "IL", "DE", "AT", "IT", "ES", "NL", "BE", "PT", "CH", "HK", "JP", "KR", "SG", "false", "DK", "FI", "CY", "LU", "MT", "PL", "RO", "HU", "CZ", "GR", "SK", "BR", "MX", "AR", "CL", "CO" };
    return countriesArray[countries - 1];
}

pinterest_rest_api_mmm_report_create__e mmm_report_create_countries_FromString(char* countries) {
    int stringToReturn = 0;
    char *countriesArray[] =  { "NULL", "US", "GB", "CA", "IE", "AU", "NZ", "FR", "SE", "IL", "DE", "AT", "IT", "ES", "NL", "BE", "PT", "CH", "HK", "JP", "KR", "SG", "false", "DK", "FI", "CY", "LU", "MT", "PL", "RO", "HU", "CZ", "GR", "SK", "BR", "MX", "AR", "CL", "CO" };
    size_t sizeofArray = sizeof(countriesArray) / sizeof(countriesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(countries, countriesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* mmm_report_create_targeting_types_ToString(pinterest_rest_api_mmm_report_create__e targeting_types) {
    char *targeting_typesArray[] =  { "NULL", "APPTYPE", "COUNTRY", "CREATIVE_TYPE", "GENDER", "LOCATION", "PLACEMENT", "AUDIENCE_INCLUDE" };
    return targeting_typesArray[targeting_types - 1];
}

pinterest_rest_api_mmm_report_create__e mmm_report_create_targeting_types_FromString(char* targeting_types) {
    int stringToReturn = 0;
    char *targeting_typesArray[] =  { "NULL", "APPTYPE", "COUNTRY", "CREATIVE_TYPE", "GENDER", "LOCATION", "PLACEMENT", "AUDIENCE_INCLUDE" };
    size_t sizeofArray = sizeof(targeting_typesArray) / sizeof(targeting_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_types, targeting_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static mmm_report_create_t *mmm_report_create_create_internal(
    list_t *advertiser_ids,
    list_t *columns,
    list_t *countries,
    list_t *custom_column_ids,
    char *end_date,
    mmm_report_granularity_t *granularity,
    mmm_report_level_t *level,
    char *report_name,
    char *start_date,
    list_t *targeting_types
    ) {
    mmm_report_create_t *mmm_report_create_local_var = malloc(sizeof(mmm_report_create_t));
    if (!mmm_report_create_local_var) {
        return NULL;
    }
    memset(mmm_report_create_local_var, 0, sizeof(mmm_report_create_t));
    mmm_report_create_local_var->_library_owned = 1;
    mmm_report_create_local_var->advertiser_ids = advertiser_ids;
    mmm_report_create_local_var->columns = columns;
    mmm_report_create_local_var->countries = countries;
    mmm_report_create_local_var->custom_column_ids = custom_column_ids;
    mmm_report_create_local_var->end_date = end_date;
    mmm_report_create_local_var->granularity = granularity;
    mmm_report_create_local_var->level = level;
    mmm_report_create_local_var->report_name = report_name;
    mmm_report_create_local_var->start_date = start_date;
    mmm_report_create_local_var->targeting_types = targeting_types;
    return mmm_report_create_local_var;
}

__attribute__((deprecated)) mmm_report_create_t *mmm_report_create_create(
    list_t *advertiser_ids,
    list_t *columns,
    list_t *countries,
    list_t *custom_column_ids,
    char *end_date,
    mmm_report_granularity_t *granularity,
    mmm_report_level_t *level,
    char *report_name,
    char *start_date,
    list_t *targeting_types
    ) {
    mmm_report_create_t *result = mmm_report_create_create_internal (
        advertiser_ids,
        columns,
        countries,
        custom_column_ids,
        end_date,
        granularity,
        level,
        report_name,
        start_date,
        targeting_types
        );
    if (!result) {
    }
    return result;
}

void mmm_report_create_free(mmm_report_create_t *mmm_report_create) {
    if(NULL == mmm_report_create){
        return ;
    }
    if(mmm_report_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "mmm_report_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (mmm_report_create->advertiser_ids) {
        list_ForEach(listEntry, mmm_report_create->advertiser_ids) {
            free(listEntry->data);
        }
        list_freeList(mmm_report_create->advertiser_ids);
        mmm_report_create->advertiser_ids = NULL;
    }
    if (mmm_report_create->columns) {
        list_ForEach(listEntry, mmm_report_create->columns) {
            mmm_reporting_column_free(listEntry->data);
        }
        list_freeList(mmm_report_create->columns);
        mmm_report_create->columns = NULL;
    }
    if (mmm_report_create->countries) {
        list_ForEach(listEntry, mmm_report_create->countries) {
            targeting_advertiser_country_free(listEntry->data);
        }
        list_freeList(mmm_report_create->countries);
        mmm_report_create->countries = NULL;
    }
    if (mmm_report_create->custom_column_ids) {
        list_ForEach(listEntry, mmm_report_create->custom_column_ids) {
            free(listEntry->data);
        }
        list_freeList(mmm_report_create->custom_column_ids);
        mmm_report_create->custom_column_ids = NULL;
    }
    if (mmm_report_create->end_date) {
        free(mmm_report_create->end_date);
        mmm_report_create->end_date = NULL;
    }
    if (mmm_report_create->granularity) {
        mmm_report_granularity_free(mmm_report_create->granularity);
        mmm_report_create->granularity = NULL;
    }
    if (mmm_report_create->level) {
        mmm_report_level_free(mmm_report_create->level);
        mmm_report_create->level = NULL;
    }
    if (mmm_report_create->report_name) {
        free(mmm_report_create->report_name);
        mmm_report_create->report_name = NULL;
    }
    if (mmm_report_create->start_date) {
        free(mmm_report_create->start_date);
        mmm_report_create->start_date = NULL;
    }
    if (mmm_report_create->targeting_types) {
        list_ForEach(listEntry, mmm_report_create->targeting_types) {
            mmm_reporting_targeting_type_free(listEntry->data);
        }
        list_freeList(mmm_report_create->targeting_types);
        mmm_report_create->targeting_types = NULL;
    }
    free(mmm_report_create);
}

cJSON *mmm_report_create_convertToJSON(mmm_report_create_t *mmm_report_create) {
    cJSON *item = cJSON_CreateObject();

    // mmm_report_create->advertiser_ids
    if(mmm_report_create->advertiser_ids) {
    cJSON *advertiser_ids = cJSON_AddArrayToObject(item, "advertiser_ids");
    if(advertiser_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *advertiser_idsListEntry;
    list_ForEach(advertiser_idsListEntry, mmm_report_create->advertiser_ids) {
    if(cJSON_AddStringToObject(advertiser_ids, "", advertiser_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // mmm_report_create->columns
    if (pinterest_rest_api_list_COLUMNS_NULL == mmm_report_create->columns) {
        goto fail;
    }
    cJSON *columns = cJSON_AddArrayToObject(item, "columns");
    if(columns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *columnsListEntry;
    if (mmm_report_create->columns) {
    list_ForEach(columnsListEntry, mmm_report_create->columns) {
    cJSON *itemLocal = mmm_reporting_column_convertToJSON((pinterest_rest_api_mmm_report_create__e)columnsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(columns, itemLocal);
    }
    }


    // mmm_report_create->countries
    if(mmm_report_create->countries != pinterest_rest_api_list_COUNTRIES_NULL) {
    cJSON *countries = cJSON_AddArrayToObject(item, "countries");
    if(countries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *countriesListEntry;
    if (mmm_report_create->countries) {
    list_ForEach(countriesListEntry, mmm_report_create->countries) {
    cJSON *itemLocal = targeting_advertiser_country_convertToJSON((pinterest_rest_api_mmm_report_create__e)countriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(countries, itemLocal);
    }
    }
    }


    // mmm_report_create->custom_column_ids
    if(mmm_report_create->custom_column_ids) {
    cJSON *custom_column_ids = cJSON_AddArrayToObject(item, "custom_column_ids");
    if(custom_column_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_column_idsListEntry;
    list_ForEach(custom_column_idsListEntry, mmm_report_create->custom_column_ids) {
    if(cJSON_AddStringToObject(custom_column_ids, "", custom_column_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // mmm_report_create->end_date
    if (!mmm_report_create->end_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "end_date", mmm_report_create->end_date) == NULL) {
    goto fail; //String
    }


    // mmm_report_create->granularity
    if (!mmm_report_create->granularity) {
        goto fail;
    }
    cJSON *granularity_local_JSON = mmm_report_granularity_convertToJSON(mmm_report_create->granularity);
    if(granularity_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "granularity", granularity_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // mmm_report_create->level
    if (!mmm_report_create->level) {
        goto fail;
    }
    cJSON *level_local_JSON = mmm_report_level_convertToJSON(mmm_report_create->level);
    if(level_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "level", level_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // mmm_report_create->report_name
    if (!mmm_report_create->report_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "report_name", mmm_report_create->report_name) == NULL) {
    goto fail; //String
    }


    // mmm_report_create->start_date
    if (!mmm_report_create->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", mmm_report_create->start_date) == NULL) {
    goto fail; //String
    }


    // mmm_report_create->targeting_types
    if (pinterest_rest_api_list_TARGETINGTYPES_NULL == mmm_report_create->targeting_types) {
        goto fail;
    }
    cJSON *targeting_types = cJSON_AddArrayToObject(item, "targeting_types");
    if(targeting_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *targeting_typesListEntry;
    if (mmm_report_create->targeting_types) {
    list_ForEach(targeting_typesListEntry, mmm_report_create->targeting_types) {
    cJSON *itemLocal = mmm_reporting_targeting_type_convertToJSON((pinterest_rest_api_mmm_report_create__e)targeting_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(targeting_types, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

mmm_report_create_t *mmm_report_create_parseFromJSON(cJSON *mmm_report_createJSON){

    mmm_report_create_t *mmm_report_create_local_var = NULL;

    // define the local list for mmm_report_create->advertiser_ids
    list_t *advertiser_idsList = NULL;

    // define the local list for mmm_report_create->columns
    list_t *columnsList = NULL;

    // define the local list for mmm_report_create->countries
    list_t *countriesList = NULL;

    // define the local list for mmm_report_create->custom_column_ids
    list_t *custom_column_idsList = NULL;

    char *end_date_local_str = NULL;

    // define the local variable for mmm_report_create->granularity
    mmm_report_granularity_t *granularity_local_nonprim = NULL;

    // define the local variable for mmm_report_create->level
    mmm_report_level_t *level_local_nonprim = NULL;

    char *report_name_local_str = NULL;

    char *start_date_local_str = NULL;

    // define the local list for mmm_report_create->targeting_types
    list_t *targeting_typesList = NULL;

    // mmm_report_create->advertiser_ids
    cJSON *advertiser_ids = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "advertiser_ids");
    if (cJSON_IsNull(advertiser_ids)) {
        advertiser_ids = NULL;
    }
    if (advertiser_ids) { 
    cJSON *advertiser_ids_local = NULL;
    if(!cJSON_IsArray(advertiser_ids)) {
        goto end;//primitive container
    }
    advertiser_idsList = list_createList();

    cJSON_ArrayForEach(advertiser_ids_local, advertiser_ids)
    {
        if(!cJSON_IsString(advertiser_ids_local))
        {
            goto end;
        }
        list_addElement(advertiser_idsList , strdup(advertiser_ids_local->valuestring));
    }
    }

    // mmm_report_create->columns
    cJSON *columns = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "columns");
    if (cJSON_IsNull(columns)) {
        columns = NULL;
    }
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
        mmm_report_create_mmm_reporting_column_e columnsItem = mmm_reporting_column_parseFromJSON(columns_local_nonprimitive);

        list_addElement(columnsList, (void *)columnsItem);
    }

    // mmm_report_create->countries
    cJSON *countries = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "countries");
    if (cJSON_IsNull(countries)) {
        countries = NULL;
    }
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
        mmm_report_create_targeting_advertiser_country_e countriesItem = targeting_advertiser_country_parseFromJSON(countries_local_nonprimitive);

        list_addElement(countriesList, (void *)countriesItem);
    }
    }

    // mmm_report_create->custom_column_ids
    cJSON *custom_column_ids = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "custom_column_ids");
    if (cJSON_IsNull(custom_column_ids)) {
        custom_column_ids = NULL;
    }
    if (custom_column_ids) { 
    cJSON *custom_column_ids_local = NULL;
    if(!cJSON_IsArray(custom_column_ids)) {
        goto end;//primitive container
    }
    custom_column_idsList = list_createList();

    cJSON_ArrayForEach(custom_column_ids_local, custom_column_ids)
    {
        if(!cJSON_IsString(custom_column_ids_local))
        {
            goto end;
        }
        list_addElement(custom_column_idsList , strdup(custom_column_ids_local->valuestring));
    }
    }

    // mmm_report_create->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (!end_date) {
        goto end;
    }

    
    if(!cJSON_IsString(end_date))
    {
    goto end; //String
    }

    // mmm_report_create->granularity
    cJSON *granularity = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "granularity");
    if (cJSON_IsNull(granularity)) {
        granularity = NULL;
    }
    if (!granularity) {
        goto end;
    }

    
    granularity_local_nonprim = mmm_report_granularity_parseFromJSON(granularity); //custom

    // mmm_report_create->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "level");
    if (cJSON_IsNull(level)) {
        level = NULL;
    }
    if (!level) {
        goto end;
    }

    
    level_local_nonprim = mmm_report_level_parseFromJSON(level); //custom

    // mmm_report_create->report_name
    cJSON *report_name = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "report_name");
    if (cJSON_IsNull(report_name)) {
        report_name = NULL;
    }
    if (!report_name) {
        goto end;
    }

    
    if(!cJSON_IsString(report_name))
    {
    goto end; //String
    }

    // mmm_report_create->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (!start_date) {
        goto end;
    }

    
    if(!cJSON_IsString(start_date))
    {
    goto end; //String
    }

    // mmm_report_create->targeting_types
    cJSON *targeting_types = cJSON_GetObjectItemCaseSensitive(mmm_report_createJSON, "targeting_types");
    if (cJSON_IsNull(targeting_types)) {
        targeting_types = NULL;
    }
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
        mmm_report_create_mmm_reporting_targeting_type_e targeting_typesItem = mmm_reporting_targeting_type_parseFromJSON(targeting_types_local_nonprimitive);

        list_addElement(targeting_typesList, (void *)targeting_typesItem);
    }


    if (end_date && !cJSON_IsNull(end_date)) end_date_local_str = strdup(end_date->valuestring);
    if (report_name && !cJSON_IsNull(report_name)) report_name_local_str = strdup(report_name->valuestring);
    if (start_date && !cJSON_IsNull(start_date)) start_date_local_str = strdup(start_date->valuestring);

    mmm_report_create_local_var = mmm_report_create_create_internal (
        advertiser_ids ? advertiser_idsList : NULL,
        columnsList,
        countries ? countriesList : NULL,
        custom_column_ids ? custom_column_idsList : NULL,
        end_date_local_str,
        granularity_local_nonprim,
        level_local_nonprim,
        report_name_local_str,
        start_date_local_str,
        targeting_typesList
        );

    if (!mmm_report_create_local_var) {
        goto end;
    }

    return mmm_report_create_local_var;
end:
    if (advertiser_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, advertiser_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(advertiser_idsList);
        advertiser_idsList = NULL;
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
    if (custom_column_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_column_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_column_idsList);
        custom_column_idsList = NULL;
    }
    if (end_date_local_str) {
        free(end_date_local_str);
        end_date_local_str = NULL;
    }
    if (granularity_local_nonprim) {
        mmm_report_granularity_free(granularity_local_nonprim);
        granularity_local_nonprim = NULL;
    }
    if (level_local_nonprim) {
        mmm_report_level_free(level_local_nonprim);
        level_local_nonprim = NULL;
    }
    if (report_name_local_str) {
        free(report_name_local_str);
        report_name_local_str = NULL;
    }
    if (start_date_local_str) {
        free(start_date_local_str);
        start_date_local_str = NULL;
    }
    if (targeting_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_typesList) {
            mmm_reporting_targeting_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_typesList);
        targeting_typesList = NULL;
    }
    return NULL;

}
