-module(openapi_catalogs_retail_product_group_create_request).

-include("openapi.hrl").

-export([openapi_catalogs_retail_product_group_create_request/0]).

-export([openapi_catalogs_retail_product_group_create_request/1]).

-export_type([openapi_catalogs_retail_product_group_create_request/0]).

-type openapi_catalogs_retail_product_group_create_request() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'description', binary() }
  | {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
  | {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
  | {'name', binary() }
  ].


openapi_catalogs_retail_product_group_create_request() ->
    openapi_catalogs_retail_product_group_create_request([]).

openapi_catalogs_retail_product_group_create_request(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"RETAIL">>]) }
            , {'country', openapi_country:openapi_country() }
            , {'description', binary() }
            , {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
            , {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

