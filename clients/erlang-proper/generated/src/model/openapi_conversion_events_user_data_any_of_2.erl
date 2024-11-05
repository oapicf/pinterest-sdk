-module(openapi_conversion_events_user_data_any_of_2).

-include("openapi.hrl").

-export([openapi_conversion_events_user_data_any_of_2/0]).

-export([openapi_conversion_events_user_data_any_of_2/1]).

-export_type([openapi_conversion_events_user_data_any_of_2/0]).

-type openapi_conversion_events_user_data_any_of_2() ::
  [ {'em', list(binary()) }
  | {'hashed_maids', list(binary()) }
  | {'client_ip_address', binary() }
  | {'client_user_agent', binary() }
  ].


openapi_conversion_events_user_data_any_of_2() ->
    openapi_conversion_events_user_data_any_of_2([]).

openapi_conversion_events_user_data_any_of_2(Fields) ->
  Default = [ {'em', list(binary()) }
            , {'hashed_maids', list(binary()) }
            , {'client_ip_address', binary() }
            , {'client_user_agent', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

