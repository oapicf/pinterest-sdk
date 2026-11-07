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
            -- **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
        local
            l_response: LEADS_EXPORTS
            l_ad_account_id: STRING_32
            l_leads_exports_create: LEADS_EXPORTS_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_leads_exports_create

            -- l_response := api.leads_export_create(l_ad_account_id, l_leads_exports_create)
            assert ("not_implemented", False)
        end

    test_leads_export_get
            -- Get the lead export from the lead export create call
            --
            -- **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
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
