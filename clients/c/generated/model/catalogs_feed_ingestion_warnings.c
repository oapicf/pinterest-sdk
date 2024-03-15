#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion_warnings.h"



catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_create(
    int additional_image_level_internal_error,
    int additional_image_file_not_accessible,
    int additional_image_malformed_url,
    int additional_image_file_not_found,
    int additional_image_invalid_file,
    int hotel_price_header_is_present
    ) {
    catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_local_var = malloc(sizeof(catalogs_feed_ingestion_warnings_t));
    if (!catalogs_feed_ingestion_warnings_local_var) {
        return NULL;
    }
    catalogs_feed_ingestion_warnings_local_var->additional_image_level_internal_error = additional_image_level_internal_error;
    catalogs_feed_ingestion_warnings_local_var->additional_image_file_not_accessible = additional_image_file_not_accessible;
    catalogs_feed_ingestion_warnings_local_var->additional_image_malformed_url = additional_image_malformed_url;
    catalogs_feed_ingestion_warnings_local_var->additional_image_file_not_found = additional_image_file_not_found;
    catalogs_feed_ingestion_warnings_local_var->additional_image_invalid_file = additional_image_invalid_file;
    catalogs_feed_ingestion_warnings_local_var->hotel_price_header_is_present = hotel_price_header_is_present;

    return catalogs_feed_ingestion_warnings_local_var;
}


void catalogs_feed_ingestion_warnings_free(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings) {
    if(NULL == catalogs_feed_ingestion_warnings){
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_feed_ingestion_warnings);
}

cJSON *catalogs_feed_ingestion_warnings_convertToJSON(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion_warnings->additional_image_level_internal_error
    if(catalogs_feed_ingestion_warnings->additional_image_level_internal_error) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", catalogs_feed_ingestion_warnings->additional_image_level_internal_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_file_not_accessible
    if(catalogs_feed_ingestion_warnings->additional_image_file_not_accessible) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", catalogs_feed_ingestion_warnings->additional_image_file_not_accessible) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_malformed_url
    if(catalogs_feed_ingestion_warnings->additional_image_malformed_url) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_MALFORMED_URL", catalogs_feed_ingestion_warnings->additional_image_malformed_url) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_file_not_found
    if(catalogs_feed_ingestion_warnings->additional_image_file_not_found) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_FILE_NOT_FOUND", catalogs_feed_ingestion_warnings->additional_image_file_not_found) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_invalid_file
    if(catalogs_feed_ingestion_warnings->additional_image_invalid_file) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_INVALID_FILE", catalogs_feed_ingestion_warnings->additional_image_invalid_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->hotel_price_header_is_present
    if(catalogs_feed_ingestion_warnings->hotel_price_header_is_present) {
    if(cJSON_AddNumberToObject(item, "HOTEL_PRICE_HEADER_IS_PRESENT", catalogs_feed_ingestion_warnings->hotel_price_header_is_present) == NULL) {
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

catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_parseFromJSON(cJSON *catalogs_feed_ingestion_warningsJSON){

    catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_local_var = NULL;

    // catalogs_feed_ingestion_warnings->additional_image_level_internal_error
    cJSON *additional_image_level_internal_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR");
    if (additional_image_level_internal_error) { 
    if(!cJSON_IsNumber(additional_image_level_internal_error))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_warnings->additional_image_file_not_accessible
    cJSON *additional_image_file_not_accessible = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE");
    if (additional_image_file_not_accessible) { 
    if(!cJSON_IsNumber(additional_image_file_not_accessible))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_warnings->additional_image_malformed_url
    cJSON *additional_image_malformed_url = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_MALFORMED_URL");
    if (additional_image_malformed_url) { 
    if(!cJSON_IsNumber(additional_image_malformed_url))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_warnings->additional_image_file_not_found
    cJSON *additional_image_file_not_found = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_FILE_NOT_FOUND");
    if (additional_image_file_not_found) { 
    if(!cJSON_IsNumber(additional_image_file_not_found))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_warnings->additional_image_invalid_file
    cJSON *additional_image_invalid_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_INVALID_FILE");
    if (additional_image_invalid_file) { 
    if(!cJSON_IsNumber(additional_image_invalid_file))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_warnings->hotel_price_header_is_present
    cJSON *hotel_price_header_is_present = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "HOTEL_PRICE_HEADER_IS_PRESENT");
    if (hotel_price_header_is_present) { 
    if(!cJSON_IsNumber(hotel_price_header_is_present))
    {
    goto end; //Numeric
    }
    }


    catalogs_feed_ingestion_warnings_local_var = catalogs_feed_ingestion_warnings_create (
        additional_image_level_internal_error ? additional_image_level_internal_error->valuedouble : 0,
        additional_image_file_not_accessible ? additional_image_file_not_accessible->valuedouble : 0,
        additional_image_malformed_url ? additional_image_malformed_url->valuedouble : 0,
        additional_image_file_not_found ? additional_image_file_not_found->valuedouble : 0,
        additional_image_invalid_file ? additional_image_invalid_file->valuedouble : 0,
        hotel_price_header_is_present ? hotel_price_header_is_present->valuedouble : 0
        );

    return catalogs_feed_ingestion_warnings_local_var;
end:
    return NULL;

}
