/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.KeywordUpdate;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class KeywordUpdateBody {
  
  @SerializedName("keywords")
  private List<KeywordUpdate> keywords = null;

  /**
   * Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
   **/
  @ApiModelProperty(required = true, value = "Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]")
  public List<KeywordUpdate> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<KeywordUpdate> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordUpdateBody keywordUpdateBody = (KeywordUpdateBody) o;
    return (this.keywords == null ? keywordUpdateBody.keywords == null : this.keywords.equals(keywordUpdateBody.keywords));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.keywords == null ? 0: this.keywords.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordUpdateBody {\n");
    
    sb.append("  keywords: ").append(keywords).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}