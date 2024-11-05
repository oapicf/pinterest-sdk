package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum CatalogsProductGroupType {
  MERCHANT_CREATED,
  ALL_PRODUCTS,
  BEST_DEALS,
  PINNER_FAVORITES,
  TOP_SELLERS,
  BACK_IN_STOCK,
  NEW_ARRIVALS,
  SHOPIFY_COLLECTIONS,
  I2_PC;
}
