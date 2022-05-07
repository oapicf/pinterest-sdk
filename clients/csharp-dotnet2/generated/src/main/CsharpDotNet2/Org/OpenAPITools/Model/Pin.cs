using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Pin
  /// </summary>
  [DataContract]
  public class Pin {
    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Gets or Sets CreatedAt
    /// </summary>
    [DataMember(Name="created_at", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_at")]
    public DateTime? CreatedAt { get; set; }

    /// <summary>
    /// Gets or Sets Link
    /// </summary>
    [DataMember(Name="link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link")]
    public string Link { get; set; }

    /// <summary>
    /// Gets or Sets Title
    /// </summary>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Gets or Sets AltText
    /// </summary>
    [DataMember(Name="alt_text", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alt_text")]
    public string AltText { get; set; }

    /// <summary>
    /// The board to which this Pin belongs.
    /// </summary>
    /// <value>The board to which this Pin belongs.</value>
    [DataMember(Name="board_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "board_id")]
    public string BoardId { get; set; }

    /// <summary>
    /// The board section to which this Pin belongs.
    /// </summary>
    /// <value>The board section to which this Pin belongs.</value>
    [DataMember(Name="board_section_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "board_section_id")]
    public string BoardSectionId { get; set; }

    /// <summary>
    /// Gets or Sets BoardOwner
    /// </summary>
    [DataMember(Name="board_owner", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "board_owner")]
    public BoardOwner BoardOwner { get; set; }

    /// <summary>
    /// Gets or Sets Media
    /// </summary>
    [DataMember(Name="media", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "media")]
    public PinMedia Media { get; set; }

    /// <summary>
    /// Gets or Sets MediaSource
    /// </summary>
    [DataMember(Name="media_source", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "media_source")]
    public PinMediaSource MediaSource { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Pin {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  Link: ").Append(Link).Append("\n");
      sb.Append("  Title: ").Append(Title).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  AltText: ").Append(AltText).Append("\n");
      sb.Append("  BoardId: ").Append(BoardId).Append("\n");
      sb.Append("  BoardSectionId: ").Append(BoardSectionId).Append("\n");
      sb.Append("  BoardOwner: ").Append(BoardOwner).Append("\n");
      sb.Append("  Media: ").Append(Media).Append("\n");
      sb.Append("  MediaSource: ").Append(MediaSource).Append("\n");
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
