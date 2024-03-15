require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/product_groups/catalogs', {
  "resourcePath" => "/ProductGroups",
  "summary" => "Get catalog product groups",
  "nickname" => "ad_accounts_catalogs_product_groups/list",
  "responseClass" => "ad_accounts_catalogs_product_groups_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/product_groups/catalogs",
  "notes" => "This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.",
  "parameters" => [
    {
      "name" => "feed_profile_id",
      "description" => "The feed profile id whose catalog product groups we want to return.",
      "dataType" => "String",
      "allowableValues" => "",
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

