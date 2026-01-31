#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_currency_criteria.h"



static catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_create_internal(
    int negated,
    pinterest_rest_api_non_nullable_catalogs_currency__e values
    ) {
    catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_local_var = malloc(sizeof(catalogs_product_group_currency_criteria_t));
    if (!catalogs_product_group_currency_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_currency_criteria_local_var->negated = negated;
    catalogs_product_group_currency_criteria_local_var->values = values;

    catalogs_product_group_currency_criteria_local_var->_library_owned = 1;
    return catalogs_product_group_currency_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_create(
    int negated,
    pinterest_rest_api_non_nullable_catalogs_currency__e values
    ) {
    return catalogs_product_group_currency_criteria_create_internal (
        negated,
        values
        );
}

void catalogs_product_group_currency_criteria_free(catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria) {
    if(NULL == catalogs_product_group_currency_criteria){
        return ;
    }
    if(catalogs_product_group_currency_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_currency_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_product_group_currency_criteria);
}

cJSON *catalogs_product_group_currency_criteria_convertToJSON(catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_currency_criteria->negated
    if(catalogs_product_group_currency_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_currency_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_currency_criteria->values
    if (pinterest_rest_api_non_nullable_catalogs_currency__NULL == catalogs_product_group_currency_criteria->values) {
        goto fail;
    }
    cJSON *values_local_JSON = non_nullable_catalogs_currency_convertToJSON(catalogs_product_group_currency_criteria->values);
    if(values_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "values", values_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_parseFromJSON(cJSON *catalogs_product_group_currency_criteriaJSON){

    catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_currency_criteria->values
    pinterest_rest_api_non_nullable_catalogs_currency__e values_local_nonprim = 0;

    // catalogs_product_group_currency_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_currency_criteriaJSON, "negated");
    if (cJSON_IsNull(negated)) {
        negated = NULL;
    }
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }

    // catalogs_product_group_currency_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_currency_criteriaJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (!values) {
        goto end;
    }

    
    values_local_nonprim = non_nullable_catalogs_currency_parseFromJSON(values); //custom


    catalogs_product_group_currency_criteria_local_var = catalogs_product_group_currency_criteria_create_internal (
        negated ? negated->valueint : 0,
        values_local_nonprim
        );

    return catalogs_product_group_currency_criteria_local_var;
end:
    if (values_local_nonprim) {
        values_local_nonprim = 0;
    }
    return NULL;

}
