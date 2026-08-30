#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "link_filter.h"



static link_filter_t *link_filter_create_internal(
    catalogs_product_group_filter_operator_type_criteria_t *link
    ) {
    link_filter_t *link_filter_local_var = malloc(sizeof(link_filter_t));
    if (!link_filter_local_var) {
        return NULL;
    }
    memset(link_filter_local_var, 0, sizeof(link_filter_t));
    link_filter_local_var->_library_owned = 1;
    link_filter_local_var->link = link;
    return link_filter_local_var;
}

__attribute__((deprecated)) link_filter_t *link_filter_create(
    catalogs_product_group_filter_operator_type_criteria_t *link
    ) {
    link_filter_t *result = link_filter_create_internal (
        link
        );
    if (!result) {
    }
    return result;
}

void link_filter_free(link_filter_t *link_filter) {
    if(NULL == link_filter){
        return ;
    }
    if(link_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "link_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (link_filter->link) {
        catalogs_product_group_filter_operator_type_criteria_free(link_filter->link);
        link_filter->link = NULL;
    }
    free(link_filter);
}

cJSON *link_filter_convertToJSON(link_filter_t *link_filter) {
    cJSON *item = cJSON_CreateObject();

    // link_filter->link
    if (!link_filter->link) {
        goto fail;
    }
    cJSON *link_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(link_filter->link);
    if(link_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "LINK", link_local_JSON);
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

link_filter_t *link_filter_parseFromJSON(cJSON *link_filterJSON){

    link_filter_t *link_filter_local_var = NULL;

    // define the local variable for link_filter->link
    catalogs_product_group_filter_operator_type_criteria_t *link_local_nonprim = NULL;

    // link_filter->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(link_filterJSON, "LINK");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (!link) {
        goto end;
    }

    
    link_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(link); //nonprimitive



    link_filter_local_var = link_filter_create_internal (
        link_local_nonprim
        );

    if (!link_filter_local_var) {
        goto end;
    }

    return link_filter_local_var;
end:
    if (link_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(link_local_nonprim);
        link_local_nonprim = NULL;
    }
    return NULL;

}
