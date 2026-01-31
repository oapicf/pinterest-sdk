-module(openapi_conversion_event_app_info).

-include("openapi.hrl").

-export([openapi_conversion_event_app_info/0]).

-export([openapi_conversion_event_app_info/1]).

-export_type([openapi_conversion_event_app_info/0]).

-type openapi_conversion_event_app_info() ::
  [ {'app_id', binary() }
  | {'app_name', binary() }
  | {'app_package_name', binary() }
  | {'app_store', binary() }
  | {'app_version', binary() }
  | {'install_time', integer() }
  | {'user_agent', binary() }
  | {'window_height', integer() }
  | {'window_width', integer() }
  ].


openapi_conversion_event_app_info() ->
    openapi_conversion_event_app_info([]).

openapi_conversion_event_app_info(Fields) ->
  Default = [ {'app_id', binary() }
            , {'app_name', binary() }
            , {'app_package_name', binary() }
            , {'app_store', binary() }
            , {'app_version', binary() }
            , {'install_time', integer(0) }
            , {'user_agent', binary() }
            , {'window_height', integer(0, 30720) }
            , {'window_width', integer(0, 30720) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

