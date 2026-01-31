#' Create a new TermsOfService
#'
#' @description
#' TermsOfService Class
#'
#' @docType class
#' @title TermsOfService
#' @description TermsOfService Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id The ID of the ad account. character [optional]
#' @field has_accepted Whether the ad account has accepted terms of service. character [optional]
#' @field html The terms of service content character [optional]
#' @field id The ID of the terms of service character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TermsOfService <- R6::R6Class(
  "TermsOfService",
  public = list(
    `ad_account_id` = NULL,
    `has_accepted` = NULL,
    `html` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new TermsOfService class.
    #'
    #' @param ad_account_id The ID of the ad account.
    #' @param has_accepted Whether the ad account has accepted terms of service.
    #' @param html The terms of service content
    #' @param id The ID of the terms of service
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id` = NULL, `has_accepted` = NULL, `html` = NULL, `id` = NULL, ...) {
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`has_accepted`)) {
        if (!(is.logical(`has_accepted`) && length(`has_accepted`) == 1)) {
          stop(paste("Error! Invalid data for `has_accepted`. Must be a boolean:", `has_accepted`))
        }
        self$`has_accepted` <- `has_accepted`
      }
      if (!is.null(`html`)) {
        if (!(is.character(`html`) && length(`html`) == 1)) {
          stop(paste("Error! Invalid data for `html`. Must be a string:", `html`))
        }
        self$`html` <- `html`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
    #' @return TermsOfService as a base R list.
    #' @examples
    #' # convert array of TermsOfService (x) to a data frame
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
    #' Convert TermsOfService to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TermsOfServiceObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        TermsOfServiceObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`has_accepted`)) {
        TermsOfServiceObject[["has_accepted"]] <-
          self$`has_accepted`
      }
      if (!is.null(self$`html`)) {
        TermsOfServiceObject[["html"]] <-
          self$`html`
      }
      if (!is.null(self$`id`)) {
        TermsOfServiceObject[["id"]] <-
          self$`id`
      }
      return(TermsOfServiceObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TermsOfService
    #'
    #' @param input_json the JSON input
    #' @return the instance of TermsOfService
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`has_accepted`)) {
        self$`has_accepted` <- this_object$`has_accepted`
      }
      if (!is.null(this_object$`html`)) {
        self$`html` <- this_object$`html`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TermsOfService in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TermsOfService
    #'
    #' @param input_json the JSON input
    #' @return the instance of TermsOfService
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`has_accepted` <- this_object$`has_accepted`
      self$`html` <- this_object$`html`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to TermsOfService and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TermsOfService
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
# TermsOfService$unlock()
#
## Below is an example to define the print function
# TermsOfService$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TermsOfService$lock()

