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

# Unit tests for PinterestSdkClient::UserAccountApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'UserAccountApi' do
  before do
    # run before each test
    @api_instance = PinterestSdkClient::UserAccountApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UserAccountApi' do
    it 'should create an instance of UserAccountApi' do
      expect(@api_instance).to be_instance_of(PinterestSdkClient::UserAccountApi)
    end
  end

  # unit tests for boards_user_follows_list
  # List following boards
  # Get a list of the boards a user follows. The request returns a board summary object array.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [Boolean] :explicit_following Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [BoardsUserFollowsList200Response]
  describe 'boards_user_follows_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for follow_user_update
  # Follow user
  # &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
  # @param username A valid username
  # @param follow_user_request Follow a user.
  # @param [Hash] opts the optional parameters
  # @return [UserSummary]
  describe 'follow_user_update test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for followers_list
  # List followers
  # Get a list of your followers.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @return [FollowersList200Response]
  describe 'followers_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for linked_business_accounts_get
  # List linked businesses
  # Get a list of your linked business accounts.
  # @param [Hash] opts the optional parameters
  # @return [Array<LinkedBusiness>]
  describe 'linked_business_accounts_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for unverify_website_delete
  # Unverify website
  # Unverifu a website verified by the signed-in user.
  # @param website Website with path or domain only
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'unverify_website_delete test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for user_account_analytics
  # Get user account analytics
  # Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
  # @param start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  # @param end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :from_claimed_content Filter on Pins that match your claimed domain.
  # @option opts [String] :pin_format Pin formats to get data for, default is all.
  # @option opts [String] :app_types Apps or devices to get data for, default is all.
  # @option opts [String] :content_type Filter to paid or organic data. Default is all.
  # @option opts [String] :source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  # @option opts [Array<String>] :metric_types Metric types to get data for, default is all. 
  # @option opts [String] :split_field How to split the data into groups. Not including this param means data won&#39;t be split.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Hash<String, AnalyticsMetricsResponse>]
  describe 'user_account_analytics test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for user_account_analytics_top_pins
  # Get user account top pins analytics
  # Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
  # @param start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  # @param end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  # @param sort_by Specify sorting order for metrics
  # @param [Hash] opts the optional parameters
  # @option opts [String] :from_claimed_content Filter on Pins that match your claimed domain.
  # @option opts [String] :pin_format Pin formats to get data for, default is all.
  # @option opts [String] :app_types Apps or devices to get data for, default is all.
  # @option opts [String] :content_type Filter to paid or organic data. Default is all.
  # @option opts [String] :source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  # @option opts [Array<String>] :metric_types Metric types to get data for, default is all. 
  # @option opts [Integer] :num_of_pins Number of pins to include, default is 10. Max is 50.
  # @option opts [Integer] :created_in_last_n_days Get metrics for pins created in the last \&quot;n\&quot; days.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [TopPinsAnalyticsResponse]
  describe 'user_account_analytics_top_pins test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for user_account_analytics_top_video_pins
  # Get user account top video pins analytics
  # Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
  # @param start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  # @param end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  # @param sort_by Specify sorting order for video metrics
  # @param [Hash] opts the optional parameters
  # @option opts [String] :from_claimed_content Filter on Pins that match your claimed domain.
  # @option opts [String] :pin_format Pin formats to get data for, default is all.
  # @option opts [String] :app_types Apps or devices to get data for, default is all.
  # @option opts [String] :content_type Filter to paid or organic data. Default is all.
  # @option opts [String] :source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  # @option opts [Array<String>] :metric_types Metric types to get video data for, default is all. 
  # @option opts [Integer] :num_of_pins Number of pins to include, default is 10. Max is 50.
  # @option opts [Integer] :created_in_last_n_days Get metrics for pins created in the last \&quot;n\&quot; days.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [TopVideoPinsAnalyticsResponse]
  describe 'user_account_analytics_top_video_pins test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for user_account_followed_interests
  # List following interests
  # Get a list of a user&#39;s following interests in one place.
  # @param username A valid username
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @return [UserAccountFollowedInterests200Response]
  describe 'user_account_followed_interests test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for user_account_get
  # Get user account
  # Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [Account]
  describe 'user_account_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for user_following_get
  # List following
  # Get a list of who a certain user follows.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [UserFollowingFeedType] :feed_type Thrift param specifying what type of followees will be kept. Default to include all followees.
  # @option opts [Boolean] :explicit_following Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [UserFollowingGet200Response]
  describe 'user_following_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for user_websites_get
  # Get user websites
  # Get user websites, claimed or not
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Integer] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @return [UserWebsitesGet200Response]
  describe 'user_websites_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for verify_website_update
  # Verify website
  # Verify a website as a signed-in user.
  # @param user_website_verify_request Verify a website.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [UserWebsiteSummary]
  describe 'verify_website_update test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for website_verification_get
  # Get user verification code for website claiming
  # Get verification code for user to install on the website to claim it.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [UserWebsiteVerificationCode]
  describe 'website_verification_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
