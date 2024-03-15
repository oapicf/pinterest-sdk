-module(openapi_user_website_verification_code).

-include("openapi.hrl").

-export([openapi_user_website_verification_code/0]).

-export([openapi_user_website_verification_code/1]).

-export_type([openapi_user_website_verification_code/0]).

-type openapi_user_website_verification_code() ::
  [ {'verification_code', binary() }
  | {'dns_txt_record', binary() }
  | {'metatag', binary() }
  | {'filename', binary() }
  | {'file_content', binary() }
  ].


openapi_user_website_verification_code() ->
    openapi_user_website_verification_code([]).

openapi_user_website_verification_code(Fields) ->
  Default = [ {'verification_code', binary() }
            , {'dns_txt_record', binary() }
            , {'metatag', binary() }
            , {'filename', binary() }
            , {'file_content', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

