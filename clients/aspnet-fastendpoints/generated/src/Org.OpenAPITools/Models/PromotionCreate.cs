namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class PromotionCreate 
{
    
    public DiscountStatus DiscountStatus { get; set; }
    public int EndTime { get; set; }
    public string ExternalId { get; set; }
    public string PlatformType { get; set; }
    public string PromotionCode { get; set; }
    public string PromotionCustomId { get; set; }
    public string PromotionTitle { get; set; }
    
    public PromotionType PromotionType { get; set; }
    public int StartTime { get; set; }
    public List<PromotionTemplateValue> TemplateValues { get; set; }
}


