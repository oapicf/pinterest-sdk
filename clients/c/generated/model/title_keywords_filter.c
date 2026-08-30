#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "title_keywords_filter.h"



static title_keywords_filter_t *title_keywords_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *title_keywords
    ) {
    title_keywords_filter_t *title_keywords_filter_local_var = malloc(sizeof(title_keywords_filter_t));
    if (!title_keywords_filter_local_var) {
        return NULL;
    }
    memset(title_keywords_filter_local_var, 0, sizeof(title_keywords_filter_t));
    title_keywords_filter_local_var->_library_owned = 1;
    title_keywords_filter_local_var->title_keywords = title_keywords;
    return title_keywords_filter_local_var;
}

__attribute__((deprecated)) title_keywords_filter_t *title_keywords_filter_create(
    catalogs_product_group_multiple_string_criteria_t *title_keywords
    ) {
    title_keywords_filter_t *result = title_keywords_filter_create_internal (
        title_keywords
        );
    if (!result) {
    }
    return result;
}

void title_keywords_filter_free(title_keywords_filter_t *title_keywords_filter) {
    if(NULL == title_keywords_filter){
        return ;
    }
    if(title_keywords_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "title_keywords_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (title_keywords_filter->title_keywords) {
        catalogs_product_group_multiple_string_criteria_free(title_keywords_filter->title_keywords);
        title_keywords_filter->title_keywords = NULL;
    }
    free(title_keywords_filter);
}

cJSON *title_keywords_filter_convertToJSON(title_keywords_filter_t *title_keywords_filter) {
    cJSON *item = cJSON_CreateObject();

    // title_keywords_filter->title_keywords
    if (!title_keywords_filter->title_keywords) {
        goto fail;
    }
    cJSON *title_keywords_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(title_keywords_filter->title_keywords);
    if(title_keywords_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "TITLE_KEYWORDS", title_keywords_local_JSON);
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

title_keywords_filter_t *title_keywords_filter_parseFromJSON(cJSON *title_keywords_filterJSON){

    title_keywords_filter_t *title_keywords_filter_local_var = NULL;

    // define the local variable for title_keywords_filter->title_keywords
    catalogs_product_group_multiple_string_criteria_t *title_keywords_local_nonprim = NULL;

    // title_keywords_filter->title_keywords
    cJSON *title_keywords = cJSON_GetObjectItemCaseSensitive(title_keywords_filterJSON, "TITLE_KEYWORDS");
    if (cJSON_IsNull(title_keywords)) {
        title_keywords = NULL;
    }
    if (!title_keywords) {
        goto end;
    }

    
    title_keywords_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(title_keywords); //nonprimitive



    title_keywords_filter_local_var = title_keywords_filter_create_internal (
        title_keywords_local_nonprim
        );

    if (!title_keywords_filter_local_var) {
        goto end;
    }

    return title_keywords_filter_local_var;
end:
    if (title_keywords_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(title_keywords_local_nonprim);
        title_keywords_local_nonprim = NULL;
    }
    return NULL;

}
