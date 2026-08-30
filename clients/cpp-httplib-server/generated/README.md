# cpp-httplib-server - C++ Server

## Overview

This server was generated using the [OpenAPI Generator](https://openapi-generator.tech) project.
It uses the [cpp-httplib](https://github.com/yhirose/cpp-httplib) library to implement a lightweight HTTP server
with JSON request/response handling via [nlohmann/json](https://github.com/nlohmann/json).

## Requirements

- C++17 compatible compiler
- CMake (3.14 or higher)
- OpenSSL (for HTTPS support)
- ZLIB (for compression support)

**Note:** The following libraries are automatically downloaded via CMake FetchContent:
- [cpp-httplib](https://github.com/yhirose/cpp-httplib) v0.15.3
- [nlohmann/json](https://github.com/nlohmann/json) v3.11.3

### Platform-Specific Installation

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install -y libssl-dev zlib1g-dev cmake build-essential
```

**macOS:**
```bash
brew install openssl zlib cmake
```

**Windows:**
```powershell
# Using vcpkg
vcpkg install openssl:x64-windows zlib:x64-windows

# Then configure CMake with vcpkg toolchain:
cmake -B build -DCMAKE_TOOLCHAIN_FILE=[vcpkg_root]/scripts/buildsystems/vcpkg.cmake
```

## Project Structure

```
├── CMakeLists.txt          # Project build configuration
├── README.md               # This file
├── models/                  # Generated model classes
└── api/                    # Generated API handler classes
```

## Building the Project

```bash
mkdir build
cd build
cmake ..
make
```

## Working with Models

### Model Classes

#### models::Account

```cpp
// Create a model
auto model = models::Account();
model.setAbout(/* value */);  // Set about
model.setAccountType(/* value */);  // Set account_type
model.setBoardCount(/* value */);  // Set board_count
model.setBusinessName(/* value */);  // Set business_name
model.setFollowerCount(/* value */);  // Set follower_count
model.setFollowingCount(/* value */);  // Set following_count
model.setId(/* value */);  // Set id
model.setMonthlyViews(/* value */);  // Set monthly_views
model.setPinCount(/* value */);  // Set pin_count
model.setProfileImage(/* value */);  // Set profile_image
model.setUsername(/* value */);  // Set username
model.setWebsiteUrl(/* value */);  // Set website_url

// Serialize to JSON
nlohmann::json json = models::Account::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Account::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AccountTemplate

```cpp
// Create a model
auto model = models::AccountTemplate();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAdAccountIds(/* value */);  // Set ad_account_ids
model.setAdeColumns(/* value */);  // Set ade_columns
model.setAttributionType(/* value */);  // Set attribution_type
model.setClickWindowDays(/* value */);  // Set click_window_days
model.setColumns(/* value */);  // Set columns
model.setConversionReportTimeType(/* value */);  // Set conversion_report_time_type
model.setCreationSource(/* value */);  // Set creation_source
model.setCustomColumnIds(/* value */);  // Set custom_column_ids
model.setDisplayMetadata(/* value */);  // Set display_metadata
model.setEngagementWindowDays(/* value */);  // Set engagement_window_days
model.setFiltersJson(/* value */);  // Set filters_json
model.setGranularity(/* value */);  // Set granularity
model.setId(/* value */);  // Set id
model.setIngestionSources(/* value */);  // Set ingestion_sources
model.setIsDefault(/* value */);  // Set is_default
model.setIsDeleted(/* value */);  // Set is_deleted
model.setIsOwnedByUser(/* value */);  // Set is_owned_by_user
model.setIsScheduled(/* value */);  // Set is_scheduled
model.setName(/* value */);  // Set name
model.setReportEndRelativeDaysInPast(/* value */);  // Set report_end_relative_days_in_past
model.setReportFormat(/* value */);  // Set report_format
model.setReportLevel(/* value */);  // Set report_level
model.setReportStartRelativeDaysInPast(/* value */);  // Set report_start_relative_days_in_past
model.setReportingTimeZone(/* value */);  // Set reporting_time_zone
model.setSortBy(/* value */);  // Set sort_by
model.setType(/* value */);  // Set type
model.setUpdatedTime(/* value */);  // Set updated_time
model.setUserId(/* value */);  // Set user_id
model.setViewWindowDays(/* value */);  // Set view_window_days

// Serialize to JSON
nlohmann::json json = models::AccountTemplate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AccountTemplate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ActionType

```cpp
// Create a model
auto model = models::ActionType();

// Serialize to JSON
nlohmann::json json = models::ActionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ActionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Ad

```cpp
// Create a model
auto model = models::Ad();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setCampaignId(/* value */);  // Set campaign_id
model.setCarouselAndroidDeepLinks(/* value */);  // Set carousel_android_deep_links
model.setCarouselDestinationUrls(/* value */);  // Set carousel_destination_urls
model.setCarouselIosDeepLinks(/* value */);  // Set carousel_ios_deep_links
model.setCartingPlatformType(/* value */);  // Set carting_platform_type
model.setCartingProducts(/* value */);  // Set carting_products
model.setClickTrackingUrl(/* value */);  // Set click_tracking_url
model.setCollectionItemsDestinationUrlTemplate(/* value */);  // Set collection_items_destination_url_template
model.setCollectionsHeaderType(/* value */);  // Set collections_header_type
model.setCreatedTime(/* value */);  // Set created_time
model.setCreativeType(/* value */);  // Set creative_type
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setDestinationUrl(/* value */);  // Set destination_url
model.setDisclosureType(/* value */);  // Set disclosure_type
model.setDisclosureUrl(/* value */);  // Set disclosure_url
model.setGridClickType(/* value */);  // Set grid_click_type
model.setId(/* value */);  // Set id
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setIsCarting(/* value */);  // Set is_carting
model.setIsCollageAcceptedTerms(/* value */);  // Set is_collage_accepted_terms
model.setIsCollageSingleDestination(/* value */);  // Set is_collage_single_destination
model.setIsPinDeleted(/* value */);  // Set is_pin_deleted
model.setIsRemovable(/* value */);  // Set is_removable
model.setLeadFormId(/* value */);  // Set lead_form_id
model.setName(/* value */);  // Set name
model.setPinId(/* value */);  // Set pin_id
model.setQuizPinData(/* value */);  // Set quiz_pin_data
model.setRejectedReasons(/* value */);  // Set rejected_reasons
model.setRejectionLabels(/* value */);  // Set rejection_labels
model.setReviewStatus(/* value */);  // Set review_status
model.setStatus(/* value */);  // Set status
model.setSummaryStatus(/* value */);  // Set summary_status
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setType(/* value */);  // Set type
model.setUpdatedTime(/* value */);  // Set updated_time
model.setViewTrackingUrl(/* value */);  // Set view_tracking_url

// Serialize to JSON
nlohmann::json json = models::Ad::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Ad::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccount

```cpp
// Create a model
auto model = models::AdAccount();
model.setCountry(/* value */);  // Set country
model.setCreatedTime(/* value */);  // Set created_time
model.setCurrency(/* value */);  // Set currency
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setOwner(/* value */);  // Set owner
model.setPermissions(/* value */);  // Set permissions
model.setTimeZone(/* value */);  // Set time_zone
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::AdAccount::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccount::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountAnalyticsItems

```cpp
// Create a model
auto model = models::AdAccountAnalyticsItems();
model.setADACCOUNTID(/* value */);  // Set AD_ACCOUNT_ID
model.setDATE(/* value */);  // Set DATE

// Serialize to JSON
nlohmann::json json = models::AdAccountAnalyticsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountAnalyticsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountCountriesGet200Response

```cpp
// Create a model
auto model = models::AdAccountCountriesGet200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdAccountCountriesGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountCountriesGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountCreate

```cpp
// Create a model
auto model = models::AdAccountCreate();
model.setCountry(/* value */);  // Set country
model.setCurrency(/* value */);  // Set currency
model.setName(/* value */);  // Set name
model.setOwnerUserId(/* value */);  // Set owner_user_id
model.setTimeZone(/* value */);  // Set time_zone

// Serialize to JSON
nlohmann::json json = models::AdAccountCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountEntityType

```cpp
// Create a model
auto model = models::AdAccountEntityType();

// Serialize to JSON
nlohmann::json json = models::AdAccountEntityType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountEntityType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountOwner

```cpp
// Create a model
auto model = models::AdAccountOwner();
model.setId(/* value */);  // Set id
model.setUsername(/* value */);  // Set username

// Serialize to JSON
nlohmann::json json = models::AdAccountOwner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountOwner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountToAdAccountSharedAudience

```cpp
// Create a model
auto model = models::AdAccountToAdAccountSharedAudience();
model.setAudienceId(/* value */);  // Set audience_id
model.setPermissions(/* value */);  // Set permissions
model.setRecipientAccountIds(/* value */);  // Set recipient_account_ids

// Serialize to JSON
nlohmann::json json = models::AdAccountToAdAccountSharedAudience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountToAdAccountSharedAudience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody();
model.setAudienceId(/* value */);  // Set audience_id
model.setOperationType(/* value */);  // Set operation_type
model.setRecipientAccountIds(/* value */);  // Set recipient_account_ids

// Serialize to JSON
nlohmann::json json = models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountToBusinessSharedAudience

```cpp
// Create a model
auto model = models::AdAccountToBusinessSharedAudience();
model.setAudienceId(/* value */);  // Set audience_id
model.setPermissions(/* value */);  // Set permissions
model.setRecipientBusinessIds(/* value */);  // Set recipient_business_ids

// Serialize to JSON
nlohmann::json json = models::AdAccountToBusinessSharedAudience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountToBusinessSharedAudience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody();
model.setAudienceId(/* value */);  // Set audience_id
model.setOperationType(/* value */);  // Set operation_type
model.setRecipientBusinessIds(/* value */);  // Set recipient_business_ids

// Serialize to JSON
nlohmann::json json = models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsAudience

```cpp
// Create a model
auto model = models::AdAccountsAudience();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAudienceType(/* value */);  // Set audience_type
model.setCreatedByCompanyName(/* value */);  // Set created_by_company_name
model.setCreatedTimestamp(/* value */);  // Set created_timestamp
model.setDescription(/* value */);  // Set description
model.setId(/* value */);  // Set id
model.setIsNca(/* value */);  // Set is_nca
model.setName(/* value */);  // Set name
model.setRule(/* value */);  // Set rule
model.setSize(/* value */);  // Set size
model.setStatus(/* value */);  // Set status
model.setType(/* value */);  // Set type
model.setUpdatedTimestamp(/* value */);  // Set updated_timestamp

// Serialize to JSON
nlohmann::json json = models::AdAccountsAudience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsAudience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsAudienceCreate

```cpp
// Create a model
auto model = models::AdAccountsAudienceCreate();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAudienceType(/* value */);  // Set audience_type
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name
model.setRule(/* value */);  // Set rule

// Serialize to JSON
nlohmann::json json = models::AdAccountsAudienceCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsAudienceCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsAudienceRule

```cpp
// Create a model
auto model = models::AdAccountsAudienceRule();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAdId(/* value */);  // Set ad_id
model.setCampaignId(/* value */);  // Set campaign_id
model.setCountry(/* value */);  // Set country
model.setCustomerListId(/* value */);  // Set customer_list_id
model.setEngagementDomain(/* value */);  // Set engagement_domain
model.setEngagementType(/* value */);  // Set engagement_type
model.setEngagerType(/* value */);  // Set engager_type
model.setEvent(/* value */);  // Set event
model.setEventData(/* value */);  // Set event_data
model.setEventSource(/* value */);  // Set event_source
model.setIngestionSource(/* value */);  // Set ingestion_source
model.setObjectiveType(/* value */);  // Set objective_type
model.setPercentage(/* value */);  // Set percentage
model.setPinId(/* value */);  // Set pin_id
model.setPrefill(/* value */);  // Set prefill
model.setRetentionDays(/* value */);  // Set retention_days
model.setSeedId(/* value */);  // Set seed_id
model.setUrl(/* value */);  // Set url
model.setVisitorSourceId(/* value */);  // Set visitor_source_id

// Serialize to JSON
nlohmann::json json = models::AdAccountsAudienceRule::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsAudienceRule::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsAudienceUpdate

```cpp
// Create a model
auto model = models::AdAccountsAudienceUpdate();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAudienceType(/* value */);  // Set audience_type
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name
model.setOperationType(/* value */);  // Set operation_type
model.setRule(/* value */);  // Set rule

// Serialize to JSON
nlohmann::json json = models::AdAccountsAudienceUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsAudienceUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsAudiencesSharedAccountsList200Response

```cpp
// Create a model
auto model = models::AdAccountsAudiencesSharedAccountsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdAccountsAudiencesSharedAccountsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsAudiencesSharedAccountsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsCountry

```cpp
// Create a model
auto model = models::AdAccountsCountry();
model.setCode(/* value */);  // Set code
model.setCurrency(/* value */);  // Set currency
model.setIndex(/* value */);  // Set index
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::AdAccountsCountry::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsCountry::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsList200Response

```cpp
// Create a model
auto model = models::AdAccountsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdAccountsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAccountsSubscriptionsGetList200Response

```cpp
// Create a model
auto model = models::AdAccountsSubscriptionsGetList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdAccountsSubscriptionsGetList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAccountsSubscriptionsGetList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdAdsAnalyticsAsyncTargetingTypes

```cpp
// Create a model
auto model = models::AdAdsAnalyticsAsyncTargetingTypes();

// Serialize to JSON
nlohmann::json json = models::AdAdsAnalyticsAsyncTargetingTypes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdAdsAnalyticsAsyncTargetingTypes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdBatchItem

```cpp
// Create a model
auto model = models::AdBatchItem();
model.setData(/* value */);  // Set data
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::AdBatchItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdBatchItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdBatchUpdate

```cpp
// Create a model
auto model = models::AdBatchUpdate();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setCarouselAndroidDeepLinks(/* value */);  // Set carousel_android_deep_links
model.setCarouselDestinationUrls(/* value */);  // Set carousel_destination_urls
model.setCarouselIosDeepLinks(/* value */);  // Set carousel_ios_deep_links
model.setClickTrackingUrl(/* value */);  // Set click_tracking_url
model.setCollectionItemsDestinationUrlTemplate(/* value */);  // Set collection_items_destination_url_template
model.setCollectionsHeaderType(/* value */);  // Set collections_header_type
model.setCreativeType(/* value */);  // Set creative_type
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setDestinationUrl(/* value */);  // Set destination_url
model.setDisclosureType(/* value */);  // Set disclosure_type
model.setDisclosureUrl(/* value */);  // Set disclosure_url
model.setGridClickType(/* value */);  // Set grid_click_type
model.setId(/* value */);  // Set id
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setIsCarting(/* value */);  // Set is_carting
model.setIsCollageAcceptedTerms(/* value */);  // Set is_collage_accepted_terms
model.setIsCollageSingleDestination(/* value */);  // Set is_collage_single_destination
model.setIsPinDeleted(/* value */);  // Set is_pin_deleted
model.setIsRemovable(/* value */);  // Set is_removable
model.setLeadFormId(/* value */);  // Set lead_form_id
model.setName(/* value */);  // Set name
model.setPinId(/* value */);  // Set pin_id
model.setQuizPinData(/* value */);  // Set quiz_pin_data
model.setStatus(/* value */);  // Set status
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setViewTrackingUrl(/* value */);  // Set view_tracking_url

// Serialize to JSON
nlohmann::json json = models::AdBatchUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdBatchUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdBatchWriteResponseModel

```cpp
// Create a model
auto model = models::AdBatchWriteResponseModel();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdBatchWriteResponseModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdBatchWriteResponseModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdCollectionsHeaderType

```cpp
// Create a model
auto model = models::AdCollectionsHeaderType();

// Serialize to JSON
nlohmann::json json = models::AdCollectionsHeaderType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdCollectionsHeaderType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdCreate

```cpp
// Create a model
auto model = models::AdCreate();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setCarouselAndroidDeepLinks(/* value */);  // Set carousel_android_deep_links
model.setCarouselDestinationUrls(/* value */);  // Set carousel_destination_urls
model.setCarouselIosDeepLinks(/* value */);  // Set carousel_ios_deep_links
model.setClickTrackingUrl(/* value */);  // Set click_tracking_url
model.setCollectionItemsDestinationUrlTemplate(/* value */);  // Set collection_items_destination_url_template
model.setCollectionsHeaderType(/* value */);  // Set collections_header_type
model.setCreativeType(/* value */);  // Set creative_type
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setDestinationUrl(/* value */);  // Set destination_url
model.setDisclosureType(/* value */);  // Set disclosure_type
model.setDisclosureUrl(/* value */);  // Set disclosure_url
model.setGridClickType(/* value */);  // Set grid_click_type
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setIsCarting(/* value */);  // Set is_carting
model.setIsCollageAcceptedTerms(/* value */);  // Set is_collage_accepted_terms
model.setIsCollageSingleDestination(/* value */);  // Set is_collage_single_destination
model.setIsPinDeleted(/* value */);  // Set is_pin_deleted
model.setIsRemovable(/* value */);  // Set is_removable
model.setLeadFormId(/* value */);  // Set lead_form_id
model.setName(/* value */);  // Set name
model.setPinId(/* value */);  // Set pin_id
model.setQuizPinData(/* value */);  // Set quiz_pin_data
model.setStatus(/* value */);  // Set status
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setViewTrackingUrl(/* value */);  // Set view_tracking_url

// Serialize to JSON
nlohmann::json json = models::AdCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdCreateRequest

```cpp
// Create a model
auto model = models::AdCreateRequest();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setCarouselAndroidDeepLinks(/* value */);  // Set carousel_android_deep_links
model.setCarouselDestinationUrls(/* value */);  // Set carousel_destination_urls
model.setCarouselIosDeepLinks(/* value */);  // Set carousel_ios_deep_links
model.setClickTrackingUrl(/* value */);  // Set click_tracking_url
model.setCreativeType(/* value */);  // Set creative_type
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setDestinationUrl(/* value */);  // Set destination_url
model.setDisclosureType(/* value */);  // Set disclosure_type
model.setDisclosureUrl(/* value */);  // Set disclosure_url
model.setGridClickType(/* value */);  // Set grid_click_type
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setIsCarting(/* value */);  // Set is_carting
model.setIsPinDeleted(/* value */);  // Set is_pin_deleted
model.setIsRemovable(/* value */);  // Set is_removable
model.setLeadFormId(/* value */);  // Set lead_form_id
model.setName(/* value */);  // Set name
model.setPinId(/* value */);  // Set pin_id
model.setQuizPinData(/* value */);  // Set quiz_pin_data
model.setStatus(/* value */);  // Set status
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setViewTrackingUrl(/* value */);  // Set view_tracking_url

// Serialize to JSON
nlohmann::json json = models::AdCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdDisapprovalReasons

```cpp
// Create a model
auto model = models::AdDisapprovalReasons();

// Serialize to JSON
nlohmann::json json = models::AdDisapprovalReasons::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdDisapprovalReasons::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroup

```cpp
// Create a model
auto model = models::AdGroup();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setBudgetType(/* value */);  // Set budget_type
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type

// Serialize to JSON
nlohmann::json json = models::AdGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupAudienceSizing

```cpp
// Create a model
auto model = models::AdGroupAudienceSizing();
model.setAudienceSizeLowerBound(/* value */);  // Set audience_size_lower_bound
model.setAudienceSizeUpperBound(/* value */);  // Set audience_size_upper_bound

// Serialize to JSON
nlohmann::json json = models::AdGroupAudienceSizing::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupAudienceSizing::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupAudienceSizingCreate

```cpp
// Create a model
auto model = models::AdGroupAudienceSizingCreate();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setCreativeTypes(/* value */);  // Set creative_types
model.setKeywords(/* value */);  // Set keywords
model.setPlacementGroup(/* value */);  // Set placement_group
model.setProductGroupIds(/* value */);  // Set product_group_ids
model.setTargetingSpec(/* value */);  // Set targeting_spec

// Serialize to JSON
nlohmann::json json = models::AdGroupAudienceSizingCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupAudienceSizingCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupAudienceSizingCreativeTypes

```cpp
// Create a model
auto model = models::AdGroupAudienceSizingCreativeTypes();

// Serialize to JSON
nlohmann::json json = models::AdGroupAudienceSizingCreativeTypes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupAudienceSizingCreativeTypes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupAudienceSizingKeyword

```cpp
// Create a model
auto model = models::AdGroupAudienceSizingKeyword();
model.setMatchType(/* value */);  // Set match_type
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::AdGroupAudienceSizingKeyword::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupAudienceSizingKeyword::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupBase

```cpp
// Create a model
auto model = models::AdGroupBase();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setBidInMicroCurrency(/* value */);  // Set bid_in_micro_currency
model.setBidStrategyType(/* value */);  // Set bid_strategy_type
model.setBillableEvent(/* value */);  // Set billable_event
model.setBudgetInMicroCurrency(/* value */);  // Set budget_in_micro_currency
model.setCampaignId(/* value */);  // Set campaign_id
model.setConversionLearningModeType(/* value */);  // Set conversion_learning_mode_type
model.setCreatedTime(/* value */);  // Set created_time
model.setCustomerSegmentId(/* value */);  // Set customer_segment_id
model.setDcaAssets(/* value */);  // Set dca_assets
model.setEndTime(/* value */);  // Set end_time
model.setExtFeatures(/* value */);  // Set ext_features
model.setFeedProfileId(/* value */);  // Set feed_profile_id
model.setId(/* value */);  // Set id
model.setIsCreativeOptimization(/* value */);  // Set is_creative_optimization
model.setIsLocalInventory(/* value */);  // Set is_local_inventory
model.setLifetimeFrequencyCap(/* value */);  // Set lifetime_frequency_cap
model.setLocalInventoryRadiusInMiles(/* value */);  // Set local_inventory_radius_in_miles
model.setName(/* value */);  // Set name
model.setOptimizationGoalMetadata(/* value */);  // Set optimization_goal_metadata
model.setPerformancePlusCampaignSettings(/* value */);  // Set performance_plus_campaign_settings
model.setPlacementGroup(/* value */);  // Set placement_group
model.setPlacementTrafficType(/* value */);  // Set placement_traffic_type
model.setPromotionApplicationLevel(/* value */);  // Set promotion_application_level
model.setPromotionId(/* value */);  // Set promotion_id
model.setPromotionIds(/* value */);  // Set promotion_ids
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setSummaryStatus(/* value */);  // Set summary_status
model.setTargetingSpec(/* value */);  // Set targeting_spec
model.setTargetingTemplateIds(/* value */);  // Set targeting_template_ids
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setType(/* value */);  // Set type
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::AdGroupBase::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupBase::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupCreate

```cpp
// Create a model
auto model = models::AdGroupCreate();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setBudgetType(/* value */);  // Set budget_type
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type

// Serialize to JSON
nlohmann::json json = models::AdGroupCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupCreateCreate

```cpp
// Create a model
auto model = models::AdGroupCreateCreate();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidInMicroCurrency(/* value */);  // Set bid_in_micro_currency
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setBidStrategyType(/* value */);  // Set bid_strategy_type
model.setBillableEvent(/* value */);  // Set billable_event
model.setBudgetInMicroCurrency(/* value */);  // Set budget_in_micro_currency
model.setBudgetType(/* value */);  // Set budget_type
model.setCampaignId(/* value */);  // Set campaign_id
model.setCustomerSegmentId(/* value */);  // Set customer_segment_id
model.setEndTime(/* value */);  // Set end_time
model.setExtFeatures(/* value */);  // Set ext_features
model.setFeedProfileId(/* value */);  // Set feed_profile_id
model.setIsCreativeOptimization(/* value */);  // Set is_creative_optimization
model.setIsLocalInventory(/* value */);  // Set is_local_inventory
model.setLifetimeFrequencyCap(/* value */);  // Set lifetime_frequency_cap
model.setLocalInventoryRadiusInMiles(/* value */);  // Set local_inventory_radius_in_miles
model.setName(/* value */);  // Set name
model.setOptimizationGoalMetadata(/* value */);  // Set optimization_goal_metadata
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type
model.setPerformancePlusCampaignSettings(/* value */);  // Set performance_plus_campaign_settings
model.setPlacementGroup(/* value */);  // Set placement_group
model.setPlacementTrafficType(/* value */);  // Set placement_traffic_type
model.setPromotionApplicationLevel(/* value */);  // Set promotion_application_level
model.setPromotionId(/* value */);  // Set promotion_id
model.setPromotionIds(/* value */);  // Set promotion_ids
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTargetingSpec(/* value */);  // Set targeting_spec
model.setTargetingTemplateIds(/* value */);  // Set targeting_template_ids
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::AdGroupCreateCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupCreateCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupCreateRequest

```cpp
// Create a model
auto model = models::AdGroupCreateRequest();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setBudgetType(/* value */);  // Set budget_type
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type
model.setBidInMicroCurrency(/* value */);  // Set bid_in_micro_currency
model.setBidStrategyType(/* value */);  // Set bid_strategy_type
model.setBillableEvent(/* value */);  // Set billable_event
model.setBudgetInMicroCurrency(/* value */);  // Set budget_in_micro_currency
model.setCampaignId(/* value */);  // Set campaign_id
model.setEndTime(/* value */);  // Set end_time
model.setIsCreativeOptimization(/* value */);  // Set is_creative_optimization
model.setLifetimeFrequencyCap(/* value */);  // Set lifetime_frequency_cap
model.setName(/* value */);  // Set name
model.setOptimizationGoalMetadata(/* value */);  // Set optimization_goal_metadata
model.setPlacementGroup(/* value */);  // Set placement_group
model.setPromotionApplicationLevel(/* value */);  // Set promotion_application_level
model.setPromotionId(/* value */);  // Set promotion_id
model.setPromotionIds(/* value */);  // Set promotion_ids
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTargetingSpec(/* value */);  // Set targeting_spec
model.setTargetingTemplateIds(/* value */);  // Set targeting_template_ids
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::AdGroupCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupCreateRequestAllOf1

```cpp
// Create a model
auto model = models::AdGroupCreateRequestAllOf1();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setBudgetType(/* value */);  // Set budget_type
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type

// Serialize to JSON
nlohmann::json json = models::AdGroupCreateRequestAllOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupCreateRequestAllOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupDeliveryEstimates

```cpp
// Create a model
auto model = models::AdGroupDeliveryEstimates();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setCreativeTypes(/* value */);  // Set creative_types
model.setKeywords(/* value */);  // Set keywords
model.setMonthlyFrequencyCap(/* value */);  // Set monthly_frequency_cap
model.setOptimizationGoalMetadata(/* value */);  // Set optimization_goal_metadata
model.setOptimizationType(/* value */);  // Set optimization_type
model.setPlacementGroup(/* value */);  // Set placement_group
model.setProductGroupIds(/* value */);  // Set product_group_ids
model.setTargetingSpec(/* value */);  // Set targeting_spec

// Serialize to JSON
nlohmann::json json = models::AdGroupDeliveryEstimates::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupDeliveryEstimates::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupDeliveryEstimatesKeywordsItems

```cpp
// Create a model
auto model = models::AdGroupDeliveryEstimatesKeywordsItems();
model.setMatchType(/* value */);  // Set match_type
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::AdGroupDeliveryEstimatesKeywordsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupDeliveryEstimatesKeywordsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupSummaryStatus

```cpp
// Create a model
auto model = models::AdGroupSummaryStatus();

// Serialize to JSON
nlohmann::json json = models::AdGroupSummaryStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupSummaryStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupTrackingURLs

```cpp
// Create a model
auto model = models::AdGroupTrackingURLs();
model.setAudienceVerification(/* value */);  // Set audience_verification
model.setBuyableButton(/* value */);  // Set buyable_button
model.setClick(/* value */);  // Set click
model.setEngagement(/* value */);  // Set engagement
model.setImpression(/* value */);  // Set impression

// Serialize to JSON
nlohmann::json json = models::AdGroupTrackingURLs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupTrackingURLs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupUpdate

```cpp
// Create a model
auto model = models::AdGroupUpdate();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setBudgetType(/* value */);  // Set budget_type
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type

// Serialize to JSON
nlohmann::json json = models::AdGroupUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupUpdateBatchUpdate

```cpp
// Create a model
auto model = models::AdGroupUpdateBatchUpdate();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidInMicroCurrency(/* value */);  // Set bid_in_micro_currency
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setBidStrategyType(/* value */);  // Set bid_strategy_type
model.setBillableEvent(/* value */);  // Set billable_event
model.setBudgetInMicroCurrency(/* value */);  // Set budget_in_micro_currency
model.setBudgetType(/* value */);  // Set budget_type
model.setCampaignId(/* value */);  // Set campaign_id
model.setCustomerSegmentId(/* value */);  // Set customer_segment_id
model.setEndTime(/* value */);  // Set end_time
model.setExtFeatures(/* value */);  // Set ext_features
model.setFeedProfileId(/* value */);  // Set feed_profile_id
model.setId(/* value */);  // Set id
model.setIsCreativeOptimization(/* value */);  // Set is_creative_optimization
model.setIsLocalInventory(/* value */);  // Set is_local_inventory
model.setLifetimeFrequencyCap(/* value */);  // Set lifetime_frequency_cap
model.setLocalInventoryRadiusInMiles(/* value */);  // Set local_inventory_radius_in_miles
model.setName(/* value */);  // Set name
model.setOptimizationGoalMetadata(/* value */);  // Set optimization_goal_metadata
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type
model.setPerformancePlusCampaignSettings(/* value */);  // Set performance_plus_campaign_settings
model.setPlacementGroup(/* value */);  // Set placement_group
model.setPlacementTrafficType(/* value */);  // Set placement_traffic_type
model.setPromotionApplicationLevel(/* value */);  // Set promotion_application_level
model.setPromotionId(/* value */);  // Set promotion_id
model.setPromotionIds(/* value */);  // Set promotion_ids
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTargetingSpec(/* value */);  // Set targeting_spec
model.setTargetingSpecOperations(/* value */);  // Set targeting_spec_operations
model.setTargetingTemplateIds(/* value */);  // Set targeting_template_ids
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::AdGroupUpdateBatchUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupUpdateBatchUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupUpdateRequest

```cpp
// Create a model
auto model = models::AdGroupUpdateRequest();
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setId(/* value */);  // Set id
model.setTargetingSpecOperations(/* value */);  // Set targeting_spec_operations
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setBidInMicroCurrency(/* value */);  // Set bid_in_micro_currency
model.setBidStrategyType(/* value */);  // Set bid_strategy_type
model.setBillableEvent(/* value */);  // Set billable_event
model.setBudgetInMicroCurrency(/* value */);  // Set budget_in_micro_currency
model.setBudgetType(/* value */);  // Set budget_type
model.setCampaignId(/* value */);  // Set campaign_id
model.setEndTime(/* value */);  // Set end_time
model.setIsCreativeOptimization(/* value */);  // Set is_creative_optimization
model.setLifetimeFrequencyCap(/* value */);  // Set lifetime_frequency_cap
model.setName(/* value */);  // Set name
model.setOptimizationGoalMetadata(/* value */);  // Set optimization_goal_metadata
model.setPacingDeliveryType(/* value */);  // Set pacing_delivery_type
model.setPlacementGroup(/* value */);  // Set placement_group
model.setPromotionApplicationLevel(/* value */);  // Set promotion_application_level
model.setPromotionId(/* value */);  // Set promotion_id
model.setPromotionIds(/* value */);  // Set promotion_ids
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTargetingSpec(/* value */);  // Set targeting_spec
model.setTargetingTemplateIds(/* value */);  // Set targeting_template_ids
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::AdGroupUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupUpdateRequestAllOf1

```cpp
// Create a model
auto model = models::AdGroupUpdateRequestAllOf1();
model.setBidMultiplier(/* value */);  // Set bid_multiplier
model.setId(/* value */);  // Set id
model.setTargetingSpecOperations(/* value */);  // Set targeting_spec_operations

// Serialize to JSON
nlohmann::json json = models::AdGroupUpdateRequestAllOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupUpdateRequestAllOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupsAnalyticsMetrics

```cpp
// Create a model
auto model = models::AdGroupsAnalyticsMetrics();
model.setADGROUPID(/* value */);  // Set AD_GROUP_ID
model.setDATE(/* value */);  // Set DATE

// Serialize to JSON
nlohmann::json json = models::AdGroupsAnalyticsMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupsAnalyticsMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupsCreate200Response

```cpp
// Create a model
auto model = models::AdGroupsCreate200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdGroupsCreate200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupsCreate200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupsCreate200ResponseItemsInner

```cpp
// Create a model
auto model = models::AdGroupsCreate200ResponseItemsInner();
model.setData(/* value */);  // Set data
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::AdGroupsCreate200ResponseItemsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupsCreate200ResponseItemsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupsList200Response

```cpp
// Create a model
auto model = models::AdGroupsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdGroupsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupsUpdate200Response

```cpp
// Create a model
auto model = models::AdGroupsUpdate200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdGroupsUpdate200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupsUpdate200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdGroupsUpdate200ResponseItemsInner

```cpp
// Create a model
auto model = models::AdGroupsUpdate200ResponseItemsInner();
model.setData(/* value */);  // Set data
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::AdGroupsUpdate200ResponseItemsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdGroupsUpdate200ResponseItemsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdPinAnalytics

```cpp
// Create a model
auto model = models::AdPinAnalytics();
model.setDATE(/* value */);  // Set DATE
model.setPINID(/* value */);  // Set PIN_ID

// Serialize to JSON
nlohmann::json json = models::AdPinAnalytics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdPinAnalytics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdPinPreviewCreativeType

```cpp
// Create a model
auto model = models::AdPinPreviewCreativeType();

// Serialize to JSON
nlohmann::json json = models::AdPinPreviewCreativeType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdPinPreviewCreativeType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdPreviewRequest

```cpp
// Create a model
auto model = models::AdPreviewRequest();
model.setImageUrl(/* value */);  // Set image_url
model.setPromotionId(/* value */);  // Set promotion_id
model.setTitle(/* value */);  // Set title
model.setCreativeType(/* value */);  // Set creative_type
model.setPinId(/* value */);  // Set pin_id
model.setCatalogProductGroupId(/* value */);  // Set catalog_product_group_id
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setHeroImageTitle(/* value */);  // Set hero_image_title
model.setHeroImageUrl(/* value */);  // Set hero_image_url
model.setHeroPinId(/* value */);  // Set hero_pin_id
model.setImageTag(/* value */);  // Set image_tag
model.setItemId(/* value */);  // Set item_id
model.setPreferredMediaType(/* value */);  // Set preferred_media_type
model.setShowPromotion(/* value */);  // Set show_promotion
model.setVideoTag(/* value */);  // Set video_tag

// Serialize to JSON
nlohmann::json json = models::AdPreviewRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdPreviewRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdPreviewShopping

```cpp
// Create a model
auto model = models::AdPreviewShopping();
model.setCatalogProductGroupId(/* value */);  // Set catalog_product_group_id
model.setCreativeType(/* value */);  // Set creative_type
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setHeroImageTitle(/* value */);  // Set hero_image_title
model.setHeroImageUrl(/* value */);  // Set hero_image_url
model.setHeroPinId(/* value */);  // Set hero_pin_id
model.setImageTag(/* value */);  // Set image_tag
model.setItemId(/* value */);  // Set item_id
model.setPreferredMediaType(/* value */);  // Set preferred_media_type
model.setShowPromotion(/* value */);  // Set show_promotion
model.setVideoTag(/* value */);  // Set video_tag

// Serialize to JSON
nlohmann::json json = models::AdPreviewShopping::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdPreviewShopping::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdPreviewCreateFromImage

```cpp
// Create a model
auto model = models::AdPreviewCreateFromImage();
model.setImageUrl(/* value */);  // Set image_url
model.setPromotionId(/* value */);  // Set promotion_id
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::AdPreviewCreateFromImage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdPreviewCreateFromImage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdPreviewCreateFromPin

```cpp
// Create a model
auto model = models::AdPreviewCreateFromPin();
model.setCreativeType(/* value */);  // Set creative_type
model.setPinId(/* value */);  // Set pin_id

// Serialize to JSON
nlohmann::json json = models::AdPreviewCreateFromPin::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdPreviewCreateFromPin::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdPreviewURLResponse

```cpp
// Create a model
auto model = models::AdPreviewURLResponse();
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::AdPreviewURLResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdPreviewURLResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdReviewStatus

```cpp
// Create a model
auto model = models::AdReviewStatus();

// Serialize to JSON
nlohmann::json json = models::AdReviewStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdReviewStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdShoppingPreviewCreativeType

```cpp
// Create a model
auto model = models::AdShoppingPreviewCreativeType();

// Serialize to JSON
nlohmann::json json = models::AdShoppingPreviewCreativeType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdShoppingPreviewCreativeType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdUpdateRequest

```cpp
// Create a model
auto model = models::AdUpdateRequest();
model.setId(/* value */);  // Set id
model.setPinId(/* value */);  // Set pin_id
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setCarouselAndroidDeepLinks(/* value */);  // Set carousel_android_deep_links
model.setCarouselDestinationUrls(/* value */);  // Set carousel_destination_urls
model.setCarouselIosDeepLinks(/* value */);  // Set carousel_ios_deep_links
model.setClickTrackingUrl(/* value */);  // Set click_tracking_url
model.setCreativeType(/* value */);  // Set creative_type
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setDestinationUrl(/* value */);  // Set destination_url
model.setDisclosureType(/* value */);  // Set disclosure_type
model.setDisclosureUrl(/* value */);  // Set disclosure_url
model.setGridClickType(/* value */);  // Set grid_click_type
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setIsCarting(/* value */);  // Set is_carting
model.setIsPinDeleted(/* value */);  // Set is_pin_deleted
model.setIsRemovable(/* value */);  // Set is_removable
model.setLeadFormId(/* value */);  // Set lead_form_id
model.setName(/* value */);  // Set name
model.setQuizPinData(/* value */);  // Set quiz_pin_data
model.setStatus(/* value */);  // Set status
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setViewTrackingUrl(/* value */);  // Set view_tracking_url

// Serialize to JSON
nlohmann::json json = models::AdUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdUpdateRequest

```cpp
// Create a model
auto model = models::AdUpdateRequest();
model.setId(/* value */);  // Set id
model.setPinId(/* value */);  // Set pin_id

// Serialize to JSON
nlohmann::json json = models::AdUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdeColumnType

```cpp
// Create a model
auto model = models::AdeColumnType();

// Serialize to JSON
nlohmann::json json = models::AdeColumnType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdeColumnType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdgroupPlacementGroupType

```cpp
// Create a model
auto model = models::AdgroupPlacementGroupType();

// Serialize to JSON
nlohmann::json json = models::AdgroupPlacementGroupType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdgroupPlacementGroupType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdgroupTrackingFeatureType

```cpp
// Create a model
auto model = models::AdgroupTrackingFeatureType();

// Serialize to JSON
nlohmann::json json = models::AdgroupTrackingFeatureType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdgroupTrackingFeatureType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdgroupTrackingFeatures

```cpp
// Create a model
auto model = models::AdgroupTrackingFeatures();
model.setEnabled(/* value */);  // Set enabled

// Serialize to JSON
nlohmann::json json = models::AdgroupTrackingFeatures::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdgroupTrackingFeatures::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalytics

```cpp
// Create a model
auto model = models::AdsAnalytics();
model.setADID(/* value */);  // Set AD_ID
model.setDATE(/* value */);  // Set DATE

// Serialize to JSON
nlohmann::json json = models::AdsAnalytics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalytics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsAccountTargetingType

```cpp
// Create a model
auto model = models::AdsAnalyticsAccountTargetingType();

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsAccountTargetingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsAccountTargetingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsAdGroupTargetingType

```cpp
// Create a model
auto model = models::AdsAnalyticsAdGroupTargetingType();

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsAdGroupTargetingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsAdGroupTargetingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsAdTargetingType

```cpp
// Create a model
auto model = models::AdsAnalyticsAdTargetingType();

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsAdTargetingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsAdTargetingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsCampaignTargetingType

```cpp
// Create a model
auto model = models::AdsAnalyticsCampaignTargetingType();

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsCampaignTargetingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsCampaignTargetingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsCreateAsyncRequest

```cpp
// Create a model
auto model = models::AdsAnalyticsCreateAsyncRequest();
model.setAdGroupIds(/* value */);  // Set ad_group_ids
model.setAdGroupStatuses(/* value */);  // Set ad_group_statuses
model.setAdIds(/* value */);  // Set ad_ids
model.setAdStatuses(/* value */);  // Set ad_statuses
model.setAttributionTypes(/* value */);  // Set attribution_types
model.setCampaignBrandLabel(/* value */);  // Set campaign_brand_label
model.setCampaignCustomLabel(/* value */);  // Set campaign_custom_label
model.setCampaignIds(/* value */);  // Set campaign_ids
model.setCampaignObjectiveTypes(/* value */);  // Set campaign_objective_types
model.setCampaignStatuses(/* value */);  // Set campaign_statuses
model.setClickWindowDays(/* value */);  // Set click_window_days
model.setColumns(/* value */);  // Set columns
model.setCombineTargetingTypes(/* value */);  // Set combine_targeting_types
model.setConversionReportTime(/* value */);  // Set conversion_report_time
model.setCustomConversionEventMetrics(/* value */);  // Set custom_conversion_event_metrics
model.setEndDate(/* value */);  // Set end_date
model.setEndHour(/* value */);  // Set end_hour
model.setEngagementWindowDays(/* value */);  // Set engagement_window_days
model.setGranularity(/* value */);  // Set granularity
model.setLevel(/* value */);  // Set level
model.setMetricsFilters(/* value */);  // Set metrics_filters
model.setPrimarySort(/* value */);  // Set primary_sort
model.setProductGroupIds(/* value */);  // Set product_group_ids
model.setProductGroupStatuses(/* value */);  // Set product_group_statuses
model.setProductItemIds(/* value */);  // Set product_item_ids
model.setReportFormat(/* value */);  // Set report_format
model.setReportingTimezone(/* value */);  // Set reporting_timezone
model.setStartDate(/* value */);  // Set start_date
model.setStartHour(/* value */);  // Set start_hour
model.setTargetingTypes(/* value */);  // Set targeting_types
model.setViewWindowDays(/* value */);  // Set view_window_days

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsCreateAsyncRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsCreateAsyncRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsCreateAsyncResponse

```cpp
// Create a model
auto model = models::AdsAnalyticsCreateAsyncResponse();
model.setMessage(/* value */);  // Set message
model.setReportStatus(/* value */);  // Set report_status
model.setToken(/* value */);  // Set token

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsCreateAsyncResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsCreateAsyncResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsFilterColumn

```cpp
// Create a model
auto model = models::AdsAnalyticsFilterColumn();

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsFilterColumn::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsFilterColumn::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsFilterOperator

```cpp
// Create a model
auto model = models::AdsAnalyticsFilterOperator();

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsFilterOperator::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsFilterOperator::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsGetAsyncResponse

```cpp
// Create a model
auto model = models::AdsAnalyticsGetAsyncResponse();
model.setReportStatus(/* value */);  // Set report_status
model.setSize(/* value */);  // Set size
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsGetAsyncResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsGetAsyncResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsAnalyticsMetricsFilter

```cpp
// Create a model
auto model = models::AdsAnalyticsMetricsFilter();
model.setField(/* value */);  // Set field
model.setROperator(/* value */);  // Set operator
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::AdsAnalyticsMetricsFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsAnalyticsMetricsFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsCreditDiscountType

```cpp
// Create a model
auto model = models::AdsCreditDiscountType();

// Serialize to JSON
nlohmann::json json = models::AdsCreditDiscountType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsCreditDiscountType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsCreditDiscountsResponse

```cpp
// Create a model
auto model = models::AdsCreditDiscountsResponse();
model.setActive(/* value */);  // Set active
model.setAdvertiserId(/* value */);  // Set advertiser_id
model.setDiscountCurrency(/* value */);  // Set discountCurrency
model.setDiscountInMicroCurrency(/* value */);  // Set discountInMicroCurrency
model.setDiscountType(/* value */);  // Set discountType
model.setRemainingDiscountInMicroCurrency(/* value */);  // Set remainingDiscountInMicroCurrency
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::AdsCreditDiscountsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsCreditDiscountsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsCreditRedeem

```cpp
// Create a model
auto model = models::AdsCreditRedeem();
model.setErrorCode(/* value */);  // Set errorCode
model.setErrorMessage(/* value */);  // Set errorMessage
model.setSuccess(/* value */);  // Set success

// Serialize to JSON
nlohmann::json json = models::AdsCreditRedeem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsCreditRedeem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsCreditRedeemCreate

```cpp
// Create a model
auto model = models::AdsCreditRedeemCreate();
model.setOfferCodeHash(/* value */);  // Set offerCodeHash
model.setValidateOnly(/* value */);  // Set validateOnly

// Serialize to JSON
nlohmann::json json = models::AdsCreditRedeemCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsCreditRedeemCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsCreditsDiscountsGet200Response

```cpp
// Create a model
auto model = models::AdsCreditsDiscountsGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdsCreditsDiscountsGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsCreditsDiscountsGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdsList200Response

```cpp
// Create a model
auto model = models::AdsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionBidOptions

```cpp
// Create a model
auto model = models::AdvancedAuctionBidOptions();
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setBidInMicroCurrency(/* value */);  // Set bid_in_micro_currency
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionBidOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionBidOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionItem

```cpp
// Create a model
auto model = models::AdvancedAuctionItem();
model.setBidOptions(/* value */);  // Set bid_options
model.setCountry(/* value */);  // Set country
model.setItemId(/* value */);  // Set item_id
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionItems

```cpp
// Create a model
auto model = models::AdvancedAuctionItems();
model.setCatalogId(/* value */);  // Set catalog_id
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionItemsGetRequest

```cpp
// Create a model
auto model = models::AdvancedAuctionItemsGetRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionItemsGetRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionItemsGetRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionItemsSubmitDeleteRecord

```cpp
// Create a model
auto model = models::AdvancedAuctionItemsSubmitDeleteRecord();
model.setCountry(/* value */);  // Set country
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionItemsSubmitDeleteRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionItemsSubmitDeleteRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionItemsSubmitRecord

```cpp
// Create a model
auto model = models::AdvancedAuctionItemsSubmitRecord();
model.setBidOptions(/* value */);  // Set bid_options
model.setCountry(/* value */);  // Set country
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation
model.setUpdateMask(/* value */);  // Set update_mask

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionItemsSubmitRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionItemsSubmitRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionItemsSubmitRequest

```cpp
// Create a model
auto model = models::AdvancedAuctionItemsSubmitRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionItemsSubmitRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionItemsSubmitRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionItemsSubmitUpsertRecord

```cpp
// Create a model
auto model = models::AdvancedAuctionItemsSubmitUpsertRecord();
model.setBidOptions(/* value */);  // Set bid_options
model.setCountry(/* value */);  // Set country
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation
model.setUpdateMask(/* value */);  // Set update_mask

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionItemsSubmitUpsertRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionItemsSubmitUpsertRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionKey

```cpp
// Create a model
auto model = models::AdvancedAuctionKey();
model.setCountry(/* value */);  // Set country
model.setItemId(/* value */);  // Set item_id
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionKey::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionKey::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionOperationError

```cpp
// Create a model
auto model = models::AdvancedAuctionOperationError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionOperationError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionOperationError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvancedAuctionProcessedItems

```cpp
// Create a model
auto model = models::AdvancedAuctionProcessedItems();
model.setCatalogId(/* value */);  // Set catalog_id
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvancedAuctionProcessedItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvancedAuctionProcessedItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEvent

```cpp
// Create a model
auto model = models::AdvertiserDefinedEvent();
model.setMappedConversionType(/* value */);  // Set mapped_conversion_type
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventInput

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventInput();
model.setMappedConversionType(/* value */);  // Set mapped_conversion_type
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventMappingType

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventMappingType();

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventMappingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventMappingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventProcessingRecord

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventProcessingRecord();
model.setExceptions(/* value */);  // Set exceptions
model.setName(/* value */);  // Set name
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventProcessingRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventProcessingRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventsCreate200Response

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventsCreate200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventsCreate200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventsCreate200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventsCreateRequest

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventsCreateRequest();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventsCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventsCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventsDelete200Response

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventsDelete200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventsDelete200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventsDelete200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventsGet200Response

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventsGet200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventsGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventsGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdvertiserDefinedEventsUpdate200Response

```cpp
// Create a model
auto model = models::AdvertiserDefinedEventsUpdate200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AdvertiserDefinedEventsUpdate200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdvertiserDefinedEventsUpdate200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AgeBucketMultipliers

```cpp
// Create a model
auto model = models::AgeBucketMultipliers();
model.setAGEBUCKET(/* value */);  // Set AGE_BUCKET

// Serialize to JSON
nlohmann::json json = models::AgeBucketMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AgeBucketMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AgeTrendsBucket

```cpp
// Create a model
auto model = models::AgeTrendsBucket();

// Serialize to JSON
nlohmann::json json = models::AgeTrendsBucket::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AgeTrendsBucket::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AggregatedPinComment

```cpp
// Create a model
auto model = models::AggregatedPinComment();
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setAltText(/* value */);  // Set alt_text
model.setBoardId(/* value */);  // Set board_id
model.setBoardOwner(/* value */);  // Set board_owner
model.setBoardSectionId(/* value */);  // Set board_section_id
model.setCreatedAt(/* value */);  // Set created_at
model.setCreativeType(/* value */);  // Set creative_type
model.setDescription(/* value */);  // Set description
model.setDominantColor(/* value */);  // Set dominant_color
model.setHasBeenPromoted(/* value */);  // Set has_been_promoted
model.setId(/* value */);  // Set id
model.setIsOwner(/* value */);  // Set is_owner
model.setIsProduct(/* value */);  // Set is_product
model.setIsStandard(/* value */);  // Set is_standard
model.setLink(/* value */);  // Set link
model.setMedia(/* value */);  // Set media
model.setParentPinId(/* value */);  // Set parent_pin_id
model.setPinMetrics(/* value */);  // Set pin_metrics
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::AggregatedPinComment::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AggregatedPinComment::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AiDisclosureItem

```cpp
// Create a model
auto model = models::AiDisclosureItem();

// Serialize to JSON
nlohmann::json json = models::AiDisclosureItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AiDisclosureItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AiDisclosures

```cpp
// Create a model
auto model = models::AiDisclosures();
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::AiDisclosures::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AiDisclosures::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AiDisclosuresUpdate

```cpp
// Create a model
auto model = models::AiDisclosuresUpdate();
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::AiDisclosuresUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AiDisclosuresUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AmazonConnectRequest

```cpp
// Create a model
auto model = models::AmazonConnectRequest();
model.setAmazonStorefrontId(/* value */);  // Set amazon_storefront_id
model.setAmazonStorefrontName(/* value */);  // Set amazon_storefront_name
model.setAmazonStorefrontUrl(/* value */);  // Set amazon_storefront_url
model.setAmazonUserId(/* value */);  // Set amazon_user_id
model.setIsAmazonAccountLinked(/* value */);  // Set is_amazon_account_linked
model.setOneTimePasscode(/* value */);  // Set one_time_passcode
model.setPinterestUserId(/* value */);  // Set pinterest_user_id

// Serialize to JSON
nlohmann::json json = models::AmazonConnectRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AmazonConnectRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AmazonConnectResponse

```cpp
// Create a model
auto model = models::AmazonConnectResponse();
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::AmazonConnectResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AmazonConnectResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AnalyticsDailyMetrics

```cpp
// Create a model
auto model = models::AnalyticsDailyMetrics();
model.setDataStatus(/* value */);  // Set data_status
model.setDate(/* value */);  // Set date
model.setMetrics(/* value */);  // Set metrics

// Serialize to JSON
nlohmann::json json = models::AnalyticsDailyMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AnalyticsDailyMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AnalyticsMetricsResponse

```cpp
// Create a model
auto model = models::AnalyticsMetricsResponse();
model.setDailyMetrics(/* value */);  // Set daily_metrics
model.setSummaryMetrics(/* value */);  // Set summary_metrics

// Serialize to JSON
nlohmann::json json = models::AnalyticsMetricsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AnalyticsMetricsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AppTypeMultipliers

```cpp
// Create a model
auto model = models::AppTypeMultipliers();
model.setAPPTYPE(/* value */);  // Set APP_TYPE

// Serialize to JSON
nlohmann::json json = models::AppTypeMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AppTypeMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AppsflyerAudience

```cpp
// Create a model
auto model = models::AppsflyerAudience();
model.setContainerId(/* value */);  // Set container_id
model.setName(/* value */);  // Set name
model.setPlatform(/* value */);  // Set platform

// Serialize to JSON
nlohmann::json json = models::AppsflyerAudience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AppsflyerAudience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AppsflyerAudienceCreate

```cpp
// Create a model
auto model = models::AppsflyerAudienceCreate();
model.setName(/* value */);  // Set name
model.setPlatform(/* value */);  // Set platform

// Serialize to JSON
nlohmann::json json = models::AppsflyerAudienceCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AppsflyerAudienceCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AppsflyerAudienceSyncCreate

```cpp
// Create a model
auto model = models::AppsflyerAudienceSyncCreate();
model.setContainerId(/* value */);  // Set container_id
model.setUrlAdidSha256(/* value */);  // Set url_adid_sha256
model.setUrlEmailSha256(/* value */);  // Set url_email_sha256

// Serialize to JSON
nlohmann::json json = models::AppsflyerAudienceSyncCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AppsflyerAudienceSyncCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AppsflyerPlatform

```cpp
// Create a model
auto model = models::AppsflyerPlatform();

// Serialize to JSON
nlohmann::json json = models::AppsflyerPlatform::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AppsflyerPlatform::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetAccessRequestError

```cpp
// Create a model
auto model = models::AssetAccessRequestError();
model.setCode(/* value */);  // Set code
model.setMessages(/* value */);  // Set messages

// Serialize to JSON
nlohmann::json json = models::AssetAccessRequestError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetAccessRequestError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupBinding

```cpp
// Create a model
auto model = models::AssetGroupBinding();
model.setAdAccountsIds(/* value */);  // Set ad_accounts_ids
model.setAssetGroupDescription(/* value */);  // Set asset_group_description
model.setAssetGroupName(/* value */);  // Set asset_group_name
model.setAssetGroupTypes(/* value */);  // Set asset_group_types
model.setCatalogsIds(/* value */);  // Set catalogs_ids
model.setCreatedBy(/* value */);  // Set created_by
model.setCreatedTime(/* value */);  // Set created_time
model.setId(/* value */);  // Set id
model.setOwner(/* value */);  // Set owner
model.setProfilesIds(/* value */);  // Set profiles_ids
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::AssetGroupBinding::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupBinding::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupDeleteError

```cpp
// Create a model
auto model = models::AssetGroupDeleteError();
model.setAssetGroupId(/* value */);  // Set asset_group_id
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::AssetGroupDeleteError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupDeleteError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupDeletion

```cpp
// Create a model
auto model = models::AssetGroupDeletion();
model.setDeletedAssetGroups(/* value */);  // Set deleted_asset_groups
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::AssetGroupDeletion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupDeletion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupDeletionDelete

```cpp
// Create a model
auto model = models::AssetGroupDeletionDelete();
model.setAssetGroupsToDelete(/* value */);  // Set asset_groups_to_delete

// Serialize to JSON
nlohmann::json json = models::AssetGroupDeletionDelete::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupDeletionDelete::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupInput

```cpp
// Create a model
auto model = models::AssetGroupInput();
model.setAssetGroup(/* value */);  // Set asset_group

// Serialize to JSON
nlohmann::json json = models::AssetGroupInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupInputCreate

```cpp
// Create a model
auto model = models::AssetGroupInputCreate();
model.setAssetGroup(/* value */);  // Set asset_group
model.setAssetGroupDescription(/* value */);  // Set asset_group_description
model.setAssetGroupName(/* value */);  // Set asset_group_name
model.setAssetGroupTypes(/* value */);  // Set asset_group_types

// Serialize to JSON
nlohmann::json json = models::AssetGroupInputCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupInputCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupModification

```cpp
// Create a model
auto model = models::AssetGroupModification();
model.setExceptions(/* value */);  // Set exceptions
model.setUpdatedAssetGroups(/* value */);  // Set updated_asset_groups

// Serialize to JSON
nlohmann::json json = models::AssetGroupModification::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupModification::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupModificationReadOrUpdate

```cpp
// Create a model
auto model = models::AssetGroupModificationReadOrUpdate();
model.setAssetGroupsToUpdate(/* value */);  // Set asset_groups_to_update
model.setExceptions(/* value */);  // Set exceptions
model.setUpdatedAssetGroups(/* value */);  // Set updated_asset_groups

// Serialize to JSON
nlohmann::json json = models::AssetGroupModificationReadOrUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupModificationReadOrUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupType

```cpp
// Create a model
auto model = models::AssetGroupType();

// Serialize to JSON
nlohmann::json json = models::AssetGroupType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupUpdateError

```cpp
// Create a model
auto model = models::AssetGroupUpdateError();
model.setAssetGroupId(/* value */);  // Set asset_group_id
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::AssetGroupUpdateError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupUpdateError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetGroupUpdateItemReadOrUpdateItem

```cpp
// Create a model
auto model = models::AssetGroupUpdateItemReadOrUpdateItem();
model.setAssetGroupId(/* value */);  // Set asset_group_id
model.setAssetGroupTypes(/* value */);  // Set asset_group_types
model.setAssetsToAdd(/* value */);  // Set assets_to_add
model.setAssetsToRemove(/* value */);  // Set assets_to_remove
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::AssetGroupUpdateItemReadOrUpdateItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetGroupUpdateItemReadOrUpdateItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetIdPermissions

```cpp
// Create a model
auto model = models::AssetIdPermissions();
model.setAssetGroupInfo(/* value */);  // Set asset_group_info
model.setAssetId(/* value */);  // Set asset_id
model.setAssetType(/* value */);  // Set asset_type
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::AssetIdPermissions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetIdPermissions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetIdWithPermissions

```cpp
// Create a model
auto model = models::AssetIdWithPermissions();
model.setId(/* value */);  // Set id
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::AssetIdWithPermissions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetIdWithPermissions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetPermissionType

```cpp
// Create a model
auto model = models::AssetPermissionType();

// Serialize to JSON
nlohmann::json json = models::AssetPermissionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetPermissionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetSearchBy

```cpp
// Create a model
auto model = models::AssetSearchBy();

// Serialize to JSON
nlohmann::json json = models::AssetSearchBy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetSearchBy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetSortBy

```cpp
// Create a model
auto model = models::AssetSortBy();

// Serialize to JSON
nlohmann::json json = models::AssetSortBy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetSortBy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssetTypeResponse

```cpp
// Create a model
auto model = models::AssetTypeResponse();

// Serialize to JSON
nlohmann::json json = models::AssetTypeResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssetTypeResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AttributionActionType

```cpp
// Create a model
auto model = models::AttributionActionType();

// Serialize to JSON
nlohmann::json json = models::AttributionActionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AttributionActionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AttributionMatchType

```cpp
// Create a model
auto model = models::AttributionMatchType();

// Serialize to JSON
nlohmann::json json = models::AttributionMatchType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AttributionMatchType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AttributionModel

```cpp
// Create a model
auto model = models::AttributionModel();

// Serialize to JSON
nlohmann::json json = models::AttributionModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AttributionModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AttributionScope

```cpp
// Create a model
auto model = models::AttributionScope();

// Serialize to JSON
nlohmann::json json = models::AttributionScope::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AttributionScope::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AttributionWindows

```cpp
// Create a model
auto model = models::AttributionWindows();
model.setClickWindowDays(/* value */);  // Set click_window_days
model.setEngagementWindowDays(/* value */);  // Set engagement_window_days
model.setViewWindowDays(/* value */);  // Set view_window_days

// Serialize to JSON
nlohmann::json json = models::AttributionWindows::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AttributionWindows::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Audience

```cpp
// Create a model
auto model = models::Audience();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAudienceType(/* value */);  // Set audience_type
model.setCreatedByCompanyName(/* value */);  // Set created_by_company_name
model.setCreatedTimestamp(/* value */);  // Set created_timestamp
model.setDescription(/* value */);  // Set description
model.setId(/* value */);  // Set id
model.setIsNca(/* value */);  // Set is_nca
model.setName(/* value */);  // Set name
model.setRule(/* value */);  // Set rule
model.setSize(/* value */);  // Set size
model.setStatus(/* value */);  // Set status
model.setType(/* value */);  // Set type
model.setUpdatedTimestamp(/* value */);  // Set updated_timestamp

// Serialize to JSON
nlohmann::json json = models::Audience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Audience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceAccountType

```cpp
// Create a model
auto model = models::AudienceAccountType();

// Serialize to JSON
nlohmann::json json = models::AudienceAccountType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceAccountType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceCategory

```cpp
// Create a model
auto model = models::AudienceCategory();
model.setId(/* value */);  // Set id
model.setIndex(/* value */);  // Set index
model.setKey(/* value */);  // Set key
model.setName(/* value */);  // Set name
model.setRatio(/* value */);  // Set ratio
model.setSubcategories(/* value */);  // Set subcategories

// Serialize to JSON
nlohmann::json json = models::AudienceCategory::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceCategory::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceDefinition

```cpp
// Create a model
auto model = models::AudienceDefinition();
model.setDate(/* value */);  // Set date
model.setScope(/* value */);  // Set scope
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::AudienceDefinition::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceDefinition::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceDemographicValue

```cpp
// Create a model
auto model = models::AudienceDemographicValue();
model.setKey(/* value */);  // Set key
model.setName(/* value */);  // Set name
model.setRatio(/* value */);  // Set ratio

// Serialize to JSON
nlohmann::json json = models::AudienceDemographicValue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceDemographicValue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceDemographics

```cpp
// Create a model
auto model = models::AudienceDemographics();
model.setAges(/* value */);  // Set ages
model.setCountries(/* value */);  // Set countries
model.setDevices(/* value */);  // Set devices
model.setGenders(/* value */);  // Set genders
model.setMetros(/* value */);  // Set metros

// Serialize to JSON
nlohmann::json json = models::AudienceDemographics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceDemographics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceInsightType

```cpp
// Create a model
auto model = models::AudienceInsightType();

// Serialize to JSON
nlohmann::json json = models::AudienceInsightType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceInsightType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceInsights

```cpp
// Create a model
auto model = models::AudienceInsights();
model.setCategories(/* value */);  // Set categories
model.setDate(/* value */);  // Set date
model.setDemographics(/* value */);  // Set demographics
model.setSize(/* value */);  // Set size
model.setSizeIsUpperBound(/* value */);  // Set size_is_upper_bound
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::AudienceInsights::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceInsights::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceInsightsScopeAndTypeGet200Response

```cpp
// Create a model
auto model = models::AudienceInsightsScopeAndTypeGet200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AudienceInsightsScopeAndTypeGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceInsightsScopeAndTypeGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceObjectiveType

```cpp
// Create a model
auto model = models::AudienceObjectiveType();

// Serialize to JSON
nlohmann::json json = models::AudienceObjectiveType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceObjectiveType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceOwnershipType

```cpp
// Create a model
auto model = models::AudienceOwnershipType();

// Serialize to JSON
nlohmann::json json = models::AudienceOwnershipType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceOwnershipType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Rule

```cpp
// Create a model
auto model = models::Rule();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAdId(/* value */);  // Set ad_id
model.setCampaignId(/* value */);  // Set campaign_id
model.setCountry(/* value */);  // Set country
model.setCustomerListId(/* value */);  // Set customer_list_id
model.setEngagementDomain(/* value */);  // Set engagement_domain
model.setEngagementType(/* value */);  // Set engagement_type
model.setEngagerType(/* value */);  // Set engager_type
model.setEvent(/* value */);  // Set event
model.setEventData(/* value */);  // Set event_data
model.setEventSource(/* value */);  // Set event_source
model.setIngestionSource(/* value */);  // Set ingestion_source
model.setObjectiveType(/* value */);  // Set objective_type
model.setPercentage(/* value */);  // Set percentage
model.setPinId(/* value */);  // Set pin_id
model.setPrefill(/* value */);  // Set prefill
model.setRetentionDays(/* value */);  // Set retention_days
model.setSeedId(/* value */);  // Set seed_id
model.setUrl(/* value */);  // Set url
model.setVisitorSourceId(/* value */);  // Set visitor_source_id

// Serialize to JSON
nlohmann::json json = models::Rule::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Rule::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceStatus

```cpp
// Create a model
auto model = models::AudienceStatus();

// Serialize to JSON
nlohmann::json json = models::AudienceStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceSubcategory

```cpp
// Create a model
auto model = models::AudienceSubcategory();
model.setId(/* value */);  // Set id
model.setIndex(/* value */);  // Set index
model.setKey(/* value */);  // Set key
model.setName(/* value */);  // Set name
model.setRatio(/* value */);  // Set ratio

// Serialize to JSON
nlohmann::json json = models::AudienceSubcategory::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceSubcategory::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceType

```cpp
// Create a model
auto model = models::AudienceType();

// Serialize to JSON
nlohmann::json json = models::AudienceType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudienceUpdateOperationType

```cpp
// Create a model
auto model = models::AudienceUpdateOperationType();

// Serialize to JSON
nlohmann::json json = models::AudienceUpdateOperationType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudienceUpdateOperationType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudiencesList200Response

```cpp
// Create a model
auto model = models::AudiencesList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::AudiencesList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudiencesList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuthRespondInviteAction

```cpp
// Create a model
auto model = models::AuthRespondInviteAction();
model.setAcceptInvite(/* value */);  // Set accept_invite
model.setAssetIdToPermissions(/* value */);  // Set asset_id_to_permissions

// Serialize to JSON
nlohmann::json json = models::AuthRespondInviteAction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuthRespondInviteAction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuthRespondInvitesBody

```cpp
// Create a model
auto model = models::AuthRespondInvitesBody();
model.setInvites(/* value */);  // Set invites

// Serialize to JSON
nlohmann::json json = models::AuthRespondInvitesBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuthRespondInvitesBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuthRespondInvitesBodyItem

```cpp
// Create a model
auto model = models::AuthRespondInvitesBodyItem();
model.setAction(/* value */);  // Set action
model.setInviteId(/* value */);  // Set invite_id

// Serialize to JSON
nlohmann::json json = models::AuthRespondInvitesBodyItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuthRespondInvitesBodyItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Availability

```cpp
// Create a model
auto model = models::Availability();
model.setAVAILABILITY(/* value */);  // Set AVAILABILITY

// Serialize to JSON
nlohmann::json json = models::Availability::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Availability::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BaseBusinessAssets

```cpp
// Create a model
auto model = models::BaseBusinessAssets();
model.setAssetGroupInfo(/* value */);  // Set asset_group_info
model.setAssetId(/* value */);  // Set asset_id
model.setAssetType(/* value */);  // Set asset_type
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::BaseBusinessAssets::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BaseBusinessAssets::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BaseInviteDataResponse

```cpp
// Create a model
auto model = models::BaseInviteDataResponse();
model.setId(/* value */);  // Set id
model.setInviteData(/* value */);  // Set invite_data
model.setIsReceivedInvite(/* value */);  // Set is_received_invite
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::BaseInviteDataResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BaseInviteDataResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BasePreferredMediaType

```cpp
// Create a model
auto model = models::BasePreferredMediaType();

// Serialize to JSON
nlohmann::json json = models::BasePreferredMediaType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BasePreferredMediaType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchOperationStatus

```cpp
// Create a model
auto model = models::BatchOperationStatus();

// Serialize to JSON
nlohmann::json json = models::BatchOperationStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchOperationStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidFloor

```cpp
// Create a model
auto model = models::BidFloor();
model.setBidFloors(/* value */);  // Set bid_floors
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::BidFloor::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidFloor::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidFloorCreate

```cpp
// Create a model
auto model = models::BidFloorCreate();
model.setBidFloorSpecs(/* value */);  // Set bid_floor_specs
model.setTargetingSpec(/* value */);  // Set targeting_spec

// Serialize to JSON
nlohmann::json json = models::BidFloorCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidFloorCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidFloorObjectiveType

```cpp
// Create a model
auto model = models::BidFloorObjectiveType();

// Serialize to JSON
nlohmann::json json = models::BidFloorObjectiveType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidFloorObjectiveType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidFloorSpec

```cpp
// Create a model
auto model = models::BidFloorSpec();
model.setBillableEvent(/* value */);  // Set billable_event
model.setCountries(/* value */);  // Set countries
model.setCreativeType(/* value */);  // Set creative_type
model.setCurrency(/* value */);  // Set currency
model.setObjectiveType(/* value */);  // Set objective_type
model.setOptimizationGoalMetadata(/* value */);  // Set optimization_goal_metadata

// Serialize to JSON
nlohmann::json json = models::BidFloorSpec::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidFloorSpec::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidOptionsAgeBucketMultipliers

```cpp
// Create a model
auto model = models::BidOptionsAgeBucketMultipliers();
model.setR1824(/* value */);  // Set 18-24
model.setR2534(/* value */);  // Set 25-34
model.setR3544(/* value */);  // Set 35-44
model.setR4549(/* value */);  // Set 45-49
model.setR5054(/* value */);  // Set 50-54
model.setR5564(/* value */);  // Set 55-64
model.setR65(/* value */);  // Set 65+

// Serialize to JSON
nlohmann::json json = models::BidOptionsAgeBucketMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidOptionsAgeBucketMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidOptionsAppTypeMultipliers

```cpp
// Create a model
auto model = models::BidOptionsAppTypeMultipliers();
model.setAndroidMobile(/* value */);  // Set android_mobile
model.setAndroidTablet(/* value */);  // Set android_tablet
model.setIpad(/* value */);  // Set ipad
model.setIphone(/* value */);  // Set iphone
model.setWeb(/* value */);  // Set web
model.setWebMobile(/* value */);  // Set web_mobile

// Serialize to JSON
nlohmann::json json = models::BidOptionsAppTypeMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidOptionsAppTypeMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidOptionsAudienceMultipliers

```cpp
// Create a model
auto model = models::BidOptionsAudienceMultipliers();
model.setAudienceId(/* value */);  // Set audience_id
model.setMultiplier(/* value */);  // Set multiplier

// Serialize to JSON
nlohmann::json json = models::BidOptionsAudienceMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidOptionsAudienceMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidOptionsGenderMultipliers

```cpp
// Create a model
auto model = models::BidOptionsGenderMultipliers();
model.setFemale(/* value */);  // Set female
model.setMale(/* value */);  // Set male

// Serialize to JSON
nlohmann::json json = models::BidOptionsGenderMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidOptionsGenderMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidOptionsPlacementMultipliers

```cpp
// Create a model
auto model = models::BidOptionsPlacementMultipliers();
model.setBrowse(/* value */);  // Set browse
model.setRelatedPins(/* value */);  // Set related_pins
model.setSearch(/* value */);  // Set search

// Serialize to JSON
nlohmann::json json = models::BidOptionsPlacementMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidOptionsPlacementMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BidStrategyType

```cpp
// Create a model
auto model = models::BidStrategyType();

// Serialize to JSON
nlohmann::json json = models::BidStrategyType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BidStrategyType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingInvoice

```cpp
// Create a model
auto model = models::BillingInvoice();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAdAccountName(/* value */);  // Set ad_account_name
model.setAmountBilledMicroCurrency(/* value */);  // Set amount_billed_micro_currency
model.setAmountDiscountMicroCurrency(/* value */);  // Set amount_discount_micro_currency
model.setAmountNetMicroCurrency(/* value */);  // Set amount_net_micro_currency
model.setAmountTaxMicroCurrency(/* value */);  // Set amount_tax_micro_currency
model.setBillToCountry(/* value */);  // Set bill_to_country
model.setBillingPeriodEndDate(/* value */);  // Set billing_period_end_date
model.setBillingPeriodStartDate(/* value */);  // Set billing_period_start_date
model.setCurrency(/* value */);  // Set currency
model.setDocumentType(/* value */);  // Set document_type
model.setId(/* value */);  // Set id
model.setInvoiceDueDate(/* value */);  // Set invoice_due_date
model.setPaymentTerms(/* value */);  // Set payment_terms
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::BillingInvoice::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingInvoice::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingInvoiceDocumentType

```cpp
// Create a model
auto model = models::BillingInvoiceDocumentType();

// Serialize to JSON
nlohmann::json json = models::BillingInvoiceDocumentType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingInvoiceDocumentType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingInvoiceDownloadResponse

```cpp
// Create a model
auto model = models::BillingInvoiceDownloadResponse();
model.setDownloadUrl(/* value */);  // Set download_url
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::BillingInvoiceDownloadResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingInvoiceDownloadResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingInvoiceSortField

```cpp
// Create a model
auto model = models::BillingInvoiceSortField();

// Serialize to JSON
nlohmann::json json = models::BillingInvoiceSortField::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingInvoiceSortField::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingInvoiceStatus

```cpp
// Create a model
auto model = models::BillingInvoiceStatus();

// Serialize to JSON
nlohmann::json json = models::BillingInvoiceStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingInvoiceStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingInvoicesGet200Response

```cpp
// Create a model
auto model = models::BillingInvoicesGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BillingInvoicesGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingInvoicesGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingProfileCardType

```cpp
// Create a model
auto model = models::BillingProfileCardType();

// Serialize to JSON
nlohmann::json json = models::BillingProfileCardType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingProfileCardType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingProfilePaymentMethodBrand

```cpp
// Create a model
auto model = models::BillingProfilePaymentMethodBrand();

// Serialize to JSON
nlohmann::json json = models::BillingProfilePaymentMethodBrand::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingProfilePaymentMethodBrand::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingProfileStatus

```cpp
// Create a model
auto model = models::BillingProfileStatus();

// Serialize to JSON
nlohmann::json json = models::BillingProfileStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingProfileStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingProfilesGet200Response

```cpp
// Create a model
auto model = models::BillingProfilesGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BillingProfilesGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingProfilesGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingProfilesResponse

```cpp
// Create a model
auto model = models::BillingProfilesResponse();
model.setAdvertiserId(/* value */);  // Set advertiser_id
model.setBillingType(/* value */);  // Set billing_type
model.setCardType(/* value */);  // Set card_type
model.setId(/* value */);  // Set id
model.setPaymentMethodBrand(/* value */);  // Set payment_method_brand
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::BillingProfilesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingProfilesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BillingType

```cpp
// Create a model
auto model = models::BillingType();

// Serialize to JSON
nlohmann::json json = models::BillingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BillingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Board

```cpp
// Create a model
auto model = models::Board();
model.setPrivacy(/* value */);  // Set privacy

// Serialize to JSON
nlohmann::json json = models::Board::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Board::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardBase

```cpp
// Create a model
auto model = models::BoardBase();
model.setBoardPinsModifiedAt(/* value */);  // Set board_pins_modified_at
model.setCollaboratorCount(/* value */);  // Set collaborator_count
model.setCreatedAt(/* value */);  // Set created_at
model.setDescription(/* value */);  // Set description
model.setFollowerCount(/* value */);  // Set follower_count
model.setId(/* value */);  // Set id
model.setIsAdsOnly(/* value */);  // Set is_ads_only
model.setMedia(/* value */);  // Set media
model.setName(/* value */);  // Set name
model.setOwner(/* value */);  // Set owner
model.setPinCount(/* value */);  // Set pin_count

// Serialize to JSON
nlohmann::json json = models::BoardBase::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardBase::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardCreate

```cpp
// Create a model
auto model = models::BoardCreate();
model.setDescription(/* value */);  // Set description
model.setIsAdsOnly(/* value */);  // Set is_ads_only
model.setName(/* value */);  // Set name
model.setPrivacy(/* value */);  // Set privacy

// Serialize to JSON
nlohmann::json json = models::BoardCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardMedia

```cpp
// Create a model
auto model = models::BoardMedia();
model.setImageCoverUrl(/* value */);  // Set image_cover_url
model.setPinThumbnailUrls(/* value */);  // Set pin_thumbnail_urls

// Serialize to JSON
nlohmann::json json = models::BoardMedia::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardMedia::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardOwnerContainingTheUsername

```cpp
// Create a model
auto model = models::BoardOwnerContainingTheUsername();
model.setUsername(/* value */);  // Set username

// Serialize to JSON
nlohmann::json json = models::BoardOwnerContainingTheUsername::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardOwnerContainingTheUsername::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardPrivacy

```cpp
// Create a model
auto model = models::BoardPrivacy();

// Serialize to JSON
nlohmann::json json = models::BoardPrivacy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardPrivacy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardPrivacyFilter

```cpp
// Create a model
auto model = models::BoardPrivacyFilter();

// Serialize to JSON
nlohmann::json json = models::BoardPrivacyFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardPrivacyFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardSection

```cpp
// Create a model
auto model = models::BoardSection();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::BoardSection::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardSection::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardSectionCreate

```cpp
// Create a model
auto model = models::BoardSectionCreate();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::BoardSectionCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardSectionCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardSectionUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::BoardSectionUpdateWithRequiredBody();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::BoardSectionUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardSectionUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardSectionsList200Response

```cpp
// Create a model
auto model = models::BoardSectionsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BoardSectionsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardSectionsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardSectionsListPins200Response

```cpp
// Create a model
auto model = models::BoardSectionsListPins200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BoardSectionsListPins200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardSectionsListPins200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardUpdatePrivacy

```cpp
// Create a model
auto model = models::BoardUpdatePrivacy();

// Serialize to JSON
nlohmann::json json = models::BoardUpdatePrivacy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardUpdatePrivacy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardWithUpdatePrivacy

```cpp
// Create a model
auto model = models::BoardWithUpdatePrivacy();
model.setPrivacy(/* value */);  // Set privacy

// Serialize to JSON
nlohmann::json json = models::BoardWithUpdatePrivacy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardWithUpdatePrivacy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardWithUpdatePrivacyUpdate

```cpp
// Create a model
auto model = models::BoardWithUpdatePrivacyUpdate();
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name
model.setPrivacy(/* value */);  // Set privacy

// Serialize to JSON
nlohmann::json json = models::BoardWithUpdatePrivacyUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardWithUpdatePrivacyUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardsList200Response

```cpp
// Create a model
auto model = models::BoardsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BoardsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardsListPins200Response

```cpp
// Create a model
auto model = models::BoardsListPins200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BoardsListPins200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardsListPins200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BoardsUserFollowsList200Response

```cpp
// Create a model
auto model = models::BoardsUserFollowsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BoardsUserFollowsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BoardsUserFollowsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BookClosed

```cpp
// Create a model
auto model = models::BookClosed();
model.setConversionMetricsReady(/* value */);  // Set conversion_metrics_ready
model.setNonConversionMetricsReady(/* value */);  // Set non_conversion_metrics_ready

// Serialize to JSON
nlohmann::json json = models::BookClosed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BookClosed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BrandAccount

```cpp
// Create a model
auto model = models::BrandAccount();
model.setBrandAccountId(/* value */);  // Set brand_account_id

// Serialize to JSON
nlohmann::json json = models::BrandAccount::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BrandAccount::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BrandAccountCreate

```cpp
// Create a model
auto model = models::BrandAccountCreate();
model.setAbout(/* value */);  // Set about
model.setCountry(/* value */);  // Set country
model.setName(/* value */);  // Set name
model.setProfileImage(/* value */);  // Set profile_image
model.setUsername(/* value */);  // Set username
model.setWebsite(/* value */);  // Set website

// Serialize to JSON
nlohmann::json json = models::BrandAccountCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BrandAccountCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageBase64

```cpp
// Create a model
auto model = models::ImageBase64();
model.setContentType(/* value */);  // Set content_type
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::ImageBase64::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageBase64::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageBase64

```cpp
// Create a model
auto model = models::ImageBase64();
model.setContentType(/* value */);  // Set content_type
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::ImageBase64::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageBase64::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BrandAccountUpdate

```cpp
// Create a model
auto model = models::BrandAccountUpdate();
model.setAbout(/* value */);  // Set about
model.setCountry(/* value */);  // Set country
model.setName(/* value */);  // Set name
model.setProfileImage(/* value */);  // Set profile_image
model.setUsername(/* value */);  // Set username
model.setWebsite(/* value */);  // Set website

// Serialize to JSON
nlohmann::json json = models::BrandAccountUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BrandAccountUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Brand

```cpp
// Create a model
auto model = models::Brand();
model.setBRAND(/* value */);  // Set BRAND

// Serialize to JSON
nlohmann::json json = models::Brand::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Brand::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BudgetDurationType

```cpp
// Create a model
auto model = models::BudgetDurationType();

// Serialize to JSON
nlohmann::json json = models::BudgetDurationType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BudgetDurationType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BudgetType

```cpp
// Create a model
auto model = models::BudgetType();

// Serialize to JSON
nlohmann::json json = models::BudgetType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BudgetType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkCampaignDeliveryEstimatesItem

```cpp
// Create a model
auto model = models::BulkCampaignDeliveryEstimatesItem();
model.setAdgroupAudienceSizes(/* value */);  // Set adgroup_audience_sizes
model.setConversionRate(/* value */);  // Set conversion_rate
model.setConversionRates(/* value */);  // Set conversion_rates
model.setCurves(/* value */);  // Set curves
model.setDerivedMetrics(/* value */);  // Set derived_metrics
model.setErrors(/* value */);  // Set errors
model.setEstimateId(/* value */);  // Set estimate_id
model.setMaxPotentialSpend(/* value */);  // Set max_potential_spend

// Serialize to JSON
nlohmann::json json = models::BulkCampaignDeliveryEstimatesItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkCampaignDeliveryEstimatesItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkCampaignDeliveryEstimatesResponse

```cpp
// Create a model
auto model = models::BulkCampaignDeliveryEstimatesResponse();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::BulkCampaignDeliveryEstimatesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkCampaignDeliveryEstimatesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkDownload

```cpp
// Create a model
auto model = models::BulkDownload();
model.setRequestId(/* value */);  // Set request_id

// Serialize to JSON
nlohmann::json json = models::BulkDownload::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkDownload::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkDownloadCampaignFilter

```cpp
// Create a model
auto model = models::BulkDownloadCampaignFilter();
model.setCampaignStatus(/* value */);  // Set campaign_status
model.setEndTime(/* value */);  // Set end_time
model.setName(/* value */);  // Set name
model.setObjectiveType(/* value */);  // Set objective_type
model.setStartTime(/* value */);  // Set start_time

// Serialize to JSON
nlohmann::json json = models::BulkDownloadCampaignFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkDownloadCampaignFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkDownloadCreate

```cpp
// Create a model
auto model = models::BulkDownloadCreate();
model.setCampaignFilter(/* value */);  // Set campaign_filter
model.setEntityIds(/* value */);  // Set entity_ids
model.setEntityTypes(/* value */);  // Set entity_types
model.setOutputFormat(/* value */);  // Set output_format
model.setUpdatedSince(/* value */);  // Set updated_since

// Serialize to JSON
nlohmann::json json = models::BulkDownloadCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkDownloadCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkEntityType

```cpp
// Create a model
auto model = models::BulkEntityType();

// Serialize to JSON
nlohmann::json json = models::BulkEntityType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkEntityType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkJobData

```cpp
// Create a model
auto model = models::BulkJobData();
model.setResultUrl(/* value */);  // Set result_url
model.setStatus(/* value */);  // Set status
model.setWorkloadId(/* value */);  // Set workload_id

// Serialize to JSON
nlohmann::json json = models::BulkJobData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkJobData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkOutputFormat

```cpp
// Create a model
auto model = models::BulkOutputFormat();

// Serialize to JSON
nlohmann::json json = models::BulkOutputFormat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkOutputFormat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkReportingJobStatus

```cpp
// Create a model
auto model = models::BulkReportingJobStatus();

// Serialize to JSON
nlohmann::json json = models::BulkReportingJobStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkReportingJobStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkRequestStatus

```cpp
// Create a model
auto model = models::BulkRequestStatus();

// Serialize to JSON
nlohmann::json json = models::BulkRequestStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkRequestStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkUpsertRequest

```cpp
// Create a model
auto model = models::BulkUpsertRequest();
model.setCreate(/* value */);  // Set create
model.setUpdate(/* value */);  // Set update

// Serialize to JSON
nlohmann::json json = models::BulkUpsertRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkUpsertRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkUpsertRequestCreate

```cpp
// Create a model
auto model = models::BulkUpsertRequestCreate();
model.setAdGroups(/* value */);  // Set ad_groups
model.setAds(/* value */);  // Set ads
model.setCampaigns(/* value */);  // Set campaigns
model.setCatalogProductGroups(/* value */);  // Set catalog_product_groups
model.setKeywords(/* value */);  // Set keywords
model.setLabels(/* value */);  // Set labels
model.setProductGroups(/* value */);  // Set product_groups
model.setSchedules(/* value */);  // Set schedules

// Serialize to JSON
nlohmann::json json = models::BulkUpsertRequestCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkUpsertRequestCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkUpsertRequestCreateCatalogProductGroupsItems

```cpp
// Create a model
auto model = models::BulkUpsertRequestCreateCatalogProductGroupsItems();
model.setDescription(/* value */);  // Set description
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters
model.setIsFeatured(/* value */);  // Set is_featured
model.setName(/* value */);  // Set name
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::BulkUpsertRequestCreateCatalogProductGroupsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkUpsertRequestCreateCatalogProductGroupsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkUpsertRequestUpdate

```cpp
// Create a model
auto model = models::BulkUpsertRequestUpdate();
model.setAdGroups(/* value */);  // Set ad_groups
model.setAds(/* value */);  // Set ads
model.setCampaigns(/* value */);  // Set campaigns
model.setCatalogProductGroups(/* value */);  // Set catalog_product_groups
model.setKeywords(/* value */);  // Set keywords
model.setLabels(/* value */);  // Set labels
model.setProductGroups(/* value */);  // Set product_groups
model.setSchedules(/* value */);  // Set schedules

// Serialize to JSON
nlohmann::json json = models::BulkUpsertRequestUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkUpsertRequestUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkUpsertRequestUpdateCatalogProductGroupsItems

```cpp
// Create a model
auto model = models::BulkUpsertRequestUpdateCatalogProductGroupsItems();
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setIsFeatured(/* value */);  // Set is_featured
model.setName(/* value */);  // Set name
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::BulkUpsertRequestUpdateCatalogProductGroupsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkUpsertRequestUpdateCatalogProductGroupsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BulkUpsertResponse

```cpp
// Create a model
auto model = models::BulkUpsertResponse();
model.setRequestId(/* value */);  // Set request_id

// Serialize to JSON
nlohmann::json json = models::BulkUpsertResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BulkUpsertResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessAccessRole

```cpp
// Create a model
auto model = models::BusinessAccessRole();

// Serialize to JSON
nlohmann::json json = models::BusinessAccessRole::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessAccessRole::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessAccessUserSummary

```cpp
// Create a model
auto model = models::BusinessAccessUserSummary();
model.setEmail(/* value */);  // Set email
model.setId(/* value */);  // Set id
model.setUsername(/* value */);  // Set username

// Serialize to JSON
nlohmann::json json = models::BusinessAccessUserSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessAccessUserSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessAccountAudiencesSharedAccountsList200Response

```cpp
// Create a model
auto model = models::BusinessAccountAudiencesSharedAccountsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BusinessAccountAudiencesSharedAccountsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessAccountAudiencesSharedAccountsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessAssetMembersGet200Response

```cpp
// Create a model
auto model = models::BusinessAssetMembersGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BusinessAssetMembersGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessAssetMembersGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessAssetPartnersGet200Response

```cpp
// Create a model
auto model = models::BusinessAssetPartnersGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BusinessAssetPartnersGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessAssetPartnersGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessAssets

```cpp
// Create a model
auto model = models::BusinessAssets();
model.setCatalogInfo(/* value */);  // Set catalog_info

// Serialize to JSON
nlohmann::json json = models::BusinessAssets::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessAssets::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessAssetsGet200Response

```cpp
// Create a model
auto model = models::BusinessAssetsGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BusinessAssetsGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessAssetsGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessMemberAssetsGetResponse

```cpp
// Create a model
auto model = models::BusinessMemberAssetsGetResponse();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items
model.setTotalDataCount(/* value */);  // Set total_data_count
model.setTotalDataCountByStatus(/* value */);  // Set total_data_count_by_status

// Serialize to JSON
nlohmann::json json = models::BusinessMemberAssetsGetResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessMemberAssetsGetResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessMemberAssetsSummary

```cpp
// Create a model
auto model = models::BusinessMemberAssetsSummary();
model.setAdAccounts(/* value */);  // Set ad_accounts
model.setProfiles(/* value */);  // Set profiles

// Serialize to JSON
nlohmann::json json = models::BusinessMemberAssetsSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessMemberAssetsSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessMemberSortBy

```cpp
// Create a model
auto model = models::BusinessMemberSortBy();

// Serialize to JSON
nlohmann::json json = models::BusinessMemberSortBy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessMemberSortBy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessMembersAssetAccessDeleteBody

```cpp
// Create a model
auto model = models::BusinessMembersAssetAccessDeleteBody();
model.setAccesses(/* value */);  // Set accesses

// Serialize to JSON
nlohmann::json json = models::BusinessMembersAssetAccessDeleteBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessMembersAssetAccessDeleteBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessMembershipMember

```cpp
// Create a model
auto model = models::BusinessMembershipMember();
model.setBusinessRole(/* value */);  // Set business_role
model.setMemberId(/* value */);  // Set member_id

// Serialize to JSON
nlohmann::json json = models::BusinessMembershipMember::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessMembershipMember::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessPartnerAssetAccessGet200Response

```cpp
// Create a model
auto model = models::BusinessPartnerAssetAccessGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::BusinessPartnerAssetAccessGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessPartnerAssetAccessGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessRoleForInvite

```cpp
// Create a model
auto model = models::BusinessRoleForInvite();

// Serialize to JSON
nlohmann::json json = models::BusinessRoleForInvite::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessRoleForInvite::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessRoleForMembers

```cpp
// Create a model
auto model = models::BusinessRoleForMembers();

// Serialize to JSON
nlohmann::json json = models::BusinessRoleForMembers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessRoleForMembers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessSearchBy

```cpp
// Create a model
auto model = models::BusinessSearchBy();

// Serialize to JSON
nlohmann::json json = models::BusinessSearchBy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessSearchBy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessToAdAccountSharedAudience

```cpp
// Create a model
auto model = models::BusinessToAdAccountSharedAudience();
model.setAudienceId(/* value */);  // Set audience_id
model.setPermissions(/* value */);  // Set permissions
model.setRecipientAccountIds(/* value */);  // Set recipient_account_ids

// Serialize to JSON
nlohmann::json json = models::BusinessToAdAccountSharedAudience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessToAdAccountSharedAudience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody();
model.setAudienceId(/* value */);  // Set audience_id
model.setOperationType(/* value */);  // Set operation_type
model.setRecipientAccountIds(/* value */);  // Set recipient_account_ids

// Serialize to JSON
nlohmann::json json = models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessToBusinessSharedAudience

```cpp
// Create a model
auto model = models::BusinessToBusinessSharedAudience();
model.setAudienceId(/* value */);  // Set audience_id
model.setPermissions(/* value */);  // Set permissions
model.setRecipientBusinessIds(/* value */);  // Set recipient_business_ids

// Serialize to JSON
nlohmann::json json = models::BusinessToBusinessSharedAudience::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessToBusinessSharedAudience::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody();
model.setAudienceId(/* value */);  // Set audience_id
model.setOperationType(/* value */);  // Set operation_type
model.setRecipientBusinessIds(/* value */);  // Set recipient_business_ids

// Serialize to JSON
nlohmann::json json = models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Campaign

```cpp
// Create a model
auto model = models::Campaign();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setBidOptions(/* value */);  // Set bid_options
model.setCreatedTime(/* value */);  // Set created_time
model.setDailySpendCap(/* value */);  // Set daily_spend_cap
model.setDefaultAdGroupBudgetInMicroCurrency(/* value */);  // Set default_ad_group_budget_in_micro_currency
model.setEndTime(/* value */);  // Set end_time
model.setId(/* value */);  // Set id
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsAutomatedCampaign(/* value */);  // Set is_automated_campaign
model.setIsCampaignBudgetOptimization(/* value */);  // Set is_campaign_budget_optimization
model.setIsCarting(/* value */);  // Set is_carting
model.setIsFlexibleDailyBudgets(/* value */);  // Set is_flexible_daily_budgets
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setLifetimeSpendCap(/* value */);  // Set lifetime_spend_cap
model.setName(/* value */);  // Set name
model.setObjectiveType(/* value */);  // Set objective_type
model.setOrderLineId(/* value */);  // Set order_line_id
model.setPerformancePlusCampaignSettings(/* value */);  // Set performance_plus_campaign_settings
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setSummaryStatus(/* value */);  // Set summary_status
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setType(/* value */);  // Set type
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::Campaign::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Campaign::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAdPreviewData

```cpp
// Create a model
auto model = models::CampaignAdPreviewData();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setClientId(/* value */);  // Set client_id
model.setExpiresAt(/* value */);  // Set expires_at
model.setIsActive(/* value */);  // Set is_active
model.setPinId(/* value */);  // Set pin_id
model.setPinPromotionId(/* value */);  // Set pin_promotion_id
model.setPromotedProductGroupId(/* value */);  // Set promoted_product_group_id
model.setUrl(/* value */);  // Set url
model.setUserId(/* value */);  // Set user_id
model.setUuid(/* value */);  // Set uuid

// Serialize to JSON
nlohmann::json json = models::CampaignAdPreviewData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAdPreviewData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAdPreviewCreate

```cpp
// Create a model
auto model = models::CampaignAdPreviewCreate();
model.setAdGroupId(/* value */);  // Set ad_group_id

// Serialize to JSON
nlohmann::json json = models::CampaignAdPreviewCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAdPreviewCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAdPreviewCreate200ResponseInner

```cpp
// Create a model
auto model = models::CampaignAdPreviewCreate200ResponseInner();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::CampaignAdPreviewCreate200ResponseInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAdPreviewCreate200ResponseInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAdPreviewCreate200ResponseInnerData

```cpp
// Create a model
auto model = models::CampaignAdPreviewCreate200ResponseInnerData();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setClientId(/* value */);  // Set client_id
model.setExpiresAt(/* value */);  // Set expires_at
model.setIsActive(/* value */);  // Set is_active
model.setPinId(/* value */);  // Set pin_id
model.setPinPromotionId(/* value */);  // Set pin_promotion_id
model.setPromotedProductGroupId(/* value */);  // Set promoted_product_group_id
model.setUrl(/* value */);  // Set url
model.setUserId(/* value */);  // Set user_id
model.setUuid(/* value */);  // Set uuid
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::CampaignAdPreviewCreate200ResponseInnerData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAdPreviewCreate200ResponseInnerData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAdPreviewCreate200ResponseInnerDataOneOf

```cpp
// Create a model
auto model = models::CampaignAdPreviewCreate200ResponseInnerDataOneOf();
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::CampaignAdPreviewCreate200ResponseInnerDataOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAdPreviewCreate200ResponseInnerDataOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAdPreviewDelete200ResponseInner

```cpp
// Create a model
auto model = models::CampaignAdPreviewDelete200ResponseInner();
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CampaignAdPreviewDelete200ResponseInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAdPreviewDelete200ResponseInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAdPreviewDelete200ResponseInnerStatus

```cpp
// Create a model
auto model = models::CampaignAdPreviewDelete200ResponseInnerStatus();
model.setStatusCode(/* value */);  // Set statusCode
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::CampaignAdPreviewDelete200ResponseInnerStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAdPreviewDelete200ResponseInnerStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignAudienceMultipliers

```cpp
// Create a model
auto model = models::CampaignAudienceMultipliers();
model.setAUDIENCEID(/* value */);  // Set AUDIENCE_ID

// Serialize to JSON
nlohmann::json json = models::CampaignAudienceMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignAudienceMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBatchItem

```cpp
// Create a model
auto model = models::CampaignBatchItem();
model.setData(/* value */);  // Set data
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::CampaignBatchItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBatchItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBatchResponseData

```cpp
// Create a model
auto model = models::CampaignBatchResponseData();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setBidOptions(/* value */);  // Set bid_options
model.setCreatedTime(/* value */);  // Set created_time
model.setDailySpendCap(/* value */);  // Set daily_spend_cap
model.setDefaultAdGroupBudgetInMicroCurrency(/* value */);  // Set default_ad_group_budget_in_micro_currency
model.setEndTime(/* value */);  // Set end_time
model.setId(/* value */);  // Set id
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsAutomatedCampaign(/* value */);  // Set is_automated_campaign
model.setIsCampaignBudgetOptimization(/* value */);  // Set is_campaign_budget_optimization
model.setIsCarting(/* value */);  // Set is_carting
model.setIsFlexibleDailyBudgets(/* value */);  // Set is_flexible_daily_budgets
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setLifetimeSpendCap(/* value */);  // Set lifetime_spend_cap
model.setName(/* value */);  // Set name
model.setObjectiveType(/* value */);  // Set objective_type
model.setOrderLineId(/* value */);  // Set order_line_id
model.setPerformancePlusCampaignSettings(/* value */);  // Set performance_plus_campaign_settings
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setSummaryStatus(/* value */);  // Set summary_status
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setType(/* value */);  // Set type
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::CampaignBatchResponseData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBatchResponseData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBatchUpdateItem

```cpp
// Create a model
auto model = models::CampaignBatchUpdateItem();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAppId(/* value */);  // Set app_id
model.setAppPlatform(/* value */);  // Set app_platform
model.setBidOptions(/* value */);  // Set bid_options
model.setDailySpendCap(/* value */);  // Set daily_spend_cap
model.setDefaultAdGroupBudgetInMicroCurrency(/* value */);  // Set default_ad_group_budget_in_micro_currency
model.setEndTime(/* value */);  // Set end_time
model.setId(/* value */);  // Set id
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsAutomatedCampaign(/* value */);  // Set is_automated_campaign
model.setIsCampaignBudgetOptimization(/* value */);  // Set is_campaign_budget_optimization
model.setIsFlexibleDailyBudgets(/* value */);  // Set is_flexible_daily_budgets
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setLifetimeSpendCap(/* value */);  // Set lifetime_spend_cap
model.setName(/* value */);  // Set name
model.setObjectiveType(/* value */);  // Set objective_type
model.setOrderLineId(/* value */);  // Set order_line_id
model.setPerformancePlusCampaignSettings(/* value */);  // Set performance_plus_campaign_settings
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::CampaignBatchUpdateItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBatchUpdateItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBatchWriteResponseModel

```cpp
// Create a model
auto model = models::CampaignBatchWriteResponseModel();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CampaignBatchWriteResponseModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBatchWriteResponseModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBidOptions

```cpp
// Create a model
auto model = models::CampaignBidOptions();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setFreqBidMultiplierTimeWindow(/* value */);  // Set freq_bid_multiplier_time_window
model.setFrequencyMultipliers(/* value */);  // Set frequency_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::CampaignBidOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBidOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBidOptionsCreate

```cpp
// Create a model
auto model = models::CampaignBidOptionsCreate();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setFreqBidMultiplierTimeWindow(/* value */);  // Set freq_bid_multiplier_time_window
model.setFrequencyMultipliers(/* value */);  // Set frequency_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::CampaignBidOptionsCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBidOptionsCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBidOptionsUpdate

```cpp
// Create a model
auto model = models::CampaignBidOptionsUpdate();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setFreqBidMultiplierTimeWindow(/* value */);  // Set freq_bid_multiplier_time_window
model.setFrequencyMultipliers(/* value */);  // Set frequency_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers
model.setUpdateMask(/* value */);  // Set update_mask

// Serialize to JSON
nlohmann::json json = models::CampaignBidOptionsUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBidOptionsUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignBidOptionsUpdateMaskItems

```cpp
// Create a model
auto model = models::CampaignBidOptionsUpdateMaskItems();

// Serialize to JSON
nlohmann::json json = models::CampaignBidOptionsUpdateMaskItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignBidOptionsUpdateMaskItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignCreateItem

```cpp
// Create a model
auto model = models::CampaignCreateItem();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAppId(/* value */);  // Set app_id
model.setAppPlatform(/* value */);  // Set app_platform
model.setBidOptions(/* value */);  // Set bid_options
model.setDailySpendCap(/* value */);  // Set daily_spend_cap
model.setDefaultAdGroupBudgetInMicroCurrency(/* value */);  // Set default_ad_group_budget_in_micro_currency
model.setEndTime(/* value */);  // Set end_time
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsAutomatedCampaign(/* value */);  // Set is_automated_campaign
model.setIsCampaignBudgetOptimization(/* value */);  // Set is_campaign_budget_optimization
model.setIsFlexibleDailyBudgets(/* value */);  // Set is_flexible_daily_budgets
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setLifetimeSpendCap(/* value */);  // Set lifetime_spend_cap
model.setName(/* value */);  // Set name
model.setObjectiveType(/* value */);  // Set objective_type
model.setOrderLineId(/* value */);  // Set order_line_id
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::CampaignCreateItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignCreateItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignCreateRequest

```cpp
// Create a model
auto model = models::CampaignCreateRequest();
model.setBidOptions(/* value */);  // Set bid_options
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsAutomatedCampaign(/* value */);  // Set is_automated_campaign
model.setIsCampaignBudgetOptimization(/* value */);  // Set is_campaign_budget_optimization
model.setIsFlexibleDailyBudgets(/* value */);  // Set is_flexible_daily_budgets
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setObjectiveType(/* value */);  // Set objective_type
model.setStatus(/* value */);  // Set status
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setDailySpendCap(/* value */);  // Set daily_spend_cap
model.setDefaultAdGroupBudgetInMicroCurrency(/* value */);  // Set default_ad_group_budget_in_micro_currency
model.setEndTime(/* value */);  // Set end_time
model.setLifetimeSpendCap(/* value */);  // Set lifetime_spend_cap
model.setName(/* value */);  // Set name
model.setOrderLineId(/* value */);  // Set order_line_id
model.setStartTime(/* value */);  // Set start_time
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::CampaignCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignCreateRequestAllOf1

```cpp
// Create a model
auto model = models::CampaignCreateRequestAllOf1();
model.setBidOptions(/* value */);  // Set bid_options
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsAutomatedCampaign(/* value */);  // Set is_automated_campaign
model.setIsCampaignBudgetOptimization(/* value */);  // Set is_campaign_budget_optimization
model.setIsFlexibleDailyBudgets(/* value */);  // Set is_flexible_daily_budgets
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setObjectiveType(/* value */);  // Set objective_type
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CampaignCreateRequestAllOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignCreateRequestAllOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignDeliveryEstimatesCampaign

```cpp
// Create a model
auto model = models::CampaignDeliveryEstimatesCampaign();
model.setAdGroups(/* value */);  // Set ad_groups
model.setBudgetDurationType(/* value */);  // Set budget_duration_type
model.setDailySpendCap(/* value */);  // Set daily_spend_cap
model.setEndDate(/* value */);  // Set end_date
model.setLifetimeSpendCap(/* value */);  // Set lifetime_spend_cap
model.setObjectiveType(/* value */);  // Set objective_type
model.setStartDate(/* value */);  // Set start_date

// Serialize to JSON
nlohmann::json json = models::CampaignDeliveryEstimatesCampaign::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignDeliveryEstimatesCampaign::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignDeliveryEstimatesDerivedMetrics

```cpp
// Create a model
auto model = models::CampaignDeliveryEstimatesDerivedMetrics();
model.setCpc(/* value */);  // Set cpc
model.setCpcLower(/* value */);  // Set cpc_lower
model.setCpcUpper(/* value */);  // Set cpc_upper
model.setCpm(/* value */);  // Set cpm
model.setCpmLower(/* value */);  // Set cpm_lower
model.setCpmUpper(/* value */);  // Set cpm_upper
model.setLifetimeFrequency(/* value */);  // Set lifetime_frequency
model.setLifetimeFrequencyLower(/* value */);  // Set lifetime_frequency_lower
model.setLifetimeFrequencyUpper(/* value */);  // Set lifetime_frequency_upper
model.setLifetimeImpression(/* value */);  // Set lifetime_impression
model.setLifetimeImpressionLower(/* value */);  // Set lifetime_impression_lower
model.setLifetimeImpressionUpper(/* value */);  // Set lifetime_impression_upper
model.setLifetimeReach(/* value */);  // Set lifetime_reach
model.setLifetimeReachLower(/* value */);  // Set lifetime_reach_lower
model.setLifetimeReachUpper(/* value */);  // Set lifetime_reach_upper
model.setWeeklyClick(/* value */);  // Set weekly_click
model.setWeeklyClickLower(/* value */);  // Set weekly_click_lower
model.setWeeklyClickUpper(/* value */);  // Set weekly_click_upper
model.setWeeklyFrequency(/* value */);  // Set weekly_frequency
model.setWeeklyFrequencyLower(/* value */);  // Set weekly_frequency_lower
model.setWeeklyFrequencyUpper(/* value */);  // Set weekly_frequency_upper
model.setWeeklyImpression(/* value */);  // Set weekly_impression
model.setWeeklyImpressionLower(/* value */);  // Set weekly_impression_lower
model.setWeeklyImpressionUpper(/* value */);  // Set weekly_impression_upper
model.setWeeklyReach(/* value */);  // Set weekly_reach
model.setWeeklyReachLower(/* value */);  // Set weekly_reach_lower
model.setWeeklyReachUpper(/* value */);  // Set weekly_reach_upper

// Serialize to JSON
nlohmann::json json = models::CampaignDeliveryEstimatesDerivedMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignDeliveryEstimatesDerivedMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignDeliveryEstimatesResponse

```cpp
// Create a model
auto model = models::CampaignDeliveryEstimatesResponse();
model.setCurves(/* value */);  // Set curves
model.setDerivedMetrics(/* value */);  // Set derived_metrics
model.setMaxPotentialSpend(/* value */);  // Set max_potential_spend

// Serialize to JSON
nlohmann::json json = models::CampaignDeliveryEstimatesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignDeliveryEstimatesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignObjectiveType

```cpp
// Create a model
auto model = models::CampaignObjectiveType();

// Serialize to JSON
nlohmann::json json = models::CampaignObjectiveType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignObjectiveType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningAdGroupAudienceSize

```cpp
// Create a model
auto model = models::CampaignPlanningAdGroupAudienceSize();
model.setCountLower(/* value */);  // Set count_lower
model.setCountUpper(/* value */);  // Set count_upper

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningAdGroupAudienceSize::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningAdGroupAudienceSize::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningBudgetRecommendation

```cpp
// Create a model
auto model = models::CampaignPlanningBudgetRecommendation();
model.setBudgetRecommendation(/* value */);  // Set budget_recommendation
model.setExperimentCampaignBudgetRecommendation(/* value */);  // Set experiment_campaign_budget_recommendation
model.setLifetimeDaysRecommendation(/* value */);  // Set lifetime_days_recommendation
model.setPointEstimations(/* value */);  // Set point_estimations

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningBudgetRecommendation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningBudgetRecommendation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningBudgetRecommendationPoint

```cpp
// Create a model
auto model = models::CampaignPlanningBudgetRecommendationPoint();
model.setEstimationType(/* value */);  // Set estimation_type
model.setPointEstimate(/* value */);  // Set point_estimate

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningBudgetRecommendationPoint::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningBudgetRecommendationPoint::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningConfidenceLevelAlert

```cpp
// Create a model
auto model = models::CampaignPlanningConfidenceLevelAlert();
model.setDescription(/* value */);  // Set description
model.setReason(/* value */);  // Set reason
model.setSeverity(/* value */);  // Set severity

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningConfidenceLevelAlert::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningConfidenceLevelAlert::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningConfidenceLevelAlertReason

```cpp
// Create a model
auto model = models::CampaignPlanningConfidenceLevelAlertReason();

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningConfidenceLevelAlertReason::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningConfidenceLevelAlertReason::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningConfidenceLevelAlertSeverity

```cpp
// Create a model
auto model = models::CampaignPlanningConfidenceLevelAlertSeverity();

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningConfidenceLevelAlertSeverity::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningConfidenceLevelAlertSeverity::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningConversionAttribution

```cpp
// Create a model
auto model = models::CampaignPlanningConversionAttribution();
model.setClickWindowDays(/* value */);  // Set click_window_days
model.setEngagementWindowDays(/* value */);  // Set engagement_window_days
model.setViewWindowDays(/* value */);  // Set view_window_days

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningConversionAttribution::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningConversionAttribution::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningConversionAttributionWindowDays

```cpp
// Create a model
auto model = models::CampaignPlanningConversionAttributionWindowDays();

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningConversionAttributionWindowDays::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningConversionAttributionWindowDays::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningConversionEvent

```cpp
// Create a model
auto model = models::CampaignPlanningConversionEvent();

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningConversionEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningConversionEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningConversionRate

```cpp
// Create a model
auto model = models::CampaignPlanningConversionRate();
model.setAttributionWindows(/* value */);  // Set attribution_windows
model.setConversionEvent(/* value */);  // Set conversion_event
model.setConversionRate(/* value */);  // Set conversion_rate

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningConversionRate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningConversionRate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningCurveEstimate

```cpp
// Create a model
auto model = models::CampaignPlanningCurveEstimate();
model.setEstimationType(/* value */);  // Set estimation_type
model.setPoints(/* value */);  // Set points

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningCurveEstimate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningCurveEstimate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningEstimationType

```cpp
// Create a model
auto model = models::CampaignPlanningEstimationType();

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningEstimationType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningEstimationType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningExperimentBudgetRecommendation

```cpp
// Create a model
auto model = models::CampaignPlanningExperimentBudgetRecommendation();
model.setBudgetRecommendation(/* value */);  // Set budget_recommendation
model.setLifetimeDaysRecommendation(/* value */);  // Set lifetime_days_recommendation
model.setPointEstimations(/* value */);  // Set point_estimations
model.setVersionId(/* value */);  // Set version_id

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningExperimentBudgetRecommendation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningExperimentBudgetRecommendation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningPointEstimate

```cpp
// Create a model
auto model = models::CampaignPlanningPointEstimate();
model.setBudget(/* value */);  // Set budget
model.setDoubleY(/* value */);  // Set double_y
model.setMaxY(/* value */);  // Set max_y
model.setMinY(/* value */);  // Set min_y
model.setY(/* value */);  // Set y

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningPointEstimate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningPointEstimate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningResponseError

```cpp
// Create a model
auto model = models::CampaignPlanningResponseError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningResponseError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningResponseError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignPlanningResponseErrorCode

```cpp
// Create a model
auto model = models::CampaignPlanningResponseErrorCode();

// Serialize to JSON
nlohmann::json json = models::CampaignPlanningResponseErrorCode::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignPlanningResponseErrorCode::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignSummaryStatus

```cpp
// Create a model
auto model = models::CampaignSummaryStatus();

// Serialize to JSON
nlohmann::json json = models::CampaignSummaryStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignSummaryStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignUpdateRequest

```cpp
// Create a model
auto model = models::CampaignUpdateRequest();
model.setBidOptions(/* value */);  // Set bid_options
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setObjectiveType(/* value */);  // Set objective_type
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setDailySpendCap(/* value */);  // Set daily_spend_cap
model.setDefaultAdGroupBudgetInMicroCurrency(/* value */);  // Set default_ad_group_budget_in_micro_currency
model.setEndTime(/* value */);  // Set end_time
model.setId(/* value */);  // Set id
model.setIsAutomatedCampaign(/* value */);  // Set is_automated_campaign
model.setIsCampaignBudgetOptimization(/* value */);  // Set is_campaign_budget_optimization
model.setIsFlexibleDailyBudgets(/* value */);  // Set is_flexible_daily_budgets
model.setLifetimeSpendCap(/* value */);  // Set lifetime_spend_cap
model.setName(/* value */);  // Set name
model.setOrderLineId(/* value */);  // Set order_line_id
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::CampaignUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignUpdateRequestAllOf2

```cpp
// Create a model
auto model = models::CampaignUpdateRequestAllOf2();
model.setBidOptions(/* value */);  // Set bid_options
model.setIntendedPromotionType(/* value */);  // Set intended_promotion_type
model.setIsLtvOptimized(/* value */);  // Set is_ltv_optimized
model.setIsPerformancePlus(/* value */);  // Set is_performance_plus
model.setIsTopOfSearch(/* value */);  // Set is_top_of_search
model.setObjectiveType(/* value */);  // Set objective_type

// Serialize to JSON
nlohmann::json json = models::CampaignUpdateRequestAllOf2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignUpdateRequestAllOf2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignsAnalyticsMetrics

```cpp
// Create a model
auto model = models::CampaignsAnalyticsMetrics();
model.setCAMPAIGNID(/* value */);  // Set CAMPAIGN_ID
model.setDATE(/* value */);  // Set DATE

// Serialize to JSON
nlohmann::json json = models::CampaignsAnalyticsMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignsAnalyticsMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CampaignsList200Response

```cpp
// Create a model
auto model = models::CampaignsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CampaignsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CampaignsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CancelInviteException

```cpp
// Create a model
auto model = models::CancelInviteException();
model.setInviteId(/* value */);  // Set invite_id
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::CancelInviteException::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CancelInviteException::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CancelInviteResult

```cpp
// Create a model
auto model = models::CancelInviteResult();
model.setId(/* value */);  // Set id
model.setInviteData(/* value */);  // Set invite_data
model.setIsReceivedInvite(/* value */);  // Set is_received_invite
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::CancelInviteResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CancelInviteResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CancelInviteResultItem

```cpp
// Create a model
auto model = models::CancelInviteResultItem();
model.setException(/* value */);  // Set exception
model.setInvite(/* value */);  // Set invite

// Serialize to JSON
nlohmann::json json = models::CancelInviteResultItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CancelInviteResultItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CancelInviteResultUser

```cpp
// Create a model
auto model = models::CancelInviteResultUser();
model.setEmail(/* value */);  // Set email
model.setId(/* value */);  // Set id
model.setUsername(/* value */);  // Set username

// Serialize to JSON
nlohmann::json json = models::CancelInviteResultUser::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CancelInviteResultUser::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CancelInvitesRequest

```cpp
// Create a model
auto model = models::CancelInvitesRequest();
model.setInviteIds(/* value */);  // Set invite_ids

// Serialize to JSON
nlohmann::json json = models::CancelInvitesRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CancelInvitesRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CancelInvitesResponse

```cpp
// Create a model
auto model = models::CancelInvitesResponse();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CancelInvitesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CancelInvitesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CarouselSlot

```cpp
// Create a model
auto model = models::CarouselSlot();
model.setDescription(/* value */);  // Set description
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::CarouselSlot::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CarouselSlot::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CartingProduct

```cpp
// Create a model
auto model = models::CartingProduct();
model.setCartingProductId(/* value */);  // Set carting_product_id
model.setDisplayPreferredRetailersOnly(/* value */);  // Set display_preferred_retailers_only
model.setDisplayProductPrice(/* value */);  // Set display_product_price
model.setPreferredRetailers(/* value */);  // Set preferred_retailers
model.setRandomizePreferredRetailers(/* value */);  // Set randomize_preferred_retailers

// Serialize to JSON
nlohmann::json json = models::CartingProduct::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CartingProduct::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CartingRetailer

```cpp
// Create a model
auto model = models::CartingRetailer();
model.setRetailerId(/* value */);  // Set retailer_id
model.setRetailerName(/* value */);  // Set retailer_name

// Serialize to JSON
nlohmann::json json = models::CartingRetailer::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CartingRetailer::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Catalog

```cpp
// Create a model
auto model = models::Catalog();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreatedAt(/* value */);  // Set created_at
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::Catalog::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Catalog::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogBinding

```cpp
// Create a model
auto model = models::CatalogBinding();
model.setCatalogType(/* value */);  // Set catalog_type
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CatalogBinding::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogBinding::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogCreate

```cpp
// Create a model
auto model = models::CatalogCreate();
model.setCatalogType(/* value */);  // Set catalog_type
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CatalogCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogUpdate

```cpp
// Create a model
auto model = models::CatalogUpdate();
model.setCatalogType(/* value */);  // Set catalog_type
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CatalogUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsAiContentDisclosure

```cpp
// Create a model
auto model = models::CatalogsAiContentDisclosure();
model.setDisclosure(/* value */);  // Set disclosure
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::CatalogsAiContentDisclosure::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsAiContentDisclosure::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsAiContentDisclosureLabel

```cpp
// Create a model
auto model = models::CatalogsAiContentDisclosureLabel();

// Serialize to JSON
nlohmann::json json = models::CatalogsAiContentDisclosureLabel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsAiContentDisclosureLabel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsAvailableFilterValues

```cpp
// Create a model
auto model = models::CatalogsAvailableFilterValues();
model.setCatalogType(/* value */);  // Set catalog_type
model.setFilterValues(/* value */);  // Set filter_values

// Serialize to JSON
nlohmann::json json = models::CatalogsAvailableFilterValues::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsAvailableFilterValues::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsBaseFilterKeys

```cpp
// Create a model
auto model = models::CatalogsBaseFilterKeys();
model.setMINPRICE(/* value */);  // Set MIN_PRICE
model.setMAXPRICE(/* value */);  // Set MAX_PRICE
model.setCURRENCY(/* value */);  // Set CURRENCY
model.setITEMID(/* value */);  // Set ITEM_ID
model.setAVAILABILITY(/* value */);  // Set AVAILABILITY
model.setBRAND(/* value */);  // Set BRAND
model.setCONDITION(/* value */);  // Set CONDITION
model.setCUSTOMLABEL0(/* value */);  // Set CUSTOM_LABEL_0
model.setCUSTOMLABEL1(/* value */);  // Set CUSTOM_LABEL_1
model.setCUSTOMLABEL2(/* value */);  // Set CUSTOM_LABEL_2
model.setCUSTOMLABEL3(/* value */);  // Set CUSTOM_LABEL_3
model.setCUSTOMLABEL4(/* value */);  // Set CUSTOM_LABEL_4
model.setITEMGROUPID(/* value */);  // Set ITEM_GROUP_ID
model.setGENDER(/* value */);  // Set GENDER
model.setMEDIATYPE(/* value */);  // Set MEDIA_TYPE
model.setPRODUCTTYPE4(/* value */);  // Set PRODUCT_TYPE_4
model.setPRODUCTTYPE3(/* value */);  // Set PRODUCT_TYPE_3
model.setPRODUCTTYPE2(/* value */);  // Set PRODUCT_TYPE_2
model.setPRODUCTTYPE1(/* value */);  // Set PRODUCT_TYPE_1
model.setPRODUCTTYPE0(/* value */);  // Set PRODUCT_TYPE_0
model.setGOOGLEPRODUCTCATEGORY6(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_6
model.setGOOGLEPRODUCTCATEGORY5(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_5
model.setGOOGLEPRODUCTCATEGORY4(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_4
model.setGOOGLEPRODUCTCATEGORY3(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_3
model.setGOOGLEPRODUCTCATEGORY2(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_2
model.setGOOGLEPRODUCTCATEGORY1(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_1
model.setGOOGLEPRODUCTCATEGORY0(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_0
model.setCUSTOMNUMBER0(/* value */);  // Set CUSTOM_NUMBER_0
model.setCUSTOMNUMBER1(/* value */);  // Set CUSTOM_NUMBER_1
model.setCUSTOMNUMBER2(/* value */);  // Set CUSTOM_NUMBER_2
model.setCUSTOMNUMBER3(/* value */);  // Set CUSTOM_NUMBER_3
model.setCUSTOMNUMBER4(/* value */);  // Set CUSTOM_NUMBER_4
model.setTITLEKEYWORDS(/* value */);  // Set TITLE_KEYWORDS
model.setPINTERESTPRODUCTCATEGORIES(/* value */);  // Set PINTEREST_PRODUCT_CATEGORIES

// Serialize to JSON
nlohmann::json json = models::CatalogsBaseFilterKeys::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsBaseFilterKeys::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AllOf

```cpp
// Create a model
auto model = models::AllOf();
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::AllOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AllOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AnyOf

```cpp
// Create a model
auto model = models::AnyOf();
model.setAnyOf(/* value */);  // Set any_of

// Serialize to JSON
nlohmann::json json = models::AnyOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AnyOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreateCreativeAssetsItem

```cpp
// Create a model
auto model = models::CatalogsCreateCreativeAssetsItem();
model.setAttributes(/* value */);  // Set attributes
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsCreateCreativeAssetsItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreateCreativeAssetsItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreateHotelItem

```cpp
// Create a model
auto model = models::CatalogsCreateHotelItem();
model.setAttributes(/* value */);  // Set attributes
model.setHotelId(/* value */);  // Set hotel_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsCreateHotelItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreateHotelItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreateReportResponse

```cpp
// Create a model
auto model = models::CatalogsCreateReportResponse();
model.setToken(/* value */);  // Set token

// Serialize to JSON
nlohmann::json json = models::CatalogsCreateReportResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreateReportResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreateRetailItem

```cpp
// Create a model
auto model = models::CatalogsCreateRetailItem();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsCreateRetailItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreateRetailItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsAttributes

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsAttributes();
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setImageLink(/* value */);  // Set image_link
model.setVideoLink(/* value */);  // Set video_link

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsAttributes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsAttributes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsAvailableFilterValues

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsAvailableFilterValues();
model.setCatalogType(/* value */);  // Set catalog_type
model.setFilterValues(/* value */);  // Set filter_values

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsAvailableFilterValues::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsAvailableFilterValues::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsBatchItem

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsBatchItem();
model.setAttributes(/* value */);  // Set attributes
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsBatchItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsBatchItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsBatchRequest

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsBatchRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsFeed

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsFeed();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreatedAt(/* value */);  // Set created_at
model.setCredentials(/* value */);  // Set credentials
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setId(/* value */);  // Set id
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsFeed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsFeed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedsCreativeAssetsCreateRequest

```cpp
// Create a model
auto model = models::FeedsCreativeAssetsCreateRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::FeedsCreativeAssetsCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedsCreativeAssetsCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale();

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedsUpdateRequest

```cpp
// Create a model
auto model = models::CatalogsFeedsUpdateRequest();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedsUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedsUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsFilterValuesMap

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsFilterValuesMap();
model.setCustomLabel0(/* value */);  // Set custom_label_0
model.setCustomLabel1(/* value */);  // Set custom_label_1
model.setCustomLabel2(/* value */);  // Set custom_label_2
model.setCustomLabel3(/* value */);  // Set custom_label_3
model.setCustomLabel4(/* value */);  // Set custom_label_4
model.setGoogleProductCategory0(/* value */);  // Set google_product_category_0
model.setGoogleProductCategory1(/* value */);  // Set google_product_category_1
model.setGoogleProductCategory2(/* value */);  // Set google_product_category_2
model.setGoogleProductCategory3(/* value */);  // Set google_product_category_3
model.setGoogleProductCategory4(/* value */);  // Set google_product_category_4
model.setGoogleProductCategory5(/* value */);  // Set google_product_category_5
model.setGoogleProductCategory6(/* value */);  // Set google_product_category_6
model.setMediaType(/* value */);  // Set media_type

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsFilterValuesMap::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsFilterValuesMap::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsItemErrorResponse

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsItemErrorResponse();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setErrors(/* value */);  // Set errors
model.setItemResponseKind(/* value */);  // Set item_response_kind

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsItemErrorResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsItemErrorResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsItemResponse

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsItemResponse();
model.setAttributes(/* value */);  // Set attributes
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setItemResponseKind(/* value */);  // Set item_response_kind
model.setPins(/* value */);  // Set pins

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsItemResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsItemResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsItemsBatch

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsItemsBatch();
model.setBatchId(/* value */);  // Set batch_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCompletedTime(/* value */);  // Set completed_time
model.setCreatedTime(/* value */);  // Set created_time
model.setItems(/* value */);  // Set items
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsItemsBatch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsItemsBatch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsItemsPostFilter

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsItemsPostFilter();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreativeAssetsIds(/* value */);  // Set creative_assets_ids

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsItemsPostFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsItemsPostFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeAssetsListProductsByCatalogBasedFilterRequest

```cpp
// Create a model
auto model = models::CreativeAssetsListProductsByCatalogBasedFilterRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setFilters(/* value */);  // Set filters

// Serialize to JSON
nlohmann::json json = models::CreativeAssetsListProductsByCatalogBasedFilterRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeAssetsListProductsByCatalogBasedFilterRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsProduct

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsProduct();
model.setCatalogType(/* value */);  // Set catalog_type
model.setMetadata(/* value */);  // Set metadata
model.setPin(/* value */);  // Set pin

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsProduct::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsProduct::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeAssetsProductGroup

```cpp
// Create a model
auto model = models::CreativeAssetsProductGroup();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreatedAt(/* value */);  // Set created_at
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::CreativeAssetsProductGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeAssetsProductGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeAssetsProductGroupsCreateRequest

```cpp
// Create a model
auto model = models::CreativeAssetsProductGroupsCreateRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CreativeAssetsProductGroupsCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeAssetsProductGroupsCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupKeys

```cpp
// Create a model
auto model = models::CatalogsProductGroupKeys();
model.setCREATIVEASSETSID(/* value */);  // Set CREATIVE_ASSETS_ID
model.setCUSTOMLABEL0(/* value */);  // Set CUSTOM_LABEL_0
model.setCUSTOMLABEL1(/* value */);  // Set CUSTOM_LABEL_1
model.setCUSTOMLABEL2(/* value */);  // Set CUSTOM_LABEL_2
model.setCUSTOMLABEL3(/* value */);  // Set CUSTOM_LABEL_3
model.setCUSTOMLABEL4(/* value */);  // Set CUSTOM_LABEL_4
model.setGOOGLEPRODUCTCATEGORY6(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_6
model.setGOOGLEPRODUCTCATEGORY5(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_5
model.setGOOGLEPRODUCTCATEGORY4(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_4
model.setGOOGLEPRODUCTCATEGORY3(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_3
model.setGOOGLEPRODUCTCATEGORY2(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_2
model.setGOOGLEPRODUCTCATEGORY1(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_1
model.setGOOGLEPRODUCTCATEGORY0(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_0
model.setMEDIATYPE(/* value */);  // Set MEDIA_TYPE
model.setTITLEKEYWORDS(/* value */);  // Set TITLE_KEYWORDS
model.setLINK(/* value */);  // Set LINK

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupKeys::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupKeys::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupFilters

```cpp
// Create a model
auto model = models::CatalogsProductGroupFilters();
model.setAnyOf(/* value */);  // Set any_of
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupFilters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupFilters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AllOf

```cpp
// Create a model
auto model = models::AllOf();
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::AllOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AllOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AnyOf

```cpp
// Create a model
auto model = models::AnyOf();
model.setAnyOf(/* value */);  // Set any_of

// Serialize to JSON
nlohmann::json json = models::AnyOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AnyOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsProductGroupProductCounts

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsProductGroupProductCounts();
model.setAppLinks(/* value */);  // Set app_links
model.setCatalogType(/* value */);  // Set catalog_type
model.setImages(/* value */);  // Set images
model.setTotal(/* value */);  // Set total
model.setVideos(/* value */);  // Set videos

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsProductGroupProductCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsProductGroupProductCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeAssetsProductGroupsUpdateRequest

```cpp
// Create a model
auto model = models::CreativeAssetsProductGroupsUpdateRequest();
model.setCatalogType(/* value */);  // Set catalog_type
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CreativeAssetsProductGroupsUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeAssetsProductGroupsUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsCreativeAssetsProductMetadata

```cpp
// Create a model
auto model = models::CatalogsCreativeAssetsProductMetadata();
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setVisibility(/* value */);  // Set visibility

// Serialize to JSON
nlohmann::json json = models::CatalogsCreativeAssetsProductMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsCreativeAssetsProductMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsDeleteCreativeAssetsItem

```cpp
// Create a model
auto model = models::CatalogsDeleteCreativeAssetsItem();
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsDeleteCreativeAssetsItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsDeleteCreativeAssetsItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsDeleteHotelItem

```cpp
// Create a model
auto model = models::CatalogsDeleteHotelItem();
model.setHotelId(/* value */);  // Set hotel_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsDeleteHotelItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsDeleteHotelItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsDeleteRetailItem

```cpp
// Create a model
auto model = models::CatalogsDeleteRetailItem();
model.setItemId(/* value */);  // Set item_id
model.setLastUpdatedTime(/* value */);  // Set last_updated_time
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsDeleteRetailItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsDeleteRetailItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeed

```cpp
// Create a model
auto model = models::CatalogsFeed();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreatedAt(/* value */);  // Set created_at
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setId(/* value */);  // Set id
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status
model.setUpdatedAt(/* value */);  // Set updated_at
model.setCatalogId(/* value */);  // Set catalog_id

// Serialize to JSON
nlohmann::json json = models::CatalogsFeed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedCreateRequestSchema

```cpp
// Create a model
auto model = models::CatalogsFeedCreateRequestSchema();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedCreateRequestSchema::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedCreateRequestSchema::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedCredentials

```cpp
// Create a model
auto model = models::CatalogsFeedCredentials();
model.setPassword(/* value */);  // Set password
model.setUsername(/* value */);  // Set username

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedCredentials::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedCredentials::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedIngestion

```cpp
// Create a model
auto model = models::CatalogsFeedIngestion();
model.setCreatedAt(/* value */);  // Set created_at
model.setFeedId(/* value */);  // Set feed_id
model.setId(/* value */);  // Set id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedIngestion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedIngestion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedIngestionDetails

```cpp
// Create a model
auto model = models::CatalogsFeedIngestionDetails();
model.setErrors(/* value */);  // Set errors
model.setInfo(/* value */);  // Set info
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedIngestionDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedIngestionDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedIngestionErrors

```cpp
// Create a model
auto model = models::CatalogsFeedIngestionErrors();
model.setACCOUNTFLAGGED(/* value */);  // Set ACCOUNT_FLAGGED
model.setFETCHGOOGLESHEETNOTSHARED(/* value */);  // Set FETCH_GOOGLE_SHEET_NOT_SHARED
model.setIMAGEFILENOTACCESSIBLE(/* value */);  // Set IMAGE_FILE_NOT_ACCESSIBLE
model.setIMAGEFILENOTFOUND(/* value */);  // Set IMAGE_FILE_NOT_FOUND
model.setIMAGEINVALIDFILE(/* value */);  // Set IMAGE_INVALID_FILE
model.setIMAGELEVELINTERNALERROR(/* value */);  // Set IMAGE_LEVEL_INTERNAL_ERROR
model.setIMAGEMALFORMEDURL(/* value */);  // Set IMAGE_MALFORMED_URL
model.setLARGEPRODUCTCOUNTDECREASE(/* value */);  // Set LARGE_PRODUCT_COUNT_DECREASE
model.setLINELEVELINTERNALERROR(/* value */);  // Set LINE_LEVEL_INTERNAL_ERROR

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedIngestionErrors::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedIngestionErrors::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedIngestionInfo

```cpp
// Create a model
auto model = models::CatalogsFeedIngestionInfo();
model.setINSTOCK(/* value */);  // Set IN_STOCK
model.setOUTOFSTOCK(/* value */);  // Set OUT_OF_STOCK
model.setPREORDER(/* value */);  // Set PREORDER

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedIngestionInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedIngestionInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedIngestionWarnings

```cpp
// Create a model
auto model = models::CatalogsFeedIngestionWarnings();
model.setADIMAGEDOWNLOADCONTENTREADERROR(/* value */);  // Set AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR
model.setADIMAGEDOWNLOADDNSLOOKUPERROR(/* value */);  // Set AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR
model.setADIMAGEDOWNLOADFILENOTACCESSIBLE(/* value */);  // Set AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE
model.setADIMAGEDOWNLOADFILENOTFOUND(/* value */);  // Set AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND
model.setADIMAGEDOWNLOADHTTPSTATUS400(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_400
model.setADIMAGEDOWNLOADHTTPSTATUS403(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_403
model.setADIMAGEDOWNLOADHTTPSTATUS404(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_404
model.setADIMAGEDOWNLOADHTTPSTATUS405(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_405
model.setADIMAGEDOWNLOADHTTPSTATUS410(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_410
model.setADIMAGEDOWNLOADHTTPSTATUS429(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_429
model.setADIMAGEDOWNLOADHTTPSTATUS500(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_500
model.setADIMAGEDOWNLOADHTTPSTATUS502(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_502
model.setADIMAGEDOWNLOADHTTPSTATUS503(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_503
model.setADIMAGEDOWNLOADHTTPSTATUS504(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_504
model.setADIMAGEDOWNLOADHTTPSTATUS507(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_507
model.setADIMAGEDOWNLOADHTTPSTATUS508(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_508
model.setADIMAGEDOWNLOADHTTPSTATUS520(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_520
model.setADIMAGEDOWNLOADHTTPSTATUS521(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_521
model.setADIMAGEDOWNLOADHTTPSTATUS522(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_522
model.setADIMAGEDOWNLOADHTTPSTATUS525(/* value */);  // Set AD_IMAGE_DOWNLOAD_HTTP_STATUS_525
model.setADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR(/* value */);  // Set AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR
model.setADIMAGEDOWNLOADINTERNALERROR(/* value */);  // Set AD_IMAGE_DOWNLOAD_INTERNAL_ERROR
model.setADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD(/* value */);  // Set AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD
model.setADIMAGEDOWNLOADINTERNALMALFORMEDURL(/* value */);  // Set AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL
model.setADIMAGEDOWNLOADINTERNALRATELIMITED(/* value */);  // Set AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED
model.setADIMAGEDOWNLOADINTERNALREQUESTEXPIRED(/* value */);  // Set AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED
model.setADIMAGEDOWNLOADINVALIDFILE(/* value */);  // Set AD_IMAGE_DOWNLOAD_INVALID_FILE
model.setADIMAGEDOWNLOADSITEERROR(/* value */);  // Set AD_IMAGE_DOWNLOAD_SITE_ERROR
model.setADIMAGEDOWNLOADSITETIMEOUT(/* value */);  // Set AD_IMAGE_DOWNLOAD_SITE_TIMEOUT
model.setADIMAGEDOWNLOADSSLERROR(/* value */);  // Set AD_IMAGE_DOWNLOAD_SSL_ERROR
model.setADIMAGEDOWNLOADSSLHANDSHAKEERROR(/* value */);  // Set AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR
model.setADIMAGEPROCESSINGEMPTYFILE(/* value */);  // Set AD_IMAGE_PROCESSING_EMPTY_FILE
model.setADIMAGEPROCESSINGHEIGHTTOOSMALL(/* value */);  // Set AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL
model.setADIMAGEPROCESSINGTOOMANYPIXELS(/* value */);  // Set AD_IMAGE_PROCESSING_TOO_MANY_PIXELS
model.setADIMAGEPROCESSINGTYPEMISMATCH(/* value */);  // Set AD_IMAGE_PROCESSING_TYPE_MISMATCH
model.setADIMAGEPROCESSINGWIDTHTOOSMALL(/* value */);  // Set AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL
model.setADVIDEODOWNLOADCONTENTREADERROR(/* value */);  // Set AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR
model.setADVIDEODOWNLOADDNSLOOKUPERROR(/* value */);  // Set AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR
model.setADVIDEODOWNLOADFILENOTACCESSIBLE(/* value */);  // Set AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE
model.setADVIDEODOWNLOADFILENOTFOUND(/* value */);  // Set AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND
model.setADVIDEODOWNLOADHTTPSTATUS400(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_400
model.setADVIDEODOWNLOADHTTPSTATUS403(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_403
model.setADVIDEODOWNLOADHTTPSTATUS404(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_404
model.setADVIDEODOWNLOADHTTPSTATUS405(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_405
model.setADVIDEODOWNLOADHTTPSTATUS410(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_410
model.setADVIDEODOWNLOADHTTPSTATUS429(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_429
model.setADVIDEODOWNLOADHTTPSTATUS500(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_500
model.setADVIDEODOWNLOADHTTPSTATUS502(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_502
model.setADVIDEODOWNLOADHTTPSTATUS503(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_503
model.setADVIDEODOWNLOADHTTPSTATUS504(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_504
model.setADVIDEODOWNLOADHTTPSTATUS507(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_507
model.setADVIDEODOWNLOADHTTPSTATUS508(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_508
model.setADVIDEODOWNLOADHTTPSTATUS520(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_520
model.setADVIDEODOWNLOADHTTPSTATUS521(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_521
model.setADVIDEODOWNLOADHTTPSTATUS522(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_522
model.setADVIDEODOWNLOADHTTPSTATUS525(/* value */);  // Set AD_VIDEO_DOWNLOAD_HTTP_STATUS_525
model.setADVIDEODOWNLOADINTERNALCONFIGURATIONERROR(/* value */);  // Set AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR
model.setADVIDEODOWNLOADINTERNALERROR(/* value */);  // Set AD_VIDEO_DOWNLOAD_INTERNAL_ERROR
model.setADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD(/* value */);  // Set AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD
model.setADVIDEODOWNLOADINTERNALMALFORMEDURL(/* value */);  // Set AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL
model.setADVIDEODOWNLOADINTERNALRATELIMITED(/* value */);  // Set AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED
model.setADVIDEODOWNLOADINTERNALREQUESTEXPIRED(/* value */);  // Set AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED
model.setADVIDEODOWNLOADINVALIDFILE(/* value */);  // Set AD_VIDEO_DOWNLOAD_INVALID_FILE
model.setADVIDEODOWNLOADSITEERROR(/* value */);  // Set AD_VIDEO_DOWNLOAD_SITE_ERROR
model.setADVIDEODOWNLOADSITETIMEOUT(/* value */);  // Set AD_VIDEO_DOWNLOAD_SITE_TIMEOUT
model.setADVIDEODOWNLOADSSLERROR(/* value */);  // Set AD_VIDEO_DOWNLOAD_SSL_ERROR
model.setADVIDEODOWNLOADSSLHANDSHAKEERROR(/* value */);  // Set AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR
model.setADVIDEOLENGTHTOOSHORT(/* value */);  // Set AD_VIDEO_LENGTH_TOO_SHORT
model.setADVIDEOPROCESSINGEMPTYFILE(/* value */);  // Set AD_VIDEO_PROCESSING_EMPTY_FILE
model.setADVIDEOPROCESSINGHEIGHTTOOSMALL(/* value */);  // Set AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL
model.setADVIDEOPROCESSINGTOOMANYPIXELS(/* value */);  // Set AD_VIDEO_PROCESSING_TOO_MANY_PIXELS
model.setADVIDEOPROCESSINGTYPEMISMATCH(/* value */);  // Set AD_VIDEO_PROCESSING_TYPE_MISMATCH
model.setADVIDEOPROCESSINGWIDTHTOOSMALL(/* value */);  // Set AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL
model.setADDITIONALIMAGEFILENOTACCESSIBLE(/* value */);  // Set ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
model.setADDITIONALIMAGEFILENOTFOUND(/* value */);  // Set ADDITIONAL_IMAGE_FILE_NOT_FOUND
model.setADDITIONALIMAGEINVALIDFILE(/* value */);  // Set ADDITIONAL_IMAGE_INVALID_FILE
model.setADDITIONALIMAGELEVELINTERNALERROR(/* value */);  // Set ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
model.setADDITIONALIMAGEMALFORMEDURL(/* value */);  // Set ADDITIONAL_IMAGE_MALFORMED_URL
model.setFETCHGOOGLESHEETPUBLICCANEDIT(/* value */);  // Set FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT
model.setHOTELPRICEHEADERISPRESENT(/* value */);  // Set HOTEL_PRICE_HEADER_IS_PRESENT
model.setVIDEODOWNLOADVIDEOTOOSHORT(/* value */);  // Set VIDEO_DOWNLOAD_VIDEO_TOO_SHORT
model.setVIDEOFILENOTACCESSIBLE(/* value */);  // Set VIDEO_FILE_NOT_ACCESSIBLE
model.setVIDEOFILENOTFOUND(/* value */);  // Set VIDEO_FILE_NOT_FOUND
model.setVIDEOINVALIDFILE(/* value */);  // Set VIDEO_INVALID_FILE
model.setVIDEOLEVELINTERNALERROR(/* value */);  // Set VIDEO_LEVEL_INTERNAL_ERROR
model.setVIDEOMALFORMEDURL(/* value */);  // Set VIDEO_MALFORMED_URL

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedIngestionWarnings::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedIngestionWarnings::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedProcessingResult

```cpp
// Create a model
auto model = models::CatalogsFeedProcessingResult();
model.setCreatedAt(/* value */);  // Set created_at
model.setId(/* value */);  // Set id
model.setIngestionDetails(/* value */);  // Set ingestion_details
model.setProductCounts(/* value */);  // Set product_counts
model.setStatus(/* value */);  // Set status
model.setUpdatedAt(/* value */);  // Set updated_at
model.setValidationDetails(/* value */);  // Set validation_details
model.setVideoCounts(/* value */);  // Set video_counts

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedProcessingResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedProcessingResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProcessingSchedule

```cpp
// Create a model
auto model = models::CatalogsProcessingSchedule();
model.setTime(/* value */);  // Set time
model.setTimezone(/* value */);  // Set timezone

// Serialize to JSON
nlohmann::json json = models::CatalogsProcessingSchedule::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProcessingSchedule::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedProcessingScheduleTimezone

```cpp
// Create a model
auto model = models::CatalogsFeedProcessingScheduleTimezone();

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedProcessingScheduleTimezone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedProcessingScheduleTimezone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedProcessingStatus

```cpp
// Create a model
auto model = models::CatalogsFeedProcessingStatus();

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedProcessingStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedProcessingStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedProductCounts

```cpp
// Create a model
auto model = models::CatalogsFeedProductCounts();
model.setIngested(/* value */);  // Set ingested
model.setOriginal(/* value */);  // Set original

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedProductCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedProductCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedUpdateRequestSchema

```cpp
// Create a model
auto model = models::CatalogsFeedUpdateRequestSchema();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedUpdateRequestSchema::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedUpdateRequestSchema::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedValidationDetails

```cpp
// Create a model
auto model = models::CatalogsFeedValidationDetails();
model.setErrors(/* value */);  // Set errors
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedValidationDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedValidationDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedValidationErrors

```cpp
// Create a model
auto model = models::CatalogsFeedValidationErrors();
model.setADULTINVALID(/* value */);  // Set ADULT_INVALID
model.setADWORDSFORMATINVALID(/* value */);  // Set ADWORDS_FORMAT_INVALID
model.setAVAILABILITYINVALID(/* value */);  // Set AVAILABILITY_INVALID
model.setBLOCKLISTEDIMAGESIGNATURE(/* value */);  // Set BLOCKLISTED_IMAGE_SIGNATURE
model.setDELIMITERERROR(/* value */);  // Set DELIMITER_ERROR
model.setDESCRIPTIONMISSING(/* value */);  // Set DESCRIPTION_MISSING
model.setDUPLICATEPRODUCTS(/* value */);  // Set DUPLICATE_PRODUCTS
model.setENCODINGERROR(/* value */);  // Set ENCODING_ERROR
model.setFEEDLENGTHTOOLONG(/* value */);  // Set FEED_LENGTH_TOO_LONG
model.setFEEDTOOSMALL(/* value */);  // Set FEED_TOO_SMALL
model.setFETCHERROR(/* value */);  // Set FETCH_ERROR
model.setFETCHINACTIVEFEEDERROR(/* value */);  // Set FETCH_INACTIVE_FEED_ERROR
model.setIMAGELINKINVALID(/* value */);  // Set IMAGE_LINK_INVALID
model.setIMAGELINKLENGTHTOOLONG(/* value */);  // Set IMAGE_LINK_LENGTH_TOO_LONG
model.setIMAGELINKMISSING(/* value */);  // Set IMAGE_LINK_MISSING
model.setINTERNALSERVICEERROR(/* value */);  // Set INTERNAL_SERVICE_ERROR
model.setINVALIDDOMAIN(/* value */);  // Set INVALID_DOMAIN
model.setITEMMAINIMAGEDOWNLOADFAILURE(/* value */);  // Set ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
model.setITEMIDMISSING(/* value */);  // Set ITEMID_MISSING
model.setLINKFORMATINVALID(/* value */);  // Set LINK_FORMAT_INVALID
model.setLINKLENGTHTOOLONG(/* value */);  // Set LINK_LENGTH_TOO_LONG
model.setLISTPRICEINVALID(/* value */);  // Set LIST_PRICE_INVALID
model.setMALFORMEDXML(/* value */);  // Set MALFORMED_XML
model.setMAXITEMSPERITEMGROUPEXCEEDED(/* value */);  // Set MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
model.setNOVERIFIEDDOMAIN(/* value */);  // Set NO_VERIFIED_DOMAIN
model.setPARSELINEERROR(/* value */);  // Set PARSE_LINE_ERROR
model.setPINJOINCONTENTUNSAFE(/* value */);  // Set PINJOIN_CONTENT_UNSAFE
model.setPRICECANNOTBEDETERMINED(/* value */);  // Set PRICE_CANNOT_BE_DETERMINED
model.setPRICEMISSING(/* value */);  // Set PRICE_MISSING
model.setPRODUCTLINKMISSING(/* value */);  // Set PRODUCT_LINK_MISSING
model.setPRODUCTPRICEINVALID(/* value */);  // Set PRODUCT_PRICE_INVALID
model.setREQUIREDCOLUMNSMISSING(/* value */);  // Set REQUIRED_COLUMNS_MISSING
model.setTITLEMISSING(/* value */);  // Set TITLE_MISSING

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedValidationErrors::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedValidationErrors::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedValidationWarnings

```cpp
// Create a model
auto model = models::CatalogsFeedValidationWarnings();
model.setADIMAGE0LINKDUPLICATED(/* value */);  // Set AD_IMAGE_0_LINK_DUPLICATED
model.setADIMAGE0LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_0_LINK_LENGTH_TOO_LONG
model.setADIMAGE0LINKREQUIRED(/* value */);  // Set AD_IMAGE_0_LINK_REQUIRED
model.setADIMAGE0LINKWARNING(/* value */);  // Set AD_IMAGE_0_LINK_WARNING
model.setADIMAGE0TAGDUPLICATED(/* value */);  // Set AD_IMAGE_0_TAG_DUPLICATED
model.setADIMAGE0TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_0_TAG_LENGTH_TOO_LONG
model.setADIMAGE0TAGREQUIRED(/* value */);  // Set AD_IMAGE_0_TAG_REQUIRED
model.setADIMAGE10LINKDUPLICATED(/* value */);  // Set AD_IMAGE_10_LINK_DUPLICATED
model.setADIMAGE10LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_10_LINK_LENGTH_TOO_LONG
model.setADIMAGE10LINKREQUIRED(/* value */);  // Set AD_IMAGE_10_LINK_REQUIRED
model.setADIMAGE10LINKWARNING(/* value */);  // Set AD_IMAGE_10_LINK_WARNING
model.setADIMAGE10TAGDUPLICATED(/* value */);  // Set AD_IMAGE_10_TAG_DUPLICATED
model.setADIMAGE10TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_10_TAG_LENGTH_TOO_LONG
model.setADIMAGE10TAGREQUIRED(/* value */);  // Set AD_IMAGE_10_TAG_REQUIRED
model.setADIMAGE11LINKDUPLICATED(/* value */);  // Set AD_IMAGE_11_LINK_DUPLICATED
model.setADIMAGE11LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_11_LINK_LENGTH_TOO_LONG
model.setADIMAGE11LINKREQUIRED(/* value */);  // Set AD_IMAGE_11_LINK_REQUIRED
model.setADIMAGE11LINKWARNING(/* value */);  // Set AD_IMAGE_11_LINK_WARNING
model.setADIMAGE11TAGDUPLICATED(/* value */);  // Set AD_IMAGE_11_TAG_DUPLICATED
model.setADIMAGE11TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_11_TAG_LENGTH_TOO_LONG
model.setADIMAGE11TAGREQUIRED(/* value */);  // Set AD_IMAGE_11_TAG_REQUIRED
model.setADIMAGE12LINKDUPLICATED(/* value */);  // Set AD_IMAGE_12_LINK_DUPLICATED
model.setADIMAGE12LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_12_LINK_LENGTH_TOO_LONG
model.setADIMAGE12LINKREQUIRED(/* value */);  // Set AD_IMAGE_12_LINK_REQUIRED
model.setADIMAGE12LINKWARNING(/* value */);  // Set AD_IMAGE_12_LINK_WARNING
model.setADIMAGE12TAGDUPLICATED(/* value */);  // Set AD_IMAGE_12_TAG_DUPLICATED
model.setADIMAGE12TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_12_TAG_LENGTH_TOO_LONG
model.setADIMAGE12TAGREQUIRED(/* value */);  // Set AD_IMAGE_12_TAG_REQUIRED
model.setADIMAGE13LINKDUPLICATED(/* value */);  // Set AD_IMAGE_13_LINK_DUPLICATED
model.setADIMAGE13LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_13_LINK_LENGTH_TOO_LONG
model.setADIMAGE13LINKREQUIRED(/* value */);  // Set AD_IMAGE_13_LINK_REQUIRED
model.setADIMAGE13LINKWARNING(/* value */);  // Set AD_IMAGE_13_LINK_WARNING
model.setADIMAGE13TAGDUPLICATED(/* value */);  // Set AD_IMAGE_13_TAG_DUPLICATED
model.setADIMAGE13TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_13_TAG_LENGTH_TOO_LONG
model.setADIMAGE13TAGREQUIRED(/* value */);  // Set AD_IMAGE_13_TAG_REQUIRED
model.setADIMAGE14LINKDUPLICATED(/* value */);  // Set AD_IMAGE_14_LINK_DUPLICATED
model.setADIMAGE14LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_14_LINK_LENGTH_TOO_LONG
model.setADIMAGE14LINKREQUIRED(/* value */);  // Set AD_IMAGE_14_LINK_REQUIRED
model.setADIMAGE14LINKWARNING(/* value */);  // Set AD_IMAGE_14_LINK_WARNING
model.setADIMAGE14TAGDUPLICATED(/* value */);  // Set AD_IMAGE_14_TAG_DUPLICATED
model.setADIMAGE14TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_14_TAG_LENGTH_TOO_LONG
model.setADIMAGE14TAGREQUIRED(/* value */);  // Set AD_IMAGE_14_TAG_REQUIRED
model.setADIMAGE15LINKDUPLICATED(/* value */);  // Set AD_IMAGE_15_LINK_DUPLICATED
model.setADIMAGE15LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_15_LINK_LENGTH_TOO_LONG
model.setADIMAGE15LINKREQUIRED(/* value */);  // Set AD_IMAGE_15_LINK_REQUIRED
model.setADIMAGE15LINKWARNING(/* value */);  // Set AD_IMAGE_15_LINK_WARNING
model.setADIMAGE15TAGDUPLICATED(/* value */);  // Set AD_IMAGE_15_TAG_DUPLICATED
model.setADIMAGE15TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_15_TAG_LENGTH_TOO_LONG
model.setADIMAGE15TAGREQUIRED(/* value */);  // Set AD_IMAGE_15_TAG_REQUIRED
model.setADIMAGE16LINKDUPLICATED(/* value */);  // Set AD_IMAGE_16_LINK_DUPLICATED
model.setADIMAGE16LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_16_LINK_LENGTH_TOO_LONG
model.setADIMAGE16LINKREQUIRED(/* value */);  // Set AD_IMAGE_16_LINK_REQUIRED
model.setADIMAGE16LINKWARNING(/* value */);  // Set AD_IMAGE_16_LINK_WARNING
model.setADIMAGE16TAGDUPLICATED(/* value */);  // Set AD_IMAGE_16_TAG_DUPLICATED
model.setADIMAGE16TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_16_TAG_LENGTH_TOO_LONG
model.setADIMAGE16TAGREQUIRED(/* value */);  // Set AD_IMAGE_16_TAG_REQUIRED
model.setADIMAGE17LINKDUPLICATED(/* value */);  // Set AD_IMAGE_17_LINK_DUPLICATED
model.setADIMAGE17LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_17_LINK_LENGTH_TOO_LONG
model.setADIMAGE17LINKREQUIRED(/* value */);  // Set AD_IMAGE_17_LINK_REQUIRED
model.setADIMAGE17LINKWARNING(/* value */);  // Set AD_IMAGE_17_LINK_WARNING
model.setADIMAGE17TAGDUPLICATED(/* value */);  // Set AD_IMAGE_17_TAG_DUPLICATED
model.setADIMAGE17TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_17_TAG_LENGTH_TOO_LONG
model.setADIMAGE17TAGREQUIRED(/* value */);  // Set AD_IMAGE_17_TAG_REQUIRED
model.setADIMAGE18LINKDUPLICATED(/* value */);  // Set AD_IMAGE_18_LINK_DUPLICATED
model.setADIMAGE18LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_18_LINK_LENGTH_TOO_LONG
model.setADIMAGE18LINKREQUIRED(/* value */);  // Set AD_IMAGE_18_LINK_REQUIRED
model.setADIMAGE18LINKWARNING(/* value */);  // Set AD_IMAGE_18_LINK_WARNING
model.setADIMAGE18TAGDUPLICATED(/* value */);  // Set AD_IMAGE_18_TAG_DUPLICATED
model.setADIMAGE18TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_18_TAG_LENGTH_TOO_LONG
model.setADIMAGE18TAGREQUIRED(/* value */);  // Set AD_IMAGE_18_TAG_REQUIRED
model.setADIMAGE19LINKDUPLICATED(/* value */);  // Set AD_IMAGE_19_LINK_DUPLICATED
model.setADIMAGE19LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_19_LINK_LENGTH_TOO_LONG
model.setADIMAGE19LINKREQUIRED(/* value */);  // Set AD_IMAGE_19_LINK_REQUIRED
model.setADIMAGE19LINKWARNING(/* value */);  // Set AD_IMAGE_19_LINK_WARNING
model.setADIMAGE19TAGDUPLICATED(/* value */);  // Set AD_IMAGE_19_TAG_DUPLICATED
model.setADIMAGE19TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_19_TAG_LENGTH_TOO_LONG
model.setADIMAGE19TAGREQUIRED(/* value */);  // Set AD_IMAGE_19_TAG_REQUIRED
model.setADIMAGE1LINKDUPLICATED(/* value */);  // Set AD_IMAGE_1_LINK_DUPLICATED
model.setADIMAGE1LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_1_LINK_LENGTH_TOO_LONG
model.setADIMAGE1LINKREQUIRED(/* value */);  // Set AD_IMAGE_1_LINK_REQUIRED
model.setADIMAGE1LINKWARNING(/* value */);  // Set AD_IMAGE_1_LINK_WARNING
model.setADIMAGE1TAGDUPLICATED(/* value */);  // Set AD_IMAGE_1_TAG_DUPLICATED
model.setADIMAGE1TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_1_TAG_LENGTH_TOO_LONG
model.setADIMAGE1TAGREQUIRED(/* value */);  // Set AD_IMAGE_1_TAG_REQUIRED
model.setADIMAGE2LINKDUPLICATED(/* value */);  // Set AD_IMAGE_2_LINK_DUPLICATED
model.setADIMAGE2LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_2_LINK_LENGTH_TOO_LONG
model.setADIMAGE2LINKREQUIRED(/* value */);  // Set AD_IMAGE_2_LINK_REQUIRED
model.setADIMAGE2LINKWARNING(/* value */);  // Set AD_IMAGE_2_LINK_WARNING
model.setADIMAGE2TAGDUPLICATED(/* value */);  // Set AD_IMAGE_2_TAG_DUPLICATED
model.setADIMAGE2TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_2_TAG_LENGTH_TOO_LONG
model.setADIMAGE2TAGREQUIRED(/* value */);  // Set AD_IMAGE_2_TAG_REQUIRED
model.setADIMAGE3LINKDUPLICATED(/* value */);  // Set AD_IMAGE_3_LINK_DUPLICATED
model.setADIMAGE3LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_3_LINK_LENGTH_TOO_LONG
model.setADIMAGE3LINKREQUIRED(/* value */);  // Set AD_IMAGE_3_LINK_REQUIRED
model.setADIMAGE3LINKWARNING(/* value */);  // Set AD_IMAGE_3_LINK_WARNING
model.setADIMAGE3TAGDUPLICATED(/* value */);  // Set AD_IMAGE_3_TAG_DUPLICATED
model.setADIMAGE3TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_3_TAG_LENGTH_TOO_LONG
model.setADIMAGE3TAGREQUIRED(/* value */);  // Set AD_IMAGE_3_TAG_REQUIRED
model.setADIMAGE4LINKDUPLICATED(/* value */);  // Set AD_IMAGE_4_LINK_DUPLICATED
model.setADIMAGE4LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_4_LINK_LENGTH_TOO_LONG
model.setADIMAGE4LINKREQUIRED(/* value */);  // Set AD_IMAGE_4_LINK_REQUIRED
model.setADIMAGE4LINKWARNING(/* value */);  // Set AD_IMAGE_4_LINK_WARNING
model.setADIMAGE4TAGDUPLICATED(/* value */);  // Set AD_IMAGE_4_TAG_DUPLICATED
model.setADIMAGE4TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_4_TAG_LENGTH_TOO_LONG
model.setADIMAGE4TAGREQUIRED(/* value */);  // Set AD_IMAGE_4_TAG_REQUIRED
model.setADIMAGE5LINKDUPLICATED(/* value */);  // Set AD_IMAGE_5_LINK_DUPLICATED
model.setADIMAGE5LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_5_LINK_LENGTH_TOO_LONG
model.setADIMAGE5LINKREQUIRED(/* value */);  // Set AD_IMAGE_5_LINK_REQUIRED
model.setADIMAGE5LINKWARNING(/* value */);  // Set AD_IMAGE_5_LINK_WARNING
model.setADIMAGE5TAGDUPLICATED(/* value */);  // Set AD_IMAGE_5_TAG_DUPLICATED
model.setADIMAGE5TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_5_TAG_LENGTH_TOO_LONG
model.setADIMAGE5TAGREQUIRED(/* value */);  // Set AD_IMAGE_5_TAG_REQUIRED
model.setADIMAGE6LINKDUPLICATED(/* value */);  // Set AD_IMAGE_6_LINK_DUPLICATED
model.setADIMAGE6LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_6_LINK_LENGTH_TOO_LONG
model.setADIMAGE6LINKREQUIRED(/* value */);  // Set AD_IMAGE_6_LINK_REQUIRED
model.setADIMAGE6LINKWARNING(/* value */);  // Set AD_IMAGE_6_LINK_WARNING
model.setADIMAGE6TAGDUPLICATED(/* value */);  // Set AD_IMAGE_6_TAG_DUPLICATED
model.setADIMAGE6TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_6_TAG_LENGTH_TOO_LONG
model.setADIMAGE6TAGREQUIRED(/* value */);  // Set AD_IMAGE_6_TAG_REQUIRED
model.setADIMAGE7LINKDUPLICATED(/* value */);  // Set AD_IMAGE_7_LINK_DUPLICATED
model.setADIMAGE7LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_7_LINK_LENGTH_TOO_LONG
model.setADIMAGE7LINKREQUIRED(/* value */);  // Set AD_IMAGE_7_LINK_REQUIRED
model.setADIMAGE7LINKWARNING(/* value */);  // Set AD_IMAGE_7_LINK_WARNING
model.setADIMAGE7TAGDUPLICATED(/* value */);  // Set AD_IMAGE_7_TAG_DUPLICATED
model.setADIMAGE7TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_7_TAG_LENGTH_TOO_LONG
model.setADIMAGE7TAGREQUIRED(/* value */);  // Set AD_IMAGE_7_TAG_REQUIRED
model.setADIMAGE8LINKDUPLICATED(/* value */);  // Set AD_IMAGE_8_LINK_DUPLICATED
model.setADIMAGE8LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_8_LINK_LENGTH_TOO_LONG
model.setADIMAGE8LINKREQUIRED(/* value */);  // Set AD_IMAGE_8_LINK_REQUIRED
model.setADIMAGE8LINKWARNING(/* value */);  // Set AD_IMAGE_8_LINK_WARNING
model.setADIMAGE8TAGDUPLICATED(/* value */);  // Set AD_IMAGE_8_TAG_DUPLICATED
model.setADIMAGE8TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_8_TAG_LENGTH_TOO_LONG
model.setADIMAGE8TAGREQUIRED(/* value */);  // Set AD_IMAGE_8_TAG_REQUIRED
model.setADIMAGE9LINKDUPLICATED(/* value */);  // Set AD_IMAGE_9_LINK_DUPLICATED
model.setADIMAGE9LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_9_LINK_LENGTH_TOO_LONG
model.setADIMAGE9LINKREQUIRED(/* value */);  // Set AD_IMAGE_9_LINK_REQUIRED
model.setADIMAGE9LINKWARNING(/* value */);  // Set AD_IMAGE_9_LINK_WARNING
model.setADIMAGE9TAGDUPLICATED(/* value */);  // Set AD_IMAGE_9_TAG_DUPLICATED
model.setADIMAGE9TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_9_TAG_LENGTH_TOO_LONG
model.setADIMAGE9TAGREQUIRED(/* value */);  // Set AD_IMAGE_9_TAG_REQUIRED
model.setADLINKFORMATWARNING(/* value */);  // Set AD_LINK_FORMAT_WARNING
model.setADLINKSAMEASLINK(/* value */);  // Set AD_LINK_SAME_AS_LINK
model.setADVIDEO0LINKDUPLICATED(/* value */);  // Set AD_VIDEO_0_LINK_DUPLICATED
model.setADVIDEO0LINKLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_0_LINK_LENGTH_TOO_LONG
model.setADVIDEO0LINKREQUIRED(/* value */);  // Set AD_VIDEO_0_LINK_REQUIRED
model.setADVIDEO0LINKWARNING(/* value */);  // Set AD_VIDEO_0_LINK_WARNING
model.setADVIDEO0TAGDUPLICATED(/* value */);  // Set AD_VIDEO_0_TAG_DUPLICATED
model.setADVIDEO0TAGLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_0_TAG_LENGTH_TOO_LONG
model.setADVIDEO0TAGREQUIRED(/* value */);  // Set AD_VIDEO_0_TAG_REQUIRED
model.setADVIDEO1LINKDUPLICATED(/* value */);  // Set AD_VIDEO_1_LINK_DUPLICATED
model.setADVIDEO1LINKLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_1_LINK_LENGTH_TOO_LONG
model.setADVIDEO1LINKREQUIRED(/* value */);  // Set AD_VIDEO_1_LINK_REQUIRED
model.setADVIDEO1LINKWARNING(/* value */);  // Set AD_VIDEO_1_LINK_WARNING
model.setADVIDEO1TAGDUPLICATED(/* value */);  // Set AD_VIDEO_1_TAG_DUPLICATED
model.setADVIDEO1TAGLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_1_TAG_LENGTH_TOO_LONG
model.setADVIDEO1TAGREQUIRED(/* value */);  // Set AD_VIDEO_1_TAG_REQUIRED
model.setADVIDEO2LINKDUPLICATED(/* value */);  // Set AD_VIDEO_2_LINK_DUPLICATED
model.setADVIDEO2LINKLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_2_LINK_LENGTH_TOO_LONG
model.setADVIDEO2LINKREQUIRED(/* value */);  // Set AD_VIDEO_2_LINK_REQUIRED
model.setADVIDEO2LINKWARNING(/* value */);  // Set AD_VIDEO_2_LINK_WARNING
model.setADVIDEO2TAGDUPLICATED(/* value */);  // Set AD_VIDEO_2_TAG_DUPLICATED
model.setADVIDEO2TAGLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_2_TAG_LENGTH_TOO_LONG
model.setADVIDEO2TAGREQUIRED(/* value */);  // Set AD_VIDEO_2_TAG_REQUIRED
model.setADDITIONALIMAGELINKLENGTHTOOLONG(/* value */);  // Set ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
model.setADDITIONALIMAGELINKWARNING(/* value */);  // Set ADDITIONAL_IMAGE_LINK_WARNING
model.setADWORDSFORMATWARNING(/* value */);  // Set ADWORDS_FORMAT_WARNING
model.setADWORDSSAMEASLINK(/* value */);  // Set ADWORDS_SAME_AS_LINK
model.setAGEGROUPINVALID(/* value */);  // Set AGE_GROUP_INVALID
model.setANDROIDDEEPLINKINVALID(/* value */);  // Set ANDROID_DEEP_LINK_INVALID
model.setAVAILABILITYDATEINVALID(/* value */);  // Set AVAILABILITY_DATE_INVALID
model.setCOUNTRYDOESNOTMAPTOCURRENCY(/* value */);  // Set COUNTRY_DOES_NOT_MAP_TO_CURRENCY
model.setCUSTOMLABELLENGTHTOOLONG(/* value */);  // Set CUSTOM_LABEL_LENGTH_TOO_LONG
model.setDESCRIPTIONLENGTHTOOLONG(/* value */);  // Set DESCRIPTION_LENGTH_TOO_LONG
model.setDUPLICATEHEADERS(/* value */);  // Set DUPLICATE_HEADERS
model.setEXPIRATIONDATEINVALID(/* value */);  // Set EXPIRATION_DATE_INVALID
model.setFETCHSAMESIGNATURE(/* value */);  // Set FETCH_SAME_SIGNATURE
model.setGENDERINVALID(/* value */);  // Set GENDER_INVALID
model.setGTININVALID(/* value */);  // Set GTIN_INVALID
model.setIMAGELINKWARNING(/* value */);  // Set IMAGE_LINK_WARNING
model.setINCONSISTENTCURRENCYVALUES(/* value */);  // Set INCONSISTENT_CURRENCY_VALUES
model.setINDEXEDPRODUCTCOUNTLARGEDELTA(/* value */);  // Set INDEXED_PRODUCT_COUNT_LARGE_DELTA
model.setIOSDEEPLINKINVALID(/* value */);  // Set IOS_DEEP_LINK_INVALID
model.setISBUNDLEINVALID(/* value */);  // Set IS_BUNDLE_INVALID
model.setITEMADDITIONALIMAGEDOWNLOADFAILURE(/* value */);  // Set ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
model.setLINKFORMATWARNING(/* value */);  // Set LINK_FORMAT_WARNING
model.setMINADPRICEINVALID(/* value */);  // Set MIN_AD_PRICE_INVALID
model.setMPNINVALID(/* value */);  // Set MPN_INVALID
model.setMULTIPACKINVALID(/* value */);  // Set MULTIPACK_INVALID
model.setOPTIONALCONDITIONINVALID(/* value */);  // Set OPTIONAL_CONDITION_INVALID
model.setOPTIONALCONDITIONMISSING(/* value */);  // Set OPTIONAL_CONDITION_MISSING
model.setOPTIONALPRODUCTCATEGORYINVALID(/* value */);  // Set OPTIONAL_PRODUCT_CATEGORY_INVALID
model.setOPTIONALPRODUCTCATEGORYMISSING(/* value */);  // Set OPTIONAL_PRODUCT_CATEGORY_MISSING
model.setPRODUCTCATEGORYDEPTHWARNING(/* value */);  // Set PRODUCT_CATEGORY_DEPTH_WARNING
model.setPRODUCTTYPELENGTHTOOLONG(/* value */);  // Set PRODUCT_TYPE_LENGTH_TOO_LONG
model.setSALEDATEINVALID(/* value */);  // Set SALE_DATE_INVALID
model.setSALESPRICEINVALID(/* value */);  // Set SALES_PRICE_INVALID
model.setSALESPRICETOOHIGH(/* value */);  // Set SALES_PRICE_TOO_HIGH
model.setSALESPRICETOOLOW(/* value */);  // Set SALES_PRICE_TOO_LOW
model.setSHIPPINGHEIGHTINVALID(/* value */);  // Set SHIPPING_HEIGHT_INVALID
model.setSHIPPINGINVALID(/* value */);  // Set SHIPPING_INVALID
model.setSHIPPINGWEIGHTINVALID(/* value */);  // Set SHIPPING_WEIGHT_INVALID
model.setSHIPPINGWIDTHINVALID(/* value */);  // Set SHIPPING_WIDTH_INVALID
model.setSIZESYSTEMINVALID(/* value */);  // Set SIZE_SYSTEM_INVALID
model.setSIZETYPEINVALID(/* value */);  // Set SIZE_TYPE_INVALID
model.setTAXINVALID(/* value */);  // Set TAX_INVALID
model.setTITLELENGTHTOOLONG(/* value */);  // Set TITLE_LENGTH_TOO_LONG
model.setTOOMANYADDITIONALIMAGELINKS(/* value */);  // Set TOO_MANY_ADDITIONAL_IMAGE_LINKS
model.setUPDATEDTIMEINVALID(/* value */);  // Set UPDATED_TIME_INVALID
model.setUTMSOURCEAUTOCORRECTED(/* value */);  // Set UTM_SOURCE_AUTO_CORRECTED
model.setVIDEOREQUIREDWHENADVIDEOPROVIDED(/* value */);  // Set VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED
model.setWEIGHTUNITINVALID(/* value */);  // Set WEIGHT_UNIT_INVALID

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedValidationWarnings::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedValidationWarnings::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedVideoCounts

```cpp
// Create a model
auto model = models::CatalogsFeedVideoCounts();
model.setIngestedVideos(/* value */);  // Set ingested_videos
model.setNotIngestedVideos(/* value */);  // Set not_ingested_videos
model.setTotalVideos(/* value */);  // Set total_videos

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedVideoCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedVideoCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LegacyRetailOnly

```cpp
// Create a model
auto model = models::LegacyRetailOnly();
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::LegacyRetailOnly::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LegacyRetailOnly::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedsCreateRequestDefaultLocale

```cpp
// Create a model
auto model = models::CatalogsFeedsCreateRequestDefaultLocale();

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedsCreateRequestDefaultLocale::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedsCreateRequestDefaultLocale::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LegacyRetailOnly

```cpp
// Create a model
auto model = models::LegacyRetailOnly();
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::LegacyRetailOnly::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LegacyRetailOnly::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFormat

```cpp
// Create a model
auto model = models::CatalogsFormat();

// Serialize to JSON
nlohmann::json json = models::CatalogsFormat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFormat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelAddress

```cpp
// Create a model
auto model = models::CatalogsHotelAddress();
model.setAddr1(/* value */);  // Set addr1
model.setCity(/* value */);  // Set city
model.setCountry(/* value */);  // Set country
model.setPostalCode(/* value */);  // Set postal_code
model.setRegion(/* value */);  // Set region

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelAddress::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelAddress::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelAttributes

```cpp
// Create a model
auto model = models::CatalogsHotelAttributes();
model.setAdditionalImageLink(/* value */);  // Set additional_image_link
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setMainImage(/* value */);  // Set main_image

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelAttributes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelAttributes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelAvailableFilterValues

```cpp
// Create a model
auto model = models::CatalogsHotelAvailableFilterValues();
model.setCatalogType(/* value */);  // Set catalog_type
model.setFilterValues(/* value */);  // Set filter_values

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelAvailableFilterValues::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelAvailableFilterValues::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelBatchItem

```cpp
// Create a model
auto model = models::CatalogsHotelBatchItem();
model.setAttributes(/* value */);  // Set attributes
model.setHotelId(/* value */);  // Set hotel_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelBatchItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelBatchItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelBatchRequest

```cpp
// Create a model
auto model = models::CatalogsHotelBatchRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelFeed

```cpp
// Create a model
auto model = models::CatalogsHotelFeed();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreatedAt(/* value */);  // Set created_at
model.setCredentials(/* value */);  // Set credentials
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setId(/* value */);  // Set id
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelFeed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelFeed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedsHotelCreateRequest

```cpp
// Create a model
auto model = models::FeedsHotelCreateRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::FeedsHotelCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedsHotelCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelFeedsCreateRequestDefaultLocale

```cpp
// Create a model
auto model = models::CatalogsHotelFeedsCreateRequestDefaultLocale();

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelFeedsCreateRequestDefaultLocale::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelFeedsCreateRequestDefaultLocale::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedsUpdateRequest

```cpp
// Create a model
auto model = models::CatalogsFeedsUpdateRequest();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedsUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedsUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelFilterValuesMap

```cpp
// Create a model
auto model = models::CatalogsHotelFilterValuesMap();
model.setBrand(/* value */);  // Set brand
model.setCustomLabel0(/* value */);  // Set custom_label_0
model.setCustomLabel1(/* value */);  // Set custom_label_1
model.setCustomLabel2(/* value */);  // Set custom_label_2
model.setCustomLabel3(/* value */);  // Set custom_label_3
model.setCustomLabel4(/* value */);  // Set custom_label_4

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelFilterValuesMap::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelFilterValuesMap::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelGuestRatings

```cpp
// Create a model
auto model = models::CatalogsHotelGuestRatings();
model.setMaxScore(/* value */);  // Set max_score
model.setNumberOfReviewers(/* value */);  // Set number_of_reviewers
model.setRatingSystem(/* value */);  // Set rating_system
model.setScore(/* value */);  // Set score

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelGuestRatings::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelGuestRatings::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelItemErrorResponse

```cpp
// Create a model
auto model = models::CatalogsHotelItemErrorResponse();
model.setCatalogType(/* value */);  // Set catalog_type
model.setErrors(/* value */);  // Set errors
model.setHotelId(/* value */);  // Set hotel_id
model.setItemResponseKind(/* value */);  // Set item_response_kind

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelItemErrorResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelItemErrorResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelItemResponse

```cpp
// Create a model
auto model = models::CatalogsHotelItemResponse();
model.setAttributes(/* value */);  // Set attributes
model.setCatalogType(/* value */);  // Set catalog_type
model.setHotelId(/* value */);  // Set hotel_id
model.setItemResponseKind(/* value */);  // Set item_response_kind
model.setPins(/* value */);  // Set pins

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelItemResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelItemResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelItemsBatch

```cpp
// Create a model
auto model = models::CatalogsHotelItemsBatch();
model.setBatchId(/* value */);  // Set batch_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCompletedTime(/* value */);  // Set completed_time
model.setCreatedTime(/* value */);  // Set created_time
model.setItems(/* value */);  // Set items
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelItemsBatch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelItemsBatch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelItemsPostFilter

```cpp
// Create a model
auto model = models::CatalogsHotelItemsPostFilter();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setHotelIds(/* value */);  // Set hotel_ids

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelItemsPostFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelItemsPostFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HotelListProductsByCatalogBasedFilterRequest

```cpp
// Create a model
auto model = models::HotelListProductsByCatalogBasedFilterRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setFilters(/* value */);  // Set filters

// Serialize to JSON
nlohmann::json json = models::HotelListProductsByCatalogBasedFilterRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HotelListProductsByCatalogBasedFilterRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelMainImage

```cpp
// Create a model
auto model = models::CatalogsHotelMainImage();
model.setLink(/* value */);  // Set link
model.setTag(/* value */);  // Set tag

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelMainImage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelMainImage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelProduct

```cpp
// Create a model
auto model = models::CatalogsHotelProduct();
model.setCatalogType(/* value */);  // Set catalog_type
model.setMetadata(/* value */);  // Set metadata
model.setPin(/* value */);  // Set pin

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelProduct::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelProduct::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HotelProductGroup

```cpp
// Create a model
auto model = models::HotelProductGroup();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreatedAt(/* value */);  // Set created_at
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setType(/* value */);  // Set type
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::HotelProductGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HotelProductGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HotelProductGroupsCreateRequest

```cpp
// Create a model
auto model = models::HotelProductGroupsCreateRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::HotelProductGroupsCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HotelProductGroupsCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupKeys

```cpp
// Create a model
auto model = models::CatalogsProductGroupKeys();
model.setPRICE(/* value */);  // Set PRICE
model.setHOTELID(/* value */);  // Set HOTEL_ID
model.setBRAND(/* value */);  // Set BRAND
model.setCUSTOMLABEL0(/* value */);  // Set CUSTOM_LABEL_0
model.setCUSTOMLABEL1(/* value */);  // Set CUSTOM_LABEL_1
model.setCUSTOMLABEL2(/* value */);  // Set CUSTOM_LABEL_2
model.setCUSTOMLABEL3(/* value */);  // Set CUSTOM_LABEL_3
model.setCUSTOMLABEL4(/* value */);  // Set CUSTOM_LABEL_4
model.setCOUNTRY(/* value */);  // Set COUNTRY
model.setTITLEKEYWORDS(/* value */);  // Set TITLE_KEYWORDS

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupKeys::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupKeys::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupFilters

```cpp
// Create a model
auto model = models::CatalogsProductGroupFilters();
model.setAnyOf(/* value */);  // Set any_of
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupFilters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupFilters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AllOf

```cpp
// Create a model
auto model = models::AllOf();
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::AllOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AllOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AnyOf

```cpp
// Create a model
auto model = models::AnyOf();
model.setAnyOf(/* value */);  // Set any_of

// Serialize to JSON
nlohmann::json json = models::AnyOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AnyOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelProductGroupProductCounts

```cpp
// Create a model
auto model = models::CatalogsHotelProductGroupProductCounts();
model.setCatalogType(/* value */);  // Set catalog_type
model.setTotal(/* value */);  // Set total

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelProductGroupProductCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelProductGroupProductCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HotelProductGroupType

```cpp
// Create a model
auto model = models::HotelProductGroupType();

// Serialize to JSON
nlohmann::json json = models::HotelProductGroupType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HotelProductGroupType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HotelProductGroupsUpdateRequest

```cpp
// Create a model
auto model = models::HotelProductGroupsUpdateRequest();
model.setCatalogType(/* value */);  // Set catalog_type
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::HotelProductGroupsUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HotelProductGroupsUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelProductMetadata

```cpp
// Create a model
auto model = models::CatalogsHotelProductMetadata();
model.setHotelId(/* value */);  // Set hotel_id

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelProductMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelProductMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelReportParameters

```cpp
// Create a model
auto model = models::CatalogsHotelReportParameters();
model.setCatalogType(/* value */);  // Set catalog_type
model.setReport(/* value */);  // Set report

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelReportParameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelReportParameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelReportParametersReport

```cpp
// Create a model
auto model = models::CatalogsHotelReportParametersReport();
model.setFeedId(/* value */);  // Set feed_id
model.setProcessingResultId(/* value */);  // Set processing_result_id
model.setReportType(/* value */);  // Set report_type
model.setCatalogId(/* value */);  // Set catalog_id

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelReportParametersReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelReportParametersReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelReportStatsParameters

```cpp
// Create a model
auto model = models::CatalogsHotelReportStatsParameters();
model.setCatalogType(/* value */);  // Set catalog_type
model.setReport(/* value */);  // Set report

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelReportStatsParameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelReportStatsParameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsHotelReportStatsParametersReport

```cpp
// Create a model
auto model = models::CatalogsHotelReportStatsParametersReport();
model.setFeedId(/* value */);  // Set feed_id
model.setProcessingResultId(/* value */);  // Set processing_result_id
model.setReportType(/* value */);  // Set report_type
model.setCatalogId(/* value */);  // Set catalog_id

// Serialize to JSON
nlohmann::json json = models::CatalogsHotelReportStatsParametersReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsHotelReportStatsParametersReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemValidationDetails

```cpp
// Create a model
auto model = models::CatalogsItemValidationDetails();
model.setAttributeName(/* value */);  // Set attribute_name
model.setProvidedValue(/* value */);  // Set provided_value

// Serialize to JSON
nlohmann::json json = models::CatalogsItemValidationDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemValidationDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemValidationErrors

```cpp
// Create a model
auto model = models::CatalogsItemValidationErrors();
model.setADULTINVALID(/* value */);  // Set ADULT_INVALID
model.setADWORDSFORMATINVALID(/* value */);  // Set ADWORDS_FORMAT_INVALID
model.setAVAILABILITYINVALID(/* value */);  // Set AVAILABILITY_INVALID
model.setBLOCKLISTEDIMAGESIGNATURE(/* value */);  // Set BLOCKLISTED_IMAGE_SIGNATURE
model.setDESCRIPTIONMISSING(/* value */);  // Set DESCRIPTION_MISSING
model.setDUPLICATEPRODUCTS(/* value */);  // Set DUPLICATE_PRODUCTS
model.setIMAGELINKINVALID(/* value */);  // Set IMAGE_LINK_INVALID
model.setIMAGELINKLENGTHTOOLONG(/* value */);  // Set IMAGE_LINK_LENGTH_TOO_LONG
model.setIMAGELINKMISSING(/* value */);  // Set IMAGE_LINK_MISSING
model.setINVALIDDOMAIN(/* value */);  // Set INVALID_DOMAIN
model.setITEMMAINIMAGEDOWNLOADFAILURE(/* value */);  // Set ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
model.setITEMIDMISSING(/* value */);  // Set ITEMID_MISSING
model.setLINKFORMATINVALID(/* value */);  // Set LINK_FORMAT_INVALID
model.setLINKLENGTHTOOLONG(/* value */);  // Set LINK_LENGTH_TOO_LONG
model.setLISTPRICEINVALID(/* value */);  // Set LIST_PRICE_INVALID
model.setMAXITEMSPERITEMGROUPEXCEEDED(/* value */);  // Set MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
model.setPARSELINEERROR(/* value */);  // Set PARSE_LINE_ERROR
model.setPINJOINCONTENTUNSAFE(/* value */);  // Set PINJOIN_CONTENT_UNSAFE
model.setPRICECANNOTBEDETERMINED(/* value */);  // Set PRICE_CANNOT_BE_DETERMINED
model.setPRICEMISSING(/* value */);  // Set PRICE_MISSING
model.setPRODUCTLINKMISSING(/* value */);  // Set PRODUCT_LINK_MISSING
model.setPRODUCTPRICEINVALID(/* value */);  // Set PRODUCT_PRICE_INVALID
model.setTITLEMISSING(/* value */);  // Set TITLE_MISSING

// Serialize to JSON
nlohmann::json json = models::CatalogsItemValidationErrors::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemValidationErrors::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemValidationIssue

```cpp
// Create a model
auto model = models::CatalogsItemValidationIssue();

// Serialize to JSON
nlohmann::json json = models::CatalogsItemValidationIssue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemValidationIssue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemValidationIssues

```cpp
// Create a model
auto model = models::CatalogsItemValidationIssues();
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setItemNumber(/* value */);  // Set item_number
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::CatalogsItemValidationIssues::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemValidationIssues::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemValidationWarnings

```cpp
// Create a model
auto model = models::CatalogsItemValidationWarnings();
model.setADIMAGE0LINKDUPLICATED(/* value */);  // Set AD_IMAGE_0_LINK_DUPLICATED
model.setADIMAGE0LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_0_LINK_LENGTH_TOO_LONG
model.setADIMAGE0LINKREQUIRED(/* value */);  // Set AD_IMAGE_0_LINK_REQUIRED
model.setADIMAGE0LINKWARNING(/* value */);  // Set AD_IMAGE_0_LINK_WARNING
model.setADIMAGE0TAGDUPLICATED(/* value */);  // Set AD_IMAGE_0_TAG_DUPLICATED
model.setADIMAGE0TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_0_TAG_LENGTH_TOO_LONG
model.setADIMAGE0TAGREQUIRED(/* value */);  // Set AD_IMAGE_0_TAG_REQUIRED
model.setADIMAGE10LINKDUPLICATED(/* value */);  // Set AD_IMAGE_10_LINK_DUPLICATED
model.setADIMAGE10LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_10_LINK_LENGTH_TOO_LONG
model.setADIMAGE10LINKREQUIRED(/* value */);  // Set AD_IMAGE_10_LINK_REQUIRED
model.setADIMAGE10LINKWARNING(/* value */);  // Set AD_IMAGE_10_LINK_WARNING
model.setADIMAGE10TAGDUPLICATED(/* value */);  // Set AD_IMAGE_10_TAG_DUPLICATED
model.setADIMAGE10TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_10_TAG_LENGTH_TOO_LONG
model.setADIMAGE10TAGREQUIRED(/* value */);  // Set AD_IMAGE_10_TAG_REQUIRED
model.setADIMAGE11LINKDUPLICATED(/* value */);  // Set AD_IMAGE_11_LINK_DUPLICATED
model.setADIMAGE11LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_11_LINK_LENGTH_TOO_LONG
model.setADIMAGE11LINKREQUIRED(/* value */);  // Set AD_IMAGE_11_LINK_REQUIRED
model.setADIMAGE11LINKWARNING(/* value */);  // Set AD_IMAGE_11_LINK_WARNING
model.setADIMAGE11TAGDUPLICATED(/* value */);  // Set AD_IMAGE_11_TAG_DUPLICATED
model.setADIMAGE11TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_11_TAG_LENGTH_TOO_LONG
model.setADIMAGE11TAGREQUIRED(/* value */);  // Set AD_IMAGE_11_TAG_REQUIRED
model.setADIMAGE12LINKDUPLICATED(/* value */);  // Set AD_IMAGE_12_LINK_DUPLICATED
model.setADIMAGE12LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_12_LINK_LENGTH_TOO_LONG
model.setADIMAGE12LINKREQUIRED(/* value */);  // Set AD_IMAGE_12_LINK_REQUIRED
model.setADIMAGE12LINKWARNING(/* value */);  // Set AD_IMAGE_12_LINK_WARNING
model.setADIMAGE12TAGDUPLICATED(/* value */);  // Set AD_IMAGE_12_TAG_DUPLICATED
model.setADIMAGE12TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_12_TAG_LENGTH_TOO_LONG
model.setADIMAGE12TAGREQUIRED(/* value */);  // Set AD_IMAGE_12_TAG_REQUIRED
model.setADIMAGE13LINKDUPLICATED(/* value */);  // Set AD_IMAGE_13_LINK_DUPLICATED
model.setADIMAGE13LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_13_LINK_LENGTH_TOO_LONG
model.setADIMAGE13LINKREQUIRED(/* value */);  // Set AD_IMAGE_13_LINK_REQUIRED
model.setADIMAGE13LINKWARNING(/* value */);  // Set AD_IMAGE_13_LINK_WARNING
model.setADIMAGE13TAGDUPLICATED(/* value */);  // Set AD_IMAGE_13_TAG_DUPLICATED
model.setADIMAGE13TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_13_TAG_LENGTH_TOO_LONG
model.setADIMAGE13TAGREQUIRED(/* value */);  // Set AD_IMAGE_13_TAG_REQUIRED
model.setADIMAGE14LINKDUPLICATED(/* value */);  // Set AD_IMAGE_14_LINK_DUPLICATED
model.setADIMAGE14LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_14_LINK_LENGTH_TOO_LONG
model.setADIMAGE14LINKREQUIRED(/* value */);  // Set AD_IMAGE_14_LINK_REQUIRED
model.setADIMAGE14LINKWARNING(/* value */);  // Set AD_IMAGE_14_LINK_WARNING
model.setADIMAGE14TAGDUPLICATED(/* value */);  // Set AD_IMAGE_14_TAG_DUPLICATED
model.setADIMAGE14TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_14_TAG_LENGTH_TOO_LONG
model.setADIMAGE14TAGREQUIRED(/* value */);  // Set AD_IMAGE_14_TAG_REQUIRED
model.setADIMAGE15LINKDUPLICATED(/* value */);  // Set AD_IMAGE_15_LINK_DUPLICATED
model.setADIMAGE15LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_15_LINK_LENGTH_TOO_LONG
model.setADIMAGE15LINKREQUIRED(/* value */);  // Set AD_IMAGE_15_LINK_REQUIRED
model.setADIMAGE15LINKWARNING(/* value */);  // Set AD_IMAGE_15_LINK_WARNING
model.setADIMAGE15TAGDUPLICATED(/* value */);  // Set AD_IMAGE_15_TAG_DUPLICATED
model.setADIMAGE15TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_15_TAG_LENGTH_TOO_LONG
model.setADIMAGE15TAGREQUIRED(/* value */);  // Set AD_IMAGE_15_TAG_REQUIRED
model.setADIMAGE16LINKDUPLICATED(/* value */);  // Set AD_IMAGE_16_LINK_DUPLICATED
model.setADIMAGE16LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_16_LINK_LENGTH_TOO_LONG
model.setADIMAGE16LINKREQUIRED(/* value */);  // Set AD_IMAGE_16_LINK_REQUIRED
model.setADIMAGE16LINKWARNING(/* value */);  // Set AD_IMAGE_16_LINK_WARNING
model.setADIMAGE16TAGDUPLICATED(/* value */);  // Set AD_IMAGE_16_TAG_DUPLICATED
model.setADIMAGE16TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_16_TAG_LENGTH_TOO_LONG
model.setADIMAGE16TAGREQUIRED(/* value */);  // Set AD_IMAGE_16_TAG_REQUIRED
model.setADIMAGE17LINKDUPLICATED(/* value */);  // Set AD_IMAGE_17_LINK_DUPLICATED
model.setADIMAGE17LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_17_LINK_LENGTH_TOO_LONG
model.setADIMAGE17LINKREQUIRED(/* value */);  // Set AD_IMAGE_17_LINK_REQUIRED
model.setADIMAGE17LINKWARNING(/* value */);  // Set AD_IMAGE_17_LINK_WARNING
model.setADIMAGE17TAGDUPLICATED(/* value */);  // Set AD_IMAGE_17_TAG_DUPLICATED
model.setADIMAGE17TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_17_TAG_LENGTH_TOO_LONG
model.setADIMAGE17TAGREQUIRED(/* value */);  // Set AD_IMAGE_17_TAG_REQUIRED
model.setADIMAGE18LINKDUPLICATED(/* value */);  // Set AD_IMAGE_18_LINK_DUPLICATED
model.setADIMAGE18LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_18_LINK_LENGTH_TOO_LONG
model.setADIMAGE18LINKREQUIRED(/* value */);  // Set AD_IMAGE_18_LINK_REQUIRED
model.setADIMAGE18LINKWARNING(/* value */);  // Set AD_IMAGE_18_LINK_WARNING
model.setADIMAGE18TAGDUPLICATED(/* value */);  // Set AD_IMAGE_18_TAG_DUPLICATED
model.setADIMAGE18TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_18_TAG_LENGTH_TOO_LONG
model.setADIMAGE18TAGREQUIRED(/* value */);  // Set AD_IMAGE_18_TAG_REQUIRED
model.setADIMAGE19LINKDUPLICATED(/* value */);  // Set AD_IMAGE_19_LINK_DUPLICATED
model.setADIMAGE19LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_19_LINK_LENGTH_TOO_LONG
model.setADIMAGE19LINKREQUIRED(/* value */);  // Set AD_IMAGE_19_LINK_REQUIRED
model.setADIMAGE19LINKWARNING(/* value */);  // Set AD_IMAGE_19_LINK_WARNING
model.setADIMAGE19TAGDUPLICATED(/* value */);  // Set AD_IMAGE_19_TAG_DUPLICATED
model.setADIMAGE19TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_19_TAG_LENGTH_TOO_LONG
model.setADIMAGE19TAGREQUIRED(/* value */);  // Set AD_IMAGE_19_TAG_REQUIRED
model.setADIMAGE1LINKDUPLICATED(/* value */);  // Set AD_IMAGE_1_LINK_DUPLICATED
model.setADIMAGE1LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_1_LINK_LENGTH_TOO_LONG
model.setADIMAGE1LINKREQUIRED(/* value */);  // Set AD_IMAGE_1_LINK_REQUIRED
model.setADIMAGE1LINKWARNING(/* value */);  // Set AD_IMAGE_1_LINK_WARNING
model.setADIMAGE1TAGDUPLICATED(/* value */);  // Set AD_IMAGE_1_TAG_DUPLICATED
model.setADIMAGE1TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_1_TAG_LENGTH_TOO_LONG
model.setADIMAGE1TAGREQUIRED(/* value */);  // Set AD_IMAGE_1_TAG_REQUIRED
model.setADIMAGE2LINKDUPLICATED(/* value */);  // Set AD_IMAGE_2_LINK_DUPLICATED
model.setADIMAGE2LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_2_LINK_LENGTH_TOO_LONG
model.setADIMAGE2LINKREQUIRED(/* value */);  // Set AD_IMAGE_2_LINK_REQUIRED
model.setADIMAGE2LINKWARNING(/* value */);  // Set AD_IMAGE_2_LINK_WARNING
model.setADIMAGE2TAGDUPLICATED(/* value */);  // Set AD_IMAGE_2_TAG_DUPLICATED
model.setADIMAGE2TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_2_TAG_LENGTH_TOO_LONG
model.setADIMAGE2TAGREQUIRED(/* value */);  // Set AD_IMAGE_2_TAG_REQUIRED
model.setADIMAGE3LINKDUPLICATED(/* value */);  // Set AD_IMAGE_3_LINK_DUPLICATED
model.setADIMAGE3LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_3_LINK_LENGTH_TOO_LONG
model.setADIMAGE3LINKREQUIRED(/* value */);  // Set AD_IMAGE_3_LINK_REQUIRED
model.setADIMAGE3LINKWARNING(/* value */);  // Set AD_IMAGE_3_LINK_WARNING
model.setADIMAGE3TAGDUPLICATED(/* value */);  // Set AD_IMAGE_3_TAG_DUPLICATED
model.setADIMAGE3TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_3_TAG_LENGTH_TOO_LONG
model.setADIMAGE3TAGREQUIRED(/* value */);  // Set AD_IMAGE_3_TAG_REQUIRED
model.setADIMAGE4LINKDUPLICATED(/* value */);  // Set AD_IMAGE_4_LINK_DUPLICATED
model.setADIMAGE4LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_4_LINK_LENGTH_TOO_LONG
model.setADIMAGE4LINKREQUIRED(/* value */);  // Set AD_IMAGE_4_LINK_REQUIRED
model.setADIMAGE4LINKWARNING(/* value */);  // Set AD_IMAGE_4_LINK_WARNING
model.setADIMAGE4TAGDUPLICATED(/* value */);  // Set AD_IMAGE_4_TAG_DUPLICATED
model.setADIMAGE4TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_4_TAG_LENGTH_TOO_LONG
model.setADIMAGE4TAGREQUIRED(/* value */);  // Set AD_IMAGE_4_TAG_REQUIRED
model.setADIMAGE5LINKDUPLICATED(/* value */);  // Set AD_IMAGE_5_LINK_DUPLICATED
model.setADIMAGE5LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_5_LINK_LENGTH_TOO_LONG
model.setADIMAGE5LINKREQUIRED(/* value */);  // Set AD_IMAGE_5_LINK_REQUIRED
model.setADIMAGE5LINKWARNING(/* value */);  // Set AD_IMAGE_5_LINK_WARNING
model.setADIMAGE5TAGDUPLICATED(/* value */);  // Set AD_IMAGE_5_TAG_DUPLICATED
model.setADIMAGE5TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_5_TAG_LENGTH_TOO_LONG
model.setADIMAGE5TAGREQUIRED(/* value */);  // Set AD_IMAGE_5_TAG_REQUIRED
model.setADIMAGE6LINKDUPLICATED(/* value */);  // Set AD_IMAGE_6_LINK_DUPLICATED
model.setADIMAGE6LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_6_LINK_LENGTH_TOO_LONG
model.setADIMAGE6LINKREQUIRED(/* value */);  // Set AD_IMAGE_6_LINK_REQUIRED
model.setADIMAGE6LINKWARNING(/* value */);  // Set AD_IMAGE_6_LINK_WARNING
model.setADIMAGE6TAGDUPLICATED(/* value */);  // Set AD_IMAGE_6_TAG_DUPLICATED
model.setADIMAGE6TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_6_TAG_LENGTH_TOO_LONG
model.setADIMAGE6TAGREQUIRED(/* value */);  // Set AD_IMAGE_6_TAG_REQUIRED
model.setADIMAGE7LINKDUPLICATED(/* value */);  // Set AD_IMAGE_7_LINK_DUPLICATED
model.setADIMAGE7LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_7_LINK_LENGTH_TOO_LONG
model.setADIMAGE7LINKREQUIRED(/* value */);  // Set AD_IMAGE_7_LINK_REQUIRED
model.setADIMAGE7LINKWARNING(/* value */);  // Set AD_IMAGE_7_LINK_WARNING
model.setADIMAGE7TAGDUPLICATED(/* value */);  // Set AD_IMAGE_7_TAG_DUPLICATED
model.setADIMAGE7TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_7_TAG_LENGTH_TOO_LONG
model.setADIMAGE7TAGREQUIRED(/* value */);  // Set AD_IMAGE_7_TAG_REQUIRED
model.setADIMAGE8LINKDUPLICATED(/* value */);  // Set AD_IMAGE_8_LINK_DUPLICATED
model.setADIMAGE8LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_8_LINK_LENGTH_TOO_LONG
model.setADIMAGE8LINKREQUIRED(/* value */);  // Set AD_IMAGE_8_LINK_REQUIRED
model.setADIMAGE8LINKWARNING(/* value */);  // Set AD_IMAGE_8_LINK_WARNING
model.setADIMAGE8TAGDUPLICATED(/* value */);  // Set AD_IMAGE_8_TAG_DUPLICATED
model.setADIMAGE8TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_8_TAG_LENGTH_TOO_LONG
model.setADIMAGE8TAGREQUIRED(/* value */);  // Set AD_IMAGE_8_TAG_REQUIRED
model.setADIMAGE9LINKDUPLICATED(/* value */);  // Set AD_IMAGE_9_LINK_DUPLICATED
model.setADIMAGE9LINKLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_9_LINK_LENGTH_TOO_LONG
model.setADIMAGE9LINKREQUIRED(/* value */);  // Set AD_IMAGE_9_LINK_REQUIRED
model.setADIMAGE9LINKWARNING(/* value */);  // Set AD_IMAGE_9_LINK_WARNING
model.setADIMAGE9TAGDUPLICATED(/* value */);  // Set AD_IMAGE_9_TAG_DUPLICATED
model.setADIMAGE9TAGLENGTHTOOLONG(/* value */);  // Set AD_IMAGE_9_TAG_LENGTH_TOO_LONG
model.setADIMAGE9TAGREQUIRED(/* value */);  // Set AD_IMAGE_9_TAG_REQUIRED
model.setADLINKFORMATWARNING(/* value */);  // Set AD_LINK_FORMAT_WARNING
model.setADLINKSAMEASLINK(/* value */);  // Set AD_LINK_SAME_AS_LINK
model.setADVIDEO0LINKDUPLICATED(/* value */);  // Set AD_VIDEO_0_LINK_DUPLICATED
model.setADVIDEO0LINKLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_0_LINK_LENGTH_TOO_LONG
model.setADVIDEO0LINKREQUIRED(/* value */);  // Set AD_VIDEO_0_LINK_REQUIRED
model.setADVIDEO0LINKWARNING(/* value */);  // Set AD_VIDEO_0_LINK_WARNING
model.setADVIDEO0TAGDUPLICATED(/* value */);  // Set AD_VIDEO_0_TAG_DUPLICATED
model.setADVIDEO0TAGLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_0_TAG_LENGTH_TOO_LONG
model.setADVIDEO0TAGREQUIRED(/* value */);  // Set AD_VIDEO_0_TAG_REQUIRED
model.setADVIDEO1LINKDUPLICATED(/* value */);  // Set AD_VIDEO_1_LINK_DUPLICATED
model.setADVIDEO1LINKLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_1_LINK_LENGTH_TOO_LONG
model.setADVIDEO1LINKREQUIRED(/* value */);  // Set AD_VIDEO_1_LINK_REQUIRED
model.setADVIDEO1LINKWARNING(/* value */);  // Set AD_VIDEO_1_LINK_WARNING
model.setADVIDEO1TAGDUPLICATED(/* value */);  // Set AD_VIDEO_1_TAG_DUPLICATED
model.setADVIDEO1TAGLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_1_TAG_LENGTH_TOO_LONG
model.setADVIDEO1TAGREQUIRED(/* value */);  // Set AD_VIDEO_1_TAG_REQUIRED
model.setADVIDEO2LINKDUPLICATED(/* value */);  // Set AD_VIDEO_2_LINK_DUPLICATED
model.setADVIDEO2LINKLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_2_LINK_LENGTH_TOO_LONG
model.setADVIDEO2LINKREQUIRED(/* value */);  // Set AD_VIDEO_2_LINK_REQUIRED
model.setADVIDEO2LINKWARNING(/* value */);  // Set AD_VIDEO_2_LINK_WARNING
model.setADVIDEO2TAGDUPLICATED(/* value */);  // Set AD_VIDEO_2_TAG_DUPLICATED
model.setADVIDEO2TAGLENGTHTOOLONG(/* value */);  // Set AD_VIDEO_2_TAG_LENGTH_TOO_LONG
model.setADVIDEO2TAGREQUIRED(/* value */);  // Set AD_VIDEO_2_TAG_REQUIRED
model.setADDITIONALIMAGELINKLENGTHTOOLONG(/* value */);  // Set ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
model.setADDITIONALIMAGELINKWARNING(/* value */);  // Set ADDITIONAL_IMAGE_LINK_WARNING
model.setADWORDSFORMATWARNING(/* value */);  // Set ADWORDS_FORMAT_WARNING
model.setADWORDSSAMEASLINK(/* value */);  // Set ADWORDS_SAME_AS_LINK
model.setAGEGROUPINVALID(/* value */);  // Set AGE_GROUP_INVALID
model.setANDROIDDEEPLINKINVALID(/* value */);  // Set ANDROID_DEEP_LINK_INVALID
model.setAVAILABILITYDATEINVALID(/* value */);  // Set AVAILABILITY_DATE_INVALID
model.setCOUNTRYDOESNOTMAPTOCURRENCY(/* value */);  // Set COUNTRY_DOES_NOT_MAP_TO_CURRENCY
model.setCUSTOMLABELLENGTHTOOLONG(/* value */);  // Set CUSTOM_LABEL_LENGTH_TOO_LONG
model.setDESCRIPTIONLENGTHTOOLONG(/* value */);  // Set DESCRIPTION_LENGTH_TOO_LONG
model.setEXPIRATIONDATEINVALID(/* value */);  // Set EXPIRATION_DATE_INVALID
model.setGENDERINVALID(/* value */);  // Set GENDER_INVALID
model.setGTININVALID(/* value */);  // Set GTIN_INVALID
model.setIMAGELINKWARNING(/* value */);  // Set IMAGE_LINK_WARNING
model.setIOSDEEPLINKINVALID(/* value */);  // Set IOS_DEEP_LINK_INVALID
model.setISBUNDLEINVALID(/* value */);  // Set IS_BUNDLE_INVALID
model.setITEMADDITIONALIMAGEDOWNLOADFAILURE(/* value */);  // Set ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
model.setLINKFORMATWARNING(/* value */);  // Set LINK_FORMAT_WARNING
model.setMINADPRICEINVALID(/* value */);  // Set MIN_AD_PRICE_INVALID
model.setMPNINVALID(/* value */);  // Set MPN_INVALID
model.setMULTIPACKINVALID(/* value */);  // Set MULTIPACK_INVALID
model.setOPTIONALCONDITIONINVALID(/* value */);  // Set OPTIONAL_CONDITION_INVALID
model.setOPTIONALCONDITIONMISSING(/* value */);  // Set OPTIONAL_CONDITION_MISSING
model.setOPTIONALPRODUCTCATEGORYINVALID(/* value */);  // Set OPTIONAL_PRODUCT_CATEGORY_INVALID
model.setOPTIONALPRODUCTCATEGORYMISSING(/* value */);  // Set OPTIONAL_PRODUCT_CATEGORY_MISSING
model.setPRODUCTCATEGORYDEPTHWARNING(/* value */);  // Set PRODUCT_CATEGORY_DEPTH_WARNING
model.setPRODUCTTYPELENGTHTOOLONG(/* value */);  // Set PRODUCT_TYPE_LENGTH_TOO_LONG
model.setSALEDATEINVALID(/* value */);  // Set SALE_DATE_INVALID
model.setSALESPRICEINVALID(/* value */);  // Set SALES_PRICE_INVALID
model.setSALESPRICETOOHIGH(/* value */);  // Set SALES_PRICE_TOO_HIGH
model.setSALESPRICETOOLOW(/* value */);  // Set SALES_PRICE_TOO_LOW
model.setSHIPPINGHEIGHTINVALID(/* value */);  // Set SHIPPING_HEIGHT_INVALID
model.setSHIPPINGINVALID(/* value */);  // Set SHIPPING_INVALID
model.setSHIPPINGWEIGHTINVALID(/* value */);  // Set SHIPPING_WEIGHT_INVALID
model.setSHIPPINGWIDTHINVALID(/* value */);  // Set SHIPPING_WIDTH_INVALID
model.setSIZESYSTEMINVALID(/* value */);  // Set SIZE_SYSTEM_INVALID
model.setSIZETYPEINVALID(/* value */);  // Set SIZE_TYPE_INVALID
model.setTAXINVALID(/* value */);  // Set TAX_INVALID
model.setTITLELENGTHTOOLONG(/* value */);  // Set TITLE_LENGTH_TOO_LONG
model.setTOOMANYADDITIONALIMAGELINKS(/* value */);  // Set TOO_MANY_ADDITIONAL_IMAGE_LINKS
model.setUTMSOURCEAUTOCORRECTED(/* value */);  // Set UTM_SOURCE_AUTO_CORRECTED
model.setVIDEOREQUIREDWHENADVIDEOPROVIDED(/* value */);  // Set VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED
model.setWEIGHTUNITINVALID(/* value */);  // Set WEIGHT_UNIT_INVALID

// Serialize to JSON
nlohmann::json json = models::CatalogsItemValidationWarnings::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemValidationWarnings::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsBatch

```cpp
// Create a model
auto model = models::CatalogsItemsBatch();
model.setBatchId(/* value */);  // Set batch_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCompletedTime(/* value */);  // Set completed_time
model.setCreatedTime(/* value */);  // Set created_time
model.setItems(/* value */);  // Set items
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsBatch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsBatch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsBatchPostRequest

```cpp
// Create a model
auto model = models::CatalogsItemsBatchPostRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsBatchPostRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsBatchPostRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LegacyRetailOnly

```cpp
// Create a model
auto model = models::LegacyRetailOnly();
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::LegacyRetailOnly::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LegacyRetailOnly::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsCreateBatchRequest

```cpp
// Create a model
auto model = models::CatalogsItemsCreateBatchRequest();
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsCreateBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsCreateBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsDeleteBatchRequest

```cpp
// Create a model
auto model = models::CatalogsItemsDeleteBatchRequest();
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsDeleteBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsDeleteBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsDeleteDiscontinuedBatchRequest

```cpp
// Create a model
auto model = models::CatalogsItemsDeleteDiscontinuedBatchRequest();
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsDeleteDiscontinuedBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsDeleteDiscontinuedBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsPostFilters

```cpp
// Create a model
auto model = models::CatalogsItemsPostFilters();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setItemIds(/* value */);  // Set item_ids
model.setHotelIds(/* value */);  // Set hotel_ids
model.setCreativeAssetsIds(/* value */);  // Set creative_assets_ids

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsPostFilters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsPostFilters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsRequest

```cpp
// Create a model
auto model = models::CatalogsItemsRequest();
model.setCountry(/* value */);  // Set country
model.setFilters(/* value */);  // Set filters
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsUpdateBatchRequest

```cpp
// Create a model
auto model = models::CatalogsItemsUpdateBatchRequest();
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsUpdateBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsUpdateBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsItemsUpsertBatchRequest

```cpp
// Create a model
auto model = models::CatalogsItemsUpsertBatchRequest();
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsItemsUpsertBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsItemsUpsertBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsList200Response

```cpp
// Create a model
auto model = models::CatalogsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CatalogsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedBasedProductGroup

```cpp
// Create a model
auto model = models::FeedBasedProductGroup();
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters

// Serialize to JSON
nlohmann::json json = models::FeedBasedProductGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedBasedProductGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsListProductsByFilterRequest

```cpp
// Create a model
auto model = models::CatalogsListProductsByFilterRequest();
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::CatalogsListProductsByFilterRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsListProductsByFilterRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresCreate200ResponseInner

```cpp
// Create a model
auto model = models::CatalogsLocalStoresCreate200ResponseInner();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresCreate200ResponseInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresCreate200ResponseInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresCreate200ResponseInnerData

```cpp
// Create a model
auto model = models::CatalogsLocalStoresCreate200ResponseInnerData();
model.setAddressPrimary(/* value */);  // Set address_primary
model.setAddressSecondary(/* value */);  // Set address_secondary
model.setCity(/* value */);  // Set city
model.setCountry(/* value */);  // Set country
model.setCreatedAt(/* value */);  // Set created_at
model.setId(/* value */);  // Set id
model.setLatitude(/* value */);  // Set latitude
model.setLongitude(/* value */);  // Set longitude
model.setName(/* value */);  // Set name
model.setPostalCode(/* value */);  // Set postal_code
model.setRegion(/* value */);  // Set region
model.setStoreCode(/* value */);  // Set store_code
model.setUpdatedAt(/* value */);  // Set updated_at
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresCreate200ResponseInnerData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresCreate200ResponseInnerData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresCreate200ResponseInnerDataOneOf

```cpp
// Create a model
auto model = models::CatalogsLocalStoresCreate200ResponseInnerDataOneOf();
model.setId(/* value */);  // Set id
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresCreate200ResponseInnerDataOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresCreate200ResponseInnerDataOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresDelete200ResponseInner

```cpp
// Create a model
auto model = models::CatalogsLocalStoresDelete200ResponseInner();
model.setId(/* value */);  // Set id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresDelete200ResponseInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresDelete200ResponseInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresDelete200ResponseInnerStatus

```cpp
// Create a model
auto model = models::CatalogsLocalStoresDelete200ResponseInnerStatus();
model.setStatusCode(/* value */);  // Set statusCode
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresDelete200ResponseInnerStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresDelete200ResponseInnerStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresList200Response

```cpp
// Create a model
auto model = models::CatalogsLocalStoresList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresUpdate200ResponseInner

```cpp
// Create a model
auto model = models::CatalogsLocalStoresUpdate200ResponseInner();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresUpdate200ResponseInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresUpdate200ResponseInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresUpdate200ResponseInnerData

```cpp
// Create a model
auto model = models::CatalogsLocalStoresUpdate200ResponseInnerData();
model.setAddressPrimary(/* value */);  // Set address_primary
model.setAddressSecondary(/* value */);  // Set address_secondary
model.setCity(/* value */);  // Set city
model.setCountry(/* value */);  // Set country
model.setCreatedAt(/* value */);  // Set created_at
model.setId(/* value */);  // Set id
model.setLatitude(/* value */);  // Set latitude
model.setLongitude(/* value */);  // Set longitude
model.setName(/* value */);  // Set name
model.setPostalCode(/* value */);  // Set postal_code
model.setRegion(/* value */);  // Set region
model.setStoreCode(/* value */);  // Set store_code
model.setUpdatedAt(/* value */);  // Set updated_at
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresUpdate200ResponseInnerData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresUpdate200ResponseInnerData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocalStoresUpdate200ResponseInnerDataOneOf

```cpp
// Create a model
auto model = models::CatalogsLocalStoresUpdate200ResponseInnerDataOneOf();
model.setId(/* value */);  // Set id
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::CatalogsLocalStoresUpdate200ResponseInnerDataOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocalStoresUpdate200ResponseInnerDataOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsLocale

```cpp
// Create a model
auto model = models::CatalogsLocale();

// Serialize to JSON
nlohmann::json json = models::CatalogsLocale::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsLocale::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProduct

```cpp
// Create a model
auto model = models::CatalogsProduct();
model.setCatalogType(/* value */);  // Set catalog_type
model.setMetadata(/* value */);  // Set metadata
model.setPin(/* value */);  // Set pin

// Serialize to JSON
nlohmann::json json = models::CatalogsProduct::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProduct::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailFeedBased

```cpp
// Create a model
auto model = models::RetailFeedBased();
model.setDescription(/* value */);  // Set description
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters
model.setIsFeatured(/* value */);  // Set is_featured
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::RetailFeedBased::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailFeedBased::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupCurrencyCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupCurrencyCriteria();
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupCurrencyCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupCurrencyCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupKeys

```cpp
// Create a model
auto model = models::CatalogsProductGroupKeys();
model.setMINPRICE(/* value */);  // Set MIN_PRICE
model.setMAXPRICE(/* value */);  // Set MAX_PRICE
model.setCURRENCY(/* value */);  // Set CURRENCY
model.setITEMID(/* value */);  // Set ITEM_ID
model.setAVAILABILITY(/* value */);  // Set AVAILABILITY
model.setBRAND(/* value */);  // Set BRAND
model.setCONDITION(/* value */);  // Set CONDITION
model.setCUSTOMLABEL0(/* value */);  // Set CUSTOM_LABEL_0
model.setCUSTOMLABEL1(/* value */);  // Set CUSTOM_LABEL_1
model.setCUSTOMLABEL2(/* value */);  // Set CUSTOM_LABEL_2
model.setCUSTOMLABEL3(/* value */);  // Set CUSTOM_LABEL_3
model.setCUSTOMLABEL4(/* value */);  // Set CUSTOM_LABEL_4
model.setITEMGROUPID(/* value */);  // Set ITEM_GROUP_ID
model.setGENDER(/* value */);  // Set GENDER
model.setMEDIATYPE(/* value */);  // Set MEDIA_TYPE
model.setPRODUCTTYPE4(/* value */);  // Set PRODUCT_TYPE_4
model.setPRODUCTTYPE3(/* value */);  // Set PRODUCT_TYPE_3
model.setPRODUCTTYPE2(/* value */);  // Set PRODUCT_TYPE_2
model.setPRODUCTTYPE1(/* value */);  // Set PRODUCT_TYPE_1
model.setPRODUCTTYPE0(/* value */);  // Set PRODUCT_TYPE_0
model.setGOOGLEPRODUCTCATEGORY6(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_6
model.setGOOGLEPRODUCTCATEGORY5(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_5
model.setGOOGLEPRODUCTCATEGORY4(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_4
model.setGOOGLEPRODUCTCATEGORY3(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_3
model.setGOOGLEPRODUCTCATEGORY2(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_2
model.setGOOGLEPRODUCTCATEGORY1(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_1
model.setGOOGLEPRODUCTCATEGORY0(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_0
model.setCUSTOMNUMBER0(/* value */);  // Set CUSTOM_NUMBER_0
model.setCUSTOMNUMBER1(/* value */);  // Set CUSTOM_NUMBER_1
model.setCUSTOMNUMBER2(/* value */);  // Set CUSTOM_NUMBER_2
model.setCUSTOMNUMBER3(/* value */);  // Set CUSTOM_NUMBER_3
model.setCUSTOMNUMBER4(/* value */);  // Set CUSTOM_NUMBER_4
model.setTITLEKEYWORDS(/* value */);  // Set TITLE_KEYWORDS
model.setPINTERESTPRODUCTCATEGORIES(/* value */);  // Set PINTEREST_PRODUCT_CATEGORIES
model.setPRODUCTGROUP(/* value */);  // Set PRODUCT_GROUP

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupKeys::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupKeys::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupFilterOperatorTypeCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupFilterOperatorTypeCriteria();
model.setFilterOperatorType(/* value */);  // Set filter_operator_type
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupFilterOperatorTypeCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupFilterOperatorTypeCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupFilters

```cpp
// Create a model
auto model = models::CatalogsProductGroupFilters();
model.setAnyOf(/* value */);  // Set any_of
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupFilters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupFilters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AllOf

```cpp
// Create a model
auto model = models::AllOf();
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::AllOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AllOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AnyOf

```cpp
// Create a model
auto model = models::AnyOf();
model.setAnyOf(/* value */);  // Set any_of

// Serialize to JSON
nlohmann::json json = models::AnyOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AnyOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupFilters

```cpp
// Create a model
auto model = models::CatalogsProductGroupFilters();
model.setAnyOf(/* value */);  // Set any_of
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupFilters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupFilters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AnyOf

```cpp
// Create a model
auto model = models::AnyOf();
model.setAnyOf(/* value */);  // Set any_of

// Serialize to JSON
nlohmann::json json = models::AnyOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AnyOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AllOf

```cpp
// Create a model
auto model = models::AllOf();
model.setAllOf(/* value */);  // Set all_of

// Serialize to JSON
nlohmann::json json = models::AllOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AllOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupMultipleCountryCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupMultipleCountryCriteria();
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupMultipleCountryCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupMultipleCountryCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupMultipleGenderCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupMultipleGenderCriteria();
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupMultipleGenderCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupMultipleGenderCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupMultipleMediaTypeCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupMultipleMediaTypeCriteria();
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupMultipleMediaTypeCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupMultipleMediaTypeCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupMultiplePinterestProductCategoryCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupMultiplePinterestProductCategoryCriteria();
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupMultiplePinterestProductCategoryCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupMultiplePinterestProductCategoryCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupMultipleStringCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupMultipleStringCriteria();
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupMultipleStringCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupMultipleStringCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupMultipleStringListCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupMultipleStringListCriteria();
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupMultipleStringListCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupMultipleStringListCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupPinsList200Response

```cpp
// Create a model
auto model = models::CatalogsProductGroupPinsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupPinsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupPinsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupPricingCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupPricingCriteria();
model.setInclusion(/* value */);  // Set inclusion
model.setNegated(/* value */);  // Set negated
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupPricingCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupPricingCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupProductCountsVertical

```cpp
// Create a model
auto model = models::CatalogsProductGroupProductCountsVertical();
model.setCatalogType(/* value */);  // Set catalog_type
model.setInStock(/* value */);  // Set in_stock
model.setOutOfStock(/* value */);  // Set out_of_stock
model.setPreorder(/* value */);  // Set preorder
model.setTotal(/* value */);  // Set total
model.setVideos(/* value */);  // Set videos
model.setAppLinks(/* value */);  // Set app_links
model.setImages(/* value */);  // Set images

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupProductCountsVertical::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupProductCountsVertical::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupStatus

```cpp
// Create a model
auto model = models::CatalogsProductGroupStatus();

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupType

```cpp
// Create a model
auto model = models::ProductGroupType();

// Serialize to JSON
nlohmann::json json = models::ProductGroupType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupUint32Criteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupUint32Criteria();
model.setNegated(/* value */);  // Set negated
model.setROperator(/* value */);  // Set operator
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupUint32Criteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupUint32Criteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0

```cpp
// Create a model
auto model = models::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailFeedBased

```cpp
// Create a model
auto model = models::RetailFeedBased();
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setIsFeatured(/* value */);  // Set is_featured
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::RetailFeedBased::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailFeedBased::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupsCreateManyRequestItems

```cpp
// Create a model
auto model = models::CatalogsProductGroupsCreateManyRequestItems();
model.setDescription(/* value */);  // Set description
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters
model.setIsFeatured(/* value */);  // Set is_featured
model.setName(/* value */);  // Set name
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupsCreateManyRequestItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupsCreateManyRequestItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupsCreateRequestSchema

```cpp
// Create a model
auto model = models::CatalogsProductGroupsCreateRequestSchema();
model.setDescription(/* value */);  // Set description
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters
model.setIsFeatured(/* value */);  // Set is_featured
model.setName(/* value */);  // Set name
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupsCreateRequestSchema::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupsCreateRequestSchema::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupsList200Response

```cpp
// Create a model
auto model = models::CatalogsProductGroupsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupsUpdateRequestSchema

```cpp
// Create a model
auto model = models::CatalogsProductGroupsUpdateRequestSchema();
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setIsFeatured(/* value */);  // Set is_featured
model.setName(/* value */);  // Set name
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupsUpdateRequestSchema::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupsUpdateRequestSchema::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReport

```cpp
// Create a model
auto model = models::CatalogsReport();
model.setReportStatus(/* value */);  // Set report_status
model.setSize(/* value */);  // Set size
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::CatalogsReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReportDistributionIssueFilter

```cpp
// Create a model
auto model = models::CatalogsReportDistributionIssueFilter();
model.setCatalogId(/* value */);  // Set catalog_id
model.setReportType(/* value */);  // Set report_type

// Serialize to JSON
nlohmann::json json = models::CatalogsReportDistributionIssueFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReportDistributionIssueFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReportDistributionStats

```cpp
// Create a model
auto model = models::CatalogsReportDistributionStats();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCode(/* value */);  // Set code
model.setCodeLabel(/* value */);  // Set code_label
model.setIneligibleForAds(/* value */);  // Set ineligible_for_ads
model.setIneligibleForOrganic(/* value */);  // Set ineligible_for_organic
model.setMessage(/* value */);  // Set message
model.setOccurrences(/* value */);  // Set occurrences
model.setReportType(/* value */);  // Set report_type

// Serialize to JSON
nlohmann::json json = models::CatalogsReportDistributionStats::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReportDistributionStats::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReportFeedIngestionFilter

```cpp
// Create a model
auto model = models::CatalogsReportFeedIngestionFilter();
model.setFeedId(/* value */);  // Set feed_id
model.setProcessingResultId(/* value */);  // Set processing_result_id
model.setReportType(/* value */);  // Set report_type

// Serialize to JSON
nlohmann::json json = models::CatalogsReportFeedIngestionFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReportFeedIngestionFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReportFeedIngestionStats

```cpp
// Create a model
auto model = models::CatalogsReportFeedIngestionStats();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCode(/* value */);  // Set code
model.setCodeLabel(/* value */);  // Set code_label
model.setMessage(/* value */);  // Set message
model.setOccurrences(/* value */);  // Set occurrences
model.setReportType(/* value */);  // Set report_type
model.setSeverity(/* value */);  // Set severity

// Serialize to JSON
nlohmann::json json = models::CatalogsReportFeedIngestionStats::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReportFeedIngestionStats::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReportParameters

```cpp
// Create a model
auto model = models::CatalogsReportParameters();
model.setCatalogType(/* value */);  // Set catalog_type
model.setReport(/* value */);  // Set report

// Serialize to JSON
nlohmann::json json = models::CatalogsReportParameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReportParameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReportStats

```cpp
// Create a model
auto model = models::CatalogsReportStats();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCode(/* value */);  // Set code
model.setCodeLabel(/* value */);  // Set code_label
model.setMessage(/* value */);  // Set message
model.setOccurrences(/* value */);  // Set occurrences
model.setReportType(/* value */);  // Set report_type
model.setSeverity(/* value */);  // Set severity
model.setIneligibleForAds(/* value */);  // Set ineligible_for_ads
model.setIneligibleForOrganic(/* value */);  // Set ineligible_for_organic

// Serialize to JSON
nlohmann::json json = models::CatalogsReportStats::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReportStats::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsReportStatsParameters

```cpp
// Create a model
auto model = models::CatalogsReportStatsParameters();
model.setCatalogType(/* value */);  // Set catalog_type
model.setReport(/* value */);  // Set report

// Serialize to JSON
nlohmann::json json = models::CatalogsReportStatsParameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsReportStatsParameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailAvailableFilterValues

```cpp
// Create a model
auto model = models::CatalogsRetailAvailableFilterValues();
model.setCatalogType(/* value */);  // Set catalog_type
model.setFilterValues(/* value */);  // Set filter_values

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailAvailableFilterValues::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailAvailableFilterValues::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailBatchRequest

```cpp
// Create a model
auto model = models::CatalogsRetailBatchRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailBatchRequestItemsItems

```cpp
// Create a model
auto model = models::CatalogsRetailBatchRequestItemsItems();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation
model.setUpdateMask(/* value */);  // Set update_mask
model.setLastUpdatedTime(/* value */);  // Set last_updated_time

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailBatchRequestItemsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailBatchRequestItemsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailFeed

```cpp
// Create a model
auto model = models::CatalogsRetailFeed();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCreatedAt(/* value */);  // Set created_at
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setId(/* value */);  // Set id
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailFeed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailFeed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedsRetailCreateRequest

```cpp
// Create a model
auto model = models::FeedsRetailCreateRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::FeedsRetailCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedsRetailCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailFeedsCreateRequestDefaultLocale

```cpp
// Create a model
auto model = models::CatalogsRetailFeedsCreateRequestDefaultLocale();

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailFeedsCreateRequestDefaultLocale::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailFeedsCreateRequestDefaultLocale::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsFeedsUpdateRequest

```cpp
// Create a model
auto model = models::CatalogsFeedsUpdateRequest();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsFeedsUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsFeedsUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailFilterValuesMap

```cpp
// Create a model
auto model = models::CatalogsRetailFilterValuesMap();
model.setAdImageTags(/* value */);  // Set ad_image_tags
model.setAdVideoTags(/* value */);  // Set ad_video_tags
model.setAvailability(/* value */);  // Set availability
model.setBrand(/* value */);  // Set brand
model.setCondition(/* value */);  // Set condition
model.setCustomLabel0(/* value */);  // Set custom_label_0
model.setCustomLabel1(/* value */);  // Set custom_label_1
model.setCustomLabel2(/* value */);  // Set custom_label_2
model.setCustomLabel3(/* value */);  // Set custom_label_3
model.setCustomLabel4(/* value */);  // Set custom_label_4
model.setGender(/* value */);  // Set gender
model.setGoogleProductCategory0(/* value */);  // Set google_product_category_0
model.setGoogleProductCategory1(/* value */);  // Set google_product_category_1
model.setGoogleProductCategory2(/* value */);  // Set google_product_category_2
model.setGoogleProductCategory3(/* value */);  // Set google_product_category_3
model.setGoogleProductCategory4(/* value */);  // Set google_product_category_4
model.setGoogleProductCategory5(/* value */);  // Set google_product_category_5
model.setGoogleProductCategory6(/* value */);  // Set google_product_category_6
model.setMediaType(/* value */);  // Set media_type
model.setProductType0(/* value */);  // Set product_type_0
model.setProductType1(/* value */);  // Set product_type_1
model.setProductType2(/* value */);  // Set product_type_2
model.setProductType3(/* value */);  // Set product_type_3
model.setProductType4(/* value */);  // Set product_type_4

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailFilterValuesMap::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailFilterValuesMap::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailItemErrorResponse

```cpp
// Create a model
auto model = models::CatalogsRetailItemErrorResponse();
model.setCatalogType(/* value */);  // Set catalog_type
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setItemResponseKind(/* value */);  // Set item_response_kind

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailItemErrorResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailItemErrorResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailItemResponse

```cpp
// Create a model
auto model = models::CatalogsRetailItemResponse();
model.setAttributes(/* value */);  // Set attributes
model.setCatalogType(/* value */);  // Set catalog_type
model.setItemId(/* value */);  // Set item_id
model.setItemResponseKind(/* value */);  // Set item_response_kind
model.setPins(/* value */);  // Set pins

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailItemResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailItemResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailItemsBatch

```cpp
// Create a model
auto model = models::CatalogsRetailItemsBatch();
model.setBatchId(/* value */);  // Set batch_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCompletedTime(/* value */);  // Set completed_time
model.setCreatedTime(/* value */);  // Set created_time
model.setItems(/* value */);  // Set items
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailItemsBatch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailItemsBatch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailItemsPostFilter

```cpp
// Create a model
auto model = models::CatalogsRetailItemsPostFilter();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setItemIds(/* value */);  // Set item_ids

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailItemsPostFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailItemsPostFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailListProductsByCatalogBasedFilterRequest

```cpp
// Create a model
auto model = models::RetailListProductsByCatalogBasedFilterRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setFilters(/* value */);  // Set filters
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::RetailListProductsByCatalogBasedFilterRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailListProductsByCatalogBasedFilterRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailProduct

```cpp
// Create a model
auto model = models::CatalogsRetailProduct();
model.setCatalogType(/* value */);  // Set catalog_type
model.setMetadata(/* value */);  // Set metadata
model.setPin(/* value */);  // Set pin

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailProduct::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailProduct::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailProductGroup

```cpp
// Create a model
auto model = models::RetailProductGroup();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setCreatedAt(/* value */);  // Set created_at
model.setDescription(/* value */);  // Set description
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters
model.setId(/* value */);  // Set id
model.setIsFeatured(/* value */);  // Set is_featured
model.setLocale(/* value */);  // Set locale
model.setName(/* value */);  // Set name
model.setStatus(/* value */);  // Set status
model.setType(/* value */);  // Set type
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::RetailProductGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailProductGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailProductGroupsCreateRequest

```cpp
// Create a model
auto model = models::RetailProductGroupsCreateRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setLocale(/* value */);  // Set locale
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::RetailProductGroupsCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailProductGroupsCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailProductGroupProductCounts

```cpp
// Create a model
auto model = models::CatalogsRetailProductGroupProductCounts();
model.setCatalogType(/* value */);  // Set catalog_type
model.setInStock(/* value */);  // Set in_stock
model.setOutOfStock(/* value */);  // Set out_of_stock
model.setPreorder(/* value */);  // Set preorder
model.setTotal(/* value */);  // Set total
model.setVideos(/* value */);  // Set videos

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailProductGroupProductCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailProductGroupProductCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailProductGroupsUpdateRequest

```cpp
// Create a model
auto model = models::RetailProductGroupsUpdateRequest();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setLocale(/* value */);  // Set locale
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::RetailProductGroupsUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailProductGroupsUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailProductMetadata

```cpp
// Create a model
auto model = models::CatalogsRetailProductMetadata();
model.setAvailability(/* value */);  // Set availability
model.setCurrency(/* value */);  // Set currency
model.setItemGroupId(/* value */);  // Set item_group_id
model.setItemId(/* value */);  // Set item_id
model.setPrice(/* value */);  // Set price
model.setSalePrice(/* value */);  // Set sale_price

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailProductMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailProductMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailReportAllItemsFilter

```cpp
// Create a model
auto model = models::CatalogsRetailReportAllItemsFilter();
model.setCatalogId(/* value */);  // Set catalog_id
model.setProductGroupId(/* value */);  // Set product_group_id
model.setReportType(/* value */);  // Set report_type

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailReportAllItemsFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailReportAllItemsFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailReportParameters

```cpp
// Create a model
auto model = models::CatalogsRetailReportParameters();
model.setCatalogType(/* value */);  // Set catalog_type
model.setReport(/* value */);  // Set report

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailReportParameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailReportParameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailReportParametersReport

```cpp
// Create a model
auto model = models::CatalogsRetailReportParametersReport();
model.setFeedId(/* value */);  // Set feed_id
model.setProcessingResultId(/* value */);  // Set processing_result_id
model.setReportType(/* value */);  // Set report_type
model.setCatalogId(/* value */);  // Set catalog_id
model.setProductGroupId(/* value */);  // Set product_group_id

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailReportParametersReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailReportParametersReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailReportStatsParameters

```cpp
// Create a model
auto model = models::CatalogsRetailReportStatsParameters();
model.setCatalogType(/* value */);  // Set catalog_type
model.setReport(/* value */);  // Set report

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailReportStatsParameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailReportStatsParameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsRetailReportStatsParametersReport

```cpp
// Create a model
auto model = models::CatalogsRetailReportStatsParametersReport();
model.setFeedId(/* value */);  // Set feed_id
model.setProcessingResultId(/* value */);  // Set processing_result_id
model.setReportType(/* value */);  // Set report_type
model.setCatalogId(/* value */);  // Set catalog_id

// Serialize to JSON
nlohmann::json json = models::CatalogsRetailReportStatsParametersReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsRetailReportStatsParametersReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsStatus

```cpp
// Create a model
auto model = models::CatalogsStatus();

// Serialize to JSON
nlohmann::json json = models::CatalogsStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsType

```cpp
// Create a model
auto model = models::CatalogsType();

// Serialize to JSON
nlohmann::json json = models::CatalogsType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpdatableCreativeAssetsAttributes

```cpp
// Create a model
auto model = models::CatalogsUpdatableCreativeAssetsAttributes();
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setCustomLabel0(/* value */);  // Set custom_label_0
model.setCustomLabel1(/* value */);  // Set custom_label_1
model.setCustomLabel2(/* value */);  // Set custom_label_2
model.setCustomLabel3(/* value */);  // Set custom_label_3
model.setCustomLabel4(/* value */);  // Set custom_label_4
model.setDescription(/* value */);  // Set description
model.setGoogleProductCategory(/* value */);  // Set google_product_category
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title
model.setVisibility(/* value */);  // Set visibility

// Serialize to JSON
nlohmann::json json = models::CatalogsUpdatableCreativeAssetsAttributes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpdatableCreativeAssetsAttributes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpdatableHotelAttributes

```cpp
// Create a model
auto model = models::CatalogsUpdatableHotelAttributes();
model.setAddress(/* value */);  // Set address
model.setBasePrice(/* value */);  // Set base_price
model.setBrand(/* value */);  // Set brand
model.setCategory(/* value */);  // Set category
model.setCustomLabel0(/* value */);  // Set custom_label_0
model.setCustomLabel1(/* value */);  // Set custom_label_1
model.setCustomLabel2(/* value */);  // Set custom_label_2
model.setCustomLabel3(/* value */);  // Set custom_label_3
model.setCustomLabel4(/* value */);  // Set custom_label_4
model.setDescription(/* value */);  // Set description
model.setGuestRatings(/* value */);  // Set guest_ratings
model.setLatitude(/* value */);  // Set latitude
model.setLink(/* value */);  // Set link
model.setLongitude(/* value */);  // Set longitude
model.setName(/* value */);  // Set name
model.setNeighborhood(/* value */);  // Set neighborhood
model.setSalePrice(/* value */);  // Set sale_price

// Serialize to JSON
nlohmann::json json = models::CatalogsUpdatableHotelAttributes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpdatableHotelAttributes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpdateCreativeAssetsItem

```cpp
// Create a model
auto model = models::CatalogsUpdateCreativeAssetsItem();
model.setAttributes(/* value */);  // Set attributes
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsUpdateCreativeAssetsItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpdateCreativeAssetsItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpdateHotelItem

```cpp
// Create a model
auto model = models::CatalogsUpdateHotelItem();
model.setAttributes(/* value */);  // Set attributes
model.setHotelId(/* value */);  // Set hotel_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsUpdateHotelItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpdateHotelItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpdateRetailItem

```cpp
// Create a model
auto model = models::CatalogsUpdateRetailItem();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation
model.setUpdateMask(/* value */);  // Set update_mask

// Serialize to JSON
nlohmann::json json = models::CatalogsUpdateRetailItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpdateRetailItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpsertCreativeAssetsItem

```cpp
// Create a model
auto model = models::CatalogsUpsertCreativeAssetsItem();
model.setAttributes(/* value */);  // Set attributes
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsUpsertCreativeAssetsItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpsertCreativeAssetsItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpsertHotelItem

```cpp
// Create a model
auto model = models::CatalogsUpsertHotelItem();
model.setAttributes(/* value */);  // Set attributes
model.setHotelId(/* value */);  // Set hotel_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsUpsertHotelItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpsertHotelItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsUpsertRetailItem

```cpp
// Create a model
auto model = models::CatalogsUpsertRetailItem();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation

// Serialize to JSON
nlohmann::json json = models::CatalogsUpsertRetailItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsUpsertRetailItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OperateOnItemBatch

```cpp
// Create a model
auto model = models::OperateOnItemBatch();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setItems(/* value */);  // Set items
model.setLanguage(/* value */);  // Set language

// Serialize to JSON
nlohmann::json json = models::OperateOnItemBatch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OperateOnItemBatch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedsCreateRequest

```cpp
// Create a model
auto model = models::FeedsCreateRequest();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCountry(/* value */);  // Set default_country
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setDefaultLocale(/* value */);  // Set default_locale
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::FeedsCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedsCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedsUpdateRequest

```cpp
// Create a model
auto model = models::FeedsUpdateRequest();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCredentials(/* value */);  // Set credentials
model.setDefaultAvailability(/* value */);  // Set default_availability
model.setDefaultCurrency(/* value */);  // Set default_currency
model.setFormat(/* value */);  // Set format
model.setLocation(/* value */);  // Set location
model.setName(/* value */);  // Set name
model.setPreferredProcessingSchedule(/* value */);  // Set preferred_processing_schedule
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::FeedsUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedsUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroup

```cpp
// Create a model
auto model = models::ProductGroup();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setCreatedAt(/* value */);  // Set created_at
model.setDescription(/* value */);  // Set description
model.setFeedId(/* value */);  // Set feed_id
model.setFilters(/* value */);  // Set filters
model.setId(/* value */);  // Set id
model.setIsFeatured(/* value */);  // Set is_featured
model.setLocale(/* value */);  // Set locale
model.setName(/* value */);  // Set name
model.setStatus(/* value */);  // Set status
model.setType(/* value */);  // Set type
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::ProductGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogBased

```cpp
// Create a model
auto model = models::CatalogBased();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setLocale(/* value */);  // Set locale
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CatalogBased::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogBased::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogBased

```cpp
// Create a model
auto model = models::CatalogBased();
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setDescription(/* value */);  // Set description
model.setFilters(/* value */);  // Set filters
model.setLocale(/* value */);  // Set locale
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CatalogBased::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogBased::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogBasedProductGroup

```cpp
// Create a model
auto model = models::CatalogBasedProductGroup();
model.setCatalogId(/* value */);  // Set catalog_id
model.setCatalogType(/* value */);  // Set catalog_type
model.setCountry(/* value */);  // Set country
model.setFilters(/* value */);  // Set filters
model.setLocale(/* value */);  // Set locale

// Serialize to JSON
nlohmann::json json = models::CatalogBasedProductGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogBasedProductGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChangeHistoryDataType

```cpp
// Create a model
auto model = models::ChangeHistoryDataType();

// Serialize to JSON
nlohmann::json json = models::ChangeHistoryDataType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChangeHistoryDataType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChangeHistoryOperationType

```cpp
// Create a model
auto model = models::ChangeHistoryOperationType();

// Serialize to JSON
nlohmann::json json = models::ChangeHistoryOperationType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChangeHistoryOperationType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CollectionsHeaderType

```cpp
// Create a model
auto model = models::CollectionsHeaderType();

// Serialize to JSON
nlohmann::json json = models::CollectionsHeaderType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CollectionsHeaderType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Condition

```cpp
// Create a model
auto model = models::Condition();
model.setCONDITION(/* value */);  // Set CONDITION

// Serialize to JSON
nlohmann::json json = models::Condition::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Condition::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ContentType

```cpp
// Create a model
auto model = models::ContentType();

// Serialize to JSON
nlohmann::json json = models::ContentType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ContentType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionAccessTokenResponse

```cpp
// Create a model
auto model = models::ConversionAccessTokenResponse();
model.setAccessToken(/* value */);  // Set access_token
model.setTokenType(/* value */);  // Set token_type

// Serialize to JSON
nlohmann::json json = models::ConversionAccessTokenResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionAccessTokenResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionApiResponseEventsItems

```cpp
// Create a model
auto model = models::ConversionApiResponseEventsItems();
model.setErrorMessage(/* value */);  // Set error_message
model.setStatus(/* value */);  // Set status
model.setWarningMessage(/* value */);  // Set warning_message

// Serialize to JSON
nlohmann::json json = models::ConversionApiResponseEventsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionApiResponseEventsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionAttributionWindowDays

```cpp
// Create a model
auto model = models::ConversionAttributionWindowDays();

// Serialize to JSON
nlohmann::json json = models::ConversionAttributionWindowDays::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionAttributionWindowDays::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionDeletionRequest

```cpp
// Create a model
auto model = models::ConversionDeletionRequest();
model.setCreatedTime(/* value */);  // Set created_time
model.setProcessedTime(/* value */);  // Set processed_time
model.setRequestId(/* value */);  // Set request_id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::ConversionDeletionRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionDeletionRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionDeletionRequestCreate

```cpp
// Create a model
auto model = models::ConversionDeletionRequestCreate();
model.setDeletionTargets(/* value */);  // Set deletion_targets

// Serialize to JSON
nlohmann::json json = models::ConversionDeletionRequestCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionDeletionRequestCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionDeletionRequestEPIKTargets

```cpp
// Create a model
auto model = models::ConversionDeletionRequestEPIKTargets();
model.setEpiks(/* value */);  // Set epiks

// Serialize to JSON
nlohmann::json json = models::ConversionDeletionRequestEPIKTargets::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionDeletionRequestEPIKTargets::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionDeletionRequestList200Response

```cpp
// Create a model
auto model = models::ConversionDeletionRequestList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ConversionDeletionRequestList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionDeletionRequestList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionDeletionRequestStatus

```cpp
// Create a model
auto model = models::ConversionDeletionRequestStatus();

// Serialize to JSON
nlohmann::json json = models::ConversionDeletionRequestStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionDeletionRequestStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionDeletionRequestTargets

```cpp
// Create a model
auto model = models::ConversionDeletionRequestTargets();
model.setUserEmails(/* value */);  // Set user_emails
model.setEpiks(/* value */);  // Set epiks

// Serialize to JSON
nlohmann::json json = models::ConversionDeletionRequestTargets::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionDeletionRequestTargets::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionDeletionRequestUserEmailTargets

```cpp
// Create a model
auto model = models::ConversionDeletionRequestUserEmailTargets();
model.setUserEmails(/* value */);  // Set user_emails

// Serialize to JSON
nlohmann::json json = models::ConversionDeletionRequestUserEmailTargets::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionDeletionRequestUserEmailTargets::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEvent

```cpp
// Create a model
auto model = models::ConversionEvent();

// Serialize to JSON
nlohmann::json json = models::ConversionEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventAppInfo

```cpp
// Create a model
auto model = models::ConversionEventAppInfo();
model.setAppId(/* value */);  // Set app_id
model.setAppName(/* value */);  // Set app_name
model.setAppPackageName(/* value */);  // Set app_package_name
model.setAppStore(/* value */);  // Set app_store
model.setAppVersion(/* value */);  // Set app_version
model.setInstallTime(/* value */);  // Set install_time
model.setUserAgent(/* value */);  // Set user_agent
model.setWindowHeight(/* value */);  // Set window_height
model.setWindowWidth(/* value */);  // Set window_width

// Serialize to JSON
nlohmann::json json = models::ConversionEventAppInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventAppInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventDeviceInfo

```cpp
// Create a model
auto model = models::ConversionEventDeviceInfo();
model.setBatteryLevel(/* value */);  // Set battery_level
model.setBrand(/* value */);  // Set brand
model.setCarrier(/* value */);  // Set carrier
model.setCpuCores(/* value */);  // Set cpu_cores
model.setExternalStorageFreeSpace(/* value */);  // Set external_storage_free_space
model.setExternalStorageSize(/* value */);  // Set external_storage_size
model.setFormFactor(/* value */);  // Set form_factor
model.setKernelVersion(/* value */);  // Set kernel_version
model.setLanguages(/* value */);  // Set languages
model.setLocale(/* value */);  // Set locale
model.setModel(/* value */);  // Set model
model.setNetworkType(/* value */);  // Set network_type
model.setOsFamily(/* value */);  // Set os_family
model.setOsName(/* value */);  // Set os_name
model.setOsReleaseName(/* value */);  // Set os_release_name
model.setOsVersion(/* value */);  // Set os_version
model.setScreenDensity(/* value */);  // Set screen_density
model.setScreenHeight(/* value */);  // Set screen_height
model.setScreenWidth(/* value */);  // Set screen_width
model.setStorageFreeSpace(/* value */);  // Set storage_free_space
model.setStorageSize(/* value */);  // Set storage_size
model.setTimezone(/* value */);  // Set timezone
model.setTimezoneAbbr(/* value */);  // Set timezone_abbr
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::ConversionEventDeviceInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventDeviceInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventIngestionSource

```cpp
// Create a model
auto model = models::ConversionEventIngestionSource();

// Serialize to JSON
nlohmann::json json = models::ConversionEventIngestionSource::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventIngestionSource::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventResponse

```cpp
// Create a model
auto model = models::ConversionEventResponse();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setConversionEvent(/* value */);  // Set conversion_event
model.setConversionTagId(/* value */);  // Set conversion_tag_id
model.setCreatedTime(/* value */);  // Set created_time
model.setReportingConversionEvent(/* value */);  // Set reporting_conversion_event

// Serialize to JSON
nlohmann::json json = models::ConversionEventResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEvents

```cpp
// Create a model
auto model = models::ConversionEvents();
model.setEvents(/* value */);  // Set events
model.setNumEventsProcessed(/* value */);  // Set num_events_processed
model.setNumEventsReceived(/* value */);  // Set num_events_received

// Serialize to JSON
nlohmann::json json = models::ConversionEvents::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEvents::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventsCreate

```cpp
// Create a model
auto model = models::ConversionEventsCreate();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::ConversionEventsCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventsCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventsDataItems

```cpp
// Create a model
auto model = models::ConversionEventsDataItems();
model.setActionSource(/* value */);  // Set action_source
model.setAppId(/* value */);  // Set app_id
model.setAppInfo(/* value */);  // Set app_info
model.setAppName(/* value */);  // Set app_name
model.setAppVersion(/* value */);  // Set app_version
model.setCustomData(/* value */);  // Set custom_data
model.setDeviceBrand(/* value */);  // Set device_brand
model.setDeviceCarrier(/* value */);  // Set device_carrier
model.setDeviceInfo(/* value */);  // Set device_info
model.setDeviceModel(/* value */);  // Set device_model
model.setDeviceType(/* value */);  // Set device_type
model.setEventId(/* value */);  // Set event_id
model.setEventName(/* value */);  // Set event_name
model.setEventSourceUrl(/* value */);  // Set event_source_url
model.setEventTime(/* value */);  // Set event_time
model.setLanguage(/* value */);  // Set language
model.setOptOut(/* value */);  // Set opt_out
model.setOsVersion(/* value */);  // Set os_version
model.setPartnerName(/* value */);  // Set partner_name
model.setUserData(/* value */);  // Set user_data
model.setWifi(/* value */);  // Set wifi

// Serialize to JSON
nlohmann::json json = models::ConversionEventsDataItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventsDataItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventsDataItemsCustomData

```cpp
// Create a model
auto model = models::ConversionEventsDataItemsCustomData();
model.setContentBrand(/* value */);  // Set content_brand
model.setContentCategory(/* value */);  // Set content_category
model.setContentIds(/* value */);  // Set content_ids
model.setContentName(/* value */);  // Set content_name
model.setContents(/* value */);  // Set contents
model.setCurrency(/* value */);  // Set currency
model.setExternalMeasurementId(/* value */);  // Set external_measurement_id
model.setExternalMeasurementVendorId(/* value */);  // Set external_measurement_vendor_id
model.setNp(/* value */);  // Set np
model.setNumItems(/* value */);  // Set num_items
model.setOptOutType(/* value */);  // Set opt_out_type
model.setOrderId(/* value */);  // Set order_id
model.setPredictedLtv(/* value */);  // Set predicted_ltv
model.setSearchString(/* value */);  // Set search_string
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::ConversionEventsDataItemsCustomData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventsDataItemsCustomData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventsDataItemsCustomDataContentsItems

```cpp
// Create a model
auto model = models::ConversionEventsDataItemsCustomDataContentsItems();
model.setId(/* value */);  // Set id
model.setItemBrand(/* value */);  // Set item_brand
model.setItemBrandId(/* value */);  // Set item_brand_id
model.setItemCategory(/* value */);  // Set item_category
model.setItemName(/* value */);  // Set item_name
model.setItemPrice(/* value */);  // Set item_price
model.setQuantity(/* value */);  // Set quantity

// Serialize to JSON
nlohmann::json json = models::ConversionEventsDataItemsCustomDataContentsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventsDataItemsCustomDataContentsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionEventsUserDataProperties

```cpp
// Create a model
auto model = models::ConversionEventsUserDataProperties();
model.setClickId(/* value */);  // Set click_id
model.setClientIpAddress(/* value */);  // Set client_ip_address
model.setClientUserAgent(/* value */);  // Set client_user_agent
model.setCountry(/* value */);  // Set country
model.setCt(/* value */);  // Set ct
model.setDb(/* value */);  // Set db
model.setEm(/* value */);  // Set em
model.setExternalId(/* value */);  // Set external_id
model.setFn(/* value */);  // Set fn
model.setGe(/* value */);  // Set ge
model.setHashedMaids(/* value */);  // Set hashed_maids
model.setLn(/* value */);  // Set ln
model.setPartnerId(/* value */);  // Set partner_id
model.setPh(/* value */);  // Set ph
model.setSt(/* value */);  // Set st
model.setZp(/* value */);  // Set zp

// Serialize to JSON
nlohmann::json json = models::ConversionEventsUserDataProperties::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionEventsUserDataProperties::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionHealthSelectionItem

```cpp
// Create a model
auto model = models::ConversionHealthSelectionItem();
model.setConversionType(/* value */);  // Set conversionType
model.setCriteria(/* value */);  // Set criteria
model.setIngestionSource(/* value */);  // Set ingestionSource
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::ConversionHealthSelectionItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionHealthSelectionItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionLearningModeType

```cpp
// Create a model
auto model = models::ConversionLearningModeType();

// Serialize to JSON
nlohmann::json json = models::ConversionLearningModeType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionLearningModeType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionMSOTEventsCreate

```cpp
// Create a model
auto model = models::ConversionMSOTEventsCreate();
model.setActionTimestamps(/* value */);  // Set action_timestamps
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setAttributionModel(/* value */);  // Set attribution_model
model.setAttributionScope(/* value */);  // Set attribution_scope
model.setAttributionScore(/* value */);  // Set attribution_score
model.setCampaignId(/* value */);  // Set campaign_id
model.setClickWindow(/* value */);  // Set click_window
model.setCurrency(/* value */);  // Set currency
model.setEventId(/* value */);  // Set event_id
model.setEventName(/* value */);  // Set event_name
model.setEventTimestamp(/* value */);  // Set event_timestamp
model.setTotalEventTouchpoints(/* value */);  // Set total_event_touchpoints
model.setTotalEvents(/* value */);  // Set total_events
model.setTotalEventsFractional(/* value */);  // Set total_events_fractional
model.setValue(/* value */);  // Set value
model.setViewWindow(/* value */);  // Set view_window

// Serialize to JSON
nlohmann::json json = models::ConversionMSOTEventsCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionMSOTEventsCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionObjectiveType

```cpp
// Create a model
auto model = models::ConversionObjectiveType();

// Serialize to JSON
nlohmann::json json = models::ConversionObjectiveType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionObjectiveType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionProductAttributionType

```cpp
// Create a model
auto model = models::ConversionProductAttributionType();

// Serialize to JSON
nlohmann::json json = models::ConversionProductAttributionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionProductAttributionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionProductReport

```cpp
// Create a model
auto model = models::ConversionProductReport();
model.setMessage(/* value */);  // Set message
model.setReportStatus(/* value */);  // Set report_status
model.setSize(/* value */);  // Set size
model.setToken(/* value */);  // Set token
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ConversionProductReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionProductReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionProductReportBreakdownType

```cpp
// Create a model
auto model = models::ConversionProductReportBreakdownType();

// Serialize to JSON
nlohmann::json json = models::ConversionProductReportBreakdownType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionProductReportBreakdownType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionProductReportCreate

```cpp
// Create a model
auto model = models::ConversionProductReportCreate();
model.setAdGroupIds(/* value */);  // Set ad_group_ids
model.setCampaignIds(/* value */);  // Set campaign_ids
model.setCampaignObjectiveTypes(/* value */);  // Set campaign_objective_types
model.setClickWindowDays(/* value */);  // Set click_window_days
model.setColumns(/* value */);  // Set columns
model.setConversionProductAttributionType(/* value */);  // Set conversion_product_attribution_type
model.setConversionProductBreakdown(/* value */);  // Set conversion_product_breakdown
model.setConversionReportTime(/* value */);  // Set conversion_report_time
model.setEndDate(/* value */);  // Set end_date
model.setGranularity(/* value */);  // Set granularity
model.setLevel(/* value */);  // Set level
model.setProductSkuIds(/* value */);  // Set product_sku_ids
model.setReportName(/* value */);  // Set report_name
model.setStartDate(/* value */);  // Set start_date
model.setViewWindowDays(/* value */);  // Set view_window_days

// Serialize to JSON
nlohmann::json json = models::ConversionProductReportCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionProductReportCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionProductReportGranularity

```cpp
// Create a model
auto model = models::ConversionProductReportGranularity();

// Serialize to JSON
nlohmann::json json = models::ConversionProductReportGranularity::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionProductReportGranularity::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionProductReportLevel

```cpp
// Create a model
auto model = models::ConversionProductReportLevel();

// Serialize to JSON
nlohmann::json json = models::ConversionProductReportLevel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionProductReportLevel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionProductReportingColumn

```cpp
// Create a model
auto model = models::ConversionProductReportingColumn();

// Serialize to JSON
nlohmann::json json = models::ConversionProductReportingColumn::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionProductReportingColumn::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionReportAttributionType

```cpp
// Create a model
auto model = models::ConversionReportAttributionType();

// Serialize to JSON
nlohmann::json json = models::ConversionReportAttributionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionReportAttributionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionReportTimeType

```cpp
// Create a model
auto model = models::ConversionReportTimeType();

// Serialize to JSON
nlohmann::json json = models::ConversionReportTimeType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionReportTimeType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTag

```cpp
// Create a model
auto model = models::ConversionTag();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::ConversionTag::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTag::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagCommon

```cpp
// Create a model
auto model = models::ConversionTagCommon();
model.setCodeSnippet(/* value */);  // Set code_snippet
model.setConfigs(/* value */);  // Set configs
model.setEnhancedMatchStatus(/* value */);  // Set enhanced_match_status
model.setId(/* value */);  // Set id
model.setLastFiredTimeMs(/* value */);  // Set last_fired_time_ms
model.setName(/* value */);  // Set name
model.setVersion(/* value */);  // Set version

// Serialize to JSON
nlohmann::json json = models::ConversionTagCommon::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagCommon::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagConfigs

```cpp
// Create a model
auto model = models::ConversionTagConfigs();
model.setAemDbEnabled(/* value */);  // Set aem_db_enabled
model.setAemEnabled(/* value */);  // Set aem_enabled
model.setAemExternalIdEnabled(/* value */);  // Set aem_external_id_enabled
model.setAemFnlnEnabled(/* value */);  // Set aem_fnln_enabled
model.setAemGeEnabled(/* value */);  // Set aem_ge_enabled
model.setAemLocEnabled(/* value */);  // Set aem_loc_enabled
model.setAemPhEnabled(/* value */);  // Set aem_ph_enabled
model.setMdFrequency(/* value */);  // Set md_frequency
model.setNoCodeCapiDomains(/* value */);  // Set no_code_capi_domains

// Serialize to JSON
nlohmann::json json = models::ConversionTagConfigs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagConfigs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagCreate

```cpp
// Create a model
auto model = models::ConversionTagCreate();
model.setAemDbEnabled(/* value */);  // Set aem_db_enabled
model.setAemEnabled(/* value */);  // Set aem_enabled
model.setAemExternalIdEnabled(/* value */);  // Set aem_external_id_enabled
model.setAemFnlnEnabled(/* value */);  // Set aem_fnln_enabled
model.setAemGeEnabled(/* value */);  // Set aem_ge_enabled
model.setAemLocEnabled(/* value */);  // Set aem_loc_enabled
model.setAemPhEnabled(/* value */);  // Set aem_ph_enabled
model.setMdFrequency(/* value */);  // Set md_frequency
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ConversionTagCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagResponse

```cpp
// Create a model
auto model = models::ConversionTagResponse();
model.setCodeSnippet(/* value */);  // Set code_snippet
model.setConfigs(/* value */);  // Set configs
model.setEnhancedMatchStatus(/* value */);  // Set enhanced_match_status
model.setId(/* value */);  // Set id
model.setLastFiredTimeMs(/* value */);  // Set last_fired_time_ms
model.setName(/* value */);  // Set name
model.setVersion(/* value */);  // Set version
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::ConversionTagResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagType

```cpp
// Create a model
auto model = models::ConversionTagType();

// Serialize to JSON
nlohmann::json json = models::ConversionTagType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagTypeOptimal

```cpp
// Create a model
auto model = models::ConversionTagTypeOptimal();

// Serialize to JSON
nlohmann::json json = models::ConversionTagTypeOptimal::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagTypeOptimal::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagV3GoalMetadata

```cpp
// Create a model
auto model = models::ConversionTagV3GoalMetadata();
model.setAttributionWindows(/* value */);  // Set attribution_windows
model.setConversionEvent(/* value */);  // Set conversion_event
model.setConversionTagId(/* value */);  // Set conversion_tag_id
model.setCpaGoalValueInMicroCurrency(/* value */);  // Set cpa_goal_value_in_micro_currency
model.setIsRoasOptimized(/* value */);  // Set is_roas_optimized
model.setReportingEvent(/* value */);  // Set reporting_event

// Serialize to JSON
nlohmann::json json = models::ConversionTagV3GoalMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagV3GoalMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ConversionTagsList200Response

```cpp
// Create a model
auto model = models::ConversionTagsList200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ConversionTagsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ConversionTagsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Country

```cpp
// Create a model
auto model = models::Country();

// Serialize to JSON
nlohmann::json json = models::Country::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Country::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Country

```cpp
// Create a model
auto model = models::Country();
model.setCOUNTRY(/* value */);  // Set COUNTRY

// Serialize to JSON
nlohmann::json json = models::Country::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Country::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssetAccessRequestBody

```cpp
// Create a model
auto model = models::CreateAssetAccessRequestBody();
model.setAssetRequests(/* value */);  // Set asset_requests

// Serialize to JSON
nlohmann::json json = models::CreateAssetAccessRequestBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssetAccessRequestBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssetAccessRequestItem

```cpp
// Create a model
auto model = models::CreateAssetAccessRequestItem();
model.setAssetIdToPermissions(/* value */);  // Set asset_id_to_permissions
model.setPartnerId(/* value */);  // Set partner_id

// Serialize to JSON
nlohmann::json json = models::CreateAssetAccessRequestItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssetAccessRequestItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssetAccessRequestResponse

```cpp
// Create a model
auto model = models::CreateAssetAccessRequestResponse();
model.setExceptions(/* value */);  // Set exceptions
model.setInvites(/* value */);  // Set invites

// Serialize to JSON
nlohmann::json json = models::CreateAssetAccessRequestResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssetAccessRequestResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssetInvitesRequest

```cpp
// Create a model
auto model = models::CreateAssetInvitesRequest();
model.setInvites(/* value */);  // Set invites

// Serialize to JSON
nlohmann::json json = models::CreateAssetInvitesRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssetInvitesRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssetInvitesRequestItem

```cpp
// Create a model
auto model = models::CreateAssetInvitesRequestItem();
model.setAssetIdToPermissions(/* value */);  // Set asset_id_to_permissions
model.setInviteId(/* value */);  // Set invite_id
model.setInviteType(/* value */);  // Set invite_type

// Serialize to JSON
nlohmann::json json = models::CreateAssetInvitesRequestItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssetInvitesRequestItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateInvitesResultsResponseArray

```cpp
// Create a model
auto model = models::CreateInvitesResultsResponseArray();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CreateInvitesResultsResponseArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateInvitesResultsResponseArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateMembershipOrPartnershipInvitesBody

```cpp
// Create a model
auto model = models::CreateMembershipOrPartnershipInvitesBody();
model.setBusinessRole(/* value */);  // Set business_role
model.setInviteType(/* value */);  // Set invite_type
model.setMembers(/* value */);  // Set members
model.setPartners(/* value */);  // Set partners

// Serialize to JSON
nlohmann::json json = models::CreateMembershipOrPartnershipInvitesBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateMembershipOrPartnershipInvitesBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreationSource

```cpp
// Create a model
auto model = models::CreationSource();

// Serialize to JSON
nlohmann::json json = models::CreationSource::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreationSource::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeAssetsId

```cpp
// Create a model
auto model = models::CreativeAssetsId();
model.setCREATIVEASSETSID(/* value */);  // Set CREATIVE_ASSETS_ID

// Serialize to JSON
nlohmann::json json = models::CreativeAssetsId::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeAssetsId::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeAssetsProcessingRecord

```cpp
// Create a model
auto model = models::CreativeAssetsProcessingRecord();
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setErrors(/* value */);  // Set errors
model.setStatus(/* value */);  // Set status
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::CreativeAssetsProcessingRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeAssetsProcessingRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeAssetsVisibilityType

```cpp
// Create a model
auto model = models::CreativeAssetsVisibilityType();

// Serialize to JSON
nlohmann::json json = models::CreativeAssetsVisibilityType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeAssetsVisibilityType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreativeTypeEnumUsedAds

```cpp
// Create a model
auto model = models::CreativeTypeEnumUsedAds();

// Serialize to JSON
nlohmann::json json = models::CreativeTypeEnumUsedAds::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreativeTypeEnumUsedAds::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Currency

```cpp
// Create a model
auto model = models::Currency();

// Serialize to JSON
nlohmann::json json = models::Currency::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Currency::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Currency

```cpp
// Create a model
auto model = models::Currency();
model.setCURRENCY(/* value */);  // Set CURRENCY

// Serialize to JSON
nlohmann::json json = models::Currency::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Currency::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomConversionEventMetrics

```cpp
// Create a model
auto model = models::CustomConversionEventMetrics();
model.setCustomEventMetricsType(/* value */);  // Set custom_event_metrics_type
model.setCustomEventName(/* value */);  // Set custom_event_name

// Serialize to JSON
nlohmann::json json = models::CustomConversionEventMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomConversionEventMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomLabel0

```cpp
// Create a model
auto model = models::CustomLabel0();
model.setCUSTOMLABEL0(/* value */);  // Set CUSTOM_LABEL_0

// Serialize to JSON
nlohmann::json json = models::CustomLabel0::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomLabel0::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomLabel1

```cpp
// Create a model
auto model = models::CustomLabel1();
model.setCUSTOMLABEL1(/* value */);  // Set CUSTOM_LABEL_1

// Serialize to JSON
nlohmann::json json = models::CustomLabel1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomLabel1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomLabel2

```cpp
// Create a model
auto model = models::CustomLabel2();
model.setCUSTOMLABEL2(/* value */);  // Set CUSTOM_LABEL_2

// Serialize to JSON
nlohmann::json json = models::CustomLabel2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomLabel2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomLabel3

```cpp
// Create a model
auto model = models::CustomLabel3();
model.setCUSTOMLABEL3(/* value */);  // Set CUSTOM_LABEL_3

// Serialize to JSON
nlohmann::json json = models::CustomLabel3::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomLabel3::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomLabel4

```cpp
// Create a model
auto model = models::CustomLabel4();
model.setCUSTOMLABEL4(/* value */);  // Set CUSTOM_LABEL_4

// Serialize to JSON
nlohmann::json json = models::CustomLabel4::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomLabel4::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomNumber0

```cpp
// Create a model
auto model = models::CustomNumber0();
model.setCUSTOMNUMBER0(/* value */);  // Set CUSTOM_NUMBER_0

// Serialize to JSON
nlohmann::json json = models::CustomNumber0::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomNumber0::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomNumber1

```cpp
// Create a model
auto model = models::CustomNumber1();
model.setCUSTOMNUMBER1(/* value */);  // Set CUSTOM_NUMBER_1

// Serialize to JSON
nlohmann::json json = models::CustomNumber1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomNumber1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomNumber2

```cpp
// Create a model
auto model = models::CustomNumber2();
model.setCUSTOMNUMBER2(/* value */);  // Set CUSTOM_NUMBER_2

// Serialize to JSON
nlohmann::json json = models::CustomNumber2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomNumber2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomNumber3

```cpp
// Create a model
auto model = models::CustomNumber3();
model.setCUSTOMNUMBER3(/* value */);  // Set CUSTOM_NUMBER_3

// Serialize to JSON
nlohmann::json json = models::CustomNumber3::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomNumber3::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomNumber4

```cpp
// Create a model
auto model = models::CustomNumber4();
model.setCUSTOMNUMBER4(/* value */);  // Set CUSTOM_NUMBER_4

// Serialize to JSON
nlohmann::json json = models::CustomNumber4::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomNumber4::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerList

```cpp
// Create a model
auto model = models::CustomerList();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setCreatedTime(/* value */);  // Set created_time
model.setExceptions(/* value */);  // Set exceptions
model.setId(/* value */);  // Set id
model.setIsNca(/* value */);  // Set is_nca
model.setName(/* value */);  // Set name
model.setNumBatches(/* value */);  // Set num_batches
model.setNumRemovedUserRecords(/* value */);  // Set num_removed_user_records
model.setNumUploadedUserRecords(/* value */);  // Set num_uploaded_user_records
model.setStatus(/* value */);  // Set status
model.setType(/* value */);  // Set type
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::CustomerList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListCreate

```cpp
// Create a model
auto model = models::CustomerListCreate();
model.setIsNca(/* value */);  // Set is_nca
model.setListType(/* value */);  // Set list_type
model.setName(/* value */);  // Set name
model.setRecords(/* value */);  // Set records
model.setRecordsV2(/* value */);  // Set records_v2

// Serialize to JSON
nlohmann::json json = models::CustomerListCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListRecordRow

```cpp
// Create a model
auto model = models::CustomerListRecordRow();
model.setEmail(/* value */);  // Set email
model.setExternalId(/* value */);  // Set external_id
model.setHashedPhoneNumber(/* value */);  // Set hashed_phone_number
model.setHashedPinnerId(/* value */);  // Set hashed_pinner_id
model.setIpAddress(/* value */);  // Set ip_address
model.setLiverampEnvelope(/* value */);  // Set liveramp_envelope
model.setMaid(/* value */);  // Set maid
model.setUserAgent(/* value */);  // Set user_agent

// Serialize to JSON
nlohmann::json json = models::CustomerListRecordRow::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListRecordRow::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListStatus

```cpp
// Create a model
auto model = models::CustomerListStatus();

// Serialize to JSON
nlohmann::json json = models::CustomerListStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::CustomerListUpdateWithRequiredBody();
model.setOperationType(/* value */);  // Set operation_type
model.setRecords(/* value */);  // Set records
model.setRecordsV2(/* value */);  // Set records_v2

// Serialize to JSON
nlohmann::json json = models::CustomerListUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListUpload

```cpp
// Create a model
auto model = models::CustomerListUpload();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setCreationTime(/* value */);  // Set creation_time
model.setCustomerListId(/* value */);  // Set customer_list_id
model.setErrorCounts(/* value */);  // Set error_counts
model.setId(/* value */);  // Set id
model.setOperation(/* value */);  // Set operation
model.setRecordCounts(/* value */);  // Set record_counts
model.setState(/* value */);  // Set state
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::CustomerListUpload::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListUpload::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListUploadCreateRequest

```cpp
// Create a model
auto model = models::CustomerListUploadCreateRequest();
model.setOperation(/* value */);  // Set operation
model.setTotalParts(/* value */);  // Set total_parts

// Serialize to JSON
nlohmann::json json = models::CustomerListUploadCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListUploadCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListUploadCreateResponse

```cpp
// Create a model
auto model = models::CustomerListUploadCreateResponse();
model.setCustomerListUpload(/* value */);  // Set customer_list_upload
model.setS3MultipartUploadData(/* value */);  // Set s3_multipart_upload_data

// Serialize to JSON
nlohmann::json json = models::CustomerListUploadCreateResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListUploadCreateResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerListsList200Response

```cpp
// Create a model
auto model = models::CustomerListsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CustomerListsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerListsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerSegment

```cpp
// Create a model
auto model = models::CustomerSegment();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAudienceIds(/* value */);  // Set audience_ids
model.setCreatedTime(/* value */);  // Set created_time
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setStatus(/* value */);  // Set status
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::CustomerSegment::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerSegment::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerSegmentCreate

```cpp
// Create a model
auto model = models::CustomerSegmentCreate();
model.setAudienceIds(/* value */);  // Set audience_ids
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CustomerSegmentCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerSegmentCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerSegmentList200Response

```cpp
// Create a model
auto model = models::CustomerSegmentList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::CustomerSegmentList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerSegmentList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomerSegmentUpdateRequestUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::CustomerSegmentUpdateRequestUpdateWithRequiredBody();
model.setAudienceIds(/* value */);  // Set audience_ids
model.setId(/* value */);  // Set id
model.setOperationType(/* value */);  // Set operation_type

// Serialize to JSON
nlohmann::json json = models::CustomerSegmentUpdateRequestUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomerSegmentUpdateRequestUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CustomizableCTAType

```cpp
// Create a model
auto model = models::CustomizableCTAType();

// Serialize to JSON
nlohmann::json json = models::CustomizableCTAType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CustomizableCTAType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DataOutputFormat

```cpp
// Create a model
auto model = models::DataOutputFormat();

// Serialize to JSON
nlohmann::json json = models::DataOutputFormat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DataOutputFormat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DataStatus

```cpp
// Create a model
auto model = models::DataStatus();

// Serialize to JSON
nlohmann::json json = models::DataStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DataStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteBusinessMembership200Response

```cpp
// Create a model
auto model = models::DeleteBusinessMembership200Response();
model.setDeletedMembers(/* value */);  // Set deleted_members

// Serialize to JSON
nlohmann::json json = models::DeleteBusinessMembership200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteBusinessMembership200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteBusinessMembershipBody

```cpp
// Create a model
auto model = models::DeleteBusinessMembershipBody();
model.setMembers(/* value */);  // Set members

// Serialize to JSON
nlohmann::json json = models::DeleteBusinessMembershipBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteBusinessMembershipBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteBusinessMembershipMember

```cpp
// Create a model
auto model = models::DeleteBusinessMembershipMember();
model.setBusinessRole(/* value */);  // Set business_role
model.setMemberId(/* value */);  // Set member_id

// Serialize to JSON
nlohmann::json json = models::DeleteBusinessMembershipMember::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteBusinessMembershipMember::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteBusinessPartners

```cpp
// Create a model
auto model = models::DeleteBusinessPartners();
model.setDeletedPartners(/* value */);  // Set deleted_partners

// Serialize to JSON
nlohmann::json json = models::DeleteBusinessPartners::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteBusinessPartners::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteBusinessPartnersDelete

```cpp
// Create a model
auto model = models::DeleteBusinessPartnersDelete();
model.setPartnerIds(/* value */);  // Set partner_ids
model.setPartnerType(/* value */);  // Set partner_type

// Serialize to JSON
nlohmann::json json = models::DeleteBusinessPartnersDelete::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteBusinessPartnersDelete::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteMemberAccessResult

```cpp
// Create a model
auto model = models::DeleteMemberAccessResult();
model.setAssetId(/* value */);  // Set asset_id
model.setMemberId(/* value */);  // Set member_id

// Serialize to JSON
nlohmann::json json = models::DeleteMemberAccessResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteMemberAccessResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteMemberAccessResultsResponseArray

```cpp
// Create a model
auto model = models::DeleteMemberAccessResultsResponseArray();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::DeleteMemberAccessResultsResponseArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteMemberAccessResultsResponseArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteMemberAssetAccessItem

```cpp
// Create a model
auto model = models::DeleteMemberAssetAccessItem();
model.setAssetId(/* value */);  // Set asset_id
model.setMemberId(/* value */);  // Set member_id

// Serialize to JSON
nlohmann::json json = models::DeleteMemberAssetAccessItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteMemberAssetAccessItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeletePartnerAssetAccessBody

```cpp
// Create a model
auto model = models::DeletePartnerAssetAccessBody();
model.setAccesses(/* value */);  // Set accesses

// Serialize to JSON
nlohmann::json json = models::DeletePartnerAssetAccessBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeletePartnerAssetAccessBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeletePartnerAssetAccessItem

```cpp
// Create a model
auto model = models::DeletePartnerAssetAccessItem();
model.setAssetId(/* value */);  // Set asset_id
model.setPartnerId(/* value */);  // Set partner_id
model.setPartnerType(/* value */);  // Set partner_type

// Serialize to JSON
nlohmann::json json = models::DeletePartnerAssetAccessItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeletePartnerAssetAccessItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeletePartnerAssetAccessResult

```cpp
// Create a model
auto model = models::DeletePartnerAssetAccessResult();
model.setAssetId(/* value */);  // Set asset_id
model.setAssetType(/* value */);  // Set asset_type
model.setIsSharedPartner(/* value */);  // Set is_shared_partner
model.setPartnerId(/* value */);  // Set partner_id
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::DeletePartnerAssetAccessResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeletePartnerAssetAccessResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeletePartnerAssetAccessResultsResponseArray

```cpp
// Create a model
auto model = models::DeletePartnerAssetAccessResultsResponseArray();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::DeletePartnerAssetAccessResultsResponseArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeletePartnerAssetAccessResultsResponseArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeliveryEstimateObjectiveType

```cpp
// Create a model
auto model = models::DeliveryEstimateObjectiveType();

// Serialize to JSON
nlohmann::json json = models::DeliveryEstimateObjectiveType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeliveryEstimateObjectiveType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeliveryMetricsGet200Response

```cpp
// Create a model
auto model = models::DeliveryMetricsGet200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::DeliveryMetricsGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeliveryMetricsGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeliveryMetricsResponseItemsItems

```cpp
// Create a model
auto model = models::DeliveryMetricsResponseItemsItems();
model.setCategory(/* value */);  // Set category
model.setDefinition(/* value */);  // Set definition
model.setDisplayName(/* value */);  // Set display_name
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::DeliveryMetricsResponseItemsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeliveryMetricsResponseItemsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DetailedError

```cpp
// Create a model
auto model = models::DetailedError();
model.setCode(/* value */);  // Set code
model.setDetails(/* value */);  // Set details
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::DetailedError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DetailedError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DisclosureType

```cpp
// Create a model
auto model = models::DisclosureType();

// Serialize to JSON
nlohmann::json json = models::DisclosureType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DisclosureType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DiscountStatus

```cpp
// Create a model
auto model = models::DiscountStatus();

// Serialize to JSON
nlohmann::json json = models::DiscountStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DiscountStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DynamicTitlesDownloadCsv

```cpp
// Create a model
auto model = models::DynamicTitlesDownloadCsv();
model.setDownloadUrl(/* value */);  // Set download_url

// Serialize to JSON
nlohmann::json json = models::DynamicTitlesDownloadCsv::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DynamicTitlesDownloadCsv::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DynamicTitlesGetStatus

```cpp
// Create a model
auto model = models::DynamicTitlesGetStatus();
model.setGeneratedCount(/* value */);  // Set generated_count
model.setIsReady(/* value */);  // Set is_ready
model.setReviewedCount(/* value */);  // Set reviewed_count

// Serialize to JSON
nlohmann::json json = models::DynamicTitlesGetStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DynamicTitlesGetStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DynamicTitlesProcessCSVCreate

```cpp
// Create a model
auto model = models::DynamicTitlesProcessCSVCreate();
model.setRequestId(/* value */);  // Set request_id

// Serialize to JSON
nlohmann::json json = models::DynamicTitlesProcessCSVCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DynamicTitlesProcessCSVCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DynamicTitlesProcessCSVError

```cpp
// Create a model
auto model = models::DynamicTitlesProcessCSVError();
model.setErrorType(/* value */);  // Set error_type
model.setRowNumber(/* value */);  // Set row_number

// Serialize to JSON
nlohmann::json json = models::DynamicTitlesProcessCSVError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DynamicTitlesProcessCSVError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DynamicTitlesProcessCsv

```cpp
// Create a model
auto model = models::DynamicTitlesProcessCsv();
model.setErrors(/* value */);  // Set errors
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::DynamicTitlesProcessCsv::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DynamicTitlesProcessCsv::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DynamicTitlesUploadUrl

```cpp
// Create a model
auto model = models::DynamicTitlesUploadUrl();
model.setExistingFilename(/* value */);  // Set existing_filename
model.setRequestId(/* value */);  // Set request_id
model.setUploadUrl(/* value */);  // Set upload_url

// Serialize to JSON
nlohmann::json json = models::DynamicTitlesUploadUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DynamicTitlesUploadUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EnhancedMatchStatusType

```cpp
// Create a model
auto model = models::EnhancedMatchStatusType();

// Serialize to JSON
nlohmann::json json = models::EnhancedMatchStatusType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EnhancedMatchStatusType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EntityDataChangeHistory

```cpp
// Create a model
auto model = models::EntityDataChangeHistory();
model.setChangedFieldId(/* value */);  // Set changed_field_id
model.setChangedFieldName(/* value */);  // Set changed_field_name
model.setDataType(/* value */);  // Set data_type
model.setNewDataValue(/* value */);  // Set new_data_value
model.setOldDataValue(/* value */);  // Set old_data_value

// Serialize to JSON
nlohmann::json json = models::EntityDataChangeHistory::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EntityDataChangeHistory::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EntityHistory

```cpp
// Create a model
auto model = models::EntityHistory();
model.setChangeTimestamp(/* value */);  // Set change_timestamp
model.setDataChanges(/* value */);  // Set data_changes
model.setEntityId(/* value */);  // Set entity_id
model.setEntityName(/* value */);  // Set entity_name
model.setLdap(/* value */);  // Set ldap
model.setOperation(/* value */);  // Set operation
model.setUserId(/* value */);  // Set user_id

// Serialize to JSON
nlohmann::json json = models::EntityHistory::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EntityHistory::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EntityLabel

```cpp
// Create a model
auto model = models::EntityLabel();
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setLabelId(/* value */);  // Set label_id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::EntityLabel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EntityLabel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EntityLabelError

```cpp
// Create a model
auto model = models::EntityLabelError();
model.setData(/* value */);  // Set data
model.setErrorMessages(/* value */);  // Set error_messages

// Serialize to JSON
nlohmann::json json = models::EntityLabelError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EntityLabelError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EntityLabelStatus

```cpp
// Create a model
auto model = models::EntityLabelStatus();

// Serialize to JSON
nlohmann::json json = models::EntityLabelStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EntityLabelStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EntityStatus

```cpp
// Create a model
auto model = models::EntityStatus();

// Serialize to JSON
nlohmann::json json = models::EntityStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EntityStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ErrorDetail

```cpp
// Create a model
auto model = models::ErrorDetail();
model.setCount(/* value */);  // Set count
model.setErrorCode(/* value */);  // Set error_code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::ErrorDetail::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ErrorDetail::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EventData

```cpp
// Create a model
auto model = models::EventData();
model.setCurrency(/* value */);  // Set currency
model.setLeadType(/* value */);  // Set lead_type
model.setLineItems(/* value */);  // Set line_items
model.setOrderId(/* value */);  // Set order_id
model.setOrderQuantity(/* value */);  // Set order_quantity
model.setPageName(/* value */);  // Set page_name
model.setPromoCode(/* value */);  // Set promo_code
model.setProperty(/* value */);  // Set property
model.setSearchQuery(/* value */);  // Set search_query
model.setValue(/* value */);  // Set value
model.setVideoTitle(/* value */);  // Set video_title

// Serialize to JSON
nlohmann::json json = models::EventData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EventData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EventProcessingStatus

```cpp
// Create a model
auto model = models::EventProcessingStatus();

// Serialize to JSON
nlohmann::json json = models::EventProcessingStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EventProcessingStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::EventQualityScore

```cpp
// Create a model
auto model = models::EventQualityScore();
model.setIngestionSource(/* value */);  // Set ingestion_source
model.setLookbackPeriod(/* value */);  // Set lookback_period
model.setOverallStatus(/* value */);  // Set overall_status
model.setQualityComponents(/* value */);  // Set quality_components
model.setSourcePlatform(/* value */);  // Set source_platform

// Serialize to JSON
nlohmann::json json = models::EventQualityScore::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::EventQualityScore::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Exception

```cpp
// Create a model
auto model = models::Exception();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::Exception::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Exception::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeaturedTrend

```cpp
// Create a model
auto model = models::FeaturedTrend();
model.setInterest(/* value */);  // Set interest
model.setMarket(/* value */);  // Set market
model.setTrends(/* value */);  // Set trends

// Serialize to JSON
nlohmann::json json = models::FeaturedTrend::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeaturedTrend::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedProcessingResultsList200Response

```cpp
// Create a model
auto model = models::FeedProcessingResultsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::FeedProcessingResultsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedProcessingResultsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FeedsList200Response

```cpp
// Create a model
auto model = models::FeedsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::FeedsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FeedsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FilterOperatorType

```cpp
// Create a model
auto model = models::FilterOperatorType();

// Serialize to JSON
nlohmann::json json = models::FilterOperatorType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FilterOperatorType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FollowFollowingUser

```cpp
// Create a model
auto model = models::FollowFollowingUser();
model.setType(/* value */);  // Set type
model.setUsername(/* value */);  // Set username

// Serialize to JSON
nlohmann::json json = models::FollowFollowingUser::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FollowFollowingUser::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FollowUserCreate

```cpp
// Create a model
auto model = models::FollowUserCreate();
model.setAutoFollow(/* value */);  // Set auto_follow

// Serialize to JSON
nlohmann::json json = models::FollowUserCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FollowUserCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FollowersList200Response

```cpp
// Create a model
auto model = models::FollowersList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::FollowersList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FollowersList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FormFactor

```cpp
// Create a model
auto model = models::FormFactor();

// Serialize to JSON
nlohmann::json json = models::FormFactor::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FormFactor::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FreqBidMultiplierTimeWindow

```cpp
// Create a model
auto model = models::FreqBidMultiplierTimeWindow();

// Serialize to JSON
nlohmann::json json = models::FreqBidMultiplierTimeWindow::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FreqBidMultiplierTimeWindow::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FrequencyGoalMetadata

```cpp
// Create a model
auto model = models::FrequencyGoalMetadata();
model.setFrequency(/* value */);  // Set frequency
model.setTimerange(/* value */);  // Set timerange

// Serialize to JSON
nlohmann::json json = models::FrequencyGoalMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FrequencyGoalMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FrequencyGoalMetadataTimerange

```cpp
// Create a model
auto model = models::FrequencyGoalMetadataTimerange();

// Serialize to JSON
nlohmann::json json = models::FrequencyGoalMetadataTimerange::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FrequencyGoalMetadataTimerange::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FrequencyMultipliers

```cpp
// Create a model
auto model = models::FrequencyMultipliers();
model.setIMPRESSIONCOUNT(/* value */);  // Set IMPRESSION_COUNT

// Serialize to JSON
nlohmann::json json = models::FrequencyMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FrequencyMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Gender

```cpp
// Create a model
auto model = models::Gender();

// Serialize to JSON
nlohmann::json json = models::Gender::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Gender::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenderBucket

```cpp
// Create a model
auto model = models::GenderBucket();

// Serialize to JSON
nlohmann::json json = models::GenderBucket::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenderBucket::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenderDemographics

```cpp
// Create a model
auto model = models::GenderDemographics();
model.setFemale(/* value */);  // Set female
model.setMale(/* value */);  // Set male
model.setUnspecified(/* value */);  // Set unspecified

// Serialize to JSON
nlohmann::json json = models::GenderDemographics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenderDemographics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Gender

```cpp
// Create a model
auto model = models::Gender();
model.setGENDER(/* value */);  // Set GENDER

// Serialize to JSON
nlohmann::json json = models::Gender::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Gender::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenderMultipliers

```cpp
// Create a model
auto model = models::GenderMultipliers();
model.setGENDER(/* value */);  // Set GENDER

// Serialize to JSON
nlohmann::json json = models::GenderMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenderMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GetAdGroupsByPromotionIdsList200Response

```cpp
// Create a model
auto model = models::GetAdGroupsByPromotionIdsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::GetAdGroupsByPromotionIdsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GetAdGroupsByPromotionIdsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GetBusinessEmployers200Response

```cpp
// Create a model
auto model = models::GetBusinessEmployers200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::GetBusinessEmployers200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GetBusinessEmployers200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GetBusinessMembers200Response

```cpp
// Create a model
auto model = models::GetBusinessMembers200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::GetBusinessMembers200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GetBusinessMembers200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GetBusinessPartners200Response

```cpp
// Create a model
auto model = models::GetBusinessPartners200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::GetBusinessPartners200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GetBusinessPartners200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GetInvites200Response

```cpp
// Create a model
auto model = models::GetInvites200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::GetInvites200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GetInvites200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GoogleProductCategory0

```cpp
// Create a model
auto model = models::GoogleProductCategory0();
model.setGOOGLEPRODUCTCATEGORY0(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_0

// Serialize to JSON
nlohmann::json json = models::GoogleProductCategory0::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GoogleProductCategory0::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GoogleProductCategory1

```cpp
// Create a model
auto model = models::GoogleProductCategory1();
model.setGOOGLEPRODUCTCATEGORY1(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_1

// Serialize to JSON
nlohmann::json json = models::GoogleProductCategory1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GoogleProductCategory1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GoogleProductCategory2

```cpp
// Create a model
auto model = models::GoogleProductCategory2();
model.setGOOGLEPRODUCTCATEGORY2(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_2

// Serialize to JSON
nlohmann::json json = models::GoogleProductCategory2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GoogleProductCategory2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GoogleProductCategory3

```cpp
// Create a model
auto model = models::GoogleProductCategory3();
model.setGOOGLEPRODUCTCATEGORY3(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_3

// Serialize to JSON
nlohmann::json json = models::GoogleProductCategory3::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GoogleProductCategory3::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GoogleProductCategory4

```cpp
// Create a model
auto model = models::GoogleProductCategory4();
model.setGOOGLEPRODUCTCATEGORY4(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_4

// Serialize to JSON
nlohmann::json json = models::GoogleProductCategory4::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GoogleProductCategory4::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GoogleProductCategory5

```cpp
// Create a model
auto model = models::GoogleProductCategory5();
model.setGOOGLEPRODUCTCATEGORY5(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_5

// Serialize to JSON
nlohmann::json json = models::GoogleProductCategory5::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GoogleProductCategory5::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GoogleProductCategory6

```cpp
// Create a model
auto model = models::GoogleProductCategory6();
model.setGOOGLEPRODUCTCATEGORY6(/* value */);  // Set GOOGLE_PRODUCT_CATEGORY_6

// Serialize to JSON
nlohmann::json json = models::GoogleProductCategory6::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GoogleProductCategory6::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Granularity

```cpp
// Create a model
auto model = models::Granularity();

// Serialize to JSON
nlohmann::json json = models::Granularity::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Granularity::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GridClickType

```cpp
// Create a model
auto model = models::GridClickType();

// Serialize to JSON
nlohmann::json json = models::GridClickType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GridClickType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HotelId

```cpp
// Create a model
auto model = models::HotelId();
model.setHOTELID(/* value */);  // Set HOTEL_ID

// Serialize to JSON
nlohmann::json json = models::HotelId::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HotelId::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HotelProcessingRecord

```cpp
// Create a model
auto model = models::HotelProcessingRecord();
model.setErrors(/* value */);  // Set errors
model.setHotelId(/* value */);  // Set hotel_id
model.setStatus(/* value */);  // Set status
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::HotelProcessingRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HotelProcessingRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::HttpMethod

```cpp
// Create a model
auto model = models::HttpMethod();

// Serialize to JSON
nlohmann::json json = models::HttpMethod::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::HttpMethod::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageDetailsContainingTheUrlAndDimensions

```cpp
// Create a model
auto model = models::ImageDetailsContainingTheUrlAndDimensions();
model.setHeight(/* value */);  // Set height
model.setUrl(/* value */);  // Set url
model.setWidth(/* value */);  // Set width

// Serialize to JSON
nlohmann::json json = models::ImageDetailsContainingTheUrlAndDimensions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageDetailsContainingTheUrlAndDimensions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageMetadataContainingTheDescriptionImagesItemTypeLinkAndTitle

```cpp
// Create a model
auto model = models::ImageMetadataContainingTheDescriptionImagesItemTypeLinkAndTitle();
model.setDescription(/* value */);  // Set description
model.setImages(/* value */);  // Set images
model.setItemType(/* value */);  // Set item_type
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::ImageMetadataContainingTheDescriptionImagesItemTypeLinkAndTitle::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageMetadataContainingTheDescriptionImagesItemTypeLinkAndTitle::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageSize

```cpp
// Create a model
auto model = models::ImageSize();
model.setR1200x(/* value */);  // Set 1200x
model.setR150x150(/* value */);  // Set 150x150
model.setR400x300(/* value */);  // Set 400x300
model.setR600x(/* value */);  // Set 600x

// Serialize to JSON
nlohmann::json json = models::ImageSize::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageSize::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IneligibleProductTagErrorItem

```cpp
// Create a model
auto model = models::IneligibleProductTagErrorItem();
model.setErrorMessage(/* value */);  // Set error_message
model.setPinId(/* value */);  // Set pin_id

// Serialize to JSON
nlohmann::json json = models::IneligibleProductTagErrorItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IneligibleProductTagErrorItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IneligibleProductTagReason

```cpp
// Create a model
auto model = models::IneligibleProductTagReason();

// Serialize to JSON
nlohmann::json json = models::IneligibleProductTagReason::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IneligibleProductTagReason::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IneligibleProductTagsErrorDetails

```cpp
// Create a model
auto model = models::IneligibleProductTagsErrorDetails();
model.setProductTags(/* value */);  // Set product_tags

// Serialize to JSON
nlohmann::json json = models::IneligibleProductTagsErrorDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IneligibleProductTagsErrorDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IngestionSource

```cpp
// Create a model
auto model = models::IngestionSource();

// Serialize to JSON
nlohmann::json json = models::IngestionSource::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IngestionSource::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IngestionSourceOptions

```cpp
// Create a model
auto model = models::IngestionSourceOptions();

// Serialize to JSON
nlohmann::json json = models::IngestionSourceOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IngestionSourceOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InnerProductCategoriesMetricsHighlights

```cpp
// Create a model
auto model = models::InnerProductCategoriesMetricsHighlights();
model.setPctChangeMom(/* value */);  // Set pct_change_mom

// Serialize to JSON
nlohmann::json json = models::InnerProductCategoriesMetricsHighlights::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InnerProductCategoriesMetricsHighlights::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLog

```cpp
// Create a model
auto model = models::IntegrationLog();
model.setAdvertiserId(/* value */);  // Set advertiser_id
model.setAppVersionNumber(/* value */);  // Set app_version_number
model.setClientTimestamp(/* value */);  // Set client_timestamp
model.setError(/* value */);  // Set error
model.setEventType(/* value */);  // Set event_type
model.setExternalBusinessId(/* value */);  // Set external_business_id
model.setFeedProfileId(/* value */);  // Set feed_profile_id
model.setLogLevel(/* value */);  // Set log_level
model.setMerchantId(/* value */);  // Set merchant_id
model.setMessage(/* value */);  // Set message
model.setPlatformVersionNumber(/* value */);  // Set platform_version_number
model.setRequest(/* value */);  // Set request
model.setTagId(/* value */);  // Set tag_id

// Serialize to JSON
nlohmann::json json = models::IntegrationLog::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLog::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogClientError

```cpp
// Create a model
auto model = models::IntegrationLogClientError();
model.setCause(/* value */);  // Set cause
model.setColumnNumber(/* value */);  // Set column_number
model.setFileName(/* value */);  // Set file_name
model.setLineNumber(/* value */);  // Set line_number
model.setMessage(/* value */);  // Set message
model.setMessageDetail(/* value */);  // Set message_detail
model.setName(/* value */);  // Set name
model.setNumber(/* value */);  // Set number
model.setStackTrace(/* value */);  // Set stack_trace

// Serialize to JSON
nlohmann::json json = models::IntegrationLogClientError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogClientError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogClientRequest

```cpp
// Create a model
auto model = models::IntegrationLogClientRequest();
model.setHost(/* value */);  // Set host
model.setMethod(/* value */);  // Set method
model.setPath(/* value */);  // Set path
model.setRequestHeaders(/* value */);  // Set request_headers
model.setResponseHeaders(/* value */);  // Set response_headers
model.setResponseStatusCode(/* value */);  // Set response_status_code

// Serialize to JSON
nlohmann::json json = models::IntegrationLogClientRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogClientRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogEventType

```cpp
// Create a model
auto model = models::IntegrationLogEventType();

// Serialize to JSON
nlohmann::json json = models::IntegrationLogEventType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogEventType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogLevel

```cpp
// Create a model
auto model = models::IntegrationLogLevel();

// Serialize to JSON
nlohmann::json json = models::IntegrationLogLevel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogLevel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogsInvalidLogResponse

```cpp
// Create a model
auto model = models::IntegrationLogsInvalidLogResponse();
model.setRejectedLogs(/* value */);  // Set rejected_logs

// Serialize to JSON
nlohmann::json json = models::IntegrationLogsInvalidLogResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogsInvalidLogResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogsInvalidLogResponseRejectedLogsItems

```cpp
// Create a model
auto model = models::IntegrationLogsInvalidLogResponseRejectedLogsItems();
model.setField(/* value */);  // Set field
model.setLogIndex(/* value */);  // Set log_index
model.setReason(/* value */);  // Set reason
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::IntegrationLogsInvalidLogResponseRejectedLogsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogsInvalidLogResponseRejectedLogsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogsRequestCreate

```cpp
// Create a model
auto model = models::IntegrationLogsRequestCreate();
model.setLogs(/* value */);  // Set logs

// Serialize to JSON
nlohmann::json json = models::IntegrationLogsRequestCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogsRequestCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationLogsSuccessResponse

```cpp
// Create a model
auto model = models::IntegrationLogsSuccessResponse();
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::IntegrationLogsSuccessResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationLogsSuccessResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Integration

```cpp
// Create a model
auto model = models::Integration();
model.setAdditionalId1(/* value */);  // Set additional_id_1
model.setConnectedAdvertiserId(/* value */);  // Set connected_advertiser_id
model.setConnectedLbaId(/* value */);  // Set connected_lba_id
model.setConnectedMerchantId(/* value */);  // Set connected_merchant_id
model.setConnectedTagId(/* value */);  // Set connected_tag_id
model.setConnectedUserId(/* value */);  // Set connected_user_id
model.setCreatedTimestamp(/* value */);  // Set created_timestamp
model.setExternalBusinessId(/* value */);  // Set external_business_id
model.setId(/* value */);  // Set id
model.setPartnerAccessTokenExpiry(/* value */);  // Set partner_access_token_expiry
model.setPartnerMetadata(/* value */);  // Set partner_metadata
model.setPartnerRefreshTokenExpiry(/* value */);  // Set partner_refresh_token_expiry
model.setScopes(/* value */);  // Set scopes
model.setUpdatedTimestamp(/* value */);  // Set updated_timestamp

// Serialize to JSON
nlohmann::json json = models::Integration::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Integration::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationMetadataCreate

```cpp
// Create a model
auto model = models::IntegrationMetadataCreate();
model.setAdditionalId1(/* value */);  // Set additional_id_1
model.setConnectedAdvertiserId(/* value */);  // Set connected_advertiser_id
model.setConnectedLbaId(/* value */);  // Set connected_lba_id
model.setConnectedMerchantId(/* value */);  // Set connected_merchant_id
model.setConnectedTagId(/* value */);  // Set connected_tag_id
model.setExternalBusinessId(/* value */);  // Set external_business_id
model.setPartnerAccessToken(/* value */);  // Set partner_access_token
model.setPartnerAccessTokenExpiry(/* value */);  // Set partner_access_token_expiry
model.setPartnerMetadata(/* value */);  // Set partner_metadata
model.setPartnerPrimaryEmail(/* value */);  // Set partner_primary_email
model.setPartnerRefreshToken(/* value */);  // Set partner_refresh_token
model.setPartnerRefreshTokenExpiry(/* value */);  // Set partner_refresh_token_expiry
model.setScopes(/* value */);  // Set scopes

// Serialize to JSON
nlohmann::json json = models::IntegrationMetadataCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationMetadataCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationMetadataUpdate

```cpp
// Create a model
auto model = models::IntegrationMetadataUpdate();
model.setAdditionalId1(/* value */);  // Set additional_id_1
model.setConnectedAdvertiserId(/* value */);  // Set connected_advertiser_id
model.setConnectedLbaId(/* value */);  // Set connected_lba_id
model.setConnectedMerchantId(/* value */);  // Set connected_merchant_id
model.setConnectedTagId(/* value */);  // Set connected_tag_id
model.setPartnerAccessToken(/* value */);  // Set partner_access_token
model.setPartnerAccessTokenExpiry(/* value */);  // Set partner_access_token_expiry
model.setPartnerMetadata(/* value */);  // Set partner_metadata
model.setPartnerPrimaryEmail(/* value */);  // Set partner_primary_email
model.setPartnerRefreshToken(/* value */);  // Set partner_refresh_token
model.setPartnerRefreshTokenExpiry(/* value */);  // Set partner_refresh_token_expiry
model.setScopes(/* value */);  // Set scopes

// Serialize to JSON
nlohmann::json json = models::IntegrationMetadataUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationMetadataUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationRecord

```cpp
// Create a model
auto model = models::IntegrationRecord();
model.setAdditionalId1(/* value */);  // Set additional_id_1
model.setConnectedAdvertiserId(/* value */);  // Set connected_advertiser_id
model.setConnectedLbaId(/* value */);  // Set connected_lba_id
model.setConnectedMerchantId(/* value */);  // Set connected_merchant_id
model.setConnectedTagId(/* value */);  // Set connected_tag_id
model.setConnectedUserId(/* value */);  // Set connected_user_id
model.setCreatedTime(/* value */);  // Set created_time
model.setExternalBusinessId(/* value */);  // Set external_business_id
model.setId(/* value */);  // Set id
model.setPartnerAccessToken(/* value */);  // Set partner_access_token
model.setPartnerAccessTokenExpiry(/* value */);  // Set partner_access_token_expiry
model.setPartnerMetadata(/* value */);  // Set partner_metadata
model.setPartnerPrimaryEmail(/* value */);  // Set partner_primary_email
model.setPartnerRefreshToken(/* value */);  // Set partner_refresh_token
model.setPartnerRefreshTokenExpiry(/* value */);  // Set partner_refresh_token_expiry
model.setScopes(/* value */);  // Set scopes
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::IntegrationRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntegrationsGetList200Response

```cpp
// Create a model
auto model = models::IntegrationsGetList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::IntegrationsGetList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntegrationsGetList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::IntendedPromotionType

```cpp
// Create a model
auto model = models::IntendedPromotionType();

// Serialize to JSON
nlohmann::json json = models::IntendedPromotionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::IntendedPromotionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Interest

```cpp
// Create a model
auto model = models::Interest();
model.setCanonicalUrl(/* value */);  // Set canonical_url
model.setId(/* value */);  // Set id
model.setKey(/* value */);  // Set key
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::Interest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Interest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InterestsEnum

```cpp
// Create a model
auto model = models::InterestsEnum();

// Serialize to JSON
nlohmann::json json = models::InterestsEnum::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InterestsEnum::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteActionResultItem

```cpp
// Create a model
auto model = models::InviteActionResultItem();
model.setException(/* value */);  // Set exception
model.setInvite(/* value */);  // Set invite

// Serialize to JSON
nlohmann::json json = models::InviteActionResultItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteActionResultItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteAssetsSummary

```cpp
// Create a model
auto model = models::InviteAssetsSummary();
model.setAdAccounts(/* value */);  // Set ad_accounts
model.setProfiles(/* value */);  // Set profiles

// Serialize to JSON
nlohmann::json json = models::InviteAssetsSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteAssetsSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteAssetsSummaryItem

```cpp
// Create a model
auto model = models::InviteAssetsSummaryItem();
model.setId(/* value */);  // Set id
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::InviteAssetsSummaryItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteAssetsSummaryItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteBusinessRoleBinding

```cpp
// Create a model
auto model = models::InviteBusinessRoleBinding();
model.setCreatedByBusinessId(/* value */);  // Set created_by_business_id
model.setCreatedByUserId(/* value */);  // Set created_by_user_id
model.setId(/* value */);  // Set id
model.setInviteData(/* value */);  // Set invite_data
model.setIsReceivedInvite(/* value */);  // Set is_received_invite
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::InviteBusinessRoleBinding::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteBusinessRoleBinding::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteDataResponse

```cpp
// Create a model
auto model = models::InviteDataResponse();
model.setInviteExpiration(/* value */);  // Set invite_expiration
model.setInviteStatus(/* value */);  // Set invite_status
model.setInviteType(/* value */);  // Set invite_type
model.setLastUpdatedTime(/* value */);  // Set last_updated_time
model.setSentAt(/* value */);  // Set sent_at

// Serialize to JSON
nlohmann::json json = models::InviteDataResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteDataResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteExceptionResponse

```cpp
// Create a model
auto model = models::InviteExceptionResponse();
model.setCode(/* value */);  // Set code
model.setInviteOrRequestId(/* value */);  // Set invite_or_request_id
model.setMessage(/* value */);  // Set message
model.setUsersOrPartnerIds(/* value */);  // Set users_or_partner_ids

// Serialize to JSON
nlohmann::json json = models::InviteExceptionResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteExceptionResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteFilterStatus

```cpp
// Create a model
auto model = models::InviteFilterStatus();

// Serialize to JSON
nlohmann::json json = models::InviteFilterStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteFilterStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteResponse

```cpp
// Create a model
auto model = models::InviteResponse();
model.setAssetsSummary(/* value */);  // Set assets_summary
model.setBusinessRoles(/* value */);  // Set business_roles
model.setCreatedByBusiness(/* value */);  // Set created_by_business
model.setCreatedByUser(/* value */);  // Set created_by_user
model.setCreatedTime(/* value */);  // Set created_time
model.setId(/* value */);  // Set id
model.setInviteData(/* value */);  // Set invite_data
model.setIsReceivedInvite(/* value */);  // Set is_received_invite
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::InviteResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteStatus

```cpp
// Create a model
auto model = models::InviteStatus();

// Serialize to JSON
nlohmann::json json = models::InviteStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteType

```cpp
// Create a model
auto model = models::InviteType();

// Serialize to JSON
nlohmann::json json = models::InviteType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAttributes

```cpp
// Create a model
auto model = models::ItemAttributes();
model.setAdditionalImageLink(/* value */);  // Set additional_image_link
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setImageLink(/* value */);  // Set image_link
model.setVideoLink(/* value */);  // Set video_link

// Serialize to JSON
nlohmann::json json = models::ItemAttributes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAttributes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAttributesRequest

```cpp
// Create a model
auto model = models::ItemAttributesRequest();
model.setAdImage0Link(/* value */);  // Set ad_image_0_link
model.setAdImage0Tag(/* value */);  // Set ad_image_0_tag
model.setAdImage10Link(/* value */);  // Set ad_image_10_link
model.setAdImage10Tag(/* value */);  // Set ad_image_10_tag
model.setAdImage11Link(/* value */);  // Set ad_image_11_link
model.setAdImage11Tag(/* value */);  // Set ad_image_11_tag
model.setAdImage12Link(/* value */);  // Set ad_image_12_link
model.setAdImage12Tag(/* value */);  // Set ad_image_12_tag
model.setAdImage13Link(/* value */);  // Set ad_image_13_link
model.setAdImage13Tag(/* value */);  // Set ad_image_13_tag
model.setAdImage14Link(/* value */);  // Set ad_image_14_link
model.setAdImage14Tag(/* value */);  // Set ad_image_14_tag
model.setAdImage15Link(/* value */);  // Set ad_image_15_link
model.setAdImage15Tag(/* value */);  // Set ad_image_15_tag
model.setAdImage16Link(/* value */);  // Set ad_image_16_link
model.setAdImage16Tag(/* value */);  // Set ad_image_16_tag
model.setAdImage17Link(/* value */);  // Set ad_image_17_link
model.setAdImage17Tag(/* value */);  // Set ad_image_17_tag
model.setAdImage18Link(/* value */);  // Set ad_image_18_link
model.setAdImage18Tag(/* value */);  // Set ad_image_18_tag
model.setAdImage19Link(/* value */);  // Set ad_image_19_link
model.setAdImage19Tag(/* value */);  // Set ad_image_19_tag
model.setAdImage1Link(/* value */);  // Set ad_image_1_link
model.setAdImage1Tag(/* value */);  // Set ad_image_1_tag
model.setAdImage2Link(/* value */);  // Set ad_image_2_link
model.setAdImage2Tag(/* value */);  // Set ad_image_2_tag
model.setAdImage3Link(/* value */);  // Set ad_image_3_link
model.setAdImage3Tag(/* value */);  // Set ad_image_3_tag
model.setAdImage4Link(/* value */);  // Set ad_image_4_link
model.setAdImage4Tag(/* value */);  // Set ad_image_4_tag
model.setAdImage5Link(/* value */);  // Set ad_image_5_link
model.setAdImage5Tag(/* value */);  // Set ad_image_5_tag
model.setAdImage6Link(/* value */);  // Set ad_image_6_link
model.setAdImage6Tag(/* value */);  // Set ad_image_6_tag
model.setAdImage7Link(/* value */);  // Set ad_image_7_link
model.setAdImage7Tag(/* value */);  // Set ad_image_7_tag
model.setAdImage8Link(/* value */);  // Set ad_image_8_link
model.setAdImage8Tag(/* value */);  // Set ad_image_8_tag
model.setAdImage9Link(/* value */);  // Set ad_image_9_link
model.setAdImage9Tag(/* value */);  // Set ad_image_9_tag
model.setAdLink(/* value */);  // Set ad_link
model.setAdVideo0Link(/* value */);  // Set ad_video_0_link
model.setAdVideo0Tag(/* value */);  // Set ad_video_0_tag
model.setAdVideo1Link(/* value */);  // Set ad_video_1_link
model.setAdVideo1Tag(/* value */);  // Set ad_video_1_tag
model.setAdVideo2Link(/* value */);  // Set ad_video_2_link
model.setAdVideo2Tag(/* value */);  // Set ad_video_2_tag
model.setAdditionalImageLink(/* value */);  // Set additional_image_link
model.setAdult(/* value */);  // Set adult
model.setAgeGroup(/* value */);  // Set age_group
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setAvailability(/* value */);  // Set availability
model.setAverageReviewRating(/* value */);  // Set average_review_rating
model.setBrand(/* value */);  // Set brand
model.setCheckoutEnabled(/* value */);  // Set checkout_enabled
model.setColor(/* value */);  // Set color
model.setCondition(/* value */);  // Set condition
model.setCustomLabel0(/* value */);  // Set custom_label_0
model.setCustomLabel1(/* value */);  // Set custom_label_1
model.setCustomLabel2(/* value */);  // Set custom_label_2
model.setCustomLabel3(/* value */);  // Set custom_label_3
model.setCustomLabel4(/* value */);  // Set custom_label_4
model.setCustomNumber0(/* value */);  // Set custom_number_0
model.setCustomNumber1(/* value */);  // Set custom_number_1
model.setCustomNumber2(/* value */);  // Set custom_number_2
model.setCustomNumber3(/* value */);  // Set custom_number_3
model.setCustomNumber4(/* value */);  // Set custom_number_4
model.setDescription(/* value */);  // Set description
model.setFreeShippingLabel(/* value */);  // Set free_shipping_label
model.setFreeShippingLimit(/* value */);  // Set free_shipping_limit
model.setGender(/* value */);  // Set gender
model.setGoogleProductCategory(/* value */);  // Set google_product_category
model.setGtin(/* value */);  // Set gtin
model.setId(/* value */);  // Set id
model.setImageLink(/* value */);  // Set image_link
model.setInstallmentPrice(/* value */);  // Set installment_price
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setItemGroupId(/* value */);  // Set item_group_id
model.setLastUpdatedTime(/* value */);  // Set last_updated_time
model.setLink(/* value */);  // Set link
model.setMaterial(/* value */);  // Set material
model.setMinAdPrice(/* value */);  // Set min_ad_price
model.setMobileLink(/* value */);  // Set mobile_link
model.setMpn(/* value */);  // Set mpn
model.setNumberOfRatings(/* value */);  // Set number_of_ratings
model.setNumberOfReviews(/* value */);  // Set number_of_reviews
model.setPattern(/* value */);  // Set pattern
model.setPrice(/* value */);  // Set price
model.setProductType(/* value */);  // Set product_type
model.setPromotionId(/* value */);  // Set promotion_id
model.setSalePrice(/* value */);  // Set sale_price
model.setSalePriceEffectiveDate(/* value */);  // Set sale_price_effective_date
model.setSavePinDisabled(/* value */);  // Set save_pin_disabled
model.setShipping(/* value */);  // Set shipping
model.setShippingHeight(/* value */);  // Set shipping_height
model.setShippingWeight(/* value */);  // Set shipping_weight
model.setShippingWidth(/* value */);  // Set shipping_width
model.setSize(/* value */);  // Set size
model.setSizeSystem(/* value */);  // Set size_system
model.setSizeType(/* value */);  // Set size_type
model.setTax(/* value */);  // Set tax
model.setTitle(/* value */);  // Set title
model.setUnitPricingBaseMeasure(/* value */);  // Set unit_pricing_base_measure
model.setUnitPricingMeasure(/* value */);  // Set unit_pricing_measure
model.setVariantNames(/* value */);  // Set variant_names
model.setVariantValues(/* value */);  // Set variant_values
model.setVideoLink(/* value */);  // Set video_link

// Serialize to JSON
nlohmann::json json = models::ItemAttributesRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAttributesRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAttributesRequestImageLink

```cpp
// Create a model
auto model = models::ItemAttributesRequestImageLink();

// Serialize to JSON
nlohmann::json json = models::ItemAttributesRequestImageLink::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAttributesRequestImageLink::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemAvailability

```cpp
// Create a model
auto model = models::ItemAvailability();

// Serialize to JSON
nlohmann::json json = models::ItemAvailability::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemAvailability::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemCreateBatchRecord

```cpp
// Create a model
auto model = models::ItemCreateBatchRecord();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::ItemCreateBatchRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemCreateBatchRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemDeleteBatchRecord

```cpp
// Create a model
auto model = models::ItemDeleteBatchRecord();
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::ItemDeleteBatchRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemDeleteBatchRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemDeleteDiscontinuedBatchRecord

```cpp
// Create a model
auto model = models::ItemDeleteDiscontinuedBatchRecord();
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::ItemDeleteDiscontinuedBatchRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemDeleteDiscontinuedBatchRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemGroupId

```cpp
// Create a model
auto model = models::ItemGroupId();
model.setITEMGROUPID(/* value */);  // Set ITEM_GROUP_ID

// Serialize to JSON
nlohmann::json json = models::ItemGroupId::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemGroupId::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemId

```cpp
// Create a model
auto model = models::ItemId();
model.setITEMID(/* value */);  // Set ITEM_ID

// Serialize to JSON
nlohmann::json json = models::ItemId::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemId::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemIdStoreCodePair

```cpp
// Create a model
auto model = models::ItemIdStoreCodePair();
model.setItemId(/* value */);  // Set item_id
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::ItemIdStoreCodePair::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemIdStoreCodePair::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemProcessingRecord

```cpp
// Create a model
auto model = models::ItemProcessingRecord();
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setStatus(/* value */);  // Set status
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::ItemProcessingRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemProcessingRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemProcessingStatus

```cpp
// Create a model
auto model = models::ItemProcessingStatus();

// Serialize to JSON
nlohmann::json json = models::ItemProcessingStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemProcessingStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemResponse

```cpp
// Create a model
auto model = models::ItemResponse();
model.setAttributes(/* value */);  // Set attributes
model.setCatalogType(/* value */);  // Set catalog_type
model.setItemId(/* value */);  // Set item_id
model.setItemResponseKind(/* value */);  // Set item_response_kind
model.setPins(/* value */);  // Set pins
model.setHotelId(/* value */);  // Set hotel_id
model.setCreativeAssetsId(/* value */);  // Set creative_assets_id
model.setErrors(/* value */);  // Set errors

// Serialize to JSON
nlohmann::json json = models::ItemResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemUpdateBatchRecord

```cpp
// Create a model
auto model = models::ItemUpdateBatchRecord();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setUpdateMask(/* value */);  // Set update_mask

// Serialize to JSON
nlohmann::json json = models::ItemUpdateBatchRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemUpdateBatchRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemUpsertBatchRecord

```cpp
// Create a model
auto model = models::ItemUpsertBatchRecord();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::ItemUpsertBatchRecord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemUpsertBatchRecord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemValidationEvent

```cpp
// Create a model
auto model = models::ItemValidationEvent();
model.setAttribute(/* value */);  // Set attribute
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::ItemValidationEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemValidationEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemsIssuesList200Response

```cpp
// Create a model
auto model = models::ItemsIssuesList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ItemsIssuesList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemsIssuesList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ItemsPost200Response

```cpp
// Create a model
auto model = models::ItemsPost200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ItemsPost200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ItemsPost200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Keyword

```cpp
// Create a model
auto model = models::Keyword();
model.setArchived(/* value */);  // Set archived
model.setBid(/* value */);  // Set bid
model.setId(/* value */);  // Set id
model.setMatchType(/* value */);  // Set match_type
model.setParentId(/* value */);  // Set parent_id
model.setParentType(/* value */);  // Set parent_type
model.setType(/* value */);  // Set type
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::Keyword::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Keyword::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordCreateItem

```cpp
// Create a model
auto model = models::KeywordCreateItem();
model.setBid(/* value */);  // Set bid
model.setMatchType(/* value */);  // Set match_type
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::KeywordCreateItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordCreateItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordError

```cpp
// Create a model
auto model = models::KeywordError();
model.setData(/* value */);  // Set data
model.setErrorMessages(/* value */);  // Set error_messages

// Serialize to JSON
nlohmann::json json = models::KeywordError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordInfo

```cpp
// Create a model
auto model = models::KeywordInfo();
model.setName(/* value */);  // Set name
model.setPctGrowthMom(/* value */);  // Set pct_growth_mom

// Serialize to JSON
nlohmann::json json = models::KeywordInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordMetrics

```cpp
// Create a model
auto model = models::KeywordMetrics();
model.setKeywordQueryVolume(/* value */);  // Set keyword_query_volume

// Serialize to JSON
nlohmann::json json = models::KeywordMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordMetricsResponse

```cpp
// Create a model
auto model = models::KeywordMetricsResponse();
model.setKeyword(/* value */);  // Set keyword
model.setMetrics(/* value */);  // Set metrics

// Serialize to JSON
nlohmann::json json = models::KeywordMetricsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordMetricsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordUpdateGenerated

```cpp
// Create a model
auto model = models::KeywordUpdateGenerated();
model.setArchived(/* value */);  // Set archived
model.setBid(/* value */);  // Set bid
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::KeywordUpdateGenerated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordUpdateGenerated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordUpdateItem

```cpp
// Create a model
auto model = models::KeywordUpdateItem();
model.setArchived(/* value */);  // Set archived
model.setBid(/* value */);  // Set bid
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::KeywordUpdateItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordUpdateItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Keywords

```cpp
// Create a model
auto model = models::Keywords();
model.setErrors(/* value */);  // Set errors
model.setKeywords(/* value */);  // Set keywords

// Serialize to JSON
nlohmann::json json = models::Keywords::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Keywords::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordsCommon

```cpp
// Create a model
auto model = models::KeywordsCommon();
model.setBid(/* value */);  // Set bid
model.setMatchType(/* value */);  // Set match_type
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::KeywordsCommon::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordsCommon::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordsCreate

```cpp
// Create a model
auto model = models::KeywordsCreate();
model.setKeywords(/* value */);  // Set keywords
model.setParentId(/* value */);  // Set parent_id

// Serialize to JSON
nlohmann::json json = models::KeywordsCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordsCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordsGet200Response

```cpp
// Create a model
auto model = models::KeywordsGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::KeywordsGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordsGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordMetricsArrayResponse

```cpp
// Create a model
auto model = models::KeywordMetricsArrayResponse();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::KeywordMetricsArrayResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordMetricsArrayResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordsRequest

```cpp
// Create a model
auto model = models::KeywordsRequest();
model.setKeywords(/* value */);  // Set keywords
model.setParentId(/* value */);  // Set parent_id

// Serialize to JSON
nlohmann::json json = models::KeywordsRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordsRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeywordsUpdate

```cpp
// Create a model
auto model = models::KeywordsUpdate();
model.setKeywords(/* value */);  // Set keywords

// Serialize to JSON
nlohmann::json json = models::KeywordsUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeywordsUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Label

```cpp
// Create a model
auto model = models::Label();
model.setId(/* value */);  // Set id
model.setLabelType(/* value */);  // Set label_type
model.setStatus(/* value */);  // Set status
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::Label::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Label::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelBulkCreateRequest

```cpp
// Create a model
auto model = models::LabelBulkCreateRequest();
model.setLabels(/* value */);  // Set labels
model.setParentId(/* value */);  // Set parent_id

// Serialize to JSON
nlohmann::json json = models::LabelBulkCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelBulkCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelBulkUpdateRequest

```cpp
// Create a model
auto model = models::LabelBulkUpdateRequest();
model.setId(/* value */);  // Set id
model.setParentId(/* value */);  // Set parent_id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::LabelBulkUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelBulkUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelCreateItem

```cpp
// Create a model
auto model = models::LabelCreateItem();
model.setLabelType(/* value */);  // Set label_type
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::LabelCreateItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelCreateItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelCreateRequest

```cpp
// Create a model
auto model = models::LabelCreateRequest();
model.setLabels(/* value */);  // Set labels

// Serialize to JSON
nlohmann::json json = models::LabelCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelError

```cpp
// Create a model
auto model = models::LabelError();
model.setData(/* value */);  // Set data
model.setErrorMessages(/* value */);  // Set error_messages

// Serialize to JSON
nlohmann::json json = models::LabelError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelErrorData

```cpp
// Create a model
auto model = models::LabelErrorData();
model.setId(/* value */);  // Set id
model.setLabelType(/* value */);  // Set label_type
model.setStatus(/* value */);  // Set status
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::LabelErrorData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelErrorData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelParentType

```cpp
// Create a model
auto model = models::LabelParentType();

// Serialize to JSON
nlohmann::json json = models::LabelParentType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelParentType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelStatus

```cpp
// Create a model
auto model = models::LabelStatus();

// Serialize to JSON
nlohmann::json json = models::LabelStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelStatusBulkUpdate

```cpp
// Create a model
auto model = models::LabelStatusBulkUpdate();

// Serialize to JSON
nlohmann::json json = models::LabelStatusBulkUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelStatusBulkUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelType

```cpp
// Create a model
auto model = models::LabelType();

// Serialize to JSON
nlohmann::json json = models::LabelType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelUpdateItem

```cpp
// Create a model
auto model = models::LabelUpdateItem();
model.setId(/* value */);  // Set id
model.setStatus(/* value */);  // Set status
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::LabelUpdateItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelUpdateItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelUpdateRequest

```cpp
// Create a model
auto model = models::LabelUpdateRequest();
model.setLabels(/* value */);  // Set labels

// Serialize to JSON
nlohmann::json json = models::LabelUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabeledEntities

```cpp
// Create a model
auto model = models::LabeledEntities();
model.setEntitiesLabels(/* value */);  // Set entities_labels
model.setErrors(/* value */);  // Set errors

// Serialize to JSON
nlohmann::json json = models::LabeledEntities::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabeledEntities::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabeledEntitiesCreate

```cpp
// Create a model
auto model = models::LabeledEntitiesCreate();
model.setEntityIds(/* value */);  // Set entity_ids

// Serialize to JSON
nlohmann::json json = models::LabeledEntitiesCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabeledEntitiesCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelsList200Response

```cpp
// Create a model
auto model = models::LabelsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::LabelsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LabelsResponse

```cpp
// Create a model
auto model = models::LabelsResponse();
model.setErrors(/* value */);  // Set errors
model.setLabels(/* value */);  // Set labels

// Serialize to JSON
nlohmann::json json = models::LabelsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LabelsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Language

```cpp
// Create a model
auto model = models::Language();

// Serialize to JSON
nlohmann::json json = models::Language::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Language::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadForm

```cpp
// Create a model
auto model = models::LeadForm();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setCompletionMessage(/* value */);  // Set completion_message
model.setCreatedTime(/* value */);  // Set created_time
model.setDisclosureLanguage(/* value */);  // Set disclosure_language
model.setHasAcceptedTerms(/* value */);  // Set has_accepted_terms
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setPolicyLinks(/* value */);  // Set policy_links
model.setPrivacyPolicyLink(/* value */);  // Set privacy_policy_link
model.setQuestions(/* value */);  // Set questions
model.setStatus(/* value */);  // Set status
model.setUpdatedTime(/* value */);  // Set updated_time

// Serialize to JSON
nlohmann::json json = models::LeadForm::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadForm::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormBatchUpdate

```cpp
// Create a model
auto model = models::LeadFormBatchUpdate();
model.setCompletionMessage(/* value */);  // Set completion_message
model.setDisclosureLanguage(/* value */);  // Set disclosure_language
model.setHasAcceptedTerms(/* value */);  // Set has_accepted_terms
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setPolicyLinks(/* value */);  // Set policy_links
model.setPrivacyPolicyLink(/* value */);  // Set privacy_policy_link
model.setQuestions(/* value */);  // Set questions
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::LeadFormBatchUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormBatchUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormCreate

```cpp
// Create a model
auto model = models::LeadFormCreate();
model.setCompletionMessage(/* value */);  // Set completion_message
model.setDisclosureLanguage(/* value */);  // Set disclosure_language
model.setHasAcceptedTerms(/* value */);  // Set has_accepted_terms
model.setName(/* value */);  // Set name
model.setPolicyLinks(/* value */);  // Set policy_links
model.setPrivacyPolicyLink(/* value */);  // Set privacy_policy_link
model.setQuestions(/* value */);  // Set questions
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::LeadFormCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormPolicyLink

```cpp
// Create a model
auto model = models::LeadFormPolicyLink();
model.setLabel(/* value */);  // Set label
model.setLink(/* value */);  // Set link

// Serialize to JSON
nlohmann::json json = models::LeadFormPolicyLink::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormPolicyLink::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormQuestion

```cpp
// Create a model
auto model = models::LeadFormQuestion();
model.setCustomQuestionFieldType(/* value */);  // Set custom_question_field_type
model.setCustomQuestionLabel(/* value */);  // Set custom_question_label
model.setCustomQuestionOptions(/* value */);  // Set custom_question_options
model.setQuestionType(/* value */);  // Set question_type

// Serialize to JSON
nlohmann::json json = models::LeadFormQuestion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormQuestion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormQuestionFieldType

```cpp
// Create a model
auto model = models::LeadFormQuestionFieldType();

// Serialize to JSON
nlohmann::json json = models::LeadFormQuestionFieldType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormQuestionFieldType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormQuestionType

```cpp
// Create a model
auto model = models::LeadFormQuestionType();

// Serialize to JSON
nlohmann::json json = models::LeadFormQuestionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormQuestionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormStatus

```cpp
// Create a model
auto model = models::LeadFormStatus();

// Serialize to JSON
nlohmann::json json = models::LeadFormStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormTest

```cpp
// Create a model
auto model = models::LeadFormTest();
model.setSubscriptionId(/* value */);  // Set subscription_id

// Serialize to JSON
nlohmann::json json = models::LeadFormTest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormTest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormTestCreate

```cpp
// Create a model
auto model = models::LeadFormTestCreate();
model.setAnswers(/* value */);  // Set answers

// Serialize to JSON
nlohmann::json json = models::LeadFormTestCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormTestCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormsCreate200Response

```cpp
// Create a model
auto model = models::LeadFormsCreate200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::LeadFormsCreate200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormsCreate200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormsCreate200ResponseItemsInner

```cpp
// Create a model
auto model = models::LeadFormsCreate200ResponseItemsInner();
model.setData(/* value */);  // Set data
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::LeadFormsCreate200ResponseItemsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormsCreate200ResponseItemsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormsList200Response

```cpp
// Create a model
auto model = models::LeadFormsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::LeadFormsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormsUpdate200Response

```cpp
// Create a model
auto model = models::LeadFormsUpdate200Response();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::LeadFormsUpdate200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormsUpdate200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadFormsUpdate200ResponseItemsInner

```cpp
// Create a model
auto model = models::LeadFormsUpdate200ResponseItemsInner();
model.setData(/* value */);  // Set data
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::LeadFormsUpdate200ResponseItemsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadFormsUpdate200ResponseItemsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadSubscription

```cpp
// Create a model
auto model = models::LeadSubscription();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setApiVersion(/* value */);  // Set api_version
model.setCreatedTime(/* value */);  // Set created_time
model.setCryptographicAlgorithm(/* value */);  // Set cryptographic_algorithm
model.setCryptographicKey(/* value */);  // Set cryptographic_key
model.setId(/* value */);  // Set id
model.setLeadFormId(/* value */);  // Set lead_form_id
model.setUserAccountId(/* value */);  // Set user_account_id
model.setWebhookUrl(/* value */);  // Set webhook_url

// Serialize to JSON
nlohmann::json json = models::LeadSubscription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadSubscription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadSubscriptionCreate

```cpp
// Create a model
auto model = models::LeadSubscriptionCreate();
model.setLeadFormId(/* value */);  // Set lead_form_id
model.setWebhookUrl(/* value */);  // Set webhook_url

// Serialize to JSON
nlohmann::json json = models::LeadSubscriptionCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadSubscriptionCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadSubscriptionPostParams

```cpp
// Create a model
auto model = models::LeadSubscriptionPostParams();
model.setPartnerAccessToken(/* value */);  // Set partner_access_token
model.setPartnerMetadata(/* value */);  // Set partner_metadata
model.setPartnerRefreshToken(/* value */);  // Set partner_refresh_token

// Serialize to JSON
nlohmann::json json = models::LeadSubscriptionPostParams::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadSubscriptionPostParams::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadSubscriptionPostParamsCreate

```cpp
// Create a model
auto model = models::LeadSubscriptionPostParamsCreate();
model.setPartnerAccessToken(/* value */);  // Set partner_access_token
model.setPartnerMetadata(/* value */);  // Set partner_metadata
model.setPartnerRefreshToken(/* value */);  // Set partner_refresh_token

// Serialize to JSON
nlohmann::json json = models::LeadSubscriptionPostParamsCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadSubscriptionPostParamsCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadsExportResponseData

```cpp
// Create a model
auto model = models::LeadsExportResponseData();
model.setDownloadUrl(/* value */);  // Set download_url
model.setExportStatus(/* value */);  // Set export_status

// Serialize to JSON
nlohmann::json json = models::LeadsExportResponseData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadsExportResponseData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadsExportStatus

```cpp
// Create a model
auto model = models::LeadsExportStatus();

// Serialize to JSON
nlohmann::json json = models::LeadsExportStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadsExportStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadsExports

```cpp
// Create a model
auto model = models::LeadsExports();
model.setLeadsExportId(/* value */);  // Set leads_export_id

// Serialize to JSON
nlohmann::json json = models::LeadsExports::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadsExports::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LeadsExportsCreate

```cpp
// Create a model
auto model = models::LeadsExportsCreate();
model.setAdId(/* value */);  // Set ad_id
model.setEndDate(/* value */);  // Set end_date
model.setStartDate(/* value */);  // Set start_date

// Serialize to JSON
nlohmann::json json = models::LeadsExportsCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LeadsExportsCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LineItem

```cpp
// Create a model
auto model = models::LineItem();
model.setProductBrand(/* value */);  // Set product_brand
model.setProductCategory(/* value */);  // Set product_category
model.setProductId(/* value */);  // Set product_id
model.setProductName(/* value */);  // Set product_name
model.setProductPrice(/* value */);  // Set product_price
model.setProductQuantity(/* value */);  // Set product_quantity
model.setProductVariant(/* value */);  // Set product_variant
model.setProductVariantId(/* value */);  // Set product_variant_id

// Serialize to JSON
nlohmann::json json = models::LineItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LineItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Link

```cpp
// Create a model
auto model = models::Link();
model.setLINK(/* value */);  // Set LINK

// Serialize to JSON
nlohmann::json json = models::Link::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Link::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LinkedBusiness

```cpp
// Create a model
auto model = models::LinkedBusiness();
model.setImageLargeUrl(/* value */);  // Set image_large_url
model.setImageMediumUrl(/* value */);  // Set image_medium_url
model.setImageSmallUrl(/* value */);  // Set image_small_url
model.setImageXlargeUrl(/* value */);  // Set image_xlarge_url
model.setUsername(/* value */);  // Set username

// Serialize to JSON
nlohmann::json json = models::LinkedBusiness::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LinkedBusiness::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryCreateOperation

```cpp
// Create a model
auto model = models::LocalInventoryCreateOperation();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::LocalInventoryCreateOperation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryCreateOperation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryDeleteOperation

```cpp
// Create a model
auto model = models::LocalInventoryDeleteOperation();
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::LocalInventoryDeleteOperation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryDeleteOperation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryItemResponse

```cpp
// Create a model
auto model = models::LocalInventoryItemResponse();
model.setAdLink(/* value */);  // Set ad_link
model.setAvailability(/* value */);  // Set availability
model.setCreatedAt(/* value */);  // Set created_at
model.setItemId(/* value */);  // Set item_id
model.setLastUpdatedTime(/* value */);  // Set last_updated_time
model.setPrice(/* value */);  // Set price
model.setSalePrice(/* value */);  // Set sale_price
model.setStoreMetadata(/* value */);  // Set store_metadata

// Serialize to JSON
nlohmann::json json = models::LocalInventoryItemResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryItemResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryItemsBatch

```cpp
// Create a model
auto model = models::LocalInventoryItemsBatch();
model.setBatchId(/* value */);  // Set batch_id
model.setCompletedTime(/* value */);  // Set completed_time
model.setCreatedTime(/* value */);  // Set created_time
model.setOperationResults(/* value */);  // Set operation_results
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::LocalInventoryItemsBatch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryItemsBatch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryItemsBatchCreate

```cpp
// Create a model
auto model = models::LocalInventoryItemsBatchCreate();
model.setOperations(/* value */);  // Set operations

// Serialize to JSON
nlohmann::json json = models::LocalInventoryItemsBatchCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryItemsBatchCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryItemsGet

```cpp
// Create a model
auto model = models::LocalInventoryItemsGet();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::LocalInventoryItemsGet::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryItemsGet::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryItemsGetCreate

```cpp
// Create a model
auto model = models::LocalInventoryItemsGetCreate();
model.setItemFilters(/* value */);  // Set item_filters

// Serialize to JSON
nlohmann::json json = models::LocalInventoryItemsGetCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryItemsGetCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryOperation

```cpp
// Create a model
auto model = models::LocalInventoryOperation();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::LocalInventoryOperation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryOperation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryOperationResult

```cpp
// Create a model
auto model = models::LocalInventoryOperationResult();
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setStatus(/* value */);  // Set status
model.setStoreCode(/* value */);  // Set store_code
model.setSupplementalType(/* value */);  // Set supplemental_type
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::LocalInventoryOperationResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryOperationResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryUpdateOperation

```cpp
// Create a model
auto model = models::LocalInventoryUpdateOperation();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::LocalInventoryUpdateOperation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryUpdateOperation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalInventoryUpsertOperation

```cpp
// Create a model
auto model = models::LocalInventoryUpsertOperation();
model.setAttributes(/* value */);  // Set attributes
model.setItemId(/* value */);  // Set item_id
model.setOperation(/* value */);  // Set operation
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::LocalInventoryUpsertOperation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalInventoryUpsertOperation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalStore

```cpp
// Create a model
auto model = models::LocalStore();
model.setAddressPrimary(/* value */);  // Set address_primary
model.setAddressSecondary(/* value */);  // Set address_secondary
model.setCity(/* value */);  // Set city
model.setCountry(/* value */);  // Set country
model.setCreatedAt(/* value */);  // Set created_at
model.setId(/* value */);  // Set id
model.setLatitude(/* value */);  // Set latitude
model.setLongitude(/* value */);  // Set longitude
model.setName(/* value */);  // Set name
model.setPostalCode(/* value */);  // Set postal_code
model.setRegion(/* value */);  // Set region
model.setStoreCode(/* value */);  // Set store_code
model.setUpdatedAt(/* value */);  // Set updated_at

// Serialize to JSON
nlohmann::json json = models::LocalStore::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalStore::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalStoreBatchUpdate

```cpp
// Create a model
auto model = models::LocalStoreBatchUpdate();
model.setAddressPrimary(/* value */);  // Set address_primary
model.setAddressSecondary(/* value */);  // Set address_secondary
model.setCity(/* value */);  // Set city
model.setCountry(/* value */);  // Set country
model.setId(/* value */);  // Set id
model.setLatitude(/* value */);  // Set latitude
model.setLongitude(/* value */);  // Set longitude
model.setName(/* value */);  // Set name
model.setPostalCode(/* value */);  // Set postal_code
model.setRegion(/* value */);  // Set region
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::LocalStoreBatchUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalStoreBatchUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LocalStoreCreate

```cpp
// Create a model
auto model = models::LocalStoreCreate();
model.setAddressPrimary(/* value */);  // Set address_primary
model.setAddressSecondary(/* value */);  // Set address_secondary
model.setCity(/* value */);  // Set city
model.setCountry(/* value */);  // Set country
model.setLatitude(/* value */);  // Set latitude
model.setLongitude(/* value */);  // Set longitude
model.setName(/* value */);  // Set name
model.setPostalCode(/* value */);  // Set postal_code
model.setRegion(/* value */);  // Set region
model.setStoreCode(/* value */);  // Set store_code

// Serialize to JSON
nlohmann::json json = models::LocalStoreCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LocalStoreCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::LookbackPeriodOptions

```cpp
// Create a model
auto model = models::LookbackPeriodOptions();

// Serialize to JSON
nlohmann::json json = models::LookbackPeriodOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::LookbackPeriodOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MMMReport

```cpp
// Create a model
auto model = models::MMMReport();
model.setMessage(/* value */);  // Set message
model.setReportStatus(/* value */);  // Set report_status
model.setSize(/* value */);  // Set size
model.setStatus(/* value */);  // Set status
model.setToken(/* value */);  // Set token
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::MMMReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MMMReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MMMReportCreate

```cpp
// Create a model
auto model = models::MMMReportCreate();
model.setAdvertiserIds(/* value */);  // Set advertiser_ids
model.setColumns(/* value */);  // Set columns
model.setCountries(/* value */);  // Set countries
model.setCustomColumnIds(/* value */);  // Set custom_column_ids
model.setEndDate(/* value */);  // Set end_date
model.setGranularity(/* value */);  // Set granularity
model.setLevel(/* value */);  // Set level
model.setReportName(/* value */);  // Set report_name
model.setStartDate(/* value */);  // Set start_date
model.setTargetingTypes(/* value */);  // Set targeting_types

// Serialize to JSON
nlohmann::json json = models::MMMReportCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MMMReportCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MMMReportGranularity

```cpp
// Create a model
auto model = models::MMMReportGranularity();

// Serialize to JSON
nlohmann::json json = models::MMMReportGranularity::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MMMReportGranularity::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MMMReportLevel

```cpp
// Create a model
auto model = models::MMMReportLevel();

// Serialize to JSON
nlohmann::json json = models::MMMReportLevel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MMMReportLevel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MMMReportingColumn

```cpp
// Create a model
auto model = models::MMMReportingColumn();

// Serialize to JSON
nlohmann::json json = models::MMMReportingColumn::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MMMReportingColumn::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MMMReportingTargetingType

```cpp
// Create a model
auto model = models::MMMReportingTargetingType();

// Serialize to JSON
nlohmann::json json = models::MMMReportingTargetingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MMMReportingTargetingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MatchType

```cpp
// Create a model
auto model = models::MatchType();

// Serialize to JSON
nlohmann::json json = models::MatchType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MatchType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MatchTypeResponse

```cpp
// Create a model
auto model = models::MatchTypeResponse();

// Serialize to JSON
nlohmann::json json = models::MatchTypeResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MatchTypeResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MaxPrice

```cpp
// Create a model
auto model = models::MaxPrice();
model.setMAXPRICE(/* value */);  // Set MAX_PRICE

// Serialize to JSON
nlohmann::json json = models::MaxPrice::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MaxPrice::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaUploadInformation

```cpp
// Create a model
auto model = models::MediaUploadInformation();
model.setMediaId(/* value */);  // Set media_id
model.setMediaType(/* value */);  // Set media_type
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::MediaUploadInformation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaUploadInformation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaList200Response

```cpp
// Create a model
auto model = models::MediaList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::MediaList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaType

```cpp
// Create a model
auto model = models::MediaType();

// Serialize to JSON
nlohmann::json json = models::MediaType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaType

```cpp
// Create a model
auto model = models::MediaType();
model.setMEDIATYPE(/* value */);  // Set MEDIA_TYPE

// Serialize to JSON
nlohmann::json json = models::MediaType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaUploadDetails

```cpp
// Create a model
auto model = models::MediaUploadDetails();
model.setMediaId(/* value */);  // Set media_id
model.setMediaType(/* value */);  // Set media_type
model.setUploadParameters(/* value */);  // Set upload_parameters
model.setUploadUrl(/* value */);  // Set upload_url

// Serialize to JSON
nlohmann::json json = models::MediaUploadDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaUploadDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaUploadCreate

```cpp
// Create a model
auto model = models::MediaUploadCreate();
model.setMediaType(/* value */);  // Set media_type

// Serialize to JSON
nlohmann::json json = models::MediaUploadCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaUploadCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaUploadParameters

```cpp
// Create a model
auto model = models::MediaUploadParameters();
model.setContentType(/* value */);  // Set Content-Type
model.setKey(/* value */);  // Set key
model.setPolicy(/* value */);  // Set policy
model.setXAmzAlgorithm(/* value */);  // Set x-amz-algorithm
model.setXAmzCredential(/* value */);  // Set x-amz-credential
model.setXAmzDate(/* value */);  // Set x-amz-date
model.setXAmzSecurityToken(/* value */);  // Set x-amz-security-token
model.setXAmzSignature(/* value */);  // Set x-amz-signature

// Serialize to JSON
nlohmann::json json = models::MediaUploadParameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaUploadParameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaUploadStatus

```cpp
// Create a model
auto model = models::MediaUploadStatus();

// Serialize to JSON
nlohmann::json json = models::MediaUploadStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaUploadStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaUploadType

```cpp
// Create a model
auto model = models::MediaUploadType();

// Serialize to JSON
nlohmann::json json = models::MediaUploadType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaUploadType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MemberBusinessRole

```cpp
// Create a model
auto model = models::MemberBusinessRole();

// Serialize to JSON
nlohmann::json json = models::MemberBusinessRole::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MemberBusinessRole::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MetricsReportingLevel

```cpp
// Create a model
auto model = models::MetricsReportingLevel();

// Serialize to JSON
nlohmann::json json = models::MetricsReportingLevel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MetricsReportingLevel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MetricsReportingTemplateType

```cpp
// Create a model
auto model = models::MetricsReportingTemplateType();

// Serialize to JSON
nlohmann::json json = models::MetricsReportingTemplateType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MetricsReportingTemplateType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MetricsResponse

```cpp
// Create a model
auto model = models::MetricsResponse();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::MetricsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MetricsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MetricsResponseDataItems

```cpp
// Create a model
auto model = models::MetricsResponseDataItems();
model.setMetrics(/* value */);  // Set metrics
model.setTargetingType(/* value */);  // Set targeting_type
model.setTargetingValue(/* value */);  // Set targeting_value

// Serialize to JSON
nlohmann::json json = models::MetricsResponseDataItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MetricsResponseDataItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MinPrice

```cpp
// Create a model
auto model = models::MinPrice();
model.setMINPRICE(/* value */);  // Set MIN_PRICE

// Serialize to JSON
nlohmann::json json = models::MinPrice::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MinPrice::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MobileAppPlatform

```cpp
// Create a model
auto model = models::MobileAppPlatform();

// Serialize to JSON
nlohmann::json json = models::MobileAppPlatform::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MobileAppPlatform::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MsotEventName

```cpp
// Create a model
auto model = models::MsotEventName();

// Serialize to JSON
nlohmann::json json = models::MsotEventName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MsotEventName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MultiPinsAnalyticsMetricTypesItem

```cpp
// Create a model
auto model = models::MultiPinsAnalyticsMetricTypesItem();

// Serialize to JSON
nlohmann::json json = models::MultiPinsAnalyticsMetricTypesItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MultiPinsAnalyticsMetricTypesItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NetworkType

```cpp
// Create a model
auto model = models::NetworkType();

// Serialize to JSON
nlohmann::json json = models::NetworkType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NetworkType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NonDraftEntityStatus

```cpp
// Create a model
auto model = models::NonDraftEntityStatus();

// Serialize to JSON
nlohmann::json json = models::NonDraftEntityStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NonDraftEntityStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NonNullableCatalogsCurrency

```cpp
// Create a model
auto model = models::NonNullableCatalogsCurrency();

// Serialize to JSON
nlohmann::json json = models::NonNullableCatalogsCurrency::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NonNullableCatalogsCurrency::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NotificationPostRequest

```cpp
// Create a model
auto model = models::NotificationPostRequest();

// Serialize to JSON
nlohmann::json json = models::NotificationPostRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NotificationPostRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NotificationResponse

```cpp
// Create a model
auto model = models::NotificationResponse();
model.setErrorMsg(/* value */);  // Set error_msg
model.setReceivedAt(/* value */);  // Set received_at
model.setSuccess(/* value */);  // Set success

// Serialize to JSON
nlohmann::json json = models::NotificationResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NotificationResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullableCatalogsItemFieldType

```cpp
// Create a model
auto model = models::NullableCatalogsItemFieldType();

// Serialize to JSON
nlohmann::json json = models::NullableCatalogsItemFieldType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullableCatalogsItemFieldType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullableCurrency

```cpp
// Create a model
auto model = models::NullableCurrency();

// Serialize to JSON
nlohmann::json json = models::NullableCurrency::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullableCurrency::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullableEntityStatus

```cpp
// Create a model
auto model = models::NullableEntityStatus();

// Serialize to JSON
nlohmann::json json = models::NullableEntityStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullableEntityStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullableLabelStatus

```cpp
// Create a model
auto model = models::NullableLabelStatus();

// Serialize to JSON
nlohmann::json json = models::NullableLabelStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullableLabelStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullableLabelType

```cpp
// Create a model
auto model = models::NullableLabelType();

// Serialize to JSON
nlohmann::json json = models::NullableLabelType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullableLabelType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullableOptimizationGoalMetadata

```cpp
// Create a model
auto model = models::NullableOptimizationGoalMetadata();
model.setConversionTagV3GoalMetadata(/* value */);  // Set conversion_tag_v3_goal_metadata
model.setFrequencyGoalMetadata(/* value */);  // Set frequency_goal_metadata
model.setScrollupGoalMetadata(/* value */);  // Set scrollup_goal_metadata

// Serialize to JSON
nlohmann::json json = models::NullableOptimizationGoalMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullableOptimizationGoalMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullablePartnerType

```cpp
// Create a model
auto model = models::NullablePartnerType();

// Serialize to JSON
nlohmann::json json = models::NullablePartnerType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullablePartnerType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NullalbleMatchType

```cpp
// Create a model
auto model = models::NullalbleMatchType();

// Serialize to JSON
nlohmann::json json = models::NullalbleMatchType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NullalbleMatchType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::NumericFilterOperatorType

```cpp
// Create a model
auto model = models::NumericFilterOperatorType();

// Serialize to JSON
nlohmann::json json = models::NumericFilterOperatorType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::NumericFilterOperatorType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OAuthAccessTokenRequest

```cpp
// Create a model
auto model = models::OAuthAccessTokenRequest();
model.setAccessToken(/* value */);  // Set access_token
model.setExpiresIn(/* value */);  // Set expires_in
model.setRefreshToken(/* value */);  // Set refresh_token
model.setRefreshTokenExpiresAt(/* value */);  // Set refresh_token_expires_at
model.setRefreshTokenExpiresIn(/* value */);  // Set refresh_token_expires_in
model.setResponseType(/* value */);  // Set response_type
model.setScope(/* value */);  // Set scope
model.setTokenType(/* value */);  // Set token_type

// Serialize to JSON
nlohmann::json json = models::OAuthAccessTokenRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OAuthAccessTokenRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectiveType

```cpp
// Create a model
auto model = models::ObjectiveType();

// Serialize to JSON
nlohmann::json json = models::ObjectiveType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectiveType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OperationType

```cpp
// Create a model
auto model = models::OperationType();

// Serialize to JSON
nlohmann::json json = models::OperationType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OperationType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OptimizationGoalMetadata

```cpp
// Create a model
auto model = models::OptimizationGoalMetadata();
model.setConversionTagV3GoalMetadata(/* value */);  // Set conversion_tag_v3_goal_metadata
model.setFrequencyGoalMetadata(/* value */);  // Set frequency_goal_metadata
model.setScrollupGoalMetadata(/* value */);  // Set scrollup_goal_metadata

// Serialize to JSON
nlohmann::json json = models::OptimizationGoalMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OptimizationGoalMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OptimizationType

```cpp
// Create a model
auto model = models::OptimizationType();

// Serialize to JSON
nlohmann::json json = models::OptimizationType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OptimizationType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Order

```cpp
// Create a model
auto model = models::Order();

// Serialize to JSON
nlohmann::json json = models::Order::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Order::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OrderLine

```cpp
// Create a model
auto model = models::OrderLine();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setBudget(/* value */);  // Set budget
model.setCampaignIds(/* value */);  // Set campaign_ids
model.setEndTime(/* value */);  // Set end_time
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setPaidBudget(/* value */);  // Set paid_budget
model.setPaidType(/* value */);  // Set paid_type
model.setPurchaseOrderId(/* value */);  // Set purchase_order_id
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::OrderLine::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OrderLine::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OrderLineMutationError

```cpp
// Create a model
auto model = models::OrderLineMutationError();
model.setData(/* value */);  // Set data
model.setErrorMessages(/* value */);  // Set error_messages

// Serialize to JSON
nlohmann::json json = models::OrderLineMutationError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OrderLineMutationError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OrderLineMutationResponse

```cpp
// Create a model
auto model = models::OrderLineMutationResponse();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::OrderLineMutationResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OrderLineMutationResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OrderLineMutationResult

```cpp
// Create a model
auto model = models::OrderLineMutationResult();
model.setErrors(/* value */);  // Set errors
model.setOrderLine(/* value */);  // Set order_line

// Serialize to JSON
nlohmann::json json = models::OrderLineMutationResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OrderLineMutationResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OrderLinePaidType

```cpp
// Create a model
auto model = models::OrderLinePaidType();

// Serialize to JSON
nlohmann::json json = models::OrderLinePaidType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OrderLinePaidType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OrderLineStatus

```cpp
// Create a model
auto model = models::OrderLineStatus();

// Serialize to JSON
nlohmann::json json = models::OrderLineStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OrderLineStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OrderLinesList200Response

```cpp
// Create a model
auto model = models::OrderLinesList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::OrderLinesList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OrderLinesList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OsFamily

```cpp
// Create a model
auto model = models::OsFamily();

// Serialize to JSON
nlohmann::json json = models::OsFamily::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OsFamily::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OverallStatusOptions

```cpp
// Create a model
auto model = models::OverallStatusOptions();

// Serialize to JSON
nlohmann::json json = models::OverallStatusOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OverallStatusOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PacingDeliveryType

```cpp
// Create a model
auto model = models::PacingDeliveryType();

// Serialize to JSON
nlohmann::json json = models::PacingDeliveryType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PacingDeliveryType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PageVisitConversionTagsGet200Response

```cpp
// Create a model
auto model = models::PageVisitConversionTagsGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::PageVisitConversionTagsGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PageVisitConversionTagsGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PartnerMetadata

```cpp
// Create a model
auto model = models::PartnerMetadata();
model.setSubscriberKey(/* value */);  // Set subscriber_key

// Serialize to JSON
nlohmann::json json = models::PartnerMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PartnerMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PartnerType

```cpp
// Create a model
auto model = models::PartnerType();

// Serialize to JSON
nlohmann::json json = models::PartnerType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PartnerType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PerformancePlusCampaignSettings

```cpp
// Create a model
auto model = models::PerformancePlusCampaignSettings();
model.setBoostProspectingAdGroupBid(/* value */);  // Set boost_prospecting_ad_group_bid
model.setPinnerListExclusions(/* value */);  // Set pinner_list_exclusions

// Serialize to JSON
nlohmann::json json = models::PerformancePlusCampaignSettings::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PerformancePlusCampaignSettings::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Permissions

```cpp
// Create a model
auto model = models::Permissions();

// Serialize to JSON
nlohmann::json json = models::Permissions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Permissions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PermissionsWithOwner

```cpp
// Create a model
auto model = models::PermissionsWithOwner();

// Serialize to JSON
nlohmann::json json = models::PermissionsWithOwner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PermissionsWithOwner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Pin

```cpp
// Create a model
auto model = models::Pin();
model.setAltText(/* value */);  // Set alt_text
model.setDescription(/* value */);  // Set description
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::Pin::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Pin::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinAnalyticsDailyMetrics

```cpp
// Create a model
auto model = models::PinAnalyticsDailyMetrics();
model.setDataStatus(/* value */);  // Set data_status
model.setDate(/* value */);  // Set date
model.setMetrics(/* value */);  // Set metrics

// Serialize to JSON
nlohmann::json json = models::PinAnalyticsDailyMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinAnalyticsDailyMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinAnalyticsMetricsResponse

```cpp
// Create a model
auto model = models::PinAnalyticsMetricsResponse();
model.setDailyMetrics(/* value */);  // Set daily_metrics
model.setLifetimeMetrics(/* value */);  // Set lifetime_metrics
model.setSummaryMetrics(/* value */);  // Set summary_metrics

// Serialize to JSON
nlohmann::json json = models::PinAnalyticsMetricsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinAnalyticsMetricsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinBase

```cpp
// Create a model
auto model = models::PinBase();
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setBoardId(/* value */);  // Set board_id
model.setBoardOwner(/* value */);  // Set board_owner
model.setBoardSectionId(/* value */);  // Set board_section_id
model.setCreatedAt(/* value */);  // Set created_at
model.setCreativeType(/* value */);  // Set creative_type
model.setDominantColor(/* value */);  // Set dominant_color
model.setHasBeenPromoted(/* value */);  // Set has_been_promoted
model.setId(/* value */);  // Set id
model.setIsOwner(/* value */);  // Set is_owner
model.setIsProduct(/* value */);  // Set is_product
model.setIsStandard(/* value */);  // Set is_standard
model.setMedia(/* value */);  // Set media
model.setParentPinId(/* value */);  // Set parent_pin_id
model.setPinMetrics(/* value */);  // Set pin_metrics

// Serialize to JSON
nlohmann::json json = models::PinBase::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinBase::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinCreate

```cpp
// Create a model
auto model = models::PinCreate();
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setAltText(/* value */);  // Set alt_text
model.setBoardId(/* value */);  // Set board_id
model.setBoardSectionId(/* value */);  // Set board_section_id
model.setDescription(/* value */);  // Set description
model.setDominantColor(/* value */);  // Set dominant_color
model.setLink(/* value */);  // Set link
model.setMediaSource(/* value */);  // Set media_source
model.setParentPinId(/* value */);  // Set parent_pin_id
model.setSponsorId(/* value */);  // Set sponsor_id
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::PinCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinFilter

```cpp
// Create a model
auto model = models::PinFilter();

// Serialize to JSON
nlohmann::json json = models::PinFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinMediaResponseObject

```cpp
// Create a model
auto model = models::PinMediaResponseObject();
model.setImages(/* value */);  // Set images
model.setMediaType(/* value */);  // Set media_type
model.setCoverImageUrl(/* value */);  // Set cover_image_url
model.setDuration(/* value */);  // Set duration
model.setHeight(/* value */);  // Set height
model.setVideoUrl(/* value */);  // Set video_url
model.setVideoUrlHls(/* value */);  // Set video_url_hls
model.setWidth(/* value */);  // Set width
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::PinMediaResponseObject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinMediaResponseObject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinMediaMetadata

```cpp
// Create a model
auto model = models::PinMediaMetadata();
model.setDescription(/* value */);  // Set description
model.setImages(/* value */);  // Set images
model.setItemType(/* value */);  // Set item_type
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title
model.setCoverImageUrl(/* value */);  // Set cover_image_url
model.setDuration(/* value */);  // Set duration
model.setHeight(/* value */);  // Set height
model.setVideoUrl(/* value */);  // Set video_url
model.setVideoUrlHls(/* value */);  // Set video_url_hls
model.setWidth(/* value */);  // Set width

// Serialize to JSON
nlohmann::json json = models::PinMediaMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinMediaMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinMediaSource

```cpp
// Create a model
auto model = models::PinMediaSource();
model.setContentType(/* value */);  // Set content_type
model.setData(/* value */);  // Set data
model.setIsStandard(/* value */);  // Set is_standard
model.setSourceType(/* value */);  // Set source_type
model.setUrl(/* value */);  // Set url
model.setCoverImageContentType(/* value */);  // Set cover_image_content_type
model.setCoverImageData(/* value */);  // Set cover_image_data
model.setCoverImageKeyFrameTime(/* value */);  // Set cover_image_key_frame_time
model.setCoverImageUrl(/* value */);  // Set cover_image_url
model.setMediaId(/* value */);  // Set media_id
model.setIndex(/* value */);  // Set index
model.setItems(/* value */);  // Set items
model.setIsAffiliateLink(/* value */);  // Set is_affiliate_link

// Serialize to JSON
nlohmann::json json = models::PinMediaSource::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinMediaSource::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingBase64Format

```cpp
// Create a model
auto model = models::ObjectContainingBase64Format();
model.setContentType(/* value */);  // Set content_type
model.setData(/* value */);  // Set data
model.setIsStandard(/* value */);  // Set is_standard
model.setSourceType(/* value */);  // Set source_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingBase64Format::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingBase64Format::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingImageUrl

```cpp
// Create a model
auto model = models::ObjectContainingImageUrl();
model.setIsStandard(/* value */);  // Set is_standard
model.setSourceType(/* value */);  // Set source_type
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::ObjectContainingImageUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingImageUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingBase64ImageDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingBase64ImageDefinitions();
model.setIndex(/* value */);  // Set index
model.setItems(/* value */);  // Set items
model.setSourceType(/* value */);  // Set source_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingBase64ImageDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingBase64ImageDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinMediaSourceImagesBase64Item

```cpp
// Create a model
auto model = models::PinMediaSourceImagesBase64Item();
model.setContentType(/* value */);  // Set content_type
model.setData(/* value */);  // Set data
model.setDescription(/* value */);  // Set description
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::PinMediaSourceImagesBase64Item::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinMediaSourceImagesBase64Item::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinMediaSourceImagesURLItem

```cpp
// Create a model
auto model = models::PinMediaSourceImagesURLItem();
model.setDescription(/* value */);  // Set description
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::PinMediaSourceImagesURLItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinMediaSourceImagesURLItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingImagesUrlDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingImagesUrlDefinitions();
model.setIndex(/* value */);  // Set index
model.setItems(/* value */);  // Set items
model.setSourceType(/* value */);  // Set source_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingImagesUrlDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingImagesUrlDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MediaObjectContainingUrlTypeDefinition

```cpp
// Create a model
auto model = models::MediaObjectContainingUrlTypeDefinition();
model.setIsAffiliateLink(/* value */);  // Set is_affiliate_link
model.setSourceType(/* value */);  // Set source_type

// Serialize to JSON
nlohmann::json json = models::MediaObjectContainingUrlTypeDefinition::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MediaObjectContainingUrlTypeDefinition::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingVideoIdDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingVideoIdDefinitions();
model.setCoverImageContentType(/* value */);  // Set cover_image_content_type
model.setCoverImageData(/* value */);  // Set cover_image_data
model.setCoverImageKeyFrameTime(/* value */);  // Set cover_image_key_frame_time
model.setCoverImageUrl(/* value */);  // Set cover_image_url
model.setIsStandard(/* value */);  // Set is_standard
model.setMediaId(/* value */);  // Set media_id
model.setSourceType(/* value */);  // Set source_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingVideoIdDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingVideoIdDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingImageDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingImageDefinitions();
model.setImages(/* value */);  // Set images
model.setMediaType(/* value */);  // Set media_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingImageDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingImageDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingVideoAndImageDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingVideoAndImageDefinitions();
model.setItems(/* value */);  // Set items
model.setMediaType(/* value */);  // Set media_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingVideoAndImageDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingVideoAndImageDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingImagesDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingImagesDefinitions();
model.setItems(/* value */);  // Set items
model.setMediaType(/* value */);  // Set media_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingImagesDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingImagesDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingVideoDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingVideoDefinitions();
model.setCoverImageUrl(/* value */);  // Set cover_image_url
model.setDuration(/* value */);  // Set duration
model.setHeight(/* value */);  // Set height
model.setImages(/* value */);  // Set images
model.setMediaType(/* value */);  // Set media_type
model.setVideoUrl(/* value */);  // Set video_url
model.setVideoUrlHls(/* value */);  // Set video_url_hls
model.setWidth(/* value */);  // Set width

// Serialize to JSON
nlohmann::json json = models::ObjectContainingVideoDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingVideoDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ObjectContainingVideosDefinitions

```cpp
// Create a model
auto model = models::ObjectContainingVideosDefinitions();
model.setItems(/* value */);  // Set items
model.setMediaType(/* value */);  // Set media_type

// Serialize to JSON
nlohmann::json json = models::ObjectContainingVideosDefinitions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ObjectContainingVideosDefinitions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinPromotionSummaryStatus

```cpp
// Create a model
auto model = models::PinPromotionSummaryStatus();

// Serialize to JSON
nlohmann::json json = models::PinPromotionSummaryStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinPromotionSummaryStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinRead

```cpp
// Create a model
auto model = models::PinRead();
model.setAltText(/* value */);  // Set alt_text
model.setDescription(/* value */);  // Set description
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::PinRead::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinRead::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinType

```cpp
// Create a model
auto model = models::PinType();

// Serialize to JSON
nlohmann::json json = models::PinType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinUpdate

```cpp
// Create a model
auto model = models::PinUpdate();
model.setAiDisclosures(/* value */);  // Set ai_disclosures
model.setAltText(/* value */);  // Set alt_text
model.setBoardId(/* value */);  // Set board_id
model.setBoardSectionId(/* value */);  // Set board_section_id
model.setCarouselSlots(/* value */);  // Set carousel_slots
model.setDescription(/* value */);  // Set description
model.setLink(/* value */);  // Set link
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::PinUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinnerListType

```cpp
// Create a model
auto model = models::PinnerListType();

// Serialize to JSON
nlohmann::json json = models::PinnerListType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinnerListType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinsList200Response

```cpp
// Create a model
auto model = models::PinsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::PinsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinsSaveRequestCreate

```cpp
// Create a model
auto model = models::PinsSaveRequestCreate();
model.setBoardId(/* value */);  // Set board_id
model.setBoardSectionId(/* value */);  // Set board_section_id

// Serialize to JSON
nlohmann::json json = models::PinsSaveRequestCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinsSaveRequestCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinterestLibBatchItemException

```cpp
// Create a model
auto model = models::PinterestLibBatchItemException();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::PinterestLibBatchItemException::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinterestLibBatchItemException::fromJson(nlohmann::json::parse(jsonString));
```
#### models::GenericError

```cpp
// Create a model
auto model = models::GenericError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::GenericError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::GenericError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinterestLibPaginationOrder

```cpp
// Create a model
auto model = models::PinterestLibPaginationOrder();

// Serialize to JSON
nlohmann::json json = models::PinterestLibPaginationOrder::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinterestLibPaginationOrder::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SuccessfullyDeleted

```cpp
// Create a model
auto model = models::SuccessfullyDeleted();
model.setStatusCode(/* value */);  // Set statusCode

// Serialize to JSON
nlohmann::json json = models::SuccessfullyDeleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SuccessfullyDeleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PinterestProductCategories

```cpp
// Create a model
auto model = models::PinterestProductCategories();
model.setPINTERESTPRODUCTCATEGORIES(/* value */);  // Set PINTEREST_PRODUCT_CATEGORIES

// Serialize to JSON
nlohmann::json json = models::PinterestProductCategories::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PinterestProductCategories::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PlacementGroupType

```cpp
// Create a model
auto model = models::PlacementGroupType();

// Serialize to JSON
nlohmann::json json = models::PlacementGroupType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PlacementGroupType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PlacementMultipliers

```cpp
// Create a model
auto model = models::PlacementMultipliers();
model.setPLACEMENT(/* value */);  // Set PLACEMENT

// Serialize to JSON
nlohmann::json json = models::PlacementMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PlacementMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PlacementTrafficType

```cpp
// Create a model
auto model = models::PlacementTrafficType();

// Serialize to JSON
nlohmann::json json = models::PlacementTrafficType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PlacementTrafficType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PlacementType

```cpp
// Create a model
auto model = models::PlacementType();

// Serialize to JSON
nlohmann::json json = models::PlacementType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PlacementType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PredictedTimeSeries

```cpp
// Create a model
auto model = models::PredictedTimeSeries();
model.setDate(/* value */);  // Set date

// Serialize to JSON
nlohmann::json json = models::PredictedTimeSeries::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PredictedTimeSeries::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PreferredMediaType

```cpp
// Create a model
auto model = models::PreferredMediaType();

// Serialize to JSON
nlohmann::json json = models::PreferredMediaType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PreferredMediaType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Price

```cpp
// Create a model
auto model = models::Price();
model.setPRICE(/* value */);  // Set PRICE

// Serialize to JSON
nlohmann::json json = models::Price::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Price::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CatalogsProductGroupPricingCurrencyCriteria

```cpp
// Create a model
auto model = models::CatalogsProductGroupPricingCurrencyCriteria();
model.setCurrency(/* value */);  // Set currency
model.setNegated(/* value */);  // Set negated
model.setROperator(/* value */);  // Set operator
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::CatalogsProductGroupPricingCurrencyCriteria::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CatalogsProductGroupPricingCurrencyCriteria::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PrimarySort

```cpp
// Create a model
auto model = models::PrimarySort();

// Serialize to JSON
nlohmann::json json = models::PrimarySort::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PrimarySort::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductAvailability

```cpp
// Create a model
auto model = models::ProductAvailability();

// Serialize to JSON
nlohmann::json json = models::ProductAvailability::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductAvailability::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductAvailabilityType

```cpp
// Create a model
auto model = models::ProductAvailabilityType();

// Serialize to JSON
nlohmann::json json = models::ProductAvailabilityType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductAvailabilityType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCategoriesDemographic

```cpp
// Create a model
auto model = models::ProductCategoriesDemographic();
model.setAge(/* value */);  // Set age
model.setGender(/* value */);  // Set gender

// Serialize to JSON
nlohmann::json json = models::ProductCategoriesDemographic::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCategoriesDemographic::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCategoriesEngagementType

```cpp
// Create a model
auto model = models::ProductCategoriesEngagementType();

// Serialize to JSON
nlohmann::json json = models::ProductCategoriesEngagementType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCategoriesEngagementType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCategoriesMetricsHighlights

```cpp
// Create a model
auto model = models::ProductCategoriesMetricsHighlights();
model.setEngagement(/* value */);  // Set engagement
model.setOutboundClicks(/* value */);  // Set outbound_clicks
model.setPinSaves(/* value */);  // Set pin_saves

// Serialize to JSON
nlohmann::json json = models::ProductCategoriesMetricsHighlights::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCategoriesMetricsHighlights::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCategoryDetailLookbackWindow

```cpp
// Create a model
auto model = models::ProductCategoryDetailLookbackWindow();

// Serialize to JSON
nlohmann::json json = models::ProductCategoryDetailLookbackWindow::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCategoryDetailLookbackWindow::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCategoryDetails

```cpp
// Create a model
auto model = models::ProductCategoryDetails();
model.setDemographics(/* value */);  // Set demographics
model.setHasPrediction(/* value */);  // Set has_prediction
model.setMetricsHighlights(/* value */);  // Set metrics_highlights
model.setPredictedTimeSeries(/* value */);  // Set predicted_time_series
model.setProductCategory(/* value */);  // Set product_category
model.setRelatedSearches(/* value */);  // Set related_searches
model.setTimeSeries(/* value */);  // Set time_series

// Serialize to JSON
nlohmann::json json = models::ProductCategoryDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCategoryDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCategoryEnum

```cpp
// Create a model
auto model = models::ProductCategoryEnum();

// Serialize to JSON
nlohmann::json json = models::ProductCategoryEnum::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCategoryEnum::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCategoryRegion

```cpp
// Create a model
auto model = models::ProductCategoryRegion();

// Serialize to JSON
nlohmann::json json = models::ProductCategoryRegion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCategoryRegion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductCondition

```cpp
// Create a model
auto model = models::ProductCondition();

// Serialize to JSON
nlohmann::json json = models::ProductCondition::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductCondition::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupAnalyticsItems

```cpp
// Create a model
auto model = models::ProductGroupAnalyticsItems();
model.setDATE(/* value */);  // Set DATE
model.setPRODUCTGROUPID(/* value */);  // Set PRODUCT_GROUP_ID

// Serialize to JSON
nlohmann::json json = models::ProductGroupAnalyticsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupAnalyticsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotion

```cpp
// Create a model
auto model = models::ProductGroupPromotion();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setBidInMicroCurrency(/* value */);  // Set bid_in_micro_currency
model.setCatalogProductGroupId(/* value */);  // Set catalog_product_group_id
model.setCatalogProductGroupName(/* value */);  // Set catalog_product_group_name
model.setCollectionsHeaderType(/* value */);  // Set collections_header_type
model.setCollectionsHeroDestinationUrl(/* value */);  // Set collections_hero_destination_url
model.setCollectionsHeroPinId(/* value */);  // Set collections_hero_pin_id
model.setCreativeType(/* value */);  // Set creative_type
model.setCustomizableCtaType(/* value */);  // Set customizable_cta_type
model.setDefinition(/* value */);  // Set definition
model.setGridClickType(/* value */);  // Set grid_click_type
model.setId(/* value */);  // Set id
model.setIncluded(/* value */);  // Set included
model.setIsGenerateBackground(/* value */);  // Set is_generate_background
model.setIsImageAutoResizing(/* value */);  // Set is_image_auto_resizing
model.setIsMdl(/* value */);  // Set is_mdl
model.setParentId(/* value */);  // Set parent_id
model.setPreferredMediaType(/* value */);  // Set preferred_media_type
model.setRelativeDefinition(/* value */);  // Set relative_definition
model.setSelectedImageTag(/* value */);  // Set selected_image_tag
model.setSelectedVideoTag(/* value */);  // Set selected_video_tag
model.setSlideshowCollectionsDescription(/* value */);  // Set slideshow_collections_description
model.setSlideshowCollectionsTitle(/* value */);  // Set slideshow_collections_title
model.setStatus(/* value */);  // Set status
model.setTrackingUrl(/* value */);  // Set tracking_url

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotionCreateRequest

```cpp
// Create a model
auto model = models::ProductGroupPromotionCreateRequest();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setProductGroupPromotion(/* value */);  // Set product_group_promotion

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotionCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotionCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotionCustomizableCTAType

```cpp
// Create a model
auto model = models::ProductGroupPromotionCustomizableCTAType();

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotionCustomizableCTAType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotionCustomizableCTAType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotionResponseItem

```cpp
// Create a model
auto model = models::ProductGroupPromotionResponseItem();
model.setData(/* value */);  // Set data
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotionResponseItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotionResponseItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotionUpdateRequest

```cpp
// Create a model
auto model = models::ProductGroupPromotionUpdateRequest();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setProductGroupPromotion(/* value */);  // Set product_group_promotion

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotionUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotionUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotions

```cpp
// Create a model
auto model = models::ProductGroupPromotions();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotionsCreate

```cpp
// Create a model
auto model = models::ProductGroupPromotionsCreate();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setProductGroupPromotion(/* value */);  // Set product_group_promotion

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotionsCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotionsCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotionsList200Response

```cpp
// Create a model
auto model = models::ProductGroupPromotionsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotionsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotionsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupPromotionsUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::ProductGroupPromotionsUpdateWithRequiredBody();
model.setAdGroupId(/* value */);  // Set ad_group_id
model.setProductGroupPromotion(/* value */);  // Set product_group_promotion

// Serialize to JSON
nlohmann::json json = models::ProductGroupPromotionsUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupPromotionsUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroup

```cpp
// Create a model
auto model = models::ProductGroup();
model.setPRODUCTGROUP(/* value */);  // Set PRODUCT_GROUP

// Serialize to JSON
nlohmann::json json = models::ProductGroup::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroup::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductGroupSummaryStatus

```cpp
// Create a model
auto model = models::ProductGroupSummaryStatus();

// Serialize to JSON
nlohmann::json json = models::ProductGroupSummaryStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductGroupSummaryStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductTagItem

```cpp
// Create a model
auto model = models::ProductTagItem();
model.setPinId(/* value */);  // Set pin_id

// Serialize to JSON
nlohmann::json json = models::ProductTagItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductTagItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductTagsBulkAddRequest

```cpp
// Create a model
auto model = models::ProductTagsBulkAddRequest();
model.setProductTags(/* value */);  // Set product_tags

// Serialize to JSON
nlohmann::json json = models::ProductTagsBulkAddRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductTagsBulkAddRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductTagsBulkDeleteRequest

```cpp
// Create a model
auto model = models::ProductTagsBulkDeleteRequest();
model.setProductTags(/* value */);  // Set product_tags

// Serialize to JSON
nlohmann::json json = models::ProductTagsBulkDeleteRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductTagsBulkDeleteRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductTagsError

```cpp
// Create a model
auto model = models::ProductTagsError();
model.setCode(/* value */);  // Set code
model.setDetails(/* value */);  // Set details
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::ProductTagsError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductTagsError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductTagsResponse

```cpp
// Create a model
auto model = models::ProductTagsResponse();
model.setProductTags(/* value */);  // Set product_tags

// Serialize to JSON
nlohmann::json json = models::ProductTagsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductTagsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductType0

```cpp
// Create a model
auto model = models::ProductType0();
model.setPRODUCTTYPE0(/* value */);  // Set PRODUCT_TYPE_0

// Serialize to JSON
nlohmann::json json = models::ProductType0::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductType0::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductType1

```cpp
// Create a model
auto model = models::ProductType1();
model.setPRODUCTTYPE1(/* value */);  // Set PRODUCT_TYPE_1

// Serialize to JSON
nlohmann::json json = models::ProductType1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductType1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductType2

```cpp
// Create a model
auto model = models::ProductType2();
model.setPRODUCTTYPE2(/* value */);  // Set PRODUCT_TYPE_2

// Serialize to JSON
nlohmann::json json = models::ProductType2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductType2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductType3

```cpp
// Create a model
auto model = models::ProductType3();
model.setPRODUCTTYPE3(/* value */);  // Set PRODUCT_TYPE_3

// Serialize to JSON
nlohmann::json json = models::ProductType3::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductType3::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductType4

```cpp
// Create a model
auto model = models::ProductType4();
model.setPRODUCTTYPE4(/* value */);  // Set PRODUCT_TYPE_4

// Serialize to JSON
nlohmann::json json = models::ProductType4::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductType4::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProductsByProductGroupFilterList200Response

```cpp
// Create a model
auto model = models::ProductsByProductGroupFilterList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ProductsByProductGroupFilterList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProductsByProductGroupFilterList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Promotion

```cpp
// Create a model
auto model = models::Promotion();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setDiscountStatus(/* value */);  // Set discount_status
model.setEndTime(/* value */);  // Set end_time
model.setExternalId(/* value */);  // Set external_id
model.setId(/* value */);  // Set id
model.setPlatformType(/* value */);  // Set platform_type
model.setPromotionCode(/* value */);  // Set promotion_code
model.setPromotionCustomId(/* value */);  // Set promotion_custom_id
model.setPromotionTitle(/* value */);  // Set promotion_title
model.setPromotionType(/* value */);  // Set promotion_type
model.setStartTime(/* value */);  // Set start_time
model.setStatus(/* value */);  // Set status
model.setTemplateValues(/* value */);  // Set template_values

// Serialize to JSON
nlohmann::json json = models::Promotion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Promotion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionApplicationLevel

```cpp
// Create a model
auto model = models::PromotionApplicationLevel();

// Serialize to JSON
nlohmann::json json = models::PromotionApplicationLevel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionApplicationLevel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionArrayElement

```cpp
// Create a model
auto model = models::PromotionArrayElement();
model.setData(/* value */);  // Set data
model.setException(/* value */);  // Set exception

// Serialize to JSON
nlohmann::json json = models::PromotionArrayElement::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionArrayElement::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionBatchUpdate

```cpp
// Create a model
auto model = models::PromotionBatchUpdate();
model.setDiscountStatus(/* value */);  // Set discount_status
model.setEndTime(/* value */);  // Set end_time
model.setExternalId(/* value */);  // Set external_id
model.setId(/* value */);  // Set id
model.setPlatformType(/* value */);  // Set platform_type
model.setPromotionCode(/* value */);  // Set promotion_code
model.setPromotionCustomId(/* value */);  // Set promotion_custom_id
model.setPromotionTitle(/* value */);  // Set promotion_title
model.setPromotionType(/* value */);  // Set promotion_type
model.setStartTime(/* value */);  // Set start_time
model.setTemplateValues(/* value */);  // Set template_values

// Serialize to JSON
nlohmann::json json = models::PromotionBatchUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionBatchUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionCreate

```cpp
// Create a model
auto model = models::PromotionCreate();
model.setDiscountStatus(/* value */);  // Set discount_status
model.setEndTime(/* value */);  // Set end_time
model.setExternalId(/* value */);  // Set external_id
model.setPlatformType(/* value */);  // Set platform_type
model.setPromotionCode(/* value */);  // Set promotion_code
model.setPromotionCustomId(/* value */);  // Set promotion_custom_id
model.setPromotionTitle(/* value */);  // Set promotion_title
model.setPromotionType(/* value */);  // Set promotion_type
model.setStartTime(/* value */);  // Set start_time
model.setTemplateValues(/* value */);  // Set template_values

// Serialize to JSON
nlohmann::json json = models::PromotionCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionTemplateValue

```cpp
// Create a model
auto model = models::PromotionTemplateValue();
model.setAmount(/* value */);  // Set amount
model.setCurrencyCode(/* value */);  // Set currency_code
model.setCustomText(/* value */);  // Set custom_text
model.setPercent(/* value */);  // Set percent

// Serialize to JSON
nlohmann::json json = models::PromotionTemplateValue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionTemplateValue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionType

```cpp
// Create a model
auto model = models::PromotionType();

// Serialize to JSON
nlohmann::json json = models::PromotionType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionsList200Response

```cpp
// Create a model
auto model = models::PromotionsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::PromotionsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PromotionsResponse

```cpp
// Create a model
auto model = models::PromotionsResponse();
model.setPromotions(/* value */);  // Set promotions

// Serialize to JSON
nlohmann::json json = models::PromotionsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PromotionsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PublicTargetingType

```cpp
// Create a model
auto model = models::PublicTargetingType();

// Serialize to JSON
nlohmann::json json = models::PublicTargetingType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PublicTargetingType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QualityComponentDetails

```cpp
// Create a model
auto model = models::QualityComponentDetails();
model.setCoverage(/* value */);  // Set coverage
model.setIssues(/* value */);  // Set issues
model.setOverlap(/* value */);  // Set overlap

// Serialize to JSON
nlohmann::json json = models::QualityComponentDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QualityComponentDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QualityComponentIssue

```cpp
// Create a model
auto model = models::QualityComponentIssue();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setReason(/* value */);  // Set reason

// Serialize to JSON
nlohmann::json json = models::QualityComponentIssue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QualityComponentIssue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QualityComponents

```cpp
// Create a model
auto model = models::QualityComponents();
model.setAdvertiserExternalId(/* value */);  // Set advertiser_external_id
model.setClickIdEpik(/* value */);  // Set click_id_epik
model.setExternalEventId(/* value */);  // Set external_event_id
model.setHashedEmail(/* value */);  // Set hashed_email
model.setHashedMaid(/* value */);  // Set hashed_maid
model.setIpAddress(/* value */);  // Set ip_address
model.setOrderId(/* value */);  // Set order_id
model.setOrderValue(/* value */);  // Set order_value
model.setProductId(/* value */);  // Set product_id
model.setSourceUrl(/* value */);  // Set source_url
model.setUserAgent(/* value */);  // Set user_agent

// Serialize to JSON
nlohmann::json json = models::QualityComponents::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QualityComponents::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QueryLabelEntityStatusesItems

```cpp
// Create a model
auto model = models::QueryLabelEntityStatusesItems();

// Serialize to JSON
nlohmann::json json = models::QueryLabelEntityStatusesItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QueryLabelEntityStatusesItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QueryLabelTypesItems

```cpp
// Create a model
auto model = models::QueryLabelTypesItems();

// Serialize to JSON
nlohmann::json json = models::QueryLabelTypesItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QueryLabelTypesItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QuerymetrictypesItems

```cpp
// Create a model
auto model = models::QuerymetrictypesItems();

// Serialize to JSON
nlohmann::json json = models::QuerymetrictypesItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QuerymetrictypesItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QuerypinanalyticsmetrictypesItems

```cpp
// Create a model
auto model = models::QuerypinanalyticsmetrictypesItems();

// Serialize to JSON
nlohmann::json json = models::QuerypinanalyticsmetrictypesItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QuerypinanalyticsmetrictypesItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QueryvideopinmetrictypesItems

```cpp
// Create a model
auto model = models::QueryvideopinmetrictypesItems();

// Serialize to JSON
nlohmann::json json = models::QueryvideopinmetrictypesItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QueryvideopinmetrictypesItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QuizPinData

```cpp
// Create a model
auto model = models::QuizPinData();
model.setQuestions(/* value */);  // Set questions
model.setResults(/* value */);  // Set results
model.setTieBreakerCustomResult(/* value */);  // Set tie_breaker_custom_result
model.setTieBreakerType(/* value */);  // Set tie_breaker_type

// Serialize to JSON
nlohmann::json json = models::QuizPinData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QuizPinData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QuizPinOption

```cpp
// Create a model
auto model = models::QuizPinOption();
model.setId(/* value */);  // Set id
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::QuizPinOption::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QuizPinOption::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QuizPinQuestion

```cpp
// Create a model
auto model = models::QuizPinQuestion();
model.setOptions(/* value */);  // Set options
model.setQuestionId(/* value */);  // Set question_id
model.setQuestionText(/* value */);  // Set question_text

// Serialize to JSON
nlohmann::json json = models::QuizPinQuestion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QuizPinQuestion::fromJson(nlohmann::json::parse(jsonString));
```
#### models::QuizPinResult

```cpp
// Create a model
auto model = models::QuizPinResult();
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setDestinationUrl(/* value */);  // Set destination_url
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setOrganicPinId(/* value */);  // Set organic_pin_id
model.setResultId(/* value */);  // Set result_id

// Serialize to JSON
nlohmann::json json = models::QuizPinResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::QuizPinResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RecordCounts

```cpp
// Create a model
auto model = models::RecordCounts();
model.setInvalid(/* value */);  // Set invalid
model.setProcessed(/* value */);  // Set processed
model.setValid(/* value */);  // Set valid

// Serialize to JSON
nlohmann::json json = models::RecordCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RecordCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RelatedTerms

```cpp
// Create a model
auto model = models::RelatedTerms();
model.setId(/* value */);  // Set id
model.setRelatedTermCount(/* value */);  // Set related_term_count
model.setRelatedTermsList(/* value */);  // Set related_terms_list

// Serialize to JSON
nlohmann::json json = models::RelatedTerms::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RelatedTerms::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RelatedTermsRelatedTermsListItems

```cpp
// Create a model
auto model = models::RelatedTermsRelatedTermsListItems();
model.setRelatedTerms(/* value */);  // Set related_terms
model.setTerm(/* value */);  // Set term

// Serialize to JSON
nlohmann::json json = models::RelatedTermsRelatedTermsListItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RelatedTermsRelatedTermsListItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ReportType

```cpp
// Create a model
auto model = models::ReportType();

// Serialize to JSON
nlohmann::json json = models::ReportType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ReportType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ReportingColumn

```cpp
// Create a model
auto model = models::ReportingColumn();

// Serialize to JSON
nlohmann::json json = models::ReportingColumn::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ReportingColumn::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ReportingColumnAsync

```cpp
// Create a model
auto model = models::ReportingColumnAsync();

// Serialize to JSON
nlohmann::json json = models::ReportingColumnAsync::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ReportingColumnAsync::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ReportingColumnSync

```cpp
// Create a model
auto model = models::ReportingColumnSync();

// Serialize to JSON
nlohmann::json json = models::ReportingColumnSync::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ReportingColumnSync::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ReportingTimeZone

```cpp
// Create a model
auto model = models::ReportingTimeZone();

// Serialize to JSON
nlohmann::json json = models::ReportingTimeZone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ReportingTimeZone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ReportsStats200Response

```cpp
// Create a model
auto model = models::ReportsStats200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::ReportsStats200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ReportsStats200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RespondToInviteResultItem

```cpp
// Create a model
auto model = models::RespondToInviteResultItem();
model.setException(/* value */);  // Set exception
model.setInvite(/* value */);  // Set invite

// Serialize to JSON
nlohmann::json json = models::RespondToInviteResultItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RespondToInviteResultItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RespondToInvitesResponseArray

```cpp
// Create a model
auto model = models::RespondToInvitesResponseArray();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::RespondToInvitesResponseArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RespondToInvitesResponseArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailLocalInventoryItemAttributes

```cpp
// Create a model
auto model = models::RetailLocalInventoryItemAttributes();
model.setAdLink(/* value */);  // Set ad_link
model.setAvailability(/* value */);  // Set availability
model.setPrice(/* value */);  // Set price
model.setSalePrice(/* value */);  // Set sale_price

// Serialize to JSON
nlohmann::json json = models::RetailLocalInventoryItemAttributes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailLocalInventoryItemAttributes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RetailLocalInventoryItemAttributesOptional

```cpp
// Create a model
auto model = models::RetailLocalInventoryItemAttributesOptional();
model.setAdLink(/* value */);  // Set ad_link
model.setAvailability(/* value */);  // Set availability
model.setPrice(/* value */);  // Set price
model.setSalePrice(/* value */);  // Set sale_price

// Serialize to JSON
nlohmann::json json = models::RetailLocalInventoryItemAttributesOptional::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RetailLocalInventoryItemAttributesOptional::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Role

```cpp
// Create a model
auto model = models::Role();

// Serialize to JSON
nlohmann::json json = models::Role::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Role::fromJson(nlohmann::json::parse(jsonString));
```
#### models::S3FilePart

```cpp
// Create a model
auto model = models::S3FilePart();
model.setPartNumber(/* value */);  // Set part_number
model.setPresignedUrl(/* value */);  // Set presigned_url

// Serialize to JSON
nlohmann::json json = models::S3FilePart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::S3FilePart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::S3MultipartUploadData

```cpp
// Create a model
auto model = models::S3MultipartUploadData();
model.setFileParts(/* value */);  // Set file_parts

// Serialize to JSON
nlohmann::json json = models::S3MultipartUploadData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::S3MultipartUploadData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOAccount

```cpp
// Create a model
auto model = models::SSIOAccount();
model.setBilltoInfos(/* value */);  // Set billto_infos
model.setCanEdit(/* value */);  // Set can_edit
model.setCurrency(/* value */);  // Set currency
model.setEligible(/* value */);  // Set eligible
model.setError(/* value */);  // Set error
model.setPmpNames(/* value */);  // Set pmp_names

// Serialize to JSON
nlohmann::json json = models::SSIOAccount::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOAccount::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOAccountAddress

```cpp
// Create a model
auto model = models::SSIOAccountAddress();
model.setAddressId(/* value */);  // Set address_id
model.setDisplay(/* value */);  // Set display
model.setOrderLegalEntity(/* value */);  // Set order_legal_entity
model.setPurpose(/* value */);  // Set purpose

// Serialize to JSON
nlohmann::json json = models::SSIOAccountAddress::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOAccountAddress::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOAccountItem

```cpp
// Create a model
auto model = models::SSIOAccountItem();
model.setAddresses(/* value */);  // Set addresses
model.setId(/* value */);  // Set id
model.setIoTerms(/* value */);  // Set io_terms
model.setIoTermsId(/* value */);  // Set io_terms_id
model.setIoType(/* value */);  // Set io_type
model.setRowTerms(/* value */);  // Set row_terms
model.setRowTermsId(/* value */);  // Set row_terms_id
model.setUsTerms(/* value */);  // Set us_terms
model.setUsTermsId(/* value */);  // Set us_terms_id

// Serialize to JSON
nlohmann::json json = models::SSIOAccountItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOAccountItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOAccountPMPName

```cpp
// Create a model
auto model = models::SSIOAccountPMPName();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::SSIOAccountPMPName::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOAccountPMPName::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOInsertionOrder

```cpp
// Create a model
auto model = models::SSIOInsertionOrder();
model.setPinOrderId(/* value */);  // Set pin_order_id

// Serialize to JSON
nlohmann::json json = models::SSIOInsertionOrder::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOInsertionOrder::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOInsertionOrderCreate

```cpp
// Create a model
auto model = models::SSIOInsertionOrderCreate();
model.setAcceptedTermsId(/* value */);  // Set accepted_terms_id
model.setAcceptedTermsTime(/* value */);  // Set accepted_terms_time
model.setAgencyLink(/* value */);  // Set agency_link
model.setBillingContactEmail(/* value */);  // Set billing_contact_email
model.setBillingContactFirstname(/* value */);  // Set billing_contact_firstname
model.setBillingContactLastname(/* value */);  // Set billing_contact_lastname
model.setBilltoBillingAddressId(/* value */);  // Set billto_billing_address_id
model.setBilltoBusinessAddressId(/* value */);  // Set billto_business_address_id
model.setBilltoCompanyId(/* value */);  // Set billto_company_id
model.setBudgetAmount(/* value */);  // Set budget_amount
model.setCurrencyInfo(/* value */);  // Set currency_info
model.setEndDate(/* value */);  // Set end_date
model.setEstimatedMonthlySpend(/* value */);  // Set estimated_monthly_spend
model.setMediaContactEmail(/* value */);  // Set media_contact_email
model.setMediaContactFirstname(/* value */);  // Set media_contact_firstname
model.setMediaContactLastname(/* value */);  // Set media_contact_lastname
model.setOrderLineType(/* value */);  // Set order_line_type
model.setOrderName(/* value */);  // Set order_name
model.setPmpId(/* value */);  // Set pmp_id
model.setPoNumber(/* value */);  // Set po_number
model.setStartDate(/* value */);  // Set start_date
model.setUserEmail(/* value */);  // Set user_email

// Serialize to JSON
nlohmann::json json = models::SSIOInsertionOrderCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOInsertionOrderCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOInsertionOrderStatus

```cpp
// Create a model
auto model = models::SSIOInsertionOrderStatus();
model.setCreationTime(/* value */);  // Set creation_time
model.setPinOrderId(/* value */);  // Set pin_order_id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::SSIOInsertionOrderStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOInsertionOrderStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOInsertionOrderStatusResponse

```cpp
// Create a model
auto model = models::SSIOInsertionOrderStatusResponse();
model.setCreationTime(/* value */);  // Set creation_time
model.setPinOrderId(/* value */);  // Set pin_order_id
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::SSIOInsertionOrderStatusResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOInsertionOrderStatusResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOInsertionOrderUpdate

```cpp
// Create a model
auto model = models::SSIOInsertionOrderUpdate();
model.setAdsManagerOrderLineId(/* value */);  // Set ads_manager_order_line_id
model.setAgencyLink(/* value */);  // Set agency_link
model.setBillingContactEmail(/* value */);  // Set billing_contact_email
model.setBillingContactFirstname(/* value */);  // Set billing_contact_firstname
model.setBillingContactLastname(/* value */);  // Set billing_contact_lastname
model.setBudgetAmount(/* value */);  // Set budget_amount
model.setEndDate(/* value */);  // Set end_date
model.setMediaContactEmail(/* value */);  // Set media_contact_email
model.setMediaContactFirstname(/* value */);  // Set media_contact_firstname
model.setMediaContactLastname(/* value */);  // Set media_contact_lastname
model.setOracleLineId(/* value */);  // Set oracle_line_id
model.setPoNumber(/* value */);  // Set po_number
model.setSalesforceOrderId(/* value */);  // Set salesforce_order_id
model.setSalesforceOrderLineId(/* value */);  // Set salesforce_order_line_id
model.setStartDate(/* value */);  // Set start_date
model.setUserEmail(/* value */);  // Set user_email

// Serialize to JSON
nlohmann::json json = models::SSIOInsertionOrderUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOInsertionOrderUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOOrderLine

```cpp
// Create a model
auto model = models::SSIOOrderLine();
model.setAcceptedTermsId(/* value */);  // Set accepted_terms_id
model.setAcceptedTermsTime(/* value */);  // Set accepted_terms_time
model.setAdsManagerOrderLineId(/* value */);  // Set ads_manager_order_line_id
model.setAgencyLink(/* value */);  // Set agency_link
model.setBillToCompanyName(/* value */);  // Set bill_to_company_name
model.setBillingContactEmail(/* value */);  // Set billing_contact_email
model.setBillingContactFirstname(/* value */);  // Set billing_contact_firstname
model.setBillingContactLastname(/* value */);  // Set billing_contact_lastname
model.setBudgetAmount(/* value */);  // Set budget_amount
model.setCurrencyInfo(/* value */);  // Set currency_info
model.setEndDate(/* value */);  // Set end_date
model.setEstimatedMonthlySpend(/* value */);  // Set estimated_monthly_spend
model.setLastModifiedDateTime(/* value */);  // Set last_modified_date_time
model.setMediaContactEmail(/* value */);  // Set media_contact_email
model.setMediaContactFirstname(/* value */);  // Set media_contact_firstname
model.setMediaContactLastname(/* value */);  // Set media_contact_lastname
model.setOrderName(/* value */);  // Set order_name
model.setPinOrderId(/* value */);  // Set pin_order_id
model.setPmpName(/* value */);  // Set pmp_name
model.setPoNumber(/* value */);  // Set po_number
model.setSalesforceOrderLineId(/* value */);  // Set salesforce_order_line_id
model.setStartDate(/* value */);  // Set start_date

// Serialize to JSON
nlohmann::json json = models::SSIOOrderLine::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOOrderLine::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SSIOOrderLineType

```cpp
// Create a model
auto model = models::SSIOOrderLineType();

// Serialize to JSON
nlohmann::json json = models::SSIOOrderLineType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SSIOOrderLineType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Schedule

```cpp
// Create a model
auto model = models::Schedule();
model.setDeltaValue(/* value */);  // Set delta_value
model.setEndTimestamp(/* value */);  // Set end_timestamp
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setName(/* value */);  // Set name
model.setScheduleAction(/* value */);  // Set schedule_action
model.setScheduleId(/* value */);  // Set schedule_id
model.setScheduleStatus(/* value */);  // Set schedule_status
model.setScheduleType(/* value */);  // Set schedule_type
model.setStartTimestamp(/* value */);  // Set start_timestamp

// Serialize to JSON
nlohmann::json json = models::Schedule::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Schedule::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleAction

```cpp
// Create a model
auto model = models::ScheduleAction();

// Serialize to JSON
nlohmann::json json = models::ScheduleAction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleAction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleAgeBucketMultipliers

```cpp
// Create a model
auto model = models::ScheduleAgeBucketMultipliers();
model.setAGEBUCKET(/* value */);  // Set AGE_BUCKET

// Serialize to JSON
nlohmann::json json = models::ScheduleAgeBucketMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleAgeBucketMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleAppTypeMultipliers

```cpp
// Create a model
auto model = models::ScheduleAppTypeMultipliers();
model.setAPPTYPE(/* value */);  // Set APP_TYPE

// Serialize to JSON
nlohmann::json json = models::ScheduleAppTypeMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleAppTypeMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleAudienceMultipliers

```cpp
// Create a model
auto model = models::ScheduleAudienceMultipliers();
model.setAUDIENCEID(/* value */);  // Set AUDIENCE_ID

// Serialize to JSON
nlohmann::json json = models::ScheduleAudienceMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleAudienceMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleBatchUpdate

```cpp
// Create a model
auto model = models::ScheduleBatchUpdate();
model.setDeltaValue(/* value */);  // Set delta_value
model.setEndTimestamp(/* value */);  // Set end_timestamp
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setScheduleAction(/* value */);  // Set schedule_action
model.setScheduleId(/* value */);  // Set schedule_id
model.setScheduleStatus(/* value */);  // Set schedule_status
model.setScheduleType(/* value */);  // Set schedule_type
model.setStartTimestamp(/* value */);  // Set start_timestamp

// Serialize to JSON
nlohmann::json json = models::ScheduleBatchUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleBatchUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleBatchUpdateDeltaValue

```cpp
// Create a model
auto model = models::ScheduleBatchUpdateDeltaValue();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::ScheduleBatchUpdateDeltaValue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleBatchUpdateDeltaValue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleBidMultipliers

```cpp
// Create a model
auto model = models::ScheduleBidMultipliers();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::ScheduleBidMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleBidMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleBidOptions

```cpp
// Create a model
auto model = models::ScheduleBidOptions();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::ScheduleBidOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleBidOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleBidOptionsGenderMultipliers

```cpp
// Create a model
auto model = models::ScheduleBidOptionsGenderMultipliers();
model.setGENDER(/* value */);  // Set GENDER

// Serialize to JSON
nlohmann::json json = models::ScheduleBidOptionsGenderMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleBidOptionsGenderMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleBidOptionsPlacementMultipliers

```cpp
// Create a model
auto model = models::ScheduleBidOptionsPlacementMultipliers();
model.setBrowse(/* value */);  // Set browse
model.setRelatedPins(/* value */);  // Set related_pins
model.setSearch(/* value */);  // Set search

// Serialize to JSON
nlohmann::json json = models::ScheduleBidOptionsPlacementMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleBidOptionsPlacementMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleCommonDeltaValue

```cpp
// Create a model
auto model = models::ScheduleCommonDeltaValue();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::ScheduleCommonDeltaValue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleCommonDeltaValue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleCreate

```cpp
// Create a model
auto model = models::ScheduleCreate();
model.setDeltaValue(/* value */);  // Set delta_value
model.setEndTimestamp(/* value */);  // Set end_timestamp
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setName(/* value */);  // Set name
model.setScheduleAction(/* value */);  // Set schedule_action
model.setScheduleStatus(/* value */);  // Set schedule_status
model.setScheduleType(/* value */);  // Set schedule_type
model.setStartTimestamp(/* value */);  // Set start_timestamp

// Serialize to JSON
nlohmann::json json = models::ScheduleCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleCreateDeltaValue

```cpp
// Create a model
auto model = models::ScheduleCreateDeltaValue();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::ScheduleCreateDeltaValue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleCreateDeltaValue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleCreateRequest

```cpp
// Create a model
auto model = models::ScheduleCreateRequest();
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setDeltaValue(/* value */);  // Set delta_value
model.setEndTimestamp(/* value */);  // Set end_timestamp
model.setName(/* value */);  // Set name
model.setScheduleAction(/* value */);  // Set schedule_action
model.setScheduleStatus(/* value */);  // Set schedule_status
model.setScheduleType(/* value */);  // Set schedule_type
model.setStartTimestamp(/* value */);  // Set start_timestamp

// Serialize to JSON
nlohmann::json json = models::ScheduleCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleCreateRequestAllOf1

```cpp
// Create a model
auto model = models::ScheduleCreateRequestAllOf1();
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type

// Serialize to JSON
nlohmann::json json = models::ScheduleCreateRequestAllOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleCreateRequestAllOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleDeltaValue

```cpp
// Create a model
auto model = models::ScheduleDeltaValue();
model.setAgeBucketMultipliers(/* value */);  // Set age_bucket_multipliers
model.setAppTypeMultipliers(/* value */);  // Set app_type_multipliers
model.setAudienceMultipliers(/* value */);  // Set audience_multipliers
model.setGenderMultipliers(/* value */);  // Set gender_multipliers
model.setPlacementMultipliers(/* value */);  // Set placement_multipliers

// Serialize to JSON
nlohmann::json json = models::ScheduleDeltaValue::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleDeltaValue::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleGenderMultipliers

```cpp
// Create a model
auto model = models::ScheduleGenderMultipliers();
model.setGENDER(/* value */);  // Set GENDER

// Serialize to JSON
nlohmann::json json = models::ScheduleGenderMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleGenderMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulePlacementMultipliers

```cpp
// Create a model
auto model = models::SchedulePlacementMultipliers();
model.setBrowse(/* value */);  // Set browse
model.setRelatedPins(/* value */);  // Set related_pins
model.setSearch(/* value */);  // Set search

// Serialize to JSON
nlohmann::json json = models::SchedulePlacementMultipliers::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulePlacementMultipliers::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleStatus

```cpp
// Create a model
auto model = models::ScheduleStatus();

// Serialize to JSON
nlohmann::json json = models::ScheduleStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleType

```cpp
// Create a model
auto model = models::ScheduleType();

// Serialize to JSON
nlohmann::json json = models::ScheduleType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleUpdateRequest

```cpp
// Create a model
auto model = models::ScheduleUpdateRequest();
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setId(/* value */);  // Set id
model.setDeltaValue(/* value */);  // Set delta_value
model.setEndTimestamp(/* value */);  // Set end_timestamp
model.setName(/* value */);  // Set name
model.setScheduleAction(/* value */);  // Set schedule_action
model.setScheduleStatus(/* value */);  // Set schedule_status
model.setScheduleType(/* value */);  // Set schedule_type
model.setStartTimestamp(/* value */);  // Set start_timestamp

// Serialize to JSON
nlohmann::json json = models::ScheduleUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScheduleUpdateRequestAllOf1

```cpp
// Create a model
auto model = models::ScheduleUpdateRequestAllOf1();
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::ScheduleUpdateRequestAllOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScheduleUpdateRequestAllOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulesCreate200ResponseInner

```cpp
// Create a model
auto model = models::SchedulesCreate200ResponseInner();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::SchedulesCreate200ResponseInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulesCreate200ResponseInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulesCreate200ResponseInnerData

```cpp
// Create a model
auto model = models::SchedulesCreate200ResponseInnerData();
model.setDeltaValue(/* value */);  // Set delta_value
model.setEndTimestamp(/* value */);  // Set end_timestamp
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setName(/* value */);  // Set name
model.setScheduleAction(/* value */);  // Set schedule_action
model.setScheduleId(/* value */);  // Set schedule_id
model.setScheduleStatus(/* value */);  // Set schedule_status
model.setScheduleType(/* value */);  // Set schedule_type
model.setStartTimestamp(/* value */);  // Set start_timestamp
model.setId(/* value */);  // Set id
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::SchedulesCreate200ResponseInnerData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulesCreate200ResponseInnerData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulesCreate200ResponseInnerDataOneOf

```cpp
// Create a model
auto model = models::SchedulesCreate200ResponseInnerDataOneOf();
model.setId(/* value */);  // Set id
model.setScheduleId(/* value */);  // Set schedule_id
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::SchedulesCreate200ResponseInnerDataOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulesCreate200ResponseInnerDataOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulesList200Response

```cpp
// Create a model
auto model = models::SchedulesList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::SchedulesList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulesList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulesUpdate200ResponseInner

```cpp
// Create a model
auto model = models::SchedulesUpdate200ResponseInner();
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::SchedulesUpdate200ResponseInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulesUpdate200ResponseInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulesUpdate200ResponseInnerData

```cpp
// Create a model
auto model = models::SchedulesUpdate200ResponseInnerData();
model.setDeltaValue(/* value */);  // Set delta_value
model.setEndTimestamp(/* value */);  // Set end_timestamp
model.setEntityId(/* value */);  // Set entity_id
model.setEntityType(/* value */);  // Set entity_type
model.setName(/* value */);  // Set name
model.setScheduleAction(/* value */);  // Set schedule_action
model.setScheduleId(/* value */);  // Set schedule_id
model.setScheduleStatus(/* value */);  // Set schedule_status
model.setScheduleType(/* value */);  // Set schedule_type
model.setStartTimestamp(/* value */);  // Set start_timestamp
model.setId(/* value */);  // Set id
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::SchedulesUpdate200ResponseInnerData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulesUpdate200ResponseInnerData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SchedulesUpdate200ResponseInnerDataOneOf

```cpp
// Create a model
auto model = models::SchedulesUpdate200ResponseInnerDataOneOf();
model.setId(/* value */);  // Set id
model.setScheduleId(/* value */);  // Set schedule_id
model.setExceptions(/* value */);  // Set exceptions

// Serialize to JSON
nlohmann::json json = models::SchedulesUpdate200ResponseInnerDataOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SchedulesUpdate200ResponseInnerDataOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ScrollupGoalMetadata

```cpp
// Create a model
auto model = models::ScrollupGoalMetadata();
model.setScrollupGoalValueInMicroCurrency(/* value */);  // Set scrollup_goal_value_in_micro_currency

// Serialize to JSON
nlohmann::json json = models::ScrollupGoalMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ScrollupGoalMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SearchPartnerPins200Response

```cpp
// Create a model
auto model = models::SearchPartnerPins200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::SearchPartnerPins200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SearchPartnerPins200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SearchUserBoardsGet200Response

```cpp
// Create a model
auto model = models::SearchUserBoardsGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::SearchUserBoardsGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SearchUserBoardsGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SearchUserPinsList200Response

```cpp
// Create a model
auto model = models::SearchUserPinsList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::SearchUserPinsList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SearchUserPinsList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SharedAudienceAccount

```cpp
// Create a model
auto model = models::SharedAudienceAccount();
model.setAccountId(/* value */);  // Set account_id
model.setAccountName(/* value */);  // Set account_name
model.setAccountType(/* value */);  // Set account_type
model.setSharedOnTimestamp(/* value */);  // Set shared_on_timestamp

// Serialize to JSON
nlohmann::json json = models::SharedAudienceAccount::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SharedAudienceAccount::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SharedAudiencesForBusinessList200Response

```cpp
// Create a model
auto model = models::SharedAudiencesForBusinessList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::SharedAudiencesForBusinessList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SharedAudiencesForBusinessList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SingleInterestTargetingOptionData

```cpp
// Create a model
auto model = models::SingleInterestTargetingOptionData();
model.setChildInterests(/* value */);  // Set child_interests
model.setId(/* value */);  // Set id
model.setLevel(/* value */);  // Set level
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::SingleInterestTargetingOptionData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SingleInterestTargetingOptionData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SourcePlatformOptions

```cpp
// Create a model
auto model = models::SourcePlatformOptions();

// Serialize to JSON
nlohmann::json json = models::SourcePlatformOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SourcePlatformOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SsioInsertionOrdersStatusGetByAdAccount200Response

```cpp
// Create a model
auto model = models::SsioInsertionOrdersStatusGetByAdAccount200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::SsioInsertionOrdersStatusGetByAdAccount200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SsioInsertionOrdersStatusGetByAdAccount200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SsioOrderLinesGetByAdAccount200Response

```cpp
// Create a model
auto model = models::SsioOrderLinesGetByAdAccount200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::SsioOrderLinesGetByAdAccount200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SsioOrderLinesGetByAdAccount200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StandardPinMetricTypes

```cpp
// Create a model
auto model = models::StandardPinMetricTypes();

// Serialize to JSON
nlohmann::json json = models::StandardPinMetricTypes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StandardPinMetricTypes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StoreMetadata

```cpp
// Create a model
auto model = models::StoreMetadata();
model.setGeohash(/* value */);  // Set geohash
model.setLatitude(/* value */);  // Set latitude
model.setLongitude(/* value */);  // Set longitude
model.setStoreCode(/* value */);  // Set store_code
model.setStoreId(/* value */);  // Set store_id
model.setStoreName(/* value */);  // Set store_name

// Serialize to JSON
nlohmann::json json = models::StoreMetadata::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StoreMetadata::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SummaryPin

```cpp
// Create a model
auto model = models::SummaryPin();
model.setAltText(/* value */);  // Set alt_text
model.setDescription(/* value */);  // Set description
model.setId(/* value */);  // Set id
model.setLink(/* value */);  // Set link
model.setMedia(/* value */);  // Set media
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::SummaryPin::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SummaryPin::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SummaryStatus

```cpp
// Create a model
auto model = models::SummaryStatus();

// Serialize to JSON
nlohmann::json json = models::SummaryStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SummaryStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SupplementalItemBatchOperationStatus

```cpp
// Create a model
auto model = models::SupplementalItemBatchOperationStatus();

// Serialize to JSON
nlohmann::json json = models::SupplementalItemBatchOperationStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SupplementalItemBatchOperationStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SupplementalItemProcessingStatus

```cpp
// Create a model
auto model = models::SupplementalItemProcessingStatus();

// Serialize to JSON
nlohmann::json json = models::SupplementalItemProcessingStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SupplementalItemProcessingStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SupplementalItemValidationEvent

```cpp
// Create a model
auto model = models::SupplementalItemValidationEvent();
model.setAttribute(/* value */);  // Set attribute
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::SupplementalItemValidationEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SupplementalItemValidationEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SupplementalItemsBatchResponse

```cpp
// Create a model
auto model = models::SupplementalItemsBatchResponse();
model.setBatchId(/* value */);  // Set batch_id
model.setCompletedTime(/* value */);  // Set completed_time
model.setCreatedTime(/* value */);  // Set created_time
model.setOperationResults(/* value */);  // Set operation_results
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::SupplementalItemsBatchResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SupplementalItemsBatchResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SupplementalOperationResult

```cpp
// Create a model
auto model = models::SupplementalOperationResult();
model.setErrors(/* value */);  // Set errors
model.setItemId(/* value */);  // Set item_id
model.setStatus(/* value */);  // Set status
model.setStoreCode(/* value */);  // Set store_code
model.setSupplementalType(/* value */);  // Set supplemental_type
model.setWarnings(/* value */);  // Set warnings

// Serialize to JSON
nlohmann::json json = models::SupplementalOperationResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SupplementalOperationResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SystemUserUpdateWithRequiredBody

```cpp
// Create a model
auto model = models::SystemUserUpdateWithRequiredBody();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::SystemUserUpdateWithRequiredBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SystemUserUpdateWithRequiredBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingAdvertiserCountry

```cpp
// Create a model
auto model = models::TargetingAdvertiserCountry();

// Serialize to JSON
nlohmann::json json = models::TargetingAdvertiserCountry::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingAdvertiserCountry::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpec

```cpp
// Create a model
auto model = models::TargetingSpec();
model.setAGEBUCKET(/* value */);  // Set AGE_BUCKET
model.setAPPTYPE(/* value */);  // Set APPTYPE
model.setAUDIENCEEXCLUDE(/* value */);  // Set AUDIENCE_EXCLUDE
model.setAUDIENCEINCLUDE(/* value */);  // Set AUDIENCE_INCLUDE
model.setGENDER(/* value */);  // Set GENDER
model.setGEO(/* value */);  // Set GEO
model.setGEOEXCLUDE(/* value */);  // Set GEO_EXCLUDE
model.setINTEREST(/* value */);  // Set INTEREST
model.setLOCALE(/* value */);  // Set LOCALE
model.setLOCATION(/* value */);  // Set LOCATION
model.setLOCATIONEXCLUDE(/* value */);  // Set LOCATION_EXCLUDE
model.setMAXIMUMAGE(/* value */);  // Set MAXIMUM_AGE
model.setMINIMUMAGE(/* value */);  // Set MINIMUM_AGE
model.setSHOPPINGRETARGETING(/* value */);  // Set SHOPPING_RETARGETING
model.setTARGETINGSTRATEGY(/* value */);  // Set TARGETING_STRATEGY

// Serialize to JSON
nlohmann::json json = models::TargetingSpec::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpec::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecAgeBucket

```cpp
// Create a model
auto model = models::TargetingSpecAgeBucket();

// Serialize to JSON
nlohmann::json json = models::TargetingSpecAgeBucket::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecAgeBucket::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecAppType

```cpp
// Create a model
auto model = models::TargetingSpecAppType();

// Serialize to JSON
nlohmann::json json = models::TargetingSpecAppType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecAppType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecGender

```cpp
// Create a model
auto model = models::TargetingSpecGender();

// Serialize to JSON
nlohmann::json json = models::TargetingSpecGender::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecGender::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecListOperation

```cpp
// Create a model
auto model = models::TargetingSpecListOperation();

// Serialize to JSON
nlohmann::json json = models::TargetingSpecListOperation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecListOperation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationAgeBucket

```cpp
// Create a model
auto model = models::TargetingSpecOperationAgeBucket();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationAgeBucket::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationAgeBucket::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationAppType

```cpp
// Create a model
auto model = models::TargetingSpecOperationAppType();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationAppType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationAppType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationAudienceExclude

```cpp
// Create a model
auto model = models::TargetingSpecOperationAudienceExclude();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationAudienceExclude::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationAudienceExclude::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationAudienceInclude

```cpp
// Create a model
auto model = models::TargetingSpecOperationAudienceInclude();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationAudienceInclude::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationAudienceInclude::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationGender

```cpp
// Create a model
auto model = models::TargetingSpecOperationGender();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationGender::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationGender::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationGeo

```cpp
// Create a model
auto model = models::TargetingSpecOperationGeo();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationGeo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationGeo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationGeoExclude

```cpp
// Create a model
auto model = models::TargetingSpecOperationGeoExclude();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationGeoExclude::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationGeoExclude::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationInterest

```cpp
// Create a model
auto model = models::TargetingSpecOperationInterest();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationInterest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationInterest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationLocale

```cpp
// Create a model
auto model = models::TargetingSpecOperationLocale();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationLocale::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationLocale::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationLocation

```cpp
// Create a model
auto model = models::TargetingSpecOperationLocation();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationLocation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationLocation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationLocationExclude

```cpp
// Create a model
auto model = models::TargetingSpecOperationLocationExclude();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationLocationExclude::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationLocationExclude::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationMaximumAge

```cpp
// Create a model
auto model = models::TargetingSpecOperationMaximumAge();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationMaximumAge::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationMaximumAge::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationMinimumAge

```cpp
// Create a model
auto model = models::TargetingSpecOperationMinimumAge();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationMinimumAge::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationMinimumAge::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperationShoppingRetargeting

```cpp
// Create a model
auto model = models::TargetingSpecOperationShoppingRetargeting();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperationShoppingRetargeting::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperationShoppingRetargeting::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOperations

```cpp
// Create a model
auto model = models::TargetingSpecOperations();
model.setField(/* value */);  // Set field
model.setOperation(/* value */);  // Set operation
model.setValues(/* value */);  // Set values
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOperations::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOperations::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecOptimal

```cpp
// Create a model
auto model = models::TargetingSpecOptimal();
model.setAGEBUCKET(/* value */);  // Set AGE_BUCKET
model.setAPPTYPE(/* value */);  // Set APPTYPE
model.setAUDIENCEEXCLUDE(/* value */);  // Set AUDIENCE_EXCLUDE
model.setAUDIENCEINCLUDE(/* value */);  // Set AUDIENCE_INCLUDE
model.setGENDER(/* value */);  // Set GENDER
model.setGEO(/* value */);  // Set GEO
model.setGEOEXCLUDE(/* value */);  // Set GEO_EXCLUDE
model.setINTEREST(/* value */);  // Set INTEREST
model.setLOCALE(/* value */);  // Set LOCALE
model.setLOCATION(/* value */);  // Set LOCATION
model.setLOCATIONEXCLUDE(/* value */);  // Set LOCATION_EXCLUDE
model.setMAXIMUMAGE(/* value */);  // Set MAXIMUM_AGE
model.setMINIMUMAGE(/* value */);  // Set MINIMUM_AGE
model.setSHOPPINGRETARGETING(/* value */);  // Set SHOPPING_RETARGETING
model.setTARGETINGSTRATEGY(/* value */);  // Set TARGETING_STRATEGY

// Serialize to JSON
nlohmann::json json = models::TargetingSpecOptimal::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecOptimal::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecShoppingRetargeting

```cpp
// Create a model
auto model = models::TargetingSpecShoppingRetargeting();
model.setExclusionWindow(/* value */);  // Set exclusion_window
model.setLookbackWindow(/* value */);  // Set lookback_window
model.setTagTypes(/* value */);  // Set tag_types

// Serialize to JSON
nlohmann::json json = models::TargetingSpecShoppingRetargeting::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecShoppingRetargeting::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingSpecTargetingStrategyItems

```cpp
// Create a model
auto model = models::TargetingSpecTargetingStrategyItems();

// Serialize to JSON
nlohmann::json json = models::TargetingSpecTargetingStrategyItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingSpecTargetingStrategyItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingStrategy

```cpp
// Create a model
auto model = models::TargetingStrategy();

// Serialize to JSON
nlohmann::json json = models::TargetingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplate

```cpp
// Create a model
auto model = models::TargetingTemplate();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setCreatedTime(/* value */);  // Set created_time
model.setId(/* value */);  // Set id
model.setKeywords(/* value */);  // Set keywords
model.setName(/* value */);  // Set name
model.setPlacementGroup(/* value */);  // Set placement_group
model.setSizing(/* value */);  // Set sizing
model.setStatus(/* value */);  // Set status
model.setTargetingAttributes(/* value */);  // Set targeting_attributes
model.setTrackingUrls(/* value */);  // Set tracking_urls
model.setUpdatedTime(/* value */);  // Set updated_time
model.setValid(/* value */);  // Set valid

// Serialize to JSON
nlohmann::json json = models::TargetingTemplate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplateAudienceSizing

```cpp
// Create a model
auto model = models::TargetingTemplateAudienceSizing();
model.setReachEstimate(/* value */);  // Set reach_estimate

// Serialize to JSON
nlohmann::json json = models::TargetingTemplateAudienceSizing::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplateAudienceSizing::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplateAudienceSizingReachEstimate

```cpp
// Create a model
auto model = models::TargetingTemplateAudienceSizingReachEstimate();
model.setEstimate(/* value */);  // Set estimate
model.setLowerBound(/* value */);  // Set lower_bound
model.setUpperBound(/* value */);  // Set upper_bound

// Serialize to JSON
nlohmann::json json = models::TargetingTemplateAudienceSizingReachEstimate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplateAudienceSizingReachEstimate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplateCreate

```cpp
// Create a model
auto model = models::TargetingTemplateCreate();
model.setAutoTargetingEnabled(/* value */);  // Set auto_targeting_enabled
model.setKeywords(/* value */);  // Set keywords
model.setName(/* value */);  // Set name
model.setPlacementGroup(/* value */);  // Set placement_group
model.setTargetingAttributes(/* value */);  // Set targeting_attributes
model.setTrackingUrls(/* value */);  // Set tracking_urls

// Serialize to JSON
nlohmann::json json = models::TargetingTemplateCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplateCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplateKeyword

```cpp
// Create a model
auto model = models::TargetingTemplateKeyword();
model.setMatchType(/* value */);  // Set match_type
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::TargetingTemplateKeyword::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplateKeyword::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplateList200Response

```cpp
// Create a model
auto model = models::TargetingTemplateList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::TargetingTemplateList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplateList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplateStatus

```cpp
// Create a model
auto model = models::TargetingTemplateStatus();

// Serialize to JSON
nlohmann::json json = models::TargetingTemplateStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplateStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TargetingTemplateUpdateRequestReadOrUpdate

```cpp
// Create a model
auto model = models::TargetingTemplateUpdateRequestReadOrUpdate();
model.setId(/* value */);  // Set id
model.setOperationType(/* value */);  // Set operation_type
model.setTargetingAttributes(/* value */);  // Set targeting_attributes

// Serialize to JSON
nlohmann::json json = models::TargetingTemplateUpdateRequestReadOrUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TargetingTemplateUpdateRequestReadOrUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TemplateBasedReport

```cpp
// Create a model
auto model = models::TemplateBasedReport();
model.setMessage(/* value */);  // Set message
model.setReportStatus(/* value */);  // Set report_status
model.setTemplateId(/* value */);  // Set template_id
model.setToken(/* value */);  // Set token

// Serialize to JSON
nlohmann::json json = models::TemplateBasedReport::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TemplateBasedReport::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TemplateBasedReportCreate

```cpp
// Create a model
auto model = models::TemplateBasedReportCreate();
model.setMessage(/* value */);  // Set message
model.setReportStatus(/* value */);  // Set report_status
model.setToken(/* value */);  // Set token

// Serialize to JSON
nlohmann::json json = models::TemplateBasedReportCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TemplateBasedReportCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TemplatesList200Response

```cpp
// Create a model
auto model = models::TemplatesList200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::TemplatesList200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TemplatesList200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TermsOfService

```cpp
// Create a model
auto model = models::TermsOfService();
model.setAdAccountId(/* value */);  // Set ad_account_id
model.setHasAccepted(/* value */);  // Set has_accepted
model.setHtml(/* value */);  // Set html
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::TermsOfService::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TermsOfService::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TieBreakerType

```cpp
// Create a model
auto model = models::TieBreakerType();

// Serialize to JSON
nlohmann::json json = models::TieBreakerType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TieBreakerType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TimeSeries

```cpp
// Create a model
auto model = models::TimeSeries();
model.setDate(/* value */);  // Set date

// Serialize to JSON
nlohmann::json json = models::TimeSeries::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TimeSeries::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TitleKeywords

```cpp
// Create a model
auto model = models::TitleKeywords();
model.setTITLEKEYWORDS(/* value */);  // Set TITLE_KEYWORDS

// Serialize to JSON
nlohmann::json json = models::TitleKeywords::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TitleKeywords::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TokenGrantType

```cpp
// Create a model
auto model = models::TokenGrantType();

// Serialize to JSON
nlohmann::json json = models::TokenGrantType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TokenGrantType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TokenTypeHint

```cpp
// Create a model
auto model = models::TokenTypeHint();

// Serialize to JSON
nlohmann::json json = models::TokenTypeHint::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TokenTypeHint::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopPinsAnalyticsResponse

```cpp
// Create a model
auto model = models::TopPinsAnalyticsResponse();
model.setDateAvailability(/* value */);  // Set date_availability
model.setPins(/* value */);  // Set pins
model.setSortBy(/* value */);  // Set sort_by

// Serialize to JSON
nlohmann::json json = models::TopPinsAnalyticsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopPinsAnalyticsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopPinsAnalyticsResponseDateAvailability

```cpp
// Create a model
auto model = models::TopPinsAnalyticsResponseDateAvailability();
model.setIsRealtime(/* value */);  // Set is_realtime
model.setLatestAvailableTimestamp(/* value */);  // Set latest_available_timestamp

// Serialize to JSON
nlohmann::json json = models::TopPinsAnalyticsResponseDateAvailability::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopPinsAnalyticsResponseDateAvailability::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopPinsAnalyticsResponsePinsItems

```cpp
// Create a model
auto model = models::TopPinsAnalyticsResponsePinsItems();
model.setDataStatus(/* value */);  // Set data_status
model.setMetrics(/* value */);  // Set metrics
model.setPinId(/* value */);  // Set pin_id

// Serialize to JSON
nlohmann::json json = models::TopPinsAnalyticsResponsePinsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopPinsAnalyticsResponsePinsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopPinsSortBy

```cpp
// Create a model
auto model = models::TopPinsSortBy();

// Serialize to JSON
nlohmann::json json = models::TopPinsSortBy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopPinsSortBy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopVideoPinsAnalyticsResponse

```cpp
// Create a model
auto model = models::TopVideoPinsAnalyticsResponse();
model.setDateAvailability(/* value */);  // Set date_availability
model.setPins(/* value */);  // Set pins
model.setSortBy(/* value */);  // Set sort_by

// Serialize to JSON
nlohmann::json json = models::TopVideoPinsAnalyticsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopVideoPinsAnalyticsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopVideoPinsAnalyticsResponseDateAvailability

```cpp
// Create a model
auto model = models::TopVideoPinsAnalyticsResponseDateAvailability();
model.setIsRealtime(/* value */);  // Set is_realtime
model.setLatestAvailableTimestamp(/* value */);  // Set latest_available_timestamp

// Serialize to JSON
nlohmann::json json = models::TopVideoPinsAnalyticsResponseDateAvailability::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopVideoPinsAnalyticsResponseDateAvailability::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopVideoPinsAnalyticsResponsePinsItems

```cpp
// Create a model
auto model = models::TopVideoPinsAnalyticsResponsePinsItems();
model.setDataStatus(/* value */);  // Set data_status
model.setMetrics(/* value */);  // Set metrics
model.setPinId(/* value */);  // Set pin_id

// Serialize to JSON
nlohmann::json json = models::TopVideoPinsAnalyticsResponsePinsItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopVideoPinsAnalyticsResponsePinsItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TopVideoPinsSortBy

```cpp
// Create a model
auto model = models::TopVideoPinsSortBy();

// Serialize to JSON
nlohmann::json json = models::TopVideoPinsSortBy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TopVideoPinsSortBy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TotalCountByEntityStatus

```cpp
// Create a model
auto model = models::TotalCountByEntityStatus();
model.setACTIVE(/* value */);  // Set ACTIVE
model.setARCHIVED(/* value */);  // Set ARCHIVED
model.setPAUSED(/* value */);  // Set PAUSED

// Serialize to JSON
nlohmann::json json = models::TotalCountByEntityStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TotalCountByEntityStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrackingUrls

```cpp
// Create a model
auto model = models::TrackingUrls();
model.setAudienceVerification(/* value */);  // Set audience_verification
model.setBuyableButton(/* value */);  // Set buyable_button
model.setClick(/* value */);  // Set click
model.setEngagement(/* value */);  // Set engagement
model.setImpression(/* value */);  // Set impression

// Serialize to JSON
nlohmann::json json = models::TrackingUrls::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrackingUrls::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendType

```cpp
// Create a model
auto model = models::TrendType();

// Serialize to JSON
nlohmann::json json = models::TrendType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendingKeyword

```cpp
// Create a model
auto model = models::TrendingKeyword();
model.setDemographics(/* value */);  // Set demographics
model.setHasPrediction(/* value */);  // Set has_prediction
model.setKeyword(/* value */);  // Set keyword
model.setPctGrowthMom(/* value */);  // Set pct_growth_mom
model.setPctGrowthWow(/* value */);  // Set pct_growth_wow
model.setPctGrowthYoy(/* value */);  // Set pct_growth_yoy
model.setPredictedTimeSeries(/* value */);  // Set predicted_time_series
model.setTimeSeries(/* value */);  // Set time_series

// Serialize to JSON
nlohmann::json json = models::TrendingKeyword::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendingKeyword::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendingKeywordDemographics

```cpp
// Create a model
auto model = models::TrendingKeywordDemographics();
model.setAgeDistribution(/* value */);  // Set age_distribution
model.setGenderDistribution(/* value */);  // Set gender_distribution

// Serialize to JSON
nlohmann::json json = models::TrendingKeywordDemographics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendingKeywordDemographics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendingKeywordsResponse

```cpp
// Create a model
auto model = models::TrendingKeywordsResponse();
model.setTrends(/* value */);  // Set trends

// Serialize to JSON
nlohmann::json json = models::TrendingKeywordsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendingKeywordsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendingPin

```cpp
// Create a model
auto model = models::TrendingPin();
model.setColor(/* value */);  // Set color
model.setHeight(/* value */);  // Set height
model.setId(/* value */);  // Set id
model.setSrc(/* value */);  // Set src
model.setVerticalOffset(/* value */);  // Set vertical_offset
model.setWidth(/* value */);  // Set width

// Serialize to JSON
nlohmann::json json = models::TrendingPin::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendingPin::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendingProductCategory

```cpp
// Create a model
auto model = models::TrendingProductCategory();
model.setEngagementType(/* value */);  // Set engagement_type
model.setPctChangeMom(/* value */);  // Set pct_change_mom
model.setPercentRelativeVolume(/* value */);  // Set percent_relative_volume
model.setPinterestProductCategoryId(/* value */);  // Set pinterest_product_category_id
model.setProductCategory(/* value */);  // Set product_category
model.setVerticals(/* value */);  // Set verticals

// Serialize to JSON
nlohmann::json json = models::TrendingProductCategory::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendingProductCategory::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendingTopic

```cpp
// Create a model
auto model = models::TrendingTopic();
model.setDescription(/* value */);  // Set description
model.setId(/* value */);  // Set id
model.setPercentGrowthMom(/* value */);  // Set percent_growth_mom
model.setPins(/* value */);  // Set pins
model.setRelatedInterests(/* value */);  // Set related_interests
model.setRelatedSearches(/* value */);  // Set related_searches
model.setTimeSeries(/* value */);  // Set time_series
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::TrendingTopic::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendingTopic::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AgeRange

```cpp
// Create a model
auto model = models::AgeRange();

// Serialize to JSON
nlohmann::json json = models::AgeRange::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AgeRange::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendsAgeDistribution

```cpp
// Create a model
auto model = models::TrendsAgeDistribution();
model.setAgeDistribution(/* value */);  // Set age_distribution

// Serialize to JSON
nlohmann::json json = models::TrendsAgeDistribution::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendsAgeDistribution::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendsEditorial

```cpp
// Create a model
auto model = models::TrendsEditorial();
model.setBoardUrl(/* value */);  // Set board_url
model.setDescription(/* value */);  // Set description
model.setInterests(/* value */);  // Set interests
model.setPinsUrl(/* value */);  // Set pins_url
model.setRelatedKeywords(/* value */);  // Set related_keywords
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::TrendsEditorial::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendsEditorial::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Gender

```cpp
// Create a model
auto model = models::Gender();

// Serialize to JSON
nlohmann::json json = models::Gender::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Gender::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendsGenderDistribution

```cpp
// Create a model
auto model = models::TrendsGenderDistribution();
model.setGenderDistribution(/* value */);  // Set gender_distribution

// Serialize to JSON
nlohmann::json json = models::TrendsGenderDistribution::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendsGenderDistribution::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TrendsGenderFilter

```cpp
// Create a model
auto model = models::TrendsGenderFilter();

// Serialize to JSON
nlohmann::json json = models::TrendsGenderFilter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TrendsGenderFilter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Interest

```cpp
// Create a model
auto model = models::Interest();

// Serialize to JSON
nlohmann::json json = models::Interest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Interest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Region

```cpp
// Create a model
auto model = models::Region();

// Serialize to JSON
nlohmann::json json = models::Region::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Region::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdatableItemAttributes

```cpp
// Create a model
auto model = models::UpdatableItemAttributes();
model.setAdImage0Link(/* value */);  // Set ad_image_0_link
model.setAdImage0Tag(/* value */);  // Set ad_image_0_tag
model.setAdImage10Link(/* value */);  // Set ad_image_10_link
model.setAdImage10Tag(/* value */);  // Set ad_image_10_tag
model.setAdImage11Link(/* value */);  // Set ad_image_11_link
model.setAdImage11Tag(/* value */);  // Set ad_image_11_tag
model.setAdImage12Link(/* value */);  // Set ad_image_12_link
model.setAdImage12Tag(/* value */);  // Set ad_image_12_tag
model.setAdImage13Link(/* value */);  // Set ad_image_13_link
model.setAdImage13Tag(/* value */);  // Set ad_image_13_tag
model.setAdImage14Link(/* value */);  // Set ad_image_14_link
model.setAdImage14Tag(/* value */);  // Set ad_image_14_tag
model.setAdImage15Link(/* value */);  // Set ad_image_15_link
model.setAdImage15Tag(/* value */);  // Set ad_image_15_tag
model.setAdImage16Link(/* value */);  // Set ad_image_16_link
model.setAdImage16Tag(/* value */);  // Set ad_image_16_tag
model.setAdImage17Link(/* value */);  // Set ad_image_17_link
model.setAdImage17Tag(/* value */);  // Set ad_image_17_tag
model.setAdImage18Link(/* value */);  // Set ad_image_18_link
model.setAdImage18Tag(/* value */);  // Set ad_image_18_tag
model.setAdImage19Link(/* value */);  // Set ad_image_19_link
model.setAdImage19Tag(/* value */);  // Set ad_image_19_tag
model.setAdImage1Link(/* value */);  // Set ad_image_1_link
model.setAdImage1Tag(/* value */);  // Set ad_image_1_tag
model.setAdImage2Link(/* value */);  // Set ad_image_2_link
model.setAdImage2Tag(/* value */);  // Set ad_image_2_tag
model.setAdImage3Link(/* value */);  // Set ad_image_3_link
model.setAdImage3Tag(/* value */);  // Set ad_image_3_tag
model.setAdImage4Link(/* value */);  // Set ad_image_4_link
model.setAdImage4Tag(/* value */);  // Set ad_image_4_tag
model.setAdImage5Link(/* value */);  // Set ad_image_5_link
model.setAdImage5Tag(/* value */);  // Set ad_image_5_tag
model.setAdImage6Link(/* value */);  // Set ad_image_6_link
model.setAdImage6Tag(/* value */);  // Set ad_image_6_tag
model.setAdImage7Link(/* value */);  // Set ad_image_7_link
model.setAdImage7Tag(/* value */);  // Set ad_image_7_tag
model.setAdImage8Link(/* value */);  // Set ad_image_8_link
model.setAdImage8Tag(/* value */);  // Set ad_image_8_tag
model.setAdImage9Link(/* value */);  // Set ad_image_9_link
model.setAdImage9Tag(/* value */);  // Set ad_image_9_tag
model.setAdLink(/* value */);  // Set ad_link
model.setAdVideo0Link(/* value */);  // Set ad_video_0_link
model.setAdVideo0Tag(/* value */);  // Set ad_video_0_tag
model.setAdVideo1Link(/* value */);  // Set ad_video_1_link
model.setAdVideo1Tag(/* value */);  // Set ad_video_1_tag
model.setAdVideo2Link(/* value */);  // Set ad_video_2_link
model.setAdVideo2Tag(/* value */);  // Set ad_video_2_tag
model.setAdult(/* value */);  // Set adult
model.setAgeGroup(/* value */);  // Set age_group
model.setAndroidDeepLink(/* value */);  // Set android_deep_link
model.setAvailability(/* value */);  // Set availability
model.setAverageReviewRating(/* value */);  // Set average_review_rating
model.setBrand(/* value */);  // Set brand
model.setCheckoutEnabled(/* value */);  // Set checkout_enabled
model.setColor(/* value */);  // Set color
model.setCondition(/* value */);  // Set condition
model.setCustomLabel0(/* value */);  // Set custom_label_0
model.setCustomLabel1(/* value */);  // Set custom_label_1
model.setCustomLabel2(/* value */);  // Set custom_label_2
model.setCustomLabel3(/* value */);  // Set custom_label_3
model.setCustomLabel4(/* value */);  // Set custom_label_4
model.setCustomNumber0(/* value */);  // Set custom_number_0
model.setCustomNumber1(/* value */);  // Set custom_number_1
model.setCustomNumber2(/* value */);  // Set custom_number_2
model.setCustomNumber3(/* value */);  // Set custom_number_3
model.setCustomNumber4(/* value */);  // Set custom_number_4
model.setDescription(/* value */);  // Set description
model.setFreeShippingLabel(/* value */);  // Set free_shipping_label
model.setFreeShippingLimit(/* value */);  // Set free_shipping_limit
model.setGender(/* value */);  // Set gender
model.setGoogleProductCategory(/* value */);  // Set google_product_category
model.setGtin(/* value */);  // Set gtin
model.setId(/* value */);  // Set id
model.setInstallmentPrice(/* value */);  // Set installment_price
model.setIosDeepLink(/* value */);  // Set ios_deep_link
model.setItemGroupId(/* value */);  // Set item_group_id
model.setLastUpdatedTime(/* value */);  // Set last_updated_time
model.setLink(/* value */);  // Set link
model.setMaterial(/* value */);  // Set material
model.setMinAdPrice(/* value */);  // Set min_ad_price
model.setMobileLink(/* value */);  // Set mobile_link
model.setMpn(/* value */);  // Set mpn
model.setNumberOfRatings(/* value */);  // Set number_of_ratings
model.setNumberOfReviews(/* value */);  // Set number_of_reviews
model.setPattern(/* value */);  // Set pattern
model.setPrice(/* value */);  // Set price
model.setProductType(/* value */);  // Set product_type
model.setPromotionId(/* value */);  // Set promotion_id
model.setSalePrice(/* value */);  // Set sale_price
model.setSalePriceEffectiveDate(/* value */);  // Set sale_price_effective_date
model.setShipping(/* value */);  // Set shipping
model.setShippingHeight(/* value */);  // Set shipping_height
model.setShippingWeight(/* value */);  // Set shipping_weight
model.setShippingWidth(/* value */);  // Set shipping_width
model.setSize(/* value */);  // Set size
model.setSizeSystem(/* value */);  // Set size_system
model.setSizeType(/* value */);  // Set size_type
model.setTax(/* value */);  // Set tax
model.setTitle(/* value */);  // Set title
model.setUnitPricingBaseMeasure(/* value */);  // Set unit_pricing_base_measure
model.setUnitPricingMeasure(/* value */);  // Set unit_pricing_measure
model.setVariantNames(/* value */);  // Set variant_names
model.setVariantValues(/* value */);  // Set variant_values

// Serialize to JSON
nlohmann::json json = models::UpdatableItemAttributes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdatableItemAttributes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdatableItemAttributesGtin

```cpp
// Create a model
auto model = models::UpdatableItemAttributesGtin();

// Serialize to JSON
nlohmann::json json = models::UpdatableItemAttributesGtin::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdatableItemAttributesGtin::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateBusinessMembershipsResponse

```cpp
// Create a model
auto model = models::UpdateBusinessMembershipsResponse();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::UpdateBusinessMembershipsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateBusinessMembershipsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateInvitesResultsResponseArray

```cpp
// Create a model
auto model = models::UpdateInvitesResultsResponseArray();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::UpdateInvitesResultsResponseArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateInvitesResultsResponseArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateMaskBidOptionField

```cpp
// Create a model
auto model = models::UpdateMaskBidOptionField();

// Serialize to JSON
nlohmann::json json = models::UpdateMaskBidOptionField::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateMaskBidOptionField::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateMaskFieldType

```cpp
// Create a model
auto model = models::UpdateMaskFieldType();

// Serialize to JSON
nlohmann::json json = models::UpdateMaskFieldType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateMaskFieldType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateMemberAssetAccessBody

```cpp
// Create a model
auto model = models::UpdateMemberAssetAccessBody();
model.setAccesses(/* value */);  // Set accesses

// Serialize to JSON
nlohmann::json json = models::UpdateMemberAssetAccessBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateMemberAssetAccessBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateMemberAssetAccessItem

```cpp
// Create a model
auto model = models::UpdateMemberAssetAccessItem();
model.setAssetId(/* value */);  // Set asset_id
model.setMemberId(/* value */);  // Set member_id
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::UpdateMemberAssetAccessItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateMemberAssetAccessItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateMemberAssetResultItem

```cpp
// Create a model
auto model = models::UpdateMemberAssetResultItem();
model.setResponse(/* value */);  // Set response

// Serialize to JSON
nlohmann::json json = models::UpdateMemberAssetResultItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateMemberAssetResultItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateMemberAssetsResultsResponseArray

```cpp
// Create a model
auto model = models::UpdateMemberAssetsResultsResponseArray();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::UpdateMemberAssetsResultsResponseArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateMemberAssetsResultsResponseArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdatePartnerAssetAccessBody

```cpp
// Create a model
auto model = models::UpdatePartnerAssetAccessBody();
model.setAccesses(/* value */);  // Set accesses

// Serialize to JSON
nlohmann::json json = models::UpdatePartnerAssetAccessBody::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdatePartnerAssetAccessBody::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdatePartnerAssetAccessItem

```cpp
// Create a model
auto model = models::UpdatePartnerAssetAccessItem();
model.setAssetId(/* value */);  // Set asset_id
model.setPartnerId(/* value */);  // Set partner_id
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::UpdatePartnerAssetAccessItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdatePartnerAssetAccessItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdatePartnerAssetsResult

```cpp
// Create a model
auto model = models::UpdatePartnerAssetsResult();
model.setAssetId(/* value */);  // Set asset_id
model.setAssetType(/* value */);  // Set asset_type
model.setPartnerId(/* value */);  // Set partner_id
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::UpdatePartnerAssetsResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdatePartnerAssetsResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdatePartnerAssetsResultsResponseArray

```cpp
// Create a model
auto model = models::UpdatePartnerAssetsResultsResponseArray();
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::UpdatePartnerAssetsResultsResponseArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdatePartnerAssetsResultsResponseArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserAccountFollowedInterests200Response

```cpp
// Create a model
auto model = models::UserAccountFollowedInterests200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::UserAccountFollowedInterests200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserAccountFollowedInterests200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AccountType

```cpp
// Create a model
auto model = models::AccountType();

// Serialize to JSON
nlohmann::json json = models::AccountType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AccountType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserBusinessRoleBinding

```cpp
// Create a model
auto model = models::UserBusinessRoleBinding();
model.setAssetsSummary(/* value */);  // Set assets_summary
model.setBusinessRoles(/* value */);  // Set business_roles
model.setCreatedByBusiness(/* value */);  // Set created_by_business
model.setCreatedByUser(/* value */);  // Set created_by_user
model.setCreatedTime(/* value */);  // Set created_time
model.setId(/* value */);  // Set id
model.setIsSharedPartner(/* value */);  // Set is_shared_partner
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::UserBusinessRoleBinding::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserBusinessRoleBinding::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserFollowingFeedType

```cpp
// Create a model
auto model = models::UserFollowingFeedType();

// Serialize to JSON
nlohmann::json json = models::UserFollowingFeedType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserFollowingFeedType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserFollowingGet200Response

```cpp
// Create a model
auto model = models::UserFollowingGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::UserFollowingGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserFollowingGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserListOperationType

```cpp
// Create a model
auto model = models::UserListOperationType();

// Serialize to JSON
nlohmann::json json = models::UserListOperationType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserListOperationType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserListType

```cpp
// Create a model
auto model = models::UserListType();

// Serialize to JSON
nlohmann::json json = models::UserListType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserListType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserSingleAssetBinding

```cpp
// Create a model
auto model = models::UserSingleAssetBinding();
model.setPermissions(/* value */);  // Set permissions
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::UserSingleAssetBinding::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserSingleAssetBinding::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserWebsiteSummary

```cpp
// Create a model
auto model = models::UserWebsiteSummary();
model.setStatus(/* value */);  // Set status
model.setVerifiedAt(/* value */);  // Set verified_at
model.setWebsite(/* value */);  // Set website

// Serialize to JSON
nlohmann::json json = models::UserWebsiteSummary::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserWebsiteSummary::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserWebsiteCreate

```cpp
// Create a model
auto model = models::UserWebsiteCreate();
model.setVerificationMethod(/* value */);  // Set verification_method
model.setWebsite(/* value */);  // Set website

// Serialize to JSON
nlohmann::json json = models::UserWebsiteCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserWebsiteCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserWebsiteVerificationCode

```cpp
// Create a model
auto model = models::UserWebsiteVerificationCode();
model.setDnsTxtRecord(/* value */);  // Set dns_txt_record
model.setFileContent(/* value */);  // Set file_content
model.setFilename(/* value */);  // Set filename
model.setMetatag(/* value */);  // Set metatag
model.setVerificationCode(/* value */);  // Set verification_code

// Serialize to JSON
nlohmann::json json = models::UserWebsiteVerificationCode::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserWebsiteVerificationCode::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserWebsitesGet200Response

```cpp
// Create a model
auto model = models::UserWebsitesGet200Response();
model.setBookmark(/* value */);  // Set bookmark
model.setItems(/* value */);  // Set items

// Serialize to JSON
nlohmann::json json = models::UserWebsitesGet200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserWebsitesGet200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsersForIndividualAssetResponse

```cpp
// Create a model
auto model = models::UsersForIndividualAssetResponse();
model.setAssetId(/* value */);  // Set asset_id
model.setMemberId(/* value */);  // Set member_id
model.setPermissions(/* value */);  // Set permissions

// Serialize to JSON
nlohmann::json json = models::UsersForIndividualAssetResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsersForIndividualAssetResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VerticalProductCategory

```cpp
// Create a model
auto model = models::VerticalProductCategory();

// Serialize to JSON
nlohmann::json json = models::VerticalProductCategory::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VerticalProductCategory::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VideoMetadataWithRequiredItemTypeDiscriminator

```cpp
// Create a model
auto model = models::VideoMetadataWithRequiredItemTypeDiscriminator();
model.setCoverImageUrl(/* value */);  // Set cover_image_url
model.setDuration(/* value */);  // Set duration
model.setHeight(/* value */);  // Set height
model.setItemType(/* value */);  // Set item_type
model.setVideoUrl(/* value */);  // Set video_url
model.setVideoUrlHls(/* value */);  // Set video_url_hls
model.setWidth(/* value */);  // Set width

// Serialize to JSON
nlohmann::json json = models::VideoMetadataWithRequiredItemTypeDiscriminator::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VideoMetadataWithRequiredItemTypeDiscriminator::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VideoPinMetricTypes

```cpp
// Create a model
auto model = models::VideoPinMetricTypes();

// Serialize to JSON
nlohmann::json json = models::VideoPinMetricTypes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VideoPinMetricTypes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::WebsiteVerificationMethod

```cpp
// Create a model
auto model = models::WebsiteVerificationMethod();

// Serialize to JSON
nlohmann::json json = models::WebsiteVerificationMethod::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::WebsiteVerificationMethod::fromJson(nlohmann::json::parse(jsonString));
```
#### models::WorkloadState

```cpp
// Create a model
auto model = models::WorkloadState();

// Serialize to JSON
nlohmann::json json = models::WorkloadState::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::WorkloadState::fromJson(nlohmann::json::parse(jsonString));
```

## Implementing API Handlers

### API Classes

Each API is generated as an abstract base class with pure virtual methods that you must implement.

#### AdAccounts

Create a class that inherits from the generated base class:

```cpp
#include "api/AdAccountsApi.h"

class AdAccountsImpl : public Api::AdAccounts {
public:
    AdAccountsadAccountIdtargetingAnalyticsGetResponse handleGetForAdAccountsadAccountIdtargetingAnalytics(const AdAccountsadAccountIdtargetingAnalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_targetingTypes
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_attributionTypes (optional)
        // Query: params.m_reportingTimezone (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_METRICS_RESPONSE):
        models::MetricsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdanalyticsGetResponse handleGetForAdAccountsadAccountIdanalytics(const AdAccountsadAccountIdanalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_reportingTimezone (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNT_ANALYTICS_ITEMS):
        models::AdAccountAnalyticsItems successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsPostResponse handlePostForAdAccounts(const AdAccountsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::AdAccountCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNT):
        models::AdAccount successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdGetResponse handleGetForAdAccountsadAccountId(const AdAccountsadAccountIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNT):
        models::AdAccount successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsGetResponse handleGetForAdAccounts(const AdAccountsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_includeSharedAccounts (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNTS_LIST200_RESPONSE):
        models::AdAccountsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdreportsbrandCategorySkuPostResponse handlePostForAdAccountsadAccountIdreportsbrandCategorySku(const AdAccountsadAccountIdreportsbrandCategorySkuPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ConversionProductReportCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_PRODUCT_REPORT):
        models::ConversionProductReport successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdmmmReportsPostResponse handlePostForAdAccountsadAccountIdmmmReports(const AdAccountsadAccountIdmmmReportsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::MMMReportCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MMM_REPORT):
        models::MMMReport successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdreportsPostResponse handlePostForAdAccountsadAccountIdreports(const AdAccountsadAccountIdreportsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdsAnalyticsCreateAsyncRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADS_ANALYTICS_CREATE_ASYNC_RESPONSE):
        models::AdsAnalyticsCreateAsyncResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdtemplatestemplateIdreportsPostResponse handlePostForAdAccountsadAccountIdtemplatestemplateIdreports(const AdAccountsadAccountIdtemplatestemplateIdreportsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_templateId
        // Query: params.m_startDate (optional)
        // Query: params.m_endDate (optional)
        // Query: params.m_granularity (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TEMPLATE_BASED_REPORT):
        models::TemplateBasedReport successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdreportsbrandCategorySkuGetResponse handleGetForAdAccountsadAccountIdreportsbrandCategorySku(const AdAccountsadAccountIdreportsbrandCategorySkuGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_token

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_PRODUCT_REPORT):
        models::ConversionProductReport successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdmmmReportsGetResponse handleGetForAdAccountsadAccountIdmmmReports(const AdAccountsadAccountIdmmmReportsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_token

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MMM_REPORT):
        models::MMMReport successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdreportsGetResponse handleGetForAdAccountsadAccountIdreports(const AdAccountsadAccountIdreportsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_token

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADS_ANALYTICS_GET_ASYNC_RESPONSE):
        models::AdsAnalyticsGetAsyncResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdsandboxDeleteResponse handleDeleteForAdAccountsadAccountIdsandbox(const AdAccountsadAccountIdsandboxDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        std::string successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdtemplatesGetResponse handleGetForAdAccountsadAccountIdtemplates(const AdAccountsadAccountIdtemplatesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TEMPLATES_LIST200_RESPONSE):
        models::TemplatesList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### AdGroups

Create a class that inherits from the generated base class:

```cpp
#include "api/AdGroupsApi.h"

class AdGroupsImpl : public Api::AdGroups {
public:
    AdAccountsadAccountIdbidFloorPostResponse handlePostForAdAccountsadAccountIdbidFloor(const AdAccountsadAccountIdbidFloorPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::BidFloorCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BID_FLOOR):
        models::BidFloor successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsadGroupIddynamicTitlescsvGetResponse handleGetForAdAccountsadAccountIdadGroupsadGroupIddynamicTitlescsv(const AdAccountsadAccountIdadGroupsadGroupIddynamicTitlescsvGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_adGroupId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DYNAMIC_TITLES_DOWNLOAD_CSV):
        models::DynamicTitlesDownloadCsv successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsadGroupIddynamicTitlesstatusGetResponse handleGetForAdAccountsadAccountIdadGroupsadGroupIddynamicTitlesstatus(const AdAccountsadAccountIdadGroupsadGroupIddynamicTitlesstatusGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_adGroupId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DYNAMIC_TITLES_GET_STATUS):
        models::DynamicTitlesGetStatus successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsadGroupIddynamicTitlesuploadsGetResponse handleGetForAdAccountsadAccountIdadGroupsadGroupIddynamicTitlesuploads(const AdAccountsadAccountIdadGroupsadGroupIddynamicTitlesuploadsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_adGroupId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DYNAMIC_TITLES_UPLOAD_URL):
        models::DynamicTitlesUploadUrl successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsadGroupIddynamicTitlesPostResponse handlePostForAdAccountsadAccountIdadGroupsadGroupIddynamicTitles(const AdAccountsadAccountIdadGroupsadGroupIddynamicTitlesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_adGroupId
        // Body: params.m_request (std::optional<models::DynamicTitlesProcessCSVCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DYNAMIC_TITLES_PROCESS_CSV):
        models::DynamicTitlesProcessCsv successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupstargetingAnalyticsGetResponse handleGetForAdAccountsadAccountIdadGroupstargetingAnalytics(const AdAccountsadAccountIdadGroupstargetingAnalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_adGroupIds
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_targetingTypes
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_attributionTypes (optional)
        // Query: params.m_reportingTimezone (optional)
        // Query: params.m_sortColumns (optional)
        // Query: params.m_sortAscending (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_METRICS_RESPONSE):
        models::MetricsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsanalyticsGetResponse handleGetForAdAccountsadAccountIdadGroupsanalytics(const AdAccountsadAccountIdadGroupsanalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_adGroupIds
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_aggregateReportRows (optional)
        // Query: params.m_reportingTimezone (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_GROUPS_ANALYTICS_METRICS):
        models::AdGroupsAnalyticsMetrics successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsaudienceSizingPostResponse handlePostForAdAccountsadAccountIdadGroupsaudienceSizing(const AdAccountsadAccountIdadGroupsaudienceSizingPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdGroupAudienceSizingCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_GROUP_AUDIENCE_SIZING):
        models::AdGroupAudienceSizing successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsPostResponse handlePostForAdAccountsadAccountIdadGroups(const AdAccountsadAccountIdadGroupsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdGroupCreateCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_GROUPS_CREATE200_RESPONSE):
        models::AdGroupsCreate200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsadGroupIdGetResponse handleGetForAdAccountsadAccountIdadGroupsadGroupId(const AdAccountsadAccountIdadGroupsadGroupIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adGroupId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_GROUP):
        models::AdGroup successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsGetResponse handleGetForAdAccountsadAccountIdadGroups(const AdAccountsadAccountIdadGroupsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_campaignIds (optional)
        // Query: params.m_adGroupIds (optional)
        // Query: params.m_entityStatuses (optional)
        // Query: params.m_translateInterestsToNames (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_GROUPS_LIST200_RESPONSE):
        models::AdGroupsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadGroupsPatchResponse handlePatchForAdAccountsadAccountIdadGroups(const AdAccountsadAccountIdadGroupsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdGroupUpdateBatchUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_GROUPS_UPDATE200_RESPONSE):
        models::AdGroupsUpdate200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdpromotionAppliedEntitiesGetResponse handleGetForAdAccountsadAccountIdpromotionAppliedEntities(const AdAccountsadAccountIdpromotionAppliedEntitiesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_promotionIds

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GET_AD_GROUPS_BY_PROMOTION_IDS_LIST200_RESPONSE):
        models::GetAdGroupsByPromotionIdsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Ads

Create a class that inherits from the generated base class:

```cpp
#include "api/AdsApi.h"

class AdsImpl : public Api::Ads {
public:
    AdAccountsadAccountIdadPreviewsPostResponse handlePostForAdAccountsadAccountIdadPreviews(const AdAccountsadAccountIdadPreviewsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdPreviewRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_PREVIEW_URL_RESPONSE):
        models::AdPreviewURLResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadstargetingAnalyticsGetResponse handleGetForAdAccountsadAccountIdadstargetingAnalytics(const AdAccountsadAccountIdadstargetingAnalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_adIds
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_targetingTypes
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_attributionTypes (optional)
        // Query: params.m_reportingTimezone (optional)
        // Query: params.m_sortColumns (optional)
        // Query: params.m_sortAscending (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_METRICS_RESPONSE):
        models::MetricsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadsanalyticsGetResponse handleGetForAdAccountsadAccountIdadsanalytics(const AdAccountsadAccountIdadsanalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_pinIds (optional)
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_adIds (optional)
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_campaignIds (optional)
        // Query: params.m_reportingTimezone (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADS_ANALYTICS):
        models::AdsAnalytics successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadsPostResponse handlePostForAdAccountsadAccountIdads(const AdAccountsadAccountIdadsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_BATCH_WRITE_RESPONSE_MODEL):
        models::AdBatchWriteResponseModel successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadsadIdGetResponse handleGetForAdAccountsadAccountIdadsadId(const AdAccountsadAccountIdadsadIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD):
        models::Ad successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadsGetResponse handleGetForAdAccountsadAccountIdads(const AdAccountsadAccountIdadsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_campaignIds (optional)
        // Query: params.m_adGroupIds (optional)
        // Query: params.m_adIds (optional)
        // Query: params.m_entityStatuses (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADS_LIST200_RESPONSE):
        models::AdsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadsPatchResponse handlePatchForAdAccountsadAccountIdads(const AdAccountsadAccountIdadsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdBatchUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_BATCH_WRITE_RESPONSE_MODEL):
        models::AdBatchWriteResponseModel successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignAdPreviewPostResponse handlePostForAdAccountsadAccountIdcampaignAdPreview(const AdAccountsadAccountIdcampaignAdPreviewPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::CampaignAdPreviewCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN_AD_PREVIEW_CREATE200_RESPONSE_INNER):
        models::CampaignAdPreviewCreate200ResponseInner successResponse;
        // ... populate response ...
        return successResponse;
        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN_AD_PREVIEW):
        models::CampaignAdPreview successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignAdPreviewDeleteResponse handleDeleteForAdAccountsadAccountIdcampaignAdPreview(const AdAccountsadAccountIdcampaignAdPreviewDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_adGroupIds

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN_AD_PREVIEW_DELETE200_RESPONSE_INNER):
        models::CampaignAdPreviewDelete200ResponseInner successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignAdPreviewGetResponse handleGetForAdAccountsadAccountIdcampaignAdPreview(const AdAccountsadAccountIdcampaignAdPreviewGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_adGroupIds

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN_AD_PREVIEW):
        models::CampaignAdPreview successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### AdvancedAuction

Create a class that inherits from the generated base class:

```cpp
#include "api/AdvancedAuctionApi.h"

class AdvancedAuctionImpl : public Api::AdvancedAuction {
public:
    AdvancedAuctionitemsgetPostResponse handlePostForAdvancedAuctionitemsget(const AdvancedAuctionitemsgetPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::AdvancedAuctionItemsGetRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADVANCED_AUCTION_ITEMS):
        models::AdvancedAuctionItems successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdvancedAuctionitemssubmitPostResponse handlePostForAdvancedAuctionitemssubmit(const AdvancedAuctionitemssubmitPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::AdvancedAuctionItemsSubmitRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADVANCED_AUCTION_PROCESSED_ITEMS):
        models::AdvancedAuctionProcessedItems successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### AudienceInsights

Create a class that inherits from the generated base class:

```cpp
#include "api/AudienceInsightsApi.h"

class AudienceInsightsImpl : public Api::AudienceInsights {
public:
    AdAccountsadAccountIdinsightsaudiencesGetResponse handleGetForAdAccountsadAccountIdinsightsaudiences(const AdAccountsadAccountIdinsightsaudiencesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AUDIENCE_INSIGHTS_SCOPE_AND_TYPE_GET200_RESPONSE):
        models::AudienceInsightsScopeAndTypeGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdaudienceInsightsGetResponse handleGetForAdAccountsadAccountIdaudienceInsights(const AdAccountsadAccountIdaudienceInsightsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_audienceInsightType

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AUDIENCE_INSIGHTS):
        models::AudienceInsights successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### AudienceSharing

Create a class that inherits from the generated base class:

```cpp
#include "api/AudienceSharingApi.h"

class AudienceSharingImpl : public Api::AudienceSharing {
public:
    AdAccountsadAccountIdaudiencessharedaccountsGetResponse handleGetForAdAccountsadAccountIdaudiencessharedaccounts(const AdAccountsadAccountIdaudiencessharedaccountsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_audienceId
        // Query: params.m_accountType
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST200_RESPONSE):
        models::AdAccountsAudiencesSharedAccountsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdaudiencessharedaccountsGetResponse handleGetForBusinessesbusinessIdaudiencessharedaccounts(const BusinessesbusinessIdaudiencessharedaccountsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Query: params.m_audienceId
        // Query: params.m_accountType
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_ACCOUNT_AUDIENCES_SHARED_ACCOUNTS_LIST200_RESPONSE):
        models::BusinessAccountAudiencesSharedAccountsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdaudiencesGetResponse handleGetForBusinessesbusinessIdaudiences(const BusinessesbusinessIdaudiencesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Query: params.m_order (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SHARED_AUDIENCES_FOR_BUSINESS_LIST200_RESPONSE):
        models::SharedAudiencesForBusinessList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdaudiencesadAccountssharedPatchResponse handlePatchForAdAccountsadAccountIdaudiencesadAccountsshared(const AdAccountsadAccountIdaudiencesadAccountssharedPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNT_TO_AD_ACCOUNT_SHARED_AUDIENCE):
        models::AdAccountToAdAccountSharedAudience successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdaudiencesbusinessessharedPatchResponse handlePatchForAdAccountsadAccountIdaudiencesbusinessesshared(const AdAccountsadAccountIdaudiencesbusinessessharedPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNT_TO_BUSINESS_SHARED_AUDIENCE):
        models::AdAccountToBusinessSharedAudience successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdaudiencesadAccountssharedPatchResponse handlePatchForBusinessesbusinessIdaudiencesadAccountsshared(const BusinessesbusinessIdaudiencesadAccountssharedPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_TO_AD_ACCOUNT_SHARED_AUDIENCE):
        models::BusinessToAdAccountSharedAudience successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdaudiencesbusinessessharedPatchResponse handlePatchForBusinessesbusinessIdaudiencesbusinessesshared(const BusinessesbusinessIdaudiencesbusinessessharedPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_TO_BUSINESS_SHARED_AUDIENCE):
        models::BusinessToBusinessSharedAudience successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Audiences

Create a class that inherits from the generated base class:

```cpp
#include "api/AudiencesApi.h"

class AudiencesImpl : public Api::Audiences {
public:
    AdAccountsadAccountIdaudiencesPostResponse handlePostForAdAccountsadAccountIdaudiences(const AdAccountsadAccountIdaudiencesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdAccountsAudienceCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNTS_AUDIENCE):
        models::AdAccountsAudience successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdaudiencesaudienceIdGetResponse handleGetForAdAccountsadAccountIdaudiencesaudienceId(const AdAccountsadAccountIdaudiencesaudienceIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_audienceId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNTS_AUDIENCE):
        models::AdAccountsAudience successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdaudiencesGetResponse handleGetForAdAccountsadAccountIdaudiences(const AdAccountsadAccountIdaudiencesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_ownershipType (optional)
        // Query: params.m_excludeNca (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AUDIENCES_LIST200_RESPONSE):
        models::AudiencesList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdaudiencesaudienceIdPatchResponse handlePatchForAdAccountsadAccountIdaudiencesaudienceId(const AdAccountsadAccountIdaudiencesaudienceIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_audienceId
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdAccountsAudienceUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNTS_AUDIENCE):
        models::AdAccountsAudience successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Billing

Create a class that inherits from the generated base class:

```cpp
#include "api/BillingApi.h"

class BillingImpl : public Api::Billing {
public:
    AdAccountsadAccountIdadsCreditredeemPostResponse handlePostForAdAccountsadAccountIdadsCreditredeem(const AdAccountsadAccountIdadsCreditredeemPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdsCreditRedeemCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADS_CREDIT_REDEEM):
        models::AdsCreditRedeem successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadsCreditdiscountsGetResponse handleGetForAdAccountsadAccountIdadsCreditdiscounts(const AdAccountsadAccountIdadsCreditdiscountsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADS_CREDITS_DISCOUNTS_GET200_RESPONSE):
        models::AdsCreditsDiscountsGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdbillingInvoicebillingInvoiceIddownloadGetResponse handleGetForAdAccountsadAccountIdbillingInvoicebillingInvoiceIddownload(const AdAccountsadAccountIdbillingInvoicebillingInvoiceIddownloadGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_billingInvoiceId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BILLING_INVOICE_DOWNLOAD_RESPONSE):
        models::BillingInvoiceDownloadResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdbillingInvoicesGetResponse handleGetForAdAccountsadAccountIdbillingInvoices(const AdAccountsadAccountIdbillingInvoicesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_sort (optional)
        // Query: params.m_status (optional)
        // Query: params.m_documentType (optional)
        // Query: params.m_startDueDate (optional)
        // Query: params.m_endDueDate (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BILLING_INVOICES_GET200_RESPONSE):
        models::BillingInvoicesGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdbillingProfilesGetResponse handleGetForAdAccountsadAccountIdbillingProfiles(const AdAccountsadAccountIdbillingProfilesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_isActive
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BILLING_PROFILES_GET200_RESPONSE):
        models::BillingProfilesGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdssioaccountsGetResponse handleGetForAdAccountsadAccountIdssioaccounts(const AdAccountsadAccountIdssioaccountsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SSIO_ACCOUNT):
        models::SSIOAccount successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdssioinsertionOrdersPostResponse handlePostForAdAccountsadAccountIdssioinsertionOrders(const AdAccountsadAccountIdssioinsertionOrdersPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::SSIOInsertionOrderCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SSIO_INSERTION_ORDER):
        models::SSIOInsertionOrder successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdssioinsertionOrdersPatchResponse handlePatchForAdAccountsadAccountIdssioinsertionOrders(const AdAccountsadAccountIdssioinsertionOrdersPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::SSIOInsertionOrderUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SSIO_INSERTION_ORDER):
        models::SSIOInsertionOrder successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdssioinsertionOrdersstatusGetResponse handleGetForAdAccountsadAccountIdssioinsertionOrdersstatus(const AdAccountsadAccountIdssioinsertionOrdersstatusGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SSIO_INSERTION_ORDERS_STATUS_GET_BY_AD_ACCOUNT200_RESPONSE):
        models::SsioInsertionOrdersStatusGetByAdAccount200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdssioinsertionOrderspinOrderIdstatusGetResponse handleGetForAdAccountsadAccountIdssioinsertionOrderspinOrderIdstatus(const AdAccountsadAccountIdssioinsertionOrderspinOrderIdstatusGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_pinOrderId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SSIO_INSERTION_ORDER_STATUS_RESPONSE):
        models::SSIOInsertionOrderStatusResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdssioorderLinesGetResponse handleGetForAdAccountsadAccountIdssioorderLines(const AdAccountsadAccountIdssioorderLinesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_pinOrderId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SSIO_ORDER_LINES_GET_BY_AD_ACCOUNT200_RESPONSE):
        models::SsioOrderLinesGetByAdAccount200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Boards

Create a class that inherits from the generated base class:

```cpp
#include "api/BoardsApi.h"

class BoardsImpl : public Api::Boards {
public:
    BoardsboardIdsectionsPostResponse handlePostForBoardsboardIdsections(const BoardsboardIdsectionsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::BoardSectionCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD_SECTION):
        models::BoardSection successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdsectionssectionIdDeleteResponse handleDeleteForBoardsboardIdsectionssectionId(const BoardsboardIdsectionssectionIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Path: params.m_sectionId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD_SECTION):
        models::BoardSection successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdsectionsGetResponse handleGetForBoardsboardIdsections(const BoardsboardIdsectionsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD_SECTIONS_LIST200_RESPONSE):
        models::BoardSectionsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdsectionssectionIdpinsGetResponse handleGetForBoardsboardIdsectionssectionIdpins(const BoardsboardIdsectionssectionIdpinsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Path: params.m_sectionId
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD_SECTIONS_LIST_PINS200_RESPONSE):
        models::BoardSectionsListPins200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdsectionssectionIdPatchResponse handlePatchForBoardsboardIdsectionssectionId(const BoardsboardIdsectionssectionIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Path: params.m_sectionId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::BoardSectionUpdateWithRequiredBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD_SECTION):
        models::BoardSection successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsPostResponse handlePostForBoards(const BoardsPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::BoardCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD):
        models::Board successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdDeleteResponse handleDeleteForBoardsboardId(const BoardsboardIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD):
        models::Board successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdGetResponse handleGetForBoardsboardId(const BoardsboardIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD):
        models::Board successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsGetResponse handleGetForBoards(const BoardsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_privacy (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARDS_LIST200_RESPONSE):
        models::BoardsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdpinsGetResponse handleGetForBoardsboardIdpins(const BoardsboardIdpinsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Query: params.m_creativeTypes (optional)
        // Query: params.m_adAccountId (optional)
        // Query: params.m_pinMetrics (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARDS_LIST_PINS200_RESPONSE):
        models::BoardsListPins200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BoardsboardIdPatchResponse handlePatchForBoardsboardId(const BoardsboardIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_boardId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::BoardWithUpdatePrivacyUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARD_WITH_UPDATE_PRIVACY):
        models::BoardWithUpdatePrivacy successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Bulk

Create a class that inherits from the generated base class:

```cpp
#include "api/BulkApi.h"

class BulkImpl : public Api::Bulk {
public:
    AdAccountsadAccountIdbulkdownloadPostResponse handlePostForAdAccountsadAccountIdbulkdownload(const AdAccountsadAccountIdbulkdownloadPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::BulkDownloadCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BULK_DOWNLOAD):
        models::BulkDownload successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdbulkbulkRequestIdGetResponse handleGetForAdAccountsadAccountIdbulkbulkRequestId(const AdAccountsadAccountIdbulkbulkRequestIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_bulkRequestId
        // Query: params.m_includeDetails (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BULK_JOB_DATA):
        models::BulkJobData successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdbulkupsertPostResponse handlePostForAdAccountsadAccountIdbulkupsert(const AdAccountsadAccountIdbulkupsertPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::BulkUpsertRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BULK_UPSERT_RESPONSE):
        models::BulkUpsertResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### BusinessAccessAssets

Create a class that inherits from the generated base class:

```cpp
#include "api/BusinessAccessAssetsApi.h"

class BusinessAccessAssetsImpl : public Api::BusinessAccessAssets {
public:
    BusinessesbusinessIdassetGroupsPostResponse handlePostForBusinessesbusinessIdassetGroups(const BusinessesbusinessIdassetGroupsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::AssetGroupInputCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ASSET_GROUP_INPUT):
        models::AssetGroupInput successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdassetGroupsDeleteResponse handleDeleteForBusinessesbusinessIdassetGroups(const BusinessesbusinessIdassetGroupsDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::AssetGroupDeletionDelete>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ASSET_GROUP_DELETION):
        models::AssetGroupDeletion successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdassetGroupsPatchResponse handlePatchForBusinessesbusinessIdassetGroups(const BusinessesbusinessIdassetGroupsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::AssetGroupModificationReadOrUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ASSET_GROUP_MODIFICATION):
        models::AssetGroupModification successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdassetsassetIdmembersGetResponse handleGetForBusinessesbusinessIdassetsassetIdmembers(const BusinessesbusinessIdassetsassetIdmembersGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Path: params.m_assetId
        // Query: params.m_startIndex (optional)
        // Query: params.m_fetchSystemUsers (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_ASSET_MEMBERS_GET200_RESPONSE):
        models::BusinessAssetMembersGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdassetsassetIdpartnersGetResponse handleGetForBusinessesbusinessIdassetsassetIdpartners(const BusinessesbusinessIdassetsassetIdpartnersGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Path: params.m_assetId
        // Query: params.m_startIndex (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_ASSET_PARTNERS_GET200_RESPONSE):
        models::BusinessAssetPartnersGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdassetsGetResponse handleGetForBusinessesbusinessIdassets(const BusinessesbusinessIdassetsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Query: params.m_permissions (optional)
        // Query: params.m_childAssetId (optional)
        // Query: params.m_assetGroupId (optional)
        // Query: params.m_assetType (optional)
        // Query: params.m_startIndex (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_ASSETS_GET200_RESPONSE):
        models::BusinessAssetsGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdmembersmemberIdassetsGetResponse handleGetForBusinessesbusinessIdmembersmemberIdassets(const BusinessesbusinessIdmembersmemberIdassetsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Path: params.m_memberId
        // Query: params.m_assetType (optional)
        // Query: params.m_startIndex (optional)
        // Query: params.m_sortBy (optional)
        // Query: params.m_sortAscending (optional)
        // Query: params.m_searchBy (optional)
        // Query: params.m_searchValue (optional)
        // Query: params.m_assetPermissionType (optional)
        // Query: params.m_adAccountStatuses (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_MEMBER_ASSETS_GET_RESPONSE):
        models::BusinessMemberAssetsGetResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdmembersassetsaccessDeleteResponse handleDeleteForBusinessesbusinessIdmembersassetsaccess(const BusinessesbusinessIdmembersassetsaccessDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::BusinessMembersAssetAccessDeleteBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_MEMBER_ACCESS_RESULTS_RESPONSE_ARRAY):
        models::DeleteMemberAccessResultsResponseArray successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdmembersassetsaccessPatchResponse handlePatchForBusinessesbusinessIdmembersassetsaccess(const BusinessesbusinessIdmembersassetsaccessPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::UpdateMemberAssetAccessBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPDATE_MEMBER_ASSETS_RESULTS_RESPONSE_ARRAY):
        models::UpdateMemberAssetsResultsResponseArray successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdpartnerspartnerIdassetsGetResponse handleGetForBusinessesbusinessIdpartnerspartnerIdassets(const BusinessesbusinessIdpartnerspartnerIdassetsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Path: params.m_partnerId
        // Query: params.m_partnerType (optional)
        // Query: params.m_assetType (optional)
        // Query: params.m_startIndex (optional)
        // Query: params.m_sortBy (optional)
        // Query: params.m_sortAscending (optional)
        // Query: params.m_searchBy (optional)
        // Query: params.m_searchValue (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUSINESS_PARTNER_ASSET_ACCESS_GET200_RESPONSE):
        models::BusinessPartnerAssetAccessGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdpartnersassetsDeleteResponse handleDeleteForBusinessesbusinessIdpartnersassets(const BusinessesbusinessIdpartnersassetsDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::DeletePartnerAssetAccessBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_PARTNER_ASSET_ACCESS_RESULTS_RESPONSE_ARRAY):
        models::DeletePartnerAssetAccessResultsResponseArray successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdpartnersassetsPatchResponse handlePatchForBusinessesbusinessIdpartnersassets(const BusinessesbusinessIdpartnersassetsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::UpdatePartnerAssetAccessBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPDATE_PARTNER_ASSETS_RESULTS_RESPONSE_ARRAY):
        models::UpdatePartnerAssetsResultsResponseArray successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### BusinessAccessInvite

Create a class that inherits from the generated base class:

```cpp
#include "api/BusinessAccessInviteApi.h"

class BusinessAccessInviteImpl : public Api::BusinessAccessInvite {
public:
    BusinessesbusinessIdrequestsassetsaccessPostResponse handlePostForBusinessesbusinessIdrequestsassetsaccess(const BusinessesbusinessIdrequestsassetsaccessPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::CreateAssetAccessRequestBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_ASSET_ACCESS_REQUEST_RESPONSE):
        models::CreateAssetAccessRequestResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdinvitesDeleteResponse handleDeleteForBusinessesbusinessIdinvites(const BusinessesbusinessIdinvitesDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::CancelInvitesRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CANCEL_INVITES_RESPONSE):
        models::CancelInvitesResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdinvitesassetsaccessPostResponse handlePostForBusinessesbusinessIdinvitesassetsaccess(const BusinessesbusinessIdinvitesassetsaccessPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::CreateAssetInvitesRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPDATE_INVITES_RESULTS_RESPONSE_ARRAY):
        models::UpdateInvitesResultsResponseArray successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdinvitesPostResponse handlePostForBusinessesbusinessIdinvites(const BusinessesbusinessIdinvitesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::CreateMembershipOrPartnershipInvitesBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_INVITES_RESULTS_RESPONSE_ARRAY):
        models::CreateInvitesResultsResponseArray successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdinvitesGetResponse handleGetForBusinessesbusinessIdinvites(const BusinessesbusinessIdinvitesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Query: params.m_isMember (optional)
        // Query: params.m_inviteStatus (optional)
        // Query: params.m_inviteType (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GET_INVITES200_RESPONSE):
        models::GetInvites200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesinvitesPatchResponse handlePatchForBusinessesinvites(const BusinessesinvitesPatchRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::AuthRespondInvitesBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RESPOND_TO_INVITES_RESPONSE_ARRAY):
        models::RespondToInvitesResponseArray successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### BusinessAccessRelationships

Create a class that inherits from the generated base class:

```cpp
#include "api/BusinessAccessRelationshipsApi.h"

class BusinessAccessRelationshipsImpl : public Api::BusinessAccessRelationships {
public:
    BusinessAccessbusinessHierarchybusinessHierarchyIdbrandAccountsPostResponse handlePostForBusinessAccessbusinessHierarchybusinessHierarchyIdbrandAccounts(const BusinessAccessbusinessHierarchybusinessHierarchyIdbrandAccountsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessHierarchyId
        // Body: params.m_request (std::optional<models::BrandAccountCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BRAND_ACCOUNT):
        models::BrandAccount successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessAccessbusinessHierarchybusinessHierarchyIdbrandAccountsbrandAccountIdPatchResponse handlePatchForBusinessAccessbusinessHierarchybusinessHierarchyIdbrandAccountsbrandAccountId(const BusinessAccessbusinessHierarchybusinessHierarchyIdbrandAccountsbrandAccountIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_brandAccountId
        // Path: params.m_businessHierarchyId
        // Body: params.m_request (std::optional<models::BrandAccountUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BRAND_ACCOUNT):
        models::BrandAccount successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdmembersDeleteResponse handleDeleteForBusinessesbusinessIdmembers(const BusinessesbusinessIdmembersDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::DeleteBusinessMembershipBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_BUSINESS_MEMBERSHIP200_RESPONSE):
        models::DeleteBusinessMembership200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdpartnersDeleteResponse handleDeleteForBusinessesbusinessIdpartners(const BusinessesbusinessIdpartnersDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::DeleteBusinessPartnersDelete>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_BUSINESS_PARTNERS):
        models::DeleteBusinessPartners successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesemployersGetResponse handleGetForBusinessesemployers(const BusinessesemployersGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_assetsSummary (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GET_BUSINESS_EMPLOYERS200_RESPONSE):
        models::GetBusinessEmployers200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdmembersGetResponse handleGetForBusinessesbusinessIdmembers(const BusinessesbusinessIdmembersGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Query: params.m_fetchSystemUsers (optional)
        // Query: params.m_assetsSummary (optional)
        // Query: params.m_businessRoles (optional)
        // Query: params.m_memberIds (optional)
        // Query: params.m_startIndex (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GET_BUSINESS_MEMBERS200_RESPONSE):
        models::GetBusinessMembers200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdpartnersGetResponse handleGetForBusinessesbusinessIdpartners(const BusinessesbusinessIdpartnersGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Query: params.m_assetsSummary (optional)
        // Query: params.m_partnerType (optional)
        // Query: params.m_partnerIds (optional)
        // Query: params.m_startIndex (optional)
        // Query: params.m_sortAscending (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_GET_BUSINESS_PARTNERS200_RESPONSE):
        models::GetBusinessPartners200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdsystemUserssystemUserIdPatchResponse handlePatchForBusinessesbusinessIdsystemUserssystemUserId(const BusinessesbusinessIdsystemUserssystemUserIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Path: params.m_systemUserId
        // Body: params.m_request (std::optional<models::SystemUserUpdateWithRequiredBody>)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    BusinessesbusinessIdmembersPatchResponse handlePatchForBusinessesbusinessIdmembers(const BusinessesbusinessIdmembersPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_businessId
        // Body: params.m_request (std::optional<models::BusinessMembershipMember>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPDATE_BUSINESS_MEMBERSHIPS_RESPONSE):
        models::UpdateBusinessMembershipsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Campaigns

Create a class that inherits from the generated base class:

```cpp
#include "api/CampaignsApi.h"

class CampaignsImpl : public Api::Campaigns {
public:
    AdAccountsadAccountIdpinsanalyticsGetResponse handleGetForAdAccountsadAccountIdpinsanalytics(const AdAccountsadAccountIdpinsanalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_campaignId
        // Query: params.m_pinIds
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_PIN_ANALYTICS):
        models::AdPinAnalytics successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignstargetingAnalyticsGetResponse handleGetForAdAccountsadAccountIdcampaignstargetingAnalytics(const AdAccountsadAccountIdcampaignstargetingAnalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_campaignIds
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_targetingTypes
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_attributionTypes (optional)
        // Query: params.m_reportingTimezone (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_METRICS_RESPONSE):
        models::MetricsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignsanalyticsGetResponse handleGetForAdAccountsadAccountIdcampaignsanalytics(const AdAccountsadAccountIdcampaignsanalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_campaignIds
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_aggregateReportRows (optional)
        // Query: params.m_reportingTimezone (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGNS_ANALYTICS_METRICS):
        models::CampaignsAnalyticsMetrics successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignsPostResponse handlePostForAdAccountsadAccountIdcampaigns(const AdAccountsadAccountIdcampaignsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::CampaignCreateItem>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL):
        models::CampaignBatchWriteResponseModel successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignscampaignIdGetResponse handleGetForAdAccountsadAccountIdcampaignscampaignId(const AdAccountsadAccountIdcampaignscampaignIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_campaignId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN):
        models::Campaign successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignsGetResponse handleGetForAdAccountsadAccountIdcampaigns(const AdAccountsadAccountIdcampaignsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_campaignIds (optional)
        // Query: params.m_entityStatuses (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGNS_LIST200_RESPONSE):
        models::CampaignsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignsPatchResponse handlePatchForAdAccountsadAccountIdcampaigns(const AdAccountsadAccountIdcampaignsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::CampaignBatchUpdateItem>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL):
        models::CampaignBatchWriteResponseModel successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcampaignsdeliveryEstimatesPostResponse handlePostForAdAccountsadAccountIdcampaignsdeliveryEstimates(const AdAccountsadAccountIdcampaignsdeliveryEstimatesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::CampaignDeliveryEstimatesCampaign>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CAMPAIGN_DELIVERY_ESTIMATES_RESPONSE):
        models::CampaignDeliveryEstimatesResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CatalogFeeds

Create a class that inherits from the generated base class:

```cpp
#include "api/CatalogFeedsApi.h"

class CatalogFeedsImpl : public Api::CatalogFeeds {
public:
    CatalogsfeedsfeedIdprocessingResultsGetResponse handleGetForCatalogsfeedsfeedIdprocessingResults(const CatalogsfeedsfeedIdprocessingResultsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_feedId
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FEED_PROCESSING_RESULTS_LIST200_RESPONSE):
        models::FeedProcessingResultsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsfeedsPostResponse handlePostForCatalogsfeeds(const CatalogsfeedsPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsFeedCreateRequestSchema>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_FEED):
        models::CatalogsFeed successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsfeedsfeedIdDeleteResponse handleDeleteForCatalogsfeedsfeedId(const CatalogsfeedsfeedIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_feedId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_FEED):
        models::CatalogsFeed successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsfeedsfeedIdGetResponse handleGetForCatalogsfeedsfeedId(const CatalogsfeedsfeedIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_feedId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_FEED):
        models::CatalogsFeed successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsfeedsfeedIdingestPostResponse handlePostForCatalogsfeedsfeedIdingest(const CatalogsfeedsfeedIdingestPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_feedId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_FEED_INGESTION):
        models::CatalogsFeedIngestion successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsfeedsGetResponse handleGetForCatalogsfeeds(const CatalogsfeedsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_catalogId (optional)
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FEEDS_LIST200_RESPONSE):
        models::FeedsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsfeedsfeedIdPatchResponse handlePatchForCatalogsfeedsfeedId(const CatalogsfeedsfeedIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_feedId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsFeedUpdateRequestSchema>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_FEED):
        models::CatalogsFeed successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsprocessingResultsprocessingResultIditemIssuesGetResponse handleGetForCatalogsprocessingResultsprocessingResultIditemIssues(const CatalogsprocessingResultsprocessingResultIditemIssuesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_processingResultId
        // Query: params.m_itemNumbers (optional)
        // Query: params.m_itemValidationIssue (optional)
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ITEMS_ISSUES_LIST200_RESPONSE):
        models::ItemsIssuesList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CatalogItems

Create a class that inherits from the generated base class:

```cpp
#include "api/CatalogItemsApi.h"

class CatalogItemsImpl : public Api::CatalogItems {
public:
    CatalogsitemsbatchbatchIdGetResponse handleGetForCatalogsitemsbatchbatchId(const CatalogsitemsbatchbatchIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_batchId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_ITEMS_BATCH):
        models::CatalogsItemsBatch successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsitemsbatchPostResponse handlePostForCatalogsitemsbatch(const CatalogsitemsbatchPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsItemsBatchPostRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_ITEMS_BATCH):
        models::CatalogsItemsBatch successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsitemsPostResponse handlePostForCatalogsitems(const CatalogsitemsPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsItemsRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ITEMS_POST200_RESPONSE):
        models::ItemsPost200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CatalogProductGroups

Create a class that inherits from the generated base class:

```cpp
#include "api/CatalogProductGroupsApi.h"

class CatalogProductGroupsImpl : public Api::CatalogProductGroups {
public:
    CatalogsproductGroupsproductGroupIdproductsGetResponse handleGetForCatalogsproductGroupsproductGroupIdproducts(const CatalogsproductGroupsproductGroupIdproductsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_productGroupId
        // Query: params.m_adAccountId (optional)
        // Query: params.m_pinMetrics (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_PRODUCT_GROUP_PINS_LIST200_RESPONSE):
        models::CatalogsProductGroupPinsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsPostResponse handlePostForCatalogsproductGroups(const CatalogsproductGroupsPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsProductGroupsCreateRequestSchema>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_VERTICAL_PRODUCT_GROUP):
        models::CatalogsVerticalProductGroup successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsmultiplePostResponse handlePostForCatalogsproductGroupsmultiple(const CatalogsproductGroupsmultiplePostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsProductGroupsCreateManyRequestItems>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        std::string successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsproductGroupIdDeleteResponse handleDeleteForCatalogsproductGroupsproductGroupId(const CatalogsproductGroupsproductGroupIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_productGroupId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_VERTICAL_PRODUCT_GROUP):
        models::CatalogsVerticalProductGroup successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsmultipleDeleteResponse handleDeleteForCatalogsproductGroupsmultiple(const CatalogsproductGroupsmultipleDeleteRequest& params) override {
        // Access request parameters:
        // Query: params.m_id
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsproductGroupIdGetResponse handleGetForCatalogsproductGroupsproductGroupId(const CatalogsproductGroupsproductGroupIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_productGroupId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_VERTICAL_PRODUCT_GROUP):
        models::CatalogsVerticalProductGroup successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsGetResponse handleGetForCatalogsproductGroups(const CatalogsproductGroupsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_id (optional)
        // Query: params.m_feedId (optional)
        // Query: params.m_catalogId (optional)
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_PRODUCT_GROUPS_LIST200_RESPONSE):
        models::CatalogsProductGroupsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsproductGroupIdproductCountsGetResponse handleGetForCatalogsproductGroupsproductGroupIdproductCounts(const CatalogsproductGroupsproductGroupIdproductCountsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_productGroupId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_PRODUCT_GROUP_PRODUCT_COUNTS_VERTICAL):
        models::CatalogsProductGroupProductCountsVertical successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductGroupsproductGroupIdPatchResponse handlePatchForCatalogsproductGroupsproductGroupId(const CatalogsproductGroupsproductGroupIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_productGroupId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsProductGroupsUpdateRequestSchema>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_VERTICAL_PRODUCT_GROUP):
        models::CatalogsVerticalProductGroup successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsproductsgetByProductGroupFiltersPostResponse handlePostForCatalogsproductsgetByProductGroupFilters(const CatalogsproductsgetByProductGroupFiltersPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_adAccountId (optional)
        // Query: params.m_pinMetrics (optional)
        // Body: params.m_request (std::optional<models::CatalogsListProductsByFilterRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCTS_BY_PRODUCT_GROUP_FILTER_LIST200_RESPONSE):
        models::ProductsByProductGroupFilterList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CatalogReports

Create a class that inherits from the generated base class:

```cpp
#include "api/CatalogReportsApi.h"

class CatalogReportsImpl : public Api::CatalogReports {
public:
    CatalogsreportsPostResponse handlePostForCatalogsreports(const CatalogsreportsPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogsReportParameters>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_CREATE_REPORT_RESPONSE):
        models::CatalogsCreateReportResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsreportsGetResponse handleGetForCatalogsreports(const CatalogsreportsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_token

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_REPORT):
        models::CatalogsReport successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsreportsstatsGetResponse handleGetForCatalogsreportsstats(const CatalogsreportsstatsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_parameters
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_REPORTS_STATS200_RESPONSE):
        models::ReportsStats200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CatalogSupplemental

Create a class that inherits from the generated base class:

```cpp
#include "api/CatalogSupplementalApi.h"

class CatalogSupplementalImpl : public Api::CatalogSupplemental {
public:
    CatalogscatalogIdlocalInventoryItemsbatchPostResponse handlePostForCatalogscatalogIdlocalInventoryItemsbatch(const CatalogscatalogIdlocalInventoryItemsbatchPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_catalogId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::LocalInventoryItemsBatchCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SUPPLEMENTAL_ITEMS_BATCH_RESPONSE):
        models::SupplementalItemsBatchResponse successResponse;
        // ... populate response ...
        return successResponse;
        // Return success response (HTTP HTTP_RESPONSE_CODE_LOCAL_INVENTORY_ITEMS_BATCH):
        models::LocalInventoryItemsBatch successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogscatalogIdlocalInventoryItemsqueryPostResponse handlePostForCatalogscatalogIdlocalInventoryItemsquery(const CatalogscatalogIdlocalInventoryItemsqueryPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_catalogId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::LocalInventoryItemsGetCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LOCAL_INVENTORY_ITEMS_GET):
        models::LocalInventoryItemsGet successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogscatalogIdlocalStoresPostResponse handlePostForCatalogscatalogIdlocalStores(const CatalogscatalogIdlocalStoresPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_catalogId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::LocalStoreCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_LOCAL_STORES_CREATE200_RESPONSE_INNER):
        models::CatalogsLocalStoresCreate200ResponseInner successResponse;
        // ... populate response ...
        return successResponse;
        // Return success response (HTTP HTTP_RESPONSE_CODE_LOCAL_STORE):
        models::LocalStore successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogscatalogIdlocalStoresDeleteResponse handleDeleteForCatalogscatalogIdlocalStores(const CatalogscatalogIdlocalStoresDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_catalogId
        // Query: params.m_ids
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_LOCAL_STORES_DELETE200_RESPONSE_INNER):
        models::CatalogsLocalStoresDelete200ResponseInner successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogscatalogIdlocalStoresGetResponse handleGetForCatalogscatalogIdlocalStores(const CatalogscatalogIdlocalStoresGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_catalogId
        // Query: params.m_ids (optional)
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_LOCAL_STORES_LIST200_RESPONSE):
        models::CatalogsLocalStoresList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogscatalogIdlocalStoresPatchResponse handlePatchForCatalogscatalogIdlocalStores(const CatalogscatalogIdlocalStoresPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_catalogId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::LocalStoreBatchUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_LOCAL_STORES_UPDATE200_RESPONSE_INNER):
        models::CatalogsLocalStoresUpdate200ResponseInner successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogscatalogIdsupplementalItemsbatchbatchIdGetResponse handleGetForCatalogscatalogIdsupplementalItemsbatchbatchId(const CatalogscatalogIdsupplementalItemsbatchbatchIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_catalogId
        // Path: params.m_batchId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SUPPLEMENTAL_ITEMS_BATCH_RESPONSE):
        models::SupplementalItemsBatchResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Catalogs

Create a class that inherits from the generated base class:

```cpp
#include "api/CatalogsApi.h"

class CatalogsImpl : public Api::Catalogs {
public:
    CatalogsavailableFilterValuesGetResponse handleGetForCatalogsavailableFilterValues(const CatalogsavailableFilterValuesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_catalogId
        // Query: params.m_feedId (optional)
        // Query: params.m_country (optional)
        // Query: params.m_language (optional)
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_AVAILABLE_FILTER_VALUES):
        models::CatalogsAvailableFilterValues successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsPostResponse handlePostForCatalogs(const CatalogsPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::CatalogCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOG):
        models::Catalog successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    CatalogsGetResponse handleGetForCatalogs(const CatalogsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CATALOGS_LIST200_RESPONSE):
        models::CatalogsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### ConversionDeletionRequests

Create a class that inherits from the generated base class:

```cpp
#include "api/ConversionDeletionRequestsApi.h"

class ConversionDeletionRequestsImpl : public Api::ConversionDeletionRequests {
public:
    AdAccountsadAccountIdconversionDeletionRequestsPostResponse handlePostForAdAccountsadAccountIdconversionDeletionRequests(const AdAccountsadAccountIdconversionDeletionRequestsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ConversionDeletionRequestCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_DELETION_REQUEST):
        models::ConversionDeletionRequest successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdconversionDeletionRequestsrequestIdDeleteResponse handleDeleteForAdAccountsadAccountIdconversionDeletionRequestsrequestId(const AdAccountsadAccountIdconversionDeletionRequestsrequestIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_requestId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_DELETION_REQUEST):
        models::ConversionDeletionRequest successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdconversionDeletionRequestsrequestIdGetResponse handleGetForAdAccountsadAccountIdconversionDeletionRequestsrequestId(const AdAccountsadAccountIdconversionDeletionRequestsrequestIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_requestId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_DELETION_REQUEST):
        models::ConversionDeletionRequest successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdconversionDeletionRequestsGetResponse handleGetForAdAccountsadAccountIdconversionDeletionRequests(const AdAccountsadAccountIdconversionDeletionRequestsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_DELETION_REQUEST_LIST200_RESPONSE):
        models::ConversionDeletionRequestList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### ConversionEqs

Create a class that inherits from the generated base class:

```cpp
#include "api/ConversionEqsApi.h"

class ConversionEqsImpl : public Api::ConversionEqs {
public:
    AdAccountsadAccountIdconversionEqsGetResponse handleGetForAdAccountsadAccountIdconversionEqs(const AdAccountsadAccountIdconversionEqsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_lookbackPeriod
        // Query: params.m_sourcePlatform (optional)
        // Query: params.m_ingestionSource (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_EVENT_QUALITY_SCORE):
        models::EventQualityScore successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### ConversionEvents

Create a class that inherits from the generated base class:

```cpp
#include "api/ConversionEventsApi.h"

class ConversionEventsImpl : public Api::ConversionEvents {
public:
    AdAccountsadAccountIdeventsPostResponse handlePostForAdAccountsadAccountIdevents(const AdAccountsadAccountIdeventsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_test (optional)
        // Body: params.m_request (std::optional<models::ConversionEventsCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_EVENTS):
        models::ConversionEvents successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_DETAILED_ERROR):
        // models::DetailedError errorResponse;
        // return errorResponse;
    }

};
```
#### ConversionTags

Create a class that inherits from the generated base class:

```cpp
#include "api/ConversionTagsApi.h"

class ConversionTagsImpl : public Api::ConversionTags {
public:
    AdAccountsadAccountIdconversionTagsPostResponse handlePostForAdAccountsadAccountIdconversionTags(const AdAccountsadAccountIdconversionTagsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ConversionTagCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_TAG):
        models::ConversionTag successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdconversionTagsconversionTagIdGetResponse handleGetForAdAccountsadAccountIdconversionTagsconversionTagId(const AdAccountsadAccountIdconversionTagsconversionTagIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_conversionTagId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_TAG):
        models::ConversionTag successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdconversionTagsGetResponse handleGetForAdAccountsadAccountIdconversionTags(const AdAccountsadAccountIdconversionTagsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_filterDeleted (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_TAGS_LIST200_RESPONSE):
        models::ConversionTagsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdconversionTagsocpmEligibleGetResponse handleGetForAdAccountsadAccountIdconversionTagsocpmEligible(const AdAccountsadAccountIdconversionTagsocpmEligibleGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_EVENT_RESPONSE):
        models::ConversionEventResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdconversionTagspageVisitGetResponse handleGetForAdAccountsadAccountIdconversionTagspageVisit(const AdAccountsadAccountIdconversionTagspageVisitGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PAGE_VISIT_CONVERSION_TAGS_GET200_RESPONSE):
        models::PageVisitConversionTagsGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Conversions

Create a class that inherits from the generated base class:

```cpp
#include "api/ConversionsApi.h"

class ConversionsImpl : public Api::Conversions {
public:
    AdAccountsadAccountIdadvertiserDefinedEventsPostResponse handlePostForAdAccountsadAccountIdadvertiserDefinedEvents(const AdAccountsadAccountIdadvertiserDefinedEventsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdvertiserDefinedEventsCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADVERTISER_DEFINED_EVENTS_CREATE200_RESPONSE):
        models::AdvertiserDefinedEventsCreate200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadvertiserDefinedEventsDeleteResponse handleDeleteForAdAccountsadAccountIdadvertiserDefinedEvents(const AdAccountsadAccountIdadvertiserDefinedEventsDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_eventNames

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADVERTISER_DEFINED_EVENTS_DELETE200_RESPONSE):
        models::AdvertiserDefinedEventsDelete200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadvertiserDefinedEventsGetResponse handleGetForAdAccountsadAccountIdadvertiserDefinedEvents(const AdAccountsadAccountIdadvertiserDefinedEventsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADVERTISER_DEFINED_EVENTS_GET200_RESPONSE):
        models::AdvertiserDefinedEventsGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdadvertiserDefinedEventsPatchResponse handlePatchForAdAccountsadAccountIdadvertiserDefinedEvents(const AdAccountsadAccountIdadvertiserDefinedEventsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::AdvertiserDefinedEventsCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADVERTISER_DEFINED_EVENTS_UPDATE200_RESPONSE):
        models::AdvertiserDefinedEventsUpdate200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CustomerListUploads

Create a class that inherits from the generated base class:

```cpp
#include "api/CustomerListUploadsApi.h"

class CustomerListUploadsImpl : public Api::CustomerListUploads {
public:
    AdAccountsadAccountIdcustomerListscustomerListIduploadsPostResponse handlePostForAdAccountsadAccountIdcustomerListscustomerListIduploads(const AdAccountsadAccountIdcustomerListscustomerListIduploadsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_customerListId
        // Body: params.m_request (std::optional<models::CustomerListUploadCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_LIST_UPLOAD_CREATE_RESPONSE):
        models::CustomerListUploadCreateResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcustomerListscustomerListIduploadscustomerListUploadIdGetResponse handleGetForAdAccountsadAccountIdcustomerListscustomerListIduploadscustomerListUploadId(const AdAccountsadAccountIdcustomerListscustomerListIduploadscustomerListUploadIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_customerListId
        // Path: params.m_customerListUploadId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_LIST_UPLOAD):
        models::CustomerListUpload successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcustomerListscustomerListIduploadscustomerListUploadIdrunPostResponse handlePostForAdAccountsadAccountIdcustomerListscustomerListIduploadscustomerListUploadIdrun(const AdAccountsadAccountIdcustomerListscustomerListIduploadscustomerListUploadIdrunPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_customerListId
        // Path: params.m_customerListUploadId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_LIST_UPLOAD):
        models::CustomerListUpload successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CustomerLists

Create a class that inherits from the generated base class:

```cpp
#include "api/CustomerListsApi.h"

class CustomerListsImpl : public Api::CustomerLists {
public:
    AdAccountsadAccountIdcustomerListsPostResponse handlePostForAdAccountsadAccountIdcustomerLists(const AdAccountsadAccountIdcustomerListsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::CustomerListCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_LIST):
        models::CustomerList successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcustomerListscustomerListIdGetResponse handleGetForAdAccountsadAccountIdcustomerListscustomerListId(const AdAccountsadAccountIdcustomerListscustomerListIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_customerListId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_LIST):
        models::CustomerList successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcustomerListsGetResponse handleGetForAdAccountsadAccountIdcustomerLists(const AdAccountsadAccountIdcustomerListsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_excludeNca (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_LISTS_LIST200_RESPONSE):
        models::CustomerListsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcustomerListscustomerListIdPatchResponse handlePatchForAdAccountsadAccountIdcustomerListscustomerListId(const AdAccountsadAccountIdcustomerListscustomerListIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_customerListId
        // Body: params.m_request (std::optional<models::CustomerListUpdateWithRequiredBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_LIST):
        models::CustomerList successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### CustomerSegment

Create a class that inherits from the generated base class:

```cpp
#include "api/CustomerSegmentApi.h"

class CustomerSegmentImpl : public Api::CustomerSegment {
public:
    AdAccountsadAccountIdcustomerSegmentsPostResponse handlePostForAdAccountsadAccountIdcustomerSegments(const AdAccountsadAccountIdcustomerSegmentsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::CustomerSegmentCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_SEGMENT):
        models::CustomerSegment successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcustomerSegmentsGetResponse handleGetForAdAccountsadAccountIdcustomerSegments(const AdAccountsadAccountIdcustomerSegmentsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_includeSizing (optional)
        // Query: params.m_searchQuery (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CUSTOMER_SEGMENT_LIST200_RESPONSE):
        models::CustomerSegmentList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdcustomerSegmentsPatchResponse handlePatchForAdAccountsadAccountIdcustomerSegments(const AdAccountsadAccountIdcustomerSegmentsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::CustomerSegmentUpdateRequestUpdateWithRequiredBody>)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Integrations

Create a class that inherits from the generated base class:

```cpp
#include "api/IntegrationsApi.h"

class IntegrationsImpl : public Api::Integrations {
public:
    IntegrationscommerceexternalBusinessIdDeleteResponse handleDeleteForIntegrationscommerceexternalBusinessId(const IntegrationscommerceexternalBusinessIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_externalBusinessId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INTEGRATION_METADATA):
        models::IntegrationMetadata successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    IntegrationscommerceexternalBusinessIdGetResponse handleGetForIntegrationscommerceexternalBusinessId(const IntegrationscommerceexternalBusinessIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_externalBusinessId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INTEGRATION_METADATA):
        models::IntegrationMetadata successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    IntegrationscommerceexternalBusinessIdPatchResponse handlePatchForIntegrationscommerceexternalBusinessId(const IntegrationscommerceexternalBusinessIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_externalBusinessId
        // Body: params.m_request (std::optional<models::IntegrationMetadataUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INTEGRATION_METADATA):
        models::IntegrationMetadata successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    IntegrationscommercePostResponse handlePostForIntegrationscommerce(const IntegrationscommercePostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::IntegrationMetadataCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INTEGRATION_METADATA):
        models::IntegrationMetadata successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    IntegrationslogsPostResponse handlePostForIntegrationslogs(const IntegrationslogsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::IntegrationLogsRequestCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INTEGRATION_LOGS_SUCCESS_RESPONSE):
        models::IntegrationLogsSuccessResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_INTEGRATION_LOGS_INVALID_LOG_RESPONSE):
        // models::IntegrationLogsInvalidLogResponse errorResponse;
        // return errorResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    IntegrationsidGetResponse handleGetForIntegrationsid(const IntegrationsidGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_id

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INTEGRATION_RECORD):
        models::IntegrationRecord successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    IntegrationsGetResponse handleGetForIntegrations(const IntegrationsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INTEGRATIONS_GET_LIST200_RESPONSE):
        models::IntegrationsGetList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Keywords

Create a class that inherits from the generated base class:

```cpp
#include "api/KeywordsApi.h"

class KeywordsImpl : public Api::Keywords {
public:
    AdAccountsadAccountIdkeywordsmetricsGetResponse handleGetForAdAccountsadAccountIdkeywordsmetrics(const AdAccountsadAccountIdkeywordsmetricsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_countryCode
        // Query: params.m_keywords

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_KEYWORDS_METRICS_ARRAY_RESPONSE):
        models::KeywordsMetricsArrayResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdkeywordsPostResponse handlePostForAdAccountsadAccountIdkeywords(const AdAccountsadAccountIdkeywordsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::KeywordsCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_KEYWORDS):
        models::Keywords successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdkeywordsGetResponse handleGetForAdAccountsadAccountIdkeywords(const AdAccountsadAccountIdkeywordsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_campaignId (optional)
        // Query: params.m_adGroupId (optional)
        // Query: params.m_adGroupIds (optional)
        // Query: params.m_matchTypes (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_KEYWORDS_GET200_RESPONSE):
        models::KeywordsGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdkeywordsPatchResponse handlePatchForAdAccountsadAccountIdkeywords(const AdAccountsadAccountIdkeywordsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::KeywordsUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_KEYWORDS):
        models::Keywords successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    TrendskeywordsregiontoptrendTypeGetResponse handleGetForTrendskeywordsregiontoptrendType(const TrendskeywordsregiontoptrendTypeGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_region
        // Path: params.m_trendType
        // Query: params.m_interests (optional)
        // Query: params.m_genders (optional)
        // Query: params.m_ages (optional)
        // Query: params.m_includeKeywords (optional)
        // Query: params.m_normalizeAgainstGroup (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_includeDemographics (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TRENDING_KEYWORDS_RESPONSE):
        models::TrendingKeywordsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Labels

Create a class that inherits from the generated base class:

```cpp
#include "api/LabelsApi.h"

class LabelsImpl : public Api::Labels {
public:
    AdAccountsadAccountIdlabelslabelIdapplyPostResponse handlePostForAdAccountsadAccountIdlabelslabelIdapply(const AdAccountsadAccountIdlabelslabelIdapplyPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_labelId
        // Body: params.m_request (std::optional<models::LabeledEntitiesCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LABELED_ENTITIES):
        models::LabeledEntities successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdlabelsPostResponse handlePostForAdAccountsadAccountIdlabels(const AdAccountsadAccountIdlabelsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::LabelCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LABELS_RESPONSE):
        models::LabelsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdlabelsGetResponse handleGetForAdAccountsadAccountIdlabels(const AdAccountsadAccountIdlabelsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_campaignIds (optional)
        // Query: params.m_labelIds (optional)
        // Query: params.m_entityStatuses (optional)
        // Query: params.m_labelTypes (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LABELS_LIST200_RESPONSE):
        models::LabelsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdlabelslabelIdremovePostResponse handlePostForAdAccountsadAccountIdlabelslabelIdremove(const AdAccountsadAccountIdlabelslabelIdremovePostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_labelId
        // Body: params.m_request (std::optional<models::LabeledEntitiesCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LABELED_ENTITIES):
        models::LabeledEntities successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdlabelsPatchResponse handlePatchForAdAccountsadAccountIdlabels(const AdAccountsadAccountIdlabelsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::LabelUpdateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LABELS_RESPONSE):
        models::LabelsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### LeadAds

Create a class that inherits from the generated base class:

```cpp
#include "api/LeadAdsApi.h"

class LeadAdsImpl : public Api::LeadAds {
public:
    AdAccountsadAccountIdleadssubscriptionssubscriptionIdDeleteResponse handleDeleteForAdAccountsadAccountIdleadssubscriptionssubscriptionId(const AdAccountsadAccountIdleadssubscriptionssubscriptionIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_subscriptionId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_SUBSCRIPTION):
        models::LeadSubscription successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadssubscriptionssubscriptionIdGetResponse handleGetForAdAccountsadAccountIdleadssubscriptionssubscriptionId(const AdAccountsadAccountIdleadssubscriptionssubscriptionIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_subscriptionId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_SUBSCRIPTION):
        models::LeadSubscription successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadssubscriptionsGetResponse handleGetForAdAccountsadAccountIdleadssubscriptions(const AdAccountsadAccountIdleadssubscriptionsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNTS_SUBSCRIPTIONS_GET_LIST200_RESPONSE):
        models::AdAccountsSubscriptionsGetList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadssubscriptionsPostResponse handlePostForAdAccountsadAccountIdleadssubscriptions(const AdAccountsadAccountIdleadssubscriptionsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::LeadSubscriptionPostParamsCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_SUBSCRIPTION):
        models::LeadSubscription successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### LeadForms

Create a class that inherits from the generated base class:

```cpp
#include "api/LeadFormsApi.h"

class LeadFormsImpl : public Api::LeadForms {
public:
    AdAccountsadAccountIdleadFormsleadFormIdtestPostResponse handlePostForAdAccountsadAccountIdleadFormsleadFormIdtest(const AdAccountsadAccountIdleadFormsleadFormIdtestPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_leadFormId
        // Body: params.m_request (std::optional<models::LeadFormTestCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_FORM_TEST):
        models::LeadFormTest successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadFormsleadFormIdGetResponse handleGetForAdAccountsadAccountIdleadFormsleadFormId(const AdAccountsadAccountIdleadFormsleadFormIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_leadFormId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_FORM):
        models::LeadForm successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadFormsPostResponse handlePostForAdAccountsadAccountIdleadForms(const AdAccountsadAccountIdleadFormsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::LeadFormCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_FORMS_CREATE200_RESPONSE):
        models::LeadFormsCreate200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadFormsGetResponse handleGetForAdAccountsadAccountIdleadForms(const AdAccountsadAccountIdleadFormsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_FORMS_LIST200_RESPONSE):
        models::LeadFormsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadFormsPatchResponse handlePatchForAdAccountsadAccountIdleadForms(const AdAccountsadAccountIdleadFormsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::LeadFormBatchUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEAD_FORMS_UPDATE200_RESPONSE):
        models::LeadFormsUpdate200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### LeadsExport

Create a class that inherits from the generated base class:

```cpp
#include "api/LeadsExportApi.h"

class LeadsExportImpl : public Api::LeadsExport {
public:
    AdAccountsadAccountIdleadsExportPostResponse handlePostForAdAccountsadAccountIdleadsExport(const AdAccountsadAccountIdleadsExportPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::LeadsExportsCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEADS_EXPORTS):
        models::LeadsExports successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdleadsExportleadsExportIdGetResponse handleGetForAdAccountsadAccountIdleadsExportleadsExportId(const AdAccountsadAccountIdleadsExportleadsExportIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_leadsExportId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LEADS_EXPORT_RESPONSE_DATA):
        models::LeadsExportResponseData successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Media

Create a class that inherits from the generated base class:

```cpp
#include "api/MediaApi.h"

class MediaImpl : public Api::Media {
public:
    MediaPostResponse handlePostForMedia(const MediaPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::MediaUploadCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MEDIA_UPLOAD):
        models::MediaUpload successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    MediamediaIdGetResponse handleGetForMediamediaId(const MediamediaIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_mediaId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MEDIA):
        models::Media successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    MediaGetResponse handleGetForMedia(const MediaGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MEDIA_LIST200_RESPONSE):
        models::MediaList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### MsotEvents

Create a class that inherits from the generated base class:

```cpp
#include "api/MsotEventsApi.h"

class MsotEventsImpl : public Api::MsotEvents {
public:
    AdAccountsadAccountIdmsoteventsPostResponse handlePostForAdAccountsadAccountIdmsotevents(const AdAccountsadAccountIdmsoteventsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ConversionMSOTEventsCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_OBJECT):
        nlohmann::json successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Notification

Create a class that inherits from the generated base class:

```cpp
#include "api/NotificationApi.h"

class NotificationImpl : public Api::Notification {
public:
    NotificationsPostResponse handlePostForNotifications(const NotificationsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::NotificationPostRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_NOTIFICATION_RESPONSE):
        models::NotificationResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Oauth

Create a class that inherits from the generated base class:

```cpp
#include "api/OauthApi.h"

class OauthImpl : public Api::Oauth {
public:
    OauthconversionTokenPostResponse handlePostForOauthconversionToken() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CONVERSION_ACCESS_TOKEN):
        models::ConversionAccessToken successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    OauthtokenPostResponse handlePostForOauthtoken() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_OAUTH_ACCESS_TOKEN):
        models::OauthAccessToken successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    OauthtokenrevokePostResponse handlePostForOauthtokenrevoke() override {

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### OrderLines

Create a class that inherits from the generated base class:

```cpp
#include "api/OrderLinesApi.h"

class OrderLinesImpl : public Api::OrderLines {
public:
    AdAccountsadAccountIdorderLinesorderLineIdGetResponse handleGetForAdAccountsadAccountIdorderLinesorderLineId(const AdAccountsadAccountIdorderLinesorderLineIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_orderLineId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ORDER_LINE):
        models::OrderLine successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdorderLinesGetResponse handleGetForAdAccountsadAccountIdorderLines(const AdAccountsadAccountIdorderLinesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ORDER_LINES_LIST200_RESPONSE):
        models::OrderLinesList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Pins

Create a class that inherits from the generated base class:

```cpp
#include "api/PinsApi.h"

class PinsImpl : public Api::Pins {
public:
    PinsanalyticsGetResponse handleGetForPinsanalytics(const PinsanalyticsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_pinIds
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_appTypes (optional)
        // Query: params.m_metricTypes
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PIN_ANALYTICS_METRICS_RESPONSE):
        models::PinAnalyticsMetricsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinspinIdanalyticsGetResponse handleGetForPinspinIdanalytics(const PinspinIdanalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_appTypes (optional)
        // Query: params.m_metricTypes
        // Query: params.m_splitField (optional)
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PIN_ANALYTICS_METRICS_RESPONSE):
        models::PinAnalyticsMetricsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinsPostResponse handlePostForPins(const PinsPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::PinCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PIN):
        models::Pin successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinspinIdDeleteResponse handleDeleteForPinspinId(const PinspinIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PIN):
        models::Pin successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinspinIdGetResponse handleGetForPinspinId(const PinspinIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId
        // Query: params.m_adAccountId (optional)
        // Query: params.m_pinMetrics (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PIN):
        models::Pin successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinsGetResponse handleGetForPins(const PinsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_pinFilter (optional)
        // Query: params.m_pinMetrics (optional)
        // Query: params.m_includeProtectedPins (optional)
        // Query: params.m_pinType (optional)
        // Query: params.m_creativeTypes (optional)
        // Query: params.m_adAccountId (optional)
        // Query: params.m_domain (optional)
        // Query: params.m_domains (optional)
        // Query: params.m_includeProductTagObj (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PINS_LIST200_RESPONSE):
        models::PinsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinspinIdsavePostResponse handlePostForPinspinIdsave(const PinspinIdsavePostRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::PinsSaveRequestCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PIN):
        models::Pin successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinspinIdPatchResponse handlePatchForPinspinId(const PinspinIdPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::PinUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PIN):
        models::Pin successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### ProductGroupPromotions

Create a class that inherits from the generated base class:

```cpp
#include "api/ProductGroupPromotionsApi.h"

class ProductGroupPromotionsImpl : public Api::ProductGroupPromotions {
public:
    AdAccountsadAccountIdproductGroupPromotionsPostResponse handlePostForAdAccountsadAccountIdproductGroupPromotions(const AdAccountsadAccountIdproductGroupPromotionsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ProductGroupPromotionsCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_GROUP_PROMOTIONS):
        models::ProductGroupPromotions successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdproductGroupPromotionsproductGroupPromotionIdGetResponse handleGetForAdAccountsadAccountIdproductGroupPromotionsproductGroupPromotionId(const AdAccountsadAccountIdproductGroupPromotionsproductGroupPromotionIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Path: params.m_productGroupPromotionId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_GROUP_PROMOTION):
        models::ProductGroupPromotion successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdproductGroupPromotionsGetResponse handleGetForAdAccountsadAccountIdproductGroupPromotions(const AdAccountsadAccountIdproductGroupPromotionsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_productGroupPromotionIds (optional)
        // Query: params.m_entityStatuses (optional)
        // Query: params.m_adGroupId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_GROUP_PROMOTIONS_LIST200_RESPONSE):
        models::ProductGroupPromotionsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdproductGroupPromotionsPatchResponse handlePatchForAdAccountsadAccountIdproductGroupPromotions(const AdAccountsadAccountIdproductGroupPromotionsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ProductGroupPromotionsUpdateWithRequiredBody>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_GROUP_PROMOTIONS):
        models::ProductGroupPromotions successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdproductGroupsanalyticsGetResponse handleGetForAdAccountsadAccountIdproductGroupsanalytics(const AdAccountsadAccountIdproductGroupsanalyticsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_productGroupIds
        // Query: params.m_columns
        // Query: params.m_granularity
        // Query: params.m_clickWindowDays (optional)
        // Query: params.m_engagementWindowDays (optional)
        // Query: params.m_viewWindowDays (optional)
        // Query: params.m_conversionReportTime (optional)
        // Query: params.m_reportingTimezone (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_GROUP_ANALYTICS_ITEMS):
        models::ProductGroupAnalyticsItems successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### ProductTags

Create a class that inherits from the generated base class:

```cpp
#include "api/ProductTagsApi.h"

class ProductTagsImpl : public Api::ProductTags {
public:
    PinspinIdproductTagsPostResponse handlePostForPinspinIdproductTags(const PinspinIdproductTagsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId
        // Body: params.m_request (std::optional<models::ProductTagsBulkAddRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_TAGS_RESPONSE):
        models::ProductTagsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRODUCT_TAGS_ERROR):
        // models::ProductTagsError errorResponse;
        // return errorResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinspinIdproductTagsbulkDeletePostResponse handlePostForPinspinIdproductTagsbulkDelete(const PinspinIdproductTagsbulkDeletePostRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId
        // Body: params.m_request (std::optional<models::ProductTagsBulkDeleteRequest>)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    PinspinIdproductTagsGetResponse handleGetForPinspinIdproductTags(const PinspinIdproductTagsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_pinId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_TAGS_RESPONSE):
        models::ProductTagsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Promotions

Create a class that inherits from the generated base class:

```cpp
#include "api/PromotionsApi.h"

class PromotionsImpl : public Api::Promotions {
public:
    AdAccountsadAccountIdpromotionsPostResponse handlePostForAdAccountsadAccountIdpromotions(const AdAccountsadAccountIdpromotionsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::PromotionCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROMOTIONS_RESPONSE):
        models::PromotionsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdpromotionspromotionIdDeleteResponse handleDeleteForAdAccountsadAccountIdpromotionspromotionId(const AdAccountsadAccountIdpromotionspromotionIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_promotionId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROMOTION):
        models::Promotion successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdpromotionspromotionIdGetResponse handleGetForAdAccountsadAccountIdpromotionspromotionId(const AdAccountsadAccountIdpromotionspromotionIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_promotionId
        // Path: params.m_adAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROMOTION):
        models::Promotion successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdpromotionsGetResponse handleGetForAdAccountsadAccountIdpromotions(const AdAccountsadAccountIdpromotionsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROMOTIONS_LIST200_RESPONSE):
        models::PromotionsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdpromotionsPatchResponse handlePatchForAdAccountsadAccountIdpromotions(const AdAccountsadAccountIdpromotionsPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::PromotionBatchUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROMOTIONS_RESPONSE):
        models::PromotionsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Resources

Create a class that inherits from the generated base class:

```cpp
#include "api/ResourcesApi.h"

class ResourcesImpl : public Api::Resources {
public:
    ResourcesadAccountCountriesGetResponse handleGetForResourcesadAccountCountries() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_AD_ACCOUNT_COUNTRIES_GET200_RESPONSE):
        models::AdAccountCountriesGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    ResourcesdeliveryMetricsGetResponse handleGetForResourcesdeliveryMetrics(const ResourcesdeliveryMetricsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_reportType (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELIVERY_METRICS_GET200_RESPONSE):
        models::DeliveryMetricsGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    ResourcestargetinginterestsinterestIdGetResponse handleGetForResourcestargetinginterestsinterestId(const ResourcestargetinginterestsinterestIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_interestId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SINGLE_INTEREST_TARGETING_OPTION):
        models::SingleInterestTargetingOption successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    ResourcesleadFormQuestionsGetResponse handleGetForResourcesleadFormQuestions() override {

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    ResourcesmetricsReadyStateGetResponse handleGetForResourcesmetricsReadyState(const ResourcesmetricsReadyStateGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_date

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOOK_CLOSED):
        models::BookClosed successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    ResourcestargetingtargetingTypeGetResponse handleGetForResourcestargetingtargetingType(const ResourcestargetingtargetingTypeGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_targetingType
        // Query: params.m_adAccountId (optional)
        // Query: params.m_clientId (optional)
        // Query: params.m_oauthSignature (optional)
        // Query: params.m_timestamp (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_OBJECT):
        nlohmann::json successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Schedules

Create a class that inherits from the generated base class:

```cpp
#include "api/SchedulesApi.h"

class SchedulesImpl : public Api::Schedules {
public:
    AdAccountsadAccountIdschedulesPostResponse handlePostForAdAccountsadAccountIdschedules(const AdAccountsadAccountIdschedulesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ScheduleCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SCHEDULES_CREATE200_RESPONSE_INNER):
        models::SchedulesCreate200ResponseInner successResponse;
        // ... populate response ...
        return successResponse;
        // Return success response (HTTP HTTP_RESPONSE_CODE_SCHEDULE):
        models::Schedule successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdschedulesGetResponse handleGetForAdAccountsadAccountIdschedules(const AdAccountsadAccountIdschedulesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_scheduleStatuses (optional)
        // Query: params.m_scheduleType (optional)
        // Query: params.m_entityIds

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SCHEDULES_LIST200_RESPONSE):
        models::SchedulesList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdschedulesPatchResponse handlePatchForAdAccountsadAccountIdschedules(const AdAccountsadAccountIdschedulesPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::ScheduleBatchUpdate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SCHEDULES_UPDATE200_RESPONSE_INNER):
        models::SchedulesUpdate200ResponseInner successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Search

Create a class that inherits from the generated base class:

```cpp
#include "api/SearchApi.h"

class SearchImpl : public Api::Search {
public:
    SearchpartnerpinsGetResponse handleGetForSearchpartnerpins(const SearchpartnerpinsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_term
        // Query: params.m_countryCode
        // Query: params.m_bookmark (optional)
        // Query: params.m_locale (optional)
        // Query: params.m_limit (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SEARCH_PARTNER_PINS200_RESPONSE):
        models::SearchPartnerPins200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    SearchboardsGetResponse handleGetForSearchboards(const SearchboardsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_query (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SEARCH_USER_BOARDS_GET200_RESPONSE):
        models::SearchUserBoardsGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    SearchpinsGetResponse handleGetForSearchpins(const SearchpinsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_query
        // Query: params.m_bookmark (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SEARCH_USER_PINS_LIST200_RESPONSE):
        models::SearchUserPinsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### TargetingTemplate

Create a class that inherits from the generated base class:

```cpp
#include "api/TargetingTemplateApi.h"

class TargetingTemplateImpl : public Api::TargetingTemplate {
public:
    AdAccountsadAccountIdtargetingTemplatesPostResponse handlePostForAdAccountsadAccountIdtargetingTemplates(const AdAccountsadAccountIdtargetingTemplatesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::TargetingTemplateCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TARGETING_TEMPLATE):
        models::TargetingTemplate successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdtargetingTemplatesGetResponse handleGetForAdAccountsadAccountIdtargetingTemplates(const AdAccountsadAccountIdtargetingTemplatesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)
        // Query: params.m_order (optional)
        // Query: params.m_includeSizing (optional)
        // Query: params.m_searchQuery (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TARGETING_TEMPLATE_LIST200_RESPONSE):
        models::TargetingTemplateList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    AdAccountsadAccountIdtargetingTemplatesPatchResponse handlePatchForAdAccountsadAccountIdtargetingTemplates(const AdAccountsadAccountIdtargetingTemplatesPatchRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Body: params.m_request (std::optional<models::TargetingTemplateUpdateRequestReadOrUpdate>)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Terms

Create a class that inherits from the generated base class:

```cpp
#include "api/TermsApi.h"

class TermsImpl : public Api::Terms {
public:
    TermsrelatedGetResponse handleGetForTermsrelated(const TermsrelatedGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_terms

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RELATED_TERMS):
        models::RelatedTerms successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    TermssuggestedGetResponse handleGetForTermssuggested(const TermssuggestedGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_term
        // Query: params.m_limit (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        std::string successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### TermsOfService

Create a class that inherits from the generated base class:

```cpp
#include "api/TermsOfServiceApi.h"

class TermsOfServiceImpl : public Api::TermsOfService {
public:
    AdAccountsadAccountIdtermsOfServiceGetResponse handleGetForAdAccountsadAccountIdtermsOfService(const AdAccountsadAccountIdtermsOfServiceGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_adAccountId
        // Query: params.m_includeHtml (optional)
        // Query: params.m_tosType (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TERMS_OF_SERVICE):
        models::TermsOfService successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### Trends

Create a class that inherits from the generated base class:

```cpp
#include "api/TrendsApi.h"

class TrendsImpl : public Api::Trends {
public:
    TrendseditorialArticlesGetResponse handleGetForTrendseditorialArticles(const TrendseditorialArticlesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_region

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TRENDS_EDITORIAL):
        models::TrendsEditorial successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    TrendstopicsfeaturedGetResponse handleGetForTrendstopicsfeatured(const TrendstopicsfeaturedGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_interest (optional)
        // Query: params.m_region

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FEATURED_TREND):
        models::FeaturedTrend successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    TrendsproductCategoriesdetailsGetResponse handleGetForTrendsproductCategoriesdetails(const TrendsproductCategoriesdetailsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_productCategories
        // Query: params.m_region
        // Query: params.m_lookbackWindow (optional)
        // Query: params.m_engagementType (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRODUCT_CATEGORY_DETAILS):
        models::ProductCategoryDetails successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    TrendsproductCategoriestrendingGetResponse handleGetForTrendsproductCategoriestrending(const TrendsproductCategoriestrendingGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_region
        // Query: params.m_verticals (optional)
        // Query: params.m_ages (optional)
        // Query: params.m_genders (optional)
        // Query: params.m_engagementType (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TRENDING_PRODUCT_CATEGORY):
        models::TrendingProductCategory successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```
#### UserAccount

Create a class that inherits from the generated base class:

```cpp
#include "api/UserAccountApi.h"

class UserAccountImpl : public Api::UserAccount {
public:
    UserAccountfollowingboardsGetResponse handleGetForUserAccountfollowingboards(const UserAccountfollowingboardsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_explicitFollowing (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BOARDS_USER_FOLLOWS_LIST200_RESPONSE):
        models::BoardsUserFollowsList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountfollowingusernamePostResponse handlePostForUserAccountfollowingusername(const UserAccountfollowingusernamePostRequest& params) override {
        // Access request parameters:
        // Path: params.m_username
        // Body: params.m_request (std::optional<models::FollowUserCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FOLLOW_USER):
        models::FollowUser successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountfollowersGetResponse handleGetForUserAccountfollowers(const UserAccountfollowersGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FOLLOWERS_LIST200_RESPONSE):
        models::FollowersList200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountbusinessesGetResponse handleGetForUserAccountbusinesses() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LINKED_BUSINESS):
        models::LinkedBusiness successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountwebsitesDeleteResponse handleDeleteForUserAccountwebsites(const UserAccountwebsitesDeleteRequest& params) override {
        // Access request parameters:
        // Query: params.m_website

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_WEBSITE):
        models::UserWebsite successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountanalyticsGetResponse handleGetForUserAccountanalytics(const UserAccountanalyticsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_fromClaimedContent (optional)
        // Query: params.m_pinFormat (optional)
        // Query: params.m_appTypes (optional)
        // Query: params.m_contentType (optional)
        // Query: params.m_source (optional)
        // Query: params.m_metricTypes (optional)
        // Query: params.m_splitField (optional)
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ANALYTICS_METRICS_RESPONSE):
        models::AnalyticsMetricsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountanalyticstopPinsGetResponse handleGetForUserAccountanalyticstopPins(const UserAccountanalyticstopPinsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_sortBy
        // Query: params.m_fromClaimedContent (optional)
        // Query: params.m_pinFormat (optional)
        // Query: params.m_appTypes (optional)
        // Query: params.m_contentType (optional)
        // Query: params.m_source (optional)
        // Query: params.m_metricTypes (optional)
        // Query: params.m_numOfPins (optional)
        // Query: params.m_createdInLastNDays (optional)
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TOP_PINS_ANALYTICS_RESPONSE):
        models::TopPinsAnalyticsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountanalyticstopVideoPinsGetResponse handleGetForUserAccountanalyticstopVideoPins(const UserAccountanalyticstopVideoPinsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startDate
        // Query: params.m_endDate
        // Query: params.m_sortBy
        // Query: params.m_fromClaimedContent (optional)
        // Query: params.m_pinFormat (optional)
        // Query: params.m_appTypes (optional)
        // Query: params.m_contentType (optional)
        // Query: params.m_source (optional)
        // Query: params.m_metricTypes (optional)
        // Query: params.m_numOfPins (optional)
        // Query: params.m_createdInLastNDays (optional)
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TOP_VIDEO_PINS_ANALYTICS_RESPONSE):
        models::TopVideoPinsAnalyticsResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UsersusernameinterestsfollowGetResponse handleGetForUsersusernameinterestsfollow(const UsersusernameinterestsfollowGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_username
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_ACCOUNT_FOLLOWED_INTERESTS200_RESPONSE):
        models::UserAccountFollowedInterests200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountGetResponse handleGetForUserAccount(const UserAccountGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ACCOUNT):
        models::Account successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountfollowingGetResponse handleGetForUserAccountfollowing(const UserAccountfollowingGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Query: params.m_explicitFollowing (optional)
        // Query: params.m_feedType (optional)
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_FOLLOWING_GET200_RESPONSE):
        models::UserFollowingGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountwebsitesGetResponse handleGetForUserAccountwebsites(const UserAccountwebsitesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_bookmark (optional)
        // Query: params.m_pageSize (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_WEBSITES_GET200_RESPONSE):
        models::UserWebsitesGet200Response successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountwebsitesPostResponse handlePostForUserAccountwebsites(const UserAccountwebsitesPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)
        // Body: params.m_request (std::optional<models::UserWebsiteCreate>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_WEBSITE):
        models::UserWebsite successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

    UserAccountwebsitesverificationGetResponse handleGetForUserAccountwebsitesverification(const UserAccountwebsitesverificationGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_adAccountId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_WEBSITE_VERIFICATION):
        models::UserWebsiteVerification successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PINTEREST/LIB/ERROR):
        // models::Pinterest.Lib.Error errorResponse;
        // return errorResponse;
    }

};
```

## Running the Server

Here's a complete example of setting up and running the server:

```cpp
#include <httplib.h>
#include <memory>

#include "api/AdAccountsApi.h"

#include "api/AdGroupsApi.h"

#include "api/AdsApi.h"

#include "api/AdvancedAuctionApi.h"

#include "api/AudienceInsightsApi.h"

#include "api/AudienceSharingApi.h"

#include "api/AudiencesApi.h"

#include "api/BillingApi.h"

#include "api/BoardsApi.h"

#include "api/BulkApi.h"

#include "api/BusinessAccessAssetsApi.h"

#include "api/BusinessAccessInviteApi.h"

#include "api/BusinessAccessRelationshipsApi.h"

#include "api/CampaignsApi.h"

#include "api/CatalogFeedsApi.h"

#include "api/CatalogItemsApi.h"

#include "api/CatalogProductGroupsApi.h"

#include "api/CatalogReportsApi.h"

#include "api/CatalogSupplementalApi.h"

#include "api/CatalogsApi.h"

#include "api/ConversionDeletionRequestsApi.h"

#include "api/ConversionEqsApi.h"

#include "api/ConversionEventsApi.h"

#include "api/ConversionTagsApi.h"

#include "api/ConversionsApi.h"

#include "api/CustomerListUploadsApi.h"

#include "api/CustomerListsApi.h"

#include "api/CustomerSegmentApi.h"

#include "api/IntegrationsApi.h"

#include "api/KeywordsApi.h"

#include "api/LabelsApi.h"

#include "api/LeadAdsApi.h"

#include "api/LeadFormsApi.h"

#include "api/LeadsExportApi.h"

#include "api/MediaApi.h"

#include "api/MsotEventsApi.h"

#include "api/NotificationApi.h"

#include "api/OauthApi.h"

#include "api/OrderLinesApi.h"

#include "api/PinsApi.h"

#include "api/ProductGroupPromotionsApi.h"

#include "api/ProductTagsApi.h"

#include "api/PromotionsApi.h"

#include "api/ResourcesApi.h"

#include "api/SchedulesApi.h"

#include "api/SearchApi.h"

#include "api/TargetingTemplateApi.h"

#include "api/TermsApi.h"

#include "api/TermsOfServiceApi.h"

#include "api/TrendsApi.h"

#include "api/UserAccountApi.h"

#include "api/AuthenticationManager.h"

int main() {
    httplib::Server server;

    // Create authentication manager (required for this API)
    auto authMgr = std::make_shared<MyAuthManager>();

    // Create API implementations

    AdAccountsImpl adAccounts;

    AdGroupsImpl adGroups;

    AdsImpl ads;

    AdvancedAuctionImpl advancedAuction;

    AudienceInsightsImpl audienceInsights;

    AudienceSharingImpl audienceSharing;

    AudiencesImpl audiences;

    BillingImpl billing;

    BoardsImpl boards;

    BulkImpl bulk;

    BusinessAccessAssetsImpl businessAccessAssets;

    BusinessAccessInviteImpl businessAccessInvite;

    BusinessAccessRelationshipsImpl businessAccessRelationships;

    CampaignsImpl campaigns;

    CatalogFeedsImpl catalogFeeds;

    CatalogItemsImpl catalogItems;

    CatalogProductGroupsImpl catalogProductGroups;

    CatalogReportsImpl catalogReports;

    CatalogSupplementalImpl catalogSupplemental;

    CatalogsImpl catalogs;

    ConversionDeletionRequestsImpl conversionDeletionRequests;

    ConversionEqsImpl conversionEqs;

    ConversionEventsImpl conversionEvents;

    ConversionTagsImpl conversionTags;

    ConversionsImpl conversions;

    CustomerListUploadsImpl customerListUploads;

    CustomerListsImpl customerLists;

    CustomerSegmentImpl customerSegment;

    IntegrationsImpl integrations;

    KeywordsImpl keywords;

    LabelsImpl labels;

    LeadAdsImpl leadAds;

    LeadFormsImpl leadForms;

    LeadsExportImpl leadsExport;

    MediaImpl media;

    MsotEventsImpl msotEvents;

    NotificationImpl notification;

    OauthImpl oauth;

    OrderLinesImpl orderLines;

    PinsImpl pins;

    ProductGroupPromotionsImpl productGroupPromotions;

    ProductTagsImpl productTags;

    PromotionsImpl promotions;

    ResourcesImpl resources;

    SchedulesImpl schedules;

    SearchImpl search;

    TargetingTemplateImpl targetingTemplate;

    TermsImpl terms;

    TermsOfServiceImpl termsOfService;

    TrendsImpl trends;

    UserAccountImpl userAccount;


    // Register routes

    adAccounts.registerRoutes(server, authMgr);

    adGroups.registerRoutes(server, authMgr);

    ads.registerRoutes(server, authMgr);

    advancedAuction.registerRoutes(server, authMgr);

    audienceInsights.registerRoutes(server, authMgr);

    audienceSharing.registerRoutes(server, authMgr);

    audiences.registerRoutes(server, authMgr);

    billing.registerRoutes(server, authMgr);

    boards.registerRoutes(server, authMgr);

    bulk.registerRoutes(server, authMgr);

    businessAccessAssets.registerRoutes(server, authMgr);

    businessAccessInvite.registerRoutes(server, authMgr);

    businessAccessRelationships.registerRoutes(server, authMgr);

    campaigns.registerRoutes(server, authMgr);

    catalogFeeds.registerRoutes(server, authMgr);

    catalogItems.registerRoutes(server, authMgr);

    catalogProductGroups.registerRoutes(server, authMgr);

    catalogReports.registerRoutes(server, authMgr);

    catalogSupplemental.registerRoutes(server, authMgr);

    catalogs.registerRoutes(server, authMgr);

    conversionDeletionRequests.registerRoutes(server, authMgr);

    conversionEqs.registerRoutes(server, authMgr);

    conversionEvents.registerRoutes(server, authMgr);

    conversionTags.registerRoutes(server, authMgr);

    conversions.registerRoutes(server, authMgr);

    customerListUploads.registerRoutes(server, authMgr);

    customerLists.registerRoutes(server, authMgr);

    customerSegment.registerRoutes(server, authMgr);

    integrations.registerRoutes(server, authMgr);

    keywords.registerRoutes(server, authMgr);

    labels.registerRoutes(server, authMgr);

    leadAds.registerRoutes(server, authMgr);

    leadForms.registerRoutes(server, authMgr);

    leadsExport.registerRoutes(server, authMgr);

    media.registerRoutes(server, authMgr);

    msotEvents.registerRoutes(server, authMgr);

    notification.registerRoutes(server, authMgr);

    oauth.registerRoutes(server, authMgr);

    orderLines.registerRoutes(server, authMgr);

    pins.registerRoutes(server, authMgr);

    productGroupPromotions.registerRoutes(server, authMgr);

    productTags.registerRoutes(server, authMgr);

    promotions.registerRoutes(server, authMgr);

    resources.registerRoutes(server, authMgr);

    schedules.registerRoutes(server, authMgr);

    search.registerRoutes(server, authMgr);

    targetingTemplate.registerRoutes(server, authMgr);

    terms.registerRoutes(server, authMgr);

    termsOfService.registerRoutes(server, authMgr);

    trends.registerRoutes(server, authMgr);

    userAccount.registerRoutes(server, authMgr);


    // Start server
    std::cout << "Server starting on http://localhost:8080" << std::endl;
    server.listen("localhost", 8080);

    return 0;
}
```

### With Authentication

When authentication is required, you must:
1. Implement the `AuthenticationManager` interface (see Authentication section below)
2. Pass the authentication manager to `registerRoutes()`


## Authentication

This API requires authentication. Implement the `AuthenticationManager` interface to provide your authentication logic:

```cpp
#include "api/AuthenticationManager.h"

class MyAuthManager : public Api::AuthenticationManager {
public:
    bool validateApiKey(const std::string& key) override {
        // Validate API key from header, query, or cookie
        // Example: check against database or cache
        return checkApiKeyInDatabase(key);
    }

    bool validateBearerToken(const std::string& token) override {
        // Validate JWT or other bearer tokens
        // Example: verify signature and expiration
        return jwt::verify(token, secret_key);
    }

    bool validateBasicAuth(const std::string& username, const std::string& password) override {
        // Validate username/password credentials
        // Example: check against user database with hashed passwords
        auto user = findUser(username);
        return user && bcrypt::verify(password, user->passwordHash);
    }

    bool validateOAuth2(const std::string& token, const std::vector<std::string>& scopes) override {
        // Validate OAuth2 token and check required scopes
        // Example: introspect token and verify scopes
        auto introspection = oauthProvider.introspect(token);
        return introspection.active && hasAllScopes(introspection.scopes, scopes);
    }
};
```

### Authentication Flow

1. The server automatically extracts credentials from requests (headers, query params, cookies)
2. Before calling your handler, it validates credentials using your `AuthenticationManager`
3. If validation fails, the server returns HTTP 401 Unauthorized automatically
4. If validation succeeds, your handler is called

### Security Schemes

The generated code supports:
- **API Key**: Header, query parameter, or cookie-based authentication
- **Bearer Token**: Authorization header with "Bearer" scheme (e.g., JWT)
- **Basic Auth**: HTTP Basic authentication (username:password)
- **OAuth2**: OAuth 2.0 token-based authentication with scope validation


## Error Handling

### Response Variants

Each API endpoint that returns data uses `std::variant` to represent multiple possible response types (success and errors):

```cpp
// Example: endpoint returns success (User) or errors (NotFound, ServerError)
using GetUserResponse = std::variant<User, NotFound, ServerError>;

GetUserResponse handleGetUser(const GetUserRequest& params) override {
    if (userExists(params.m_userId)) {
        User user = fetchUser(params.m_userId);
        return user;  // Automatically sets HTTP 200
    } else {
        NotFound error;
        error.setMessage("User not found");
        return error;  // Automatically sets HTTP 404
    }
}
```

The server automatically:
- Detects which type is returned from the variant
- Sets the appropriate HTTP status code
- Serializes the response to JSON

### HTTP Status Codes

Status codes are automatically set based on the response type you return. Each model type is associated with a specific HTTP status code defined in your OpenAPI specification.

**Optimized Status Code Constants:**
The generator only creates HTTP status code constants (e.g., `HTTP_RESPONSE_CODE_200`, `HTTP_RESPONSE_CODE_404`) for codes actually used by your API operations. This reduces code bloat and compilation time compared to generating all possible HTTP status codes.

### Parameter Validation

The generated code automatically validates:
- **Required parameters**: Returns HTTP 400 if missing
- **Type conversion**: Returns HTTP 400 if parameter cannot be converted to expected type
- **JSON parsing**: Returns HTTP 400 if request body is invalid JSON

Custom validation logic should be implemented in your handler methods.

### Working with Optional Parameters

Optional parameters and model fields use `std::optional`:

```cpp
void handleRequest(const RequestParams& params) override {
    // Check if optional query parameter is present
    if (params.m_optionalParam) {
        auto value = *params.m_optionalParam;  // Dereference to get value
        // Use value...
    }

    // Check if optional request body is present
    if (params.m_request) {
        auto body = *params.m_request;  // Dereference to get body
        // Use body...
    }
}
```

## Advanced Features

### Parameter Serialization Styles

The generator supports various parameter serialization styles as defined in OpenAPI:

- **simple**: Comma-separated values (default for path/header)
- **form**: Ampersand-separated values (default for query)
- **spaceDelimited**: Space-separated values
- **pipeDelimited**: Pipe-separated values
- **deepObject**: Nested object notation for query parameters

These are automatically handled during parameter parsing.

### Enum Handling

All generated enums automatically include an `UNSPECIFIED` value as the first enum entry for safe initialization:

```cpp
enum class Status {
    UNSPECIFIED = 0,  // Added automatically for safety
    PENDING,
    APPROVED,
    REJECTED
};

// Safe default initialization
Status status;  // Defaults to UNSPECIFIED (0)

// Explicit initialization
Status activeStatus = Status::APPROVED;

// Enum serialization/deserialization
// UNSPECIFIED is not a valid API value and indicates uninitialized state
```

**Why UNSPECIFIED?**
- Provides a safe default value for uninitialized enums
- Prevents undefined behavior from using uninitialized enum values
- Makes it clear when an enum hasn't been set vs. having a valid API value
- Does not appear in OpenAPI spec - internal C++ implementation detail

### Union Types (anyOf/oneOf)

When your OpenAPI spec uses `anyOf` or `oneOf`, the generated code uses `std::variant`:

```cpp
// OpenAPI: { "anyOf": [{"type": "string"}, {"type": "number"}] }
using MyUnionType = std::variant<std::string, double>;

// In your model:
MyUnionType value;

// Use std::visit to handle different types:
std::visit([](const auto& v) {
    using T = std::decay_t<decltype(v)>;
    if constexpr (std::is_same_v<T, std::string>) {
        std::cout << "String: " << v << std::endl;
    } else if constexpr (std::is_same_v<T, double>) {
        std::cout << "Number: " << v << std::endl;
    }
}, value);
```

## Additional Resources

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/cpp-httplib-server)
- [OpenAPI Specification](https://swagger.io/specification/)

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/)
