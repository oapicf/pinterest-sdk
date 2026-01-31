# Org.OpenAPITools.Model.CatalogsFeedsCreateRequest
Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Format** | **CatalogsFormat** |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Name** | **string** | A human-friendly name associated to a given feed. | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**DefaultAvailability** | **ProductAvailabilityType** |  | [optional] 
**DefaultCountry** | **Country** |  | [optional] 
**DefaultCurrency** | **NullableCurrency** |  | [optional] 
**DefaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | [optional] 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | **CatalogsStatus** |  | [optional] [default to "ACTIVE"]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

