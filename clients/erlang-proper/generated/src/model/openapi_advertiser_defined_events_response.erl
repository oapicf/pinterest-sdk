-module(openapi_advertiser_defined_events_response).

-include("openapi.hrl").

-export([openapi_advertiser_defined_events_response/0]).

-export([openapi_advertiser_defined_events_response/1]).

-export_type([openapi_advertiser_defined_events_response/0]).

-type openapi_advertiser_defined_events_response() ::
  [ {'items', list(openapi_advertiser_defined_event:openapi_advertiser_defined_event()) }
  ].


openapi_advertiser_defined_events_response() ->
    openapi_advertiser_defined_events_response([]).

openapi_advertiser_defined_events_response(Fields) ->
  Default = [ {'items', list(openapi_advertiser_defined_event:openapi_advertiser_defined_event()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

