-module(openapi_s3_file_part).

-include("openapi.hrl").

-export([openapi_s3_file_part/0]).

-export([openapi_s3_file_part/1]).

-export_type([openapi_s3_file_part/0]).

-type openapi_s3_file_part() ::
  [ {'part_number', integer() }
  | {'presigned_url', binary() }
  ].


openapi_s3_file_part() ->
    openapi_s3_file_part([]).

openapi_s3_file_part(Fields) ->
  Default = [ {'part_number', integer() }
            , {'presigned_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

