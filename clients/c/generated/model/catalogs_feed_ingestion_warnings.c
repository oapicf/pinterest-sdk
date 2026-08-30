#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion_warnings.h"



static catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_create_internal(
    int *ad_image_download_content_read_error,
    int *ad_image_download_dns_lookup_error,
    int *ad_image_download_file_not_accessible,
    int *ad_image_download_file_not_found,
    int *ad_image_download_http_status_400,
    int *ad_image_download_http_status_403,
    int *ad_image_download_http_status_404,
    int *ad_image_download_http_status_405,
    int *ad_image_download_http_status_410,
    int *ad_image_download_http_status_429,
    int *ad_image_download_http_status_500,
    int *ad_image_download_http_status_502,
    int *ad_image_download_http_status_503,
    int *ad_image_download_http_status_504,
    int *ad_image_download_http_status_507,
    int *ad_image_download_http_status_508,
    int *ad_image_download_http_status_520,
    int *ad_image_download_http_status_521,
    int *ad_image_download_http_status_522,
    int *ad_image_download_http_status_525,
    int *ad_image_download_internal_configuration_error,
    int *ad_image_download_internal_error,
    int *ad_image_download_internal_failed_to_download,
    int *ad_image_download_internal_malformed_url,
    int *ad_image_download_internal_rate_limited,
    int *ad_image_download_internal_request_expired,
    int *ad_image_download_invalid_file,
    int *ad_image_download_site_error,
    int *ad_image_download_site_timeout,
    int *ad_image_download_ssl_error,
    int *ad_image_download_ssl_handshake_error,
    int *ad_image_processing_empty_file,
    int *ad_image_processing_height_too_small,
    int *ad_image_processing_too_many_pixels,
    int *ad_image_processing_type_mismatch,
    int *ad_image_processing_width_too_small,
    int *ad_video_download_content_read_error,
    int *ad_video_download_dns_lookup_error,
    int *ad_video_download_file_not_accessible,
    int *ad_video_download_file_not_found,
    int *ad_video_download_http_status_400,
    int *ad_video_download_http_status_403,
    int *ad_video_download_http_status_404,
    int *ad_video_download_http_status_405,
    int *ad_video_download_http_status_410,
    int *ad_video_download_http_status_429,
    int *ad_video_download_http_status_500,
    int *ad_video_download_http_status_502,
    int *ad_video_download_http_status_503,
    int *ad_video_download_http_status_504,
    int *ad_video_download_http_status_507,
    int *ad_video_download_http_status_508,
    int *ad_video_download_http_status_520,
    int *ad_video_download_http_status_521,
    int *ad_video_download_http_status_522,
    int *ad_video_download_http_status_525,
    int *ad_video_download_internal_configuration_error,
    int *ad_video_download_internal_error,
    int *ad_video_download_internal_failed_to_download,
    int *ad_video_download_internal_malformed_url,
    int *ad_video_download_internal_rate_limited,
    int *ad_video_download_internal_request_expired,
    int *ad_video_download_invalid_file,
    int *ad_video_download_site_error,
    int *ad_video_download_site_timeout,
    int *ad_video_download_ssl_error,
    int *ad_video_download_ssl_handshake_error,
    int *ad_video_length_too_short,
    int *ad_video_processing_empty_file,
    int *ad_video_processing_height_too_small,
    int *ad_video_processing_too_many_pixels,
    int *ad_video_processing_type_mismatch,
    int *ad_video_processing_width_too_small,
    int *additional_image_file_not_accessible,
    int *additional_image_file_not_found,
    int *additional_image_invalid_file,
    int *additional_image_level_internal_error,
    int *additional_image_malformed_url,
    int *fetch_google_sheet_public_can_edit,
    int *hotel_price_header_is_present,
    int *video_download_video_too_short,
    int *video_file_not_accessible,
    int *video_file_not_found,
    int *video_invalid_file,
    int *video_level_internal_error,
    int *video_malformed_url
    ) {
    catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_local_var = malloc(sizeof(catalogs_feed_ingestion_warnings_t));
    if (!catalogs_feed_ingestion_warnings_local_var) {
        return NULL;
    }
    memset(catalogs_feed_ingestion_warnings_local_var, 0, sizeof(catalogs_feed_ingestion_warnings_t));
    catalogs_feed_ingestion_warnings_local_var->_library_owned = 1;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_content_read_error = ad_image_download_content_read_error;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_dns_lookup_error = ad_image_download_dns_lookup_error;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_file_not_accessible = ad_image_download_file_not_accessible;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_file_not_found = ad_image_download_file_not_found;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_400 = ad_image_download_http_status_400;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_403 = ad_image_download_http_status_403;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_404 = ad_image_download_http_status_404;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_405 = ad_image_download_http_status_405;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_410 = ad_image_download_http_status_410;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_429 = ad_image_download_http_status_429;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_500 = ad_image_download_http_status_500;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_502 = ad_image_download_http_status_502;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_503 = ad_image_download_http_status_503;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_504 = ad_image_download_http_status_504;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_507 = ad_image_download_http_status_507;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_508 = ad_image_download_http_status_508;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_520 = ad_image_download_http_status_520;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_521 = ad_image_download_http_status_521;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_522 = ad_image_download_http_status_522;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_http_status_525 = ad_image_download_http_status_525;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_internal_configuration_error = ad_image_download_internal_configuration_error;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_internal_error = ad_image_download_internal_error;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_internal_failed_to_download = ad_image_download_internal_failed_to_download;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_internal_malformed_url = ad_image_download_internal_malformed_url;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_internal_rate_limited = ad_image_download_internal_rate_limited;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_internal_request_expired = ad_image_download_internal_request_expired;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_invalid_file = ad_image_download_invalid_file;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_site_error = ad_image_download_site_error;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_site_timeout = ad_image_download_site_timeout;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_ssl_error = ad_image_download_ssl_error;
    catalogs_feed_ingestion_warnings_local_var->ad_image_download_ssl_handshake_error = ad_image_download_ssl_handshake_error;
    catalogs_feed_ingestion_warnings_local_var->ad_image_processing_empty_file = ad_image_processing_empty_file;
    catalogs_feed_ingestion_warnings_local_var->ad_image_processing_height_too_small = ad_image_processing_height_too_small;
    catalogs_feed_ingestion_warnings_local_var->ad_image_processing_too_many_pixels = ad_image_processing_too_many_pixels;
    catalogs_feed_ingestion_warnings_local_var->ad_image_processing_type_mismatch = ad_image_processing_type_mismatch;
    catalogs_feed_ingestion_warnings_local_var->ad_image_processing_width_too_small = ad_image_processing_width_too_small;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_content_read_error = ad_video_download_content_read_error;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_dns_lookup_error = ad_video_download_dns_lookup_error;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_file_not_accessible = ad_video_download_file_not_accessible;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_file_not_found = ad_video_download_file_not_found;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_400 = ad_video_download_http_status_400;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_403 = ad_video_download_http_status_403;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_404 = ad_video_download_http_status_404;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_405 = ad_video_download_http_status_405;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_410 = ad_video_download_http_status_410;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_429 = ad_video_download_http_status_429;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_500 = ad_video_download_http_status_500;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_502 = ad_video_download_http_status_502;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_503 = ad_video_download_http_status_503;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_504 = ad_video_download_http_status_504;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_507 = ad_video_download_http_status_507;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_508 = ad_video_download_http_status_508;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_520 = ad_video_download_http_status_520;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_521 = ad_video_download_http_status_521;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_522 = ad_video_download_http_status_522;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_http_status_525 = ad_video_download_http_status_525;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_internal_configuration_error = ad_video_download_internal_configuration_error;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_internal_error = ad_video_download_internal_error;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_internal_failed_to_download = ad_video_download_internal_failed_to_download;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_internal_malformed_url = ad_video_download_internal_malformed_url;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_internal_rate_limited = ad_video_download_internal_rate_limited;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_internal_request_expired = ad_video_download_internal_request_expired;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_invalid_file = ad_video_download_invalid_file;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_site_error = ad_video_download_site_error;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_site_timeout = ad_video_download_site_timeout;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_ssl_error = ad_video_download_ssl_error;
    catalogs_feed_ingestion_warnings_local_var->ad_video_download_ssl_handshake_error = ad_video_download_ssl_handshake_error;
    catalogs_feed_ingestion_warnings_local_var->ad_video_length_too_short = ad_video_length_too_short;
    catalogs_feed_ingestion_warnings_local_var->ad_video_processing_empty_file = ad_video_processing_empty_file;
    catalogs_feed_ingestion_warnings_local_var->ad_video_processing_height_too_small = ad_video_processing_height_too_small;
    catalogs_feed_ingestion_warnings_local_var->ad_video_processing_too_many_pixels = ad_video_processing_too_many_pixels;
    catalogs_feed_ingestion_warnings_local_var->ad_video_processing_type_mismatch = ad_video_processing_type_mismatch;
    catalogs_feed_ingestion_warnings_local_var->ad_video_processing_width_too_small = ad_video_processing_width_too_small;
    catalogs_feed_ingestion_warnings_local_var->additional_image_file_not_accessible = additional_image_file_not_accessible;
    catalogs_feed_ingestion_warnings_local_var->additional_image_file_not_found = additional_image_file_not_found;
    catalogs_feed_ingestion_warnings_local_var->additional_image_invalid_file = additional_image_invalid_file;
    catalogs_feed_ingestion_warnings_local_var->additional_image_level_internal_error = additional_image_level_internal_error;
    catalogs_feed_ingestion_warnings_local_var->additional_image_malformed_url = additional_image_malformed_url;
    catalogs_feed_ingestion_warnings_local_var->fetch_google_sheet_public_can_edit = fetch_google_sheet_public_can_edit;
    catalogs_feed_ingestion_warnings_local_var->hotel_price_header_is_present = hotel_price_header_is_present;
    catalogs_feed_ingestion_warnings_local_var->video_download_video_too_short = video_download_video_too_short;
    catalogs_feed_ingestion_warnings_local_var->video_file_not_accessible = video_file_not_accessible;
    catalogs_feed_ingestion_warnings_local_var->video_file_not_found = video_file_not_found;
    catalogs_feed_ingestion_warnings_local_var->video_invalid_file = video_invalid_file;
    catalogs_feed_ingestion_warnings_local_var->video_level_internal_error = video_level_internal_error;
    catalogs_feed_ingestion_warnings_local_var->video_malformed_url = video_malformed_url;
    return catalogs_feed_ingestion_warnings_local_var;
}

__attribute__((deprecated)) catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_create(
    int *ad_image_download_content_read_error,
    int *ad_image_download_dns_lookup_error,
    int *ad_image_download_file_not_accessible,
    int *ad_image_download_file_not_found,
    int *ad_image_download_http_status_400,
    int *ad_image_download_http_status_403,
    int *ad_image_download_http_status_404,
    int *ad_image_download_http_status_405,
    int *ad_image_download_http_status_410,
    int *ad_image_download_http_status_429,
    int *ad_image_download_http_status_500,
    int *ad_image_download_http_status_502,
    int *ad_image_download_http_status_503,
    int *ad_image_download_http_status_504,
    int *ad_image_download_http_status_507,
    int *ad_image_download_http_status_508,
    int *ad_image_download_http_status_520,
    int *ad_image_download_http_status_521,
    int *ad_image_download_http_status_522,
    int *ad_image_download_http_status_525,
    int *ad_image_download_internal_configuration_error,
    int *ad_image_download_internal_error,
    int *ad_image_download_internal_failed_to_download,
    int *ad_image_download_internal_malformed_url,
    int *ad_image_download_internal_rate_limited,
    int *ad_image_download_internal_request_expired,
    int *ad_image_download_invalid_file,
    int *ad_image_download_site_error,
    int *ad_image_download_site_timeout,
    int *ad_image_download_ssl_error,
    int *ad_image_download_ssl_handshake_error,
    int *ad_image_processing_empty_file,
    int *ad_image_processing_height_too_small,
    int *ad_image_processing_too_many_pixels,
    int *ad_image_processing_type_mismatch,
    int *ad_image_processing_width_too_small,
    int *ad_video_download_content_read_error,
    int *ad_video_download_dns_lookup_error,
    int *ad_video_download_file_not_accessible,
    int *ad_video_download_file_not_found,
    int *ad_video_download_http_status_400,
    int *ad_video_download_http_status_403,
    int *ad_video_download_http_status_404,
    int *ad_video_download_http_status_405,
    int *ad_video_download_http_status_410,
    int *ad_video_download_http_status_429,
    int *ad_video_download_http_status_500,
    int *ad_video_download_http_status_502,
    int *ad_video_download_http_status_503,
    int *ad_video_download_http_status_504,
    int *ad_video_download_http_status_507,
    int *ad_video_download_http_status_508,
    int *ad_video_download_http_status_520,
    int *ad_video_download_http_status_521,
    int *ad_video_download_http_status_522,
    int *ad_video_download_http_status_525,
    int *ad_video_download_internal_configuration_error,
    int *ad_video_download_internal_error,
    int *ad_video_download_internal_failed_to_download,
    int *ad_video_download_internal_malformed_url,
    int *ad_video_download_internal_rate_limited,
    int *ad_video_download_internal_request_expired,
    int *ad_video_download_invalid_file,
    int *ad_video_download_site_error,
    int *ad_video_download_site_timeout,
    int *ad_video_download_ssl_error,
    int *ad_video_download_ssl_handshake_error,
    int *ad_video_length_too_short,
    int *ad_video_processing_empty_file,
    int *ad_video_processing_height_too_small,
    int *ad_video_processing_too_many_pixels,
    int *ad_video_processing_type_mismatch,
    int *ad_video_processing_width_too_small,
    int *additional_image_file_not_accessible,
    int *additional_image_file_not_found,
    int *additional_image_invalid_file,
    int *additional_image_level_internal_error,
    int *additional_image_malformed_url,
    int *fetch_google_sheet_public_can_edit,
    int *hotel_price_header_is_present,
    int *video_download_video_too_short,
    int *video_file_not_accessible,
    int *video_file_not_found,
    int *video_invalid_file,
    int *video_level_internal_error,
    int *video_malformed_url
    ) {
    int *ad_image_download_content_read_error_copy = NULL;
    if (ad_image_download_content_read_error) {
        ad_image_download_content_read_error_copy = malloc(sizeof(int));
        if (ad_image_download_content_read_error_copy) *ad_image_download_content_read_error_copy = *ad_image_download_content_read_error;
    }
    int *ad_image_download_dns_lookup_error_copy = NULL;
    if (ad_image_download_dns_lookup_error) {
        ad_image_download_dns_lookup_error_copy = malloc(sizeof(int));
        if (ad_image_download_dns_lookup_error_copy) *ad_image_download_dns_lookup_error_copy = *ad_image_download_dns_lookup_error;
    }
    int *ad_image_download_file_not_accessible_copy = NULL;
    if (ad_image_download_file_not_accessible) {
        ad_image_download_file_not_accessible_copy = malloc(sizeof(int));
        if (ad_image_download_file_not_accessible_copy) *ad_image_download_file_not_accessible_copy = *ad_image_download_file_not_accessible;
    }
    int *ad_image_download_file_not_found_copy = NULL;
    if (ad_image_download_file_not_found) {
        ad_image_download_file_not_found_copy = malloc(sizeof(int));
        if (ad_image_download_file_not_found_copy) *ad_image_download_file_not_found_copy = *ad_image_download_file_not_found;
    }
    int *ad_image_download_http_status_400_copy = NULL;
    if (ad_image_download_http_status_400) {
        ad_image_download_http_status_400_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_400_copy) *ad_image_download_http_status_400_copy = *ad_image_download_http_status_400;
    }
    int *ad_image_download_http_status_403_copy = NULL;
    if (ad_image_download_http_status_403) {
        ad_image_download_http_status_403_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_403_copy) *ad_image_download_http_status_403_copy = *ad_image_download_http_status_403;
    }
    int *ad_image_download_http_status_404_copy = NULL;
    if (ad_image_download_http_status_404) {
        ad_image_download_http_status_404_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_404_copy) *ad_image_download_http_status_404_copy = *ad_image_download_http_status_404;
    }
    int *ad_image_download_http_status_405_copy = NULL;
    if (ad_image_download_http_status_405) {
        ad_image_download_http_status_405_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_405_copy) *ad_image_download_http_status_405_copy = *ad_image_download_http_status_405;
    }
    int *ad_image_download_http_status_410_copy = NULL;
    if (ad_image_download_http_status_410) {
        ad_image_download_http_status_410_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_410_copy) *ad_image_download_http_status_410_copy = *ad_image_download_http_status_410;
    }
    int *ad_image_download_http_status_429_copy = NULL;
    if (ad_image_download_http_status_429) {
        ad_image_download_http_status_429_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_429_copy) *ad_image_download_http_status_429_copy = *ad_image_download_http_status_429;
    }
    int *ad_image_download_http_status_500_copy = NULL;
    if (ad_image_download_http_status_500) {
        ad_image_download_http_status_500_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_500_copy) *ad_image_download_http_status_500_copy = *ad_image_download_http_status_500;
    }
    int *ad_image_download_http_status_502_copy = NULL;
    if (ad_image_download_http_status_502) {
        ad_image_download_http_status_502_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_502_copy) *ad_image_download_http_status_502_copy = *ad_image_download_http_status_502;
    }
    int *ad_image_download_http_status_503_copy = NULL;
    if (ad_image_download_http_status_503) {
        ad_image_download_http_status_503_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_503_copy) *ad_image_download_http_status_503_copy = *ad_image_download_http_status_503;
    }
    int *ad_image_download_http_status_504_copy = NULL;
    if (ad_image_download_http_status_504) {
        ad_image_download_http_status_504_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_504_copy) *ad_image_download_http_status_504_copy = *ad_image_download_http_status_504;
    }
    int *ad_image_download_http_status_507_copy = NULL;
    if (ad_image_download_http_status_507) {
        ad_image_download_http_status_507_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_507_copy) *ad_image_download_http_status_507_copy = *ad_image_download_http_status_507;
    }
    int *ad_image_download_http_status_508_copy = NULL;
    if (ad_image_download_http_status_508) {
        ad_image_download_http_status_508_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_508_copy) *ad_image_download_http_status_508_copy = *ad_image_download_http_status_508;
    }
    int *ad_image_download_http_status_520_copy = NULL;
    if (ad_image_download_http_status_520) {
        ad_image_download_http_status_520_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_520_copy) *ad_image_download_http_status_520_copy = *ad_image_download_http_status_520;
    }
    int *ad_image_download_http_status_521_copy = NULL;
    if (ad_image_download_http_status_521) {
        ad_image_download_http_status_521_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_521_copy) *ad_image_download_http_status_521_copy = *ad_image_download_http_status_521;
    }
    int *ad_image_download_http_status_522_copy = NULL;
    if (ad_image_download_http_status_522) {
        ad_image_download_http_status_522_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_522_copy) *ad_image_download_http_status_522_copy = *ad_image_download_http_status_522;
    }
    int *ad_image_download_http_status_525_copy = NULL;
    if (ad_image_download_http_status_525) {
        ad_image_download_http_status_525_copy = malloc(sizeof(int));
        if (ad_image_download_http_status_525_copy) *ad_image_download_http_status_525_copy = *ad_image_download_http_status_525;
    }
    int *ad_image_download_internal_configuration_error_copy = NULL;
    if (ad_image_download_internal_configuration_error) {
        ad_image_download_internal_configuration_error_copy = malloc(sizeof(int));
        if (ad_image_download_internal_configuration_error_copy) *ad_image_download_internal_configuration_error_copy = *ad_image_download_internal_configuration_error;
    }
    int *ad_image_download_internal_error_copy = NULL;
    if (ad_image_download_internal_error) {
        ad_image_download_internal_error_copy = malloc(sizeof(int));
        if (ad_image_download_internal_error_copy) *ad_image_download_internal_error_copy = *ad_image_download_internal_error;
    }
    int *ad_image_download_internal_failed_to_download_copy = NULL;
    if (ad_image_download_internal_failed_to_download) {
        ad_image_download_internal_failed_to_download_copy = malloc(sizeof(int));
        if (ad_image_download_internal_failed_to_download_copy) *ad_image_download_internal_failed_to_download_copy = *ad_image_download_internal_failed_to_download;
    }
    int *ad_image_download_internal_malformed_url_copy = NULL;
    if (ad_image_download_internal_malformed_url) {
        ad_image_download_internal_malformed_url_copy = malloc(sizeof(int));
        if (ad_image_download_internal_malformed_url_copy) *ad_image_download_internal_malformed_url_copy = *ad_image_download_internal_malformed_url;
    }
    int *ad_image_download_internal_rate_limited_copy = NULL;
    if (ad_image_download_internal_rate_limited) {
        ad_image_download_internal_rate_limited_copy = malloc(sizeof(int));
        if (ad_image_download_internal_rate_limited_copy) *ad_image_download_internal_rate_limited_copy = *ad_image_download_internal_rate_limited;
    }
    int *ad_image_download_internal_request_expired_copy = NULL;
    if (ad_image_download_internal_request_expired) {
        ad_image_download_internal_request_expired_copy = malloc(sizeof(int));
        if (ad_image_download_internal_request_expired_copy) *ad_image_download_internal_request_expired_copy = *ad_image_download_internal_request_expired;
    }
    int *ad_image_download_invalid_file_copy = NULL;
    if (ad_image_download_invalid_file) {
        ad_image_download_invalid_file_copy = malloc(sizeof(int));
        if (ad_image_download_invalid_file_copy) *ad_image_download_invalid_file_copy = *ad_image_download_invalid_file;
    }
    int *ad_image_download_site_error_copy = NULL;
    if (ad_image_download_site_error) {
        ad_image_download_site_error_copy = malloc(sizeof(int));
        if (ad_image_download_site_error_copy) *ad_image_download_site_error_copy = *ad_image_download_site_error;
    }
    int *ad_image_download_site_timeout_copy = NULL;
    if (ad_image_download_site_timeout) {
        ad_image_download_site_timeout_copy = malloc(sizeof(int));
        if (ad_image_download_site_timeout_copy) *ad_image_download_site_timeout_copy = *ad_image_download_site_timeout;
    }
    int *ad_image_download_ssl_error_copy = NULL;
    if (ad_image_download_ssl_error) {
        ad_image_download_ssl_error_copy = malloc(sizeof(int));
        if (ad_image_download_ssl_error_copy) *ad_image_download_ssl_error_copy = *ad_image_download_ssl_error;
    }
    int *ad_image_download_ssl_handshake_error_copy = NULL;
    if (ad_image_download_ssl_handshake_error) {
        ad_image_download_ssl_handshake_error_copy = malloc(sizeof(int));
        if (ad_image_download_ssl_handshake_error_copy) *ad_image_download_ssl_handshake_error_copy = *ad_image_download_ssl_handshake_error;
    }
    int *ad_image_processing_empty_file_copy = NULL;
    if (ad_image_processing_empty_file) {
        ad_image_processing_empty_file_copy = malloc(sizeof(int));
        if (ad_image_processing_empty_file_copy) *ad_image_processing_empty_file_copy = *ad_image_processing_empty_file;
    }
    int *ad_image_processing_height_too_small_copy = NULL;
    if (ad_image_processing_height_too_small) {
        ad_image_processing_height_too_small_copy = malloc(sizeof(int));
        if (ad_image_processing_height_too_small_copy) *ad_image_processing_height_too_small_copy = *ad_image_processing_height_too_small;
    }
    int *ad_image_processing_too_many_pixels_copy = NULL;
    if (ad_image_processing_too_many_pixels) {
        ad_image_processing_too_many_pixels_copy = malloc(sizeof(int));
        if (ad_image_processing_too_many_pixels_copy) *ad_image_processing_too_many_pixels_copy = *ad_image_processing_too_many_pixels;
    }
    int *ad_image_processing_type_mismatch_copy = NULL;
    if (ad_image_processing_type_mismatch) {
        ad_image_processing_type_mismatch_copy = malloc(sizeof(int));
        if (ad_image_processing_type_mismatch_copy) *ad_image_processing_type_mismatch_copy = *ad_image_processing_type_mismatch;
    }
    int *ad_image_processing_width_too_small_copy = NULL;
    if (ad_image_processing_width_too_small) {
        ad_image_processing_width_too_small_copy = malloc(sizeof(int));
        if (ad_image_processing_width_too_small_copy) *ad_image_processing_width_too_small_copy = *ad_image_processing_width_too_small;
    }
    int *ad_video_download_content_read_error_copy = NULL;
    if (ad_video_download_content_read_error) {
        ad_video_download_content_read_error_copy = malloc(sizeof(int));
        if (ad_video_download_content_read_error_copy) *ad_video_download_content_read_error_copy = *ad_video_download_content_read_error;
    }
    int *ad_video_download_dns_lookup_error_copy = NULL;
    if (ad_video_download_dns_lookup_error) {
        ad_video_download_dns_lookup_error_copy = malloc(sizeof(int));
        if (ad_video_download_dns_lookup_error_copy) *ad_video_download_dns_lookup_error_copy = *ad_video_download_dns_lookup_error;
    }
    int *ad_video_download_file_not_accessible_copy = NULL;
    if (ad_video_download_file_not_accessible) {
        ad_video_download_file_not_accessible_copy = malloc(sizeof(int));
        if (ad_video_download_file_not_accessible_copy) *ad_video_download_file_not_accessible_copy = *ad_video_download_file_not_accessible;
    }
    int *ad_video_download_file_not_found_copy = NULL;
    if (ad_video_download_file_not_found) {
        ad_video_download_file_not_found_copy = malloc(sizeof(int));
        if (ad_video_download_file_not_found_copy) *ad_video_download_file_not_found_copy = *ad_video_download_file_not_found;
    }
    int *ad_video_download_http_status_400_copy = NULL;
    if (ad_video_download_http_status_400) {
        ad_video_download_http_status_400_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_400_copy) *ad_video_download_http_status_400_copy = *ad_video_download_http_status_400;
    }
    int *ad_video_download_http_status_403_copy = NULL;
    if (ad_video_download_http_status_403) {
        ad_video_download_http_status_403_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_403_copy) *ad_video_download_http_status_403_copy = *ad_video_download_http_status_403;
    }
    int *ad_video_download_http_status_404_copy = NULL;
    if (ad_video_download_http_status_404) {
        ad_video_download_http_status_404_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_404_copy) *ad_video_download_http_status_404_copy = *ad_video_download_http_status_404;
    }
    int *ad_video_download_http_status_405_copy = NULL;
    if (ad_video_download_http_status_405) {
        ad_video_download_http_status_405_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_405_copy) *ad_video_download_http_status_405_copy = *ad_video_download_http_status_405;
    }
    int *ad_video_download_http_status_410_copy = NULL;
    if (ad_video_download_http_status_410) {
        ad_video_download_http_status_410_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_410_copy) *ad_video_download_http_status_410_copy = *ad_video_download_http_status_410;
    }
    int *ad_video_download_http_status_429_copy = NULL;
    if (ad_video_download_http_status_429) {
        ad_video_download_http_status_429_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_429_copy) *ad_video_download_http_status_429_copy = *ad_video_download_http_status_429;
    }
    int *ad_video_download_http_status_500_copy = NULL;
    if (ad_video_download_http_status_500) {
        ad_video_download_http_status_500_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_500_copy) *ad_video_download_http_status_500_copy = *ad_video_download_http_status_500;
    }
    int *ad_video_download_http_status_502_copy = NULL;
    if (ad_video_download_http_status_502) {
        ad_video_download_http_status_502_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_502_copy) *ad_video_download_http_status_502_copy = *ad_video_download_http_status_502;
    }
    int *ad_video_download_http_status_503_copy = NULL;
    if (ad_video_download_http_status_503) {
        ad_video_download_http_status_503_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_503_copy) *ad_video_download_http_status_503_copy = *ad_video_download_http_status_503;
    }
    int *ad_video_download_http_status_504_copy = NULL;
    if (ad_video_download_http_status_504) {
        ad_video_download_http_status_504_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_504_copy) *ad_video_download_http_status_504_copy = *ad_video_download_http_status_504;
    }
    int *ad_video_download_http_status_507_copy = NULL;
    if (ad_video_download_http_status_507) {
        ad_video_download_http_status_507_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_507_copy) *ad_video_download_http_status_507_copy = *ad_video_download_http_status_507;
    }
    int *ad_video_download_http_status_508_copy = NULL;
    if (ad_video_download_http_status_508) {
        ad_video_download_http_status_508_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_508_copy) *ad_video_download_http_status_508_copy = *ad_video_download_http_status_508;
    }
    int *ad_video_download_http_status_520_copy = NULL;
    if (ad_video_download_http_status_520) {
        ad_video_download_http_status_520_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_520_copy) *ad_video_download_http_status_520_copy = *ad_video_download_http_status_520;
    }
    int *ad_video_download_http_status_521_copy = NULL;
    if (ad_video_download_http_status_521) {
        ad_video_download_http_status_521_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_521_copy) *ad_video_download_http_status_521_copy = *ad_video_download_http_status_521;
    }
    int *ad_video_download_http_status_522_copy = NULL;
    if (ad_video_download_http_status_522) {
        ad_video_download_http_status_522_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_522_copy) *ad_video_download_http_status_522_copy = *ad_video_download_http_status_522;
    }
    int *ad_video_download_http_status_525_copy = NULL;
    if (ad_video_download_http_status_525) {
        ad_video_download_http_status_525_copy = malloc(sizeof(int));
        if (ad_video_download_http_status_525_copy) *ad_video_download_http_status_525_copy = *ad_video_download_http_status_525;
    }
    int *ad_video_download_internal_configuration_error_copy = NULL;
    if (ad_video_download_internal_configuration_error) {
        ad_video_download_internal_configuration_error_copy = malloc(sizeof(int));
        if (ad_video_download_internal_configuration_error_copy) *ad_video_download_internal_configuration_error_copy = *ad_video_download_internal_configuration_error;
    }
    int *ad_video_download_internal_error_copy = NULL;
    if (ad_video_download_internal_error) {
        ad_video_download_internal_error_copy = malloc(sizeof(int));
        if (ad_video_download_internal_error_copy) *ad_video_download_internal_error_copy = *ad_video_download_internal_error;
    }
    int *ad_video_download_internal_failed_to_download_copy = NULL;
    if (ad_video_download_internal_failed_to_download) {
        ad_video_download_internal_failed_to_download_copy = malloc(sizeof(int));
        if (ad_video_download_internal_failed_to_download_copy) *ad_video_download_internal_failed_to_download_copy = *ad_video_download_internal_failed_to_download;
    }
    int *ad_video_download_internal_malformed_url_copy = NULL;
    if (ad_video_download_internal_malformed_url) {
        ad_video_download_internal_malformed_url_copy = malloc(sizeof(int));
        if (ad_video_download_internal_malformed_url_copy) *ad_video_download_internal_malformed_url_copy = *ad_video_download_internal_malformed_url;
    }
    int *ad_video_download_internal_rate_limited_copy = NULL;
    if (ad_video_download_internal_rate_limited) {
        ad_video_download_internal_rate_limited_copy = malloc(sizeof(int));
        if (ad_video_download_internal_rate_limited_copy) *ad_video_download_internal_rate_limited_copy = *ad_video_download_internal_rate_limited;
    }
    int *ad_video_download_internal_request_expired_copy = NULL;
    if (ad_video_download_internal_request_expired) {
        ad_video_download_internal_request_expired_copy = malloc(sizeof(int));
        if (ad_video_download_internal_request_expired_copy) *ad_video_download_internal_request_expired_copy = *ad_video_download_internal_request_expired;
    }
    int *ad_video_download_invalid_file_copy = NULL;
    if (ad_video_download_invalid_file) {
        ad_video_download_invalid_file_copy = malloc(sizeof(int));
        if (ad_video_download_invalid_file_copy) *ad_video_download_invalid_file_copy = *ad_video_download_invalid_file;
    }
    int *ad_video_download_site_error_copy = NULL;
    if (ad_video_download_site_error) {
        ad_video_download_site_error_copy = malloc(sizeof(int));
        if (ad_video_download_site_error_copy) *ad_video_download_site_error_copy = *ad_video_download_site_error;
    }
    int *ad_video_download_site_timeout_copy = NULL;
    if (ad_video_download_site_timeout) {
        ad_video_download_site_timeout_copy = malloc(sizeof(int));
        if (ad_video_download_site_timeout_copy) *ad_video_download_site_timeout_copy = *ad_video_download_site_timeout;
    }
    int *ad_video_download_ssl_error_copy = NULL;
    if (ad_video_download_ssl_error) {
        ad_video_download_ssl_error_copy = malloc(sizeof(int));
        if (ad_video_download_ssl_error_copy) *ad_video_download_ssl_error_copy = *ad_video_download_ssl_error;
    }
    int *ad_video_download_ssl_handshake_error_copy = NULL;
    if (ad_video_download_ssl_handshake_error) {
        ad_video_download_ssl_handshake_error_copy = malloc(sizeof(int));
        if (ad_video_download_ssl_handshake_error_copy) *ad_video_download_ssl_handshake_error_copy = *ad_video_download_ssl_handshake_error;
    }
    int *ad_video_length_too_short_copy = NULL;
    if (ad_video_length_too_short) {
        ad_video_length_too_short_copy = malloc(sizeof(int));
        if (ad_video_length_too_short_copy) *ad_video_length_too_short_copy = *ad_video_length_too_short;
    }
    int *ad_video_processing_empty_file_copy = NULL;
    if (ad_video_processing_empty_file) {
        ad_video_processing_empty_file_copy = malloc(sizeof(int));
        if (ad_video_processing_empty_file_copy) *ad_video_processing_empty_file_copy = *ad_video_processing_empty_file;
    }
    int *ad_video_processing_height_too_small_copy = NULL;
    if (ad_video_processing_height_too_small) {
        ad_video_processing_height_too_small_copy = malloc(sizeof(int));
        if (ad_video_processing_height_too_small_copy) *ad_video_processing_height_too_small_copy = *ad_video_processing_height_too_small;
    }
    int *ad_video_processing_too_many_pixels_copy = NULL;
    if (ad_video_processing_too_many_pixels) {
        ad_video_processing_too_many_pixels_copy = malloc(sizeof(int));
        if (ad_video_processing_too_many_pixels_copy) *ad_video_processing_too_many_pixels_copy = *ad_video_processing_too_many_pixels;
    }
    int *ad_video_processing_type_mismatch_copy = NULL;
    if (ad_video_processing_type_mismatch) {
        ad_video_processing_type_mismatch_copy = malloc(sizeof(int));
        if (ad_video_processing_type_mismatch_copy) *ad_video_processing_type_mismatch_copy = *ad_video_processing_type_mismatch;
    }
    int *ad_video_processing_width_too_small_copy = NULL;
    if (ad_video_processing_width_too_small) {
        ad_video_processing_width_too_small_copy = malloc(sizeof(int));
        if (ad_video_processing_width_too_small_copy) *ad_video_processing_width_too_small_copy = *ad_video_processing_width_too_small;
    }
    int *additional_image_file_not_accessible_copy = NULL;
    if (additional_image_file_not_accessible) {
        additional_image_file_not_accessible_copy = malloc(sizeof(int));
        if (additional_image_file_not_accessible_copy) *additional_image_file_not_accessible_copy = *additional_image_file_not_accessible;
    }
    int *additional_image_file_not_found_copy = NULL;
    if (additional_image_file_not_found) {
        additional_image_file_not_found_copy = malloc(sizeof(int));
        if (additional_image_file_not_found_copy) *additional_image_file_not_found_copy = *additional_image_file_not_found;
    }
    int *additional_image_invalid_file_copy = NULL;
    if (additional_image_invalid_file) {
        additional_image_invalid_file_copy = malloc(sizeof(int));
        if (additional_image_invalid_file_copy) *additional_image_invalid_file_copy = *additional_image_invalid_file;
    }
    int *additional_image_level_internal_error_copy = NULL;
    if (additional_image_level_internal_error) {
        additional_image_level_internal_error_copy = malloc(sizeof(int));
        if (additional_image_level_internal_error_copy) *additional_image_level_internal_error_copy = *additional_image_level_internal_error;
    }
    int *additional_image_malformed_url_copy = NULL;
    if (additional_image_malformed_url) {
        additional_image_malformed_url_copy = malloc(sizeof(int));
        if (additional_image_malformed_url_copy) *additional_image_malformed_url_copy = *additional_image_malformed_url;
    }
    int *fetch_google_sheet_public_can_edit_copy = NULL;
    if (fetch_google_sheet_public_can_edit) {
        fetch_google_sheet_public_can_edit_copy = malloc(sizeof(int));
        if (fetch_google_sheet_public_can_edit_copy) *fetch_google_sheet_public_can_edit_copy = *fetch_google_sheet_public_can_edit;
    }
    int *hotel_price_header_is_present_copy = NULL;
    if (hotel_price_header_is_present) {
        hotel_price_header_is_present_copy = malloc(sizeof(int));
        if (hotel_price_header_is_present_copy) *hotel_price_header_is_present_copy = *hotel_price_header_is_present;
    }
    int *video_download_video_too_short_copy = NULL;
    if (video_download_video_too_short) {
        video_download_video_too_short_copy = malloc(sizeof(int));
        if (video_download_video_too_short_copy) *video_download_video_too_short_copy = *video_download_video_too_short;
    }
    int *video_file_not_accessible_copy = NULL;
    if (video_file_not_accessible) {
        video_file_not_accessible_copy = malloc(sizeof(int));
        if (video_file_not_accessible_copy) *video_file_not_accessible_copy = *video_file_not_accessible;
    }
    int *video_file_not_found_copy = NULL;
    if (video_file_not_found) {
        video_file_not_found_copy = malloc(sizeof(int));
        if (video_file_not_found_copy) *video_file_not_found_copy = *video_file_not_found;
    }
    int *video_invalid_file_copy = NULL;
    if (video_invalid_file) {
        video_invalid_file_copy = malloc(sizeof(int));
        if (video_invalid_file_copy) *video_invalid_file_copy = *video_invalid_file;
    }
    int *video_level_internal_error_copy = NULL;
    if (video_level_internal_error) {
        video_level_internal_error_copy = malloc(sizeof(int));
        if (video_level_internal_error_copy) *video_level_internal_error_copy = *video_level_internal_error;
    }
    int *video_malformed_url_copy = NULL;
    if (video_malformed_url) {
        video_malformed_url_copy = malloc(sizeof(int));
        if (video_malformed_url_copy) *video_malformed_url_copy = *video_malformed_url;
    }
    catalogs_feed_ingestion_warnings_t *result = catalogs_feed_ingestion_warnings_create_internal (
        ad_image_download_content_read_error_copy,
        ad_image_download_dns_lookup_error_copy,
        ad_image_download_file_not_accessible_copy,
        ad_image_download_file_not_found_copy,
        ad_image_download_http_status_400_copy,
        ad_image_download_http_status_403_copy,
        ad_image_download_http_status_404_copy,
        ad_image_download_http_status_405_copy,
        ad_image_download_http_status_410_copy,
        ad_image_download_http_status_429_copy,
        ad_image_download_http_status_500_copy,
        ad_image_download_http_status_502_copy,
        ad_image_download_http_status_503_copy,
        ad_image_download_http_status_504_copy,
        ad_image_download_http_status_507_copy,
        ad_image_download_http_status_508_copy,
        ad_image_download_http_status_520_copy,
        ad_image_download_http_status_521_copy,
        ad_image_download_http_status_522_copy,
        ad_image_download_http_status_525_copy,
        ad_image_download_internal_configuration_error_copy,
        ad_image_download_internal_error_copy,
        ad_image_download_internal_failed_to_download_copy,
        ad_image_download_internal_malformed_url_copy,
        ad_image_download_internal_rate_limited_copy,
        ad_image_download_internal_request_expired_copy,
        ad_image_download_invalid_file_copy,
        ad_image_download_site_error_copy,
        ad_image_download_site_timeout_copy,
        ad_image_download_ssl_error_copy,
        ad_image_download_ssl_handshake_error_copy,
        ad_image_processing_empty_file_copy,
        ad_image_processing_height_too_small_copy,
        ad_image_processing_too_many_pixels_copy,
        ad_image_processing_type_mismatch_copy,
        ad_image_processing_width_too_small_copy,
        ad_video_download_content_read_error_copy,
        ad_video_download_dns_lookup_error_copy,
        ad_video_download_file_not_accessible_copy,
        ad_video_download_file_not_found_copy,
        ad_video_download_http_status_400_copy,
        ad_video_download_http_status_403_copy,
        ad_video_download_http_status_404_copy,
        ad_video_download_http_status_405_copy,
        ad_video_download_http_status_410_copy,
        ad_video_download_http_status_429_copy,
        ad_video_download_http_status_500_copy,
        ad_video_download_http_status_502_copy,
        ad_video_download_http_status_503_copy,
        ad_video_download_http_status_504_copy,
        ad_video_download_http_status_507_copy,
        ad_video_download_http_status_508_copy,
        ad_video_download_http_status_520_copy,
        ad_video_download_http_status_521_copy,
        ad_video_download_http_status_522_copy,
        ad_video_download_http_status_525_copy,
        ad_video_download_internal_configuration_error_copy,
        ad_video_download_internal_error_copy,
        ad_video_download_internal_failed_to_download_copy,
        ad_video_download_internal_malformed_url_copy,
        ad_video_download_internal_rate_limited_copy,
        ad_video_download_internal_request_expired_copy,
        ad_video_download_invalid_file_copy,
        ad_video_download_site_error_copy,
        ad_video_download_site_timeout_copy,
        ad_video_download_ssl_error_copy,
        ad_video_download_ssl_handshake_error_copy,
        ad_video_length_too_short_copy,
        ad_video_processing_empty_file_copy,
        ad_video_processing_height_too_small_copy,
        ad_video_processing_too_many_pixels_copy,
        ad_video_processing_type_mismatch_copy,
        ad_video_processing_width_too_small_copy,
        additional_image_file_not_accessible_copy,
        additional_image_file_not_found_copy,
        additional_image_invalid_file_copy,
        additional_image_level_internal_error_copy,
        additional_image_malformed_url_copy,
        fetch_google_sheet_public_can_edit_copy,
        hotel_price_header_is_present_copy,
        video_download_video_too_short_copy,
        video_file_not_accessible_copy,
        video_file_not_found_copy,
        video_invalid_file_copy,
        video_level_internal_error_copy,
        video_malformed_url_copy
        );
    if (!result) {
        free(ad_image_download_content_read_error_copy);
        free(ad_image_download_dns_lookup_error_copy);
        free(ad_image_download_file_not_accessible_copy);
        free(ad_image_download_file_not_found_copy);
        free(ad_image_download_http_status_400_copy);
        free(ad_image_download_http_status_403_copy);
        free(ad_image_download_http_status_404_copy);
        free(ad_image_download_http_status_405_copy);
        free(ad_image_download_http_status_410_copy);
        free(ad_image_download_http_status_429_copy);
        free(ad_image_download_http_status_500_copy);
        free(ad_image_download_http_status_502_copy);
        free(ad_image_download_http_status_503_copy);
        free(ad_image_download_http_status_504_copy);
        free(ad_image_download_http_status_507_copy);
        free(ad_image_download_http_status_508_copy);
        free(ad_image_download_http_status_520_copy);
        free(ad_image_download_http_status_521_copy);
        free(ad_image_download_http_status_522_copy);
        free(ad_image_download_http_status_525_copy);
        free(ad_image_download_internal_configuration_error_copy);
        free(ad_image_download_internal_error_copy);
        free(ad_image_download_internal_failed_to_download_copy);
        free(ad_image_download_internal_malformed_url_copy);
        free(ad_image_download_internal_rate_limited_copy);
        free(ad_image_download_internal_request_expired_copy);
        free(ad_image_download_invalid_file_copy);
        free(ad_image_download_site_error_copy);
        free(ad_image_download_site_timeout_copy);
        free(ad_image_download_ssl_error_copy);
        free(ad_image_download_ssl_handshake_error_copy);
        free(ad_image_processing_empty_file_copy);
        free(ad_image_processing_height_too_small_copy);
        free(ad_image_processing_too_many_pixels_copy);
        free(ad_image_processing_type_mismatch_copy);
        free(ad_image_processing_width_too_small_copy);
        free(ad_video_download_content_read_error_copy);
        free(ad_video_download_dns_lookup_error_copy);
        free(ad_video_download_file_not_accessible_copy);
        free(ad_video_download_file_not_found_copy);
        free(ad_video_download_http_status_400_copy);
        free(ad_video_download_http_status_403_copy);
        free(ad_video_download_http_status_404_copy);
        free(ad_video_download_http_status_405_copy);
        free(ad_video_download_http_status_410_copy);
        free(ad_video_download_http_status_429_copy);
        free(ad_video_download_http_status_500_copy);
        free(ad_video_download_http_status_502_copy);
        free(ad_video_download_http_status_503_copy);
        free(ad_video_download_http_status_504_copy);
        free(ad_video_download_http_status_507_copy);
        free(ad_video_download_http_status_508_copy);
        free(ad_video_download_http_status_520_copy);
        free(ad_video_download_http_status_521_copy);
        free(ad_video_download_http_status_522_copy);
        free(ad_video_download_http_status_525_copy);
        free(ad_video_download_internal_configuration_error_copy);
        free(ad_video_download_internal_error_copy);
        free(ad_video_download_internal_failed_to_download_copy);
        free(ad_video_download_internal_malformed_url_copy);
        free(ad_video_download_internal_rate_limited_copy);
        free(ad_video_download_internal_request_expired_copy);
        free(ad_video_download_invalid_file_copy);
        free(ad_video_download_site_error_copy);
        free(ad_video_download_site_timeout_copy);
        free(ad_video_download_ssl_error_copy);
        free(ad_video_download_ssl_handshake_error_copy);
        free(ad_video_length_too_short_copy);
        free(ad_video_processing_empty_file_copy);
        free(ad_video_processing_height_too_small_copy);
        free(ad_video_processing_too_many_pixels_copy);
        free(ad_video_processing_type_mismatch_copy);
        free(ad_video_processing_width_too_small_copy);
        free(additional_image_file_not_accessible_copy);
        free(additional_image_file_not_found_copy);
        free(additional_image_invalid_file_copy);
        free(additional_image_level_internal_error_copy);
        free(additional_image_malformed_url_copy);
        free(fetch_google_sheet_public_can_edit_copy);
        free(hotel_price_header_is_present_copy);
        free(video_download_video_too_short_copy);
        free(video_file_not_accessible_copy);
        free(video_file_not_found_copy);
        free(video_invalid_file_copy);
        free(video_level_internal_error_copy);
        free(video_malformed_url_copy);
    }
    return result;
}

void catalogs_feed_ingestion_warnings_free(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings) {
    if(NULL == catalogs_feed_ingestion_warnings){
        return ;
    }
    if(catalogs_feed_ingestion_warnings->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_ingestion_warnings_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_ingestion_warnings->ad_image_download_content_read_error) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_content_read_error);
        catalogs_feed_ingestion_warnings->ad_image_download_content_read_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error);
        catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible);
        catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_file_not_found) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_file_not_found);
        catalogs_feed_ingestion_warnings->ad_image_download_file_not_found = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_400) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_400);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_400 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_403) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_403);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_403 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_404) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_404);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_404 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_405) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_405);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_405 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_410) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_410);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_410 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_429) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_429);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_429 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_500) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_500);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_500 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_502) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_502);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_502 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_503) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_503);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_503 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_504) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_504);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_504 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_507) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_507);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_507 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_508) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_508);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_508 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_520) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_520);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_520 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_521) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_521);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_521 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_522) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_522);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_522 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_http_status_525) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_http_status_525);
        catalogs_feed_ingestion_warnings->ad_image_download_http_status_525 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error);
        catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_internal_error) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_internal_error);
        catalogs_feed_ingestion_warnings->ad_image_download_internal_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download);
        catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url);
        catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited);
        catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired);
        catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_invalid_file) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_invalid_file);
        catalogs_feed_ingestion_warnings->ad_image_download_invalid_file = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_site_error) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_site_error);
        catalogs_feed_ingestion_warnings->ad_image_download_site_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_site_timeout) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_site_timeout);
        catalogs_feed_ingestion_warnings->ad_image_download_site_timeout = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_ssl_error) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_ssl_error);
        catalogs_feed_ingestion_warnings->ad_image_download_ssl_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error) {
        free(catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error);
        catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_processing_empty_file) {
        free(catalogs_feed_ingestion_warnings->ad_image_processing_empty_file);
        catalogs_feed_ingestion_warnings->ad_image_processing_empty_file = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small) {
        free(catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small);
        catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels) {
        free(catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels);
        catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch) {
        free(catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch);
        catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small) {
        free(catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small);
        catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_content_read_error) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_content_read_error);
        catalogs_feed_ingestion_warnings->ad_video_download_content_read_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error);
        catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible);
        catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_file_not_found) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_file_not_found);
        catalogs_feed_ingestion_warnings->ad_video_download_file_not_found = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_400) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_400);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_400 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_403) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_403);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_403 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_404) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_404);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_404 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_405) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_405);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_405 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_410) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_410);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_410 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_429) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_429);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_429 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_500) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_500);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_500 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_502) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_502);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_502 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_503) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_503);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_503 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_504) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_504);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_504 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_507) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_507);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_507 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_508) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_508);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_508 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_520) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_520);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_520 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_521) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_521);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_521 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_522) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_522);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_522 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_http_status_525) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_http_status_525);
        catalogs_feed_ingestion_warnings->ad_video_download_http_status_525 = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error);
        catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_internal_error) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_internal_error);
        catalogs_feed_ingestion_warnings->ad_video_download_internal_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download);
        catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url);
        catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited);
        catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired);
        catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_invalid_file) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_invalid_file);
        catalogs_feed_ingestion_warnings->ad_video_download_invalid_file = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_site_error) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_site_error);
        catalogs_feed_ingestion_warnings->ad_video_download_site_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_site_timeout) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_site_timeout);
        catalogs_feed_ingestion_warnings->ad_video_download_site_timeout = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_ssl_error) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_ssl_error);
        catalogs_feed_ingestion_warnings->ad_video_download_ssl_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error) {
        free(catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error);
        catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_length_too_short) {
        free(catalogs_feed_ingestion_warnings->ad_video_length_too_short);
        catalogs_feed_ingestion_warnings->ad_video_length_too_short = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_processing_empty_file) {
        free(catalogs_feed_ingestion_warnings->ad_video_processing_empty_file);
        catalogs_feed_ingestion_warnings->ad_video_processing_empty_file = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small) {
        free(catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small);
        catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels) {
        free(catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels);
        catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch) {
        free(catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch);
        catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch = NULL;
    }
    if (catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small) {
        free(catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small);
        catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small = NULL;
    }
    if (catalogs_feed_ingestion_warnings->additional_image_file_not_accessible) {
        free(catalogs_feed_ingestion_warnings->additional_image_file_not_accessible);
        catalogs_feed_ingestion_warnings->additional_image_file_not_accessible = NULL;
    }
    if (catalogs_feed_ingestion_warnings->additional_image_file_not_found) {
        free(catalogs_feed_ingestion_warnings->additional_image_file_not_found);
        catalogs_feed_ingestion_warnings->additional_image_file_not_found = NULL;
    }
    if (catalogs_feed_ingestion_warnings->additional_image_invalid_file) {
        free(catalogs_feed_ingestion_warnings->additional_image_invalid_file);
        catalogs_feed_ingestion_warnings->additional_image_invalid_file = NULL;
    }
    if (catalogs_feed_ingestion_warnings->additional_image_level_internal_error) {
        free(catalogs_feed_ingestion_warnings->additional_image_level_internal_error);
        catalogs_feed_ingestion_warnings->additional_image_level_internal_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->additional_image_malformed_url) {
        free(catalogs_feed_ingestion_warnings->additional_image_malformed_url);
        catalogs_feed_ingestion_warnings->additional_image_malformed_url = NULL;
    }
    if (catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit) {
        free(catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit);
        catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit = NULL;
    }
    if (catalogs_feed_ingestion_warnings->hotel_price_header_is_present) {
        free(catalogs_feed_ingestion_warnings->hotel_price_header_is_present);
        catalogs_feed_ingestion_warnings->hotel_price_header_is_present = NULL;
    }
    if (catalogs_feed_ingestion_warnings->video_download_video_too_short) {
        free(catalogs_feed_ingestion_warnings->video_download_video_too_short);
        catalogs_feed_ingestion_warnings->video_download_video_too_short = NULL;
    }
    if (catalogs_feed_ingestion_warnings->video_file_not_accessible) {
        free(catalogs_feed_ingestion_warnings->video_file_not_accessible);
        catalogs_feed_ingestion_warnings->video_file_not_accessible = NULL;
    }
    if (catalogs_feed_ingestion_warnings->video_file_not_found) {
        free(catalogs_feed_ingestion_warnings->video_file_not_found);
        catalogs_feed_ingestion_warnings->video_file_not_found = NULL;
    }
    if (catalogs_feed_ingestion_warnings->video_invalid_file) {
        free(catalogs_feed_ingestion_warnings->video_invalid_file);
        catalogs_feed_ingestion_warnings->video_invalid_file = NULL;
    }
    if (catalogs_feed_ingestion_warnings->video_level_internal_error) {
        free(catalogs_feed_ingestion_warnings->video_level_internal_error);
        catalogs_feed_ingestion_warnings->video_level_internal_error = NULL;
    }
    if (catalogs_feed_ingestion_warnings->video_malformed_url) {
        free(catalogs_feed_ingestion_warnings->video_malformed_url);
        catalogs_feed_ingestion_warnings->video_malformed_url = NULL;
    }
    free(catalogs_feed_ingestion_warnings);
}

cJSON *catalogs_feed_ingestion_warnings_convertToJSON(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion_warnings->ad_image_download_content_read_error
    if(catalogs_feed_ingestion_warnings->ad_image_download_content_read_error) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR", *catalogs_feed_ingestion_warnings->ad_image_download_content_read_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error
    if(catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR", *catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible
    if(catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE", *catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_file_not_found
    if(catalogs_feed_ingestion_warnings->ad_image_download_file_not_found) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND", *catalogs_feed_ingestion_warnings->ad_image_download_file_not_found) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_400
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_400) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_400", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_400) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_403
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_403) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_403", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_403) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_404
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_404) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_404", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_404) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_405
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_405) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_405", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_405) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_410
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_410) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_410", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_410) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_429
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_429) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_429", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_429) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_500
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_500) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_500", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_500) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_502
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_502) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_502", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_502) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_503
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_503) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_503", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_503) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_504
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_504) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_504", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_504) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_507
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_507) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_507", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_507) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_508
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_508) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_508", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_508) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_520
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_520) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_520", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_520) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_521
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_521) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_521", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_521) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_522
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_522) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_522", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_522) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_525
    if(catalogs_feed_ingestion_warnings->ad_image_download_http_status_525) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_525", *catalogs_feed_ingestion_warnings->ad_image_download_http_status_525) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error
    if(catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", *catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_internal_error
    if(catalogs_feed_ingestion_warnings->ad_image_download_internal_error) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_INTERNAL_ERROR", *catalogs_feed_ingestion_warnings->ad_image_download_internal_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download
    if(catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", *catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url
    if(catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL", *catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited
    if(catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED", *catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired
    if(catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", *catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_invalid_file
    if(catalogs_feed_ingestion_warnings->ad_image_download_invalid_file) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_INVALID_FILE", *catalogs_feed_ingestion_warnings->ad_image_download_invalid_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_site_error
    if(catalogs_feed_ingestion_warnings->ad_image_download_site_error) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_SITE_ERROR", *catalogs_feed_ingestion_warnings->ad_image_download_site_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_site_timeout
    if(catalogs_feed_ingestion_warnings->ad_image_download_site_timeout) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_SITE_TIMEOUT", *catalogs_feed_ingestion_warnings->ad_image_download_site_timeout) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_ssl_error
    if(catalogs_feed_ingestion_warnings->ad_image_download_ssl_error) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_SSL_ERROR", *catalogs_feed_ingestion_warnings->ad_image_download_ssl_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error
    if(catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR", *catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_processing_empty_file
    if(catalogs_feed_ingestion_warnings->ad_image_processing_empty_file) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_PROCESSING_EMPTY_FILE", *catalogs_feed_ingestion_warnings->ad_image_processing_empty_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small
    if(catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL", *catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels
    if(catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_PROCESSING_TOO_MANY_PIXELS", *catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch
    if(catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_PROCESSING_TYPE_MISMATCH", *catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small
    if(catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL", *catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_content_read_error
    if(catalogs_feed_ingestion_warnings->ad_video_download_content_read_error) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR", *catalogs_feed_ingestion_warnings->ad_video_download_content_read_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error
    if(catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR", *catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible
    if(catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE", *catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_file_not_found
    if(catalogs_feed_ingestion_warnings->ad_video_download_file_not_found) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND", *catalogs_feed_ingestion_warnings->ad_video_download_file_not_found) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_400
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_400) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_400", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_400) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_403
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_403) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_403", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_403) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_404
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_404) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_404", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_404) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_405
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_405) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_405", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_405) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_410
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_410) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_410", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_410) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_429
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_429) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_429", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_429) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_500
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_500) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_500", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_500) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_502
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_502) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_502", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_502) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_503
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_503) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_503", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_503) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_504
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_504) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_504", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_504) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_507
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_507) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_507", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_507) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_508
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_508) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_508", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_508) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_520
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_520) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_520", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_520) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_521
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_521) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_521", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_521) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_522
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_522) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_522", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_522) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_525
    if(catalogs_feed_ingestion_warnings->ad_video_download_http_status_525) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_525", *catalogs_feed_ingestion_warnings->ad_video_download_http_status_525) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error
    if(catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", *catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_internal_error
    if(catalogs_feed_ingestion_warnings->ad_video_download_internal_error) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_INTERNAL_ERROR", *catalogs_feed_ingestion_warnings->ad_video_download_internal_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download
    if(catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", *catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url
    if(catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL", *catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited
    if(catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED", *catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired
    if(catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", *catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_invalid_file
    if(catalogs_feed_ingestion_warnings->ad_video_download_invalid_file) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_INVALID_FILE", *catalogs_feed_ingestion_warnings->ad_video_download_invalid_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_site_error
    if(catalogs_feed_ingestion_warnings->ad_video_download_site_error) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_SITE_ERROR", *catalogs_feed_ingestion_warnings->ad_video_download_site_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_site_timeout
    if(catalogs_feed_ingestion_warnings->ad_video_download_site_timeout) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_SITE_TIMEOUT", *catalogs_feed_ingestion_warnings->ad_video_download_site_timeout) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_ssl_error
    if(catalogs_feed_ingestion_warnings->ad_video_download_ssl_error) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_SSL_ERROR", *catalogs_feed_ingestion_warnings->ad_video_download_ssl_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error
    if(catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR", *catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_length_too_short
    if(catalogs_feed_ingestion_warnings->ad_video_length_too_short) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_LENGTH_TOO_SHORT", *catalogs_feed_ingestion_warnings->ad_video_length_too_short) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_processing_empty_file
    if(catalogs_feed_ingestion_warnings->ad_video_processing_empty_file) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_PROCESSING_EMPTY_FILE", *catalogs_feed_ingestion_warnings->ad_video_processing_empty_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small
    if(catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL", *catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels
    if(catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_PROCESSING_TOO_MANY_PIXELS", *catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch
    if(catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_PROCESSING_TYPE_MISMATCH", *catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small
    if(catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL", *catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_file_not_accessible
    if(catalogs_feed_ingestion_warnings->additional_image_file_not_accessible) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", *catalogs_feed_ingestion_warnings->additional_image_file_not_accessible) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_file_not_found
    if(catalogs_feed_ingestion_warnings->additional_image_file_not_found) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_FILE_NOT_FOUND", *catalogs_feed_ingestion_warnings->additional_image_file_not_found) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_invalid_file
    if(catalogs_feed_ingestion_warnings->additional_image_invalid_file) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_INVALID_FILE", *catalogs_feed_ingestion_warnings->additional_image_invalid_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_level_internal_error
    if(catalogs_feed_ingestion_warnings->additional_image_level_internal_error) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", *catalogs_feed_ingestion_warnings->additional_image_level_internal_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->additional_image_malformed_url
    if(catalogs_feed_ingestion_warnings->additional_image_malformed_url) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_MALFORMED_URL", *catalogs_feed_ingestion_warnings->additional_image_malformed_url) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit
    if(catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit) {
    if(cJSON_AddNumberToObject(item, "FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT", *catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->hotel_price_header_is_present
    if(catalogs_feed_ingestion_warnings->hotel_price_header_is_present) {
    if(cJSON_AddNumberToObject(item, "HOTEL_PRICE_HEADER_IS_PRESENT", *catalogs_feed_ingestion_warnings->hotel_price_header_is_present) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->video_download_video_too_short
    if(catalogs_feed_ingestion_warnings->video_download_video_too_short) {
    if(cJSON_AddNumberToObject(item, "VIDEO_DOWNLOAD_VIDEO_TOO_SHORT", *catalogs_feed_ingestion_warnings->video_download_video_too_short) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->video_file_not_accessible
    if(catalogs_feed_ingestion_warnings->video_file_not_accessible) {
    if(cJSON_AddNumberToObject(item, "VIDEO_FILE_NOT_ACCESSIBLE", *catalogs_feed_ingestion_warnings->video_file_not_accessible) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->video_file_not_found
    if(catalogs_feed_ingestion_warnings->video_file_not_found) {
    if(cJSON_AddNumberToObject(item, "VIDEO_FILE_NOT_FOUND", *catalogs_feed_ingestion_warnings->video_file_not_found) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->video_invalid_file
    if(catalogs_feed_ingestion_warnings->video_invalid_file) {
    if(cJSON_AddNumberToObject(item, "VIDEO_INVALID_FILE", *catalogs_feed_ingestion_warnings->video_invalid_file) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->video_level_internal_error
    if(catalogs_feed_ingestion_warnings->video_level_internal_error) {
    if(cJSON_AddNumberToObject(item, "VIDEO_LEVEL_INTERNAL_ERROR", *catalogs_feed_ingestion_warnings->video_level_internal_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_warnings->video_malformed_url
    if(catalogs_feed_ingestion_warnings->video_malformed_url) {
    if(cJSON_AddNumberToObject(item, "VIDEO_MALFORMED_URL", *catalogs_feed_ingestion_warnings->video_malformed_url) == NULL) {
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

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_content_read_error
    int *ad_image_download_content_read_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error
    int *ad_image_download_dns_lookup_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible
    int *ad_image_download_file_not_accessible_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_file_not_found
    int *ad_image_download_file_not_found_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_400
    int *ad_image_download_http_status_400_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_403
    int *ad_image_download_http_status_403_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_404
    int *ad_image_download_http_status_404_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_405
    int *ad_image_download_http_status_405_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_410
    int *ad_image_download_http_status_410_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_429
    int *ad_image_download_http_status_429_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_500
    int *ad_image_download_http_status_500_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_502
    int *ad_image_download_http_status_502_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_503
    int *ad_image_download_http_status_503_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_504
    int *ad_image_download_http_status_504_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_507
    int *ad_image_download_http_status_507_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_508
    int *ad_image_download_http_status_508_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_520
    int *ad_image_download_http_status_520_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_521
    int *ad_image_download_http_status_521_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_522
    int *ad_image_download_http_status_522_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_http_status_525
    int *ad_image_download_http_status_525_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error
    int *ad_image_download_internal_configuration_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_internal_error
    int *ad_image_download_internal_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download
    int *ad_image_download_internal_failed_to_download_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url
    int *ad_image_download_internal_malformed_url_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited
    int *ad_image_download_internal_rate_limited_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired
    int *ad_image_download_internal_request_expired_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_invalid_file
    int *ad_image_download_invalid_file_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_site_error
    int *ad_image_download_site_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_site_timeout
    int *ad_image_download_site_timeout_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_ssl_error
    int *ad_image_download_ssl_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error
    int *ad_image_download_ssl_handshake_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_processing_empty_file
    int *ad_image_processing_empty_file_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small
    int *ad_image_processing_height_too_small_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels
    int *ad_image_processing_too_many_pixels_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch
    int *ad_image_processing_type_mismatch_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small
    int *ad_image_processing_width_too_small_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_content_read_error
    int *ad_video_download_content_read_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error
    int *ad_video_download_dns_lookup_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible
    int *ad_video_download_file_not_accessible_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_file_not_found
    int *ad_video_download_file_not_found_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_400
    int *ad_video_download_http_status_400_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_403
    int *ad_video_download_http_status_403_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_404
    int *ad_video_download_http_status_404_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_405
    int *ad_video_download_http_status_405_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_410
    int *ad_video_download_http_status_410_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_429
    int *ad_video_download_http_status_429_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_500
    int *ad_video_download_http_status_500_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_502
    int *ad_video_download_http_status_502_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_503
    int *ad_video_download_http_status_503_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_504
    int *ad_video_download_http_status_504_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_507
    int *ad_video_download_http_status_507_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_508
    int *ad_video_download_http_status_508_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_520
    int *ad_video_download_http_status_520_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_521
    int *ad_video_download_http_status_521_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_522
    int *ad_video_download_http_status_522_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_http_status_525
    int *ad_video_download_http_status_525_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error
    int *ad_video_download_internal_configuration_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_internal_error
    int *ad_video_download_internal_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download
    int *ad_video_download_internal_failed_to_download_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url
    int *ad_video_download_internal_malformed_url_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited
    int *ad_video_download_internal_rate_limited_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired
    int *ad_video_download_internal_request_expired_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_invalid_file
    int *ad_video_download_invalid_file_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_site_error
    int *ad_video_download_site_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_site_timeout
    int *ad_video_download_site_timeout_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_ssl_error
    int *ad_video_download_ssl_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error
    int *ad_video_download_ssl_handshake_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_length_too_short
    int *ad_video_length_too_short_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_processing_empty_file
    int *ad_video_processing_empty_file_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small
    int *ad_video_processing_height_too_small_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels
    int *ad_video_processing_too_many_pixels_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch
    int *ad_video_processing_type_mismatch_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small
    int *ad_video_processing_width_too_small_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->additional_image_file_not_accessible
    int *additional_image_file_not_accessible_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->additional_image_file_not_found
    int *additional_image_file_not_found_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->additional_image_invalid_file
    int *additional_image_invalid_file_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->additional_image_level_internal_error
    int *additional_image_level_internal_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->additional_image_malformed_url
    int *additional_image_malformed_url_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit
    int *fetch_google_sheet_public_can_edit_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->hotel_price_header_is_present
    int *hotel_price_header_is_present_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->video_download_video_too_short
    int *video_download_video_too_short_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->video_file_not_accessible
    int *video_file_not_accessible_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->video_file_not_found
    int *video_file_not_found_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->video_invalid_file
    int *video_invalid_file_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->video_level_internal_error
    int *video_level_internal_error_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_warnings->video_malformed_url
    int *video_malformed_url_local_var = NULL;

    // catalogs_feed_ingestion_warnings->ad_image_download_content_read_error
    cJSON *ad_image_download_content_read_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR");
    if (cJSON_IsNull(ad_image_download_content_read_error)) {
        ad_image_download_content_read_error = NULL;
    }
    if (ad_image_download_content_read_error) { 
    if(!cJSON_IsNumber(ad_image_download_content_read_error))
    {
    goto end; //Numeric
    }
    ad_image_download_content_read_error_local_var = malloc(sizeof(int));
    if(!ad_image_download_content_read_error_local_var)
    {
        goto end;
    }
    *ad_image_download_content_read_error_local_var = ad_image_download_content_read_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_dns_lookup_error
    cJSON *ad_image_download_dns_lookup_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR");
    if (cJSON_IsNull(ad_image_download_dns_lookup_error)) {
        ad_image_download_dns_lookup_error = NULL;
    }
    if (ad_image_download_dns_lookup_error) { 
    if(!cJSON_IsNumber(ad_image_download_dns_lookup_error))
    {
    goto end; //Numeric
    }
    ad_image_download_dns_lookup_error_local_var = malloc(sizeof(int));
    if(!ad_image_download_dns_lookup_error_local_var)
    {
        goto end;
    }
    *ad_image_download_dns_lookup_error_local_var = ad_image_download_dns_lookup_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_file_not_accessible
    cJSON *ad_image_download_file_not_accessible = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE");
    if (cJSON_IsNull(ad_image_download_file_not_accessible)) {
        ad_image_download_file_not_accessible = NULL;
    }
    if (ad_image_download_file_not_accessible) { 
    if(!cJSON_IsNumber(ad_image_download_file_not_accessible))
    {
    goto end; //Numeric
    }
    ad_image_download_file_not_accessible_local_var = malloc(sizeof(int));
    if(!ad_image_download_file_not_accessible_local_var)
    {
        goto end;
    }
    *ad_image_download_file_not_accessible_local_var = ad_image_download_file_not_accessible->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_file_not_found
    cJSON *ad_image_download_file_not_found = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND");
    if (cJSON_IsNull(ad_image_download_file_not_found)) {
        ad_image_download_file_not_found = NULL;
    }
    if (ad_image_download_file_not_found) { 
    if(!cJSON_IsNumber(ad_image_download_file_not_found))
    {
    goto end; //Numeric
    }
    ad_image_download_file_not_found_local_var = malloc(sizeof(int));
    if(!ad_image_download_file_not_found_local_var)
    {
        goto end;
    }
    *ad_image_download_file_not_found_local_var = ad_image_download_file_not_found->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_400
    cJSON *ad_image_download_http_status_400 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_400");
    if (cJSON_IsNull(ad_image_download_http_status_400)) {
        ad_image_download_http_status_400 = NULL;
    }
    if (ad_image_download_http_status_400) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_400))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_400_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_400_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_400_local_var = ad_image_download_http_status_400->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_403
    cJSON *ad_image_download_http_status_403 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_403");
    if (cJSON_IsNull(ad_image_download_http_status_403)) {
        ad_image_download_http_status_403 = NULL;
    }
    if (ad_image_download_http_status_403) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_403))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_403_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_403_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_403_local_var = ad_image_download_http_status_403->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_404
    cJSON *ad_image_download_http_status_404 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_404");
    if (cJSON_IsNull(ad_image_download_http_status_404)) {
        ad_image_download_http_status_404 = NULL;
    }
    if (ad_image_download_http_status_404) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_404))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_404_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_404_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_404_local_var = ad_image_download_http_status_404->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_405
    cJSON *ad_image_download_http_status_405 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_405");
    if (cJSON_IsNull(ad_image_download_http_status_405)) {
        ad_image_download_http_status_405 = NULL;
    }
    if (ad_image_download_http_status_405) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_405))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_405_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_405_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_405_local_var = ad_image_download_http_status_405->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_410
    cJSON *ad_image_download_http_status_410 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_410");
    if (cJSON_IsNull(ad_image_download_http_status_410)) {
        ad_image_download_http_status_410 = NULL;
    }
    if (ad_image_download_http_status_410) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_410))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_410_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_410_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_410_local_var = ad_image_download_http_status_410->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_429
    cJSON *ad_image_download_http_status_429 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_429");
    if (cJSON_IsNull(ad_image_download_http_status_429)) {
        ad_image_download_http_status_429 = NULL;
    }
    if (ad_image_download_http_status_429) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_429))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_429_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_429_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_429_local_var = ad_image_download_http_status_429->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_500
    cJSON *ad_image_download_http_status_500 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_500");
    if (cJSON_IsNull(ad_image_download_http_status_500)) {
        ad_image_download_http_status_500 = NULL;
    }
    if (ad_image_download_http_status_500) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_500))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_500_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_500_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_500_local_var = ad_image_download_http_status_500->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_502
    cJSON *ad_image_download_http_status_502 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_502");
    if (cJSON_IsNull(ad_image_download_http_status_502)) {
        ad_image_download_http_status_502 = NULL;
    }
    if (ad_image_download_http_status_502) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_502))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_502_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_502_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_502_local_var = ad_image_download_http_status_502->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_503
    cJSON *ad_image_download_http_status_503 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_503");
    if (cJSON_IsNull(ad_image_download_http_status_503)) {
        ad_image_download_http_status_503 = NULL;
    }
    if (ad_image_download_http_status_503) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_503))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_503_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_503_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_503_local_var = ad_image_download_http_status_503->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_504
    cJSON *ad_image_download_http_status_504 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_504");
    if (cJSON_IsNull(ad_image_download_http_status_504)) {
        ad_image_download_http_status_504 = NULL;
    }
    if (ad_image_download_http_status_504) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_504))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_504_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_504_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_504_local_var = ad_image_download_http_status_504->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_507
    cJSON *ad_image_download_http_status_507 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_507");
    if (cJSON_IsNull(ad_image_download_http_status_507)) {
        ad_image_download_http_status_507 = NULL;
    }
    if (ad_image_download_http_status_507) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_507))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_507_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_507_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_507_local_var = ad_image_download_http_status_507->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_508
    cJSON *ad_image_download_http_status_508 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_508");
    if (cJSON_IsNull(ad_image_download_http_status_508)) {
        ad_image_download_http_status_508 = NULL;
    }
    if (ad_image_download_http_status_508) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_508))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_508_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_508_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_508_local_var = ad_image_download_http_status_508->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_520
    cJSON *ad_image_download_http_status_520 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_520");
    if (cJSON_IsNull(ad_image_download_http_status_520)) {
        ad_image_download_http_status_520 = NULL;
    }
    if (ad_image_download_http_status_520) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_520))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_520_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_520_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_520_local_var = ad_image_download_http_status_520->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_521
    cJSON *ad_image_download_http_status_521 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_521");
    if (cJSON_IsNull(ad_image_download_http_status_521)) {
        ad_image_download_http_status_521 = NULL;
    }
    if (ad_image_download_http_status_521) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_521))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_521_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_521_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_521_local_var = ad_image_download_http_status_521->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_522
    cJSON *ad_image_download_http_status_522 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_522");
    if (cJSON_IsNull(ad_image_download_http_status_522)) {
        ad_image_download_http_status_522 = NULL;
    }
    if (ad_image_download_http_status_522) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_522))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_522_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_522_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_522_local_var = ad_image_download_http_status_522->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_http_status_525
    cJSON *ad_image_download_http_status_525 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_HTTP_STATUS_525");
    if (cJSON_IsNull(ad_image_download_http_status_525)) {
        ad_image_download_http_status_525 = NULL;
    }
    if (ad_image_download_http_status_525) { 
    if(!cJSON_IsNumber(ad_image_download_http_status_525))
    {
    goto end; //Numeric
    }
    ad_image_download_http_status_525_local_var = malloc(sizeof(int));
    if(!ad_image_download_http_status_525_local_var)
    {
        goto end;
    }
    *ad_image_download_http_status_525_local_var = ad_image_download_http_status_525->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_internal_configuration_error
    cJSON *ad_image_download_internal_configuration_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR");
    if (cJSON_IsNull(ad_image_download_internal_configuration_error)) {
        ad_image_download_internal_configuration_error = NULL;
    }
    if (ad_image_download_internal_configuration_error) { 
    if(!cJSON_IsNumber(ad_image_download_internal_configuration_error))
    {
    goto end; //Numeric
    }
    ad_image_download_internal_configuration_error_local_var = malloc(sizeof(int));
    if(!ad_image_download_internal_configuration_error_local_var)
    {
        goto end;
    }
    *ad_image_download_internal_configuration_error_local_var = ad_image_download_internal_configuration_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_internal_error
    cJSON *ad_image_download_internal_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_INTERNAL_ERROR");
    if (cJSON_IsNull(ad_image_download_internal_error)) {
        ad_image_download_internal_error = NULL;
    }
    if (ad_image_download_internal_error) { 
    if(!cJSON_IsNumber(ad_image_download_internal_error))
    {
    goto end; //Numeric
    }
    ad_image_download_internal_error_local_var = malloc(sizeof(int));
    if(!ad_image_download_internal_error_local_var)
    {
        goto end;
    }
    *ad_image_download_internal_error_local_var = ad_image_download_internal_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_internal_failed_to_download
    cJSON *ad_image_download_internal_failed_to_download = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD");
    if (cJSON_IsNull(ad_image_download_internal_failed_to_download)) {
        ad_image_download_internal_failed_to_download = NULL;
    }
    if (ad_image_download_internal_failed_to_download) { 
    if(!cJSON_IsNumber(ad_image_download_internal_failed_to_download))
    {
    goto end; //Numeric
    }
    ad_image_download_internal_failed_to_download_local_var = malloc(sizeof(int));
    if(!ad_image_download_internal_failed_to_download_local_var)
    {
        goto end;
    }
    *ad_image_download_internal_failed_to_download_local_var = ad_image_download_internal_failed_to_download->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_internal_malformed_url
    cJSON *ad_image_download_internal_malformed_url = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL");
    if (cJSON_IsNull(ad_image_download_internal_malformed_url)) {
        ad_image_download_internal_malformed_url = NULL;
    }
    if (ad_image_download_internal_malformed_url) { 
    if(!cJSON_IsNumber(ad_image_download_internal_malformed_url))
    {
    goto end; //Numeric
    }
    ad_image_download_internal_malformed_url_local_var = malloc(sizeof(int));
    if(!ad_image_download_internal_malformed_url_local_var)
    {
        goto end;
    }
    *ad_image_download_internal_malformed_url_local_var = ad_image_download_internal_malformed_url->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_internal_rate_limited
    cJSON *ad_image_download_internal_rate_limited = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED");
    if (cJSON_IsNull(ad_image_download_internal_rate_limited)) {
        ad_image_download_internal_rate_limited = NULL;
    }
    if (ad_image_download_internal_rate_limited) { 
    if(!cJSON_IsNumber(ad_image_download_internal_rate_limited))
    {
    goto end; //Numeric
    }
    ad_image_download_internal_rate_limited_local_var = malloc(sizeof(int));
    if(!ad_image_download_internal_rate_limited_local_var)
    {
        goto end;
    }
    *ad_image_download_internal_rate_limited_local_var = ad_image_download_internal_rate_limited->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_internal_request_expired
    cJSON *ad_image_download_internal_request_expired = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED");
    if (cJSON_IsNull(ad_image_download_internal_request_expired)) {
        ad_image_download_internal_request_expired = NULL;
    }
    if (ad_image_download_internal_request_expired) { 
    if(!cJSON_IsNumber(ad_image_download_internal_request_expired))
    {
    goto end; //Numeric
    }
    ad_image_download_internal_request_expired_local_var = malloc(sizeof(int));
    if(!ad_image_download_internal_request_expired_local_var)
    {
        goto end;
    }
    *ad_image_download_internal_request_expired_local_var = ad_image_download_internal_request_expired->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_invalid_file
    cJSON *ad_image_download_invalid_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_INVALID_FILE");
    if (cJSON_IsNull(ad_image_download_invalid_file)) {
        ad_image_download_invalid_file = NULL;
    }
    if (ad_image_download_invalid_file) { 
    if(!cJSON_IsNumber(ad_image_download_invalid_file))
    {
    goto end; //Numeric
    }
    ad_image_download_invalid_file_local_var = malloc(sizeof(int));
    if(!ad_image_download_invalid_file_local_var)
    {
        goto end;
    }
    *ad_image_download_invalid_file_local_var = ad_image_download_invalid_file->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_site_error
    cJSON *ad_image_download_site_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_SITE_ERROR");
    if (cJSON_IsNull(ad_image_download_site_error)) {
        ad_image_download_site_error = NULL;
    }
    if (ad_image_download_site_error) { 
    if(!cJSON_IsNumber(ad_image_download_site_error))
    {
    goto end; //Numeric
    }
    ad_image_download_site_error_local_var = malloc(sizeof(int));
    if(!ad_image_download_site_error_local_var)
    {
        goto end;
    }
    *ad_image_download_site_error_local_var = ad_image_download_site_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_site_timeout
    cJSON *ad_image_download_site_timeout = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_SITE_TIMEOUT");
    if (cJSON_IsNull(ad_image_download_site_timeout)) {
        ad_image_download_site_timeout = NULL;
    }
    if (ad_image_download_site_timeout) { 
    if(!cJSON_IsNumber(ad_image_download_site_timeout))
    {
    goto end; //Numeric
    }
    ad_image_download_site_timeout_local_var = malloc(sizeof(int));
    if(!ad_image_download_site_timeout_local_var)
    {
        goto end;
    }
    *ad_image_download_site_timeout_local_var = ad_image_download_site_timeout->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_ssl_error
    cJSON *ad_image_download_ssl_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_SSL_ERROR");
    if (cJSON_IsNull(ad_image_download_ssl_error)) {
        ad_image_download_ssl_error = NULL;
    }
    if (ad_image_download_ssl_error) { 
    if(!cJSON_IsNumber(ad_image_download_ssl_error))
    {
    goto end; //Numeric
    }
    ad_image_download_ssl_error_local_var = malloc(sizeof(int));
    if(!ad_image_download_ssl_error_local_var)
    {
        goto end;
    }
    *ad_image_download_ssl_error_local_var = ad_image_download_ssl_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_download_ssl_handshake_error
    cJSON *ad_image_download_ssl_handshake_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR");
    if (cJSON_IsNull(ad_image_download_ssl_handshake_error)) {
        ad_image_download_ssl_handshake_error = NULL;
    }
    if (ad_image_download_ssl_handshake_error) { 
    if(!cJSON_IsNumber(ad_image_download_ssl_handshake_error))
    {
    goto end; //Numeric
    }
    ad_image_download_ssl_handshake_error_local_var = malloc(sizeof(int));
    if(!ad_image_download_ssl_handshake_error_local_var)
    {
        goto end;
    }
    *ad_image_download_ssl_handshake_error_local_var = ad_image_download_ssl_handshake_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_processing_empty_file
    cJSON *ad_image_processing_empty_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_PROCESSING_EMPTY_FILE");
    if (cJSON_IsNull(ad_image_processing_empty_file)) {
        ad_image_processing_empty_file = NULL;
    }
    if (ad_image_processing_empty_file) { 
    if(!cJSON_IsNumber(ad_image_processing_empty_file))
    {
    goto end; //Numeric
    }
    ad_image_processing_empty_file_local_var = malloc(sizeof(int));
    if(!ad_image_processing_empty_file_local_var)
    {
        goto end;
    }
    *ad_image_processing_empty_file_local_var = ad_image_processing_empty_file->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_processing_height_too_small
    cJSON *ad_image_processing_height_too_small = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL");
    if (cJSON_IsNull(ad_image_processing_height_too_small)) {
        ad_image_processing_height_too_small = NULL;
    }
    if (ad_image_processing_height_too_small) { 
    if(!cJSON_IsNumber(ad_image_processing_height_too_small))
    {
    goto end; //Numeric
    }
    ad_image_processing_height_too_small_local_var = malloc(sizeof(int));
    if(!ad_image_processing_height_too_small_local_var)
    {
        goto end;
    }
    *ad_image_processing_height_too_small_local_var = ad_image_processing_height_too_small->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_processing_too_many_pixels
    cJSON *ad_image_processing_too_many_pixels = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_PROCESSING_TOO_MANY_PIXELS");
    if (cJSON_IsNull(ad_image_processing_too_many_pixels)) {
        ad_image_processing_too_many_pixels = NULL;
    }
    if (ad_image_processing_too_many_pixels) { 
    if(!cJSON_IsNumber(ad_image_processing_too_many_pixels))
    {
    goto end; //Numeric
    }
    ad_image_processing_too_many_pixels_local_var = malloc(sizeof(int));
    if(!ad_image_processing_too_many_pixels_local_var)
    {
        goto end;
    }
    *ad_image_processing_too_many_pixels_local_var = ad_image_processing_too_many_pixels->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_processing_type_mismatch
    cJSON *ad_image_processing_type_mismatch = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_PROCESSING_TYPE_MISMATCH");
    if (cJSON_IsNull(ad_image_processing_type_mismatch)) {
        ad_image_processing_type_mismatch = NULL;
    }
    if (ad_image_processing_type_mismatch) { 
    if(!cJSON_IsNumber(ad_image_processing_type_mismatch))
    {
    goto end; //Numeric
    }
    ad_image_processing_type_mismatch_local_var = malloc(sizeof(int));
    if(!ad_image_processing_type_mismatch_local_var)
    {
        goto end;
    }
    *ad_image_processing_type_mismatch_local_var = ad_image_processing_type_mismatch->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_image_processing_width_too_small
    cJSON *ad_image_processing_width_too_small = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL");
    if (cJSON_IsNull(ad_image_processing_width_too_small)) {
        ad_image_processing_width_too_small = NULL;
    }
    if (ad_image_processing_width_too_small) { 
    if(!cJSON_IsNumber(ad_image_processing_width_too_small))
    {
    goto end; //Numeric
    }
    ad_image_processing_width_too_small_local_var = malloc(sizeof(int));
    if(!ad_image_processing_width_too_small_local_var)
    {
        goto end;
    }
    *ad_image_processing_width_too_small_local_var = ad_image_processing_width_too_small->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_content_read_error
    cJSON *ad_video_download_content_read_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR");
    if (cJSON_IsNull(ad_video_download_content_read_error)) {
        ad_video_download_content_read_error = NULL;
    }
    if (ad_video_download_content_read_error) { 
    if(!cJSON_IsNumber(ad_video_download_content_read_error))
    {
    goto end; //Numeric
    }
    ad_video_download_content_read_error_local_var = malloc(sizeof(int));
    if(!ad_video_download_content_read_error_local_var)
    {
        goto end;
    }
    *ad_video_download_content_read_error_local_var = ad_video_download_content_read_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_dns_lookup_error
    cJSON *ad_video_download_dns_lookup_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR");
    if (cJSON_IsNull(ad_video_download_dns_lookup_error)) {
        ad_video_download_dns_lookup_error = NULL;
    }
    if (ad_video_download_dns_lookup_error) { 
    if(!cJSON_IsNumber(ad_video_download_dns_lookup_error))
    {
    goto end; //Numeric
    }
    ad_video_download_dns_lookup_error_local_var = malloc(sizeof(int));
    if(!ad_video_download_dns_lookup_error_local_var)
    {
        goto end;
    }
    *ad_video_download_dns_lookup_error_local_var = ad_video_download_dns_lookup_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_file_not_accessible
    cJSON *ad_video_download_file_not_accessible = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE");
    if (cJSON_IsNull(ad_video_download_file_not_accessible)) {
        ad_video_download_file_not_accessible = NULL;
    }
    if (ad_video_download_file_not_accessible) { 
    if(!cJSON_IsNumber(ad_video_download_file_not_accessible))
    {
    goto end; //Numeric
    }
    ad_video_download_file_not_accessible_local_var = malloc(sizeof(int));
    if(!ad_video_download_file_not_accessible_local_var)
    {
        goto end;
    }
    *ad_video_download_file_not_accessible_local_var = ad_video_download_file_not_accessible->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_file_not_found
    cJSON *ad_video_download_file_not_found = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND");
    if (cJSON_IsNull(ad_video_download_file_not_found)) {
        ad_video_download_file_not_found = NULL;
    }
    if (ad_video_download_file_not_found) { 
    if(!cJSON_IsNumber(ad_video_download_file_not_found))
    {
    goto end; //Numeric
    }
    ad_video_download_file_not_found_local_var = malloc(sizeof(int));
    if(!ad_video_download_file_not_found_local_var)
    {
        goto end;
    }
    *ad_video_download_file_not_found_local_var = ad_video_download_file_not_found->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_400
    cJSON *ad_video_download_http_status_400 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_400");
    if (cJSON_IsNull(ad_video_download_http_status_400)) {
        ad_video_download_http_status_400 = NULL;
    }
    if (ad_video_download_http_status_400) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_400))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_400_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_400_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_400_local_var = ad_video_download_http_status_400->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_403
    cJSON *ad_video_download_http_status_403 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_403");
    if (cJSON_IsNull(ad_video_download_http_status_403)) {
        ad_video_download_http_status_403 = NULL;
    }
    if (ad_video_download_http_status_403) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_403))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_403_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_403_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_403_local_var = ad_video_download_http_status_403->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_404
    cJSON *ad_video_download_http_status_404 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_404");
    if (cJSON_IsNull(ad_video_download_http_status_404)) {
        ad_video_download_http_status_404 = NULL;
    }
    if (ad_video_download_http_status_404) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_404))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_404_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_404_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_404_local_var = ad_video_download_http_status_404->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_405
    cJSON *ad_video_download_http_status_405 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_405");
    if (cJSON_IsNull(ad_video_download_http_status_405)) {
        ad_video_download_http_status_405 = NULL;
    }
    if (ad_video_download_http_status_405) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_405))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_405_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_405_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_405_local_var = ad_video_download_http_status_405->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_410
    cJSON *ad_video_download_http_status_410 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_410");
    if (cJSON_IsNull(ad_video_download_http_status_410)) {
        ad_video_download_http_status_410 = NULL;
    }
    if (ad_video_download_http_status_410) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_410))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_410_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_410_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_410_local_var = ad_video_download_http_status_410->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_429
    cJSON *ad_video_download_http_status_429 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_429");
    if (cJSON_IsNull(ad_video_download_http_status_429)) {
        ad_video_download_http_status_429 = NULL;
    }
    if (ad_video_download_http_status_429) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_429))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_429_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_429_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_429_local_var = ad_video_download_http_status_429->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_500
    cJSON *ad_video_download_http_status_500 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_500");
    if (cJSON_IsNull(ad_video_download_http_status_500)) {
        ad_video_download_http_status_500 = NULL;
    }
    if (ad_video_download_http_status_500) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_500))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_500_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_500_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_500_local_var = ad_video_download_http_status_500->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_502
    cJSON *ad_video_download_http_status_502 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_502");
    if (cJSON_IsNull(ad_video_download_http_status_502)) {
        ad_video_download_http_status_502 = NULL;
    }
    if (ad_video_download_http_status_502) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_502))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_502_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_502_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_502_local_var = ad_video_download_http_status_502->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_503
    cJSON *ad_video_download_http_status_503 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_503");
    if (cJSON_IsNull(ad_video_download_http_status_503)) {
        ad_video_download_http_status_503 = NULL;
    }
    if (ad_video_download_http_status_503) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_503))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_503_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_503_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_503_local_var = ad_video_download_http_status_503->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_504
    cJSON *ad_video_download_http_status_504 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_504");
    if (cJSON_IsNull(ad_video_download_http_status_504)) {
        ad_video_download_http_status_504 = NULL;
    }
    if (ad_video_download_http_status_504) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_504))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_504_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_504_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_504_local_var = ad_video_download_http_status_504->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_507
    cJSON *ad_video_download_http_status_507 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_507");
    if (cJSON_IsNull(ad_video_download_http_status_507)) {
        ad_video_download_http_status_507 = NULL;
    }
    if (ad_video_download_http_status_507) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_507))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_507_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_507_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_507_local_var = ad_video_download_http_status_507->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_508
    cJSON *ad_video_download_http_status_508 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_508");
    if (cJSON_IsNull(ad_video_download_http_status_508)) {
        ad_video_download_http_status_508 = NULL;
    }
    if (ad_video_download_http_status_508) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_508))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_508_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_508_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_508_local_var = ad_video_download_http_status_508->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_520
    cJSON *ad_video_download_http_status_520 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_520");
    if (cJSON_IsNull(ad_video_download_http_status_520)) {
        ad_video_download_http_status_520 = NULL;
    }
    if (ad_video_download_http_status_520) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_520))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_520_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_520_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_520_local_var = ad_video_download_http_status_520->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_521
    cJSON *ad_video_download_http_status_521 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_521");
    if (cJSON_IsNull(ad_video_download_http_status_521)) {
        ad_video_download_http_status_521 = NULL;
    }
    if (ad_video_download_http_status_521) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_521))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_521_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_521_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_521_local_var = ad_video_download_http_status_521->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_522
    cJSON *ad_video_download_http_status_522 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_522");
    if (cJSON_IsNull(ad_video_download_http_status_522)) {
        ad_video_download_http_status_522 = NULL;
    }
    if (ad_video_download_http_status_522) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_522))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_522_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_522_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_522_local_var = ad_video_download_http_status_522->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_http_status_525
    cJSON *ad_video_download_http_status_525 = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_HTTP_STATUS_525");
    if (cJSON_IsNull(ad_video_download_http_status_525)) {
        ad_video_download_http_status_525 = NULL;
    }
    if (ad_video_download_http_status_525) { 
    if(!cJSON_IsNumber(ad_video_download_http_status_525))
    {
    goto end; //Numeric
    }
    ad_video_download_http_status_525_local_var = malloc(sizeof(int));
    if(!ad_video_download_http_status_525_local_var)
    {
        goto end;
    }
    *ad_video_download_http_status_525_local_var = ad_video_download_http_status_525->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_internal_configuration_error
    cJSON *ad_video_download_internal_configuration_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR");
    if (cJSON_IsNull(ad_video_download_internal_configuration_error)) {
        ad_video_download_internal_configuration_error = NULL;
    }
    if (ad_video_download_internal_configuration_error) { 
    if(!cJSON_IsNumber(ad_video_download_internal_configuration_error))
    {
    goto end; //Numeric
    }
    ad_video_download_internal_configuration_error_local_var = malloc(sizeof(int));
    if(!ad_video_download_internal_configuration_error_local_var)
    {
        goto end;
    }
    *ad_video_download_internal_configuration_error_local_var = ad_video_download_internal_configuration_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_internal_error
    cJSON *ad_video_download_internal_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_INTERNAL_ERROR");
    if (cJSON_IsNull(ad_video_download_internal_error)) {
        ad_video_download_internal_error = NULL;
    }
    if (ad_video_download_internal_error) { 
    if(!cJSON_IsNumber(ad_video_download_internal_error))
    {
    goto end; //Numeric
    }
    ad_video_download_internal_error_local_var = malloc(sizeof(int));
    if(!ad_video_download_internal_error_local_var)
    {
        goto end;
    }
    *ad_video_download_internal_error_local_var = ad_video_download_internal_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_internal_failed_to_download
    cJSON *ad_video_download_internal_failed_to_download = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD");
    if (cJSON_IsNull(ad_video_download_internal_failed_to_download)) {
        ad_video_download_internal_failed_to_download = NULL;
    }
    if (ad_video_download_internal_failed_to_download) { 
    if(!cJSON_IsNumber(ad_video_download_internal_failed_to_download))
    {
    goto end; //Numeric
    }
    ad_video_download_internal_failed_to_download_local_var = malloc(sizeof(int));
    if(!ad_video_download_internal_failed_to_download_local_var)
    {
        goto end;
    }
    *ad_video_download_internal_failed_to_download_local_var = ad_video_download_internal_failed_to_download->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_internal_malformed_url
    cJSON *ad_video_download_internal_malformed_url = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL");
    if (cJSON_IsNull(ad_video_download_internal_malformed_url)) {
        ad_video_download_internal_malformed_url = NULL;
    }
    if (ad_video_download_internal_malformed_url) { 
    if(!cJSON_IsNumber(ad_video_download_internal_malformed_url))
    {
    goto end; //Numeric
    }
    ad_video_download_internal_malformed_url_local_var = malloc(sizeof(int));
    if(!ad_video_download_internal_malformed_url_local_var)
    {
        goto end;
    }
    *ad_video_download_internal_malformed_url_local_var = ad_video_download_internal_malformed_url->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_internal_rate_limited
    cJSON *ad_video_download_internal_rate_limited = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED");
    if (cJSON_IsNull(ad_video_download_internal_rate_limited)) {
        ad_video_download_internal_rate_limited = NULL;
    }
    if (ad_video_download_internal_rate_limited) { 
    if(!cJSON_IsNumber(ad_video_download_internal_rate_limited))
    {
    goto end; //Numeric
    }
    ad_video_download_internal_rate_limited_local_var = malloc(sizeof(int));
    if(!ad_video_download_internal_rate_limited_local_var)
    {
        goto end;
    }
    *ad_video_download_internal_rate_limited_local_var = ad_video_download_internal_rate_limited->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_internal_request_expired
    cJSON *ad_video_download_internal_request_expired = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED");
    if (cJSON_IsNull(ad_video_download_internal_request_expired)) {
        ad_video_download_internal_request_expired = NULL;
    }
    if (ad_video_download_internal_request_expired) { 
    if(!cJSON_IsNumber(ad_video_download_internal_request_expired))
    {
    goto end; //Numeric
    }
    ad_video_download_internal_request_expired_local_var = malloc(sizeof(int));
    if(!ad_video_download_internal_request_expired_local_var)
    {
        goto end;
    }
    *ad_video_download_internal_request_expired_local_var = ad_video_download_internal_request_expired->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_invalid_file
    cJSON *ad_video_download_invalid_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_INVALID_FILE");
    if (cJSON_IsNull(ad_video_download_invalid_file)) {
        ad_video_download_invalid_file = NULL;
    }
    if (ad_video_download_invalid_file) { 
    if(!cJSON_IsNumber(ad_video_download_invalid_file))
    {
    goto end; //Numeric
    }
    ad_video_download_invalid_file_local_var = malloc(sizeof(int));
    if(!ad_video_download_invalid_file_local_var)
    {
        goto end;
    }
    *ad_video_download_invalid_file_local_var = ad_video_download_invalid_file->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_site_error
    cJSON *ad_video_download_site_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_SITE_ERROR");
    if (cJSON_IsNull(ad_video_download_site_error)) {
        ad_video_download_site_error = NULL;
    }
    if (ad_video_download_site_error) { 
    if(!cJSON_IsNumber(ad_video_download_site_error))
    {
    goto end; //Numeric
    }
    ad_video_download_site_error_local_var = malloc(sizeof(int));
    if(!ad_video_download_site_error_local_var)
    {
        goto end;
    }
    *ad_video_download_site_error_local_var = ad_video_download_site_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_site_timeout
    cJSON *ad_video_download_site_timeout = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_SITE_TIMEOUT");
    if (cJSON_IsNull(ad_video_download_site_timeout)) {
        ad_video_download_site_timeout = NULL;
    }
    if (ad_video_download_site_timeout) { 
    if(!cJSON_IsNumber(ad_video_download_site_timeout))
    {
    goto end; //Numeric
    }
    ad_video_download_site_timeout_local_var = malloc(sizeof(int));
    if(!ad_video_download_site_timeout_local_var)
    {
        goto end;
    }
    *ad_video_download_site_timeout_local_var = ad_video_download_site_timeout->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_ssl_error
    cJSON *ad_video_download_ssl_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_SSL_ERROR");
    if (cJSON_IsNull(ad_video_download_ssl_error)) {
        ad_video_download_ssl_error = NULL;
    }
    if (ad_video_download_ssl_error) { 
    if(!cJSON_IsNumber(ad_video_download_ssl_error))
    {
    goto end; //Numeric
    }
    ad_video_download_ssl_error_local_var = malloc(sizeof(int));
    if(!ad_video_download_ssl_error_local_var)
    {
        goto end;
    }
    *ad_video_download_ssl_error_local_var = ad_video_download_ssl_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_download_ssl_handshake_error
    cJSON *ad_video_download_ssl_handshake_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR");
    if (cJSON_IsNull(ad_video_download_ssl_handshake_error)) {
        ad_video_download_ssl_handshake_error = NULL;
    }
    if (ad_video_download_ssl_handshake_error) { 
    if(!cJSON_IsNumber(ad_video_download_ssl_handshake_error))
    {
    goto end; //Numeric
    }
    ad_video_download_ssl_handshake_error_local_var = malloc(sizeof(int));
    if(!ad_video_download_ssl_handshake_error_local_var)
    {
        goto end;
    }
    *ad_video_download_ssl_handshake_error_local_var = ad_video_download_ssl_handshake_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_length_too_short
    cJSON *ad_video_length_too_short = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_LENGTH_TOO_SHORT");
    if (cJSON_IsNull(ad_video_length_too_short)) {
        ad_video_length_too_short = NULL;
    }
    if (ad_video_length_too_short) { 
    if(!cJSON_IsNumber(ad_video_length_too_short))
    {
    goto end; //Numeric
    }
    ad_video_length_too_short_local_var = malloc(sizeof(int));
    if(!ad_video_length_too_short_local_var)
    {
        goto end;
    }
    *ad_video_length_too_short_local_var = ad_video_length_too_short->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_processing_empty_file
    cJSON *ad_video_processing_empty_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_PROCESSING_EMPTY_FILE");
    if (cJSON_IsNull(ad_video_processing_empty_file)) {
        ad_video_processing_empty_file = NULL;
    }
    if (ad_video_processing_empty_file) { 
    if(!cJSON_IsNumber(ad_video_processing_empty_file))
    {
    goto end; //Numeric
    }
    ad_video_processing_empty_file_local_var = malloc(sizeof(int));
    if(!ad_video_processing_empty_file_local_var)
    {
        goto end;
    }
    *ad_video_processing_empty_file_local_var = ad_video_processing_empty_file->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_processing_height_too_small
    cJSON *ad_video_processing_height_too_small = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL");
    if (cJSON_IsNull(ad_video_processing_height_too_small)) {
        ad_video_processing_height_too_small = NULL;
    }
    if (ad_video_processing_height_too_small) { 
    if(!cJSON_IsNumber(ad_video_processing_height_too_small))
    {
    goto end; //Numeric
    }
    ad_video_processing_height_too_small_local_var = malloc(sizeof(int));
    if(!ad_video_processing_height_too_small_local_var)
    {
        goto end;
    }
    *ad_video_processing_height_too_small_local_var = ad_video_processing_height_too_small->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_processing_too_many_pixels
    cJSON *ad_video_processing_too_many_pixels = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_PROCESSING_TOO_MANY_PIXELS");
    if (cJSON_IsNull(ad_video_processing_too_many_pixels)) {
        ad_video_processing_too_many_pixels = NULL;
    }
    if (ad_video_processing_too_many_pixels) { 
    if(!cJSON_IsNumber(ad_video_processing_too_many_pixels))
    {
    goto end; //Numeric
    }
    ad_video_processing_too_many_pixels_local_var = malloc(sizeof(int));
    if(!ad_video_processing_too_many_pixels_local_var)
    {
        goto end;
    }
    *ad_video_processing_too_many_pixels_local_var = ad_video_processing_too_many_pixels->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_processing_type_mismatch
    cJSON *ad_video_processing_type_mismatch = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_PROCESSING_TYPE_MISMATCH");
    if (cJSON_IsNull(ad_video_processing_type_mismatch)) {
        ad_video_processing_type_mismatch = NULL;
    }
    if (ad_video_processing_type_mismatch) { 
    if(!cJSON_IsNumber(ad_video_processing_type_mismatch))
    {
    goto end; //Numeric
    }
    ad_video_processing_type_mismatch_local_var = malloc(sizeof(int));
    if(!ad_video_processing_type_mismatch_local_var)
    {
        goto end;
    }
    *ad_video_processing_type_mismatch_local_var = ad_video_processing_type_mismatch->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->ad_video_processing_width_too_small
    cJSON *ad_video_processing_width_too_small = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL");
    if (cJSON_IsNull(ad_video_processing_width_too_small)) {
        ad_video_processing_width_too_small = NULL;
    }
    if (ad_video_processing_width_too_small) { 
    if(!cJSON_IsNumber(ad_video_processing_width_too_small))
    {
    goto end; //Numeric
    }
    ad_video_processing_width_too_small_local_var = malloc(sizeof(int));
    if(!ad_video_processing_width_too_small_local_var)
    {
        goto end;
    }
    *ad_video_processing_width_too_small_local_var = ad_video_processing_width_too_small->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->additional_image_file_not_accessible
    cJSON *additional_image_file_not_accessible = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE");
    if (cJSON_IsNull(additional_image_file_not_accessible)) {
        additional_image_file_not_accessible = NULL;
    }
    if (additional_image_file_not_accessible) { 
    if(!cJSON_IsNumber(additional_image_file_not_accessible))
    {
    goto end; //Numeric
    }
    additional_image_file_not_accessible_local_var = malloc(sizeof(int));
    if(!additional_image_file_not_accessible_local_var)
    {
        goto end;
    }
    *additional_image_file_not_accessible_local_var = additional_image_file_not_accessible->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->additional_image_file_not_found
    cJSON *additional_image_file_not_found = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_FILE_NOT_FOUND");
    if (cJSON_IsNull(additional_image_file_not_found)) {
        additional_image_file_not_found = NULL;
    }
    if (additional_image_file_not_found) { 
    if(!cJSON_IsNumber(additional_image_file_not_found))
    {
    goto end; //Numeric
    }
    additional_image_file_not_found_local_var = malloc(sizeof(int));
    if(!additional_image_file_not_found_local_var)
    {
        goto end;
    }
    *additional_image_file_not_found_local_var = additional_image_file_not_found->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->additional_image_invalid_file
    cJSON *additional_image_invalid_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_INVALID_FILE");
    if (cJSON_IsNull(additional_image_invalid_file)) {
        additional_image_invalid_file = NULL;
    }
    if (additional_image_invalid_file) { 
    if(!cJSON_IsNumber(additional_image_invalid_file))
    {
    goto end; //Numeric
    }
    additional_image_invalid_file_local_var = malloc(sizeof(int));
    if(!additional_image_invalid_file_local_var)
    {
        goto end;
    }
    *additional_image_invalid_file_local_var = additional_image_invalid_file->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->additional_image_level_internal_error
    cJSON *additional_image_level_internal_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR");
    if (cJSON_IsNull(additional_image_level_internal_error)) {
        additional_image_level_internal_error = NULL;
    }
    if (additional_image_level_internal_error) { 
    if(!cJSON_IsNumber(additional_image_level_internal_error))
    {
    goto end; //Numeric
    }
    additional_image_level_internal_error_local_var = malloc(sizeof(int));
    if(!additional_image_level_internal_error_local_var)
    {
        goto end;
    }
    *additional_image_level_internal_error_local_var = additional_image_level_internal_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->additional_image_malformed_url
    cJSON *additional_image_malformed_url = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "ADDITIONAL_IMAGE_MALFORMED_URL");
    if (cJSON_IsNull(additional_image_malformed_url)) {
        additional_image_malformed_url = NULL;
    }
    if (additional_image_malformed_url) { 
    if(!cJSON_IsNumber(additional_image_malformed_url))
    {
    goto end; //Numeric
    }
    additional_image_malformed_url_local_var = malloc(sizeof(int));
    if(!additional_image_malformed_url_local_var)
    {
        goto end;
    }
    *additional_image_malformed_url_local_var = additional_image_malformed_url->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->fetch_google_sheet_public_can_edit
    cJSON *fetch_google_sheet_public_can_edit = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT");
    if (cJSON_IsNull(fetch_google_sheet_public_can_edit)) {
        fetch_google_sheet_public_can_edit = NULL;
    }
    if (fetch_google_sheet_public_can_edit) { 
    if(!cJSON_IsNumber(fetch_google_sheet_public_can_edit))
    {
    goto end; //Numeric
    }
    fetch_google_sheet_public_can_edit_local_var = malloc(sizeof(int));
    if(!fetch_google_sheet_public_can_edit_local_var)
    {
        goto end;
    }
    *fetch_google_sheet_public_can_edit_local_var = fetch_google_sheet_public_can_edit->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->hotel_price_header_is_present
    cJSON *hotel_price_header_is_present = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "HOTEL_PRICE_HEADER_IS_PRESENT");
    if (cJSON_IsNull(hotel_price_header_is_present)) {
        hotel_price_header_is_present = NULL;
    }
    if (hotel_price_header_is_present) { 
    if(!cJSON_IsNumber(hotel_price_header_is_present))
    {
    goto end; //Numeric
    }
    hotel_price_header_is_present_local_var = malloc(sizeof(int));
    if(!hotel_price_header_is_present_local_var)
    {
        goto end;
    }
    *hotel_price_header_is_present_local_var = hotel_price_header_is_present->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->video_download_video_too_short
    cJSON *video_download_video_too_short = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "VIDEO_DOWNLOAD_VIDEO_TOO_SHORT");
    if (cJSON_IsNull(video_download_video_too_short)) {
        video_download_video_too_short = NULL;
    }
    if (video_download_video_too_short) { 
    if(!cJSON_IsNumber(video_download_video_too_short))
    {
    goto end; //Numeric
    }
    video_download_video_too_short_local_var = malloc(sizeof(int));
    if(!video_download_video_too_short_local_var)
    {
        goto end;
    }
    *video_download_video_too_short_local_var = video_download_video_too_short->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->video_file_not_accessible
    cJSON *video_file_not_accessible = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "VIDEO_FILE_NOT_ACCESSIBLE");
    if (cJSON_IsNull(video_file_not_accessible)) {
        video_file_not_accessible = NULL;
    }
    if (video_file_not_accessible) { 
    if(!cJSON_IsNumber(video_file_not_accessible))
    {
    goto end; //Numeric
    }
    video_file_not_accessible_local_var = malloc(sizeof(int));
    if(!video_file_not_accessible_local_var)
    {
        goto end;
    }
    *video_file_not_accessible_local_var = video_file_not_accessible->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->video_file_not_found
    cJSON *video_file_not_found = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "VIDEO_FILE_NOT_FOUND");
    if (cJSON_IsNull(video_file_not_found)) {
        video_file_not_found = NULL;
    }
    if (video_file_not_found) { 
    if(!cJSON_IsNumber(video_file_not_found))
    {
    goto end; //Numeric
    }
    video_file_not_found_local_var = malloc(sizeof(int));
    if(!video_file_not_found_local_var)
    {
        goto end;
    }
    *video_file_not_found_local_var = video_file_not_found->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->video_invalid_file
    cJSON *video_invalid_file = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "VIDEO_INVALID_FILE");
    if (cJSON_IsNull(video_invalid_file)) {
        video_invalid_file = NULL;
    }
    if (video_invalid_file) { 
    if(!cJSON_IsNumber(video_invalid_file))
    {
    goto end; //Numeric
    }
    video_invalid_file_local_var = malloc(sizeof(int));
    if(!video_invalid_file_local_var)
    {
        goto end;
    }
    *video_invalid_file_local_var = video_invalid_file->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->video_level_internal_error
    cJSON *video_level_internal_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "VIDEO_LEVEL_INTERNAL_ERROR");
    if (cJSON_IsNull(video_level_internal_error)) {
        video_level_internal_error = NULL;
    }
    if (video_level_internal_error) { 
    if(!cJSON_IsNumber(video_level_internal_error))
    {
    goto end; //Numeric
    }
    video_level_internal_error_local_var = malloc(sizeof(int));
    if(!video_level_internal_error_local_var)
    {
        goto end;
    }
    *video_level_internal_error_local_var = video_level_internal_error->valuedouble;
    }

    // catalogs_feed_ingestion_warnings->video_malformed_url
    cJSON *video_malformed_url = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_warningsJSON, "VIDEO_MALFORMED_URL");
    if (cJSON_IsNull(video_malformed_url)) {
        video_malformed_url = NULL;
    }
    if (video_malformed_url) { 
    if(!cJSON_IsNumber(video_malformed_url))
    {
    goto end; //Numeric
    }
    video_malformed_url_local_var = malloc(sizeof(int));
    if(!video_malformed_url_local_var)
    {
        goto end;
    }
    *video_malformed_url_local_var = video_malformed_url->valuedouble;
    }



    catalogs_feed_ingestion_warnings_local_var = catalogs_feed_ingestion_warnings_create_internal (
        ad_image_download_content_read_error_local_var,
        ad_image_download_dns_lookup_error_local_var,
        ad_image_download_file_not_accessible_local_var,
        ad_image_download_file_not_found_local_var,
        ad_image_download_http_status_400_local_var,
        ad_image_download_http_status_403_local_var,
        ad_image_download_http_status_404_local_var,
        ad_image_download_http_status_405_local_var,
        ad_image_download_http_status_410_local_var,
        ad_image_download_http_status_429_local_var,
        ad_image_download_http_status_500_local_var,
        ad_image_download_http_status_502_local_var,
        ad_image_download_http_status_503_local_var,
        ad_image_download_http_status_504_local_var,
        ad_image_download_http_status_507_local_var,
        ad_image_download_http_status_508_local_var,
        ad_image_download_http_status_520_local_var,
        ad_image_download_http_status_521_local_var,
        ad_image_download_http_status_522_local_var,
        ad_image_download_http_status_525_local_var,
        ad_image_download_internal_configuration_error_local_var,
        ad_image_download_internal_error_local_var,
        ad_image_download_internal_failed_to_download_local_var,
        ad_image_download_internal_malformed_url_local_var,
        ad_image_download_internal_rate_limited_local_var,
        ad_image_download_internal_request_expired_local_var,
        ad_image_download_invalid_file_local_var,
        ad_image_download_site_error_local_var,
        ad_image_download_site_timeout_local_var,
        ad_image_download_ssl_error_local_var,
        ad_image_download_ssl_handshake_error_local_var,
        ad_image_processing_empty_file_local_var,
        ad_image_processing_height_too_small_local_var,
        ad_image_processing_too_many_pixels_local_var,
        ad_image_processing_type_mismatch_local_var,
        ad_image_processing_width_too_small_local_var,
        ad_video_download_content_read_error_local_var,
        ad_video_download_dns_lookup_error_local_var,
        ad_video_download_file_not_accessible_local_var,
        ad_video_download_file_not_found_local_var,
        ad_video_download_http_status_400_local_var,
        ad_video_download_http_status_403_local_var,
        ad_video_download_http_status_404_local_var,
        ad_video_download_http_status_405_local_var,
        ad_video_download_http_status_410_local_var,
        ad_video_download_http_status_429_local_var,
        ad_video_download_http_status_500_local_var,
        ad_video_download_http_status_502_local_var,
        ad_video_download_http_status_503_local_var,
        ad_video_download_http_status_504_local_var,
        ad_video_download_http_status_507_local_var,
        ad_video_download_http_status_508_local_var,
        ad_video_download_http_status_520_local_var,
        ad_video_download_http_status_521_local_var,
        ad_video_download_http_status_522_local_var,
        ad_video_download_http_status_525_local_var,
        ad_video_download_internal_configuration_error_local_var,
        ad_video_download_internal_error_local_var,
        ad_video_download_internal_failed_to_download_local_var,
        ad_video_download_internal_malformed_url_local_var,
        ad_video_download_internal_rate_limited_local_var,
        ad_video_download_internal_request_expired_local_var,
        ad_video_download_invalid_file_local_var,
        ad_video_download_site_error_local_var,
        ad_video_download_site_timeout_local_var,
        ad_video_download_ssl_error_local_var,
        ad_video_download_ssl_handshake_error_local_var,
        ad_video_length_too_short_local_var,
        ad_video_processing_empty_file_local_var,
        ad_video_processing_height_too_small_local_var,
        ad_video_processing_too_many_pixels_local_var,
        ad_video_processing_type_mismatch_local_var,
        ad_video_processing_width_too_small_local_var,
        additional_image_file_not_accessible_local_var,
        additional_image_file_not_found_local_var,
        additional_image_invalid_file_local_var,
        additional_image_level_internal_error_local_var,
        additional_image_malformed_url_local_var,
        fetch_google_sheet_public_can_edit_local_var,
        hotel_price_header_is_present_local_var,
        video_download_video_too_short_local_var,
        video_file_not_accessible_local_var,
        video_file_not_found_local_var,
        video_invalid_file_local_var,
        video_level_internal_error_local_var,
        video_malformed_url_local_var
        );

    if (!catalogs_feed_ingestion_warnings_local_var) {
        goto end;
    }

    return catalogs_feed_ingestion_warnings_local_var;
end:
    if (ad_image_download_content_read_error_local_var) {
        free(ad_image_download_content_read_error_local_var);
        ad_image_download_content_read_error_local_var = NULL;
    }
    if (ad_image_download_dns_lookup_error_local_var) {
        free(ad_image_download_dns_lookup_error_local_var);
        ad_image_download_dns_lookup_error_local_var = NULL;
    }
    if (ad_image_download_file_not_accessible_local_var) {
        free(ad_image_download_file_not_accessible_local_var);
        ad_image_download_file_not_accessible_local_var = NULL;
    }
    if (ad_image_download_file_not_found_local_var) {
        free(ad_image_download_file_not_found_local_var);
        ad_image_download_file_not_found_local_var = NULL;
    }
    if (ad_image_download_http_status_400_local_var) {
        free(ad_image_download_http_status_400_local_var);
        ad_image_download_http_status_400_local_var = NULL;
    }
    if (ad_image_download_http_status_403_local_var) {
        free(ad_image_download_http_status_403_local_var);
        ad_image_download_http_status_403_local_var = NULL;
    }
    if (ad_image_download_http_status_404_local_var) {
        free(ad_image_download_http_status_404_local_var);
        ad_image_download_http_status_404_local_var = NULL;
    }
    if (ad_image_download_http_status_405_local_var) {
        free(ad_image_download_http_status_405_local_var);
        ad_image_download_http_status_405_local_var = NULL;
    }
    if (ad_image_download_http_status_410_local_var) {
        free(ad_image_download_http_status_410_local_var);
        ad_image_download_http_status_410_local_var = NULL;
    }
    if (ad_image_download_http_status_429_local_var) {
        free(ad_image_download_http_status_429_local_var);
        ad_image_download_http_status_429_local_var = NULL;
    }
    if (ad_image_download_http_status_500_local_var) {
        free(ad_image_download_http_status_500_local_var);
        ad_image_download_http_status_500_local_var = NULL;
    }
    if (ad_image_download_http_status_502_local_var) {
        free(ad_image_download_http_status_502_local_var);
        ad_image_download_http_status_502_local_var = NULL;
    }
    if (ad_image_download_http_status_503_local_var) {
        free(ad_image_download_http_status_503_local_var);
        ad_image_download_http_status_503_local_var = NULL;
    }
    if (ad_image_download_http_status_504_local_var) {
        free(ad_image_download_http_status_504_local_var);
        ad_image_download_http_status_504_local_var = NULL;
    }
    if (ad_image_download_http_status_507_local_var) {
        free(ad_image_download_http_status_507_local_var);
        ad_image_download_http_status_507_local_var = NULL;
    }
    if (ad_image_download_http_status_508_local_var) {
        free(ad_image_download_http_status_508_local_var);
        ad_image_download_http_status_508_local_var = NULL;
    }
    if (ad_image_download_http_status_520_local_var) {
        free(ad_image_download_http_status_520_local_var);
        ad_image_download_http_status_520_local_var = NULL;
    }
    if (ad_image_download_http_status_521_local_var) {
        free(ad_image_download_http_status_521_local_var);
        ad_image_download_http_status_521_local_var = NULL;
    }
    if (ad_image_download_http_status_522_local_var) {
        free(ad_image_download_http_status_522_local_var);
        ad_image_download_http_status_522_local_var = NULL;
    }
    if (ad_image_download_http_status_525_local_var) {
        free(ad_image_download_http_status_525_local_var);
        ad_image_download_http_status_525_local_var = NULL;
    }
    if (ad_image_download_internal_configuration_error_local_var) {
        free(ad_image_download_internal_configuration_error_local_var);
        ad_image_download_internal_configuration_error_local_var = NULL;
    }
    if (ad_image_download_internal_error_local_var) {
        free(ad_image_download_internal_error_local_var);
        ad_image_download_internal_error_local_var = NULL;
    }
    if (ad_image_download_internal_failed_to_download_local_var) {
        free(ad_image_download_internal_failed_to_download_local_var);
        ad_image_download_internal_failed_to_download_local_var = NULL;
    }
    if (ad_image_download_internal_malformed_url_local_var) {
        free(ad_image_download_internal_malformed_url_local_var);
        ad_image_download_internal_malformed_url_local_var = NULL;
    }
    if (ad_image_download_internal_rate_limited_local_var) {
        free(ad_image_download_internal_rate_limited_local_var);
        ad_image_download_internal_rate_limited_local_var = NULL;
    }
    if (ad_image_download_internal_request_expired_local_var) {
        free(ad_image_download_internal_request_expired_local_var);
        ad_image_download_internal_request_expired_local_var = NULL;
    }
    if (ad_image_download_invalid_file_local_var) {
        free(ad_image_download_invalid_file_local_var);
        ad_image_download_invalid_file_local_var = NULL;
    }
    if (ad_image_download_site_error_local_var) {
        free(ad_image_download_site_error_local_var);
        ad_image_download_site_error_local_var = NULL;
    }
    if (ad_image_download_site_timeout_local_var) {
        free(ad_image_download_site_timeout_local_var);
        ad_image_download_site_timeout_local_var = NULL;
    }
    if (ad_image_download_ssl_error_local_var) {
        free(ad_image_download_ssl_error_local_var);
        ad_image_download_ssl_error_local_var = NULL;
    }
    if (ad_image_download_ssl_handshake_error_local_var) {
        free(ad_image_download_ssl_handshake_error_local_var);
        ad_image_download_ssl_handshake_error_local_var = NULL;
    }
    if (ad_image_processing_empty_file_local_var) {
        free(ad_image_processing_empty_file_local_var);
        ad_image_processing_empty_file_local_var = NULL;
    }
    if (ad_image_processing_height_too_small_local_var) {
        free(ad_image_processing_height_too_small_local_var);
        ad_image_processing_height_too_small_local_var = NULL;
    }
    if (ad_image_processing_too_many_pixels_local_var) {
        free(ad_image_processing_too_many_pixels_local_var);
        ad_image_processing_too_many_pixels_local_var = NULL;
    }
    if (ad_image_processing_type_mismatch_local_var) {
        free(ad_image_processing_type_mismatch_local_var);
        ad_image_processing_type_mismatch_local_var = NULL;
    }
    if (ad_image_processing_width_too_small_local_var) {
        free(ad_image_processing_width_too_small_local_var);
        ad_image_processing_width_too_small_local_var = NULL;
    }
    if (ad_video_download_content_read_error_local_var) {
        free(ad_video_download_content_read_error_local_var);
        ad_video_download_content_read_error_local_var = NULL;
    }
    if (ad_video_download_dns_lookup_error_local_var) {
        free(ad_video_download_dns_lookup_error_local_var);
        ad_video_download_dns_lookup_error_local_var = NULL;
    }
    if (ad_video_download_file_not_accessible_local_var) {
        free(ad_video_download_file_not_accessible_local_var);
        ad_video_download_file_not_accessible_local_var = NULL;
    }
    if (ad_video_download_file_not_found_local_var) {
        free(ad_video_download_file_not_found_local_var);
        ad_video_download_file_not_found_local_var = NULL;
    }
    if (ad_video_download_http_status_400_local_var) {
        free(ad_video_download_http_status_400_local_var);
        ad_video_download_http_status_400_local_var = NULL;
    }
    if (ad_video_download_http_status_403_local_var) {
        free(ad_video_download_http_status_403_local_var);
        ad_video_download_http_status_403_local_var = NULL;
    }
    if (ad_video_download_http_status_404_local_var) {
        free(ad_video_download_http_status_404_local_var);
        ad_video_download_http_status_404_local_var = NULL;
    }
    if (ad_video_download_http_status_405_local_var) {
        free(ad_video_download_http_status_405_local_var);
        ad_video_download_http_status_405_local_var = NULL;
    }
    if (ad_video_download_http_status_410_local_var) {
        free(ad_video_download_http_status_410_local_var);
        ad_video_download_http_status_410_local_var = NULL;
    }
    if (ad_video_download_http_status_429_local_var) {
        free(ad_video_download_http_status_429_local_var);
        ad_video_download_http_status_429_local_var = NULL;
    }
    if (ad_video_download_http_status_500_local_var) {
        free(ad_video_download_http_status_500_local_var);
        ad_video_download_http_status_500_local_var = NULL;
    }
    if (ad_video_download_http_status_502_local_var) {
        free(ad_video_download_http_status_502_local_var);
        ad_video_download_http_status_502_local_var = NULL;
    }
    if (ad_video_download_http_status_503_local_var) {
        free(ad_video_download_http_status_503_local_var);
        ad_video_download_http_status_503_local_var = NULL;
    }
    if (ad_video_download_http_status_504_local_var) {
        free(ad_video_download_http_status_504_local_var);
        ad_video_download_http_status_504_local_var = NULL;
    }
    if (ad_video_download_http_status_507_local_var) {
        free(ad_video_download_http_status_507_local_var);
        ad_video_download_http_status_507_local_var = NULL;
    }
    if (ad_video_download_http_status_508_local_var) {
        free(ad_video_download_http_status_508_local_var);
        ad_video_download_http_status_508_local_var = NULL;
    }
    if (ad_video_download_http_status_520_local_var) {
        free(ad_video_download_http_status_520_local_var);
        ad_video_download_http_status_520_local_var = NULL;
    }
    if (ad_video_download_http_status_521_local_var) {
        free(ad_video_download_http_status_521_local_var);
        ad_video_download_http_status_521_local_var = NULL;
    }
    if (ad_video_download_http_status_522_local_var) {
        free(ad_video_download_http_status_522_local_var);
        ad_video_download_http_status_522_local_var = NULL;
    }
    if (ad_video_download_http_status_525_local_var) {
        free(ad_video_download_http_status_525_local_var);
        ad_video_download_http_status_525_local_var = NULL;
    }
    if (ad_video_download_internal_configuration_error_local_var) {
        free(ad_video_download_internal_configuration_error_local_var);
        ad_video_download_internal_configuration_error_local_var = NULL;
    }
    if (ad_video_download_internal_error_local_var) {
        free(ad_video_download_internal_error_local_var);
        ad_video_download_internal_error_local_var = NULL;
    }
    if (ad_video_download_internal_failed_to_download_local_var) {
        free(ad_video_download_internal_failed_to_download_local_var);
        ad_video_download_internal_failed_to_download_local_var = NULL;
    }
    if (ad_video_download_internal_malformed_url_local_var) {
        free(ad_video_download_internal_malformed_url_local_var);
        ad_video_download_internal_malformed_url_local_var = NULL;
    }
    if (ad_video_download_internal_rate_limited_local_var) {
        free(ad_video_download_internal_rate_limited_local_var);
        ad_video_download_internal_rate_limited_local_var = NULL;
    }
    if (ad_video_download_internal_request_expired_local_var) {
        free(ad_video_download_internal_request_expired_local_var);
        ad_video_download_internal_request_expired_local_var = NULL;
    }
    if (ad_video_download_invalid_file_local_var) {
        free(ad_video_download_invalid_file_local_var);
        ad_video_download_invalid_file_local_var = NULL;
    }
    if (ad_video_download_site_error_local_var) {
        free(ad_video_download_site_error_local_var);
        ad_video_download_site_error_local_var = NULL;
    }
    if (ad_video_download_site_timeout_local_var) {
        free(ad_video_download_site_timeout_local_var);
        ad_video_download_site_timeout_local_var = NULL;
    }
    if (ad_video_download_ssl_error_local_var) {
        free(ad_video_download_ssl_error_local_var);
        ad_video_download_ssl_error_local_var = NULL;
    }
    if (ad_video_download_ssl_handshake_error_local_var) {
        free(ad_video_download_ssl_handshake_error_local_var);
        ad_video_download_ssl_handshake_error_local_var = NULL;
    }
    if (ad_video_length_too_short_local_var) {
        free(ad_video_length_too_short_local_var);
        ad_video_length_too_short_local_var = NULL;
    }
    if (ad_video_processing_empty_file_local_var) {
        free(ad_video_processing_empty_file_local_var);
        ad_video_processing_empty_file_local_var = NULL;
    }
    if (ad_video_processing_height_too_small_local_var) {
        free(ad_video_processing_height_too_small_local_var);
        ad_video_processing_height_too_small_local_var = NULL;
    }
    if (ad_video_processing_too_many_pixels_local_var) {
        free(ad_video_processing_too_many_pixels_local_var);
        ad_video_processing_too_many_pixels_local_var = NULL;
    }
    if (ad_video_processing_type_mismatch_local_var) {
        free(ad_video_processing_type_mismatch_local_var);
        ad_video_processing_type_mismatch_local_var = NULL;
    }
    if (ad_video_processing_width_too_small_local_var) {
        free(ad_video_processing_width_too_small_local_var);
        ad_video_processing_width_too_small_local_var = NULL;
    }
    if (additional_image_file_not_accessible_local_var) {
        free(additional_image_file_not_accessible_local_var);
        additional_image_file_not_accessible_local_var = NULL;
    }
    if (additional_image_file_not_found_local_var) {
        free(additional_image_file_not_found_local_var);
        additional_image_file_not_found_local_var = NULL;
    }
    if (additional_image_invalid_file_local_var) {
        free(additional_image_invalid_file_local_var);
        additional_image_invalid_file_local_var = NULL;
    }
    if (additional_image_level_internal_error_local_var) {
        free(additional_image_level_internal_error_local_var);
        additional_image_level_internal_error_local_var = NULL;
    }
    if (additional_image_malformed_url_local_var) {
        free(additional_image_malformed_url_local_var);
        additional_image_malformed_url_local_var = NULL;
    }
    if (fetch_google_sheet_public_can_edit_local_var) {
        free(fetch_google_sheet_public_can_edit_local_var);
        fetch_google_sheet_public_can_edit_local_var = NULL;
    }
    if (hotel_price_header_is_present_local_var) {
        free(hotel_price_header_is_present_local_var);
        hotel_price_header_is_present_local_var = NULL;
    }
    if (video_download_video_too_short_local_var) {
        free(video_download_video_too_short_local_var);
        video_download_video_too_short_local_var = NULL;
    }
    if (video_file_not_accessible_local_var) {
        free(video_file_not_accessible_local_var);
        video_file_not_accessible_local_var = NULL;
    }
    if (video_file_not_found_local_var) {
        free(video_file_not_found_local_var);
        video_file_not_found_local_var = NULL;
    }
    if (video_invalid_file_local_var) {
        free(video_invalid_file_local_var);
        video_invalid_file_local_var = NULL;
    }
    if (video_level_internal_error_local_var) {
        free(video_level_internal_error_local_var);
        video_level_internal_error_local_var = NULL;
    }
    if (video_malformed_url_local_var) {
        free(video_malformed_url_local_var);
        video_malformed_url_local_var = NULL;
    }
    return NULL;

}
