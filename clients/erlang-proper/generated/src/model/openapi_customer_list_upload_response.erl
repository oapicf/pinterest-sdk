-module(openapi_customer_list_upload_response).

-include("openapi.hrl").

-export([openapi_customer_list_upload_response/0]).

-export([openapi_customer_list_upload_response/1]).

-export_type([openapi_customer_list_upload_response/0]).

-type openapi_customer_list_upload_response() ::
  [ {'ad_account_id', binary() }
  | {'creation_time', integer() }
  | {'customer_list_id', binary() }
  | {'error_counts', list(openapi_error_detail:openapi_error_detail()) }
  | {'id', binary() }
  | {'operation', openapi_user_list_operation_type:openapi_user_list_operation_type() }
  | {'record_counts', openapi_record_counts:openapi_record_counts() }
  | {'state', binary() }
  | {'updated_time', integer() }
  ].


openapi_customer_list_upload_response() ->
    openapi_customer_list_upload_response([]).

openapi_customer_list_upload_response(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'creation_time', integer() }
            , {'customer_list_id', binary() }
            , {'error_counts', list(openapi_error_detail:openapi_error_detail()) }
            , {'id', binary() }
            , {'operation', openapi_user_list_operation_type:openapi_user_list_operation_type() }
            , {'record_counts', openapi_record_counts:openapi_record_counts() }
            , {'state', elements([<<"NOT_STARTED">>, <<"RUNNING">>, <<"PAUSED">>, <<"SUCCEEDED">>, <<"FAILED">>]) }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

