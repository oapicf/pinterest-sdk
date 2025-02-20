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

# Unit tests for PinterestSdkClient::ConversionEventsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ConversionEventsApi' do
  before do
    # run before each test
    @api_instance = PinterestSdkClient::ConversionEventsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ConversionEventsApi' do
    it 'should create an instance of ConversionEventsApi' do
      expect(@api_instance).to be_instance_of(PinterestSdkClient::ConversionEventsApi)
    end
  end

  # unit tests for events_create
  # Send conversions
  # The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
  # @param ad_account_id Unique identifier of an ad account.
  # @param conversion_events Conversion events.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
  # @return [ConversionApiResponse]
  describe 'events_create test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
