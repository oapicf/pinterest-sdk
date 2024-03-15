# BoardMedia
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageCoverUrl** | **String** | Board cover image. | [optional] 
**PinThumbnailUrls** | **String[]** | Board pin thumbnail urls. | [optional] 

## Examples

- Prepare the resource
```powershell
$BoardMedia = Initialize-PSOpenAPIToolsBoardMedia  -ImageCoverUrl https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg `
 -PinThumbnailUrls [&quot;https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg&quot;,&quot;https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg&quot;,&quot;https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg&quot;,&quot;https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg&quot;]
```

- Convert the resource to JSON
```powershell
$BoardMedia | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

