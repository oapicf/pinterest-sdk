-module(openapi_catalogs_creative_assets_product_group_product_counts).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_product_group_product_counts/0]).

-export([openapi_catalogs_creative_assets_product_group_product_counts/1]).

-export_type([openapi_catalogs_creative_assets_product_group_product_counts/0]).

-type openapi_catalogs_creative_assets_product_group_product_counts() ::
  [ {'app_links', integer() }
  | {'catalog_type', binary() }
  | {'images', integer() }
  | {'total', integer() }
  | {'videos', integer() }
  ].


openapi_catalogs_creative_assets_product_group_product_counts() ->
    openapi_catalogs_creative_assets_product_group_product_counts([]).

openapi_catalogs_creative_assets_product_group_product_counts(Fields) ->
  Default = [ {'app_links', integer() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'images', integer() }
            , {'total', integer() }
            , {'videos', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

