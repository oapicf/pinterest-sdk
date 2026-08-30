
package org.openapitools.client.model


case class ConversionEventsDataItemsCustomData (
    /* The brand of the content associated with the event. */
    _contentBrand: Option[String],
    /* The category of the content associated with the event. */
    _contentCategory: Option[String],
    /* List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    _contentIds: Option[List[String]],
    /* The name of the page or product associated with the event. */
    _contentName: Option[String],
    /* A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    _contents: Option[List[ConversionEventsDataItemsCustomDataContentsItems]],
    /* The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. */
    _currency: Option[String],
    /* Only use when instructed. */
    _externalMeasurementId: Option[String],
    /* Only use when instructed. */
    _externalMeasurementVendorId: Option[Integer],
    /* Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. */
    _np: Option[String],
    /* Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    _numItems: Option[Long],
    /* Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. */
    _optOutType: Option[String],
    /* The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. */
    _orderId: Option[String],
    /* Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. */
    _predictedLtv: Option[String],
    /* The search string related to the user conversion event. */
    _searchString: Option[String],
    /* Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. */
    _value: Option[String]
)
object ConversionEventsDataItemsCustomData {
    def toStringBody(var_contentBrand: Object, var_contentCategory: Object, var_contentIds: Object, var_contentName: Object, var_contents: Object, var_currency: Object, var_externalMeasurementId: Object, var_externalMeasurementVendorId: Object, var_np: Object, var_numItems: Object, var_optOutType: Object, var_orderId: Object, var_predictedLtv: Object, var_searchString: Object, var_value: Object) =
        s"""
        | {
        | "contentBrand":$var_contentBrand,"contentCategory":$var_contentCategory,"contentIds":$var_contentIds,"contentName":$var_contentName,"contents":$var_contents,"currency":$var_currency,"externalMeasurementId":$var_externalMeasurementId,"externalMeasurementVendorId":$var_externalMeasurementVendorId,"np":$var_np,"numItems":$var_numItems,"optOutType":$var_optOutType,"orderId":$var_orderId,"predictedLtv":$var_predictedLtv,"searchString":$var_searchString,"value":$var_value
        | }
        """.stripMargin
}
