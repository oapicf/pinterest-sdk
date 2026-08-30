-module(openapi_conversion_deletion_request_targets).

-export([encode/1]).

-export_type([openapi_conversion_deletion_request_targets/0]).

-type openapi_conversion_deletion_request_targets() ::
    #{ 'user_emails' := list(),
       'epiks' := list()
     }.

encode(#{ 'user_emails' := UserEmails,
          'epiks' := Epiks
        }) ->
    #{ 'user_emails' => UserEmails,
       'epiks' => Epiks
     }.
