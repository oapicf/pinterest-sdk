-module(openapi_conversion_events_data_items_custom_data_contents_items).

-include("openapi.hrl").

-export([openapi_conversion_events_data_items_custom_data_contents_items/0]).

-export([openapi_conversion_events_data_items_custom_data_contents_items/1]).

-export_type([openapi_conversion_events_data_items_custom_data_contents_items/0]).

-type openapi_conversion_events_data_items_custom_data_contents_items() ::
  [ {'id', binary() }
  | {'item_brand', binary() }
  | {'item_brand_id', binary() }
  | {'item_category', binary() }
  | {'item_name', binary() }
  | {'item_price', binary() }
  | {'quantity', integer() }
  ].


openapi_conversion_events_data_items_custom_data_contents_items() ->
    openapi_conversion_events_data_items_custom_data_contents_items([]).

openapi_conversion_events_data_items_custom_data_contents_items(Fields) ->
  Default = [ {'id', binary() }
            , {'item_brand', binary() }
            , {'item_brand_id', binary() }
            , {'item_category', binary() }
            , {'item_name', binary() }
            , {'item_price', binary() }
            , {'quantity', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

