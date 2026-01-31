-module(openapi_amazon_connect_request).

-export([encode/1]).

-export_type([openapi_amazon_connect_request/0]).

-type openapi_amazon_connect_request() ::
    #{ 'amazon_storefront_id' => binary(),
       'amazon_storefront_name' := binary(),
       'amazon_storefront_url' := binary(),
       'amazon_user_id' => binary(),
       'is_amazon_account_linked' := boolean(),
       'one_time_passcode' => binary(),
       'pinterest_user_id' => binary()
     }.

encode(#{ 'amazon_storefront_id' := AmazonStorefrontId,
          'amazon_storefront_name' := AmazonStorefrontName,
          'amazon_storefront_url' := AmazonStorefrontUrl,
          'amazon_user_id' := AmazonUserId,
          'is_amazon_account_linked' := IsAmazonAccountLinked,
          'one_time_passcode' := OneTimePasscode,
          'pinterest_user_id' := PinterestUserId
        }) ->
    #{ 'amazon_storefront_id' => AmazonStorefrontId,
       'amazon_storefront_name' => AmazonStorefrontName,
       'amazon_storefront_url' => AmazonStorefrontUrl,
       'amazon_user_id' => AmazonUserId,
       'is_amazon_account_linked' => IsAmazonAccountLinked,
       'one_time_passcode' => OneTimePasscode,
       'pinterest_user_id' => PinterestUserId
     }.
