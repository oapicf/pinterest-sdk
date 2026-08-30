namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsFeedIngestionErrors 
{
    public int ACCOUNT_FLAGGED { get; set; }
    public int FETCH_GOOGLE_SHEET_NOT_SHARED { get; set; }
    public int IMAGE_FILE_NOT_ACCESSIBLE { get; set; }
    public int IMAGE_FILE_NOT_FOUND { get; set; }
    public int IMAGE_INVALID_FILE { get; set; }
    public int IMAGE_LEVEL_INTERNAL_ERROR { get; set; }
    public int IMAGE_MALFORMED_URL { get; set; }
    public int LARGE_PRODUCT_COUNT_DECREASE { get; set; }
    public int LINE_LEVEL_INTERNAL_ERROR { get; set; }
}


