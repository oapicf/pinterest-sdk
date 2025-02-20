# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test BusinessMemberAssetsSummary")

model_instance <- BusinessMemberAssetsSummary$new()

test_that("ad_accounts", {
  # tests for the property `ad_accounts` (array[BusinessMemberAssetsSummaryAdAccountsInner])
  # List of ad account IDs and respective permission levels.

  # uncomment below to test the property
  #expect_equal(model.instance$`ad_accounts`, "EXPECTED_RESULT")
})

test_that("profiles", {
  # tests for the property `profiles` (array[BusinessMemberAssetsSummaryProfilesInner])
  # List of profile IDs and respective permission levels.

  # uncomment below to test the property
  #expect_equal(model.instance$`profiles`, "EXPECTED_RESULT")
})
