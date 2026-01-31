#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advertiser_defined_event.h"



static advertiser_defined_event_t *advertiser_defined_event_create_internal(
    char *name,
    pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_e mapped_conversion_type
    ) {
    advertiser_defined_event_t *advertiser_defined_event_local_var = malloc(sizeof(advertiser_defined_event_t));
    if (!advertiser_defined_event_local_var) {
        return NULL;
    }
    advertiser_defined_event_local_var->name = name;
    advertiser_defined_event_local_var->mapped_conversion_type = mapped_conversion_type;

    advertiser_defined_event_local_var->_library_owned = 1;
    return advertiser_defined_event_local_var;
}

__attribute__((deprecated)) advertiser_defined_event_t *advertiser_defined_event_create(
    char *name,
    pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_e mapped_conversion_type
    ) {
    return advertiser_defined_event_create_internal (
        name,
        mapped_conversion_type
        );
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
    if (advertiser_defined_event->name) {
        free(advertiser_defined_event->name);
        advertiser_defined_event->name = NULL;
    }
    free(advertiser_defined_event);
}

cJSON *advertiser_defined_event_convertToJSON(advertiser_defined_event_t *advertiser_defined_event) {
    cJSON *item = cJSON_CreateObject();

    // advertiser_defined_event->name
    if(advertiser_defined_event->name) {
    if(cJSON_AddStringToObject(item, "name", advertiser_defined_event->name) == NULL) {
    goto fail; //String
    }
    }


    // advertiser_defined_event->mapped_conversion_type
    if(advertiser_defined_event->mapped_conversion_type != pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "mapped_conversion_type", advertiser_defined_event_mapped_conversion_type_ToString(advertiser_defined_event->mapped_conversion_type)) == NULL)
    {
    goto fail; //Enum
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

    // advertiser_defined_event->mapped_conversion_type
    cJSON *mapped_conversion_type = cJSON_GetObjectItemCaseSensitive(advertiser_defined_eventJSON, "mapped_conversion_type");
    if (cJSON_IsNull(mapped_conversion_type)) {
        mapped_conversion_type = NULL;
    }
    pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_e mapped_conversion_typeVariable;
    if (mapped_conversion_type) { 
    if(!cJSON_IsString(mapped_conversion_type))
    {
    goto end; //Enum
    }
    mapped_conversion_typeVariable = advertiser_defined_event_mapped_conversion_type_FromString(mapped_conversion_type->valuestring);
    }


    advertiser_defined_event_local_var = advertiser_defined_event_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        mapped_conversion_type ? mapped_conversion_typeVariable : pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_NULL
        );

    return advertiser_defined_event_local_var;
end:
    return NULL;

}
