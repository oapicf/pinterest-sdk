-module(openapi_customer_list_record_row).

-include("openapi.hrl").

-export([openapi_customer_list_record_row/0]).

-export([openapi_customer_list_record_row/1]).

-export_type([openapi_customer_list_record_row/0]).

-type openapi_customer_list_record_row() ::
  [ {'email', binary() }
  | {'external_id', binary() }
  | {'hashed_phone_number', binary() }
  | {'hashed_pinner_id', binary() }
  | {'ip_address', binary() }
  | {'liveramp_envelope', binary() }
  | {'maid', binary() }
  | {'user_agent', binary() }
  ].


openapi_customer_list_record_row() ->
    openapi_customer_list_record_row([]).

openapi_customer_list_record_row(Fields) ->
  Default = [ {'email', binary() }
            , {'external_id', binary() }
            , {'hashed_phone_number', binary() }
            , {'hashed_pinner_id', binary() }
            , {'ip_address', binary() }
            , {'liveramp_envelope', binary() }
            , {'maid', binary() }
            , {'user_agent', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

