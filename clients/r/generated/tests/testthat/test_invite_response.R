# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test InviteResponse")

model_instance <- InviteResponse$new()

test_that("assets_summary", {
  # tests for the property `assets_summary` (InviteAssetsSummary)

  # uncomment below to test the property
  #expect_equal(model.instance$`assets_summary`, "EXPECTED_RESULT")
})

test_that("business_roles", {
  # tests for the property `business_roles` (array[character])
  # The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.

  # uncomment below to test the property
  #expect_equal(model.instance$`business_roles`, "EXPECTED_RESULT")
})

test_that("created_by_business", {
  # tests for the property `created_by_business` (BusinessAccessUserSummary)
  # Metadata for the business that created the invite/request.

  # uncomment below to test the property
  #expect_equal(model.instance$`created_by_business`, "EXPECTED_RESULT")
})

test_that("created_by_user", {
  # tests for the property `created_by_user` (BusinessAccessUserSummary)
  # Metadata for the user that created the invite/request.

  # uncomment below to test the property
  #expect_equal(model.instance$`created_by_user`, "EXPECTED_RESULT")
})

test_that("created_time", {
  # tests for the property `created_time` (integer)
  # The time the invite/request was created. Returned in milliseconds.

  # uncomment below to test the property
  #expect_equal(model.instance$`created_time`, "EXPECTED_RESULT")
})

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
