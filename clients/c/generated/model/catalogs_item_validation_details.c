#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_item_validation_details.h"



static catalogs_item_validation_details_t *catalogs_item_validation_details_create_internal(
    pinterest_rest_api_nullable_catalogs_item_field_type__e attribute_name,
    char *provided_value
    ) {
    catalogs_item_validation_details_t *catalogs_item_validation_details_local_var = malloc(sizeof(catalogs_item_validation_details_t));
    if (!catalogs_item_validation_details_local_var) {
        return NULL;
    }
    catalogs_item_validation_details_local_var->attribute_name = attribute_name;
    catalogs_item_validation_details_local_var->provided_value = provided_value;

    catalogs_item_validation_details_local_var->_library_owned = 1;
    return catalogs_item_validation_details_local_var;
}

__attribute__((deprecated)) catalogs_item_validation_details_t *catalogs_item_validation_details_create(
    pinterest_rest_api_nullable_catalogs_item_field_type__e attribute_name,
    char *provided_value
    ) {
    return catalogs_item_validation_details_create_internal (
        attribute_name,
        provided_value
        );
}

void catalogs_item_validation_details_free(catalogs_item_validation_details_t *catalogs_item_validation_details) {
    if(NULL == catalogs_item_validation_details){
        return ;
    }
    if(catalogs_item_validation_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_item_validation_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_item_validation_details->provided_value) {
        free(catalogs_item_validation_details->provided_value);
        catalogs_item_validation_details->provided_value = NULL;
    }
    free(catalogs_item_validation_details);
}

cJSON *catalogs_item_validation_details_convertToJSON(catalogs_item_validation_details_t *catalogs_item_validation_details) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_item_validation_details->attribute_name
    if (pinterest_rest_api_nullable_catalogs_item_field_type__NULL == catalogs_item_validation_details->attribute_name) {
        goto fail;
    }
    cJSON *attribute_name_local_JSON = nullable_catalogs_item_field_type_convertToJSON(catalogs_item_validation_details->attribute_name);
    if(attribute_name_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "attribute_name", attribute_name_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_item_validation_details->provided_value
    if (!catalogs_item_validation_details->provided_value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "provided_value", catalogs_item_validation_details->provided_value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_item_validation_details_t *catalogs_item_validation_details_parseFromJSON(cJSON *catalogs_item_validation_detailsJSON){

    catalogs_item_validation_details_t *catalogs_item_validation_details_local_var = NULL;

    // define the local variable for catalogs_item_validation_details->attribute_name
    pinterest_rest_api_nullable_catalogs_item_field_type__e attribute_name_local_nonprim = 0;

    // catalogs_item_validation_details->attribute_name
    cJSON *attribute_name = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_detailsJSON, "attribute_name");
    if (cJSON_IsNull(attribute_name)) {
        attribute_name = NULL;
    }
    if (!attribute_name) {
        goto end;
    }

    
    attribute_name_local_nonprim = nullable_catalogs_item_field_type_parseFromJSON(attribute_name); //custom

    // catalogs_item_validation_details->provided_value
    cJSON *provided_value = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_detailsJSON, "provided_value");
    if (cJSON_IsNull(provided_value)) {
        provided_value = NULL;
    }
    if (!provided_value) {
        goto end;
    }

    
    if(!cJSON_IsString(provided_value))
    {
    goto end; //String
    }


    catalogs_item_validation_details_local_var = catalogs_item_validation_details_create_internal (
        attribute_name_local_nonprim,
        strdup(provided_value->valuestring)
        );

    return catalogs_item_validation_details_local_var;
end:
    if (attribute_name_local_nonprim) {
        attribute_name_local_nonprim = 0;
    }
    return NULL;

}
