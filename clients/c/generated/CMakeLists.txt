cmake_minimum_required (VERSION 2.6...3.10.2)
project (CGenerator)

cmake_policy(SET CMP0063 NEW)

set(CMAKE_C_VISIBILITY_PRESET default)
set(CMAKE_CXX_VISIBILITY_PRESET default)
set(CMAKE_VISIBILITY_INLINES_HIDDEN OFF)
set(CMAKE_WINDOWS_EXPORT_ALL_SYMBOLS ON)

option(BUILD_SHARED_LIBS "Build using shared libraries" ON)

find_package(OpenSSL)

if (OPENSSL_FOUND)
    message (STATUS "OPENSSL found")

    set(CMAKE_C_FLAGS "-DOPENSSL")
    if(CMAKE_VERSION VERSION_LESS 3.4)
        include_directories(${OPENSSL_INCLUDE_DIR})
        include_directories(${OPENSSL_INCLUDE_DIRS})
        link_directories(${OPENSSL_LIBRARIES})
    endif()

    message(STATUS "Using OpenSSL ${OPENSSL_VERSION}")
else()
    message (STATUS "OpenSSL Not found.")
endif()

set(pkgName "pinterest_rest_api")

# this default version can be overridden in PreTarget.cmake
set(PROJECT_VERSION_MAJOR 0)
set(PROJECT_VERSION_MINOR 0)
set(PROJECT_VERSION_PATCH 1)

if( (DEFINED CURL_INCLUDE_DIR) AND (DEFINED CURL_LIBRARIES))
    include_directories(${CURL_INCLUDE_DIR})
    set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
else()
    find_package(CURL 7.58.0 REQUIRED)
    if(CURL_FOUND)
        include_directories(${CURL_INCLUDE_DIR})
        set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
    else(CURL_FOUND)
        message(FATAL_ERROR "Could not find the CURL library and development files.")
    endif()
endif()

set(SRCS
    src/list.c
    src/apiKey.c
    src/apiClient.c
    src/binary.c
    external/cJSON.c
    model/object.c
    model/account.c
    model/action_type.c
    model/ad_account.c
    model/ad_account_analytics_response_inner.c
    model/ad_account_create_request.c
    model/ad_account_create_subscription_request.c
    model/ad_account_create_subscription_response.c
    model/ad_account_get_subscription_response.c
    model/ad_account_owner.c
    model/ad_accounts_catalogs_product_groups_list_200_response.c
    model/ad_accounts_country_response.c
    model/ad_accounts_country_response_data.c
    model/ad_accounts_list_200_response.c
    model/ad_accounts_subscriptions_get_list_200_response.c
    model/ad_array_response.c
    model/ad_array_response_element.c
    model/ad_common.c
    model/ad_common_quiz_pin_data.c
    model/ad_common_tracking_urls.c
    model/ad_country.c
    model/ad_create_request.c
    model/ad_group_array_response.c
    model/ad_group_array_response_element.c
    model/ad_group_audience_sizing_request.c
    model/ad_group_audience_sizing_request_keywords_inner.c
    model/ad_group_audience_sizing_response.c
    model/ad_group_common.c
    model/ad_group_common_optimization_goal_metadata.c
    model/ad_group_common_tracking_urls.c
    model/ad_group_create_request.c
    model/ad_group_response.c
    model/ad_group_summary_status.c
    model/ad_group_update_request.c
    model/ad_groups_analytics_response_inner.c
    model/ad_groups_list_200_response.c
    model/ad_pin_id.c
    model/ad_preview_create_from_image.c
    model/ad_preview_create_from_pin.c
    model/ad_preview_request.c
    model/ad_preview_url_response.c
    model/ad_response.c
    model/ad_update_request.c
    model/ads_analytics_create_async_request.c
    model/ads_analytics_create_async_response.c
    model/ads_analytics_filter_column.c
    model/ads_analytics_filter_operator.c
    model/ads_analytics_get_async_response.c
    model/ads_analytics_metrics_filter.c
    model/ads_analytics_response_inner.c
    model/ads_analytics_targeting_type.c
    model/ads_credit_discounts_response.c
    model/ads_credit_redeem_request.c
    model/ads_credit_redeem_response.c
    model/ads_credits_discounts_get_200_response.c
    model/ads_list_200_response.c
    model/analytics_daily_metrics.c
    model/analytics_metrics_response.c
    model/audience.c
    model/audience_category.c
    model/audience_common.c
    model/audience_create_custom_request.c
    model/audience_create_request.c
    model/audience_create_request_1_audience_type.c
    model/audience_data_party.c
    model/audience_definition.c
    model/audience_definition_response.c
    model/audience_demographic_value.c
    model/audience_demographics.c
    model/audience_insight_category_array_response.c
    model/audience_insight_category_common.c
    model/audience_insight_type.c
    model/audience_insights_response.c
    model/audience_rule.c
    model/audience_sharing_type.c
    model/audience_subcategory.c
    model/audience_type.c
    model/audience_update_operation_type.c
    model/audience_update_request.c
    model/audiences_list_200_response.c
    model/availability_filter.c
    model/batch_operation.c
    model/batch_operation_status.c
    model/bid_floor.c
    model/bid_floor_request.c
    model/bid_floor_spec.c
    model/billing_profiles_get_200_response.c
    model/billing_profiles_response.c
    model/board.c
    model/board_media.c
    model/board_owner.c
    model/board_section.c
    model/board_sections_list_200_response.c
    model/board_update.c
    model/boards_list_200_response.c
    model/boards_list_pins_200_response.c
    model/boards_user_follows_list_200_response.c
    model/book_closed_response.c
    model/brand_filter.c
    model/budget_type.c
    model/bulk_download_request.c
    model/bulk_download_request_campaign_filter.c
    model/bulk_download_response.c
    model/bulk_entity_type.c
    model/bulk_output_format.c
    model/bulk_reporting_job_status.c
    model/bulk_upsert_request.c
    model/bulk_upsert_request_create.c
    model/bulk_upsert_request_update.c
    model/bulk_upsert_response.c
    model/bulk_upsert_status.c
    model/bulk_upsert_status_response.c
    model/business_access_role.c
    model/campaign_common.c
    model/campaign_create_common.c
    model/campaign_create_request.c
    model/campaign_create_response.c
    model/campaign_create_response_data.c
    model/campaign_create_response_item.c
    model/campaign_id.c
    model/campaign_response.c
    model/campaign_summary_status.c
    model/campaign_update_request.c
    model/campaign_update_response.c
    model/campaigns_analytics_response_inner.c
    model/campaigns_list_200_response.c
    model/catalog.c
    model/catalog_product_group.c
    model/catalogs_create_hotel_item.c
    model/catalogs_create_retail_item.c
    model/catalogs_db_item.c
    model/catalogs_delete_hotel_item.c
    model/catalogs_delete_retail_item.c
    model/catalogs_feed.c
    model/catalogs_feed_credentials.c
    model/catalogs_feed_ingestion_details.c
    model/catalogs_feed_ingestion_errors.c
    model/catalogs_feed_ingestion_info.c
    model/catalogs_feed_ingestion_warnings.c
    model/catalogs_feed_processing_result.c
    model/catalogs_feed_processing_schedule.c
    model/catalogs_feed_processing_status.c
    model/catalogs_feed_product_counts.c
    model/catalogs_feed_validation_details.c
    model/catalogs_feed_validation_errors.c
    model/catalogs_feed_validation_warnings.c
    model/catalogs_feeds_create_request.c
    model/catalogs_feeds_create_request_default_locale.c
    model/catalogs_feeds_update_request.c
    model/catalogs_format.c
    model/catalogs_hotel_address.c
    model/catalogs_hotel_attributes.c
    model/catalogs_hotel_attributes_all_of_main_image.c
    model/catalogs_hotel_batch_item.c
    model/catalogs_hotel_batch_request.c
    model/catalogs_hotel_feed.c
    model/catalogs_hotel_feeds_create_request.c
    model/catalogs_hotel_feeds_update_request.c
    model/catalogs_hotel_guest_ratings.c
    model/catalogs_hotel_item_error_response.c
    model/catalogs_hotel_item_response.c
    model/catalogs_hotel_items_batch.c
    model/catalogs_hotel_items_filter.c
    model/catalogs_hotel_product_group.c
    model/catalogs_hotel_product_group_create_request.c
    model/catalogs_hotel_product_group_filter_keys.c
    model/catalogs_hotel_product_group_filters.c
    model/catalogs_hotel_product_group_filters_all_of.c
    model/catalogs_hotel_product_group_filters_any_of.c
    model/catalogs_hotel_product_group_update_request.c
    model/catalogs_item_validation_details.c
    model/catalogs_item_validation_errors.c
    model/catalogs_item_validation_issue.c
    model/catalogs_item_validation_issues.c
    model/catalogs_item_validation_warnings.c
    model/catalogs_items.c
    model/catalogs_items_batch.c
    model/catalogs_items_batch_request.c
    model/catalogs_items_create_batch_request.c
    model/catalogs_items_delete_batch_request.c
    model/catalogs_items_delete_discontinued_batch_request.c
    model/catalogs_items_filters.c
    model/catalogs_items_update_batch_request.c
    model/catalogs_items_upsert_batch_request.c
    model/catalogs_list_200_response.c
    model/catalogs_list_products_by_filter_request.c
    model/catalogs_list_products_by_filter_request_one_of.c
    model/catalogs_locale.c
    model/catalogs_product.c
    model/catalogs_product_group.c
    model/catalogs_product_group_create_request.c
    model/catalogs_product_group_currency_criteria.c
    model/catalogs_product_group_filter_keys.c
    model/catalogs_product_group_filters.c
    model/catalogs_product_group_filters_all_of.c
    model/catalogs_product_group_filters_any_of.c
    model/catalogs_product_group_filters_request.c
    model/catalogs_product_group_filters_request_any_of.c
    model/catalogs_product_group_filters_request_any_of_1.c
    model/catalogs_product_group_multiple_countries_criteria.c
    model/catalogs_product_group_multiple_gender_criteria.c
    model/catalogs_product_group_multiple_string_criteria.c
    model/catalogs_product_group_multiple_string_list_criteria.c
    model/catalogs_product_group_pins_list_200_response.c
    model/catalogs_product_group_pricing_criteria.c
    model/catalogs_product_group_pricing_currency_criteria.c
    model/catalogs_product_group_product_counts.c
    model/catalogs_product_group_status.c
    model/catalogs_product_group_type.c
    model/catalogs_product_group_update_request.c
    model/catalogs_product_groups_create_201_response.c
    model/catalogs_product_groups_create_request.c
    model/catalogs_product_groups_list_200_response.c
    model/catalogs_product_groups_list_200_response_all_of_items_inner.c
    model/catalogs_product_groups_update_request.c
    model/catalogs_product_metadata.c
    model/catalogs_retail_batch_request.c
    model/catalogs_retail_batch_request_items_inner.c
    model/catalogs_retail_feed.c
    model/catalogs_retail_feeds_create_request.c
    model/catalogs_retail_feeds_update_request.c
    model/catalogs_retail_item_error_response.c
    model/catalogs_retail_item_response.c
    model/catalogs_retail_items_batch.c
    model/catalogs_retail_items_filter.c
    model/catalogs_retail_product_group.c
    model/catalogs_status.c
    model/catalogs_type.c
    model/catalogs_updatable_hotel_attributes.c
    model/catalogs_update_hotel_item.c
    model/catalogs_update_retail_item.c
    model/catalogs_upsert_hotel_item.c
    model/catalogs_upsert_retail_item.c
    model/catalogs_vertical_batch_request.c
    model/catalogs_vertical_feeds_create_request.c
    model/catalogs_vertical_feeds_update_request.c
    model/catalogs_vertical_product_group.c
    model/catalogs_vertical_product_group_create_request.c
    model/catalogs_vertical_product_group_update_request.c
    model/condition_filter.c
    model/conversion_api_response.c
    model/conversion_api_response_events_inner.c
    model/conversion_attribution_window_days.c
    model/conversion_event_response.c
    model/conversion_events.c
    model/conversion_events_data_inner.c
    model/conversion_events_data_inner_custom_data.c
    model/conversion_events_data_inner_custom_data_contents_inner.c
    model/conversion_events_user_data.c
    model/conversion_report_attribution_type.c
    model/conversion_report_time_type.c
    model/conversion_tag_common.c
    model/conversion_tag_configs.c
    model/conversion_tag_create.c
    model/conversion_tag_list_response.c
    model/conversion_tag_response.c
    model/conversion_tag_type.c
    model/country.c
    model/country_filter.c
    model/create_mmm_report_request.c
    model/create_mmm_report_response.c
    model/create_mmm_report_response_data.c
    model/creative_type.c
    model/currency.c
    model/currency_filter.c
    model/custom_label0_filter.c
    model/custom_label1_filter.c
    model/custom_label2_filter.c
    model/custom_label3_filter.c
    model/custom_label4_filter.c
    model/customer_list.c
    model/customer_list_request.c
    model/customer_list_update_request.c
    model/customer_lists_list_200_response.c
    model/data_output_format.c
    model/data_status.c
    model/delivery_metrics_response.c
    model/delivery_metrics_response_items_inner.c
    model/detailed_error.c
    model/enhanced_match_status_type.c
    model/entity_status.c
    model/error.c
    model/exception.c
    model/feed_processing_results_list_200_response.c
    model/feeds_create_request.c
    model/feeds_list_200_response.c
    model/feeds_update_request.c
    model/follow_user_request.c
    model/followers_list_200_response.c
    model/gender.c
    model/gender_filter.c
    model/get_audiences_order_by.c
    model/get_mmm_report_response.c
    model/get_mmm_report_response_data.c
    model/google_product_category0_filter.c
    model/google_product_category1_filter.c
    model/google_product_category2_filter.c
    model/google_product_category3_filter.c
    model/google_product_category4_filter.c
    model/google_product_category5_filter.c
    model/google_product_category6_filter.c
    model/granularity.c
    model/grid_click_type.c
    model/hotel_id_filter.c
    model/hotel_processing_record.c
    model/image_details.c
    model/image_metadata.c
    model/image_metadata_images.c
    model/integration_log.c
    model/integration_log_client_error.c
    model/integration_log_client_request.c
    model/integration_logs_invalid_log_response.c
    model/integration_logs_invalid_log_response_rejected_logs_inner.c
    model/integration_logs_request.c
    model/integration_logs_success_response.c
    model/integration_metadata.c
    model/integration_record.c
    model/integration_request.c
    model/integration_request_patch.c
    model/integrations_get_list_200_response.c
    model/interest.c
    model/item_attributes.c
    model/item_batch_record.c
    model/item_create_batch_record.c
    model/item_delete_batch_record.c
    model/item_delete_discontinued_batch_record.c
    model/item_group_id_filter.c
    model/item_id_filter.c
    model/item_processing_record.c
    model/item_processing_status.c
    model/item_response.c
    model/item_response_any_of.c
    model/item_response_any_of_1.c
    model/item_update_batch_record.c
    model/item_upsert_batch_record.c
    model/item_validation_event.c
    model/items_batch_post_request.c
    model/items_issues_list_200_response.c
    model/keyword.c
    model/keyword_error.c
    model/keyword_metrics.c
    model/keyword_metrics_response.c
    model/keyword_update.c
    model/keyword_update_body.c
    model/keywords_common.c
    model/keywords_get_200_response.c
    model/keywords_metrics_array_response.c
    model/keywords_request.c
    model/keywords_response.c
    model/language.c
    model/lead_form_common.c
    model/lead_form_question.c
    model/lead_form_question_field_type.c
    model/lead_form_question_type.c
    model/lead_form_response.c
    model/lead_form_status.c
    model/lead_form_test_request.c
    model/lead_form_test_response.c
    model/lead_forms_list_200_response.c
    model/line_item.c
    model/linked_business.c
    model/match_type.c
    model/match_type_response.c
    model/max_price_filter.c
    model/media_list_200_response.c
    model/media_upload.c
    model/media_upload_all_of_upload_parameters.c
    model/media_upload_details.c
    model/media_upload_request.c
    model/media_upload_status.c
    model/media_upload_type.c
    model/metrics_reporting_level.c
    model/metrics_response.c
    model/min_price_filter.c
    model/mmm_reporting_column.c
    model/mmm_reporting_targeting_type.c
    model/non_nullable_catalogs_currency.c
    model/non_nullable_product_availability_type.c
    model/nullable_catalogs_item_field_type.c
    model/nullable_currency.c
    model/oauth_access_token_request_code.c
    model/oauth_access_token_request_refresh.c
    model/oauth_access_token_response.c
    model/oauth_access_token_response_code.c
    model/oauth_access_token_response_everlasting_refresh.c
    model/oauth_access_token_response_integration_refresh.c
    model/oauth_access_token_response_refresh.c
    model/objective_type.c
    model/optimization_goal_metadata.c
    model/optimization_goal_metadata_conversion_tag_v3_goal_metadata.c
    model/optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows.c
    model/optimization_goal_metadata_frequency_goal_metadata.c
    model/optimization_goal_metadata_scrollup_goal_metadata.c
    model/order_line.c
    model/order_line_error.c
    model/order_line_paid_type.c
    model/order_line_response.c
    model/order_line_single_response.c
    model/order_line_status.c
    model/order_lines.c
    model/order_lines_array_response.c
    model/order_lines_list_200_response.c
    model/pacing_delivery_type.c
    model/page_visit_conversion_tags_get_200_response.c
    model/paginated.c
    model/partner_type.c
    model/pin.c
    model/pin_analytics_metrics_response.c
    model/pin_analytics_metrics_response_daily_metrics_inner.c
    model/pin_create.c
    model/pin_media.c
    model/pin_media_metadata.c
    model/pin_media_source.c
    model/pin_media_source_image_base64.c
    model/pin_media_source_image_url.c
    model/pin_media_source_images_base64.c
    model/pin_media_source_images_base64_items_inner.c
    model/pin_media_source_images_url.c
    model/pin_media_source_images_url_items_inner.c
    model/pin_media_source_pin_url.c
    model/pin_media_source_video_id.c
    model/pin_media_with_image.c
    model/pin_media_with_image_and_video.c
    model/pin_media_with_images.c
    model/pin_media_with_video.c
    model/pin_media_with_videos.c
    model/pin_promotion_summary_status.c
    model/pin_update.c
    model/pin_update_carousel_slots_inner.c
    model/pins_analytics_metric_types_parameter_inner.c
    model/pins_list_200_response.c
    model/pins_save_request.c
    model/pinterest_tag_event_data.c
    model/placement_group_type.c
    model/price_filter.c
    model/product_availability_type.c
    model/product_group_analytics_response_inner.c
    model/product_group_promotion.c
    model/product_group_promotion_create_request.c
    model/product_group_promotion_response.c
    model/product_group_promotion_response_item.c
    model/product_group_promotion_update_request.c
    model/product_group_promotions_list_200_response.c
    model/product_group_summary_status.c
    model/product_type0_filter.c
    model/product_type1_filter.c
    model/product_type2_filter.c
    model/product_type3_filter.c
    model/product_type4_filter.c
    model/quiz_pin_data.c
    model/quiz_pin_option.c
    model/quiz_pin_question.c
    model/quiz_pin_result.c
    model/related_terms.c
    model/related_terms_related_terms_list_inner.c
    model/reporting_column_async.c
    model/role.c
    model/search_partner_pins_200_response.c
    model/search_user_boards_get_200_response.c
    model/single_interest_targeting_option_response.c
    model/ssio_account_address.c
    model/ssio_account_item.c
    model/ssio_account_pmp_name.c
    model/ssio_account_response.c
    model/ssio_create_insertion_order_request.c
    model/ssio_create_insertion_order_response.c
    model/ssio_edit_insertion_order_request.c
    model/ssio_edit_insertion_order_response.c
    model/ssio_insertion_order_common.c
    model/ssio_insertion_order_status.c
    model/ssio_insertion_order_status_response.c
    model/ssio_insertion_orders_status_get_by_ad_account_200_response.c
    model/ssio_order_line.c
    model/ssio_order_lines_get_by_ad_account_200_response.c
    model/summary_pin.c
    model/summary_pin_media.c
    model/targeting_advertiser_country.c
    model/targeting_spec.c
    model/targeting_spec_shopping_retargeting.c
    model/targeting_type_filter.c
    model/template_response.c
    model/template_response_date_range.c
    model/template_response_date_range_absolute_date_range.c
    model/template_response_date_range_dynamic_date_range.c
    model/template_response_date_range_relative_date_range.c
    model/templates_list_200_response.c
    model/terms_of_service.c
    model/top_pins_analytics_response.c
    model/top_pins_analytics_response_date_availability.c
    model/top_pins_analytics_response_pins_inner.c
    model/top_video_pins_analytics_response.c
    model/top_video_pins_analytics_response_pins_inner.c
    model/tracking_urls.c
    model/trend_type.c
    model/trending_keywords_response.c
    model/trending_keywords_response_trends_inner.c
    model/trending_keywords_response_trends_inner_time_series.c
    model/trends_supported_region.c
    model/updatable_item_attributes.c
    model/update_mask_field_type.c
    model/user_account_followed_interests_200_response.c
    model/user_following_feed_type.c
    model/user_following_get_200_response.c
    model/user_list_operation_type.c
    model/user_list_type.c
    model/user_summary.c
    model/user_website_summary.c
    model/user_website_verification_code.c
    model/user_website_verify_request.c
    model/user_websites_get_200_response.c
    model/video_metadata.c
    api/AdAccountsAPI.c
    api/AdGroupsAPI.c
    api/AdsAPI.c
    api/AudienceInsightsAPI.c
    api/AudiencesAPI.c
    api/BillingAPI.c
    api/BoardsAPI.c
    api/BulkAPI.c
    api/CampaignsAPI.c
    api/CatalogsAPI.c
    api/ConversionEventsAPI.c
    api/ConversionTagsAPI.c
    api/CustomerListsAPI.c
    api/IntegrationsAPI.c
    api/KeywordsAPI.c
    api/LeadAdsAPI.c
    api/LeadFormsAPI.c
    api/MediaAPI.c
    api/OauthAPI.c
    api/OrderLinesAPI.c
    api/PinsAPI.c
    api/ProductGroupPromotionsAPI.c
    api/ProductGroupsAPI.c
    api/ResourcesAPI.c
    api/SearchAPI.c
    api/TermsAPI.c
    api/TermsOfServiceAPI.c
    api/UserAccountAPI.c

)

set(HDRS
    include/apiClient.h
    include/list.h
    include/binary.h
    include/keyValuePair.h
    external/cJSON.h
    model/object.h
    model/account.h
    model/action_type.h
    model/ad_account.h
    model/ad_account_analytics_response_inner.h
    model/ad_account_create_request.h
    model/ad_account_create_subscription_request.h
    model/ad_account_create_subscription_response.h
    model/ad_account_get_subscription_response.h
    model/ad_account_owner.h
    model/ad_accounts_catalogs_product_groups_list_200_response.h
    model/ad_accounts_country_response.h
    model/ad_accounts_country_response_data.h
    model/ad_accounts_list_200_response.h
    model/ad_accounts_subscriptions_get_list_200_response.h
    model/ad_array_response.h
    model/ad_array_response_element.h
    model/ad_common.h
    model/ad_common_quiz_pin_data.h
    model/ad_common_tracking_urls.h
    model/ad_country.h
    model/ad_create_request.h
    model/ad_group_array_response.h
    model/ad_group_array_response_element.h
    model/ad_group_audience_sizing_request.h
    model/ad_group_audience_sizing_request_keywords_inner.h
    model/ad_group_audience_sizing_response.h
    model/ad_group_common.h
    model/ad_group_common_optimization_goal_metadata.h
    model/ad_group_common_tracking_urls.h
    model/ad_group_create_request.h
    model/ad_group_response.h
    model/ad_group_summary_status.h
    model/ad_group_update_request.h
    model/ad_groups_analytics_response_inner.h
    model/ad_groups_list_200_response.h
    model/ad_pin_id.h
    model/ad_preview_create_from_image.h
    model/ad_preview_create_from_pin.h
    model/ad_preview_request.h
    model/ad_preview_url_response.h
    model/ad_response.h
    model/ad_update_request.h
    model/ads_analytics_create_async_request.h
    model/ads_analytics_create_async_response.h
    model/ads_analytics_filter_column.h
    model/ads_analytics_filter_operator.h
    model/ads_analytics_get_async_response.h
    model/ads_analytics_metrics_filter.h
    model/ads_analytics_response_inner.h
    model/ads_analytics_targeting_type.h
    model/ads_credit_discounts_response.h
    model/ads_credit_redeem_request.h
    model/ads_credit_redeem_response.h
    model/ads_credits_discounts_get_200_response.h
    model/ads_list_200_response.h
    model/analytics_daily_metrics.h
    model/analytics_metrics_response.h
    model/audience.h
    model/audience_category.h
    model/audience_common.h
    model/audience_create_custom_request.h
    model/audience_create_request.h
    model/audience_create_request_1_audience_type.h
    model/audience_data_party.h
    model/audience_definition.h
    model/audience_definition_response.h
    model/audience_demographic_value.h
    model/audience_demographics.h
    model/audience_insight_category_array_response.h
    model/audience_insight_category_common.h
    model/audience_insight_type.h
    model/audience_insights_response.h
    model/audience_rule.h
    model/audience_sharing_type.h
    model/audience_subcategory.h
    model/audience_type.h
    model/audience_update_operation_type.h
    model/audience_update_request.h
    model/audiences_list_200_response.h
    model/availability_filter.h
    model/batch_operation.h
    model/batch_operation_status.h
    model/bid_floor.h
    model/bid_floor_request.h
    model/bid_floor_spec.h
    model/billing_profiles_get_200_response.h
    model/billing_profiles_response.h
    model/board.h
    model/board_media.h
    model/board_owner.h
    model/board_section.h
    model/board_sections_list_200_response.h
    model/board_update.h
    model/boards_list_200_response.h
    model/boards_list_pins_200_response.h
    model/boards_user_follows_list_200_response.h
    model/book_closed_response.h
    model/brand_filter.h
    model/budget_type.h
    model/bulk_download_request.h
    model/bulk_download_request_campaign_filter.h
    model/bulk_download_response.h
    model/bulk_entity_type.h
    model/bulk_output_format.h
    model/bulk_reporting_job_status.h
    model/bulk_upsert_request.h
    model/bulk_upsert_request_create.h
    model/bulk_upsert_request_update.h
    model/bulk_upsert_response.h
    model/bulk_upsert_status.h
    model/bulk_upsert_status_response.h
    model/business_access_role.h
    model/campaign_common.h
    model/campaign_create_common.h
    model/campaign_create_request.h
    model/campaign_create_response.h
    model/campaign_create_response_data.h
    model/campaign_create_response_item.h
    model/campaign_id.h
    model/campaign_response.h
    model/campaign_summary_status.h
    model/campaign_update_request.h
    model/campaign_update_response.h
    model/campaigns_analytics_response_inner.h
    model/campaigns_list_200_response.h
    model/catalog.h
    model/catalog_product_group.h
    model/catalogs_create_hotel_item.h
    model/catalogs_create_retail_item.h
    model/catalogs_db_item.h
    model/catalogs_delete_hotel_item.h
    model/catalogs_delete_retail_item.h
    model/catalogs_feed.h
    model/catalogs_feed_credentials.h
    model/catalogs_feed_ingestion_details.h
    model/catalogs_feed_ingestion_errors.h
    model/catalogs_feed_ingestion_info.h
    model/catalogs_feed_ingestion_warnings.h
    model/catalogs_feed_processing_result.h
    model/catalogs_feed_processing_schedule.h
    model/catalogs_feed_processing_status.h
    model/catalogs_feed_product_counts.h
    model/catalogs_feed_validation_details.h
    model/catalogs_feed_validation_errors.h
    model/catalogs_feed_validation_warnings.h
    model/catalogs_feeds_create_request.h
    model/catalogs_feeds_create_request_default_locale.h
    model/catalogs_feeds_update_request.h
    model/catalogs_format.h
    model/catalogs_hotel_address.h
    model/catalogs_hotel_attributes.h
    model/catalogs_hotel_attributes_all_of_main_image.h
    model/catalogs_hotel_batch_item.h
    model/catalogs_hotel_batch_request.h
    model/catalogs_hotel_feed.h
    model/catalogs_hotel_feeds_create_request.h
    model/catalogs_hotel_feeds_update_request.h
    model/catalogs_hotel_guest_ratings.h
    model/catalogs_hotel_item_error_response.h
    model/catalogs_hotel_item_response.h
    model/catalogs_hotel_items_batch.h
    model/catalogs_hotel_items_filter.h
    model/catalogs_hotel_product_group.h
    model/catalogs_hotel_product_group_create_request.h
    model/catalogs_hotel_product_group_filter_keys.h
    model/catalogs_hotel_product_group_filters.h
    model/catalogs_hotel_product_group_filters_all_of.h
    model/catalogs_hotel_product_group_filters_any_of.h
    model/catalogs_hotel_product_group_update_request.h
    model/catalogs_item_validation_details.h
    model/catalogs_item_validation_errors.h
    model/catalogs_item_validation_issue.h
    model/catalogs_item_validation_issues.h
    model/catalogs_item_validation_warnings.h
    model/catalogs_items.h
    model/catalogs_items_batch.h
    model/catalogs_items_batch_request.h
    model/catalogs_items_create_batch_request.h
    model/catalogs_items_delete_batch_request.h
    model/catalogs_items_delete_discontinued_batch_request.h
    model/catalogs_items_filters.h
    model/catalogs_items_update_batch_request.h
    model/catalogs_items_upsert_batch_request.h
    model/catalogs_list_200_response.h
    model/catalogs_list_products_by_filter_request.h
    model/catalogs_list_products_by_filter_request_one_of.h
    model/catalogs_locale.h
    model/catalogs_product.h
    model/catalogs_product_group.h
    model/catalogs_product_group_create_request.h
    model/catalogs_product_group_currency_criteria.h
    model/catalogs_product_group_filter_keys.h
    model/catalogs_product_group_filters.h
    model/catalogs_product_group_filters_all_of.h
    model/catalogs_product_group_filters_any_of.h
    model/catalogs_product_group_filters_request.h
    model/catalogs_product_group_filters_request_any_of.h
    model/catalogs_product_group_filters_request_any_of_1.h
    model/catalogs_product_group_multiple_countries_criteria.h
    model/catalogs_product_group_multiple_gender_criteria.h
    model/catalogs_product_group_multiple_string_criteria.h
    model/catalogs_product_group_multiple_string_list_criteria.h
    model/catalogs_product_group_pins_list_200_response.h
    model/catalogs_product_group_pricing_criteria.h
    model/catalogs_product_group_pricing_currency_criteria.h
    model/catalogs_product_group_product_counts.h
    model/catalogs_product_group_status.h
    model/catalogs_product_group_type.h
    model/catalogs_product_group_update_request.h
    model/catalogs_product_groups_create_201_response.h
    model/catalogs_product_groups_create_request.h
    model/catalogs_product_groups_list_200_response.h
    model/catalogs_product_groups_list_200_response_all_of_items_inner.h
    model/catalogs_product_groups_update_request.h
    model/catalogs_product_metadata.h
    model/catalogs_retail_batch_request.h
    model/catalogs_retail_batch_request_items_inner.h
    model/catalogs_retail_feed.h
    model/catalogs_retail_feeds_create_request.h
    model/catalogs_retail_feeds_update_request.h
    model/catalogs_retail_item_error_response.h
    model/catalogs_retail_item_response.h
    model/catalogs_retail_items_batch.h
    model/catalogs_retail_items_filter.h
    model/catalogs_retail_product_group.h
    model/catalogs_status.h
    model/catalogs_type.h
    model/catalogs_updatable_hotel_attributes.h
    model/catalogs_update_hotel_item.h
    model/catalogs_update_retail_item.h
    model/catalogs_upsert_hotel_item.h
    model/catalogs_upsert_retail_item.h
    model/catalogs_vertical_batch_request.h
    model/catalogs_vertical_feeds_create_request.h
    model/catalogs_vertical_feeds_update_request.h
    model/catalogs_vertical_product_group.h
    model/catalogs_vertical_product_group_create_request.h
    model/catalogs_vertical_product_group_update_request.h
    model/condition_filter.h
    model/conversion_api_response.h
    model/conversion_api_response_events_inner.h
    model/conversion_attribution_window_days.h
    model/conversion_event_response.h
    model/conversion_events.h
    model/conversion_events_data_inner.h
    model/conversion_events_data_inner_custom_data.h
    model/conversion_events_data_inner_custom_data_contents_inner.h
    model/conversion_events_user_data.h
    model/conversion_report_attribution_type.h
    model/conversion_report_time_type.h
    model/conversion_tag_common.h
    model/conversion_tag_configs.h
    model/conversion_tag_create.h
    model/conversion_tag_list_response.h
    model/conversion_tag_response.h
    model/conversion_tag_type.h
    model/country.h
    model/country_filter.h
    model/create_mmm_report_request.h
    model/create_mmm_report_response.h
    model/create_mmm_report_response_data.h
    model/creative_type.h
    model/currency.h
    model/currency_filter.h
    model/custom_label0_filter.h
    model/custom_label1_filter.h
    model/custom_label2_filter.h
    model/custom_label3_filter.h
    model/custom_label4_filter.h
    model/customer_list.h
    model/customer_list_request.h
    model/customer_list_update_request.h
    model/customer_lists_list_200_response.h
    model/data_output_format.h
    model/data_status.h
    model/delivery_metrics_response.h
    model/delivery_metrics_response_items_inner.h
    model/detailed_error.h
    model/enhanced_match_status_type.h
    model/entity_status.h
    model/error.h
    model/exception.h
    model/feed_processing_results_list_200_response.h
    model/feeds_create_request.h
    model/feeds_list_200_response.h
    model/feeds_update_request.h
    model/follow_user_request.h
    model/followers_list_200_response.h
    model/gender.h
    model/gender_filter.h
    model/get_audiences_order_by.h
    model/get_mmm_report_response.h
    model/get_mmm_report_response_data.h
    model/google_product_category0_filter.h
    model/google_product_category1_filter.h
    model/google_product_category2_filter.h
    model/google_product_category3_filter.h
    model/google_product_category4_filter.h
    model/google_product_category5_filter.h
    model/google_product_category6_filter.h
    model/granularity.h
    model/grid_click_type.h
    model/hotel_id_filter.h
    model/hotel_processing_record.h
    model/image_details.h
    model/image_metadata.h
    model/image_metadata_images.h
    model/integration_log.h
    model/integration_log_client_error.h
    model/integration_log_client_request.h
    model/integration_logs_invalid_log_response.h
    model/integration_logs_invalid_log_response_rejected_logs_inner.h
    model/integration_logs_request.h
    model/integration_logs_success_response.h
    model/integration_metadata.h
    model/integration_record.h
    model/integration_request.h
    model/integration_request_patch.h
    model/integrations_get_list_200_response.h
    model/interest.h
    model/item_attributes.h
    model/item_batch_record.h
    model/item_create_batch_record.h
    model/item_delete_batch_record.h
    model/item_delete_discontinued_batch_record.h
    model/item_group_id_filter.h
    model/item_id_filter.h
    model/item_processing_record.h
    model/item_processing_status.h
    model/item_response.h
    model/item_response_any_of.h
    model/item_response_any_of_1.h
    model/item_update_batch_record.h
    model/item_upsert_batch_record.h
    model/item_validation_event.h
    model/items_batch_post_request.h
    model/items_issues_list_200_response.h
    model/keyword.h
    model/keyword_error.h
    model/keyword_metrics.h
    model/keyword_metrics_response.h
    model/keyword_update.h
    model/keyword_update_body.h
    model/keywords_common.h
    model/keywords_get_200_response.h
    model/keywords_metrics_array_response.h
    model/keywords_request.h
    model/keywords_response.h
    model/language.h
    model/lead_form_common.h
    model/lead_form_question.h
    model/lead_form_question_field_type.h
    model/lead_form_question_type.h
    model/lead_form_response.h
    model/lead_form_status.h
    model/lead_form_test_request.h
    model/lead_form_test_response.h
    model/lead_forms_list_200_response.h
    model/line_item.h
    model/linked_business.h
    model/match_type.h
    model/match_type_response.h
    model/max_price_filter.h
    model/media_list_200_response.h
    model/media_upload.h
    model/media_upload_all_of_upload_parameters.h
    model/media_upload_details.h
    model/media_upload_request.h
    model/media_upload_status.h
    model/media_upload_type.h
    model/metrics_reporting_level.h
    model/metrics_response.h
    model/min_price_filter.h
    model/mmm_reporting_column.h
    model/mmm_reporting_targeting_type.h
    model/non_nullable_catalogs_currency.h
    model/non_nullable_product_availability_type.h
    model/nullable_catalogs_item_field_type.h
    model/nullable_currency.h
    model/oauth_access_token_request_code.h
    model/oauth_access_token_request_refresh.h
    model/oauth_access_token_response.h
    model/oauth_access_token_response_code.h
    model/oauth_access_token_response_everlasting_refresh.h
    model/oauth_access_token_response_integration_refresh.h
    model/oauth_access_token_response_refresh.h
    model/objective_type.h
    model/optimization_goal_metadata.h
    model/optimization_goal_metadata_conversion_tag_v3_goal_metadata.h
    model/optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows.h
    model/optimization_goal_metadata_frequency_goal_metadata.h
    model/optimization_goal_metadata_scrollup_goal_metadata.h
    model/order_line.h
    model/order_line_error.h
    model/order_line_paid_type.h
    model/order_line_response.h
    model/order_line_single_response.h
    model/order_line_status.h
    model/order_lines.h
    model/order_lines_array_response.h
    model/order_lines_list_200_response.h
    model/pacing_delivery_type.h
    model/page_visit_conversion_tags_get_200_response.h
    model/paginated.h
    model/partner_type.h
    model/pin.h
    model/pin_analytics_metrics_response.h
    model/pin_analytics_metrics_response_daily_metrics_inner.h
    model/pin_create.h
    model/pin_media.h
    model/pin_media_metadata.h
    model/pin_media_source.h
    model/pin_media_source_image_base64.h
    model/pin_media_source_image_url.h
    model/pin_media_source_images_base64.h
    model/pin_media_source_images_base64_items_inner.h
    model/pin_media_source_images_url.h
    model/pin_media_source_images_url_items_inner.h
    model/pin_media_source_pin_url.h
    model/pin_media_source_video_id.h
    model/pin_media_with_image.h
    model/pin_media_with_image_and_video.h
    model/pin_media_with_images.h
    model/pin_media_with_video.h
    model/pin_media_with_videos.h
    model/pin_promotion_summary_status.h
    model/pin_update.h
    model/pin_update_carousel_slots_inner.h
    model/pins_analytics_metric_types_parameter_inner.h
    model/pins_list_200_response.h
    model/pins_save_request.h
    model/pinterest_tag_event_data.h
    model/placement_group_type.h
    model/price_filter.h
    model/product_availability_type.h
    model/product_group_analytics_response_inner.h
    model/product_group_promotion.h
    model/product_group_promotion_create_request.h
    model/product_group_promotion_response.h
    model/product_group_promotion_response_item.h
    model/product_group_promotion_update_request.h
    model/product_group_promotions_list_200_response.h
    model/product_group_summary_status.h
    model/product_type0_filter.h
    model/product_type1_filter.h
    model/product_type2_filter.h
    model/product_type3_filter.h
    model/product_type4_filter.h
    model/quiz_pin_data.h
    model/quiz_pin_option.h
    model/quiz_pin_question.h
    model/quiz_pin_result.h
    model/related_terms.h
    model/related_terms_related_terms_list_inner.h
    model/reporting_column_async.h
    model/role.h
    model/search_partner_pins_200_response.h
    model/search_user_boards_get_200_response.h
    model/single_interest_targeting_option_response.h
    model/ssio_account_address.h
    model/ssio_account_item.h
    model/ssio_account_pmp_name.h
    model/ssio_account_response.h
    model/ssio_create_insertion_order_request.h
    model/ssio_create_insertion_order_response.h
    model/ssio_edit_insertion_order_request.h
    model/ssio_edit_insertion_order_response.h
    model/ssio_insertion_order_common.h
    model/ssio_insertion_order_status.h
    model/ssio_insertion_order_status_response.h
    model/ssio_insertion_orders_status_get_by_ad_account_200_response.h
    model/ssio_order_line.h
    model/ssio_order_lines_get_by_ad_account_200_response.h
    model/summary_pin.h
    model/summary_pin_media.h
    model/targeting_advertiser_country.h
    model/targeting_spec.h
    model/targeting_spec_shopping_retargeting.h
    model/targeting_type_filter.h
    model/template_response.h
    model/template_response_date_range.h
    model/template_response_date_range_absolute_date_range.h
    model/template_response_date_range_dynamic_date_range.h
    model/template_response_date_range_relative_date_range.h
    model/templates_list_200_response.h
    model/terms_of_service.h
    model/top_pins_analytics_response.h
    model/top_pins_analytics_response_date_availability.h
    model/top_pins_analytics_response_pins_inner.h
    model/top_video_pins_analytics_response.h
    model/top_video_pins_analytics_response_pins_inner.h
    model/tracking_urls.h
    model/trend_type.h
    model/trending_keywords_response.h
    model/trending_keywords_response_trends_inner.h
    model/trending_keywords_response_trends_inner_time_series.h
    model/trends_supported_region.h
    model/updatable_item_attributes.h
    model/update_mask_field_type.h
    model/user_account_followed_interests_200_response.h
    model/user_following_feed_type.h
    model/user_following_get_200_response.h
    model/user_list_operation_type.h
    model/user_list_type.h
    model/user_summary.h
    model/user_website_summary.h
    model/user_website_verification_code.h
    model/user_website_verify_request.h
    model/user_websites_get_200_response.h
    model/video_metadata.h
    api/AdAccountsAPI.h
    api/AdGroupsAPI.h
    api/AdsAPI.h
    api/AudienceInsightsAPI.h
    api/AudiencesAPI.h
    api/BillingAPI.h
    api/BoardsAPI.h
    api/BulkAPI.h
    api/CampaignsAPI.h
    api/CatalogsAPI.h
    api/ConversionEventsAPI.h
    api/ConversionTagsAPI.h
    api/CustomerListsAPI.h
    api/IntegrationsAPI.h
    api/KeywordsAPI.h
    api/LeadAdsAPI.h
    api/LeadFormsAPI.h
    api/MediaAPI.h
    api/OauthAPI.h
    api/OrderLinesAPI.h
    api/PinsAPI.h
    api/ProductGroupPromotionsAPI.h
    api/ProductGroupsAPI.h
    api/ResourcesAPI.h
    api/SearchAPI.h
    api/TermsAPI.h
    api/TermsOfServiceAPI.h
    api/UserAccountAPI.h

)

include(PreTarget.cmake OPTIONAL)

set(PROJECT_VERSION_STRING "${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}.${PROJECT_VERSION_PATCH}")

# Add library with project file with project name as library name
add_library(${pkgName} ${SRCS} ${HDRS})
# Link dependent libraries
if(NOT CMAKE_VERSION VERSION_LESS 3.4)
    target_link_libraries(${pkgName} PRIVATE OpenSSL::SSL OpenSSL::Crypto)
endif()
target_link_libraries(${pkgName} PUBLIC ${CURL_LIBRARIES} )
target_include_directories(
    ${pkgName} PUBLIC $<BUILD_INTERFACE:${PROJECT_SOURCE_DIR}>
    $<INSTALL_INTERFACE:include>
)

include(PostTarget.cmake OPTIONAL)

# installation of libraries, headers, and config files
if (NOT EXISTS ${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in)
    install(TARGETS ${pkgName} DESTINATION lib)
else()
    include(GNUInstallDirs)
    install(TARGETS ${pkgName} DESTINATION lib EXPORT ${pkgName}Targets)

    foreach(HDR_FILE ${HDRS})
        get_filename_component(HDR_DIRECTORY ${HDR_FILE} DIRECTORY)
        get_filename_component(ABSOLUTE_HDR_DIRECTORY ${HDR_DIRECTORY} ABSOLUTE)
        file(RELATIVE_PATH RELATIVE_HDR_PATH ${CMAKE_CURRENT_SOURCE_DIR} ${ABSOLUTE_HDR_DIRECTORY})
        install(FILES ${HDR_FILE} DESTINATION include/${pkgName}/${RELATIVE_HDR_PATH})
    endforeach()

    include(CMakePackageConfigHelpers)
    write_basic_package_version_file(
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            VERSION "${PROJECT_VERSION_STRING}"
            COMPATIBILITY AnyNewerVersion
    )

    export(EXPORT ${pkgName}Targets
            FILE "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Targets.cmake"
            NAMESPACE ${pkgName}::
            )

    configure_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            @ONLY
            )

    set(ConfigPackageLocation lib/cmake/${pkgName})
    install(EXPORT ${pkgName}Targets
            FILE
            ${pkgName}Targets.cmake
            NAMESPACE
            ${pkgName}::
            DESTINATION
            ${ConfigPackageLocation}
            )
    install(
            FILES
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            DESTINATION
            ${ConfigPackageLocation}
    )
endif()

# make installation packages
include(Packing.cmake OPTIONAL)

# Setting file variables to null
set(SRCS "")
set(HDRS "")


## This section shows how to use the above compiled library to compile the source files
## set source files
#set(SRCS
#    unit-tests/manual-AdAccountsAPI.c
#    unit-tests/manual-AdGroupsAPI.c
#    unit-tests/manual-AdsAPI.c
#    unit-tests/manual-AudienceInsightsAPI.c
#    unit-tests/manual-AudiencesAPI.c
#    unit-tests/manual-BillingAPI.c
#    unit-tests/manual-BoardsAPI.c
#    unit-tests/manual-BulkAPI.c
#    unit-tests/manual-CampaignsAPI.c
#    unit-tests/manual-CatalogsAPI.c
#    unit-tests/manual-ConversionEventsAPI.c
#    unit-tests/manual-ConversionTagsAPI.c
#    unit-tests/manual-CustomerListsAPI.c
#    unit-tests/manual-IntegrationsAPI.c
#    unit-tests/manual-KeywordsAPI.c
#    unit-tests/manual-LeadAdsAPI.c
#    unit-tests/manual-LeadFormsAPI.c
#    unit-tests/manual-MediaAPI.c
#    unit-tests/manual-OauthAPI.c
#    unit-tests/manual-OrderLinesAPI.c
#    unit-tests/manual-PinsAPI.c
#    unit-tests/manual-ProductGroupPromotionsAPI.c
#    unit-tests/manual-ProductGroupsAPI.c
#    unit-tests/manual-ResourcesAPI.c
#    unit-tests/manual-SearchAPI.c
#    unit-tests/manual-TermsAPI.c
#    unit-tests/manual-TermsOfServiceAPI.c
#    unit-tests/manual-UserAccountAPI.c
#)

##set header files
#set(HDRS
#)

## loop over all files in SRCS variable
#foreach(SOURCE_FILE ${SRCS})
#    # Get only the file name from the file as add_executable does not support executable with slash("/")
#    get_filename_component(FILE_NAME_ONLY ${SOURCE_FILE} NAME_WE)
#    # Remove .c from the file name and set it as executable name
#    string( REPLACE ".c" "" EXECUTABLE_FILE ${FILE_NAME_ONLY})
#    # Add executable for every source file in  SRCS
#    add_executable(unit-${EXECUTABLE_FILE} ${SOURCE_FILE})
#    # Link above created library to executable and dependent library curl
#    target_link_libraries(unit-${EXECUTABLE_FILE} ${CURL_LIBRARIES} ${pkgName} )
#endforeach(SOURCE_FILE ${SRCS})
