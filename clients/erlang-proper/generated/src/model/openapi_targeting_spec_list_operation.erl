-module(openapi_targeting_spec_list_operation).

-include("openapi.hrl").

-export([openapi_targeting_spec_list_operation/0]).

-export_type([openapi_targeting_spec_list_operation/0]).

-type openapi_targeting_spec_list_operation() ::
  binary().

openapi_targeting_spec_list_operation() ->
  elements([<<"SET">>, <<"ADD">>, <<"REMOVE">>]).

