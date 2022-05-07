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
  public class CatalogsProductGroupFiltersAnyOf {
    /// <summary>
    /// Gets or Sets AnyOf
    /// </summary>
    [DataMember(Name="any_of", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "any_of")]
    public List<CatalogsProductGroupFilterKeys> AnyOf { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsProductGroupFiltersAnyOf {\n");
      sb.Append("  AnyOf: ").Append(AnyOf).Append("\n");
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
