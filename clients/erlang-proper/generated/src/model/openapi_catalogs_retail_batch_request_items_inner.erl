-module(openapi_catalogs_retail_batch_request_items_inner).

-include("openapi.hrl").

-export([openapi_catalogs_retail_batch_request_items_inner/0]).

-export([openapi_catalogs_retail_batch_request_items_inner/1]).

-export_type([openapi_catalogs_retail_batch_request_items_inner/0]).

-type openapi_catalogs_retail_batch_request_items_inner() ::
  [ {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
  | {'item_id', binary() }
  | {'operation', binary() }
  | {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
  | {'last_updated_time', integer() }
  ].


openapi_catalogs_retail_batch_request_items_inner() ->
    openapi_catalogs_retail_batch_request_items_inner([]).

openapi_catalogs_retail_batch_request_items_inner(Fields) ->
  Default = [ {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
            , {'item_id', binary() }
            , {'operation', elements([<<"DELETE">>]) }
            , {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
            , {'last_updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

