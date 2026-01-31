-module(openapi_catalogs_hotel_product_group).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_product_group/0]).

-export([openapi_catalogs_hotel_product_group/1]).

-export_type([openapi_catalogs_hotel_product_group/0]).

-type openapi_catalogs_hotel_product_group() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'created_at', integer() }
  | {'description', binary() }
  | {'filters', openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters() }
  | {'id', binary() }
  | {'name', binary() }
  | {'type', openapi_catalogs_hotel_product_group_type:openapi_catalogs_hotel_product_group_type() }
  | {'updated_at', integer() }
  ].


openapi_catalogs_hotel_product_group() ->
    openapi_catalogs_hotel_product_group([]).

openapi_catalogs_hotel_product_group(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"HOTEL">>]) }
            , {'created_at', integer() }
            , {'description', binary() }
            , {'filters', openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters() }
            , {'id', binary() }
            , {'name', binary() }
            , {'type', openapi_catalogs_hotel_product_group_type:openapi_catalogs_hotel_product_group_type() }
            , {'updated_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

