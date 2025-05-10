#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_mmm_report_response.h"



static create_mmm_report_response_t *create_mmm_report_response_create_internal(
    double code,
    create_mmm_report_response_data_t *data
    ) {
    create_mmm_report_response_t *create_mmm_report_response_local_var = malloc(sizeof(create_mmm_report_response_t));
    if (!create_mmm_report_response_local_var) {
        return NULL;
    }
    create_mmm_report_response_local_var->code = code;
    create_mmm_report_response_local_var->data = data;

    create_mmm_report_response_local_var->_library_owned = 1;
    return create_mmm_report_response_local_var;
}

__attribute__((deprecated)) create_mmm_report_response_t *create_mmm_report_response_create(
    double code,
    create_mmm_report_response_data_t *data
    ) {
    return create_mmm_report_response_create_internal (
        code,
        data
        );
}

void create_mmm_report_response_free(create_mmm_report_response_t *create_mmm_report_response) {
    if(NULL == create_mmm_report_response){
        return ;
    }
    if(create_mmm_report_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_mmm_report_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_mmm_report_response->data) {
        create_mmm_report_response_data_free(create_mmm_report_response->data);
        create_mmm_report_response->data = NULL;
    }
    free(create_mmm_report_response);
}

cJSON *create_mmm_report_response_convertToJSON(create_mmm_report_response_t *create_mmm_report_response) {
    cJSON *item = cJSON_CreateObject();

    // create_mmm_report_response->code
    if(create_mmm_report_response->code) {
    if(cJSON_AddNumberToObject(item, "code", create_mmm_report_response->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_mmm_report_response->data
    if(create_mmm_report_response->data) {
    cJSON *data_local_JSON = create_mmm_report_response_data_convertToJSON(create_mmm_report_response->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
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

create_mmm_report_response_t *create_mmm_report_response_parseFromJSON(cJSON *create_mmm_report_responseJSON){

    create_mmm_report_response_t *create_mmm_report_response_local_var = NULL;

    // define the local variable for create_mmm_report_response->data
    create_mmm_report_response_data_t *data_local_nonprim = NULL;

    // create_mmm_report_response->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(create_mmm_report_responseJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // create_mmm_report_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(create_mmm_report_responseJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = create_mmm_report_response_data_parseFromJSON(data); //nonprimitive
    }


    create_mmm_report_response_local_var = create_mmm_report_response_create_internal (
        code ? code->valuedouble : 0,
        data ? data_local_nonprim : NULL
        );

    return create_mmm_report_response_local_var;
end:
    if (data_local_nonprim) {
        create_mmm_report_response_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
