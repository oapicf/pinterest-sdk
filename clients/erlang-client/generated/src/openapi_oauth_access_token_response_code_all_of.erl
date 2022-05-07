-module(openapi_oauth_access_token_response_code_all_of).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response_code_all_of/0]).

-type openapi_oauth_access_token_response_code_all_of() ::
    #{ 'refresh_token' := binary(),
       'refresh_token_expires_in' := integer()
     }.

encode(#{ 'refresh_token' := RefreshToken,
          'refresh_token_expires_in' := RefreshTokenExpiresIn
        }) ->
    #{ 'refresh_token' => RefreshToken,
       'refresh_token_expires_in' => RefreshTokenExpiresIn
     }.
