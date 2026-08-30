
# ScheduleUpdateRequest


## Properties

Name | Type
------------ | -------------
`entityId` | string
`entityType` | string
`id` | string
`deltaValue` | [ScheduleCommonDeltaValue](ScheduleCommonDeltaValue.md)
`endTimestamp` | number
`name` | string
`scheduleAction` | [ScheduleAction](ScheduleAction.md)
`scheduleStatus` | [ScheduleStatus](ScheduleStatus.md)
`scheduleType` | [ScheduleType](ScheduleType.md)
`startTimestamp` | number

## Example

```typescript
import type { ScheduleUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "entityId": null,
  "entityType": null,
  "id": null,
  "deltaValue": null,
  "endTimestamp": null,
  "name": null,
  "scheduleAction": null,
  "scheduleStatus": null,
  "scheduleType": null,
  "startTimestamp": null,
} satisfies ScheduleUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ScheduleUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


