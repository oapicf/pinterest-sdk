namespace Org.OpenAPITools.Models;


/// <summary>
/// Object containing information about the application where event occurred.
/// </summary>
public class ConversionEventAppInfo 
{
    public string AppId { get; set; }
    public string AppName { get; set; }
    public string AppPackageName { get; set; }
    public string AppStore { get; set; }
    public string AppVersion { get; set; }
    public int InstallTime { get; set; }
    public string UserAgent { get; set; }
    public int WindowHeight { get; set; }
    public int WindowWidth { get; set; }
}


