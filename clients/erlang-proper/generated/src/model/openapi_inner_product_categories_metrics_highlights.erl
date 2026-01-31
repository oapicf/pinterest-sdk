-module(openapi_inner_product_categories_metrics_highlights).

-include("openapi.hrl").

-export([openapi_inner_product_categories_metrics_highlights/0]).

-export([openapi_inner_product_categories_metrics_highlights/1]).

-export_type([openapi_inner_product_categories_metrics_highlights/0]).

-type openapi_inner_product_categories_metrics_highlights() ::
  [ {'pct_change_mom', integer() }
  ].


openapi_inner_product_categories_metrics_highlights() ->
    openapi_inner_product_categories_metrics_highlights([]).

openapi_inner_product_categories_metrics_highlights(Fields) ->
  Default = [ {'pct_change_mom', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

