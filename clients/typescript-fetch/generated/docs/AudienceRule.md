
# AudienceRule

JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.

## Properties

Name | Type
------------ | -------------
`country` | string
`customerListId` | string
`engagementDomain` | Array&lt;string&gt;
`engagementType` | string
`event` | string
`eventData` | [PinterestTagEventData](PinterestTagEventData.md)
`percentage` | number
`pinId` | Array&lt;string&gt;
`prefill` | boolean
`retentionDays` | number
`seedId` | Array&lt;string&gt;
`url` | Array&lt;string&gt;
`visitorSourceId` | string
`eventSource` | object
`ingestionSource` | object
`engagerType` | number
`campaignId` | Array&lt;string&gt;
`adId` | Array&lt;string&gt;
`objectiveType` | [Array&lt;ObjectiveType&gt;](ObjectiveType.md)
`adAccountId` | string

## Example

```typescript
import type { AudienceRule } from ''

// TODO: Update the object below with actual values
const example = {
  "country": US,
  "customerListId": 5497558859876,
  "engagementDomain": ["www.somedomain.com"],
  "engagementType": click,
  "event": checkout,
  "eventData": null,
  "percentage": 3,
  "pinId": ["34567"],
  "prefill": true,
  "retentionDays": 30,
  "seedId": ["2542620639259","2542620639261"],
  "url": null,
  "visitorSourceId": 549755885175,
  "eventSource": {"=":["web","mobile"]},
  "ingestionSource": {"=":["tag"]},
  "engagerType": 1,
  "campaignId": ["626744528398"],
  "adId": ["687201361754"],
  "objectiveType": ["AWARENESS"],
  "adAccountId": 549755885175,
} satisfies AudienceRule

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceRule
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


