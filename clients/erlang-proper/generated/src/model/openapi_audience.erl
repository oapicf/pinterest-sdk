-module(openapi_audience).

-include("openapi.hrl").

-export([openapi_audience/0]).

-export([openapi_audience/1]).

-export_type([openapi_audience/0]).

-type openapi_audience() ::
  [ {'ad_account_id', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'audience_type', binary() }
  | {'description', binary() }
  | {'rule', openapi_audience_rule:openapi_audience_rule() }
  | {'size', integer() }
  | {'status', binary() }
  | {'type', binary() }
  | {'created_timestamp', integer() }
  | {'updated_timestamp', integer() }
  ].


openapi_audience() ->
    openapi_audience([]).

openapi_audience(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'id', binary() }
            , {'name', binary() }
            , {'audience_type', binary() }
            , {'description', binary() }
            , {'rule', openapi_audience_rule:openapi_audience_rule() }
            , {'size', integer() }
            , {'status', binary() }
            , {'type', binary() }
            , {'created_timestamp', integer() }
            , {'updated_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

