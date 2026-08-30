namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeletePartnerAssetAccessItem 
{
    public string AssetId { get; set; }
    public string PartnerId { get; set; }
    
    /// <summary>
    /// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
    /// </summary>
    /// <value>If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.</value>
    public enum PartnerTypeEnum
    {
        
        /// <summary>
        /// Enum INTERNALEnum for INTERNAL
        /// </summary>
        INTERNALEnum = 1,
        
        /// <summary>
        /// Enum EXTERNALEnum for EXTERNAL
        /// </summary>
        EXTERNALEnum = 2
    }

    public PartnerTypeEnum PartnerType { get; set; } = PartnerTypeEnum.INTERNALEnum;
}


