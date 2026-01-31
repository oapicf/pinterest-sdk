#' Create a new PromotionTemplateValue
#'
#' @description
#' PromotionTemplateValue Class
#'
#' @docType class
#' @title PromotionTemplateValue
#' @description PromotionTemplateValue Class
#' @format An \code{R6Class} generator object
#' @field amount Numeric value. numeric [optional]
#' @field currency_code  \link{Currency} [optional]
#' @field custom_text Custom text. character [optional]
#' @field percent Percent value. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromotionTemplateValue <- R6::R6Class(
  "PromotionTemplateValue",
  public = list(
    `amount` = NULL,
    `currency_code` = NULL,
    `custom_text` = NULL,
    `percent` = NULL,

    #' @description
    #' Initialize a new PromotionTemplateValue class.
    #'
    #' @param amount Numeric value.
    #' @param currency_code currency_code
    #' @param custom_text Custom text.
    #' @param percent Percent value.
    #' @param ... Other optional arguments.
    initialize = function(`amount` = NULL, `currency_code` = NULL, `custom_text` = NULL, `percent` = NULL, ...) {
      if (!is.null(`amount`)) {
        self$`amount` <- `amount`
      }
      if (!is.null(`currency_code`)) {
        if (!(`currency_code` %in% c())) {
          stop(paste("Error! \"", `currency_code`, "\" cannot be assigned to `currency_code`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency_code`))
        self$`currency_code` <- `currency_code`
      }
      if (!is.null(`custom_text`)) {
        if (!(is.character(`custom_text`) && length(`custom_text`) == 1)) {
          stop(paste("Error! Invalid data for `custom_text`. Must be a string:", `custom_text`))
        }
        self$`custom_text` <- `custom_text`
      }
      if (!is.null(`percent`)) {
        self$`percent` <- `percent`
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
    #' @return PromotionTemplateValue as a base R list.
    #' @examples
    #' # convert array of PromotionTemplateValue (x) to a data frame
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
    #' Convert PromotionTemplateValue to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PromotionTemplateValueObject <- list()
      if (!is.null(self$`amount`)) {
        PromotionTemplateValueObject[["amount"]] <-
          self$`amount`
      }
      if (!is.null(self$`currency_code`)) {
        PromotionTemplateValueObject[["currency_code"]] <-
          self$`currency_code`$toSimpleType()
      }
      if (!is.null(self$`custom_text`)) {
        PromotionTemplateValueObject[["custom_text"]] <-
          self$`custom_text`
      }
      if (!is.null(self$`percent`)) {
        PromotionTemplateValueObject[["percent"]] <-
          self$`percent`
      }
      return(PromotionTemplateValueObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PromotionTemplateValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromotionTemplateValue
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`amount`)) {
        self$`amount` <- this_object$`amount`
      }
      if (!is.null(this_object$`currency_code`)) {
        `currency_code_object` <- Currency$new()
        `currency_code_object`$fromJSON(jsonlite::toJSON(this_object$`currency_code`, auto_unbox = TRUE, digits = NA))
        self$`currency_code` <- `currency_code_object`
      }
      if (!is.null(this_object$`custom_text`)) {
        self$`custom_text` <- this_object$`custom_text`
      }
      if (!is.null(this_object$`percent`)) {
        self$`percent` <- this_object$`percent`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PromotionTemplateValue in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PromotionTemplateValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromotionTemplateValue
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`amount` <- this_object$`amount`
      self$`currency_code` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency_code`, auto_unbox = TRUE, digits = NA))
      self$`custom_text` <- this_object$`custom_text`
      self$`percent` <- this_object$`percent`
      self
    },

    #' @description
    #' Validate JSON input with respect to PromotionTemplateValue and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PromotionTemplateValue
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# PromotionTemplateValue$unlock()
#
## Below is an example to define the print function
# PromotionTemplateValue$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromotionTemplateValue$lock()

