
# AdGroupTrackingURLs

  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).

## Properties

Name | Type
------------ | -------------
`audienceVerification` | Array&lt;string&gt;
`buyableButton` | Array&lt;string&gt;
`click` | Array&lt;string&gt;
`engagement` | Array&lt;string&gt;
`impression` | Array&lt;string&gt;

## Example

```typescript
import type { AdGroupTrackingURLs } from ''

// TODO: Update the object below with actual values
const example = {
  "audienceVerification": null,
  "buyableButton": null,
  "click": null,
  "engagement": null,
  "impression": null,
} satisfies AdGroupTrackingURLs

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupTrackingURLs
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


