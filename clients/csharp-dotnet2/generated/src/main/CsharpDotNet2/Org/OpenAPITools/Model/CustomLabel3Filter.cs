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
  public class CustomLabel3Filter {
    /// <summary>
    /// Gets or Sets CUSTOMLABEL3
    /// </summary>
    [DataMember(Name="CUSTOM_LABEL_3", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CUSTOM_LABEL_3")]
    public CatalogsProductGroupMultipleStringCriteria CUSTOMLABEL3 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CustomLabel3Filter {\n");
      sb.Append("  CUSTOMLABEL3: ").Append(CUSTOMLABEL3).Append("\n");
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
