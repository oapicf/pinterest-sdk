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

# Unit tests for PinterestSdkClient::CatalogsUpdateCreativeAssetsItem
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe PinterestSdkClient::CatalogsUpdateCreativeAssetsItem do
  let(:instance) { PinterestSdkClient::CatalogsUpdateCreativeAssetsItem.new }

  describe 'test an instance of CatalogsUpdateCreativeAssetsItem' do
    it 'should create an instance of CatalogsUpdateCreativeAssetsItem' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(PinterestSdkClient::CatalogsUpdateCreativeAssetsItem)
    end
  end

  describe 'test attribute "creative_assets_id"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "operation"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["UPDATE"])
      # validator.allowable_values.each do |value|
      #   expect { instance.operation = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "attributes"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
