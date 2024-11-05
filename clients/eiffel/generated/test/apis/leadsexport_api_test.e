note
    description: "API tests for LEADSEXPORT_API"
    date: "$Date$"
    revision: "$Revision$"


class LEADSEXPORT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_leads_export_create
            -- Create a request to export leads collected from a lead ad
            --
            -- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
        local
            l_response: LEADS_EXPORT_CREATE_RESPONSE
            l_ad_account_id: STRING_32
            l_leads_export_create_request: LEADS_EXPORT_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_leads_export_create_request

            -- l_response := api.leads_export_create(l_ad_account_id, l_leads_export_create_request)
            assert ("not_implemented", False)
        end

    test_leads_export_get
            -- Get the lead export from the lead export create call
            --
            -- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
        local
            l_response: LEADS_EXPORT_RESPONSE_DATA
            l_ad_account_id: STRING_32
            l_leads_export_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_leads_export_id

            -- l_response := api.leads_export_get(l_ad_account_id, l_leads_export_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LEADSEXPORT_API
            -- Create an object instance of `LEADSEXPORT_API'.
        once
            create { LEADSEXPORT_API } Result
        end

end
