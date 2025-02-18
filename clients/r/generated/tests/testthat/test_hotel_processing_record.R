# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test HotelProcessingRecord")

model_instance <- HotelProcessingRecord$new()

test_that("hotel_id", {
  # tests for the property `hotel_id` (character)
  # The catalog hotel id in the merchant namespace

  # uncomment below to test the property
  #expect_equal(model.instance$`hotel_id`, "EXPECTED_RESULT")
})

test_that("errors", {
  # tests for the property `errors` (array[ItemValidationEvent])
  # Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.

  # uncomment below to test the property
  #expect_equal(model.instance$`errors`, "EXPECTED_RESULT")
})

test_that("warnings", {
  # tests for the property `warnings` (array[ItemValidationEvent])
  # Array with the validation warnings for the item processing record

  # uncomment below to test the property
  #expect_equal(model.instance$`warnings`, "EXPECTED_RESULT")
})

test_that("status", {
  # tests for the property `status` (ItemProcessingStatus)

  # uncomment below to test the property
  #expect_equal(model.instance$`status`, "EXPECTED_RESULT")
})
