-module(openapi_conversion_msot_events_create).

-include("openapi.hrl").

-export([openapi_conversion_msot_events_create/0]).

-export([openapi_conversion_msot_events_create/1]).

-export_type([openapi_conversion_msot_events_create/0]).

-type openapi_conversion_msot_events_create() ::
  [ {'action_timestamps', list(integer()) }
  | {'ad_group_id', binary() }
  | {'attribution_model', openapi_attribution_model:openapi_attribution_model() }
  | {'attribution_scope', openapi_attribution_scope:openapi_attribution_scope() }
  | {'attribution_score', float() }
  | {'campaign_id', binary() }
  | {'click_window', binary() }
  | {'currency', openapi_currency:openapi_currency() }
  | {'event_id', binary() }
  | {'event_name', openapi_msot_event_name:openapi_msot_event_name() }
  | {'event_timestamp', integer() }
  | {'total_event_touchpoints', integer() }
  | {'total_events', integer() }
  | {'total_events_fractional', float() }
  | {'value', float() }
  | {'view_window', binary() }
  ].


openapi_conversion_msot_events_create() ->
    openapi_conversion_msot_events_create([]).

openapi_conversion_msot_events_create(Fields) ->
  Default = [ {'action_timestamps', list(integer()) }
            , {'ad_group_id', binary() }
            , {'attribution_model', openapi_attribution_model:openapi_attribution_model() }
            , {'attribution_scope', openapi_attribution_scope:openapi_attribution_scope() }
            , {'attribution_score', float() }
            , {'campaign_id', binary() }
            , {'click_window', binary() }
            , {'currency', openapi_currency:openapi_currency() }
            , {'event_id', binary() }
            , {'event_name', openapi_msot_event_name:openapi_msot_event_name() }
            , {'event_timestamp', integer() }
            , {'total_event_touchpoints', integer(1) }
            , {'total_events', integer(1) }
            , {'total_events_fractional', float() }
            , {'value', float() }
            , {'view_window', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

