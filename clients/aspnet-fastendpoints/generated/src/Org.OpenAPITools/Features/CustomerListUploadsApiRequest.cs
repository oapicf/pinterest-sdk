
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CustomerListUploadsCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Customer list ID.
    /// </summary>
    [FastEndpoints.BindFrom("customer_list_id")]
    public string CustomerListId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CustomerListUploadCreateRequest customerListUploadCreateRequest { get; set; }
}
public class CustomerListUploadsGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Customer list ID.
    /// </summary>
    [FastEndpoints.BindFrom("customer_list_id")]
    public string CustomerListId { get; set; }
    /// <summary>
    /// Customer List Upload ID.
    /// </summary>
    [FastEndpoints.BindFrom("customer_list_upload_id")]
    public string CustomerListUploadId { get; set; }
}
public class CustomerListUploadsRunRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Customer list ID.
    /// </summary>
    [FastEndpoints.BindFrom("customer_list_id")]
    public string CustomerListId { get; set; }
    /// <summary>
    /// Customer List Upload ID.
    /// </summary>
    [FastEndpoints.BindFrom("customer_list_upload_id")]
    public string CustomerListUploadId { get; set; }
}


