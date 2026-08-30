
package org.openapitools.client.model


case class CatalogsUpdatableHotelAttributes (
    /* Hotel address */
    _address: Option[CatalogsHotelAddress],
    /* Base price of the hotel room per night followed by the ISO currency code */
    _basePrice: Option[String],
    /* The brand to which this hotel belongs to. */
    _brand: Option[String],
    /* The type of property. The category can be any type of internal description desired. */
    _category: Option[String],
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
    /* Brief description of the hotel. */
    _description: Option[String],
    /* If specified, you must provide all properties */
    _guestRatings: Option[CatalogsHotelGuestRatings],
    /* Latitude of the hotel. */
    _latitude: Option[Number],
    /* Link to the product page */
    _link: Option[String],
    /* Longitude of the hotel. */
    _longitude: Option[Number],
    /* The hotel's name. */
    _name: Option[String],
    /* A list of neighborhoods where the hotel is located */
    _neighborhood: Option[List[String]],
    /* Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. */
    _salePrice: Option[String]
)
object CatalogsUpdatableHotelAttributes {
    def toStringBody(var_address: Object, var_basePrice: Object, var_brand: Object, var_category: Object, var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object, var_description: Object, var_guestRatings: Object, var_latitude: Object, var_link: Object, var_longitude: Object, var_name: Object, var_neighborhood: Object, var_salePrice: Object) =
        s"""
        | {
        | "address":$var_address,"basePrice":$var_basePrice,"brand":$var_brand,"category":$var_category,"customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4,"description":$var_description,"guestRatings":$var_guestRatings,"latitude":$var_latitude,"link":$var_link,"longitude":$var_longitude,"name":$var_name,"neighborhood":$var_neighborhood,"salePrice":$var_salePrice
        | }
        """.stripMargin
}
