-module(openapi_schedule_age_bucket_multipliers).

-export([encode/1]).

-export_type([openapi_schedule_age_bucket_multipliers/0]).

-type openapi_schedule_age_bucket_multipliers() ::
    #{ 'AGE_BUCKET' => binary()
     }.

encode(#{ 'AGE_BUCKET' := AGEBUCKET
        }) ->
    #{ 'AGE_BUCKET' => AGEBUCKET
     }.
