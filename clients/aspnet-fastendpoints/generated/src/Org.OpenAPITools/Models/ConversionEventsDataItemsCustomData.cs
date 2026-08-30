namespace Org.OpenAPITools.Models;


/// <summary>
/// Object containing other custom data.
/// </summary>
public class ConversionEventsDataItemsCustomData 
{
    public string ContentBrand { get; set; }
    public string ContentCategory { get; set; }
    public List<string> ContentIds { get; set; }
    public string ContentName { get; set; }
    public List<ConversionEventsDataItemsCustomDataContentsItems> Contents { get; set; }
    public string Currency { get; set; }
    public string ExternalMeasurementId { get; set; }
    public int ExternalMeasurementVendorId { get; set; }
    public string Np { get; set; }
    public long NumItems { get; set; }
    public string OptOutType { get; set; }
    public string OrderId { get; set; }
    public string PredictedLtv { get; set; }
    public string SearchString { get; set; }
    public string Value { get; set; }
}


