-module(openapi_items_batch_post_request).

-include("openapi.hrl").

-export([openapi_items_batch_post_request/0]).

-export([openapi_items_batch_post_request/1]).

-export_type([openapi_items_batch_post_request/0]).

-type openapi_items_batch_post_request() ::
  [ {'catalog_type', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_catalogs_items_request_language:openapi_catalogs_items_request_language() }
  | {'items', list(openapi_item_delete_batch_record:openapi_item_delete_batch_record()) }
  | {'catalog_id', binary() }
  | {'operation', openapi_batch_operation:openapi_batch_operation() }
  ].


openapi_items_batch_post_request() ->
    openapi_items_batch_post_request([]).

openapi_items_batch_post_request(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_catalogs_items_request_language:openapi_catalogs_items_request_language() }
            , {'items', list(openapi_item_delete_batch_record:openapi_item_delete_batch_record()) }
            , {'catalog_id', binary() }
            , {'operation', openapi_batch_operation:openapi_batch_operation() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

