#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for Pinterest REST API.
#
# LICENSE:
# https://spdx.org/licenses/MIT
#
# CONTACT:
# pinterest-api@pinterest.com
#
# MORE INFORMATION:
# https://developers.pinterest.com/
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
operation_parameters_minimum_occurrences["adAccountsList:::bookmark"]=0
operation_parameters_minimum_occurrences["adAccountsList:::page_size"]=0
operation_parameters_minimum_occurrences["adAccountsList:::include_shared_accounts"]=0
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
operation_parameters_minimum_occurrences["adGroupsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adGroupsList:::campaign_ids"]=0
operation_parameters_minimum_occurrences["adGroupsList:::ad_group_ids"]=0
operation_parameters_minimum_occurrences["adGroupsList:::entity_statuses"]=0
operation_parameters_minimum_occurrences["adGroupsList:::page_size"]=0
operation_parameters_minimum_occurrences["adGroupsList:::order"]=0
operation_parameters_minimum_occurrences["adGroupsList:::bookmark"]=0
operation_parameters_minimum_occurrences["adGroupsList:::translate_interests_to_names"]=0
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
operation_parameters_minimum_occurrences["adsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["adsList:::campaign_ids"]=0
operation_parameters_minimum_occurrences["adsList:::ad_group_ids"]=0
operation_parameters_minimum_occurrences["adsList:::ad_ids"]=0
operation_parameters_minimum_occurrences["adsList:::entity_statuses"]=0
operation_parameters_minimum_occurrences["adsList:::page_size"]=0
operation_parameters_minimum_occurrences["adsList:::order"]=0
operation_parameters_minimum_occurrences["adsList:::bookmark"]=0
operation_parameters_minimum_occurrences["analyticsCreateReport:::ad_account_id"]=1
operation_parameters_minimum_occurrences["analyticsCreateReport:::AdsAnalyticsCreateAsyncRequest"]=1
operation_parameters_minimum_occurrences["analyticsGetReport:::ad_account_id"]=1
operation_parameters_minimum_occurrences["analyticsGetReport:::token"]=1
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
operation_parameters_minimum_occurrences["campaignsList:::ad_account_id"]=1
operation_parameters_minimum_occurrences["campaignsList:::campaign_ids"]=0
operation_parameters_minimum_occurrences["campaignsList:::entity_statuses"]=0
operation_parameters_minimum_occurrences["campaignsList:::page_size"]=0
operation_parameters_minimum_occurrences["campaignsList:::order"]=0
operation_parameters_minimum_occurrences["campaignsList:::bookmark"]=0
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
operation_parameters_minimum_occurrences["boardSectionsCreate:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsCreate:::BoardSection"]=1
operation_parameters_minimum_occurrences["boardSectionsDelete:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsDelete:::section_id"]=1
operation_parameters_minimum_occurrences["boardSectionsList:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsList:::bookmark"]=0
operation_parameters_minimum_occurrences["boardSectionsList:::page_size"]=0
operation_parameters_minimum_occurrences["boardSectionsListPins:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsListPins:::section_id"]=1
operation_parameters_minimum_occurrences["boardSectionsListPins:::bookmark"]=0
operation_parameters_minimum_occurrences["boardSectionsListPins:::page_size"]=0
operation_parameters_minimum_occurrences["boardSectionsUpdate:::board_id"]=1
operation_parameters_minimum_occurrences["boardSectionsUpdate:::section_id"]=1
operation_parameters_minimum_occurrences["boardSectionsUpdate:::BoardSection"]=1
operation_parameters_minimum_occurrences["boardsCreate:::Board"]=1
operation_parameters_minimum_occurrences["boardsDelete:::board_id"]=1
operation_parameters_minimum_occurrences["boardsGet:::board_id"]=1
operation_parameters_minimum_occurrences["boardsList:::bookmark"]=0
operation_parameters_minimum_occurrences["boardsList:::page_size"]=0
operation_parameters_minimum_occurrences["boardsList:::privacy"]=0
operation_parameters_minimum_occurrences["boardsListPins:::board_id"]=1
operation_parameters_minimum_occurrences["boardsListPins:::bookmark"]=0
operation_parameters_minimum_occurrences["boardsListPins:::page_size"]=0
operation_parameters_minimum_occurrences["boardsUpdate:::board_id"]=1
operation_parameters_minimum_occurrences["boardsUpdate:::BoardUpdate"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsCreate:::CatalogsProductGroupCreateRequest"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsDelete:::product_group_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::feed_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::bookmark"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsList:::page_size"]=0
operation_parameters_minimum_occurrences["catalogsProductGroupsUpdate:::product_group_id"]=1
operation_parameters_minimum_occurrences["catalogsProductGroupsUpdate:::CatalogsProductGroupUpdateRequest"]=1
operation_parameters_minimum_occurrences["feedProcessingResultsList:::feed_id"]=1
operation_parameters_minimum_occurrences["feedProcessingResultsList:::bookmark"]=0
operation_parameters_minimum_occurrences["feedProcessingResultsList:::page_size"]=0
operation_parameters_minimum_occurrences["feedsCreate:::CatalogsFeedsCreateRequest"]=1
operation_parameters_minimum_occurrences["feedsDelete:::feed_id"]=1
operation_parameters_minimum_occurrences["feedsGet:::feed_id"]=1
operation_parameters_minimum_occurrences["feedsList:::bookmark"]=0
operation_parameters_minimum_occurrences["feedsList:::page_size"]=0
operation_parameters_minimum_occurrences["feedsUpdate:::feed_id"]=1
operation_parameters_minimum_occurrences["feedsUpdate:::CatalogsFeedsUpdateRequest"]=1
operation_parameters_minimum_occurrences["itemsBatchGet:::batch_id"]=1
operation_parameters_minimum_occurrences["itemsBatchPost:::CatalogsItemsBatchRequest"]=1
operation_parameters_minimum_occurrences["itemsGet:::country"]=1
operation_parameters_minimum_occurrences["itemsGet:::item_ids"]=1
operation_parameters_minimum_occurrences["itemsGet:::language"]=1
operation_parameters_minimum_occurrences["mediaCreate:::MediaUploadRequest"]=1
operation_parameters_minimum_occurrences["mediaGet:::media_id"]=1
operation_parameters_minimum_occurrences["mediaList:::bookmark"]=0
operation_parameters_minimum_occurrences["mediaList:::page_size"]=0
operation_parameters_minimum_occurrences["oauthToken:::grant_type"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::metric_types"]=1
operation_parameters_minimum_occurrences["pinsAnalytics:::app_types"]=0
operation_parameters_minimum_occurrences["pinsAnalytics:::split_field"]=0
operation_parameters_minimum_occurrences["pinsAnalytics:::ad_account_id"]=0
operation_parameters_minimum_occurrences["pinsCreate:::Pin"]=1
operation_parameters_minimum_occurrences["pinsDelete:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsGet:::pin_id"]=1
operation_parameters_minimum_occurrences["pinsGet:::ad_account_id"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::start_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalytics:::end_date"]=1
operation_parameters_minimum_occurrences["userAccountAnalytics:::from_claimed_content"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::pin_format"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::app_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::metric_types"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::split_field"]=0
operation_parameters_minimum_occurrences["userAccountAnalytics:::ad_account_id"]=0
operation_parameters_minimum_occurrences["userAccountGet:::ad_account_id"]=0

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
operation_parameters_maximum_occurrences["adAccountsList:::bookmark"]=0
operation_parameters_maximum_occurrences["adAccountsList:::page_size"]=0
operation_parameters_maximum_occurrences["adAccountsList:::include_shared_accounts"]=0
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
operation_parameters_maximum_occurrences["adGroupsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adGroupsList:::campaign_ids"]=0
operation_parameters_maximum_occurrences["adGroupsList:::ad_group_ids"]=0
operation_parameters_maximum_occurrences["adGroupsList:::entity_statuses"]=0
operation_parameters_maximum_occurrences["adGroupsList:::page_size"]=0
operation_parameters_maximum_occurrences["adGroupsList:::order"]=0
operation_parameters_maximum_occurrences["adGroupsList:::bookmark"]=0
operation_parameters_maximum_occurrences["adGroupsList:::translate_interests_to_names"]=0
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
operation_parameters_maximum_occurrences["adsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["adsList:::campaign_ids"]=0
operation_parameters_maximum_occurrences["adsList:::ad_group_ids"]=0
operation_parameters_maximum_occurrences["adsList:::ad_ids"]=0
operation_parameters_maximum_occurrences["adsList:::entity_statuses"]=0
operation_parameters_maximum_occurrences["adsList:::page_size"]=0
operation_parameters_maximum_occurrences["adsList:::order"]=0
operation_parameters_maximum_occurrences["adsList:::bookmark"]=0
operation_parameters_maximum_occurrences["analyticsCreateReport:::ad_account_id"]=0
operation_parameters_maximum_occurrences["analyticsCreateReport:::AdsAnalyticsCreateAsyncRequest"]=0
operation_parameters_maximum_occurrences["analyticsGetReport:::ad_account_id"]=0
operation_parameters_maximum_occurrences["analyticsGetReport:::token"]=0
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
operation_parameters_maximum_occurrences["campaignsList:::ad_account_id"]=0
operation_parameters_maximum_occurrences["campaignsList:::campaign_ids"]=0
operation_parameters_maximum_occurrences["campaignsList:::entity_statuses"]=0
operation_parameters_maximum_occurrences["campaignsList:::page_size"]=0
operation_parameters_maximum_occurrences["campaignsList:::order"]=0
operation_parameters_maximum_occurrences["campaignsList:::bookmark"]=0
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
operation_parameters_maximum_occurrences["boardSectionsCreate:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsCreate:::BoardSection"]=0
operation_parameters_maximum_occurrences["boardSectionsDelete:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsDelete:::section_id"]=0
operation_parameters_maximum_occurrences["boardSectionsList:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsList:::bookmark"]=0
operation_parameters_maximum_occurrences["boardSectionsList:::page_size"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::section_id"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::bookmark"]=0
operation_parameters_maximum_occurrences["boardSectionsListPins:::page_size"]=0
operation_parameters_maximum_occurrences["boardSectionsUpdate:::board_id"]=0
operation_parameters_maximum_occurrences["boardSectionsUpdate:::section_id"]=0
operation_parameters_maximum_occurrences["boardSectionsUpdate:::BoardSection"]=0
operation_parameters_maximum_occurrences["boardsCreate:::Board"]=0
operation_parameters_maximum_occurrences["boardsDelete:::board_id"]=0
operation_parameters_maximum_occurrences["boardsGet:::board_id"]=0
operation_parameters_maximum_occurrences["boardsList:::bookmark"]=0
operation_parameters_maximum_occurrences["boardsList:::page_size"]=0
operation_parameters_maximum_occurrences["boardsList:::privacy"]=0
operation_parameters_maximum_occurrences["boardsListPins:::board_id"]=0
operation_parameters_maximum_occurrences["boardsListPins:::bookmark"]=0
operation_parameters_maximum_occurrences["boardsListPins:::page_size"]=0
operation_parameters_maximum_occurrences["boardsUpdate:::board_id"]=0
operation_parameters_maximum_occurrences["boardsUpdate:::BoardUpdate"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsCreate:::CatalogsProductGroupCreateRequest"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsDelete:::product_group_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::feed_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::bookmark"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsList:::page_size"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsUpdate:::product_group_id"]=0
operation_parameters_maximum_occurrences["catalogsProductGroupsUpdate:::CatalogsProductGroupUpdateRequest"]=0
operation_parameters_maximum_occurrences["feedProcessingResultsList:::feed_id"]=0
operation_parameters_maximum_occurrences["feedProcessingResultsList:::bookmark"]=0
operation_parameters_maximum_occurrences["feedProcessingResultsList:::page_size"]=0
operation_parameters_maximum_occurrences["feedsCreate:::CatalogsFeedsCreateRequest"]=0
operation_parameters_maximum_occurrences["feedsDelete:::feed_id"]=0
operation_parameters_maximum_occurrences["feedsGet:::feed_id"]=0
operation_parameters_maximum_occurrences["feedsList:::bookmark"]=0
operation_parameters_maximum_occurrences["feedsList:::page_size"]=0
operation_parameters_maximum_occurrences["feedsUpdate:::feed_id"]=0
operation_parameters_maximum_occurrences["feedsUpdate:::CatalogsFeedsUpdateRequest"]=0
operation_parameters_maximum_occurrences["itemsBatchGet:::batch_id"]=0
operation_parameters_maximum_occurrences["itemsBatchPost:::CatalogsItemsBatchRequest"]=0
operation_parameters_maximum_occurrences["itemsGet:::country"]=0
operation_parameters_maximum_occurrences["itemsGet:::item_ids"]=0
operation_parameters_maximum_occurrences["itemsGet:::language"]=0
operation_parameters_maximum_occurrences["mediaCreate:::MediaUploadRequest"]=0
operation_parameters_maximum_occurrences["mediaGet:::media_id"]=0
operation_parameters_maximum_occurrences["mediaList:::bookmark"]=0
operation_parameters_maximum_occurrences["mediaList:::page_size"]=0
operation_parameters_maximum_occurrences["oauthToken:::grant_type"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::metric_types"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::app_types"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::split_field"]=0
operation_parameters_maximum_occurrences["pinsAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["pinsCreate:::Pin"]=0
operation_parameters_maximum_occurrences["pinsDelete:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsGet:::pin_id"]=0
operation_parameters_maximum_occurrences["pinsGet:::ad_account_id"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::start_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::end_date"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::from_claimed_content"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::pin_format"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::app_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::metric_types"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::split_field"]=0
operation_parameters_maximum_occurrences["userAccountAnalytics:::ad_account_id"]=0
operation_parameters_maximum_occurrences["userAccountGet:::ad_account_id"]=0

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
operation_parameters_collection_type["adAccountsList:::bookmark"]=""
operation_parameters_collection_type["adAccountsList:::page_size"]=""
operation_parameters_collection_type["adAccountsList:::include_shared_accounts"]=""
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
operation_parameters_collection_type["adGroupsList:::ad_account_id"]=""
operation_parameters_collection_type["adGroupsList:::campaign_ids"]="multi"
operation_parameters_collection_type["adGroupsList:::ad_group_ids"]="multi"
operation_parameters_collection_type["adGroupsList:::entity_statuses"]="multi"
operation_parameters_collection_type["adGroupsList:::page_size"]=""
operation_parameters_collection_type["adGroupsList:::order"]=""
operation_parameters_collection_type["adGroupsList:::bookmark"]=""
operation_parameters_collection_type["adGroupsList:::translate_interests_to_names"]=""
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
operation_parameters_collection_type["adsList:::ad_account_id"]=""
operation_parameters_collection_type["adsList:::campaign_ids"]="multi"
operation_parameters_collection_type["adsList:::ad_group_ids"]="multi"
operation_parameters_collection_type["adsList:::ad_ids"]="multi"
operation_parameters_collection_type["adsList:::entity_statuses"]="multi"
operation_parameters_collection_type["adsList:::page_size"]=""
operation_parameters_collection_type["adsList:::order"]=""
operation_parameters_collection_type["adsList:::bookmark"]=""
operation_parameters_collection_type["analyticsCreateReport:::ad_account_id"]=""
operation_parameters_collection_type["analyticsCreateReport:::AdsAnalyticsCreateAsyncRequest"]=""
operation_parameters_collection_type["analyticsGetReport:::ad_account_id"]=""
operation_parameters_collection_type["analyticsGetReport:::token"]=""
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
operation_parameters_collection_type["campaignsList:::ad_account_id"]=""
operation_parameters_collection_type["campaignsList:::campaign_ids"]="multi"
operation_parameters_collection_type["campaignsList:::entity_statuses"]="multi"
operation_parameters_collection_type["campaignsList:::page_size"]=""
operation_parameters_collection_type["campaignsList:::order"]=""
operation_parameters_collection_type["campaignsList:::bookmark"]=""
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
operation_parameters_collection_type["boardSectionsCreate:::board_id"]=""
operation_parameters_collection_type["boardSectionsCreate:::BoardSection"]=""
operation_parameters_collection_type["boardSectionsDelete:::board_id"]=""
operation_parameters_collection_type["boardSectionsDelete:::section_id"]=""
operation_parameters_collection_type["boardSectionsList:::board_id"]=""
operation_parameters_collection_type["boardSectionsList:::bookmark"]=""
operation_parameters_collection_type["boardSectionsList:::page_size"]=""
operation_parameters_collection_type["boardSectionsListPins:::board_id"]=""
operation_parameters_collection_type["boardSectionsListPins:::section_id"]=""
operation_parameters_collection_type["boardSectionsListPins:::bookmark"]=""
operation_parameters_collection_type["boardSectionsListPins:::page_size"]=""
operation_parameters_collection_type["boardSectionsUpdate:::board_id"]=""
operation_parameters_collection_type["boardSectionsUpdate:::section_id"]=""
operation_parameters_collection_type["boardSectionsUpdate:::BoardSection"]=""
operation_parameters_collection_type["boardsCreate:::Board"]=""
operation_parameters_collection_type["boardsDelete:::board_id"]=""
operation_parameters_collection_type["boardsGet:::board_id"]=""
operation_parameters_collection_type["boardsList:::bookmark"]=""
operation_parameters_collection_type["boardsList:::page_size"]=""
operation_parameters_collection_type["boardsList:::privacy"]=""
operation_parameters_collection_type["boardsListPins:::board_id"]=""
operation_parameters_collection_type["boardsListPins:::bookmark"]=""
operation_parameters_collection_type["boardsListPins:::page_size"]=""
operation_parameters_collection_type["boardsUpdate:::board_id"]=""
operation_parameters_collection_type["boardsUpdate:::BoardUpdate"]=""
operation_parameters_collection_type["catalogsProductGroupsCreate:::CatalogsProductGroupCreateRequest"]=""
operation_parameters_collection_type["catalogsProductGroupsDelete:::product_group_id"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::feed_id"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::bookmark"]=""
operation_parameters_collection_type["catalogsProductGroupsList:::page_size"]=""
operation_parameters_collection_type["catalogsProductGroupsUpdate:::product_group_id"]=""
operation_parameters_collection_type["catalogsProductGroupsUpdate:::CatalogsProductGroupUpdateRequest"]=""
operation_parameters_collection_type["feedProcessingResultsList:::feed_id"]=""
operation_parameters_collection_type["feedProcessingResultsList:::bookmark"]=""
operation_parameters_collection_type["feedProcessingResultsList:::page_size"]=""
operation_parameters_collection_type["feedsCreate:::CatalogsFeedsCreateRequest"]=""
operation_parameters_collection_type["feedsDelete:::feed_id"]=""
operation_parameters_collection_type["feedsGet:::feed_id"]=""
operation_parameters_collection_type["feedsList:::bookmark"]=""
operation_parameters_collection_type["feedsList:::page_size"]=""
operation_parameters_collection_type["feedsUpdate:::feed_id"]=""
operation_parameters_collection_type["feedsUpdate:::CatalogsFeedsUpdateRequest"]=""
operation_parameters_collection_type["itemsBatchGet:::batch_id"]=""
operation_parameters_collection_type["itemsBatchPost:::CatalogsItemsBatchRequest"]=""
operation_parameters_collection_type["itemsGet:::country"]=""
operation_parameters_collection_type["itemsGet:::item_ids"]="multi"
operation_parameters_collection_type["itemsGet:::language"]=""
operation_parameters_collection_type["mediaCreate:::MediaUploadRequest"]=""
operation_parameters_collection_type["mediaGet:::media_id"]=""
operation_parameters_collection_type["mediaList:::bookmark"]=""
operation_parameters_collection_type["mediaList:::page_size"]=""
operation_parameters_collection_type["oauthToken:::grant_type"]=""
operation_parameters_collection_type["pinsAnalytics:::pin_id"]=""
operation_parameters_collection_type["pinsAnalytics:::start_date"]=""
operation_parameters_collection_type["pinsAnalytics:::end_date"]=""
operation_parameters_collection_type["pinsAnalytics:::metric_types"]="csv"
operation_parameters_collection_type["pinsAnalytics:::app_types"]=""
operation_parameters_collection_type["pinsAnalytics:::split_field"]=""
operation_parameters_collection_type["pinsAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["pinsCreate:::Pin"]=""
operation_parameters_collection_type["pinsDelete:::pin_id"]=""
operation_parameters_collection_type["pinsGet:::pin_id"]=""
operation_parameters_collection_type["pinsGet:::ad_account_id"]=""
operation_parameters_collection_type["userAccountAnalytics:::start_date"]=""
operation_parameters_collection_type["userAccountAnalytics:::end_date"]=""
operation_parameters_collection_type["userAccountAnalytics:::from_claimed_content"]=""
operation_parameters_collection_type["userAccountAnalytics:::pin_format"]=""
operation_parameters_collection_type["userAccountAnalytics:::app_types"]=""
operation_parameters_collection_type["userAccountAnalytics:::metric_types"]="csv"
operation_parameters_collection_type["userAccountAnalytics:::split_field"]=""
operation_parameters_collection_type["userAccountAnalytics:::ad_account_id"]=""
operation_parameters_collection_type["userAccountGet:::ad_account_id"]=""


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

${BOLD}${WHITE}Pinterest REST API command line client (API version 5.3.0)${OFF}

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
    echo -e "  - ${BLUE}Basic AUTH${OFF} - add '-u <username>:<password>' before ${YELLOW}<operation>${OFF}"
    
    echo -e "  - ${MAGENTA}OAuth2 (flow: accessCode)${OFF}"
    echo -e "      Authorization URL: "
    echo -e "        * https://www.pinterest.com/oauth/"
    echo -e "      Token URL: "
    echo -e "        * https://api.pinterest.com/v5/oauth/token"
    echo -e "      Scopes:"
    echo -e "        * ads:read - See all of your advertising data, including ads, ad groups, campaigns etc."
    echo -e "        * ads:write - Create, update, or delete ads, ad groups, campaigns etc."
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
    echo -e "        * user_accounts:read - See your user accounts"
    echo ""
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[adAccounts]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adAccountAnalytics${OFF};Get ad account analytics (AUTH)
  ${CYAN}adAccountsList${OFF};List ad accounts (AUTH)
  ${CYAN}adGroupsAnalytics${OFF};Get ad group analytics (AUTH)
  ${CYAN}adGroupsList${OFF};List ad groups (AUTH)
  ${CYAN}adsAnalytics${OFF};Get ad analytics (AUTH)
  ${CYAN}adsList${OFF};List ads (AUTH)
  ${CYAN}analyticsCreateReport${OFF};Create async request for an account analytics report (AUTH)
  ${CYAN}analyticsGetReport${OFF};Get the account analytics report created by the async call (AUTH)
  ${CYAN}campaignsAnalytics${OFF};Get campaign analytics (AUTH)
  ${CYAN}campaignsList${OFF};List campaigns (AUTH)
  ${CYAN}productGroupsAnalytics${OFF};Get product group analytics (AUTH)
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
    echo -e "${BOLD}${WHITE}[catalogs]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}catalogsProductGroupsCreate${OFF};Create product group (AUTH)
  ${CYAN}catalogsProductGroupsDelete${OFF};Delete product group (AUTH)
  ${CYAN}catalogsProductGroupsList${OFF};Get product groups list (AUTH)
  ${CYAN}catalogsProductGroupsUpdate${OFF};Update product group (AUTH)
  ${CYAN}feedProcessingResultsList${OFF};List processing results for a given feed (AUTH)
  ${CYAN}feedsCreate${OFF};Create feed (AUTH)
  ${CYAN}feedsDelete${OFF};Delete feed (AUTH)
  ${CYAN}feedsGet${OFF};Get feed (AUTH)
  ${CYAN}feedsList${OFF};List feeds (AUTH)
  ${CYAN}feedsUpdate${OFF};Update feed (AUTH)
  ${CYAN}itemsBatchGet${OFF};Get catalogs items batch (AUTH)
  ${CYAN}itemsBatchPost${OFF};Perform an operation on an item batch (AUTH)
  ${CYAN}itemsGet${OFF};Get catalogs items (AUTH)
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
  ${CYAN}oauthToken${OFF};Generate OAuth access token
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[pins]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}pinsAnalytics${OFF};Get Pin analytics (AUTH)
  ${CYAN}pinsCreate${OFF};Create Pin (AUTH)
  ${CYAN}pinsDelete${OFF};Delete Pin (AUTH)
  ${CYAN}pinsGet${OFF};Get Pin (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[userAccount]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}userAccountAnalytics${OFF};Get user account analytics (AUTH)
  ${CYAN}userAccountGet${OFF};Get user account (AUTH)
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
    echo -e "${BOLD}${WHITE}Pinterest REST API command line client (API version 5.3.0)${OFF}"
    echo ""
    echo -e "License: MIT"
    echo -e "Contact: pinterest-api@pinterest.com"
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
    echo -e "${BOLD}Pinterest REST API command line client (API version 5.3.0)${OFF}"
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
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Granularity${YELLOW} Specify as: granularity=value${OFF}" \
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
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
# Print help for adGroupsAnalytics operation
#
##############################################################################
print_adGroupsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsAnalytics - Get ad group analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Ad group Ids to use to filter the results.${YELLOW} Specify as: ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Granularity${YELLOW} Specify as: granularity=value${OFF}" \
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
# Print help for adGroupsList operation
#
##############################################################################
print_adGroupsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adGroupsList - List ad groups${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Ad group Ids to use to filter the results.${YELLOW} Specify as: ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}entity_statuses${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Entity status${YELLOW} Specify as: entity_statuses=value1 entity_statuses=value2 entity_statuses=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
# Print help for adsAnalytics operation
#
##############################################################################
print_adsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsAnalytics - Get ad analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Ad Ids to use to filter the results.${YELLOW} Specify as: ad_ids=value1 ad_ids=value2 ad_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Granularity${YELLOW} Specify as: granularity=value${OFF}" \
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
# Print help for adsList operation
#
##############################################################################
print_adsList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adsList - List ads${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Ad group Ids to use to filter the results.${YELLOW} Specify as: ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}ad_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - List of Ad Ids to use to filter the results.${YELLOW} Specify as: ad_ids=value1 ad_ids=value2 ad_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}entity_statuses${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Entity status${YELLOW} Specify as: entity_statuses=value1 entity_statuses=value2 entity_statuses=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
# Print help for analyticsCreateReport operation
#
##############################################################################
print_analyticsCreateReport_help() {
    echo ""
    echo -e "${BOLD}${WHITE}analyticsCreateReport - Create async request for an account analytics report${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
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
# Print help for analyticsGetReport operation
#
##############################################################################
print_analyticsGetReport_help() {
    echo ""
    echo -e "${BOLD}${WHITE}analyticsGetReport - Get the account analytics report created by the async call${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour.
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
# Print help for campaignsAnalytics operation
#
##############################################################################
print_campaignsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}campaignsAnalytics - Get campaign analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}campaign_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Campaign Ids to use to filter the results.${YELLOW} Specify as: campaign_ids=value1 campaign_ids=value2 campaign_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Granularity${YELLOW} Specify as: granularity=value${OFF}" \
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
    echo -e "  * ${GREEN}entity_statuses${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Entity status${YELLOW} Specify as: entity_statuses=value1 entity_statuses=value2 entity_statuses=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
# Print help for productGroupsAnalytics operation
#
##############################################################################
print_productGroupsAnalytics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}productGroupsAnalytics - Get product group analytics${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ad_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of an ad account. ${YELLOW}Specify as: ad_account_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}product_group_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of Product group Ids to use to filter the results.${YELLOW} Specify as: product_group_ids=value1 product_group_ids=value2 product_group_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}columns${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned${YELLOW} Specify as: columns="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}granularity${OFF} ${BLUE}[Granularity]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Granularity${YELLOW} Specify as: granularity=value${OFF}" \
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
# Print help for boardSectionsCreate operation
#
##############################################################################
print_boardSectionsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}boardSectionsCreate - Create board section${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}section_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board section. ${YELLOW}Specify as: section_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}section_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board section. ${YELLOW}Specify as: section_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}section_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board section. ${YELLOW}Specify as: section_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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

Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return.
- If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
    echo -e "Update a board owned by the \"operating user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}board_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a board. ${YELLOW}Specify as: board_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
# Print help for catalogsProductGroupsCreate operation
#
##############################################################################
print_catalogsProductGroupsCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}catalogsProductGroupsCreate - Create product group${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Create product group to use in Catalogs." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
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
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for feed mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Delete a product group from being in use in Catalogs." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}product_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group ${YELLOW}Specify as: product_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=204
    echo -e "${result_color_table[${code:0:1}]}  204;Catalogs Product Group deleted successfully.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Invalid catalogs product group id parameters.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized access.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for feed mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Catalogs product group not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't delete this catalogs product group.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
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
    echo -e "${BOLD}${WHITE}catalogsProductGroupsList - Get product groups list${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Get a list of product groups for a given Catalogs Feed Id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed${YELLOW} Specify as: feed_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden. Account not approved for feed mutations yet.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Data feed not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=409
    echo -e "${result_color_table[${code:0:1}]}  409;Conflict. Can't create this catalogs product group with this value.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Update product group to use in Catalogs." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}product_group_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a product group ${YELLOW}Specify as: product_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Fetch a feed processing results owned by the owner user account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Create a new feed owned by the \"operating user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Delete a feed owned by the \"operating user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Get a single feed owned by the \"operating user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Fetch feeds owned by the \"operating user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Update a feed owned by the \"operating user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}feed_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a feed ${YELLOW}Specify as: feed_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
    echo -e "${BOLD}${WHITE}itemsBatchGet - Get catalogs items batch${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Get a single catalogs items batch created by the \"operating user_account\"." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}batch_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Id of a catalogs items batch to fetch ${YELLOW}Specify as: batch_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Response containing the requested catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Not authorized to access catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Catalogs items batch not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
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
    echo -e "${BOLD}${WHITE}itemsBatchPost - Perform an operation on an item batch${OFF}${BLUE}(AUTH - OAuth2)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

This endpoint supports multiple operations on a set of one or more catalog items." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Request object used to create catalogs items in a batch" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Response containing the requested catalogs items batch${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Not authorized to post catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
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
    echo -e "Get the items of the catalog created by the \"operating user_account\"" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}country${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Country for the Catalogs Items${YELLOW} Specify as: country=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}item_ids${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Catalos Item ids${YELLOW} Specify as: item_ids=value1 item_ids=value2 item_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}language${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Language for the Catalogs Items${YELLOW} Specify as: language=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Response containing the requested catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Not authorized to access catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access catalogs items${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
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

<strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
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

<strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
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

<strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bookmark${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Cursor used to fetch the next page of items${YELLOW} Specify as: bookmark=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page_size${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 25)${OFF} - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.${YELLOW} Specify as: page_size=value${OFF}" \
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
    echo -e "${BOLD}${WHITE}oauthToken - Generate OAuth access token${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Generate an OAuth access token by using an authorization code or a refresh token.

See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more." | paste -sd' ' | fold -sw 80
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
- For Pins on secret boards: Admin." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pin_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a Pin. ${YELLOW}Specify as: pin_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}metric_types${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Pin metric types to get data for, default is all.${YELLOW} Specify as: metric_types="value1,value2,..."${OFF}" \
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

- This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.

<strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
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
- By default, the \"operation user_account\" is the token user_account." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pin_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Unique identifier of a Pin. ${YELLOW}Specify as: pin_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
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
    echo -e "  * ${GREEN}start_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report start date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: start_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Metric report end date (UTC). Format: YYYY-MM-DD${YELLOW} Specify as: end_date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}from_claimed_content${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: BOTH)${OFF} - Filter on Pins that match your claimed domain.${YELLOW} Specify as: from_claimed_content=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pin_format${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Pin formats to get data for, default is all.${YELLOW} Specify as: pin_format=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}app_types${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: ALL)${OFF} - Apps or devices to get data for, default is all.${YELLOW} Specify as: app_types=value${OFF}" \
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
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Not authorized to access the user account analytics.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
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

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information." | paste -sd' ' | fold -sw 80
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
# Call boardSectionsCreate operation
#
##############################################################################
call_boardSectionsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(board_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(bookmark page_size  )
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
    local query_parameter_names=(bookmark page_size  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(bookmark page_size privacy  )
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
    local query_parameter_names=(bookmark page_size  )
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
    local query_parameter_names=(  )
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
# Call catalogsProductGroupsCreate operation
#
##############################################################################
call_catalogsProductGroupsCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
# Call catalogsProductGroupsList operation
#
##############################################################################
call_catalogsProductGroupsList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(feed_id bookmark page_size  )
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
# Call catalogsProductGroupsUpdate operation
#
##############################################################################
call_catalogsProductGroupsUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(product_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
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
    local query_parameter_names=(bookmark page_size  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(bookmark page_size  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(country item_ids language  )
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
    local query_parameter_names=()
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(  )
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
    local query_parameter_names=(ad_account_id  )
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
# Call userAccountAnalytics operation
#
##############################################################################
call_userAccountAnalytics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_date end_date from_claimed_content pin_format app_types metric_types split_field ad_account_id  )
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
    adAccountsList)
    operation="adAccountsList"
    ;;
    adGroupsAnalytics)
    operation="adGroupsAnalytics"
    ;;
    adGroupsList)
    operation="adGroupsList"
    ;;
    adsAnalytics)
    operation="adsAnalytics"
    ;;
    adsList)
    operation="adsList"
    ;;
    analyticsCreateReport)
    operation="analyticsCreateReport"
    ;;
    analyticsGetReport)
    operation="analyticsGetReport"
    ;;
    campaignsAnalytics)
    operation="campaignsAnalytics"
    ;;
    campaignsList)
    operation="campaignsList"
    ;;
    productGroupsAnalytics)
    operation="productGroupsAnalytics"
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
    catalogsProductGroupsCreate)
    operation="catalogsProductGroupsCreate"
    ;;
    catalogsProductGroupsDelete)
    operation="catalogsProductGroupsDelete"
    ;;
    catalogsProductGroupsList)
    operation="catalogsProductGroupsList"
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
    userAccountAnalytics)
    operation="userAccountAnalytics"
    ;;
    userAccountGet)
    operation="userAccountGet"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
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
    adAccountsList)
    call_adAccountsList
    ;;
    adGroupsAnalytics)
    call_adGroupsAnalytics
    ;;
    adGroupsList)
    call_adGroupsList
    ;;
    adsAnalytics)
    call_adsAnalytics
    ;;
    adsList)
    call_adsList
    ;;
    analyticsCreateReport)
    call_analyticsCreateReport
    ;;
    analyticsGetReport)
    call_analyticsGetReport
    ;;
    campaignsAnalytics)
    call_campaignsAnalytics
    ;;
    campaignsList)
    call_campaignsList
    ;;
    productGroupsAnalytics)
    call_productGroupsAnalytics
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
    catalogsProductGroupsCreate)
    call_catalogsProductGroupsCreate
    ;;
    catalogsProductGroupsDelete)
    call_catalogsProductGroupsDelete
    ;;
    catalogsProductGroupsList)
    call_catalogsProductGroupsList
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
    userAccountAnalytics)
    call_userAccountAnalytics
    ;;
    userAccountGet)
    call_userAccountGet
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
