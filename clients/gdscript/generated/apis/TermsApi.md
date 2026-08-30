<a name="__pageTop"></a>
# TermsApi   { #TermsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_related/list**](#terms_related/list) | **GET** `/terms/related` | List related terms
[**terms_suggested/list**](#terms_suggested/list) | **GET** `/terms/suggested` | List suggested terms

# **terms_related/list**   { #terms_related/list }
<a name="terms_related/list"></a>

> `terms_related/list(terms: Array, on_success: Callable, on_failure: Callable)`

List related terms

Get a list of terms logically related to each input term.  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

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
var api = TermsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TermsApi.new(config, client)


# Invoke an endpoint
api.terms_related/list(
	# terms: Array
	# List of input terms.
	terms,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "terms_related/list", response)
		assert(response.data is RelatedTerms)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **terms_suggested/list**   { #terms_suggested/list }
<a name="terms_suggested/list"></a>

> `terms_suggested/list(term: String,limit = 4, on_success: Callable, on_failure: Callable)`

List suggested terms

Get popular search terms that begin with your input term.  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

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
var api = TermsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TermsApi.new(config, client)


# Invoke an endpoint
api.terms_suggested/list(
	# term: String = ""   Eg: term_example
	# Input term.
	term,
	# limit: int = 4   Eg: 56
	# Max suggested terms to return.
	limit,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "terms_suggested/list", response)
		assert(response.data is string)
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

