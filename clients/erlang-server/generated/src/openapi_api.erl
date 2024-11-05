-module(openapi_api).
-moduledoc """
This module offers an API for JSON schema validation, using `jesse` under the hood.

If validation is desired, a jesse state can be loaded using `prepare_validator/1`,
and request and response can be validated using `populate_request/3`
and `validate_response/4` respectively.

For example, the user-defined `Module:accept_callback/4` can be implemented as follows:
```
-spec accept_callback(
        Class :: openapi_api:class(),
        OperationID :: openapi_api:operation_id(),
        Req :: cowboy_req:req(),
        Context :: openapi_logic_handler:context()) ->
    {openapi_logic_handler:accept_callback_return(),
     cowboy_req:req(),
     openapi_logic_handler:context()}.
accept_callback(Class, OperationID, Req0, Context0) ->
    ValidatorState = openapi_api:prepare_validator(),
    case openapi_api:populate_request(OperationID, Req0, ValidatorState) of
        {ok, Model, Req1} ->
            Context1 = maps:merge(Context0, Model),
            case do_accept_callback(Class, OperationID, Req1, Context1) of
                {false, Req2, Context2} ->
                    {false, Req2, Context2};
                {{true, Code, Body}, Req2, Context2} ->
                    case validate_response(OperationID, Code, Body, ValidatorState) of
                        ok ->
                            process_response({ok, Code, Body}, Req2, Context2);
                        {error, Reason} ->
                            process_response({error, Reason}, Req2, Context2)
                    end
            end;
        {error, Reason, Req1} ->
            process_response({error, Reason}, Req1, Context0)
    end.
```
""".

-export([prepare_validator/0, prepare_validator/1, prepare_validator/2]).
-export([populate_request/3, validate_response/4]).

-ignore_xref([populate_request/3, validate_response/4]).
-ignore_xref([prepare_validator/0, prepare_validator/1, prepare_validator/2]).

-type class() ::
    'adAccounts'
    | 'adGroups'
    | 'ads'
    | 'advancedAuction'
    | 'audienceInsights'
    | 'audienceSharing'
    | 'audiences'
    | 'billing'
    | 'boards'
    | 'bulk'
    | 'businessAccessAssets'
    | 'businessAccessInvite'
    | 'businessAccessRelationships'
    | 'campaigns'
    | 'catalogs'
    | 'conversionEvents'
    | 'conversionTags'
    | 'customerLists'
    | 'integrations'
    | 'keywords'
    | 'leadAds'
    | 'leadForms'
    | 'leadsExport'
    | 'media'
    | 'oauth'
    | 'orderLines'
    | 'pins'
    | 'productGroupPromotions'
    | 'resources'
    | 'search'
    | 'targetingTemplate'
    | 'terms'
    | 'termsOfService'
    | 'userAccount'.


-type operation_id() ::
    'ad_account/analytics' | %% Get ad account analytics
    'ad_account_targeting_analytics/get' | %% Get targeting analytics for an ad account
    'ad_accounts/create' | %% Create ad account
    'ad_accounts/get' | %% Get ad account
    'ad_accounts/list' | %% List ad accounts
    'analytics/create_mmm_report' | %% Create a request for a Marketing Mix Modeling (MMM) report
    'analytics/create_report' | %% Create async request for an account analytics report
    'analytics/create_template_report' | %% Create async request for an analytics report using a template
    'analytics/get_mmm_report' | %% Get advertiser Marketing Mix Modeling (MMM) report.
    'analytics/get_report' | %% Get the account analytics report created by the async call
    'sandbox/delete' | %% Delete ads data for ad account in API Sandbox
    'templates/list' | %% List templates
    'ad_groups/analytics' | %% Get ad group analytics
    'ad_groups/audience_sizing' | %% Get audience sizing
    'ad_groups_bid_floor/get' | %% Get bid floors
    'ad_groups/create' | %% Create ad groups
    'ad_groups/get' | %% Get ad group
    'ad_groups/list' | %% List ad groups
    'ad_groups_targeting_analytics/get' | %% Get targeting analytics for ad groups
    'ad_groups/update' | %% Update ad groups
    'ad_previews/create' | %% Create ad preview with pin or image
    'ad_targeting_analytics/get' | %% Get targeting analytics for ads
    'ads/analytics' | %% Get ad analytics
    'ads/create' | %% Create ads
    'ads/get' | %% Get ad
    'ads/list' | %% List ads
    'ads/update' | %% Update ads
    'advanced_auction_items_get/post' | %% Get item bid options (POST)
    'advanced_auction_items_submit/post' | %% Operate on item level bid options
    'audience_insights/get' | %% Get audience insights
    'audience_insights_scope_and_type/get' | %% Get audience insights scope and type
    'ad_accounts_audiences_shared_accounts/list' | %% List accounts with access to an audience owned by an ad account
    'business_account_audiences_shared_accounts/list' | %% List accounts with access to an audience owned by a business
    'shared_audiences_for_business/list' | %% List received audiences for a business
    'update_ad_account_to_ad_account_shared_audience' | %% Update audience sharing between ad accounts
    'update_ad_account_to_business_shared_audience' | %% Update audience sharing from an ad account to businesses
    'update_business_to_ad_account_shared_audience' | %% Update audience sharing from a business to ad accounts
    'update_business_to_business_shared_audience' | %% Update audience sharing between businesses
    'audiences/create' | %% Create audience
    'audiences/create_custom' | %% Create custom audience
    'audiences/get' | %% Get audience
    'audiences/list' | %% List audiences
    'audiences/update' | %% Update audience
    'ads_credit/redeem' | %% Redeem ad credits
    'ads_credits_discounts/get' | %% Get ads credit discounts
    'billing_profiles/get' | %% Get billing profiles
    'ssio_accounts/get' | %% Get Salesforce account details including bill-to information.
    'ssio_insertion_order/create' | %% Create insertion order through SSIO.
    'ssio_insertion_order/edit' | %% Edit insertion order through SSIO.
    'ssio_insertion_orders_status/get_by_ad_account' | %% Get insertion order status by ad account id.
    'ssio_insertion_orders_status/get_by_pin_order_id' | %% Get insertion order status by pin order id.
    'ssio_order_lines/get_by_ad_account' | %% Get Salesforce order lines by ad account id.
    'board_sections/create' | %% Create board section
    'board_sections/delete' | %% Delete board section
    'board_sections/list' | %% List board sections
    'board_sections/list_pins' | %% List Pins on board section
    'board_sections/update' | %% Update board section
    'boards/create' | %% Create board
    'boards/delete' | %% Delete board
    'boards/get' | %% Get board
    'boards/list' | %% List boards
    'boards/list_pins' | %% List Pins on board
    'boards/update' | %% Update board
    'bulk_download/create' | %% Get advertiser entities in bulk
    'bulk_request/get' | %% Download advertiser entities in bulk
    'bulk_upsert/create' | %% Create/update ad entities in bulk
    'asset_group/create' | %% Create a new asset group.
    'asset_group/delete' | %% Delete asset groups.
    'asset_group/update' | %% Update asset groups.
    'business_asset_members/get' | %% Get members with access to asset
    'business_asset_partners/get' | %% Get partners with access to asset
    'business_assets/get' | %% List business assets
    'business_member_assets/get' | %% Get assets assigned to a member
    'business_members_asset_access/delete' | %% Delete member access to asset
    'business_members_asset_access/update' | %% Assign/Update member asset permissions
    'business_partner_asset_access/get' | %% Get assets assigned to a partner or assets assigned by a partner
    'delete_partner_asset_access_handler_impl' | %% Delete partner access to asset
    'update_partner_asset_access_handler_impl' | %% Assign/Update partner asset permissions
    'asset_access_requests/create' | %% Create a request to access an existing partner&#39;s assets.
    'cancel_invites_or_requests' | %% Cancel invites/requests
    'create_asset_invites' | %% Update invite/request with an asset permission
    'create_membership_or_partnership_invites' | %% Create invites or requests
    'get/invites' | %% Get invites/requests
    'respond_business_access_invites' | %% Accept or decline an invite/request
    'delete_business_membership' | %% Terminate business memberships
    'delete_business_partners' | %% Terminate business partnerships
    'get/business_employers' | %% List business employers for user
    'get/business_members' | %% Get business members
    'get/business_partners' | %% Get business partners
    'update/business_memberships' | %% Update member&#39;s business role
    'campaign_targeting_analytics/get' | %% Get targeting analytics for campaigns
    'campaigns/analytics' | %% Get campaign analytics
    'campaigns/create' | %% Create campaigns
    'campaigns/get' | %% Get campaign
    'campaigns/list' | %% List campaigns
    'campaigns/update' | %% Update campaigns
    'catalogs/create' | %% Create catalog
    'catalogs/list' | %% List catalogs
    'catalogs_product_group_pins/list' | %% List products by product group
    'catalogs_product_groups/create' | %% Create product group
    'catalogs_product_groups/create_many' | %% Create product groups
    'catalogs_product_groups/delete' | %% Delete product group
    'catalogs_product_groups/delete_many' | %% Delete product groups
    'catalogs_product_groups/get' | %% Get product group
    'catalogs_product_groups/list' | %% List product groups
    'catalogs_product_groups/product_counts_get' | %% Get product counts
    'catalogs_product_groups/update' | %% Update single product group
    'feed_processing_results/list' | %% List feed processing results
    'feeds/create' | %% Create feed
    'feeds/delete' | %% Delete feed
    'feeds/get' | %% Get feed
    'feeds/ingest' | %% Ingest feed items
    'feeds/list' | %% List feeds
    'feeds/update' | %% Update feed
    'items_batch/get' | %% Get item batch status
    'items_batch/post' | %% Operate on item batch
    'items/get' | %% Get catalogs items
    'items_issues/list' | %% List item issues
    'items/post' | %% Get catalogs items (POST)
    'products_by_product_group_filter/list' | %% List products by filter
    'reports/create' | %% Build catalogs report
    'reports/get' | %% Get catalogs report
    'reports/stats' | %% List report stats
    'events/create' | %% Send conversions
    'conversion_tags/create' | %% Create conversion tag
    'conversion_tags/get' | %% Get conversion tag
    'conversion_tags/list' | %% Get conversion tags
    'ocpm_eligible_conversion_tags/get' | %% Get Ocpm eligible conversion tags
    'page_visit_conversion_tags/get' | %% Get page visit conversion tags
    'customer_lists/create' | %% Create customer lists
    'customer_lists/get' | %% Get customer list
    'customer_lists/list' | %% Get customer lists
    'customer_lists/update' | %% Update customer list
    'integrations_commerce/del' | %% Delete commerce integration
    'integrations_commerce/get' | %% Get commerce integration
    'integrations_commerce/patch' | %% Update commerce integration
    'integrations_commerce/post' | %% Create commerce integration
    'integrations/get_by_id' | %% Get integration metadata
    'integrations/get_list' | %% Get integration metadata list
    'integrations_logs/post' | %% Receives batched logs from integration applications.
    'country_keywords_metrics/get' | %% Get country&#39;s keyword metrics
    'keywords/create' | %% Create keywords
    'keywords/get' | %% Get keywords
    'keywords/update' | %% Update keywords
    'trending_keywords/list' | %% List trending keywords
    'ad_accounts_subscriptions/del_by_id' | %% Delete lead ads subscription
    'ad_accounts_subscriptions/get_by_id' | %% Get lead ads subscription
    'ad_accounts_subscriptions/get_list' | %% Get lead ads subscriptions
    'ad_accounts_subscriptions/post' | %% Create lead ads subscription
    'lead_form/get' | %% Get lead form by id
    'lead_form_test/create' | %% Create lead form test data
    'lead_forms/create' | %% Create lead forms
    'lead_forms/list' | %% List lead forms
    'lead_forms/update' | %% Update lead forms
    'leads_export/create' | %% Create a request to export leads collected from a lead ad
    'leads_export/get' | %% Get the lead export from the lead export create call
    'media/create' | %% Register media upload
    'media/get' | %% Get media upload details
    'media/list' | %% List media uploads
    'oauth/token' | %% Generate OAuth access token
    'order_lines/get' | %% Get order line
    'order_lines/list' | %% Get order lines
    'multi_pins/analytics' | %% Get multiple Pin analytics
    'pins/analytics' | %% Get Pin analytics
    'pins/create' | %% Create Pin
    'pins/delete' | %% Delete Pin
    'pins/get' | %% Get Pin
    'pins/list' | %% List Pins
    'pins/save' | %% Save Pin
    'pins/update' | %% Update Pin
    'product_group_promotions/create' | %% Create product group promotions
    'product_group_promotions/get' | %% Get a product group promotion by id
    'product_group_promotions/list' | %% Get product group promotions
    'product_group_promotions/update' | %% Update product group promotions
    'product_groups/analytics' | %% Get product group analytics
    'ad_account_countries/get' | %% Get ad accounts countries
    'delivery_metrics/get' | %% Get available metrics&#39; definitions
    'interest_targeting_options/get' | %% Get interest details
    'lead_form_questions/get' | %% Get lead form questions
    'metrics_ready_state/get' | %% Get metrics ready state
    'targeting_options/get' | %% Get targeting options
    'search_partner_pins' | %% Search pins by a given search term
    'search_user_boards/get' | %% Search user&#39;s boards
    'search_user_pins/list' | %% Search user&#39;s Pins
    'targeting_template/create' | %% Create targeting templates
    'targeting_template/list' | %% List targeting templates
    'targeting_template/update' | %% Update targeting templates
    'terms_related/list' | %% List related terms
    'terms_suggested/list' | %% List suggested terms
    'terms_of_service/get' | %% Get terms of service
    'boards_user_follows/list' | %% List following boards
    'follow_user/update' | %% Follow user
    'followers/list' | %% List followers
    'linked_business_accounts/get' | %% List linked businesses
    'unverify_website/delete' | %% Unverify website
    'user_account/analytics' | %% Get user account analytics
    'user_account/analytics/top_pins' | %% Get user account top pins analytics
    'user_account/analytics/top_video_pins' | %% Get user account top video pins analytics
    'user_account/followed_interests' | %% List following interests
    'user_account/get' | %% Get user account
    'user_following/get' | %% List following
    'user_websites/get' | %% Get user websites
    'verify_website/update' | %% Verify website
    'website_verification/get' | %% Get user verification code for website claiming
    {error, unknown_operation}.

-type request_param() :: atom().

-export_type([class/0, operation_id/0]).

-dialyzer({nowarn_function, [validate_response_body/4]}).

-type rule() ::
    {type, binary} |
    {type, byte} |
    {type, integer} |
    {type, float} |
    {type, boolean} |
    {type, date} |
    {type, datetime} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    {schema, object | list, binary()} |
    schema |
    required |
    not_required.

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator() -> jesse_state:state().
prepare_validator() ->
    prepare_validator(<<"http://json-schema.org/draft-06/schema#">>).

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator(binary()) -> jesse_state:state().
prepare_validator(SchemaVer) ->
    prepare_validator(get_openapi_path(), SchemaVer).

-doc """
Loads the JSON schema and the desired validation draft into a `t:jesse_state:state()`.
""".
-spec prepare_validator(file:name_all(), binary()) -> jesse_state:state().
prepare_validator(OpenApiPath, SchemaVer) ->
    {ok, FileContents} = file:read_file(OpenApiPath),
    R = json:decode(FileContents),
    jesse_state:new(R, [{default_schema_ver, SchemaVer}]).

-doc """
Automatically loads the entire body from the cowboy req
and validates the JSON body against the schema.
""".
-spec populate_request(
        OperationID :: operation_id(),
        Req :: cowboy_req:req(),
        ValidatorState :: jesse_state:state()) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.
populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

-doc """
Validates that the provided `Code` and `Body` comply with the `ValidatorState` schema
for the `OperationID` operation.
""".
-spec validate_response(
        OperationID :: operation_id(),
        Code :: 200..599,
        Body :: jesse:json_term(),
        ValidatorState :: jesse_state:state()) ->
    ok | {ok, term()} | [ok | {ok, term()}] | no_return().
validate_response('ad_account/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdAccountAnalyticsResponse_inner', Body, ValidatorState);
validate_response('ad_account/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_account/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts/create', 200, Body, ValidatorState) ->
    validate_response_body('AdAccount', 'AdAccount', Body, ValidatorState);
validate_response('ad_accounts/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts/get', 200, Body, ValidatorState) ->
    validate_response_body('AdAccount', 'AdAccount', Body, ValidatorState);
validate_response('ad_accounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_list_200_response', 'ad_accounts_list_200_response', Body, ValidatorState);
validate_response('ad_accounts/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 200, Body, ValidatorState) ->
    validate_response_body('CreateMMMReportResponse', 'CreateMMMReportResponse', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/create_report', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsCreateAsyncResponse', 'AdsAnalyticsCreateAsyncResponse', Body, ValidatorState);
validate_response('analytics/create_report', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/create_report', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsCreateAsyncResponse', 'AdsAnalyticsCreateAsyncResponse', Body, ValidatorState);
validate_response('analytics/create_template_report', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 200, Body, ValidatorState) ->
    validate_response_body('GetMMMReportResponse', 'GetMMMReportResponse', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/get_report', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsGetAsyncResponse', 'AdsAnalyticsGetAsyncResponse', Body, ValidatorState);
validate_response('analytics/get_report', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('analytics/get_report', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('sandbox/delete', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('sandbox/delete', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('sandbox/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('templates/list', 200, Body, ValidatorState) ->
    validate_response_body('templates_list_200_response', 'templates_list_200_response', Body, ValidatorState);
validate_response('templates/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('templates/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdGroupsAnalyticsResponse_inner', Body, ValidatorState);
validate_response('ad_groups/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupAudienceSizingResponse', 'AdGroupAudienceSizingResponse', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 200, Body, ValidatorState) ->
    validate_response_body('BidFloor', 'BidFloor', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/create', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupArrayResponse', 'AdGroupArrayResponse', Body, ValidatorState);
validate_response('ad_groups/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/get', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupResponse', 'AdGroupResponse', Body, ValidatorState);
validate_response('ad_groups/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_groups_list_200_response', 'ad_groups_list_200_response', Body, ValidatorState);
validate_response('ad_groups/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_groups/update', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupArrayResponse', 'AdGroupArrayResponse', Body, ValidatorState);
validate_response('ad_groups/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_previews/create', 200, Body, ValidatorState) ->
    validate_response_body('AdPreviewURLResponse', 'AdPreviewURLResponse', Body, ValidatorState);
validate_response('ad_previews/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_previews/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdsAnalyticsResponse_inner', Body, ValidatorState);
validate_response('ads/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads/create', 200, Body, ValidatorState) ->
    validate_response_body('AdArrayResponse', 'AdArrayResponse', Body, ValidatorState);
validate_response('ads/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads/get', 200, Body, ValidatorState) ->
    validate_response_body('AdResponse', 'AdResponse', Body, ValidatorState);
validate_response('ads/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads/list', 200, Body, ValidatorState) ->
    validate_response_body('ads_list_200_response', 'ads_list_200_response', Body, ValidatorState);
validate_response('ads/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads/update', 200, Body, ValidatorState) ->
    validate_response_body('AdArrayResponse', 'AdArrayResponse', Body, ValidatorState);
validate_response('ads/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 200, Body, ValidatorState) ->
    validate_response_body('AdvancedAuctionItems', 'AdvancedAuctionItems', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 500, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 200, Body, ValidatorState) ->
    validate_response_body('AdvancedAuctionProcessedItems', 'AdvancedAuctionProcessedItems', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 500, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audience_insights/get', 200, Body, ValidatorState) ->
    validate_response_body('AudienceInsightsResponse', 'AudienceInsightsResponse', Body, ValidatorState);
validate_response('audience_insights/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 200, Body, ValidatorState) ->
    validate_response_body('AudienceDefinitionResponse', 'AudienceDefinitionResponse', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_audiences_shared_accounts_list_200_response', 'ad_accounts_audiences_shared_accounts_list_200_response', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_audiences_shared_accounts_list_200_response', 'ad_accounts_audiences_shared_accounts_list_200_response', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 200, Body, ValidatorState) ->
    validate_response_body('audiences_list_200_response', 'audiences_list_200_response', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('SharedAudienceResponse', 'SharedAudienceResponse', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('BusinessSharedAudienceResponse', 'BusinessSharedAudienceResponse', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('SharedAudienceResponse', 'SharedAudienceResponse', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('BusinessSharedAudienceResponse', 'BusinessSharedAudienceResponse', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audiences/create', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('audiences/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audiences/create_custom', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('audiences/create_custom', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audiences/get', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('audiences/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audiences/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audiences/list', 200, Body, ValidatorState) ->
    validate_response_body('audiences_list_200_response', 'audiences_list_200_response', Body, ValidatorState);
validate_response('audiences/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audiences/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('audiences/update', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('audiences/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 200, Body, ValidatorState) ->
    validate_response_body('AdsCreditRedeemResponse', 'AdsCreditRedeemResponse', Body, ValidatorState);
validate_response('ads_credit/redeem', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 200, Body, ValidatorState) ->
    validate_response_body('ads_credits_discounts_get_200_response', 'ads_credits_discounts_get_200_response', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('billing_profiles/get', 200, Body, ValidatorState) ->
    validate_response_body('billing_profiles_get_200_response', 'billing_profiles_get_200_response', Body, ValidatorState);
validate_response('billing_profiles/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 200, Body, ValidatorState) ->
    validate_response_body('SSIOAccountResponse', 'SSIOAccountResponse', Body, ValidatorState);
validate_response('ssio_accounts/get', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 200, Body, ValidatorState) ->
    validate_response_body('SSIOCreateInsertionOrderResponse', 'SSIOCreateInsertionOrderResponse', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 200, Body, ValidatorState) ->
    validate_response_body('SSIOEditInsertionOrderResponse', 'SSIOEditInsertionOrderResponse', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 200, Body, ValidatorState) ->
    validate_response_body('ssio_insertion_orders_status_get_by_ad_account_200_response', 'ssio_insertion_orders_status_get_by_ad_account_200_response', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 200, Body, ValidatorState) ->
    validate_response_body('SSIOInsertionOrderStatusResponse', 'SSIOInsertionOrderStatusResponse', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 200, Body, ValidatorState) ->
    validate_response_body('ssio_order_lines_get_by_ad_account_200_response', 'ssio_order_lines_get_by_ad_account_200_response', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/create', 201, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('board_sections/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/create', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/create', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/create', 500, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('board_sections/delete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/delete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/delete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/list', 200, Body, ValidatorState) ->
    validate_response_body('board_sections_list_200_response', 'board_sections_list_200_response', Body, ValidatorState);
validate_response('board_sections/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_pins_200_response', 'boards_list_pins_200_response', Body, ValidatorState);
validate_response('board_sections/list_pins', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/update', 200, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('board_sections/update', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/update', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/update', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('board_sections/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/create', 201, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('boards/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('boards/delete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/delete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/delete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/delete', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/get', 200, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('boards/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/list', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_200_response', 'boards_list_200_response', Body, ValidatorState);
validate_response('boards/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/list_pins', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_pins_200_response', 'boards_list_pins_200_response', Body, ValidatorState);
validate_response('boards/list_pins', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/list_pins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/update', 200, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('boards/update', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/update', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/update', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('bulk_download/create', 200, Body, ValidatorState) ->
    validate_response_body('BulkDownloadResponse', 'BulkDownloadResponse', Body, ValidatorState);
validate_response('bulk_download/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('bulk_request/get', 200, Body, ValidatorState) ->
    validate_response_body('BulkUpsertStatusResponse', 'BulkUpsertStatusResponse', Body, ValidatorState);
validate_response('bulk_request/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('bulk_upsert/create', 200, Body, ValidatorState) ->
    validate_response_body('BulkUpsertResponse', 'BulkUpsertResponse', Body, ValidatorState);
validate_response('bulk_upsert/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('asset_group/create', 200, Body, ValidatorState) ->
    validate_response_body('CreateAssetGroupResponse', 'CreateAssetGroupResponse', Body, ValidatorState);
validate_response('asset_group/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('asset_group/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('asset_group/delete', 200, Body, ValidatorState) ->
    validate_response_body('DeleteAssetGroupResponse', 'DeleteAssetGroupResponse', Body, ValidatorState);
validate_response('asset_group/delete', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('asset_group/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('asset_group/update', 200, Body, ValidatorState) ->
    validate_response_body('UpdateAssetGroupResponse', 'UpdateAssetGroupResponse', Body, ValidatorState);
validate_response('asset_group/update', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('asset_group/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_asset_members/get', 200, Body, ValidatorState) ->
    validate_response_body('business_asset_members_get_200_response', 'business_asset_members_get_200_response', Body, ValidatorState);
validate_response('business_asset_members/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_asset_partners/get', 200, Body, ValidatorState) ->
    validate_response_body('business_asset_partners_get_200_response', 'business_asset_partners_get_200_response', Body, ValidatorState);
validate_response('business_asset_partners/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_assets/get', 200, Body, ValidatorState) ->
    validate_response_body('business_assets_get_200_response', 'business_assets_get_200_response', Body, ValidatorState);
validate_response('business_assets/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_member_assets/get', 200, Body, ValidatorState) ->
    validate_response_body('business_member_assets_get_200_response', 'business_member_assets_get_200_response', Body, ValidatorState);
validate_response('business_member_assets/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_members_asset_access/delete', 200, Body, ValidatorState) ->
    validate_response_body('DeleteMemberAccessResultsResponseArray', 'DeleteMemberAccessResultsResponseArray', Body, ValidatorState);
validate_response('business_members_asset_access/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_members_asset_access/update', 200, Body, ValidatorState) ->
    validate_response_body('UpdateMemberAssetsResultsResponseArray', 'UpdateMemberAssetsResultsResponseArray', Body, ValidatorState);
validate_response('business_members_asset_access/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 200, Body, ValidatorState) ->
    validate_response_body('business_partner_asset_access_get_200_response', 'business_partner_asset_access_get_200_response', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('delete_partner_asset_access_handler_impl', 200, Body, ValidatorState) ->
    validate_response_body('DeletePartnerAssetsResultsResponseArray', 'DeletePartnerAssetsResultsResponseArray', Body, ValidatorState);
validate_response('delete_partner_asset_access_handler_impl', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 200, Body, ValidatorState) ->
    validate_response_body('UpdatePartnerAssetsResultsResponseArray', 'UpdatePartnerAssetsResultsResponseArray', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('asset_access_requests/create', 200, Body, ValidatorState) ->
    validate_response_body('CreateAssetAccessRequestResponse', 'CreateAssetAccessRequestResponse', Body, ValidatorState);
validate_response('asset_access_requests/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('cancel_invites_or_requests', 200, Body, ValidatorState) ->
    validate_response_body('DeleteInvitesResultsResponseArray', 'DeleteInvitesResultsResponseArray', Body, ValidatorState);
validate_response('cancel_invites_or_requests', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('create_asset_invites', 200, Body, ValidatorState) ->
    validate_response_body('UpdateInvitesResultsResponseArray', 'UpdateInvitesResultsResponseArray', Body, ValidatorState);
validate_response('create_asset_invites', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 200, Body, ValidatorState) ->
    validate_response_body('CreateInvitesResultsResponseArray', 'CreateInvitesResultsResponseArray', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('get/invites', 200, Body, ValidatorState) ->
    validate_response_body('get_invites_200_response', 'get_invites_200_response', Body, ValidatorState);
validate_response('get/invites', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('respond_business_access_invites', 200, Body, ValidatorState) ->
    validate_response_body('RespondToInvitesResponseArray', 'RespondToInvitesResponseArray', Body, ValidatorState);
validate_response('respond_business_access_invites', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('delete_business_membership', 200, Body, ValidatorState) ->
    validate_response_body('DeletedMembersResponse', 'DeletedMembersResponse', Body, ValidatorState);
validate_response('delete_business_membership', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('delete_business_partners', 200, Body, ValidatorState) ->
    validate_response_body('DeletePartnersResponse', 'DeletePartnersResponse', Body, ValidatorState);
validate_response('delete_business_partners', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('delete_business_partners', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('get/business_employers', 200, Body, ValidatorState) ->
    validate_response_body('get_business_employers_200_response', 'get_business_employers_200_response', Body, ValidatorState);
validate_response('get/business_employers', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('get/business_members', 200, Body, ValidatorState) ->
    validate_response_body('get_business_members_200_response', 'get_business_members_200_response', Body, ValidatorState);
validate_response('get/business_members', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('get/business_partners', 200, Body, ValidatorState) ->
    validate_response_body('get_business_partners_200_response', 'get_business_partners_200_response', Body, ValidatorState);
validate_response('get/business_partners', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('update/business_memberships', 200, Body, ValidatorState) ->
    validate_response_body('UpdateMemberResultsResponseArray', 'UpdateMemberResultsResponseArray', Body, ValidatorState);
validate_response('update/business_memberships', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaigns/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'CampaignsAnalyticsResponse_inner', Body, ValidatorState);
validate_response('campaigns/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaigns/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaigns/create', 200, Body, ValidatorState) ->
    validate_response_body('CampaignCreateResponse', 'CampaignCreateResponse', Body, ValidatorState);
validate_response('campaigns/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaigns/get', 200, Body, ValidatorState) ->
    validate_response_body('CampaignResponse', 'CampaignResponse', Body, ValidatorState);
validate_response('campaigns/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaigns/list', 200, Body, ValidatorState) ->
    validate_response_body('campaigns_list_200_response', 'campaigns_list_200_response', Body, ValidatorState);
validate_response('campaigns/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaigns/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('campaigns/update', 200, Body, ValidatorState) ->
    validate_response_body('CampaignUpdateResponse', 'CampaignUpdateResponse', Body, ValidatorState);
validate_response('campaigns/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs/create', 200, Body, ValidatorState) ->
    validate_response_body('Catalog', 'Catalog', Body, ValidatorState);
validate_response('catalogs/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs/create', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_list_200_response', 'catalogs_list_200_response', Body, ValidatorState);
validate_response('catalogs/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs/list', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_group_pins_list_200_response', 'catalogs_product_group_pins_list_200_response', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 201, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 201, Body, ValidatorState) ->
    validate_response_body('list', 'string', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_groups_list_200_response', 'catalogs_product_groups_list_200_response', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsProductGroupProductCountsVertical', 'CatalogsProductGroupProductCountsVertical', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 200, Body, ValidatorState) ->
    validate_response_body('feed_processing_results_list_200_response', 'feed_processing_results_list_200_response', Body, ValidatorState);
validate_response('feed_processing_results/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/create', 201, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/create', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/create', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/create', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/create', 422, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/create', 501, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('feeds/delete', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/delete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/delete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/delete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/get', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/get', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/ingest', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeedIngestion', 'CatalogsFeedIngestion', Body, ValidatorState);
validate_response('feeds/ingest', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/ingest', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/ingest', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/ingest', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/list', 200, Body, ValidatorState) ->
    validate_response_body('feeds_list_200_response', 'feeds_list_200_response', Body, ValidatorState);
validate_response('feeds/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/list', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/update', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/update', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/update', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/update', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('feeds/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItemsBatch', 'CatalogsItemsBatch', Body, ValidatorState);
validate_response('items_batch/get', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/get', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/get', 405, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/post', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItemsBatch', 'CatalogsItemsBatch', Body, ValidatorState);
validate_response('items_batch/post', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/post', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/post', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_batch/post', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItems', 'CatalogsItems', Body, ValidatorState);
validate_response('items/get', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/get', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/get', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_issues/list', 200, Body, ValidatorState) ->
    validate_response_body('items_issues_list_200_response', 'items_issues_list_200_response', Body, ValidatorState);
validate_response('items_issues/list', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_issues/list', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_issues/list', 501, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items_issues/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/post', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItems', 'CatalogsItems', Body, ValidatorState);
validate_response('items/post', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/post', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/post', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('items/post', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_group_pins_list_200_response', 'catalogs_product_group_pins_list_200_response', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/create', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsCreateReportResponse', 'CatalogsCreateReportResponse', Body, ValidatorState);
validate_response('reports/create', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/create', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsReport', 'CatalogsReport', Body, ValidatorState);
validate_response('reports/get', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/get', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/stats', 200, Body, ValidatorState) ->
    validate_response_body('reports_stats_200_response', 'reports_stats_200_response', Body, ValidatorState);
validate_response('reports/stats', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('reports/stats', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('events/create', 200, Body, ValidatorState) ->
    validate_response_body('ConversionApiResponse', 'ConversionApiResponse', Body, ValidatorState);
validate_response('events/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('events/create', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('events/create', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('events/create', 422, Body, ValidatorState) ->
    validate_response_body('DetailedError', 'DetailedError', Body, ValidatorState);
validate_response('events/create', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('events/create', 503, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('events/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('conversion_tags/create', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTagResponse', 'ConversionTagResponse', Body, ValidatorState);
validate_response('conversion_tags/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('conversion_tags/get', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTagResponse', 'ConversionTagResponse', Body, ValidatorState);
validate_response('conversion_tags/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('conversion_tags/list', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTagListResponse', 'ConversionTagListResponse', Body, ValidatorState);
validate_response('conversion_tags/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 200, Body, ValidatorState) ->
    validate_response_body('map', 'ConversionEventResponse', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 200, Body, ValidatorState) ->
    validate_response_body('page_visit_conversion_tags_get_200_response', 'page_visit_conversion_tags_get_200_response', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('customer_lists/create', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('customer_lists/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('customer_lists/get', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('customer_lists/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('customer_lists/list', 200, Body, ValidatorState) ->
    validate_response_body('customer_lists_list_200_response', 'customer_lists_list_200_response', Body, ValidatorState);
validate_response('customer_lists/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('customer_lists/update', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('customer_lists/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/del', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('integrations_commerce/del', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/patch', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/post', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationRecord', 'IntegrationRecord', Body, ValidatorState);
validate_response('integrations/get_by_id', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations/get_list', 200, Body, ValidatorState) ->
    validate_response_body('integrations_get_list_200_response', 'integrations_get_list_200_response', Body, ValidatorState);
validate_response('integrations/get_list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('integrations_logs/post', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationLogsSuccessResponse', 'IntegrationLogsSuccessResponse', Body, ValidatorState);
validate_response('integrations_logs/post', 400, Body, ValidatorState) ->
    validate_response_body('DetailedError', 'DetailedError', Body, ValidatorState);
validate_response('integrations_logs/post', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 200, Body, ValidatorState) ->
    validate_response_body('KeywordsMetricsArrayResponse', 'KeywordsMetricsArrayResponse', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('keywords/create', 200, Body, ValidatorState) ->
    validate_response_body('KeywordsResponse', 'KeywordsResponse', Body, ValidatorState);
validate_response('keywords/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('keywords/get', 200, Body, ValidatorState) ->
    validate_response_body('keywords_get_200_response', 'keywords_get_200_response', Body, ValidatorState);
validate_response('keywords/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('keywords/update', 200, Body, ValidatorState) ->
    validate_response_body('KeywordsResponse', 'KeywordsResponse', Body, ValidatorState);
validate_response('keywords/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('trending_keywords/list', 200, Body, ValidatorState) ->
    validate_response_body('TrendingKeywordsResponse', 'TrendingKeywordsResponse', Body, ValidatorState);
validate_response('trending_keywords/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('trending_keywords/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountGetSubscriptionResponse', 'AdAccountGetSubscriptionResponse', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_subscriptions_get_list_200_response', 'ad_accounts_subscriptions_get_list_200_response', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountCreateSubscriptionResponse', 'AdAccountCreateSubscriptionResponse', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_form/get', 200, Body, ValidatorState) ->
    validate_response_body('LeadFormResponse', 'LeadFormResponse', Body, ValidatorState);
validate_response('lead_form/get', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_form/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_form/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_form_test/create', 200, Body, ValidatorState) ->
    validate_response_body('LeadFormTestResponse', 'LeadFormTestResponse', Body, ValidatorState);
validate_response('lead_form_test/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_form_test/create', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_form_test/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_forms/create', 200, Body, ValidatorState) ->
    validate_response_body('LeadFormArrayResponse', 'LeadFormArrayResponse', Body, ValidatorState);
validate_response('lead_forms/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_forms/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_forms/list', 200, Body, ValidatorState) ->
    validate_response_body('lead_forms_list_200_response', 'lead_forms_list_200_response', Body, ValidatorState);
validate_response('lead_forms/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_forms/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_forms/update', 200, Body, ValidatorState) ->
    validate_response_body('LeadFormArrayResponse', 'LeadFormArrayResponse', Body, ValidatorState);
validate_response('lead_forms/update', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_forms/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('leads_export/create', 200, Body, ValidatorState) ->
    validate_response_body('LeadsExportCreateResponse', 'LeadsExportCreateResponse', Body, ValidatorState);
validate_response('leads_export/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('leads_export/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('leads_export/get', 200, Body, ValidatorState) ->
    validate_response_body('LeadsExportResponseData', 'LeadsExportResponseData', Body, ValidatorState);
validate_response('leads_export/get', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('leads_export/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('leads_export/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('media/create', 201, Body, ValidatorState) ->
    validate_response_body('MediaUpload', 'MediaUpload', Body, ValidatorState);
validate_response('media/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('media/get', 200, Body, ValidatorState) ->
    validate_response_body('MediaUploadDetails', 'MediaUploadDetails', Body, ValidatorState);
validate_response('media/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('media/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('media/list', 200, Body, ValidatorState) ->
    validate_response_body('media_list_200_response', 'media_list_200_response', Body, ValidatorState);
validate_response('media/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('oauth/token', 200, Body, ValidatorState) ->
    validate_response_body('OauthAccessTokenResponse', 'OauthAccessTokenResponse', Body, ValidatorState);
validate_response('oauth/token', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('order_lines/get', 200, Body, ValidatorState) ->
    validate_response_body('OrderLine', 'OrderLine', Body, ValidatorState);
validate_response('order_lines/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('order_lines/list', 200, Body, ValidatorState) ->
    validate_response_body('order_lines_list_200_response', 'order_lines_list_200_response', Body, ValidatorState);
validate_response('order_lines/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'PinAnalyticsMetricsResponse', Body, ValidatorState);
validate_response('multi_pins/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/analytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'PinAnalyticsMetricsResponse', Body, ValidatorState);
validate_response('pins/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/create', 201, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/create', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/create', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/create', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('pins/delete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/delete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/get', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/get', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/get', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/list', 200, Body, ValidatorState) ->
    validate_response_body('pins_list_200_response', 'pins_list_200_response', Body, ValidatorState);
validate_response('pins/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/save', 201, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/save', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/save', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/save', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/update', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/update', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/update', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/update', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('pins/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('product_group_promotions/create', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotionResponse', 'ProductGroupPromotionResponse', Body, ValidatorState);
validate_response('product_group_promotions/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('product_group_promotions/get', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotionResponse', 'ProductGroupPromotionResponse', Body, ValidatorState);
validate_response('product_group_promotions/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('product_group_promotions/list', 200, Body, ValidatorState) ->
    validate_response_body('product_group_promotions_list_200_response', 'product_group_promotions_list_200_response', Body, ValidatorState);
validate_response('product_group_promotions/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('product_group_promotions/update', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotionResponse', 'ProductGroupPromotionResponse', Body, ValidatorState);
validate_response('product_group_promotions/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('product_groups/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'ProductGroupAnalyticsResponse_inner', Body, ValidatorState);
validate_response('product_groups/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('product_groups/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ad_account_countries/get', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountsCountryResponse', 'AdAccountsCountryResponse', Body, ValidatorState);
validate_response('ad_account_countries/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('delivery_metrics/get', 200, Body, ValidatorState) ->
    validate_response_body('DeliveryMetricsResponse', 'DeliveryMetricsResponse', Body, ValidatorState);
validate_response('delivery_metrics/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('interest_targeting_options/get', 200, Body, ValidatorState) ->
    validate_response_body('SingleInterestTargetingOptionResponse', 'SingleInterestTargetingOptionResponse', Body, ValidatorState);
validate_response('interest_targeting_options/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('lead_form_questions/get', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('lead_form_questions/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('metrics_ready_state/get', 200, Body, ValidatorState) ->
    validate_response_body('BookClosedResponse', 'BookClosedResponse', Body, ValidatorState);
validate_response('metrics_ready_state/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('targeting_options/get', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('targeting_options/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('search_partner_pins', 200, Body, ValidatorState) ->
    validate_response_body('search_partner_pins_200_response', 'search_partner_pins_200_response', Body, ValidatorState);
validate_response('search_partner_pins', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('search_partner_pins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('search_user_boards/get', 200, Body, ValidatorState) ->
    validate_response_body('search_user_boards_get_200_response', 'search_user_boards_get_200_response', Body, ValidatorState);
validate_response('search_user_boards/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('search_user_pins/list', 200, Body, ValidatorState) ->
    validate_response_body('pins_list_200_response', 'pins_list_200_response', Body, ValidatorState);
validate_response('search_user_pins/list', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('search_user_pins/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('targeting_template/create', 200, Body, ValidatorState) ->
    validate_response_body('TargetingTemplateGetResponseData', 'TargetingTemplateGetResponseData', Body, ValidatorState);
validate_response('targeting_template/create', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('targeting_template/create', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('targeting_template/list', 200, Body, ValidatorState) ->
    validate_response_body('targeting_template_list_200_response', 'targeting_template_list_200_response', Body, ValidatorState);
validate_response('targeting_template/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('targeting_template/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('targeting_template/update', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('targeting_template/update', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('targeting_template/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('terms_related/list', 200, Body, ValidatorState) ->
    validate_response_body('RelatedTerms', 'RelatedTerms', Body, ValidatorState);
validate_response('terms_related/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('terms_related/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('terms_suggested/list', 200, Body, ValidatorState) ->
    validate_response_body('list', 'string', Body, ValidatorState);
validate_response('terms_suggested/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('terms_suggested/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('terms_of_service/get', 200, Body, ValidatorState) ->
    validate_response_body('TermsOfService', 'TermsOfService', Body, ValidatorState);
validate_response('terms_of_service/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 200, Body, ValidatorState) ->
    validate_response_body('boards_user_follows_list_200_response', 'boards_user_follows_list_200_response', Body, ValidatorState);
validate_response('boards_user_follows/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('follow_user/update', 200, Body, ValidatorState) ->
    validate_response_body('UserSummary', 'UserSummary', Body, ValidatorState);
validate_response('follow_user/update', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('follow_user/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('followers/list', 200, Body, ValidatorState) ->
    validate_response_body('followers_list_200_response', 'followers_list_200_response', Body, ValidatorState);
validate_response('followers/list', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('followers/list', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('linked_business_accounts/get', 200, Body, ValidatorState) ->
    validate_response_body('list', 'LinkedBusiness', Body, ValidatorState);
validate_response('linked_business_accounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('unverify_website/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('unverify_website/delete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('unverify_website/delete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/analytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'AnalyticsMetricsResponse', Body, ValidatorState);
validate_response('user_account/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 200, Body, ValidatorState) ->
    validate_response_body('TopPinsAnalyticsResponse', 'TopPinsAnalyticsResponse', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 200, Body, ValidatorState) ->
    validate_response_body('TopVideoPinsAnalyticsResponse', 'TopVideoPinsAnalyticsResponse', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 200, Body, ValidatorState) ->
    validate_response_body('user_account_followed_interests_200_response', 'user_account_followed_interests_200_response', Body, ValidatorState);
validate_response('user_account/followed_interests', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/get', 200, Body, ValidatorState) ->
    validate_response_body('Account', 'Account', Body, ValidatorState);
validate_response('user_account/get', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_account/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_following/get', 200, Body, ValidatorState) ->
    validate_response_body('user_following_get_200_response', 'user_following_get_200_response', Body, ValidatorState);
validate_response('user_following/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_websites/get', 200, Body, ValidatorState) ->
    validate_response_body('user_websites_get_200_response', 'user_websites_get_200_response', Body, ValidatorState);
validate_response('user_websites/get', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('user_websites/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('verify_website/update', 200, Body, ValidatorState) ->
    validate_response_body('UserWebsiteSummary', 'UserWebsiteSummary', Body, ValidatorState);
validate_response('verify_website/update', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('website_verification/get', 200, Body, ValidatorState) ->
    validate_response_body('UserWebsiteVerificationCode', 'UserWebsiteVerificationCode', Body, ValidatorState);
validate_response('website_verification/get', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('website_verification/get', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

%%%
-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].
request_params('ad_account/analytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];
request_params('ad_account_targeting_analytics/get') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
    ];
request_params('ad_accounts/create') ->
    [
        'AdAccountCreateRequest'
    ];
request_params('ad_accounts/get') ->
    [
        'ad_account_id'
    ];
request_params('ad_accounts/list') ->
    [
        'bookmark',
        'page_size',
        'include_shared_accounts'
    ];
request_params('analytics/create_mmm_report') ->
    [
        'ad_account_id',
        'CreateMMMReportRequest'
    ];
request_params('analytics/create_report') ->
    [
        'ad_account_id',
        'AdsAnalyticsCreateAsyncRequest'
    ];
request_params('analytics/create_template_report') ->
    [
        'ad_account_id',
        'template_id',
        'start_date',
        'end_date',
        'granularity'
    ];
request_params('analytics/get_mmm_report') ->
    [
        'ad_account_id',
        'token'
    ];
request_params('analytics/get_report') ->
    [
        'ad_account_id',
        'token'
    ];
request_params('sandbox/delete') ->
    [
        'ad_account_id'
    ];
request_params('templates/list') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('ad_groups/analytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'ad_group_ids',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];
request_params('ad_groups/audience_sizing') ->
    [
        'ad_account_id',
        'AdGroupAudienceSizingRequest'
    ];
request_params('ad_groups_bid_floor/get') ->
    [
        'ad_account_id',
        'BidFloorRequest'
    ];
request_params('ad_groups/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('ad_groups/get') ->
    [
        'ad_account_id',
        'ad_group_id'
    ];
request_params('ad_groups/list') ->
    [
        'ad_account_id',
        'campaign_ids',
        'ad_group_ids',
        'entity_statuses',
        'page_size',
        'order',
        'bookmark',
        'translate_interests_to_names'
    ];
request_params('ad_groups_targeting_analytics/get') ->
    [
        'ad_account_id',
        'ad_group_ids',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
    ];
request_params('ad_groups/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('ad_previews/create') ->
    [
        'ad_account_id',
        'AdPreviewRequest'
    ];
request_params('ad_targeting_analytics/get') ->
    [
        'ad_account_id',
        'ad_ids',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
    ];
request_params('ads/analytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'columns',
        'granularity',
        'ad_ids',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'pin_ids',
        'campaign_ids'
    ];
request_params('ads/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('ads/get') ->
    [
        'ad_account_id',
        'ad_id'
    ];
request_params('ads/list') ->
    [
        'ad_account_id',
        'campaign_ids',
        'ad_group_ids',
        'ad_ids',
        'entity_statuses',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('ads/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('advanced_auction_items_get/post') ->
    [
        'AdvancedAuctionItemsGetRequest',
        'ad_account_id'
    ];
request_params('advanced_auction_items_submit/post') ->
    [
        'AdvancedAuctionItemsSubmitRequest',
        'ad_account_id'
    ];
request_params('audience_insights/get') ->
    [
        'ad_account_id',
        'audience_insight_type'
    ];
request_params('audience_insights_scope_and_type/get') ->
    [
        'ad_account_id'
    ];
request_params('ad_accounts_audiences_shared_accounts/list') ->
    [
        'ad_account_id',
        'audience_id',
        'account_type',
        'page_size',
        'bookmark'
    ];
request_params('business_account_audiences_shared_accounts/list') ->
    [
        'business_id',
        'audience_id',
        'account_type',
        'page_size',
        'bookmark'
    ];
request_params('shared_audiences_for_business/list') ->
    [
        'business_id',
        'bookmark',
        'order',
        'page_size'
    ];
request_params('update_ad_account_to_ad_account_shared_audience') ->
    [
        'ad_account_id',
        'SharedAudience'
    ];
request_params('update_ad_account_to_business_shared_audience') ->
    [
        'ad_account_id',
        'BusinessSharedAudience'
    ];
request_params('update_business_to_ad_account_shared_audience') ->
    [
        'business_id',
        'SharedAudience'
    ];
request_params('update_business_to_business_shared_audience') ->
    [
        'business_id',
        'BusinessSharedAudience'
    ];
request_params('audiences/create') ->
    [
        'ad_account_id',
        'AudienceCreateRequest'
    ];
request_params('audiences/create_custom') ->
    [
        'ad_account_id',
        'AudienceCreateCustomRequest'
    ];
request_params('audiences/get') ->
    [
        'ad_account_id',
        'audience_id'
    ];
request_params('audiences/list') ->
    [
        'ad_account_id',
        'bookmark',
        'order',
        'page_size',
        'ownership_type'
    ];
request_params('audiences/update') ->
    [
        'ad_account_id',
        'audience_id',
        'AudienceUpdateRequest'
    ];
request_params('ads_credit/redeem') ->
    [
        'ad_account_id',
        'AdsCreditRedeemRequest'
    ];
request_params('ads_credits_discounts/get') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('billing_profiles/get') ->
    [
        'ad_account_id',
        'is_active',
        'bookmark',
        'page_size'
    ];
request_params('ssio_accounts/get') ->
    [
        'ad_account_id'
    ];
request_params('ssio_insertion_order/create') ->
    [
        'ad_account_id',
        'SSIOCreateInsertionOrderRequest'
    ];
request_params('ssio_insertion_order/edit') ->
    [
        'ad_account_id',
        'SSIOEditInsertionOrderRequest'
    ];
request_params('ssio_insertion_orders_status/get_by_ad_account') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('ssio_insertion_orders_status/get_by_pin_order_id') ->
    [
        'ad_account_id',
        'pin_order_id'
    ];
request_params('ssio_order_lines/get_by_ad_account') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'pin_order_id'
    ];
request_params('board_sections/create') ->
    [
        'board_id',
        'BoardSection',
        'ad_account_id'
    ];
request_params('board_sections/delete') ->
    [
        'board_id',
        'section_id',
        'ad_account_id'
    ];
request_params('board_sections/list') ->
    [
        'board_id',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('board_sections/list_pins') ->
    [
        'board_id',
        'section_id',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('board_sections/update') ->
    [
        'board_id',
        'section_id',
        'BoardSection',
        'ad_account_id'
    ];
request_params('boards/create') ->
    [
        'Board',
        'ad_account_id'
    ];
request_params('boards/delete') ->
    [
        'board_id',
        'ad_account_id'
    ];
request_params('boards/get') ->
    [
        'board_id',
        'ad_account_id'
    ];
request_params('boards/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'privacy'
    ];
request_params('boards/list_pins') ->
    [
        'board_id',
        'bookmark',
        'page_size',
        'creative_types',
        'ad_account_id',
        'pin_metrics'
    ];
request_params('boards/update') ->
    [
        'board_id',
        'BoardUpdate',
        'ad_account_id'
    ];
request_params('bulk_download/create') ->
    [
        'ad_account_id',
        'BulkDownloadRequest'
    ];
request_params('bulk_request/get') ->
    [
        'ad_account_id',
        'bulk_request_id',
        'include_details'
    ];
request_params('bulk_upsert/create') ->
    [
        'ad_account_id',
        'BulkUpsertRequest'
    ];
request_params('asset_group/create') ->
    [
        'business_id',
        'CreateAssetGroupBody'
    ];
request_params('asset_group/delete') ->
    [
        'business_id',
        'DeleteAssetGroupBody'
    ];
request_params('asset_group/update') ->
    [
        'business_id',
        'UpdateAssetGroupBody'
    ];
request_params('business_asset_members/get') ->
    [
        'business_id',
        'asset_id',
        'bookmark',
        'page_size',
        'start_index'
    ];
request_params('business_asset_partners/get') ->
    [
        'business_id',
        'asset_id',
        'start_index',
        'bookmark',
        'page_size'
    ];
request_params('business_assets/get') ->
    [
        'business_id',
        'permissions',
        'child_asset_id',
        'asset_group_id',
        'asset_type',
        'start_index',
        'bookmark',
        'page_size'
    ];
request_params('business_member_assets/get') ->
    [
        'business_id',
        'member_id',
        'asset_type',
        'start_index',
        'bookmark',
        'page_size'
    ];
request_params('business_members_asset_access/delete') ->
    [
        'business_id',
        'business_members_asset_access_delete_request'
    ];
request_params('business_members_asset_access/update') ->
    [
        'business_id',
        'UpdateMemberAssetAccessBody'
    ];
request_params('business_partner_asset_access/get') ->
    [
        'business_id',
        'partner_id',
        'partner_type',
        'asset_type',
        'start_index',
        'page_size',
        'bookmark'
    ];
request_params('delete_partner_asset_access_handler_impl') ->
    [
        'business_id',
        'DeletePartnerAssetAccessBody'
    ];
request_params('update_partner_asset_access_handler_impl') ->
    [
        'business_id',
        'UpdatePartnerAssetAccessBody'
    ];
request_params('asset_access_requests/create') ->
    [
        'business_id',
        'CreateAssetAccessRequestBody'
    ];
request_params('cancel_invites_or_requests') ->
    [
        'business_id',
        'CancelInvitesBody'
    ];
request_params('create_asset_invites') ->
    [
        'business_id',
        'CreateAssetInvitesRequest'
    ];
request_params('create_membership_or_partnership_invites') ->
    [
        'business_id',
        'CreateMembershipOrPartnershipInvitesBody'
    ];
request_params('get/invites') ->
    [
        'business_id',
        'is_member',
        'invite_status',
        'invite_type',
        'bookmark',
        'page_size'
    ];
request_params('respond_business_access_invites') ->
    [
        'AuthRespondInvitesBody'
    ];
request_params('delete_business_membership') ->
    [
        'business_id',
        'MembersToDeleteBody'
    ];
request_params('delete_business_partners') ->
    [
        'business_id',
        'DeletePartnersRequest'
    ];
request_params('get/business_employers') ->
    [
        'page_size',
        'bookmark'
    ];
request_params('get/business_members') ->
    [
        'business_id',
        'assets_summary',
        'business_roles',
        'member_ids',
        'start_index',
        'bookmark',
        'page_size'
    ];
request_params('get/business_partners') ->
    [
        'business_id',
        'assets_summary',
        'partner_type',
        'partner_ids',
        'start_index',
        'page_size',
        'bookmark'
    ];
request_params('update/business_memberships') ->
    [
        'business_id',
        'array'
    ];
request_params('campaign_targeting_analytics/get') ->
    [
        'ad_account_id',
        'campaign_ids',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
    ];
request_params('campaigns/analytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'campaign_ids',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];
request_params('campaigns/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('campaigns/get') ->
    [
        'ad_account_id',
        'campaign_id'
    ];
request_params('campaigns/list') ->
    [
        'ad_account_id',
        'campaign_ids',
        'entity_statuses',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('campaigns/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('catalogs/create') ->
    [
        'CatalogsCreateRequest',
        'ad_account_id'
    ];
request_params('catalogs/list') ->
    [
        'bookmark',
        'page_size',
        'ad_account_id'
    ];
request_params('catalogs_product_group_pins/list') ->
    [
        'product_group_id',
        'bookmark',
        'page_size',
        'ad_account_id',
        'pin_metrics'
    ];
request_params('catalogs_product_groups/create') ->
    [
        'multiple_product_groups_inner',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/create_many') ->
    [
        'array',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/delete') ->
    [
        'product_group_id',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/delete_many') ->
    [
        'id',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/get') ->
    [
        'product_group_id',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/list') ->
    [
        'id',
        'feed_id',
        'catalog_id',
        'bookmark',
        'page_size',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/product_counts_get') ->
    [
        'product_group_id',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/update') ->
    [
        'product_group_id',
        'catalogs_product_groups_update_request',
        'ad_account_id'
    ];
request_params('feed_processing_results/list') ->
    [
        'feed_id',
        'bookmark',
        'page_size',
        'ad_account_id'
    ];
request_params('feeds/create') ->
    [
        'feeds_create_request',
        'ad_account_id'
    ];
request_params('feeds/delete') ->
    [
        'feed_id',
        'ad_account_id'
    ];
request_params('feeds/get') ->
    [
        'feed_id',
        'ad_account_id'
    ];
request_params('feeds/ingest') ->
    [
        'feed_id',
        'ad_account_id'
    ];
request_params('feeds/list') ->
    [
        'bookmark',
        'page_size',
        'catalog_id',
        'ad_account_id'
    ];
request_params('feeds/update') ->
    [
        'feed_id',
        'feeds_update_request',
        'ad_account_id'
    ];
request_params('items_batch/get') ->
    [
        'batch_id',
        'ad_account_id'
    ];
request_params('items_batch/post') ->
    [
        'items_batch_post_request',
        'ad_account_id'
    ];
request_params('items/get') ->
    [
        'country',
        'language',
        'ad_account_id',
        'item_ids',
        'filters'
    ];
request_params('items_issues/list') ->
    [
        'processing_result_id',
        'bookmark',
        'page_size',
        'item_numbers',
        'item_validation_issue',
        'ad_account_id'
    ];
request_params('items/post') ->
    [
        'CatalogsItemsRequest',
        'ad_account_id'
    ];
request_params('products_by_product_group_filter/list') ->
    [
        'CatalogsListProductsByFilterRequest',
        'bookmark',
        'page_size',
        'ad_account_id',
        'pin_metrics'
    ];
request_params('reports/create') ->
    [
        'CatalogsReportParameters',
        'ad_account_id'
    ];
request_params('reports/get') ->
    [
        'token',
        'ad_account_id'
    ];
request_params('reports/stats') ->
    [
        'parameters',
        'ad_account_id',
        'page_size',
        'bookmark'
    ];
request_params('events/create') ->
    [
        'ad_account_id',
        'ConversionEvents',
        'test'
    ];
request_params('conversion_tags/create') ->
    [
        'ad_account_id',
        'ConversionTagCreate'
    ];
request_params('conversion_tags/get') ->
    [
        'ad_account_id',
        'conversion_tag_id'
    ];
request_params('conversion_tags/list') ->
    [
        'ad_account_id',
        'filter_deleted'
    ];
request_params('ocpm_eligible_conversion_tags/get') ->
    [
        'ad_account_id'
    ];
request_params('page_visit_conversion_tags/get') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('customer_lists/create') ->
    [
        'ad_account_id',
        'CustomerListRequest'
    ];
request_params('customer_lists/get') ->
    [
        'ad_account_id',
        'customer_list_id'
    ];
request_params('customer_lists/list') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('customer_lists/update') ->
    [
        'ad_account_id',
        'customer_list_id',
        'CustomerListUpdateRequest'
    ];
request_params('integrations_commerce/del') ->
    [
        'external_business_id'
    ];
request_params('integrations_commerce/get') ->
    [
        'external_business_id'
    ];
request_params('integrations_commerce/patch') ->
    [
        'external_business_id',
        'IntegrationRequestPatch'
    ];
request_params('integrations_commerce/post') ->
    [
        'IntegrationRequest'
    ];
request_params('integrations/get_by_id') ->
    [
        'id'
    ];
request_params('integrations/get_list') ->
    [
        'bookmark',
        'page_size'
    ];
request_params('integrations_logs/post') ->
    [
        'IntegrationLogsRequest'
    ];
request_params('country_keywords_metrics/get') ->
    [
        'ad_account_id',
        'country_code',
        'keywords'
    ];
request_params('keywords/create') ->
    [
        'ad_account_id',
        'KeywordsRequest'
    ];
request_params('keywords/get') ->
    [
        'ad_account_id',
        'campaign_id',
        'ad_group_id',
        'match_types',
        'page_size',
        'bookmark'
    ];
request_params('keywords/update') ->
    [
        'ad_account_id',
        'KeywordUpdateBody'
    ];
request_params('trending_keywords/list') ->
    [
        'region',
        'trend_type',
        'interests',
        'genders',
        'ages',
        'include_keywords',
        'normalize_against_group',
        'limit'
    ];
request_params('ad_accounts_subscriptions/del_by_id') ->
    [
        'ad_account_id',
        'subscription_id'
    ];
request_params('ad_accounts_subscriptions/get_by_id') ->
    [
        'ad_account_id',
        'subscription_id'
    ];
request_params('ad_accounts_subscriptions/get_list') ->
    [
        'ad_account_id',
        'page_size',
        'bookmark'
    ];
request_params('ad_accounts_subscriptions/post') ->
    [
        'ad_account_id',
        'AdAccountCreateSubscriptionRequest'
    ];
request_params('lead_form/get') ->
    [
        'ad_account_id',
        'lead_form_id'
    ];
request_params('lead_form_test/create') ->
    [
        'ad_account_id',
        'lead_form_id',
        'LeadFormTestRequest'
    ];
request_params('lead_forms/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('lead_forms/list') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('lead_forms/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('leads_export/create') ->
    [
        'ad_account_id',
        'LeadsExportCreateRequest'
    ];
request_params('leads_export/get') ->
    [
        'ad_account_id',
        'leads_export_id'
    ];
request_params('media/create') ->
    [
        'MediaUploadRequest'
    ];
request_params('media/get') ->
    [
        'media_id'
    ];
request_params('media/list') ->
    [
        'bookmark',
        'page_size'
    ];
request_params('oauth/token') ->
    [
        'grant_type'
    ];
request_params('order_lines/get') ->
    [
        'ad_account_id',
        'order_line_id'
    ];
request_params('order_lines/list') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('multi_pins/analytics') ->
    [
        'pin_ids',
        'start_date',
        'end_date',
        'metric_types',
        'app_types',
        'ad_account_id'
    ];
request_params('pins/analytics') ->
    [
        'pin_id',
        'start_date',
        'end_date',
        'metric_types',
        'app_types',
        'split_field',
        'ad_account_id'
    ];
request_params('pins/create') ->
    [
        'PinCreate',
        'ad_account_id'
    ];
request_params('pins/delete') ->
    [
        'pin_id',
        'ad_account_id'
    ];
request_params('pins/get') ->
    [
        'pin_id',
        'pin_metrics',
        'ad_account_id'
    ];
request_params('pins/list') ->
    [
        'bookmark',
        'page_size',
        'pin_filter',
        'include_protected_pins',
        'pin_type',
        'creative_types',
        'ad_account_id',
        'pin_metrics'
    ];
request_params('pins/save') ->
    [
        'pin_id',
        'pins_save_request',
        'ad_account_id'
    ];
request_params('pins/update') ->
    [
        'pin_id',
        'PinUpdate',
        'ad_account_id'
    ];
request_params('product_group_promotions/create') ->
    [
        'ad_account_id',
        'ProductGroupPromotionCreateRequest'
    ];
request_params('product_group_promotions/get') ->
    [
        'ad_account_id',
        'product_group_promotion_id'
    ];
request_params('product_group_promotions/list') ->
    [
        'ad_account_id',
        'product_group_promotion_ids',
        'entity_statuses',
        'ad_group_id',
        'page_size',
        'order',
        'bookmark'
    ];
request_params('product_group_promotions/update') ->
    [
        'ad_account_id',
        'ProductGroupPromotionUpdateRequest'
    ];
request_params('product_groups/analytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'product_group_ids',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];
request_params('ad_account_countries/get') ->
    [
    ];
request_params('delivery_metrics/get') ->
    [
        'report_type'
    ];
request_params('interest_targeting_options/get') ->
    [
        'interest_id'
    ];
request_params('lead_form_questions/get') ->
    [
    ];
request_params('metrics_ready_state/get') ->
    [
        'date'
    ];
request_params('targeting_options/get') ->
    [
        'targeting_type',
        'client_id',
        'oauth_signature',
        'timestamp',
        'ad_account_id'
    ];
request_params('search_partner_pins') ->
    [
        'term',
        'country_code',
        'bookmark',
        'locale',
        'limit'
    ];
request_params('search_user_boards/get') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'query'
    ];
request_params('search_user_pins/list') ->
    [
        'query',
        'ad_account_id',
        'bookmark'
    ];
request_params('targeting_template/create') ->
    [
        'ad_account_id',
        'TargetingTemplateCreate'
    ];
request_params('targeting_template/list') ->
    [
        'ad_account_id',
        'order',
        'include_sizing',
        'search_query',
        'page_size',
        'bookmark'
    ];
request_params('targeting_template/update') ->
    [
        'ad_account_id',
        'TargetingTemplateUpdateRequest'
    ];
request_params('terms_related/list') ->
    [
        'terms'
    ];
request_params('terms_suggested/list') ->
    [
        'term',
        'limit'
    ];
request_params('terms_of_service/get') ->
    [
        'ad_account_id',
        'include_html',
        'tos_type'
    ];
request_params('boards_user_follows/list') ->
    [
        'bookmark',
        'page_size',
        'explicit_following',
        'ad_account_id'
    ];
request_params('follow_user/update') ->
    [
        'username',
        'FollowUserRequest'
    ];
request_params('followers/list') ->
    [
        'bookmark',
        'page_size'
    ];
request_params('linked_business_accounts/get') ->
    [
    ];
request_params('unverify_website/delete') ->
    [
        'website'
    ];
request_params('user_account/analytics') ->
    [
        'start_date',
        'end_date',
        'from_claimed_content',
        'pin_format',
        'app_types',
        'content_type',
        'source',
        'metric_types',
        'split_field',
        'ad_account_id'
    ];
request_params('user_account/analytics/top_pins') ->
    [
        'start_date',
        'end_date',
        'sort_by',
        'from_claimed_content',
        'pin_format',
        'app_types',
        'content_type',
        'source',
        'metric_types',
        'num_of_pins',
        'created_in_last_n_days',
        'ad_account_id'
    ];
request_params('user_account/analytics/top_video_pins') ->
    [
        'start_date',
        'end_date',
        'sort_by',
        'from_claimed_content',
        'pin_format',
        'app_types',
        'content_type',
        'source',
        'metric_types',
        'num_of_pins',
        'created_in_last_n_days',
        'ad_account_id'
    ];
request_params('user_account/followed_interests') ->
    [
        'username',
        'bookmark',
        'page_size'
    ];
request_params('user_account/get') ->
    [
        'ad_account_id'
    ];
request_params('user_following/get') ->
    [
        'bookmark',
        'page_size',
        'feed_type',
        'explicit_following',
        'ad_account_id'
    ];
request_params('user_websites/get') ->
    [
        'bookmark',
        'page_size'
    ];
request_params('verify_website/update') ->
    [
        'UserWebsiteVerifyRequest',
        'ad_account_id'
    ];
request_params('website_verification/get') ->
    [
        'ad_account_id'
    ];
request_params(_) ->
    error(unknown_operation).

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) ->
    #{source => qs_val | binding | header | body, rules => [rule()]}.
request_param_info('ad_account/analytics', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_account/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_account/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_account/analytics', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('ad_account/analytics', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_account/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account/analytics', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'targeting_types') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'attribution_types') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_accounts/create', 'AdAccountCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdAccountCreateRequest">>},
            required
        ]
    };
request_param_info('ad_accounts/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ad_accounts/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ad_accounts/list', 'include_shared_accounts') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('analytics/create_mmm_report', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/create_mmm_report', 'CreateMMMReportRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateMMMReportRequest">>},
            required
        ]
    };
request_param_info('analytics/create_report', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/create_report', 'AdsAnalyticsCreateAsyncRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdsAnalyticsCreateAsyncRequest">>},
            required
        ]
    };
request_param_info('analytics/create_template_report', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/create_template_report', 'template_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/create_template_report', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            not_required
        ]
    };
request_param_info('analytics/create_template_report', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            not_required
        ]
    };
request_param_info('analytics/create_template_report', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('analytics/get_mmm_report', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/get_mmm_report', 'token') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('analytics/get_report', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/get_report', 'token') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('sandbox/delete', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('templates/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('templates/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('templates/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('templates/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ad_groups/analytics', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_groups/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_groups/analytics', 'ad_group_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_groups/analytics', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('ad_groups/analytics', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_groups/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups/analytics', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('ad_groups/audience_sizing', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups/audience_sizing', 'AdGroupAudienceSizingRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdGroupAudienceSizingRequest">>},
            not_required
        ]
    };
request_param_info('ad_groups_bid_floor/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_bid_floor/get', 'BidFloorRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BidFloorRequest">>},
            required
        ]
    };
request_param_info('ad_groups/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/AdGroupCreateRequest">>},
            required
        ]
    };
request_param_info('ad_groups/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups/get', 'ad_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups/list', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_groups/list', 'ad_group_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_groups/list', 'entity_statuses') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };
request_param_info('ad_groups/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ad_groups/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('ad_groups/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ad_groups/list', 'translate_interests_to_names') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'ad_group_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'targeting_types') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'attribution_types') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_groups/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups/update', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/AdGroupUpdateRequest">>},
            required
        ]
    };
request_param_info('ad_previews/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_previews/create', 'AdPreviewRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdPreviewRequest">>},
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'ad_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'targeting_types') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'attribution_types') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/analytics', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ads/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ads/analytics', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('ads/analytics', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ads/analytics', 'ad_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ads/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ads/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ads/analytics', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('ads/analytics', 'pin_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/analytics', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/AdCreateRequest">>},
            required
        ]
    };
request_param_info('ads/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads/get', 'ad_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads/list', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/list', 'ad_group_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/list', 'ad_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/list', 'entity_statuses') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };
request_param_info('ads/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ads/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('ads/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ads/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads/update', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/AdUpdateRequest">>},
            required
        ]
    };
request_param_info('advanced_auction_items_get/post', 'AdvancedAuctionItemsGetRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdvancedAuctionItemsGetRequest">>},
            required
        ]
    };
request_param_info('advanced_auction_items_get/post', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('advanced_auction_items_submit/post', 'AdvancedAuctionItemsSubmitRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdvancedAuctionItemsSubmitRequest">>},
            required
        ]
    };
request_param_info('advanced_auction_items_submit/post', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('audience_insights/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audience_insights/get', 'audience_insight_type') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('audience_insights_scope_and_type/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_audiences_shared_accounts/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_audiences_shared_accounts/list', 'audience_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_audiences_shared_accounts/list', 'account_type') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_accounts_audiences_shared_accounts/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ad_accounts_audiences_shared_accounts/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('business_account_audiences_shared_accounts/list', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_account_audiences_shared_accounts/list', 'audience_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_account_audiences_shared_accounts/list', 'account_type') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('business_account_audiences_shared_accounts/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('business_account_audiences_shared_accounts/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('shared_audiences_for_business/list', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('shared_audiences_for_business/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('shared_audiences_for_business/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('shared_audiences_for_business/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('update_ad_account_to_ad_account_shared_audience', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('update_ad_account_to_ad_account_shared_audience', 'SharedAudience') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SharedAudience">>},
            required
        ]
    };
request_param_info('update_ad_account_to_business_shared_audience', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('update_ad_account_to_business_shared_audience', 'BusinessSharedAudience') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BusinessSharedAudience">>},
            required
        ]
    };
request_param_info('update_business_to_ad_account_shared_audience', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('update_business_to_ad_account_shared_audience', 'SharedAudience') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SharedAudience">>},
            required
        ]
    };
request_param_info('update_business_to_business_shared_audience', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('update_business_to_business_shared_audience', 'BusinessSharedAudience') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BusinessSharedAudience">>},
            required
        ]
    };
request_param_info('audiences/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audiences/create', 'AudienceCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AudienceCreateRequest">>},
            required
        ]
    };
request_param_info('audiences/create_custom', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audiences/create_custom', 'AudienceCreateCustomRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AudienceCreateCustomRequest">>},
            required
        ]
    };
request_param_info('audiences/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audiences/get', 'audience_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audiences/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audiences/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('audiences/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('audiences/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('audiences/list', 'ownership_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['OWNED', 'RECEIVED'] },
            not_required
        ]
    };
request_param_info('audiences/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audiences/update', 'audience_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('audiences/update', 'AudienceUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AudienceUpdateRequest">>},
            not_required
        ]
    };
request_param_info('ads_credit/redeem', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads_credit/redeem', 'AdsCreditRedeemRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdsCreditRedeemRequest">>},
            required
        ]
    };
request_param_info('ads_credits_discounts/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ads_credits_discounts/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ads_credits_discounts/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('billing_profiles/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('billing_profiles/get', 'is_active') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            required
        ]
    };
request_param_info('billing_profiles/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('billing_profiles/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ssio_accounts/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ssio_insertion_order/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ssio_insertion_order/create', 'SSIOCreateInsertionOrderRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SSIOCreateInsertionOrderRequest">>},
            required
        ]
    };
request_param_info('ssio_insertion_order/edit', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ssio_insertion_order/edit', 'SSIOEditInsertionOrderRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SSIOEditInsertionOrderRequest">>},
            required
        ]
    };
request_param_info('ssio_insertion_orders_status/get_by_ad_account', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ssio_insertion_orders_status/get_by_ad_account', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ssio_insertion_orders_status/get_by_ad_account', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ssio_insertion_orders_status/get_by_pin_order_id', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ssio_insertion_orders_status/get_by_pin_order_id', 'pin_order_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('ssio_order_lines/get_by_ad_account', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ssio_order_lines/get_by_ad_account', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ssio_order_lines/get_by_ad_account', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ssio_order_lines/get_by_ad_account', 'pin_order_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('board_sections/create', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/create', 'BoardSection') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BoardSection">>},
            required
        ]
    };
request_param_info('board_sections/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('board_sections/delete', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/delete', 'section_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/delete', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('board_sections/list', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('board_sections/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('board_sections/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('board_sections/list_pins', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/list_pins', 'section_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/list_pins', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('board_sections/list_pins', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('board_sections/list_pins', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('board_sections/update', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/update', 'section_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/update', 'BoardSection') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BoardSection">>},
            required
        ]
    };
request_param_info('board_sections/update', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('boards/create', 'Board') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/Board">>},
            required
        ]
    };
request_param_info('boards/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('boards/delete', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('boards/delete', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('boards/get', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('boards/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('boards/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('boards/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('boards/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('boards/list', 'privacy') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'PROTECTED', 'PUBLIC', 'SECRET', 'PUBLIC_AND_SECRET'] },
            not_required
        ]
    };
request_param_info('boards/list_pins', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('boards/list_pins', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('boards/list_pins', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('boards/list_pins', 'creative_types') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['REGULAR', 'VIDEO', 'SHOPPING', 'CAROUSEL', 'MAX_VIDEO', 'SHOP_THE_PIN', 'COLLECTION', 'IDEA'] },
            not_required
        ]
    };
request_param_info('boards/list_pins', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('boards/list_pins', 'pin_metrics') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('boards/update', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('boards/update', 'BoardUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BoardUpdate">>},
            required
        ]
    };
request_param_info('boards/update', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('bulk_download/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('bulk_download/create', 'BulkDownloadRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BulkDownloadRequest">>},
            required
        ]
    };
request_param_info('bulk_request/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('bulk_request/get', 'bulk_request_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('bulk_request/get', 'include_details') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('bulk_upsert/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('bulk_upsert/create', 'BulkUpsertRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BulkUpsertRequest">>},
            required
        ]
    };
request_param_info('asset_group/create', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('asset_group/create', 'CreateAssetGroupBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateAssetGroupBody">>},
            required
        ]
    };
request_param_info('asset_group/delete', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('asset_group/delete', 'DeleteAssetGroupBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/DeleteAssetGroupBody">>},
            required
        ]
    };
request_param_info('asset_group/update', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('asset_group/update', 'UpdateAssetGroupBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/UpdateAssetGroupBody">>},
            required
        ]
    };
request_param_info('business_asset_members/get', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_asset_members/get', 'asset_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_asset_members/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('business_asset_members/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('business_asset_members/get', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('business_asset_partners/get', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_asset_partners/get', 'asset_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_asset_partners/get', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('business_asset_partners/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('business_asset_partners/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('business_assets/get', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_assets/get', 'permissions') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('business_assets/get', 'child_asset_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('business_assets/get', 'asset_group_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('business_assets/get', 'asset_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['AD_ACCOUNT', 'PROFILE', 'ASSET_GROUP'] },
            not_required
        ]
    };
request_param_info('business_assets/get', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('business_assets/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('business_assets/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_member_assets/get', 'member_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_member_assets/get', 'asset_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['AD_ACCOUNT', 'PROFILE', 'ASSET_GROUP'] },
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('business_members_asset_access/delete', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_members_asset_access/delete', 'business_members_asset_access_delete_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/business_members_asset_access_delete_request">>},
            required
        ]
    };
request_param_info('business_members_asset_access/update', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_members_asset_access/update', 'UpdateMemberAssetAccessBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/UpdateMemberAssetAccessBody">>},
            required
        ]
    };
request_param_info('business_partner_asset_access/get', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_partner_asset_access/get', 'partner_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('business_partner_asset_access/get', 'partner_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'asset_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['AD_ACCOUNT', 'PROFILE', 'ASSET_GROUP'] },
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('delete_partner_asset_access_handler_impl', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('delete_partner_asset_access_handler_impl', 'DeletePartnerAssetAccessBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/DeletePartnerAssetAccessBody">>},
            required
        ]
    };
request_param_info('update_partner_asset_access_handler_impl', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('update_partner_asset_access_handler_impl', 'UpdatePartnerAssetAccessBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/UpdatePartnerAssetAccessBody">>},
            required
        ]
    };
request_param_info('asset_access_requests/create', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('asset_access_requests/create', 'CreateAssetAccessRequestBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateAssetAccessRequestBody">>},
            required
        ]
    };
request_param_info('cancel_invites_or_requests', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('cancel_invites_or_requests', 'CancelInvitesBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CancelInvitesBody">>},
            required
        ]
    };
request_param_info('create_asset_invites', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('create_asset_invites', 'CreateAssetInvitesRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateAssetInvitesRequest">>},
            required
        ]
    };
request_param_info('create_membership_or_partnership_invites', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('create_membership_or_partnership_invites', 'CreateMembershipOrPartnershipInvitesBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateMembershipOrPartnershipInvitesBody">>},
            required
        ]
    };
request_param_info('get/invites', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('get/invites', 'is_member') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('get/invites', 'invite_status') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['PENDING', 'EXPIRED'] },
            not_required
        ]
    };
request_param_info('get/invites', 'invite_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('get/invites', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('get/invites', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('respond_business_access_invites', 'AuthRespondInvitesBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AuthRespondInvitesBody">>},
            required
        ]
    };
request_param_info('delete_business_membership', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('delete_business_membership', 'MembersToDeleteBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/MembersToDeleteBody">>},
            required
        ]
    };
request_param_info('delete_business_partners', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('delete_business_partners', 'DeletePartnersRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/DeletePartnersRequest">>},
            required
        ]
    };
request_param_info('get/business_employers', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('get/business_employers', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('get/business_members', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('get/business_members', 'assets_summary') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('get/business_members', 'business_roles') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('get/business_members', 'member_ids') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 500},
            not_required
        ]
    };
request_param_info('get/business_members', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('get/business_members', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('get/business_members', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('get/business_partners', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('get/business_partners', 'assets_summary') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('get/business_partners', 'partner_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('get/business_partners', 'partner_ids') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 500},
            not_required
        ]
    };
request_param_info('get/business_partners', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('get/business_partners', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('get/business_partners', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('update/business_memberships', 'business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 20},
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('update/business_memberships', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/UpdateMemberBusinessRoleBody">>},
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'targeting_types') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'attribution_types') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('campaigns/analytics', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaigns/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('campaigns/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('campaigns/analytics', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('campaigns/analytics', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('campaigns/analytics', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('campaigns/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaigns/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaigns/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaigns/analytics', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('campaigns/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaigns/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/CampaignCreateRequest">>},
            required
        ]
    };
request_param_info('campaigns/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaigns/get', 'campaign_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaigns/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaigns/list', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('campaigns/list', 'entity_statuses') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };
request_param_info('campaigns/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('campaigns/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('campaigns/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('campaigns/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaigns/update', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/CampaignUpdateRequest">>},
            required
        ]
    };
request_param_info('catalogs/create', 'CatalogsCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsCreateRequest">>},
            required
        ]
    };
request_param_info('catalogs/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('catalogs/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('catalogs/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_group_pins/list', 'product_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_product_group_pins/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('catalogs_product_group_pins/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('catalogs_product_group_pins/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_group_pins/list', 'pin_metrics') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/create', 'multiple_product_groups_inner') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/multiple_product_groups_inner">>},
            required
        ]
    };
request_param_info('catalogs_product_groups/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/create_many', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/multiple_product_groups_inner">>},
            required
        ]
    };
request_param_info('catalogs_product_groups/create_many', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/delete', 'product_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_product_groups/delete', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/delete_many', 'id') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('catalogs_product_groups/delete_many', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/get', 'product_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_product_groups/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/list', 'id') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('catalogs_product_groups/list', 'feed_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/list', 'catalog_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/product_counts_get', 'product_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_product_groups/product_counts_get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_product_groups/update', 'product_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_product_groups/update', 'catalogs_product_groups_update_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/catalogs_product_groups_update_request">>},
            required
        ]
    };
request_param_info('catalogs_product_groups/update', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feed_processing_results/list', 'feed_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('feed_processing_results/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('feed_processing_results/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('feed_processing_results/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feeds/create', 'feeds_create_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/feeds_create_request">>},
            required
        ]
    };
request_param_info('feeds/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feeds/delete', 'feed_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('feeds/delete', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feeds/get', 'feed_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('feeds/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feeds/ingest', 'feed_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('feeds/ingest', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feeds/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('feeds/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('feeds/list', 'catalog_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feeds/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('feeds/update', 'feed_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('feeds/update', 'feeds_update_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/feeds_update_request">>},
            required
        ]
    };
request_param_info('feeds/update', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('items_batch/get', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('items_batch/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('items_batch/post', 'items_batch_post_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/items_batch_post_request">>},
            required
        ]
    };
request_param_info('items_batch/post', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('items/get', 'country') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('items/get', 'language') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('items/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('items/get', 'item_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('items/get', 'filters') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('items_issues/list', 'processing_result_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('items_issues/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('items_issues/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('items_issues/list', 'item_numbers') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('items_issues/list', 'item_validation_issue') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('items_issues/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('items/post', 'CatalogsItemsRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsItemsRequest">>},
            required
        ]
    };
request_param_info('items/post', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('products_by_product_group_filter/list', 'CatalogsListProductsByFilterRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsListProductsByFilterRequest">>},
            required
        ]
    };
request_param_info('products_by_product_group_filter/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('products_by_product_group_filter/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('products_by_product_group_filter/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('products_by_product_group_filter/list', 'pin_metrics') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('reports/create', 'CatalogsReportParameters') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsReportParameters">>},
            required
        ]
    };
request_param_info('reports/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('reports/get', 'token') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('reports/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('reports/stats', 'parameters') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('reports/stats', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('reports/stats', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('reports/stats', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('events/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('events/create', 'ConversionEvents') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ConversionEvents">>},
            required
        ]
    };
request_param_info('events/create', 'test') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('conversion_tags/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_tags/create', 'ConversionTagCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ConversionTagCreate">>},
            required
        ]
    };
request_param_info('conversion_tags/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_tags/get', 'conversion_tag_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_tags/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_tags/list', 'filter_deleted') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('ocpm_eligible_conversion_tags/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('page_visit_conversion_tags/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('page_visit_conversion_tags/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('page_visit_conversion_tags/get', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('page_visit_conversion_tags/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('customer_lists/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_lists/create', 'CustomerListRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CustomerListRequest">>},
            required
        ]
    };
request_param_info('customer_lists/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_lists/get', 'customer_list_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_lists/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_lists/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('customer_lists/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('customer_lists/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('customer_lists/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_lists/update', 'customer_list_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_lists/update', 'CustomerListUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CustomerListUpdateRequest">>},
            required
        ]
    };
request_param_info('integrations_commerce/del', 'external_business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('integrations_commerce/get', 'external_business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('integrations_commerce/patch', 'external_business_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('integrations_commerce/patch', 'IntegrationRequestPatch') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/IntegrationRequestPatch">>},
            not_required
        ]
    };
request_param_info('integrations_commerce/post', 'IntegrationRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/IntegrationRequest">>},
            not_required
        ]
    };
request_param_info('integrations/get_by_id', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('integrations/get_list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('integrations/get_list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('integrations_logs/post', 'IntegrationLogsRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/IntegrationLogsRequest">>},
            required
        ]
    };
request_param_info('country_keywords_metrics/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('country_keywords_metrics/get', 'country_code') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('country_keywords_metrics/get', 'keywords') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('keywords/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('keywords/create', 'KeywordsRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/KeywordsRequest">>},
            required
        ]
    };
request_param_info('keywords/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('keywords/get', 'campaign_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('keywords/get', 'ad_group_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('keywords/get', 'match_types') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('keywords/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('keywords/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('keywords/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('keywords/update', 'KeywordUpdateBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/KeywordUpdateBody">>},
            required
        ]
    };
request_param_info('trending_keywords/list', 'region') ->
    #{
        source => binding,
        rules => [
            required
        ]
    };
request_param_info('trending_keywords/list', 'trend_type') ->
    #{
        source => binding,
        rules => [
            required
        ]
    };
request_param_info('trending_keywords/list', 'interests') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['animals', 'architecture', 'art', 'beauty', 'childrens_fashion', 'design', 'diy_and_crafts', 'education', 'electronics', 'entertainment', 'event_planning', 'finance', 'food_and_drinks', 'gardening', 'health', 'home_decor', 'mens_fashion', 'parenting', 'quotes', 'sport', 'travel', 'vehicles', 'wedding', 'womens_fashion'] },
            not_required
        ]
    };
request_param_info('trending_keywords/list', 'genders') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['female', 'male', 'unknown'] },
            not_required
        ]
    };
request_param_info('trending_keywords/list', 'ages') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['18-24', '25-34', '35-44', '45-49', '50-54', '55-64', '65+'] },
            not_required
        ]
    };
request_param_info('trending_keywords/list', 'include_keywords') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trending_keywords/list', 'normalize_against_group') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('trending_keywords/list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 50},
            {min, 1},
            not_required
        ]
    };
request_param_info('ad_accounts_subscriptions/del_by_id', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_subscriptions/del_by_id', 'subscription_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_subscriptions/get_by_id', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_subscriptions/get_by_id', 'subscription_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_subscriptions/get_list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_subscriptions/get_list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('ad_accounts_subscriptions/get_list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ad_accounts_subscriptions/post', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_accounts_subscriptions/post', 'AdAccountCreateSubscriptionRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdAccountCreateSubscriptionRequest">>},
            required
        ]
    };
request_param_info('lead_form/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('lead_form/get', 'lead_form_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('lead_form_test/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('lead_form_test/create', 'lead_form_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('lead_form_test/create', 'LeadFormTestRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LeadFormTestRequest">>},
            required
        ]
    };
request_param_info('lead_forms/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('lead_forms/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/LeadFormCreateRequest">>},
            required
        ]
    };
request_param_info('lead_forms/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('lead_forms/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('lead_forms/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('lead_forms/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('lead_forms/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('lead_forms/update', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/LeadFormUpdateRequest">>},
            required
        ]
    };
request_param_info('leads_export/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('leads_export/create', 'LeadsExportCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LeadsExportCreateRequest">>},
            required
        ]
    };
request_param_info('leads_export/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('leads_export/get', 'leads_export_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('media/create', 'MediaUploadRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/MediaUploadRequest">>},
            required
        ]
    };
request_param_info('media/get', 'media_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('media/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('media/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('oauth/token', 'grant_type') ->
    #{
        source => body,
        rules => [
            {type, binary},
            {enum, ['authorization_code', 'refresh_token', 'client_credentials'] },
            required
        ]
    };
request_param_info('order_lines/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('order_lines/get', 'order_line_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('order_lines/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('order_lines/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('order_lines/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('order_lines/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('multi_pins/analytics', 'pin_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('multi_pins/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('multi_pins/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('multi_pins/analytics', 'metric_types') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('multi_pins/analytics', 'app_types') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };
request_param_info('multi_pins/analytics', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('pins/analytics', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pins/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('pins/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('pins/analytics', 'metric_types') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('pins/analytics', 'app_types') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };
request_param_info('pins/analytics', 'split_field') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['NO_SPLIT', 'APP_TYPE'] },
            not_required
        ]
    };
request_param_info('pins/analytics', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('pins/create', 'PinCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/PinCreate">>},
            required
        ]
    };
request_param_info('pins/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('pins/delete', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pins/delete', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('pins/get', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pins/get', 'pin_metrics') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('pins/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('pins/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pins/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('pins/list', 'pin_filter') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['exclude_native', 'exclude_repins', 'has_been_promoted'] },
            not_required
        ]
    };
request_param_info('pins/list', 'include_protected_pins') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('pins/list', 'pin_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['PRIVATE'] },
            not_required
        ]
    };
request_param_info('pins/list', 'creative_types') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['REGULAR', 'VIDEO', 'SHOPPING', 'CAROUSEL', 'MAX_VIDEO', 'SHOP_THE_PIN', 'COLLECTION', 'IDEA'] },
            not_required
        ]
    };
request_param_info('pins/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('pins/list', 'pin_metrics') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('pins/save', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pins/save', 'pins_save_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/pins_save_request">>},
            required
        ]
    };
request_param_info('pins/save', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('pins/update', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pins/update', 'PinUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/PinUpdate">>},
            required
        ]
    };
request_param_info('pins/update', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('product_group_promotions/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_group_promotions/create', 'ProductGroupPromotionCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProductGroupPromotionCreateRequest">>},
            required
        ]
    };
request_param_info('product_group_promotions/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_group_promotions/get', 'product_group_promotion_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_group_promotions/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_group_promotions/list', 'product_group_promotion_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('product_group_promotions/list', 'entity_statuses') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };
request_param_info('product_group_promotions/list', 'ad_group_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('product_group_promotions/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('product_group_promotions/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('product_group_promotions/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('product_group_promotions/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_group_promotions/update', 'ProductGroupPromotionUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProductGroupPromotionUpdateRequest">>},
            required
        ]
    };
request_param_info('product_groups/analytics', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_groups/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('product_groups/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('product_groups/analytics', 'product_group_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('product_groups/analytics', 'columns') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'PAID_VIDEO_VIEWABLE_RATE', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_PIN_RESULT_OPEN', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };
request_param_info('product_groups/analytics', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('product_groups/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('product_groups/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('product_groups/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('product_groups/analytics', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };
request_param_info('delivery_metrics/get', 'report_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['SYNC', 'ASYNC'] },
            not_required
        ]
    };
request_param_info('interest_targeting_options/get', 'interest_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('metrics_ready_state/get', 'date') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {pattern, "^(\\d{4})-(\\d{2})-(\\d{2})$"},
            required
        ]
    };
request_param_info('targeting_options/get', 'targeting_type') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {enum, ['APPTYPE', 'GENDER', 'LOCALE', 'AGE_BUCKET', 'LOCATION', 'GEO', 'INTEREST', 'KEYWORD', 'AUDIENCE_INCLUDE', 'AUDIENCE_EXCLUDE'] },
            required
        ]
    };
request_param_info('targeting_options/get', 'client_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('targeting_options/get', 'oauth_signature') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('targeting_options/get', 'timestamp') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {pattern, "\\d+"},
            not_required
        ]
    };
request_param_info('targeting_options/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('search_partner_pins', 'term') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('search_partner_pins', 'country_code') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('search_partner_pins', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('search_partner_pins', 'locale') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('search_partner_pins', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 50},
            {min, 1},
            not_required
        ]
    };
request_param_info('search_user_boards/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('search_user_boards/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('search_user_boards/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('search_user_boards/get', 'query') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('search_user_pins/list', 'query') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('search_user_pins/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('search_user_pins/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('targeting_template/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('targeting_template/create', 'TargetingTemplateCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/TargetingTemplateCreate">>},
            required
        ]
    };
request_param_info('targeting_template/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('targeting_template/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };
request_param_info('targeting_template/list', 'include_sizing') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('targeting_template/list', 'search_query') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('targeting_template/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('targeting_template/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('targeting_template/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('targeting_template/update', 'TargetingTemplateUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/TargetingTemplateUpdateRequest">>},
            required
        ]
    };
request_param_info('terms_related/list', 'terms') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('terms_suggested/list', 'term') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('terms_suggested/list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 10},
            {min, 1},
            not_required
        ]
    };
request_param_info('terms_of_service/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('terms_of_service/get', 'include_html') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('terms_of_service/get', 'tos_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('boards_user_follows/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('boards_user_follows/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('boards_user_follows/list', 'explicit_following') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('boards_user_follows/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('follow_user/update', 'username') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "(?!^\\d+$)^.+$"},
            required
        ]
    };
request_param_info('follow_user/update', 'FollowUserRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/FollowUserRequest">>},
            required
        ]
    };
request_param_info('followers/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('followers/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('unverify_website/delete', 'website') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('user_account/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('user_account/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('user_account/analytics', 'from_claimed_content') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['OTHER', 'CLAIMED', 'BOTH'] },
            not_required
        ]
    };
request_param_info('user_account/analytics', 'pin_format') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'ORGANIC_IMAGE', 'ORGANIC_PRODUCT', 'ORGANIC_VIDEO', 'ADS_STANDARD', 'ADS_PRODUCT', 'ADS_VIDEO', 'ADS_IDEA'] },
            not_required
        ]
    };
request_param_info('user_account/analytics', 'app_types') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };
request_param_info('user_account/analytics', 'content_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'PAID', 'ORGANIC'] },
            not_required
        ]
    };
request_param_info('user_account/analytics', 'source') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'YOUR_PINS', 'OTHER_PINS'] },
            not_required
        ]
    };
request_param_info('user_account/analytics', 'metric_types') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['ENGAGEMENT', 'ENGAGEMENT_RATE', 'IMPRESSION', 'OUTBOUND_CLICK', 'OUTBOUND_CLICK_RATE', 'PIN_CLICK', 'PIN_CLICK_RATE', 'SAVE', 'SAVE_RATE'] },
            not_required
        ]
    };
request_param_info('user_account/analytics', 'split_field') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['NO_SPLIT', 'APP_TYPE', 'OWNED_CONTENT', 'SOURCE', 'PIN_FORMAT'] },
            not_required
        ]
    };
request_param_info('user_account/analytics', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'sort_by') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ENGAGEMENT', 'IMPRESSION', 'OUTBOUND_CLICK', 'PIN_CLICK', 'SAVE'] },
            required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'from_claimed_content') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['OTHER', 'CLAIMED', 'BOTH'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'pin_format') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'ORGANIC_IMAGE', 'ORGANIC_PRODUCT', 'ORGANIC_VIDEO', 'ADS_STANDARD', 'ADS_PRODUCT', 'ADS_VIDEO', 'ADS_IDEA'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'app_types') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'content_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'PAID', 'ORGANIC'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'source') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'YOUR_PINS', 'OTHER_PINS'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'metric_types') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['ENGAGEMENT', 'ENGAGEMENT_RATE', 'IMPRESSION', 'OUTBOUND_CLICK', 'OUTBOUND_CLICK_RATE', 'PIN_CLICK', 'PIN_CLICK_RATE', 'SAVE', 'SAVE_RATE'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'num_of_pins') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 50},
            {min, 1},
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'created_in_last_n_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['30'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_pins', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'sort_by') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['IMPRESSION', 'SAVE', 'OUTBOUND_CLICK', 'VIDEO_MRC_VIEW', 'VIDEO_AVG_WATCH_TIME', 'VIDEO_V50_WATCH_TIME', 'QUARTILE_95_PERCENT_VIEW', 'VIDEO_10S_VIEW', 'VIDEO_START'] },
            required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'from_claimed_content') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['OTHER', 'CLAIMED', 'BOTH'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'pin_format') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'ORGANIC_IMAGE', 'ORGANIC_PRODUCT', 'ORGANIC_VIDEO', 'ADS_STANDARD', 'ADS_PRODUCT', 'ADS_VIDEO', 'ADS_IDEA'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'app_types') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'content_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'PAID', 'ORGANIC'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'source') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['ALL', 'YOUR_PINS', 'OTHER_PINS'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'metric_types') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['IMPRESSION', 'SAVE', 'VIDEO_MRC_VIEW', 'VIDEO_AVG_WATCH_TIME', 'VIDEO_V50_WATCH_TIME', 'QUARTILE_95_PERCENT_VIEW', 'VIDEO_10S_VIEW', 'VIDEO_START', 'OUTBOUND_CLICK'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'num_of_pins') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 50},
            {min, 1},
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'created_in_last_n_days') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {enum, ['30'] },
            not_required
        ]
    };
request_param_info('user_account/analytics/top_video_pins', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('user_account/followed_interests', 'username') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "(?!^\\d+$)^.+$"},
            required
        ]
    };
request_param_info('user_account/followed_interests', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('user_account/followed_interests', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('user_account/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('user_following/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('user_following/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('user_following/get', 'feed_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('user_following/get', 'explicit_following') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('user_following/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('user_websites/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('user_websites/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('verify_website/update', 'UserWebsiteVerifyRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/UserWebsiteVerifyRequest">>},
            required
        ]
    };
request_param_info('verify_website/update', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('website_verification/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request_params(
        operation_id(), [request_param()], cowboy_req:req(), jesse_state:state(), map()) ->
    {ok, map(), cowboy_req:req()} | {error, _, cowboy_req:req()}.
populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};
populate_request_params(OperationID, [ReqParamName | T], Req0, ValidatorState, Model0) ->
    case populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) of
        {ok, V, Req} ->
            Model = maps:put(ReqParamName, V, Model0),
            populate_request_params(OperationID, T, Req, ValidatorState, Model);
        Error ->
            Error
    end.

-spec populate_request_param(
        operation_id(), request_param(), cowboy_req:req(), jesse_state:state()) ->
    {ok, term(), cowboy_req:req()} | {error, term(), cowboy_req:req()}.
populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, ReqParamName),
    case get_value(Source, ReqParamName, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, ReqParamName, Value, ValidatorState) of
                {ok, Result} -> {ok, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

validate_response_body(list, ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, Item, ReturnBaseType, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, Body, ReturnBaseType, ValidatorState).

-spec validate(rule(), term(), request_param(), jesse_state:state()) ->
    ok | {ok, term()}.
validate(required, undefined, ReqParamName, _) ->
    validation_error(required, ReqParamName, undefined);
validate(required, _Value, _, _) ->
    ok;
validate(not_required, _Value, _, _) ->
    ok;
validate(_, undefined, _, _) ->
    ok;
validate({type, boolean}, Value, _, _) when is_boolean(Value) ->
    ok;
validate({type, integer}, Value, _, _) when is_integer(Value) ->
    ok;
validate({type, float}, Value, _, _) when is_float(Value) ->
    ok;
validate({type, binary}, Value, _, _) when is_binary(Value) ->
    ok;
validate({max, Max}, Value, _, _) when Value =< Max ->
    ok;
validate({min, Min}, Value, _, _) when Min =< Value ->
    ok;
validate({exclusive_max, Max}, Value, _, _) when Value < Max ->
    ok;
validate({exclusive_min, Min}, Value, _, _) when Min < Value ->
    ok;
validate({max_length, MaxLength}, Value, _, _) when is_binary(Value), byte_size(Value) =< MaxLength ->
    ok;
validate({min_length, MinLength}, Value, _, _) when is_binary(Value), MinLength =< byte_size(Value) ->
    ok;
validate(Rule = {type, byte}, Value, ReqParamName, _) when is_binary(Value) ->
    try base64:decode(Value) of
        Decoded -> {ok, Decoded}
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, boolean}, Value, ReqParamName, _) when is_binary(Value) ->
    case to_binary(string:lowercase(Value)) of
        <<"true">> -> {ok, true};
        <<"false">> -> {ok, false};
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, integer}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_integer(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, float}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, date}, Value, ReqParamName, _) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, datetime}, Value, ReqParamName, _) ->
    try calendar:rfc3339_to_system_time(binary_to_list(Value)) of
        _ -> ok
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {enum, Values}, Value, ReqParamName, _) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, ReqParamName, Value)
        end
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {pattern, Pattern}, Value, ReqParamName, _) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(schema, Value, ReqParamName, ValidatorState) ->
    Definition = iolist_to_binary(["#/components/schemas/", atom_to_binary(ReqParamName, utf8)]),
    validate({schema, object, Definition}, Value, ReqParamName, ValidatorState);
validate({schema, list, Definition}, Value, ReqParamName, ValidatorState) ->
    lists:foreach(
      fun(Item) ->
              validate({schema, object, Definition}, Item, ReqParamName, ValidatorState)
      end, Value);
validate(Rule = {schema, object, Definition}, Value, ReqParamName, ValidatorState) ->
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, ReqParamName, Value, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, ReqParamName, Value, Info)
    end;
validate(Rule, Value, ReqParamName, _) ->
    validation_error(Rule, ReqParamName, Value).

-spec validation_error(rule(), request_param(), term()) -> no_return().
validation_error(ViolatedRule, Name, Value) ->
    validation_error(ViolatedRule, Name, Value, #{}).

-spec validation_error(rule(), request_param(), term(), Info :: #{_ := _}) -> no_return().
validation_error(ViolatedRule, Name, Value, Info) ->
    throw({wrong_param, Name, Value, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, request_param(), cowboy_req:req()) ->
    {any(), cowboy_req:req()} |
    {error, any(), cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = read_entire_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;
get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = get_opt(to_qs(Name), QS),
    {Value, Req};
get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value = maps:get(to_header(Name), Headers, undefined),
    {Value, Req};
get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(Name, Req),
    {Value, Req}.

-spec read_entire_body(cowboy_req:req()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Req) ->
    read_entire_body(Req, []).

-spec read_entire_body(cowboy_req:req(), iodata()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Request, Acc) -> % {
    case cowboy_req:read_body(Request) of
        {ok, Data, NewRequest} ->
            {ok, iolist_to_binary(lists:reverse([Data | Acc])), NewRequest};
        {more, Data, NewRequest} ->
            read_entire_body(NewRequest, [Data | Acc])
    end.

prepare_body(<<>>) ->
    <<>>;
prepare_body(Body) ->
    try
        json:decode(Body)
    catch
        error:Error ->
            {error, {invalid_json, Body, Error}}
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

-spec prepare_param([rule()], request_param(), term(), jesse_state:state()) ->
    {ok, term()} | {error, Reason :: any()}.
prepare_param(Rules, ReqParamName, Value, ValidatorState) ->
    Fun = fun(Rule, Acc) ->
        case validate(Rule, Acc, ReqParamName, ValidatorState) of
            ok -> Acc;
            {ok, Prepared} -> Prepared
        end
    end,
    try
        Result = lists:foldl(Fun, Value, Rules),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

-spec to_binary(iodata()) -> binary().
to_binary(V) when is_binary(V)  -> V;
to_binary(V) when is_list(V)    -> iolist_to_binary(V).

-spec to_header(request_param()) -> binary().
to_header(Name) ->
    to_binary(string:lowercase(atom_to_binary(Name, utf8))).

-spec to_qs(request_param()) -> binary().
to_qs(Name) ->
    atom_to_binary(Name, utf8).

-spec get_opt(any(), []) -> any().
get_opt(Key, Opts) ->
    get_opt(Key, Opts, undefined).

-spec get_opt(any(), [], any()) -> any().
get_opt(Key, Opts, Default) ->
    case lists:keyfind(Key, 1, Opts) of
        {_, Value} -> Value;
        false -> Default
    end.

get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(priv_dir(AppName), "openapi.json").

-include_lib("kernel/include/file.hrl").

-spec priv_dir(Application :: atom()) -> file:name_all().
priv_dir(AppName) ->
    case code:priv_dir(AppName) of
        Value when is_list(Value) ->
            Value ++ "/";
        _Error ->
            select_priv_dir([filename:join(["apps", atom_to_list(AppName), "priv"]), "priv"])
     end.

select_priv_dir(Paths) ->
    case lists:dropwhile(fun test_priv_dir/1, Paths) of
        [Path | _] -> Path;
        _          -> exit(no_priv_dir)
    end.

test_priv_dir(Path) ->
    case file:read_file_info(Path) of
        {ok, #file_info{type = directory}} ->
            false;
        _ ->
            true
    end.
