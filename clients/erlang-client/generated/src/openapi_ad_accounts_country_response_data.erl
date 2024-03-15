-module(openapi_ad_accounts_country_response_data).

-export([encode/1]).

-export_type([openapi_ad_accounts_country_response_data/0]).

-type openapi_ad_accounts_country_response_data() ::
    #{ 'code' => openapi_ad_country:openapi_ad_country(),
       'currency' => binary(),
       'index' => integer(),
       'name' => binary()
     }.

encode(#{ 'code' := Code,
          'currency' := Currency,
          'index' := Index,
          'name' := Name
        }) ->
    #{ 'code' => Code,
       'currency' => Currency,
       'index' => Index,
       'name' => Name
     }.
