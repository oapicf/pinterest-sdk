package api

import play.api.libs.json._
import model.CatalogsFeed
import model.CatalogsFeedsCreateRequest
import model.CatalogsFeedsUpdateRequest
import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsBatchRequest
import model.CatalogsProductGroup
import model.CatalogsProductGroupCreateRequest
import model.CatalogsProductGroupUpdateRequest
import model.Error
import model.JsObject
import model.Paginated

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
trait CatalogsApi {
  /**
    * Create product group
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
    * @param catalogsProductGroupCreateRequest Request object used to created a catalogs product group.
    */
  def catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest): JsObject

  /**
    * Delete product group
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsDelete(productGroupId: String): Unit

  /**
    * Get product groups list
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
    * @param feedId Unique identifier of a feed
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def catalogsProductGroupsList(feedId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated

  /**
    * Update product group
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
    * @param productGroupId Unique identifier of a product group
    * @param catalogsProductGroupUpdateRequest Request object used to Update a catalogs product group.
    */
  def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest): CatalogsProductGroup

  /**
    * List processing results for a given feed
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
    * @param feedId Unique identifier of a feed
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def feedProcessingResultsList(feedId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated

  /**
    * Create feed
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
    * @param catalogsFeedsCreateRequest Request object used to created a feed.
    */
  def feedsCreate(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest): CatalogsFeed

  /**
    * Delete feed
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
    * @param feedId Unique identifier of a feed
    */
  def feedsDelete(feedId: String): Unit

  /**
    * Get feed
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
    * @param feedId Unique identifier of a feed
    */
  def feedsGet(feedId: String): CatalogsFeed

  /**
    * List feeds
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def feedsList(bookmark: Option[String], pageSize: Option[Int]): Paginated

  /**
    * Update feed
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
    * @param feedId Unique identifier of a feed
    * @param catalogsFeedsUpdateRequest Request object used to update a feed.
    */
  def feedsUpdate(feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest): CatalogsFeed

  /**
    * Get catalogs items batch
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
    * @param batchId Id of a catalogs items batch to fetch
    */
  def itemsBatchGet(batchId: String): CatalogsItemsBatch

  /**
    * Perform an operation on an item batch
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
    * @param catalogsItemsBatchRequest Request object used to create catalogs items in a batch
    */
  def itemsBatchPost(catalogsItemsBatchRequest: CatalogsItemsBatchRequest): CatalogsItemsBatch

  /**
    * Get catalogs items
    * Get the items of the catalog created by the \&quot;operating user_account\&quot;
    * @param country Country for the Catalogs Items
    * @param itemIds Catalos Item ids
    * @param language Language for the Catalogs Items
    */
  def itemsGet(country: String, itemIds: List[String], language: String): CatalogsItems
}
