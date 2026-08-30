
# AdAccountsAudienceRule

JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).

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
`objectiveType` | [Array&lt;AudienceObjectiveType&gt;](AudienceObjectiveType.md)
`percentage` | number
`pinId` | Array&lt;string&gt;
`prefill` | boolean
`retentionDays` | number
`seedId` | Array&lt;string&gt;
`url` | Array&lt;string&gt;
`visitorSourceId` | string

## Example

```typescript
import type { AdAccountsAudienceRule } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "adId": null,
  "campaignId": null,
  "country": null,
  "customerListId": null,
  "engagementDomain": null,
  "engagementType": null,
  "engagerType": null,
  "event": null,
  "eventData": null,
  "eventSource": null,
  "ingestionSource": null,
  "objectiveType": null,
  "percentage": null,
  "pinId": null,
  "prefill": null,
  "retentionDays": null,
  "seedId": null,
  "url": null,
  "visitorSourceId": null,
} satisfies AdAccountsAudienceRule

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountsAudienceRule
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


