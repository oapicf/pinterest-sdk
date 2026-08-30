-module(openapi_conversion_deletion_request_create).

-include("openapi.hrl").

-export([openapi_conversion_deletion_request_create/0]).

-export([openapi_conversion_deletion_request_create/1]).

-export_type([openapi_conversion_deletion_request_create/0]).

-type openapi_conversion_deletion_request_create() ::
  [ {'deletion_targets', openapi_conversion_deletion_request_targets:openapi_conversion_deletion_request_targets() }
  ].


openapi_conversion_deletion_request_create() ->
    openapi_conversion_deletion_request_create([]).

openapi_conversion_deletion_request_create(Fields) ->
  Default = [ {'deletion_targets', openapi_conversion_deletion_request_targets:openapi_conversion_deletion_request_targets() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

