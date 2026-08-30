namespace Org.OpenAPITools.Models;


/// <summary>
/// User account model containing properties related to a user&#39;s account.
/// </summary>
public class Account 
{
    public string About { get; set; }
    
    public UserAccountType AccountType { get; set; }
    public int BoardCount { get; set; }
    public string BusinessName { get; set; }
    public int FollowerCount { get; set; }
    public int FollowingCount { get; set; }
    public string Id { get; set; }
    public int MonthlyViews { get; set; }
    public int PinCount { get; set; }
    public string ProfileImage { get; set; }
    public string Username { get; set; }
    public string WebsiteUrl { get; set; }
}


