# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test TargetingTypeFilter")

model_instance <- TargetingTypeFilter$new()

test_that("targeting_types", {
  # tests for the property `targeting_types` (array[AdsAnalyticsTargetingType])
  # List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.

  # uncomment below to test the property
  #expect_equal(model.instance$`targeting_types`, "EXPECTED_RESULT")
})
