=begin
#Pinterest REST API

#Pinterest's REST API

The version of the OpenAPI document: 5.12.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.4.0

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for PinterestSdkClient::PinMediaSourceImageBase64
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe PinterestSdkClient::PinMediaSourceImageBase64 do
  let(:instance) { PinterestSdkClient::PinMediaSourceImageBase64.new }

  describe 'test an instance of PinMediaSourceImageBase64' do
    it 'should create an instance of PinMediaSourceImageBase64' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(PinterestSdkClient::PinMediaSourceImageBase64)
    end
  end

  describe 'test attribute "source_type"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["image_base64"])
      # validator.allowable_values.each do |value|
      #   expect { instance.source_type = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "content_type"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["image/jpeg", "image/png"])
      # validator.allowable_values.each do |value|
      #   expect { instance.content_type = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "data"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "is_standard"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end