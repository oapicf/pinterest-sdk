
# ScheduleCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`deltaValue` | [ScheduleDeltaValue](ScheduleDeltaValue.md)
`endTimestamp` | number
`entityId` | string
`entityType` | [AdAccountEntityType](AdAccountEntityType.md)
`name` | string
`scheduleAction` | [ScheduleAction](ScheduleAction.md)
`scheduleStatus` | [ScheduleStatus](ScheduleStatus.md)
`scheduleType` | [ScheduleType](ScheduleType.md)
`startTimestamp` | number

## Example

```typescript
import type { ScheduleCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "deltaValue": null,
  "endTimestamp": null,
  "entityId": null,
  "entityType": null,
  "name": null,
  "scheduleAction": null,
  "scheduleStatus": null,
  "scheduleType": null,
  "startTimestamp": null,
} satisfies ScheduleCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ScheduleCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


