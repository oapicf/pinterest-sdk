# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test DeletePartnerAssetAccessBodyAccessesInner")

model_instance <- DeletePartnerAssetAccessBodyAccessesInner$new()

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

test_that("partner_type", {
  # tests for the property `partner_type` (character)
  # If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.

  # uncomment below to test the property
  #expect_equal(model.instance$`partner_type`, "EXPECTED_RESULT")
})
