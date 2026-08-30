require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/promotions', {
  "resourcePath" => "/Promotions",
  "summary" => "Create promotions",
  "nickname" => "promotions/create",
  "responseClass" => "PromotionsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/promotions",
  "notes" => "Create multiple new promotions.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<PromotionCreate>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}', {
  "resourcePath" => "/Promotions",
  "summary" => "Delete promotion by id",
  "nickname" => "promotions/delete",
  "responseClass" => "Promotion",
  "endpoint" => "/ad_accounts/{ad_account_id}/promotions/{promotion_id}",
  "notes" => "Delete a promotion within Pinterest.",
  "parameters" => [
    {
      "name" => "promotion_id",
      "description" => "Promotion ID",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}', {
  "resourcePath" => "/Promotions",
  "summary" => "Get promotion by id",
  "nickname" => "promotions/get",
  "responseClass" => "Promotion",
  "endpoint" => "/ad_accounts/{ad_account_id}/promotions/{promotion_id}",
  "notes" => "Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.",
  "parameters" => [
    {
      "name" => "promotion_id",
      "description" => "Promotion ID",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/promotions', {
  "resourcePath" => "/Promotions",
  "summary" => "Get promotions",
  "nickname" => "promotions/list",
  "responseClass" => "promotions_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/promotions",
  "notes" => "Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "PinterestLibPaginationOrder",
      "allowableValues" => "[ASCENDING, DESCENDING]",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/promotions', {
  "resourcePath" => "/Promotions",
  "summary" => "Update promotions",
  "nickname" => "promotions/update",
  "responseClass" => "PromotionsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/promotions",
  "notes" => "Update multiple promotions.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<PromotionBatchUpdate>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

