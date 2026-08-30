package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ConversionEvent {
  PAGE_VISIT,
  SIGNUP,
  CHECKOUT,
  CUSTOM,
  VIEW_CATEGORY,
  SEARCH,
  ADD_TO_CART,
  WATCH_VIDEO,
  LEAD,
  APP_INSTALL;
}
