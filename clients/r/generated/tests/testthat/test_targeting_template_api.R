# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test TargetingTemplateApi")

api_instance <- TargetingTemplateApi$new()

test_that("TargetingTemplateCreate", {
  # tests for TargetingTemplateCreate
  # base path: https://api.pinterest.com/v5
  # Create targeting templates
  # &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
  # @param ad_account_id character Unique identifier of an ad account.
  # @param targeting_template_create TargetingTemplateCreate targeting template creation entity
  # @return [TargetingTemplateGetResponseData]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("TargetingTemplateList", {
  # tests for TargetingTemplateList
  # base path: https://api.pinterest.com/v5
  # List targeting templates
  # Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
  # @param ad_account_id character Unique identifier of an ad account.
  # @param order character The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  # @param include_sizing character Include audience sizing in result or not (optional)
  # @param search_query character Search keyword for targeting templates (optional)
  # @param page_size integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
  # @param bookmark character Cursor used to fetch the next page of items (optional)
  # @return [TargetingTemplateList200Response]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("TargetingTemplateUpdate", {
  # tests for TargetingTemplateUpdate
  # base path: https://api.pinterest.com/v5
  # Update targeting templates
  # &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
  # @param ad_account_id character Unique identifier of an ad account.
  # @param targeting_template_update_request TargetingTemplateUpdateRequest Operation type and targeting template ID
  # @return [Void]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})
