package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.KeywordUpdate;

@Canonical
class KeywordUpdateBody {
    /* Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...] */
    List<KeywordUpdate> keywords = new ArrayList<>()
}
