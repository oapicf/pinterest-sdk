# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test UpdatePartnerAssetAccessBodyAccessesInner")

model_instance <- UpdatePartnerAssetAccessBodyAccessesInner$new()

test_that("partner_id", {
  # tests for the property `partner_id` (character)
  # Unique identifier of a business partner to update asset access to.

  # uncomment below to test the property
  #expect_equal(model.instance$`partner_id`, "EXPECTED_RESULT")
})

test_that("asset_id", {
  # tests for the property `asset_id` (character)
  # Unique identifier of the business asset.

  # uncomment below to test the property
  #expect_equal(model.instance$`asset_id`, "EXPECTED_RESULT")
})

test_that("permissions", {
  # tests for the property `permissions` (array[Permissions])
  # A non-empty array of permissions to assign to the partner.

  # uncomment below to test the property
  #expect_equal(model.instance$`permissions`, "EXPECTED_RESULT")
})
