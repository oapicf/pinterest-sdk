-module(openapi_app_type_multipliers).

-include("openapi.hrl").

-export([openapi_app_type_multipliers/0]).

-export([openapi_app_type_multipliers/1]).

-export_type([openapi_app_type_multipliers/0]).

-type openapi_app_type_multipliers() ::
  [ {'APP_TYPE', openapi_targeting_spec_app_type:openapi_targeting_spec_app_type() }
  ].


openapi_app_type_multipliers() ->
    openapi_app_type_multipliers([]).

openapi_app_type_multipliers(Fields) ->
  Default = [ {'APP_TYPE', openapi_targeting_spec_app_type:openapi_targeting_spec_app_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

