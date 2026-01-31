package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CatalogsHotelGuestRatings {
    /* Max value for the hotel rating score. */
    BigDecimal maxScore
    /* Total number of people who have rated this hotel. */
    Integer numberOfReviewers
    /* System you use for guest reviews. */
    String ratingSystem
    /* Your hotel's rating. */
    BigDecimal score
}
