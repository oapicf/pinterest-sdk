-module(openapi_targeting_template_update_request).

-include("openapi.hrl").

-export([openapi_targeting_template_update_request/0]).

-export([openapi_targeting_template_update_request/1]).

-export_type([openapi_targeting_template_update_request/0]).

-type openapi_targeting_template_update_request() ::
  [ {'operation_type', binary() }
  | {'id', binary() }
  ].


openapi_targeting_template_update_request() ->
    openapi_targeting_template_update_request([]).

openapi_targeting_template_update_request(Fields) ->
  Default = [ {'operation_type', elements([<<"REMOVE">>]) }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

