# IntegrationLogClientRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Method** | **string** |  | 
**Host** | **string** | HTTP request host from host header. | 
**Path** | **string** | HTTP request path. | 
**RequestHeaders** | Pointer to **map[string]string** | HTTP request headers as key-value pairs. | [optional] 
**ResponseHeaders** | Pointer to **map[string]string** | HTTP response headers as key-value pairs. | [optional] 
**ResponseStatusCode** | Pointer to **int32** |  | [optional] 

## Methods

### NewIntegrationLogClientRequest

`func NewIntegrationLogClientRequest(method string, host string, path string, ) *IntegrationLogClientRequest`

NewIntegrationLogClientRequest instantiates a new IntegrationLogClientRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationLogClientRequestWithDefaults

`func NewIntegrationLogClientRequestWithDefaults() *IntegrationLogClientRequest`

NewIntegrationLogClientRequestWithDefaults instantiates a new IntegrationLogClientRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMethod

`func (o *IntegrationLogClientRequest) GetMethod() string`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *IntegrationLogClientRequest) GetMethodOk() (*string, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *IntegrationLogClientRequest) SetMethod(v string)`

SetMethod sets Method field to given value.


### GetHost

`func (o *IntegrationLogClientRequest) GetHost() string`

GetHost returns the Host field if non-nil, zero value otherwise.

### GetHostOk

`func (o *IntegrationLogClientRequest) GetHostOk() (*string, bool)`

GetHostOk returns a tuple with the Host field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHost

`func (o *IntegrationLogClientRequest) SetHost(v string)`

SetHost sets Host field to given value.


### GetPath

`func (o *IntegrationLogClientRequest) GetPath() string`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *IntegrationLogClientRequest) GetPathOk() (*string, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *IntegrationLogClientRequest) SetPath(v string)`

SetPath sets Path field to given value.


### GetRequestHeaders

`func (o *IntegrationLogClientRequest) GetRequestHeaders() map[string]string`

GetRequestHeaders returns the RequestHeaders field if non-nil, zero value otherwise.

### GetRequestHeadersOk

`func (o *IntegrationLogClientRequest) GetRequestHeadersOk() (*map[string]string, bool)`

GetRequestHeadersOk returns a tuple with the RequestHeaders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestHeaders

`func (o *IntegrationLogClientRequest) SetRequestHeaders(v map[string]string)`

SetRequestHeaders sets RequestHeaders field to given value.

### HasRequestHeaders

`func (o *IntegrationLogClientRequest) HasRequestHeaders() bool`

HasRequestHeaders returns a boolean if a field has been set.

### GetResponseHeaders

`func (o *IntegrationLogClientRequest) GetResponseHeaders() map[string]string`

GetResponseHeaders returns the ResponseHeaders field if non-nil, zero value otherwise.

### GetResponseHeadersOk

`func (o *IntegrationLogClientRequest) GetResponseHeadersOk() (*map[string]string, bool)`

GetResponseHeadersOk returns a tuple with the ResponseHeaders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseHeaders

`func (o *IntegrationLogClientRequest) SetResponseHeaders(v map[string]string)`

SetResponseHeaders sets ResponseHeaders field to given value.

### HasResponseHeaders

`func (o *IntegrationLogClientRequest) HasResponseHeaders() bool`

HasResponseHeaders returns a boolean if a field has been set.

### GetResponseStatusCode

`func (o *IntegrationLogClientRequest) GetResponseStatusCode() int32`

GetResponseStatusCode returns the ResponseStatusCode field if non-nil, zero value otherwise.

### GetResponseStatusCodeOk

`func (o *IntegrationLogClientRequest) GetResponseStatusCodeOk() (*int32, bool)`

GetResponseStatusCodeOk returns a tuple with the ResponseStatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseStatusCode

`func (o *IntegrationLogClientRequest) SetResponseStatusCode(v int32)`

SetResponseStatusCode sets ResponseStatusCode field to given value.

### HasResponseStatusCode

`func (o *IntegrationLogClientRequest) HasResponseStatusCode() bool`

HasResponseStatusCode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


