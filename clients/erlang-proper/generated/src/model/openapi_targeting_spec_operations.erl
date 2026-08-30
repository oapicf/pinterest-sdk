-module(openapi_targeting_spec_operations).

-include("openapi.hrl").

-export([openapi_targeting_spec_operations/0]).

-export([openapi_targeting_spec_operations/1]).

-export_type([openapi_targeting_spec_operations/0]).

-type openapi_targeting_spec_operations() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'values', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
  | {'value', binary() }
  ].


openapi_targeting_spec_operations() ->
    openapi_targeting_spec_operations([]).

openapi_targeting_spec_operations(Fields) ->
  Default = [ {'field', elements([<<"MINIMUM_AGE">>]) }
            , {'operation', elements([<<"SET">>]) }
            , {'values', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

