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

# Unit tests for PinterestSdkClient::CatalogsHotelProductGroupProductCounts
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe PinterestSdkClient::CatalogsHotelProductGroupProductCounts do
  let(:instance) { PinterestSdkClient::CatalogsHotelProductGroupProductCounts.new }

  describe 'test an instance of CatalogsHotelProductGroupProductCounts' do
    it 'should create an instance of CatalogsHotelProductGroupProductCounts' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(PinterestSdkClient::CatalogsHotelProductGroupProductCounts)
    end
  end

  describe 'test attribute "catalog_type"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["HOTEL"])
      # validator.allowable_values.each do |value|
      #   expect { instance.catalog_type = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "total"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
