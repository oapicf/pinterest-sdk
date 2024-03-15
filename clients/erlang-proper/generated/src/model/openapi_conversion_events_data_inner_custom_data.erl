-module(openapi_conversion_events_data_inner_custom_data).

-include("openapi.hrl").

-export([openapi_conversion_events_data_inner_custom_data/0]).

-export([openapi_conversion_events_data_inner_custom_data/1]).

-export_type([openapi_conversion_events_data_inner_custom_data/0]).

-type openapi_conversion_events_data_inner_custom_data() ::
  [ {'currency', binary() }
  | {'value', binary() }
  | {'content_ids', list(binary()) }
  | {'content_name', binary() }
  | {'content_category', binary() }
  | {'content_brand', binary() }
  | {'contents', list(openapi_conversion_events_data_inner_custom_data_contents_inner:openapi_conversion_events_data_inner_custom_data_contents_inner()) }
  | {'num_items', integer() }
  | {'order_id', binary() }
  | {'search_string', binary() }
  | {'opt_out_type', binary() }
  | {'np', binary() }
  ].


openapi_conversion_events_data_inner_custom_data() ->
    openapi_conversion_events_data_inner_custom_data([]).

openapi_conversion_events_data_inner_custom_data(Fields) ->
  Default = [ {'currency', binary() }
            , {'value', binary() }
            , {'content_ids', list(binary()) }
            , {'content_name', binary() }
            , {'content_category', binary() }
            , {'content_brand', binary() }
            , {'contents', list(openapi_conversion_events_data_inner_custom_data_contents_inner:openapi_conversion_events_data_inner_custom_data_contents_inner()) }
            , {'num_items', integer() }
            , {'order_id', binary() }
            , {'search_string', binary() }
            , {'opt_out_type', binary() }
            , {'np', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

