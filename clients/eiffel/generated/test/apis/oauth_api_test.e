note
    description: "API tests for OAUTH_API"
    date: "$Date$"
    revision: "$Revision$"


class OAUTH_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_oauth_conversion_token
            -- Generate OAuth access token for conversion API
            --
            -- Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
        local
            l_response: CONVERSION_ACCESS_TOKEN
        do
            -- TODO: Initialize required params.

            -- l_response := api.oauth_conversion_token
            assert ("not_implemented", False)
        end

    test_oauth_token
            -- Generate OAuth access token
            --
            -- Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
        local
            l_response: OAUTH_ACCESS_TOKEN
            l_grant_type: TOKEN_GRANT_TYPE
            l_code: STRING_32
            l_continuous_refresh: STRING_32
            l_redirect_uri: STRING_32
            l_refresh_token: STRING_32
            l_scope: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_grant_type

            -- l_response := api.oauth_token(l_grant_type, l_code, l_continuous_refresh, l_redirect_uri, l_refresh_token, l_scope)
            assert ("not_implemented", False)
        end

    test_token_revoke
            -- Revoke a token
            --
            -- Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
        local
            l_token: STRING_32
            l_token_type_hint: TOKEN_TYPE_HINT
        do
            -- TODO: Initialize required params.
            -- l_token

            -- api.token_revoke(l_token, l_token_type_hint)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: OAUTH_API
            -- Create an object instance of `OAUTH_API'.
        once
            create { OAUTH_API } Result
        end

end
