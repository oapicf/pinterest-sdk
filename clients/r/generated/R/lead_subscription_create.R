#' Create a new LeadSubscriptionCreate
#'
#' @description
#' LeadSubscriptionCreate Class
#'
#' @docType class
#' @title LeadSubscriptionCreate
#' @description LeadSubscriptionCreate Class
#' @format An \code{R6Class} generator object
#' @field lead_form_id Lead form ID. character [optional]
#' @field webhook_url Standard HTTPS webhook URL. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadSubscriptionCreate <- R6::R6Class(
  "LeadSubscriptionCreate",
  public = list(
    `lead_form_id` = NULL,
    `webhook_url` = NULL,

    #' @description
    #' Initialize a new LeadSubscriptionCreate class.
    #'
    #' @param webhook_url Standard HTTPS webhook URL.
    #' @param lead_form_id Lead form ID.
    #' @param ... Other optional arguments.
    initialize = function(`webhook_url`, `lead_form_id` = NULL, ...) {
      if (!missing(`webhook_url`)) {
        if (!(is.character(`webhook_url`) && length(`webhook_url`) == 1)) {
          stop(paste("Error! Invalid data for `webhook_url`. Must be a string:", `webhook_url`))
        }
        self$`webhook_url` <- `webhook_url`
      }
      if (!is.null(`lead_form_id`)) {
        if (!(is.character(`lead_form_id`) && length(`lead_form_id`) == 1)) {
          stop(paste("Error! Invalid data for `lead_form_id`. Must be a string:", `lead_form_id`))
        }
        self$`lead_form_id` <- `lead_form_id`
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
    #' @return LeadSubscriptionCreate as a base R list.
    #' @examples
    #' # convert array of LeadSubscriptionCreate (x) to a data frame
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
    #' Convert LeadSubscriptionCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadSubscriptionCreateObject <- list()
      if (!is.null(self$`lead_form_id`)) {
        LeadSubscriptionCreateObject[["lead_form_id"]] <-
          self$`lead_form_id`
      }
      if (!is.null(self$`webhook_url`)) {
        LeadSubscriptionCreateObject[["webhook_url"]] <-
          self$`webhook_url`
      }
      return(LeadSubscriptionCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadSubscriptionCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadSubscriptionCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`lead_form_id`)) {
        self$`lead_form_id` <- this_object$`lead_form_id`
      }
      if (!is.null(this_object$`webhook_url`)) {
        self$`webhook_url` <- this_object$`webhook_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadSubscriptionCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadSubscriptionCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadSubscriptionCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`lead_form_id` <- this_object$`lead_form_id`
      self$`webhook_url` <- this_object$`webhook_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadSubscriptionCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `webhook_url`
      if (!is.null(input_json$`webhook_url`)) {
        if (!(is.character(input_json$`webhook_url`) && length(input_json$`webhook_url`) == 1)) {
          stop(paste("Error! Invalid data for `webhook_url`. Must be a string:", input_json$`webhook_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadSubscriptionCreate: the required field `webhook_url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadSubscriptionCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`lead_form_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `webhook_url` is null
      if (is.null(self$`webhook_url`)) {
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
      if (!str_detect(self$`lead_form_id`, "^\\d+$")) {
        invalid_fields["lead_form_id"] <- "Invalid value for `lead_form_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `webhook_url` is null
      if (is.null(self$`webhook_url`)) {
        invalid_fields["webhook_url"] <- "Non-nullable required field `webhook_url` cannot be null."
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
# LeadSubscriptionCreate$unlock()
#
## Below is an example to define the print function
# LeadSubscriptionCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadSubscriptionCreate$lock()

