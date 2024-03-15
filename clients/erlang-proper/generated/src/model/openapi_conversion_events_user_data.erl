-module(openapi_conversion_events_user_data).

-include("openapi.hrl").

-export([openapi_conversion_events_user_data/0]).

-export([openapi_conversion_events_user_data/1]).

-export_type([openapi_conversion_events_user_data/0]).

-type openapi_conversion_events_user_data() ::
  [ {'ph', list(binary()) }
  | {'ge', list(binary()) }
  | {'db', list(binary()) }
  | {'ln', list(binary()) }
  | {'fn', list(binary()) }
  | {'ct', list(binary()) }
  | {'st', list(binary()) }
  | {'zp', list(binary()) }
  | {'country', list(binary()) }
  | {'external_id', list(binary()) }
  | {'click_id', binary() }
  | {'partner_id', binary() }
  ].


openapi_conversion_events_user_data() ->
    openapi_conversion_events_user_data([]).

openapi_conversion_events_user_data(Fields) ->
  Default = [ {'ph', list(binary()) }
            , {'ge', list(binary()) }
            , {'db', list(binary()) }
            , {'ln', list(binary()) }
            , {'fn', list(binary()) }
            , {'ct', list(binary()) }
            , {'st', list(binary()) }
            , {'zp', list(binary()) }
            , {'country', list(binary()) }
            , {'external_id', list(binary()) }
            , {'click_id', binary() }
            , {'partner_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

