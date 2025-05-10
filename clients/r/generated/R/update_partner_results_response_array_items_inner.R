#' Create a new UpdatePartnerResultsResponseArrayItemsInner
#'
#' @description
#' UpdatePartnerResultsResponseArrayItemsInner Class
#'
#' @docType class
#' @title UpdatePartnerResultsResponseArrayItemsInner
#' @description UpdatePartnerResultsResponseArrayItemsInner Class
#' @format An \code{R6Class} generator object
#' @field exception  \link{BusinessAccessError} [optional]
#' @field member_or_partner_id  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdatePartnerResultsResponseArrayItemsInner <- R6::R6Class(
  "UpdatePartnerResultsResponseArrayItemsInner",
  public = list(
    `exception` = NULL,
    `member_or_partner_id` = NULL,

    #' @description
    #' Initialize a new UpdatePartnerResultsResponseArrayItemsInner class.
    #'
    #' @param exception exception
    #' @param member_or_partner_id member_or_partner_id
    #' @param ... Other optional arguments.
    initialize = function(`exception` = NULL, `member_or_partner_id` = NULL, ...) {
      if (!is.null(`exception`)) {
        stopifnot(R6::is.R6(`exception`))
        self$`exception` <- `exception`
      }
      if (!is.null(`member_or_partner_id`)) {
        if (!(is.character(`member_or_partner_id`) && length(`member_or_partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `member_or_partner_id`. Must be a string:", `member_or_partner_id`))
        }
        self$`member_or_partner_id` <- `member_or_partner_id`
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
    #' @return UpdatePartnerResultsResponseArrayItemsInner as a base R list.
    #' @examples
    #' # convert array of UpdatePartnerResultsResponseArrayItemsInner (x) to a data frame
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
    #' Convert UpdatePartnerResultsResponseArrayItemsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UpdatePartnerResultsResponseArrayItemsInnerObject <- list()
      if (!is.null(self$`exception`)) {
        UpdatePartnerResultsResponseArrayItemsInnerObject[["exception"]] <-
          self$`exception`$toSimpleType()
      }
      if (!is.null(self$`member_or_partner_id`)) {
        UpdatePartnerResultsResponseArrayItemsInnerObject[["member_or_partner_id"]] <-
          self$`member_or_partner_id`
      }
      return(UpdatePartnerResultsResponseArrayItemsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdatePartnerResultsResponseArrayItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerResultsResponseArrayItemsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`exception`)) {
        `exception_object` <- BusinessAccessError$new()
        `exception_object`$fromJSON(jsonlite::toJSON(this_object$`exception`, auto_unbox = TRUE, digits = NA))
        self$`exception` <- `exception_object`
      }
      if (!is.null(this_object$`member_or_partner_id`)) {
        self$`member_or_partner_id` <- this_object$`member_or_partner_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UpdatePartnerResultsResponseArrayItemsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdatePartnerResultsResponseArrayItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerResultsResponseArrayItemsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`exception` <- BusinessAccessError$new()$fromJSON(jsonlite::toJSON(this_object$`exception`, auto_unbox = TRUE, digits = NA))
      self$`member_or_partner_id` <- this_object$`member_or_partner_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdatePartnerResultsResponseArrayItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdatePartnerResultsResponseArrayItemsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`member_or_partner_id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`member_or_partner_id`, "^\\d+$")) {
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
      if (nchar(self$`member_or_partner_id`) > 18) {
        invalid_fields["member_or_partner_id"] <- "Invalid length for `member_or_partner_id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`member_or_partner_id`, "^\\d+$")) {
        invalid_fields["member_or_partner_id"] <- "Invalid value for `member_or_partner_id`, must conform to the pattern ^\\d+$."
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
# UpdatePartnerResultsResponseArrayItemsInner$unlock()
#
## Below is an example to define the print function
# UpdatePartnerResultsResponseArrayItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdatePartnerResultsResponseArrayItemsInner$lock()

