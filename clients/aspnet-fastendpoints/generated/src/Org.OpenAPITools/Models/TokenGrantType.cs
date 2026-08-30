namespace Org.OpenAPITools.Models;

    /// <summary>
    /// The type of OAuth grant being requested.
    /// </summary>
    /// <value>The type of OAuth grant being requested.</value>
    public enum TokenGrantType
    {
        
        /// <summary>
        /// Enum AuthorizationCodeEnum for authorization_code
        /// </summary>
        AuthorizationCodeEnum = 1,
        
        /// <summary>
        /// Enum RefreshTokenEnum for refresh_token
        /// </summary>
        RefreshTokenEnum = 2,
        
        /// <summary>
        /// Enum ClientCredentialsEnum for client_credentials
        /// </summary>
        ClientCredentialsEnum = 3
    }
