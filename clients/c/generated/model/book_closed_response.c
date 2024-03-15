#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "book_closed_response.h"



book_closed_response_t *book_closed_response_create(
    int conversion_metrics_ready,
    int non_conversion_metrics_ready
    ) {
    book_closed_response_t *book_closed_response_local_var = malloc(sizeof(book_closed_response_t));
    if (!book_closed_response_local_var) {
        return NULL;
    }
    book_closed_response_local_var->conversion_metrics_ready = conversion_metrics_ready;
    book_closed_response_local_var->non_conversion_metrics_ready = non_conversion_metrics_ready;

    return book_closed_response_local_var;
}


void book_closed_response_free(book_closed_response_t *book_closed_response) {
    if(NULL == book_closed_response){
        return ;
    }
    listEntry_t *listEntry;
    free(book_closed_response);
}

cJSON *book_closed_response_convertToJSON(book_closed_response_t *book_closed_response) {
    cJSON *item = cJSON_CreateObject();

    // book_closed_response->conversion_metrics_ready
    if(book_closed_response->conversion_metrics_ready) {
    if(cJSON_AddBoolToObject(item, "conversion_metrics_ready", book_closed_response->conversion_metrics_ready) == NULL) {
    goto fail; //Bool
    }
    }


    // book_closed_response->non_conversion_metrics_ready
    if(book_closed_response->non_conversion_metrics_ready) {
    if(cJSON_AddBoolToObject(item, "non_conversion_metrics_ready", book_closed_response->non_conversion_metrics_ready) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

book_closed_response_t *book_closed_response_parseFromJSON(cJSON *book_closed_responseJSON){

    book_closed_response_t *book_closed_response_local_var = NULL;

    // book_closed_response->conversion_metrics_ready
    cJSON *conversion_metrics_ready = cJSON_GetObjectItemCaseSensitive(book_closed_responseJSON, "conversion_metrics_ready");
    if (conversion_metrics_ready) { 
    if(!cJSON_IsBool(conversion_metrics_ready))
    {
    goto end; //Bool
    }
    }

    // book_closed_response->non_conversion_metrics_ready
    cJSON *non_conversion_metrics_ready = cJSON_GetObjectItemCaseSensitive(book_closed_responseJSON, "non_conversion_metrics_ready");
    if (non_conversion_metrics_ready) { 
    if(!cJSON_IsBool(non_conversion_metrics_ready))
    {
    goto end; //Bool
    }
    }


    book_closed_response_local_var = book_closed_response_create (
        conversion_metrics_ready ? conversion_metrics_ready->valueint : 0,
        non_conversion_metrics_ready ? non_conversion_metrics_ready->valueint : 0
        );

    return book_closed_response_local_var;
end:
    return NULL;

}
