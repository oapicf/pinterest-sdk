#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advertiser_defined_event_input.h"



static advertiser_defined_event_input_t *advertiser_defined_event_input_create_internal(
    advertiser_defined_event_mapping_type_t *mapped_conversion_type,
    char *name
    ) {
    advertiser_defined_event_input_t *advertiser_defined_event_input_local_var = malloc(sizeof(advertiser_defined_event_input_t));
    if (!advertiser_defined_event_input_local_var) {
        return NULL;
    }
    memset(advertiser_defined_event_input_local_var, 0, sizeof(advertiser_defined_event_input_t));
    advertiser_defined_event_input_local_var->_library_owned = 1;
    advertiser_defined_event_input_local_var->mapped_conversion_type = mapped_conversion_type;
    advertiser_defined_event_input_local_var->name = name;
    return advertiser_defined_event_input_local_var;
}

__attribute__((deprecated)) advertiser_defined_event_input_t *advertiser_defined_event_input_create(
    advertiser_defined_event_mapping_type_t *mapped_conversion_type,
    char *name
    ) {
    advertiser_defined_event_input_t *result = advertiser_defined_event_input_create_internal (
        mapped_conversion_type,
        name
        );
    if (!result) {
    }
    return result;
}

void advertiser_defined_event_input_free(advertiser_defined_event_input_t *advertiser_defined_event_input) {
    if(NULL == advertiser_defined_event_input){
        return ;
    }
    if(advertiser_defined_event_input->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advertiser_defined_event_input_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advertiser_defined_event_input->mapped_conversion_type) {
        advertiser_defined_event_mapping_type_free(advertiser_defined_event_input->mapped_conversion_type);
        advertiser_defined_event_input->mapped_conversion_type = NULL;
    }
    if (advertiser_defined_event_input->name) {
        free(advertiser_defined_event_input->name);
        advertiser_defined_event_input->name = NULL;
    }
    free(advertiser_defined_event_input);
}

cJSON *advertiser_defined_event_input_convertToJSON(advertiser_defined_event_input_t *advertiser_defined_event_input) {
    cJSON *item = cJSON_CreateObject();

    // advertiser_defined_event_input->mapped_conversion_type
    if (!advertiser_defined_event_input->mapped_conversion_type) {
        goto fail;
    }
    cJSON *mapped_conversion_type_local_JSON = advertiser_defined_event_mapping_type_convertToJSON(advertiser_defined_event_input->mapped_conversion_type);
    if(mapped_conversion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "mapped_conversion_type", mapped_conversion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advertiser_defined_event_input->name
    if (!advertiser_defined_event_input->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", advertiser_defined_event_input->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

advertiser_defined_event_input_t *advertiser_defined_event_input_parseFromJSON(cJSON *advertiser_defined_event_inputJSON){

    advertiser_defined_event_input_t *advertiser_defined_event_input_local_var = NULL;

    // define the local variable for advertiser_defined_event_input->mapped_conversion_type
    advertiser_defined_event_mapping_type_t *mapped_conversion_type_local_nonprim = NULL;

    char *name_local_str = NULL;

    // advertiser_defined_event_input->mapped_conversion_type
    cJSON *mapped_conversion_type = cJSON_GetObjectItemCaseSensitive(advertiser_defined_event_inputJSON, "mapped_conversion_type");
    if (cJSON_IsNull(mapped_conversion_type)) {
        mapped_conversion_type = NULL;
    }
    if (!mapped_conversion_type) {
        goto end;
    }

    
    mapped_conversion_type_local_nonprim = advertiser_defined_event_mapping_type_parseFromJSON(mapped_conversion_type); //custom

    // advertiser_defined_event_input->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(advertiser_defined_event_inputJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    advertiser_defined_event_input_local_var = advertiser_defined_event_input_create_internal (
        mapped_conversion_type_local_nonprim,
        name_local_str
        );

    if (!advertiser_defined_event_input_local_var) {
        goto end;
    }

    return advertiser_defined_event_input_local_var;
end:
    if (mapped_conversion_type_local_nonprim) {
        advertiser_defined_event_mapping_type_free(mapped_conversion_type_local_nonprim);
        mapped_conversion_type_local_nonprim = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
