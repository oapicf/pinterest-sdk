package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CatalogsHotelGuestRatings {
    /* Your hotel's rating. */
    BigDecimal score
    /* Total number of people who have rated this hotel. */
    Integer numberOfReviewers
    /* Max value for the hotel rating score. */
    BigDecimal maxScore
    /* System you use for guest reviews. */
    String ratingSystem
}
