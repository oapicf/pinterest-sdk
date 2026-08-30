-module(openapi_appsflyer_audience_create).

-include("openapi.hrl").

-export([openapi_appsflyer_audience_create/0]).

-export([openapi_appsflyer_audience_create/1]).

-export_type([openapi_appsflyer_audience_create/0]).

-type openapi_appsflyer_audience_create() ::
  [ {'name', binary() }
  | {'platform', openapi_appsflyer_platform:openapi_appsflyer_platform() }
  ].


openapi_appsflyer_audience_create() ->
    openapi_appsflyer_audience_create([]).

openapi_appsflyer_audience_create(Fields) ->
  Default = [ {'name', binary() }
            , {'platform', openapi_appsflyer_platform:openapi_appsflyer_platform() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

