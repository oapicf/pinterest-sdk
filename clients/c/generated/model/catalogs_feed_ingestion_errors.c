#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion_errors.h"


char* catalogs_feed_ingestion_errors_large_product_count_decrease_ToString(pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE_e large_product_count_decrease) {
    char* large_product_count_decreaseArray[] =  { "NULL", "1" };
    return large_product_count_decreaseArray[large_product_count_decrease];
}

pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE_e catalogs_feed_ingestion_errors_large_product_count_decrease_FromString(char* large_product_count_decrease){
    int stringToReturn = 0;
    char *large_product_count_decreaseArray[] =  { "NULL", "1" };
    size_t sizeofArray = sizeof(large_product_count_decreaseArray) / sizeof(large_product_count_decreaseArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(large_product_count_decrease, large_product_count_decreaseArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors_create_internal(
    int account_flagged,
    int fetch_google_sheet_not_shared,
    int image_file_not_accessible,
    int image_file_not_found,
    int image_invalid_file,
    int image_level_internal_error,
    int image_malformed_url,
    int large_product_count_decrease,
    int line_level_internal_error
    ) {
    catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors_local_var = malloc(sizeof(catalogs_feed_ingestion_errors_t));
    if (!catalogs_feed_ingestion_errors_local_var) {
        return NULL;
    }
    catalogs_feed_ingestion_errors_local_var->account_flagged = account_flagged;
    catalogs_feed_ingestion_errors_local_var->fetch_google_sheet_not_shared = fetch_google_sheet_not_shared;
    catalogs_feed_ingestion_errors_local_var->image_file_not_accessible = image_file_not_accessible;
    catalogs_feed_ingestion_errors_local_var->image_file_not_found = image_file_not_found;
    catalogs_feed_ingestion_errors_local_var->image_invalid_file = image_invalid_file;
    catalogs_feed_ingestion_errors_local_var->image_level_internal_error = image_level_internal_error;
    catalogs_feed_ingestion_errors_local_var->image_malformed_url = image_malformed_url;
    catalogs_feed_ingestion_errors_local_var->large_product_count_decrease = large_product_count_decrease;
    catalogs_feed_ingestion_errors_local_var->line_level_internal_error = line_level_internal_error;

    catalogs_feed_ingestion_errors_local_var->_library_owned = 1;
    return catalogs_feed_ingestion_errors_local_var;
}

__attribute__((deprecated)) catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors_create(
    int account_flagged,
    int fetch_google_sheet_not_shared,
    int image_file_not_accessible,
    int image_file_not_found,
    int image_invalid_file,
    int image_level_internal_error,
    int image_malformed_url,
    int large_product_count_decrease,
    int line_level_internal_error
    ) {
    return catalogs_feed_ingestion_errors_create_internal (
        account_flagged,
        fetch_google_sheet_not_shared,
        image_file_not_accessible,
        image_file_not_found,
        image_invalid_file,
        image_level_internal_error,
        image_malformed_url,
        large_product_count_decrease,
        line_level_internal_error
        );
}

void catalogs_feed_ingestion_errors_free(catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors) {
    if(NULL == catalogs_feed_ingestion_errors){
        return ;
    }
    if(catalogs_feed_ingestion_errors->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_ingestion_errors_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_feed_ingestion_errors);
}

cJSON *catalogs_feed_ingestion_errors_convertToJSON(catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion_errors->account_flagged
    if(catalogs_feed_ingestion_errors->account_flagged) {
    if(cJSON_AddNumberToObject(item, "ACCOUNT_FLAGGED", catalogs_feed_ingestion_errors->account_flagged) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->fetch_google_sheet_not_shared
    if(catalogs_feed_ingestion_errors->fetch_google_sheet_not_shared) {
    if(cJSON_AddNumberToObject(item, "FETCH_GOOGLE_SHEET_NOT_SHARED", catalogs_feed_ingestion_errors->fetch_google_sheet_not_shared) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->image_file_not_accessible
    if(catalogs_feed_ingestion_errors->image_file_not_accessible) {
    if(cJSON_AddNumberToObject(item, "IMAGE_FILE_NOT_ACCESSIBLE", catalogs_feed_ingestion_errors->image_file_not_accessible) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->image_file_not_found
    if(catalogs_feed_ingestion_errors->image_file_not_found) {
    if(cJSON_AddNumberToObject(item, "IMAGE_FILE_NOT_FOUND", catalogs_feed_ingestion_errors->image_file_not_found) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->image_invalid_file
    if(catalogs_feed_ingestion_errors->image_invalid_file) {
    if(cJSON_AddNumberToObject(item, "IMAGE_INVALID_FILE", catalogs_feed_ingestion_errors->image_invalid_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->image_level_internal_error
    if(catalogs_feed_ingestion_errors->image_level_internal_error) {
    if(cJSON_AddNumberToObject(item, "IMAGE_LEVEL_INTERNAL_ERROR", catalogs_feed_ingestion_errors->image_level_internal_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->image_malformed_url
    if(catalogs_feed_ingestion_errors->image_malformed_url) {
    if(cJSON_AddNumberToObject(item, "IMAGE_MALFORMED_URL", catalogs_feed_ingestion_errors->image_malformed_url) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->large_product_count_decrease
    if(catalogs_feed_ingestion_errors->large_product_count_decrease != pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE_NULL) {
    if(cJSON_AddNumberToObject(item, "LARGE_PRODUCT_COUNT_DECREASE", catalogs_feed_ingestion_errors->large_product_count_decrease) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_errors->line_level_internal_error
    if(catalogs_feed_ingestion_errors->line_level_internal_error) {
    if(cJSON_AddNumberToObject(item, "LINE_LEVEL_INTERNAL_ERROR", catalogs_feed_ingestion_errors->line_level_internal_error) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors_parseFromJSON(cJSON *catalogs_feed_ingestion_errorsJSON){

    catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors_local_var = NULL;

    // catalogs_feed_ingestion_errors->account_flagged
    cJSON *account_flagged = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "ACCOUNT_FLAGGED");
    if (cJSON_IsNull(account_flagged)) {
        account_flagged = NULL;
    }
    if (account_flagged) { 
    if(!cJSON_IsNumber(account_flagged))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->fetch_google_sheet_not_shared
    cJSON *fetch_google_sheet_not_shared = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "FETCH_GOOGLE_SHEET_NOT_SHARED");
    if (cJSON_IsNull(fetch_google_sheet_not_shared)) {
        fetch_google_sheet_not_shared = NULL;
    }
    if (fetch_google_sheet_not_shared) { 
    if(!cJSON_IsNumber(fetch_google_sheet_not_shared))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->image_file_not_accessible
    cJSON *image_file_not_accessible = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "IMAGE_FILE_NOT_ACCESSIBLE");
    if (cJSON_IsNull(image_file_not_accessible)) {
        image_file_not_accessible = NULL;
    }
    if (image_file_not_accessible) { 
    if(!cJSON_IsNumber(image_file_not_accessible))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->image_file_not_found
    cJSON *image_file_not_found = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "IMAGE_FILE_NOT_FOUND");
    if (cJSON_IsNull(image_file_not_found)) {
        image_file_not_found = NULL;
    }
    if (image_file_not_found) { 
    if(!cJSON_IsNumber(image_file_not_found))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->image_invalid_file
    cJSON *image_invalid_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "IMAGE_INVALID_FILE");
    if (cJSON_IsNull(image_invalid_file)) {
        image_invalid_file = NULL;
    }
    if (image_invalid_file) { 
    if(!cJSON_IsNumber(image_invalid_file))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->image_level_internal_error
    cJSON *image_level_internal_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "IMAGE_LEVEL_INTERNAL_ERROR");
    if (cJSON_IsNull(image_level_internal_error)) {
        image_level_internal_error = NULL;
    }
    if (image_level_internal_error) { 
    if(!cJSON_IsNumber(image_level_internal_error))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->image_malformed_url
    cJSON *image_malformed_url = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "IMAGE_MALFORMED_URL");
    if (cJSON_IsNull(image_malformed_url)) {
        image_malformed_url = NULL;
    }
    if (image_malformed_url) { 
    if(!cJSON_IsNumber(image_malformed_url))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->large_product_count_decrease
    cJSON *large_product_count_decrease = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "LARGE_PRODUCT_COUNT_DECREASE");
    if (cJSON_IsNull(large_product_count_decrease)) {
        large_product_count_decrease = NULL;
    }
    if (large_product_count_decrease) { 
    if(!cJSON_IsNumber(large_product_count_decrease))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_errors->line_level_internal_error
    cJSON *line_level_internal_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_errorsJSON, "LINE_LEVEL_INTERNAL_ERROR");
    if (cJSON_IsNull(line_level_internal_error)) {
        line_level_internal_error = NULL;
    }
    if (line_level_internal_error) { 
    if(!cJSON_IsNumber(line_level_internal_error))
    {
    goto end; //Numeric
    }
    }


    catalogs_feed_ingestion_errors_local_var = catalogs_feed_ingestion_errors_create_internal (
        account_flagged ? account_flagged->valuedouble : 0,
        fetch_google_sheet_not_shared ? fetch_google_sheet_not_shared->valuedouble : 0,
        image_file_not_accessible ? image_file_not_accessible->valuedouble : 0,
        image_file_not_found ? image_file_not_found->valuedouble : 0,
        image_invalid_file ? image_invalid_file->valuedouble : 0,
        image_level_internal_error ? image_level_internal_error->valuedouble : 0,
        image_malformed_url ? image_malformed_url->valuedouble : 0,
        large_product_count_decrease ? large_product_count_decrease->valuedouble : 0,
        line_level_internal_error ? line_level_internal_error->valuedouble : 0
        );

    return catalogs_feed_ingestion_errors_local_var;
end:
    return NULL;

}
