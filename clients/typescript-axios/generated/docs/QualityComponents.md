# QualityComponents

Set of quality components, with each component containing a event coverage and details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_external_id** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]
**click_id_epik** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]
**external_event_id** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) | Dedup components. | [optional] [default to undefined]
**hashed_email** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) | User matching identifiers. | [optional] [default to undefined]
**hashed_maid** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]
**ip_address** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]
**order_id** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]
**order_value** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]
**product_id** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) | Product/event metadata. | [optional] [default to undefined]
**source_url** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]
**user_agent** | [**{ [key: string]: QualityComponentDetails; }**](QualityComponentDetails.md) |  | [optional] [default to undefined]

## Example

```typescript
import { QualityComponents } from './api';

const instance: QualityComponents = {
    advertiser_external_id,
    click_id_epik,
    external_event_id,
    hashed_email,
    hashed_maid,
    ip_address,
    order_id,
    order_value,
    product_id,
    source_url,
    user_agent,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
