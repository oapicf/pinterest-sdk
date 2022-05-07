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
  public class GoogleProductCategory2Filter {
    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY2
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_2")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY2 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class GoogleProductCategory2Filter {\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY2: ").Append(GOOGLEPRODUCTCATEGORY2).Append("\n");
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
