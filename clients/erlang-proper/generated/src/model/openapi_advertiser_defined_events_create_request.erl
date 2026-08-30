-module(openapi_advertiser_defined_events_create_request).

-include("openapi.hrl").

-export([openapi_advertiser_defined_events_create_request/0]).

-export([openapi_advertiser_defined_events_create_request/1]).

-export_type([openapi_advertiser_defined_events_create_request/0]).

-type openapi_advertiser_defined_events_create_request() ::
  [ {'items', list(openapi_advertiser_defined_event_input:openapi_advertiser_defined_event_input()) }
  ].


openapi_advertiser_defined_events_create_request() ->
    openapi_advertiser_defined_events_create_request([]).

openapi_advertiser_defined_events_create_request(Fields) ->
  Default = [ {'items', list(openapi_advertiser_defined_event_input:openapi_advertiser_defined_event_input(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

