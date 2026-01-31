-module(openapi_targeting_spec_operation_min_max_age).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_min_max_age/0]).

-export([openapi_targeting_spec_operation_min_max_age/1]).

-export_type([openapi_targeting_spec_operation_min_max_age/0]).

-type openapi_targeting_spec_operation_min_max_age() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'value', binary() }
  ].


openapi_targeting_spec_operation_min_max_age() ->
    openapi_targeting_spec_operation_min_max_age([]).

openapi_targeting_spec_operation_min_max_age(Fields) ->
  Default = [ {'field', elements([<<"MINIMUM_AGE">>, <<"MAXIMUM_AGE">>]) }
            , {'operation', elements([<<"SET">>]) }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

