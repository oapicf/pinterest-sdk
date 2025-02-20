# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CatalogsCreativeAssetsFeed")

model_instance <- CatalogsCreativeAssetsFeed$new()

test_that("created_at", {
  # tests for the property `created_at` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`created_at`, "EXPECTED_RESULT")
})

test_that("id", {
  # tests for the property `id` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("updated_at", {
  # tests for the property `updated_at` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`updated_at`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("format", {
  # tests for the property `format` (CatalogsFormat)

  # uncomment below to test the property
  #expect_equal(model.instance$`format`, "EXPECTED_RESULT")
})

test_that("catalog_type", {
  # tests for the property `catalog_type` (CatalogsType)

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_type`, "EXPECTED_RESULT")
})

test_that("credentials", {
  # tests for the property `credentials` (CatalogsFeedCredentials)

  # uncomment below to test the property
  #expect_equal(model.instance$`credentials`, "EXPECTED_RESULT")
})

test_that("location", {
  # tests for the property `location` (character)
  # The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.

  # uncomment below to test the property
  #expect_equal(model.instance$`location`, "EXPECTED_RESULT")
})

test_that("preferred_processing_schedule", {
  # tests for the property `preferred_processing_schedule` (CatalogsFeedProcessingSchedule)

  # uncomment below to test the property
  #expect_equal(model.instance$`preferred_processing_schedule`, "EXPECTED_RESULT")
})

test_that("status", {
  # tests for the property `status` (CatalogsStatus)

  # uncomment below to test the property
  #expect_equal(model.instance$`status`, "EXPECTED_RESULT")
})

test_that("default_currency", {
  # tests for the property `default_currency` (NullableCurrency)

  # uncomment below to test the property
  #expect_equal(model.instance$`default_currency`, "EXPECTED_RESULT")
})

test_that("default_locale", {
  # tests for the property `default_locale` (character)
  # The locale used within a feed for product descriptions.

  # uncomment below to test the property
  #expect_equal(model.instance$`default_locale`, "EXPECTED_RESULT")
})

test_that("default_country", {
  # tests for the property `default_country` (Country)

  # uncomment below to test the property
  #expect_equal(model.instance$`default_country`, "EXPECTED_RESULT")
})

test_that("catalog_id", {
  # tests for the property `catalog_id` (character)
  # Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_id`, "EXPECTED_RESULT")
})
