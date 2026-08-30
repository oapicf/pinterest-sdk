namespace Org.OpenAPITools.Models;


/// <summary>
/// Item in a batch campaign response.
/// </summary>
public class CampaignBatchItem 
{
    public CampaignBatchResponseData Data { get; set; }
    public List<Exception> Exceptions { get; set; }
}


