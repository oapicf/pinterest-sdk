-module(openapi_customer_list_create).

-include("openapi.hrl").

-export([openapi_customer_list_create/0]).

-export([openapi_customer_list_create/1]).

-export_type([openapi_customer_list_create/0]).

-type openapi_customer_list_create() ::
  [ {'is_nca', boolean() }
  | {'list_type', openapi_user_list_type:openapi_user_list_type() }
  | {'name', binary() }
  | {'records', binary() }
  | {'records_v2', list(openapi_customer_list_record_row:openapi_customer_list_record_row()) }
  ].


openapi_customer_list_create() ->
    openapi_customer_list_create([]).

openapi_customer_list_create(Fields) ->
  Default = [ {'is_nca', boolean() }
            , {'list_type', openapi_user_list_type:openapi_user_list_type() }
            , {'name', binary() }
            , {'records', binary() }
            , {'records_v2', list(openapi_customer_list_record_row:openapi_customer_list_record_row()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

