/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class SSIOEditInsertionOrderRequest : IEquatable<SSIOEditInsertionOrderRequest>
    {
        /// <summary>
        /// Starting date of time period. Format: YYYY-MM-DD
        /// </summary>
        /// <value>Starting date of time period. Format: YYYY-MM-DD</value>
        /* <example>2020-12-20</example> */
        [RegularExpression("^(\\d{4})-(\\d{2})-(\\d{2})$")]
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        public string StartDate { get; set; }

        /// <summary>
        /// End date of time period. Format: YYYY-MM-DD
        /// </summary>
        /// <value>End date of time period. Format: YYYY-MM-DD</value>
        /* <example>2020-12-20</example> */
        [RegularExpression("^(\\d{4})-(\\d{2})-(\\d{2})$")]
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        public string EndDate { get; set; }

        /// <summary>
        /// The po number
        /// </summary>
        /// <value>The po number</value>
        [DataMember(Name="po_number", EmitDefaultValue=false)]
        public string PoNumber { get; set; }

        /// <summary>
        /// If Budget order line, the budget amount.
        /// </summary>
        /// <value>If Budget order line, the budget amount.</value>
        /* <example>5000000</example> */
        [DataMember(Name="budget_amount", EmitDefaultValue=true)]
        public decimal BudgetAmount { get; set; }

        /// <summary>
        /// The billing contact first name
        /// </summary>
        /// <value>The billing contact first name</value>
        [DataMember(Name="billing_contact_firstname", EmitDefaultValue=false)]
        public string BillingContactFirstname { get; set; }

        /// <summary>
        /// The billing contact last name
        /// </summary>
        /// <value>The billing contact last name</value>
        [DataMember(Name="billing_contact_lastname", EmitDefaultValue=false)]
        public string BillingContactLastname { get; set; }

        /// <summary>
        /// The billing contact email
        /// </summary>
        /// <value>The billing contact email</value>
        /* <example>test@example</example> */
        [DataMember(Name="billing_contact_email", EmitDefaultValue=false)]
        public string BillingContactEmail { get; set; }

        /// <summary>
        /// The media contact first name
        /// </summary>
        /// <value>The media contact first name</value>
        [DataMember(Name="media_contact_firstname", EmitDefaultValue=false)]
        public string MediaContactFirstname { get; set; }

        /// <summary>
        /// The media contact last name
        /// </summary>
        /// <value>The media contact last name</value>
        [DataMember(Name="media_contact_lastname", EmitDefaultValue=false)]
        public string MediaContactLastname { get; set; }

        /// <summary>
        /// The media contact email
        /// </summary>
        /// <value>The media contact email</value>
        /* <example>test@example</example> */
        [DataMember(Name="media_contact_email", EmitDefaultValue=false)]
        public string MediaContactEmail { get; set; }

        /// <summary>
        /// URL link for agency
        /// </summary>
        /// <value>URL link for agency</value>
        [DataMember(Name="agency_link", EmitDefaultValue=false)]
        public string AgencyLink { get; set; }

        /// <summary>
        /// The email of user submitting the insertion order
        /// </summary>
        /// <value>The email of user submitting the insertion order</value>
        /* <example>test@example</example> */
        [DataMember(Name="user_email", EmitDefaultValue=false)]
        public string UserEmail { get; set; }

        /// <summary>
        /// LineId in the Oracle DB
        /// </summary>
        /// <value>LineId in the Oracle DB</value>
        [DataMember(Name="oracle_line_id", EmitDefaultValue=false)]
        public string OracleLineId { get; set; }

        /// <summary>
        /// OrderId in SFDC
        /// </summary>
        /// <value>OrderId in SFDC</value>
        [DataMember(Name="salesforce_order_id", EmitDefaultValue=false)]
        public string SalesforceOrderId { get; set; }

        /// <summary>
        /// OrderLineId in SFDC
        /// </summary>
        /// <value>OrderLineId in SFDC</value>
        [DataMember(Name="salesforce_order_line_id", EmitDefaultValue=false)]
        public string SalesforceOrderLineId { get; set; }

        /// <summary>
        /// Ads manager OrderLineId
        /// </summary>
        /// <value>Ads manager OrderLineId</value>
        [DataMember(Name="ads_manager_order_line_id", EmitDefaultValue=false)]
        public string AdsManagerOrderLineId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SSIOEditInsertionOrderRequest {\n");
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
            sb.Append("  OracleLineId: ").Append(OracleLineId).Append("\n");
            sb.Append("  SalesforceOrderId: ").Append(SalesforceOrderId).Append("\n");
            sb.Append("  SalesforceOrderLineId: ").Append(SalesforceOrderLineId).Append("\n");
            sb.Append("  AdsManagerOrderLineId: ").Append(AdsManagerOrderLineId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((SSIOEditInsertionOrderRequest)obj);
        }

        /// <summary>
        /// Returns true if SSIOEditInsertionOrderRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of SSIOEditInsertionOrderRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SSIOEditInsertionOrderRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
                ) && 
                (
                    EndDate == other.EndDate ||
                    EndDate != null &&
                    EndDate.Equals(other.EndDate)
                ) && 
                (
                    PoNumber == other.PoNumber ||
                    PoNumber != null &&
                    PoNumber.Equals(other.PoNumber)
                ) && 
                (
                    BudgetAmount == other.BudgetAmount ||
                    
                    BudgetAmount.Equals(other.BudgetAmount)
                ) && 
                (
                    BillingContactFirstname == other.BillingContactFirstname ||
                    BillingContactFirstname != null &&
                    BillingContactFirstname.Equals(other.BillingContactFirstname)
                ) && 
                (
                    BillingContactLastname == other.BillingContactLastname ||
                    BillingContactLastname != null &&
                    BillingContactLastname.Equals(other.BillingContactLastname)
                ) && 
                (
                    BillingContactEmail == other.BillingContactEmail ||
                    BillingContactEmail != null &&
                    BillingContactEmail.Equals(other.BillingContactEmail)
                ) && 
                (
                    MediaContactFirstname == other.MediaContactFirstname ||
                    MediaContactFirstname != null &&
                    MediaContactFirstname.Equals(other.MediaContactFirstname)
                ) && 
                (
                    MediaContactLastname == other.MediaContactLastname ||
                    MediaContactLastname != null &&
                    MediaContactLastname.Equals(other.MediaContactLastname)
                ) && 
                (
                    MediaContactEmail == other.MediaContactEmail ||
                    MediaContactEmail != null &&
                    MediaContactEmail.Equals(other.MediaContactEmail)
                ) && 
                (
                    AgencyLink == other.AgencyLink ||
                    AgencyLink != null &&
                    AgencyLink.Equals(other.AgencyLink)
                ) && 
                (
                    UserEmail == other.UserEmail ||
                    UserEmail != null &&
                    UserEmail.Equals(other.UserEmail)
                ) && 
                (
                    OracleLineId == other.OracleLineId ||
                    OracleLineId != null &&
                    OracleLineId.Equals(other.OracleLineId)
                ) && 
                (
                    SalesforceOrderId == other.SalesforceOrderId ||
                    SalesforceOrderId != null &&
                    SalesforceOrderId.Equals(other.SalesforceOrderId)
                ) && 
                (
                    SalesforceOrderLineId == other.SalesforceOrderLineId ||
                    SalesforceOrderLineId != null &&
                    SalesforceOrderLineId.Equals(other.SalesforceOrderLineId)
                ) && 
                (
                    AdsManagerOrderLineId == other.AdsManagerOrderLineId ||
                    AdsManagerOrderLineId != null &&
                    AdsManagerOrderLineId.Equals(other.AdsManagerOrderLineId)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    if (PoNumber != null)
                    hashCode = hashCode * 59 + PoNumber.GetHashCode();
                    
                    hashCode = hashCode * 59 + BudgetAmount.GetHashCode();
                    if (BillingContactFirstname != null)
                    hashCode = hashCode * 59 + BillingContactFirstname.GetHashCode();
                    if (BillingContactLastname != null)
                    hashCode = hashCode * 59 + BillingContactLastname.GetHashCode();
                    if (BillingContactEmail != null)
                    hashCode = hashCode * 59 + BillingContactEmail.GetHashCode();
                    if (MediaContactFirstname != null)
                    hashCode = hashCode * 59 + MediaContactFirstname.GetHashCode();
                    if (MediaContactLastname != null)
                    hashCode = hashCode * 59 + MediaContactLastname.GetHashCode();
                    if (MediaContactEmail != null)
                    hashCode = hashCode * 59 + MediaContactEmail.GetHashCode();
                    if (AgencyLink != null)
                    hashCode = hashCode * 59 + AgencyLink.GetHashCode();
                    if (UserEmail != null)
                    hashCode = hashCode * 59 + UserEmail.GetHashCode();
                    if (OracleLineId != null)
                    hashCode = hashCode * 59 + OracleLineId.GetHashCode();
                    if (SalesforceOrderId != null)
                    hashCode = hashCode * 59 + SalesforceOrderId.GetHashCode();
                    if (SalesforceOrderLineId != null)
                    hashCode = hashCode * 59 + SalesforceOrderLineId.GetHashCode();
                    if (AdsManagerOrderLineId != null)
                    hashCode = hashCode * 59 + AdsManagerOrderLineId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SSIOEditInsertionOrderRequest left, SSIOEditInsertionOrderRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SSIOEditInsertionOrderRequest left, SSIOEditInsertionOrderRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
