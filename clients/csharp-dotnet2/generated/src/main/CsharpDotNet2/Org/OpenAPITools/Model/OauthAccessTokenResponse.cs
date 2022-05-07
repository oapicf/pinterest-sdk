using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A successful OAuth access token response.
  /// </summary>
  [DataContract]
  public class OauthAccessTokenResponse {
    /// <summary>
    /// Gets or Sets ResponseType
    /// </summary>
    [DataMember(Name="response_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "response_type")]
    public string ResponseType { get; set; }

    /// <summary>
    /// Gets or Sets AccessToken
    /// </summary>
    [DataMember(Name="access_token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "access_token")]
    public string AccessToken { get; set; }

    /// <summary>
    /// Gets or Sets TokenType
    /// </summary>
    [DataMember(Name="token_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "token_type")]
    public string TokenType { get; set; }

    /// <summary>
    /// Gets or Sets ExpiresIn
    /// </summary>
    [DataMember(Name="expires_in", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expires_in")]
    public int? ExpiresIn { get; set; }

    /// <summary>
    /// Gets or Sets Scope
    /// </summary>
    [DataMember(Name="scope", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scope")]
    public string Scope { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OauthAccessTokenResponse {\n");
      sb.Append("  ResponseType: ").Append(ResponseType).Append("\n");
      sb.Append("  AccessToken: ").Append(AccessToken).Append("\n");
      sb.Append("  TokenType: ").Append(TokenType).Append("\n");
      sb.Append("  ExpiresIn: ").Append(ExpiresIn).Append("\n");
      sb.Append("  Scope: ").Append(Scope).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
