#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "carting_retailer.h"



static carting_retailer_t *carting_retailer_create_internal(
    char *retailer_id,
    char *retailer_name
    ) {
    carting_retailer_t *carting_retailer_local_var = malloc(sizeof(carting_retailer_t));
    if (!carting_retailer_local_var) {
        return NULL;
    }
    memset(carting_retailer_local_var, 0, sizeof(carting_retailer_t));
    carting_retailer_local_var->_library_owned = 1;
    carting_retailer_local_var->retailer_id = retailer_id;
    carting_retailer_local_var->retailer_name = retailer_name;
    return carting_retailer_local_var;
}

__attribute__((deprecated)) carting_retailer_t *carting_retailer_create(
    char *retailer_id,
    char *retailer_name
    ) {
    carting_retailer_t *result = carting_retailer_create_internal (
        retailer_id,
        retailer_name
        );
    if (!result) {
    }
    return result;
}

void carting_retailer_free(carting_retailer_t *carting_retailer) {
    if(NULL == carting_retailer){
        return ;
    }
    if(carting_retailer->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "carting_retailer_free");
        return ;
    }
    listEntry_t *listEntry;
    if (carting_retailer->retailer_id) {
        free(carting_retailer->retailer_id);
        carting_retailer->retailer_id = NULL;
    }
    if (carting_retailer->retailer_name) {
        free(carting_retailer->retailer_name);
        carting_retailer->retailer_name = NULL;
    }
    free(carting_retailer);
}

cJSON *carting_retailer_convertToJSON(carting_retailer_t *carting_retailer) {
    cJSON *item = cJSON_CreateObject();

    // carting_retailer->retailer_id
    if (!carting_retailer->retailer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "retailer_id", carting_retailer->retailer_id) == NULL) {
    goto fail; //String
    }


    // carting_retailer->retailer_name
    if (!carting_retailer->retailer_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "retailer_name", carting_retailer->retailer_name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

carting_retailer_t *carting_retailer_parseFromJSON(cJSON *carting_retailerJSON){

    carting_retailer_t *carting_retailer_local_var = NULL;

    char *retailer_id_local_str = NULL;

    char *retailer_name_local_str = NULL;

    // carting_retailer->retailer_id
    cJSON *retailer_id = cJSON_GetObjectItemCaseSensitive(carting_retailerJSON, "retailer_id");
    if (cJSON_IsNull(retailer_id)) {
        retailer_id = NULL;
    }
    if (!retailer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(retailer_id))
    {
    goto end; //String
    }

    // carting_retailer->retailer_name
    cJSON *retailer_name = cJSON_GetObjectItemCaseSensitive(carting_retailerJSON, "retailer_name");
    if (cJSON_IsNull(retailer_name)) {
        retailer_name = NULL;
    }
    if (!retailer_name) {
        goto end;
    }

    
    if(!cJSON_IsString(retailer_name))
    {
    goto end; //String
    }


    if (retailer_id && !cJSON_IsNull(retailer_id)) retailer_id_local_str = strdup(retailer_id->valuestring);
    if (retailer_name && !cJSON_IsNull(retailer_name)) retailer_name_local_str = strdup(retailer_name->valuestring);

    carting_retailer_local_var = carting_retailer_create_internal (
        retailer_id_local_str,
        retailer_name_local_str
        );

    if (!carting_retailer_local_var) {
        goto end;
    }

    return carting_retailer_local_var;
end:
    if (retailer_id_local_str) {
        free(retailer_id_local_str);
        retailer_id_local_str = NULL;
    }
    if (retailer_name_local_str) {
        free(retailer_name_local_str);
        retailer_name_local_str = NULL;
    }
    return NULL;

}
