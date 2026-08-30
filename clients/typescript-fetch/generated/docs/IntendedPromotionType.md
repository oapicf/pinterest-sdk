
# IntendedPromotionType

Specifies the intended promotion type for the campaign.  Note: This field is immutable unless the campaign is in draft status.  **STANDARD_AD** - For ads derived from Pins. - Supported for all objective types except for current CATALOG\\_SALES and WEB\\_CONVERSION, which are being deprecated. - For simplified objective types.  **CATALOG** - For creating product group promotions. - Supported for CONSIDERATION and SALES objective types. - For simplified objective types.  **LEGACY** - Intended only for maintaining backward compatibility. - Must be used for CATALOG\\_SALES and WEB\\_CONVERSION. - Supported for CATALOG\\_SALES and WEB\\_CONVERSION objective types.  **If you do not provide this parameter, the default is:** - LEGACY for CATALOG\\_SALES and WEB\\_CONVERSION - STANDARD_AD for other objective types

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { IntendedPromotionType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies IntendedPromotionType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntendedPromotionType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


