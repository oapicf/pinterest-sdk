-module(openapi_notification_post_request).

-include("openapi.hrl").

-export([openapi_notification_post_request/0]).

-export([openapi_notification_post_request/1]).

-export_type([openapi_notification_post_request/0]).

-type openapi_notification_post_request() ::
  [ 
  ].


openapi_notification_post_request() ->
    openapi_notification_post_request([]).

openapi_notification_post_request(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

