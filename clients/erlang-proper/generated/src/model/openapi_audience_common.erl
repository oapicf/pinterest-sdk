-module(openapi_audience_common).

-include("openapi.hrl").

-export([openapi_audience_common/0]).

-export([openapi_audience_common/1]).

-export_type([openapi_audience_common/0]).

-type openapi_audience_common() ::
  [ {'ad_account_id', binary() }
  | {'name', binary() }
  | {'rule', openapi_audience_rule:openapi_audience_rule() }
  ].


openapi_audience_common() ->
    openapi_audience_common([]).

openapi_audience_common(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'name', binary() }
            , {'rule', openapi_audience_rule:openapi_audience_rule() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

