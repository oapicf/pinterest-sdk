-module(openapi_catalogs_update_retail_item).

-include("openapi.hrl").

-export([openapi_catalogs_update_retail_item/0]).

-export([openapi_catalogs_update_retail_item/1]).

-export_type([openapi_catalogs_update_retail_item/0]).

-type openapi_catalogs_update_retail_item() ::
  [ {'attributes', openapi_updatable_item_attributes:openapi_updatable_item_attributes() }
  | {'item_id', binary() }
  | {'operation', binary() }
  | {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
  ].


openapi_catalogs_update_retail_item() ->
    openapi_catalogs_update_retail_item([]).

openapi_catalogs_update_retail_item(Fields) ->
  Default = [ {'attributes', openapi_updatable_item_attributes:openapi_updatable_item_attributes() }
            , {'item_id', binary() }
            , {'operation', elements([<<"UPDATE">>]) }
            , {'update_mask', list(openapi_update_mask_field_type:openapi_update_mask_field_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

