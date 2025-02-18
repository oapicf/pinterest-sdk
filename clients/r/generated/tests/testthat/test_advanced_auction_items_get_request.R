# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test AdvancedAuctionItemsGetRequest")

model_instance <- AdvancedAuctionItemsGetRequest$new()

test_that("catalog_id", {
  # tests for the property `catalog_id` (character)
  # Catalog id pertaining to the retail item

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_id`, "EXPECTED_RESULT")
})

test_that("items", {
  # tests for the property `items` (array[AdvancedAuctionItemsGetRecord])
  # A list of retail catalog items to fetch bid options for

  # uncomment below to test the property
  #expect_equal(model.instance$`items`, "EXPECTED_RESULT")
})
