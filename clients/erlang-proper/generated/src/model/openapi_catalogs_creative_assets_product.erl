-module(openapi_catalogs_creative_assets_product).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_product/0]).

-export([openapi_catalogs_creative_assets_product/1]).

-export_type([openapi_catalogs_creative_assets_product/0]).

-type openapi_catalogs_creative_assets_product() ::
  [ {'catalog_type', binary() }
  | {'metadata', openapi_catalogs_creative_assets_product_metadata:openapi_catalogs_creative_assets_product_metadata() }
  | {'pin', openapi_pin:openapi_pin() }
  ].


openapi_catalogs_creative_assets_product() ->
    openapi_catalogs_creative_assets_product([]).

openapi_catalogs_creative_assets_product(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'metadata', openapi_catalogs_creative_assets_product_metadata:openapi_catalogs_creative_assets_product_metadata() }
            , {'pin', openapi_pin:openapi_pin() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

