-module(openapi_brand_account).

-export([encode/1]).

-export_type([openapi_brand_account/0]).

-type openapi_brand_account() ::
    #{ 'brand_account_id' := binary()
     }.

encode(#{ 'brand_account_id' := BrandAccountId
        }) ->
    #{ 'brand_account_id' => BrandAccountId
     }.
