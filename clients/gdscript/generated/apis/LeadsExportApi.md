<a name="__pageTop"></a>
# LeadsExportApi   { #LeadsExportApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leads_export/create**](#leads_export/create) | **POST** `/ad_accounts/{ad_account_id}/leads_export` | Create a request to export leads collected from a lead ad
[**leads_export/get**](#leads_export/get) | **GET** `/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}` | Get the lead export from the lead export create call

# **leads_export/create**   { #leads_export/create }
<a name="leads_export/create"></a>

> `leads_export/create(adAccountId: String,leadsExportsCreate: LeadsExportsCreate, on_success: Callable, on_failure: Callable)`

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (`pinterest_oauth2`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = LeadsExportApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadsExportApi.new(config, client)

var leadsExportsCreate = LeadsExportsCreate.new()
# … fill model leadsExportsCreate with data

# Invoke an endpoint
api.leads_export/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# leadsExportsCreate: LeadsExportsCreate
	leadsExportsCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "leads_export/create", response)
		assert(response.data is LeadsExports)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **leads_export/get**   { #leads_export/get }
<a name="leads_export/get"></a>

> `leads_export/get(adAccountId: String,leadsExportId: String, on_success: Callable, on_failure: Callable)`

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (`pinterest_oauth2`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = LeadsExportApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadsExportApi.new(config, client)


# Invoke an endpoint
api.leads_export/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# leadsExportId: String = ""   Eg: leadsExportId_example
	# lead_export_id token returned from the create a lead export endpoint
	leadsExportId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "leads_export/get", response)
		assert(response.data is LeadsExportResponseData)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), 
[client_credentials](../README.md#client_credentials), 
[conversion_token](../README.md#conversion_token), 
[basic](../README.md#basic)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

