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
  public class ProductType1Filter {
    /// <summary>
    /// Gets or Sets PRODUCTTYPE1
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_1")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE1 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ProductType1Filter {\n");
      sb.Append("  PRODUCTTYPE1: ").Append(PRODUCTTYPE1).Append("\n");
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
