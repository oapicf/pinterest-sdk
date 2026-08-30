-module(openapi_advertiser_defined_event_input).

-include("openapi.hrl").

-export([openapi_advertiser_defined_event_input/0]).

-export([openapi_advertiser_defined_event_input/1]).

-export_type([openapi_advertiser_defined_event_input/0]).

-type openapi_advertiser_defined_event_input() ::
  [ {'mapped_conversion_type', openapi_advertiser_defined_event_mapping_type:openapi_advertiser_defined_event_mapping_type() }
  | {'name', binary() }
  ].


openapi_advertiser_defined_event_input() ->
    openapi_advertiser_defined_event_input([]).

openapi_advertiser_defined_event_input(Fields) ->
  Default = [ {'mapped_conversion_type', openapi_advertiser_defined_event_mapping_type:openapi_advertiser_defined_event_mapping_type() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

