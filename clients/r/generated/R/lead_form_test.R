#' Create a new LeadFormTest
#'
#' @description
#' Lead form test action: submit sample answers and receive the resulting subscription id.
#'
#' @docType class
#' @title LeadFormTest
#' @description LeadFormTest Class
#' @format An \code{R6Class} generator object
#' @field subscription_id Subscription ID. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormTest <- R6::R6Class(
  "LeadFormTest",
  public = list(
    `subscription_id` = NULL,

    #' @description
    #' Initialize a new LeadFormTest class.
    #'
    #' @param subscription_id Subscription ID.
    #' @param ... Other optional arguments.
    initialize = function(`subscription_id` = NULL, ...) {
      if (!is.null(`subscription_id`)) {
        if (!(is.character(`subscription_id`) && length(`subscription_id`) == 1)) {
          stop(paste("Error! Invalid data for `subscription_id`. Must be a string:", `subscription_id`))
        }
        self$`subscription_id` <- `subscription_id`
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
    #' @return LeadFormTest as a base R list.
    #' @examples
    #' # convert array of LeadFormTest (x) to a data frame
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
    #' Convert LeadFormTest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadFormTestObject <- list()
      if (!is.null(self$`subscription_id`)) {
        LeadFormTestObject[["subscription_id"]] <-
          self$`subscription_id`
      }
      return(LeadFormTestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormTest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormTest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`subscription_id`)) {
        self$`subscription_id` <- this_object$`subscription_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadFormTest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormTest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormTest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`subscription_id` <- this_object$`subscription_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadFormTest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormTest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`subscription_id`, "^\\d+$")) {
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
      if (!str_detect(self$`subscription_id`, "^\\d+$")) {
        invalid_fields["subscription_id"] <- "Invalid value for `subscription_id`, must conform to the pattern ^\\d+$."
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
# LeadFormTest$unlock()
#
## Below is an example to define the print function
# LeadFormTest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormTest$lock()

