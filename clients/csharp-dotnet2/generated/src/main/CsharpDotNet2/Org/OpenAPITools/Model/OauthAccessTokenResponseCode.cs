using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A successful OAuth access token response for the authorization code flow.
  /// </summary>
  [DataContract]
  public class OauthAccessTokenResponseCode : OauthAccessTokenResponse {
    /// <summary>
    /// Gets or Sets RefreshToken
    /// </summary>
    [DataMember(Name="refresh_token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refresh_token")]
    public string RefreshToken { get; set; }

    /// <summary>
    /// Gets or Sets RefreshTokenExpiresIn
    /// </summary>
    [DataMember(Name="refresh_token_expires_in", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refresh_token_expires_in")]
    public int? RefreshTokenExpiresIn { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OauthAccessTokenResponseCode {\n");
      sb.Append("  RefreshToken: ").Append(RefreshToken).Append("\n");
      sb.Append("  RefreshTokenExpiresIn: ").Append(RefreshTokenExpiresIn).Append("\n");
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
