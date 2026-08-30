namespace Org.OpenAPITools.Models;


/// <summary>
/// JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}  ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
/// </summary>
public class AudienceRule 
{
    public string AdAccountId { get; set; }
    public List<string> AdId { get; set; }
    public List<string> CampaignId { get; set; }
    public string Country { get; set; }
    public string CustomerListId { get; set; }
    public List<string> EngagementDomain { get; set; }
    public string EngagementType { get; set; }
    public int EngagerType { get; set; }
    public string Event { get; set; }
    public EventData EventData { get; set; }
    public Object EventSource { get; set; }
    public Object IngestionSource { get; set; }
    public List<ObjectiveType> ObjectiveType { get; set; }
    public int Percentage { get; set; }
    public List<string> PinId { get; set; }
    public bool Prefill { get; set; }
    public int RetentionDays { get; set; }
    public List<string> SeedId { get; set; }
    public List<string> Url { get; set; }
    public string VisitorSourceId { get; set; }
}


