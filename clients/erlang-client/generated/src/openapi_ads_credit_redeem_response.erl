-module(openapi_ads_credit_redeem_response).

-export([encode/1]).

-export_type([openapi_ads_credit_redeem_response/0]).

-type openapi_ads_credit_redeem_response() ::
    #{ 'errorCode' => integer(),
       'errorMessage' => binary(),
       'success' => boolean()
     }.

encode(#{ 'errorCode' := ErrorCode,
          'errorMessage' := ErrorMessage,
          'success' := Success
        }) ->
    #{ 'errorCode' => ErrorCode,
       'errorMessage' => ErrorMessage,
       'success' => Success
     }.
