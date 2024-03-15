-module(openapi_conversion_events_data_inner).

-include("openapi.hrl").

-export([openapi_conversion_events_data_inner/0]).

-export([openapi_conversion_events_data_inner/1]).

-export_type([openapi_conversion_events_data_inner/0]).

-type openapi_conversion_events_data_inner() ::
  [ {'event_name', binary() }
  | {'action_source', binary() }
  | {'event_time', integer() }
  | {'event_id', binary() }
  | {'event_source_url', binary() }
  | {'opt_out', boolean() }
  | {'partner_name', binary() }
  | {'user_data', openapi_conversion_events_user_data:openapi_conversion_events_user_data() }
  | {'custom_data', openapi_conversion_events_data_inner_custom_data:openapi_conversion_events_data_inner_custom_data() }
  | {'app_id', binary() }
  | {'app_name', binary() }
  | {'app_version', binary() }
  | {'device_brand', binary() }
  | {'device_carrier', binary() }
  | {'device_model', binary() }
  | {'device_type', binary() }
  | {'os_version', binary() }
  | {'wifi', boolean() }
  | {'language', binary() }
  ].


openapi_conversion_events_data_inner() ->
    openapi_conversion_events_data_inner([]).

openapi_conversion_events_data_inner(Fields) ->
  Default = [ {'event_name', binary() }
            , {'action_source', binary() }
            , {'event_time', integer() }
            , {'event_id', binary() }
            , {'event_source_url', binary() }
            , {'opt_out', boolean() }
            , {'partner_name', binary() }
            , {'user_data', openapi_conversion_events_user_data:openapi_conversion_events_user_data() }
            , {'custom_data', openapi_conversion_events_data_inner_custom_data:openapi_conversion_events_data_inner_custom_data() }
            , {'app_id', binary() }
            , {'app_name', binary() }
            , {'app_version', binary() }
            , {'device_brand', binary() }
            , {'device_carrier', binary() }
            , {'device_model', binary() }
            , {'device_type', binary() }
            , {'os_version', binary() }
            , {'wifi', boolean() }
            , {'language', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

