-module(openapi_advertiser_defined_event).

-include("openapi.hrl").

-export([openapi_advertiser_defined_event/0]).

-export([openapi_advertiser_defined_event/1]).

-export_type([openapi_advertiser_defined_event/0]).

-type openapi_advertiser_defined_event() ::
  [ {'mapped_conversion_type', openapi_conversion_tag_type_optimal:openapi_conversion_tag_type_optimal() }
  | {'name', binary() }
  ].


openapi_advertiser_defined_event() ->
    openapi_advertiser_defined_event([]).

openapi_advertiser_defined_event(Fields) ->
  Default = [ {'mapped_conversion_type', openapi_conversion_tag_type_optimal:openapi_conversion_tag_type_optimal() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

