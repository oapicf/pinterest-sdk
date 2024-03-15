-module(openapi_catalogs_upsert_retail_item).

-include("openapi.hrl").

-export([openapi_catalogs_upsert_retail_item/0]).

-export([openapi_catalogs_upsert_retail_item/1]).

-export_type([openapi_catalogs_upsert_retail_item/0]).

-type openapi_catalogs_upsert_retail_item() ::
  [ {'item_id', binary() }
  | {'operation', binary() }
  | {'attributes', openapi_item_attributes:openapi_item_attributes() }
  ].


openapi_catalogs_upsert_retail_item() ->
    openapi_catalogs_upsert_retail_item([]).

openapi_catalogs_upsert_retail_item(Fields) ->
  Default = [ {'item_id', binary() }
            , {'operation', elements([<<"CREATE">>, <<"UPDATE">>, <<"UPSERT">>, <<"DELETE">>]) }
            , {'attributes', openapi_item_attributes:openapi_item_attributes() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

