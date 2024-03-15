#' Create a new LeadFormTestResponse
#'
#' @description
#' Response for lead data test API.
#'
#' @docType class
#' @title LeadFormTestResponse
#' @description LeadFormTestResponse Class
#' @format An \code{R6Class} generator object
#' @field subscription_id Subscription ID. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormTestResponse <- R6::R6Class(
  "LeadFormTestResponse",
  public = list(
    `subscription_id` = NULL,
    #' Initialize a new LeadFormTestResponse class.
    #'
    #' @description
    #' Initialize a new LeadFormTestResponse class.
    #'
    #' @param subscription_id Subscription ID.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`subscription_id` = NULL, ...) {
      if (!is.null(`subscription_id`)) {
        if (!(is.character(`subscription_id`) && length(`subscription_id`) == 1)) {
          stop(paste("Error! Invalid data for `subscription_id`. Must be a string:", `subscription_id`))
        }
        self$`subscription_id` <- `subscription_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LeadFormTestResponse in JSON format
    #' @export
    toJSON = function() {
      LeadFormTestResponseObject <- list()
      if (!is.null(self$`subscription_id`)) {
        LeadFormTestResponseObject[["subscription_id"]] <-
          self$`subscription_id`
      }
      LeadFormTestResponseObject
    },
    #' Deserialize JSON string into an instance of LeadFormTestResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormTestResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormTestResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`subscription_id`)) {
        self$`subscription_id` <- this_object$`subscription_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LeadFormTestResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`subscription_id`)) {
          sprintf(
          '"subscription_id":
            "%s"
                    ',
          self$`subscription_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of LeadFormTestResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormTestResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormTestResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`subscription_id` <- this_object$`subscription_id`
      self
    },
    #' Validate JSON input with respect to LeadFormTestResponse
    #'
    #' @description
    #' Validate JSON input with respect to LeadFormTestResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormTestResponse
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      if (!str_detect(self$`subscription_id`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`subscription_id`, "^\\d+$")) {
        invalid_fields["subscription_id"] <- "Invalid value for `subscription_id`, must conform to the pattern ^\\d+$."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# LeadFormTestResponse$unlock()
#
## Below is an example to define the print function
# LeadFormTestResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormTestResponse$lock()

