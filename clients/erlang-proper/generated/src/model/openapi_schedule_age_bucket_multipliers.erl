-module(openapi_schedule_age_bucket_multipliers).

-include("openapi.hrl").

-export([openapi_schedule_age_bucket_multipliers/0]).

-export([openapi_schedule_age_bucket_multipliers/1]).

-export_type([openapi_schedule_age_bucket_multipliers/0]).

-type openapi_schedule_age_bucket_multipliers() ::
  [ {'AGE_BUCKET', binary() }
  ].


openapi_schedule_age_bucket_multipliers() ->
    openapi_schedule_age_bucket_multipliers([]).

openapi_schedule_age_bucket_multipliers(Fields) ->
  Default = [ {'AGE_BUCKET', elements([<<"18-24">>, <<"25-34">>, <<"35-44">>, <<"45-49">>, <<"50-54">>, <<"55-64">>, <<"65+">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

