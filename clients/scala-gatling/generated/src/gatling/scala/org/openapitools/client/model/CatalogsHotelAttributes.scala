
package org.openapitools.client.model


case class CatalogsHotelAttributes (
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
    _salePrice: Option[String],
    /* <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. */
    _additionalImageLink: Option[List[String]],
    /* AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. */
    _aiDisclosures: Option[List[CatalogsAiContentDisclosure]],
    /* The main hotel image */
    _mainImage: Option[CatalogsHotelMainImage]
)
object CatalogsHotelAttributes {
    def toStringBody(var_address: Object, var_basePrice: Object, var_brand: Object, var_category: Object, var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object, var_description: Object, var_guestRatings: Object, var_latitude: Object, var_link: Object, var_longitude: Object, var_name: Object, var_neighborhood: Object, var_salePrice: Object, var_additionalImageLink: Object, var_aiDisclosures: Object, var_mainImage: Object) =
        s"""
        | {
        | "address":$var_address,"basePrice":$var_basePrice,"brand":$var_brand,"category":$var_category,"customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4,"description":$var_description,"guestRatings":$var_guestRatings,"latitude":$var_latitude,"link":$var_link,"longitude":$var_longitude,"name":$var_name,"neighborhood":$var_neighborhood,"salePrice":$var_salePrice,"additionalImageLink":$var_additionalImageLink,"aiDisclosures":$var_aiDisclosures,"mainImage":$var_mainImage
        | }
        """.stripMargin
}
