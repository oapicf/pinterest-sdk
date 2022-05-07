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
  public class ProductType0Filter {
    /// <summary>
    /// Gets or Sets PRODUCTTYPE0
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_0", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_0")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE0 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ProductType0Filter {\n");
      sb.Append("  PRODUCTTYPE0: ").Append(PRODUCTTYPE0).Append("\n");
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
