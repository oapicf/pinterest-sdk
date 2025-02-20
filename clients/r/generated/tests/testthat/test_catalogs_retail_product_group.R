# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CatalogsRetailProductGroup")

model_instance <- CatalogsRetailProductGroup$new()

test_that("catalog_type", {
  # tests for the property `catalog_type` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_type`, "EXPECTED_RESULT")
})

test_that("id", {
  # tests for the property `id` (character)
  # ID of the catalog product group.

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # Name of catalog product group

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("description", {
  # tests for the property `description` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`description`, "EXPECTED_RESULT")
})

test_that("filters", {
  # tests for the property `filters` (CatalogsProductGroupFilters)

  # uncomment below to test the property
  #expect_equal(model.instance$`filters`, "EXPECTED_RESULT")
})

test_that("is_featured", {
  # tests for the property `is_featured` (character)
  # boolean indicator of whether the product group is being featured or not

  # uncomment below to test the property
  #expect_equal(model.instance$`is_featured`, "EXPECTED_RESULT")
})

test_that("type", {
  # tests for the property `type` (CatalogsProductGroupType)

  # uncomment below to test the property
  #expect_equal(model.instance$`type`, "EXPECTED_RESULT")
})

test_that("status", {
  # tests for the property `status` (CatalogsProductGroupStatus)

  # uncomment below to test the property
  #expect_equal(model.instance$`status`, "EXPECTED_RESULT")
})

test_that("created_at", {
  # tests for the property `created_at` (integer)
  # Unix timestamp in seconds of when catalog product group was created.

  # uncomment below to test the property
  #expect_equal(model.instance$`created_at`, "EXPECTED_RESULT")
})

test_that("updated_at", {
  # tests for the property `updated_at` (integer)
  # Unix timestamp in seconds of last time catalog product group was updated.

  # uncomment below to test the property
  #expect_equal(model.instance$`updated_at`, "EXPECTED_RESULT")
})

test_that("catalog_id", {
  # tests for the property `catalog_id` (character)
  # Catalog id pertaining to the retail product group.

  # uncomment below to test the property
  #expect_equal(model.instance$`catalog_id`, "EXPECTED_RESULT")
})

test_that("feed_id", {
  # tests for the property `feed_id` (character)
  # id of the catalogs feed belonging to this catalog product group

  # uncomment below to test the property
  #expect_equal(model.instance$`feed_id`, "EXPECTED_RESULT")
})

test_that("country", {
  # tests for the property `country` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`country`, "EXPECTED_RESULT")
})

test_that("locale", {
  # tests for the property `locale` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`locale`, "EXPECTED_RESULT")
})
