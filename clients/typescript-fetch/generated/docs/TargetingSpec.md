
# TargetingSpec

Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}`

## Properties

Name | Type
------------ | -------------
`aGEBUCKET` | Array&lt;string&gt;
`aPPTYPE` | Array&lt;string&gt;
`aUDIENCEEXCLUDE` | Array&lt;string&gt;
`aUDIENCEINCLUDE` | Array&lt;string&gt;
`gENDER` | Array&lt;string&gt;
`gEO` | Array&lt;string&gt;
`iNTEREST` | Array&lt;string&gt;
`lOCALE` | Array&lt;string&gt;
`lOCATION` | Array&lt;string&gt;
`sHOPPINGRETARGETING` | [Array&lt;TargetingSpecSHOPPINGRETARGETING&gt;](TargetingSpecSHOPPINGRETARGETING.md)
`tARGETINGSTRATEGY` | Array&lt;string&gt;

## Example

```typescript
import type { TargetingSpec } from ''

// TODO: Update the object below with actual values
const example = {
  "aGEBUCKET": ["35-44","50-54"],
  "aPPTYPE": ["ipad","iphone"],
  "aUDIENCEEXCLUDE": null,
  "aUDIENCEINCLUDE": null,
  "gENDER": null,
  "gEO": null,
  "iNTEREST": null,
  "lOCALE": null,
  "lOCATION": null,
  "sHOPPINGRETARGETING": null,
  "tARGETINGSTRATEGY": null,
} satisfies TargetingSpec

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TargetingSpec
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


