using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object describing an item validation event
  /// </summary>
  [DataContract]
  public class ItemValidationEvent {
    /// <summary>
    /// The attribute that the item validation event references
    /// </summary>
    /// <value>The attribute that the item validation event references</value>
    [DataMember(Name="attribute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "attribute")]
    public string Attribute { get; set; }

    /// <summary>
    /// The event code that the item validation event references
    /// </summary>
    /// <value>The event code that the item validation event references</value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public int? Code { get; set; }

    /// <summary>
    /// Title message describing the item validation event
    /// </summary>
    /// <value>Title message describing the item validation event</value>
    [DataMember(Name="message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message")]
    public string Message { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ItemValidationEvent {\n");
      sb.Append("  Attribute: ").Append(Attribute).Append("\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  Message: ").Append(Message).Append("\n");
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
