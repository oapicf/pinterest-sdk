#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_floor_spec.h"


char* bid_floor_spec_countries_ToString(pinterest_rest_api_bid_floor_spec__e countries) {
    char *countriesArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countriesArray[countries - 1];
}

pinterest_rest_api_bid_floor_spec__e bid_floor_spec_countries_FromString(char* countries) {
    int stringToReturn = 0;
    char *countriesArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    size_t sizeofArray = sizeof(countriesArray) / sizeof(countriesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(countries, countriesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static bid_floor_spec_t *bid_floor_spec_create_internal(
    list_t *countries,
    pinterest_rest_api_currency__e currency,
    pinterest_rest_api_objective_type__e objective_type,
    pinterest_rest_api_action_type__e billable_event,
    optimization_goal_metadata_t *optimization_goal_metadata,
    pinterest_rest_api_creative_type__e creative_type
    ) {
    bid_floor_spec_t *bid_floor_spec_local_var = malloc(sizeof(bid_floor_spec_t));
    if (!bid_floor_spec_local_var) {
        return NULL;
    }
    bid_floor_spec_local_var->countries = countries;
    bid_floor_spec_local_var->currency = currency;
    bid_floor_spec_local_var->objective_type = objective_type;
    bid_floor_spec_local_var->billable_event = billable_event;
    bid_floor_spec_local_var->optimization_goal_metadata = optimization_goal_metadata;
    bid_floor_spec_local_var->creative_type = creative_type;

    bid_floor_spec_local_var->_library_owned = 1;
    return bid_floor_spec_local_var;
}

__attribute__((deprecated)) bid_floor_spec_t *bid_floor_spec_create(
    list_t *countries,
    pinterest_rest_api_currency__e currency,
    pinterest_rest_api_objective_type__e objective_type,
    pinterest_rest_api_action_type__e billable_event,
    optimization_goal_metadata_t *optimization_goal_metadata,
    pinterest_rest_api_creative_type__e creative_type
    ) {
    return bid_floor_spec_create_internal (
        countries,
        currency,
        objective_type,
        billable_event,
        optimization_goal_metadata,
        creative_type
        );
}

void bid_floor_spec_free(bid_floor_spec_t *bid_floor_spec) {
    if(NULL == bid_floor_spec){
        return ;
    }
    if(bid_floor_spec->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bid_floor_spec_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bid_floor_spec->countries) {
        list_ForEach(listEntry, bid_floor_spec->countries) {
            country_free(listEntry->data);
        }
        list_freeList(bid_floor_spec->countries);
        bid_floor_spec->countries = NULL;
    }
    if (bid_floor_spec->optimization_goal_metadata) {
        optimization_goal_metadata_free(bid_floor_spec->optimization_goal_metadata);
        bid_floor_spec->optimization_goal_metadata = NULL;
    }
    free(bid_floor_spec);
}

cJSON *bid_floor_spec_convertToJSON(bid_floor_spec_t *bid_floor_spec) {
    cJSON *item = cJSON_CreateObject();

    // bid_floor_spec->countries
    if(bid_floor_spec->countries != pinterest_rest_api_list_COUNTRIES_NULL) {
    cJSON *countries = cJSON_AddArrayToObject(item, "countries");
    if(countries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *countriesListEntry;
    if (bid_floor_spec->countries) {
    list_ForEach(countriesListEntry, bid_floor_spec->countries) {
    cJSON *itemLocal = country_convertToJSON((pinterest_rest_api_bid_floor_spec__e)countriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(countries, itemLocal);
    }
    }
    }


    // bid_floor_spec->currency
    if (pinterest_rest_api_currency__NULL == bid_floor_spec->currency) {
        goto fail;
    }
    cJSON *currency_local_JSON = currency_convertToJSON(bid_floor_spec->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // bid_floor_spec->objective_type
    if(bid_floor_spec->objective_type != pinterest_rest_api_objective_type__NULL) {
    cJSON *objective_type_local_JSON = objective_type_convertToJSON(bid_floor_spec->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // bid_floor_spec->billable_event
    if (pinterest_rest_api_action_type__NULL == bid_floor_spec->billable_event) {
        goto fail;
    }
    cJSON *billable_event_local_JSON = action_type_convertToJSON(bid_floor_spec->billable_event);
    if(billable_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "billable_event", billable_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // bid_floor_spec->optimization_goal_metadata
    if(bid_floor_spec->optimization_goal_metadata) {
    cJSON *optimization_goal_metadata_local_JSON = optimization_goal_metadata_convertToJSON(bid_floor_spec->optimization_goal_metadata);
    if(optimization_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optimization_goal_metadata", optimization_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // bid_floor_spec->creative_type
    if(bid_floor_spec->creative_type != pinterest_rest_api_creative_type__NULL) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(bid_floor_spec->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bid_floor_spec_t *bid_floor_spec_parseFromJSON(cJSON *bid_floor_specJSON){

    bid_floor_spec_t *bid_floor_spec_local_var = NULL;

    // define the local list for bid_floor_spec->countries
    list_t *countriesList = NULL;

    // define the local variable for bid_floor_spec->currency
    pinterest_rest_api_currency__e currency_local_nonprim = 0;

    // define the local variable for bid_floor_spec->objective_type
    pinterest_rest_api_objective_type__e objective_type_local_nonprim = 0;

    // define the local variable for bid_floor_spec->billable_event
    pinterest_rest_api_action_type__e billable_event_local_nonprim = 0;

    // define the local variable for bid_floor_spec->optimization_goal_metadata
    optimization_goal_metadata_t *optimization_goal_metadata_local_nonprim = NULL;

    // define the local variable for bid_floor_spec->creative_type
    pinterest_rest_api_creative_type__e creative_type_local_nonprim = 0;

    // bid_floor_spec->countries
    cJSON *countries = cJSON_GetObjectItemCaseSensitive(bid_floor_specJSON, "countries");
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
        bid_floor_spec_country_e countriesItem = country_parseFromJSON(countries_local_nonprimitive);

        list_addElement(countriesList, (void *)countriesItem);
    }
    }

    // bid_floor_spec->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(bid_floor_specJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = currency_parseFromJSON(currency); //custom

    // bid_floor_spec->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(bid_floor_specJSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (objective_type) { 
    objective_type_local_nonprim = objective_type_parseFromJSON(objective_type); //custom
    }

    // bid_floor_spec->billable_event
    cJSON *billable_event = cJSON_GetObjectItemCaseSensitive(bid_floor_specJSON, "billable_event");
    if (cJSON_IsNull(billable_event)) {
        billable_event = NULL;
    }
    if (!billable_event) {
        goto end;
    }

    
    billable_event_local_nonprim = action_type_parseFromJSON(billable_event); //custom

    // bid_floor_spec->optimization_goal_metadata
    cJSON *optimization_goal_metadata = cJSON_GetObjectItemCaseSensitive(bid_floor_specJSON, "optimization_goal_metadata");
    if (cJSON_IsNull(optimization_goal_metadata)) {
        optimization_goal_metadata = NULL;
    }
    if (optimization_goal_metadata) { 
    optimization_goal_metadata_local_nonprim = optimization_goal_metadata_parseFromJSON(optimization_goal_metadata); //nonprimitive
    }

    // bid_floor_spec->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(bid_floor_specJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }


    bid_floor_spec_local_var = bid_floor_spec_create_internal (
        countries ? countriesList : NULL,
        currency_local_nonprim,
        objective_type ? objective_type_local_nonprim : 0,
        billable_event_local_nonprim,
        optimization_goal_metadata ? optimization_goal_metadata_local_nonprim : NULL,
        creative_type ? creative_type_local_nonprim : 0
        );

    return bid_floor_spec_local_var;
end:
    if (countriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, countriesList) {
            country_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(countriesList);
        countriesList = NULL;
    }
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    if (objective_type_local_nonprim) {
        objective_type_local_nonprim = 0;
    }
    if (billable_event_local_nonprim) {
        billable_event_local_nonprim = 0;
    }
    if (optimization_goal_metadata_local_nonprim) {
        optimization_goal_metadata_free(optimization_goal_metadata_local_nonprim);
        optimization_goal_metadata_local_nonprim = NULL;
    }
    if (creative_type_local_nonprim) {
        creative_type_local_nonprim = 0;
    }
    return NULL;

}
