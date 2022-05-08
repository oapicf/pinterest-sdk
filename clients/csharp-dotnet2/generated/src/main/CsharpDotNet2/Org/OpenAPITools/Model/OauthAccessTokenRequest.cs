using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Describes the valid schema for possible OAuth access token requests.
  /// </summary>
  [DataContract]
  public class OauthAccessTokenRequest {
    /// <summary>
    /// Gets or Sets GrantType
    /// </summary>
    [DataMember(Name="grant_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "grant_type")]
    public string GrantType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OauthAccessTokenRequest {\n");
      sb.Append("  GrantType: ").Append(GrantType).Append("\n");
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
