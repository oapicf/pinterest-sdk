-module(openapi_ad_accounts_country_response_data).

-include("openapi.hrl").

-export([openapi_ad_accounts_country_response_data/0]).

-export([openapi_ad_accounts_country_response_data/1]).

-export_type([openapi_ad_accounts_country_response_data/0]).

-type openapi_ad_accounts_country_response_data() ::
  [ {'code', openapi_ad_country:openapi_ad_country() }
  | {'currency', binary() }
  | {'index', integer() }
  | {'name', binary() }
  ].


openapi_ad_accounts_country_response_data() ->
    openapi_ad_accounts_country_response_data([]).

openapi_ad_accounts_country_response_data(Fields) ->
  Default = [ {'code', binary() }
            , {'currency', binary() }
            , {'index', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

