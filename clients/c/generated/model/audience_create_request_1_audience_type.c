#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_create_request_1_audience_type.h"



audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_create(
    ) {
    audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_local_var = malloc(sizeof(audience_create_request_1_audience_type_t));
    if (!audience_create_request_1_audience_type_local_var) {
        return NULL;
    }

    return audience_create_request_1_audience_type_local_var;
}


void audience_create_request_1_audience_type_free(audience_create_request_1_audience_type_t *audience_create_request_1_audience_type) {
    if(NULL == audience_create_request_1_audience_type){
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


    audience_create_request_1_audience_type_local_var = audience_create_request_1_audience_type_create (
        );

    return audience_create_request_1_audience_type_local_var;
end:
    return NULL;

}
