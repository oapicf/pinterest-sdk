#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_multiple_countries_criteria.h"


char* catalogs_product_group_multiple_countries_criteria_values_ToString(pinterest_rest_api_catalogs_product_group_multiple_countries_criteria__e values) {
    char *valuesArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return valuesArray[values - 1];
}

pinterest_rest_api_catalogs_product_group_multiple_countries_criteria__e catalogs_product_group_multiple_countries_criteria_values_FromString(char* values) {
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_product_group_multiple_countries_criteria_t *catalogs_product_group_multiple_countries_criteria_create(
    list_t *values,
    int negated
    ) {
    catalogs_product_group_multiple_countries_criteria_t *catalogs_product_group_multiple_countries_criteria_local_var = malloc(sizeof(catalogs_product_group_multiple_countries_criteria_t));
    if (!catalogs_product_group_multiple_countries_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_multiple_countries_criteria_local_var->values = values;
    catalogs_product_group_multiple_countries_criteria_local_var->negated = negated;

    return catalogs_product_group_multiple_countries_criteria_local_var;
}


void catalogs_product_group_multiple_countries_criteria_free(catalogs_product_group_multiple_countries_criteria_t *catalogs_product_group_multiple_countries_criteria) {
    if(NULL == catalogs_product_group_multiple_countries_criteria){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_multiple_countries_criteria->values) {
        list_ForEach(listEntry, catalogs_product_group_multiple_countries_criteria->values) {
            country_free(listEntry->data);
        }
        list_freeList(catalogs_product_group_multiple_countries_criteria->values);
        catalogs_product_group_multiple_countries_criteria->values = NULL;
    }
    free(catalogs_product_group_multiple_countries_criteria);
}

cJSON *catalogs_product_group_multiple_countries_criteria_convertToJSON(catalogs_product_group_multiple_countries_criteria_t *catalogs_product_group_multiple_countries_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_multiple_countries_criteria->values
    if (pinterest_rest_api_catalogs_product_group_multiple_countries_criteria_VALUES_NULL == catalogs_product_group_multiple_countries_criteria->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (catalogs_product_group_multiple_countries_criteria->values) {
    list_ForEach(valuesListEntry, catalogs_product_group_multiple_countries_criteria->values) {
    cJSON *itemLocal = country_convertToJSON((pinterest_rest_api_catalogs_product_group_multiple_countries_criteria__e)valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
    }
    }


    // catalogs_product_group_multiple_countries_criteria->negated
    if(catalogs_product_group_multiple_countries_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_multiple_countries_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_multiple_countries_criteria_t *catalogs_product_group_multiple_countries_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_countries_criteriaJSON){

    catalogs_product_group_multiple_countries_criteria_t *catalogs_product_group_multiple_countries_criteria_local_var = NULL;

    // define the local list for catalogs_product_group_multiple_countries_criteria->values
    list_t *valuesList = NULL;

    // catalogs_product_group_multiple_countries_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_countries_criteriaJSON, "values");
    if (!values) {
        goto end;
    }

    
    cJSON *values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(values)){
        goto end; //nonprimitive container
    }

    valuesList = list_createList();

    cJSON_ArrayForEach(values_local_nonprimitive,values )
    {
        if(!cJSON_IsObject(values_local_nonprimitive)){
            goto end;
        }
        catalogs_product_group_multiple_countries_criteria_country_e valuesItem = country_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, (void *)valuesItem);
    }

    // catalogs_product_group_multiple_countries_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_countries_criteriaJSON, "negated");
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }


    catalogs_product_group_multiple_countries_criteria_local_var = catalogs_product_group_multiple_countries_criteria_create (
        valuesList,
        negated ? negated->valueint : 0
        );

    return catalogs_product_group_multiple_countries_criteria_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            country_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
