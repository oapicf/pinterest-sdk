-module(openapi_user_website_verification).

-include("openapi.hrl").

-export([openapi_user_website_verification/0]).

-export([openapi_user_website_verification/1]).

-export_type([openapi_user_website_verification/0]).

-type openapi_user_website_verification() ::
  [ {'dns_txt_record', binary() }
  | {'file_content', binary() }
  | {'filename', binary() }
  | {'metatag', binary() }
  | {'verification_code', binary() }
  ].


openapi_user_website_verification() ->
    openapi_user_website_verification([]).

openapi_user_website_verification(Fields) ->
  Default = [ {'dns_txt_record', binary() }
            , {'file_content', binary() }
            , {'filename', binary() }
            , {'metatag', binary() }
            , {'verification_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

