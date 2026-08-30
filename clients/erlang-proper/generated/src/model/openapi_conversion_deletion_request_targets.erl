-module(openapi_conversion_deletion_request_targets).

-include("openapi.hrl").

-export([openapi_conversion_deletion_request_targets/0]).

-export([openapi_conversion_deletion_request_targets/1]).

-export_type([openapi_conversion_deletion_request_targets/0]).

-type openapi_conversion_deletion_request_targets() ::
  [ {'user_emails', list(binary()) }
  | {'epiks', list(binary()) }
  ].


openapi_conversion_deletion_request_targets() ->
    openapi_conversion_deletion_request_targets([]).

openapi_conversion_deletion_request_targets(Fields) ->
  Default = [ {'user_emails', list(binary(), 1) }
            , {'epiks', list(binary(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

