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
  public class CatalogsProductGroupFilterKeys {
    /// <summary>
    /// Gets or Sets MIN_PRICE
    /// </summary>
    [DataMember(Name="MIN_PRICE", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "MIN_PRICE")]
    public CatalogsProductGroupPricingCriteria MIN_PRICE { get; set; }

    /// <summary>
    /// Gets or Sets MAX_PRICE
    /// </summary>
    [DataMember(Name="MAX_PRICE", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "MAX_PRICE")]
    public CatalogsProductGroupPricingCriteria MAX_PRICE { get; set; }

    /// <summary>
    /// Gets or Sets CURRENCY
    /// </summary>
    [DataMember(Name="CURRENCY", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CURRENCY")]
    public CatalogsProductGroupCurrencyCriteria CURRENCY { get; set; }

    /// <summary>
    /// Gets or Sets ITEM_ID
    /// </summary>
    [DataMember(Name="ITEM_ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ITEM_ID")]
    public CatalogsProductGroupCurrencyCriteria ITEM_ID { get; set; }

    /// <summary>
    /// Gets or Sets AVAILABILITY
    /// </summary>
    [DataMember(Name="AVAILABILITY", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AVAILABILITY")]
    public CatalogsProductGroupMultipleStringCriteria AVAILABILITY { get; set; }

    /// <summary>
    /// Gets or Sets BRAND
    /// </summary>
    [DataMember(Name="BRAND", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "BRAND")]
    public CatalogsProductGroupMultipleStringCriteria BRAND { get; set; }

    /// <summary>
    /// Gets or Sets CONDITION
    /// </summary>
    [DataMember(Name="CONDITION", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CONDITION")]
    public CatalogsProductGroupMultipleStringCriteria CONDITION { get; set; }

    /// <summary>
    /// Gets or Sets CUSTOMLABEL0
    /// </summary>
    [DataMember(Name="CUSTOM_LABEL_0", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CUSTOM_LABEL_0")]
    public CatalogsProductGroupMultipleStringCriteria CUSTOMLABEL0 { get; set; }

    /// <summary>
    /// Gets or Sets CUSTOMLABEL1
    /// </summary>
    [DataMember(Name="CUSTOM_LABEL_1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CUSTOM_LABEL_1")]
    public CatalogsProductGroupMultipleStringCriteria CUSTOMLABEL1 { get; set; }

    /// <summary>
    /// Gets or Sets CUSTOMLABEL2
    /// </summary>
    [DataMember(Name="CUSTOM_LABEL_2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CUSTOM_LABEL_2")]
    public CatalogsProductGroupMultipleStringCriteria CUSTOMLABEL2 { get; set; }

    /// <summary>
    /// Gets or Sets CUSTOMLABEL3
    /// </summary>
    [DataMember(Name="CUSTOM_LABEL_3", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CUSTOM_LABEL_3")]
    public CatalogsProductGroupMultipleStringCriteria CUSTOMLABEL3 { get; set; }

    /// <summary>
    /// Gets or Sets CUSTOMLABEL4
    /// </summary>
    [DataMember(Name="CUSTOM_LABEL_4", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CUSTOM_LABEL_4")]
    public CatalogsProductGroupMultipleStringCriteria CUSTOMLABEL4 { get; set; }

    /// <summary>
    /// Gets or Sets ITEM_GROUP_ID
    /// </summary>
    [DataMember(Name="ITEM_GROUP_ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ITEM_GROUP_ID")]
    public CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID { get; set; }

    /// <summary>
    /// Gets or Sets GENDER
    /// </summary>
    [DataMember(Name="GENDER", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GENDER")]
    public CatalogsProductGroupMultipleStringCriteria GENDER { get; set; }

    /// <summary>
    /// Gets or Sets PRODUCTTYPE4
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_4", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_4")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE4 { get; set; }

    /// <summary>
    /// Gets or Sets PRODUCTTYPE3
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_3", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_3")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE3 { get; set; }

    /// <summary>
    /// Gets or Sets PRODUCTTYPE2
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_2")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE2 { get; set; }

    /// <summary>
    /// Gets or Sets PRODUCTTYPE1
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_1")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE1 { get; set; }

    /// <summary>
    /// Gets or Sets PRODUCTTYPE0
    /// </summary>
    [DataMember(Name="PRODUCT_TYPE_0", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PRODUCT_TYPE_0")]
    public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE0 { get; set; }

    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY6
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_6", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_6")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY6 { get; set; }

    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY5
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_5", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_5")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY5 { get; set; }

    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY4
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_4", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_4")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY4 { get; set; }

    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY3
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_3", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_3")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY3 { get; set; }

    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY2
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_2")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY2 { get; set; }

    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY1
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_1")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY1 { get; set; }

    /// <summary>
    /// Gets or Sets GOOGLEPRODUCTCATEGORY0
    /// </summary>
    [DataMember(Name="GOOGLE_PRODUCT_CATEGORY_0", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_0")]
    public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY0 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsProductGroupFilterKeys {\n");
      sb.Append("  MIN_PRICE: ").Append(MIN_PRICE).Append("\n");
      sb.Append("  MAX_PRICE: ").Append(MAX_PRICE).Append("\n");
      sb.Append("  CURRENCY: ").Append(CURRENCY).Append("\n");
      sb.Append("  ITEM_ID: ").Append(ITEM_ID).Append("\n");
      sb.Append("  AVAILABILITY: ").Append(AVAILABILITY).Append("\n");
      sb.Append("  BRAND: ").Append(BRAND).Append("\n");
      sb.Append("  CONDITION: ").Append(CONDITION).Append("\n");
      sb.Append("  CUSTOMLABEL0: ").Append(CUSTOMLABEL0).Append("\n");
      sb.Append("  CUSTOMLABEL1: ").Append(CUSTOMLABEL1).Append("\n");
      sb.Append("  CUSTOMLABEL2: ").Append(CUSTOMLABEL2).Append("\n");
      sb.Append("  CUSTOMLABEL3: ").Append(CUSTOMLABEL3).Append("\n");
      sb.Append("  CUSTOMLABEL4: ").Append(CUSTOMLABEL4).Append("\n");
      sb.Append("  ITEM_GROUP_ID: ").Append(ITEM_GROUP_ID).Append("\n");
      sb.Append("  GENDER: ").Append(GENDER).Append("\n");
      sb.Append("  PRODUCTTYPE4: ").Append(PRODUCTTYPE4).Append("\n");
      sb.Append("  PRODUCTTYPE3: ").Append(PRODUCTTYPE3).Append("\n");
      sb.Append("  PRODUCTTYPE2: ").Append(PRODUCTTYPE2).Append("\n");
      sb.Append("  PRODUCTTYPE1: ").Append(PRODUCTTYPE1).Append("\n");
      sb.Append("  PRODUCTTYPE0: ").Append(PRODUCTTYPE0).Append("\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY6: ").Append(GOOGLEPRODUCTCATEGORY6).Append("\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY5: ").Append(GOOGLEPRODUCTCATEGORY5).Append("\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY4: ").Append(GOOGLEPRODUCTCATEGORY4).Append("\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY3: ").Append(GOOGLEPRODUCTCATEGORY3).Append("\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY2: ").Append(GOOGLEPRODUCTCATEGORY2).Append("\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY1: ").Append(GOOGLEPRODUCTCATEGORY1).Append("\n");
      sb.Append("  GOOGLEPRODUCTCATEGORY0: ").Append(GOOGLEPRODUCTCATEGORY0).Append("\n");
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
