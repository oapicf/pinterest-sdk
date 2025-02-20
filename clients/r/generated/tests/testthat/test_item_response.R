# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test ItemResponse")

model_instance <- ItemResponse$new()

test_that("catalog_type", {
  # tests for the property `catalog_type` (CatalogsType)

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_type`, "EXPECTED_RESULT")
})

test_that("item_id", {
  # tests for the property `item_id` (character)
  # The catalog item id in the merchant namespace

  # uncomment below to test the property
  #expect_equal(model.instance$`item_id`, "EXPECTED_RESULT")
})

test_that("pins", {
  # tests for the property `pins` (array[Pin])
  # The pins mapped to the item

  # uncomment below to test the property
  #expect_equal(model.instance$`pins`, "EXPECTED_RESULT")
})

test_that("attributes", {
  # tests for the property `attributes` (CatalogsCreativeAssetsAttributes)

  # uncomment below to test the property
  #expect_equal(model.instance$`attributes`, "EXPECTED_RESULT")
})

test_that("hotel_id", {
  # tests for the property `hotel_id` (character)
  # The catalog hotel id in the merchant namespace

  # uncomment below to test the property
  #expect_equal(model.instance$`hotel_id`, "EXPECTED_RESULT")
})

test_that("creative_assets_id", {
  # tests for the property `creative_assets_id` (character)
  # The catalog creative assets id in the merchant namespace

  # uncomment below to test the property
  #expect_equal(model.instance$`creative_assets_id`, "EXPECTED_RESULT")
})

test_that("errors", {
  # tests for the property `errors` (array[ItemValidationEvent])
  # Array with the errors for the item id requested

  # uncomment below to test the property
  #expect_equal(model.instance$`errors`, "EXPECTED_RESULT")
})
