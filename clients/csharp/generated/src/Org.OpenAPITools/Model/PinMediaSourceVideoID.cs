/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
    /// Video ID-based media source
    /// </summary>
    [DataContract(Name = "PinMediaSourceVideoID")]
    public partial class PinMediaSourceVideoID : IValidatableObject
    {
        /// <summary>
        /// Defines SourceType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SourceTypeEnum
        {
            /// <summary>
            /// Enum VideoId for value: video_id
            /// </summary>
            [EnumMember(Value = "video_id")]
            VideoId = 1
        }


        /// <summary>
        /// Gets or Sets SourceType
        /// </summary>
        [DataMember(Name = "source_type", IsRequired = true, EmitDefaultValue = true)]
        public SourceTypeEnum SourceType { get; set; }
        /// <summary>
        /// Content type for cover image Base64.
        /// </summary>
        /// <value>Content type for cover image Base64.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CoverImageContentTypeEnum
        {
            /// <summary>
            /// Enum Jpeg for value: image/jpeg
            /// </summary>
            [EnumMember(Value = "image/jpeg")]
            Jpeg = 1,

            /// <summary>
            /// Enum Png for value: image/png
            /// </summary>
            [EnumMember(Value = "image/png")]
            Png = 2
        }


        /// <summary>
        /// Content type for cover image Base64.
        /// </summary>
        /// <value>Content type for cover image Base64.</value>
        [DataMember(Name = "cover_image_content_type", EmitDefaultValue = false)]
        public CoverImageContentTypeEnum? CoverImageContentType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PinMediaSourceVideoID" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PinMediaSourceVideoID() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PinMediaSourceVideoID" /> class.
        /// </summary>
        /// <param name="sourceType">sourceType (required).</param>
        /// <param name="coverImageUrl">Cover image url..</param>
        /// <param name="coverImageContentType">Content type for cover image Base64..</param>
        /// <param name="coverImageData">Cover image Base64..</param>
        /// <param name="mediaId">mediaId (required).</param>
        /// <param name="isStandard">Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. (default to true).</param>
        public PinMediaSourceVideoID(SourceTypeEnum sourceType = default(SourceTypeEnum), string coverImageUrl = default(string), CoverImageContentTypeEnum? coverImageContentType = default(CoverImageContentTypeEnum?), string coverImageData = default(string), string mediaId = default(string), bool isStandard = true)
        {
            this.SourceType = sourceType;
            // to ensure "mediaId" is required (not null)
            if (mediaId == null)
            {
                throw new ArgumentNullException("mediaId is a required property for PinMediaSourceVideoID and cannot be null");
            }
            this.MediaId = mediaId;
            this.CoverImageUrl = coverImageUrl;
            this.CoverImageContentType = coverImageContentType;
            this.CoverImageData = coverImageData;
            this.IsStandard = isStandard;
        }

        /// <summary>
        /// Cover image url.
        /// </summary>
        /// <value>Cover image url.</value>
        [DataMember(Name = "cover_image_url", EmitDefaultValue = false)]
        public string CoverImageUrl { get; set; }

        /// <summary>
        /// Cover image Base64.
        /// </summary>
        /// <value>Cover image Base64.</value>
        [DataMember(Name = "cover_image_data", EmitDefaultValue = false)]
        public string CoverImageData { get; set; }

        /// <summary>
        /// Gets or Sets MediaId
        /// </summary>
        [DataMember(Name = "media_id", IsRequired = true, EmitDefaultValue = true)]
        public string MediaId { get; set; }

        /// <summary>
        /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
        /// </summary>
        /// <value>Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.</value>
        [DataMember(Name = "is_standard", EmitDefaultValue = true)]
        public bool IsStandard { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PinMediaSourceVideoID {\n");
            sb.Append("  SourceType: ").Append(SourceType).Append("\n");
            sb.Append("  CoverImageUrl: ").Append(CoverImageUrl).Append("\n");
            sb.Append("  CoverImageContentType: ").Append(CoverImageContentType).Append("\n");
            sb.Append("  CoverImageData: ").Append(CoverImageData).Append("\n");
            sb.Append("  MediaId: ").Append(MediaId).Append("\n");
            sb.Append("  IsStandard: ").Append(IsStandard).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            if (this.MediaId != null) {
                // MediaId (string) pattern
                Regex regexMediaId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexMediaId.Match(this.MediaId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MediaId, must match a pattern of " + regexMediaId, new [] { "MediaId" });
                }
            }

            yield break;
        }
    }

}