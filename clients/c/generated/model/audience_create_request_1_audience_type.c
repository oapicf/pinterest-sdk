#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_create_request_1_audience_type.h"



static audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_create_internal(
    ) {
    audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_local_var = malloc(sizeof(audience_create_request_1_audience_type_t));
    if (!audience_create_request_1_audience_type_local_var) {
        return NULL;
    }

    audience_create_request_1_audience_type_local_var->_library_owned = 1;
    return audience_create_request_1_audience_type_local_var;
}

__attribute__((deprecated)) audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_create(
    ) {
    return audience_create_request_1_audience_type_create_internal (
        );
}

void audience_create_request_1_audience_type_free(audience_create_request_1_audience_type_t *audience_create_request_1_audience_type) {
    if(NULL == audience_create_request_1_audience_type){
        return ;
    }
    if(audience_create_request_1_audience_type->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_create_request_1_audience_type_free");
        return ;
    }
    listEntry_t *listEntry;
    free(audience_create_request_1_audience_type);
}

cJSON *audience_create_request_1_audience_type_convertToJSON(audience_create_request_1_audience_type_t *audience_create_request_1_audience_type) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_parseFromJSON(cJSON *audience_create_request_1_audience_typeJSON){

    audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_local_var = NULL;


    audience_create_request_1_audience_type_local_var = audience_create_request_1_audience_type_create_internal (
        );

    return audience_create_request_1_audience_type_local_var;
end:
    return NULL;

}
