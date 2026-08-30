namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateAssetAccessRequestResponse 
{
    public List<AssetAccessRequestError> Exceptions { get; set; }
    public Dictionary<string, string> Invites { get; set; }
}


