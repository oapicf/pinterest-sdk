-module(openapi_conversion_events_user_data_properties).

-include("openapi.hrl").

-export([openapi_conversion_events_user_data_properties/0]).

-export([openapi_conversion_events_user_data_properties/1]).

-export_type([openapi_conversion_events_user_data_properties/0]).

-type openapi_conversion_events_user_data_properties() ::
  [ {'click_id', binary() }
  | {'client_ip_address', binary() }
  | {'client_user_agent', binary() }
  | {'country', list(binary()) }
  | {'ct', list(binary()) }
  | {'db', list(binary()) }
  | {'em', list(binary()) }
  | {'external_id', list(binary()) }
  | {'fn', list(binary()) }
  | {'ge', list(binary()) }
  | {'hashed_maids', list(binary()) }
  | {'ln', list(binary()) }
  | {'partner_id', binary() }
  | {'ph', list(binary()) }
  | {'st', list(binary()) }
  | {'zp', list(binary()) }
  ].


openapi_conversion_events_user_data_properties() ->
    openapi_conversion_events_user_data_properties([]).

openapi_conversion_events_user_data_properties(Fields) ->
  Default = [ {'click_id', binary() }
            , {'client_ip_address', binary() }
            , {'client_user_agent', binary() }
            , {'country', list(binary()) }
            , {'ct', list(binary()) }
            , {'db', list(binary()) }
            , {'em', list(binary()) }
            , {'external_id', list(binary()) }
            , {'fn', list(binary()) }
            , {'ge', list(binary()) }
            , {'hashed_maids', list(binary()) }
            , {'ln', list(binary()) }
            , {'partner_id', binary() }
            , {'ph', list(binary()) }
            , {'st', list(binary()) }
            , {'zp', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

