package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CarouselSlot;

@Canonical
class PinUpdate {
    
    String altText
    /* The board to which this Pin belongs. */
    String boardId
    /* The board section to which this Pin belongs. */
    String boardSectionId
    /* Carousel Pin slots data. */
    List<CarouselSlot> carouselSlots = new ArrayList<>()
    
    String description
    
    String link
    
    String title
}
