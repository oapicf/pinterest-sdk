using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A request to exchange an authorization code for an access token.
  /// </summary>
  [DataContract]
  public class OauthAccessTokenRequestCode : OauthAccessTokenRequest {
    /// <summary>
    /// Gets or Sets Code
    /// </summary>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// Gets or Sets RedirectUri
    /// </summary>
    [DataMember(Name="redirect_uri", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "redirect_uri")]
    public string RedirectUri { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OauthAccessTokenRequestCode {\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  RedirectUri: ").Append(RedirectUri).Append("\n");
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
