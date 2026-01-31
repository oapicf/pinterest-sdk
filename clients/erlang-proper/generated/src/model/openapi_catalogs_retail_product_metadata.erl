-module(openapi_catalogs_retail_product_metadata).

-include("openapi.hrl").

-export([openapi_catalogs_retail_product_metadata/0]).

-export([openapi_catalogs_retail_product_metadata/1]).

-export_type([openapi_catalogs_retail_product_metadata/0]).

-type openapi_catalogs_retail_product_metadata() ::
  [ {'availability', openapi_non_nullable_product_availability_type:openapi_non_nullable_product_availability_type() }
  | {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
  | {'item_group_id', binary() }
  | {'item_id', binary() }
  | {'price', integer() }
  | {'sale_price', integer() }
  ].


openapi_catalogs_retail_product_metadata() ->
    openapi_catalogs_retail_product_metadata([]).

openapi_catalogs_retail_product_metadata(Fields) ->
  Default = [ {'availability', openapi_non_nullable_product_availability_type:openapi_non_nullable_product_availability_type() }
            , {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
            , {'item_group_id', binary() }
            , {'item_id', binary() }
            , {'price', integer() }
            , {'sale_price', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

