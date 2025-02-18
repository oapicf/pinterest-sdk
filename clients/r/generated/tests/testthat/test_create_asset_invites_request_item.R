# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CreateAssetInvitesRequestItem")

model_instance <- CreateAssetInvitesRequestItem$new()

test_that("invite_id", {
  # tests for the property `invite_id` (character)
  # Unique identifier of an invite.

  # uncomment below to test the property
  #expect_equal(model.instance$`invite_id`, "EXPECTED_RESULT")
})

test_that("invite_type", {
  # tests for the property `invite_type` (InviteType)

  # uncomment below to test the property
  #expect_equal(model.instance$`invite_type`, "EXPECTED_RESULT")
})

test_that("asset_id_to_permissions", {
  # tests for the property `asset_id_to_permissions` (map(array[Permissions]))
  # An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 

  # uncomment below to test the property
  #expect_equal(model.instance$`asset_id_to_permissions`, "EXPECTED_RESULT")
})
