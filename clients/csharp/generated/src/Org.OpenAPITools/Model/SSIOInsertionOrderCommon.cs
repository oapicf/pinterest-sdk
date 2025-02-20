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
    /// SSIOInsertionOrderCommon
    /// </summary>
    [DataContract(Name = "SSIOInsertionOrderCommon")]
    public partial class SSIOInsertionOrderCommon : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SSIOInsertionOrderCommon" /> class.
        /// </summary>
        /// <param name="startDate">Starting date of time period. Format: YYYY-MM-DD.</param>
        /// <param name="endDate">End date of time period. Format: YYYY-MM-DD.</param>
        /// <param name="poNumber">The po number.</param>
        /// <param name="budgetAmount">If Budget order line, the budget amount..</param>
        /// <param name="billingContactFirstname">The billing contact first name.</param>
        /// <param name="billingContactLastname">The billing contact last name.</param>
        /// <param name="billingContactEmail">The billing contact email.</param>
        /// <param name="mediaContactFirstname">The media contact first name.</param>
        /// <param name="mediaContactLastname">The media contact last name.</param>
        /// <param name="mediaContactEmail">The media contact email.</param>
        /// <param name="agencyLink">URL link for agency.</param>
        /// <param name="userEmail">The email of user submitting the insertion order.</param>
        public SSIOInsertionOrderCommon(string startDate = default(string), string endDate = default(string), string poNumber = default(string), decimal budgetAmount = default(decimal), string billingContactFirstname = default(string), string billingContactLastname = default(string), string billingContactEmail = default(string), string mediaContactFirstname = default(string), string mediaContactLastname = default(string), string mediaContactEmail = default(string), string agencyLink = default(string), string userEmail = default(string))
        {
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.PoNumber = poNumber;
            this.BudgetAmount = budgetAmount;
            this.BillingContactFirstname = billingContactFirstname;
            this.BillingContactLastname = billingContactLastname;
            this.BillingContactEmail = billingContactEmail;
            this.MediaContactFirstname = mediaContactFirstname;
            this.MediaContactLastname = mediaContactLastname;
            this.MediaContactEmail = mediaContactEmail;
            this.AgencyLink = agencyLink;
            this.UserEmail = userEmail;
        }

        /// <summary>
        /// Starting date of time period. Format: YYYY-MM-DD
        /// </summary>
        /// <value>Starting date of time period. Format: YYYY-MM-DD</value>
        /*
        <example>2020-12-20</example>
        */
        [DataMember(Name = "start_date", EmitDefaultValue = false)]
        public string StartDate { get; set; }

        /// <summary>
        /// End date of time period. Format: YYYY-MM-DD
        /// </summary>
        /// <value>End date of time period. Format: YYYY-MM-DD</value>
        /*
        <example>2020-12-20</example>
        */
        [DataMember(Name = "end_date", EmitDefaultValue = false)]
        public string EndDate { get; set; }

        /// <summary>
        /// The po number
        /// </summary>
        /// <value>The po number</value>
        [DataMember(Name = "po_number", EmitDefaultValue = false)]
        public string PoNumber { get; set; }

        /// <summary>
        /// If Budget order line, the budget amount.
        /// </summary>
        /// <value>If Budget order line, the budget amount.</value>
        /*
        <example>5000000</example>
        */
        [DataMember(Name = "budget_amount", EmitDefaultValue = false)]
        public decimal BudgetAmount { get; set; }

        /// <summary>
        /// The billing contact first name
        /// </summary>
        /// <value>The billing contact first name</value>
        [DataMember(Name = "billing_contact_firstname", EmitDefaultValue = false)]
        public string BillingContactFirstname { get; set; }

        /// <summary>
        /// The billing contact last name
        /// </summary>
        /// <value>The billing contact last name</value>
        [DataMember(Name = "billing_contact_lastname", EmitDefaultValue = false)]
        public string BillingContactLastname { get; set; }

        /// <summary>
        /// The billing contact email
        /// </summary>
        /// <value>The billing contact email</value>
        /*
        <example>test@example</example>
        */
        [DataMember(Name = "billing_contact_email", EmitDefaultValue = false)]
        public string BillingContactEmail { get; set; }

        /// <summary>
        /// The media contact first name
        /// </summary>
        /// <value>The media contact first name</value>
        [DataMember(Name = "media_contact_firstname", EmitDefaultValue = false)]
        public string MediaContactFirstname { get; set; }

        /// <summary>
        /// The media contact last name
        /// </summary>
        /// <value>The media contact last name</value>
        [DataMember(Name = "media_contact_lastname", EmitDefaultValue = false)]
        public string MediaContactLastname { get; set; }

        /// <summary>
        /// The media contact email
        /// </summary>
        /// <value>The media contact email</value>
        /*
        <example>test@example</example>
        */
        [DataMember(Name = "media_contact_email", EmitDefaultValue = false)]
        public string MediaContactEmail { get; set; }

        /// <summary>
        /// URL link for agency
        /// </summary>
        /// <value>URL link for agency</value>
        [DataMember(Name = "agency_link", EmitDefaultValue = false)]
        public string AgencyLink { get; set; }

        /// <summary>
        /// The email of user submitting the insertion order
        /// </summary>
        /// <value>The email of user submitting the insertion order</value>
        /*
        <example>test@example</example>
        */
        [DataMember(Name = "user_email", EmitDefaultValue = false)]
        public string UserEmail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SSIOInsertionOrderCommon {\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  PoNumber: ").Append(PoNumber).Append("\n");
            sb.Append("  BudgetAmount: ").Append(BudgetAmount).Append("\n");
            sb.Append("  BillingContactFirstname: ").Append(BillingContactFirstname).Append("\n");
            sb.Append("  BillingContactLastname: ").Append(BillingContactLastname).Append("\n");
            sb.Append("  BillingContactEmail: ").Append(BillingContactEmail).Append("\n");
            sb.Append("  MediaContactFirstname: ").Append(MediaContactFirstname).Append("\n");
            sb.Append("  MediaContactLastname: ").Append(MediaContactLastname).Append("\n");
            sb.Append("  MediaContactEmail: ").Append(MediaContactEmail).Append("\n");
            sb.Append("  AgencyLink: ").Append(AgencyLink).Append("\n");
            sb.Append("  UserEmail: ").Append(UserEmail).Append("\n");
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
            if (this.StartDate != null) {
                // StartDate (string) pattern
                Regex regexStartDate = new Regex(@"^(\d{4})-(\d{2})-(\d{2})$", RegexOptions.CultureInvariant);
                if (!regexStartDate.Match(this.StartDate).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StartDate, must match a pattern of " + regexStartDate, new [] { "StartDate" });
                }
            }

            if (this.EndDate != null) {
                // EndDate (string) pattern
                Regex regexEndDate = new Regex(@"^(\d{4})-(\d{2})-(\d{2})$", RegexOptions.CultureInvariant);
                if (!regexEndDate.Match(this.EndDate).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for EndDate, must match a pattern of " + regexEndDate, new [] { "EndDate" });
                }
            }

            yield break;
        }
    }

}
