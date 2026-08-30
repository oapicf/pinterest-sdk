-module(openapi_brand_account).

-include("openapi.hrl").

-export([openapi_brand_account/0]).

-export([openapi_brand_account/1]).

-export_type([openapi_brand_account/0]).

-type openapi_brand_account() ::
  [ {'brand_account_id', binary() }
  ].


openapi_brand_account() ->
    openapi_brand_account([]).

openapi_brand_account(Fields) ->
  Default = [ {'brand_account_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

