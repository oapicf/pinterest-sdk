-module(openapi_conversion_deletion_request_epik_targets).

-include("openapi.hrl").

-export([openapi_conversion_deletion_request_epik_targets/0]).

-export([openapi_conversion_deletion_request_epik_targets/1]).

-export_type([openapi_conversion_deletion_request_epik_targets/0]).

-type openapi_conversion_deletion_request_epik_targets() ::
  [ {'epiks', list(binary()) }
  ].


openapi_conversion_deletion_request_epik_targets() ->
    openapi_conversion_deletion_request_epik_targets([]).

openapi_conversion_deletion_request_epik_targets(Fields) ->
  Default = [ {'epiks', list(binary(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

