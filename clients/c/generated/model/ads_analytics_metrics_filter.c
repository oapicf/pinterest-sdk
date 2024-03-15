#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_metrics_filter.h"


char* ads_analytics_metrics_filter_field_ToString(pinterest_rest_api_ads_analytics_metrics_filter__e field) {
    char* fieldArray[] =  { "NULL", "SPEND_IN_DOLLAR", "TOTAL_IMPRESSION" };
    return fieldArray[field];
}

pinterest_rest_api_ads_analytics_metrics_filter__e ads_analytics_metrics_filter_field_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "NULL", "SPEND_IN_DOLLAR", "TOTAL_IMPRESSION" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ads_analytics_metrics_filter__operator_ToString(pinterest_rest_api_ads_analytics_metrics_filter__e _operator) {
    char* _operatorArray[] =  { "NULL", "LESS_THAN", "GREATER_THAN" };
    return _operatorArray[_operator];
}

pinterest_rest_api_ads_analytics_metrics_filter__e ads_analytics_metrics_filter__operator_FromString(char* _operator){
    int stringToReturn = 0;
    char *_operatorArray[] =  { "NULL", "LESS_THAN", "GREATER_THAN" };
    size_t sizeofArray = sizeof(_operatorArray) / sizeof(_operatorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(_operator, _operatorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_create(
    ads_analytics_filter_column_t *field,
    ads_analytics_filter_operator_t *_operator,
    list_t *values
    ) {
    ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_local_var = malloc(sizeof(ads_analytics_metrics_filter_t));
    if (!ads_analytics_metrics_filter_local_var) {
        return NULL;
    }
    ads_analytics_metrics_filter_local_var->field = field;
    ads_analytics_metrics_filter_local_var->_operator = _operator;
    ads_analytics_metrics_filter_local_var->values = values;

    return ads_analytics_metrics_filter_local_var;
}


void ads_analytics_metrics_filter_free(ads_analytics_metrics_filter_t *ads_analytics_metrics_filter) {
    if(NULL == ads_analytics_metrics_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (ads_analytics_metrics_filter->field) {
        ads_analytics_filter_column_free(ads_analytics_metrics_filter->field);
        ads_analytics_metrics_filter->field = NULL;
    }
    if (ads_analytics_metrics_filter->_operator) {
        ads_analytics_filter_operator_free(ads_analytics_metrics_filter->_operator);
        ads_analytics_metrics_filter->_operator = NULL;
    }
    if (ads_analytics_metrics_filter->values) {
        list_ForEach(listEntry, ads_analytics_metrics_filter->values) {
            free(listEntry->data);
        }
        list_freeList(ads_analytics_metrics_filter->values);
        ads_analytics_metrics_filter->values = NULL;
    }
    free(ads_analytics_metrics_filter);
}

cJSON *ads_analytics_metrics_filter_convertToJSON(ads_analytics_metrics_filter_t *ads_analytics_metrics_filter) {
    cJSON *item = cJSON_CreateObject();

    // ads_analytics_metrics_filter->field
    if (pinterest_rest_api_ads_analytics_metrics_filter__NULL == ads_analytics_metrics_filter->field) {
        goto fail;
    }
    cJSON *field_local_JSON = ads_analytics_filter_column_convertToJSON(ads_analytics_metrics_filter->field);
    if(field_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "field", field_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ads_analytics_metrics_filter->_operator
    if (pinterest_rest_api_ads_analytics_metrics_filter__NULL == ads_analytics_metrics_filter->_operator) {
        goto fail;
    }
    cJSON *_operator_local_JSON = ads_analytics_filter_operator_convertToJSON(ads_analytics_metrics_filter->_operator);
    if(_operator_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operator", _operator_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ads_analytics_metrics_filter->values
    if (!ads_analytics_metrics_filter->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, ads_analytics_metrics_filter->values) {
    if(cJSON_AddNumberToObject(values, "", *(double *)valuesListEntry->data) == NULL)
    {
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

ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_parseFromJSON(cJSON *ads_analytics_metrics_filterJSON){

    ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_local_var = NULL;

    // define the local variable for ads_analytics_metrics_filter->field
    ads_analytics_filter_column_t *field_local_nonprim = NULL;

    // define the local variable for ads_analytics_metrics_filter->_operator
    ads_analytics_filter_operator_t *_operator_local_nonprim = NULL;

    // define the local list for ads_analytics_metrics_filter->values
    list_t *valuesList = NULL;

    // ads_analytics_metrics_filter->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(ads_analytics_metrics_filterJSON, "field");
    if (!field) {
        goto end;
    }

    
    field_local_nonprim = ads_analytics_filter_column_parseFromJSON(field); //custom

    // ads_analytics_metrics_filter->_operator
    cJSON *_operator = cJSON_GetObjectItemCaseSensitive(ads_analytics_metrics_filterJSON, "operator");
    if (!_operator) {
        goto end;
    }

    
    _operator_local_nonprim = ads_analytics_filter_operator_parseFromJSON(_operator); //custom

    // ads_analytics_metrics_filter->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(ads_analytics_metrics_filterJSON, "values");
    if (!values) {
        goto end;
    }

    
    cJSON *values_local = NULL;
    if(!cJSON_IsArray(values)) {
        goto end;//primitive container
    }
    valuesList = list_createList();

    cJSON_ArrayForEach(values_local, values)
    {
        if(!cJSON_IsNumber(values_local))
        {
            goto end;
        }
        double *values_local_value = (double *)calloc(1, sizeof(double));
        if(!values_local_value)
        {
            goto end;
        }
        *values_local_value = values_local->valuedouble;
        list_addElement(valuesList , values_local_value);
    }


    ads_analytics_metrics_filter_local_var = ads_analytics_metrics_filter_create (
        field_local_nonprim,
        _operator_local_nonprim,
        valuesList
        );

    return ads_analytics_metrics_filter_local_var;
end:
    if (field_local_nonprim) {
        ads_analytics_filter_column_free(field_local_nonprim);
        field_local_nonprim = NULL;
    }
    if (_operator_local_nonprim) {
        ads_analytics_filter_operator_free(_operator_local_nonprim);
        _operator_local_nonprim = NULL;
    }
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
