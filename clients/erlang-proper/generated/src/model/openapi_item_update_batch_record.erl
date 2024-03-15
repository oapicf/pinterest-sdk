-module(openapi_item_update_batch_record).

-include("openapi.hrl").

-export([openapi_item_update_batch_record/0]).

-export([openapi_item_update_batch_record/1]).

-export_type([openapi_item_update_batch_record/0]).

-type openapi_item_update_batch_record() ::
  [ {'item_id', binary() }
  | {'attributes', openapi_updatable_item_attributes:openapi_updatable_item_attributes() }
  | {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
  ].


openapi_item_update_batch_record() ->
    openapi_item_update_batch_record([]).

openapi_item_update_batch_record(Fields) ->
  Default = [ {'item_id', binary() }
            , {'attributes', openapi_updatable_item_attributes:openapi_updatable_item_attributes() }
            , {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

