require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/conversion_tags', {
  "resourcePath" => "/ConversionTags",
  "summary" => "Create conversion tag",
  "nickname" => "conversion_tags/create",
  "responseClass" => "ConversionTagResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_tags",
  "notes" => "Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Conversion Tag to create",
      "dataType" => "ConversionTagCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}', {
  "resourcePath" => "/ConversionTags",
  "summary" => "Get conversion tag",
  "nickname" => "conversion_tags/get",
  "responseClass" => "ConversionTagResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}",
  "notes" => "Get information about an existing conversion tag.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "conversion_tag_id",
      "description" => "Id of the conversion tag.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/conversion_tags', {
  "resourcePath" => "/ConversionTags",
  "summary" => "Get conversion tags",
  "nickname" => "conversion_tags/list",
  "responseClass" => "ConversionTagListResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_tags",
  "notes" => "List conversion tags associated with an ad account.",
  "parameters" => [
    {
      "name" => "filter_deleted",
      "description" => "Filter out deleted tags.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible', {
  "resourcePath" => "/ConversionTags",
  "summary" => "Get Ocpm eligible conversion tags",
  "nickname" => "ocpm_eligible_conversion_tags/get",
  "responseClass" => "Hash<String, Array<ConversionEventResponse>>",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible",
  "notes" => "Get Ocpm eligible conversion tag events for an ad account.",
  "parameters" => [
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit', {
  "resourcePath" => "/ConversionTags",
  "summary" => "Get page visit conversion tags",
  "nickname" => "page_visit_conversion_tags/get",
  "responseClass" => "page_visit_conversion_tags_get_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_tags/page_visit",
  "notes" => "Get all page visit conversion tag events for an ad account.",
  "parameters" => [
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
      "allowableValues" => "[ASCENDING, DESCENDING]",
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

