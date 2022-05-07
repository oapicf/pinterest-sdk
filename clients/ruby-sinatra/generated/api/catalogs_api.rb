require 'json'


MyApp.add_route('POST', '/v5/catalogs/product_groups', {
  "resourcePath" => "/Catalogs",
  "summary" => "Create product group",
  "nickname" => "catalogs_product_groups/create",
  "responseClass" => "Object",
  "endpoint" => "/catalogs/product_groups",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Request object used to created a catalogs product group.",
      "dataType" => "CatalogsProductGroupCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/catalogs/product_groups/{product_group_id}', {
  "resourcePath" => "/Catalogs",
  "summary" => "Delete product group",
  "nickname" => "catalogs_product_groups/delete",
  "responseClass" => "void",
  "endpoint" => "/catalogs/product_groups/{product_group_id}",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.",
  "parameters" => [
    {
      "name" => "product_group_id",
      "description" => "Unique identifier of a product group",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/catalogs/product_groups', {
  "resourcePath" => "/Catalogs",
  "summary" => "Get product groups list",
  "nickname" => "catalogs_product_groups/list",
  "responseClass" => "Paginated",
  "endpoint" => "/catalogs/product_groups",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.",
  "parameters" => [
    {
      "name" => "feed_id",
      "description" => "Unique identifier of a feed",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/catalogs/product_groups/{product_group_id}', {
  "resourcePath" => "/Catalogs",
  "summary" => "Update product group",
  "nickname" => "catalogs_product_groups/update",
  "responseClass" => "CatalogsProductGroup",
  "endpoint" => "/catalogs/product_groups/{product_group_id}",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.",
  "parameters" => [
    {
      "name" => "product_group_id",
      "description" => "Unique identifier of a product group",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Request object used to Update a catalogs product group.",
      "dataType" => "CatalogsProductGroupUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/catalogs/feeds/{feed_id}/processing_results', {
  "resourcePath" => "/Catalogs",
  "summary" => "List processing results for a given feed",
  "nickname" => "feed_processing_results/list",
  "responseClass" => "Paginated",
  "endpoint" => "/catalogs/feeds/{feed_id}/processing_results",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "feed_id",
      "description" => "Unique identifier of a feed",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/catalogs/feeds', {
  "resourcePath" => "/Catalogs",
  "summary" => "Create feed",
  "nickname" => "feeds/create",
  "responseClass" => "CatalogsFeed",
  "endpoint" => "/catalogs/feeds",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Request object used to created a feed.",
      "dataType" => "CatalogsFeedsCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/catalogs/feeds/{feed_id}', {
  "resourcePath" => "/Catalogs",
  "summary" => "Delete feed",
  "nickname" => "feeds/delete",
  "responseClass" => "void",
  "endpoint" => "/catalogs/feeds/{feed_id}",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".",
  "parameters" => [
    {
      "name" => "feed_id",
      "description" => "Unique identifier of a feed",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/catalogs/feeds/{feed_id}', {
  "resourcePath" => "/Catalogs",
  "summary" => "Get feed",
  "nickname" => "feeds/get",
  "responseClass" => "CatalogsFeed",
  "endpoint" => "/catalogs/feeds/{feed_id}",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".",
  "parameters" => [
    {
      "name" => "feed_id",
      "description" => "Unique identifier of a feed",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/catalogs/feeds', {
  "resourcePath" => "/Catalogs",
  "summary" => "List feeds",
  "nickname" => "feeds/list",
  "responseClass" => "Paginated",
  "endpoint" => "/catalogs/feeds",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/catalogs/feeds/{feed_id}', {
  "resourcePath" => "/Catalogs",
  "summary" => "Update feed",
  "nickname" => "feeds/update",
  "responseClass" => "CatalogsFeed",
  "endpoint" => "/catalogs/feeds/{feed_id}",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".",
  "parameters" => [
    {
      "name" => "feed_id",
      "description" => "Unique identifier of a feed",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Request object used to update a feed.",
      "dataType" => "CatalogsFeedsUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/catalogs/items', {
  "resourcePath" => "/Catalogs",
  "summary" => "Get catalogs items",
  "nickname" => "items/get",
  "responseClass" => "CatalogsItems",
  "endpoint" => "/catalogs/items",
  "notes" => "Get the items of the catalog created by the \"operating user_account\"",
  "parameters" => [
    {
      "name" => "country",
      "description" => "Country for the Catalogs Items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "item_ids",
      "description" => "Catalos Item ids",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "language",
      "description" => "Language for the Catalogs Items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/catalogs/items/batch/{batch_id}', {
  "resourcePath" => "/Catalogs",
  "summary" => "Get catalogs items batch",
  "nickname" => "items_batch/get",
  "responseClass" => "CatalogsItemsBatch",
  "endpoint" => "/catalogs/items/batch/{batch_id}",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".",
  "parameters" => [
    {
      "name" => "batch_id",
      "description" => "Id of a catalogs items batch to fetch",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/catalogs/items/batch', {
  "resourcePath" => "/Catalogs",
  "summary" => "Perform an operation on an item batch",
  "nickname" => "items_batch/post",
  "responseClass" => "CatalogsItemsBatch",
  "endpoint" => "/catalogs/items/batch",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Request object used to create catalogs items in a batch",
      "dataType" => "CatalogsItemsBatchRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

