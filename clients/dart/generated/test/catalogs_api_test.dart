//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for CatalogsApi
void main() {
  final instance = CatalogsApi();

  group('tests for CatalogsApi', () {
    // Create product group
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.
    //
    //Future<Object> catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) async
    test('test catalogsProductGroupsCreate', () async {
      // TODO
    });

    // Delete product group
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
    //
    //Future catalogsProductGroupsDelete(String productGroupId) async
    test('test catalogsProductGroupsDelete', () async {
      // TODO
    });

    // Get product groups list
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
    //
    //Future<Paginated> catalogsProductGroupsList(String feedId, { String bookmark, int pageSize }) async
    test('test catalogsProductGroupsList', () async {
      // TODO
    });

    // Update product group
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.
    //
    //Future<CatalogsProductGroup> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) async
    test('test catalogsProductGroupsUpdate', () async {
      // TODO
    });

    // List processing results for a given feed
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.
    //
    //Future<Paginated> feedProcessingResultsList(String feedId, { String bookmark, int pageSize }) async
    test('test feedProcessingResultsList', () async {
      // TODO
    });

    // Create feed
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
    //
    //Future<CatalogsFeed> feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) async
    test('test feedsCreate', () async {
      // TODO
    });

    // Delete feed
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
    //
    //Future feedsDelete(String feedId) async
    test('test feedsDelete', () async {
      // TODO
    });

    // Get feed
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
    //
    //Future<CatalogsFeed> feedsGet(String feedId) async
    test('test feedsGet', () async {
      // TODO
    });

    // List feeds
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
    //
    //Future<Paginated> feedsList({ String bookmark, int pageSize }) async
    test('test feedsList', () async {
      // TODO
    });

    // Update feed
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
    //
    //Future<CatalogsFeed> feedsUpdate(String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) async
    test('test feedsUpdate', () async {
      // TODO
    });

    // Get catalogs items batch
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".
    //
    //Future<CatalogsItemsBatch> itemsBatchGet(String batchId) async
    test('test itemsBatchGet', () async {
      // TODO
    });

    // Perform an operation on an item batch
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.
    //
    //Future<CatalogsItemsBatch> itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest) async
    test('test itemsBatchPost', () async {
      // TODO
    });

    // Get catalogs items
    //
    // Get the items of the catalog created by the \"operating user_account\"
    //
    //Future<CatalogsItems> itemsGet(String country, List<String> itemIds, String language) async
    test('test itemsGet', () async {
      // TODO
    });

  });
}
