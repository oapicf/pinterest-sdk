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

    #' @description
    #' Initialize a new UpdateMaskFieldType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_UpdateMaskFieldType()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
      }
      private$value <- val
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert UpdateMaskFieldType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMaskFieldType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of UpdateMaskFieldType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UpdateMaskFieldType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMaskFieldType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of UpdateMaskFieldType
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
  res <- gsub("^\\[|\\]$", "", "[ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, custom_number_0, custom_number_1, custom_number_2, custom_number_3, custom_number_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values, promotion_id]")
  unlist(strsplit(res, ", "))
}

