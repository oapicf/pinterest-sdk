-module(openapi_user_website_verify_request).

-include("openapi.hrl").

-export([openapi_user_website_verify_request/0]).

-export([openapi_user_website_verify_request/1]).

-export_type([openapi_user_website_verify_request/0]).

-type openapi_user_website_verify_request() ::
  [ {'website', binary() }
  | {'verification_method', binary() }
  ].


openapi_user_website_verify_request() ->
    openapi_user_website_verify_request([]).

openapi_user_website_verify_request(Fields) ->
  Default = [ {'website', binary() }
            , {'verification_method', elements([<<"FILENAME">>, <<"METATAG">>, <<"DNSTXT">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

