# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test LeadsExportApi")

api_instance <- LeadsExportApi$new()

test_that("LeadsExportCreate", {
  # tests for LeadsExportCreate
  # base path: https://api.pinterest.com/v5
  # Create a request to export leads collected from a lead ad
  # &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
  # @param ad_account_id character Unique identifier of an ad account.
  # @param leads_export_create_request LeadsExportCreateRequest 
  # @return [LeadsExportCreateResponse]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("LeadsExportGet", {
  # tests for LeadsExportGet
  # base path: https://api.pinterest.com/v5
  # Get the lead export from the lead export create call
  # &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
  # @param ad_account_id character Unique identifier of an ad account.
  # @param leads_export_id character lead_export_id token returned from the create a lead export endpoint
  # @return [LeadsExportResponseData]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})
