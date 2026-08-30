namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LeadFormBatchUpdate 
{
    public string CompletionMessage { get; set; }
    public string DisclosureLanguage { get; set; }
    public bool HasAcceptedTerms { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    public List<LeadFormPolicyLink> PolicyLinks { get; set; }
    public string PrivacyPolicyLink { get; set; }
    public List<LeadFormQuestion> Questions { get; set; }
    
    public LeadFormStatus Status { get; set; }
}


