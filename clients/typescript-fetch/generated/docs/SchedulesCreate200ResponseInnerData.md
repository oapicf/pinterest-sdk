
# SchedulesCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties

Name | Type
------------ | -------------
`deltaValue` | [ScheduleDeltaValue](ScheduleDeltaValue.md)
`endTimestamp` | number
`entityId` | string
`entityType` | [AdAccountEntityType](AdAccountEntityType.md)
`name` | string
`scheduleAction` | [ScheduleAction](ScheduleAction.md)
`scheduleId` | string
`scheduleStatus` | [ScheduleStatus](ScheduleStatus.md)
`scheduleType` | [ScheduleType](ScheduleType.md)
`startTimestamp` | number
`id` | string
`exceptions` | [PinterestLibError](PinterestLibError.md)

## Example

```typescript
import type { SchedulesCreate200ResponseInnerData } from ''

// TODO: Update the object below with actual values
const example = {
  "deltaValue": null,
  "endTimestamp": null,
  "entityId": null,
  "entityType": null,
  "name": null,
  "scheduleAction": null,
  "scheduleId": null,
  "scheduleStatus": null,
  "scheduleType": null,
  "startTimestamp": null,
  "id": null,
  "exceptions": null,
} satisfies SchedulesCreate200ResponseInnerData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SchedulesCreate200ResponseInnerData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


