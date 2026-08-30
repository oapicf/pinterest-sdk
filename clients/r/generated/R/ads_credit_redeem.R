#' Create a new AdsCreditRedeem
#'
#' @description
#' Ads credit redemption
#'
#' @docType class
#' @title AdsCreditRedeem
#' @description AdsCreditRedeem Class
#' @format An \code{R6Class} generator object
#' @field errorCode Error code type if error occurs integer [optional]
#' @field errorMessage Reason for failure character [optional]
#' @field success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsCreditRedeem <- R6::R6Class(
  "AdsCreditRedeem",
  public = list(
    `errorCode` = NULL,
    `errorMessage` = NULL,
    `success` = NULL,

    #' @description
    #' Initialize a new AdsCreditRedeem class.
    #'
    #' @param errorCode Error code type if error occurs
    #' @param errorMessage Reason for failure
    #' @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
    #' @param ... Other optional arguments.
    initialize = function(`errorCode` = NULL, `errorMessage` = NULL, `success` = NULL, ...) {
      if (!is.null(`errorCode`)) {
        if (!(is.numeric(`errorCode`) && length(`errorCode`) == 1)) {
          stop(paste("Error! Invalid data for `errorCode`. Must be an integer:", `errorCode`))
        }
        self$`errorCode` <- `errorCode`
      }
      if (!is.null(`errorMessage`)) {
        if (!(is.character(`errorMessage`) && length(`errorMessage`) == 1)) {
          stop(paste("Error! Invalid data for `errorMessage`. Must be a string:", `errorMessage`))
        }
        self$`errorMessage` <- `errorMessage`
      }
      if (!is.null(`success`)) {
        if (!(is.logical(`success`) && length(`success`) == 1)) {
          stop(paste("Error! Invalid data for `success`. Must be a boolean:", `success`))
        }
        self$`success` <- `success`
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
    #' @return AdsCreditRedeem as a base R list.
    #' @examples
    #' # convert array of AdsCreditRedeem (x) to a data frame
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
    #' Convert AdsCreditRedeem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdsCreditRedeemObject <- list()
      if (!is.null(self$`errorCode`)) {
        AdsCreditRedeemObject[["errorCode"]] <-
          self$`errorCode`
      }
      if (!is.null(self$`errorMessage`)) {
        AdsCreditRedeemObject[["errorMessage"]] <-
          self$`errorMessage`
      }
      if (!is.null(self$`success`)) {
        AdsCreditRedeemObject[["success"]] <-
          self$`success`
      }
      return(AdsCreditRedeemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeem
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errorCode`)) {
        self$`errorCode` <- this_object$`errorCode`
      }
      if (!is.null(this_object$`errorMessage`)) {
        self$`errorMessage` <- this_object$`errorMessage`
      }
      if (!is.null(this_object$`success`)) {
        self$`success` <- this_object$`success`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdsCreditRedeem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeem
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errorCode` <- this_object$`errorCode`
      self$`errorMessage` <- this_object$`errorMessage`
      self$`success` <- this_object$`success`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsCreditRedeem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsCreditRedeem
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
# AdsCreditRedeem$unlock()
#
## Below is an example to define the print function
# AdsCreditRedeem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsCreditRedeem$lock()

