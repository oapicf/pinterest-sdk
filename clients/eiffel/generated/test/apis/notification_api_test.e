note
    description: "API tests for NOTIFICATION_API"
    date: "$Date$"
    revision: "$Revision$"


class NOTIFICATION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_notification_post
            -- Receive notifications from external partners.
            --
            -- Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.
        local
            l_response: NOTIFICATION_RESPONSE
            l_notification_post_request: NOTIFICATION_POST_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_notification_post_request

            -- l_response := api.notification_post(l_notification_post_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: NOTIFICATION_API
            -- Create an object instance of `NOTIFICATION_API'.
        once
            create { NOTIFICATION_API } Result
        end

end
