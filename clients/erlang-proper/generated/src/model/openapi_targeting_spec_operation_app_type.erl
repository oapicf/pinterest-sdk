-module(openapi_targeting_spec_operation_app_type).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_app_type/0]).

-export([openapi_targeting_spec_operation_app_type/1]).

-export_type([openapi_targeting_spec_operation_app_type/0]).

-type openapi_targeting_spec_operation_app_type() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'values', list(openapi_targeting_spec_app_type:openapi_targeting_spec_app_type()) }
  ].


openapi_targeting_spec_operation_app_type() ->
    openapi_targeting_spec_operation_app_type([]).

openapi_targeting_spec_operation_app_type(Fields) ->
  Default = [ {'field', elements([<<"APPTYPE">>]) }
            , {'operation', elements([<<"SET">>, <<"ADD">>, <<"REMOVE">>]) }
            , {'values', list(openapi_targeting_spec_app_type:openapi_targeting_spec_app_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

