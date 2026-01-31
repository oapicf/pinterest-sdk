
# ConversionEventsUserData

Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.

## Properties

Name | Type
------------ | -------------
`ph` | Array&lt;string&gt;
`ge` | Array&lt;string&gt;
`db` | Array&lt;string&gt;
`ln` | Array&lt;string&gt;
`fn` | Array&lt;string&gt;
`ct` | Array&lt;string&gt;
`st` | Array&lt;string&gt;
`zp` | Array&lt;string&gt;
`country` | Array&lt;string&gt;
`externalId` | Array&lt;string&gt;
`clickId` | string
`partnerId` | string
`em` | Array&lt;string&gt;
`hashedMaids` | Array&lt;string&gt;
`clientIpAddress` | string
`clientUserAgent` | string

## Example

```typescript
import type { ConversionEventsUserData } from ''

// TODO: Update the object below with actual values
const example = {
  "ph": ["45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d"],
  "ge": ["0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf"],
  "db": ["d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739"],
  "ln": ["7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19"],
  "fn": ["ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2"],
  "ct": ["4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36"],
  "st": ["49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34"],
  "zp": ["fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145"],
  "country": ["9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d"],
  "externalId": ["6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee"],
  "clickId": dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv,
  "partnerId": BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc,
  "em": [411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8, 09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969],
  "hashedMaids": [0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1, 837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46],
  "clientIpAddress": 216.3.128.12,
  "clientUserAgent": Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36,
} satisfies ConversionEventsUserData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventsUserData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


