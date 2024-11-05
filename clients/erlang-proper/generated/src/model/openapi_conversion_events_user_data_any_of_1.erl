-module(openapi_conversion_events_user_data_any_of_1).

-include("openapi.hrl").

-export([openapi_conversion_events_user_data_any_of_1/0]).

-export([openapi_conversion_events_user_data_any_of_1/1]).

-export_type([openapi_conversion_events_user_data_any_of_1/0]).

-type openapi_conversion_events_user_data_any_of_1() ::
  [ {'em', list(binary()) }
  | {'hashed_maids', list(binary()) }
  | {'client_ip_address', binary() }
  | {'client_user_agent', binary() }
  ].


openapi_conversion_events_user_data_any_of_1() ->
    openapi_conversion_events_user_data_any_of_1([]).

openapi_conversion_events_user_data_any_of_1(Fields) ->
  Default = [ {'em', list(binary()) }
            , {'hashed_maids', list(binary()) }
            , {'client_ip_address', binary() }
            , {'client_user_agent', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

