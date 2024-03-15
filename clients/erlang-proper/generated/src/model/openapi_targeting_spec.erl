-module(openapi_targeting_spec).

-include("openapi.hrl").

-export([openapi_targeting_spec/0]).

-export([openapi_targeting_spec/1]).

-export_type([openapi_targeting_spec/0]).

-type openapi_targeting_spec() ::
  [ {'AGE_BUCKET', list(binary()) }
  | {'APPTYPE', list(binary()) }
  | {'AUDIENCE_EXCLUDE', list(binary()) }
  | {'AUDIENCE_INCLUDE', list(binary()) }
  | {'GENDER', list(binary()) }
  | {'GEO', list(binary()) }
  | {'INTEREST', list(binary()) }
  | {'LOCALE', list(binary()) }
  | {'LOCATION', list(binary()) }
  | {'SHOPPING_RETARGETING', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
  | {'TARGETING_STRATEGY', list(binary()) }
  ].


openapi_targeting_spec() ->
    openapi_targeting_spec([]).

openapi_targeting_spec(Fields) ->
  Default = [ {'AGE_BUCKET', list(binary()) }
            , {'APPTYPE', list(binary()) }
            , {'AUDIENCE_EXCLUDE', list(binary()) }
            , {'AUDIENCE_INCLUDE&#39;', list(binary()) }
            , {'GENDER', list(binary()) }
            , {'GEO', list(binary()) }
            , {'INTEREST', list(binary()) }
            , {'LOCALE', list(binary()) }
            , {'LOCATION', list(binary()) }
            , {'SHOPPING_RETARGETING', list(openapi_targeting_spec_shopping_retargeting:openapi_targeting_spec_shopping_retargeting()) }
            , {'TARGETING_STRATEGY', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

