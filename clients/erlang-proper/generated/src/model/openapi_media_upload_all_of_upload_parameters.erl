-module(openapi_media_upload_all_of_upload_parameters).

-include("openapi.hrl").

-export([openapi_media_upload_all_of_upload_parameters/0]).

-export([openapi_media_upload_all_of_upload_parameters/1]).

-export_type([openapi_media_upload_all_of_upload_parameters/0]).

-type openapi_media_upload_all_of_upload_parameters() ::
  [ {'x_amz_date', binary() }
  | {'x_amz_signature', binary() }
  | {'x_amz_security_token', binary() }
  | {'x_amz_algorithm', binary() }
  | {'key', binary() }
  | {'policy', binary() }
  | {'x_amz_credential', binary() }
  | {'Content_Type', binary() }
  ].


openapi_media_upload_all_of_upload_parameters() ->
    openapi_media_upload_all_of_upload_parameters([]).

openapi_media_upload_all_of_upload_parameters(Fields) ->
  Default = [ {'x-amz-date', binary() }
            , {'x-amz-signature', binary() }
            , {'x-amz-security-token', binary() }
            , {'x-amz-algorithm', binary() }
            , {'key', binary() }
            , {'policy', binary() }
            , {'x-amz-credential', binary() }
            , {'Content-Type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

