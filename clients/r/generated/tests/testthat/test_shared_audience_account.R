# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test SharedAudienceAccount")

model_instance <- SharedAudienceAccount$new()

test_that("account_id", {
  # tests for the property `account_id` (character)
  # Account ID (ad account or business ID).

  # uncomment below to test the property
  #expect_equal(model.instance$`account_id`, "EXPECTED_RESULT")
})

test_that("account_name", {
  # tests for the property `account_name` (character)
  # Account name.

  # uncomment below to test the property
  #expect_equal(model.instance$`account_name`, "EXPECTED_RESULT")
})

test_that("account_type", {
  # tests for the property `account_type` (character)
  # account type

  # uncomment below to test the property
  #expect_equal(model.instance$`account_type`, "EXPECTED_RESULT")
})

test_that("shared_on_timestamp", {
  # tests for the property `shared_on_timestamp` (integer)
  # Epoch timestamp in seconds for the shared audience event

  # uncomment below to test the property
  #expect_equal(model.instance$`shared_on_timestamp`, "EXPECTED_RESULT")
})
