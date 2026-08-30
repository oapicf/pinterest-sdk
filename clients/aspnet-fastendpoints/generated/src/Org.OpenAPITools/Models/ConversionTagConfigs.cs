namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConversionTagConfigs 
{
    public bool AemDbEnabled { get; set; } = false;
    public bool AemEnabled { get; set; } = false;
    public bool AemExternalIdEnabled { get; set; } = false;
    public bool AemFnlnEnabled { get; set; } = false;
    public bool AemGeEnabled { get; set; } = false;
    public bool AemLocEnabled { get; set; } = false;
    public bool AemPhEnabled { get; set; } = false;
    public decimal MdFrequency { get; set; } = 1M;
    public List<string> NoCodeCapiDomains { get; set; }
}


