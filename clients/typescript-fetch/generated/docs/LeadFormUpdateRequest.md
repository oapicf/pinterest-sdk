
# LeadFormUpdateRequest


## Properties

Name | Type
------------ | -------------
`name` | string
`privacyPolicyLink` | string
`hasAcceptedTerms` | boolean
`completionMessage` | string
`status` | [LeadFormStatus](LeadFormStatus.md)
`disclosureLanguage` | string
`questions` | [Array&lt;LeadFormQuestion&gt;](LeadFormQuestion.md)
`policyLinks` | [Array&lt;LeadFormCommonPolicyLinksInner&gt;](LeadFormCommonPolicyLinksInner.md)
`id` | string

## Example

```typescript
import type { LeadFormUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "name": Lead Form 3/14/2023,
  "privacyPolicyLink": https://www.advertisername.com/privacy-policy,
  "hasAcceptedTerms": false,
  "completionMessage": Thank you for submitting. We will contact you soon.,
  "status": null,
  "disclosureLanguage": By entering your personal information, you agree that your data will be collected and used.,
  "questions": [{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}],
  "policyLinks": [{label=Copyright, link=https://policy.pinterest.com/en/copyright}],
  "id": 7765300871171,
} satisfies LeadFormUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadFormUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


