-module(openapi_ad_accounts_country_response).

-include("openapi.hrl").

-export([openapi_ad_accounts_country_response/0]).

-export([openapi_ad_accounts_country_response/1]).

-export_type([openapi_ad_accounts_country_response/0]).

-type openapi_ad_accounts_country_response() ::
  [ {'items', list(openapi_ad_accounts_country_response_data:openapi_ad_accounts_country_response_data()) }
  ].


openapi_ad_accounts_country_response() ->
    openapi_ad_accounts_country_response([]).

openapi_ad_accounts_country_response(Fields) ->
  Default = [ {'items', list(openapi_ad_accounts_country_response_data:openapi_ad_accounts_country_response_data()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

