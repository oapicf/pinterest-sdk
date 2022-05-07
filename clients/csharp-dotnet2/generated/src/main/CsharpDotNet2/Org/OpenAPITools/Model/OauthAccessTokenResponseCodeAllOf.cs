using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class OauthAccessTokenResponseCodeAllOf {
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
      sb.Append("class OauthAccessTokenResponseCodeAllOf {\n");
      sb.Append("  RefreshToken: ").Append(RefreshToken).Append("\n");
      sb.Append("  RefreshTokenExpiresIn: ").Append(RefreshTokenExpiresIn).Append("\n");
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
