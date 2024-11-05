#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/pin.h"
#include "../model/pin_analytics_metrics_response.h"
#include "../model/pin_create.h"
#include "../model/pin_update.h"
#include "../model/pins_analytics_metric_types_parameter_inner.h"
#include "../model/pins_list_200_response.h"
#include "../model/pins_save_request.h"

// Enum APPTYPES for PinsAPI_multiPinsAnalytics
typedef enum  { pinterest_rest_api_multiPinsAnalytics_APPTYPES_NULL = 0, pinterest_rest_api_multiPinsAnalytics_APPTYPES_ALL, pinterest_rest_api_multiPinsAnalytics_APPTYPES_MOBILE, pinterest_rest_api_multiPinsAnalytics_APPTYPES_TABLET, pinterest_rest_api_multiPinsAnalytics_APPTYPES_WEB } pinterest_rest_api_multiPinsAnalytics_app_types_e;

// Enum APPTYPES for PinsAPI_pinsAnalytics
typedef enum  { pinterest_rest_api_pinsAnalytics_APPTYPES_NULL = 0, pinterest_rest_api_pinsAnalytics_APPTYPES_ALL, pinterest_rest_api_pinsAnalytics_APPTYPES_MOBILE, pinterest_rest_api_pinsAnalytics_APPTYPES_TABLET, pinterest_rest_api_pinsAnalytics_APPTYPES_WEB } pinterest_rest_api_pinsAnalytics_app_types_e;

// Enum SPLITFIELD for PinsAPI_pinsAnalytics
typedef enum  { pinterest_rest_api_pinsAnalytics_SPLITFIELD_NULL = 0, pinterest_rest_api_pinsAnalytics_SPLITFIELD_NO_SPLIT, pinterest_rest_api_pinsAnalytics_SPLITFIELD_APP_TYPE } pinterest_rest_api_pinsAnalytics_split_field_e;

// Enum PINFILTER for PinsAPI_pinsList
typedef enum  { pinterest_rest_api_pinsList_PINFILTER_NULL = 0, pinterest_rest_api_pinsList_PINFILTER_exclude_native, pinterest_rest_api_pinsList_PINFILTER_exclude_repins, pinterest_rest_api_pinsList_PINFILTER_has_been_promoted } pinterest_rest_api_pinsList_pin_filter_e;

// Enum PINTYPE for PinsAPI_pinsList
typedef enum  { pinterest_rest_api_pinsList_PINTYPE_NULL = 0, pinterest_rest_api_pinsList_PINTYPE__PRIVATE } pinterest_rest_api_pinsList_pin_type_e;

// Enum CREATIVETYPES for PinsAPI_pinsList
typedef enum  { pinterest_rest_api_pinsList_CREATIVETYPES_NULL = 0, pinterest_rest_api_pinsList_CREATIVETYPES_REGULAR, pinterest_rest_api_pinsList_CREATIVETYPES_VIDEO, pinterest_rest_api_pinsList_CREATIVETYPES_SHOPPING, pinterest_rest_api_pinsList_CREATIVETYPES_CAROUSEL, pinterest_rest_api_pinsList_CREATIVETYPES_MAX_VIDEO, pinterest_rest_api_pinsList_CREATIVETYPES_SHOP_THE_PIN, pinterest_rest_api_pinsList_CREATIVETYPES_COLLECTION, pinterest_rest_api_pinsList_CREATIVETYPES_IDEA } pinterest_rest_api_pinsList_creative_types_e;


// Get multiple Pin analytics
//
// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
//
list_t*
PinsAPI_multiPinsAnalytics(apiClient_t *apiClient, list_t *pin_ids, char start_date, char end_date, list_t *metric_types, pinterest_rest_api_multiPinsAnalytics_app_types_e app_types, char *ad_account_id);


// Get Pin analytics
//
// Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
//
list_t*_t*
PinsAPI_pinsAnalytics(apiClient_t *apiClient, char *pin_id, char start_date, char end_date, list_t *metric_types, pinterest_rest_api_pinsAnalytics_app_types_e app_types, pinterest_rest_api_pinsAnalytics_split_field_e split_field, char *ad_account_id);


// Create Pin
//
// Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/web-features/add-ons-overview/'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/api-features/content-overview/'>Content App Solutions Guide</a>.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.
//
pin_t*
PinsAPI_pinsCreate(apiClient_t *apiClient, pin_create_t *pin_create, char *ad_account_id);


// Delete Pin
//
// Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
//
void
PinsAPI_pinsDelete(apiClient_t *apiClient, char *pin_id, char *ad_account_id);


// Get Pin
//
// Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
//
pin_t*
PinsAPI_pinsGet(apiClient_t *apiClient, char *pin_id, int *pin_metrics, char *ad_account_id);


// List Pins
//
// Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href='/docs/api/v5/#operation/boards/list_pins'>GET List Pins on Board</a>.
//
pins_list_200_response_t*
PinsAPI_pinsList(apiClient_t *apiClient, char *bookmark, int *page_size, pinterest_rest_api_pinsList_pin_filter_e pin_filter, int *include_protected_pins, pinterest_rest_api_pinsList_pin_type_e pin_type, list_t *creative_types, char *ad_account_id, int *pin_metrics);


// Save Pin
//
// Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
//
pin_t*
PinsAPI_pinsSave(apiClient_t *apiClient, char *pin_id, pins_save_request_t *pins_save_request, char *ad_account_id);


// Update Pin
//
// Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
//
pin_t*
PinsAPI_pinsUpdate(apiClient_t *apiClient, char *pin_id, pin_update_t *pin_update, char *ad_account_id);


