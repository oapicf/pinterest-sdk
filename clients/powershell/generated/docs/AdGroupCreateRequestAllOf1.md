# AdGroupCreateRequestAllOf1
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;Pinterest Performance+ targeting&quot;&quot;&lt;/a&gt;. | [optional] 
**BidMultiplier** | **Decimal** | &lt;a href&#x3D;&quot;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot;&quot; target&#x3D;&quot;&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;&quot;&quot;/docs/api-features/pinterest-performance-plus-setup/&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. | [optional] 
**BudgetType** | [**BudgetType**](BudgetType.md) |  | [optional] 
**PacingDeliveryType** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupCreateRequestAllOf1 = Initialize-PSOpenAPIToolsAdGroupCreateRequestAllOf1  -AutoTargetingEnabled null `
 -BidMultiplier null `
 -BudgetType null `
 -PacingDeliveryType null
```

- Convert the resource to JSON
```powershell
$AdGroupCreateRequestAllOf1 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

