namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Keyword match type
    /// </summary>
    /// <value>Keyword match type</value>
    public enum MatchType
    {
        
        /// <summary>
        /// Enum BROADEnum for BROAD
        /// </summary>
        BROADEnum = 1,
        
        /// <summary>
        /// Enum PHRASEEnum for PHRASE
        /// </summary>
        PHRASEEnum = 2,
        
        /// <summary>
        /// Enum EXACTEnum for EXACT
        /// </summary>
        EXACTEnum = 3,
        
        /// <summary>
        /// Enum EXACTNEGATIVEEnum for EXACT_NEGATIVE
        /// </summary>
        EXACTNEGATIVEEnum = 4,
        
        /// <summary>
        /// Enum PHRASENEGATIVEEnum for PHRASE_NEGATIVE
        /// </summary>
        PHRASENEGATIVEEnum = 5
    }
