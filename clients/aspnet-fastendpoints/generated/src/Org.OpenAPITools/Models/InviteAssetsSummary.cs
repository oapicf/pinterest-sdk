namespace Org.OpenAPITools.Models;


/// <summary>
/// Ad accounts and profiles the member/partner will be granted access to with this invite/request.
/// </summary>
public class InviteAssetsSummary 
{
    public List<InviteAssetsSummaryItem> AdAccounts { get; set; }
    public List<InviteAssetsSummaryItem> Profiles { get; set; }
}


