package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BillingProfileCardType;
import org.openapitools.model.BillingProfilePaymentMethodBrand;
import org.openapitools.model.BillingProfileStatus;
import org.openapitools.model.BillingType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BillingProfilesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingProfilesResponse {

  private String advertiserId;

  private BillingType billingType;

  private BillingProfileCardType cardType;

  private String id;

  private BillingProfilePaymentMethodBrand paymentMethodBrand;

  private BillingProfileStatus status;

  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Advertiser ID of the billing.
   * @return advertiserId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "advertiser_id", example = "12312451231", description = "Advertiser ID of the billing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public BillingProfilesResponse billingType(BillingType billingType) {
    this.billingType = billingType;
    return this;
  }

  /**
   * Billing type of the advertiser
   * @return billingType
   */
  @Valid 
  @Schema(name = "billing_type", example = "CREDIT_CARD", description = "Billing type of the advertiser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_type")
  public BillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

  public BillingProfilesResponse cardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Type of the card.
   * @return cardType
   */
  @Valid 
  @Schema(name = "card_type", example = "VISA", description = "Type of the card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card_type")
  public BillingProfileCardType getCardType() {
    return cardType;
  }

  public void setCardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
  }

  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Billing ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "12312451231", description = "Billing ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingProfilesResponse paymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

  /**
   * Brand of the payment method.
   * @return paymentMethodBrand
   */
  @Valid 
  @Schema(name = "payment_method_brand", example = "VISA", description = "Brand of the payment method.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment_method_brand")
  public BillingProfilePaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  public void setPaymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  public BillingProfilesResponse status(BillingProfileStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the billing.
   * @return status
   */
  @Valid 
  @Schema(name = "status", example = "INVALID", description = "Status of the billing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public BillingProfileStatus getStatus() {
    return status;
  }

  public void setStatus(BillingProfileStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingProfilesResponse billingProfilesResponse = (BillingProfilesResponse) o;
    return Objects.equals(this.advertiserId, billingProfilesResponse.advertiserId) &&
        Objects.equals(this.billingType, billingProfilesResponse.billingType) &&
        Objects.equals(this.cardType, billingProfilesResponse.cardType) &&
        Objects.equals(this.id, billingProfilesResponse.id) &&
        Objects.equals(this.paymentMethodBrand, billingProfilesResponse.paymentMethodBrand) &&
        Objects.equals(this.status, billingProfilesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, billingType, cardType, id, paymentMethodBrand, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingProfilesResponse {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

