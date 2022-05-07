using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Catalogs Catalogs Feed object
  /// </summary>
  [DataContract]
  public class CatalogsFeed {
    /// <summary>
    /// Gets or Sets CreatedAt
    /// </summary>
    [DataMember(Name="created_at", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_at")]
    public DateTime? CreatedAt { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Gets or Sets UpdatedAt
    /// </summary>
    [DataMember(Name="updated_at", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_at")]
    public DateTime? UpdatedAt { get; set; }

    /// <summary>
    /// Gets or Sets DefaultCountry
    /// </summary>
    [DataMember(Name="default_country", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_country")]
    public Country DefaultCountry { get; set; }

    /// <summary>
    /// Gets or Sets DefaultAvailability
    /// </summary>
    [DataMember(Name="default_availability", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_availability")]
    public ProductAvailabilityType DefaultAvailability { get; set; }

    /// <summary>
    /// Gets or Sets DefaultCurrency
    /// </summary>
    [DataMember(Name="default_currency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_currency")]
    public NullableCurrency DefaultCurrency { get; set; }

    /// <summary>
    /// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
    /// </summary>
    /// <value>A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Format
    /// </summary>
    [DataMember(Name="format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "format")]
    public CatalogsFormat Format { get; set; }

    /// <summary>
    /// The locale used within a feed for product descriptions.
    /// </summary>
    /// <value>The locale used within a feed for product descriptions.</value>
    [DataMember(Name="default_locale", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_locale")]
    public string DefaultLocale { get; set; }

    /// <summary>
    /// Gets or Sets Credentials
    /// </summary>
    [DataMember(Name="credentials", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "credentials")]
    public CatalogsFeedCredentials Credentials { get; set; }

    /// <summary>
    /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    /// </summary>
    /// <value>The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.</value>
    [DataMember(Name="location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "location")]
    public string Location { get; set; }

    /// <summary>
    /// Gets or Sets PreferredProcessingSchedule
    /// </summary>
    [DataMember(Name="preferred_processing_schedule", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preferred_processing_schedule")]
    public CatalogsFeedProcessingSchedule PreferredProcessingSchedule { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public CatalogsStatus Status { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeed {\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
      sb.Append("  DefaultCountry: ").Append(DefaultCountry).Append("\n");
      sb.Append("  DefaultAvailability: ").Append(DefaultAvailability).Append("\n");
      sb.Append("  DefaultCurrency: ").Append(DefaultCurrency).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Format: ").Append(Format).Append("\n");
      sb.Append("  DefaultLocale: ").Append(DefaultLocale).Append("\n");
      sb.Append("  Credentials: ").Append(Credentials).Append("\n");
      sb.Append("  Location: ").Append(Location).Append("\n");
      sb.Append("  PreferredProcessingSchedule: ").Append(PreferredProcessingSchedule).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
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
