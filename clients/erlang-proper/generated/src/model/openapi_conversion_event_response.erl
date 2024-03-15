-module(openapi_conversion_event_response).

-include("openapi.hrl").

-export([openapi_conversion_event_response/0]).

-export([openapi_conversion_event_response/1]).

-export_type([openapi_conversion_event_response/0]).

-type openapi_conversion_event_response() ::
  [ {'conversion_event', openapi_conversion_tag_type:openapi_conversion_tag_type() }
  | {'conversion_tag_id', binary() }
  | {'ad_account_id', binary() }
  | {'created_time', integer() }
  ].


openapi_conversion_event_response() ->
    openapi_conversion_event_response([]).

openapi_conversion_event_response(Fields) ->
  Default = [ {'conversion_event', binary() }
            , {'conversion_tag_id', binary() }
            , {'ad_account_id', binary() }
            , {'created_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

