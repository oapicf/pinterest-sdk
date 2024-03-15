note
    description: "API tests for LEADFORMS_API"
    date: "$Date$"
    revision: "$Revision$"


class LEADFORMS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_lead_form_get
            -- Get lead form by id
            --
            -- Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: LEAD_FORM_RESPONSE
            l_ad_account_id: STRING_32
            l_lead_form_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_lead_form_id

            -- l_response := api.lead_form_get(l_ad_account_id, l_lead_form_id)
            assert ("not_implemented", False)
        end

    test_lead_form_test_create
            -- Create lead form test data
            --
            -- Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
        local
            l_response: LEAD_FORM_TEST_RESPONSE
            l_ad_account_id: STRING_32
            l_lead_form_id: STRING_32
            l_lead_form_test_request: LEAD_FORM_TEST_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_lead_form_id
            -- l_lead_form_test_request

            -- l_response := api.lead_form_test_create(l_ad_account_id, l_lead_form_id, l_lead_form_test_request)
            assert ("not_implemented", False)
        end

    test_lead_forms_list
            -- Get lead forms
            --
            -- Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: LEAD_FORMS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.lead_forms_list(l_ad_account_id, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LEADFORMS_API
            -- Create an object instance of `LEADFORMS_API'.
        once
            create { LEADFORMS_API } Result
        end

end
