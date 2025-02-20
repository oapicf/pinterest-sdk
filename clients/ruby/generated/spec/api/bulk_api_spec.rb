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

# Unit tests for PinterestSdkClient::BulkApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'BulkApi' do
  before do
    # run before each test
    @api_instance = PinterestSdkClient::BulkApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BulkApi' do
    it 'should create an instance of BulkApi' do
      expect(@api_instance).to be_instance_of(PinterestSdkClient::BulkApi)
    end
  end

  # unit tests for bulk_download_create
  # Get advertiser entities in bulk
  # Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
  # @param ad_account_id Unique identifier of an ad account.
  # @param bulk_download_request Parameters to get ad entities in bulk
  # @param [Hash] opts the optional parameters
  # @return [BulkDownloadResponse]
  describe 'bulk_download_create test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for bulk_request_get
  # Download advertiser entities in bulk
  # Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
  # @param ad_account_id Unique identifier of an ad account.
  # @param bulk_request_id Unique identifier of a bulk upsert request.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :include_details if set to True then attach the errors/details to all the requests
  # @return [BulkUpsertStatusResponse]
  describe 'bulk_request_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for bulk_upsert_create
  # Create/update ad entities in bulk
  # Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
  # @param ad_account_id Unique identifier of an ad account.
  # @param bulk_upsert_request Parameters to get create/update ad entities in bulk
  # @param [Hash] opts the optional parameters
  # @return [BulkUpsertResponse]
  describe 'bulk_upsert_create test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
