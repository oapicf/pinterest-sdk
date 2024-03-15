#' @docType class
#' @title UpdateMaskFieldType
#' @description UpdateMaskFieldType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateMaskFieldType <- R6::R6Class(
  "UpdateMaskFieldType",
  public = list(
    #' Initialize a new UpdateMaskFieldType class.
    #'
    #' @description
    #' Initialize a new UpdateMaskFieldType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_UpdateMaskFieldType()

      stopifnot(length(val) == 1L)

      if (!val %in% enumvec)
          stop("Use one of the valid values: ",
              paste0(enumvec, collapse = ", "))
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateMaskFieldType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of UpdateMaskFieldType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateMaskFieldType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMaskFieldType
    #' @export
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateMaskFieldType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of UpdateMaskFieldType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateMaskFieldType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMaskFieldType
    #' @export
    fromJSONString = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    }
  ),
  private = list(
    value = NULL
  )
)

# add to utils.R
.parse_UpdateMaskFieldType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]")
  unlist(strsplit(res, ", "))
}

