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
    /// AuthRespondInvitesBodyInvitesInner
    /// </summary>
    [DataContract(Name = "AuthRespondInvitesBody_invites_inner")]
    public partial class AuthRespondInvitesBodyInvitesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AuthRespondInvitesBodyInvitesInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AuthRespondInvitesBodyInvitesInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AuthRespondInvitesBodyInvitesInner" /> class.
        /// </summary>
        /// <param name="action">action (required).</param>
        /// <param name="inviteId">Unique identifier of an invite. (required).</param>
        public AuthRespondInvitesBodyInvitesInner(AuthRespondInvitesBodyInvitesInnerAction action = default(AuthRespondInvitesBodyInvitesInnerAction), string inviteId = default(string))
        {
            // to ensure "action" is required (not null)
            if (action == null)
            {
                throw new ArgumentNullException("action is a required property for AuthRespondInvitesBodyInvitesInner and cannot be null");
            }
            this.Action = action;
            // to ensure "inviteId" is required (not null)
            if (inviteId == null)
            {
                throw new ArgumentNullException("inviteId is a required property for AuthRespondInvitesBodyInvitesInner and cannot be null");
            }
            this.InviteId = inviteId;
        }

        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = true)]
        public AuthRespondInvitesBodyInvitesInnerAction Action { get; set; }

        /// <summary>
        /// Unique identifier of an invite.
        /// </summary>
        /// <value>Unique identifier of an invite.</value>
        [DataMember(Name = "invite_id", IsRequired = true, EmitDefaultValue = true)]
        public string InviteId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AuthRespondInvitesBodyInvitesInner {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  InviteId: ").Append(InviteId).Append("\n");
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
            // InviteId (string) maxLength
            if (this.InviteId != null && this.InviteId.Length > 25)
            {
                yield return new ValidationResult("Invalid value for InviteId, length must be less than 25.", new [] { "InviteId" });
            }

            // InviteId (string) minLength
            if (this.InviteId != null && this.InviteId.Length < 1)
            {
                yield return new ValidationResult("Invalid value for InviteId, length must be greater than 1.", new [] { "InviteId" });
            }

            if (this.InviteId != null) {
                // InviteId (string) pattern
                Regex regexInviteId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexInviteId.Match(this.InviteId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for InviteId, must match a pattern of " + regexInviteId, new [] { "InviteId" });
                }
            }

            yield break;
        }
    }

}
