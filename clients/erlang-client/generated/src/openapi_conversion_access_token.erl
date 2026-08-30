-module(openapi_conversion_access_token).

-export([encode/1]).

-export_type([openapi_conversion_access_token/0]).

-type openapi_conversion_access_token() ::
    #{ 'access_token' := binary(),
       'token_type' => binary()
     }.

encode(#{ 'access_token' := AccessToken,
          'token_type' := TokenType
        }) ->
    #{ 'access_token' => AccessToken,
       'token_type' => TokenType
     }.
