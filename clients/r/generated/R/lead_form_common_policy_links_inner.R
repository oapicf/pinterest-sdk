#' Create a new LeadFormCommonPolicyLinksInner
#'
#' @description
#' LeadFormCommonPolicyLinksInner Class
#'
#' @docType class
#' @title LeadFormCommonPolicyLinksInner
#' @description LeadFormCommonPolicyLinksInner Class
#' @format An \code{R6Class} generator object
#' @field label Policy label for an additional policy link. character [optional]
#' @field link Policy link for an additional policy link. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormCommonPolicyLinksInner <- R6::R6Class(
  "LeadFormCommonPolicyLinksInner",
  public = list(
    `label` = NULL,
    `link` = NULL,

    #' @description
    #' Initialize a new LeadFormCommonPolicyLinksInner class.
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
    #' To JSON String
    #'
    #' @return LeadFormCommonPolicyLinksInner in JSON format
    toJSON = function() {
      LeadFormCommonPolicyLinksInnerObject <- list()
      if (!is.null(self$`label`)) {
        LeadFormCommonPolicyLinksInnerObject[["label"]] <-
          self$`label`
      }
      if (!is.null(self$`link`)) {
        LeadFormCommonPolicyLinksInnerObject[["link"]] <-
          self$`link`
      }
      LeadFormCommonPolicyLinksInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormCommonPolicyLinksInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormCommonPolicyLinksInner
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
    #' @return LeadFormCommonPolicyLinksInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`label`)) {
          sprintf(
          '"label":
            "%s"
                    ',
          self$`label`
          )
        },
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormCommonPolicyLinksInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormCommonPolicyLinksInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`label` <- this_object$`label`
      self$`link` <- this_object$`link`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadFormCommonPolicyLinksInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormCommonPolicyLinksInner
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
# LeadFormCommonPolicyLinksInner$unlock()
#
## Below is an example to define the print function
# LeadFormCommonPolicyLinksInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormCommonPolicyLinksInner$lock()

