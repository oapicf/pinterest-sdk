namespace Org.OpenAPITools.Models;


/// <summary>
/// A specific quiz inquiry.
/// </summary>
public class QuizPinQuestion 
{
    public List<QuizPinOption> Options { get; set; }
    public decimal QuestionId { get; set; }
    public string QuestionText { get; set; }
}


