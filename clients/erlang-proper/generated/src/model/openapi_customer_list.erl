-module(openapi_customer_list).

-include("openapi.hrl").

-export([openapi_customer_list/0]).

-export([openapi_customer_list/1]).

-export_type([openapi_customer_list/0]).

-type openapi_customer_list() ::
  [ {'ad_account_id', binary() }
  | {'created_time', integer() }
  | {'exceptions', map() }
  | {'id', binary() }
  | {'is_nca', boolean() }
  | {'name', binary() }
  | {'num_batches', integer() }
  | {'num_removed_user_records', integer() }
  | {'num_uploaded_user_records', integer() }
  | {'status', openapi_customer_list_status:openapi_customer_list_status() }
  | {'type', binary() }
  | {'updated_time', integer() }
  ].


openapi_customer_list() ->
    openapi_customer_list([]).

openapi_customer_list(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'created_time', integer() }
            , {'exceptions', map() }
            , {'id', binary() }
            , {'is_nca', boolean() }
            , {'name', binary() }
            , {'num_batches', integer() }
            , {'num_removed_user_records', integer() }
            , {'num_uploaded_user_records', integer() }
            , {'status', openapi_customer_list_status:openapi_customer_list_status() }
            , {'type', binary() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

