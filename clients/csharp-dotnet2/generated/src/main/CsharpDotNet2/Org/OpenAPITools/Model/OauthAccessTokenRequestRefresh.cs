using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A request to exchange a refresh token for a new access token.
  /// </summary>
  [DataContract]
  public class OauthAccessTokenRequestRefresh : OauthAccessTokenRequest {
    /// <summary>
    /// Gets or Sets RefreshToken
    /// </summary>
    [DataMember(Name="refresh_token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refresh_token")]
    public string RefreshToken { get; set; }

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
      sb.Append("class OauthAccessTokenRequestRefresh {\n");
      sb.Append("  RefreshToken: ").Append(RefreshToken).Append("\n");
      sb.Append("  Scope: ").Append(Scope).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public  new string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
