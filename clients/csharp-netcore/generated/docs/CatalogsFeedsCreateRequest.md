# Org.OpenAPITools.Model.CatalogsFeedsCreateRequest
Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCountry** | **Country** |  | [optional] 
**DefaultAvailability** | **ProductAvailabilityType** |  | [optional] 
**DefaultCurrency** | **NullableCurrency** |  | [optional] 
**Name** | **string** | A human-friendly name associated to a given feed. | 
**Format** | **CatalogsFormat** |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | [optional] 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

