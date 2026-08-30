-module(openapi_appsflyer_audience).

-include("openapi.hrl").

-export([openapi_appsflyer_audience/0]).

-export([openapi_appsflyer_audience/1]).

-export_type([openapi_appsflyer_audience/0]).

-type openapi_appsflyer_audience() ::
  [ {'container_id', binary() }
  | {'name', binary() }
  | {'platform', openapi_appsflyer_platform:openapi_appsflyer_platform() }
  ].


openapi_appsflyer_audience() ->
    openapi_appsflyer_audience([]).

openapi_appsflyer_audience(Fields) ->
  Default = [ {'container_id', binary() }
            , {'name', binary() }
            , {'platform', openapi_appsflyer_platform:openapi_appsflyer_platform() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

