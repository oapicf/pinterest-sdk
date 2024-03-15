#' Create a new AdGroupAudienceSizingRequestKeywordsInner
#'
#' @description
#' AdGroupAudienceSizingRequestKeywordsInner Class
#'
#' @docType class
#' @title AdGroupAudienceSizingRequestKeywordsInner
#' @description AdGroupAudienceSizingRequestKeywordsInner Class
#' @format An \code{R6Class} generator object
#' @field match_type  \link{MatchTypeResponse}
#' @field value Keyword value (120 chars max). character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupAudienceSizingRequestKeywordsInner <- R6::R6Class(
  "AdGroupAudienceSizingRequestKeywordsInner",
  public = list(
    `match_type` = NULL,
    `value` = NULL,
    #' Initialize a new AdGroupAudienceSizingRequestKeywordsInner class.
    #'
    #' @description
    #' Initialize a new AdGroupAudienceSizingRequestKeywordsInner class.
    #'
    #' @param match_type match_type
    #' @param value Keyword value (120 chars max).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`match_type`, `value`, ...) {
      if (!missing(`match_type`)) {
        if (!(`match_type` %in% c())) {
          stop(paste("Error! \"", `match_type`, "\" cannot be assigned to `match_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`match_type`))
        self$`match_type` <- `match_type`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupAudienceSizingRequestKeywordsInner in JSON format
    #' @export
    toJSON = function() {
      AdGroupAudienceSizingRequestKeywordsInnerObject <- list()
      if (!is.null(self$`match_type`)) {
        AdGroupAudienceSizingRequestKeywordsInnerObject[["match_type"]] <-
          self$`match_type`$toJSON()
      }
      if (!is.null(self$`value`)) {
        AdGroupAudienceSizingRequestKeywordsInnerObject[["value"]] <-
          self$`value`
      }
      AdGroupAudienceSizingRequestKeywordsInnerObject
    },
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequestKeywordsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequestKeywordsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingRequestKeywordsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`match_type`)) {
        `match_type_object` <- MatchTypeResponse$new()
        `match_type_object`$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
        self$`match_type` <- `match_type_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupAudienceSizingRequestKeywordsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`match_type`)) {
          sprintf(
          '"match_type":
          %s
          ',
          jsonlite::toJSON(self$`match_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequestKeywordsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequestKeywordsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingRequestKeywordsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`match_type` <- MatchTypeResponse$new()$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },
    #' Validate JSON input with respect to AdGroupAudienceSizingRequestKeywordsInner
    #'
    #' @description
    #' Validate JSON input with respect to AdGroupAudienceSizingRequestKeywordsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `match_type`
      if (!is.null(input_json$`match_type`)) {
        stopifnot(R6::is.R6(input_json$`match_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupAudienceSizingRequestKeywordsInner: the required field `match_type` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupAudienceSizingRequestKeywordsInner: the required field `value` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupAudienceSizingRequestKeywordsInner
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# AdGroupAudienceSizingRequestKeywordsInner$unlock()
#
## Below is an example to define the print function
# AdGroupAudienceSizingRequestKeywordsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupAudienceSizingRequestKeywordsInner$lock()

