-module(openapi_age_bucket_multipliers).

-export([encode/1]).

-export_type([openapi_age_bucket_multipliers/0]).

-type openapi_age_bucket_multipliers() ::
    #{ 'AGE_BUCKET' => openapi_targeting_spec_age_bucket:openapi_targeting_spec_age_bucket()
     }.

encode(#{ 'AGE_BUCKET' := AGEBUCKET
        }) ->
    #{ 'AGE_BUCKET' => AGEBUCKET
     }.
