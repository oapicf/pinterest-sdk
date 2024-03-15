package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinUpdateCarouselSlotsInner;

@Canonical
class PinUpdate {
    /* Pin's alternative text. */
    String altText
    /* The id of the board to move the Pin onto. */
    String boardId
    /* <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID. */
    String boardSectionId
    /* Pin description - 800 characters maximum. */
    String description
    /* URL viewer is taken to when they click pin. */
    String link
    /* The native pin title that creators explicitly prefer to display. */
    String title
    /* Carousel Pin slots data. */
    List<PinUpdateCarouselSlotsInner> carouselSlots
    /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
    String note
}
