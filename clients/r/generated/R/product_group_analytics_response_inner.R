#' Create a new ProductGroupAnalyticsResponseInner
#'
#' @description
#' ProductGroupAnalyticsResponseInner Class
#'
#' @docType class
#' @title ProductGroupAnalyticsResponseInner
#' @description ProductGroupAnalyticsResponseInner Class
#' @format An \code{R6Class} generator object
#' @field DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) character [optional]
#' @field PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to. character
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductGroupAnalyticsResponseInner <- R6::R6Class(
  "ProductGroupAnalyticsResponseInner",
  inherit = AnyType,
  public = list(
    `DATE` = NULL,
    `PRODUCT_GROUP_ID` = NULL,
    `_field_list` = c("DATE", "PRODUCT_GROUP_ID"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new ProductGroupAnalyticsResponseInner class.
    #'
    #' @param PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to.
    #' @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`PRODUCT_GROUP_ID`, `DATE` = NULL, additional_properties = NULL, ...) {
      if (!missing(`PRODUCT_GROUP_ID`)) {
        if (!(is.character(`PRODUCT_GROUP_ID`) && length(`PRODUCT_GROUP_ID`) == 1)) {
          stop(paste("Error! Invalid data for `PRODUCT_GROUP_ID`. Must be a string:", `PRODUCT_GROUP_ID`))
        }
        self$`PRODUCT_GROUP_ID` <- `PRODUCT_GROUP_ID`
      }
      if (!is.null(`DATE`)) {
        if (!is.character(`DATE`)) {
          stop(paste("Error! Invalid data for `DATE`. Must be a string:", `DATE`))
        }
        self$`DATE` <- `DATE`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return ProductGroupAnalyticsResponseInner as a base R list.
    #' @examples
    #' # convert array of ProductGroupAnalyticsResponseInner (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert ProductGroupAnalyticsResponseInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductGroupAnalyticsResponseInnerObject <- list()
      if (!is.null(self$`DATE`)) {
        ProductGroupAnalyticsResponseInnerObject[["DATE"]] <-
          self$`DATE`
      }
      if (!is.null(self$`PRODUCT_GROUP_ID`)) {
        ProductGroupAnalyticsResponseInnerObject[["PRODUCT_GROUP_ID"]] <-
          self$`PRODUCT_GROUP_ID`
      }
      for (key in names(self$additional_properties)) {
        ProductGroupAnalyticsResponseInnerObject[[key]] <- self$additional_properties[[key]]
      }

      return(ProductGroupAnalyticsResponseInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupAnalyticsResponseInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`DATE`)) {
        self$`DATE` <- this_object$`DATE`
      }
      if (!is.null(this_object$`PRODUCT_GROUP_ID`)) {
        self$`PRODUCT_GROUP_ID` <- this_object$`PRODUCT_GROUP_ID`
      }
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductGroupAnalyticsResponseInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupAnalyticsResponseInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`DATE` <- this_object$`DATE`
      self$`PRODUCT_GROUP_ID` <- this_object$`PRODUCT_GROUP_ID`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to ProductGroupAnalyticsResponseInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PRODUCT_GROUP_ID`
      if (!is.null(input_json$`PRODUCT_GROUP_ID`)) {
        if (!(is.character(input_json$`PRODUCT_GROUP_ID`) && length(input_json$`PRODUCT_GROUP_ID`) == 1)) {
          stop(paste("Error! Invalid data for `PRODUCT_GROUP_ID`. Must be a string:", input_json$`PRODUCT_GROUP_ID`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductGroupAnalyticsResponseInner: the required field `PRODUCT_GROUP_ID` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductGroupAnalyticsResponseInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `PRODUCT_GROUP_ID` is null
      if (is.null(self$`PRODUCT_GROUP_ID`)) {
        return(FALSE)
      }

      if (!str_detect(self$`PRODUCT_GROUP_ID`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `PRODUCT_GROUP_ID` is null
      if (is.null(self$`PRODUCT_GROUP_ID`)) {
        invalid_fields["PRODUCT_GROUP_ID"] <- "Non-nullable required field `PRODUCT_GROUP_ID` cannot be null."
      }

      if (!str_detect(self$`PRODUCT_GROUP_ID`, "^\\d+$")) {
        invalid_fields["PRODUCT_GROUP_ID"] <- "Invalid value for `PRODUCT_GROUP_ID`, must conform to the pattern ^\\d+$."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ProductGroupAnalyticsResponseInner$unlock()
#
## Below is an example to define the print function
# ProductGroupAnalyticsResponseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductGroupAnalyticsResponseInner$lock()

