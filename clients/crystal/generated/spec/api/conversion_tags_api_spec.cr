# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.14.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::ConversionTagsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "ConversionTagsApi" do
  describe "test an instance of ConversionTagsApi" do
    it "should create an instance of ConversionTagsApi" do
      api_instance = OpenAPIClient::ConversionTagsApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::ConversionTagsApi)
    end
  end

  # unit tests for conversion_tags_create
  # Create conversion tag
  # Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/#enhanced-match\&quot;&gt;Enhanced match&lt;/a&gt;
  # @param ad_account_id Unique identifier of an ad account.
  # @param conversion_tag_create Conversion Tag to create
  # @param [Hash] opts the optional parameters
  # @return [ConversionTagResponse]
  describe "conversion_tags_create test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for conversion_tags_get
  # Get conversion tag
  # Get information about an existing conversion tag.
  # @param ad_account_id Unique identifier of an ad account.
  # @param conversion_tag_id Id of the conversion tag.
  # @param [Hash] opts the optional parameters
  # @return [ConversionTagResponse]
  describe "conversion_tags_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for conversion_tags_list
  # Get conversion tags
  # List conversion tags associated with an ad account.
  # @param ad_account_id Unique identifier of an ad account.
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :filter_deleted Filter out deleted tags.
  # @return [ConversionTagListResponse]
  describe "conversion_tags_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for ocpm_eligible_conversion_tags_get
  # Get Ocpm eligible conversion tags
  # Get Ocpm eligible conversion tag events for an ad account.
  # @param ad_account_id Unique identifier of an ad account.
  # @param [Hash] opts the optional parameters
  # @return [Hash(String, Array(ConversionEventResponse))]
  describe "ocpm_eligible_conversion_tags_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for page_visit_conversion_tags_get
  # Get page visit conversion tags
  # Get all page visit conversion tag events for an ad account.
  # @param ad_account_id Unique identifier of an ad account.
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @return [PageVisitConversionTagsGet200Response]
  describe "page_visit_conversion_tags_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
