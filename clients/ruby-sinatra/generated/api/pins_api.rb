require 'json'


MyApp.add_route('GET', '/v5/pins/analytics', {
  "resourcePath" => "/Pins",
  "summary" => "Get multiple Pin analytics",
  "nickname" => "multi_pins/analytics",
  "responseClass" => "Hash<String, Hash>",
  "endpoint" => "/pins/analytics",
  "notes" => "**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.",
  "parameters" => [
    {
      "name" => "pin_ids",
      "description" => "List of Pin IDs.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_types",
      "description" => "Apps or devices to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, MOBILE, TABLET, WEB]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "metric_types",
      "description" => "Pin metric types to get data for.",
      "dataType" => "Array<MultiPinsAnalyticsMetricTypesItem>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/pins/{pin_id}/analytics', {
  "resourcePath" => "/Pins",
  "summary" => "Get Pin analytics",
  "nickname" => "pins/analytics",
  "responseClass" => "Hash<String, PinAnalyticsMetricsResponse>",
  "endpoint" => "/pins/{pin_id}/analytics",
  "notes" => "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.",
  "parameters" => [
    {
      "name" => "start_date",
      "description" => "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_types",
      "description" => "Apps or devices to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, MOBILE, TABLET, WEB]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "metric_types",
      "description" => "Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;.",
      "dataType" => "Array<QuerypinanalyticsmetrictypesItems>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "split_field",
      "description" => "How to split the data into groups. Not including this param means data won&#39;t be split.",
      "dataType" => "String",
      "allowableValues" => "[NO_SPLIT, APP_TYPE]",
      "defaultValue" => "'NO_SPLIT'",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pin_id",
      "description" => "Unique identifier of a Pin.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/pins', {
  "resourcePath" => "/Pins",
  "summary" => "Create Pin",
  "nickname" => "pins/create",
  "responseClass" => "Pin",
  "endpoint" => "/pins",
  "notes" => " Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PinCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/pins/{pin_id}', {
  "resourcePath" => "/Pins",
  "summary" => "Delete Pin",
  "nickname" => "pins/delete",
  "responseClass" => "Pin",
  "endpoint" => "/pins/{pin_id}",
  "notes" => "  Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pin_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/pins/{pin_id}', {
  "resourcePath" => "/Pins",
  "summary" => "Get Pin",
  "nickname" => "pins/get",
  "responseClass" => "Pin",
  "endpoint" => "/pins/{pin_id}",
  "notes" => "  Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pin_metrics",
      "description" => "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "pin_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/pins', {
  "resourcePath" => "/Pins",
  "summary" => "List Pins",
  "nickname" => "pins/list",
  "responseClass" => "pins_list_200_response",
  "endpoint" => "/pins",
  "notes" => "    Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).",
  "parameters" => [
    {
      "name" => "pin_filter",
      "description" => "The filter to apply to the pins",
      "dataType" => "PinFilter",
      "allowableValues" => "[exclude_native, exclude_repins, has_been_promoted]",
      "paramType" => "query",
    },
    {
      "name" => "pin_metrics",
      "description" => "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_protected_pins",
      "description" => "Whether to include protected pins in the results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "pin_type",
      "description" => "The type of pins to return, currently only enabled for private pins",
      "dataType" => "PinType",
      "allowableValues" => "[PRIVATE]",
      "paramType" => "query",
    },
    {
      "name" => "creative_types",
      "description" => "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.",
      "dataType" => "Array<CreativeType>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "domain",
      "description" => "Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "domains",
      "description" => "Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;).",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "include_product_tag_obj",
      "description" => "Include product tag objects in the response with their associated links.",
      "dataType" => "Boolean",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
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


MyApp.add_route('POST', '/v5/pins/{pin_id}/save', {
  "resourcePath" => "/Pins",
  "summary" => "Save Pin",
  "nickname" => "pins/save",
  "responseClass" => "Pin",
  "endpoint" => "/pins/{pin_id}/save",
  "notes" => "Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pin_id",
      "description" => "Unique identifier of a Pin.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PinsSaveRequestCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/pins/{pin_id}', {
  "resourcePath" => "/Pins",
  "summary" => "Update Pin",
  "nickname" => "pins/update",
  "responseClass" => "Pin",
  "endpoint" => "/pins/{pin_id}",
  "notes" => "Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pin_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PinUpdate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

