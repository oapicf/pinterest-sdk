-module(openapi_app_type_multipliers).

-include("openapi.hrl").

-export([openapi_app_type_multipliers/0]).

-export([openapi_app_type_multipliers/1]).

-export_type([openapi_app_type_multipliers/0]).

-type openapi_app_type_multipliers() ::
  [ {'APP_TYPE', binary() }
  ].


openapi_app_type_multipliers() ->
    openapi_app_type_multipliers([]).

openapi_app_type_multipliers(Fields) ->
  Default = [ {'APP_TYPE', elements([<<"android_mobile">>, <<"android_tablet">>, <<"ipad">>, <<"iphone">>, <<"web">>, <<"web_mobile">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

