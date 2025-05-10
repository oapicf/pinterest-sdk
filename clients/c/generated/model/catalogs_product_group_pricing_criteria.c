#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_pricing_criteria.h"



static catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_create_internal(
    int inclusion,
    double values,
    int negated
    ) {
    catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_local_var = malloc(sizeof(catalogs_product_group_pricing_criteria_t));
    if (!catalogs_product_group_pricing_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_pricing_criteria_local_var->inclusion = inclusion;
    catalogs_product_group_pricing_criteria_local_var->values = values;
    catalogs_product_group_pricing_criteria_local_var->negated = negated;

    catalogs_product_group_pricing_criteria_local_var->_library_owned = 1;
    return catalogs_product_group_pricing_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_create(
    int inclusion,
    double values,
    int negated
    ) {
    return catalogs_product_group_pricing_criteria_create_internal (
        inclusion,
        values,
        negated
        );
}

void catalogs_product_group_pricing_criteria_free(catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria) {
    if(NULL == catalogs_product_group_pricing_criteria){
        return ;
    }
    if(catalogs_product_group_pricing_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_pricing_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_product_group_pricing_criteria);
}

cJSON *catalogs_product_group_pricing_criteria_convertToJSON(catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_pricing_criteria->inclusion
    if(catalogs_product_group_pricing_criteria->inclusion) {
    if(cJSON_AddBoolToObject(item, "inclusion", catalogs_product_group_pricing_criteria->inclusion) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_pricing_criteria->values
    if (!catalogs_product_group_pricing_criteria->values) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "values", catalogs_product_group_pricing_criteria->values) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_pricing_criteria->negated
    if(catalogs_product_group_pricing_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_pricing_criteria->negated) == NULL) {
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

catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_parseFromJSON(cJSON *catalogs_product_group_pricing_criteriaJSON){

    catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_local_var = NULL;

    // catalogs_product_group_pricing_criteria->inclusion
    cJSON *inclusion = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_criteriaJSON, "inclusion");
    if (cJSON_IsNull(inclusion)) {
        inclusion = NULL;
    }
    if (inclusion) { 
    if(!cJSON_IsBool(inclusion))
    {
    goto end; //Bool
    }
    }

    // catalogs_product_group_pricing_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_criteriaJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (!values) {
        goto end;
    }

    
    if(!cJSON_IsNumber(values))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_pricing_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_criteriaJSON, "negated");
    if (cJSON_IsNull(negated)) {
        negated = NULL;
    }
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }


    catalogs_product_group_pricing_criteria_local_var = catalogs_product_group_pricing_criteria_create_internal (
        inclusion ? inclusion->valueint : 0,
        values->valuedouble,
        negated ? negated->valueint : 0
        );

    return catalogs_product_group_pricing_criteria_local_var;
end:
    return NULL;

}
