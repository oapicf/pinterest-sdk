#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_upload_create_response.h"



static customer_list_upload_create_response_t *customer_list_upload_create_response_create_internal(
    customer_list_upload_t *customer_list_upload,
    s3_multipart_upload_data_t *s3_multipart_upload_data
    ) {
    customer_list_upload_create_response_t *customer_list_upload_create_response_local_var = malloc(sizeof(customer_list_upload_create_response_t));
    if (!customer_list_upload_create_response_local_var) {
        return NULL;
    }
    customer_list_upload_create_response_local_var->customer_list_upload = customer_list_upload;
    customer_list_upload_create_response_local_var->s3_multipart_upload_data = s3_multipart_upload_data;

    customer_list_upload_create_response_local_var->_library_owned = 1;
    return customer_list_upload_create_response_local_var;
}

__attribute__((deprecated)) customer_list_upload_create_response_t *customer_list_upload_create_response_create(
    customer_list_upload_t *customer_list_upload,
    s3_multipart_upload_data_t *s3_multipart_upload_data
    ) {
    return customer_list_upload_create_response_create_internal (
        customer_list_upload,
        s3_multipart_upload_data
        );
}

void customer_list_upload_create_response_free(customer_list_upload_create_response_t *customer_list_upload_create_response) {
    if(NULL == customer_list_upload_create_response){
        return ;
    }
    if(customer_list_upload_create_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_upload_create_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_upload_create_response->customer_list_upload) {
        customer_list_upload_free(customer_list_upload_create_response->customer_list_upload);
        customer_list_upload_create_response->customer_list_upload = NULL;
    }
    if (customer_list_upload_create_response->s3_multipart_upload_data) {
        s3_multipart_upload_data_free(customer_list_upload_create_response->s3_multipart_upload_data);
        customer_list_upload_create_response->s3_multipart_upload_data = NULL;
    }
    free(customer_list_upload_create_response);
}

cJSON *customer_list_upload_create_response_convertToJSON(customer_list_upload_create_response_t *customer_list_upload_create_response) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_upload_create_response->customer_list_upload
    if (!customer_list_upload_create_response->customer_list_upload) {
        goto fail;
    }
    cJSON *customer_list_upload_local_JSON = customer_list_upload_convertToJSON(customer_list_upload_create_response->customer_list_upload);
    if(customer_list_upload_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "customer_list_upload", customer_list_upload_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // customer_list_upload_create_response->s3_multipart_upload_data
    if (!customer_list_upload_create_response->s3_multipart_upload_data) {
        goto fail;
    }
    cJSON *s3_multipart_upload_data_local_JSON = s3_multipart_upload_data_convertToJSON(customer_list_upload_create_response->s3_multipart_upload_data);
    if(s3_multipart_upload_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "s3_multipart_upload_data", s3_multipart_upload_data_local_JSON);
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

customer_list_upload_create_response_t *customer_list_upload_create_response_parseFromJSON(cJSON *customer_list_upload_create_responseJSON){

    customer_list_upload_create_response_t *customer_list_upload_create_response_local_var = NULL;

    // define the local variable for customer_list_upload_create_response->customer_list_upload
    customer_list_upload_t *customer_list_upload_local_nonprim = NULL;

    // define the local variable for customer_list_upload_create_response->s3_multipart_upload_data
    s3_multipart_upload_data_t *s3_multipart_upload_data_local_nonprim = NULL;

    // customer_list_upload_create_response->customer_list_upload
    cJSON *customer_list_upload = cJSON_GetObjectItemCaseSensitive(customer_list_upload_create_responseJSON, "customer_list_upload");
    if (cJSON_IsNull(customer_list_upload)) {
        customer_list_upload = NULL;
    }
    if (!customer_list_upload) {
        goto end;
    }

    
    customer_list_upload_local_nonprim = customer_list_upload_parseFromJSON(customer_list_upload); //nonprimitive

    // customer_list_upload_create_response->s3_multipart_upload_data
    cJSON *s3_multipart_upload_data = cJSON_GetObjectItemCaseSensitive(customer_list_upload_create_responseJSON, "s3_multipart_upload_data");
    if (cJSON_IsNull(s3_multipart_upload_data)) {
        s3_multipart_upload_data = NULL;
    }
    if (!s3_multipart_upload_data) {
        goto end;
    }

    
    s3_multipart_upload_data_local_nonprim = s3_multipart_upload_data_parseFromJSON(s3_multipart_upload_data); //nonprimitive


    customer_list_upload_create_response_local_var = customer_list_upload_create_response_create_internal (
        customer_list_upload_local_nonprim,
        s3_multipart_upload_data_local_nonprim
        );

    return customer_list_upload_create_response_local_var;
end:
    if (customer_list_upload_local_nonprim) {
        customer_list_upload_free(customer_list_upload_local_nonprim);
        customer_list_upload_local_nonprim = NULL;
    }
    if (s3_multipart_upload_data_local_nonprim) {
        s3_multipart_upload_data_free(s3_multipart_upload_data_local_nonprim);
        s3_multipart_upload_data_local_nonprim = NULL;
    }
    return NULL;

}
