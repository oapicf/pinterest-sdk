namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class IntegrationMetadataCreate 
{
    public string AdditionalId1 { get; set; }
    public string ConnectedAdvertiserId { get; set; }
    public string ConnectedLbaId { get; set; }
    public string ConnectedMerchantId { get; set; }
    public string ConnectedTagId { get; set; }
    public string ExternalBusinessId { get; set; }
    public string PartnerAccessToken { get; set; }
    public decimal PartnerAccessTokenExpiry { get; set; }
    public string PartnerMetadata { get; set; }
    public string PartnerPrimaryEmail { get; set; }
    public string PartnerRefreshToken { get; set; }
    public decimal PartnerRefreshTokenExpiry { get; set; }
    public string Scopes { get; set; }
}


