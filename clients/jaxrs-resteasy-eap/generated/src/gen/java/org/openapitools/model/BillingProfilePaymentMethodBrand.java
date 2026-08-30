package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum BillingProfilePaymentMethodBrand {
  UNKNOWN,
  VISA,
  MASTERCARD,
  AMERICAN_EXPRESS,
  DISCOVER,
  SOFORT,
  DINERS_CLUB,
  ELO,
  CARTE_BANCAIRE;
}
