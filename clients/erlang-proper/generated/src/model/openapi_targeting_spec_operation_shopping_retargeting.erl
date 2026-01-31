-module(openapi_targeting_spec_operation_shopping_retargeting).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_shopping_retargeting/0]).

-export([openapi_targeting_spec_operation_shopping_retargeting/1]).

-export_type([openapi_targeting_spec_operation_shopping_retargeting/0]).

-type openapi_targeting_spec_operation_shopping_retargeting() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'values', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
  ].


openapi_targeting_spec_operation_shopping_retargeting() ->
    openapi_targeting_spec_operation_shopping_retargeting([]).

openapi_targeting_spec_operation_shopping_retargeting(Fields) ->
  Default = [ {'field', elements([<<"SHOPPING_RETARGETING">>]) }
            , {'operation', elements([<<"SET">>]) }
            , {'values', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

