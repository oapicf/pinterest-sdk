-module(openapi_catalogs_retail_product_metadata).

-include("openapi.hrl").

-export([openapi_catalogs_retail_product_metadata/0]).

-export([openapi_catalogs_retail_product_metadata/1]).

-export_type([openapi_catalogs_retail_product_metadata/0]).

-type openapi_catalogs_retail_product_metadata() ::
  [ {'item_id', binary() }
  | {'item_group_id', binary() }
  | {'availability', openapi_non_nullable_product_availability_type:openapi_non_nullable_product_availability_type() }
  | {'price', integer() }
  | {'sale_price', integer() }
  | {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
  ].


openapi_catalogs_retail_product_metadata() ->
    openapi_catalogs_retail_product_metadata([]).

openapi_catalogs_retail_product_metadata(Fields) ->
  Default = [ {'item_id', binary() }
            , {'item_group_id', binary() }
            , {'availability', openapi_non_nullable_product_availability_type:openapi_non_nullable_product_availability_type() }
            , {'price', integer() }
            , {'sale_price', integer() }
            , {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

