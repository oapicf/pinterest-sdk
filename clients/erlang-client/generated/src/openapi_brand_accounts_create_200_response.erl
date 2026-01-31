-module(openapi_brand_accounts_create_200_response).

-export([encode/1]).

-export_type([openapi_brand_accounts_create_200_response/0]).

-type openapi_brand_accounts_create_200_response() ::
    #{ 'brand_account_id' => binary()
     }.

encode(#{ 'brand_account_id' := BrandAccountId
        }) ->
    #{ 'brand_account_id' => BrandAccountId
     }.
