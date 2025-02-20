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
require 'date'

# Unit tests for PinterestSdkClient::TopVideoPinsAnalyticsResponse
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe PinterestSdkClient::TopVideoPinsAnalyticsResponse do
  let(:instance) { PinterestSdkClient::TopVideoPinsAnalyticsResponse.new }

  describe 'test an instance of TopVideoPinsAnalyticsResponse' do
    it 'should create an instance of TopVideoPinsAnalyticsResponse' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(PinterestSdkClient::TopVideoPinsAnalyticsResponse)
    end
  end

  describe 'test attribute "date_availability"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "pins"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "sort_by"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START"])
      # validator.allowable_values.each do |value|
      #   expect { instance.sort_by = value }.not_to raise_error
      # end
    end
  end

end
