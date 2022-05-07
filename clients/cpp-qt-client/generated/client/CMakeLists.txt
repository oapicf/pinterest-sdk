cmake_minimum_required(VERSION 3.2)

project(client)
set(CMAKE_VERBOSE_MAKEFILE ON)
set(CMAKE_INCLUDE_CURRENT_DIR ON)
set(CMAKE_AUTOMOC ON)

if (MSVC)
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} /W4")
else ()
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fPIC -Wall -Wno-unused-variable")
endif ()

find_package(Qt5Core REQUIRED)
find_package(Qt5Network REQUIRED)
find_package(Qt5Gui REQUIRED)

add_library(${PROJECT_NAME}
    OAIAccount.cpp
    OAIActionType.cpp
    OAIAdAccount.cpp
    OAIAdGroupResponse.cpp
    OAIAdGroupResponse_allOf.cpp
    OAIAdGroupResponse_allOf_1.cpp
    OAIAdGroupSummaryStatus.cpp
    OAIAdResponse.cpp
    OAIAdResponse_allOf.cpp
    OAIAdResponse_allOf_1.cpp
    OAIAd_account_owner.cpp
    OAIAdsAnalyticsCreateAsyncRequest.cpp
    OAIAdsAnalyticsCreateAsyncRequest_allOf.cpp
    OAIAdsAnalyticsCreateAsyncRequest_allOf_1.cpp
    OAIAdsAnalyticsCreateAsyncResponse.cpp
    OAIAdsAnalyticsFilterColumn.cpp
    OAIAdsAnalyticsFilterOperator.cpp
    OAIAdsAnalyticsGetAsyncResponse.cpp
    OAIAdsAnalyticsMetricsFilter.cpp
    OAIAdsAnalyticsTargetingType.cpp
    OAIAnalyticsMetricsResponse.cpp
    OAIAnalyticsMetricsResponse_daily_metrics.cpp
    OAIAvailabilityFilter.cpp
    OAIBatchOperation.cpp
    OAIBatchOperationStatus.cpp
    OAIBoard.cpp
    OAIBoardOwner.cpp
    OAIBoardSection.cpp
    OAIBoardUpdate.cpp
    OAIBrandFilter.cpp
    OAICampaignCommon.cpp
    OAICampaignResponse.cpp
    OAICampaignResponse_allOf.cpp
    OAICampaignResponse_allOf_1.cpp
    OAICampaignSummaryStatus.cpp
    OAICatalogsDbItem.cpp
    OAICatalogsFeed.cpp
    OAICatalogsFeedCredentials.cpp
    OAICatalogsFeedIngestionDetails.cpp
    OAICatalogsFeedIngestionErrors.cpp
    OAICatalogsFeedIngestionInfo.cpp
    OAICatalogsFeedProcessingResult.cpp
    OAICatalogsFeedProcessingSchedule.cpp
    OAICatalogsFeedProcessingStatus.cpp
    OAICatalogsFeedProductCounts.cpp
    OAICatalogsFeedValidationDetails.cpp
    OAICatalogsFeedValidationErrors.cpp
    OAICatalogsFeedValidationWarnings.cpp
    OAICatalogsFeedsCreateRequest.cpp
    OAICatalogsFeedsUpdateRequest.cpp
    OAICatalogsFormat.cpp
    OAICatalogsItems.cpp
    OAICatalogsItemsBatch.cpp
    OAICatalogsItemsBatchRequest.cpp
    OAICatalogsProductGroup.cpp
    OAICatalogsProductGroupCreateRequest.cpp
    OAICatalogsProductGroupCurrencyCriteria.cpp
    OAICatalogsProductGroupFilterKeys.cpp
    OAICatalogsProductGroupFilters.cpp
    OAICatalogsProductGroupFiltersAllOf.cpp
    OAICatalogsProductGroupFiltersAnyOf.cpp
    OAICatalogsProductGroupMultipleStringCriteria.cpp
    OAICatalogsProductGroupMultipleStringListCriteria.cpp
    OAICatalogsProductGroupPricingCriteria.cpp
    OAICatalogsProductGroupStatus.cpp
    OAICatalogsProductGroupType.cpp
    OAICatalogsProductGroupUpdateRequest.cpp
    OAICatalogsStatus.cpp
    OAICatalogs_feed_processing_result_fields.cpp
    OAIConditionFilter.cpp
    OAIConversionAttributionWindowDays.cpp
    OAIConversionReportAttributionType.cpp
    OAIConversionReportTimeType.cpp
    OAICountry.cpp
    OAICurrency.cpp
    OAICurrencyFilter.cpp
    OAICustomLabel0Filter.cpp
    OAICustomLabel1Filter.cpp
    OAICustomLabel2Filter.cpp
    OAICustomLabel3Filter.cpp
    OAICustomLabel4Filter.cpp
    OAIDataOutputFormat.cpp
    OAIEntityStatus.cpp
    OAIError.cpp
    OAIFeed_fields.cpp
    OAIGenderFilter.cpp
    OAIGoogleProductCategory0Filter.cpp
    OAIGoogleProductCategory1Filter.cpp
    OAIGoogleProductCategory2Filter.cpp
    OAIGoogleProductCategory3Filter.cpp
    OAIGoogleProductCategory4Filter.cpp
    OAIGoogleProductCategory5Filter.cpp
    OAIGoogleProductCategory6Filter.cpp
    OAIGranularity.cpp
    OAIImageDetails.cpp
    OAIItemAttributes.cpp
    OAIItemBatchRecord.cpp
    OAIItemGroupIdFilter.cpp
    OAIItemIdFilter.cpp
    OAIItemProcessingRecord.cpp
    OAIItemProcessingStatus.cpp
    OAIItemValidationEvent.cpp
    OAILanguage.cpp
    OAIMaxPriceFilter.cpp
    OAIMediaUpload.cpp
    OAIMediaUploadDetails.cpp
    OAIMediaUploadRequest.cpp
    OAIMediaUploadStatus.cpp
    OAIMediaUploadType.cpp
    OAIMediaUpload_allOf.cpp
    OAIMediaUpload_allOf_upload_parameters.cpp
    OAIMetricsReportingLevel.cpp
    OAIMinPriceFilter.cpp
    OAINonNullableCatalogsCurrency.cpp
    OAINullableCurrency.cpp
    OAIOauthAccessTokenRequestCode.cpp
    OAIOauthAccessTokenRequestCode_allOf.cpp
    OAIOauthAccessTokenRequestRefresh.cpp
    OAIOauthAccessTokenRequestRefresh_allOf.cpp
    OAIOauthAccessTokenResponse.cpp
    OAIOauthAccessTokenResponseCode.cpp
    OAIOauthAccessTokenResponseCode_allOf.cpp
    OAIOauthAccessTokenResponseRefresh.cpp
    OAIObjectiveType.cpp
    OAIPacingDeliveryType.cpp
    OAIPaginated.cpp
    OAIPin.cpp
    OAIPinMedia.cpp
    OAIPinMediaSource.cpp
    OAIPinMediaSourceImageBase64.cpp
    OAIPinMediaSourceImageURL.cpp
    OAIPinMediaSourceVideoID.cpp
    OAIPinMediaWithImage.cpp
    OAIPinMediaWithImage_allOf.cpp
    OAIPinPromotionSummaryStatus.cpp
    OAIPlacementGroupType.cpp
    OAIProductAvailabilityType.cpp
    OAIProductGroupSummaryStatus.cpp
    OAIProductType0Filter.cpp
    OAIProductType1Filter.cpp
    OAIProductType2Filter.cpp
    OAIProductType3Filter.cpp
    OAIProductType4Filter.cpp
    OAIReportingColumnAsync.cpp
    OAITargetingTypeFilter.cpp
    OAITrackingUrls.cpp
    OAIAdAccountsApi.cpp
    OAIBoardsApi.cpp
    OAICatalogsApi.cpp
    OAIMediaApi.cpp
    OAIOauthApi.cpp
    OAIPinsApi.cpp
    OAIUserAccountApi.cpp
    OAIHelpers.cpp
    OAIHttpRequest.cpp
    OAIHttpFileElement.cpp
    OAIOauth.cpp
)
target_link_libraries(${PROJECT_NAME} PRIVATE Qt5::Core Qt5::Network Qt5::Gui)
if(NOT APPLE)
  target_link_libraries(${PROJECT_NAME} PRIVATE ssl crypto)
endif()

set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_STANDARD 14)
set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_STANDARD_REQUIRED ON)
set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_EXTENSIONS OFF)

install(TARGETS ${PROJECT_NAME} RUNTIME DESTINATION bin LIBRARY DESTINATION lib ARCHIVE DESTINATION lib)
