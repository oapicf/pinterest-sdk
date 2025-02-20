/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Board
    /// </summary>
    [DataContract(Name = "Board")]
    public partial class Board : IValidatableObject
    {
        /// <summary>
        /// Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
        /// </summary>
        /// <value>Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PrivacyEnum
        {
            /// <summary>
            /// Enum PUBLIC for value: PUBLIC
            /// </summary>
            [EnumMember(Value = "PUBLIC")]
            PUBLIC = 1,

            /// <summary>
            /// Enum PROTECTED for value: PROTECTED
            /// </summary>
            [EnumMember(Value = "PROTECTED")]
            PROTECTED = 2,

            /// <summary>
            /// Enum SECRET for value: SECRET
            /// </summary>
            [EnumMember(Value = "SECRET")]
            SECRET = 3
        }


        /// <summary>
        /// Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
        /// </summary>
        /// <value>Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;</value>
        [DataMember(Name = "privacy", EmitDefaultValue = false)]
        public PrivacyEnum? Privacy { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Board" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Board() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Board" /> class.
        /// </summary>
        /// <param name="name">name (required).</param>
        /// <param name="description">description.</param>
        /// <param name="media">media.</param>
        /// <param name="privacy">Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; (default to PrivacyEnum.PUBLIC).</param>
        public Board(string name = default(string), string description = default(string), BoardMedia media = default(BoardMedia), PrivacyEnum? privacy = PrivacyEnum.PUBLIC)
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for Board and cannot be null");
            }
            this.Name = name;
            this.Description = description;
            this.Media = media;
            this.Privacy = privacy;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /*
        <example>549755885175</example>
        */
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; private set; }

        /// <summary>
        /// Returns false as Id should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeId()
        {
            return false;
        }
        /// <summary>
        /// Date and time of board creation.
        /// </summary>
        /// <value>Date and time of board creation.</value>
        /*
        <example>2020-01-01T20:10:40Z</example>
        */
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; private set; }

        /// <summary>
        /// Returns false as CreatedAt should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeCreatedAt()
        {
            return false;
        }
        /// <summary>
        /// Date and time of last board pins modified.
        /// </summary>
        /// <value>Date and time of last board pins modified.</value>
        /*
        <example>2020-01-01T20:10:40Z</example>
        */
        [DataMember(Name = "board_pins_modified_at", EmitDefaultValue = false)]
        public DateTime BoardPinsModifiedAt { get; private set; }

        /// <summary>
        /// Returns false as BoardPinsModifiedAt should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeBoardPinsModifiedAt()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        /*
        <example>Summer Recipes</example>
        */
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /*
        <example>My favorite summer recipes</example>
        */
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Count of collaborators on the board.
        /// </summary>
        /// <value>Count of collaborators on the board.</value>
        /*
        <example>17</example>
        */
        [DataMember(Name = "collaborator_count", EmitDefaultValue = false)]
        public int CollaboratorCount { get; private set; }

        /// <summary>
        /// Returns false as CollaboratorCount should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeCollaboratorCount()
        {
            return false;
        }
        /// <summary>
        /// Count of pins on the board.
        /// </summary>
        /// <value>Count of pins on the board.</value>
        /*
        <example>5</example>
        */
        [DataMember(Name = "pin_count", EmitDefaultValue = false)]
        public int PinCount { get; private set; }

        /// <summary>
        /// Returns false as PinCount should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePinCount()
        {
            return false;
        }
        /// <summary>
        /// Board follower count.
        /// </summary>
        /// <value>Board follower count.</value>
        /*
        <example>13</example>
        */
        [DataMember(Name = "follower_count", EmitDefaultValue = false)]
        public int FollowerCount { get; private set; }

        /// <summary>
        /// Returns false as FollowerCount should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeFollowerCount()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets Media
        /// </summary>
        [DataMember(Name = "media", EmitDefaultValue = false)]
        public BoardMedia Media { get; set; }

        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name = "owner", EmitDefaultValue = false)]
        public BoardOwner Owner { get; private set; }

        /// <summary>
        /// Returns false as Owner should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeOwner()
        {
            return false;
        }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Board {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  BoardPinsModifiedAt: ").Append(BoardPinsModifiedAt).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  CollaboratorCount: ").Append(CollaboratorCount).Append("\n");
            sb.Append("  PinCount: ").Append(PinCount).Append("\n");
            sb.Append("  FollowerCount: ").Append(FollowerCount).Append("\n");
            sb.Append("  Media: ").Append(Media).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  Privacy: ").Append(Privacy).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // CollaboratorCount (int) minimum
            if (this.CollaboratorCount < (int)0)
            {
                yield return new ValidationResult("Invalid value for CollaboratorCount, must be a value greater than or equal to 0.", new [] { "CollaboratorCount" });
            }

            // PinCount (int) minimum
            if (this.PinCount < (int)0)
            {
                yield return new ValidationResult("Invalid value for PinCount, must be a value greater than or equal to 0.", new [] { "PinCount" });
            }

            // FollowerCount (int) minimum
            if (this.FollowerCount < (int)0)
            {
                yield return new ValidationResult("Invalid value for FollowerCount, must be a value greater than or equal to 0.", new [] { "FollowerCount" });
            }

            yield break;
        }
    }

}
