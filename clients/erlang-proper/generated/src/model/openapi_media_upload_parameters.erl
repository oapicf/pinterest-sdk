-module(openapi_media_upload_parameters).

-include("openapi.hrl").

-export([openapi_media_upload_parameters/0]).

-export([openapi_media_upload_parameters/1]).

-export_type([openapi_media_upload_parameters/0]).

-type openapi_media_upload_parameters() ::
  [ {'Content_Type', binary() }
  | {'key', binary() }
  | {'policy', binary() }
  | {'x_amz_algorithm', binary() }
  | {'x_amz_credential', binary() }
  | {'x_amz_date', binary() }
  | {'x_amz_security_token', binary() }
  | {'x_amz_signature', binary() }
  ].


openapi_media_upload_parameters() ->
    openapi_media_upload_parameters([]).

openapi_media_upload_parameters(Fields) ->
  Default = [ {'Content-Type', binary() }
            , {'key', binary() }
            , {'policy', binary() }
            , {'x-amz-algorithm', binary() }
            , {'x-amz-credential', binary() }
            , {'x-amz-date', binary() }
            , {'x-amz-security-token', binary() }
            , {'x-amz-signature', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

