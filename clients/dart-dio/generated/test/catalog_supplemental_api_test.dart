import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CatalogSupplementalApi
void main() {
  final instance = Openapi().getCatalogSupplementalApi();

  group(CatalogSupplementalApi, () {
    // Operate on local inventory item batch
    //
    // Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<SupplementalItemsBatchResponse> catalogsLocalInventoryItemsBatchOperate(String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, { String adAccountId }) async
    test('test catalogsLocalInventoryItemsBatchOperate', () async {
      // TODO
    });

    // Get local inventory items (POST)
    //
    // Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<LocalInventoryItemsGet> catalogsLocalInventoryItemsPost(String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate, { String adAccountId }) async
    test('test catalogsLocalInventoryItemsPost', () async {
      // TODO
    });

    // Create local stores
    //
    // Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<BuiltList<CatalogsLocalStoresCreate200ResponseInner>> catalogsLocalStoresCreate(String catalogId, BuiltList<LocalStoreCreate> localStoreCreate, { String adAccountId }) async
    test('test catalogsLocalStoresCreate', () async {
      // TODO
    });

    // Delete local stores
    //
    //   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<BuiltList<CatalogsLocalStoresDelete200ResponseInner>> catalogsLocalStoresDelete(String catalogId, BuiltList<String> ids, { String adAccountId }) async
    test('test catalogsLocalStoresDelete', () async {
      // TODO
    });

    // List local stores
    //
    // Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<CatalogsLocalStoresList200Response> catalogsLocalStoresList(String catalogId, { BuiltList<String> ids, String adAccountId, String bookmark, int pageSize }) async
    test('test catalogsLocalStoresList', () async {
      // TODO
    });

    // Update local stores
    //
    //   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<BuiltList<CatalogsLocalStoresCreate200ResponseInner>> catalogsLocalStoresUpdate(String catalogId, BuiltList<LocalStoreBatchUpdate> localStoreBatchUpdate, { String adAccountId }) async
    test('test catalogsLocalStoresUpdate', () async {
      // TODO
    });

    // Get supplemental items batch status
    //
    // Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<SupplementalItemsBatchResponse> catalogsSupplementalItemsBatchGet(String catalogId, String batchId, { String adAccountId }) async
    test('test catalogsSupplementalItemsBatchGet', () async {
      // TODO
    });

  });
}
