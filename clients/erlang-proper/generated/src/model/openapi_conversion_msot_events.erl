-module(openapi_conversion_msot_events).

-include("openapi.hrl").

-export([openapi_conversion_msot_events/0]).

-export([openapi_conversion_msot_events/1]).

-export_type([openapi_conversion_msot_events/0]).

-type openapi_conversion_msot_events() ::
  [ {'action_timestamps', list(integer()) }
  | {'ad_group_id', binary() }
  | {'attribution_model', binary() }
  | {'attribution_scope', binary() }
  | {'attribution_score', float() }
  | {'campaign_id', binary() }
  | {'currency', openapi_currency:openapi_currency() }
  | {'event_id', binary() }
  | {'event_name', binary() }
  | {'event_timestamp', integer() }
  | {'total_event_touchpoints', integer() }
  | {'total_events', integer() }
  | {'value', float() }
  ].


openapi_conversion_msot_events() ->
    openapi_conversion_msot_events([]).

openapi_conversion_msot_events(Fields) ->
  Default = [ {'action_timestamps', list(integer()) }
            , {'ad_group_id', binary() }
            , {'attribution_model', elements([<<"first_touch">>, <<"last_touch">>, <<"multi_touch">>]) }
            , {'attribution_scope', elements([<<"view">>, <<"engagement">>, <<"click">>]) }
            , {'attribution_score', float() }
            , {'campaign_id', binary() }
            , {'currency', openapi_currency:openapi_currency() }
            , {'event_id', binary() }
            , {'event_name', elements([<<"add_to_cart">>, <<"checkout">>, <<"lead">>, <<"signup">>]) }
            , {'event_timestamp', integer() }
            , {'total_event_touchpoints', integer(1) }
            , {'total_events', integer(1) }
            , {'value', float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

