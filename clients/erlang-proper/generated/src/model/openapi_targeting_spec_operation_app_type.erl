-module(openapi_targeting_spec_operation_app_type).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_app_type/0]).

-export([openapi_targeting_spec_operation_app_type/1]).

-export_type([openapi_targeting_spec_operation_app_type/0]).

-type openapi_targeting_spec_operation_app_type() ::
  [ {'field', binary() }
  | {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
  | {'values', list(openapi_targeting_spec_app_type:openapi_targeting_spec_app_type()) }
  ].


openapi_targeting_spec_operation_app_type() ->
    openapi_targeting_spec_operation_app_type([]).

openapi_targeting_spec_operation_app_type(Fields) ->
  Default = [ {'field', elements([<<"APPTYPE">>]) }
            , {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
            , {'values', list(openapi_targeting_spec_app_type:openapi_targeting_spec_app_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

