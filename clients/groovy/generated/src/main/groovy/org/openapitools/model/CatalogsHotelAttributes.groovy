package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelAttributesAllOfMainImage;
import org.openapitools.model.CatalogsHotelGuestRatings;

@Canonical
class CatalogsHotelAttributes {
    /* The hotel's name. */
    String name
    /* Link to the product page */
    String link
    /* Brief description of the hotel. */
    String description
    /* The brand to which this hotel belongs to. */
    String brand
    /* Latitude of the hotel. */
    BigDecimal latitude
    /* Longitude of the hotel. */
    BigDecimal longitude
    /* A list of neighborhoods where the hotel is located */
    List<String> neighborhood
    
    CatalogsHotelAddress address
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
    /* The type of property. The category can be any type of internal description desired. */
    String category
    /* Base price of the hotel room per night followed by the ISO currency code */
    String basePrice
    /* Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. */
    String salePrice
    
    CatalogsHotelGuestRatings guestRatings
    
    CatalogsHotelAttributesAllOfMainImage mainImage
    /* <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p> */
    List<String> additionalImageLink
}
