/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Request body used to delete asset groups
 */
public class OASDeleteAssetGroupBody implements OAS.MappedProperties {
    /**
     * List of ids of asset groups to be deleted
     * @return assetGroupsToDelete
     */
    public List<String> assetGroupsToDelete { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'asset_groups_to_delete' => 'assetGroupsToDelete'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASDeleteAssetGroupBody() {
        assetGroupsToDelete = new List<String>();
    }

    public static OASDeleteAssetGroupBody getExample() {
        OASDeleteAssetGroupBody deleteAssetGroupBody = new OASDeleteAssetGroupBody();
          deleteAssetGroupBody.assetGroupsToDelete = new List<String>{''};
        return deleteAssetGroupBody;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDeleteAssetGroupBody) {           
            OASDeleteAssetGroupBody deleteAssetGroupBody = (OASDeleteAssetGroupBody) obj;
            return this.assetGroupsToDelete == deleteAssetGroupBody.assetGroupsToDelete;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (assetGroupsToDelete == null ? 0 : System.hashCode(assetGroupsToDelete));
        return hashCode;
    }
}

