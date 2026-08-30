
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class LeadsExportCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public LeadsExportsCreate leadsExportsCreate { get; set; }
}
public class LeadsExportGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// lead_export_id token returned from the create a lead export endpoint
    /// </summary>
    [FastEndpoints.BindFrom("leads_export_id")]
    public string LeadsExportId { get; set; }
}


