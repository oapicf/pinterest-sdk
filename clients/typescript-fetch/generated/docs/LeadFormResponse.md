
# LeadFormResponse


## Properties

Name | Type
------------ | -------------
`completionMessage` | string
`disclosureLanguage` | string
`hasAcceptedTerms` | boolean
`name` | string
`policyLinks` | [Array&lt;LeadFormCommonPolicyLinksInner&gt;](LeadFormCommonPolicyLinksInner.md)
`privacyPolicyLink` | string
`questions` | [Array&lt;LeadFormQuestion&gt;](LeadFormQuestion.md)
`status` | [LeadFormStatus](LeadFormStatus.md)
`adAccountId` | string
`createdTime` | number
`id` | string
`updatedTime` | number

## Example

```typescript
import type { LeadFormResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "completionMessage": Thank you for submitting. We will contact you soon.,
  "disclosureLanguage": By entering your personal information, you agree that your data will be collected and used.,
  "hasAcceptedTerms": false,
  "name": Lead Form 3/14/2023,
  "policyLinks": [{label=Copyright, link=https://policy.pinterest.com/en/copyright}],
  "privacyPolicyLink": https://www.advertisername.com/privacy-policy,
  "questions": [{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}],
  "status": null,
  "adAccountId": 549755885175,
  "createdTime": 1451431341,
  "id": 7765300871171,
  "updatedTime": 1451431341,
} satisfies LeadFormResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadFormResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


