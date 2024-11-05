note
    description: "API tests for OAUTH_API"
    date: "$Date$"
    revision: "$Revision$"


class OAUTH_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_oauth_token
            -- Generate OAuth access token
            --
            -- Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication-and-scopes/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  &lt;strong&gt;Grant type &lt;i&gt;client_credentials&lt;/i&gt; and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.&lt;/strong&gt;
        local
            l_response: OAUTH_ACCESS_TOKEN_RESPONSE
            l_grant_type: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_grant_type

            -- l_response := api.oauth_token(l_grant_type)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: OAUTH_API
            -- Create an object instance of `OAUTH_API'.
        once
            create { OAUTH_API } Result
        end

end
