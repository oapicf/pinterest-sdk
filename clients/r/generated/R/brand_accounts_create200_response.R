#' Create a new BrandAccountsCreate200Response
#'
#' @description
#' BrandAccountsCreate200Response Class
#'
#' @docType class
#' @title BrandAccountsCreate200Response
#' @description BrandAccountsCreate200Response Class
#' @format An \code{R6Class} generator object
#' @field brand_account_id id of the newly created brand account character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BrandAccountsCreate200Response <- R6::R6Class(
  "BrandAccountsCreate200Response",
  public = list(
    `brand_account_id` = NULL,

    #' @description
    #' Initialize a new BrandAccountsCreate200Response class.
    #'
    #' @param brand_account_id id of the newly created brand account
    #' @param ... Other optional arguments.
    initialize = function(`brand_account_id` = NULL, ...) {
      if (!is.null(`brand_account_id`)) {
        if (!(is.character(`brand_account_id`) && length(`brand_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `brand_account_id`. Must be a string:", `brand_account_id`))
        }
        self$`brand_account_id` <- `brand_account_id`
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
    #' @return BrandAccountsCreate200Response as a base R list.
    #' @examples
    #' # convert array of BrandAccountsCreate200Response (x) to a data frame
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
    #' Convert BrandAccountsCreate200Response to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BrandAccountsCreate200ResponseObject <- list()
      if (!is.null(self$`brand_account_id`)) {
        BrandAccountsCreate200ResponseObject[["brand_account_id"]] <-
          self$`brand_account_id`
      }
      return(BrandAccountsCreate200ResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountsCreate200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountsCreate200Response
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`brand_account_id`)) {
        self$`brand_account_id` <- this_object$`brand_account_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BrandAccountsCreate200Response in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountsCreate200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountsCreate200Response
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`brand_account_id` <- this_object$`brand_account_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to BrandAccountsCreate200Response and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandAccountsCreate200Response
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
# BrandAccountsCreate200Response$unlock()
#
## Below is an example to define the print function
# BrandAccountsCreate200Response$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandAccountsCreate200Response$lock()

