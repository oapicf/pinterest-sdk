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
    /// ProductGroupPromotion
    /// </summary>
    [DataContract(Name = "ProductGroupPromotion")]
    public partial class ProductGroupPromotion : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public EntityStatus? Status { get; set; }

        /// <summary>
        /// Gets or Sets CreativeType
        /// </summary>
        [DataMember(Name = "creative_type", EmitDefaultValue = false)]
        public CreativeType? CreativeType { get; set; }

        /// <summary>
        /// Gets or Sets GridClickType
        /// </summary>
        [DataMember(Name = "grid_click_type", EmitDefaultValue = true)]
        public GridClickType? GridClickType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductGroupPromotion" /> class.
        /// </summary>
        /// <param name="id">ID of the product group promotion..</param>
        /// <param name="adGroupId">ID of the ad group the product group belongs to..</param>
        /// <param name="bidInMicroCurrency">The bid in micro currency..</param>
        /// <param name="included">True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads..</param>
        /// <param name="definition">The full product group definition path.</param>
        /// <param name="relativeDefinition">The definition of the product group, relative to its parent - an attribute name/value pair.</param>
        /// <param name="parentId">The parent Product Group ID of this Product Group.</param>
        /// <param name="slideshowCollectionsTitle">Slideshow Collections Title.</param>
        /// <param name="slideshowCollectionsDescription">Slideshow Collections Description.</param>
        /// <param name="isMdl">If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog.</param>
        /// <param name="status">status.</param>
        /// <param name="trackingUrl">Tracking template for proudct group promotions. 4000 limit.</param>
        /// <param name="catalogProductGroupId">ID of the catalogs product group that this product group promotion references.</param>
        /// <param name="catalogProductGroupName">Catalogs product group name.</param>
        /// <param name="creativeType">creativeType.</param>
        /// <param name="collectionsHeroPinId">Hero Pin ID if this PG is promoted as a Collection.</param>
        /// <param name="collectionsHeroDestinationUrl">Collections Hero Destination Url.</param>
        /// <param name="gridClickType">gridClickType.</param>
        public ProductGroupPromotion(string id = default(string), string adGroupId = default(string), int? bidInMicroCurrency = default(int?), bool? included = default(bool?), string definition = default(string), string relativeDefinition = default(string), string parentId = default(string), string slideshowCollectionsTitle = default(string), string slideshowCollectionsDescription = default(string), bool? isMdl = default(bool?), EntityStatus? status = default(EntityStatus?), string trackingUrl = default(string), string catalogProductGroupId = default(string), string catalogProductGroupName = default(string), CreativeType? creativeType = default(CreativeType?), string collectionsHeroPinId = default(string), string collectionsHeroDestinationUrl = default(string), GridClickType? gridClickType = default(GridClickType?))
        {
            this.Id = id;
            this.AdGroupId = adGroupId;
            this.BidInMicroCurrency = bidInMicroCurrency;
            this.Included = included;
            this.Definition = definition;
            this.RelativeDefinition = relativeDefinition;
            this.ParentId = parentId;
            this.SlideshowCollectionsTitle = slideshowCollectionsTitle;
            this.SlideshowCollectionsDescription = slideshowCollectionsDescription;
            this.IsMdl = isMdl;
            this.Status = status;
            this.TrackingUrl = trackingUrl;
            this.CatalogProductGroupId = catalogProductGroupId;
            this.CatalogProductGroupName = catalogProductGroupName;
            this.CreativeType = creativeType;
            this.CollectionsHeroPinId = collectionsHeroPinId;
            this.CollectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
            this.GridClickType = gridClickType;
        }

        /// <summary>
        /// ID of the product group promotion.
        /// </summary>
        /// <value>ID of the product group promotion.</value>
        /// <example>2680059592705</example>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// ID of the ad group the product group belongs to.
        /// </summary>
        /// <value>ID of the ad group the product group belongs to.</value>
        /// <example>2680059592705</example>
        [DataMember(Name = "ad_group_id", EmitDefaultValue = false)]
        public string AdGroupId { get; set; }

        /// <summary>
        /// The bid in micro currency.
        /// </summary>
        /// <value>The bid in micro currency.</value>
        /// <example>14000000</example>
        [DataMember(Name = "bid_in_micro_currency", EmitDefaultValue = true)]
        public int? BidInMicroCurrency { get; set; }

        /// <summary>
        /// True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
        /// </summary>
        /// <value>True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.</value>
        /// <example>true</example>
        [DataMember(Name = "included", EmitDefaultValue = true)]
        public bool? Included { get; set; }

        /// <summary>
        /// The full product group definition path
        /// </summary>
        /// <value>The full product group definition path</value>
        /// <example>*/product_type_0&#x3D;&#39;kitchen&#39;/product_type_1&#x3D;&#39;beverage appliances&#39;</example>
        [DataMember(Name = "definition", EmitDefaultValue = true)]
        public string Definition { get; set; }

        /// <summary>
        /// The definition of the product group, relative to its parent - an attribute name/value pair
        /// </summary>
        /// <value>The definition of the product group, relative to its parent - an attribute name/value pair</value>
        /// <example>product_type_1&#x3D;&#39;beverage appliances&#39;</example>
        [DataMember(Name = "relative_definition", EmitDefaultValue = true)]
        public string RelativeDefinition { get; set; }

        /// <summary>
        /// The parent Product Group ID of this Product Group
        /// </summary>
        /// <value>The parent Product Group ID of this Product Group</value>
        /// <example>1231234</example>
        [DataMember(Name = "parent_id", EmitDefaultValue = true)]
        public string ParentId { get; set; }

        /// <summary>
        /// Slideshow Collections Title
        /// </summary>
        /// <value>Slideshow Collections Title</value>
        /// <example>slideshow title</example>
        [DataMember(Name = "slideshow_collections_title", EmitDefaultValue = true)]
        public string SlideshowCollectionsTitle { get; set; }

        /// <summary>
        /// Slideshow Collections Description
        /// </summary>
        /// <value>Slideshow Collections Description</value>
        /// <example>slideshow description</example>
        [DataMember(Name = "slideshow_collections_description", EmitDefaultValue = true)]
        public string SlideshowCollectionsDescription { get; set; }

        /// <summary>
        /// If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
        /// </summary>
        /// <value>If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog</value>
        /// <example>true</example>
        [DataMember(Name = "is_mdl", EmitDefaultValue = true)]
        public bool? IsMdl { get; set; }

        /// <summary>
        /// Tracking template for proudct group promotions. 4000 limit
        /// </summary>
        /// <value>Tracking template for proudct group promotions. 4000 limit</value>
        /// <example>https://www.pinterest.com</example>
        [DataMember(Name = "tracking_url", EmitDefaultValue = true)]
        public string TrackingUrl { get; set; }

        /// <summary>
        /// ID of the catalogs product group that this product group promotion references
        /// </summary>
        /// <value>ID of the catalogs product group that this product group promotion references</value>
        /// <example>1231235</example>
        [DataMember(Name = "catalog_product_group_id", EmitDefaultValue = true)]
        public string CatalogProductGroupId { get; set; }

        /// <summary>
        /// Catalogs product group name
        /// </summary>
        /// <value>Catalogs product group name</value>
        /// <example>catalogProductGroupName</example>
        [DataMember(Name = "catalog_product_group_name", EmitDefaultValue = true)]
        public string CatalogProductGroupName { get; set; }

        /// <summary>
        /// Hero Pin ID if this PG is promoted as a Collection
        /// </summary>
        /// <value>Hero Pin ID if this PG is promoted as a Collection</value>
        /// <example>123123</example>
        [DataMember(Name = "collections_hero_pin_id", EmitDefaultValue = true)]
        public string CollectionsHeroPinId { get; set; }

        /// <summary>
        /// Collections Hero Destination Url
        /// </summary>
        /// <value>Collections Hero Destination Url</value>
        /// <example>http://www.pinterest.com</example>
        [DataMember(Name = "collections_hero_destination_url", EmitDefaultValue = true)]
        public string CollectionsHeroDestinationUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ProductGroupPromotion {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  AdGroupId: ").Append(AdGroupId).Append("\n");
            sb.Append("  BidInMicroCurrency: ").Append(BidInMicroCurrency).Append("\n");
            sb.Append("  Included: ").Append(Included).Append("\n");
            sb.Append("  Definition: ").Append(Definition).Append("\n");
            sb.Append("  RelativeDefinition: ").Append(RelativeDefinition).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  SlideshowCollectionsTitle: ").Append(SlideshowCollectionsTitle).Append("\n");
            sb.Append("  SlideshowCollectionsDescription: ").Append(SlideshowCollectionsDescription).Append("\n");
            sb.Append("  IsMdl: ").Append(IsMdl).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  TrackingUrl: ").Append(TrackingUrl).Append("\n");
            sb.Append("  CatalogProductGroupId: ").Append(CatalogProductGroupId).Append("\n");
            sb.Append("  CatalogProductGroupName: ").Append(CatalogProductGroupName).Append("\n");
            sb.Append("  CreativeType: ").Append(CreativeType).Append("\n");
            sb.Append("  CollectionsHeroPinId: ").Append(CollectionsHeroPinId).Append("\n");
            sb.Append("  CollectionsHeroDestinationUrl: ").Append(CollectionsHeroDestinationUrl).Append("\n");
            sb.Append("  GridClickType: ").Append(GridClickType).Append("\n");
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
            if (this.Id != null) {
                // Id (string) pattern
                Regex regexId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexId.Match(this.Id).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, must match a pattern of " + regexId, new [] { "Id" });
                }
            }

            if (this.AdGroupId != null) {
                // AdGroupId (string) pattern
                Regex regexAdGroupId = new Regex(@"^(AG)?\d+$", RegexOptions.CultureInvariant);
                if (!regexAdGroupId.Match(this.AdGroupId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AdGroupId, must match a pattern of " + regexAdGroupId, new [] { "AdGroupId" });
                }
            }

            if (this.ParentId != null) {
                // ParentId (string) pattern
                Regex regexParentId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexParentId.Match(this.ParentId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ParentId, must match a pattern of " + regexParentId, new [] { "ParentId" });
                }
            }

            if (this.CatalogProductGroupId != null) {
                // CatalogProductGroupId (string) pattern
                Regex regexCatalogProductGroupId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexCatalogProductGroupId.Match(this.CatalogProductGroupId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CatalogProductGroupId, must match a pattern of " + regexCatalogProductGroupId, new [] { "CatalogProductGroupId" });
                }
            }

            if (this.CollectionsHeroPinId != null) {
                // CollectionsHeroPinId (string) pattern
                Regex regexCollectionsHeroPinId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexCollectionsHeroPinId.Match(this.CollectionsHeroPinId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CollectionsHeroPinId, must match a pattern of " + regexCollectionsHeroPinId, new [] { "CollectionsHeroPinId" });
                }
            }

            yield break;
        }
    }

}