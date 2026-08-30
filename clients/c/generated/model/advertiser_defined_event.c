#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advertiser_defined_event.h"



static advertiser_defined_event_t *advertiser_defined_event_create_internal(
    conversion_tag_type_optimal_t *mapped_conversion_type,
    char *name
    ) {
    advertiser_defined_event_t *advertiser_defined_event_local_var = malloc(sizeof(advertiser_defined_event_t));
    if (!advertiser_defined_event_local_var) {
        return NULL;
    }
    memset(advertiser_defined_event_local_var, 0, sizeof(advertiser_defined_event_t));
    advertiser_defined_event_local_var->_library_owned = 1;
    advertiser_defined_event_local_var->mapped_conversion_type = mapped_conversion_type;
    advertiser_defined_event_local_var->name = name;
    return advertiser_defined_event_local_var;
}

__attribute__((deprecated)) advertiser_defined_event_t *advertiser_defined_event_create(
    conversion_tag_type_optimal_t *mapped_conversion_type,
    char *name
    ) {
    advertiser_defined_event_t *result = advertiser_defined_event_create_internal (
        mapped_conversion_type,
        name
        );
    if (!result) {
    }
    return result;
}

void advertiser_defined_event_free(advertiser_defined_event_t *advertiser_defined_event) {
    if(NULL == advertiser_defined_event){
        return ;
    }
    if(advertiser_defined_event->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advertiser_defined_event_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advertiser_defined_event->mapped_conversion_type) {
        conversion_tag_type_optimal_free(advertiser_defined_event->mapped_conversion_type);
        advertiser_defined_event->mapped_conversion_type = NULL;
    }
    if (advertiser_defined_event->name) {
        free(advertiser_defined_event->name);
        advertiser_defined_event->name = NULL;
    }
    free(advertiser_defined_event);
}

cJSON *advertiser_defined_event_convertToJSON(advertiser_defined_event_t *advertiser_defined_event) {
    cJSON *item = cJSON_CreateObject();

    // advertiser_defined_event->mapped_conversion_type
    if(advertiser_defined_event->mapped_conversion_type) {
    cJSON *mapped_conversion_type_local_JSON = conversion_tag_type_optimal_convertToJSON(advertiser_defined_event->mapped_conversion_type);
    if(mapped_conversion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "mapped_conversion_type", mapped_conversion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // advertiser_defined_event->name
    if(advertiser_defined_event->name) {
    if(cJSON_AddStringToObject(item, "name", advertiser_defined_event->name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

advertiser_defined_event_t *advertiser_defined_event_parseFromJSON(cJSON *advertiser_defined_eventJSON){

    advertiser_defined_event_t *advertiser_defined_event_local_var = NULL;

    // define the local variable for advertiser_defined_event->mapped_conversion_type
    conversion_tag_type_optimal_t *mapped_conversion_type_local_nonprim = NULL;

    char *name_local_str = NULL;

    // advertiser_defined_event->mapped_conversion_type
    cJSON *mapped_conversion_type = cJSON_GetObjectItemCaseSensitive(advertiser_defined_eventJSON, "mapped_conversion_type");
    if (cJSON_IsNull(mapped_conversion_type)) {
        mapped_conversion_type = NULL;
    }
    if (mapped_conversion_type) { 
    mapped_conversion_type_local_nonprim = conversion_tag_type_optimal_parseFromJSON(mapped_conversion_type); //custom
    }

    // advertiser_defined_event->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(advertiser_defined_eventJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    advertiser_defined_event_local_var = advertiser_defined_event_create_internal (
        mapped_conversion_type ? mapped_conversion_type_local_nonprim : NULL,
        name_local_str
        );

    if (!advertiser_defined_event_local_var) {
        goto end;
    }

    return advertiser_defined_event_local_var;
end:
    if (mapped_conversion_type_local_nonprim) {
        conversion_tag_type_optimal_free(mapped_conversion_type_local_nonprim);
        mapped_conversion_type_local_nonprim = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
