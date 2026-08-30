# PinterestSdkClient::CampaignDeliveryEstimatesDerivedMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cpc** | **Float** | Estimated cost per click. | [optional] |
| **cpc_lower** | **Float** | Lower estimate of the cost per click. | [optional] |
| **cpc_upper** | **Float** | Upper estimate of the cost per click. | [optional] |
| **cpm** | **Float** | Estimated cost per thousand impressions. | [optional] |
| **cpm_lower** | **Float** | Lower estimate of cost per thousand impressions. | [optional] |
| **cpm_upper** | **Float** | Upper estimate of cost per thousand impressions. | [optional] |
| **lifetime_frequency** | **Float** | Estimated lifetime frequency. | [optional] |
| **lifetime_frequency_lower** | **Float** | Lower estimate of lifetime frequency. | [optional] |
| **lifetime_frequency_upper** | **Float** | Upper estimate of lifetime frequency. | [optional] |
| **lifetime_impression** | **Float** | Estimated lifetime impressions. | [optional] |
| **lifetime_impression_lower** | **Float** | Lower estimate of lifetime impressions. | [optional] |
| **lifetime_impression_upper** | **Float** | Upper estimate of lifetime impressions. | [optional] |
| **lifetime_reach** | **Float** | Estimated lifetime reach. | [optional] |
| **lifetime_reach_lower** | **Float** | Lower estimate of lifetime reach. | [optional] |
| **lifetime_reach_upper** | **Float** | Upper estimate of lifetime reach. | [optional] |
| **weekly_click** | **Float** | Estimated weekly clicks. | [optional] |
| **weekly_click_lower** | **Float** | Lower estimate of weekly clicks. | [optional] |
| **weekly_click_upper** | **Float** | Upper estimate of weekly clicks. | [optional] |
| **weekly_frequency** | **Float** | Estimated weekly frequency. | [optional] |
| **weekly_frequency_lower** | **Float** | Lower estimate of weekly frequency. | [optional] |
| **weekly_frequency_upper** | **Float** | Upper estimate of weekly frequency. | [optional] |
| **weekly_impression** | **Float** | Estimated weekly impressions. | [optional] |
| **weekly_impression_lower** | **Float** | Lower estimate of weekly impressions. | [optional] |
| **weekly_impression_upper** | **Float** | Upper estimate of weekly impressions. | [optional] |
| **weekly_reach** | **Float** | Estimated weekly reach. | [optional] |
| **weekly_reach_lower** | **Float** | Lower estimate of weekly reach. | [optional] |
| **weekly_reach_upper** | **Float** | Upper estimate of weekly reach. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignDeliveryEstimatesDerivedMetrics.new(
  cpc: 0.56,
  cpc_lower: 0.47,
  cpc_upper: 0.65,
  cpm: 10,
  cpm_lower: 8,
  cpm_upper: 12,
  lifetime_frequency: null,
  lifetime_frequency_lower: null,
  lifetime_frequency_upper: null,
  lifetime_impression: null,
  lifetime_impression_lower: null,
  lifetime_impression_upper: null,
  lifetime_reach: null,
  lifetime_reach_lower: null,
  lifetime_reach_upper: null,
  weekly_click: 1000,
  weekly_click_lower: 800,
  weekly_click_upper: 1200,
  weekly_frequency: 3,
  weekly_frequency_lower: 2.5,
  weekly_frequency_upper: 3.5,
  weekly_impression: 400000,
  weekly_impression_lower: 350000,
  weekly_impression_upper: 450000,
  weekly_reach: 102074.85050444445,
  weekly_reach_lower: 90000,
  weekly_reach_upper: 150000
)
```

