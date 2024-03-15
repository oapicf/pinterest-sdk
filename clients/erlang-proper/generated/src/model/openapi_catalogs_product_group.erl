-module(openapi_catalogs_product_group).

-include("openapi.hrl").

-export([openapi_catalogs_product_group/0]).

-export([openapi_catalogs_product_group/1]).

-export_type([openapi_catalogs_product_group/0]).

-type openapi_catalogs_product_group() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'description', binary() }
  | {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
  | {'is_featured', boolean() }
  | {'type', openapi_catalogs_product_group_type:openapi_catalogs_product_group_type() }
  | {'status', openapi_catalogs_product_group_status:openapi_catalogs_product_group_status() }
  | {'created_at', integer() }
  | {'updated_at', integer() }
  | {'feed_id', binary() }
  | {'catalog_type', binary() }
  ].


openapi_catalogs_product_group() ->
    openapi_catalogs_product_group([]).

openapi_catalogs_product_group(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            , {'description', binary() }
            , {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
            , {'is_featured', boolean() }
            , {'type', openapi_catalogs_product_group_type:openapi_catalogs_product_group_type() }
            , {'status', openapi_catalogs_product_group_status:openapi_catalogs_product_group_status() }
            , {'created_at', integer() }
            , {'updated_at', integer() }
            , {'feed_id', binary() }
            , {'catalog_type', elements([<<"RETAIL">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

