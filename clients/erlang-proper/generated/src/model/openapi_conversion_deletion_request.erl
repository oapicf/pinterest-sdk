-module(openapi_conversion_deletion_request).

-include("openapi.hrl").

-export([openapi_conversion_deletion_request/0]).

-export([openapi_conversion_deletion_request/1]).

-export_type([openapi_conversion_deletion_request/0]).

-type openapi_conversion_deletion_request() ::
  [ {'created_time', date() }
  | {'processed_time', date() }
  | {'request_id', binary() }
  | {'status', openapi_conversion_deletion_request_status:openapi_conversion_deletion_request_status() }
  ].


openapi_conversion_deletion_request() ->
    openapi_conversion_deletion_request([]).

openapi_conversion_deletion_request(Fields) ->
  Default = [ {'created_time', date() }
            , {'processed_time', date() }
            , {'request_id', binary() }
            , {'status', openapi_conversion_deletion_request_status:openapi_conversion_deletion_request_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

