-module(openapi_catalogs_retail_list_products_by_catalog_based_filter_request).

-include("openapi.hrl").

-export([openapi_catalogs_retail_list_products_by_catalog_based_filter_request/0]).

-export([openapi_catalogs_retail_list_products_by_catalog_based_filter_request/1]).

-export_type([openapi_catalogs_retail_list_products_by_catalog_based_filter_request/0]).

-type openapi_catalogs_retail_list_products_by_catalog_based_filter_request() ::
  [ {'catalog_type', binary() }
  | {'catalog_id', binary() }
  | {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
  | {'country', openapi_country:openapi_country() }
  | {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
  ].


openapi_catalogs_retail_list_products_by_catalog_based_filter_request() ->
    openapi_catalogs_retail_list_products_by_catalog_based_filter_request([]).

openapi_catalogs_retail_list_products_by_catalog_based_filter_request(Fields) ->
  Default = [ {'catalog_type', elements([<<"RETAIL">>]) }
            , {'catalog_id', binary() }
            , {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
            , {'country', openapi_country:openapi_country() }
            , {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

