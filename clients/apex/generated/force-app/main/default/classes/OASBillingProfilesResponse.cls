/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASBillingProfilesResponse
 */
public class OASBillingProfilesResponse implements OAS.MappedProperties {
    /**
     * Billing ID.
     * @return id
     */
    public String id { get; set; }

    /**
     * Type of the card.
     */
    public enum CardTypeEnum {
        UNKNOWN,
        VISA,
        MASTERCARD,
        AMERICAN_EXPRESS,
        DISCOVER,
        ELO
    }

    /**
     * Type of the card.
     * @return cardType
     */
    public CardTypeEnum cardType { get; set; }

    /**
     * Status of the billing.
     */
    public enum StatusEnum {
        UNSPECIFIED,
        VALID,
        INVALID,
        PENDING,
        DELETED,
        SECONDARY,
        PENDING_SECONDARY
    }

    /**
     * Status of the billing.
     * @return status
     */
    public StatusEnum status { get; set; }

    /**
     * Advertiser ID of the billing.
     * @return advertiserId
     */
    public String advertiserId { get; set; }

    /**
     * Brand of the payment method.
     */
    public enum PaymentMethodBrandEnum {
        UNKNOWN,
        VISA,
        MASTERCARD,
        AMERICAN_EXPRESS,
        DISCOVER,
        SOFORT,
        DINERS_CLUB,
        ELO,
        CARTE_BANCAIRE
    }

    /**
     * Brand of the payment method.
     * @return paymentMethodBrand
     */
    public PaymentMethodBrandEnum paymentMethodBrand { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'card_type' => 'cardType',
        'advertiser_id' => 'advertiserId',
        'payment_method_brand' => 'paymentMethodBrand'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'card_type' => 'cardType',
        'advertiser_id' => 'advertiserId',
        'payment_method_brand' => 'paymentMethodBrand'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'card_type' => 'cardType',
        'advertiser_id' => 'advertiserId',
        'payment_method_brand' => 'paymentMethodBrand'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASBillingProfilesResponse getExample() {
        OASBillingProfilesResponse billingProfilesResponse = new OASBillingProfilesResponse();
          billingProfilesResponse.id = '12312451231';
          billingProfilesResponse.cardType = CardTypeEnum.VISA;
          billingProfilesResponse.status = StatusEnum.INVALID;
          billingProfilesResponse.advertiserId = '12312451231';
          billingProfilesResponse.paymentMethodBrand = PaymentMethodBrandEnum.VISA;
        return billingProfilesResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBillingProfilesResponse) {           
            OASBillingProfilesResponse billingProfilesResponse = (OASBillingProfilesResponse) obj;
            return this.id == billingProfilesResponse.id
                && this.cardType == billingProfilesResponse.cardType
                && this.status == billingProfilesResponse.status
                && this.advertiserId == billingProfilesResponse.advertiserId
                && this.paymentMethodBrand == billingProfilesResponse.paymentMethodBrand;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (cardType == null ? 0 : System.hashCode(cardType));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        hashCode = (17 * hashCode) + (advertiserId == null ? 0 : System.hashCode(advertiserId));
        hashCode = (17 * hashCode) + (paymentMethodBrand == null ? 0 : System.hashCode(paymentMethodBrand));
        return hashCode;
    }
}

