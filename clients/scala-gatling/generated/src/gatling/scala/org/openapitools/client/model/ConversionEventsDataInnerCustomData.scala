
package org.openapitools.client.model


case class ConversionEventsDataInnerCustomData (
    /* The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. */
    _currency: Option[String],
    /* Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. */
    _value: Option[String],
    /* List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    _contentIds: Option[List[String]],
    /* The name of the page or product associated with the event. */
    _contentName: Option[String],
    /* The category of the content associated with the event. */
    _contentCategory: Option[String],
    /* The brand of the content associated with the event. */
    _contentBrand: Option[String],
    /* A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    _contents: Option[List[ConversionEventsDataInnerCustomDataContentsInner]],
    /* Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    _numItems: Option[Long],
    /* The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. */
    _orderId: Option[String],
    /* The search string related to the user conversion event. */
    _searchString: Option[String],
    /* Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up. */
    _optOutType: Option[String],
    /* Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. */
    _np: Option[String]
)
object ConversionEventsDataInnerCustomData {
    def toStringBody(var_currency: Object, var_value: Object, var_contentIds: Object, var_contentName: Object, var_contentCategory: Object, var_contentBrand: Object, var_contents: Object, var_numItems: Object, var_orderId: Object, var_searchString: Object, var_optOutType: Object, var_np: Object) =
        s"""
        | {
        | "currency":$var_currency,"value":$var_value,"contentIds":$var_contentIds,"contentName":$var_contentName,"contentCategory":$var_contentCategory,"contentBrand":$var_contentBrand,"contents":$var_contents,"numItems":$var_numItems,"orderId":$var_orderId,"searchString":$var_searchString,"optOutType":$var_optOutType,"np":$var_np
        | }
        """.stripMargin
}
