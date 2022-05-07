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
  public class ProductType4Filter {
    /// <summary>
    /// Gets or Sets PRODUCTTYPE4
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_4", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_4")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE4 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ProductType4Filter {\n");
      sb.Append("  PRODUCTTYPE4: ").Append(PRODUCTTYPE4).Append("\n");
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
