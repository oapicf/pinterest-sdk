-module(openapi_ad_accounts_country).

-include("openapi.hrl").

-export([openapi_ad_accounts_country/0]).

-export([openapi_ad_accounts_country/1]).

-export_type([openapi_ad_accounts_country/0]).

-type openapi_ad_accounts_country() ::
  [ {'code', openapi_country:openapi_country() }
  | {'currency', binary() }
  | {'index', integer() }
  | {'name', binary() }
  ].


openapi_ad_accounts_country() ->
    openapi_ad_accounts_country([]).

openapi_ad_accounts_country(Fields) ->
  Default = [ {'code', openapi_country:openapi_country() }
            , {'currency', binary() }
            , {'index', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

