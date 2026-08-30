namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConversionEventsDataItems 
{
    public string ActionSource { get; set; }
    public string AppId { get; set; }
    public ConversionEventAppInfo AppInfo { get; set; }
    public string AppName { get; set; }
    public string AppVersion { get; set; }
    public ConversionEventsDataItemsCustomData CustomData { get; set; }
    public string DeviceBrand { get; set; }
    public string DeviceCarrier { get; set; }
    public ConversionEventDeviceInfo DeviceInfo { get; set; }
    public string DeviceModel { get; set; }
    public string DeviceType { get; set; }
    public string EventId { get; set; }
    public string EventName { get; set; }
    public string EventSourceUrl { get; set; }
    public long EventTime { get; set; }
    public string Language { get; set; }
    public bool OptOut { get; set; }
    public string OsVersion { get; set; }
    public string PartnerName { get; set; }
    public ConversionEventsUserDataProperties UserData { get; set; }
    public bool Wifi { get; set; }
}


