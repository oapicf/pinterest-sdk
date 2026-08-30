-module(openapi_conversion_event_device_info).

-include("openapi.hrl").

-export([openapi_conversion_event_device_info/0]).

-export([openapi_conversion_event_device_info/1]).

-export_type([openapi_conversion_event_device_info/0]).

-type openapi_conversion_event_device_info() ::
  [ {'battery_level', integer() }
  | {'brand', binary() }
  | {'carrier', binary() }
  | {'cpu_cores', integer() }
  | {'external_storage_free_space', integer() }
  | {'external_storage_size', integer() }
  | {'form_factor', openapi_form_factor:openapi_form_factor() }
  | {'kernel_version', binary() }
  | {'languages', list(binary()) }
  | {'locale', binary() }
  | {'model', binary() }
  | {'network_type', openapi_network_type:openapi_network_type() }
  | {'os_family', openapi_os_family:openapi_os_family() }
  | {'os_name', binary() }
  | {'os_release_name', binary() }
  | {'os_version', binary() }
  | {'screen_density', integer() }
  | {'screen_height', integer() }
  | {'screen_width', integer() }
  | {'storage_free_space', integer() }
  | {'storage_size', integer() }
  | {'timezone', binary() }
  | {'timezone_abbr', binary() }
  | {'type', binary() }
  ].


openapi_conversion_event_device_info() ->
    openapi_conversion_event_device_info([]).

openapi_conversion_event_device_info(Fields) ->
  Default = [ {'battery_level', integer(0, 100) }
            , {'brand', binary() }
            , {'carrier', binary() }
            , {'cpu_cores', integer(0, 1152) }
            , {'external_storage_free_space', integer(0, 1048576) }
            , {'external_storage_size', integer(0, 1048576) }
            , {'form_factor', openapi_form_factor:openapi_form_factor() }
            , {'kernel_version', binary() }
            , {'languages', list(binary(), 0, 100) }
            , {'locale', binary() }
            , {'model', binary() }
            , {'network_type', openapi_network_type:openapi_network_type() }
            , {'os_family', openapi_os_family:openapi_os_family() }
            , {'os_name', binary() }
            , {'os_release_name', binary() }
            , {'os_version', binary() }
            , {'screen_density', integer(0, 100000) }
            , {'screen_height', integer(0, 30720) }
            , {'screen_width', integer(0, 30720) }
            , {'storage_free_space', integer(0, 1048576) }
            , {'storage_size', integer(0, 1048576) }
            , {'timezone', binary() }
            , {'timezone_abbr', binary() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

