-module(openapi_catalogs_creative_assets_product_group_create_request).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_product_group_create_request/0]).

-export([openapi_catalogs_creative_assets_product_group_create_request/1]).

-export_type([openapi_catalogs_creative_assets_product_group_create_request/0]).

-type openapi_catalogs_creative_assets_product_group_create_request() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'description', binary() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  | {'name', binary() }
  ].


openapi_catalogs_creative_assets_product_group_create_request() ->
    openapi_catalogs_creative_assets_product_group_create_request([]).

openapi_catalogs_creative_assets_product_group_create_request(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'description', binary() }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

