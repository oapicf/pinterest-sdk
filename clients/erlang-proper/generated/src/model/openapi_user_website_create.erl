-module(openapi_user_website_create).

-include("openapi.hrl").

-export([openapi_user_website_create/0]).

-export([openapi_user_website_create/1]).

-export_type([openapi_user_website_create/0]).

-type openapi_user_website_create() ::
  [ {'verification_method', openapi_website_verification_method:openapi_website_verification_method() }
  | {'website', binary() }
  ].


openapi_user_website_create() ->
    openapi_user_website_create([]).

openapi_user_website_create(Fields) ->
  Default = [ {'verification_method', openapi_website_verification_method:openapi_website_verification_method() }
            , {'website', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

