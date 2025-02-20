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

# Unit tests for PinterestSdkClient::PinsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'PinsApi' do
  before do
    # run before each test
    @api_instance = PinterestSdkClient::PinsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PinsApi' do
    it 'should create an instance of PinsApi' do
      expect(@api_instance).to be_instance_of(PinterestSdkClient::PinsApi)
    end
  end

  # unit tests for multi_pins_analytics
  # Get multiple Pin analytics
  # &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  # @param pin_ids List of Pin IDs.
  # @param start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  # @param end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  # @param metric_types Pin metric types to get data for.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :app_types Apps or devices to get data for, default is all.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Hash<String, Hash>]
  describe 'multi_pins_analytics test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for pins_analytics
  # Get Pin analytics
  # Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  # @param pin_id Unique identifier of a Pin.
  # @param start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  # @param end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  # @param metric_types Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :app_types Apps or devices to get data for, default is all.
  # @option opts [String] :split_field How to split the data into groups. Not including this param means data won&#39;t be split.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Hash<String, PinAnalyticsMetricsResponse>]
  describe 'pins_analytics test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for pins_create
  # Create Pin
  # Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/web-features/add-ons-overview/&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/api-features/content-overview/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
  # @param pin_create Create a new Pin.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Pin]
  describe 'pins_create test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for pins_delete
  # Delete Pin
  # Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
  # @param pin_id Unique identifier of a Pin.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [nil]
  describe 'pins_delete test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for pins_get
  # Get Pin
  # Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
  # @param pin_id Unique identifier of a Pin.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :pin_metrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Pin]
  describe 'pins_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for pins_list
  # List Pins
  # Get a list of the Pins owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.  Disclaimer: there are known performance issues when filtering by field &lt;code&gt;creative_type&lt;/code&gt; and including protected pins. If your request is timing out in this scenario we encourage you to use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/boards/list_pins&#39;&gt;GET List Pins on Board&lt;/a&gt;.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :pin_filter Pin filter.
  # @option opts [Boolean] :include_protected_pins Specify if return pins from protected boards
  # @option opts [String] :pin_type The type of pins to return, currently only enabled for private pins
  # @option opts [Array<String>] :creative_types Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @option opts [Boolean] :pin_metrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  # @return [PinsList200Response]
  describe 'pins_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for pins_save
  # Save Pin
  # Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
  # @param pin_id Unique identifier of a Pin.
  # @param pins_save_request Request object used to save an existing pin
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Pin]
  describe 'pins_save test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for pins_update
  # Update Pin
  # Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
  # @param pin_id Unique identifier of a Pin.
  # @param pin_update 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Pin]
  describe 'pins_update test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
