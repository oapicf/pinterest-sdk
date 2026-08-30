-module(openapi_customer_segment_update_request_update_with_required_body).

-include("openapi.hrl").

-export([openapi_customer_segment_update_request_update_with_required_body/0]).

-export([openapi_customer_segment_update_request_update_with_required_body/1]).

-export_type([openapi_customer_segment_update_request_update_with_required_body/0]).

-type openapi_customer_segment_update_request_update_with_required_body() ::
  [ {'audience_ids', list(binary()) }
  | {'id', binary() }
  | {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
  ].


openapi_customer_segment_update_request_update_with_required_body() ->
    openapi_customer_segment_update_request_update_with_required_body([]).

openapi_customer_segment_update_request_update_with_required_body(Fields) ->
  Default = [ {'audience_ids', list(binary()) }
            , {'id', binary() }
            , {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

