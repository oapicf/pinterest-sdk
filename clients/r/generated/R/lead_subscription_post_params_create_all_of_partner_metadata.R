#' Create a new LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
#'
#' @description
#' Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
#'
#' @docType class
#' @title LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
#' @description LeadSubscriptionPostParamsCreateAllOfPartnerMetadata Class
#' @format An \code{R6Class} generator object
#' @field subscriber_key Text field value that uniquely identifies a subscriber. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadSubscriptionPostParamsCreateAllOfPartnerMetadata <- R6::R6Class(
  "LeadSubscriptionPostParamsCreateAllOfPartnerMetadata",
  public = list(
    `subscriber_key` = NULL,

    #' @description
    #' Initialize a new LeadSubscriptionPostParamsCreateAllOfPartnerMetadata class.
    #'
    #' @param subscriber_key Text field value that uniquely identifies a subscriber.
    #' @param ... Other optional arguments.
    initialize = function(`subscriber_key` = NULL, ...) {
      if (!is.null(`subscriber_key`)) {
        if (!(is.character(`subscriber_key`) && length(`subscriber_key`) == 1)) {
          stop(paste("Error! Invalid data for `subscriber_key`. Must be a string:", `subscriber_key`))
        }
        self$`subscriber_key` <- `subscriber_key`
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
    #' @return LeadSubscriptionPostParamsCreateAllOfPartnerMetadata as a base R list.
    #' @examples
    #' # convert array of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata (x) to a data frame
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
    #' Convert LeadSubscriptionPostParamsCreateAllOfPartnerMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadSubscriptionPostParamsCreateAllOfPartnerMetadataObject <- list()
      if (!is.null(self$`subscriber_key`)) {
        LeadSubscriptionPostParamsCreateAllOfPartnerMetadataObject[["subscriber_key"]] <-
          self$`subscriber_key`
      }
      return(LeadSubscriptionPostParamsCreateAllOfPartnerMetadataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`subscriber_key`)) {
        self$`subscriber_key` <- this_object$`subscriber_key`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadSubscriptionPostParamsCreateAllOfPartnerMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`subscriber_key` <- this_object$`subscriber_key`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadSubscriptionPostParamsCreateAllOfPartnerMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
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
# LeadSubscriptionPostParamsCreateAllOfPartnerMetadata$unlock()
#
## Below is an example to define the print function
# LeadSubscriptionPostParamsCreateAllOfPartnerMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadSubscriptionPostParamsCreateAllOfPartnerMetadata$lock()

