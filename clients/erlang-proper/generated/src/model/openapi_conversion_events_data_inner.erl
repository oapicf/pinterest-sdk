-module(openapi_conversion_events_data_inner).

-include("openapi.hrl").

-export([openapi_conversion_events_data_inner/0]).

-export([openapi_conversion_events_data_inner/1]).

-export_type([openapi_conversion_events_data_inner/0]).

-type openapi_conversion_events_data_inner() ::
  [ {'action_source', binary() }
  | {'app_id', binary() }
  | {'app_info', openapi_conversion_event_app_info:openapi_conversion_event_app_info() }
  | {'app_name', binary() }
  | {'app_version', binary() }
  | {'custom_data', openapi_conversion_events_data_inner_custom_data:openapi_conversion_events_data_inner_custom_data() }
  | {'device_brand', binary() }
  | {'device_carrier', binary() }
  | {'device_info', openapi_conversion_event_device_info:openapi_conversion_event_device_info() }
  | {'device_model', binary() }
  | {'device_type', binary() }
  | {'event_id', binary() }
  | {'event_name', binary() }
  | {'event_source_url', binary() }
  | {'event_time', integer() }
  | {'language', binary() }
  | {'opt_out', boolean() }
  | {'os_version', binary() }
  | {'partner_name', binary() }
  | {'user_data', openapi_conversion_events_user_data:openapi_conversion_events_user_data() }
  | {'wifi', boolean() }
  ].


openapi_conversion_events_data_inner() ->
    openapi_conversion_events_data_inner([]).

openapi_conversion_events_data_inner(Fields) ->
  Default = [ {'action_source', binary() }
            , {'app_id', binary() }
            , {'app_info', openapi_conversion_event_app_info:openapi_conversion_event_app_info() }
            , {'app_name', binary() }
            , {'app_version', binary() }
            , {'custom_data', openapi_conversion_events_data_inner_custom_data:openapi_conversion_events_data_inner_custom_data() }
            , {'device_brand', binary() }
            , {'device_carrier', binary() }
            , {'device_info', openapi_conversion_event_device_info:openapi_conversion_event_device_info() }
            , {'device_model', binary() }
            , {'device_type', binary() }
            , {'event_id', binary() }
            , {'event_name', binary() }
            , {'event_source_url', binary() }
            , {'event_time', integer() }
            , {'language', binary() }
            , {'opt_out', boolean() }
            , {'os_version', binary() }
            , {'partner_name', binary() }
            , {'user_data', openapi_conversion_events_user_data:openapi_conversion_events_user_data() }
            , {'wifi', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

