-module(openapi_targeting_spec_operation_age_bucket).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_age_bucket/0]).

-export([openapi_targeting_spec_operation_age_bucket/1]).

-export_type([openapi_targeting_spec_operation_age_bucket/0]).

-type openapi_targeting_spec_operation_age_bucket() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'values', list(openapi_targeting_spec_age_bucket:openapi_targeting_spec_age_bucket()) }
  ].


openapi_targeting_spec_operation_age_bucket() ->
    openapi_targeting_spec_operation_age_bucket([]).

openapi_targeting_spec_operation_age_bucket(Fields) ->
  Default = [ {'field', elements([<<"AGE_BUCKET">>]) }
            , {'operation', elements([<<"SET">>]) }
            , {'values', list(openapi_targeting_spec_age_bucket:openapi_targeting_spec_age_bucket()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

