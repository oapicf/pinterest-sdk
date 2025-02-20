/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordsCommon;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * KeywordsRequest
 */
@JsonPropertyOrder({
  KeywordsRequest.JSON_PROPERTY_KEYWORDS,
  KeywordsRequest.JSON_PROPERTY_PARENT_ID
})
@JsonTypeName("KeywordsRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class KeywordsRequest {
    public static final String JSON_PROPERTY_KEYWORDS = "keywords";
    private List<@Valid KeywordsCommon> keywords = new ArrayList<>();

    public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
    private String parentId;

    public KeywordsRequest(List<@Valid KeywordsCommon> keywords, String parentId) {
        this.keywords = keywords;
        this.parentId = parentId;
    }

    public KeywordsRequest keywords(List<@Valid KeywordsCommon> keywords) {
        this.keywords = keywords;
        return this;
    }

    public KeywordsRequest addKeywordsItem(KeywordsCommon keywordsItem) {
        this.keywords.add(keywordsItem);
        return this;
    }

    /**
     * Keyword JSON array. Each array element has 3 fields
     * @return keywords
     */
    @NotNull
    @Schema(name = "keywords", description = "Keyword JSON array. Each array element has 3 fields", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_KEYWORDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid KeywordsCommon> getKeywords() {
        return keywords;
    }

    @JsonProperty(JSON_PROPERTY_KEYWORDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setKeywords(List<@Valid KeywordsCommon> keywords) {
        this.keywords = keywords;
    }

    public KeywordsRequest parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Keyword parent entity ID (advertiser, campaign, ad group).
     * @return parentId
     */
    @NotNull
    @Pattern(regexp="^((AG)|C)?\\d+$")
    @Schema(name = "parent_id", example = "383791336903426391", description = "Keyword parent entity ID (advertiser, campaign, ad group).", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_PARENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getParentId() {
        return parentId;
    }

    @JsonProperty(JSON_PROPERTY_PARENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeywordsRequest keywordsRequest = (KeywordsRequest) o;
        return Objects.equals(this.keywords, keywordsRequest.keywords) &&
            Objects.equals(this.parentId, keywordsRequest.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywords, parentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsRequest {\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

