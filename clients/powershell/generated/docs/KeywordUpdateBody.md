# KeywordUpdateBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keywords** | [**KeywordUpdate[]**](KeywordUpdate.md) | Keywords to update. Object array. Each object has 3 possible fields:&lt;br&gt;1. &quot;&quot;id&quot;&quot;: (required) keyword ID&lt;br&gt;2. &quot;&quot;archived&quot;&quot;: boolean. Should keyword be archived?&lt;br&gt;3. &quot;&quot;bid&quot;&quot;: number&lt;br&gt;For example: [{&quot;&quot;id&quot;&quot;:&quot;&quot;2886610576653&quot;&quot;, &quot;&quot;archived&quot;&quot;: false, &quot;&quot;bid&quot;&quot;: 20000}, {&quot;&quot;id&quot;&quot;:&quot;&quot;2886610576654&quot;&quot;,  &quot;&quot;archived&quot;&quot;: true, &quot;&quot;bid&quot;&quot;: 20000}, ...] | 

## Examples

- Prepare the resource
```powershell
$KeywordUpdateBody = Initialize-PSOpenAPIToolsKeywordUpdateBody  -Keywords null
```

- Convert the resource to JSON
```powershell
$KeywordUpdateBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

