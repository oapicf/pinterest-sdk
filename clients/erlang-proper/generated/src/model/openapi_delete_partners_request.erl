-module(openapi_delete_partners_request).

-include("openapi.hrl").

-export([openapi_delete_partners_request/0]).

-export([openapi_delete_partners_request/1]).

-export_type([openapi_delete_partners_request/0]).

-type openapi_delete_partners_request() ::
  [ {'partner_ids', list(binary()) }
  | {'partner_type', binary() }
  ].


openapi_delete_partners_request() ->
    openapi_delete_partners_request([]).

openapi_delete_partners_request(Fields) ->
  Default = [ {'partner_ids', list(binary(), 1, 50) }
            , {'partner_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

