package api

import play.api.libs.json._
import model.CatalogsLocalStoresCreate200ResponseInner
import model.CatalogsLocalStoresDelete200ResponseInner
import model.CatalogsLocalStoresList200Response
import model.Error
import model.LocalInventoryItemsBatch
import model.LocalInventoryItemsBatchCreate
import model.LocalInventoryItemsGet
import model.LocalInventoryItemsGetCreate
import model.LocalStore
import model.LocalStoreBatchUpdate
import model.LocalStoreCreate
import model.SupplementalItemsBatchResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CatalogSupplementalApi {
  /**
    * Operate on local inventory item batch
    * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * @param catalogId Unique identifier of a catalog.
    * @param adAccountId Unique identifier of an ad account.
    */
  def catalogsLocalInventoryItemsBatchOperate(catalogId: String, localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, adAccountId: Option[String]): SupplementalItemsBatchResponse

  /**
    * Get local inventory items (POST)
    * Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * @param catalogId Unique identifier of a catalog.
    * @param adAccountId Unique identifier of an ad account.
    */
  def catalogsLocalInventoryItemsPost(catalogId: String, localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, adAccountId: Option[String]): LocalInventoryItemsGet

  /**
    * Create local stores
    * Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * @param catalogId Unique identifier of a catalog.
    * @param adAccountId Unique identifier of an ad account.
    */
  def catalogsLocalStoresCreate(catalogId: String, localStoreCreate: List[LocalStoreCreate], adAccountId: Option[String]): List[CatalogsLocalStoresCreate200ResponseInner]

  /**
    * Delete local stores
    *   Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    * @param catalogId Unique identifier of a catalog.
    * @param ids List of local store IDs to filter by.
    * @param adAccountId Unique identifier of an ad account.
    */
  def catalogsLocalStoresDelete(catalogId: String, ids: List[String], adAccountId: Option[String]): List[CatalogsLocalStoresDelete200ResponseInner]

  /**
    * List local stores
    * Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * @param catalogId Unique identifier of a catalog.
    * @param ids List of local store IDs to filter by.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def catalogsLocalStoresList(catalogId: String, ids: Option[List[String]], adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): CatalogsLocalStoresList200Response

  /**
    * Update local stores
    *   Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    * @param catalogId Unique identifier of a catalog.
    * @param adAccountId Unique identifier of an ad account.
    */
  def catalogsLocalStoresUpdate(catalogId: String, localStoreBatchUpdate: List[LocalStoreBatchUpdate], adAccountId: Option[String]): List[CatalogsLocalStoresCreate200ResponseInner]

  /**
    * Get supplemental items batch status
    * Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * @param catalogId Unique identifier of a catalog.
    * @param batchId Unique identifier of an items batch operation.
    * @param adAccountId Unique identifier of an ad account.
    */
  def catalogsSupplementalItemsBatchGet(catalogId: String, batchId: String, adAccountId: Option[String]): SupplementalItemsBatchResponse
}
