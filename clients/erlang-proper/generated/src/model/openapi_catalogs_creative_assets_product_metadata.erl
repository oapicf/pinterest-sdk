-module(openapi_catalogs_creative_assets_product_metadata).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_product_metadata/0]).

-export([openapi_catalogs_creative_assets_product_metadata/1]).

-export_type([openapi_catalogs_creative_assets_product_metadata/0]).

-type openapi_catalogs_creative_assets_product_metadata() ::
  [ {'creative_assets_id', binary() }
  | {'visibility', openapi_creative_assets_visibility_type:openapi_creative_assets_visibility_type() }
  ].


openapi_catalogs_creative_assets_product_metadata() ->
    openapi_catalogs_creative_assets_product_metadata([]).

openapi_catalogs_creative_assets_product_metadata(Fields) ->
  Default = [ {'creative_assets_id', binary() }
            , {'visibility', openapi_creative_assets_visibility_type:openapi_creative_assets_visibility_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

