import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CatalogsApi
void main() {
  final instance = Openapi().getCatalogsApi();

  group(CatalogsApi, () {
    // List available filter values
    //
    // Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<CatalogsAvailableFilterValues> catalogsAvailableFilterValues(String catalogId, { String feedId, Country country, CatalogsLocale language, String adAccountId }) async
    test('test catalogsAvailableFilterValues', () async {
      // TODO
    });

    // Create catalog
    //
    // Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    //
    //Future<Catalog> catalogsCreate(CatalogCreate catalogCreate, { String adAccountId }) async
    test('test catalogsCreate', () async {
      // TODO
    });

    // List catalogs
    //
    // Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    //
    //Future<CatalogsList200Response> catalogsList({ String adAccountId, String bookmark, int pageSize }) async
    test('test catalogsList', () async {
      // TODO
    });

  });
}
