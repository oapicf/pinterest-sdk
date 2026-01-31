-module(openapi_product_category_details).

-include("openapi.hrl").

-export([openapi_product_category_details/0]).

-export([openapi_product_category_details/1]).

-export_type([openapi_product_category_details/0]).

-type openapi_product_category_details() ::
  [ {'demographics', openapi_product_categories_demographic:openapi_product_categories_demographic() }
  | {'has_prediction', boolean() }
  | {'metrics_highlights', openapi_product_categories_metrics_highlights:openapi_product_categories_metrics_highlights() }
  | {'predicted_time_series', map() }
  | {'product_category', openapi_product_category_enum:openapi_product_category_enum() }
  | {'related_searches', list(binary()) }
  | {'time_series', map() }
  ].


openapi_product_category_details() ->
    openapi_product_category_details([]).

openapi_product_category_details(Fields) ->
  Default = [ {'demographics', openapi_product_categories_demographic:openapi_product_categories_demographic() }
            , {'has_prediction', boolean() }
            , {'metrics_highlights', openapi_product_categories_metrics_highlights:openapi_product_categories_metrics_highlights() }
            , {'predicted_time_series', map() }
            , {'product_category', openapi_product_category_enum:openapi_product_category_enum() }
            , {'related_searches', list(binary()) }
            , {'time_series', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

