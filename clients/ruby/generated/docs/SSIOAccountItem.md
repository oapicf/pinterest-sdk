# PinterestSdkClient::SSIOAccountItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Salesforce id for billto_info | [optional] |
| **io_terms_id** | **String** | Salesforce id for IO Terms and Conditions | [optional] |
| **io_terms** | **String** | Salesforce text for IO Terms and Conditions | [optional] |
| **us_terms_id** | **String** | Salesforce id for US Terms and Conditions | [optional] |
| **us_terms** | **String** | Salesforce text for US Terms and Conditions | [optional] |
| **row_terms_id** | **String** | Salesforce id for Rest of the World Terms and Conditions | [optional] |
| **row_terms** | **String** | Salesforce text for Rest of the World Terms and Conditions | [optional] |
| **io_type** | **String** | Insertion Order Type - Pinterest Paper or Agency Paper | [optional] |
| **addresses** | [**Array&lt;SSIOAccountAddress&gt;**](SSIOAccountAddress.md) | Address information that is associated with this account. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOAccountItem.new(
  id: 0011N00001LW8kAQAT,
  io_terms_id: a2S1N000000bKHgUAM,
  io_terms: The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.,
  us_terms_id: a2S1N000000bKIOUA2,
  us_terms: This Insertion Order (&quot;IO&quot;) is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.,
  row_terms_id: a2S1N000000bKHhUAM,
  row_terms: The IO is governed by the terms available at
https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement,
  io_type: Pinterest Paper,
  addresses: null
)
```

