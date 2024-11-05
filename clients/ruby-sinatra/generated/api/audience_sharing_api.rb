require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts', {
  "resourcePath" => "/AudienceSharing",
  "summary" => "List accounts with access to an audience owned by an ad account",
  "nickname" => "ad_accounts_audiences_shared_accounts/list",
  "responseClass" => "ad_accounts_audiences_shared_accounts_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/shared/accounts",
  "notes" => "List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.",
  "parameters" => [
    {
      "name" => "audience_id",
      "description" => "Unique identifier of the audience to use to filter the results.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_type",
      "description" => "Filter accounts by account type.",
      "dataType" => "AudienceAccountType",
      "allowableValues" => "[AD_ACCOUNT, BUSINESS_ACCOUNT]",
      "defaultValue" => "'AD_ACCOUNT'",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
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


MyApp.add_route('GET', '/v5/businesses/{business_id}/audiences/shared/accounts', {
  "resourcePath" => "/AudienceSharing",
  "summary" => "List accounts with access to an audience owned by a business",
  "nickname" => "business_account_audiences_shared_accounts/list",
  "responseClass" => "ad_accounts_audiences_shared_accounts_list_200_response",
  "endpoint" => "/businesses/{business_id}/audiences/shared/accounts",
  "notes" => "List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.",
  "parameters" => [
    {
      "name" => "audience_id",
      "description" => "Unique identifier of the audience to use to filter the results.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_type",
      "description" => "Filter accounts by account type.",
      "dataType" => "AudienceAccountType",
      "allowableValues" => "[AD_ACCOUNT, BUSINESS_ACCOUNT]",
      "defaultValue" => "'AD_ACCOUNT'",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
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
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/audiences', {
  "resourcePath" => "/AudienceSharing",
  "summary" => "List received audiences for a business",
  "nickname" => "shared_audiences_for_business/list",
  "responseClass" => "audiences_list_200_response",
  "endpoint" => "/businesses/{business_id}/audiences",
  "notes" => "Get a list of received audiences for the given business.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
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
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared', {
  "resourcePath" => "/AudienceSharing",
  "summary" => "Update audience sharing between ad accounts",
  "nickname" => "update_ad_account_to_ad_account_shared_audience",
  "responseClass" => "SharedAudienceResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared",
  "notes" => "From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.",
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
      "dataType" => "SharedAudience",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared', {
  "resourcePath" => "/AudienceSharing",
  "summary" => "Update audience sharing from an ad account to businesses",
  "nickname" => "update_ad_account_to_business_shared_audience",
  "responseClass" => "BusinessSharedAudienceResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/businesses/shared",
  "notes" => "From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.",
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
      "dataType" => "BusinessSharedAudience",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/audiences/ad_accounts/shared', {
  "resourcePath" => "/AudienceSharing",
  "summary" => "Update audience sharing from a business to ad accounts",
  "nickname" => "update_business_to_ad_account_shared_audience",
  "responseClass" => "SharedAudienceResponse",
  "endpoint" => "/businesses/{business_id}/audiences/ad_accounts/shared",
  "notes" => "From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SharedAudience",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/audiences/businesses/shared', {
  "resourcePath" => "/AudienceSharing",
  "summary" => "Update audience sharing between businesses",
  "nickname" => "update_business_to_business_shared_audience",
  "responseClass" => "BusinessSharedAudienceResponse",
  "endpoint" => "/businesses/{business_id}/audiences/businesses/shared",
  "notes" => "From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BusinessSharedAudience",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

