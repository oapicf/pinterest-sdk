
package org.openapitools.client.model


case class ProductGroupPromotion (
    /* ID of the ad group the product group belongs to. */
    _adGroupId: Option[String],
    /* The bid in micro currency. */
    _bidInMicroCurrency: Option[Integer],
    /* ID of the catalogs product group that this product group promotion references */
    _catalogProductGroupId: Option[String],
    /* Catalogs product group name */
    _catalogProductGroupName: Option[String],
    /* Collections ad header type */
    _collectionsHeaderType: Option[String],
    /* Collections Hero Destination Url */
    _collectionsHeroDestinationUrl: Option[String],
    /* Hero Pin ID if this PG is promoted as a Collection */
    _collectionsHeroPinId: Option[String],
    _creativeType: Option[CreativeType],
    /* Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE */
    _customizableCtaType: Option[String],
    /* The full product group definition path */
    _definition: Option[String],
    _gridClickType: Option[GridClickType],
    /* ID of the product group promotion. */
    _id: Option[String],
    /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    _included: Option[Boolean],
    /* Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. */
    _isGenerateBackground: Option[Boolean],
    /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    _isMdl: Option[Boolean],
    /* The parent Product Group ID of this Product Group */
    _parentId: Option[String],
    /* Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. */
    _preferredMediaType: Option[String],
    /* The definition of the product group, relative to its parent - an attribute name/value pair */
    _relativeDefinition: Option[String],
    /* The ad image tag selected for the product group promotion. */
    _selectedImageTag: Option[String],
    /* The ad video tag selected for the product group promotion. */
    _selectedVideoTag: Option[String],
    /* Slideshow Collections Description */
    _slideshowCollectionsDescription: Option[String],
    /* Slideshow Collections Title */
    _slideshowCollectionsTitle: Option[String],
    _status: Option[EntityStatus],
    /* Tracking template for proudct group promotions. 4000 limit */
    _trackingUrl: Option[String]
)
object ProductGroupPromotion {
    def toStringBody(var_adGroupId: Object, var_bidInMicroCurrency: Object, var_catalogProductGroupId: Object, var_catalogProductGroupName: Object, var_collectionsHeaderType: Object, var_collectionsHeroDestinationUrl: Object, var_collectionsHeroPinId: Object, var_creativeType: Object, var_customizableCtaType: Object, var_definition: Object, var_gridClickType: Object, var_id: Object, var_included: Object, var_isGenerateBackground: Object, var_isMdl: Object, var_parentId: Object, var_preferredMediaType: Object, var_relativeDefinition: Object, var_selectedImageTag: Object, var_selectedVideoTag: Object, var_slideshowCollectionsDescription: Object, var_slideshowCollectionsTitle: Object, var_status: Object, var_trackingUrl: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId,"bidInMicroCurrency":$var_bidInMicroCurrency,"catalogProductGroupId":$var_catalogProductGroupId,"catalogProductGroupName":$var_catalogProductGroupName,"collectionsHeaderType":$var_collectionsHeaderType,"collectionsHeroDestinationUrl":$var_collectionsHeroDestinationUrl,"collectionsHeroPinId":$var_collectionsHeroPinId,"creativeType":$var_creativeType,"customizableCtaType":$var_customizableCtaType,"definition":$var_definition,"gridClickType":$var_gridClickType,"id":$var_id,"included":$var_included,"isGenerateBackground":$var_isGenerateBackground,"isMdl":$var_isMdl,"parentId":$var_parentId,"preferredMediaType":$var_preferredMediaType,"relativeDefinition":$var_relativeDefinition,"selectedImageTag":$var_selectedImageTag,"selectedVideoTag":$var_selectedVideoTag,"slideshowCollectionsDescription":$var_slideshowCollectionsDescription,"slideshowCollectionsTitle":$var_slideshowCollectionsTitle,"status":$var_status,"trackingUrl":$var_trackingUrl
        | }
        """.stripMargin
}
