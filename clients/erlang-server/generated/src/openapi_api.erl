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
    | 'catalogFeeds'
    | 'catalogItems'
    | 'catalogProductGroups'
    | 'catalogReports'
    | 'catalogSupplemental'
    | 'catalogs'
    | 'conversionDeletionRequests'
    | 'conversionEqs'
    | 'conversionEvents'
    | 'conversionTags'
    | 'conversions'
    | 'customerListUploads'
    | 'customerLists'
    | 'customerSegment'
    | 'integrations'
    | 'keywords'
    | 'labels'
    | 'leadAds'
    | 'leadForms'
    | 'leadsExport'
    | 'media'
    | 'msotEvents'
    | 'notification'
    | 'oauth'
    | 'orderLines'
    | 'pins'
    | 'productGroupPromotions'
    | 'productTags'
    | 'promotions'
    | 'resources'
    | 'schedules'
    | 'search'
    | 'targetingTemplate'
    | 'terms'
    | 'termsOfService'
    | 'trends'
    | 'userAccount'.


-type operation_id() ::
    'ad_account/analytics' | %% Get ad account analytics
    'ad_account_targeting_analytics/get' | %% Get targeting analytics for an ad account
    'ad_accounts/create' | %% Create ad account
    'ad_accounts/get' | %% Get ad account
    'ad_accounts/list' | %% List ad accounts
    'analytics/create_conversion_product_report' | %% Create a request for a brand, category, SKU report
    'analytics/create_mmm_report' | %% Create a request for a Marketing Mix Modeling (MMM) report
    'analytics/create_report' | %% Create async request for an account analytics report
    'analytics/create_template_report' | %% Create async request for an analytics report using a template
    'analytics/get_conversion_product_report' | %% Get advertiser brand, category, SKU report
    'analytics/get_mmm_report' | %% Get advertiser Marketing Mix Modeling (MMM) report.
    'analytics/get_report' | %% Get the account analytics report created by the async call
    'sandbox/delete' | %% Delete ads data for ad account in API Sandbox
    'templates/list' | %% List templates
    'ad_groups/analytics' | %% Get ad group analytics
    'ad_groups/audience_sizing' | %% Get audience sizing
    'ad_groups_bid_floor/get' | %% Get bid floors
    'ad_groups/create' | %% Create ad groups
    'ad_groups_dynamic_titles/download_csv' | %% Get dynamic titles CSV download URL
    'ad_groups_dynamic_titles/get_status' | %% Get dynamic titles status
    'ad_groups_dynamic_titles/get_upload_url' | %% Get dynamic titles upload URL
    'ad_groups_dynamic_titles/process_csv' | %% Process dynamic titles CSV
    'ad_groups/get' | %% Get ad group
    'ad_groups/list' | %% List ad groups
    'ad_groups_targeting_analytics/get' | %% Get targeting analytics for ad groups
    'ad_groups/update' | %% Update ad groups
    'get_ad_groups_by_promotion_ids/list' | %% List of ad groups using promotions IDs.
    'ad_previews/create' | %% Create ad preview with pin or image
    'ad_targeting_analytics/get' | %% Get targeting analytics for ads
    'ads/analytics' | %% Get ad analytics
    'ads/create' | %% Create ads
    'ads/get' | %% Get ad
    'ads/list' | %% List ads
    'ads/update' | %% Update ads
    'campaign_ad_preview/create' | %% Create ad preview records for one or more ad groups
    'campaign_ad_preview/delete' | %% Delete ad preview records for one or more ad groups
    'campaign_ad_preview/read' | %% Fetch ad preview records for one or more ad groups
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
    'audiences/get' | %% Get audience
    'audiences/list' | %% List audiences
    'audiences/update' | %% Update audience
    'ads_credit/redeem' | %% Redeem ad credits
    'ads_credits_discounts/get' | %% Get ads credit discounts
    'billing_invoice_download/get' | %% Get download url for a billing invoice
    'billing_invoices/get' | %% Get billing invoices
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
    'brand_accounts/create' | %% Create a Brand Account
    'brand_accounts/update' | %% Update a Brand Account
    'delete_business_membership' | %% Terminate business memberships
    'delete_business_partners' | %% Terminate business partnerships
    'get/business_employers' | %% List business employers for user
    'get/business_members' | %% Get business members
    'get/business_partners' | %% Get business partners
    'system_user/update' | %% Update a system user information.
    'update/business_memberships' | %% Update member&#39;s business role
    'ad_pins/analytics' | %% Get pins analytics
    'campaign_targeting_analytics/get' | %% Get targeting analytics for campaigns
    'campaigns/analytics' | %% Get campaign analytics
    'campaigns/create' | %% Create campaigns
    'campaigns/get' | %% Get campaign
    'campaigns/list' | %% List campaigns
    'campaigns/update' | %% Update campaigns
    'get_campaign_delivery_estimates' | %% Get campaign delivery estimates
    'feed_processing_results/list' | %% List feed processing results
    'feeds/create' | %% Create feed
    'feeds/delete' | %% Delete feed
    'feeds/get' | %% Get feed
    'feeds/ingest' | %% Ingest feed items
    'feeds/list' | %% List feeds
    'feeds/update' | %% Update feed
    'items_issues/list' | %% List item issues
    'items_batch/get' | %% Get item batch status
    'items_batch/post' | %% Operate on item batch
    'items/post' | %% Get catalogs items (POST)
    'catalogs_product_group_pins/list' | %% List products by product group
    'catalogs_product_groups/create' | %% Create product group
    'catalogs_product_groups/create_many' | %% Create product groups
    'catalogs_product_groups/delete' | %% Delete product group
    'catalogs_product_groups/delete_many' | %% Delete product groups
    'catalogs_product_groups/get' | %% Get product group
    'catalogs_product_groups/list' | %% List product groups
    'catalogs_product_groups/product_counts_get' | %% Get product counts
    'catalogs_product_groups/update' | %% Update single product group
    'products_by_product_group_filter/list' | %% List products by filter
    'reports/create' | %% Build catalogs report
    'reports/get' | %% Get catalogs report
    'reports/stats' | %% List report stats
    'catalogs_local_inventory_items_batch/operate' | %% Operate on local inventory item batch
    'catalogs_local_inventory_items/post' | %% Get local inventory items (POST)
    'catalogs_local_stores/create' | %% Create local stores
    'catalogs_local_stores/delete' | %% Delete local stores
    'catalogs_local_stores/list' | %% List local stores
    'catalogs_local_stores/update' | %% Update local stores
    'catalogs_supplemental_items_batch/get' | %% Get supplemental items batch status
    'catalogs/available_filter_values' | %% List available filter values
    'catalogs/create' | %% Create catalog
    'catalogs/list' | %% List catalogs
    'conversion_deletion_request/create' | %% Create a conversion deletion request
    'conversion_deletion_request/delete' | %% Delete a conversion deletion request
    'conversion_deletion_request/get' | %% Get a single conversion deletion request
    'conversion_deletion_request/list' | %% List conversion deletion requests
    'conversion_eqs/list' | %% Get event quality score (EQS)
    'events/create' | %% Send conversions
    'conversion_tags/create' | %% Create conversion tag
    'conversion_tags/get' | %% Get conversion tag
    'conversion_tags/list' | %% List conversion tags
    'ocpm_eligible_conversion_tags/get' | %% Get Ocpm eligible conversion tags
    'page_visit_conversion_tags/get' | %% Get page visit conversion tags
    'advertiser_defined_events/create' | %% Create advertiser defined events
    'advertiser_defined_events/delete' | %% Delete advertiser defined events
    'advertiser_defined_events/get' | %% Get advertiser defined events
    'advertiser_defined_events/update' | %% Update advertiser defined events
    'customer_list_uploads/create' | %% Create customer list upload
    'customer_list_uploads/get' | %% Get customer list upload
    'customer_list_uploads/run' | %% Run customer list upload
    'customer_lists/create' | %% Create customer lists
    'customer_lists/get' | %% Get customer list
    'customer_lists/list' | %% Get customer lists
    'customer_lists/update' | %% Update customer list
    'customer_segment/create' | %% Create customer segments
    'customer_segment/list' | %% List customer segments
    'customer_segment/update' | %% Update customer segments
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
    'labels/apply' | %% Apply label to entity
    'labels/create' | %% Create labels
    'labels/list' | %% List labels
    'labels/remove' | %% Remove label from entities
    'labels/update' | %% Update labels
    'ad_accounts_subscriptions/del_by_id' | %% Delete lead ads subscription
    'ad_accounts_subscriptions/get_by_id' | %% Get lead ads subscription by ID
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
    'msot_events/create' | %% Send Measurement Source Of Truth (MSOT) attributed conversion events
    'notification/post' | %% Receive notifications from external partners.
    'oauth/conversion_token' | %% Generate OAuth access token for conversion API
    'oauth/token' | %% Generate OAuth access token
    'token/revoke' | %% Revoke a token
    'order_lines/get' | %% Get order line
    'order_lines/list' | %% Get order lines.
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
    'product_tags/bulk_add' | %% Add product tags to pin
    'product_tags/bulk_delete' | %% Delete product tags from pin
    'product_tags/list' | %% Get product tags for pin
    'promotions/create' | %% Create promotions
    'promotions/delete' | %% Delete promotion by id
    'promotions/get' | %% Get promotion by id
    'promotions/list' | %% Get promotions
    'promotions/update' | %% Update promotions
    'ad_account_countries/get' | %% Get ad accounts countries
    'delivery_metrics/get' | %% Get available metrics&#39; definitions
    'interest_targeting_options/get' | %% Get interest details
    'lead_form_questions/get' | %% Get lead form questions
    'metrics_ready_state/get' | %% Get metrics ready state
    'targeting_options/get' | %% Get targeting options
    'schedules/create' | %% Create schedules
    'schedules/list' | %% Get Schedules
    'schedules/update' | %% Update schedules
    'search_partner_pins' | %% Search pins by a given search term
    'search_user_boards/get' | %% Search user&#39;s boards
    'search_user_pins/list' | %% Search user&#39;s Pins
    'targeting_template/create' | %% Create targeting templates
    'targeting_template/list' | %% List targeting templates
    'targeting_template/update' | %% Update targeting templates
    'terms_related/list' | %% List related terms
    'terms_suggested/list' | %% List suggested terms
    'terms_of_service/get' | %% Get terms of service
    'trends_editorial_articles/list' | %% Returns editorial articles for a given region
    'trends_featured_topics/list' | %% Get featured topics
    'trends_product_categories_details/list' | %% Get product category details
    'trends_product_categories_trending/list' | %% Get a list of growing Shopping Product Categories
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
Loads the JSON schema and the desired validation draft into a `t:jesse_state:state/0`.
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
    validate_response_body('list', 'AdAccountAnalyticsItems', Body, ValidatorState);
validate_response('ad_account/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/create', 200, Body, ValidatorState) ->
    validate_response_body('AdAccount', 'AdAccount', Body, ValidatorState);
validate_response('ad_accounts/create', 201, Body, ValidatorState) ->
    validate_response_body('AdAccount', 'AdAccount', Body, ValidatorState);
validate_response('ad_accounts/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/get', 200, Body, ValidatorState) ->
    validate_response_body('AdAccount', 'AdAccount', Body, ValidatorState);
validate_response('ad_accounts/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_list_200_response', 'ad_accounts_list_200_response', Body, ValidatorState);
validate_response('ad_accounts/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 200, Body, ValidatorState) ->
    validate_response_body('ConversionProductReport', 'ConversionProductReport', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 201, Body, ValidatorState) ->
    validate_response_body('ConversionProductReport', 'ConversionProductReport', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_conversion_product_report', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 200, Body, ValidatorState) ->
    validate_response_body('MMMReport', 'MMMReport', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 201, Body, ValidatorState) ->
    validate_response_body('MMMReport', 'MMMReport', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_mmm_report', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_report', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsCreateAsyncResponse', 'AdsAnalyticsCreateAsyncResponse', Body, ValidatorState);
validate_response('analytics/create_report', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_report', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_report', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_report', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_report', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_report', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 200, Body, ValidatorState) ->
    validate_response_body('TemplateBasedReport', 'TemplateBasedReport', Body, ValidatorState);
validate_response('analytics/create_template_report', 201, Body, ValidatorState) ->
    validate_response_body('TemplateBasedReport', 'TemplateBasedReport', Body, ValidatorState);
validate_response('analytics/create_template_report', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/create_template_report', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_conversion_product_report', 200, Body, ValidatorState) ->
    validate_response_body('ConversionProductReport', 'ConversionProductReport', Body, ValidatorState);
validate_response('analytics/get_conversion_product_report', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_conversion_product_report', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_conversion_product_report', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_conversion_product_report', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_conversion_product_report', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_conversion_product_report', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 200, Body, ValidatorState) ->
    validate_response_body('MMMReport', 'MMMReport', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_mmm_report', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_report', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsGetAsyncResponse', 'AdsAnalyticsGetAsyncResponse', Body, ValidatorState);
validate_response('analytics/get_report', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_report', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_report', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_report', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_report', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('analytics/get_report', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('sandbox/delete', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('sandbox/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('sandbox/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('sandbox/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('sandbox/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('sandbox/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('sandbox/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('templates/list', 200, Body, ValidatorState) ->
    validate_response_body('templates_list_200_response', 'templates_list_200_response', Body, ValidatorState);
validate_response('templates/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('templates/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('templates/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('templates/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('templates/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('templates/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdGroupsAnalyticsMetrics', Body, ValidatorState);
validate_response('ad_groups/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupAudienceSizing', 'AdGroupAudienceSizing', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 201, Body, ValidatorState) ->
    validate_response_body('AdGroupAudienceSizing', 'AdGroupAudienceSizing', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/audience_sizing', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 200, Body, ValidatorState) ->
    validate_response_body('BidFloor', 'BidFloor', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 201, Body, ValidatorState) ->
    validate_response_body('BidFloor', 'BidFloor', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_bid_floor/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/create', 200, Body, ValidatorState) ->
    validate_response_body('ad_groups_create_200_response', 'ad_groups_create_200_response', Body, ValidatorState);
validate_response('ad_groups/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/download_csv', 200, Body, ValidatorState) ->
    validate_response_body('DynamicTitlesDownloadCSV', 'DynamicTitlesDownloadCSV', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/download_csv', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/download_csv', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/download_csv', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/download_csv', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/download_csv', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/download_csv', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_status', 200, Body, ValidatorState) ->
    validate_response_body('DynamicTitlesGetStatus', 'DynamicTitlesGetStatus', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_status', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_status', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_status', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_status', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_status', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_status', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_upload_url', 200, Body, ValidatorState) ->
    validate_response_body('DynamicTitlesUploadURL', 'DynamicTitlesUploadURL', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_upload_url', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_upload_url', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_upload_url', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_upload_url', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_upload_url', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/get_upload_url', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 200, Body, ValidatorState) ->
    validate_response_body('DynamicTitlesProcessCSV', 'DynamicTitlesProcessCSV', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 201, Body, ValidatorState) ->
    validate_response_body('DynamicTitlesProcessCSV', 'DynamicTitlesProcessCSV', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_dynamic_titles/process_csv', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/get', 200, Body, ValidatorState) ->
    validate_response_body('AdGroup', 'AdGroup', Body, ValidatorState);
validate_response('ad_groups/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_groups_list_200_response', 'ad_groups_list_200_response', Body, ValidatorState);
validate_response('ad_groups/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/update', 200, Body, ValidatorState) ->
    validate_response_body('ad_groups_create_200_response', 'ad_groups_create_200_response', Body, ValidatorState);
validate_response('ad_groups/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_groups/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_ad_groups_by_promotion_ids/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_groups_list_200_response', 'ad_groups_list_200_response', Body, ValidatorState);
validate_response('get_ad_groups_by_promotion_ids/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_ad_groups_by_promotion_ids/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_ad_groups_by_promotion_ids/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_ad_groups_by_promotion_ids/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_ad_groups_by_promotion_ids/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_ad_groups_by_promotion_ids/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_previews/create', 200, Body, ValidatorState) ->
    validate_response_body('AdPreviewURLResponse', 'AdPreviewURLResponse', Body, ValidatorState);
validate_response('ad_previews/create', 201, Body, ValidatorState) ->
    validate_response_body('AdPreviewURLResponse', 'AdPreviewURLResponse', Body, ValidatorState);
validate_response('ad_previews/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_previews/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_previews/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_previews/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_previews/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_previews/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdsAnalytics', Body, ValidatorState);
validate_response('ads/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/create', 200, Body, ValidatorState) ->
    validate_response_body('AdBatchWriteResponseModel', 'AdBatchWriteResponseModel', Body, ValidatorState);
validate_response('ads/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/get', 200, Body, ValidatorState) ->
    validate_response_body('Ad', 'Ad', Body, ValidatorState);
validate_response('ads/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/list', 200, Body, ValidatorState) ->
    validate_response_body('ads_list_200_response', 'ads_list_200_response', Body, ValidatorState);
validate_response('ads/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/update', 200, Body, ValidatorState) ->
    validate_response_body('AdBatchWriteResponseModel', 'AdBatchWriteResponseModel', Body, ValidatorState);
validate_response('ads/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 200, Body, ValidatorState) ->
    validate_response_body('list', 'campaign_ad_preview_create_200_response_inner', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 201, Body, ValidatorState) ->
    validate_response_body('list', 'CampaignAdPreview', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 200, Body, ValidatorState) ->
    validate_response_body('list', 'campaign_ad_preview_delete_200_response_inner', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/read', 200, Body, ValidatorState) ->
    validate_response_body('list', 'CampaignAdPreview', Body, ValidatorState);
validate_response('campaign_ad_preview/read', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/read', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/read', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/read', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/read', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_ad_preview/read', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 200, Body, ValidatorState) ->
    validate_response_body('AdvancedAuctionItems', 'AdvancedAuctionItems', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 500, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_get/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 200, Body, ValidatorState) ->
    validate_response_body('AdvancedAuctionProcessedItems', 'AdvancedAuctionProcessedItems', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 206, Body, ValidatorState) ->
    validate_response_body('AdvancedAuctionProcessedItems', 'AdvancedAuctionProcessedItems', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 500, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advanced_auction_items_submit/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights/get', 200, Body, ValidatorState) ->
    validate_response_body('AudienceInsights', 'AudienceInsights', Body, ValidatorState);
validate_response('audience_insights/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 200, Body, ValidatorState) ->
    validate_response_body('audience_insights_scope_and_type_get_200_response', 'audience_insights_scope_and_type_get_200_response', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audience_insights_scope_and_type/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_audiences_shared_accounts_list_200_response', 'ad_accounts_audiences_shared_accounts_list_200_response', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_audiences_shared_accounts/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_audiences_shared_accounts_list_200_response', 'ad_accounts_audiences_shared_accounts_list_200_response', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_account_audiences_shared_accounts/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 200, Body, ValidatorState) ->
    validate_response_body('shared_audiences_for_business_list_200_response', 'shared_audiences_for_business_list_200_response', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('shared_audiences_for_business/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountToAdAccountSharedAudience', 'AdAccountToAdAccountSharedAudience', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_ad_account_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountToBusinessSharedAudience', 'AdAccountToBusinessSharedAudience', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_ad_account_to_business_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('BusinessToAdAccountSharedAudience', 'BusinessToAdAccountSharedAudience', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_ad_account_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 200, Body, ValidatorState) ->
    validate_response_body('BusinessToBusinessSharedAudience', 'BusinessToBusinessSharedAudience', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_business_to_business_shared_audience', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/create', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountsAudience', 'AdAccountsAudience', Body, ValidatorState);
validate_response('audiences/create', 201, Body, ValidatorState) ->
    validate_response_body('AdAccountsAudience', 'AdAccountsAudience', Body, ValidatorState);
validate_response('audiences/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/get', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountsAudience', 'AdAccountsAudience', Body, ValidatorState);
validate_response('audiences/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/list', 200, Body, ValidatorState) ->
    validate_response_body('audiences_list_200_response', 'audiences_list_200_response', Body, ValidatorState);
validate_response('audiences/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/update', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountsAudience', 'AdAccountsAudience', Body, ValidatorState);
validate_response('audiences/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('audiences/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 200, Body, ValidatorState) ->
    validate_response_body('AdsCreditRedeem', 'AdsCreditRedeem', Body, ValidatorState);
validate_response('ads_credit/redeem', 201, Body, ValidatorState) ->
    validate_response_body('AdsCreditRedeem', 'AdsCreditRedeem', Body, ValidatorState);
validate_response('ads_credit/redeem', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credit/redeem', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 200, Body, ValidatorState) ->
    validate_response_body('ads_credits_discounts_get_200_response', 'ads_credits_discounts_get_200_response', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ads_credits_discounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoice_download/get', 200, Body, ValidatorState) ->
    validate_response_body('BillingInvoiceDownloadResponse', 'BillingInvoiceDownloadResponse', Body, ValidatorState);
validate_response('billing_invoice_download/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoice_download/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoice_download/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoice_download/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoice_download/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoice_download/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoices/get', 200, Body, ValidatorState) ->
    validate_response_body('billing_invoices_get_200_response', 'billing_invoices_get_200_response', Body, ValidatorState);
validate_response('billing_invoices/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoices/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoices/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoices/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoices/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_invoices/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_profiles/get', 200, Body, ValidatorState) ->
    validate_response_body('billing_profiles_get_200_response', 'billing_profiles_get_200_response', Body, ValidatorState);
validate_response('billing_profiles/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_profiles/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_profiles/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_profiles/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_profiles/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('billing_profiles/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 200, Body, ValidatorState) ->
    validate_response_body('SSIOAccount', 'SSIOAccount', Body, ValidatorState);
validate_response('ssio_accounts/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_accounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 200, Body, ValidatorState) ->
    validate_response_body('SSIOInsertionOrder', 'SSIOInsertionOrder', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 201, Body, ValidatorState) ->
    validate_response_body('SSIOInsertionOrder', 'SSIOInsertionOrder', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 200, Body, ValidatorState) ->
    validate_response_body('SSIOInsertionOrder', 'SSIOInsertionOrder', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_order/edit', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 200, Body, ValidatorState) ->
    validate_response_body('ssio_insertion_orders_status_get_by_ad_account_200_response', 'ssio_insertion_orders_status_get_by_ad_account_200_response', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_ad_account', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 200, Body, ValidatorState) ->
    validate_response_body('SSIOInsertionOrderStatusResponse', 'SSIOInsertionOrderStatusResponse', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_insertion_orders_status/get_by_pin_order_id', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 200, Body, ValidatorState) ->
    validate_response_body('ssio_order_lines_get_by_ad_account_200_response', 'ssio_order_lines_get_by_ad_account_200_response', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ssio_order_lines/get_by_ad_account', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/create', 200, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('board_sections/create', 201, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('board_sections/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/delete', 200, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('board_sections/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('board_sections/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list', 200, Body, ValidatorState) ->
    validate_response_body('board_sections_list_200_response', 'board_sections_list_200_response', Body, ValidatorState);
validate_response('board_sections/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_pins_200_response', 'boards_list_pins_200_response', Body, ValidatorState);
validate_response('board_sections/list_pins', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/list_pins', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/update', 200, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('board_sections/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('board_sections/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/create', 200, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('boards/create', 201, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('boards/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/delete', 200, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('boards/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('boards/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/get', 200, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('boards/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_200_response', 'boards_list_200_response', Body, ValidatorState);
validate_response('boards/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list_pins', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_pins_200_response', 'boards_list_pins_200_response', Body, ValidatorState);
validate_response('boards/list_pins', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list_pins', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list_pins', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list_pins', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list_pins', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/list_pins', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/update', 200, Body, ValidatorState) ->
    validate_response_body('BoardWithUpdatePrivacy', 'BoardWithUpdatePrivacy', Body, ValidatorState);
validate_response('boards/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_download/create', 200, Body, ValidatorState) ->
    validate_response_body('BulkDownload', 'BulkDownload', Body, ValidatorState);
validate_response('bulk_download/create', 201, Body, ValidatorState) ->
    validate_response_body('BulkDownload', 'BulkDownload', Body, ValidatorState);
validate_response('bulk_download/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_download/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_download/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_download/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_download/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_download/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_request/get', 200, Body, ValidatorState) ->
    validate_response_body('BulkJobData', 'BulkJobData', Body, ValidatorState);
validate_response('bulk_request/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_request/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_request/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_request/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_request/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_request/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('bulk_upsert/create', 200, Body, ValidatorState) ->
    validate_response_body('BulkUpsertResponse', 'BulkUpsertResponse', Body, ValidatorState);
validate_response('bulk_upsert/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/create', 200, Body, ValidatorState) ->
    validate_response_body('AssetGroupInput', 'AssetGroupInput', Body, ValidatorState);
validate_response('asset_group/create', 201, Body, ValidatorState) ->
    validate_response_body('AssetGroupInput', 'AssetGroupInput', Body, ValidatorState);
validate_response('asset_group/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/delete', 200, Body, ValidatorState) ->
    validate_response_body('AssetGroupDeletion', 'AssetGroupDeletion', Body, ValidatorState);
validate_response('asset_group/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/update', 200, Body, ValidatorState) ->
    validate_response_body('AssetGroupModification', 'AssetGroupModification', Body, ValidatorState);
validate_response('asset_group/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_group/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_members/get', 200, Body, ValidatorState) ->
    validate_response_body('business_asset_members_get_200_response', 'business_asset_members_get_200_response', Body, ValidatorState);
validate_response('business_asset_members/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_members/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_members/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_members/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_members/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_members/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_partners/get', 200, Body, ValidatorState) ->
    validate_response_body('business_asset_members_get_200_response', 'business_asset_members_get_200_response', Body, ValidatorState);
validate_response('business_asset_partners/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_partners/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_partners/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_partners/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_partners/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_asset_partners/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_assets/get', 200, Body, ValidatorState) ->
    validate_response_body('business_assets_get_200_response', 'business_assets_get_200_response', Body, ValidatorState);
validate_response('business_assets/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_assets/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_assets/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_assets/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_assets/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_assets/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_member_assets/get', 200, Body, ValidatorState) ->
    validate_response_body('BusinessMemberAssetsGetResponse', 'BusinessMemberAssetsGetResponse', Body, ValidatorState);
validate_response('business_member_assets/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_member_assets/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_member_assets/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_member_assets/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_member_assets/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_member_assets/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_members_asset_access/delete', 200, Body, ValidatorState) ->
    validate_response_body('DeleteMemberAccessResultsResponseArray', 'DeleteMemberAccessResultsResponseArray', Body, ValidatorState);
validate_response('business_members_asset_access/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_members_asset_access/update', 200, Body, ValidatorState) ->
    validate_response_body('UpdateMemberAssetsResultsResponseArray', 'UpdateMemberAssetsResultsResponseArray', Body, ValidatorState);
validate_response('business_members_asset_access/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_members_asset_access/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_members_asset_access/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_members_asset_access/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_members_asset_access/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_members_asset_access/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 200, Body, ValidatorState) ->
    validate_response_body('business_partner_asset_access_get_200_response', 'business_partner_asset_access_get_200_response', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('business_partner_asset_access/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delete_partner_asset_access_handler_impl', 200, Body, ValidatorState) ->
    validate_response_body('DeletePartnerAssetAccessResultsResponseArray', 'DeletePartnerAssetAccessResultsResponseArray', Body, ValidatorState);
validate_response('delete_partner_asset_access_handler_impl', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 200, Body, ValidatorState) ->
    validate_response_body('UpdatePartnerAssetsResultsResponseArray', 'UpdatePartnerAssetsResultsResponseArray', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update_partner_asset_access_handler_impl', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_access_requests/create', 200, Body, ValidatorState) ->
    validate_response_body('CreateAssetAccessRequestResponse', 'CreateAssetAccessRequestResponse', Body, ValidatorState);
validate_response('asset_access_requests/create', 201, Body, ValidatorState) ->
    validate_response_body('CreateAssetAccessRequestResponse', 'CreateAssetAccessRequestResponse', Body, ValidatorState);
validate_response('asset_access_requests/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_access_requests/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_access_requests/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_access_requests/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_access_requests/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('asset_access_requests/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('cancel_invites_or_requests', 200, Body, ValidatorState) ->
    validate_response_body('CancelInvitesResponse', 'CancelInvitesResponse', Body, ValidatorState);
validate_response('cancel_invites_or_requests', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_asset_invites', 200, Body, ValidatorState) ->
    validate_response_body('UpdateInvitesResultsResponseArray', 'UpdateInvitesResultsResponseArray', Body, ValidatorState);
validate_response('create_asset_invites', 201, Body, ValidatorState) ->
    validate_response_body('UpdateInvitesResultsResponseArray', 'UpdateInvitesResultsResponseArray', Body, ValidatorState);
validate_response('create_asset_invites', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_asset_invites', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_asset_invites', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_asset_invites', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_asset_invites', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_asset_invites', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 200, Body, ValidatorState) ->
    validate_response_body('CreateInvitesResultsResponseArray', 'CreateInvitesResultsResponseArray', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 201, Body, ValidatorState) ->
    validate_response_body('CreateInvitesResultsResponseArray', 'CreateInvitesResultsResponseArray', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('create_membership_or_partnership_invites', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/invites', 200, Body, ValidatorState) ->
    validate_response_body('get_invites_200_response', 'get_invites_200_response', Body, ValidatorState);
validate_response('get/invites', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/invites', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/invites', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/invites', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/invites', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/invites', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('respond_business_access_invites', 200, Body, ValidatorState) ->
    validate_response_body('RespondToInvitesResponseArray', 'RespondToInvitesResponseArray', Body, ValidatorState);
validate_response('respond_business_access_invites', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('respond_business_access_invites', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('respond_business_access_invites', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('respond_business_access_invites', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('respond_business_access_invites', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('respond_business_access_invites', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/create', 200, Body, ValidatorState) ->
    validate_response_body('BrandAccount', 'BrandAccount', Body, ValidatorState);
validate_response('brand_accounts/create', 201, Body, ValidatorState) ->
    validate_response_body('BrandAccount', 'BrandAccount', Body, ValidatorState);
validate_response('brand_accounts/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/update', 200, Body, ValidatorState) ->
    validate_response_body('BrandAccount', 'BrandAccount', Body, ValidatorState);
validate_response('brand_accounts/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/update', 409, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('brand_accounts/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delete_business_membership', 200, Body, ValidatorState) ->
    validate_response_body('delete_business_membership_200_response', 'delete_business_membership_200_response', Body, ValidatorState);
validate_response('delete_business_membership', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delete_business_partners', 200, Body, ValidatorState) ->
    validate_response_body('DeleteBusinessPartners', 'DeleteBusinessPartners', Body, ValidatorState);
validate_response('delete_business_partners', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delete_business_partners', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_employers', 200, Body, ValidatorState) ->
    validate_response_body('get_business_employers_200_response', 'get_business_employers_200_response', Body, ValidatorState);
validate_response('get/business_employers', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_employers', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_employers', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_employers', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_employers', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_employers', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_members', 200, Body, ValidatorState) ->
    validate_response_body('get_business_employers_200_response', 'get_business_employers_200_response', Body, ValidatorState);
validate_response('get/business_members', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_members', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_members', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_members', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_members', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_members', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_partners', 200, Body, ValidatorState) ->
    validate_response_body('get_business_employers_200_response', 'get_business_employers_200_response', Body, ValidatorState);
validate_response('get/business_partners', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_partners', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_partners', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_partners', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_partners', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get/business_partners', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('system_user/update', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('system_user/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('system_user/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('system_user/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('system_user/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('system_user/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('system_user/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update/business_memberships', 200, Body, ValidatorState) ->
    validate_response_body('UpdateBusinessMembershipsResponse', 'UpdateBusinessMembershipsResponse', Body, ValidatorState);
validate_response('update/business_memberships', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update/business_memberships', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update/business_memberships', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update/business_memberships', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update/business_memberships', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('update/business_memberships', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_pins/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdPinAnalytics', Body, ValidatorState);
validate_response('ad_pins/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_pins/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_pins/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_pins/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_pins/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_pins/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaign_targeting_analytics/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'CampaignsAnalyticsMetrics', Body, ValidatorState);
validate_response('campaigns/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/create', 200, Body, ValidatorState) ->
    validate_response_body('CampaignBatchWriteResponseModel', 'CampaignBatchWriteResponseModel', Body, ValidatorState);
validate_response('campaigns/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/get', 200, Body, ValidatorState) ->
    validate_response_body('Campaign', 'Campaign', Body, ValidatorState);
validate_response('campaigns/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/list', 200, Body, ValidatorState) ->
    validate_response_body('campaigns_list_200_response', 'campaigns_list_200_response', Body, ValidatorState);
validate_response('campaigns/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/update', 200, Body, ValidatorState) ->
    validate_response_body('CampaignBatchWriteResponseModel', 'CampaignBatchWriteResponseModel', Body, ValidatorState);
validate_response('campaigns/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('campaigns/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 200, Body, ValidatorState) ->
    validate_response_body('CampaignDeliveryEstimatesResponse', 'CampaignDeliveryEstimatesResponse', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 503, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('get_campaign_delivery_estimates', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 200, Body, ValidatorState) ->
    validate_response_body('feed_processing_results_list_200_response', 'feed_processing_results_list_200_response', Body, ValidatorState);
validate_response('feed_processing_results/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feed_processing_results/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/create', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/create', 201, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/delete', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('feeds/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/ingest', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeedIngestion', 'CatalogsFeedIngestion', Body, ValidatorState);
validate_response('feeds/ingest', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/ingest', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/ingest', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/ingest', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/ingest', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/ingest', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/list', 200, Body, ValidatorState) ->
    validate_response_body('feeds_list_200_response', 'feeds_list_200_response', Body, ValidatorState);
validate_response('feeds/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/update', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('feeds/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('feeds/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_issues/list', 200, Body, ValidatorState) ->
    validate_response_body('items_issues_list_200_response', 'items_issues_list_200_response', Body, ValidatorState);
validate_response('items_issues/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_issues/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_issues/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_issues/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_issues/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_issues/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItemsBatch', 'CatalogsItemsBatch', Body, ValidatorState);
validate_response('items_batch/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/post', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItemsBatch', 'CatalogsItemsBatch', Body, ValidatorState);
validate_response('items_batch/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/post', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/post', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/post', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items_batch/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items/post', 200, Body, ValidatorState) ->
    validate_response_body('items_post_200_response', 'items_post_200_response', Body, ValidatorState);
validate_response('items/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items/post', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items/post', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items/post', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('items/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_group_pins_list_200_response', 'catalogs_product_group_pins_list_200_response', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_group_pins/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 201, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 201, Body, ValidatorState) ->
    validate_response_body('list', 'string', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/create_many', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/delete_many', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_groups_list_200_response', 'catalogs_product_groups_list_200_response', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsProductGroupProductCountsVertical', 'CatalogsProductGroupProductCountsVertical', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/product_counts_get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsVerticalProductGroup', 'CatalogsVerticalProductGroup', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_product_groups/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_group_pins_list_200_response', 'catalogs_product_group_pins_list_200_response', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('products_by_product_group_filter/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/create', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsCreateReportResponse', 'CatalogsCreateReportResponse', Body, ValidatorState);
validate_response('reports/create', 201, Body, ValidatorState) ->
    validate_response_body('CatalogsCreateReportResponse', 'CatalogsCreateReportResponse', Body, ValidatorState);
validate_response('reports/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/get', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsReport', 'CatalogsReport', Body, ValidatorState);
validate_response('reports/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/stats', 200, Body, ValidatorState) ->
    validate_response_body('reports_stats_200_response', 'reports_stats_200_response', Body, ValidatorState);
validate_response('reports/stats', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/stats', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/stats', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/stats', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/stats', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('reports/stats', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 200, Body, ValidatorState) ->
    validate_response_body('SupplementalItemsBatchResponse', 'SupplementalItemsBatchResponse', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 201, Body, ValidatorState) ->
    validate_response_body('LocalInventoryItemsBatch', 'LocalInventoryItemsBatch', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items_batch/operate', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 200, Body, ValidatorState) ->
    validate_response_body('LocalInventoryItemsGet', 'LocalInventoryItemsGet', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 201, Body, ValidatorState) ->
    validate_response_body('LocalInventoryItemsGet', 'LocalInventoryItemsGet', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_inventory_items/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 200, Body, ValidatorState) ->
    validate_response_body('list', 'catalogs_local_stores_create_200_response_inner', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 201, Body, ValidatorState) ->
    validate_response_body('list', 'LocalStore', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 200, Body, ValidatorState) ->
    validate_response_body('list', 'catalogs_local_stores_delete_200_response_inner', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_local_stores_list_200_response', 'catalogs_local_stores_list_200_response', Body, ValidatorState);
validate_response('catalogs_local_stores/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/update', 200, Body, ValidatorState) ->
    validate_response_body('list', 'catalogs_local_stores_create_200_response_inner', Body, ValidatorState);
validate_response('catalogs_local_stores/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_local_stores/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_supplemental_items_batch/get', 200, Body, ValidatorState) ->
    validate_response_body('SupplementalItemsBatchResponse', 'SupplementalItemsBatchResponse', Body, ValidatorState);
validate_response('catalogs_supplemental_items_batch/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_supplemental_items_batch/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_supplemental_items_batch/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_supplemental_items_batch/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_supplemental_items_batch/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs_supplemental_items_batch/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/available_filter_values', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsAvailableFilterValues', 'CatalogsAvailableFilterValues', Body, ValidatorState);
validate_response('catalogs/available_filter_values', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/available_filter_values', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/available_filter_values', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/available_filter_values', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/available_filter_values', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/available_filter_values', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/create', 200, Body, ValidatorState) ->
    validate_response_body('Catalog', 'Catalog', Body, ValidatorState);
validate_response('catalogs/create', 201, Body, ValidatorState) ->
    validate_response_body('Catalog', 'Catalog', Body, ValidatorState);
validate_response('catalogs/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/list', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_list_200_response', 'catalogs_list_200_response', Body, ValidatorState);
validate_response('catalogs/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('catalogs/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 200, Body, ValidatorState) ->
    validate_response_body('ConversionDeletionRequest', 'ConversionDeletionRequest', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 201, Body, ValidatorState) ->
    validate_response_body('ConversionDeletionRequest', 'ConversionDeletionRequest', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 200, Body, ValidatorState) ->
    validate_response_body('ConversionDeletionRequest', 'ConversionDeletionRequest', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/get', 200, Body, ValidatorState) ->
    validate_response_body('ConversionDeletionRequest', 'ConversionDeletionRequest', Body, ValidatorState);
validate_response('conversion_deletion_request/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/list', 200, Body, ValidatorState) ->
    validate_response_body('conversion_deletion_request_list_200_response', 'conversion_deletion_request_list_200_response', Body, ValidatorState);
validate_response('conversion_deletion_request/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_deletion_request/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_eqs/list', 200, Body, ValidatorState) ->
    validate_response_body('list', 'EventQualityScore', Body, ValidatorState);
validate_response('conversion_eqs/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_eqs/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_eqs/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_eqs/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_eqs/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_eqs/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('events/create', 200, Body, ValidatorState) ->
    validate_response_body('ConversionEvents', 'ConversionEvents', Body, ValidatorState);
validate_response('events/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('events/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('events/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('events/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('events/create', 422, Body, ValidatorState) ->
    validate_response_body('DetailedError', 'DetailedError', Body, ValidatorState);
validate_response('events/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('events/create', 503, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('events/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/create', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTag', 'ConversionTag', Body, ValidatorState);
validate_response('conversion_tags/create', 201, Body, ValidatorState) ->
    validate_response_body('ConversionTag', 'ConversionTag', Body, ValidatorState);
validate_response('conversion_tags/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/get', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTag', 'ConversionTag', Body, ValidatorState);
validate_response('conversion_tags/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/list', 200, Body, ValidatorState) ->
    validate_response_body('conversion_tags_list_200_response', 'conversion_tags_list_200_response', Body, ValidatorState);
validate_response('conversion_tags/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('conversion_tags/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 200, Body, ValidatorState) ->
    validate_response_body('map', 'ConversionEventResponse', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ocpm_eligible_conversion_tags/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 200, Body, ValidatorState) ->
    validate_response_body('page_visit_conversion_tags_get_200_response', 'page_visit_conversion_tags_get_200_response', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('page_visit_conversion_tags/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/create', 200, Body, ValidatorState) ->
    validate_response_body('advertiser_defined_events_create_200_response', 'advertiser_defined_events_create_200_response', Body, ValidatorState);
validate_response('advertiser_defined_events/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/delete', 200, Body, ValidatorState) ->
    validate_response_body('advertiser_defined_events_create_200_response', 'advertiser_defined_events_create_200_response', Body, ValidatorState);
validate_response('advertiser_defined_events/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/get', 200, Body, ValidatorState) ->
    validate_response_body('advertiser_defined_events_get_200_response', 'advertiser_defined_events_get_200_response', Body, ValidatorState);
validate_response('advertiser_defined_events/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/update', 200, Body, ValidatorState) ->
    validate_response_body('advertiser_defined_events_create_200_response', 'advertiser_defined_events_create_200_response', Body, ValidatorState);
validate_response('advertiser_defined_events/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('advertiser_defined_events/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/create', 200, Body, ValidatorState) ->
    validate_response_body('CustomerListUploadCreateResponse', 'CustomerListUploadCreateResponse', Body, ValidatorState);
validate_response('customer_list_uploads/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/get', 200, Body, ValidatorState) ->
    validate_response_body('CustomerListUpload', 'CustomerListUpload', Body, ValidatorState);
validate_response('customer_list_uploads/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/run', 200, Body, ValidatorState) ->
    validate_response_body('CustomerListUpload', 'CustomerListUpload', Body, ValidatorState);
validate_response('customer_list_uploads/run', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/run', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/run', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/run', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/run', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_list_uploads/run', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/create', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('customer_lists/create', 201, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('customer_lists/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/get', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('customer_lists/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/list', 200, Body, ValidatorState) ->
    validate_response_body('customer_lists_list_200_response', 'customer_lists_list_200_response', Body, ValidatorState);
validate_response('customer_lists/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/update', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('customer_lists/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_lists/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/create', 200, Body, ValidatorState) ->
    validate_response_body('CustomerSegment', 'CustomerSegment', Body, ValidatorState);
validate_response('customer_segment/create', 201, Body, ValidatorState) ->
    validate_response_body('CustomerSegment', 'CustomerSegment', Body, ValidatorState);
validate_response('customer_segment/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/list', 200, Body, ValidatorState) ->
    validate_response_body('customer_segment_list_200_response', 'customer_segment_list_200_response', Body, ValidatorState);
validate_response('customer_segment/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/update', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('customer_segment/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('customer_segment/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/del', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/del', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('integrations_commerce/del', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/del', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/del', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/del', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/del', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/del', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/patch', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/patch', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/post', 201, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('integrations_commerce/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_commerce/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationRecord', 'IntegrationRecord', Body, ValidatorState);
validate_response('integrations/get_by_id', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_by_id', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_list', 200, Body, ValidatorState) ->
    validate_response_body('integrations_get_list_200_response', 'integrations_get_list_200_response', Body, ValidatorState);
validate_response('integrations/get_list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations/get_list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_logs/post', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationLogsSuccessResponse', 'IntegrationLogsSuccessResponse', Body, ValidatorState);
validate_response('integrations_logs/post', 400, Body, ValidatorState) ->
    validate_response_body('IntegrationLogsInvalidLogResponse', 'IntegrationLogsInvalidLogResponse', Body, ValidatorState);
validate_response('integrations_logs/post', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_logs/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_logs/post', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_logs/post', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('integrations_logs/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 200, Body, ValidatorState) ->
    validate_response_body('KeywordsMetricsArrayResponse', 'KeywordsMetricsArrayResponse', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('country_keywords_metrics/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/create', 200, Body, ValidatorState) ->
    validate_response_body('Keywords', 'Keywords', Body, ValidatorState);
validate_response('keywords/create', 201, Body, ValidatorState) ->
    validate_response_body('Keywords', 'Keywords', Body, ValidatorState);
validate_response('keywords/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/get', 200, Body, ValidatorState) ->
    validate_response_body('keywords_get_200_response', 'keywords_get_200_response', Body, ValidatorState);
validate_response('keywords/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/update', 200, Body, ValidatorState) ->
    validate_response_body('Keywords', 'Keywords', Body, ValidatorState);
validate_response('keywords/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('keywords/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trending_keywords/list', 200, Body, ValidatorState) ->
    validate_response_body('TrendingKeywordsResponse', 'TrendingKeywordsResponse', Body, ValidatorState);
validate_response('trending_keywords/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trending_keywords/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trending_keywords/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trending_keywords/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trending_keywords/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trending_keywords/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/apply', 200, Body, ValidatorState) ->
    validate_response_body('LabeledEntities', 'LabeledEntities', Body, ValidatorState);
validate_response('labels/apply', 201, Body, ValidatorState) ->
    validate_response_body('LabeledEntities', 'LabeledEntities', Body, ValidatorState);
validate_response('labels/apply', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/apply', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/apply', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/apply', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/apply', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/apply', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/create', 200, Body, ValidatorState) ->
    validate_response_body('LabelsResponse', 'LabelsResponse', Body, ValidatorState);
validate_response('labels/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/list', 200, Body, ValidatorState) ->
    validate_response_body('labels_list_200_response', 'labels_list_200_response', Body, ValidatorState);
validate_response('labels/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/remove', 200, Body, ValidatorState) ->
    validate_response_body('LabeledEntities', 'LabeledEntities', Body, ValidatorState);
validate_response('labels/remove', 201, Body, ValidatorState) ->
    validate_response_body('LabeledEntities', 'LabeledEntities', Body, ValidatorState);
validate_response('labels/remove', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/remove', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/remove', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/remove', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/remove', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/remove', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/update', 200, Body, ValidatorState) ->
    validate_response_body('LabelsResponse', 'LabelsResponse', Body, ValidatorState);
validate_response('labels/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('labels/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 200, Body, ValidatorState) ->
    validate_response_body('LeadSubscription', 'LeadSubscription', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/del_by_id', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 200, Body, ValidatorState) ->
    validate_response_body('LeadSubscription', 'LeadSubscription', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_by_id', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_subscriptions_get_list_200_response', 'ad_accounts_subscriptions_get_list_200_response', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/get_list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 200, Body, ValidatorState) ->
    validate_response_body('LeadSubscription', 'LeadSubscription', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_accounts_subscriptions/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form/get', 200, Body, ValidatorState) ->
    validate_response_body('LeadForm', 'LeadForm', Body, ValidatorState);
validate_response('lead_form/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_test/create', 200, Body, ValidatorState) ->
    validate_response_body('LeadFormTest', 'LeadFormTest', Body, ValidatorState);
validate_response('lead_form_test/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_test/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_test/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/create', 200, Body, ValidatorState) ->
    validate_response_body('lead_forms_create_200_response', 'lead_forms_create_200_response', Body, ValidatorState);
validate_response('lead_forms/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/list', 200, Body, ValidatorState) ->
    validate_response_body('lead_forms_list_200_response', 'lead_forms_list_200_response', Body, ValidatorState);
validate_response('lead_forms/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/update', 200, Body, ValidatorState) ->
    validate_response_body('lead_forms_create_200_response', 'lead_forms_create_200_response', Body, ValidatorState);
validate_response('lead_forms/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_forms/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/create', 200, Body, ValidatorState) ->
    validate_response_body('LeadsExports', 'LeadsExports', Body, ValidatorState);
validate_response('leads_export/create', 201, Body, ValidatorState) ->
    validate_response_body('LeadsExports', 'LeadsExports', Body, ValidatorState);
validate_response('leads_export/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/get', 200, Body, ValidatorState) ->
    validate_response_body('LeadsExportResponseData', 'LeadsExportResponseData', Body, ValidatorState);
validate_response('leads_export/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('leads_export/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/create', 200, Body, ValidatorState) ->
    validate_response_body('MediaUpload', 'MediaUpload', Body, ValidatorState);
validate_response('media/create', 201, Body, ValidatorState) ->
    validate_response_body('MediaUpload', 'MediaUpload', Body, ValidatorState);
validate_response('media/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/get', 200, Body, ValidatorState) ->
    validate_response_body('Media', 'Media', Body, ValidatorState);
validate_response('media/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/list', 200, Body, ValidatorState) ->
    validate_response_body('media_list_200_response', 'media_list_200_response', Body, ValidatorState);
validate_response('media/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('media/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('msot_events/create', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('msot_events/create', 201, Body, ValidatorState) ->
    validate_response_body('object', 'object', Body, ValidatorState);
validate_response('msot_events/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('msot_events/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('msot_events/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('msot_events/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('msot_events/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('msot_events/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('notification/post', 200, Body, ValidatorState) ->
    validate_response_body('NotificationResponse', 'NotificationResponse', Body, ValidatorState);
validate_response('notification/post', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('notification/post', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/conversion_token', 200, Body, ValidatorState) ->
    validate_response_body('ConversionAccessToken', 'ConversionAccessToken', Body, ValidatorState);
validate_response('oauth/conversion_token', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/conversion_token', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/conversion_token', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/conversion_token', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/conversion_token', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/conversion_token', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/token', 200, Body, ValidatorState) ->
    validate_response_body('OauthAccessToken', 'OauthAccessToken', Body, ValidatorState);
validate_response('oauth/token', 201, Body, ValidatorState) ->
    validate_response_body('OauthAccessToken', 'OauthAccessToken', Body, ValidatorState);
validate_response('oauth/token', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/token', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/token', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/token', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/token', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('oauth/token', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('token/revoke', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('token/revoke', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('token/revoke', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('token/revoke', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/get', 200, Body, ValidatorState) ->
    validate_response_body('OrderLine', 'OrderLine', Body, ValidatorState);
validate_response('order_lines/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/list', 200, Body, ValidatorState) ->
    validate_response_body('order_lines_list_200_response', 'order_lines_list_200_response', Body, ValidatorState);
validate_response('order_lines/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('order_lines/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'PinAnalyticsMetricsResponse', Body, ValidatorState);
validate_response('multi_pins/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('multi_pins/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/analytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'PinAnalyticsMetricsResponse', Body, ValidatorState);
validate_response('pins/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/create', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/create', 201, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/delete', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('pins/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/get', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/list', 200, Body, ValidatorState) ->
    validate_response_body('pins_list_200_response', 'pins_list_200_response', Body, ValidatorState);
validate_response('pins/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/save', 201, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/save', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/save', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/save', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/save', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/save', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/save', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/update', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('pins/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('pins/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/create', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotions', 'ProductGroupPromotions', Body, ValidatorState);
validate_response('product_group_promotions/create', 201, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotions', 'ProductGroupPromotions', Body, ValidatorState);
validate_response('product_group_promotions/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/get', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotion', 'ProductGroupPromotion', Body, ValidatorState);
validate_response('product_group_promotions/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/list', 200, Body, ValidatorState) ->
    validate_response_body('product_group_promotions_list_200_response', 'product_group_promotions_list_200_response', Body, ValidatorState);
validate_response('product_group_promotions/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/update', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotions', 'ProductGroupPromotions', Body, ValidatorState);
validate_response('product_group_promotions/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_group_promotions/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_groups/analytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'ProductGroupAnalyticsItems', Body, ValidatorState);
validate_response('product_groups/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_groups/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_groups/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_groups/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_groups/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_groups/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_add', 200, Body, ValidatorState) ->
    validate_response_body('ProductTagsResponse', 'ProductTagsResponse', Body, ValidatorState);
validate_response('product_tags/bulk_add', 400, Body, ValidatorState) ->
    validate_response_body('ProductTagsError', 'ProductTagsError', Body, ValidatorState);
validate_response('product_tags/bulk_add', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_add', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_add', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_add', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('product_tags/bulk_delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/bulk_delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/list', 200, Body, ValidatorState) ->
    validate_response_body('ProductTagsResponse', 'ProductTagsResponse', Body, ValidatorState);
validate_response('product_tags/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('product_tags/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/create', 200, Body, ValidatorState) ->
    validate_response_body('PromotionsResponse', 'PromotionsResponse', Body, ValidatorState);
validate_response('promotions/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/delete', 200, Body, ValidatorState) ->
    validate_response_body('Promotion', 'Promotion', Body, ValidatorState);
validate_response('promotions/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('promotions/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/get', 200, Body, ValidatorState) ->
    validate_response_body('Promotion', 'Promotion', Body, ValidatorState);
validate_response('promotions/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/list', 200, Body, ValidatorState) ->
    validate_response_body('promotions_list_200_response', 'promotions_list_200_response', Body, ValidatorState);
validate_response('promotions/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/update', 200, Body, ValidatorState) ->
    validate_response_body('PromotionsResponse', 'PromotionsResponse', Body, ValidatorState);
validate_response('promotions/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('promotions/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_countries/get', 200, Body, ValidatorState) ->
    validate_response_body('ad_account_countries_get_200_response', 'ad_account_countries_get_200_response', Body, ValidatorState);
validate_response('ad_account_countries/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_countries/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_countries/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_countries/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_countries/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('ad_account_countries/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delivery_metrics/get', 200, Body, ValidatorState) ->
    validate_response_body('delivery_metrics_get_200_response', 'delivery_metrics_get_200_response', Body, ValidatorState);
validate_response('delivery_metrics/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delivery_metrics/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delivery_metrics/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delivery_metrics/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delivery_metrics/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('delivery_metrics/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('interest_targeting_options/get', 200, Body, ValidatorState) ->
    validate_response_body('SingleInterestTargetingOption', 'SingleInterestTargetingOption', Body, ValidatorState);
validate_response('interest_targeting_options/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('interest_targeting_options/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('interest_targeting_options/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('interest_targeting_options/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('interest_targeting_options/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('interest_targeting_options/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_questions/get', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('lead_form_questions/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_questions/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_questions/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_questions/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_questions/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('lead_form_questions/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('metrics_ready_state/get', 200, Body, ValidatorState) ->
    validate_response_body('BookClosed', 'BookClosed', Body, ValidatorState);
validate_response('metrics_ready_state/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('metrics_ready_state/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('metrics_ready_state/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('metrics_ready_state/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('metrics_ready_state/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('metrics_ready_state/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_options/get', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('targeting_options/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_options/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_options/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_options/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_options/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_options/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/create', 200, Body, ValidatorState) ->
    validate_response_body('list', 'schedules_create_200_response_inner', Body, ValidatorState);
validate_response('schedules/create', 201, Body, ValidatorState) ->
    validate_response_body('list', 'Schedule', Body, ValidatorState);
validate_response('schedules/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/list', 200, Body, ValidatorState) ->
    validate_response_body('schedules_list_200_response', 'schedules_list_200_response', Body, ValidatorState);
validate_response('schedules/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/update', 200, Body, ValidatorState) ->
    validate_response_body('list', 'schedules_create_200_response_inner', Body, ValidatorState);
validate_response('schedules/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('schedules/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_partner_pins', 200, Body, ValidatorState) ->
    validate_response_body('search_partner_pins_200_response', 'search_partner_pins_200_response', Body, ValidatorState);
validate_response('search_partner_pins', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_partner_pins', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_partner_pins', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_partner_pins', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_partner_pins', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_partner_pins', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_boards/get', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_200_response', 'boards_list_200_response', Body, ValidatorState);
validate_response('search_user_boards/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_boards/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_boards/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_boards/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_boards/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_boards/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_pins/list', 200, Body, ValidatorState) ->
    validate_response_body('pins_list_200_response', 'pins_list_200_response', Body, ValidatorState);
validate_response('search_user_pins/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_pins/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_pins/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_pins/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_pins/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('search_user_pins/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/create', 200, Body, ValidatorState) ->
    validate_response_body('TargetingTemplate', 'TargetingTemplate', Body, ValidatorState);
validate_response('targeting_template/create', 201, Body, ValidatorState) ->
    validate_response_body('TargetingTemplate', 'TargetingTemplate', Body, ValidatorState);
validate_response('targeting_template/create', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/create', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/create', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/create', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/create', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/create', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/list', 200, Body, ValidatorState) ->
    validate_response_body('targeting_template_list_200_response', 'targeting_template_list_200_response', Body, ValidatorState);
validate_response('targeting_template/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/update', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('targeting_template/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('targeting_template/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_related/list', 200, Body, ValidatorState) ->
    validate_response_body('RelatedTerms', 'RelatedTerms', Body, ValidatorState);
validate_response('terms_related/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_related/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_related/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_related/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_related/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_related/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_suggested/list', 200, Body, ValidatorState) ->
    validate_response_body('list', 'string', Body, ValidatorState);
validate_response('terms_suggested/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_suggested/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_suggested/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_suggested/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_suggested/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_suggested/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_of_service/get', 200, Body, ValidatorState) ->
    validate_response_body('TermsOfService', 'TermsOfService', Body, ValidatorState);
validate_response('terms_of_service/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_of_service/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_of_service/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_of_service/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_of_service/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('terms_of_service/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_editorial_articles/list', 200, Body, ValidatorState) ->
    validate_response_body('list', 'TrendsEditorial', Body, ValidatorState);
validate_response('trends_editorial_articles/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_editorial_articles/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_editorial_articles/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_editorial_articles/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_editorial_articles/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_editorial_articles/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_featured_topics/list', 200, Body, ValidatorState) ->
    validate_response_body('list', 'FeaturedTrend', Body, ValidatorState);
validate_response('trends_featured_topics/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_featured_topics/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_featured_topics/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_featured_topics/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_featured_topics/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_featured_topics/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_details/list', 200, Body, ValidatorState) ->
    validate_response_body('list', 'ProductCategoryDetails', Body, ValidatorState);
validate_response('trends_product_categories_details/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_details/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_details/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_details/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_details/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_details/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_trending/list', 200, Body, ValidatorState) ->
    validate_response_body('list', 'TrendingProductCategory', Body, ValidatorState);
validate_response('trends_product_categories_trending/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_trending/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_trending/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_trending/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_trending/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('trends_product_categories_trending/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_200_response', 'boards_list_200_response', Body, ValidatorState);
validate_response('boards_user_follows/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('boards_user_follows/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('follow_user/update', 200, Body, ValidatorState) ->
    validate_response_body('FollowUser', 'FollowUser', Body, ValidatorState);
validate_response('follow_user/update', 201, Body, ValidatorState) ->
    validate_response_body('FollowUser', 'FollowUser', Body, ValidatorState);
validate_response('follow_user/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('follow_user/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('follow_user/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('follow_user/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('follow_user/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('follow_user/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('followers/list', 200, Body, ValidatorState) ->
    validate_response_body('followers_list_200_response', 'followers_list_200_response', Body, ValidatorState);
validate_response('followers/list', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('followers/list', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('followers/list', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('followers/list', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('followers/list', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('followers/list', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('linked_business_accounts/get', 200, Body, ValidatorState) ->
    validate_response_body('list', 'LinkedBusiness', Body, ValidatorState);
validate_response('linked_business_accounts/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('linked_business_accounts/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('linked_business_accounts/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('linked_business_accounts/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('linked_business_accounts/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('linked_business_accounts/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('unverify_website/delete', 200, Body, ValidatorState) ->
    validate_response_body('UserWebsite', 'UserWebsite', Body, ValidatorState);
validate_response('unverify_website/delete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('unverify_website/delete', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('unverify_website/delete', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('unverify_website/delete', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('unverify_website/delete', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('unverify_website/delete', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('unverify_website/delete', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'AnalyticsMetricsResponse', Body, ValidatorState);
validate_response('user_account/analytics', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 200, Body, ValidatorState) ->
    validate_response_body('TopPinsAnalyticsResponse', 'TopPinsAnalyticsResponse', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_pins', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 200, Body, ValidatorState) ->
    validate_response_body('TopVideoPinsAnalyticsResponse', 'TopVideoPinsAnalyticsResponse', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/analytics/top_video_pins', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 200, Body, ValidatorState) ->
    validate_response_body('user_account_followed_interests_200_response', 'user_account_followed_interests_200_response', Body, ValidatorState);
validate_response('user_account/followed_interests', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/followed_interests', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/get', 200, Body, ValidatorState) ->
    validate_response_body('Account', 'Account', Body, ValidatorState);
validate_response('user_account/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_account/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_following/get', 200, Body, ValidatorState) ->
    validate_response_body('followers_list_200_response', 'followers_list_200_response', Body, ValidatorState);
validate_response('user_following/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_following/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_following/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_following/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_following/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_following/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_websites/get', 200, Body, ValidatorState) ->
    validate_response_body('user_websites_get_200_response', 'user_websites_get_200_response', Body, ValidatorState);
validate_response('user_websites/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_websites/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_websites/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_websites/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_websites/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('user_websites/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('verify_website/update', 200, Body, ValidatorState) ->
    validate_response_body('UserWebsite', 'UserWebsite', Body, ValidatorState);
validate_response('verify_website/update', 201, Body, ValidatorState) ->
    validate_response_body('UserWebsite', 'UserWebsite', Body, ValidatorState);
validate_response('verify_website/update', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('verify_website/update', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('verify_website/update', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('verify_website/update', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('verify_website/update', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('verify_website/update', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('website_verification/get', 200, Body, ValidatorState) ->
    validate_response_body('UserWebsiteVerification', 'UserWebsiteVerification', Body, ValidatorState);
validate_response('website_verification/get', 400, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('website_verification/get', 401, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('website_verification/get', 403, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('website_verification/get', 404, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('website_verification/get', 429, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response('website_verification/get', 0, Body, ValidatorState) ->
    validate_response_body('Pinterest.Lib.Error', 'Pinterest.Lib.Error', Body, ValidatorState);
validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

%%%
-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].
request_params('ad_account/analytics') ->
    [
        'start_date',
        'end_date',
        'columns',
        'granularity',
        'ad_account_id',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'reporting_timezone'
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
        'attribution_types',
        'reporting_timezone'
    ];
request_params('ad_accounts/create') ->
    [
        'AdAccountCreate'
    ];
request_params('ad_accounts/get') ->
    [
        'ad_account_id'
    ];
request_params('ad_accounts/list') ->
    [
        'include_shared_accounts',
        'bookmark',
        'page_size'
    ];
request_params('analytics/create_conversion_product_report') ->
    [
        'ad_account_id',
        'ConversionProductReportCreate'
    ];
request_params('analytics/create_mmm_report') ->
    [
        'ad_account_id',
        'MMMReportCreate'
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
request_params('analytics/get_conversion_product_report') ->
    [
        'ad_account_id',
        'token'
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
        'bookmark',
        'page_size',
        'order'
    ];
request_params('ad_groups/analytics') ->
    [
        'start_date',
        'end_date',
        'ad_group_ids',
        'columns',
        'granularity',
        'ad_account_id',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'aggregate_report_rows',
        'reporting_timezone'
    ];
request_params('ad_groups/audience_sizing') ->
    [
        'ad_account_id',
        'AdGroupAudienceSizingCreate'
    ];
request_params('ad_groups_bid_floor/get') ->
    [
        'ad_account_id',
        'BidFloorCreate'
    ];
request_params('ad_groups/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('ad_groups_dynamic_titles/download_csv') ->
    [
        'ad_account_id',
        'ad_group_id'
    ];
request_params('ad_groups_dynamic_titles/get_status') ->
    [
        'ad_account_id',
        'ad_group_id'
    ];
request_params('ad_groups_dynamic_titles/get_upload_url') ->
    [
        'ad_account_id',
        'ad_group_id'
    ];
request_params('ad_groups_dynamic_titles/process_csv') ->
    [
        'ad_account_id',
        'ad_group_id',
        'DynamicTitlesProcessCSVCreate'
    ];
request_params('ad_groups/get') ->
    [
        'ad_group_id',
        'ad_account_id'
    ];
request_params('ad_groups/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'campaign_ids',
        'ad_group_ids',
        'entity_statuses',
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
        'attribution_types',
        'reporting_timezone',
        'sort_columns',
        'sort_ascending'
    ];
request_params('ad_groups/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('get_ad_groups_by_promotion_ids/list') ->
    [
        'ad_account_id',
        'promotion_ids',
        'bookmark',
        'page_size',
        'order'
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
        'attribution_types',
        'reporting_timezone',
        'sort_columns',
        'sort_ascending'
    ];
request_params('ads/analytics') ->
    [
        'start_date',
        'end_date',
        'columns',
        'granularity',
        'ad_account_id',
        'pin_ids',
        'ad_ids',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'campaign_ids',
        'reporting_timezone'
    ];
request_params('ads/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('ads/get') ->
    [
        'ad_id',
        'ad_account_id'
    ];
request_params('ads/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'campaign_ids',
        'ad_group_ids',
        'ad_ids',
        'entity_statuses'
    ];
request_params('ads/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('campaign_ad_preview/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('campaign_ad_preview/delete') ->
    [
        'ad_group_ids',
        'ad_account_id'
    ];
request_params('campaign_ad_preview/read') ->
    [
        'ad_group_ids',
        'ad_account_id'
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
        'audience_id',
        'account_type',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('business_account_audiences_shared_accounts/list') ->
    [
        'business_id',
        'audience_id',
        'account_type',
        'bookmark',
        'page_size'
    ];
request_params('shared_audiences_for_business/list') ->
    [
        'business_id',
        'order',
        'bookmark',
        'page_size'
    ];
request_params('update_ad_account_to_ad_account_shared_audience') ->
    [
        'ad_account_id',
        'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody'
    ];
request_params('update_ad_account_to_business_shared_audience') ->
    [
        'ad_account_id',
        'AdAccountToBusinessSharedAudienceUpdateWithRequiredBody'
    ];
request_params('update_business_to_ad_account_shared_audience') ->
    [
        'business_id',
        'BusinessToAdAccountSharedAudienceUpdateWithRequiredBody'
    ];
request_params('update_business_to_business_shared_audience') ->
    [
        'business_id',
        'BusinessToBusinessSharedAudienceUpdateWithRequiredBody'
    ];
request_params('audiences/create') ->
    [
        'ad_account_id',
        'AdAccountsAudienceCreate'
    ];
request_params('audiences/get') ->
    [
        'audience_id',
        'ad_account_id'
    ];
request_params('audiences/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'ownership_type',
        'exclude_nca'
    ];
request_params('audiences/update') ->
    [
        'audience_id',
        'ad_account_id',
        'AdAccountsAudienceUpdate'
    ];
request_params('ads_credit/redeem') ->
    [
        'ad_account_id',
        'AdsCreditRedeemCreate'
    ];
request_params('ads_credits_discounts/get') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('billing_invoice_download/get') ->
    [
        'ad_account_id',
        'billing_invoice_id'
    ];
request_params('billing_invoices/get') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'sort',
        'status',
        'document_type',
        'start_due_date',
        'end_due_date'
    ];
request_params('billing_profiles/get') ->
    [
        'is_active',
        'ad_account_id',
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
        'SSIOInsertionOrderCreate'
    ];
request_params('ssio_insertion_order/edit') ->
    [
        'ad_account_id',
        'SSIOInsertionOrderUpdate'
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
        'pin_order_id',
        'bookmark',
        'page_size'
    ];
request_params('board_sections/create') ->
    [
        'board_id',
        'BoardSectionCreate',
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
        'BoardSectionUpdateWithRequiredBody',
        'ad_account_id'
    ];
request_params('boards/create') ->
    [
        'BoardCreate',
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
        'privacy',
        'bookmark',
        'page_size'
    ];
request_params('boards/list_pins') ->
    [
        'board_id',
        'creative_types',
        'ad_account_id',
        'pin_metrics',
        'bookmark',
        'page_size'
    ];
request_params('boards/update') ->
    [
        'board_id',
        'BoardWithUpdatePrivacyUpdate',
        'ad_account_id'
    ];
request_params('bulk_download/create') ->
    [
        'ad_account_id',
        'BulkDownloadCreate'
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
        'AssetGroupInputCreate'
    ];
request_params('asset_group/delete') ->
    [
        'business_id',
        'AssetGroupDeletionDelete'
    ];
request_params('asset_group/update') ->
    [
        'business_id',
        'AssetGroupModificationReadOrUpdate'
    ];
request_params('business_asset_members/get') ->
    [
        'business_id',
        'asset_id',
        'start_index',
        'fetch_system_users',
        'bookmark',
        'page_size'
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
        'sort_by',
        'sort_ascending',
        'search_by',
        'search_value',
        'asset_permission_type',
        'ad_account_statuses',
        'bookmark',
        'page_size'
    ];
request_params('business_members_asset_access/delete') ->
    [
        'business_id',
        'BusinessMembersAssetAccessDeleteBody'
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
        'sort_by',
        'sort_ascending',
        'search_by',
        'search_value',
        'bookmark',
        'page_size'
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
        'CancelInvitesRequest'
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
request_params('brand_accounts/create') ->
    [
        'business_hierarchy_id',
        'BrandAccountCreate'
    ];
request_params('brand_accounts/update') ->
    [
        'brand_account_id',
        'business_hierarchy_id',
        'BrandAccountUpdate'
    ];
request_params('delete_business_membership') ->
    [
        'business_id',
        'DeleteBusinessMembershipBody'
    ];
request_params('delete_business_partners') ->
    [
        'business_id',
        'DeleteBusinessPartnersDelete'
    ];
request_params('get/business_employers') ->
    [
        'assets_summary',
        'bookmark',
        'page_size'
    ];
request_params('get/business_members') ->
    [
        'business_id',
        'fetch_system_users',
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
        'sort_ascending',
        'bookmark',
        'page_size'
    ];
request_params('system_user/update') ->
    [
        'business_id',
        'system_user_id',
        'SystemUserUpdateWithRequiredBody'
    ];
request_params('update/business_memberships') ->
    [
        'business_id',
        'array'
    ];
request_params('ad_pins/analytics') ->
    [
        'campaign_id',
        'pin_ids',
        'start_date',
        'end_date',
        'columns',
        'granularity',
        'ad_account_id',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
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
        'attribution_types',
        'reporting_timezone'
    ];
request_params('campaigns/analytics') ->
    [
        'start_date',
        'end_date',
        'campaign_ids',
        'columns',
        'granularity',
        'ad_account_id',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'aggregate_report_rows',
        'reporting_timezone'
    ];
request_params('campaigns/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('campaigns/get') ->
    [
        'campaign_id',
        'ad_account_id'
    ];
request_params('campaigns/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'campaign_ids',
        'entity_statuses'
    ];
request_params('campaigns/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('get_campaign_delivery_estimates') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('feed_processing_results/list') ->
    [
        'feed_id',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('feeds/create') ->
    [
        'CatalogsFeedCreateRequestSchema',
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
        'catalog_id',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('feeds/update') ->
    [
        'feed_id',
        'CatalogsFeedUpdateRequestSchema',
        'ad_account_id'
    ];
request_params('items_issues/list') ->
    [
        'processing_result_id',
        'item_numbers',
        'item_validation_issue',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('items_batch/get') ->
    [
        'batch_id',
        'ad_account_id'
    ];
request_params('items_batch/post') ->
    [
        'CatalogsItemsBatchPostRequest',
        'ad_account_id'
    ];
request_params('items/post') ->
    [
        'CatalogsItemsRequest',
        'ad_account_id'
    ];
request_params('catalogs_product_group_pins/list') ->
    [
        'product_group_id',
        'ad_account_id',
        'pin_metrics',
        'bookmark',
        'page_size'
    ];
request_params('catalogs_product_groups/create') ->
    [
        'CatalogsProductGroupsCreateRequestSchema',
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
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('catalogs_product_groups/product_counts_get') ->
    [
        'product_group_id',
        'ad_account_id'
    ];
request_params('catalogs_product_groups/update') ->
    [
        'product_group_id',
        'CatalogsProductGroupsUpdateRequestSchema',
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
        'bookmark',
        'page_size'
    ];
request_params('catalogs_local_inventory_items_batch/operate') ->
    [
        'catalog_id',
        'LocalInventoryItemsBatchCreate',
        'ad_account_id'
    ];
request_params('catalogs_local_inventory_items/post') ->
    [
        'catalog_id',
        'LocalInventoryItemsGetCreate',
        'ad_account_id'
    ];
request_params('catalogs_local_stores/create') ->
    [
        'catalog_id',
        'array',
        'ad_account_id'
    ];
request_params('catalogs_local_stores/delete') ->
    [
        'catalog_id',
        'ids',
        'ad_account_id'
    ];
request_params('catalogs_local_stores/list') ->
    [
        'catalog_id',
        'ids',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('catalogs_local_stores/update') ->
    [
        'catalog_id',
        'array',
        'ad_account_id'
    ];
request_params('catalogs_supplemental_items_batch/get') ->
    [
        'catalog_id',
        'batch_id',
        'ad_account_id'
    ];
request_params('catalogs/available_filter_values') ->
    [
        'catalog_id',
        'feed_id',
        'country',
        'language',
        'ad_account_id'
    ];
request_params('catalogs/create') ->
    [
        'CatalogCreate',
        'ad_account_id'
    ];
request_params('catalogs/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size'
    ];
request_params('conversion_deletion_request/create') ->
    [
        'ad_account_id',
        'ConversionDeletionRequestCreate'
    ];
request_params('conversion_deletion_request/delete') ->
    [
        'request_id',
        'ad_account_id'
    ];
request_params('conversion_deletion_request/get') ->
    [
        'request_id',
        'ad_account_id'
    ];
request_params('conversion_deletion_request/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order'
    ];
request_params('conversion_eqs/list') ->
    [
        'lookback_period',
        'ad_account_id',
        'source_platform',
        'ingestion_source'
    ];
request_params('events/create') ->
    [
        'ad_account_id',
        'ConversionEventsCreate',
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
        'bookmark',
        'page_size',
        'order'
    ];
request_params('advertiser_defined_events/create') ->
    [
        'ad_account_id',
        'AdvertiserDefinedEventsCreateRequest'
    ];
request_params('advertiser_defined_events/delete') ->
    [
        'ad_account_id',
        'event_names'
    ];
request_params('advertiser_defined_events/get') ->
    [
        'ad_account_id'
    ];
request_params('advertiser_defined_events/update') ->
    [
        'ad_account_id',
        'AdvertiserDefinedEventsCreateRequest'
    ];
request_params('customer_list_uploads/create') ->
    [
        'ad_account_id',
        'customer_list_id',
        'CustomerListUploadCreateRequest'
    ];
request_params('customer_list_uploads/get') ->
    [
        'ad_account_id',
        'customer_list_id',
        'customer_list_upload_id'
    ];
request_params('customer_list_uploads/run') ->
    [
        'ad_account_id',
        'customer_list_id',
        'customer_list_upload_id'
    ];
request_params('customer_lists/create') ->
    [
        'ad_account_id',
        'CustomerListCreate'
    ];
request_params('customer_lists/get') ->
    [
        'ad_account_id',
        'customer_list_id'
    ];
request_params('customer_lists/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'exclude_nca'
    ];
request_params('customer_lists/update') ->
    [
        'ad_account_id',
        'customer_list_id',
        'CustomerListUpdateWithRequiredBody'
    ];
request_params('customer_segment/create') ->
    [
        'ad_account_id',
        'CustomerSegmentCreate'
    ];
request_params('customer_segment/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'include_sizing',
        'search_query'
    ];
request_params('customer_segment/update') ->
    [
        'ad_account_id',
        'CustomerSegmentUpdateRequestUpdateWithRequiredBody'
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
        'IntegrationMetadataUpdate'
    ];
request_params('integrations_commerce/post') ->
    [
        'IntegrationMetadataCreate'
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
        'IntegrationLogsRequestCreate'
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
        'KeywordsCreate'
    ];
request_params('keywords/get') ->
    [
        'ad_account_id',
        'campaign_id',
        'ad_group_id',
        'ad_group_ids',
        'match_types',
        'bookmark',
        'page_size'
    ];
request_params('keywords/update') ->
    [
        'ad_account_id',
        'KeywordsUpdate'
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
        'limit',
        'include_demographics'
    ];
request_params('labels/apply') ->
    [
        'ad_account_id',
        'label_id',
        'LabeledEntitiesCreate'
    ];
request_params('labels/create') ->
    [
        'ad_account_id',
        'LabelCreateRequest'
    ];
request_params('labels/list') ->
    [
        'ad_account_id',
        'campaign_ids',
        'label_ids',
        'entity_statuses',
        'label_types',
        'bookmark',
        'page_size'
    ];
request_params('labels/remove') ->
    [
        'ad_account_id',
        'label_id',
        'LabeledEntitiesCreate'
    ];
request_params('labels/update') ->
    [
        'ad_account_id',
        'LabelUpdateRequest'
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
        'bookmark',
        'page_size'
    ];
request_params('ad_accounts_subscriptions/post') ->
    [
        'ad_account_id',
        'LeadSubscriptionPostParamsCreate'
    ];
request_params('lead_form/get') ->
    [
        'lead_form_id',
        'ad_account_id'
    ];
request_params('lead_form_test/create') ->
    [
        'ad_account_id',
        'lead_form_id',
        'LeadFormTestCreate'
    ];
request_params('lead_forms/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('lead_forms/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order'
    ];
request_params('lead_forms/update') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('leads_export/create') ->
    [
        'ad_account_id',
        'LeadsExportsCreate'
    ];
request_params('leads_export/get') ->
    [
        'ad_account_id',
        'leads_export_id'
    ];
request_params('media/create') ->
    [
        'MediaUploadCreate'
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
request_params('msot_events/create') ->
    [
        'ad_account_id',
        'ConversionMSOTEventsCreate'
    ];
request_params('notification/post') ->
    [
        'NotificationPostRequest'
    ];
request_params('oauth/conversion_token') ->
    [
    ];
request_params('oauth/token') ->
    [
        'grant_type',
        'code',
        'continuous_refresh',
        'redirect_uri',
        'refresh_token',
        'scope'
    ];
request_params('token/revoke') ->
    [
        'token',
        'token_type_hint'
    ];
request_params('order_lines/get') ->
    [
        'order_line_id',
        'ad_account_id'
    ];
request_params('order_lines/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order'
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
        'ad_account_id',
        'pin_metrics'
    ];
request_params('pins/list') ->
    [
        'pin_filter',
        'pin_metrics',
        'include_protected_pins',
        'pin_type',
        'creative_types',
        'ad_account_id',
        'domain',
        'domains',
        'include_product_tag_obj',
        'bookmark',
        'page_size'
    ];
request_params('pins/save') ->
    [
        'pin_id',
        'PinsSaveRequestCreate',
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
        'ProductGroupPromotionsCreate'
    ];
request_params('product_group_promotions/get') ->
    [
        'ad_account_id',
        'product_group_promotion_id'
    ];
request_params('product_group_promotions/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order',
        'product_group_promotion_ids',
        'entity_statuses',
        'ad_group_id'
    ];
request_params('product_group_promotions/update') ->
    [
        'ad_account_id',
        'ProductGroupPromotionsUpdateWithRequiredBody'
    ];
request_params('product_groups/analytics') ->
    [
        'start_date',
        'end_date',
        'product_group_ids',
        'columns',
        'granularity',
        'ad_account_id',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'reporting_timezone'
    ];
request_params('product_tags/bulk_add') ->
    [
        'pin_id',
        'ProductTagsBulkAddRequest'
    ];
request_params('product_tags/bulk_delete') ->
    [
        'pin_id',
        'ProductTagsBulkDeleteRequest'
    ];
request_params('product_tags/list') ->
    [
        'pin_id'
    ];
request_params('promotions/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('promotions/delete') ->
    [
        'promotion_id',
        'ad_account_id'
    ];
request_params('promotions/get') ->
    [
        'promotion_id',
        'ad_account_id'
    ];
request_params('promotions/list') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'order'
    ];
request_params('promotions/update') ->
    [
        'ad_account_id',
        'array'
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
        'ad_account_id',
        'client_id',
        'oauth_signature',
        'timestamp'
    ];
request_params('schedules/create') ->
    [
        'ad_account_id',
        'array'
    ];
request_params('schedules/list') ->
    [
        'ad_account_id',
        'entity_ids',
        'bookmark',
        'page_size',
        'order',
        'schedule_statuses',
        'schedule_type'
    ];
request_params('schedules/update') ->
    [
        'ad_account_id',
        'array'
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
        'query',
        'bookmark',
        'page_size'
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
        'bookmark',
        'page_size',
        'order',
        'include_sizing',
        'search_query'
    ];
request_params('targeting_template/update') ->
    [
        'ad_account_id',
        'TargetingTemplateUpdateRequestReadOrUpdate'
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
request_params('trends_editorial_articles/list') ->
    [
        'region'
    ];
request_params('trends_featured_topics/list') ->
    [
        'region',
        'interest'
    ];
request_params('trends_product_categories_details/list') ->
    [
        'product_categories',
        'region',
        'lookback_window',
        'engagement_type'
    ];
request_params('trends_product_categories_trending/list') ->
    [
        'region',
        'verticals',
        'ages',
        'genders',
        'engagement_type'
    ];
request_params('boards_user_follows/list') ->
    [
        'ad_account_id',
        'explicit_following',
        'bookmark',
        'page_size'
    ];
request_params('follow_user/update') ->
    [
        'username',
        'FollowUserCreate'
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
        'ad_account_id',
        'explicit_following',
        'feed_type',
        'bookmark',
        'page_size'
    ];
request_params('user_websites/get') ->
    [
        'bookmark',
        'page_size'
    ];
request_params('verify_website/update') ->
    [
        'UserWebsiteCreate',
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
request_param_info('ad_account/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('ad_account/analytics', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_account_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('ad_account_targeting_analytics/get', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_accounts/create', 'AdAccountCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdAccountCreate">>},
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
request_param_info('ad_accounts/list', 'include_shared_accounts') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
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
request_param_info('analytics/create_conversion_product_report', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/create_conversion_product_report', 'ConversionProductReportCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ConversionProductReportCreate">>},
            required
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
request_param_info('analytics/create_mmm_report', 'MMMReportCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/MMMReportCreate">>},
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
request_param_info('analytics/get_conversion_product_report', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('analytics/get_conversion_product_report', 'token') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
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
request_param_info('templates/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
            not_required
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
request_param_info('ad_groups/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('ad_groups/analytics', 'aggregate_report_rows') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('ad_groups/analytics', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('ad_groups/audience_sizing', 'AdGroupAudienceSizingCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdGroupAudienceSizingCreate">>},
            required
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
request_param_info('ad_groups_bid_floor/get', 'BidFloorCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BidFloorCreate">>},
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
            {schema, list, <<"#/components/schemas/AdGroupCreateCreate">>},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/download_csv', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/download_csv', 'ad_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/get_status', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/get_status', 'ad_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/get_upload_url', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/get_upload_url', 'ad_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/process_csv', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/process_csv', 'ad_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_groups_dynamic_titles/process_csv', 'DynamicTitlesProcessCSVCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/DynamicTitlesProcessCSVCreate">>},
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
request_param_info('ad_groups/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
            not_required
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('ad_groups_targeting_analytics/get', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'sort_columns') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_groups_targeting_analytics/get', 'sort_ascending') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
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
            {schema, list, <<"#/components/schemas/AdGroupUpdateBatchUpdate">>},
            required
        ]
    };
request_param_info('get_ad_groups_by_promotion_ids/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('get_ad_groups_by_promotion_ids/list', 'promotion_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('get_ad_groups_by_promotion_ids/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('get_ad_groups_by_promotion_ids/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('get_ad_groups_by_promotion_ids/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
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
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('ad_targeting_analytics/get', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'sort_columns') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ad_targeting_analytics/get', 'sort_ascending') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
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
request_param_info('ads/analytics', 'pin_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ads/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ads/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('ads/analytics', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('ads/analytics', 'reporting_timezone') ->
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
            {schema, list, <<"#/components/schemas/AdCreate">>},
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
request_param_info('ads/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
            not_required
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
            {schema, list, <<"#/components/schemas/AdBatchUpdate">>},
            required
        ]
    };
request_param_info('campaign_ad_preview/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaign_ad_preview/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/CampaignAdPreviewCreate">>},
            required
        ]
    };
request_param_info('campaign_ad_preview/delete', 'ad_group_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('campaign_ad_preview/delete', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('campaign_ad_preview/read', 'ad_group_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('campaign_ad_preview/read', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
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
request_param_info('ad_accounts_audiences_shared_accounts/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
request_param_info('business_account_audiences_shared_accounts/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
request_param_info('shared_audiences_for_business/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
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
request_param_info('update_ad_account_to_ad_account_shared_audience', 'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody">>},
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
request_param_info('update_ad_account_to_business_shared_audience', 'AdAccountToBusinessSharedAudienceUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody">>},
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
request_param_info('update_business_to_ad_account_shared_audience', 'BusinessToAdAccountSharedAudienceUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody">>},
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
request_param_info('update_business_to_business_shared_audience', 'BusinessToBusinessSharedAudienceUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BusinessToBusinessSharedAudienceUpdateWithRequiredBody">>},
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
request_param_info('audiences/create', 'AdAccountsAudienceCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdAccountsAudienceCreate">>},
            required
        ]
    };
request_param_info('audiences/get', 'audience_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
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
request_param_info('audiences/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('audiences/list', 'ownership_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('audiences/list', 'exclude_nca') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('audiences/update', 'audience_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
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
request_param_info('audiences/update', 'AdAccountsAudienceUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdAccountsAudienceUpdate">>},
            required
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
request_param_info('ads_credit/redeem', 'AdsCreditRedeemCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdsCreditRedeemCreate">>},
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
request_param_info('billing_invoice_download/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('billing_invoice_download/get', 'billing_invoice_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('billing_invoices/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('billing_invoices/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('billing_invoices/get', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('billing_invoices/get', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('billing_invoices/get', 'sort') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('billing_invoices/get', 'status') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('billing_invoices/get', 'document_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('billing_invoices/get', 'start_due_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            not_required
        ]
    };
request_param_info('billing_invoices/get', 'end_due_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            not_required
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
request_param_info('ssio_insertion_order/create', 'SSIOInsertionOrderCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SSIOInsertionOrderCreate">>},
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
request_param_info('ssio_insertion_order/edit', 'SSIOInsertionOrderUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SSIOInsertionOrderUpdate">>},
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
request_param_info('ssio_order_lines/get_by_ad_account', 'pin_order_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
request_param_info('board_sections/create', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('board_sections/create', 'BoardSectionCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BoardSectionCreate">>},
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
request_param_info('board_sections/update', 'BoardSectionUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BoardSectionUpdateWithRequiredBody">>},
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
request_param_info('boards/create', 'BoardCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BoardCreate">>},
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
request_param_info('boards/list', 'privacy') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('boards/list_pins', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('boards/list_pins', 'creative_types') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('boards/update', 'board_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('boards/update', 'BoardWithUpdatePrivacyUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BoardWithUpdatePrivacyUpdate">>},
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
request_param_info('bulk_download/create', 'BulkDownloadCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BulkDownloadCreate">>},
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
request_param_info('asset_group/create', 'AssetGroupInputCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AssetGroupInputCreate">>},
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
request_param_info('asset_group/delete', 'AssetGroupDeletionDelete') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AssetGroupDeletionDelete">>},
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
request_param_info('asset_group/update', 'AssetGroupModificationReadOrUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AssetGroupModificationReadOrUpdate">>},
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
request_param_info('business_asset_members/get', 'start_index') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {min, 0},
            not_required
        ]
    };
request_param_info('business_asset_members/get', 'fetch_system_users') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
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
            {enum, ['AD_ACCOUNT', 'PROFILE', 'ASSET_GROUP', 'CATALOG', 'CONSUMER'] },
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
            {enum, ['AD_ACCOUNT', 'PROFILE', 'ASSET_GROUP', 'CATALOG', 'CONSUMER', 'CONVERSION_TAG'] },
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
request_param_info('business_member_assets/get', 'sort_by') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'sort_ascending') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'search_by') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'search_value') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'asset_permission_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('business_member_assets/get', 'ad_account_statuses') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('business_members_asset_access/delete', 'BusinessMembersAssetAccessDeleteBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BusinessMembersAssetAccessDeleteBody">>},
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
            {type, binary},
            {enum, ['INTERNAL', 'EXTERNAL'] },
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'asset_type') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['AD_ACCOUNT', 'PROFILE', 'ASSET_GROUP', 'PINNER_LIST', 'CONVERSION_TAG', 'CATALOG', 'CONSUMER', 'CONVERSION_SEGMENT'] },
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
request_param_info('business_partner_asset_access/get', 'sort_by') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'sort_ascending') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'search_by') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('business_partner_asset_access/get', 'search_value') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
            {min_length, 1},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('cancel_invites_or_requests', 'CancelInvitesRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CancelInvitesRequest">>},
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
request_param_info('brand_accounts/create', 'business_hierarchy_id') ->
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
request_param_info('brand_accounts/create', 'BrandAccountCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BrandAccountCreate">>},
            required
        ]
    };
request_param_info('brand_accounts/update', 'brand_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('brand_accounts/update', 'business_hierarchy_id') ->
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
request_param_info('brand_accounts/update', 'BrandAccountUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/BrandAccountUpdate">>},
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
request_param_info('delete_business_membership', 'DeleteBusinessMembershipBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/DeleteBusinessMembershipBody">>},
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
request_param_info('delete_business_partners', 'DeleteBusinessPartnersDelete') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/DeleteBusinessPartnersDelete">>},
            required
        ]
    };
request_param_info('get/business_employers', 'assets_summary') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
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
request_param_info('get/business_members', 'fetch_system_users') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
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
request_param_info('get/business_partners', 'sort_ascending') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
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
request_param_info('system_user/update', 'business_id') ->
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
request_param_info('system_user/update', 'system_user_id') ->
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
request_param_info('system_user/update', 'SystemUserUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SystemUserUpdateWithRequiredBody">>},
            required
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
            {schema, list, <<"#/components/schemas/BusinessMembershipMember">>},
            required
        ]
    };
request_param_info('ad_pins/analytics', 'campaign_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_pins/analytics', 'pin_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_pins/analytics', 'start_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_pins/analytics', 'end_date') ->
    #{
        source => qs_val,
        rules => [
            {type, date},
            required
        ]
    };
request_param_info('ad_pins/analytics', 'columns') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_pins/analytics', 'granularity') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('ad_pins/analytics', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('ad_pins/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_pins/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_pins/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('ad_pins/analytics', 'conversion_report_time') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaign_targeting_analytics/get', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('campaign_targeting_analytics/get', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
            not_required
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
request_param_info('campaigns/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaigns/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('campaigns/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('campaigns/analytics', 'aggregate_report_rows') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('campaigns/analytics', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
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
            {schema, list, <<"#/components/schemas/CampaignCreateItem">>},
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
request_param_info('campaigns/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
            not_required
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
            {schema, list, <<"#/components/schemas/CampaignBatchUpdateItem">>},
            required
        ]
    };
request_param_info('get_campaign_delivery_estimates', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('get_campaign_delivery_estimates', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/CampaignDeliveryEstimatesCampaign">>},
            required
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
request_param_info('feeds/create', 'CatalogsFeedCreateRequestSchema') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsFeedCreateRequestSchema">>},
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
request_param_info('feeds/update', 'feed_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('feeds/update', 'CatalogsFeedUpdateRequestSchema') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsFeedUpdateRequestSchema">>},
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
request_param_info('items_issues/list', 'processing_result_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
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
request_param_info('items_batch/get', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
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
request_param_info('items_batch/post', 'CatalogsItemsBatchPostRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsItemsBatchPostRequest">>},
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
request_param_info('catalogs_product_group_pins/list', 'product_group_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
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
request_param_info('catalogs_product_groups/create', 'CatalogsProductGroupsCreateRequestSchema') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsProductGroupsCreateRequestSchema">>},
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
            {schema, list, <<"#/components/schemas/CatalogsProductGroupsCreateManyRequestItems">>},
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
request_param_info('catalogs_product_groups/update', 'CatalogsProductGroupsUpdateRequestSchema') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogsProductGroupsUpdateRequestSchema">>},
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
request_param_info('reports/stats', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
request_param_info('catalogs_local_inventory_items_batch/operate', 'catalog_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 19},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_local_inventory_items_batch/operate', 'LocalInventoryItemsBatchCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LocalInventoryItemsBatchCreate">>},
            required
        ]
    };
request_param_info('catalogs_local_inventory_items_batch/operate', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_local_inventory_items/post', 'catalog_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 19},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_local_inventory_items/post', 'LocalInventoryItemsGetCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LocalInventoryItemsGetCreate">>},
            required
        ]
    };
request_param_info('catalogs_local_inventory_items/post', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_local_stores/create', 'catalog_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 19},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_local_stores/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/LocalStoreCreate">>},
            required
        ]
    };
request_param_info('catalogs_local_stores/create', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_local_stores/delete', 'catalog_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 19},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_local_stores/delete', 'ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('catalogs_local_stores/delete', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_local_stores/list', 'catalog_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 19},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_local_stores/list', 'ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('catalogs_local_stores/list', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_local_stores/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('catalogs_local_stores/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('catalogs_local_stores/update', 'catalog_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 19},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_local_stores/update', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/LocalStoreBatchUpdate">>},
            required
        ]
    };
request_param_info('catalogs_local_stores/update', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs_supplemental_items_batch/get', 'catalog_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 19},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_supplemental_items_batch/get', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs_supplemental_items_batch/get', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs/available_filter_values', 'catalog_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('catalogs/available_filter_values', 'feed_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs/available_filter_values', 'country') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('catalogs/available_filter_values', 'language') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('catalogs/available_filter_values', 'ad_account_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            not_required
        ]
    };
request_param_info('catalogs/create', 'CatalogCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CatalogCreate">>},
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
request_param_info('conversion_deletion_request/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_deletion_request/create', 'ConversionDeletionRequestCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ConversionDeletionRequestCreate">>},
            required
        ]
    };
request_param_info('conversion_deletion_request/delete', 'request_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_deletion_request/delete', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_deletion_request/get', 'request_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_deletion_request/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_deletion_request/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_deletion_request/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('conversion_deletion_request/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('conversion_deletion_request/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('conversion_eqs/list', 'lookback_period') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('conversion_eqs/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('conversion_eqs/list', 'source_platform') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('conversion_eqs/list', 'ingestion_source') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('events/create', 'ConversionEventsCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ConversionEventsCreate">>},
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
request_param_info('page_visit_conversion_tags/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
            not_required
        ]
    };
request_param_info('advertiser_defined_events/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('advertiser_defined_events/create', 'AdvertiserDefinedEventsCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdvertiserDefinedEventsCreateRequest">>},
            required
        ]
    };
request_param_info('advertiser_defined_events/delete', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('advertiser_defined_events/delete', 'event_names') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('advertiser_defined_events/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('advertiser_defined_events/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('advertiser_defined_events/update', 'AdvertiserDefinedEventsCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/AdvertiserDefinedEventsCreateRequest">>},
            required
        ]
    };
request_param_info('customer_list_uploads/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_list_uploads/create', 'customer_list_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_list_uploads/create', 'CustomerListUploadCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CustomerListUploadCreateRequest">>},
            required
        ]
    };
request_param_info('customer_list_uploads/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_list_uploads/get', 'customer_list_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_list_uploads/get', 'customer_list_upload_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_list_uploads/run', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_list_uploads/run', 'customer_list_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_list_uploads/run', 'customer_list_upload_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
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
request_param_info('customer_lists/create', 'CustomerListCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CustomerListCreate">>},
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
request_param_info('customer_lists/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
            not_required
        ]
    };
request_param_info('customer_lists/list', 'exclude_nca') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
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
request_param_info('customer_lists/update', 'CustomerListUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CustomerListUpdateWithRequiredBody">>},
            required
        ]
    };
request_param_info('customer_segment/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_segment/create', 'CustomerSegmentCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CustomerSegmentCreate">>},
            required
        ]
    };
request_param_info('customer_segment/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_segment/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('customer_segment/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('customer_segment/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('customer_segment/list', 'include_sizing') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('customer_segment/list', 'search_query') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('customer_segment/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('customer_segment/update', 'CustomerSegmentUpdateRequestUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CustomerSegmentUpdateRequestUpdateWithRequiredBody">>},
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
request_param_info('integrations_commerce/patch', 'IntegrationMetadataUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/IntegrationMetadataUpdate">>},
            required
        ]
    };
request_param_info('integrations_commerce/post', 'IntegrationMetadataCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/IntegrationMetadataCreate">>},
            required
        ]
    };
request_param_info('integrations/get_by_id', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
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
request_param_info('integrations_logs/post', 'IntegrationLogsRequestCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/IntegrationLogsRequestCreate">>},
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
request_param_info('keywords/create', 'KeywordsCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/KeywordsCreate">>},
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
request_param_info('keywords/get', 'ad_group_ids') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('keywords/get', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
request_param_info('keywords/update', 'KeywordsUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/KeywordsUpdate">>},
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
            not_required
        ]
    };
request_param_info('trending_keywords/list', 'genders') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trending_keywords/list', 'ages') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('trending_keywords/list', 'include_demographics') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('labels/apply', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('labels/apply', 'label_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('labels/apply', 'LabeledEntitiesCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LabeledEntitiesCreate">>},
            required
        ]
    };
request_param_info('labels/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('labels/create', 'LabelCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LabelCreateRequest">>},
            required
        ]
    };
request_param_info('labels/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('labels/list', 'campaign_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('labels/list', 'label_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('labels/list', 'entity_statuses') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('labels/list', 'label_types') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('labels/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('labels/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('labels/remove', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('labels/remove', 'label_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('labels/remove', 'LabeledEntitiesCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LabeledEntitiesCreate">>},
            required
        ]
    };
request_param_info('labels/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('labels/update', 'LabelUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LabelUpdateRequest">>},
            required
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
request_param_info('ad_accounts_subscriptions/get_list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
request_param_info('ad_accounts_subscriptions/post', 'LeadSubscriptionPostParamsCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LeadSubscriptionPostParamsCreate">>},
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
request_param_info('lead_form_test/create', 'LeadFormTestCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LeadFormTestCreate">>},
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
            {schema, list, <<"#/components/schemas/LeadFormCreate">>},
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
request_param_info('lead_forms/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
            {schema, list, <<"#/components/schemas/LeadFormBatchUpdate">>},
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
request_param_info('leads_export/create', 'LeadsExportsCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/LeadsExportsCreate">>},
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
request_param_info('media/create', 'MediaUploadCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/MediaUploadCreate">>},
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
request_param_info('msot_events/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('msot_events/create', 'ConversionMSOTEventsCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ConversionMSOTEventsCreate">>},
            required
        ]
    };
request_param_info('notification/post', 'NotificationPostRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/NotificationPostRequest">>},
            required
        ]
    };
request_param_info('oauth/token', 'grant_type') ->
    #{
        source => body,
        rules => [
            required
        ]
    };
request_param_info('oauth/token', 'code') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('oauth/token', 'continuous_refresh') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('oauth/token', 'redirect_uri') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('oauth/token', 'refresh_token') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('oauth/token', 'scope') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('token/revoke', 'token') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('token/revoke', 'token_type_hint') ->
    #{
        source => body,
        rules => [
            not_required
        ]
    };
request_param_info('order_lines/get', 'order_line_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
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
request_param_info('order_lines/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
            {pattern, "^\\d+$"},
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
            {pattern, "^\\d+$"},
            required
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
request_param_info('pins/get', 'pin_metrics') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('pins/list', 'pin_filter') ->
    #{
        source => qs_val,
        rules => [
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
            not_required
        ]
    };
request_param_info('pins/list', 'creative_types') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('pins/list', 'domain') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pins/list', 'domains') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('pins/list', 'include_product_tag_obj') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
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
request_param_info('pins/save', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pins/save', 'PinsSaveRequestCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/PinsSaveRequestCreate">>},
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
            {pattern, "^\\d+$"},
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
request_param_info('product_group_promotions/create', 'ProductGroupPromotionsCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProductGroupPromotionsCreate">>},
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
request_param_info('product_group_promotions/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
            not_required
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
request_param_info('product_group_promotions/update', 'ProductGroupPromotionsUpdateWithRequiredBody') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProductGroupPromotionsUpdateWithRequiredBody">>},
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
request_param_info('product_groups/analytics', 'click_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('product_groups/analytics', 'engagement_window_days') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };
request_param_info('product_groups/analytics', 'view_window_days') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('product_groups/analytics', 'reporting_timezone') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('product_tags/bulk_add', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_tags/bulk_add', 'ProductTagsBulkAddRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProductTagsBulkAddRequest">>},
            required
        ]
    };
request_param_info('product_tags/bulk_delete', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('product_tags/bulk_delete', 'ProductTagsBulkDeleteRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProductTagsBulkDeleteRequest">>},
            required
        ]
    };
request_param_info('product_tags/list', 'pin_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/PromotionCreate">>},
            required
        ]
    };
request_param_info('promotions/delete', 'promotion_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/delete', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/get', 'promotion_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/get', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('promotions/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('promotions/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('promotions/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('promotions/update', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/PromotionBatchUpdate">>},
            required
        ]
    };
request_param_info('delivery_metrics/get', 'report_type') ->
    #{
        source => qs_val,
        rules => [
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
            {pattern, "^\\d{4}-\\d{2}-\\d{2}$"},
            required
        ]
    };
request_param_info('targeting_options/get', 'targeting_type') ->
    #{
        source => binding,
        rules => [
            required
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
request_param_info('schedules/create', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('schedules/create', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/ScheduleCreate">>},
            required
        ]
    };
request_param_info('schedules/list', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('schedules/list', 'entity_ids') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('schedules/list', 'bookmark') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('schedules/list', 'page_size') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            {max, 250},
            {min, 1},
            not_required
        ]
    };
request_param_info('schedules/list', 'order') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('schedules/list', 'schedule_statuses') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('schedules/list', 'schedule_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('schedules/update', 'ad_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {max_length, 18},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('schedules/update', 'array') ->
    #{
        source => body,
        rules => [
            {schema, list, <<"#/components/schemas/ScheduleBatchUpdate">>},
            required
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
request_param_info('search_user_boards/get', 'query') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
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
request_param_info('targeting_template/list', 'bookmark') ->
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
request_param_info('targeting_template/list', 'order') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('targeting_template/update', 'TargetingTemplateUpdateRequestReadOrUpdate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/TargetingTemplateUpdateRequestReadOrUpdate">>},
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
request_param_info('trends_editorial_articles/list', 'region') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('trends_featured_topics/list', 'region') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('trends_featured_topics/list', 'interest') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trends_product_categories_details/list', 'product_categories') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('trends_product_categories_details/list', 'region') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('trends_product_categories_details/list', 'lookback_window') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trends_product_categories_details/list', 'engagement_type') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trends_product_categories_trending/list', 'region') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('trends_product_categories_trending/list', 'verticals') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trends_product_categories_trending/list', 'ages') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trends_product_categories_trending/list', 'genders') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('trends_product_categories_trending/list', 'engagement_type') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('boards_user_follows/list', 'explicit_following') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
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
request_param_info('follow_user/update', 'username') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "(?!^\\d+$)^.+$"},
            required
        ]
    };
request_param_info('follow_user/update', 'FollowUserCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/FollowUserCreate">>},
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
request_param_info('user_following/get', 'explicit_following') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('user_following/get', 'feed_type') ->
    #{
        source => qs_val,
        rules => [
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
request_param_info('verify_website/update', 'UserWebsiteCreate') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/UserWebsiteCreate">>},
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
            Model = Model0#{ReqParamName => V},
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
