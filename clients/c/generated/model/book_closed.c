#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "book_closed.h"



static book_closed_t *book_closed_create_internal(
    int *conversion_metrics_ready,
    int *non_conversion_metrics_ready
    ) {
    book_closed_t *book_closed_local_var = malloc(sizeof(book_closed_t));
    if (!book_closed_local_var) {
        return NULL;
    }
    memset(book_closed_local_var, 0, sizeof(book_closed_t));
    book_closed_local_var->_library_owned = 1;
    book_closed_local_var->conversion_metrics_ready = conversion_metrics_ready;
    book_closed_local_var->non_conversion_metrics_ready = non_conversion_metrics_ready;
    return book_closed_local_var;
}

__attribute__((deprecated)) book_closed_t *book_closed_create(
    int *conversion_metrics_ready,
    int *non_conversion_metrics_ready
    ) {
    int *conversion_metrics_ready_copy = NULL;
    if (conversion_metrics_ready) {
        conversion_metrics_ready_copy = malloc(sizeof(int));
        if (conversion_metrics_ready_copy) *conversion_metrics_ready_copy = *conversion_metrics_ready;
    }
    int *non_conversion_metrics_ready_copy = NULL;
    if (non_conversion_metrics_ready) {
        non_conversion_metrics_ready_copy = malloc(sizeof(int));
        if (non_conversion_metrics_ready_copy) *non_conversion_metrics_ready_copy = *non_conversion_metrics_ready;
    }
    book_closed_t *result = book_closed_create_internal (
        conversion_metrics_ready_copy,
        non_conversion_metrics_ready_copy
        );
    if (!result) {
        free(conversion_metrics_ready_copy);
        free(non_conversion_metrics_ready_copy);
    }
    return result;
}

void book_closed_free(book_closed_t *book_closed) {
    if(NULL == book_closed){
        return ;
    }
    if(book_closed->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "book_closed_free");
        return ;
    }
    listEntry_t *listEntry;
    if (book_closed->conversion_metrics_ready) {
        free(book_closed->conversion_metrics_ready);
        book_closed->conversion_metrics_ready = NULL;
    }
    if (book_closed->non_conversion_metrics_ready) {
        free(book_closed->non_conversion_metrics_ready);
        book_closed->non_conversion_metrics_ready = NULL;
    }
    free(book_closed);
}

cJSON *book_closed_convertToJSON(book_closed_t *book_closed) {
    cJSON *item = cJSON_CreateObject();

    // book_closed->conversion_metrics_ready
    if (!book_closed->conversion_metrics_ready) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "conversion_metrics_ready", *book_closed->conversion_metrics_ready) == NULL) {
    goto fail; //Bool
    }


    // book_closed->non_conversion_metrics_ready
    if (!book_closed->non_conversion_metrics_ready) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "non_conversion_metrics_ready", *book_closed->non_conversion_metrics_ready) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

book_closed_t *book_closed_parseFromJSON(cJSON *book_closedJSON){

    book_closed_t *book_closed_local_var = NULL;

    // define the local variable for book_closed->conversion_metrics_ready
    int *conversion_metrics_ready_local_var = NULL;

    // define the local variable for book_closed->non_conversion_metrics_ready
    int *non_conversion_metrics_ready_local_var = NULL;

    // book_closed->conversion_metrics_ready
    cJSON *conversion_metrics_ready = cJSON_GetObjectItemCaseSensitive(book_closedJSON, "conversion_metrics_ready");
    if (cJSON_IsNull(conversion_metrics_ready)) {
        conversion_metrics_ready = NULL;
    }
    if (!conversion_metrics_ready) {
        goto end;
    }

    
    if(!cJSON_IsBool(conversion_metrics_ready))
    {
    goto end; //Bool
    }
    conversion_metrics_ready_local_var = malloc(sizeof(int));
    if(!conversion_metrics_ready_local_var)
    {
        goto end;
    }
    *conversion_metrics_ready_local_var = conversion_metrics_ready->valueint;

    // book_closed->non_conversion_metrics_ready
    cJSON *non_conversion_metrics_ready = cJSON_GetObjectItemCaseSensitive(book_closedJSON, "non_conversion_metrics_ready");
    if (cJSON_IsNull(non_conversion_metrics_ready)) {
        non_conversion_metrics_ready = NULL;
    }
    if (!non_conversion_metrics_ready) {
        goto end;
    }

    
    if(!cJSON_IsBool(non_conversion_metrics_ready))
    {
    goto end; //Bool
    }
    non_conversion_metrics_ready_local_var = malloc(sizeof(int));
    if(!non_conversion_metrics_ready_local_var)
    {
        goto end;
    }
    *non_conversion_metrics_ready_local_var = non_conversion_metrics_ready->valueint;



    book_closed_local_var = book_closed_create_internal (
        conversion_metrics_ready_local_var,
        non_conversion_metrics_ready_local_var
        );

    if (!book_closed_local_var) {
        goto end;
    }

    return book_closed_local_var;
end:
    if (conversion_metrics_ready_local_var) {
        free(conversion_metrics_ready_local_var);
        conversion_metrics_ready_local_var = NULL;
    }
    if (non_conversion_metrics_ready_local_var) {
        free(non_conversion_metrics_ready_local_var);
        non_conversion_metrics_ready_local_var = NULL;
    }
    return NULL;

}
