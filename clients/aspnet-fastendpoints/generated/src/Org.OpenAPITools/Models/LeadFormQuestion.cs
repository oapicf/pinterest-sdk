namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LeadFormQuestion 
{
    
    public LeadFormQuestionFieldType? CustomQuestionFieldType { get; set; }
    public string CustomQuestionLabel { get; set; }
    public List<string> CustomQuestionOptions { get; set; }
    
    public LeadFormQuestionType QuestionType { get; set; }
}


