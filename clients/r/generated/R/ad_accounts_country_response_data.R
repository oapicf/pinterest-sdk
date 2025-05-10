#' Create a new AdAccountsCountryResponseData
#'
#' @description
#' AdAccountsCountryResponseData Class
#'
#' @docType class
#' @title AdAccountsCountryResponseData
#' @description AdAccountsCountryResponseData Class
#' @format An \code{R6Class} generator object
#' @field code  \link{AdCountry} [optional]
#' @field currency Country currency. character [optional]
#' @field index Country index numeric [optional]
#' @field name Country name character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountsCountryResponseData <- R6::R6Class(
  "AdAccountsCountryResponseData",
  public = list(
    `code` = NULL,
    `currency` = NULL,
    `index` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new AdAccountsCountryResponseData class.
    #'
    #' @param code code
    #' @param currency Country currency.
    #' @param index Country index
    #' @param name Country name
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `currency` = NULL, `index` = NULL, `name` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(`code` %in% c())) {
          stop(paste("Error! \"", `code`, "\" cannot be assigned to `code`. Must be .", sep = ""))
        }
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        stopifnot(R6::is.R6(`code`))
        self$`code` <- `code`
      }
      if (!is.null(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
      }
      if (!is.null(`index`)) {
        self$`index` <- `index`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return AdAccountsCountryResponseData as a base R list.
    #' @examples
    #' # convert array of AdAccountsCountryResponseData (x) to a data frame
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
    #' Convert AdAccountsCountryResponseData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdAccountsCountryResponseDataObject <- list()
      if (!is.null(self$`code`)) {
        AdAccountsCountryResponseDataObject[["code"]] <-
          self$`code`$toSimpleType()
      }
      if (!is.null(self$`currency`)) {
        AdAccountsCountryResponseDataObject[["currency"]] <-
          self$`currency`
      }
      if (!is.null(self$`index`)) {
        AdAccountsCountryResponseDataObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`name`)) {
        AdAccountsCountryResponseDataObject[["name"]] <-
          self$`name`
      }
      return(AdAccountsCountryResponseDataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountsCountryResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsCountryResponseData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        `code_object` <- AdCountry$new()
        `code_object`$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
        self$`code` <- `code_object`
      }
      if (!is.null(this_object$`currency`)) {
        self$`currency` <- this_object$`currency`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdAccountsCountryResponseData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountsCountryResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsCountryResponseData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- AdCountry$new()$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
      self$`currency` <- this_object$`currency`
      self$`index` <- this_object$`index`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccountsCountryResponseData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountsCountryResponseData
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
# AdAccountsCountryResponseData$unlock()
#
## Below is an example to define the print function
# AdAccountsCountryResponseData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountsCountryResponseData$lock()

