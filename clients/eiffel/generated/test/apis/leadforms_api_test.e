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
            -- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
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
            -- Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
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

    test_lead_forms_create
            -- Create lead forms
            --
            -- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
        local
            l_response: LEAD_FORM_ARRAY_RESPONSE
            l_ad_account_id: STRING_32
            l_lead_form_create_request: LIST [LEAD_FORM_CREATE_REQUEST]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [LEAD_FORM_CREATE_REQUEST]} l_lead_form_create_request.make (2)

            -- l_response := api.lead_forms_create(l_ad_account_id, l_lead_form_create_request)
            assert ("not_implemented", False)
        end

    test_lead_forms_list
            -- List lead forms
            --
            -- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
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

    test_lead_forms_update
            -- Update lead forms
            --
            -- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
        local
            l_response: LEAD_FORM_ARRAY_RESPONSE
            l_ad_account_id: STRING_32
            l_lead_form_update_request: LIST [LEAD_FORM_UPDATE_REQUEST]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [LEAD_FORM_UPDATE_REQUEST]} l_lead_form_update_request.make (2)

            -- l_response := api.lead_forms_update(l_ad_account_id, l_lead_form_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LEADFORMS_API
            -- Create an object instance of `LEADFORMS_API'.
        once
            create { LEADFORMS_API } Result
        end

end
