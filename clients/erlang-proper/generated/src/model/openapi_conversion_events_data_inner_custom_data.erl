-module(openapi_conversion_events_data_inner_custom_data).

-include("openapi.hrl").

-export([openapi_conversion_events_data_inner_custom_data/0]).

-export([openapi_conversion_events_data_inner_custom_data/1]).

-export_type([openapi_conversion_events_data_inner_custom_data/0]).

-type openapi_conversion_events_data_inner_custom_data() ::
  [ {'content_brand', binary() }
  | {'content_category', binary() }
  | {'content_ids', list(binary()) }
  | {'content_name', binary() }
  | {'contents', list(openapi_conversion_events_data_inner_custom_data_contents_inner:openapi_conversion_events_data_inner_custom_data_contents_inner()) }
  | {'currency', binary() }
  | {'external_measurement_id', binary() }
  | {'external_measurement_vendor_id', integer() }
  | {'np', binary() }
  | {'num_items', integer() }
  | {'opt_out_type', binary() }
  | {'order_id', binary() }
  | {'predicted_ltv', binary() }
  | {'search_string', binary() }
  | {'value', binary() }
  ].


openapi_conversion_events_data_inner_custom_data() ->
    openapi_conversion_events_data_inner_custom_data([]).

openapi_conversion_events_data_inner_custom_data(Fields) ->
  Default = [ {'content_brand', binary() }
            , {'content_category', binary() }
            , {'content_ids', list(binary()) }
            , {'content_name', binary() }
            , {'contents', list(openapi_conversion_events_data_inner_custom_data_contents_inner:openapi_conversion_events_data_inner_custom_data_contents_inner()) }
            , {'currency', binary() }
            , {'external_measurement_id', binary() }
            , {'external_measurement_vendor_id', integer() }
            , {'np', binary() }
            , {'num_items', integer() }
            , {'opt_out_type', binary() }
            , {'order_id', binary() }
            , {'predicted_ltv', binary() }
            , {'search_string', binary() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

