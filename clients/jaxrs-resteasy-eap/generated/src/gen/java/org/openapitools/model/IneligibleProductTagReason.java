package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum IneligibleProductTagReason {
  PIN_MISSING,
  PIN_IS_PRIVATE,
  PRODUCT_METADATA_MISSING,
  PIN_NOT_FROM_VERIFIED_DOMAIN,
  PIN_NOT_FROM_SAME_USER_AS_HERO_PIN;
}
