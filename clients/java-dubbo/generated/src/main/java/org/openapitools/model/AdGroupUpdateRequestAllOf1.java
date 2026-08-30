package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.TargetingSpecOperations;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdGroupUpdateRequestAllOf1 implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.
   */
  @JsonProperty("bid_multiplier")
  private BigDecimal bidMultiplier;

  /**
   * Ad group ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * &lt;div&gt;Targeting spec operations define modifications to apply to the targeting spec.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;&lt;strong&gt;NOTE:&lt;/strong&gt; The &lt;code&gt;targeting_spec&lt;/code&gt; and &lt;code&gt;targeting_spec_operations&lt;/code&gt; cannot be sent at the same time.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;The supported operations are:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;SET&lt;/code&gt;: sets the field with the given values. If value is set to &lt;code&gt;null&lt;/code&gt;, the field will be removed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ADD&lt;/code&gt;: adds the given values to the field.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMOVE&lt;/code&gt;: removes the given values from the field.&lt;/li&gt; &lt;/ul&gt; &lt;div&gt;Note the following:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;Same items are not added and removed at the same time.&lt;/li&gt; &lt;li&gt;For a given field, only &lt;code&gt;ADD&lt;/code&gt;/&lt;code&gt;REMOVE&lt;/code&gt; or &lt;code&gt;SET&lt;/code&gt; operations are allowed, not a mix of them.&lt;/li&gt; &lt;li&gt;Only one SET operation is allowed for a given field.&lt;/li&gt; &lt;li&gt;The &lt;code&gt;AGE_BUCKET&lt;/code&gt;, &lt;code&gt;MAXIMUM_AGE&lt;/code&gt;, &lt;code&gt;MINIMUM_AGE&lt;/code&gt; and &lt;code&gt;SHOPPING_RETARGETING&lt;/code&gt; fields only support the &lt;code&gt;SET&lt;/code&gt; operation.&lt;/li&gt; &lt;/ul&gt;
   */
  @JsonProperty("targeting_spec_operations")
  private List<TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();

  /**
   * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.
   * @return bidMultiplier
   */
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  /**
   * Ad group ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * &lt;div&gt;Targeting spec operations define modifications to apply to the targeting spec.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;&lt;strong&gt;NOTE:&lt;/strong&gt; The &lt;code&gt;targeting_spec&lt;/code&gt; and &lt;code&gt;targeting_spec_operations&lt;/code&gt; cannot be sent at the same time.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;The supported operations are:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;SET&lt;/code&gt;: sets the field with the given values. If value is set to &lt;code&gt;null&lt;/code&gt;, the field will be removed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ADD&lt;/code&gt;: adds the given values to the field.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMOVE&lt;/code&gt;: removes the given values from the field.&lt;/li&gt; &lt;/ul&gt; &lt;div&gt;Note the following:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;Same items are not added and removed at the same time.&lt;/li&gt; &lt;li&gt;For a given field, only &lt;code&gt;ADD&lt;/code&gt;/&lt;code&gt;REMOVE&lt;/code&gt; or &lt;code&gt;SET&lt;/code&gt; operations are allowed, not a mix of them.&lt;/li&gt; &lt;li&gt;Only one SET operation is allowed for a given field.&lt;/li&gt; &lt;li&gt;The &lt;code&gt;AGE_BUCKET&lt;/code&gt;, &lt;code&gt;MAXIMUM_AGE&lt;/code&gt;, &lt;code&gt;MINIMUM_AGE&lt;/code&gt; and &lt;code&gt;SHOPPING_RETARGETING&lt;/code&gt; fields only support the &lt;code&gt;SET&lt;/code&gt; operation.&lt;/li&gt; &lt;/ul&gt;
   * @return targetingSpecOperations
   */
  public List<TargetingSpecOperations> getTargetingSpecOperations() {
    return targetingSpecOperations;
  }

  public void setTargetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupUpdateRequestAllOf1 adGroupUpdateRequestAllOf1 = (AdGroupUpdateRequestAllOf1) o;
    return Objects.equals(this.bidMultiplier, adGroupUpdateRequestAllOf1.bidMultiplier) &&
        Objects.equals(this.id, adGroupUpdateRequestAllOf1.id) &&
        Objects.equals(this.targetingSpecOperations, adGroupUpdateRequestAllOf1.targetingSpecOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidMultiplier, id, targetingSpecOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupUpdateRequestAllOf1 {\n");
    
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetingSpecOperations: ").append(toIndentedString(targetingSpecOperations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
