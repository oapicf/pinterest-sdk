# CustomerListUploadCreateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerListUpload** | [**CustomerListUpload**](CustomerListUpload.md) | The Customer List Upload created. | 
**S3MultipartUploadData** | [**S3MultipartUploadData**](S3MultipartUploadData.md) | Pre-signed upload URLs corresponding to each part of the upload. | 

## Methods

### NewCustomerListUploadCreateResponse

`func NewCustomerListUploadCreateResponse(customerListUpload CustomerListUpload, s3MultipartUploadData S3MultipartUploadData, ) *CustomerListUploadCreateResponse`

NewCustomerListUploadCreateResponse instantiates a new CustomerListUploadCreateResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListUploadCreateResponseWithDefaults

`func NewCustomerListUploadCreateResponseWithDefaults() *CustomerListUploadCreateResponse`

NewCustomerListUploadCreateResponseWithDefaults instantiates a new CustomerListUploadCreateResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomerListUpload

`func (o *CustomerListUploadCreateResponse) GetCustomerListUpload() CustomerListUpload`

GetCustomerListUpload returns the CustomerListUpload field if non-nil, zero value otherwise.

### GetCustomerListUploadOk

`func (o *CustomerListUploadCreateResponse) GetCustomerListUploadOk() (*CustomerListUpload, bool)`

GetCustomerListUploadOk returns a tuple with the CustomerListUpload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerListUpload

`func (o *CustomerListUploadCreateResponse) SetCustomerListUpload(v CustomerListUpload)`

SetCustomerListUpload sets CustomerListUpload field to given value.


### GetS3MultipartUploadData

`func (o *CustomerListUploadCreateResponse) GetS3MultipartUploadData() S3MultipartUploadData`

GetS3MultipartUploadData returns the S3MultipartUploadData field if non-nil, zero value otherwise.

### GetS3MultipartUploadDataOk

`func (o *CustomerListUploadCreateResponse) GetS3MultipartUploadDataOk() (*S3MultipartUploadData, bool)`

GetS3MultipartUploadDataOk returns a tuple with the S3MultipartUploadData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetS3MultipartUploadData

`func (o *CustomerListUploadCreateResponse) SetS3MultipartUploadData(v S3MultipartUploadData)`

SetS3MultipartUploadData sets S3MultipartUploadData field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


