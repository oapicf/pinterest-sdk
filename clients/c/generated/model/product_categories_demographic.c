#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_categories_demographic.h"



static product_categories_demographic_t *product_categories_demographic_create_internal(
    list_t* age,
    gender_demographics_t *gender
    ) {
    product_categories_demographic_t *product_categories_demographic_local_var = malloc(sizeof(product_categories_demographic_t));
    if (!product_categories_demographic_local_var) {
        return NULL;
    }
    product_categories_demographic_local_var->age = age;
    product_categories_demographic_local_var->gender = gender;

    product_categories_demographic_local_var->_library_owned = 1;
    return product_categories_demographic_local_var;
}

__attribute__((deprecated)) product_categories_demographic_t *product_categories_demographic_create(
    list_t* age,
    gender_demographics_t *gender
    ) {
    return product_categories_demographic_create_internal (
        age,
        gender
        );
}

void product_categories_demographic_free(product_categories_demographic_t *product_categories_demographic) {
    if(NULL == product_categories_demographic){
        return ;
    }
    if(product_categories_demographic->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_categories_demographic_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_categories_demographic->age) {
        list_ForEach(listEntry, product_categories_demographic->age) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(product_categories_demographic->age);
        product_categories_demographic->age = NULL;
    }
    if (product_categories_demographic->gender) {
        gender_demographics_free(product_categories_demographic->gender);
        product_categories_demographic->gender = NULL;
    }
    free(product_categories_demographic);
}

cJSON *product_categories_demographic_convertToJSON(product_categories_demographic_t *product_categories_demographic) {
    cJSON *item = cJSON_CreateObject();

    // product_categories_demographic->age
    if (!product_categories_demographic->age) {
        goto fail;
    }
    cJSON *age = cJSON_AddObjectToObject(item, "age");
    if(age == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = age;
    listEntry_t *ageListEntry;
    if (product_categories_demographic->age) {
    list_ForEach(ageListEntry, product_categories_demographic->age) {
        keyValuePair_t *localKeyValue = ageListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }


    // product_categories_demographic->gender
    if (!product_categories_demographic->gender) {
        goto fail;
    }
    cJSON *gender_local_JSON = gender_demographics_convertToJSON(product_categories_demographic->gender);
    if(gender_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gender", gender_local_JSON);
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

product_categories_demographic_t *product_categories_demographic_parseFromJSON(cJSON *product_categories_demographicJSON){

    product_categories_demographic_t *product_categories_demographic_local_var = NULL;

    // define the local map for product_categories_demographic->age
    list_t *ageList = NULL;

    // define the local variable for product_categories_demographic->gender
    gender_demographics_t *gender_local_nonprim = NULL;

    // product_categories_demographic->age
    cJSON *age = cJSON_GetObjectItemCaseSensitive(product_categories_demographicJSON, "age");
    if (cJSON_IsNull(age)) {
        age = NULL;
    }
    if (!age) {
        goto end;
    }

    
    cJSON *age_local_map = NULL;
    if(!cJSON_IsObject(age) && !cJSON_IsNull(age))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(age))
    {
        ageList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(age_local_map, age)
        {
            cJSON *localMapObject = age_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(ageList , localMapKeyPair);
        }
    }

    // product_categories_demographic->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(product_categories_demographicJSON, "gender");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (!gender) {
        goto end;
    }

    
    gender_local_nonprim = gender_demographics_parseFromJSON(gender); //nonprimitive


    product_categories_demographic_local_var = product_categories_demographic_create_internal (
        ageList,
        gender_local_nonprim
        );

    return product_categories_demographic_local_var;
end:
    if (ageList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ageList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(ageList);
        ageList = NULL;
    }
    if (gender_local_nonprim) {
        gender_demographics_free(gender_local_nonprim);
        gender_local_nonprim = NULL;
    }
    return NULL;

}
