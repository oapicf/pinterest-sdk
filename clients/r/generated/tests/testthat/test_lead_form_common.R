# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test LeadFormCommon")

model_instance <- LeadFormCommon$new()

test_that("name", {
  # tests for the property `name` (character)
  # Internal name of the lead form.

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("privacy_policy_link", {
  # tests for the property `privacy_policy_link` (character)
  # A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.

  # uncomment below to test the property
  #expect_equal(model.instance$`privacy_policy_link`, "EXPECTED_RESULT")
})

test_that("has_accepted_terms", {
  # tests for the property `has_accepted_terms` (character)
  # Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO

  # uncomment below to test the property
  #expect_equal(model.instance$`has_accepted_terms`, "EXPECTED_RESULT")
})

test_that("completion_message", {
  # tests for the property `completion_message` (character)
  # A message for people who complete the form to let them know what happens next.

  # uncomment below to test the property
  #expect_equal(model.instance$`completion_message`, "EXPECTED_RESULT")
})

test_that("status", {
  # tests for the property `status` (LeadFormStatus)

  # uncomment below to test the property
  #expect_equal(model.instance$`status`, "EXPECTED_RESULT")
})

test_that("disclosure_language", {
  # tests for the property `disclosure_language` (character)
  # Additional disclosure language to be included in the lead form.

  # uncomment below to test the property
  #expect_equal(model.instance$`disclosure_language`, "EXPECTED_RESULT")
})

test_that("questions", {
  # tests for the property `questions` (array[LeadFormQuestion])
  # List of questions to be displayed on the lead form.

  # uncomment below to test the property
  #expect_equal(model.instance$`questions`, "EXPECTED_RESULT")
})

test_that("policy_links", {
  # tests for the property `policy_links` (array[LeadFormCommonPolicyLinksInner])
  # List of additional policy links to be displayed on the lead form.

  # uncomment below to test the property
  #expect_equal(model.instance$`policy_links`, "EXPECTED_RESULT")
})
