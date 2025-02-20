#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_entity_status
import model_tracking_urls

type CampaignCreateCommon* = object
  ## 
  adAccountId*: string ## Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  name*: string ## Campaign name.
  status*: EntityStatus
  lifetimeSpendCap*: int ## Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  dailySpendCap*: int ## Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  orderLineId*: string ## Order line ID that appears on the invoice.
  trackingUrls*: TrackingUrls
  startTime*: int ## Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  endTime*: int ## Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  isFlexibleDailyBudgets*: bool ## Determine if a campaign has flexible daily budgets setup.
  defaultAdGroupBudgetInMicroCurrency*: int ## When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  isAutomatedCampaign*: bool ## Specifies whether the campaign was created in the automated campaign flow
