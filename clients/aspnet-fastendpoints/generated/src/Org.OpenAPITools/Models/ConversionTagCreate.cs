namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class ConversionTagCreate 
{
    public bool AemDbEnabled { get; set; } = false;
    public bool AemEnabled { get; set; } = false;
    public bool AemExternalIdEnabled { get; set; } = false;
    public bool AemFnlnEnabled { get; set; } = false;
    public bool AemGeEnabled { get; set; } = false;
    public bool AemLocEnabled { get; set; } = false;
    public bool AemPhEnabled { get; set; } = false;
    public decimal MdFrequency { get; set; } = 1M;
    public string Name { get; set; }
}


