-module(openapi_customer_list_upload).

-include("openapi.hrl").

-export([openapi_customer_list_upload/0]).

-export([openapi_customer_list_upload/1]).

-export_type([openapi_customer_list_upload/0]).

-type openapi_customer_list_upload() ::
  [ {'ad_account_id', binary() }
  | {'creation_time', integer() }
  | {'customer_list_id', binary() }
  | {'error_counts', list(openapi_error_detail:openapi_error_detail()) }
  | {'id', binary() }
  | {'operation', openapi_user_list_operation_type:openapi_user_list_operation_type() }
  | {'record_counts', openapi_record_counts:openapi_record_counts() }
  | {'state', openapi_workload_state:openapi_workload_state() }
  | {'updated_time', integer() }
  ].


openapi_customer_list_upload() ->
    openapi_customer_list_upload([]).

openapi_customer_list_upload(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'creation_time', integer() }
            , {'customer_list_id', binary() }
            , {'error_counts', list(openapi_error_detail:openapi_error_detail()) }
            , {'id', binary() }
            , {'operation', openapi_user_list_operation_type:openapi_user_list_operation_type() }
            , {'record_counts', openapi_record_counts:openapi_record_counts() }
            , {'state', openapi_workload_state:openapi_workload_state() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

