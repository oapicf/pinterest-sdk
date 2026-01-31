-module(openapi_catalogs_create_retail_item).

-include("openapi.hrl").

-export([openapi_catalogs_create_retail_item/0]).

-export([openapi_catalogs_create_retail_item/1]).

-export_type([openapi_catalogs_create_retail_item/0]).

-type openapi_catalogs_create_retail_item() ::
  [ {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
  | {'item_id', binary() }
  | {'operation', binary() }
  ].


openapi_catalogs_create_retail_item() ->
    openapi_catalogs_create_retail_item([]).

openapi_catalogs_create_retail_item(Fields) ->
  Default = [ {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
            , {'item_id', binary() }
            , {'operation', elements([<<"CREATE">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

