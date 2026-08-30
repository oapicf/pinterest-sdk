
# TargetingSpecOptimal


## Properties

Name | Type
------------ | -------------
`aGEBUCKET` | [Array&lt;TargetingSpecAgeBucket&gt;](TargetingSpecAgeBucket.md)
`aPPTYPE` | [Array&lt;TargetingSpecAppType&gt;](TargetingSpecAppType.md)
`aUDIENCEEXCLUDE` | Array&lt;string&gt;
`aUDIENCEINCLUDE` | Array&lt;string&gt;
`gENDER` | [Array&lt;TargetingSpecGender&gt;](TargetingSpecGender.md)
`gEO` | Array&lt;string&gt;
`gEOEXCLUDE` | Array&lt;string&gt;
`iNTEREST` | Array&lt;string&gt;
`lOCALE` | Array&lt;string&gt;
`lOCATION` | Array&lt;string&gt;
`lOCATIONEXCLUDE` | Array&lt;string&gt;
`mAXIMUMAGE` | string
`mINIMUMAGE` | string
`sHOPPINGRETARGETING` | [Array&lt;TargetingSpecShoppingRetargeting&gt;](TargetingSpecShoppingRetargeting.md)
`tARGETINGSTRATEGY` | [Array&lt;TargetingStrategy&gt;](TargetingStrategy.md)

## Example

```typescript
import type { TargetingSpecOptimal } from ''

// TODO: Update the object below with actual values
const example = {
  "aGEBUCKET": null,
  "aPPTYPE": null,
  "aUDIENCEEXCLUDE": null,
  "aUDIENCEINCLUDE": null,
  "gENDER": null,
  "gEO": null,
  "gEOEXCLUDE": null,
  "iNTEREST": null,
  "lOCALE": null,
  "lOCATION": null,
  "lOCATIONEXCLUDE": null,
  "mAXIMUMAGE": null,
  "mINIMUMAGE": null,
  "sHOPPINGRETARGETING": null,
  "tARGETINGSTRATEGY": null,
} satisfies TargetingSpecOptimal

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TargetingSpecOptimal
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


