-module(openapi_conversion_deletion_request_user_email_targets).

-include("openapi.hrl").

-export([openapi_conversion_deletion_request_user_email_targets/0]).

-export([openapi_conversion_deletion_request_user_email_targets/1]).

-export_type([openapi_conversion_deletion_request_user_email_targets/0]).

-type openapi_conversion_deletion_request_user_email_targets() ::
  [ {'user_emails', list(binary()) }
  ].


openapi_conversion_deletion_request_user_email_targets() ->
    openapi_conversion_deletion_request_user_email_targets([]).

openapi_conversion_deletion_request_user_email_targets(Fields) ->
  Default = [ {'user_emails', list(binary(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

