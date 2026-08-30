
# LeadForm


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`completionMessage` | string
`createdTime` | number
`disclosureLanguage` | string
`hasAcceptedTerms` | boolean
`id` | string
`name` | string
`policyLinks` | [Array&lt;LeadFormPolicyLink&gt;](LeadFormPolicyLink.md)
`privacyPolicyLink` | string
`questions` | [Array&lt;LeadFormQuestion&gt;](LeadFormQuestion.md)
`status` | [LeadFormStatus](LeadFormStatus.md)
`updatedTime` | number

## Example

```typescript
import type { LeadForm } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "completionMessage": Thank you for submitting. We will contact you soon.,
  "createdTime": null,
  "disclosureLanguage": By entering your personal information, you agree that your data will be collected and used.,
  "hasAcceptedTerms": false,
  "id": null,
  "name": Lead Form 3/14/2023,
  "policyLinks": [{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}],
  "privacyPolicyLink": https://www.advertisername.com/privacy-policy,
  "questions": [{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}],
  "status": null,
  "updatedTime": null,
} satisfies LeadForm

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadForm
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


