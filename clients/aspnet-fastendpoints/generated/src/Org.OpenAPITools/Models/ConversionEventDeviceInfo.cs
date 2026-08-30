namespace Org.OpenAPITools.Models;


/// <summary>
/// Object containing information about the device where event occurred.
/// </summary>
public class ConversionEventDeviceInfo 
{
    public int BatteryLevel { get; set; }
    public string Brand { get; set; }
    public string Carrier { get; set; }
    public int CpuCores { get; set; }
    public int ExternalStorageFreeSpace { get; set; }
    public int ExternalStorageSize { get; set; }
    
    public FormFactor FormFactor { get; set; }
    public string KernelVersion { get; set; }
    public List<string> Languages { get; set; }
    public string Locale { get; set; }
    public string Model { get; set; }
    
    public NetworkType NetworkType { get; set; }
    
    public OsFamily OsFamily { get; set; }
    public string OsName { get; set; }
    public string OsReleaseName { get; set; }
    public string OsVersion { get; set; }
    public int ScreenDensity { get; set; }
    public int ScreenHeight { get; set; }
    public int ScreenWidth { get; set; }
    public int StorageFreeSpace { get; set; }
    public int StorageSize { get; set; }
    public string Timezone { get; set; }
    public string TimezoneAbbr { get; set; }
    public string Type { get; set; }
}


