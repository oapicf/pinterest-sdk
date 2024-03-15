#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Generator version: 7.4.0
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for Pinterest REST API.
#
# LICENSE:
# https://spdx.org/licenses/MIT
#
# CONTACT:
# blah+oapicf@cliffano.com
#
# MORE INFORMATION:
# 
#

# For improved pattern matching in case statements
shopt -s extglob

###############################################################################
#
# Make sure Bash is at least in version 4.3
#
###############################################################################
if ! ( (("${BASH_VERSION:0:1}" == "4")) && (("${BASH_VERSION:2:1}" >= "3")) ) \
  && ! (("${BASH_VERSION:0:1}" >= "5")); then
    echo ""
    echo "Sorry - your Bash version is ${BASH_VERSION}"
    echo ""
    echo "You need at least Bash 4.3 to run this script."
    echo ""
    exit 1
fi

###############################################################################
#
# Global variables
#
###############################################################################

##
# The filename of this script for help messages
script_name=$(basename "$0")

##
# Map for headers passed after operation as KEY:VALUE
declare -A header_arguments


##
# Map for operation parameters passed after operation as PARAMETER=VALUE
# These will be mapped to appropriate path or query parameters
# The values in operation_parameters are arrays, so that multiple values
# can be provided for the same parameter if allowed by API specification
declare -A operation_parameters

##
# Declare colors with autodetection if output is terminal
if [ -t 1 ]; then
    RED="$(tput setaf 1)"
    GREEN="$(tput setaf 2)"
    YELLOW="$(tput setaf 3)"
    BLUE="$(tput setaf 4)"
    MAGENTA="$(tput setaf 5)"
    CYAN="$(tput setaf 6)"
    WHITE="$(tput setaf 7)"
    BOLD="$(tput bold)"
    OFF="$(tput sgr0)"
else
    RED=""
    GREEN=""
    YELLOW=""
    BLUE=""
    MAGENTA=""
    CYAN=""
    WHITE=""
    BOLD=""
    OFF=""
fi

declare -a result_color_table=( "$WHITE" "$WHITE" "$GREEN" "$YELLOW" "$WHITE" "$MAGENTA" "$WHITE" )

##
# This array stores the minimum number of required occurrences for parameter
# 0 - optional
# 1 - required
declare -A operation_parameters_minimum_occurrences
operation_parameters_minimum_occurrences["adAccountAnalytics:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["adAccountAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["adAccountAnalytics:::columns"]=1
operation_parameters_minimum_occurrences["adAccountAnalytics:::granularity"]=1
operation_parameters_minimum_occurrences["adAccountAnalytics:::click_window_days"]=0
operation_parameters_minimum_occurrences["adAccountAnalytics:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["adAccountAnalytics:::view_window_days"]=0
operation_parameters_minimum_occurrences["adAccountAnalytics:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::start_date"]=1
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::end_date"]=1
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::targeting_types"]=1
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::columns"]=1
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::granularity"]=1
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["adAccountTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_minimum_occurrences["adAccountsCreate:::AdAccountCreateRequest"]=1
operation_parameters_minimum_occurrences["adAccountsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountsList:::bookmark"]=0
operation_parameters_minimum_occurrences["adAccountsList:::page_size"]=0
operation_parameters_minimum_occurrences["adAccountsList:::include_shared_accounts"]=0
operation_parameters_minimum_occurrences["analyticsCreateMmmReport:::ad_account_id"]=1
operation_parameters_minimum_occurrences["analyticsCreateMmmReport:::CreateMMMReportRequest"]=1
operation_parameters_minimum_occurrences["analyticsCreateReport:::ad_account_id"]=1
operation_parameters_minimum_occurrences["analyticsCreateReport:::AdsAnalyticsCreateAsyncRequest"]=1
operation_parameters_minimum_occurrences["analyticsCreateTemplateReport:::ad_account_id"]=1
operation_parameters_minimum_occurrences["analyticsCreateTemplateReport:::template_id"]=1
operation_parameters_minimum_occurrences["analyticsCreateTemplateReport:::start_date"]=0
operation_parameters_minimum_occurrences["analyticsCreateTemplateReport:::end_date"]=0
operation_parameters_minimum_occurrences["analyticsCreateTemplateReport:::granularity"]=0
operation_parameters_minimum_occurrences["analyticsGetMmmReport:::ad_account_id"]=1
operation_parameters_minimum_occurrences["analyticsGetMmmReport:::token"]=1
operation_parameters_minimum_occurrences["analyticsGetReport:::ad_account_id"]=1
operation_parameters_minimum_occurrences["analyticsGetReport:::token"]=1
operation_parameters_minimum_occurrences["sandboxDelete:::ad_account_id"]=1
operation_parameters_minimum_occurrences["templatesList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["templatesList:::page_size"]=0
operation_parameters_minimum_occurrences["templatesList:::order"]=0
operation_parameters_minimum_occurrences["templatesList:::bookmark"]=0
operation_parameters_minimum_occurrences["adGroupsAnalytics:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["adGroupsAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["adGroupsAnalytics:::ad_group_ids"]=1
operation_parameters_minimum_occurrences["adGroupsAnalytics:::columns"]=1
operation_parameters_minimum_occurrences["adGroupsAnalytics:::granularity"]=1
operation_parameters_minimum_occurrences["adGroupsAnalytics:::click_window_days"]=0
operation_parameters_minimum_occurrences["adGroupsAnalytics:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["adGroupsAnalytics:::view_window_days"]=0
operation_parameters_minimum_occurrences["adGroupsAnalytics:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["adGroupsAudienceSizing:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsAudienceSizing:::AdGroupAudienceSizingRequest"]=0
operation_parameters_minimum_occurrences["adGroupsBidFloorGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsBidFloorGet:::BidFloorRequest"]=1
operation_parameters_minimum_occurrences["adGroupsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsCreate:::AdGroupCreateRequest"]=1
operation_parameters_minimum_occurrences["adGroupsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsGet:::ad_group_id"]=1
operation_parameters_minimum_occurrences["adGroupsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsList:::campaign_ids"]=0
operation_parameters_minimum_occurrences["adGroupsList:::ad_group_ids"]=0
operation_parameters_minimum_occurrences["adGroupsList:::entity_statuses"]=0
operation_parameters_minimum_occurrences["adGroupsList:::page_size"]=0
operation_parameters_minimum_occurrences["adGroupsList:::order"]=0
operation_parameters_minimum_occurrences["adGroupsList:::bookmark"]=0
operation_parameters_minimum_occurrences["adGroupsList:::translate_interests_to_names"]=0
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::ad_group_ids"]=1
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::start_date"]=1
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::end_date"]=1
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::targeting_types"]=1
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::columns"]=1
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::granularity"]=1
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["adGroupsTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_minimum_occurrences["adGroupsUpdate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsUpdate:::AdGroupUpdateRequest"]=1
operation_parameters_minimum_occurrences["adPreviewsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adPreviewsCreate:::AdPreviewRequest"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::ad_ids"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::start_date"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::end_date"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::targeting_types"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::columns"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::granularity"]=1
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["adTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_minimum_occurrences["adsAnalytics:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["adsAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["adsAnalytics:::ad_ids"]=1
operation_parameters_minimum_occurrences["adsAnalytics:::columns"]=1
operation_parameters_minimum_occurrences["adsAnalytics:::granularity"]=1
operation_parameters_minimum_occurrences["adsAnalytics:::click_window_days"]=0
operation_parameters_minimum_occurrences["adsAnalytics:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["adsAnalytics:::view_window_days"]=0
operation_parameters_minimum_occurrences["adsAnalytics:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["adsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsCreate:::AdCreateRequest"]=1
operation_parameters_minimum_occurrences["adsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsGet:::ad_id"]=1
operation_parameters_minimum_occurrences["adsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsList:::campaign_ids"]=0
operation_parameters_minimum_occurrences["adsList:::ad_group_ids"]=0
operation_parameters_minimum_occurrences["adsList:::ad_ids"]=0
operation_parameters_minimum_occurrences["adsList:::entity_statuses"]=0
operation_parameters_minimum_occurrences["adsList:::page_size"]=0
operation_parameters_minimum_occurrences["adsList:::order"]=0
operation_parameters_minimum_occurrences["adsList:::bookmark"]=0
operation_parameters_minimum_occurrences["adsUpdate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsUpdate:::AdUpdateRequest"]=1
operation_parameters_minimum_occurrences["audienceInsightsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["audienceInsightsGet:::audience_insight_type"]=1
operation_parameters_minimum_occurrences["audienceInsightsScopeAndTypeGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["audiencesCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["audiencesCreate:::AudienceCreateRequest"]=1
operation_parameters_minimum_occurrences["audiencesCreateCustom:::ad_account_id"]=1
operation_parameters_minimum_occurrences["audiencesCreateCustom:::AudienceCreateCustomRequest"]=1
operation_parameters_minimum_occurrences["audiencesGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["audiencesGet:::audience_id"]=1
operation_parameters_minimum_occurrences["audiencesList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["audiencesList:::bookmark"]=0
operation_parameters_minimum_occurrences["audiencesList:::order"]=0
operation_parameters_minimum_occurrences["audiencesList:::page_size"]=0
operation_parameters_minimum_occurrences["audiencesList:::ownership_type"]=0
operation_parameters_minimum_occurrences["audiencesUpdate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["audiencesUpdate:::audience_id"]=1
operation_parameters_minimum_occurrences["audiencesUpdate:::AudienceUpdateRequest"]=0
operation_parameters_minimum_occurrences["adsCreditRedeem:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsCreditRedeem:::AdsCreditRedeemRequest"]=1
operation_parameters_minimum_occurrences["adsCreditsDiscountsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsCreditsDiscountsGet:::bookmark"]=0
operation_parameters_minimum_occurrences["adsCreditsDiscountsGet:::page_size"]=0
operation_parameters_minimum_occurrences["billingProfilesGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["billingProfilesGet:::is_active"]=1
operation_parameters_minimum_occurrences["billingProfilesGet:::bookmark"]=0
operation_parameters_minimum_occurrences["billingProfilesGet:::page_size"]=0
operation_parameters_minimum_occurrences["ssioAccountsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["ssioInsertionOrderCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["ssioInsertionOrderCreate:::SSIOCreateInsertionOrderRequest"]=1
operation_parameters_minimum_occurrences["ssioInsertionOrderEdit:::ad_account_id"]=1
operation_parameters_minimum_occurrences["ssioInsertionOrderEdit:::SSIOEditInsertionOrderRequest"]=1
operation_parameters_minimum_occurrences["ssioInsertionOrdersStatusGetByAdAccount:::ad_account_id"]=1
operation_parameters_minimum_occurrences["ssioInsertionOrdersStatusGetByAdAccount:::bookmark"]=0
operation_parameters_minimum_occurrences["ssioInsertionOrdersStatusGetByAdAccount:::page_size"]=0
operation_parameters_minimum_occurrences["ssioInsertionOrdersStatusGetByPinOrderId:::ad_account_id"]=1
operation_parameters_minimum_occurrences["ssioInsertionOrdersStatusGetByPinOrderId:::pin_order_id"]=1
operation_parameters_minimum_occurrences["ssioOrderLinesGetByAdAccount:::ad_account_id"]=1
operation_parameters_minimum_occurrences["ssioOrderLinesGetByAdAccount:::bookmark"]=0
operation_parameters_minimum_occurrences["ssioOrderLinesGetByAdAccount:::page_size"]=0
operation_parameters_minimum_occurrences["ssioOrderLinesGetByAdAccount:::pin_order_id"]=0
operation_parameters_minimum_occurrences["boardSectionsCreate:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsCreate:::BoardSection"]=1
operation_parameters_minimum_occurrences["boardSectionsCreate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardSectionsDelete:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsDelete:::section_id"]=1
operation_parameters_minimum_occurrences["boardSectionsDelete:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardSectionsList:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardSectionsList:::bookmark"]=0
operation_parameters_minimum_occurrences["boardSectionsList:::page_size"]=0
operation_parameters_minimum_occurrences["boardSectionsListPins:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsListPins:::section_id"]=1
operation_parameters_minimum_occurrences["boardSectionsListPins:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardSectionsListPins:::bookmark"]=0
operation_parameters_minimum_occurrences["boardSectionsListPins:::page_size"]=0
operation_parameters_minimum_occurrences["boardSectionsUpdate:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsUpdate:::section_id"]=1
operation_parameters_minimum_occurrences["boardSectionsUpdate:::BoardSection"]=1
operation_parameters_minimum_occurrences["boardSectionsUpdate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardsCreate:::Board"]=1
operation_parameters_minimum_occurrences["boardsCreate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardsDelete:::board_id"]=1
operation_parameters_minimum_occurrences["boardsDelete:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardsGet:::board_id"]=1
operation_parameters_minimum_occurrences["boardsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardsList:::bookmark"]=0
operation_parameters_minimum_occurrences["boardsList:::page_size"]=0
operation_parameters_minimum_occurrences["boardsList:::privacy"]=0
operation_parameters_minimum_occurrences["boardsListPins:::board_id"]=1
operation_parameters_minimum_occurrences["boardsListPins:::bookmark"]=0
operation_parameters_minimum_occurrences["boardsListPins:::page_size"]=0
operation_parameters_minimum_occurrences["boardsListPins:::creative_types"]=0
operation_parameters_minimum_occurrences["boardsListPins:::ad_account_id"]=0
operation_parameters_minimum_occurrences["boardsListPins:::pin_metrics"]=0
operation_parameters_minimum_occurrences["boardsUpdate:::board_id"]=1
operation_parameters_minimum_occurrences["boardsUpdate:::BoardUpdate"]=1
operation_parameters_minimum_occurrences["boardsUpdate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["bulkDownloadCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["bulkDownloadCreate:::BulkDownloadRequest"]=1
operation_parameters_minimum_occurrences["bulkRequestGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["bulkRequestGet:::bulk_request_id"]=1
operation_parameters_minimum_occurrences["bulkRequestGet:::include_details"]=0
operation_parameters_minimum_occurrences["bulkUpsertCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["bulkUpsertCreate:::BulkUpsertRequest"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::campaign_ids"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::start_date"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::end_date"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::targeting_types"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::columns"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::granularity"]=1
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["campaignTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_minimum_occurrences["campaignsAnalytics:::ad_account_id"]=1
operation_parameters_minimum_occurrences["campaignsAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["campaignsAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["campaignsAnalytics:::campaign_ids"]=1
operation_parameters_minimum_occurrences["campaignsAnalytics:::columns"]=1
operation_parameters_minimum_occurrences["campaignsAnalytics:::granularity"]=1
operation_parameters_minimum_occurrences["campaignsAnalytics:::click_window_days"]=0
operation_parameters_minimum_occurrences["campaignsAnalytics:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["campaignsAnalytics:::view_window_days"]=0
operation_parameters_minimum_occurrences["campaignsAnalytics:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["campaignsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["campaignsCreate:::CampaignCreateRequest"]=1
operation_parameters_minimum_occurrences["campaignsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["campaignsGet:::campaign_id"]=1
operation_parameters_minimum_occurrences["campaignsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["campaignsList:::campaign_ids"]=0
operation_parameters_minimum_occurrences["campaignsList:::entity_statuses"]=0
operation_parameters_minimum_occurrences["campaignsList:::page_size"]=0
operation_parameters_minimum_occurrences["campaignsList:::order"]=0
operation_parameters_minimum_occurrences["campaignsList:::bookmark"]=0
operation_parameters_minimum_occurrences["campaignsUpdate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["campaignsUpdate:::CampaignUpdateRequest"]=1
operation_parameters_minimum_occurrences["catalogsList:::bookmark"]=0
operation_parameters_minimum_occurrences["catalogsList:::page_size"]=0
operation_parameters_minimum_occurrences["catalogsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupPinsList:::product_group_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupPinsList:::bookmark"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupPinsList:::page_size"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupPinsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsCreate:::CatalogsProductGroupsCreateRequest"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsCreate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsDelete:::product_group_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsDelete:::ad_account_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsGet:::product_group_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::feed_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::catalog_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::bookmark"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::page_size"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsProductCountsGet:::product_group_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsProductCountsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsUpdate:::product_group_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsUpdate:::CatalogsProductGroupsUpdateRequest"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsUpdate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["feedProcessingResultsList:::feed_id"]=1
operation_parameters_minimum_occurrences["feedProcessingResultsList:::bookmark"]=0
operation_parameters_minimum_occurrences["feedProcessingResultsList:::page_size"]=0
operation_parameters_minimum_occurrences["feedProcessingResultsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["feedsCreate:::FeedsCreateRequest"]=1
operation_parameters_minimum_occurrences["feedsCreate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["feedsDelete:::feed_id"]=1
operation_parameters_minimum_occurrences["feedsDelete:::ad_account_id"]=0
operation_parameters_minimum_occurrences["feedsGet:::feed_id"]=1
operation_parameters_minimum_occurrences["feedsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["feedsList:::bookmark"]=0
operation_parameters_minimum_occurrences["feedsList:::page_size"]=0
operation_parameters_minimum_occurrences["feedsList:::catalog_id"]=0
operation_parameters_minimum_occurrences["feedsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["feedsUpdate:::feed_id"]=1
operation_parameters_minimum_occurrences["feedsUpdate:::FeedsUpdateRequest"]=1
operation_parameters_minimum_occurrences["feedsUpdate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["itemsBatchGet:::batch_id"]=1
operation_parameters_minimum_occurrences["itemsBatchGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["itemsBatchPost:::ItemsBatchPostRequest"]=1
operation_parameters_minimum_occurrences["itemsBatchPost:::ad_account_id"]=0
operation_parameters_minimum_occurrences["itemsGet:::country"]=1
operation_parameters_minimum_occurrences["itemsGet:::language"]=1
operation_parameters_minimum_occurrences["itemsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["itemsGet:::item_ids"]=0
operation_parameters_minimum_occurrences["itemsGet:::filters"]=0
operation_parameters_minimum_occurrences["itemsIssuesList:::processing_result_id"]=1
operation_parameters_minimum_occurrences["itemsIssuesList:::bookmark"]=0
operation_parameters_minimum_occurrences["itemsIssuesList:::page_size"]=0
operation_parameters_minimum_occurrences["itemsIssuesList:::item_numbers"]=0
operation_parameters_minimum_occurrences["itemsIssuesList:::item_validation_issue"]=0
operation_parameters_minimum_occurrences["itemsIssuesList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["productsByProductGroupFilterList:::CatalogsListProductsByFilterRequest"]=1
operation_parameters_minimum_occurrences["productsByProductGroupFilterList:::bookmark"]=0
operation_parameters_minimum_occurrences["productsByProductGroupFilterList:::page_size"]=0
operation_parameters_minimum_occurrences["productsByProductGroupFilterList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["eventsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["eventsCreate:::ConversionEvents"]=1
operation_parameters_minimum_occurrences["eventsCreate:::test"]=0
operation_parameters_minimum_occurrences["conversionTagsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["conversionTagsCreate:::ConversionTagCreate"]=1
operation_parameters_minimum_occurrences["conversionTagsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["conversionTagsGet:::conversion_tag_id"]=1
operation_parameters_minimum_occurrences["conversionTagsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["conversionTagsList:::filter_deleted"]=0
operation_parameters_minimum_occurrences["ocpmEligibleConversionTagsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["pageVisitConversionTagsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["pageVisitConversionTagsGet:::page_size"]=0
operation_parameters_minimum_occurrences["pageVisitConversionTagsGet:::order"]=0
operation_parameters_minimum_occurrences["pageVisitConversionTagsGet:::bookmark"]=0
operation_parameters_minimum_occurrences["customerListsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["customerListsCreate:::CustomerListRequest"]=1
operation_parameters_minimum_occurrences["customerListsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["customerListsGet:::customer_list_id"]=1
operation_parameters_minimum_occurrences["customerListsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["customerListsList:::page_size"]=0
operation_parameters_minimum_occurrences["customerListsList:::order"]=0
operation_parameters_minimum_occurrences["customerListsList:::bookmark"]=0
operation_parameters_minimum_occurrences["customerListsUpdate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["customerListsUpdate:::customer_list_id"]=1
operation_parameters_minimum_occurrences["customerListsUpdate:::CustomerListUpdateRequest"]=1
operation_parameters_minimum_occurrences["integrationsCommerceDel:::external_business_id"]=1
operation_parameters_minimum_occurrences["integrationsCommerceGet:::external_business_id"]=1
operation_parameters_minimum_occurrences["integrationsCommercePatch:::external_business_id"]=1
operation_parameters_minimum_occurrences["integrationsCommercePatch:::IntegrationRequestPatch"]=0
operation_parameters_minimum_occurrences["integrationsCommercePost:::IntegrationRequest"]=0
operation_parameters_minimum_occurrences["integrationsGetById:::id"]=1
operation_parameters_minimum_occurrences["integrationsGetList:::bookmark"]=0
operation_parameters_minimum_occurrences["integrationsGetList:::page_size"]=0
operation_parameters_minimum_occurrences["integrationsLogsPost:::IntegrationLogsRequest"]=1
operation_parameters_minimum_occurrences["countryKeywordsMetricsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["countryKeywordsMetricsGet:::country_code"]=1
operation_parameters_minimum_occurrences["countryKeywordsMetricsGet:::keywords"]=1
operation_parameters_minimum_occurrences["keywordsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["keywordsCreate:::KeywordsRequest"]=1
operation_parameters_minimum_occurrences["keywordsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["keywordsGet:::campaign_id"]=0
operation_parameters_minimum_occurrences["keywordsGet:::ad_group_id"]=0
operation_parameters_minimum_occurrences["keywordsGet:::match_types"]=0
operation_parameters_minimum_occurrences["keywordsGet:::page_size"]=0
operation_parameters_minimum_occurrences["keywordsGet:::bookmark"]=0
operation_parameters_minimum_occurrences["keywordsUpdate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["keywordsUpdate:::KeywordUpdateBody"]=1
operation_parameters_minimum_occurrences["trendingKeywordsList:::region"]=1
operation_parameters_minimum_occurrences["trendingKeywordsList:::trend_type"]=1
operation_parameters_minimum_occurrences["trendingKeywordsList:::interests"]=0
operation_parameters_minimum_occurrences["trendingKeywordsList:::genders"]=0
operation_parameters_minimum_occurrences["trendingKeywordsList:::ages"]=0
operation_parameters_minimum_occurrences["trendingKeywordsList:::normalize_against_group"]=0
operation_parameters_minimum_occurrences["trendingKeywordsList:::limit"]=0
operation_parameters_minimum_occurrences["adAccountsSubscriptionsDelById:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountsSubscriptionsDelById:::subscription_id"]=1
operation_parameters_minimum_occurrences["adAccountsSubscriptionsGetById:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountsSubscriptionsGetById:::subscription_id"]=1
operation_parameters_minimum_occurrences["adAccountsSubscriptionsGetList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountsSubscriptionsGetList:::page_size"]=0
operation_parameters_minimum_occurrences["adAccountsSubscriptionsGetList:::bookmark"]=0
operation_parameters_minimum_occurrences["adAccountsSubscriptionsPost:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountsSubscriptionsPost:::AdAccountCreateSubscriptionRequest"]=1
operation_parameters_minimum_occurrences["leadFormGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["leadFormGet:::lead_form_id"]=1
operation_parameters_minimum_occurrences["leadFormTestCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["leadFormTestCreate:::lead_form_id"]=1
operation_parameters_minimum_occurrences["leadFormTestCreate:::LeadFormTestRequest"]=1
operation_parameters_minimum_occurrences["leadFormsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["leadFormsList:::page_size"]=0
operation_parameters_minimum_occurrences["leadFormsList:::order"]=0
operation_parameters_minimum_occurrences["leadFormsList:::bookmark"]=0
operation_parameters_minimum_occurrences["mediaCreate:::MediaUploadRequest"]=1
operation_parameters_minimum_occurrences["mediaGet:::media_id"]=1
operation_parameters_minimum_occurrences["mediaList:::bookmark"]=0
operation_parameters_minimum_occurrences["mediaList:::page_size"]=0
operation_parameters_minimum_occurrences["oauthToken:::grant_type"]=1
operation_parameters_minimum_occurrences["orderLinesGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["orderLinesGet:::order_line_id"]=1
operation_parameters_minimum_occurrences["orderLinesList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["orderLinesList:::page_size"]=0
operation_parameters_minimum_occurrences["orderLinesList:::order"]=0
operation_parameters_minimum_occurrences["orderLinesList:::bookmark"]=0
operation_parameters_minimum_occurrences["pinsAnalytics:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::metric_types"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::app_types"]=0
operation_parameters_minimum_occurrences["pinsAnalytics:::split_field"]=0
operation_parameters_minimum_occurrences["pinsAnalytics:::ad_account_id"]=0
operation_parameters_minimum_occurrences["pinsCreate:::PinCreate"]=1
operation_parameters_minimum_occurrences["pinsCreate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["pinsDelete:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsDelete:::ad_account_id"]=0
operation_parameters_minimum_occurrences["pinsGet:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsGet:::pin_metrics"]=0
operation_parameters_minimum_occurrences["pinsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["pinsList:::bookmark"]=0
operation_parameters_minimum_occurrences["pinsList:::page_size"]=0
operation_parameters_minimum_occurrences["pinsList:::pin_filter"]=0
operation_parameters_minimum_occurrences["pinsList:::include_protected_pins"]=0
operation_parameters_minimum_occurrences["pinsList:::pin_type"]=0
operation_parameters_minimum_occurrences["pinsList:::creative_types"]=0
operation_parameters_minimum_occurrences["pinsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["pinsList:::pin_metrics"]=0
operation_parameters_minimum_occurrences["pinsSave:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsSave:::PinsSaveRequest"]=1
operation_parameters_minimum_occurrences["pinsSave:::ad_account_id"]=0
operation_parameters_minimum_occurrences["pinsUpdate:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsUpdate:::PinUpdate"]=1
operation_parameters_minimum_occurrences["pinsUpdate:::ad_account_id"]=0
operation_parameters_minimum_occurrences["productGroupPromotionsCreate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["productGroupPromotionsCreate:::ProductGroupPromotionCreateRequest"]=1
operation_parameters_minimum_occurrences["productGroupPromotionsGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["productGroupPromotionsGet:::product_group_promotion_id"]=1
operation_parameters_minimum_occurrences["productGroupPromotionsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["productGroupPromotionsList:::product_group_promotion_ids"]=0
operation_parameters_minimum_occurrences["productGroupPromotionsList:::entity_statuses"]=0
operation_parameters_minimum_occurrences["productGroupPromotionsList:::ad_group_id"]=0
operation_parameters_minimum_occurrences["productGroupPromotionsList:::page_size"]=0
operation_parameters_minimum_occurrences["productGroupPromotionsList:::order"]=0
operation_parameters_minimum_occurrences["productGroupPromotionsList:::bookmark"]=0
operation_parameters_minimum_occurrences["productGroupPromotionsUpdate:::ad_account_id"]=1
operation_parameters_minimum_occurrences["productGroupPromotionsUpdate:::ProductGroupPromotionUpdateRequest"]=1
operation_parameters_minimum_occurrences["productGroupsAnalytics:::ad_account_id"]=1
operation_parameters_minimum_occurrences["productGroupsAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["productGroupsAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["productGroupsAnalytics:::product_group_ids"]=1
operation_parameters_minimum_occurrences["productGroupsAnalytics:::columns"]=1
operation_parameters_minimum_occurrences["productGroupsAnalytics:::granularity"]=1
operation_parameters_minimum_occurrences["productGroupsAnalytics:::click_window_days"]=0
operation_parameters_minimum_occurrences["productGroupsAnalytics:::engagement_window_days"]=0
operation_parameters_minimum_occurrences["productGroupsAnalytics:::view_window_days"]=0
operation_parameters_minimum_occurrences["productGroupsAnalytics:::conversion_report_time"]=0
operation_parameters_minimum_occurrences["adAccountsCatalogsProductGroupsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adAccountsCatalogsProductGroupsList:::feed_profile_id"]=0
operation_parameters_minimum_occurrences["deliveryMetricsGet:::report_type"]=0
operation_parameters_minimum_occurrences["interestTargetingOptionsGet:::interest_id"]=1
operation_parameters_minimum_occurrences["metricsReadyStateGet:::date"]=1
operation_parameters_minimum_occurrences["targetingOptionsGet:::targeting_type"]=1
operation_parameters_minimum_occurrences["targetingOptionsGet:::client_id"]=0
operation_parameters_minimum_occurrences["targetingOptionsGet:::oauth_signature"]=0
operation_parameters_minimum_occurrences["targetingOptionsGet:::timestamp"]=0
operation_parameters_minimum_occurrences["searchPartnerPins:::term"]=1
operation_parameters_minimum_occurrences["searchPartnerPins:::country_code"]=1
operation_parameters_minimum_occurrences["searchPartnerPins:::bookmark"]=0
operation_parameters_minimum_occurrences["searchPartnerPins:::locale"]=0
operation_parameters_minimum_occurrences["searchPartnerPins:::limit"]=0
operation_parameters_minimum_occurrences["searchUserBoardsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["searchUserBoardsGet:::bookmark"]=0
operation_parameters_minimum_occurrences["searchUserBoardsGet:::page_size"]=0
operation_parameters_minimum_occurrences["searchUserBoardsGet:::query"]=0
operation_parameters_minimum_occurrences["searchUserPinsList:::query"]=1
operation_parameters_minimum_occurrences["searchUserPinsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["searchUserPinsList:::bookmark"]=0
operation_parameters_minimum_occurrences["termsRelatedList:::terms"]=1
operation_parameters_minimum_occurrences["termsSuggestedList:::term"]=1
operation_parameters_minimum_occurrences["termsSuggestedList:::limit"]=0
operation_parameters_minimum_occurrences["termsOfServiceGet:::ad_account_id"]=1
operation_parameters_minimum_occurrences["termsOfServiceGet:::include_html"]=0
operation_parameters_minimum_occurrences["termsOfServiceGet:::tos_type"]=0
operation_parameters_minimum_occurrences["boardsUserFollowsList:::bookmark"]=0
operation_parameters_minimum_occurrences["boardsUserFollowsList:::page_size"]=0
operation_parameters_minimum_occurrences["boardsUserFollowsList:::explicit_following"]=0
operation_parameters_minimum_occurrences["boardsUserFollowsList:::ad_account_id"]=0
operation_parameters_minimum_occurrences["followUserUpdate:::username"]=1
operation_parameters_minimum_occurrences["followUserUpdate:::FollowUserRequest"]=1
operation_parameters_minimum_occurrences["followersList:::bookmark"]=0
operation_parameters_minimum_occurrences["followersList:::page_size"]=0
operation_parameters_minimum_occurrences["unverifyWebsiteDelete:::website"]=1
operation_parameters_minimum_occurrences["userAccountAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalytics:::from_claimed_content"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::pin_format"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::app_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::content_type"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::source"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::metric_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::split_field"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::ad_account_id"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::start_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::end_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::sort_by"]=1
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::from_claimed_content"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::pin_format"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::app_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::content_type"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::source"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::metric_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::num_of_pins"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::created_in_last_n_days"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopPins:::ad_account_id"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::start_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::end_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::sort_by"]=1
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::from_claimed_content"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::pin_format"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::app_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::content_type"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::source"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::metric_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::num_of_pins"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::created_in_last_n_days"]=0
operation_parameters_minimum_occurrences["userAccountAnalyticsTopVideoPins:::ad_account_id"]=0
operation_parameters_minimum_occurrences["userAccountFollowedInterests:::username"]=1
operation_parameters_minimum_occurrences["userAccountFollowedInterests:::bookmark"]=0
operation_parameters_minimum_occurrences["userAccountFollowedInterests:::page_size"]=0
operation_parameters_minimum_occurrences["userAccountGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["userFollowingGet:::bookmark"]=0
operation_parameters_minimum_occurrences["userFollowingGet:::page_size"]=0
operation_parameters_minimum_occurrences["userFollowingGet:::feed_type"]=0
operation_parameters_minimum_occurrences["userFollowingGet:::explicit_following"]=0
operation_parameters_minimum_occurrences["userFollowingGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["userWebsitesGet:::bookmark"]=0
operation_parameters_minimum_occurrences["userWebsitesGet:::page_size"]=0
operation_parameters_minimum_occurrences["verifyWebsiteUpdate:::UserWebsiteVerifyRequest"]=1

##
# This array stores the maximum number of allowed occurrences for parameter
# 1 - single value
# 2 - 2 values
# N - N values
# 0 - unlimited
declare -A operation_parameters_maximum_occurrences
operation_parameters_maximum_occurrences["adAccountAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::columns"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::granularity"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::click_window_days"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::view_window_days"]=0
operation_parameters_maximum_occurrences["adAccountAnalytics:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::start_date"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::end_date"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::targeting_types"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::columns"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::granularity"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["adAccountTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_maximum_occurrences["adAccountsCreate:::AdAccountCreateRequest"]=0
operation_parameters_maximum_occurrences["adAccountsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountsList:::bookmark"]=0
operation_parameters_maximum_occurrences["adAccountsList:::page_size"]=0
operation_parameters_maximum_occurrences["adAccountsList:::include_shared_accounts"]=0
operation_parameters_maximum_occurrences["analyticsCreateMmmReport:::ad_account_id"]=0
operation_parameters_maximum_occurrences["analyticsCreateMmmReport:::CreateMMMReportRequest"]=0
operation_parameters_maximum_occurrences["analyticsCreateReport:::ad_account_id"]=0
operation_parameters_maximum_occurrences["analyticsCreateReport:::AdsAnalyticsCreateAsyncRequest"]=0
operation_parameters_maximum_occurrences["analyticsCreateTemplateReport:::ad_account_id"]=0
operation_parameters_maximum_occurrences["analyticsCreateTemplateReport:::template_id"]=0
operation_parameters_maximum_occurrences["analyticsCreateTemplateReport:::start_date"]=0
operation_parameters_maximum_occurrences["analyticsCreateTemplateReport:::end_date"]=0
operation_parameters_maximum_occurrences["analyticsCreateTemplateReport:::granularity"]=0
operation_parameters_maximum_occurrences["analyticsGetMmmReport:::ad_account_id"]=0
operation_parameters_maximum_occurrences["analyticsGetMmmReport:::token"]=0
operation_parameters_maximum_occurrences["analyticsGetReport:::ad_account_id"]=0
operation_parameters_maximum_occurrences["analyticsGetReport:::token"]=0
operation_parameters_maximum_occurrences["sandboxDelete:::ad_account_id"]=0
operation_parameters_maximum_occurrences["templatesList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["templatesList:::page_size"]=0
operation_parameters_maximum_occurrences["templatesList:::order"]=0
operation_parameters_maximum_occurrences["templatesList:::bookmark"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::ad_group_ids"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::columns"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::granularity"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::click_window_days"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::view_window_days"]=0
operation_parameters_maximum_occurrences["adGroupsAnalytics:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["adGroupsAudienceSizing:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsAudienceSizing:::AdGroupAudienceSizingRequest"]=0
operation_parameters_maximum_occurrences["adGroupsBidFloorGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsBidFloorGet:::BidFloorRequest"]=0
operation_parameters_maximum_occurrences["adGroupsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsCreate:::AdGroupCreateRequest"]=0
operation_parameters_maximum_occurrences["adGroupsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsGet:::ad_group_id"]=0
operation_parameters_maximum_occurrences["adGroupsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsList:::campaign_ids"]=0
operation_parameters_maximum_occurrences["adGroupsList:::ad_group_ids"]=0
operation_parameters_maximum_occurrences["adGroupsList:::entity_statuses"]=0
operation_parameters_maximum_occurrences["adGroupsList:::page_size"]=0
operation_parameters_maximum_occurrences["adGroupsList:::order"]=0
operation_parameters_maximum_occurrences["adGroupsList:::bookmark"]=0
operation_parameters_maximum_occurrences["adGroupsList:::translate_interests_to_names"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::ad_group_ids"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::start_date"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::end_date"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::targeting_types"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::columns"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::granularity"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["adGroupsTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_maximum_occurrences["adGroupsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsUpdate:::AdGroupUpdateRequest"]=0
operation_parameters_maximum_occurrences["adPreviewsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adPreviewsCreate:::AdPreviewRequest"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::ad_ids"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::start_date"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::end_date"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::targeting_types"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::columns"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::granularity"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["adTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::ad_ids"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::columns"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::granularity"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::click_window_days"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::view_window_days"]=0
operation_parameters_maximum_occurrences["adsAnalytics:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["adsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsCreate:::AdCreateRequest"]=0
operation_parameters_maximum_occurrences["adsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsGet:::ad_id"]=0
operation_parameters_maximum_occurrences["adsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsList:::campaign_ids"]=0
operation_parameters_maximum_occurrences["adsList:::ad_group_ids"]=0
operation_parameters_maximum_occurrences["adsList:::ad_ids"]=0
operation_parameters_maximum_occurrences["adsList:::entity_statuses"]=0
operation_parameters_maximum_occurrences["adsList:::page_size"]=0
operation_parameters_maximum_occurrences["adsList:::order"]=0
operation_parameters_maximum_occurrences["adsList:::bookmark"]=0
operation_parameters_maximum_occurrences["adsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsUpdate:::AdUpdateRequest"]=0
operation_parameters_maximum_occurrences["audienceInsightsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["audienceInsightsGet:::audience_insight_type"]=0
operation_parameters_maximum_occurrences["audienceInsightsScopeAndTypeGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["audiencesCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["audiencesCreate:::AudienceCreateRequest"]=0
operation_parameters_maximum_occurrences["audiencesCreateCustom:::ad_account_id"]=0
operation_parameters_maximum_occurrences["audiencesCreateCustom:::AudienceCreateCustomRequest"]=0
operation_parameters_maximum_occurrences["audiencesGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["audiencesGet:::audience_id"]=0
operation_parameters_maximum_occurrences["audiencesList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["audiencesList:::bookmark"]=0
operation_parameters_maximum_occurrences["audiencesList:::order"]=0
operation_parameters_maximum_occurrences["audiencesList:::page_size"]=0
operation_parameters_maximum_occurrences["audiencesList:::ownership_type"]=0
operation_parameters_maximum_occurrences["audiencesUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["audiencesUpdate:::audience_id"]=0
operation_parameters_maximum_occurrences["audiencesUpdate:::AudienceUpdateRequest"]=0
operation_parameters_maximum_occurrences["adsCreditRedeem:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsCreditRedeem:::AdsCreditRedeemRequest"]=0
operation_parameters_maximum_occurrences["adsCreditsDiscountsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsCreditsDiscountsGet:::bookmark"]=0
operation_parameters_maximum_occurrences["adsCreditsDiscountsGet:::page_size"]=0
operation_parameters_maximum_occurrences["billingProfilesGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["billingProfilesGet:::is_active"]=0
operation_parameters_maximum_occurrences["billingProfilesGet:::bookmark"]=0
operation_parameters_maximum_occurrences["billingProfilesGet:::page_size"]=0
operation_parameters_maximum_occurrences["ssioAccountsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrderCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrderCreate:::SSIOCreateInsertionOrderRequest"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrderEdit:::ad_account_id"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrderEdit:::SSIOEditInsertionOrderRequest"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrdersStatusGetByAdAccount:::ad_account_id"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrdersStatusGetByAdAccount:::bookmark"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrdersStatusGetByAdAccount:::page_size"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrdersStatusGetByPinOrderId:::ad_account_id"]=0
operation_parameters_maximum_occurrences["ssioInsertionOrdersStatusGetByPinOrderId:::pin_order_id"]=0
operation_parameters_maximum_occurrences["ssioOrderLinesGetByAdAccount:::ad_account_id"]=0
operation_parameters_maximum_occurrences["ssioOrderLinesGetByAdAccount:::bookmark"]=0
operation_parameters_maximum_occurrences["ssioOrderLinesGetByAdAccount:::page_size"]=0
operation_parameters_maximum_occurrences["ssioOrderLinesGetByAdAccount:::pin_order_id"]=0
operation_parameters_maximum_occurrences["boardSectionsCreate:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsCreate:::BoardSection"]=0
operation_parameters_maximum_occurrences["boardSectionsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardSectionsDelete:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsDelete:::section_id"]=0
operation_parameters_maximum_occurrences["boardSectionsDelete:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardSectionsList:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardSectionsList:::bookmark"]=0
operation_parameters_maximum_occurrences["boardSectionsList:::page_size"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::section_id"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::bookmark"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::page_size"]=0
operation_parameters_maximum_occurrences["boardSectionsUpdate:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsUpdate:::section_id"]=0
operation_parameters_maximum_occurrences["boardSectionsUpdate:::BoardSection"]=0
operation_parameters_maximum_occurrences["boardSectionsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardsCreate:::Board"]=0
operation_parameters_maximum_occurrences["boardsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardsDelete:::board_id"]=0
operation_parameters_maximum_occurrences["boardsDelete:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardsGet:::board_id"]=0
operation_parameters_maximum_occurrences["boardsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardsList:::bookmark"]=0
operation_parameters_maximum_occurrences["boardsList:::page_size"]=0
operation_parameters_maximum_occurrences["boardsList:::privacy"]=0
operation_parameters_maximum_occurrences["boardsListPins:::board_id"]=0
operation_parameters_maximum_occurrences["boardsListPins:::bookmark"]=0
operation_parameters_maximum_occurrences["boardsListPins:::page_size"]=0
operation_parameters_maximum_occurrences["boardsListPins:::creative_types"]=0
operation_parameters_maximum_occurrences["boardsListPins:::ad_account_id"]=0
operation_parameters_maximum_occurrences["boardsListPins:::pin_metrics"]=0
operation_parameters_maximum_occurrences["boardsUpdate:::board_id"]=0
operation_parameters_maximum_occurrences["boardsUpdate:::BoardUpdate"]=0
operation_parameters_maximum_occurrences["boardsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["bulkDownloadCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["bulkDownloadCreate:::BulkDownloadRequest"]=0
operation_parameters_maximum_occurrences["bulkRequestGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["bulkRequestGet:::bulk_request_id"]=0
operation_parameters_maximum_occurrences["bulkRequestGet:::include_details"]=0
operation_parameters_maximum_occurrences["bulkUpsertCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["bulkUpsertCreate:::BulkUpsertRequest"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::campaign_ids"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::start_date"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::end_date"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::targeting_types"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::columns"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::granularity"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::click_window_days"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::view_window_days"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["campaignTargetingAnalyticsGet:::attribution_types"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::campaign_ids"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::columns"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::granularity"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::click_window_days"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::view_window_days"]=0
operation_parameters_maximum_occurrences["campaignsAnalytics:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["campaignsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["campaignsCreate:::CampaignCreateRequest"]=0
operation_parameters_maximum_occurrences["campaignsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["campaignsGet:::campaign_id"]=0
operation_parameters_maximum_occurrences["campaignsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["campaignsList:::campaign_ids"]=0
operation_parameters_maximum_occurrences["campaignsList:::entity_statuses"]=0
operation_parameters_maximum_occurrences["campaignsList:::page_size"]=0
operation_parameters_maximum_occurrences["campaignsList:::order"]=0
operation_parameters_maximum_occurrences["campaignsList:::bookmark"]=0
operation_parameters_maximum_occurrences["campaignsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["campaignsUpdate:::CampaignUpdateRequest"]=0
operation_parameters_maximum_occurrences["catalogsList:::bookmark"]=0
operation_parameters_maximum_occurrences["catalogsList:::page_size"]=0
operation_parameters_maximum_occurrences["catalogsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupPinsList:::product_group_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupPinsList:::bookmark"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupPinsList:::page_size"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupPinsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsCreate:::CatalogsProductGroupsCreateRequest"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsDelete:::product_group_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsDelete:::ad_account_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsGet:::product_group_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::feed_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::catalog_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::bookmark"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::page_size"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsProductCountsGet:::product_group_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsProductCountsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsUpdate:::product_group_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsUpdate:::CatalogsProductGroupsUpdateRequest"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["feedProcessingResultsList:::feed_id"]=0
operation_parameters_maximum_occurrences["feedProcessingResultsList:::bookmark"]=0
operation_parameters_maximum_occurrences["feedProcessingResultsList:::page_size"]=0
operation_parameters_maximum_occurrences["feedProcessingResultsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["feedsCreate:::FeedsCreateRequest"]=0
operation_parameters_maximum_occurrences["feedsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["feedsDelete:::feed_id"]=0
operation_parameters_maximum_occurrences["feedsDelete:::ad_account_id"]=0
operation_parameters_maximum_occurrences["feedsGet:::feed_id"]=0
operation_parameters_maximum_occurrences["feedsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["feedsList:::bookmark"]=0
operation_parameters_maximum_occurrences["feedsList:::page_size"]=0
operation_parameters_maximum_occurrences["feedsList:::catalog_id"]=0
operation_parameters_maximum_occurrences["feedsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["feedsUpdate:::feed_id"]=0
operation_parameters_maximum_occurrences["feedsUpdate:::FeedsUpdateRequest"]=0
operation_parameters_maximum_occurrences["feedsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["itemsBatchGet:::batch_id"]=0
operation_parameters_maximum_occurrences["itemsBatchGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["itemsBatchPost:::ItemsBatchPostRequest"]=0
operation_parameters_maximum_occurrences["itemsBatchPost:::ad_account_id"]=0
operation_parameters_maximum_occurrences["itemsGet:::country"]=0
operation_parameters_maximum_occurrences["itemsGet:::language"]=0
operation_parameters_maximum_occurrences["itemsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["itemsGet:::item_ids"]=0
operation_parameters_maximum_occurrences["itemsGet:::filters"]=0
operation_parameters_maximum_occurrences["itemsIssuesList:::processing_result_id"]=0
operation_parameters_maximum_occurrences["itemsIssuesList:::bookmark"]=0
operation_parameters_maximum_occurrences["itemsIssuesList:::page_size"]=0
operation_parameters_maximum_occurrences["itemsIssuesList:::item_numbers"]=0
operation_parameters_maximum_occurrences["itemsIssuesList:::item_validation_issue"]=0
operation_parameters_maximum_occurrences["itemsIssuesList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["productsByProductGroupFilterList:::CatalogsListProductsByFilterRequest"]=0
operation_parameters_maximum_occurrences["productsByProductGroupFilterList:::bookmark"]=0
operation_parameters_maximum_occurrences["productsByProductGroupFilterList:::page_size"]=0
operation_parameters_maximum_occurrences["productsByProductGroupFilterList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["eventsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["eventsCreate:::ConversionEvents"]=0
operation_parameters_maximum_occurrences["eventsCreate:::test"]=0
operation_parameters_maximum_occurrences["conversionTagsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["conversionTagsCreate:::ConversionTagCreate"]=0
operation_parameters_maximum_occurrences["conversionTagsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["conversionTagsGet:::conversion_tag_id"]=0
operation_parameters_maximum_occurrences["conversionTagsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["conversionTagsList:::filter_deleted"]=0
operation_parameters_maximum_occurrences["ocpmEligibleConversionTagsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pageVisitConversionTagsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pageVisitConversionTagsGet:::page_size"]=0
operation_parameters_maximum_occurrences["pageVisitConversionTagsGet:::order"]=0
operation_parameters_maximum_occurrences["pageVisitConversionTagsGet:::bookmark"]=0
operation_parameters_maximum_occurrences["customerListsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["customerListsCreate:::CustomerListRequest"]=0
operation_parameters_maximum_occurrences["customerListsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["customerListsGet:::customer_list_id"]=0
operation_parameters_maximum_occurrences["customerListsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["customerListsList:::page_size"]=0
operation_parameters_maximum_occurrences["customerListsList:::order"]=0
operation_parameters_maximum_occurrences["customerListsList:::bookmark"]=0
operation_parameters_maximum_occurrences["customerListsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["customerListsUpdate:::customer_list_id"]=0
operation_parameters_maximum_occurrences["customerListsUpdate:::CustomerListUpdateRequest"]=0
operation_parameters_maximum_occurrences["integrationsCommerceDel:::external_business_id"]=0
operation_parameters_maximum_occurrences["integrationsCommerceGet:::external_business_id"]=0
operation_parameters_maximum_occurrences["integrationsCommercePatch:::external_business_id"]=0
operation_parameters_maximum_occurrences["integrationsCommercePatch:::IntegrationRequestPatch"]=0
operation_parameters_maximum_occurrences["integrationsCommercePost:::IntegrationRequest"]=0
operation_parameters_maximum_occurrences["integrationsGetById:::id"]=0
operation_parameters_maximum_occurrences["integrationsGetList:::bookmark"]=0
operation_parameters_maximum_occurrences["integrationsGetList:::page_size"]=0
operation_parameters_maximum_occurrences["integrationsLogsPost:::IntegrationLogsRequest"]=0
operation_parameters_maximum_occurrences["countryKeywordsMetricsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["countryKeywordsMetricsGet:::country_code"]=0
operation_parameters_maximum_occurrences["countryKeywordsMetricsGet:::keywords"]=0
operation_parameters_maximum_occurrences["keywordsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["keywordsCreate:::KeywordsRequest"]=0
operation_parameters_maximum_occurrences["keywordsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["keywordsGet:::campaign_id"]=0
operation_parameters_maximum_occurrences["keywordsGet:::ad_group_id"]=0
operation_parameters_maximum_occurrences["keywordsGet:::match_types"]=0
operation_parameters_maximum_occurrences["keywordsGet:::page_size"]=0
operation_parameters_maximum_occurrences["keywordsGet:::bookmark"]=0
operation_parameters_maximum_occurrences["keywordsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["keywordsUpdate:::KeywordUpdateBody"]=0
operation_parameters_maximum_occurrences["trendingKeywordsList:::region"]=0
operation_parameters_maximum_occurrences["trendingKeywordsList:::trend_type"]=0
operation_parameters_maximum_occurrences["trendingKeywordsList:::interests"]=0
operation_parameters_maximum_occurrences["trendingKeywordsList:::genders"]=0
operation_parameters_maximum_occurrences["trendingKeywordsList:::ages"]=0
operation_parameters_maximum_occurrences["trendingKeywordsList:::normalize_against_group"]=0
operation_parameters_maximum_occurrences["trendingKeywordsList:::limit"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsDelById:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsDelById:::subscription_id"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsGetById:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsGetById:::subscription_id"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsGetList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsGetList:::page_size"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsGetList:::bookmark"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsPost:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountsSubscriptionsPost:::AdAccountCreateSubscriptionRequest"]=0
operation_parameters_maximum_occurrences["leadFormGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["leadFormGet:::lead_form_id"]=0
operation_parameters_maximum_occurrences["leadFormTestCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["leadFormTestCreate:::lead_form_id"]=0
operation_parameters_maximum_occurrences["leadFormTestCreate:::LeadFormTestRequest"]=0
operation_parameters_maximum_occurrences["leadFormsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["leadFormsList:::page_size"]=0
operation_parameters_maximum_occurrences["leadFormsList:::order"]=0
operation_parameters_maximum_occurrences["leadFormsList:::bookmark"]=0
operation_parameters_maximum_occurrences["mediaCreate:::MediaUploadRequest"]=0
operation_parameters_maximum_occurrences["mediaGet:::media_id"]=0
operation_parameters_maximum_occurrences["mediaList:::bookmark"]=0
operation_parameters_maximum_occurrences["mediaList:::page_size"]=0
operation_parameters_maximum_occurrences["oauthToken:::grant_type"]=0
operation_parameters_maximum_occurrences["orderLinesGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["orderLinesGet:::order_line_id"]=0
operation_parameters_maximum_occurrences["orderLinesList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["orderLinesList:::page_size"]=0
operation_parameters_maximum_occurrences["orderLinesList:::order"]=0
operation_parameters_maximum_occurrences["orderLinesList:::bookmark"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::metric_types"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::app_types"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::split_field"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pinsCreate:::PinCreate"]=0
operation_parameters_maximum_occurrences["pinsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pinsDelete:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsDelete:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pinsGet:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsGet:::pin_metrics"]=0
operation_parameters_maximum_occurrences["pinsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pinsList:::bookmark"]=0
operation_parameters_maximum_occurrences["pinsList:::page_size"]=0
operation_parameters_maximum_occurrences["pinsList:::pin_filter"]=0
operation_parameters_maximum_occurrences["pinsList:::include_protected_pins"]=0
operation_parameters_maximum_occurrences["pinsList:::pin_type"]=0
operation_parameters_maximum_occurrences["pinsList:::creative_types"]=0
operation_parameters_maximum_occurrences["pinsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pinsList:::pin_metrics"]=0
operation_parameters_maximum_occurrences["pinsSave:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsSave:::PinsSaveRequest"]=0
operation_parameters_maximum_occurrences["pinsSave:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pinsUpdate:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsUpdate:::PinUpdate"]=0
operation_parameters_maximum_occurrences["pinsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsCreate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsCreate:::ProductGroupPromotionCreateRequest"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsGet:::product_group_promotion_id"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsList:::product_group_promotion_ids"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsList:::entity_statuses"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsList:::ad_group_id"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsList:::page_size"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsList:::order"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsList:::bookmark"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsUpdate:::ad_account_id"]=0
operation_parameters_maximum_occurrences["productGroupPromotionsUpdate:::ProductGroupPromotionUpdateRequest"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::product_group_ids"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::columns"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::granularity"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::click_window_days"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::engagement_window_days"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::view_window_days"]=0
operation_parameters_maximum_occurrences["productGroupsAnalytics:::conversion_report_time"]=0
operation_parameters_maximum_occurrences["adAccountsCatalogsProductGroupsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adAccountsCatalogsProductGroupsList:::feed_profile_id"]=0
operation_parameters_maximum_occurrences["deliveryMetricsGet:::report_type"]=0
operation_parameters_maximum_occurrences["interestTargetingOptionsGet:::interest_id"]=0
operation_parameters_maximum_occurrences["metricsReadyStateGet:::date"]=0
operation_parameters_maximum_occurrences["targetingOptionsGet:::targeting_type"]=0
operation_parameters_maximum_occurrences["targetingOptionsGet:::client_id"]=0
operation_parameters_maximum_occurrences["targetingOptionsGet:::oauth_signature"]=0
operation_parameters_maximum_occurrences["targetingOptionsGet:::timestamp"]=0
operation_parameters_maximum_occurrences["searchPartnerPins:::term"]=0
operation_parameters_maximum_occurrences["searchPartnerPins:::country_code"]=0
operation_parameters_maximum_occurrences["searchPartnerPins:::bookmark"]=0
operation_parameters_maximum_occurrences["searchPartnerPins:::locale"]=0
operation_parameters_maximum_occurrences["searchPartnerPins:::limit"]=0
operation_parameters_maximum_occurrences["searchUserBoardsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["searchUserBoardsGet:::bookmark"]=0
operation_parameters_maximum_occurrences["searchUserBoardsGet:::page_size"]=0
operation_parameters_maximum_occurrences["searchUserBoardsGet:::query"]=0
operation_parameters_maximum_occurrences["searchUserPinsList:::query"]=0
operation_parameters_maximum_occurrences["searchUserPinsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["searchUserPinsList:::bookmark"]=0
operation_parameters_maximum_occurrences["termsRelatedList:::terms"]=0
operation_parameters_maximum_occurrences["termsSuggestedList:::term"]=0
operation_parameters_maximum_occurrences["termsSuggestedList:::limit"]=0
operation_parameters_maximum_occurrences["termsOfServiceGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["termsOfServiceGet:::include_html"]=0
operation_parameters_maximum_occurrences["termsOfServiceGet:::tos_type"]=0
operation_parameters_maximum_occurrences["boardsUserFollowsList:::bookmark"]=0
operation_parameters_maximum_occurrences["boardsUserFollowsList:::page_size"]=0
operation_parameters_maximum_occurrences["boardsUserFollowsList:::explicit_following"]=0
operation_parameters_maximum_occurrences["boardsUserFollowsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["followUserUpdate:::username"]=0
operation_parameters_maximum_occurrences["followUserUpdate:::FollowUserRequest"]=0
operation_parameters_maximum_occurrences["followersList:::bookmark"]=0
operation_parameters_maximum_occurrences["followersList:::page_size"]=0
operation_parameters_maximum_occurrences["unverifyWebsiteDelete:::website"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::from_claimed_content"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::pin_format"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::app_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::content_type"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::source"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::metric_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::split_field"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::start_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::end_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::sort_by"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::from_claimed_content"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::pin_format"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::app_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::content_type"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::source"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::metric_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::num_of_pins"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::created_in_last_n_days"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopPins:::ad_account_id"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::start_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::end_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::sort_by"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::from_claimed_content"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::pin_format"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::app_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::content_type"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::source"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::metric_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::num_of_pins"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::created_in_last_n_days"]=0
operation_parameters_maximum_occurrences["userAccountAnalyticsTopVideoPins:::ad_account_id"]=0
operation_parameters_maximum_occurrences["userAccountFollowedInterests:::username"]=0
operation_parameters_maximum_occurrences["userAccountFollowedInterests:::bookmark"]=0
operation_parameters_maximum_occurrences["userAccountFollowedInterests:::page_size"]=0
operation_parameters_maximum_occurrences["userAccountGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["userFollowingGet:::bookmark"]=0
operation_parameters_maximum_occurrences["userFollowingGet:::page_size"]=0
operation_parameters_maximum_occurrences["userFollowingGet:::feed_type"]=0
operation_parameters_maximum_occurrences["userFollowingGet:::explicit_following"]=0
operation_parameters_maximum_occurrences["userFollowingGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["userWebsitesGet:::bookmark"]=0
operation_parameters_maximum_occurrences["userWebsitesGet:::page_size"]=0
operation_parameters_maximum_occurrences["verifyWebsiteUpdate:::UserWebsiteVerifyRequest"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["adAccountAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["adAccountAnalytics:::start_date"]=""
operation_parameters_collection_type["adAccountAnalytics:::end_date"]=""
operation_parameters_collection_type["adAccountAnalytics:::columns"]="csv"
operation_parameters_collection_type["adAccountAnalytics:::granularity"]=""
operation_parameters_collection_type["adAccountAnalytics:::click_window_days"]=""
operation_parameters_collection_type["adAccountAnalytics:::engagement_window_days"]=""
operation_parameters_collection_type["adAccountAnalytics:::view_window_days"]=""
operation_parameters_collection_type["adAccountAnalytics:::conversion_report_time"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::ad_account_id"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::start_date"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::end_date"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::targeting_types"]="csv"
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::columns"]="csv"
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::granularity"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::click_window_days"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::engagement_window_days"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::view_window_days"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::conversion_report_time"]=""
operation_parameters_collection_type["adAccountTargetingAnalyticsGet:::attribution_types"]=""
operation_parameters_collection_type["adAccountsCreate:::AdAccountCreateRequest"]=""
operation_parameters_collection_type["adAccountsGet:::ad_account_id"]=""
operation_parameters_collection_type["adAccountsList:::bookmark"]=""
operation_parameters_collection_type["adAccountsList:::page_size"]=""
operation_parameters_collection_type["adAccountsList:::include_shared_accounts"]=""
operation_parameters_collection_type["analyticsCreateMmmReport:::ad_account_id"]=""
operation_parameters_collection_type["analyticsCreateMmmReport:::CreateMMMReportRequest"]=""
operation_parameters_collection_type["analyticsCreateReport:::ad_account_id"]=""
operation_parameters_collection_type["analyticsCreateReport:::AdsAnalyticsCreateAsyncRequest"]=""
operation_parameters_collection_type["analyticsCreateTemplateReport:::ad_account_id"]=""
operation_parameters_collection_type["analyticsCreateTemplateReport:::template_id"]=""
operation_parameters_collection_type["analyticsCreateTemplateReport:::start_date"]=""
operation_parameters_collection_type["analyticsCreateTemplateReport:::end_date"]=""
operation_parameters_collection_type["analyticsCreateTemplateReport:::granularity"]=""
operation_parameters_collection_type["analyticsGetMmmReport:::ad_account_id"]=""
operation_parameters_collection_type["analyticsGetMmmReport:::token"]=""
operation_parameters_collection_type["analyticsGetReport:::ad_account_id"]=""
operation_parameters_collection_type["analyticsGetReport:::token"]=""
operation_parameters_collection_type["sandboxDelete:::ad_account_id"]=""
operation_parameters_collection_type["templatesList:::ad_account_id"]=""
operation_parameters_collection_type["templatesList:::page_size"]=""
operation_parameters_collection_type["templatesList:::order"]=""
operation_parameters_collection_type["templatesList:::bookmark"]=""
operation_parameters_collection_type["adGroupsAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsAnalytics:::start_date"]=""
operation_parameters_collection_type["adGroupsAnalytics:::end_date"]=""
operation_parameters_collection_type["adGroupsAnalytics:::ad_group_ids"]="multi"
operation_parameters_collection_type["adGroupsAnalytics:::columns"]="csv"
operation_parameters_collection_type["adGroupsAnalytics:::granularity"]=""
operation_parameters_collection_type["adGroupsAnalytics:::click_window_days"]=""
operation_parameters_collection_type["adGroupsAnalytics:::engagement_window_days"]=""
operation_parameters_collection_type["adGroupsAnalytics:::view_window_days"]=""
operation_parameters_collection_type["adGroupsAnalytics:::conversion_report_time"]=""
operation_parameters_collection_type["adGroupsAudienceSizing:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsAudienceSizing:::AdGroupAudienceSizingRequest"]=""
operation_parameters_collection_type["adGroupsBidFloorGet:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsBidFloorGet:::BidFloorRequest"]=""
operation_parameters_collection_type["adGroupsCreate:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsCreate:::AdGroupCreateRequest"]=
operation_parameters_collection_type["adGroupsGet:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsGet:::ad_group_id"]=""
operation_parameters_collection_type["adGroupsList:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsList:::campaign_ids"]="multi"
operation_parameters_collection_type["adGroupsList:::ad_group_ids"]="multi"
operation_parameters_collection_type["adGroupsList:::entity_statuses"]="multi"
operation_parameters_collection_type["adGroupsList:::page_size"]=""
operation_parameters_collection_type["adGroupsList:::order"]=""
operation_parameters_collection_type["adGroupsList:::bookmark"]=""
operation_parameters_collection_type["adGroupsList:::translate_interests_to_names"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::ad_group_ids"]="multi"
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::start_date"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::end_date"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::targeting_types"]="csv"
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::columns"]="csv"
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::granularity"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::click_window_days"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::engagement_window_days"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::view_window_days"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::conversion_report_time"]=""
operation_parameters_collection_type["adGroupsTargetingAnalyticsGet:::attribution_types"]=""
operation_parameters_collection_type["adGroupsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsUpdate:::AdGroupUpdateRequest"]=
operation_parameters_collection_type["adPreviewsCreate:::ad_account_id"]=""
operation_parameters_collection_type["adPreviewsCreate:::AdPreviewRequest"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::ad_account_id"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::ad_ids"]="multi"
operation_parameters_collection_type["adTargetingAnalyticsGet:::start_date"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::end_date"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::targeting_types"]="csv"
operation_parameters_collection_type["adTargetingAnalyticsGet:::columns"]="csv"
operation_parameters_collection_type["adTargetingAnalyticsGet:::granularity"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::click_window_days"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::engagement_window_days"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::view_window_days"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::conversion_report_time"]=""
operation_parameters_collection_type["adTargetingAnalyticsGet:::attribution_types"]=""
operation_parameters_collection_type["adsAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["adsAnalytics:::start_date"]=""
operation_parameters_collection_type["adsAnalytics:::end_date"]=""
operation_parameters_collection_type["adsAnalytics:::ad_ids"]="multi"
operation_parameters_collection_type["adsAnalytics:::columns"]="csv"
operation_parameters_collection_type["adsAnalytics:::granularity"]=""
operation_parameters_collection_type["adsAnalytics:::click_window_days"]=""
operation_parameters_collection_type["adsAnalytics:::engagement_window_days"]=""
operation_parameters_collection_type["adsAnalytics:::view_window_days"]=""
operation_parameters_collection_type["adsAnalytics:::conversion_report_time"]=""
operation_parameters_collection_type["adsCreate:::ad_account_id"]=""
operation_parameters_collection_type["adsCreate:::AdCreateRequest"]=
operation_parameters_collection_type["adsGet:::ad_account_id"]=""
operation_parameters_collection_type["adsGet:::ad_id"]=""
operation_parameters_collection_type["adsList:::ad_account_id"]=""
operation_parameters_collection_type["adsList:::campaign_ids"]="multi"
operation_parameters_collection_type["adsList:::ad_group_ids"]="multi"
operation_parameters_collection_type["adsList:::ad_ids"]="multi"
operation_parameters_collection_type["adsList:::entity_statuses"]="multi"
operation_parameters_collection_type["adsList:::page_size"]=""
operation_parameters_collection_type["adsList:::order"]=""
operation_parameters_collection_type["adsList:::bookmark"]=""
operation_parameters_collection_type["adsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["adsUpdate:::AdUpdateRequest"]=
operation_parameters_collection_type["audienceInsightsGet:::ad_account_id"]=""
operation_parameters_collection_type["audienceInsightsGet:::audience_insight_type"]=""
operation_parameters_collection_type["audienceInsightsScopeAndTypeGet:::ad_account_id"]=""
operation_parameters_collection_type["audiencesCreate:::ad_account_id"]=""
operation_parameters_collection_type["audiencesCreate:::AudienceCreateRequest"]=""
operation_parameters_collection_type["audiencesCreateCustom:::ad_account_id"]=""
operation_parameters_collection_type["audiencesCreateCustom:::AudienceCreateCustomRequest"]=""
operation_parameters_collection_type["audiencesGet:::ad_account_id"]=""
operation_parameters_collection_type["audiencesGet:::audience_id"]=""
operation_parameters_collection_type["audiencesList:::ad_account_id"]=""
operation_parameters_collection_type["audiencesList:::bookmark"]=""
operation_parameters_collection_type["audiencesList:::order"]=""
operation_parameters_collection_type["audiencesList:::page_size"]=""
operation_parameters_collection_type["audiencesList:::ownership_type"]=""
operation_parameters_collection_type["audiencesUpdate:::ad_account_id"]=""
operation_parameters_collection_type["audiencesUpdate:::audience_id"]=""
operation_parameters_collection_type["audiencesUpdate:::AudienceUpdateRequest"]=""
operation_parameters_collection_type["adsCreditRedeem:::ad_account_id"]=""
operation_parameters_collection_type["adsCreditRedeem:::AdsCreditRedeemRequest"]=""
operation_parameters_collection_type["adsCreditsDiscountsGet:::ad_account_id"]=""
operation_parameters_collection_type["adsCreditsDiscountsGet:::bookmark"]=""
operation_parameters_collection_type["adsCreditsDiscountsGet:::page_size"]=""
operation_parameters_collection_type["billingProfilesGet:::ad_account_id"]=""
operation_parameters_collection_type["billingProfilesGet:::is_active"]=""
operation_parameters_collection_type["billingProfilesGet:::bookmark"]=""
operation_parameters_collection_type["billingProfilesGet:::page_size"]=""
operation_parameters_collection_type["ssioAccountsGet:::ad_account_id"]=""
operation_parameters_collection_type["ssioInsertionOrderCreate:::ad_account_id"]=""
operation_parameters_collection_type["ssioInsertionOrderCreate:::SSIOCreateInsertionOrderRequest"]=""
operation_parameters_collection_type["ssioInsertionOrderEdit:::ad_account_id"]=""
operation_parameters_collection_type["ssioInsertionOrderEdit:::SSIOEditInsertionOrderRequest"]=""
operation_parameters_collection_type["ssioInsertionOrdersStatusGetByAdAccount:::ad_account_id"]=""
operation_parameters_collection_type["ssioInsertionOrdersStatusGetByAdAccount:::bookmark"]=""
operation_parameters_collection_type["ssioInsertionOrdersStatusGetByAdAccount:::page_size"]=""
operation_parameters_collection_type["ssioInsertionOrdersStatusGetByPinOrderId:::ad_account_id"]=""
operation_parameters_collection_type["ssioInsertionOrdersStatusGetByPinOrderId:::pin_order_id"]=""
operation_parameters_collection_type["ssioOrderLinesGetByAdAccount:::ad_account_id"]=""
operation_parameters_collection_type["ssioOrderLinesGetByAdAccount:::bookmark"]=""
operation_parameters_collection_type["ssioOrderLinesGetByAdAccount:::page_size"]=""
operation_parameters_collection_type["ssioOrderLinesGetByAdAccount:::pin_order_id"]=""
operation_parameters_collection_type["boardSectionsCreate:::board_id"]=""
operation_parameters_collection_type["boardSectionsCreate:::BoardSection"]=""
operation_parameters_collection_type["boardSectionsCreate:::ad_account_id"]=""
operation_parameters_collection_type["boardSectionsDelete:::board_id"]=""
operation_parameters_collection_type["boardSectionsDelete:::section_id"]=""
operation_parameters_collection_type["boardSectionsDelete:::ad_account_id"]=""
operation_parameters_collection_type["boardSectionsList:::board_id"]=""
operation_parameters_collection_type["boardSectionsList:::ad_account_id"]=""
operation_parameters_collection_type["boardSectionsList:::bookmark"]=""
operation_parameters_collection_type["boardSectionsList:::page_size"]=""
operation_parameters_collection_type["boardSectionsListPins:::board_id"]=""
operation_parameters_collection_type["boardSectionsListPins:::section_id"]=""
operation_parameters_collection_type["boardSectionsListPins:::ad_account_id"]=""
operation_parameters_collection_type["boardSectionsListPins:::bookmark"]=""
operation_parameters_collection_type["boardSectionsListPins:::page_size"]=""
operation_parameters_collection_type["boardSectionsUpdate:::board_id"]=""
operation_parameters_collection_type["boardSectionsUpdate:::section_id"]=""
operation_parameters_collection_type["boardSectionsUpdate:::BoardSection"]=""
operation_parameters_collection_type["boardSectionsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["boardsCreate:::Board"]=""
operation_parameters_collection_type["boardsCreate:::ad_account_id"]=""
operation_parameters_collection_type["boardsDelete:::board_id"]=""
operation_parameters_collection_type["boardsDelete:::ad_account_id"]=""
operation_parameters_collection_type["boardsGet:::board_id"]=""
operation_parameters_collection_type["boardsGet:::ad_account_id"]=""
operation_parameters_collection_type["boardsList:::ad_account_id"]=""
operation_parameters_collection_type["boardsList:::bookmark"]=""
operation_parameters_collection_type["boardsList:::page_size"]=""
operation_parameters_collection_type["boardsList:::privacy"]=""
operation_parameters_collection_type["boardsListPins:::board_id"]=""
operation_parameters_collection_type["boardsListPins:::bookmark"]=""
operation_parameters_collection_type["boardsListPins:::page_size"]=""
operation_parameters_collection_type["boardsListPins:::creative_types"]="multi"
operation_parameters_collection_type["boardsListPins:::ad_account_id"]=""
operation_parameters_collection_type["boardsListPins:::pin_metrics"]=""
operation_parameters_collection_type["boardsUpdate:::board_id"]=""
operation_parameters_collection_type["boardsUpdate:::BoardUpdate"]=""
operation_parameters_collection_type["boardsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["bulkDownloadCreate:::ad_account_id"]=""
operation_parameters_collection_type["bulkDownloadCreate:::BulkDownloadRequest"]=""
operation_parameters_collection_type["bulkRequestGet:::ad_account_id"]=""
operation_parameters_collection_type["bulkRequestGet:::bulk_request_id"]=""
operation_parameters_collection_type["bulkRequestGet:::include_details"]=""
operation_parameters_collection_type["bulkUpsertCreate:::ad_account_id"]=""
operation_parameters_collection_type["bulkUpsertCreate:::BulkUpsertRequest"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::ad_account_id"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::campaign_ids"]="multi"
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::start_date"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::end_date"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::targeting_types"]="csv"
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::columns"]="csv"
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::granularity"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::click_window_days"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::engagement_window_days"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::view_window_days"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::conversion_report_time"]=""
operation_parameters_collection_type["campaignTargetingAnalyticsGet:::attribution_types"]=""
operation_parameters_collection_type["campaignsAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["campaignsAnalytics:::start_date"]=""
operation_parameters_collection_type["campaignsAnalytics:::end_date"]=""
operation_parameters_collection_type["campaignsAnalytics:::campaign_ids"]="multi"
operation_parameters_collection_type["campaignsAnalytics:::columns"]="csv"
operation_parameters_collection_type["campaignsAnalytics:::granularity"]=""
operation_parameters_collection_type["campaignsAnalytics:::click_window_days"]=""
operation_parameters_collection_type["campaignsAnalytics:::engagement_window_days"]=""
operation_parameters_collection_type["campaignsAnalytics:::view_window_days"]=""
operation_parameters_collection_type["campaignsAnalytics:::conversion_report_time"]=""
operation_parameters_collection_type["campaignsCreate:::ad_account_id"]=""
operation_parameters_collection_type["campaignsCreate:::CampaignCreateRequest"]=
operation_parameters_collection_type["campaignsGet:::ad_account_id"]=""
operation_parameters_collection_type["campaignsGet:::campaign_id"]=""
operation_parameters_collection_type["campaignsList:::ad_account_id"]=""
operation_parameters_collection_type["campaignsList:::campaign_ids"]="multi"
operation_parameters_collection_type["campaignsList:::entity_statuses"]="multi"
operation_parameters_collection_type["campaignsList:::page_size"]=""
operation_parameters_collection_type["campaignsList:::order"]=""
operation_parameters_collection_type["campaignsList:::bookmark"]=""
operation_parameters_collection_type["campaignsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["campaignsUpdate:::CampaignUpdateRequest"]=
operation_parameters_collection_type["catalogsList:::bookmark"]=""
operation_parameters_collection_type["catalogsList:::page_size"]=""
operation_parameters_collection_type["catalogsList:::ad_account_id"]=""
operation_parameters_collection_type["catalogsProductGroupPinsList:::product_group_id"]=""
operation_parameters_collection_type["catalogsProductGroupPinsList:::bookmark"]=""
operation_parameters_collection_type["catalogsProductGroupPinsList:::page_size"]=""
operation_parameters_collection_type["catalogsProductGroupPinsList:::ad_account_id"]=""
operation_parameters_collection_type["catalogsProductGroupsCreate:::CatalogsProductGroupsCreateRequest"]=""
operation_parameters_collection_type["catalogsProductGroupsCreate:::ad_account_id"]=""
operation_parameters_collection_type["catalogsProductGroupsDelete:::product_group_id"]=""
operation_parameters_collection_type["catalogsProductGroupsDelete:::ad_account_id"]=""
operation_parameters_collection_type["catalogsProductGroupsGet:::product_group_id"]=""
operation_parameters_collection_type["catalogsProductGroupsGet:::ad_account_id"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::feed_id"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::catalog_id"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::bookmark"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::page_size"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::ad_account_id"]=""
operation_parameters_collection_type["catalogsProductGroupsProductCountsGet:::product_group_id"]=""
operation_parameters_collection_type["catalogsProductGroupsProductCountsGet:::ad_account_id"]=""
operation_parameters_collection_type["catalogsProductGroupsUpdate:::product_group_id"]=""
operation_parameters_collection_type["catalogsProductGroupsUpdate:::CatalogsProductGroupsUpdateRequest"]=""
operation_parameters_collection_type["catalogsProductGroupsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["feedProcessingResultsList:::feed_id"]=""
operation_parameters_collection_type["feedProcessingResultsList:::bookmark"]=""
operation_parameters_collection_type["feedProcessingResultsList:::page_size"]=""
operation_parameters_collection_type["feedProcessingResultsList:::ad_account_id"]=""
operation_parameters_collection_type["feedsCreate:::FeedsCreateRequest"]=""
operation_parameters_collection_type["feedsCreate:::ad_account_id"]=""
operation_parameters_collection_type["feedsDelete:::feed_id"]=""
operation_parameters_collection_type["feedsDelete:::ad_account_id"]=""
operation_parameters_collection_type["feedsGet:::feed_id"]=""
operation_parameters_collection_type["feedsGet:::ad_account_id"]=""
operation_parameters_collection_type["feedsList:::bookmark"]=""
operation_parameters_collection_type["feedsList:::page_size"]=""
operation_parameters_collection_type["feedsList:::catalog_id"]=""
operation_parameters_collection_type["feedsList:::ad_account_id"]=""
operation_parameters_collection_type["feedsUpdate:::feed_id"]=""
operation_parameters_collection_type["feedsUpdate:::FeedsUpdateRequest"]=""
operation_parameters_collection_type["feedsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["itemsBatchGet:::batch_id"]=""
operation_parameters_collection_type["itemsBatchGet:::ad_account_id"]=""
operation_parameters_collection_type["itemsBatchPost:::ItemsBatchPostRequest"]=""
operation_parameters_collection_type["itemsBatchPost:::ad_account_id"]=""
operation_parameters_collection_type["itemsGet:::country"]=""
operation_parameters_collection_type["itemsGet:::language"]=""
operation_parameters_collection_type["itemsGet:::ad_account_id"]=""
operation_parameters_collection_type["itemsGet:::item_ids"]="multi"
operation_parameters_collection_type["itemsGet:::filters"]=""
operation_parameters_collection_type["itemsIssuesList:::processing_result_id"]=""
operation_parameters_collection_type["itemsIssuesList:::bookmark"]=""
operation_parameters_collection_type["itemsIssuesList:::page_size"]=""
operation_parameters_collection_type["itemsIssuesList:::item_numbers"]="multi"
operation_parameters_collection_type["itemsIssuesList:::item_validation_issue"]=""
operation_parameters_collection_type["itemsIssuesList:::ad_account_id"]=""
operation_parameters_collection_type["productsByProductGroupFilterList:::CatalogsListProductsByFilterRequest"]=""
operation_parameters_collection_type["productsByProductGroupFilterList:::bookmark"]=""
operation_parameters_collection_type["productsByProductGroupFilterList:::page_size"]=""
operation_parameters_collection_type["productsByProductGroupFilterList:::ad_account_id"]=""
operation_parameters_collection_type["eventsCreate:::ad_account_id"]=""
operation_parameters_collection_type["eventsCreate:::ConversionEvents"]=""
operation_parameters_collection_type["eventsCreate:::test"]=""
operation_parameters_collection_type["conversionTagsCreate:::ad_account_id"]=""
operation_parameters_collection_type["conversionTagsCreate:::ConversionTagCreate"]=""
operation_parameters_collection_type["conversionTagsGet:::ad_account_id"]=""
operation_parameters_collection_type["conversionTagsGet:::conversion_tag_id"]=""
operation_parameters_collection_type["conversionTagsList:::ad_account_id"]=""
operation_parameters_collection_type["conversionTagsList:::filter_deleted"]=""
operation_parameters_collection_type["ocpmEligibleConversionTagsGet:::ad_account_id"]=""
operation_parameters_collection_type["pageVisitConversionTagsGet:::ad_account_id"]=""
operation_parameters_collection_type["pageVisitConversionTagsGet:::page_size"]=""
operation_parameters_collection_type["pageVisitConversionTagsGet:::order"]=""
operation_parameters_collection_type["pageVisitConversionTagsGet:::bookmark"]=""
operation_parameters_collection_type["customerListsCreate:::ad_account_id"]=""
operation_parameters_collection_type["customerListsCreate:::CustomerListRequest"]=""
operation_parameters_collection_type["customerListsGet:::ad_account_id"]=""
operation_parameters_collection_type["customerListsGet:::customer_list_id"]=""
operation_parameters_collection_type["customerListsList:::ad_account_id"]=""
operation_parameters_collection_type["customerListsList:::page_size"]=""
operation_parameters_collection_type["customerListsList:::order"]=""
operation_parameters_collection_type["customerListsList:::bookmark"]=""
operation_parameters_collection_type["customerListsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["customerListsUpdate:::customer_list_id"]=""
operation_parameters_collection_type["customerListsUpdate:::CustomerListUpdateRequest"]=""
operation_parameters_collection_type["integrationsCommerceDel:::external_business_id"]=""
operation_parameters_collection_type["integrationsCommerceGet:::external_business_id"]=""
operation_parameters_collection_type["integrationsCommercePatch:::external_business_id"]=""
operation_parameters_collection_type["integrationsCommercePatch:::IntegrationRequestPatch"]=""
operation_parameters_collection_type["integrationsCommercePost:::IntegrationRequest"]=""
operation_parameters_collection_type["integrationsGetById:::id"]=""
operation_parameters_collection_type["integrationsGetList:::bookmark"]=""
operation_parameters_collection_type["integrationsGetList:::page_size"]=""
operation_parameters_collection_type["integrationsLogsPost:::IntegrationLogsRequest"]=""
operation_parameters_collection_type["countryKeywordsMetricsGet:::ad_account_id"]=""
operation_parameters_collection_type["countryKeywordsMetricsGet:::country_code"]=""
operation_parameters_collection_type["countryKeywordsMetricsGet:::keywords"]="csv"
operation_parameters_collection_type["keywordsCreate:::ad_account_id"]=""
operation_parameters_collection_type["keywordsCreate:::KeywordsRequest"]=""
operation_parameters_collection_type["keywordsGet:::ad_account_id"]=""
operation_parameters_collection_type["keywordsGet:::campaign_id"]=""
operation_parameters_collection_type["keywordsGet:::ad_group_id"]=""
operation_parameters_collection_type["keywordsGet:::match_types"]="multi"
operation_parameters_collection_type["keywordsGet:::page_size"]=""
operation_parameters_collection_type["keywordsGet:::bookmark"]=""
operation_parameters_collection_type["keywordsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["keywordsUpdate:::KeywordUpdateBody"]=""
operation_parameters_collection_type["trendingKeywordsList:::region"]=""
operation_parameters_collection_type["trendingKeywordsList:::trend_type"]=""
operation_parameters_collection_type["trendingKeywordsList:::interests"]="multi"
operation_parameters_collection_type["trendingKeywordsList:::genders"]="multi"
operation_parameters_collection_type["trendingKeywordsList:::ages"]="multi"
operation_parameters_collection_type["trendingKeywordsList:::normalize_against_group"]=""
operation_parameters_collection_type["trendingKeywordsList:::limit"]=""
operation_parameters_collection_type["adAccountsSubscriptionsDelById:::ad_account_id"]=""
operation_parameters_collection_type["adAccountsSubscriptionsDelById:::subscription_id"]=""
operation_parameters_collection_type["adAccountsSubscriptionsGetById:::ad_account_id"]=""
operation_parameters_collection_type["adAccountsSubscriptionsGetById:::subscription_id"]=""
operation_parameters_collection_type["adAccountsSubscriptionsGetList:::ad_account_id"]=""
operation_parameters_collection_type["adAccountsSubscriptionsGetList:::page_size"]=""
operation_parameters_collection_type["adAccountsSubscriptionsGetList:::bookmark"]=""
operation_parameters_collection_type["adAccountsSubscriptionsPost:::ad_account_id"]=""
operation_parameters_collection_type["adAccountsSubscriptionsPost:::AdAccountCreateSubscriptionRequest"]=""
operation_parameters_collection_type["leadFormGet:::ad_account_id"]=""
operation_parameters_collection_type["leadFormGet:::lead_form_id"]=""
operation_parameters_collection_type["leadFormTestCreate:::ad_account_id"]=""
operation_parameters_collection_type["leadFormTestCreate:::lead_form_id"]=""
operation_parameters_collection_type["leadFormTestCreate:::LeadFormTestRequest"]=""
operation_parameters_collection_type["leadFormsList:::ad_account_id"]=""
operation_parameters_collection_type["leadFormsList:::page_size"]=""
operation_parameters_collection_type["leadFormsList:::order"]=""
operation_parameters_collection_type["leadFormsList:::bookmark"]=""
operation_parameters_collection_type["mediaCreate:::MediaUploadRequest"]=""
operation_parameters_collection_type["mediaGet:::media_id"]=""
operation_parameters_collection_type["mediaList:::bookmark"]=""
operation_parameters_collection_type["mediaList:::page_size"]=""
operation_parameters_collection_type["oauthToken:::grant_type"]=""
operation_parameters_collection_type["orderLinesGet:::ad_account_id"]=""
operation_parameters_collection_type["orderLinesGet:::order_line_id"]=""
operation_parameters_collection_type["orderLinesList:::ad_account_id"]=""
operation_parameters_collection_type["orderLinesList:::page_size"]=""
operation_parameters_collection_type["orderLinesList:::order"]=""
operation_parameters_collection_type["orderLinesList:::bookmark"]=""
operation_parameters_collection_type["pinsAnalytics:::pin_id"]=""
operation_parameters_collection_type["pinsAnalytics:::start_date"]=""
operation_parameters_collection_type["pinsAnalytics:::end_date"]=""
operation_parameters_collection_type["pinsAnalytics:::metric_types"]="csv"
operation_parameters_collection_type["pinsAnalytics:::app_types"]=""
operation_parameters_collection_type["pinsAnalytics:::split_field"]=""
operation_parameters_collection_type["pinsAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["pinsCreate:::PinCreate"]=""
operation_parameters_collection_type["pinsCreate:::ad_account_id"]=""
operation_parameters_collection_type["pinsDelete:::pin_id"]=""
operation_parameters_collection_type["pinsDelete:::ad_account_id"]=""
operation_parameters_collection_type["pinsGet:::pin_id"]=""
operation_parameters_collection_type["pinsGet:::pin_metrics"]=""
operation_parameters_collection_type["pinsGet:::ad_account_id"]=""
operation_parameters_collection_type["pinsList:::bookmark"]=""
operation_parameters_collection_type["pinsList:::page_size"]=""
operation_parameters_collection_type["pinsList:::pin_filter"]=""
operation_parameters_collection_type["pinsList:::include_protected_pins"]=""
operation_parameters_collection_type["pinsList:::pin_type"]=""
operation_parameters_collection_type["pinsList:::creative_types"]="multi"
operation_parameters_collection_type["pinsList:::ad_account_id"]=""
operation_parameters_collection_type["pinsList:::pin_metrics"]=""
operation_parameters_collection_type["pinsSave:::pin_id"]=""
operation_parameters_collection_type["pinsSave:::PinsSaveRequest"]=""
operation_parameters_collection_type["pinsSave:::ad_account_id"]=""
operation_parameters_collection_type["pinsUpdate:::pin_id"]=""
operation_parameters_collection_type["pinsUpdate:::PinUpdate"]=""
operation_parameters_collection_type["pinsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["productGroupPromotionsCreate:::ad_account_id"]=""
operation_parameters_collection_type["productGroupPromotionsCreate:::ProductGroupPromotionCreateRequest"]=""
operation_parameters_collection_type["productGroupPromotionsGet:::ad_account_id"]=""
operation_parameters_collection_type["productGroupPromotionsGet:::product_group_promotion_id"]=""
operation_parameters_collection_type["productGroupPromotionsList:::ad_account_id"]=""
operation_parameters_collection_type["productGroupPromotionsList:::product_group_promotion_ids"]="multi"
operation_parameters_collection_type["productGroupPromotionsList:::entity_statuses"]="multi"
operation_parameters_collection_type["productGroupPromotionsList:::ad_group_id"]=""
operation_parameters_collection_type["productGroupPromotionsList:::page_size"]=""
operation_parameters_collection_type["productGroupPromotionsList:::order"]=""
operation_parameters_collection_type["productGroupPromotionsList:::bookmark"]=""
operation_parameters_collection_type["productGroupPromotionsUpdate:::ad_account_id"]=""
operation_parameters_collection_type["productGroupPromotionsUpdate:::ProductGroupPromotionUpdateRequest"]=""
operation_parameters_collection_type["productGroupsAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["productGroupsAnalytics:::start_date"]=""
operation_parameters_collection_type["productGroupsAnalytics:::end_date"]=""
operation_parameters_collection_type["productGroupsAnalytics:::product_group_ids"]="multi"
operation_parameters_collection_type["productGroupsAnalytics:::columns"]="csv"
operation_parameters_collection_type["productGroupsAnalytics:::granularity"]=""
operation_parameters_collection_type["productGroupsAnalytics:::click_window_days"]=""
operation_parameters_collection_type["productGroupsAnalytics:::engagement_window_days"]=""
operation_parameters_collection_type["productGroupsAnalytics:::view_window_days"]=""
operation_parameters_collection_type["productGroupsAnalytics:::conversion_report_time"]=""
operation_parameters_collection_type["adAccountsCatalogsProductGroupsList:::ad_account_id"]=""
operation_parameters_collection_type["adAccountsCatalogsProductGroupsList:::feed_profile_id"]=""
operation_parameters_collection_type["deliveryMetricsGet:::report_type"]=""
operation_parameters_collection_type["interestTargetingOptionsGet:::interest_id"]=""
operation_parameters_collection_type["metricsReadyStateGet:::date"]=""
operation_parameters_collection_type["targetingOptionsGet:::targeting_type"]=""
operation_parameters_collection_type["targetingOptionsGet:::client_id"]=""
operation_parameters_collection_type["targetingOptionsGet:::oauth_signature"]=""
operation_parameters_collection_type["targetingOptionsGet:::timestamp"]=""
operation_parameters_collection_type["searchPartnerPins:::term"]=""
operation_parameters_collection_type["searchPartnerPins:::country_code"]=""
operation_parameters_collection_type["searchPartnerPins:::bookmark"]=""
operation_parameters_collection_type["searchPartnerPins:::locale"]=""
operation_parameters_collection_type["searchPartnerPins:::limit"]=""
operation_parameters_collection_type["searchUserBoardsGet:::ad_account_id"]=""
operation_parameters_collection_type["searchUserBoardsGet:::bookmark"]=""
operation_parameters_collection_type["searchUserBoardsGet:::page_size"]=""
operation_parameters_collection_type["searchUserBoardsGet:::query"]=""
operation_parameters_collection_type["searchUserPinsList:::query"]=""
operation_parameters_collection_type["searchUserPinsList:::ad_account_id"]=""
operation_parameters_collection_type["searchUserPinsList:::bookmark"]=""
operation_parameters_collection_type["termsRelatedList:::terms"]="multi"
operation_parameters_collection_type["termsSuggestedList:::term"]=""
operation_parameters_collection_type["termsSuggestedList:::limit"]=""
operation_parameters_collection_type["termsOfServiceGet:::ad_account_id"]=""
operation_parameters_collection_type["termsOfServiceGet:::include_html"]=""
operation_parameters_collection_type["termsOfServiceGet:::tos_type"]=""
operation_parameters_collection_type["boardsUserFollowsList:::bookmark"]=""
operation_parameters_collection_type["boardsUserFollowsList:::page_size"]=""
operation_parameters_collection_type["boardsUserFollowsList:::explicit_following"]=""
operation_parameters_collection_type["boardsUserFollowsList:::ad_account_id"]=""
operation_parameters_collection_type["followUserUpdate:::username"]=""
operation_parameters_collection_type["followUserUpdate:::FollowUserRequest"]=""
operation_parameters_collection_type["followersList:::bookmark"]=""
operation_parameters_collection_type["followersList:::page_size"]=""
operation_parameters_collection_type["unverifyWebsiteDelete:::website"]=""
operation_parameters_collection_type["userAccountAnalytics:::start_date"]=""
operation_parameters_collection_type["userAccountAnalytics:::end_date"]=""
operation_parameters_collection_type["userAccountAnalytics:::from_claimed_content"]=""
operation_parameters_collection_type["userAccountAnalytics:::pin_format"]=""
operation_parameters_collection_type["userAccountAnalytics:::app_types"]=""
operation_parameters_collection_type["userAccountAnalytics:::content_type"]=""
operation_parameters_collection_type["userAccountAnalytics:::source"]=""
operation_parameters_collection_type["userAccountAnalytics:::metric_types"]="csv"
operation_parameters_collection_type["userAccountAnalytics:::split_field"]=""
operation_parameters_collection_type["userAccountAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::start_date"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::end_date"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::sort_by"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::from_claimed_content"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::pin_format"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::app_types"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::content_type"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::source"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::metric_types"]="csv"
operation_parameters_collection_type["userAccountAnalyticsTopPins:::num_of_pins"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::created_in_last_n_days"]=""
operation_parameters_collection_type["userAccountAnalyticsTopPins:::ad_account_id"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::start_date"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::end_date"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::sort_by"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::from_claimed_content"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::pin_format"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::app_types"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::content_type"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::source"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::metric_types"]="csv"
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::num_of_pins"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::created_in_last_n_days"]=""
operation_parameters_collection_type["userAccountAnalyticsTopVideoPins:::ad_account_id"]=""
operation_parameters_collection_type["userAccountFollowedInterests:::username"]=""
operation_parameters_collection_type["userAccountFollowedInterests:::bookmark"]=""
operation_parameters_collection_type["userAccountFollowedInterests:::page_size"]=""
operation_parameters_collection_type["userAccountGet:::ad_account_id"]=""
operation_parameters_collection_type["userFollowingGet:::bookmark"]=""
operation_parameters_collection_type["userFollowingGet:::page_size"]=""
operation_parameters_collection_type["userFollowingGet:::feed_type"]=""
operation_parameters_collection_type["userFollowingGet:::explicit_following"]=""
operation_parameters_collection_type["userFollowingGet:::ad_account_id"]=""
operation_parameters_collection_type["userWebsitesGet:::bookmark"]=""
operation_parameters_collection_type["userWebsitesGet:::page_size"]=""
operation_parameters_collection_type["verifyWebsiteUpdate:::UserWebsiteVerifyRequest"]=""


##
# Map for body parameters passed after operation as
# PARAMETER==STRING_VALUE or PARAMETER:=NUMERIC_VALUE
# These will be mapped to top level json keys ( { "PARAMETER": "VALUE" })
declare -A body_parameters

##
# These arguments will be directly passed to cURL
curl_arguments=""

##
# The host for making the request
host=""

##
# The user credentials for basic authentication
basic_auth_credential=""


##
# If true, the script will only output the actual cURL command that would be
# used
print_curl=false

##
# The operation ID passed on the command line
operation=""

##
# The provided Accept header value
header_accept=""

##
# The provided Content-type header value
header_content_type=""

##
# If there is any body content on the stdin pass it to the body of the request
body_content_temp_file=""

##
# If this variable is set to true, the request will be performed even
# if parameters for required query, header or body values are not provided
# (path parameters are still required).
force=false

##
# Declare some mime types abbreviations for easier content-type and accepts
# headers specification
declare -A mime_type_abbreviations
# text/*
mime_type_abbreviations["text"]="text/plain"
mime_type_abbreviations["html"]="text/html"
mime_type_abbreviations["md"]="text/x-markdown"
mime_type_abbreviations["csv"]="text/csv"
mime_type_abbreviations["css"]="text/css"
mime_type_abbreviations["rtf"]="text/rtf"
# application/*
mime_type_abbreviations["json"]="application/json"
mime_type_abbreviations["xml"]="application/xml"
mime_type_abbreviations["yaml"]="application/yaml"
mime_type_abbreviations["js"]="application/javascript"
mime_type_abbreviations["bin"]="application/octet-stream"
mime_type_abbreviations["rdf"]="application/rdf+xml"
# image/*
mime_type_abbreviations["jpg"]="image/jpeg"
mime_type_abbreviations["png"]="image/png"
mime_type_abbreviations["gif"]="image/gif"
mime_type_abbreviations["bmp"]="image/bmp"
mime_type_abbreviations["tiff"]="image/tiff"


##############################################################################
#
# Escape special URL characters
# Based on table at http://www.w3schools.com/tags/ref_urlencode.asp
#
##############################################################################
url_escape() {
    local raw_url="$1"

    value=$(sed -e 's/ /%20/g' \
       -e 's/!/%21/g' \
       -e 's/"/%22/g' \
       -e 's/#/%23/g' \
       -e 's/\&/%26/g' \
       -e 's/'\''/%28/g' \
       -e 's/(/%28/g' \
       -e 's/)/%29/g' \
       -e 's/:/%3A/g' \
       -e 's/\\t/%09/g' \
       -e 's/?/%3F/g' <<<"$raw_url");

    echo "$value"
}

##############################################################################
#
# Lookup the mime type abbreviation in the mime_type_abbreviations array.
# If not present assume the user provided a valid mime type
#
##############################################################################
lookup_mime_type() {
    local mime_type="$1"

    if [[ ${mime_type_abbreviations[$mime_type]} ]]; then
        echo "${mime_type_abbreviations[$mime_type]}"
    else
        echo "$mime_type"
    fi
}

##############################################################################
#
# Converts an associative array into a list of cURL header
# arguments (-H "KEY: VALUE")
#
##############################################################################
header_arguments_to_curl() {
    local headers_curl=""

    for key in "${!header_arguments[@]}"; do
        headers_curl+="-H \"${key}: ${header_arguments[${key}]}\" "
    done
    headers_curl+=" "

    echo "${headers_curl}"
}

##############################################################################
#
# Converts an associative array into a simple JSON with keys as top
# level object attributes
#
# \todo Add conversion of more complex attributes using paths
#
##############################################################################
body_parameters_to_json() {
    if [[ $RAW_BODY == "1" ]]; then
        echo "-d '${body_parameters["RAW_BODY"]}'"
    else
        local body_json="-d '{"
        local count=0
        for key in "${!body_parameters[@]}"; do
            if [[ $((count++)) -gt 0 ]]; then
                body_json+=", "
            fi
            body_json+="\"${key}\": ${body_parameters[${key}]}"
        done
        body_json+="}'"

        if [[ "${#body_parameters[@]}" -eq 0 ]]; then
            echo ""
        else
            echo "${body_json}"
        fi
    fi
}

##############################################################################
#
# Converts an associative array into form urlencoded string
#
##############################################################################
body_parameters_to_form_urlencoded() {
    local body_form_urlencoded="-d '"
    local count=0
    for key in "${!body_parameters[@]}"; do
        if [[ $((count++)) -gt 0 ]]; then
            body_form_urlencoded+="&"
        fi
        body_form_urlencoded+="${key}=${body_parameters[${key}]}"
    done
    body_form_urlencoded+="'"

    if [[ "${#body_parameters[@]}" -eq 0 ]]; then
        echo ""
    else
        echo "${body_form_urlencoded}"
    fi
}

##############################################################################
#
# Helper method for showing error because for example echo in
# build_request_path() is evaluated as part of command line not printed on
# output. Anyway better idea for resource clean up ;-).
#
##############################################################################
ERROR_MSG=""
function finish {
    if [[ -n "$ERROR_MSG" ]]; then
        echo >&2 "${OFF}${RED}$ERROR_MSG"
        echo >&2 "${OFF}Check usage: '${script_name} --help'"
    fi
}
trap finish EXIT


##############################################################################
#
# Validate and build request path including query parameters
#
##############################################################################
build_request_path() {
    local path_template=$1
    local -n path_params=$2
    local -n query_params=$3


    #
    # Check input parameters count against minimum and maximum required
    #
    if [[ "$force" = false ]]; then
        local was_error=""
        for qparam in "${query_params[@]}" "${path_params[@]}"; do
            local parameter_values
            mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

            #
            # Check if the number of provided values is not less than minimum required
            #
            if [[ ${#parameter_values[@]} -lt ${operation_parameters_minimum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too few values provided for '${qparam}' parameter."
                was_error=true
            fi

            #
            # Check if the number of provided values is not more than maximum
            #
            if [[ ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} -gt 0 \
                  && ${#parameter_values[@]} -gt ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too many values provided for '${qparam}' parameter"
                was_error=true
            fi
        done
        if [[ -n "$was_error" ]]; then
            exit 1
        fi
    fi

    # First replace all path parameters in the path
    for pparam in "${path_params[@]}"; do
        local path_regex="(.*)(\\{$pparam\\})(.*)"
        if [[ $path_template =~ $path_regex ]]; then
            path_template=${BASH_REMATCH[1]}${operation_parameters[$pparam]}${BASH_REMATCH[3]}
        fi
    done

    local query_request_part=""

    for qparam in "${query_params[@]}"; do
        if [[ "${operation_parameters[$qparam]}" == "" ]]; then
            continue
        fi

        # Get the array of parameter values
        local parameter_value=""
        local parameter_values
        mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")



        #
        # Append parameters without specific cardinality
        #
        local collection_type="${operation_parameters_collection_type["${operation}:::${qparam}"]}"
        if [[ "${collection_type}" == "" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'multi' collections i.e. param=value1&param=value2&...
        #
        elif [[ "${collection_type}" == "multi" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'csv' collections i.e. param=value1,value2,...
        #
        elif [[ "${collection_type}" == "csv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=","
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'ssv' collections i.e. param="value1 value2 ..."
        #
        elif [[ "${collection_type}" == "ssv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=" "
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'tsv' collections i.e. param="value1\tvalue2\t..."
        #
        elif [[ "${collection_type}" == "tsv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="\\t"
                fi
                parameter_value+="${qvalue}"
            done
        else
            echo "Unsupported collection format \"${collection_type}\""
            exit 1
        fi

        if [[ -n "${parameter_value}" ]]; then
            if [[ -n "${query_request_part}" ]]; then
                query_request_part+="&"
            fi
            query_request_part+="${parameter_value}"
        fi

    done


    # Now append query parameters - if any
    if [[ -n "${query_request_part}" ]]; then
        path_template+="?${query_request_part}"
    fi

    echo "$path_template"
}



###############################################################################
#
# Print main help message
#
###############################################################################
print_help() {
cat <<EOF

${BOLD}${WHITE}Pinterest REST API command line client (API version 5.12.0)${OFF}

${BOLD}${WHITE}Usage${OFF}

  ${GREEN}${script_name}${OFF} [-h|--help] [-V|--version] [--about] [${RED}<curl-options>${OFF}]
           [-ac|--accept ${GREEN}<mime-type>${OFF}] [-ct,--content-type ${GREEN}<mime-type>${OFF}]
           [--host ${CYAN}<url>${OFF}] [--dry-run] [-nc|--no-colors] ${YELLOW}<operation>${OFF} [-h|--help]
           [${BLUE}<headers>${OFF}] [${MAGENTA}<parameters>${OFF}] [${MAGENTA}<body-parameters>${OFF}]

  - ${CYAN}<url>${OFF} - endpoint of the REST service without basepath

  - ${RED}<curl-options>${OFF} - any valid cURL options can be passed before ${YELLOW}<operation>${OFF}
  - ${GREEN}<mime-type>${OFF} - either full mime-type or one of supported abbreviations:
                   (text, html, md, csv, css, rtf, json, xml, yaml, js, bin,
                    rdf, jpg, png, gif, bmp, tiff)
  - ${BLUE}<headers>${OFF} - HTTP headers can be passed in the form ${YELLOW}HEADER${OFF}:${BLUE}VALUE${OFF}
  - ${MAGENTA}<parameters>${OFF} - REST operation parameters can be passed in the following
                   forms:
                   * ${YELLOW}KEY${OFF}=${BLUE}VALUE${OFF} - path or query parameters
  - ${MAGENTA}<body-parameters>${OFF} - simple JSON body content (first level only) can be build
                        using the following arguments:
                        * ${YELLOW}KEY${OFF}==${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": "${BLUE}VALUE${OFF}", ... }'
                        * ${YELLOW}KEY${OFF}:=${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": ${BLUE}VALUE${OFF}, ... }'

EOF
    echo -e "${BOLD}${WHITE}Authentication methods${OFF}"
    echo -e ""
    echo -e "  - ${MAGENTA}OAuth2 (flow: accessCode)${OFF}"
    echo -e "      Authorization URL: "
    echo -e "        * https://www.pinterest.com/oauth/"
    echo -e "      Token URL: "
    echo -e "        * https://api.pinterest.com/v5/oauth/token"
    echo -e "      Scopes:"
    echo -e "        * ads:read - See all of your advertising data, including ads, ad groups, campaigns etc."
    echo -e "        * ads:write - Create, update, or delete ads, ad groups, campaigns etc."
    echo -e "        * billing:read - See all of your billing data, billing profile, etc."
    echo -e "        * billing:write - Create, update, or delete billing data, billing profiles, etc."
    echo -e "        * biz_access:read - See business access data"
    echo -e "        * biz_access:write - Create, update, or delete business access data"
    echo -e "        * boards:read - See your public boards, including group boards you join"
    echo -e "        * boards:read_secret - See your secret boards"
    echo -e "        * boards:write - Create, update, or delete your public boards"
    echo -e "        * boards:write_secret - Create, update, or delete your secret boards"
    echo -e "        * catalogs:read - See all of your catalogs data"
    echo -e "        * catalogs:write - Create, update, or delete your catalogs data"
    echo -e "        * pins:read - See your public Pins"
    echo -e "        * pins:read_secret - See your secret Pins"
    echo -e "        * pins:write - Create, update, or delete your public Pins"
    echo -e "        * pins:write_secret - Create, update, or delete your secret Pins"
    echo -e "        * user_accounts:read - See your user accounts and followers"
    echo -e "        * user_accounts:write - Update your user accounts and followers"
    echo -e "  - ${BLUE}Basic AUTH${OFF} - add '-u <username>:<password>' before ${YELLOW}<operation>${OFF}"
    
    echo ""
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[adAccounts]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adAccountAnalytics${OFF};Get ad account analytics (AUTH)
  ${CYAN}adAccountTargetingAnalyticsGet${OFF};Get targeting analytics for an ad account (AUTH)
  ${CYAN}adAccountsCreate${OFF};Create ad account (AUTH)
  ${CYAN}adAccountsGet${OFF};Get ad account (AUTH)
  ${CYAN}adAccountsList${OFF};List ad accounts (AUTH)
  ${CYAN}analyticsCreateMmmReport${OFF};Create a request for a Marketing Mix Modeling (MMM) report (AUTH)
  ${CYAN}analyticsCreateReport${OFF};Create async request for an account analytics report (AUTH)
  ${CYAN}analyticsCreateTemplateReport${OFF};Create async request for an analytics report using a template (AUTH)
  ${CYAN}analyticsGetMmmReport${OFF};Get advertiser Marketing Mix Modeling (MMM) report. (AUTH)
  ${CYAN}analyticsGetReport${OFF};Get the account analytics report created by the async call (AUTH)
  ${CYAN}sandboxDelete${OFF};Delete ads data for ad account in API Sandbox (AUTH)
  ${CYAN}templatesList${OFF};List templates (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[adGroups]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adGroupsAnalytics${OFF};Get ad group analytics (AUTH)
  ${CYAN}adGroupsAudienceSizing${OFF};Get audience sizing (AUTH)
  ${CYAN}adGroupsBidFloorGet${OFF};Get bid floors (AUTH)
  ${CYAN}adGroupsCreate${OFF};Create ad groups (AUTH)
  ${CYAN}adGroupsGet${OFF};Get ad group (AUTH)
  ${CYAN}adGroupsList${OFF};List ad groups (AUTH)
  ${CYAN}adGroupsTargetingAnalyticsGet${OFF};Get targeting analytics for ad groups (AUTH)
  ${CYAN}adGroupsUpdate${OFF};Update ad groups (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[ads]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adPreviewsCreate${OFF};Create ad preview with pin or image (AUTH)
  ${CYAN}adTargetingAnalyticsGet${OFF};Get targeting analytics for ads (AUTH)
  ${CYAN}adsAnalytics${OFF};Get ad analytics (AUTH)
  ${CYAN}adsCreate${OFF};Create ads (AUTH)
  ${CYAN}adsGet${OFF};Get ad (AUTH)
  ${CYAN}adsList${OFF};List ads (AUTH)
  ${CYAN}adsUpdate${OFF};Update ads (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[audienceInsights]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}audienceInsightsGet${OFF};Get audience insights (AUTH)
  ${CYAN}audienceInsightsScopeAndTypeGet${OFF};Get audience insights scope and type (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[audiences]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}audiencesCreate${OFF};Create audience (AUTH)
  ${CYAN}audiencesCreateCustom${OFF};Create custom audience (AUTH)
  ${CYAN}audiencesGet${OFF};Get audience (AUTH)
  ${CYAN}audiencesList${OFF};List audiences (AUTH)
  ${CYAN}audiencesUpdate${OFF};Update audience (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[billing]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adsCreditRedeem${OFF};Redeem ad credits (AUTH)
  ${CYAN}adsCreditsDiscountsGet${OFF};Get ads credit discounts (AUTH)
  ${CYAN}billingProfilesGet${OFF};Get billing profiles (AUTH)
  ${CYAN}ssioAccountsGet${OFF};Get Salesforce account details including bill-to information. (AUTH)
  ${CYAN}ssioInsertionOrderCreate${OFF};Create insertion order through SSIO. (AUTH)
  ${CYAN}ssioInsertionOrderEdit${OFF};Edit insertion order through SSIO. (AUTH)
  ${CYAN}ssioInsertionOrdersStatusGetByAdAccount${OFF};Get insertion order status by ad account id. (AUTH)
  ${CYAN}ssioInsertionOrdersStatusGetByPinOrderId${OFF};Get insertion order status by pin order id. (AUTH)
  ${CYAN}ssioOrderLinesGetByAdAccount${OFF};Get Salesforce order lines by ad account id. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[boards]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}boardSectionsCreate${OFF};Create board section (AUTH)
  ${CYAN}boardSectionsDelete${OFF};Delete board section (AUTH)
  ${CYAN}boardSectionsList${OFF};List board sections (AUTH)
  ${CYAN}boardSectionsListPins${OFF};List Pins on board section (AUTH)
  ${CYAN}boardSectionsUpdate${OFF};Update board section (AUTH)
  ${CYAN}boardsCreate${OFF};Create board (AUTH)
  ${CYAN}boardsDelete${OFF};Delete board (AUTH)
  ${CYAN}boardsGet${OFF};Get board (AUTH)
  ${CYAN}boardsList${OFF};List boards (AUTH)
  ${CYAN}boardsListPins${OFF};List Pins on board (AUTH)
  ${CYAN}boardsUpdate${OFF};Update board (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[bulk]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}bulkDownloadCreate${OFF};Get advertiser entities in bulk (AUTH)
  ${CYAN}bulkRequestGet${OFF};Download advertiser entities in bulk (AUTH)
  ${CYAN}bulkUpsertCreate${OFF};Create/update ad entities in bulk (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[campaigns]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}campaignTargetingAnalyticsGet${OFF};Get targeting analytics for campaigns (AUTH)
  ${CYAN}campaignsAnalytics${OFF};Get campaign analytics (AUTH)
  ${CYAN}campaignsCreate${OFF};Create campaigns (AUTH)
  ${CYAN}campaignsGet${OFF};Get campaign (AUTH)
  ${CYAN}campaignsList${OFF};List campaigns (AUTH)
  ${CYAN}campaignsUpdate${OFF};Update campaigns (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[catalogs]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}catalogsList${OFF};List catalogs (AUTH)
  ${CYAN}catalogsProductGroupPinsList${OFF};List products for a Product Group (AUTH)
  ${CYAN}catalogsProductGroupsCreate${OFF};Create product group (AUTH)
  ${CYAN}catalogsProductGroupsDelete${OFF};Delete product group (AUTH)
  ${CYAN}catalogsProductGroupsGet${OFF};Get product group (AUTH)
  ${CYAN}catalogsProductGroupsList${OFF};List product groups (AUTH)
  ${CYAN}catalogsProductGroupsProductCountsGet${OFF};Get product counts for a Product Group (AUTH)
  ${CYAN}catalogsProductGroupsUpdate${OFF};Update product group (AUTH)
  ${CYAN}feedProcessingResultsList${OFF};List processing results for a given feed (AUTH)
  ${CYAN}feedsCreate${OFF};Create feed (AUTH)
  ${CYAN}feedsDelete${OFF};Delete feed (AUTH)
  ${CYAN}feedsGet${OFF};Get feed (AUTH)
  ${CYAN}feedsList${OFF};List feeds (AUTH)
  ${CYAN}feedsUpdate${OFF};Update feed (AUTH)
  ${CYAN}itemsBatchGet${OFF};Get catalogs item batch status (AUTH)
  ${CYAN}itemsBatchPost${OFF};Operate on item batch (AUTH)
  ${CYAN}itemsGet${OFF};Get catalogs items (AUTH)
  ${CYAN}itemsIssuesList${OFF};List item issues for a given processing result (AUTH)
  ${CYAN}productsByProductGroupFilterList${OFF};List filtered products (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[conversionEvents]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}eventsCreate${OFF};Send conversions (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[conversionTags]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}conversionTagsCreate${OFF};Create conversion tag (AUTH)
  ${CYAN}conversionTagsGet${OFF};Get conversion tag (AUTH)
  ${CYAN}conversionTagsList${OFF};Get conversion tags (AUTH)
  ${CYAN}ocpmEligibleConversionTagsGet${OFF};Get Ocpm eligible conversion tags (AUTH)
  ${CYAN}pageVisitConversionTagsGet${OFF};Get page visit conversion tags (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[customerLists]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}customerListsCreate${OFF};Create customer lists (AUTH)
  ${CYAN}customerListsGet${OFF};Get customer list (AUTH)
  ${CYAN}customerListsList${OFF};Get customer lists (AUTH)
  ${CYAN}customerListsUpdate${OFF};Update customer list (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[integrations]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}integrationsCommerceDel${OFF};Delete commerce integration (AUTH)
  ${CYAN}integrationsCommerceGet${OFF};Get commerce integration (AUTH)
  ${CYAN}integrationsCommercePatch${OFF};Update commerce integration (AUTH)
  ${CYAN}integrationsCommercePost${OFF};Create commerce integration (AUTH)
  ${CYAN}integrationsGetById${OFF};Get integration metadata (AUTH)
  ${CYAN}integrationsGetList${OFF};Get integration metadata list (AUTH)
  ${CYAN}integrationsLogsPost${OFF};Receives batched logs from integration applications. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[keywords]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}countryKeywordsMetricsGet${OFF};Get country's keyword metrics (AUTH)
  ${CYAN}keywordsCreate${OFF};Create keywords (AUTH)
  ${CYAN}keywordsGet${OFF};Get keywords (AUTH)
  ${CYAN}keywordsUpdate${OFF};Update keywords (AUTH)
  ${CYAN}trendingKeywordsList${OFF};List trending keywords (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[leadAds]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adAccountsSubscriptionsDelById${OFF};Delete lead ads subscription (AUTH)
  ${CYAN}adAccountsSubscriptionsGetById${OFF};Get lead ads subscription (AUTH)
  ${CYAN}adAccountsSubscriptionsGetList${OFF};Get lead ads subscriptions (AUTH)
  ${CYAN}adAccountsSubscriptionsPost${OFF};Create lead ads subscription (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[leadForms]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}leadFormGet${OFF};Get lead form by id (AUTH)
  ${CYAN}leadFormTestCreate${OFF};Create lead form test data (AUTH)
  ${CYAN}leadFormsList${OFF};Get lead forms (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[media]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}mediaCreate${OFF};Register media upload (AUTH)
  ${CYAN}mediaGet${OFF};Get media upload details (AUTH)
  ${CYAN}mediaList${OFF};List media uploads (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[oauth]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}oauthToken${OFF};Generate OAuth access token (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[orderLines]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}orderLinesGet${OFF};Get order line (AUTH)
  ${CYAN}orderLinesList${OFF};Get order lines (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[pins]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}pinsAnalytics${OFF};Get Pin analytics (AUTH)
  ${CYAN}pinsCreate${OFF};Create Pin (AUTH)
  ${CYAN}pinsDelete${OFF};Delete Pin (AUTH)
  ${CYAN}pinsGet${OFF};Get Pin (AUTH)
  ${CYAN}pinsList${OFF};List Pins (AUTH)
  ${CYAN}pinsSave${OFF};Save Pin (AUTH)
  ${CYAN}pinsUpdate${OFF};Update Pin (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[productGroupPromotions]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}productGroupPromotionsCreate${OFF};Create product group promotions (AUTH)
  ${CYAN}productGroupPromotionsGet${OFF};Get a product group promotion by id (AUTH)
  ${CYAN}productGroupPromotionsList${OFF};Get product group promotions (AUTH)
  ${CYAN}productGroupPromotionsUpdate${OFF};Update product group promotions (AUTH)
  ${CYAN}productGroupsAnalytics${OFF};Get product group analytics (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[productGroups]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adAccountsCatalogsProductGroupsList${OFF};Get catalog product groups (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[resources]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adAccountCountriesGet${OFF};Get ad accounts countries (AUTH)
  ${CYAN}deliveryMetricsGet${OFF};Get available metrics' definitions (AUTH)
  ${CYAN}interestTargetingOptionsGet${OFF};Get interest details (AUTH)
  ${CYAN}leadFormQuestionsGet${OFF};Get lead form questions (AUTH)
  ${CYAN}metricsReadyStateGet${OFF};Get metrics ready state (AUTH)
  ${CYAN}targetingOptionsGet${OFF};Get targeting options (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[search]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}searchPartnerPins${OFF};Search pins by a given search term (AUTH)
  ${CYAN}searchUserBoardsGet${OFF};Search user's boards (AUTH)
  ${CYAN}searchUserPinsList${OFF};Search user's Pins (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[terms]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}termsRelatedList${OFF};List related terms (AUTH)
  ${CYAN}termsSuggestedList${OFF};List suggested terms (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[termsOfService]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}termsOfServiceGet${OFF};Get terms of service (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[userAccount]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}boardsUserFollowsList${OFF};List following boards (AUTH)
  ${CYAN}followUserUpdate${OFF};Follow user (AUTH)
  ${CYAN}followersList${OFF};List followers (AUTH)
  ${CYAN}linkedBusinessAccountsGet${OFF};List linked businesses (AUTH)
  ${CYAN}unverifyWebsiteDelete${OFF};Unverify website (AUTH)
  ${CYAN}userAccountAnalytics${OFF};Get user account analytics (AUTH)
  ${CYAN}userAccountAnalyticsTopPins${OFF};Get user account top pins analytics (AUTH)
  ${CYAN}userAccountAnalyticsTopVideoPins${OFF};Get user account top video pins analytics (AUTH)
  ${CYAN}userAccountFollowedInterests${OFF};List following interests (AUTH)
  ${CYAN}userAccountGet${OFF};Get user account (AUTH)
  ${CYAN}userFollowingGet${OFF};List following (AUTH)
  ${CYAN}userWebsitesGet${OFF};Get user websites (AUTH)
  ${CYAN}verifyWebsiteUpdate${OFF};Verify website (AUTH)
  ${CYAN}websiteVerificationGet${OFF};Get user verification code for website claiming (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}Options${OFF}"
    echo -e "  -h,--help\\t\\t\\t\\tPrint this help"
    echo -e "  -V,--version\\t\\t\\t\\tPrint API version"
    echo -e "  --about\\t\\t\\t\\tPrint the information about service"
    echo -e "  --host ${CYAN}<url>${OFF}\\t\\t\\t\\tSpecify the host URL "
echo -e "              \\t\\t\\t\\t(e.g. 'https://api.pinterest.com')"

    echo -e "  --force\\t\\t\\t\\tForce command invocation in spite of missing"
    echo -e "         \\t\\t\\t\\trequired parameters or wrong content type"
    echo -e "  --dry-run\\t\\t\\t\\tPrint out the cURL command without"
    echo -e "           \\t\\t\\t\\texecuting it"
    echo -e "  -nc,--no-colors\\t\\t\\tEnforce print without colors, otherwise autodetected"
    echo -e "  -ac,--accept ${YELLOW}<mime-type>${OFF}\\t\\tSet the 'Accept' header in the request"
    echo -e "  -ct,--content-type ${YELLOW}<mime-type>${OFF}\\tSet the 'Content-type' header in "
    echo -e "                                \\tthe request"
    echo ""
}


##############################################################################
#
# Print REST service description
#
##############################################################################
print_about() {
    echo ""
    echo -e "${BOLD}${WHITE}Pinterest REST API command line client (API version 5.12.0)${OFF}"
    echo ""
    echo -e "License: MIT"
    echo -e "Contact: blah+oapicf@cliffano.com"
    echo ""
read -r -d '' appdescription <<EOF

Pinterest's REST API
EOF
echo "$appdescription" | paste -sd' ' | fold -sw 80
}


##############################################################################
#
# Print REST api version
#
##############################################################################
print_version() {
    echo ""
    echo -e "${BOLD}Pinterest REST API command line client (API version 5.12.0)${OFF}"
    echo ""
}

##############################################################################
#
# Print help for adAccountAnalytics operation
#
##############################################################################
print_adAccountAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountAnalytics - Get ad account analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountTargetingAnalyticsGet operation
#
##############################################################################
print_adAccountTargetingAnalyticsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountTargetingAnalyticsGet - Get targeting analytics for an ad account${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get targeting analytics for an ad account.
For the requested account and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}targeting_types${OFF} ${BLUE}[array[AdsAnalyticsTargetingType]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.${YELLOW} Specify as: targeting_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}attribution_types${OFF} ${BLUE}[ConversionReportAttributionType]${OFF} ${CYAN}(default: null)${OFF} - List of types of attribution for the conversion report${YELLOW} Specify as: attribution_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsCreate operation
#
##############################################################################
print_adAccountsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsCreate - Create ad account${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new ad account. Different ad accounts can support different currencies, payment methods, etc.
An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/>
You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/>
For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Ad account to create." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsGet operation
#
##############################################################################
print_adAccountsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsGet - Get ad account${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get an ad account" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsList operation
#
##############################################################################
print_adAccountsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsList - List ad accounts${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the ad_accounts that the \"operation user_account\" has access to.
- This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_shared_accounts${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: true)${OFF} - Include shared ad accounts${YELLOW} Specify as: include_shared_accounts=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for analyticsCreateMmmReport operation
#
##############################################################################
print_analyticsCreateMmmReport_help() {
    echo ""
    echo -e "${BOLD}${WHITE}analyticsCreateMmmReport - Create a request for a Marketing Mix Modeling (MMM) report${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download
the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads analytics mmm parameters${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for analyticsCreateReport operation
#
##############################################################################
print_analyticsCreateReport_help() {
    echo ""
    echo -e "${BOLD}${WHITE}analyticsCreateReport - Create async request for an account analytics report${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
- If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days.
- If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for analyticsCreateTemplateReport operation
#
##############################################################################
print_analyticsCreateTemplateReport_help() {
    echo ""
    echo -e "${BOLD}${WHITE}analyticsCreateTemplateReport - Create async request for an analytics report using a template${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the
template. It returns a token that you can use to download the report when it is ready." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}template_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a template. ${YELLOW}Specify as: template_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads analytics template parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for analyticsGetMmmReport operation
#
##############################################################################
print_analyticsGetMmmReport_help() {
    echo ""
    echo -e "${BOLD}${WHITE}analyticsGetMmmReport - Get advertiser Marketing Mix Modeling (MMM) report.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the
create mmm report endpoint." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Token returned from the post request creation call${YELLOW} Specify as: token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for analyticsGetReport operation
#
##############################################################################
print_analyticsGetReport_help() {
    echo ""
    echo -e "${BOLD}${WHITE}analyticsGetReport - Get the account analytics report created by the async call${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Token returned from the post request creation call${YELLOW} Specify as: token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for sandboxDelete operation
#
##############################################################################
print_sandboxDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}sandboxDelete - Delete ads data for ad account in API Sandbox${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete an ad account and all the ads data associated with that account. 
A string message is returned indicating the status of the delete operation.

Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). 
Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for templatesList operation
#
##############################################################################
print_templatesList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}templatesList - List templates${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Gets all Templates associated with an ad account ID." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account template parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsAnalytics operation
#
##############################################################################
print_adGroupsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsAnalytics - Get ad group analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Ad group Ids to use to filter the results.${YELLOW} Specify as: ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account group analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsAudienceSizing operation
#
##############################################################################
print_adGroupsAudienceSizing_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsAudienceSizing - Get audience sizing${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get potential audience size for an ad group with given targeting criteria. 
Potential audience size estimates the number of people you may be able to reach per month with your campaign. 
It is based on historical advertising data and the targeting criteria you select.
It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad group audience sizing parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;No access to requested audience list or product group.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsBidFloorGet operation
#
##############################################################################
print_adGroupsBidFloorGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsBidFloorGet - Get bid floors${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>
<p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
</ul>
For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Parameters to get bid_floor info" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsCreate operation
#
##############################################################################
print_adGroupsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsCreate - Create ad groups${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p>
<strong>Note:</strong>
- 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>
<p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
</ul>
- Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
- Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - List of ad groups to create, size limit [1, 30]." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsGet operation
#
##############################################################################
print_adGroupsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsGet - Get ad group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
contain additional information from the Ad Review process.
For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\"
target=\"_blank\">Pinterest advertising standards</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad group. ${YELLOW}Specify as: ad_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsList operation
#
##############################################################################
print_adGroupsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsList - List ad groups${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/>
<strong>Note:</strong><p/>
Provide only campaign_id or ad_group_id. Do not provide both." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Ad group Ids to use to filter the results.${YELLOW} Specify as: ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}entity_statuses${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: [&quot;ACTIVE&quot;,&quot;PAUSED&quot;])${OFF} - Entity status${YELLOW} Specify as: entity_statuses=value1 entity_statuses=value2 entity_statuses=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}translate_interests_to_names${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Return interests as text names (if value is true) rather than topic IDs.${YELLOW} Specify as: translate_interests_to_names=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account group parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsTargetingAnalyticsGet operation
#
##############################################################################
print_adGroupsTargetingAnalyticsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsTargetingAnalyticsGet - Get targeting analytics for ad groups${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get targeting analytics for one or more ad groups.
For the requested ad group(s) and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Ad group Ids to use to filter the results.${YELLOW} Specify as: ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}targeting_types${OFF} ${BLUE}[array[AdsAnalyticsTargetingType]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.${YELLOW} Specify as: targeting_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}attribution_types${OFF} ${BLUE}[ConversionReportAttributionType]${OFF} ${CYAN}(default: null)${OFF} - List of types of attribution for the conversion report${YELLOW} Specify as: attribution_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adGroupsUpdate operation
#
##############################################################################
print_adGroupsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsUpdate - Update ad groups${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update multiple existing ad groups." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - List of ad groups to update, size limit [1, 30]." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adPreviewsCreate operation
#
##############################################################################
print_adPreviewsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adPreviewsCreate - Create ad preview with pin or image${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/>
If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/>
You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Create ad preview with pin or image." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful ad preview creation.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid Pin parameters response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adTargetingAnalyticsGet operation
#
##############################################################################
print_adTargetingAnalyticsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adTargetingAnalyticsGet - Get targeting analytics for ads${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get targeting analytics for one or more ads. For the requested ad(s) and metrics,
the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type
(e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Ad Ids to use to filter the results.${YELLOW} Specify as: ad_ids=value1 ad_ids=value2 ad_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}targeting_types${OFF} ${BLUE}[array[AdsAnalyticsTargetingType]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.${YELLOW} Specify as: targeting_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}attribution_types${OFF} ${BLUE}[ConversionReportAttributionType]${OFF} ${CYAN}(default: null)${OFF} - List of types of attribution for the conversion report${YELLOW} Specify as: attribution_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adsAnalytics operation
#
##############################################################################
print_adsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsAnalytics - Get ad analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Ad Ids to use to filter the results.${YELLOW} Specify as: ad_ids=value1 ad_ids=value2 ad_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adsCreate operation
#
##############################################################################
print_adsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsCreate - Create ads${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - List of ads to create, size limit [1, 30]." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adsGet operation
#
##############################################################################
print_adsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsGet - Get ad${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
contain additional information from the Ad Review process.
For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\"
target=\"_blank\">Pinterest advertising standards</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad. ${YELLOW}Specify as: ad_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adsList operation
#
##############################################################################
print_adsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsList - List ads${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List ads that meet the filters provided:
  - Listed campaign ids or ad group ids or ad ids
  - Listed entity statuses <p/>
If no filter is provided, all ads in the ad account are returned. <p/>
<strong>Note:</strong><p/>
Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/>
Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information.
For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Ad group Ids to use to filter the results.${YELLOW} Specify as: ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Ad Ids to use to filter the results.${YELLOW} Specify as: ad_ids=value1 ad_ids=value2 ad_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}entity_statuses${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: [&quot;ACTIVE&quot;,&quot;PAUSED&quot;])${OFF} - Entity status${YELLOW} Specify as: entity_statuses=value1 entity_statuses=value2 entity_statuses=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adsUpdate operation
#
##############################################################################
print_adsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsUpdate - Update ads${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update multiple existing ads" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - List of ads to update, size limit [1, 30]" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for audienceInsightsGet operation
#
##############################################################################
print_audienceInsightsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}audienceInsightsGet - Get audience insights${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the
ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's
total audience.<p/>
<a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}audience_insight_type${OFF} ${BLUE}[AudienceInsightType]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Type of audience insights.${YELLOW} Specify as: audience_insight_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for audienceInsightsScopeAndTypeGet operation
#
##############################################################################
print_audienceInsightsScopeAndTypeGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}audienceInsightsScopeAndTypeGet - Get audience insights scope and type${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for audiencesCreate operation
#
##############################################################################
print_audiencesCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}audiencesCreate - Create audience${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with
the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude
specific audience_ids when you create an ad group. <p/>
For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - List of ads to create, size limit [1, 30]" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for audiencesCreateCustom operation
#
##############################################################################
print_audiencesCreateCustom_help() {
    echo ""
    echo -e "${BOLD}${WHITE}audiencesCreateCustom - Create custom audience${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a custom audience and find the audiences you want your ads to reach." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Custom audience to create." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for audiencesGet operation
#
##############################################################################
print_audiencesGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}audiencesGet - Get audience${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a specific audience given the audience ID." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}audience_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an audience ${YELLOW}Specify as: audience_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Audience not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for audiencesList operation
#
##############################################################################
print_audiencesList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}audiencesList - List audiences${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get list of audiences for the ad account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID.
For received audiences, it is sorted by sharing event time.
Note that higher-value IDs are associated with more-recently added items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ownership_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: OWNED)${OFF} - <strong>This feature is currently in beta and not available to all apps.</strong>
Filter audiences by ownership type.${YELLOW} Specify as: ownership_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account audience parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for audiencesUpdate operation
#
##############################################################################
print_audiencesUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}audiencesUpdate - Update audience${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update (edit or remove) an existing targeting audience." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}audience_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an audience ${YELLOW}Specify as: audience_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF}${OFF} - The audience to be updated." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adsCreditRedeem operation
#
##############################################################################
print_adsCreditRedeem_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsCreditRedeem - Redeem ad credits${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Redeem ads credit on behalf of the ad account id and apply it towards billing.

<strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Redeem ad credits request." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successfully redeemed ad credits.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error thrown when unable to redeem offer code.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adsCreditsDiscountsGet operation
#
##############################################################################
print_adsCreditsDiscountsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsCreditsDiscountsGet - Get ads credit discounts${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns the list of discounts applied to the account.

<strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for billingProfilesGet operation
#
##############################################################################
print_billingProfilesGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}billingProfilesGet - Get billing profiles${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get billing profiles in the advertiser account.

<strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}is_active${OFF} ${BLUE}[boolean]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Return active billing profiles, if false return all billing profiles.${YELLOW} Specify as: is_active=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for ssioAccountsGet operation
#
##############################################################################
print_ssioAccountsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}ssioAccountsGet - Get Salesforce account details including bill-to information.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request parameter.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for ssioInsertionOrderCreate operation
#
##############################################################################
print_ssioInsertionOrderCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}ssioInsertionOrderCreate - Create insertion order through SSIO.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create insertion order through SSIO for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Order line to create." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for ssioInsertionOrderEdit operation
#
##############################################################################
print_ssioInsertionOrderEdit_help() {
    echo ""
    echo -e "${BOLD}${WHITE}ssioInsertionOrderEdit - Edit insertion order through SSIO.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Edit insertion order through SSIO for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Order line to create." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for ssioInsertionOrdersStatusGetByAdAccount operation
#
##############################################################################
print_ssioInsertionOrdersStatusGetByAdAccount_help() {
    echo ""
    echo -e "${BOLD}${WHITE}ssioInsertionOrdersStatusGetByAdAccount - Get insertion order status by ad account id.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get insertion order status for account id <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request parameter.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for ssioInsertionOrdersStatusGetByPinOrderId operation
#
##############################################################################
print_ssioInsertionOrdersStatusGetByPinOrderId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}ssioInsertionOrdersStatusGetByPinOrderId - Get insertion order status by pin order id.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get insertion order status for pin order id <code>pin_order_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_order_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The pin order id associated with the ssio insertion order ${YELLOW}Specify as: pin_order_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request parameter.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for ssioOrderLinesGetByAdAccount operation
#
##############################################################################
print_ssioOrderLinesGetByAdAccount_help() {
    echo ""
    echo -e "${BOLD}${WHITE}ssioOrderLinesGetByAdAccount - Get Salesforce order lines by ad account id.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get Salesforce order lines for account id <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_order_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The pin order id associated with the ssio insertino order${YELLOW} Specify as: pin_order_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request parameter.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardSectionsCreate operation
#
##############################################################################
print_boardSectionsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardSectionsCreate - Create board section${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Create a board section." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid board section parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to create board sections.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Could not get exclusive access to the board to create a new section.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=500
    echo -e "${result_color_table[${code:0:1}]}  500;Could not create a new board section.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardSectionsDelete operation
#
##############################################################################
print_boardSectionsDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardSectionsDelete - Delete board section${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}section_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board section. ${YELLOW}Specify as: section_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Board section deleted successfully${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to delete board section.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Board section not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Board section conflict.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardSectionsList operation
#
##############################################################################
print_boardSectionsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardSectionsList - List board sections${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardSectionsListPins operation
#
##############################################################################
print_boardSectionsListPins_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardSectionsListPins - List Pins on board section${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}section_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board section. ${YELLOW}Specify as: section_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access Pins on board section.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Board or section not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Board section conflict.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardSectionsUpdate operation
#
##############################################################################
print_boardSectionsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardSectionsUpdate - Update board section${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}section_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board section. ${YELLOW}Specify as: section_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Update a board section." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid board section parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to update board section.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Board section conflict.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardsCreate operation
#
##############################################################################
print_boardsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardsCreate - Create board${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a board owned by the \"operation user_account\".
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Create a board using a single board json object." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;The board name is invalid or duplicated.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardsDelete operation
#
##############################################################################
print_boardsDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardsDelete - Delete board${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a board owned by the \"operation user_account\".
- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Board deleted successfully${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to delete the board.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Board not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Could not get exclusive access to delete the board.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=429
    echo -e "${result_color_table[${code:0:1}]}  429;This request exceeded a rate limit. This can happen if the client exceeds one
of the published rate limits or if multiple write operations are applied to
an object within a short time window.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardsGet operation
#
##############################################################################
print_boardsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardsGet - Get board${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a board owned by the operation user_account - or a group board that has been shared with this account.
- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Board not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardsList operation
#
##############################################################################
print_boardsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardsList - List boards${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return.
- If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}privacy${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Privacy setting for a board.${YELLOW} Specify as: privacy=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardsListPins operation
#
##############################################################################
print_boardsListPins_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardsListPins - List Pins on board${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}creative_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.${YELLOW} Specify as: creative_types=value1 creative_types=value2 creative_types=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_metrics${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.${YELLOW} Specify as: pin_metrics=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Board not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardsUpdate operation
#
##############################################################################
print_boardsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardsUpdate - Update board${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a board owned by the \"operating user_account\".
- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Update a board." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid board parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to update the board.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=429
    echo -e "${result_color_table[${code:0:1}]}  429;This request exceeded a rate limit. This can happen if the client exceeds one
of the published rate limits or if multiple write operations are applied to
an object within a short time window.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for bulkDownloadCreate operation
#
##############################################################################
print_bulkDownloadCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}bulkDownloadCreate - Get advertiser entities in bulk${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads,
and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused,
only active entities will return data." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Parameters to get ad entities in bulk" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for bulkRequestGet operation
#
##############################################################################
print_bulkRequestGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}bulkRequestGet - Download advertiser entities in bulk${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the
new or updated entity data (campaigns, ad groups, product groups, ads, or keywords)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bulk_request_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a bulk upsert request. ${YELLOW}Specify as: bulk_request_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_details${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - if set to True then attach the errors/details to all the requests${YELLOW} Specify as: include_details=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for bulkUpsertCreate operation
#
##############################################################################
print_bulkUpsertCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}bulkUpsertCreate - Create/update ad entities in bulk${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords.
Note that this request will be processed asynchronously; the response will include a <code>request_id</code>
that can be used to obtain the status of the request." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Parameters to get create/update ad entities in bulk" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for campaignTargetingAnalyticsGet operation
#
##############################################################################
print_campaignTargetingAnalyticsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}campaignTargetingAnalyticsGet - Get targeting analytics for campaigns${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get targeting analytics for one or more campaigns.
For the requested account and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}targeting_types${OFF} ${BLUE}[array[AdsAnalyticsTargetingType]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.${YELLOW} Specify as: targeting_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}attribution_types${OFF} ${BLUE}[ConversionReportAttributionType]${OFF} ${CYAN}(default: null)${OFF} - List of types of attribution for the conversion report${YELLOW} Specify as: attribution_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for campaignsAnalytics operation
#
##############################################################################
print_campaignsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}campaignsAnalytics - Get campaign analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account campaign analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for campaignsCreate operation
#
##############################################################################
print_campaignsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}campaignsCreate - Create campaigns${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.
For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/>
<strong>Note:</strong>
- The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>
<p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
</ul>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Array of campaigns." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for campaignsGet operation
#
##############################################################################
print_campaignsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}campaignsGet - Get campaign${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a specific campaign given the campaign ID." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Campaign ID, must be associated with the ad account ID provided in the path. ${YELLOW}Specify as: campaign_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for campaignsList operation
#
##############################################################################
print_campaignsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}campaignsList - List campaigns${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}entity_statuses${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: [&quot;ACTIVE&quot;,&quot;PAUSED&quot;])${OFF} - Entity status${YELLOW} Specify as: entity_statuses=value1 entity_statuses=value2 entity_statuses=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account campaign parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for campaignsUpdate operation
#
##############################################################################
print_campaignsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}campaignsUpdate - Update campaigns${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update multiple ad campaigns based on campaign_ids. <p/>
<strong>Note:</strong><p/>
- <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>
<p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
</ul>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Array of campaigns." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsList operation
#
##############################################################################
print_catalogsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsList - List catalogs${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsProductGroupPinsList operation
#
##############################################################################
print_catalogsProductGroupPinsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupPinsList - List products for a Product Group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}product_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group ${YELLOW}Specify as: product_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Catalogs product group not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsProductGroupsCreate operation
#
##############################################################################
print_catalogsProductGroupsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupsCreate - Create product group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create product group to use in Catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Request object used to created a catalogs product group." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid body.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for catalog product group mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't create this catalogs product group with this value.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsProductGroupsDelete operation
#
##############################################################################
print_catalogsProductGroupsDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupsDelete - Delete product group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a product group owned by the \"operation user_account\" from being in use in Catalogs.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}product_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group ${YELLOW}Specify as: product_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Catalogs Product Group deleted successfully.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid catalogs product group id parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for catalog product group mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Catalogs product group not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't delete this catalogs product group.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsProductGroupsGet operation
#
##############################################################################
print_catalogsProductGroupsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupsGet - Get product group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}product_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group ${YELLOW}Specify as: product_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid catalogs product group id parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for catalog product group mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Catalogs product group not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't get a catalogs product group without an existing catalog.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsProductGroupsList operation
#
##############################################################################
print_catalogsProductGroupsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupsList - List product groups${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Filter entities for a given feed_id. If not given, all feeds are considered.${YELLOW} Specify as: feed_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}catalog_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Filter entities for a given catalog_id. If not given, all catalogs are considered.${YELLOW} Specify as: catalog_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid feed parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for catalog product group mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Data feed not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't create this catalogs product group with this value.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsProductGroupsProductCountsGet operation
#
##############################################################################
print_catalogsProductGroupsProductCountsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupsProductCountsGet - Get product counts for a Product Group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}product_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group ${YELLOW}Specify as: product_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Product Group Not Found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Can't access this feature without an existing catalog.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for catalogsProductGroupsUpdate operation
#
##############################################################################
print_catalogsProductGroupsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupsUpdate - Update product group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update product group owned by the \"operation user_account\" to use in Catalogs.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}product_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group ${YELLOW}Specify as: product_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Request object used to Update a catalogs product group." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for catalog product group mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Catalogs product group not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't update this catalogs product group to this value.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for feedProcessingResultsList operation
#
##############################################################################
print_feedProcessingResultsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}feedProcessingResultsList - List processing results for a given feed${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Feed not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for feedsCreate operation
#
##############################################################################
print_feedsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}feedsCreate - Create feed${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Please, be aware that \"default_country\"
and \"default_locale\" are not required in the spec for forward compatibility
but for now the API will not accept requests without those fields.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Request object used to created a feed." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid feed parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Business account required.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;User website required.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=422
    echo -e "${result_color_table[${code:0:1}]}  422;Unique feed name is required.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=501
    echo -e "${result_color_table[${code:0:1}]}  501;Not implemented (absent \"default_country\" or \"default_locale\").${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for feedsDelete operation
#
##############################################################################
print_feedsDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}feedsDelete - Delete feed${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a feed owned by the \"operating user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Feed deleted successfully.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid feed parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for feed mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Data feed not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't delete a feed with active promotions.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for feedsGet operation
#
##############################################################################
print_feedsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}feedsGet - Get feed${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a single feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid feed parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Data feed not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for feedsList operation
#
##############################################################################
print_feedsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}feedsList - List feeds${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch feeds owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}catalog_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Filter entities for a given catalog_id. If not given, all catalogs are considered.${YELLOW} Specify as: catalog_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for feedsUpdate operation
#
##############################################################################
print_feedsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}feedsUpdate - Update feed${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Request object used to update a feed." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid feed parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for feed mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Data feed not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemsBatchGet operation
#
##############################################################################
print_itemsBatchGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemsBatchGet - Get catalogs item batch status${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}batch_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Id of a catalogs items batch to fetch ${YELLOW}Specify as: batch_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Response containing the requested catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Not authenticated to access catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Catalogs items batch not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=405
    echo -e "${result_color_table[${code:0:1}]}  405;Method Not Allowed.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemsBatchPost operation
#
##############################################################################
print_itemsBatchPost_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemsBatchPost - Operate on item batch${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Request object used to create catalogs items in a batch" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Response containing the requested catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Not authenticated to post catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to post catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemsGet operation
#
##############################################################################
print_itemsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemsGet - Get catalogs items${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}country${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Country for the Catalogs Items${YELLOW} Specify as: country=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}language${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Language for the Catalogs Items${YELLOW} Specify as: language=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}item_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - This parameter is deprecated. Use filters instead.${YELLOW} Specify as: item_ids=value1 item_ids=value2 item_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filters${OFF} ${BLUE}[CatalogsItemsFilters]${OFF} ${CYAN}(default: null)${OFF} - Identifies items to be retrieved. This is a required parameter.${YELLOW} Specify as: filters=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Response containing the requested catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid request parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Not authorized to access catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemsIssuesList operation
#
##############################################################################
print_itemsIssuesList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemsIssuesList - List item issues for a given processing result${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}processing_result_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). ${YELLOW}Specify as: processing_result_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}item_numbers${OFF} ${BLUE}[array[integer]]${OFF} ${CYAN}(default: null)${OFF} - Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.${YELLOW} Specify as: item_numbers=value1 item_numbers=value2 item_numbers=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}item_validation_issue${OFF} ${BLUE}[CatalogsItemValidationIssue]${OFF} ${CYAN}(default: null)${OFF} - Filter item validation issues that have a given type of item validation issue.${YELLOW} Specify as: item_validation_issue=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Processing Result not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=501
    echo -e "${result_color_table[${code:0:1}]}  501;Not implemented.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for productsByProductGroupFilterList operation
#
##############################################################################
print_productsByProductGroupFilterList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}productsByProductGroupFilterList - List filtered products${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request.
- This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/shopping/catalog/'>Learn more</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Object holding a group of filters for a catalog product group" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't get products.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for eventsCreate operation
#
##############################################################################
print_eventsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}eventsCreate - Send conversions${OFF}${BLUE}(AUTH - OAuth2)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object.
- This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details.
- The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.)
- This endpoint has a rate limit of 5,000 calls per minute per ad account.
- If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}test${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly.
Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.${YELLOW} Specify as: test=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Conversion events." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;The request was invalid.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Not authorized to send conversion events${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=422
    echo -e "${result_color_table[${code:0:1}]}  422;Not all events were successfully processed.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=429
    echo -e "${result_color_table[${code:0:1}]}  429;This request exceeded a rate limit. This can happen if the client exceeds one
of the published rate limits within a short time window.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=503
    echo -e "${result_color_table[${code:0:1}]}  503;The endpoint has been ramped down and is currently not accepting any traffic.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected errors${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for conversionTagsCreate operation
#
##############################################################################
print_conversionTagsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}conversionTagsCreate - Create conversion tag${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/>
The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/>
For more information, see:<p/>
<a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/>
<a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/>
<a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Conversion Tag to create" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for conversionTagsGet operation
#
##############################################################################
print_conversionTagsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}conversionTagsGet - Get conversion tag${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get information about an existing conversion tag." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_tag_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Id of the conversion tag. ${YELLOW}Specify as: conversion_tag_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for conversionTagsList operation
#
##############################################################################
print_conversionTagsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}conversionTagsList - Get conversion tags${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List conversion tags associated with an ad account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filter_deleted${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Filter out deleted tags.${YELLOW} Specify as: filter_deleted=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for ocpmEligibleConversionTagsGet operation
#
##############################################################################
print_ocpmEligibleConversionTagsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}ocpmEligibleConversionTagsGet - Get Ocpm eligible conversion tags${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get Ocpm eligible conversion tag events for an ad account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected errors${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pageVisitConversionTagsGet operation
#
##############################################################################
print_pageVisitConversionTagsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pageVisitConversionTagsGet - Get page visit conversion tags${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all page visit conversion tag events for an ad account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for customerListsCreate operation
#
##############################################################################
print_customerListsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}customerListsCreate - Create customer lists${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p>
<p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>
or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/>
<p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p>
<p>When you create a customer list, the system scans the list for existing Pinterest accounts;
the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process
is complete. The filtered list – containing only the Pinterest accounts that were included in your starting
list – is what will be used to create the audience.</p>
<p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type)
using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Parameters to get Customer lists info" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for customerListsGet operation
#
##############################################################################
print_customerListsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}customerListsGet - Get customer list${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Gets a specific customer list given the customer list ID." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}customer_list_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a customer list ${YELLOW}Specify as: customer_list_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for customerListsList operation
#
##############################################################################
print_customerListsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}customerListsList - Get customer lists${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Get a set of customer lists including id and name based on the filters provided.</p>
<p>(Customer lists are a type of audience.) For more information, see
<a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>
 or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a>
section of the ads management guide.</p>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for customerListsUpdate operation
#
##############################################################################
print_customerListsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}customerListsUpdate - Update customer list${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p>
<p>When you add records to an existing customer list, the system scans the additions for existing Pinterest
accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records
to add will be deleted when the matching process is complete.</p>
<p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>
or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a>
section of the ads management guide.</p>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}customer_list_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a customer list ${YELLOW}Specify as: customer_list_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for integrationsCommerceDel operation
#
##############################################################################
print_integrationsCommerceDel_help() {
    echo ""
    echo -e "${BOLD}${WHITE}integrationsCommerceDel - Delete commerce integration${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete commerce integration metadata for the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}external_business_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - External business ID for the integration. ${YELLOW}Specify as: external_business_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Commerce Integration deleted successfully${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for integrationsCommerceGet operation
#
##############################################################################
print_integrationsCommerceGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}integrationsCommerceGet - Get commerce integration${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get commerce integration metadata associated with the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}external_business_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - External business ID for the integration. ${YELLOW}Specify as: external_business_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Integration not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Can't access this integration metadata.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for integrationsCommercePatch operation
#
##############################################################################
print_integrationsCommercePatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}integrationsCommercePatch - Update commerce integration${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update commerce integration metadata for the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}external_business_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - External business ID for the integration. ${YELLOW}Specify as: external_business_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF}${OFF} - Parameters to get create/update the Integration Metadata" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Integration not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Can't access this integration metadata.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for integrationsCommercePost operation
#
##############################################################################
print_integrationsCommercePost_help() {
    echo ""
    echo -e "${BOLD}${WHITE}integrationsCommercePost - Create commerce integration${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF}${OFF} - Parameters to get create/update the Integration Metadata" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Integration not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Can't access this integration metadata.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for integrationsGetById operation
#
##############################################################################
print_integrationsGetById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}integrationsGetById - Get integration metadata${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get integration metadata by ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Integration ID. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Integration not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for integrationsGetList operation
#
##############################################################################
print_integrationsGetList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}integrationsGetList - Get integration metadata list${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get integration metadata list.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for integrationsLogsPost operation
#
##############################################################################
print_integrationsLogsPost_help() {
    echo ""
    echo -e "${BOLD}${WHITE}integrationsLogsPost - Receives batched logs from integration applications.${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint receives batched logs from integration applications on partner platforms.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Ingest log information from external integration application." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for countryKeywordsMetricsGet operation
#
##############################################################################
print_countryKeywordsMetricsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}countryKeywordsMetricsGet - Get country's keyword metrics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "See keyword metrics for a specified country, aggregated across all of Pinterest.
(Definitions are available from the \"Get delivery metrics definitions\"
<a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}country_code${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Two letter country code (ISO 3166-1 alpha-2)${YELLOW} Specify as: country_code=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}keywords${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Comma-separated keywords${YELLOW} Specify as: keywords="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for keywordsCreate operation
#
##############################################################################
print_keywordsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}keywordsCreate - Create keywords${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p>
<p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p>
<p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
<p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for keywordsGet operation
#
##############################################################################
print_keywordsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}keywordsGet - Get keywords${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p>
<p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p>
<p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p>
<p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Campaign Id to use to filter the results.${YELLOW} Specify as: campaign_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Ad group Id.${YELLOW} Specify as: ad_group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}match_types${OFF} ${BLUE}[array[MatchType]]${OFF} ${CYAN}(default: null)${OFF} - Keyword <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type</a>${YELLOW} Specify as: match_types=value1 match_types=value2 match_types=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for keywordsUpdate operation
#
##############################################################################
print_keywordsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}keywordsUpdate - Update keywords${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for trendingKeywordsList operation
#
##############################################################################
print_trendingKeywordsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}trendingKeywordsList - List trending keywords${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Get the top trending search keywords among the Pinterest user audience.</p>
<p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p>
<p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p>
<p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}region${OFF} ${BLUE}[TrendsSupportedRegion]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The geographic region of interest. Only top trends within the specified region will be returned.<br />
The 'region' parameter is formatted as ISO 3166-2 country codes delimited by '+', corresponding to the following geographic areas:
- 'US' - United States
- 'CA' - Canada
- 'DE' - Germany
- 'FR' - France
- 'ES' - Spain
- 'IT' - Italy
- 'DE+AT+CH' - Germanic countries
- 'GB+IE' - Great Britain & Ireland
- 'IT+ES+PT+GR+MT' - Southern Europe
- 'PL+RO+HU+SK+CZ' - Eastern Europe
- 'SE+DK+FI+NO' - Nordic countries
- 'NL+BE+LU' - Benelux
- 'AR' - Argentina
- 'BR' - Brazil
- 'CO' - Colombia
- 'MX' - Mexico
- 'MX+AR+CO+CL' - Hispanic LatAm
- 'AU+NZ' - Australasia ${YELLOW}Specify as: region=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}trend_type${OFF} ${BLUE}[TrendType]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The methodology used to rank how trendy a keyword is.
- 'growing' trends have high upward growth in search volume over the last quarter
- 'monthly' trends have high search volume in the last month
- 'yearly' trends have high search volume in the last year
- 'seasonal' trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) ${YELLOW}Specify as: trend_type=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}interests${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - If set, filters the results to trends associated with the specified interests.<br />
If unset, trends for all interests will be returned.<br />
The list of supported interests is:
- 'animals' - Animals
- 'architecture' - Architecture
- 'art' - Art
- 'beauty' - Beauty
- 'childrens_fashion' - Children's Fashion
- 'design' - Design
- 'diy_and_crafts' - DIY & Crafts
- 'education' - Education
- 'electronics' - Electronics
- 'entertainment' - Entertainment
- 'event_planning' - Event Planning
- 'finance' - Finance
- 'food_and_drinks' - Food & Drink
- 'gardening' - Gardening
- 'health' - Health
- 'home_decor' - Home Decor
- 'mens_fashion' - Men's Fashion
- 'parenting' - Parenting
- 'quotes' - Quotes
- 'sport' - Sports
- 'travel' - Travel
- 'vehicles' - Vehicles
- 'wedding' - Wedding
- 'womens_fashion' - Women's Fashion${YELLOW} Specify as: interests=value1 interests=value2 interests=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}genders${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - If set, filters the results to trends among users who identify with the specified gender(s).<br />
If unset, trends among all genders will be returned.<br />
The 'unknown' group includes users with unspecified or customized gender profile settings.${YELLOW} Specify as: genders=value1 genders=value2 genders=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ages${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - If set, filters the results to trends among users in the specified age range(s).<br />
If unset, trends among all age groups will be returned.${YELLOW} Specify as: ages=value1 ages=value2 ages=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}normalize_against_group${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Governs how the resulting time series data will be normalized to a [0-100] scale.<br />
By default ('false'), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br />
If set to 'true', the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.${YELLOW} Specify as: normalize_against_group=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 50)${OFF} - The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a 'limit' of 50 will return the top 50 trends.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid trending keywords request parameters${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsSubscriptionsDelById operation
#
##############################################################################
print_adAccountsSubscriptionsDelById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsSubscriptionsDelById - Delete lead ads subscription${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete an existing lead ads webhook subscription by ID.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}subscription_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a subscription. ${YELLOW}Specify as: subscription_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Subscription deleted successfully${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid input parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;You are not authorized to delete this subscription.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Subscription not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsSubscriptionsGetById operation
#
##############################################################################
print_adAccountsSubscriptionsGetById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsSubscriptionsGetById - Get lead ads subscription${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a specific lead ads subscription record.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}subscription_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a subscription. ${YELLOW}Specify as: subscription_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid input parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Can't access this subscription.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Subscription not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsSubscriptionsGetList operation
#
##############################################################################
print_adAccountsSubscriptionsGetList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsSubscriptionsGetList - Get lead ads subscriptions${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the advertiser's list of lead ads subscriptions.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Can't access this subscription.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsSubscriptionsPost operation
#
##############################################################################
print_adAccountsSubscriptionsPost_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsSubscriptionsPost - Create lead ads subscription${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a lead ads webhook subscription.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.
- Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Subscription to create." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid input parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Can't access this subscription.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for leadFormGet operation
#
##############################################################################
print_leadFormGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}leadFormGet - Get lead form by id${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Gets a lead form given it's ID. It must also be associated with the provided ad account ID.
Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}lead_form_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a lead form. ${YELLOW}Specify as: lead_form_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account lead forms parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;The lead form ID for the given ad account ID does not exist.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for leadFormTestCreate operation
#
##############################################################################
print_leadFormTestCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}leadFormTestCreate - Create lead form test data${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create lead form test data based on the list of answers provided as part of the body.
- List of answers should follow the questions creation order.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}lead_form_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a lead form. ${YELLOW}Specify as: lead_form_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Subscription to create." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Lead not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for leadFormsList operation
#
##############################################################################
print_leadFormsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}leadFormsList - Get lead forms${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Gets all Lead Forms associated with an ad account ID.
Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account lead forms parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for mediaCreate operation
#
##############################################################################
print_mediaCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}mediaCreate - Register media upload${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Register your intent to upload media

The response includes all of the information needed to upload the media
to Pinterest.

To upload the media, make an HTTP POST request (using <tt>curl</tt>, for
example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header
value. Send the media file's contents as the request's <tt>file</tt>
parameter and also include all of the parameters from
<tt>upload_parameters</tt>.

<strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Create a media upload request" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for mediaGet operation
#
##############################################################################
print_mediaGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}mediaGet - Get media upload details${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get details for a registered media upload, including its current status.

<strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}media_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Media identifier ${YELLOW}Specify as: media_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Media upload not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for mediaList operation
#
##############################################################################
print_mediaList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}mediaList - List media uploads${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List media uploads filtered by given parameters.

<strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for oauthToken operation
#
##############################################################################
print_oauthToken_help() {
    echo ""
    echo -e "${BOLD}${WHITE}oauthToken - Generate OAuth access token${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Generate an OAuth access token by using an authorization code or a refresh token.

IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).

See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.

<strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for orderLinesGet operation
#
##############################################################################
print_orderLinesGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}orderLinesGet - Get order line${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a specific existing order line associated with an ad account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order_line_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an order line. ${YELLOW}Specify as: order_line_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for orderLinesList operation
#
##############################################################################
print_orderLinesList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}orderLinesList - Get order lines${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List existing order lines associated with an ad account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pinsAnalytics operation
#
##############################################################################
print_pinsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pinsAnalytics - Get Pin analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:

- For Pins on public or protected boards: Admin, Analyst.
- For Pins on secret boards: Admin.

If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pin_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a Pin. ${YELLOW}Specify as: pin_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}metric_types${OFF} ${BLUE}[array[PinsAnalyticsMetricTypesParameterInner]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Pin metric types to get data for, default is all.${YELLOW} Specify as: metric_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}app_types${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Apps or devices to get data for, default is all.${YELLOW} Specify as: app_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}split_field${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: NO_SPLIT)${OFF} - How to split the data into groups. Not including this param means data won't be split.${YELLOW} Specify as: split_field=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid pins analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access board or Pin.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pin not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pinsCreate operation
#
##############################################################################
print_pinsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pinsCreate - Create Pin${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a Pin on a board or board section owned by the \"operation user_account\".

Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).

- This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.

<strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Create a new Pin." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;Successful pin creation.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid Pin parameters response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;The Pin's image is too small, too large or is broken${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Board or section not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=429
    echo -e "${result_color_table[${code:0:1}]}  429;This request exceeded a rate limit. This can happen if the client exceeds one
of the published rate limits or if multiple write operations are applied to
an object within a short time window.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pinsDelete operation
#
##############################################################################
print_pinsDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pinsDelete - Delete Pin${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:

- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
- For Pins on secret boards: Owner, Admin." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pin_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a Pin. ${YELLOW}Specify as: pin_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Successfully deleted Pin${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access board or Pin.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pin not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pinsGet operation
#
##############################################################################
print_pinsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pinsGet - Get Pin${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:

- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
- For Pins on secret boards: Owner, Admin." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pin_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a Pin. ${YELLOW}Specify as: pin_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_metrics${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.${YELLOW} Specify as: pin_metrics=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access board or Pin.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pin not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pinsList operation
#
##############################################################################
print_pinsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pinsList - List Pins${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the Pins owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.
- All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_filter${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Pin filter.${YELLOW} Specify as: pin_filter=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_protected_pins${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Specify if return pins from protected boards${YELLOW} Specify as: include_protected_pins=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The type of pins to return, currently only enabled for private pins${YELLOW} Specify as: pin_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}creative_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.${YELLOW} Specify as: creative_types=value1 creative_types=value2 creative_types=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_metrics${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.${YELLOW} Specify as: pin_metrics=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid pin filter value${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pinsSave operation
#
##############################################################################
print_pinsSave_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pinsSave - Save Pin${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Save a Pin on a board or board section owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.
Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:

- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
- For Pins on secret boards: Owner, Admin.

- Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc.
- Any public Pin can be saved given a pin ID." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pin_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a Pin. ${YELLOW}Specify as: pin_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Request object used to save an existing pin" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;Successfully saved pin.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access Board or Pin.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Board or Pin not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pinsUpdate operation
#
##############################################################################
print_pinsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pinsUpdate - Update Pin${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a pin owned by the \"operating user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:

- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
- For Pins on secret boards: Owner, Admin.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pin_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a Pin. ${YELLOW}Specify as: pin_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to update Pin.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pin not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=429
    echo -e "${result_color_table[${code:0:1}]}  429;This request exceeded a rate limit. This can happen if the client exceeds one
of the published rate limits or if multiple write operations are applied to
an object within a short time window.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for productGroupPromotionsCreate operation
#
##############################################################################
print_productGroupPromotionsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}productGroupPromotionsCreate - Create product group promotions${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - List of Product Group Promotions to create, size limit [1, 30]." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for productGroupPromotionsGet operation
#
##############################################################################
print_productGroupPromotionsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}productGroupPromotionsGet - Get a product group promotion by id${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a product group promotion by id" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}product_group_promotion_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group promotion ${YELLOW}Specify as: product_group_promotion_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for productGroupPromotionsList operation
#
##############################################################################
print_productGroupPromotionsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}productGroupPromotionsList - Get product group promotions${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List existing product group promotions associated with an ad account.

Include either ad_group_id or product_group_promotion_ids in your request.

<b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters.
Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}product_group_promotion_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Product group promotion Ids.${YELLOW} Specify as: product_group_promotion_ids=value1 product_group_promotion_ids=value2 product_group_promotion_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}entity_statuses${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: [&quot;ACTIVE&quot;,&quot;PAUSED&quot;])${OFF} - Entity status${YELLOW} Specify as: entity_statuses=value1 entity_statuses=value2 entity_statuses=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Ad group Id.${YELLOW} Specify as: ad_group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for productGroupPromotionsUpdate operation
#
##############################################################################
print_productGroupPromotionsUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}productGroupPromotionsUpdate - Update product group promotions${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update multiple existing Product Group Promotions (by product_group_id)" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Parameters to update Product group promotions" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for productGroupsAnalytics operation
#
##############################################################################
print_productGroupsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}productGroupsAnalytics - Get product group analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}product_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Product group Ids to use to filter the results.${YELLOW} Specify as: product_group_ids=value1 product_group_ids=value2 product_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly${YELLOW} Specify as: granularity=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}click_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: click_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}engagement_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 30)${OFF} - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.${YELLOW} Specify as: engagement_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}view_window_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day.${YELLOW} Specify as: view_window_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}conversion_report_time${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: TIME_OF_AD_ACTION)${OFF} - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.${YELLOW} Specify as: conversion_report_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountsCatalogsProductGroupsList operation
#
##############################################################################
print_adAccountsCatalogsProductGroupsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountsCatalogsProductGroupsList - Get catalog product groups${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}feed_profile_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The feed profile id whose catalog product groups we want to return.${YELLOW} Specify as: feed_profile_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid ad account ads parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Merchant data not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adAccountCountriesGet operation
#
##############################################################################
print_adAccountCountriesGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adAccountCountriesGet - Get ad accounts countries${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get Ad Accounts countries" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deliveryMetricsGet operation
#
##############################################################################
print_deliveryMetricsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deliveryMetricsGet - Get available metrics' definitions${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints.
The 'display_name' attribute will match how the metric is named in our native tools like Ads Manager.
See <a href='/docs/content/analytics/'>Organic Analytics</a> and <a href='/docs/ads/ad-analytics-reporting/'>Ads Analytics</a> for more information." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}report_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Report type.${YELLOW} Specify as: report_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for interestTargetingOptionsGet operation
#
##############################################################################
print_interestTargetingOptionsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}interestTargetingOptionsGet - Get interest details${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}interest_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an interest. ${YELLOW}Specify as: interest_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for leadFormQuestionsGet operation
#
##############################################################################
print_leadFormQuestionsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}leadFormQuestionsGet - Get lead form questions${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of all lead form question type names. Some questions might not be used.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for metricsReadyStateGet operation
#
##############################################################################
print_metricsReadyStateGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}metricsReadyStateGet - Get metrics ready state${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Learn whether conversion or non-conversion metrics are finalized and ready to query." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Analytics reports request date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for targetingOptionsGet operation
#
##############################################################################
print_targetingOptionsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}targetingOptionsGet - Get targeting options${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p>
<p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}targeting_type${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Public targeting type. ${YELLOW}Specify as: targeting_type=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}client_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Client ID.${YELLOW} Specify as: client_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}oauth_signature${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Oauth signature${YELLOW} Specify as: oauth_signature=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}timestamp${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Timestamp${YELLOW} Specify as: timestamp=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for searchPartnerPins operation
#
##############################################################################
print_searchPartnerPins_help() {
    echo ""
    echo -e "${BOLD}${WHITE}searchPartnerPins - Search pins by a given search term${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

Get the top 10 Pins by a given search term." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}term${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Search term to look up pins.${YELLOW} Specify as: term=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}country_code${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Two letter country code (ISO 3166-1 alpha-2)${YELLOW} Specify as: country_code=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}locale${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Search locale.${YELLOW} Specify as: locale=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 10)${OFF} - Max search result size${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid pins${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for searchUserBoardsGet operation
#
##############################################################################
print_searchUserBoardsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}searchUserBoardsGet - Search user's boards${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Search for boards for the \"operation user_account\". This includes boards of all board types.
- By default, the \"operation user_account\" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}query${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Search query. Can contain pin description keywords or comma-separated pin IDs.${YELLOW} Specify as: query=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for searchUserPinsList operation
#
##############################################################################
print_searchUserPinsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}searchUserPinsList - Search user's Pins${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Search for pins for the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}query${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Search query. Can contain pin description keywords or comma-separated pin IDs.${YELLOW} Specify as: query=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;User not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for termsRelatedList operation
#
##############################################################################
print_termsRelatedList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}termsRelatedList - List related terms${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of terms logically related to each input term. <p/>
Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}terms${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of input terms.${YELLOW} Specify as: terms=value1 terms=value2 terms=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid terms related parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for termsSuggestedList operation
#
##############################################################################
print_termsSuggestedList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}termsSuggestedList - List suggested terms${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get popular search terms that begin with your input term. <p/>
Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}term${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Input term.${YELLOW} Specify as: term=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 4)${OFF} - Max suggested terms to return.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid terms suggested parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for termsOfServiceGet operation
#
##############################################################################
print_termsOfServiceGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}termsOfServiceGet - Get terms of service${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the text of the terms of service and see whether the advertiser has accepted the terms of service." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_html${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Return HTML in TOS text.${YELLOW} Specify as: include_html=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}tos_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Request type.${YELLOW} Specify as: tos_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for boardsUserFollowsList operation
#
##############################################################################
print_boardsUserFollowsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardsUserFollowsList - List following boards${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the boards a user follows. The request returns a board summary object array." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}explicit_following${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.${YELLOW} Specify as: explicit_following=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid user id${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for followUserUpdate operation
#
##############################################################################
print_followUserUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}followUserUpdate - Follow user${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

Use this request, as a signed-in user, to follow another user." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}username${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A valid username ${YELLOW}Specify as: username=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Follow a user." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;User not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for followersList operation
#
##############################################################################
print_followersList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}followersList - List followers${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of your followers." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid user id${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for linkedBusinessAccountsGet operation
#
##############################################################################
print_linkedBusinessAccountsGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}linkedBusinessAccountsGet - List linked businesses${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of your linked business accounts." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for unverifyWebsiteDelete operation
#
##############################################################################
print_unverifyWebsiteDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}unverifyWebsiteDelete - Unverify website${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Unverifu a website verified by the signed-in user." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}website${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Website with path or domain only${YELLOW} Specify as: website=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Successfully unverified website${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Website not in user list.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for userAccountAnalytics operation
#
##############################################################################
print_userAccountAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}userAccountAnalytics - Get user account analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the \"operation user_account\"
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}from_claimed_content${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: BOTH)${OFF} - Filter on Pins that match your claimed domain.${YELLOW} Specify as: from_claimed_content=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_format${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Pin formats to get data for, default is all.${YELLOW} Specify as: pin_format=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}app_types${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Apps or devices to get data for, default is all.${YELLOW} Specify as: app_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}content_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Filter to paid or organic data. Default is all.${YELLOW} Specify as: content_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}source${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts${YELLOW} Specify as: source=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}metric_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Metric types to get data for, default is all.${YELLOW} Specify as: metric_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}split_field${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: NO_SPLIT)${OFF} - How to split the data into groups. Not including this param means data won't be split.${YELLOW} Specify as: split_field=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid user accounts analytics parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access the user account analytics.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for userAccountAnalyticsTopPins operation
#
##############################################################################
print_userAccountAnalyticsTopPins_help() {
    echo ""
    echo -e "${BOLD}${WHITE}userAccountAnalyticsTopPins - Get user account top pins analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Gets analytics data about a user's top pins (limited to the top 50).
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}sort_by${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Specify sorting order for metrics${YELLOW} Specify as: sort_by=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}from_claimed_content${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: BOTH)${OFF} - Filter on Pins that match your claimed domain.${YELLOW} Specify as: from_claimed_content=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_format${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Pin formats to get data for, default is all.${YELLOW} Specify as: pin_format=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}app_types${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Apps or devices to get data for, default is all.${YELLOW} Specify as: app_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}content_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Filter to paid or organic data. Default is all.${YELLOW} Specify as: content_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}source${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts${YELLOW} Specify as: source=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}metric_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Metric types to get data for, default is all.${YELLOW} Specify as: metric_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}num_of_pins${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 10)${OFF} - Number of pins to include, default is 10. Max is 50.${YELLOW} Specify as: num_of_pins=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}created_in_last_n_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Get metrics for pins created in the last \"n\" days.${YELLOW} Specify as: created_in_last_n_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access the user account analytics.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for userAccountAnalyticsTopVideoPins operation
#
##############################################################################
print_userAccountAnalyticsTopVideoPins_help() {
    echo ""
    echo -e "${BOLD}${WHITE}userAccountAnalyticsTopVideoPins - Get user account top video pins analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Gets analytics data about a user's top video pins (limited to the top 50).
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}sort_by${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Specify sorting order for video metrics${YELLOW} Specify as: sort_by=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}from_claimed_content${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: BOTH)${OFF} - Filter on Pins that match your claimed domain.${YELLOW} Specify as: from_claimed_content=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_format${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Pin formats to get data for, default is all.${YELLOW} Specify as: pin_format=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}app_types${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Apps or devices to get data for, default is all.${YELLOW} Specify as: app_types=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}content_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Filter to paid or organic data. Default is all.${YELLOW} Specify as: content_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}source${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts${YELLOW} Specify as: source=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}metric_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Metric types to get video data for, default is all.${YELLOW} Specify as: metric_types="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}num_of_pins${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 10)${OFF} - Number of pins to include, default is 10. Max is 50.${YELLOW} Specify as: num_of_pins=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}created_in_last_n_days${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Get metrics for pins created in the last \"n\" days.${YELLOW} Specify as: created_in_last_n_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access the user account analytics.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for userAccountFollowedInterests operation
#
##############################################################################
print_userAccountFollowedInterests_help() {
    echo ""
    echo -e "${BOLD}${WHITE}userAccountFollowedInterests - List following interests${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of a user's following interests in one place." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}username${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A valid username ${YELLOW}Specify as: username=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid parameters${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Authorization failed${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;User not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for userAccountGet operation
#
##############################################################################
print_userAccountGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}userAccountGet - Get user account${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get account information for the \"operation user_account\"
- By default, the \"operation user_account\" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access the user account.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for userFollowingGet operation
#
##############################################################################
print_userFollowingGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}userFollowingGet - List following${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of who a certain user follows." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}feed_type${OFF} ${BLUE}[UserFollowingFeedType]${OFF} ${CYAN}(default: null)${OFF} - Thrift param specifying what type of followees will be kept. Default to include all followees.${YELLOW} Specify as: feed_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}explicit_following${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.${YELLOW} Specify as: explicit_following=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account.${YELLOW} Specify as: ad_account_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for userWebsitesGet operation
#
##############################################################################
print_userWebsitesGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}userWebsitesGet - Get user websites${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get user websites, claimed or not" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access the user website list.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for verifyWebsiteUpdate operation
#
##############################################################################
print_verifyWebsiteUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}verifyWebsiteUpdate - Verify website${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Verify a website as a signed-in user." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Verify a website." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for websiteVerificationGet operation
#
##############################################################################
print_websiteVerificationGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}websiteVerificationGet - Get user verification code for website claiming${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get verification code for user to install on the website to claim it." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access the user verification code for website claiming.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}


##############################################################################
#
# Call adAccountAnalytics operation
#
##############################################################################
call_adAccountAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date columns granularity click_window_days engagement_window_days view_window_days conversion_report_time  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountTargetingAnalyticsGet operation
#
##############################################################################
call_adAccountTargetingAnalyticsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date targeting_types columns granularity click_window_days engagement_window_days view_window_days conversion_report_time attribution_types  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/targeting_analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountsCreate operation
#
##############################################################################
call_adAccountsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adAccountsGet operation
#
##############################################################################
call_adAccountsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountsList operation
#
##############################################################################
call_adAccountsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size include_shared_accounts  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call analyticsCreateMmmReport operation
#
##############################################################################
call_analyticsCreateMmmReport() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/mmm_reports" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call analyticsCreateReport operation
#
##############################################################################
call_analyticsCreateReport() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/reports" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call analyticsCreateTemplateReport operation
#
##############################################################################
call_analyticsCreateTemplateReport() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id template_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date granularity  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call analyticsGetMmmReport operation
#
##############################################################################
call_analyticsGetMmmReport() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(token  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/mmm_reports" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call analyticsGetReport operation
#
##############################################################################
call_analyticsGetReport() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(token  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/reports" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call sandboxDelete operation
#
##############################################################################
call_sandboxDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/sandbox" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call templatesList operation
#
##############################################################################
call_templatesList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/templates" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adGroupsAnalytics operation
#
##############################################################################
call_adGroupsAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date ad_group_ids columns granularity click_window_days engagement_window_days view_window_days conversion_report_time  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adGroupsAudienceSizing operation
#
##############################################################################
call_adGroupsAudienceSizing() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adGroupsBidFloorGet operation
#
##############################################################################
call_adGroupsBidFloorGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/bid_floor" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adGroupsCreate operation
#
##############################################################################
call_adGroupsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_groups" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adGroupsGet operation
#
##############################################################################
call_adGroupsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id ad_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adGroupsList operation
#
##############################################################################
call_adGroupsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(campaign_ids ad_group_ids entity_statuses page_size order bookmark translate_interests_to_names  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_groups" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adGroupsTargetingAnalyticsGet operation
#
##############################################################################
call_adGroupsTargetingAnalyticsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_group_ids start_date end_date targeting_types columns granularity click_window_days engagement_window_days view_window_days conversion_report_time attribution_types  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adGroupsUpdate operation
#
##############################################################################
call_adGroupsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_groups" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adPreviewsCreate operation
#
##############################################################################
call_adPreviewsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ad_previews" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adTargetingAnalyticsGet operation
#
##############################################################################
call_adTargetingAnalyticsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_ids start_date end_date targeting_types columns granularity click_window_days engagement_window_days view_window_days conversion_report_time attribution_types  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adsAnalytics operation
#
##############################################################################
call_adsAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date ad_ids columns granularity click_window_days engagement_window_days view_window_days conversion_report_time  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads/analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adsCreate operation
#
##############################################################################
call_adsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adsGet operation
#
##############################################################################
call_adsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id ad_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads/{ad_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adsList operation
#
##############################################################################
call_adsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(campaign_ids ad_group_ids ad_ids entity_statuses page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adsUpdate operation
#
##############################################################################
call_adsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call audienceInsightsGet operation
#
##############################################################################
call_audienceInsightsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(audience_insight_type  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/audience_insights" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call audienceInsightsScopeAndTypeGet operation
#
##############################################################################
call_audienceInsightsScopeAndTypeGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/insights/audiences" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call audiencesCreate operation
#
##############################################################################
call_audiencesCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/audiences" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call audiencesCreateCustom operation
#
##############################################################################
call_audiencesCreateCustom() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/audiences/custom" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call audiencesGet operation
#
##############################################################################
call_audiencesGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id audience_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call audiencesList operation
#
##############################################################################
call_audiencesList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark order page_size ownership_type  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/audiences" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call audiencesUpdate operation
#
##############################################################################
call_audiencesUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id audience_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adsCreditRedeem operation
#
##############################################################################
call_adsCreditRedeem() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads_credit/redeem" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adsCreditsDiscountsGet operation
#
##############################################################################
call_adsCreditsDiscountsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ads_credit/discounts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call billingProfilesGet operation
#
##############################################################################
call_billingProfilesGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(is_active bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/billing_profiles" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call ssioAccountsGet operation
#
##############################################################################
call_ssioAccountsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ssio/accounts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call ssioInsertionOrderCreate operation
#
##############################################################################
call_ssioInsertionOrderCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call ssioInsertionOrderEdit operation
#
##############################################################################
call_ssioInsertionOrderEdit() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call ssioInsertionOrdersStatusGetByAdAccount operation
#
##############################################################################
call_ssioInsertionOrdersStatusGetByAdAccount() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call ssioInsertionOrdersStatusGetByPinOrderId operation
#
##############################################################################
call_ssioInsertionOrdersStatusGetByPinOrderId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id pin_order_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call ssioOrderLinesGetByAdAccount operation
#
##############################################################################
call_ssioOrderLinesGetByAdAccount() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size pin_order_id  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/ssio/order_lines" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardSectionsCreate operation
#
##############################################################################
call_boardSectionsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}/sections" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call boardSectionsDelete operation
#
##############################################################################
call_boardSectionsDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id section_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}/sections/{section_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardSectionsList operation
#
##############################################################################
call_boardSectionsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}/sections" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardSectionsListPins operation
#
##############################################################################
call_boardSectionsListPins() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id section_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}/sections/{section_id}/pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardSectionsUpdate operation
#
##############################################################################
call_boardSectionsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id section_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}/sections/{section_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call boardsCreate operation
#
##############################################################################
call_boardsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/boards" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call boardsDelete operation
#
##############################################################################
call_boardsDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardsGet operation
#
##############################################################################
call_boardsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardsList operation
#
##############################################################################
call_boardsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id bookmark page_size privacy  )
    local path

    if ! path=$(build_request_path "/v5/boards" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardsListPins operation
#
##############################################################################
call_boardsListPins() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size creative_types ad_account_id pin_metrics  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}/pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardsUpdate operation
#
##############################################################################
call_boardsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/boards/{board_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call bulkDownloadCreate operation
#
##############################################################################
call_bulkDownloadCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/bulk/download" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call bulkRequestGet operation
#
##############################################################################
call_bulkRequestGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id bulk_request_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(include_details  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call bulkUpsertCreate operation
#
##############################################################################
call_bulkUpsertCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/bulk/upsert" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call campaignTargetingAnalyticsGet operation
#
##############################################################################
call_campaignTargetingAnalyticsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(campaign_ids start_date end_date targeting_types columns granularity click_window_days engagement_window_days view_window_days conversion_report_time attribution_types  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call campaignsAnalytics operation
#
##############################################################################
call_campaignsAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date campaign_ids columns granularity click_window_days engagement_window_days view_window_days conversion_report_time  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/campaigns/analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call campaignsCreate operation
#
##############################################################################
call_campaignsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/campaigns" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call campaignsGet operation
#
##############################################################################
call_campaignsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id campaign_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call campaignsList operation
#
##############################################################################
call_campaignsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(campaign_ids entity_statuses page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/campaigns" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call campaignsUpdate operation
#
##############################################################################
call_campaignsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/campaigns" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call catalogsList operation
#
##############################################################################
call_catalogsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call catalogsProductGroupPinsList operation
#
##############################################################################
call_catalogsProductGroupPinsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(product_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/product_groups/{product_group_id}/products" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call catalogsProductGroupsCreate operation
#
##############################################################################
call_catalogsProductGroupsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/product_groups" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call catalogsProductGroupsDelete operation
#
##############################################################################
call_catalogsProductGroupsDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(product_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/product_groups/{product_group_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call catalogsProductGroupsGet operation
#
##############################################################################
call_catalogsProductGroupsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(product_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/product_groups/{product_group_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call catalogsProductGroupsList operation
#
##############################################################################
call_catalogsProductGroupsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(feed_id catalog_id bookmark page_size ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/product_groups" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call catalogsProductGroupsProductCountsGet operation
#
##############################################################################
call_catalogsProductGroupsProductCountsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(product_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/product_groups/{product_group_id}/product_counts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call catalogsProductGroupsUpdate operation
#
##############################################################################
call_catalogsProductGroupsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(product_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/product_groups/{product_group_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call feedProcessingResultsList operation
#
##############################################################################
call_feedProcessingResultsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(feed_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/feeds/{feed_id}/processing_results" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call feedsCreate operation
#
##############################################################################
call_feedsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/feeds" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call feedsDelete operation
#
##############################################################################
call_feedsDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(feed_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/feeds/{feed_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call feedsGet operation
#
##############################################################################
call_feedsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(feed_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/feeds/{feed_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call feedsList operation
#
##############################################################################
call_feedsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size catalog_id ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/feeds" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call feedsUpdate operation
#
##############################################################################
call_feedsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(feed_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/feeds/{feed_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call itemsBatchGet operation
#
##############################################################################
call_itemsBatchGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(batch_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/items/batch/{batch_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemsBatchPost operation
#
##############################################################################
call_itemsBatchPost() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/items/batch" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call itemsGet operation
#
##############################################################################
call_itemsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id country language item_ids filters  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/items" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemsIssuesList operation
#
##############################################################################
call_itemsIssuesList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(processing_result_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size item_numbers item_validation_issue ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/processing_results/{processing_result_id}/item_issues" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call productsByProductGroupFilterList operation
#
##############################################################################
call_productsByProductGroupFilterList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/catalogs/products/get_by_product_group_filters" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call eventsCreate operation
#
##############################################################################
call_eventsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(test    )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/events" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call conversionTagsCreate operation
#
##############################################################################
call_conversionTagsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/conversion_tags" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call conversionTagsGet operation
#
##############################################################################
call_conversionTagsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id conversion_tag_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call conversionTagsList operation
#
##############################################################################
call_conversionTagsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(filter_deleted  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/conversion_tags" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call ocpmEligibleConversionTagsGet operation
#
##############################################################################
call_ocpmEligibleConversionTagsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pageVisitConversionTagsGet operation
#
##############################################################################
call_pageVisitConversionTagsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call customerListsCreate operation
#
##############################################################################
call_customerListsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/customer_lists" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call customerListsGet operation
#
##############################################################################
call_customerListsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id customer_list_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call customerListsList operation
#
##############################################################################
call_customerListsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/customer_lists" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call customerListsUpdate operation
#
##############################################################################
call_customerListsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id customer_list_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call integrationsCommerceDel operation
#
##############################################################################
call_integrationsCommerceDel() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(external_business_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/integrations/commerce/{external_business_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call integrationsCommerceGet operation
#
##############################################################################
call_integrationsCommerceGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(external_business_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/integrations/commerce/{external_business_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call integrationsCommercePatch operation
#
##############################################################################
call_integrationsCommercePatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(external_business_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/integrations/commerce/{external_business_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call integrationsCommercePost operation
#
##############################################################################
call_integrationsCommercePost() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/integrations/commerce" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call integrationsGetById operation
#
##############################################################################
call_integrationsGetById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/integrations/{id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call integrationsGetList operation
#
##############################################################################
call_integrationsGetList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/integrations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call integrationsLogsPost operation
#
##############################################################################
call_integrationsLogsPost() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/integrations/logs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call countryKeywordsMetricsGet operation
#
##############################################################################
call_countryKeywordsMetricsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(country_code keywords  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/keywords/metrics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call keywordsCreate operation
#
##############################################################################
call_keywordsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/keywords" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call keywordsGet operation
#
##############################################################################
call_keywordsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(campaign_id ad_group_id match_types page_size bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/keywords" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call keywordsUpdate operation
#
##############################################################################
call_keywordsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/keywords" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call trendingKeywordsList operation
#
##############################################################################
call_trendingKeywordsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(region trend_type)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(interests genders ages normalize_against_group limit  )
    local path

    if ! path=$(build_request_path "/v5/trends/keywords/{region}/top/{trend_type}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountsSubscriptionsDelById operation
#
##############################################################################
call_adAccountsSubscriptionsDelById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id subscription_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountsSubscriptionsGetById operation
#
##############################################################################
call_adAccountsSubscriptionsGetById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id subscription_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountsSubscriptionsGetList operation
#
##############################################################################
call_adAccountsSubscriptionsGetList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(page_size bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/leads/subscriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountsSubscriptionsPost operation
#
##############################################################################
call_adAccountsSubscriptionsPost() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/leads/subscriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call leadFormGet operation
#
##############################################################################
call_leadFormGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id lead_form_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call leadFormTestCreate operation
#
##############################################################################
call_leadFormTestCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id lead_form_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call leadFormsList operation
#
##############################################################################
call_leadFormsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/lead_forms" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call mediaCreate operation
#
##############################################################################
call_mediaCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/media" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call mediaGet operation
#
##############################################################################
call_mediaGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(media_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/media/{media_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call mediaList operation
#
##############################################################################
call_mediaList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/media" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call oauthToken operation
#
##############################################################################
call_oauthToken() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/oauth/token" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    body_form_urlencoded=$(body_parameters_to_form_urlencoded)
    if [[ "$print_curl" = true ]]; then
        echo "curl ${body_form_urlencoded} ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${body_form_urlencoded} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call orderLinesGet operation
#
##############################################################################
call_orderLinesGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id order_line_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call orderLinesList operation
#
##############################################################################
call_orderLinesList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/order_lines" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pinsAnalytics operation
#
##############################################################################
call_pinsAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(pin_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date app_types metric_types split_field ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/pins/{pin_id}/analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pinsCreate operation
#
##############################################################################
call_pinsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call pinsDelete operation
#
##############################################################################
call_pinsDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(pin_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/pins/{pin_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pinsGet operation
#
##############################################################################
call_pinsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(pin_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(pin_metrics ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/pins/{pin_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pinsList operation
#
##############################################################################
call_pinsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size pin_filter include_protected_pins pin_type creative_types ad_account_id pin_metrics  )
    local path

    if ! path=$(build_request_path "/v5/pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pinsSave operation
#
##############################################################################
call_pinsSave() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(pin_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/pins/{pin_id}/save" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call pinsUpdate operation
#
##############################################################################
call_pinsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(pin_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/pins/{pin_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call productGroupPromotionsCreate operation
#
##############################################################################
call_productGroupPromotionsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/product_group_promotions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call productGroupPromotionsGet operation
#
##############################################################################
call_productGroupPromotionsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id product_group_promotion_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call productGroupPromotionsList operation
#
##############################################################################
call_productGroupPromotionsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(product_group_promotion_ids entity_statuses ad_group_id page_size order bookmark  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/product_group_promotions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call productGroupPromotionsUpdate operation
#
##############################################################################
call_productGroupPromotionsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/product_group_promotions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call productGroupsAnalytics operation
#
##############################################################################
call_productGroupsAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date product_group_ids columns granularity click_window_days engagement_window_days view_window_days conversion_report_time  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/product_groups/analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountsCatalogsProductGroupsList operation
#
##############################################################################
call_adAccountsCatalogsProductGroupsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(feed_profile_id  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/product_groups/catalogs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adAccountCountriesGet operation
#
##############################################################################
call_adAccountCountriesGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/resources/ad_account_countries" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deliveryMetricsGet operation
#
##############################################################################
call_deliveryMetricsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(report_type  )
    local path

    if ! path=$(build_request_path "/v5/resources/delivery_metrics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call interestTargetingOptionsGet operation
#
##############################################################################
call_interestTargetingOptionsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(interest_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/resources/targeting/interests/{interest_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call leadFormQuestionsGet operation
#
##############################################################################
call_leadFormQuestionsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/resources/lead_form_questions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call metricsReadyStateGet operation
#
##############################################################################
call_metricsReadyStateGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(date  )
    local path

    if ! path=$(build_request_path "/v5/resources/metrics_ready_state" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call targetingOptionsGet operation
#
##############################################################################
call_targetingOptionsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(targeting_type)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(client_id oauth_signature timestamp  )
    local path

    if ! path=$(build_request_path "/v5/resources/targeting/{targeting_type}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call searchPartnerPins operation
#
##############################################################################
call_searchPartnerPins() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(term country_code bookmark locale limit  )
    local path

    if ! path=$(build_request_path "/v5/search/partner/pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call searchUserBoardsGet operation
#
##############################################################################
call_searchUserBoardsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id bookmark page_size query  )
    local path

    if ! path=$(build_request_path "/v5/search/boards" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call searchUserPinsList operation
#
##############################################################################
call_searchUserPinsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id query bookmark  )
    local path

    if ! path=$(build_request_path "/v5/search/pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call termsRelatedList operation
#
##############################################################################
call_termsRelatedList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(terms  )
    local path

    if ! path=$(build_request_path "/v5/terms/related" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call termsSuggestedList operation
#
##############################################################################
call_termsSuggestedList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(term limit  )
    local path

    if ! path=$(build_request_path "/v5/terms/suggested" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call termsOfServiceGet operation
#
##############################################################################
call_termsOfServiceGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(ad_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(include_html tos_type  )
    local path

    if ! path=$(build_request_path "/v5/ad_accounts/{ad_account_id}/terms_of_service" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call boardsUserFollowsList operation
#
##############################################################################
call_boardsUserFollowsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size explicit_following ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/user_account/following/boards" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call followUserUpdate operation
#
##############################################################################
call_followUserUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(username)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/user_account/following/{username}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call followersList operation
#
##############################################################################
call_followersList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/user_account/followers" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call linkedBusinessAccountsGet operation
#
##############################################################################
call_linkedBusinessAccountsGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/user_account/businesses" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call unverifyWebsiteDelete operation
#
##############################################################################
call_unverifyWebsiteDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(website  )
    local path

    if ! path=$(build_request_path "/v5/user_account/websites" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call userAccountAnalytics operation
#
##############################################################################
call_userAccountAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date from_claimed_content pin_format app_types content_type source metric_types split_field ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/user_account/analytics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call userAccountAnalyticsTopPins operation
#
##############################################################################
call_userAccountAnalyticsTopPins() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date sort_by from_claimed_content pin_format app_types content_type source metric_types num_of_pins created_in_last_n_days ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/user_account/analytics/top_pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call userAccountAnalyticsTopVideoPins operation
#
##############################################################################
call_userAccountAnalyticsTopVideoPins() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date sort_by from_claimed_content pin_format app_types content_type source metric_types num_of_pins created_in_last_n_days ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/user_account/analytics/top_video_pins" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call userAccountFollowedInterests operation
#
##############################################################################
call_userAccountFollowedInterests() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(username)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/users/{username}/interests/follow" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call userAccountGet operation
#
##############################################################################
call_userAccountGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/user_account" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call userFollowingGet operation
#
##############################################################################
call_userFollowingGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size feed_type explicit_following ad_account_id  )
    local path

    if ! path=$(build_request_path "/v5/user_account/following" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call userWebsitesGet operation
#
##############################################################################
call_userWebsitesGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bookmark page_size  )
    local path

    if ! path=$(build_request_path "/v5/user_account/websites" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call verifyWebsiteUpdate operation
#
##############################################################################
call_verifyWebsiteUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/user_account/websites" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call websiteVerificationGet operation
#
##############################################################################
call_websiteVerificationGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v5/user_account/websites/verification" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}



##############################################################################
#
# Main
#
##############################################################################


# Check dependencies
type curl >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'cURL' installed."; exit 1; }
type sed >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'sed' installed."; exit 1; }
type column >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'bsdmainutils' installed."; exit 1; }

#
# Process command line
#
# Pass all arguments before 'operation' to cURL except the ones we override
#
take_user=false
take_host=false
take_accept_header=false
take_contenttype_header=false

for key in "$@"; do
# Take the value of -u|--user argument
if [[ "$take_user" = true ]]; then
    basic_auth_credential="$key"
    take_user=false
    continue
fi
# Take the value of --host argument
if [[ "$take_host" = true ]]; then
    host="$key"
    take_host=false
    continue
fi
# Take the value of --accept argument
if [[ "$take_accept_header" = true ]]; then
    header_accept=$(lookup_mime_type "$key")
    take_accept_header=false
    continue
fi
# Take the value of --content-type argument
if [[ "$take_contenttype_header" = true ]]; then
    header_content_type=$(lookup_mime_type "$key")
    take_contenttype_header=false
    continue
fi
case $key in
    -h|--help)
    if [[ "x$operation" == "x" ]]; then
        print_help
        exit 0
    else
        eval "print_${operation}_help"
        exit 0
    fi
    ;;
    -V|--version)
    print_version
    exit 0
    ;;
    --about)
    print_about
    exit 0
    ;;
    -u|--user)
    take_user=true
    ;;
    --host)
    take_host=true
    ;;
    --force)
    force=true
    ;;
    -ac|--accept)
    take_accept_header=true
    ;;
    -ct|--content-type)
    take_contenttype_header=true
    ;;
    --dry-run)
    print_curl=true
    ;;
    -nc|--no-colors)
        RED=""
        GREEN=""
        YELLOW=""
        BLUE=""
        MAGENTA=""
        CYAN=""
        WHITE=""
        BOLD=""
        OFF=""
        result_color_table=( "" "" "" "" "" "" "" )
    ;;
    adAccountAnalytics)
    operation="adAccountAnalytics"
    ;;
    adAccountTargetingAnalyticsGet)
    operation="adAccountTargetingAnalyticsGet"
    ;;
    adAccountsCreate)
    operation="adAccountsCreate"
    ;;
    adAccountsGet)
    operation="adAccountsGet"
    ;;
    adAccountsList)
    operation="adAccountsList"
    ;;
    analyticsCreateMmmReport)
    operation="analyticsCreateMmmReport"
    ;;
    analyticsCreateReport)
    operation="analyticsCreateReport"
    ;;
    analyticsCreateTemplateReport)
    operation="analyticsCreateTemplateReport"
    ;;
    analyticsGetMmmReport)
    operation="analyticsGetMmmReport"
    ;;
    analyticsGetReport)
    operation="analyticsGetReport"
    ;;
    sandboxDelete)
    operation="sandboxDelete"
    ;;
    templatesList)
    operation="templatesList"
    ;;
    adGroupsAnalytics)
    operation="adGroupsAnalytics"
    ;;
    adGroupsAudienceSizing)
    operation="adGroupsAudienceSizing"
    ;;
    adGroupsBidFloorGet)
    operation="adGroupsBidFloorGet"
    ;;
    adGroupsCreate)
    operation="adGroupsCreate"
    ;;
    adGroupsGet)
    operation="adGroupsGet"
    ;;
    adGroupsList)
    operation="adGroupsList"
    ;;
    adGroupsTargetingAnalyticsGet)
    operation="adGroupsTargetingAnalyticsGet"
    ;;
    adGroupsUpdate)
    operation="adGroupsUpdate"
    ;;
    adPreviewsCreate)
    operation="adPreviewsCreate"
    ;;
    adTargetingAnalyticsGet)
    operation="adTargetingAnalyticsGet"
    ;;
    adsAnalytics)
    operation="adsAnalytics"
    ;;
    adsCreate)
    operation="adsCreate"
    ;;
    adsGet)
    operation="adsGet"
    ;;
    adsList)
    operation="adsList"
    ;;
    adsUpdate)
    operation="adsUpdate"
    ;;
    audienceInsightsGet)
    operation="audienceInsightsGet"
    ;;
    audienceInsightsScopeAndTypeGet)
    operation="audienceInsightsScopeAndTypeGet"
    ;;
    audiencesCreate)
    operation="audiencesCreate"
    ;;
    audiencesCreateCustom)
    operation="audiencesCreateCustom"
    ;;
    audiencesGet)
    operation="audiencesGet"
    ;;
    audiencesList)
    operation="audiencesList"
    ;;
    audiencesUpdate)
    operation="audiencesUpdate"
    ;;
    adsCreditRedeem)
    operation="adsCreditRedeem"
    ;;
    adsCreditsDiscountsGet)
    operation="adsCreditsDiscountsGet"
    ;;
    billingProfilesGet)
    operation="billingProfilesGet"
    ;;
    ssioAccountsGet)
    operation="ssioAccountsGet"
    ;;
    ssioInsertionOrderCreate)
    operation="ssioInsertionOrderCreate"
    ;;
    ssioInsertionOrderEdit)
    operation="ssioInsertionOrderEdit"
    ;;
    ssioInsertionOrdersStatusGetByAdAccount)
    operation="ssioInsertionOrdersStatusGetByAdAccount"
    ;;
    ssioInsertionOrdersStatusGetByPinOrderId)
    operation="ssioInsertionOrdersStatusGetByPinOrderId"
    ;;
    ssioOrderLinesGetByAdAccount)
    operation="ssioOrderLinesGetByAdAccount"
    ;;
    boardSectionsCreate)
    operation="boardSectionsCreate"
    ;;
    boardSectionsDelete)
    operation="boardSectionsDelete"
    ;;
    boardSectionsList)
    operation="boardSectionsList"
    ;;
    boardSectionsListPins)
    operation="boardSectionsListPins"
    ;;
    boardSectionsUpdate)
    operation="boardSectionsUpdate"
    ;;
    boardsCreate)
    operation="boardsCreate"
    ;;
    boardsDelete)
    operation="boardsDelete"
    ;;
    boardsGet)
    operation="boardsGet"
    ;;
    boardsList)
    operation="boardsList"
    ;;
    boardsListPins)
    operation="boardsListPins"
    ;;
    boardsUpdate)
    operation="boardsUpdate"
    ;;
    bulkDownloadCreate)
    operation="bulkDownloadCreate"
    ;;
    bulkRequestGet)
    operation="bulkRequestGet"
    ;;
    bulkUpsertCreate)
    operation="bulkUpsertCreate"
    ;;
    campaignTargetingAnalyticsGet)
    operation="campaignTargetingAnalyticsGet"
    ;;
    campaignsAnalytics)
    operation="campaignsAnalytics"
    ;;
    campaignsCreate)
    operation="campaignsCreate"
    ;;
    campaignsGet)
    operation="campaignsGet"
    ;;
    campaignsList)
    operation="campaignsList"
    ;;
    campaignsUpdate)
    operation="campaignsUpdate"
    ;;
    catalogsList)
    operation="catalogsList"
    ;;
    catalogsProductGroupPinsList)
    operation="catalogsProductGroupPinsList"
    ;;
    catalogsProductGroupsCreate)
    operation="catalogsProductGroupsCreate"
    ;;
    catalogsProductGroupsDelete)
    operation="catalogsProductGroupsDelete"
    ;;
    catalogsProductGroupsGet)
    operation="catalogsProductGroupsGet"
    ;;
    catalogsProductGroupsList)
    operation="catalogsProductGroupsList"
    ;;
    catalogsProductGroupsProductCountsGet)
    operation="catalogsProductGroupsProductCountsGet"
    ;;
    catalogsProductGroupsUpdate)
    operation="catalogsProductGroupsUpdate"
    ;;
    feedProcessingResultsList)
    operation="feedProcessingResultsList"
    ;;
    feedsCreate)
    operation="feedsCreate"
    ;;
    feedsDelete)
    operation="feedsDelete"
    ;;
    feedsGet)
    operation="feedsGet"
    ;;
    feedsList)
    operation="feedsList"
    ;;
    feedsUpdate)
    operation="feedsUpdate"
    ;;
    itemsBatchGet)
    operation="itemsBatchGet"
    ;;
    itemsBatchPost)
    operation="itemsBatchPost"
    ;;
    itemsGet)
    operation="itemsGet"
    ;;
    itemsIssuesList)
    operation="itemsIssuesList"
    ;;
    productsByProductGroupFilterList)
    operation="productsByProductGroupFilterList"
    ;;
    eventsCreate)
    operation="eventsCreate"
    ;;
    conversionTagsCreate)
    operation="conversionTagsCreate"
    ;;
    conversionTagsGet)
    operation="conversionTagsGet"
    ;;
    conversionTagsList)
    operation="conversionTagsList"
    ;;
    ocpmEligibleConversionTagsGet)
    operation="ocpmEligibleConversionTagsGet"
    ;;
    pageVisitConversionTagsGet)
    operation="pageVisitConversionTagsGet"
    ;;
    customerListsCreate)
    operation="customerListsCreate"
    ;;
    customerListsGet)
    operation="customerListsGet"
    ;;
    customerListsList)
    operation="customerListsList"
    ;;
    customerListsUpdate)
    operation="customerListsUpdate"
    ;;
    integrationsCommerceDel)
    operation="integrationsCommerceDel"
    ;;
    integrationsCommerceGet)
    operation="integrationsCommerceGet"
    ;;
    integrationsCommercePatch)
    operation="integrationsCommercePatch"
    ;;
    integrationsCommercePost)
    operation="integrationsCommercePost"
    ;;
    integrationsGetById)
    operation="integrationsGetById"
    ;;
    integrationsGetList)
    operation="integrationsGetList"
    ;;
    integrationsLogsPost)
    operation="integrationsLogsPost"
    ;;
    countryKeywordsMetricsGet)
    operation="countryKeywordsMetricsGet"
    ;;
    keywordsCreate)
    operation="keywordsCreate"
    ;;
    keywordsGet)
    operation="keywordsGet"
    ;;
    keywordsUpdate)
    operation="keywordsUpdate"
    ;;
    trendingKeywordsList)
    operation="trendingKeywordsList"
    ;;
    adAccountsSubscriptionsDelById)
    operation="adAccountsSubscriptionsDelById"
    ;;
    adAccountsSubscriptionsGetById)
    operation="adAccountsSubscriptionsGetById"
    ;;
    adAccountsSubscriptionsGetList)
    operation="adAccountsSubscriptionsGetList"
    ;;
    adAccountsSubscriptionsPost)
    operation="adAccountsSubscriptionsPost"
    ;;
    leadFormGet)
    operation="leadFormGet"
    ;;
    leadFormTestCreate)
    operation="leadFormTestCreate"
    ;;
    leadFormsList)
    operation="leadFormsList"
    ;;
    mediaCreate)
    operation="mediaCreate"
    ;;
    mediaGet)
    operation="mediaGet"
    ;;
    mediaList)
    operation="mediaList"
    ;;
    oauthToken)
    operation="oauthToken"
    ;;
    orderLinesGet)
    operation="orderLinesGet"
    ;;
    orderLinesList)
    operation="orderLinesList"
    ;;
    pinsAnalytics)
    operation="pinsAnalytics"
    ;;
    pinsCreate)
    operation="pinsCreate"
    ;;
    pinsDelete)
    operation="pinsDelete"
    ;;
    pinsGet)
    operation="pinsGet"
    ;;
    pinsList)
    operation="pinsList"
    ;;
    pinsSave)
    operation="pinsSave"
    ;;
    pinsUpdate)
    operation="pinsUpdate"
    ;;
    productGroupPromotionsCreate)
    operation="productGroupPromotionsCreate"
    ;;
    productGroupPromotionsGet)
    operation="productGroupPromotionsGet"
    ;;
    productGroupPromotionsList)
    operation="productGroupPromotionsList"
    ;;
    productGroupPromotionsUpdate)
    operation="productGroupPromotionsUpdate"
    ;;
    productGroupsAnalytics)
    operation="productGroupsAnalytics"
    ;;
    adAccountsCatalogsProductGroupsList)
    operation="adAccountsCatalogsProductGroupsList"
    ;;
    adAccountCountriesGet)
    operation="adAccountCountriesGet"
    ;;
    deliveryMetricsGet)
    operation="deliveryMetricsGet"
    ;;
    interestTargetingOptionsGet)
    operation="interestTargetingOptionsGet"
    ;;
    leadFormQuestionsGet)
    operation="leadFormQuestionsGet"
    ;;
    metricsReadyStateGet)
    operation="metricsReadyStateGet"
    ;;
    targetingOptionsGet)
    operation="targetingOptionsGet"
    ;;
    searchPartnerPins)
    operation="searchPartnerPins"
    ;;
    searchUserBoardsGet)
    operation="searchUserBoardsGet"
    ;;
    searchUserPinsList)
    operation="searchUserPinsList"
    ;;
    termsRelatedList)
    operation="termsRelatedList"
    ;;
    termsSuggestedList)
    operation="termsSuggestedList"
    ;;
    termsOfServiceGet)
    operation="termsOfServiceGet"
    ;;
    boardsUserFollowsList)
    operation="boardsUserFollowsList"
    ;;
    followUserUpdate)
    operation="followUserUpdate"
    ;;
    followersList)
    operation="followersList"
    ;;
    linkedBusinessAccountsGet)
    operation="linkedBusinessAccountsGet"
    ;;
    unverifyWebsiteDelete)
    operation="unverifyWebsiteDelete"
    ;;
    userAccountAnalytics)
    operation="userAccountAnalytics"
    ;;
    userAccountAnalyticsTopPins)
    operation="userAccountAnalyticsTopPins"
    ;;
    userAccountAnalyticsTopVideoPins)
    operation="userAccountAnalyticsTopVideoPins"
    ;;
    userAccountFollowedInterests)
    operation="userAccountFollowedInterests"
    ;;
    userAccountGet)
    operation="userAccountGet"
    ;;
    userFollowingGet)
    operation="userFollowingGet"
    ;;
    userWebsitesGet)
    operation="userWebsitesGet"
    ;;
    verifyWebsiteUpdate)
    operation="verifyWebsiteUpdate"
    ;;
    websiteVerificationGet)
    operation="websiteVerificationGet"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
    fi
    ;;
    --body=*)
    # Parse value of body as argument and convert it into only
    # the raw body content
    if [[ "$operation" ]]; then
        IFS='--body=' read -r body_value <<< "$key"
        body_value=${body_value##--body=}
        body_parameters["RAW_BODY"]="${body_value}"
        RAW_BODY=1
    fi
    ;;
    *:=*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content without quotes
    if [[ "$operation" ]]; then
        # ignore error about 'sep' being unused
        # shellcheck disable=SC2034
        IFS=':=' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]=${body_value}
    fi
    ;;
    +([^=]):*)
    # Parse header arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS=':' read -r header_name header_value <<< "$key"
        header_arguments[$header_name]=$header_value
    else
        curl_arguments+=" $key"
    fi
    ;;
    -)
    body_content_temp_file=$(mktemp)
    cat - > "$body_content_temp_file"
    ;;
    *=*)
    # Parse operation arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS='=' read -r parameter_name parameter_value <<< "$key"
        if [[ -z "${operation_parameters[$parameter_name]+foo}" ]]; then
            operation_parameters[$parameter_name]=$(url_escape "${parameter_value}")
        else
            operation_parameters[$parameter_name]+=":::"$(url_escape "${parameter_value}")
        fi
    else
        curl_arguments+=" $key"
    fi
    ;;
    *)
    # If we are before the operation, treat the arguments as cURL arguments
    if [[ "x$operation" == "x" ]]; then
        # Maintain quotes around cURL arguments if necessary
        space_regexp="[[:space:]]"
        if [[ $key =~ $space_regexp ]]; then
            curl_arguments+=" \"$key\""
        else
            curl_arguments+=" $key"
        fi
    fi
    ;;
esac
done


# Check if user provided host name
if [[ -z "$host" ]]; then
    ERROR_MSG="ERROR: No hostname provided!!! You have to  provide on command line option '--host ...'"
    exit 1
fi

# Check if user specified operation ID
if [[ -z "$operation" ]]; then
    ERROR_MSG="ERROR: No operation specified!!!"
    exit 1
fi


# Run cURL command based on the operation ID
case $operation in
    adAccountAnalytics)
    call_adAccountAnalytics
    ;;
    adAccountTargetingAnalyticsGet)
    call_adAccountTargetingAnalyticsGet
    ;;
    adAccountsCreate)
    call_adAccountsCreate
    ;;
    adAccountsGet)
    call_adAccountsGet
    ;;
    adAccountsList)
    call_adAccountsList
    ;;
    analyticsCreateMmmReport)
    call_analyticsCreateMmmReport
    ;;
    analyticsCreateReport)
    call_analyticsCreateReport
    ;;
    analyticsCreateTemplateReport)
    call_analyticsCreateTemplateReport
    ;;
    analyticsGetMmmReport)
    call_analyticsGetMmmReport
    ;;
    analyticsGetReport)
    call_analyticsGetReport
    ;;
    sandboxDelete)
    call_sandboxDelete
    ;;
    templatesList)
    call_templatesList
    ;;
    adGroupsAnalytics)
    call_adGroupsAnalytics
    ;;
    adGroupsAudienceSizing)
    call_adGroupsAudienceSizing
    ;;
    adGroupsBidFloorGet)
    call_adGroupsBidFloorGet
    ;;
    adGroupsCreate)
    call_adGroupsCreate
    ;;
    adGroupsGet)
    call_adGroupsGet
    ;;
    adGroupsList)
    call_adGroupsList
    ;;
    adGroupsTargetingAnalyticsGet)
    call_adGroupsTargetingAnalyticsGet
    ;;
    adGroupsUpdate)
    call_adGroupsUpdate
    ;;
    adPreviewsCreate)
    call_adPreviewsCreate
    ;;
    adTargetingAnalyticsGet)
    call_adTargetingAnalyticsGet
    ;;
    adsAnalytics)
    call_adsAnalytics
    ;;
    adsCreate)
    call_adsCreate
    ;;
    adsGet)
    call_adsGet
    ;;
    adsList)
    call_adsList
    ;;
    adsUpdate)
    call_adsUpdate
    ;;
    audienceInsightsGet)
    call_audienceInsightsGet
    ;;
    audienceInsightsScopeAndTypeGet)
    call_audienceInsightsScopeAndTypeGet
    ;;
    audiencesCreate)
    call_audiencesCreate
    ;;
    audiencesCreateCustom)
    call_audiencesCreateCustom
    ;;
    audiencesGet)
    call_audiencesGet
    ;;
    audiencesList)
    call_audiencesList
    ;;
    audiencesUpdate)
    call_audiencesUpdate
    ;;
    adsCreditRedeem)
    call_adsCreditRedeem
    ;;
    adsCreditsDiscountsGet)
    call_adsCreditsDiscountsGet
    ;;
    billingProfilesGet)
    call_billingProfilesGet
    ;;
    ssioAccountsGet)
    call_ssioAccountsGet
    ;;
    ssioInsertionOrderCreate)
    call_ssioInsertionOrderCreate
    ;;
    ssioInsertionOrderEdit)
    call_ssioInsertionOrderEdit
    ;;
    ssioInsertionOrdersStatusGetByAdAccount)
    call_ssioInsertionOrdersStatusGetByAdAccount
    ;;
    ssioInsertionOrdersStatusGetByPinOrderId)
    call_ssioInsertionOrdersStatusGetByPinOrderId
    ;;
    ssioOrderLinesGetByAdAccount)
    call_ssioOrderLinesGetByAdAccount
    ;;
    boardSectionsCreate)
    call_boardSectionsCreate
    ;;
    boardSectionsDelete)
    call_boardSectionsDelete
    ;;
    boardSectionsList)
    call_boardSectionsList
    ;;
    boardSectionsListPins)
    call_boardSectionsListPins
    ;;
    boardSectionsUpdate)
    call_boardSectionsUpdate
    ;;
    boardsCreate)
    call_boardsCreate
    ;;
    boardsDelete)
    call_boardsDelete
    ;;
    boardsGet)
    call_boardsGet
    ;;
    boardsList)
    call_boardsList
    ;;
    boardsListPins)
    call_boardsListPins
    ;;
    boardsUpdate)
    call_boardsUpdate
    ;;
    bulkDownloadCreate)
    call_bulkDownloadCreate
    ;;
    bulkRequestGet)
    call_bulkRequestGet
    ;;
    bulkUpsertCreate)
    call_bulkUpsertCreate
    ;;
    campaignTargetingAnalyticsGet)
    call_campaignTargetingAnalyticsGet
    ;;
    campaignsAnalytics)
    call_campaignsAnalytics
    ;;
    campaignsCreate)
    call_campaignsCreate
    ;;
    campaignsGet)
    call_campaignsGet
    ;;
    campaignsList)
    call_campaignsList
    ;;
    campaignsUpdate)
    call_campaignsUpdate
    ;;
    catalogsList)
    call_catalogsList
    ;;
    catalogsProductGroupPinsList)
    call_catalogsProductGroupPinsList
    ;;
    catalogsProductGroupsCreate)
    call_catalogsProductGroupsCreate
    ;;
    catalogsProductGroupsDelete)
    call_catalogsProductGroupsDelete
    ;;
    catalogsProductGroupsGet)
    call_catalogsProductGroupsGet
    ;;
    catalogsProductGroupsList)
    call_catalogsProductGroupsList
    ;;
    catalogsProductGroupsProductCountsGet)
    call_catalogsProductGroupsProductCountsGet
    ;;
    catalogsProductGroupsUpdate)
    call_catalogsProductGroupsUpdate
    ;;
    feedProcessingResultsList)
    call_feedProcessingResultsList
    ;;
    feedsCreate)
    call_feedsCreate
    ;;
    feedsDelete)
    call_feedsDelete
    ;;
    feedsGet)
    call_feedsGet
    ;;
    feedsList)
    call_feedsList
    ;;
    feedsUpdate)
    call_feedsUpdate
    ;;
    itemsBatchGet)
    call_itemsBatchGet
    ;;
    itemsBatchPost)
    call_itemsBatchPost
    ;;
    itemsGet)
    call_itemsGet
    ;;
    itemsIssuesList)
    call_itemsIssuesList
    ;;
    productsByProductGroupFilterList)
    call_productsByProductGroupFilterList
    ;;
    eventsCreate)
    call_eventsCreate
    ;;
    conversionTagsCreate)
    call_conversionTagsCreate
    ;;
    conversionTagsGet)
    call_conversionTagsGet
    ;;
    conversionTagsList)
    call_conversionTagsList
    ;;
    ocpmEligibleConversionTagsGet)
    call_ocpmEligibleConversionTagsGet
    ;;
    pageVisitConversionTagsGet)
    call_pageVisitConversionTagsGet
    ;;
    customerListsCreate)
    call_customerListsCreate
    ;;
    customerListsGet)
    call_customerListsGet
    ;;
    customerListsList)
    call_customerListsList
    ;;
    customerListsUpdate)
    call_customerListsUpdate
    ;;
    integrationsCommerceDel)
    call_integrationsCommerceDel
    ;;
    integrationsCommerceGet)
    call_integrationsCommerceGet
    ;;
    integrationsCommercePatch)
    call_integrationsCommercePatch
    ;;
    integrationsCommercePost)
    call_integrationsCommercePost
    ;;
    integrationsGetById)
    call_integrationsGetById
    ;;
    integrationsGetList)
    call_integrationsGetList
    ;;
    integrationsLogsPost)
    call_integrationsLogsPost
    ;;
    countryKeywordsMetricsGet)
    call_countryKeywordsMetricsGet
    ;;
    keywordsCreate)
    call_keywordsCreate
    ;;
    keywordsGet)
    call_keywordsGet
    ;;
    keywordsUpdate)
    call_keywordsUpdate
    ;;
    trendingKeywordsList)
    call_trendingKeywordsList
    ;;
    adAccountsSubscriptionsDelById)
    call_adAccountsSubscriptionsDelById
    ;;
    adAccountsSubscriptionsGetById)
    call_adAccountsSubscriptionsGetById
    ;;
    adAccountsSubscriptionsGetList)
    call_adAccountsSubscriptionsGetList
    ;;
    adAccountsSubscriptionsPost)
    call_adAccountsSubscriptionsPost
    ;;
    leadFormGet)
    call_leadFormGet
    ;;
    leadFormTestCreate)
    call_leadFormTestCreate
    ;;
    leadFormsList)
    call_leadFormsList
    ;;
    mediaCreate)
    call_mediaCreate
    ;;
    mediaGet)
    call_mediaGet
    ;;
    mediaList)
    call_mediaList
    ;;
    oauthToken)
    call_oauthToken
    ;;
    orderLinesGet)
    call_orderLinesGet
    ;;
    orderLinesList)
    call_orderLinesList
    ;;
    pinsAnalytics)
    call_pinsAnalytics
    ;;
    pinsCreate)
    call_pinsCreate
    ;;
    pinsDelete)
    call_pinsDelete
    ;;
    pinsGet)
    call_pinsGet
    ;;
    pinsList)
    call_pinsList
    ;;
    pinsSave)
    call_pinsSave
    ;;
    pinsUpdate)
    call_pinsUpdate
    ;;
    productGroupPromotionsCreate)
    call_productGroupPromotionsCreate
    ;;
    productGroupPromotionsGet)
    call_productGroupPromotionsGet
    ;;
    productGroupPromotionsList)
    call_productGroupPromotionsList
    ;;
    productGroupPromotionsUpdate)
    call_productGroupPromotionsUpdate
    ;;
    productGroupsAnalytics)
    call_productGroupsAnalytics
    ;;
    adAccountsCatalogsProductGroupsList)
    call_adAccountsCatalogsProductGroupsList
    ;;
    adAccountCountriesGet)
    call_adAccountCountriesGet
    ;;
    deliveryMetricsGet)
    call_deliveryMetricsGet
    ;;
    interestTargetingOptionsGet)
    call_interestTargetingOptionsGet
    ;;
    leadFormQuestionsGet)
    call_leadFormQuestionsGet
    ;;
    metricsReadyStateGet)
    call_metricsReadyStateGet
    ;;
    targetingOptionsGet)
    call_targetingOptionsGet
    ;;
    searchPartnerPins)
    call_searchPartnerPins
    ;;
    searchUserBoardsGet)
    call_searchUserBoardsGet
    ;;
    searchUserPinsList)
    call_searchUserPinsList
    ;;
    termsRelatedList)
    call_termsRelatedList
    ;;
    termsSuggestedList)
    call_termsSuggestedList
    ;;
    termsOfServiceGet)
    call_termsOfServiceGet
    ;;
    boardsUserFollowsList)
    call_boardsUserFollowsList
    ;;
    followUserUpdate)
    call_followUserUpdate
    ;;
    followersList)
    call_followersList
    ;;
    linkedBusinessAccountsGet)
    call_linkedBusinessAccountsGet
    ;;
    unverifyWebsiteDelete)
    call_unverifyWebsiteDelete
    ;;
    userAccountAnalytics)
    call_userAccountAnalytics
    ;;
    userAccountAnalyticsTopPins)
    call_userAccountAnalyticsTopPins
    ;;
    userAccountAnalyticsTopVideoPins)
    call_userAccountAnalyticsTopVideoPins
    ;;
    userAccountFollowedInterests)
    call_userAccountFollowedInterests
    ;;
    userAccountGet)
    call_userAccountGet
    ;;
    userFollowingGet)
    call_userFollowingGet
    ;;
    userWebsitesGet)
    call_userWebsitesGet
    ;;
    verifyWebsiteUpdate)
    call_verifyWebsiteUpdate
    ;;
    websiteVerificationGet)
    call_websiteVerificationGet
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
