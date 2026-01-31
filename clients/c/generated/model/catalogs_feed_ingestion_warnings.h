/*
 * catalogs_feed_ingestion_warnings.h
 *
 * 
 */

#ifndef _catalogs_feed_ingestion_warnings_H_
#define _catalogs_feed_ingestion_warnings_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_ingestion_warnings_t catalogs_feed_ingestion_warnings_t;




typedef struct catalogs_feed_ingestion_warnings_t {
    int ad_image_download_content_read_error; //numeric
    int ad_image_download_dns_lookup_error; //numeric
    int ad_image_download_file_not_accessible; //numeric
    int ad_image_download_file_not_found; //numeric
    int ad_image_download_http_status_400; //numeric
    int ad_image_download_http_status_403; //numeric
    int ad_image_download_http_status_404; //numeric
    int ad_image_download_http_status_405; //numeric
    int ad_image_download_http_status_410; //numeric
    int ad_image_download_http_status_429; //numeric
    int ad_image_download_http_status_500; //numeric
    int ad_image_download_http_status_502; //numeric
    int ad_image_download_http_status_503; //numeric
    int ad_image_download_http_status_504; //numeric
    int ad_image_download_http_status_507; //numeric
    int ad_image_download_http_status_508; //numeric
    int ad_image_download_http_status_520; //numeric
    int ad_image_download_http_status_521; //numeric
    int ad_image_download_http_status_522; //numeric
    int ad_image_download_http_status_525; //numeric
    int ad_image_download_internal_configuration_error; //numeric
    int ad_image_download_internal_error; //numeric
    int ad_image_download_internal_failed_to_download; //numeric
    int ad_image_download_internal_malformed_url; //numeric
    int ad_image_download_internal_rate_limited; //numeric
    int ad_image_download_internal_request_expired; //numeric
    int ad_image_download_invalid_file; //numeric
    int ad_image_download_site_error; //numeric
    int ad_image_download_site_timeout; //numeric
    int ad_image_download_ssl_error; //numeric
    int ad_image_download_ssl_handshake_error; //numeric
    int ad_image_processing_empty_file; //numeric
    int ad_image_processing_height_too_small; //numeric
    int ad_image_processing_too_many_pixels; //numeric
    int ad_image_processing_type_mismatch; //numeric
    int ad_image_processing_width_too_small; //numeric
    int ad_video_download_content_read_error; //numeric
    int ad_video_download_dns_lookup_error; //numeric
    int ad_video_download_file_not_accessible; //numeric
    int ad_video_download_file_not_found; //numeric
    int ad_video_download_http_status_400; //numeric
    int ad_video_download_http_status_403; //numeric
    int ad_video_download_http_status_404; //numeric
    int ad_video_download_http_status_405; //numeric
    int ad_video_download_http_status_410; //numeric
    int ad_video_download_http_status_429; //numeric
    int ad_video_download_http_status_500; //numeric
    int ad_video_download_http_status_502; //numeric
    int ad_video_download_http_status_503; //numeric
    int ad_video_download_http_status_504; //numeric
    int ad_video_download_http_status_507; //numeric
    int ad_video_download_http_status_508; //numeric
    int ad_video_download_http_status_520; //numeric
    int ad_video_download_http_status_521; //numeric
    int ad_video_download_http_status_522; //numeric
    int ad_video_download_http_status_525; //numeric
    int ad_video_download_internal_configuration_error; //numeric
    int ad_video_download_internal_error; //numeric
    int ad_video_download_internal_failed_to_download; //numeric
    int ad_video_download_internal_malformed_url; //numeric
    int ad_video_download_internal_rate_limited; //numeric
    int ad_video_download_internal_request_expired; //numeric
    int ad_video_download_invalid_file; //numeric
    int ad_video_download_site_error; //numeric
    int ad_video_download_site_timeout; //numeric
    int ad_video_download_ssl_error; //numeric
    int ad_video_download_ssl_handshake_error; //numeric
    int ad_video_length_too_short; //numeric
    int ad_video_processing_empty_file; //numeric
    int ad_video_processing_height_too_small; //numeric
    int ad_video_processing_too_many_pixels; //numeric
    int ad_video_processing_type_mismatch; //numeric
    int ad_video_processing_width_too_small; //numeric
    int additional_image_file_not_accessible; //numeric
    int additional_image_file_not_found; //numeric
    int additional_image_invalid_file; //numeric
    int additional_image_level_internal_error; //numeric
    int additional_image_malformed_url; //numeric
    int fetch_google_sheet_public_can_edit; //numeric
    int hotel_price_header_is_present; //numeric
    int video_download_video_too_short; //numeric
    int video_file_not_accessible; //numeric
    int video_file_not_found; //numeric
    int video_invalid_file; //numeric
    int video_level_internal_error; //numeric
    int video_malformed_url; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_ingestion_warnings_t;

__attribute__((deprecated)) catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_create(
    int ad_image_download_content_read_error,
    int ad_image_download_dns_lookup_error,
    int ad_image_download_file_not_accessible,
    int ad_image_download_file_not_found,
    int ad_image_download_http_status_400,
    int ad_image_download_http_status_403,
    int ad_image_download_http_status_404,
    int ad_image_download_http_status_405,
    int ad_image_download_http_status_410,
    int ad_image_download_http_status_429,
    int ad_image_download_http_status_500,
    int ad_image_download_http_status_502,
    int ad_image_download_http_status_503,
    int ad_image_download_http_status_504,
    int ad_image_download_http_status_507,
    int ad_image_download_http_status_508,
    int ad_image_download_http_status_520,
    int ad_image_download_http_status_521,
    int ad_image_download_http_status_522,
    int ad_image_download_http_status_525,
    int ad_image_download_internal_configuration_error,
    int ad_image_download_internal_error,
    int ad_image_download_internal_failed_to_download,
    int ad_image_download_internal_malformed_url,
    int ad_image_download_internal_rate_limited,
    int ad_image_download_internal_request_expired,
    int ad_image_download_invalid_file,
    int ad_image_download_site_error,
    int ad_image_download_site_timeout,
    int ad_image_download_ssl_error,
    int ad_image_download_ssl_handshake_error,
    int ad_image_processing_empty_file,
    int ad_image_processing_height_too_small,
    int ad_image_processing_too_many_pixels,
    int ad_image_processing_type_mismatch,
    int ad_image_processing_width_too_small,
    int ad_video_download_content_read_error,
    int ad_video_download_dns_lookup_error,
    int ad_video_download_file_not_accessible,
    int ad_video_download_file_not_found,
    int ad_video_download_http_status_400,
    int ad_video_download_http_status_403,
    int ad_video_download_http_status_404,
    int ad_video_download_http_status_405,
    int ad_video_download_http_status_410,
    int ad_video_download_http_status_429,
    int ad_video_download_http_status_500,
    int ad_video_download_http_status_502,
    int ad_video_download_http_status_503,
    int ad_video_download_http_status_504,
    int ad_video_download_http_status_507,
    int ad_video_download_http_status_508,
    int ad_video_download_http_status_520,
    int ad_video_download_http_status_521,
    int ad_video_download_http_status_522,
    int ad_video_download_http_status_525,
    int ad_video_download_internal_configuration_error,
    int ad_video_download_internal_error,
    int ad_video_download_internal_failed_to_download,
    int ad_video_download_internal_malformed_url,
    int ad_video_download_internal_rate_limited,
    int ad_video_download_internal_request_expired,
    int ad_video_download_invalid_file,
    int ad_video_download_site_error,
    int ad_video_download_site_timeout,
    int ad_video_download_ssl_error,
    int ad_video_download_ssl_handshake_error,
    int ad_video_length_too_short,
    int ad_video_processing_empty_file,
    int ad_video_processing_height_too_small,
    int ad_video_processing_too_many_pixels,
    int ad_video_processing_type_mismatch,
    int ad_video_processing_width_too_small,
    int additional_image_file_not_accessible,
    int additional_image_file_not_found,
    int additional_image_invalid_file,
    int additional_image_level_internal_error,
    int additional_image_malformed_url,
    int fetch_google_sheet_public_can_edit,
    int hotel_price_header_is_present,
    int video_download_video_too_short,
    int video_file_not_accessible,
    int video_file_not_found,
    int video_invalid_file,
    int video_level_internal_error,
    int video_malformed_url
);

void catalogs_feed_ingestion_warnings_free(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings);

catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_parseFromJSON(cJSON *catalogs_feed_ingestion_warningsJSON);

cJSON *catalogs_feed_ingestion_warnings_convertToJSON(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings);

#endif /* _catalogs_feed_ingestion_warnings_H_ */

