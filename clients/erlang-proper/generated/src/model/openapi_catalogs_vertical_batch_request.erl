-module(openapi_catalogs_vertical_batch_request).

-include("openapi.hrl").

-export([openapi_catalogs_vertical_batch_request/0]).

-export([openapi_catalogs_vertical_batch_request/1]).

-export_type([openapi_catalogs_vertical_batch_request/0]).

-type openapi_catalogs_vertical_batch_request() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_language:openapi_language() }
  | {'items', list(openapi_catalogs_hotel_batch_item:openapi_catalogs_hotel_batch_item()) }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_vertical_batch_request() ->
    openapi_catalogs_vertical_batch_request([]).

openapi_catalogs_vertical_batch_request(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_language:openapi_language() }
            , {'items', list(openapi_catalogs_hotel_batch_item:openapi_catalogs_hotel_batch_item(), 1, 1000) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

