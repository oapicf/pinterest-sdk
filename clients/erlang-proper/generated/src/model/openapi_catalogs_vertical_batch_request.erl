-module(openapi_catalogs_vertical_batch_request).

-include("openapi.hrl").

-export([openapi_catalogs_vertical_batch_request/0]).

-export([openapi_catalogs_vertical_batch_request/1]).

-export_type([openapi_catalogs_vertical_batch_request/0]).

-type openapi_catalogs_vertical_batch_request() ::
  [ {'catalog_type', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_catalogs_items_request_language:openapi_catalogs_items_request_language() }
  | {'items', list(openapi_catalogs_creative_assets_batch_item:openapi_catalogs_creative_assets_batch_item()) }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_vertical_batch_request() ->
    openapi_catalogs_vertical_batch_request([]).

openapi_catalogs_vertical_batch_request(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_catalogs_items_request_language:openapi_catalogs_items_request_language() }
            , {'items', list(openapi_catalogs_creative_assets_batch_item:openapi_catalogs_creative_assets_batch_item(), 1, 1000) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

