-module(openapi_conversion_events_data_inner_custom_data_contents_inner).

-include("openapi.hrl").

-export([openapi_conversion_events_data_inner_custom_data_contents_inner/0]).

-export([openapi_conversion_events_data_inner_custom_data_contents_inner/1]).

-export_type([openapi_conversion_events_data_inner_custom_data_contents_inner/0]).

-type openapi_conversion_events_data_inner_custom_data_contents_inner() ::
  [ {'id', binary() }
  | {'item_price', binary() }
  | {'quantity', integer() }
  | {'item_name', binary() }
  | {'item_category', binary() }
  | {'item_brand', binary() }
  ].


openapi_conversion_events_data_inner_custom_data_contents_inner() ->
    openapi_conversion_events_data_inner_custom_data_contents_inner([]).

openapi_conversion_events_data_inner_custom_data_contents_inner(Fields) ->
  Default = [ {'id', binary() }
            , {'item_price', binary() }
            , {'quantity', integer() }
            , {'item_name', binary() }
            , {'item_category', binary() }
            , {'item_brand', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

