# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.12.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::CatalogsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "CatalogsApi" do
  describe "test an instance of CatalogsApi" do
    it "should create an instance of CatalogsApi" do
      api_instance = OpenAPIClient::CatalogsApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::CatalogsApi)
    end
  end

  # unit tests for catalogs_list
  # List catalogs
  # Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsList200Response]
  describe "catalogs_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for catalogs_product_group_pins_list
  # List products for a Product Group
  # Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param product_group_id Unique identifier of a product group
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsProductGroupPinsList200Response]
  describe "catalogs_product_group_pins_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for catalogs_product_groups_create
  # Create product group
  # Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param catalogs_product_groups_create_request Request object used to created a catalogs product group.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsProductGroupsCreate201Response]
  describe "catalogs_product_groups_create test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for catalogs_product_groups_delete
  # Delete product group
  # Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param product_group_id Unique identifier of a product group
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [nil]
  describe "catalogs_product_groups_delete test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for catalogs_product_groups_get
  # Get product group
  # Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param product_group_id Unique identifier of a product group
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsProductGroupsCreate201Response]
  describe "catalogs_product_groups_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for catalogs_product_groups_list
  # List product groups
  # Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param [Hash] opts the optional parameters
  # @option opts [String] :feed_id Filter entities for a given feed_id. If not given, all feeds are considered.
  # @option opts [String] :catalog_id Filter entities for a given catalog_id. If not given, all catalogs are considered.
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsProductGroupsList200Response]
  describe "catalogs_product_groups_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for catalogs_product_groups_product_counts_get
  # Get product counts for a Product Group
  # Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param product_group_id Unique identifier of a product group
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsProductGroupProductCounts]
  describe "catalogs_product_groups_product_counts_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for catalogs_product_groups_update
  # Update product group
  # Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param product_group_id Unique identifier of a product group
  # @param catalogs_product_groups_update_request Request object used to Update a catalogs product group.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsProductGroupsCreate201Response]
  describe "catalogs_product_groups_update test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for feed_processing_results_list
  # List processing results for a given feed
  # Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param feed_id Unique identifier of a feed
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [FeedProcessingResultsList200Response]
  describe "feed_processing_results_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for feeds_create
  # Create feed
  # Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
  # @param feeds_create_request Request object used to created a feed.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsFeed]
  describe "feeds_create test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for feeds_delete
  # Delete feed
  # Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
  # @param feed_id Unique identifier of a feed
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [nil]
  describe "feeds_delete test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for feeds_get
  # Get feed
  # Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
  # @param feed_id Unique identifier of a feed
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsFeed]
  describe "feeds_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for feeds_list
  # List feeds
  # Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :catalog_id Filter entities for a given catalog_id. If not given, all catalogs are considered.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [FeedsList200Response]
  describe "feeds_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for feeds_update
  # Update feed
  # Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
  # @param feed_id Unique identifier of a feed
  # @param feeds_update_request Request object used to update a feed.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsFeed]
  describe "feeds_update test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for items_batch_get
  # Get catalogs item batch status
  # Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
  # @param batch_id Id of a catalogs items batch to fetch
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsItemsBatch]
  describe "items_batch_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for items_batch_post
  # Operate on item batch
  # This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
  # @param items_batch_post_request Request object used to create catalogs items in a batch
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsItemsBatch]
  describe "items_batch_post test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for items_get
  # Get catalogs items
  # Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
  # @param country Country for the Catalogs Items
  # @param language Language for the Catalogs Items
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @option opts [Array(String)] :item_ids This parameter is deprecated. Use filters instead.
  # @option opts [CatalogsItemsFilters] :filters Identifies items to be retrieved. This is a required parameter.
  # @return [CatalogsItems]
  describe "items_get test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for items_issues_list
  # List item issues for a given processing result
  # List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param processing_result_id Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [Array(Int32)] :item_numbers Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.
  # @option opts [CatalogsItemValidationIssue] :item_validation_issue Filter item validation issues that have a given type of item validation issue.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [ItemsIssuesList200Response]
  describe "items_issues_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for products_by_product_group_filter_list
  # List filtered products
  # List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
  # @param catalogs_list_products_by_filter_request Object holding a group of filters for a catalog product group
  # @param [Hash] opts the optional parameters
  # @option opts [String] :bookmark Cursor used to fetch the next page of items
  # @option opts [Int32] :page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
  # @option opts [String] :ad_account_id Unique identifier of an ad account.
  # @return [CatalogsProductGroupPinsList200Response]
  describe "products_by_product_group_filter_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end