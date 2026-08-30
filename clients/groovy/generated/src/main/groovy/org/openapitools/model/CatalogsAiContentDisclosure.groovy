package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsAiContentDisclosureLabel;

@Canonical
class CatalogsAiContentDisclosure {
    /* Disclosure labels that apply to this asset. */
    List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>()
    /* URL of the asset. Must match one of image_link, additional_image_link, or video_link. */
    String url
}
