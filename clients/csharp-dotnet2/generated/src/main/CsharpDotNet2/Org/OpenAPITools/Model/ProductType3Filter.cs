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
  public class ProductType3Filter {
    /// <summary>
    /// Gets or Sets PRODUCTTYPE3
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_3", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_3")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE3 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ProductType3Filter {\n");
      sb.Append("  PRODUCTTYPE3: ").Append(PRODUCTTYPE3).Append("\n");
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
