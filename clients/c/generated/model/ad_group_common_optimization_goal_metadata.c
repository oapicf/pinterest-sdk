#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_common_optimization_goal_metadata.h"



ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata_create(
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata,
    optimization_goal_metadata_frequency_goal_metadata_t *frequency_goal_metadata,
    optimization_goal_metadata_scrollup_goal_metadata_t *scrollup_goal_metadata
    ) {
    ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata_local_var = malloc(sizeof(ad_group_common_optimization_goal_metadata_t));
    if (!ad_group_common_optimization_goal_metadata_local_var) {
        return NULL;
    }
    ad_group_common_optimization_goal_metadata_local_var->conversion_tag_v3_goal_metadata = conversion_tag_v3_goal_metadata;
    ad_group_common_optimization_goal_metadata_local_var->frequency_goal_metadata = frequency_goal_metadata;
    ad_group_common_optimization_goal_metadata_local_var->scrollup_goal_metadata = scrollup_goal_metadata;

    return ad_group_common_optimization_goal_metadata_local_var;
}


void ad_group_common_optimization_goal_metadata_free(ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata) {
    if(NULL == ad_group_common_optimization_goal_metadata){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata) {
        optimization_goal_metadata_conversion_tag_v3_goal_metadata_free(ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata);
        ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata = NULL;
    }
    if (ad_group_common_optimization_goal_metadata->frequency_goal_metadata) {
        optimization_goal_metadata_frequency_goal_metadata_free(ad_group_common_optimization_goal_metadata->frequency_goal_metadata);
        ad_group_common_optimization_goal_metadata->frequency_goal_metadata = NULL;
    }
    if (ad_group_common_optimization_goal_metadata->scrollup_goal_metadata) {
        optimization_goal_metadata_scrollup_goal_metadata_free(ad_group_common_optimization_goal_metadata->scrollup_goal_metadata);
        ad_group_common_optimization_goal_metadata->scrollup_goal_metadata = NULL;
    }
    free(ad_group_common_optimization_goal_metadata);
}

cJSON *ad_group_common_optimization_goal_metadata_convertToJSON(ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata
    if(ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata) {
    cJSON *conversion_tag_v3_goal_metadata_local_JSON = optimization_goal_metadata_conversion_tag_v3_goal_metadata_convertToJSON(ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata);
    if(conversion_tag_v3_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "conversion_tag_v3_goal_metadata", conversion_tag_v3_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_common_optimization_goal_metadata->frequency_goal_metadata
    if(ad_group_common_optimization_goal_metadata->frequency_goal_metadata) {
    cJSON *frequency_goal_metadata_local_JSON = optimization_goal_metadata_frequency_goal_metadata_convertToJSON(ad_group_common_optimization_goal_metadata->frequency_goal_metadata);
    if(frequency_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "frequency_goal_metadata", frequency_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_common_optimization_goal_metadata->scrollup_goal_metadata
    if(ad_group_common_optimization_goal_metadata->scrollup_goal_metadata) {
    cJSON *scrollup_goal_metadata_local_JSON = optimization_goal_metadata_scrollup_goal_metadata_convertToJSON(ad_group_common_optimization_goal_metadata->scrollup_goal_metadata);
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

ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata_parseFromJSON(cJSON *ad_group_common_optimization_goal_metadataJSON){

    ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata_local_var = NULL;

    // define the local variable for ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_local_nonprim = NULL;

    // define the local variable for ad_group_common_optimization_goal_metadata->frequency_goal_metadata
    optimization_goal_metadata_frequency_goal_metadata_t *frequency_goal_metadata_local_nonprim = NULL;

    // define the local variable for ad_group_common_optimization_goal_metadata->scrollup_goal_metadata
    optimization_goal_metadata_scrollup_goal_metadata_t *scrollup_goal_metadata_local_nonprim = NULL;

    // ad_group_common_optimization_goal_metadata->conversion_tag_v3_goal_metadata
    cJSON *conversion_tag_v3_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_common_optimization_goal_metadataJSON, "conversion_tag_v3_goal_metadata");
    if (conversion_tag_v3_goal_metadata) { 
    conversion_tag_v3_goal_metadata_local_nonprim = optimization_goal_metadata_conversion_tag_v3_goal_metadata_parseFromJSON(conversion_tag_v3_goal_metadata); //nonprimitive
    }

    // ad_group_common_optimization_goal_metadata->frequency_goal_metadata
    cJSON *frequency_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_common_optimization_goal_metadataJSON, "frequency_goal_metadata");
    if (frequency_goal_metadata) { 
    frequency_goal_metadata_local_nonprim = optimization_goal_metadata_frequency_goal_metadata_parseFromJSON(frequency_goal_metadata); //nonprimitive
    }

    // ad_group_common_optimization_goal_metadata->scrollup_goal_metadata
    cJSON *scrollup_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_common_optimization_goal_metadataJSON, "scrollup_goal_metadata");
    if (scrollup_goal_metadata) { 
    scrollup_goal_metadata_local_nonprim = optimization_goal_metadata_scrollup_goal_metadata_parseFromJSON(scrollup_goal_metadata); //nonprimitive
    }


    ad_group_common_optimization_goal_metadata_local_var = ad_group_common_optimization_goal_metadata_create (
        conversion_tag_v3_goal_metadata ? conversion_tag_v3_goal_metadata_local_nonprim : NULL,
        frequency_goal_metadata ? frequency_goal_metadata_local_nonprim : NULL,
        scrollup_goal_metadata ? scrollup_goal_metadata_local_nonprim : NULL
        );

    return ad_group_common_optimization_goal_metadata_local_var;
end:
    if (conversion_tag_v3_goal_metadata_local_nonprim) {
        optimization_goal_metadata_conversion_tag_v3_goal_metadata_free(conversion_tag_v3_goal_metadata_local_nonprim);
        conversion_tag_v3_goal_metadata_local_nonprim = NULL;
    }
    if (frequency_goal_metadata_local_nonprim) {
        optimization_goal_metadata_frequency_goal_metadata_free(frequency_goal_metadata_local_nonprim);
        frequency_goal_metadata_local_nonprim = NULL;
    }
    if (scrollup_goal_metadata_local_nonprim) {
        optimization_goal_metadata_scrollup_goal_metadata_free(scrollup_goal_metadata_local_nonprim);
        scrollup_goal_metadata_local_nonprim = NULL;
    }
    return NULL;

}
