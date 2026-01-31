-module(openapi_user_website_verify_request).

-include("openapi.hrl").

-export([openapi_user_website_verify_request/0]).

-export([openapi_user_website_verify_request/1]).

-export_type([openapi_user_website_verify_request/0]).

-type openapi_user_website_verify_request() ::
  [ {'verification_method', binary() }
  | {'website', binary() }
  ].


openapi_user_website_verify_request() ->
    openapi_user_website_verify_request([]).

openapi_user_website_verify_request(Fields) ->
  Default = [ {'verification_method', elements([<<"FILENAME">>, <<"METATAG">>, <<"DNSTXT">>]) }
            , {'website', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

