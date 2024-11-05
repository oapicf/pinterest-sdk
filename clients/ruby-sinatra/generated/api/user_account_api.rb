require 'json'


MyApp.add_route('GET', '/v5/user_account/following/boards', {
  "resourcePath" => "/UserAccount",
  "summary" => "List following boards",
  "nickname" => "boards_user_follows/list",
  "responseClass" => "boards_user_follows_list_200_response",
  "endpoint" => "/user_account/following/boards",
  "notes" => "Get a list of the boards a user follows. The request returns a board summary object array.",
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
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "explicit_following",
      "description" => "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
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


MyApp.add_route('POST', '/v5/user_account/following/{username}', {
  "resourcePath" => "/UserAccount",
  "summary" => "Follow user",
  "nickname" => "follow_user/update",
  "responseClass" => "UserSummary",
  "endpoint" => "/user_account/following/{username}",
  "notes" => "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.",
  "parameters" => [
    {
      "name" => "username",
      "description" => "A valid username",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Follow a user.",
      "dataType" => "FollowUserRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/user_account/followers', {
  "resourcePath" => "/UserAccount",
  "summary" => "List followers",
  "nickname" => "followers/list",
  "responseClass" => "followers_list_200_response",
  "endpoint" => "/user_account/followers",
  "notes" => "Get a list of your followers.",
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
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
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


MyApp.add_route('GET', '/v5/user_account/businesses', {
  "resourcePath" => "/UserAccount",
  "summary" => "List linked businesses",
  "nickname" => "linked_business_accounts/get",
  "responseClass" => "Array<LinkedBusiness>",
  "endpoint" => "/user_account/businesses",
  "notes" => "Get a list of your linked business accounts.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/user_account/websites', {
  "resourcePath" => "/UserAccount",
  "summary" => "Unverify website",
  "nickname" => "unverify_website/delete",
  "responseClass" => "void",
  "endpoint" => "/user_account/websites",
  "notes" => "Unverifu a website verified by the signed-in user.",
  "parameters" => [
    {
      "name" => "website",
      "description" => "Website with path or domain only",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/user_account/analytics', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user account analytics",
  "nickname" => "user_account/analytics",
  "responseClass" => "Hash<String, AnalyticsMetricsResponse>",
  "endpoint" => "/user_account/analytics",
  "notes" => "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".",
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
      "name" => "from_claimed_content",
      "description" => "Filter on Pins that match your claimed domain.",
      "dataType" => "String",
      "allowableValues" => "[OTHER, CLAIMED, BOTH]",
      "defaultValue" => "'BOTH'",
      "paramType" => "query",
    },
    {
      "name" => "pin_format",
      "description" => "Pin formats to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]",
      "defaultValue" => "'ALL'",
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
      "name" => "content_type",
      "description" => "Filter to paid or organic data. Default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, PAID, ORGANIC]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "source",
      "description" => "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts",
      "dataType" => "String",
      "allowableValues" => "[ALL, YOUR_PINS, OTHER_PINS]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "metric_types",
      "description" => "Metric types to get data for, default is all. ",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "split_field",
      "description" => "How to split the data into groups. Not including this param means data won&#39;t be split.",
      "dataType" => "String",
      "allowableValues" => "[NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT]",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/user_account/analytics/top_pins', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user account top pins analytics",
  "nickname" => "user_account/analytics/top_pins",
  "responseClass" => "TopPinsAnalyticsResponse",
  "endpoint" => "/user_account/analytics/top_pins",
  "notes" => "Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".",
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
      "name" => "sort_by",
      "description" => "Specify sorting order for metrics",
      "dataType" => "String",
      "allowableValues" => "[ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE]",
      "paramType" => "query",
    },
    {
      "name" => "from_claimed_content",
      "description" => "Filter on Pins that match your claimed domain.",
      "dataType" => "String",
      "allowableValues" => "[OTHER, CLAIMED, BOTH]",
      "defaultValue" => "'BOTH'",
      "paramType" => "query",
    },
    {
      "name" => "pin_format",
      "description" => "Pin formats to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]",
      "defaultValue" => "'ALL'",
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
      "name" => "content_type",
      "description" => "Filter to paid or organic data. Default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, PAID, ORGANIC]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "source",
      "description" => "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts",
      "dataType" => "String",
      "allowableValues" => "[ALL, YOUR_PINS, OTHER_PINS]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "metric_types",
      "description" => "Metric types to get data for, default is all. ",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "num_of_pins",
      "description" => "Number of pins to include, default is 10. Max is 50.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "10",
      "paramType" => "query",
    },
    {
      "name" => "created_in_last_n_days",
      "description" => "Get metrics for pins created in the last \&quot;n\&quot; days.",
      "dataType" => "Integer",
      "allowableValues" => "[30]",
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


MyApp.add_route('GET', '/v5/user_account/analytics/top_video_pins', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user account top video pins analytics",
  "nickname" => "user_account/analytics/top_video_pins",
  "responseClass" => "TopVideoPinsAnalyticsResponse",
  "endpoint" => "/user_account/analytics/top_video_pins",
  "notes" => "Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".",
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
      "name" => "sort_by",
      "description" => "Specify sorting order for video metrics",
      "dataType" => "String",
      "allowableValues" => "[IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START]",
      "paramType" => "query",
    },
    {
      "name" => "from_claimed_content",
      "description" => "Filter on Pins that match your claimed domain.",
      "dataType" => "String",
      "allowableValues" => "[OTHER, CLAIMED, BOTH]",
      "defaultValue" => "'BOTH'",
      "paramType" => "query",
    },
    {
      "name" => "pin_format",
      "description" => "Pin formats to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]",
      "defaultValue" => "'ALL'",
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
      "name" => "content_type",
      "description" => "Filter to paid or organic data. Default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, PAID, ORGANIC]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "source",
      "description" => "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts",
      "dataType" => "String",
      "allowableValues" => "[ALL, YOUR_PINS, OTHER_PINS]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "metric_types",
      "description" => "Metric types to get video data for, default is all. ",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "num_of_pins",
      "description" => "Number of pins to include, default is 10. Max is 50.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "10",
      "paramType" => "query",
    },
    {
      "name" => "created_in_last_n_days",
      "description" => "Get metrics for pins created in the last \&quot;n\&quot; days.",
      "dataType" => "Integer",
      "allowableValues" => "[30]",
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


MyApp.add_route('GET', '/v5/users/{username}/interests/follow', {
  "resourcePath" => "/UserAccount",
  "summary" => "List following interests",
  "nickname" => "user_account/followed_interests",
  "responseClass" => "user_account_followed_interests_200_response",
  "endpoint" => "/users/{username}/interests/follow",
  "notes" => "Get a list of a user's following interests in one place.",
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
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "A valid username",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/user_account', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user account",
  "nickname" => "user_account/get",
  "responseClass" => "Account",
  "endpoint" => "/user_account",
  "notes" => "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.",
  "parameters" => [
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


MyApp.add_route('GET', '/v5/user_account/following', {
  "resourcePath" => "/UserAccount",
  "summary" => "List following",
  "nickname" => "user_following/get",
  "responseClass" => "user_following_get_200_response",
  "endpoint" => "/user_account/following",
  "notes" => "Get a list of who a certain user follows.",
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
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "feed_type",
      "description" => "Thrift param specifying what type of followees will be kept. Default to include all followees.",
      "dataType" => "UserFollowingFeedType",
      "allowableValues" => "[ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "explicit_following",
      "description" => "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
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


MyApp.add_route('GET', '/v5/user_account/websites', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user websites",
  "nickname" => "user_websites/get",
  "responseClass" => "user_websites_get_200_response",
  "endpoint" => "/user_account/websites",
  "notes" => "Get user websites, claimed or not",
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
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
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


MyApp.add_route('POST', '/v5/user_account/websites', {
  "resourcePath" => "/UserAccount",
  "summary" => "Verify website",
  "nickname" => "verify_website/update",
  "responseClass" => "UserWebsiteSummary",
  "endpoint" => "/user_account/websites",
  "notes" => "Verify a website as a signed-in user.",
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
      "description" => "Verify a website.",
      "dataType" => "UserWebsiteVerifyRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/user_account/websites/verification', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user verification code for website claiming",
  "nickname" => "website_verification/get",
  "responseClass" => "UserWebsiteVerificationCode",
  "endpoint" => "/user_account/websites/verification",
  "notes" => "Get verification code for user to install on the website to claim it.",
  "parameters" => [
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

