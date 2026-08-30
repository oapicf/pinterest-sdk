namespace Org.OpenAPITools.Models;


/// <summary>
/// Integration record
/// </summary>
public class IntegrationRecord 
{
    public string AdditionalId1 { get; set; }
    public string ConnectedAdvertiserId { get; set; }
    public string ConnectedLbaId { get; set; }
    public string ConnectedMerchantId { get; set; }
    public string ConnectedTagId { get; set; }
    public string ConnectedUserId { get; set; }
    public int CreatedTime { get; set; }
    public string ExternalBusinessId { get; set; }
    public string Id { get; set; }
    public string PartnerAccessToken { get; set; }
    public int PartnerAccessTokenExpiry { get; set; }
    public string PartnerMetadata { get; set; }
    public string PartnerPrimaryEmail { get; set; }
    public string PartnerRefreshToken { get; set; }
    public int PartnerRefreshTokenExpiry { get; set; }
    public string Scopes { get; set; }
    public int UpdatedTime { get; set; }
}


