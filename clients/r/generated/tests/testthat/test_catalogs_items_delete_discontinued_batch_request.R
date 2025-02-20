# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CatalogsItemsDeleteDiscontinuedBatchRequest")

model_instance <- CatalogsItemsDeleteDiscontinuedBatchRequest$new()

test_that("country", {
  # tests for the property `country` (Country)

  # uncomment below to test the property
  #expect_equal(model.instance$`country`, "EXPECTED_RESULT")
})

test_that("language", {
  # tests for the property `language` (CatalogsItemsRequestLanguage)

  # uncomment below to test the property
  #expect_equal(model.instance$`language`, "EXPECTED_RESULT")
})

test_that("operation", {
  # tests for the property `operation` (BatchOperation)

  # uncomment below to test the property
  #expect_equal(model.instance$`operation`, "EXPECTED_RESULT")
})

test_that("items", {
  # tests for the property `items` (array[ItemDeleteDiscontinuedBatchRecord])
  # Array with catalogs items

  # uncomment below to test the property
  #expect_equal(model.instance$`items`, "EXPECTED_RESULT")
})
