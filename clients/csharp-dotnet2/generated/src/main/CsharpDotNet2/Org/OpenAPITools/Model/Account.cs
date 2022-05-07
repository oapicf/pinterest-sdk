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
  public class Account {
    /// <summary>
    /// Type of account
    /// </summary>
    /// <value>Type of account</value>
    [DataMember(Name="account_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "account_type")]
    public string AccountType { get; set; }

    /// <summary>
    /// Gets or Sets ProfileImage
    /// </summary>
    [DataMember(Name="profile_image", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "profile_image")]
    public string ProfileImage { get; set; }

    /// <summary>
    /// Gets or Sets WebsiteUrl
    /// </summary>
    [DataMember(Name="website_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "website_url")]
    public string WebsiteUrl { get; set; }

    /// <summary>
    /// Gets or Sets Username
    /// </summary>
    [DataMember(Name="username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "username")]
    public string Username { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Account {\n");
      sb.Append("  AccountType: ").Append(AccountType).Append("\n");
      sb.Append("  ProfileImage: ").Append(ProfileImage).Append("\n");
      sb.Append("  WebsiteUrl: ").Append(WebsiteUrl).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
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
