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

# Unit tests for PinterestSdkClient::CatalogsCreativeAssetsProduct
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe PinterestSdkClient::CatalogsCreativeAssetsProduct do
  let(:instance) { PinterestSdkClient::CatalogsCreativeAssetsProduct.new }

  describe 'test an instance of CatalogsCreativeAssetsProduct' do
    it 'should create an instance of CatalogsCreativeAssetsProduct' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(PinterestSdkClient::CatalogsCreativeAssetsProduct)
    end
  end

  describe 'test attribute "catalog_type"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["CREATIVE_ASSETS"])
      # validator.allowable_values.each do |value|
      #   expect { instance.catalog_type = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "metadata"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "pin"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
