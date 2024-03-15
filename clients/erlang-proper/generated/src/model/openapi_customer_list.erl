-module(openapi_customer_list).

-include("openapi.hrl").

-export([openapi_customer_list/0]).

-export([openapi_customer_list/1]).

-export_type([openapi_customer_list/0]).

-type openapi_customer_list() ::
  [ {'ad_account_id', binary() }
  | {'created_time', integer() }
  | {'id', binary() }
  | {'name', binary() }
  | {'num_batches', integer() }
  | {'num_removed_user_records', integer() }
  | {'num_uploaded_user_records', integer() }
  | {'status', binary() }
  | {'type', binary() }
  | {'updated_time', integer() }
  | {'exceptions', map() }
  ].


openapi_customer_list() ->
    openapi_customer_list([]).

openapi_customer_list(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'created_time', integer() }
            , {'id', binary() }
            , {'name', binary() }
            , {'num_batches', integer() }
            , {'num_removed_user_records', integer() }
            , {'num_uploaded_user_records', integer() }
            , {'status', elements([<<"PROCESSING">>, <<"READY">>, <<"TOO_SMALL">>, <<"UPLOADING">>]) }
            , {'type', binary() }
            , {'updated_time', integer() }
            , {'exceptions', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

