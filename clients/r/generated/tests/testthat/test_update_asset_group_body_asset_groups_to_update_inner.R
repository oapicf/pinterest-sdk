# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test UpdateAssetGroupBodyAssetGroupsToUpdateInner")

model_instance <- UpdateAssetGroupBodyAssetGroupsToUpdateInner$new()

test_that("asset_group_id", {
  # tests for the property `asset_group_id` (character)
  # Unique identifier of the asset group to update.

  # uncomment below to test the property
  #expect_equal(model.instance$`asset_group_id`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # Asset Group name

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("description", {
  # tests for the property `description` (character)
  # Asset group description

  # uncomment below to test the property
  #expect_equal(model.instance$`description`, "EXPECTED_RESULT")
})

test_that("asset_group_types", {
  # tests for the property `asset_group_types` (array[AssetGroupType])
  # Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.

  # uncomment below to test the property
  #expect_equal(model.instance$`asset_group_types`, "EXPECTED_RESULT")
})

test_that("assets_to_add", {
  # tests for the property `assets_to_add` (array[character])
  # A list of asset ids to add to the asset group.

  # uncomment below to test the property
  #expect_equal(model.instance$`assets_to_add`, "EXPECTED_RESULT")
})

test_that("assets_to_remove", {
  # tests for the property `assets_to_remove` (array[character])
  # A list of asset ids to remove from the asset group.

  # uncomment below to test the property
  #expect_equal(model.instance$`assets_to_remove`, "EXPECTED_RESULT")
})
