
# AudienceRule

JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}  ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).

## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`adId` | Array&lt;string&gt;
`campaignId` | Array&lt;string&gt;
`country` | string
`customerListId` | string
`engagementDomain` | Array&lt;string&gt;
`engagementType` | string
`engagerType` | number
`event` | string
`eventData` | [EventData](EventData.md)
`eventSource` | object
`ingestionSource` | object
`objectiveType` | [Array&lt;ObjectiveType&gt;](ObjectiveType.md)
`percentage` | number
`pinId` | Array&lt;string&gt;
`prefill` | boolean
`retentionDays` | number
`seedId` | Array&lt;string&gt;
`url` | Array&lt;string&gt;
`visitorSourceId` | string

## Example

```typescript
import type { AudienceRule } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "adId": ["687201361754"],
  "campaignId": ["626744528398"],
  "country": US,
  "customerListId": 5497558859876,
  "engagementDomain": ["www.somedomain.com"],
  "engagementType": click,
  "engagerType": 1,
  "event": checkout,
  "eventData": null,
  "eventSource": {"=":["web","mobile"]},
  "ingestionSource": {"=":["tag"]},
  "objectiveType": ["AWARENESS"],
  "percentage": 3,
  "pinId": ["34567"],
  "prefill": true,
  "retentionDays": 30,
  "seedId": ["2542620639259","2542620639261"],
  "url": null,
  "visitorSourceId": 549755885175,
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


