# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CreateMMMReportRequest")

model_instance <- CreateMMMReportRequest$new()

test_that("report_name", {
  # tests for the property `report_name` (character)
  # Name of the Marketing Mix Modeling (MMM) report

  # uncomment below to test the property
  #expect_equal(model.instance$`report_name`, "EXPECTED_RESULT")
})

test_that("start_date", {
  # tests for the property `start_date` (character)
  # Metric report start date (UTC). Format: YYYY-MM-DD

  # uncomment below to test the property
  #expect_equal(model.instance$`start_date`, "EXPECTED_RESULT")
})

test_that("end_date", {
  # tests for the property `end_date` (character)
  # Metric report end date (UTC). Format: YYYY-MM-DD

  # uncomment below to test the property
  #expect_equal(model.instance$`end_date`, "EXPECTED_RESULT")
})

test_that("granularity", {
  # tests for the property `granularity` (character)
  # DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.

  # uncomment below to test the property
  #expect_equal(model.instance$`granularity`, "EXPECTED_RESULT")
})

test_that("level", {
  # tests for the property `level` (character)
  # Level of the report

  # uncomment below to test the property
  #expect_equal(model.instance$`level`, "EXPECTED_RESULT")
})

test_that("targeting_types", {
  # tests for the property `targeting_types` (array[MMMReportingTargetingType])
  # List of targeting types

  # uncomment below to test the property
  #expect_equal(model.instance$`targeting_types`, "EXPECTED_RESULT")
})

test_that("columns", {
  # tests for the property `columns` (array[MMMReportingColumn])
  # Metric and entity columns

  # uncomment below to test the property
  #expect_equal(model.instance$`columns`, "EXPECTED_RESULT")
})

test_that("countries", {
  # tests for the property `countries` (array[TargetingAdvertiserCountry])
  # A List of countries for filtering

  # uncomment below to test the property
  #expect_equal(model.instance$`countries`, "EXPECTED_RESULT")
})
