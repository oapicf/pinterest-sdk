# catalogs_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsCreate**](catalogs_api.md#CatalogsCreate) | **POST** /catalogs | Create catalog
[**CatalogsList**](catalogs_api.md#CatalogsList) | **GET** /catalogs | List catalogs
[**CatalogsProductGroupPinsList**](catalogs_api.md#CatalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**CatalogsProductGroupsCreate**](catalogs_api.md#CatalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsCreateMany**](catalogs_api.md#CatalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**CatalogsProductGroupsDelete**](catalogs_api.md#CatalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsDeleteMany**](catalogs_api.md#CatalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**CatalogsProductGroupsGet**](catalogs_api.md#CatalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogsProductGroupsList**](catalogs_api.md#CatalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**CatalogsProductGroupsProductCountsGet**](catalogs_api.md#CatalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**CatalogsProductGroupsUpdate**](catalogs_api.md#CatalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**FeedProcessingResultsList**](catalogs_api.md#FeedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**FeedsCreate**](catalogs_api.md#FeedsCreate) | **POST** /catalogs/feeds | Create feed
[**FeedsDelete**](catalogs_api.md#FeedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](catalogs_api.md#FeedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**FeedsIngest**](catalogs_api.md#FeedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**FeedsList**](catalogs_api.md#FeedsList) | **GET** /catalogs/feeds | List feeds
[**FeedsUpdate**](catalogs_api.md#FeedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](catalogs_api.md#ItemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**ItemsBatchPost**](catalogs_api.md#ItemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**ItemsGet**](catalogs_api.md#ItemsGet) | **GET** /catalogs/items | Get catalogs items
[**ItemsIssuesList**](catalogs_api.md#ItemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
[**ItemsPost**](catalogs_api.md#ItemsPost) | **POST** /catalogs/items | Get catalogs items (POST)
[**ProductsByProductGroupFilterList**](catalogs_api.md#ProductsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
[**ReportsCreate**](catalogs_api.md#ReportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**ReportsGet**](catalogs_api.md#ReportsGet) | **GET** /catalogs/reports | Get catalogs report
[**ReportsStats**](catalogs_api.md#ReportsStats) | **GET** /catalogs/reports/stats | List report stats


<a name="CatalogsCreate"></a>
# **CatalogsCreate**
> Catalog CatalogsCreate(catalogsCreateRequest, adAccountId)

Create catalog

Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: this API only supports the catalog type of HOTEL for now.
<a name="CatalogsList"></a>
# **CatalogsList**
> CatalogsList200Response CatalogsList(bookmark, pageSize, adAccountId)

List catalogs

Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="CatalogsProductGroupPinsList"></a>
# **CatalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response CatalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId, pinMetrics)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="CatalogsProductGroupsCreate"></a>
# **CatalogsProductGroupsCreate**
> CatalogsVerticalProductGroup CatalogsProductGroupsCreate(multipleProductGroupsInner, adAccountId)

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
<a name="CatalogsProductGroupsCreateMany"></a>
# **CatalogsProductGroupsCreateMany**
> String! CatalogsProductGroupsCreateMany(multipleProductGroupsInner, adAccountId)

Create product groups

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
<a name="CatalogsProductGroupsDelete"></a>
# **CatalogsProductGroupsDelete**
> CatalogsProductGroupsDelete(productGroupId, adAccountId)

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="CatalogsProductGroupsDeleteMany"></a>
# **CatalogsProductGroupsDeleteMany**
> CatalogsProductGroupsDeleteMany(Id_, adAccountId)

Delete product groups

Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="CatalogsProductGroupsGet"></a>
# **CatalogsProductGroupsGet**
> CatalogsVerticalProductGroup CatalogsProductGroupsGet(productGroupId, adAccountId)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="CatalogsProductGroupsList"></a>
# **CatalogsProductGroupsList**
> CatalogsProductGroupsList200Response CatalogsProductGroupsList(Id_, feedId, catalogId, bookmark, pageSize, adAccountId)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="CatalogsProductGroupsProductCountsGet"></a>
# **CatalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCountsVertical CatalogsProductGroupsProductCountsGet(productGroupId, adAccountId)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="CatalogsProductGroupsUpdate"></a>
# **CatalogsProductGroupsUpdate**
> CatalogsVerticalProductGroup CatalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)

Update single product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
<a name="FeedProcessingResultsList"></a>
# **FeedProcessingResultsList**
> FeedProcessingResultsList200Response FeedProcessingResultsList(feedId, bookmark, pageSize, adAccountId)

List feed processing results

Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="FeedsCreate"></a>
# **FeedsCreate**
> CatalogsFeed FeedsCreate(feedsCreateRequest, adAccountId)

Create feed

Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
<a name="FeedsDelete"></a>
# **FeedsDelete**
> FeedsDelete(feedId, adAccountId)

Delete feed

Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
<a name="FeedsGet"></a>
# **FeedsGet**
> CatalogsFeed FeedsGet(feedId, adAccountId)

Get feed

Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
<a name="FeedsIngest"></a>
# **FeedsIngest**
> CatalogsFeedIngestion FeedsIngest(feedId, adAccountId)

Ingest feed items

Ingest items for a given feed owned by the \&quot;operation user_account\&quot;.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
<a name="FeedsList"></a>
# **FeedsList**
> FeedsList200Response FeedsList(bookmark, pageSize, catalogId, adAccountId)

List feeds

Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
<a name="FeedsUpdate"></a>
# **FeedsUpdate**
> CatalogsFeed FeedsUpdate(feedId, feedsUpdateRequest, adAccountId)

Update feed

Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
<a name="ItemsBatchGet"></a>
# **ItemsBatchGet**
> CatalogsItemsBatch ItemsBatchGet(batchId, adAccountId)

Get item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
<a name="ItemsBatchPost"></a>
# **ItemsBatchPost**
> CatalogsItemsBatch ItemsBatchPost(itemsBatchPostRequest, adAccountId)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.
<a name="ItemsGet"></a>
# **ItemsGet**
> CatalogsItems ItemsGet(country, language, adAccountId, itemIds, filters)

Get catalogs items

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: this endpoint is deprecated and will be deleted soon. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/items/post&#39;&gt;Get catalogs items (POST)&lt;/a&gt; instead.
<a name="ItemsIssuesList"></a>
# **ItemsIssuesList**
> ItemsIssuesList200Response ItemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId)

List item issues

List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/get&#39;&gt;Get catalogs report&lt;/a&gt; endpoints. Moreover, they support multiple types of catalogs.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="ItemsPost"></a>
# **ItemsPost**
> CatalogsItems ItemsPost(catalogsItemsRequest, adAccountId)

Get catalogs items (POST)

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
<a name="ProductsByProductGroupFilterList"></a>
# **ProductsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response ProductsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)

List products by filter

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
<a name="ReportsCreate"></a>
# **ReportsCreate**
> CatalogsCreateReportResponse ReportsCreate(catalogsReportParameters, adAccountId)

Build catalogs report

Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
<a name="ReportsGet"></a>
# **ReportsGet**
> CatalogsReport ReportsGet(token, adAccountId)

Get catalogs report

This returns a URL to a report given a token returned from &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt;. You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
<a name="ReportsStats"></a>
# **ReportsStats**
> ReportsStats200Response ReportsStats(parameters, adAccountId, pageSize, bookmark)

List report stats

List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
