-module(openapi_targeting_spec_optimal).

-include("openapi.hrl").

-export([openapi_targeting_spec_optimal/0]).

-export([openapi_targeting_spec_optimal/1]).

-export_type([openapi_targeting_spec_optimal/0]).

-type openapi_targeting_spec_optimal() ::
  [ {'AGE_BUCKET', list(openapi_targeting_spec_age_bucket:openapi_targeting_spec_age_bucket()) }
  | {'APPTYPE', list(openapi_targeting_spec_app_type:openapi_targeting_spec_app_type()) }
  | {'AUDIENCE_EXCLUDE', list(binary()) }
  | {'AUDIENCE_INCLUDE', list(binary()) }
  | {'GENDER', list(openapi_targeting_spec_gender:openapi_targeting_spec_gender()) }
  | {'GEO', list(binary()) }
  | {'GEO_EXCLUDE', list(binary()) }
  | {'INTEREST', list(binary()) }
  | {'LOCALE', list(binary()) }
  | {'LOCATION', list(binary()) }
  | {'LOCATION_EXCLUDE', list(binary()) }
  | {'MAXIMUM_AGE', binary() }
  | {'MINIMUM_AGE', binary() }
  | {'SHOPPING_RETARGETING', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
  | {'TARGETING_STRATEGY', list(openapi_targeting_strategy:openapi_targeting_strategy()) }
  ].


openapi_targeting_spec_optimal() ->
    openapi_targeting_spec_optimal([]).

openapi_targeting_spec_optimal(Fields) ->
  Default = [ {'AGE_BUCKET', list(openapi_targeting_spec_age_bucket:openapi_targeting_spec_age_bucket()) }
            , {'APPTYPE', list(openapi_targeting_spec_app_type:openapi_targeting_spec_app_type()) }
            , {'AUDIENCE_EXCLUDE', list(binary()) }
            , {'AUDIENCE_INCLUDE', list(binary()) }
            , {'GENDER', list(openapi_targeting_spec_gender:openapi_targeting_spec_gender()) }
            , {'GEO', list(binary()) }
            , {'GEO_EXCLUDE', list(binary()) }
            , {'INTEREST', list(binary()) }
            , {'LOCALE', list(binary()) }
            , {'LOCATION', list(binary()) }
            , {'LOCATION_EXCLUDE', list(binary()) }
            , {'MAXIMUM_AGE', binary() }
            , {'MINIMUM_AGE', binary() }
            , {'SHOPPING_RETARGETING', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
            , {'TARGETING_STRATEGY', list(openapi_targeting_strategy:openapi_targeting_strategy()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

