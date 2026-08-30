-module(openapi_targeting_template_update_request_read_or_update).

-include("openapi.hrl").

-export([openapi_targeting_template_update_request_read_or_update/0]).

-export([openapi_targeting_template_update_request_read_or_update/1]).

-export_type([openapi_targeting_template_update_request_read_or_update/0]).

-type openapi_targeting_template_update_request_read_or_update() ::
  [ {'id', binary() }
  | {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
  | {'targeting_attributes', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  ].


openapi_targeting_template_update_request_read_or_update() ->
    openapi_targeting_template_update_request_read_or_update([]).

openapi_targeting_template_update_request_read_or_update(Fields) ->
  Default = [ {'id', binary() }
            , {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
            , {'targeting_attributes', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

