#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullable_optimization_goal_metadata.h"



static nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata_create_internal(
    conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata,
    frequency_goal_metadata_t *frequency_goal_metadata,
    scrollup_goal_metadata_t *scrollup_goal_metadata
    ) {
    nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata_local_var = malloc(sizeof(nullable_optimization_goal_metadata_t));
    if (!nullable_optimization_goal_metadata_local_var) {
        return NULL;
    }
    memset(nullable_optimization_goal_metadata_local_var, 0, sizeof(nullable_optimization_goal_metadata_t));
    nullable_optimization_goal_metadata_local_var->_library_owned = 1;
    nullable_optimization_goal_metadata_local_var->conversion_tag_v3_goal_metadata = conversion_tag_v3_goal_metadata;
    nullable_optimization_goal_metadata_local_var->frequency_goal_metadata = frequency_goal_metadata;
    nullable_optimization_goal_metadata_local_var->scrollup_goal_metadata = scrollup_goal_metadata;
    return nullable_optimization_goal_metadata_local_var;
}

__attribute__((deprecated)) nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata_create(
    conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata,
    frequency_goal_metadata_t *frequency_goal_metadata,
    scrollup_goal_metadata_t *scrollup_goal_metadata
    ) {
    nullable_optimization_goal_metadata_t *result = nullable_optimization_goal_metadata_create_internal (
        conversion_tag_v3_goal_metadata,
        frequency_goal_metadata,
        scrollup_goal_metadata
        );
    if (!result) {
    }
    return result;
}

void nullable_optimization_goal_metadata_free(nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata) {
    if(NULL == nullable_optimization_goal_metadata){
        return ;
    }
    if(nullable_optimization_goal_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "nullable_optimization_goal_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata) {
        conversion_tag_v3_goal_metadata_free(nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata);
        nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata = NULL;
    }
    if (nullable_optimization_goal_metadata->frequency_goal_metadata) {
        frequency_goal_metadata_free(nullable_optimization_goal_metadata->frequency_goal_metadata);
        nullable_optimization_goal_metadata->frequency_goal_metadata = NULL;
    }
    if (nullable_optimization_goal_metadata->scrollup_goal_metadata) {
        scrollup_goal_metadata_free(nullable_optimization_goal_metadata->scrollup_goal_metadata);
        nullable_optimization_goal_metadata->scrollup_goal_metadata = NULL;
    }
    free(nullable_optimization_goal_metadata);
}

cJSON *nullable_optimization_goal_metadata_convertToJSON(nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata
    if(nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata) {
    cJSON *conversion_tag_v3_goal_metadata_local_JSON = conversion_tag_v3_goal_metadata_convertToJSON(nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata);
    if(conversion_tag_v3_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "conversion_tag_v3_goal_metadata", conversion_tag_v3_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // nullable_optimization_goal_metadata->frequency_goal_metadata
    if(nullable_optimization_goal_metadata->frequency_goal_metadata) {
    cJSON *frequency_goal_metadata_local_JSON = frequency_goal_metadata_convertToJSON(nullable_optimization_goal_metadata->frequency_goal_metadata);
    if(frequency_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "frequency_goal_metadata", frequency_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // nullable_optimization_goal_metadata->scrollup_goal_metadata
    if(nullable_optimization_goal_metadata->scrollup_goal_metadata) {
    cJSON *scrollup_goal_metadata_local_JSON = scrollup_goal_metadata_convertToJSON(nullable_optimization_goal_metadata->scrollup_goal_metadata);
    if(scrollup_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scrollup_goal_metadata", scrollup_goal_metadata_local_JSON);
    if(item->child == NULL) {
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

nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata_parseFromJSON(cJSON *nullable_optimization_goal_metadataJSON){

    nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata_local_var = NULL;

    // define the local variable for nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata
    conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_local_nonprim = NULL;

    // define the local variable for nullable_optimization_goal_metadata->frequency_goal_metadata
    frequency_goal_metadata_t *frequency_goal_metadata_local_nonprim = NULL;

    // define the local variable for nullable_optimization_goal_metadata->scrollup_goal_metadata
    scrollup_goal_metadata_t *scrollup_goal_metadata_local_nonprim = NULL;

    // nullable_optimization_goal_metadata->conversion_tag_v3_goal_metadata
    cJSON *conversion_tag_v3_goal_metadata = cJSON_GetObjectItemCaseSensitive(nullable_optimization_goal_metadataJSON, "conversion_tag_v3_goal_metadata");
    if (cJSON_IsNull(conversion_tag_v3_goal_metadata)) {
        conversion_tag_v3_goal_metadata = NULL;
    }
    if (conversion_tag_v3_goal_metadata) { 
    conversion_tag_v3_goal_metadata_local_nonprim = conversion_tag_v3_goal_metadata_parseFromJSON(conversion_tag_v3_goal_metadata); //nonprimitive
    }

    // nullable_optimization_goal_metadata->frequency_goal_metadata
    cJSON *frequency_goal_metadata = cJSON_GetObjectItemCaseSensitive(nullable_optimization_goal_metadataJSON, "frequency_goal_metadata");
    if (cJSON_IsNull(frequency_goal_metadata)) {
        frequency_goal_metadata = NULL;
    }
    if (frequency_goal_metadata) { 
    frequency_goal_metadata_local_nonprim = frequency_goal_metadata_parseFromJSON(frequency_goal_metadata); //nonprimitive
    }

    // nullable_optimization_goal_metadata->scrollup_goal_metadata
    cJSON *scrollup_goal_metadata = cJSON_GetObjectItemCaseSensitive(nullable_optimization_goal_metadataJSON, "scrollup_goal_metadata");
    if (cJSON_IsNull(scrollup_goal_metadata)) {
        scrollup_goal_metadata = NULL;
    }
    if (scrollup_goal_metadata) { 
    scrollup_goal_metadata_local_nonprim = scrollup_goal_metadata_parseFromJSON(scrollup_goal_metadata); //nonprimitive
    }



    nullable_optimization_goal_metadata_local_var = nullable_optimization_goal_metadata_create_internal (
        conversion_tag_v3_goal_metadata ? conversion_tag_v3_goal_metadata_local_nonprim : NULL,
        frequency_goal_metadata ? frequency_goal_metadata_local_nonprim : NULL,
        scrollup_goal_metadata ? scrollup_goal_metadata_local_nonprim : NULL
        );

    if (!nullable_optimization_goal_metadata_local_var) {
        goto end;
    }

    return nullable_optimization_goal_metadata_local_var;
end:
    if (conversion_tag_v3_goal_metadata_local_nonprim) {
        conversion_tag_v3_goal_metadata_free(conversion_tag_v3_goal_metadata_local_nonprim);
        conversion_tag_v3_goal_metadata_local_nonprim = NULL;
    }
    if (frequency_goal_metadata_local_nonprim) {
        frequency_goal_metadata_free(frequency_goal_metadata_local_nonprim);
        frequency_goal_metadata_local_nonprim = NULL;
    }
    if (scrollup_goal_metadata_local_nonprim) {
        scrollup_goal_metadata_free(scrollup_goal_metadata_local_nonprim);
        scrollup_goal_metadata_local_nonprim = NULL;
    }
    return NULL;

}
