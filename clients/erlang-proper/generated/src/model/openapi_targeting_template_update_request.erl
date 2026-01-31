-module(openapi_targeting_template_update_request).

-include("openapi.hrl").

-export([openapi_targeting_template_update_request/0]).

-export([openapi_targeting_template_update_request/1]).

-export_type([openapi_targeting_template_update_request/0]).

-type openapi_targeting_template_update_request() ::
  [ {'id', binary() }
  | {'operation_type', binary() }
  | {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
  ].


openapi_targeting_template_update_request() ->
    openapi_targeting_template_update_request([]).

openapi_targeting_template_update_request(Fields) ->
  Default = [ {'id', binary() }
            , {'operation_type', elements([<<"REMOVE">>, <<"UPDATE">>]) }
            , {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

