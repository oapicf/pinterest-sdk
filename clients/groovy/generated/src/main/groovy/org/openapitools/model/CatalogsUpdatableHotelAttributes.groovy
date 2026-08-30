package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelGuestRatings;

@Canonical
class CatalogsUpdatableHotelAttributes {
    /* Hotel address */
    CatalogsHotelAddress address
    /* Base price of the hotel room per night followed by the ISO currency code */
    String basePrice
    /* The brand to which this hotel belongs to. */
    String brand
    /* The type of property. The category can be any type of internal description desired. */
    String category
    /* Custom grouping of hotels */
    String customLabel0
    /* Custom grouping of hotels */
    String customLabel1
    /* Custom grouping of hotels */
    String customLabel2
    /* Custom grouping of hotels */
    String customLabel3
    /* Custom grouping of hotels */
    String customLabel4
    /* Brief description of the hotel. */
    String description
    /* If specified, you must provide all properties */
    CatalogsHotelGuestRatings guestRatings
    /* Latitude of the hotel. */
    BigDecimal latitude
    /* Link to the product page */
    String link
    /* Longitude of the hotel. */
    BigDecimal longitude
    /* The hotel's name. */
    String name
    /* A list of neighborhoods where the hotel is located */
    List<String> neighborhood
    /* Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. */
    String salePrice
}
