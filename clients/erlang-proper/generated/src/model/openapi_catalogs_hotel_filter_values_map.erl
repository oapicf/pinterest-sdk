-module(openapi_catalogs_hotel_filter_values_map).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_filter_values_map/0]).

-export([openapi_catalogs_hotel_filter_values_map/1]).

-export_type([openapi_catalogs_hotel_filter_values_map/0]).

-type openapi_catalogs_hotel_filter_values_map() ::
  [ {'brand', list(binary()) }
  | {'custom_label_0', list(binary()) }
  | {'custom_label_1', list(binary()) }
  | {'custom_label_2', list(binary()) }
  | {'custom_label_3', list(binary()) }
  | {'custom_label_4', list(binary()) }
  ].


openapi_catalogs_hotel_filter_values_map() ->
    openapi_catalogs_hotel_filter_values_map([]).

openapi_catalogs_hotel_filter_values_map(Fields) ->
  Default = [ {'brand', list(binary()) }
            , {'custom_label_0', list(binary()) }
            , {'custom_label_1', list(binary()) }
            , {'custom_label_2', list(binary()) }
            , {'custom_label_3', list(binary()) }
            , {'custom_label_4', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

