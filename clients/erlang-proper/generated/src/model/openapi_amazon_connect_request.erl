-module(openapi_amazon_connect_request).

-include("openapi.hrl").

-export([openapi_amazon_connect_request/0]).

-export([openapi_amazon_connect_request/1]).

-export_type([openapi_amazon_connect_request/0]).

-type openapi_amazon_connect_request() ::
  [ {'amazon_storefront_id', binary() }
  | {'amazon_storefront_name', binary() }
  | {'amazon_storefront_url', binary() }
  | {'amazon_user_id', binary() }
  | {'is_amazon_account_linked', boolean() }
  | {'one_time_passcode', binary() }
  | {'pinterest_user_id', binary() }
  ].


openapi_amazon_connect_request() ->
    openapi_amazon_connect_request([]).

openapi_amazon_connect_request(Fields) ->
  Default = [ {'amazon_storefront_id', binary() }
            , {'amazon_storefront_name', binary() }
            , {'amazon_storefront_url', binary() }
            , {'amazon_user_id', binary() }
            , {'is_amazon_account_linked', boolean() }
            , {'one_time_passcode', binary() }
            , {'pinterest_user_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

