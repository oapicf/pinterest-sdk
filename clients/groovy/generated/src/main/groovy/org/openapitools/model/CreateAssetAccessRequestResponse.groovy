package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.openapitools.model.AssetAccessRequestError;

@Canonical
class CreateAssetAccessRequestResponse {
    /* A list of errors associated with the asset access requests. Will be returned if there is an error. */
    List<AssetAccessRequestError> exceptions = new ArrayList<>()
    /* An object mapping each partner id to the asset access request id. Only one request id is returned per partner. */
    Map<String, String> invites = new HashMap<>()
}
