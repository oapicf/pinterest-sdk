-module(openapi_conversion_deletion_request_user_email_targets).

-export([encode/1]).

-export_type([openapi_conversion_deletion_request_user_email_targets/0]).

-type openapi_conversion_deletion_request_user_email_targets() ::
    #{ 'user_emails' := list()
     }.

encode(#{ 'user_emails' := UserEmails
        }) ->
    #{ 'user_emails' => UserEmails
     }.
