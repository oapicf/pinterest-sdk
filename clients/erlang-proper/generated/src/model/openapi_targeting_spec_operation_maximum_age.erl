-module(openapi_targeting_spec_operation_maximum_age).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_maximum_age/0]).

-export([openapi_targeting_spec_operation_maximum_age/1]).

-export_type([openapi_targeting_spec_operation_maximum_age/0]).

-type openapi_targeting_spec_operation_maximum_age() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'value', binary() }
  ].


openapi_targeting_spec_operation_maximum_age() ->
    openapi_targeting_spec_operation_maximum_age([]).

openapi_targeting_spec_operation_maximum_age(Fields) ->
  Default = [ {'field', elements([<<"MAXIMUM_AGE">>]) }
            , {'operation', elements([<<"SET">>]) }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

