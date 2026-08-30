
# MetricsResponse


## Properties

Name | Type
------------ | -------------
`data` | [Array&lt;MetricsResponseDataItems&gt;](MetricsResponseDataItems.md)

## Example

```typescript
import type { MetricsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "data": [{"targeting_type":"KEYWORD","targeting_value":"christmas decor ideas","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"iphone","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"ipad","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"web","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"web_mobile","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"android_mobile","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"android_tablet","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"GENDER","targeting_value":"female","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"LOCATION","targeting_value":"500","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"PLACEMENT","targeting_value":"SEARCH","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"COUNTRY","targeting_value":"US","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"TARGETED_INTEREST","targeting_value":"Food and Drinks","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"PINNER_INTEREST","targeting_value":"Chocolate Cookies","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"AUDIENCE_INCLUDE","targeting_value":"254261234567","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"GEO","targeting_value":"US:94102","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"AGE_BUCKET","targeting_value":"45-49","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"REGION","targeting_value":"US-CA","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}}],
} satisfies MetricsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MetricsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


