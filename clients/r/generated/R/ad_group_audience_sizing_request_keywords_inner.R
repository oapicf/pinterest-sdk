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

    #' @description
    #' Initialize a new AdGroupAudienceSizingRequestKeywordsInner class.
    #'
    #' @param match_type match_type
    #' @param value Keyword value (120 chars max).
    #' @param ... Other optional arguments.
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
    #' @return AdGroupAudienceSizingRequestKeywordsInner as a base R list.
    #' @examples
    #' # convert array of AdGroupAudienceSizingRequestKeywordsInner (x) to a data frame
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
    #' Convert AdGroupAudienceSizingRequestKeywordsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupAudienceSizingRequestKeywordsInnerObject <- list()
      if (!is.null(self$`match_type`)) {
        AdGroupAudienceSizingRequestKeywordsInnerObject[["match_type"]] <-
          self$`match_type`$toSimpleType()
      }
      if (!is.null(self$`value`)) {
        AdGroupAudienceSizingRequestKeywordsInnerObject[["value"]] <-
          self$`value`
      }
      return(AdGroupAudienceSizingRequestKeywordsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequestKeywordsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingRequestKeywordsInner
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupAudienceSizingRequestKeywordsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingRequestKeywordsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingRequestKeywordsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`match_type` <- MatchTypeResponse$new()$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupAudienceSizingRequestKeywordsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
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

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupAudienceSizingRequestKeywordsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# AdGroupAudienceSizingRequestKeywordsInner$unlock()
#
## Below is an example to define the print function
# AdGroupAudienceSizingRequestKeywordsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupAudienceSizingRequestKeywordsInner$lock()

