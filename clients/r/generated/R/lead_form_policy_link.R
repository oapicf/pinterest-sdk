#' Create a new LeadFormPolicyLink
#'
#' @description
#' LeadFormPolicyLink Class
#'
#' @docType class
#' @title LeadFormPolicyLink
#' @description LeadFormPolicyLink Class
#' @format An \code{R6Class} generator object
#' @field label Policy label for an additional policy link. character [optional]
#' @field link Policy link for an additional policy link. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormPolicyLink <- R6::R6Class(
  "LeadFormPolicyLink",
  public = list(
    `label` = NULL,
    `link` = NULL,

    #' @description
    #' Initialize a new LeadFormPolicyLink class.
    #'
    #' @param label Policy label for an additional policy link.
    #' @param link Policy link for an additional policy link.
    #' @param ... Other optional arguments.
    initialize = function(`label` = NULL, `link` = NULL, ...) {
      if (!is.null(`label`)) {
        if (!(is.character(`label`) && length(`label`) == 1)) {
          stop(paste("Error! Invalid data for `label`. Must be a string:", `label`))
        }
        self$`label` <- `label`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
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
    #' @return LeadFormPolicyLink as a base R list.
    #' @examples
    #' # convert array of LeadFormPolicyLink (x) to a data frame
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
    #' Convert LeadFormPolicyLink to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadFormPolicyLinkObject <- list()
      if (!is.null(self$`label`)) {
        LeadFormPolicyLinkObject[["label"]] <-
          self$`label`
      }
      if (!is.null(self$`link`)) {
        LeadFormPolicyLinkObject[["link"]] <-
          self$`link`
      }
      return(LeadFormPolicyLinkObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormPolicyLink
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormPolicyLink
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`label`)) {
        self$`label` <- this_object$`label`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadFormPolicyLink in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormPolicyLink
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormPolicyLink
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`label` <- this_object$`label`
      self$`link` <- this_object$`link`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadFormPolicyLink and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormPolicyLink
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
# LeadFormPolicyLink$unlock()
#
## Below is an example to define the print function
# LeadFormPolicyLink$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormPolicyLink$lock()

