-module(openapi_system_user_update_with_required_body).

-include("openapi.hrl").

-export([openapi_system_user_update_with_required_body/0]).

-export([openapi_system_user_update_with_required_body/1]).

-export_type([openapi_system_user_update_with_required_body/0]).

-type openapi_system_user_update_with_required_body() ::
  [ {'name', binary() }
  ].


openapi_system_user_update_with_required_body() ->
    openapi_system_user_update_with_required_body([]).

openapi_system_user_update_with_required_body(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

