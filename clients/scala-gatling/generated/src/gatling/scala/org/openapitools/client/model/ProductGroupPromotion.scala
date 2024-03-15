
package org.openapitools.client.model


case class ProductGroupPromotion (
    /* ID of the product group promotion. */
    _id: Option[String],
    /* ID of the ad group the product group belongs to. */
    _adGroupId: Option[String],
    /* The bid in micro currency. */
    _bidInMicroCurrency: Option[Integer],
    /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    _included: Option[Boolean],
    /* The full product group definition path */
    _definition: Option[String],
    /* The definition of the product group, relative to its parent - an attribute name/value pair */
    _relativeDefinition: Option[String],
    /* The parent Product Group ID of this Product Group */
    _parentId: Option[String],
    /* Slideshow Collections Title */
    _slideshowCollectionsTitle: Option[String],
    /* Slideshow Collections Description */
    _slideshowCollectionsDescription: Option[String],
    /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    _isMdl: Option[Boolean],
    _status: Option[EntityStatus],
    /* Tracking template for proudct group promotions. 4000 limit */
    _trackingUrl: Option[String],
    /* ID of the catalogs product group that this product group promotion references */
    _catalogProductGroupId: Option[String],
    /* Catalogs product group name */
    _catalogProductGroupName: Option[String],
    _creativeType: Option[CreativeType],
    /* Hero Pin ID if this PG is promoted as a Collection */
    _collectionsHeroPinId: Option[String],
    /* Collections Hero Destination Url */
    _collectionsHeroDestinationUrl: Option[String],
    _gridClickType: Option[GridClickType]
)
object ProductGroupPromotion {
    def toStringBody(var_id: Object, var_adGroupId: Object, var_bidInMicroCurrency: Object, var_included: Object, var_definition: Object, var_relativeDefinition: Object, var_parentId: Object, var_slideshowCollectionsTitle: Object, var_slideshowCollectionsDescription: Object, var_isMdl: Object, var_status: Object, var_trackingUrl: Object, var_catalogProductGroupId: Object, var_catalogProductGroupName: Object, var_creativeType: Object, var_collectionsHeroPinId: Object, var_collectionsHeroDestinationUrl: Object, var_gridClickType: Object) =
        s"""
        | {
        | "id":$var_id,"adGroupId":$var_adGroupId,"bidInMicroCurrency":$var_bidInMicroCurrency,"included":$var_included,"definition":$var_definition,"relativeDefinition":$var_relativeDefinition,"parentId":$var_parentId,"slideshowCollectionsTitle":$var_slideshowCollectionsTitle,"slideshowCollectionsDescription":$var_slideshowCollectionsDescription,"isMdl":$var_isMdl,"status":$var_status,"trackingUrl":$var_trackingUrl,"catalogProductGroupId":$var_catalogProductGroupId,"catalogProductGroupName":$var_catalogProductGroupName,"creativeType":$var_creativeType,"collectionsHeroPinId":$var_collectionsHeroPinId,"collectionsHeroDestinationUrl":$var_collectionsHeroDestinationUrl,"gridClickType":$var_gridClickType
        | }
        """.stripMargin
}
