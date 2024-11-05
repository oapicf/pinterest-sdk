-module(openapi_catalogs_creative_assets_product_group).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_product_group/0]).

-export([openapi_catalogs_creative_assets_product_group/1]).

-export_type([openapi_catalogs_creative_assets_product_group/0]).

-type openapi_catalogs_creative_assets_product_group() ::
  [ {'catalog_type', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'description', binary() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  | {'created_at', integer() }
  | {'updated_at', integer() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_creative_assets_product_group() ->
    openapi_catalogs_creative_assets_product_group([]).

openapi_catalogs_creative_assets_product_group(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'id', binary() }
            , {'name', binary() }
            , {'description', binary() }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            , {'created_at', integer() }
            , {'updated_at', integer() }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

