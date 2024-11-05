-module(openapi_shared_audience_response_common).

-export([encode/1]).

-export_type([openapi_shared_audience_response_common/0]).

-type openapi_shared_audience_response_common() ::
    #{ 'audience_id' => binary(),
       'permissions' => list()
     }.

encode(#{ 'audience_id' := AudienceId,
          'permissions' := Permissions
        }) ->
    #{ 'audience_id' => AudienceId,
       'permissions' => Permissions
     }.
