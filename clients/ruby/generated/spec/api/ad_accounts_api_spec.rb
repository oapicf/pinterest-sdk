=begin
#Pinterest REST API

#Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.9.0

=end

require 'spec_helper'
require 'json'

# Unit tests for PinterestSdkClient::AdAccountsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AdAccountsApi' do
  before do
    # run before each test
    @api_instance = PinterestSdkClient::AdAccountsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AdAccountsApi' do
    it 'should create an instance of AdAccountsApi' do
      expect(@api_instance).to be_instance_of(PinterestSdkClient::AdAccountsApi)
    end
  end

  # unit tests for ad_account_analytics
  # Get ad account analytics
  # Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
  # @param ad_account_id Unique identifier of an ad account.
  # @param start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  # @param end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  # @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
  # @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
  # @option opts [Integer] :engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
  # @option opts [Integer] :view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
  # @option opts [String] :conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  # @return [Array<AdAccountAnalyticsResponseInner>]
  describe 'ad_account_analytics test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for ad_account_targeting_analytics_get
  # Get targeting analytics for an ad account
  # Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
  # @param ad_account_id Unique identifier of an ad account.
  # @param start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  # @param end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  # @param targeting_types Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
  # @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
  # @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
  # @option opts [Integer] :engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
  # @option opts [Integer] :view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
  # @option opts [String] :conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  # @option opts [ConversionReportAttributionType] :attribution_types List of types of attribution for the conversion report
  # @return [MetricsResponse]
  describe 'ad_account_targeting_analytics_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for ad_accounts_create
  # Create ad account
  # Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. &lt;p/&gt; You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/create-an-advertiser-account\&quot;&gt;Create an advertiser account&lt;/a&gt;.
  # @param ad_account_create_request Ad account to create.
  # @param [Hash] opts the optional parameters
  # @return [AdAccount]
  describe 'ad_accounts_create test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for ad_accounts_get
  # Get ad account
  # Get an ad account
  # @param ad_account_id Unique identifier of an ad account.
  # @param [Hash] opts the optional parameters
  # @return [AdAccount]
  describe 'ad_accounts_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for ad_accounts_list
  # List ad accounts
  # Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [Boolean] :include_shared_accounts Include shared ad accounts
  # @return [AdAccountsList200Response]
  describe 'ad_accounts_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for analytics_create_mmm_report
  # Create a request for a Marketing Mix Modeling (MMM) report
  # This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it&#39;s in beta release.
  # @param ad_account_id Unique identifier of an ad account.
  # @param create_mmm_report_request 
  # @param [Hash] opts the optional parameters
  # @return [CreateMMMReportResponse]
  describe 'analytics_create_mmm_report test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for analytics_create_report
  # Create async request for an account analytics report
  # This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
  # @param ad_account_id Unique identifier of an ad account.
  # @param ads_analytics_create_async_request 
  # @param [Hash] opts the optional parameters
  # @return [AdsAnalyticsCreateAsyncResponse]
  describe 'analytics_create_report test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for analytics_create_template_report
  # Create async request for an analytics report using a template
  # This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
  # @param ad_account_id Unique identifier of an ad account.
  # @param template_id Unique identifier of a template.
  # @param [Hash] opts the optional parameters
  # @option opts [Date] :start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
  # @option opts [Date] :end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
  # @option opts [Granularity] :granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
  # @return [AdsAnalyticsCreateAsyncResponse]
  describe 'analytics_create_template_report test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for analytics_get_mmm_report
  # Get advertiser Marketing Mix Modeling (MMM) report.
  # Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
  # @param ad_account_id Unique identifier of an ad account.
  # @param token Token returned from the post request creation call
  # @param [Hash] opts the optional parameters
  # @return [GetMMMReportResponse]
  describe 'analytics_get_mmm_report test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for analytics_get_report
  # Get the account analytics report created by the async call
  # This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
  # @param ad_account_id Unique identifier of an ad account.
  # @param token Token returned from the post request creation call
  # @param [Hash] opts the optional parameters
  # @return [AdsAnalyticsGetAsyncResponse]
  describe 'analytics_get_report test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for sandbox_delete
  # Delete ads data for ad account in API Sandbox
  # Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
  # @param ad_account_id Unique identifier of an ad account.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'sandbox_delete test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for templates_list
  # List templates
  # Gets all Templates associated with an ad account ID.
  # @param ad_account_id Unique identifier of an ad account.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @return [TemplatesList200Response]
  describe 'templates_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
