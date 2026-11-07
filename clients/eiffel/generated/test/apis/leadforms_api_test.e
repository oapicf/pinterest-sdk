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
            -- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
        local
            l_response: LEAD_FORM
            l_lead_form_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_lead_form_id
            -- l_ad_account_id

            -- l_response := api.lead_form_get(l_lead_form_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_lead_form_test_create
            -- Create lead form test data
            --
            -- Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
        local
            l_response: LEAD_FORM_TEST
            l_ad_account_id: STRING_32
            l_lead_form_id: STRING_32
            l_lead_form_test_create: LEAD_FORM_TEST_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_lead_form_id
            -- l_lead_form_test_create

            -- l_response := api.lead_form_test_create(l_ad_account_id, l_lead_form_id, l_lead_form_test_create)
            assert ("not_implemented", False)
        end

    test_lead_forms_create
            -- Create lead forms
            --
            -- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
        local
            l_response: LEAD_FORMS_CREATE_200_RESPONSE
            l_ad_account_id: STRING_32
            l_lead_form_create: LIST [LEAD_FORM_CREATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [LEAD_FORM_CREATE]} l_lead_form_create.make (2)

            -- l_response := api.lead_forms_create(l_ad_account_id, l_lead_form_create)
            assert ("not_implemented", False)
        end

    test_lead_forms_list
            -- List lead forms
            --
            -- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
        local
            l_response: LEAD_FORMS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.lead_forms_list(l_ad_account_id, l_bookmark, l_page_size, l_order)
            assert ("not_implemented", False)
        end

    test_lead_forms_update
            -- Update lead forms
            --
            -- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
        local
            l_response: LEAD_FORMS_CREATE_200_RESPONSE
            l_ad_account_id: STRING_32
            l_lead_form_batch_update: LIST [LEAD_FORM_BATCH_UPDATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [LEAD_FORM_BATCH_UPDATE]} l_lead_form_batch_update.make (2)

            -- l_response := api.lead_forms_update(l_ad_account_id, l_lead_form_batch_update)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LEADFORMS_API
            -- Create an object instance of `LEADFORMS_API'.
        once
            create { LEADFORMS_API } Result
        end

end
