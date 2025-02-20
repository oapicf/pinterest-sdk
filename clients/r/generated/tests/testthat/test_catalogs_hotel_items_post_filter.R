# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CatalogsHotelItemsPostFilter")

model_instance <- CatalogsHotelItemsPostFilter$new()

test_that("catalog_type", {
  # tests for the property `catalog_type` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_type`, "EXPECTED_RESULT")
})

test_that("hotel_ids", {
  # tests for the property `hotel_ids` (array[character])

  # uncomment below to test the property
  #expect_equal(model.instance$`hotel_ids`, "EXPECTED_RESULT")
})

test_that("catalog_id", {
  # tests for the property `catalog_id` (character)
  # Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_id`, "EXPECTED_RESULT")
})
