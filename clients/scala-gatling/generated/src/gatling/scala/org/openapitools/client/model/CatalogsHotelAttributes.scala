
package org.openapitools.client.model


case class CatalogsHotelAttributes (
    /* The hotel's name. */
    _name: Option[String],
    /* Link to the product page */
    _link: Option[String],
    /* Brief description of the hotel. */
    _description: Option[String],
    /* The brand to which this hotel belongs to. */
    _brand: Option[String],
    /* Latitude of the hotel. */
    _latitude: Option[Number],
    /* Longitude of the hotel. */
    _longitude: Option[Number],
    /* A list of neighborhoods where the hotel is located */
    _neighborhood: Option[List[String]],
    _address: Option[CatalogsHotelAddress],
    /* Custom grouping of hotels */
    _customLabel0: Option[String],
    /* Custom grouping of hotels */
    _customLabel1: Option[String],
    /* Custom grouping of hotels */
    _customLabel2: Option[String],
    /* Custom grouping of hotels */
    _customLabel3: Option[String],
    /* Custom grouping of hotels */
    _customLabel4: Option[String],
    /* The type of property. The category can be any type of internal description desired. */
    _category: Option[String],
    /* Base price of the hotel room per night followed by the ISO currency code */
    _basePrice: Option[String],
    /* Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. */
    _salePrice: Option[String],
    _guestRatings: Option[CatalogsHotelGuestRatings],
    _mainImage: Option[CatalogsHotelAttributesAllOfMainImage],
    /* <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p> */
    _additionalImageLink: Option[List[String]]
)
object CatalogsHotelAttributes {
    def toStringBody(var_name: Object, var_link: Object, var_description: Object, var_brand: Object, var_latitude: Object, var_longitude: Object, var_neighborhood: Object, var_address: Object, var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object, var_category: Object, var_basePrice: Object, var_salePrice: Object, var_guestRatings: Object, var_mainImage: Object, var_additionalImageLink: Object) =
        s"""
        | {
        | "name":$var_name,"link":$var_link,"description":$var_description,"brand":$var_brand,"latitude":$var_latitude,"longitude":$var_longitude,"neighborhood":$var_neighborhood,"address":$var_address,"customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4,"category":$var_category,"basePrice":$var_basePrice,"salePrice":$var_salePrice,"guestRatings":$var_guestRatings,"mainImage":$var_mainImage,"additionalImageLink":$var_additionalImageLink
        | }
        """.stripMargin
}
