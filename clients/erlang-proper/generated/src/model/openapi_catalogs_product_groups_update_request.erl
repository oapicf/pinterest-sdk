-module(openapi_catalogs_product_groups_update_request).

-include("openapi.hrl").

-export([openapi_catalogs_product_groups_update_request/0]).

-export([openapi_catalogs_product_groups_update_request/1]).

-export_type([openapi_catalogs_product_groups_update_request/0]).

-type openapi_catalogs_product_groups_update_request() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'is_featured', boolean() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  | {'catalog_type', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
  ].


openapi_catalogs_product_groups_update_request() ->
    openapi_catalogs_product_groups_update_request([]).

openapi_catalogs_product_groups_update_request(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'is_featured', boolean() }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'country', openapi_country:openapi_country() }
            , {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

