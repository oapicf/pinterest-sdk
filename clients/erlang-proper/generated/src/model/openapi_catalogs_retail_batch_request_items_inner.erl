-module(openapi_catalogs_retail_batch_request_items_inner).

-include("openapi.hrl").

-export([openapi_catalogs_retail_batch_request_items_inner/0]).

-export([openapi_catalogs_retail_batch_request_items_inner/1]).

-export_type([openapi_catalogs_retail_batch_request_items_inner/0]).

-type openapi_catalogs_retail_batch_request_items_inner() ::
  [ {'item_id', binary() }
  | {'operation', binary() }
  | {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
  | {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
  ].


openapi_catalogs_retail_batch_request_items_inner() ->
    openapi_catalogs_retail_batch_request_items_inner([]).

openapi_catalogs_retail_batch_request_items_inner(Fields) ->
  Default = [ {'item_id', binary() }
            , {'operation', elements([<<"DELETE">>]) }
            , {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
            , {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

