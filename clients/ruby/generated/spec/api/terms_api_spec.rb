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

# Unit tests for PinterestSdkClient::TermsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'TermsApi' do
  before do
    # run before each test
    @api_instance = PinterestSdkClient::TermsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TermsApi' do
    it 'should create an instance of TermsApi' do
      expect(@api_instance).to be_instance_of(PinterestSdkClient::TermsApi)
    end
  end

  # unit tests for terms_related_list
  # List related terms
  # Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
  # @param terms List of input terms.
  # @param [Hash] opts the optional parameters
  # @return [RelatedTerms]
  describe 'terms_related_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for terms_suggested_list
  # List suggested terms
  # Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
  # @param term Input term.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit Max suggested terms to return.
  # @return [Array<String>]
  describe 'terms_suggested_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
