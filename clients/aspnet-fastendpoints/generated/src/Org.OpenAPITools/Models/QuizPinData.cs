namespace Org.OpenAPITools.Models;


/// <summary>
/// This field includes all quiz data including questions, options, and results.
/// </summary>
public class QuizPinData 
{
    public List<QuizPinQuestion> Questions { get; set; }
    public List<QuizPinResult> Results { get; set; }
    public QuizPinResult TieBreakerCustomResult { get; set; }
    
    public TieBreakerType TieBreakerType { get; set; }
}


