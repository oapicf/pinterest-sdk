-module(openapi_product_categories_metrics_highlights).

-include("openapi.hrl").

-export([openapi_product_categories_metrics_highlights/0]).

-export([openapi_product_categories_metrics_highlights/1]).

-export_type([openapi_product_categories_metrics_highlights/0]).

-type openapi_product_categories_metrics_highlights() ::
  [ {'engagement', openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights() }
  | {'outbound_clicks', openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights() }
  | {'pin_saves', openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights() }
  ].


openapi_product_categories_metrics_highlights() ->
    openapi_product_categories_metrics_highlights([]).

openapi_product_categories_metrics_highlights(Fields) ->
  Default = [ {'engagement', openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights() }
            , {'outbound_clicks', openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights() }
            , {'pin_saves', openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

