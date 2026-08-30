-module(openapi_ad_update_request_all_of1).

-include("openapi.hrl").

-export([openapi_ad_update_request_all_of1/0]).

-export([openapi_ad_update_request_all_of1/1]).

-export_type([openapi_ad_update_request_all_of1/0]).

-type openapi_ad_update_request_all_of1() ::
  [ {'id', binary() }
  | {'pin_id', binary() }
  ].


openapi_ad_update_request_all_of1() ->
    openapi_ad_update_request_all_of1([]).

openapi_ad_update_request_all_of1(Fields) ->
  Default = [ {'id', binary() }
            , {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

