# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test BaseInviteDataResponse")

model_instance <- BaseInviteDataResponse$new()

test_that("id", {
  # tests for the property `id` (character)
  # Unique identifier of the invite/request.

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("invite_data", {
  # tests for the property `invite_data` (BaseInviteDataResponseInviteData)

  # uncomment below to test the property
  #expect_equal(model.instance$`invite_data`, "EXPECTED_RESULT")
})

test_that("is_received_invite", {
  # tests for the property `is_received_invite` (character)
  # Indicates whether the invite/request was received.

  # uncomment below to test the property
  #expect_equal(model.instance$`is_received_invite`, "EXPECTED_RESULT")
})

test_that("user", {
  # tests for the property `user` (BusinessAccessUserSummary)
  # Metadata for the member/partner that was sent the invite/request.

  # uncomment below to test the property
  #expect_equal(model.instance$`user`, "EXPECTED_RESULT")
})
