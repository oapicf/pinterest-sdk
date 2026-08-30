-module(openapi_age_bucket_multipliers).

-include("openapi.hrl").

-export([openapi_age_bucket_multipliers/0]).

-export([openapi_age_bucket_multipliers/1]).

-export_type([openapi_age_bucket_multipliers/0]).

-type openapi_age_bucket_multipliers() ::
  [ {'AGE_BUCKET', openapi_targeting_spec_age_bucket:openapi_targeting_spec_age_bucket() }
  ].


openapi_age_bucket_multipliers() ->
    openapi_age_bucket_multipliers([]).

openapi_age_bucket_multipliers(Fields) ->
  Default = [ {'AGE_BUCKET', openapi_targeting_spec_age_bucket:openapi_targeting_spec_age_bucket() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

