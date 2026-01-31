-module(openapi_system_user_update_request).

-include("openapi.hrl").

-export([openapi_system_user_update_request/0]).

-export([openapi_system_user_update_request/1]).

-export_type([openapi_system_user_update_request/0]).

-type openapi_system_user_update_request() ::
  [ {'name', binary() }
  ].


openapi_system_user_update_request() ->
    openapi_system_user_update_request([]).

openapi_system_user_update_request(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

