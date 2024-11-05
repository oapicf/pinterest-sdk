#' Create a new TargetingTypeFilter
#'
#' @description
#' TargetingTypeFilter Class
#'
#' @docType class
#' @title TargetingTypeFilter
#' @description TargetingTypeFilter Class
#' @format An \code{R6Class} generator object
#' @field targeting_types List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. list(\link{AdsAnalyticsTargetingType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTypeFilter <- R6::R6Class(
  "TargetingTypeFilter",
  public = list(
    `targeting_types` = NULL,

    #' @description
    #' Initialize a new TargetingTypeFilter class.
    #'
    #' @param targeting_types List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    #' @param ... Other optional arguments.
    initialize = function(`targeting_types` = NULL, ...) {
      if (!is.null(`targeting_types`)) {
        stopifnot(is.vector(`targeting_types`), length(`targeting_types`) != 0)
        sapply(`targeting_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`targeting_types` <- `targeting_types`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTypeFilter in JSON format
    toJSON = function() {
      TargetingTypeFilterObject <- list()
      if (!is.null(self$`targeting_types`)) {
        TargetingTypeFilterObject[["targeting_types"]] <-
          lapply(self$`targeting_types`, function(x) x$toJSON())
      }
      TargetingTypeFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTypeFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTypeFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`targeting_types`)) {
        self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[AdsAnalyticsTargetingType]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTypeFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`targeting_types`)) {
          sprintf(
          '"targeting_types":
          [%s]
',
          paste(sapply(self$`targeting_types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTypeFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTypeFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[AdsAnalyticsTargetingType]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTypeFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTypeFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`targeting_types`) > 5) {
        return(FALSE)
      }
      if (length(self$`targeting_types`) < 1) {
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
      if (length(self$`targeting_types`) > 5) {
        invalid_fields["targeting_types"] <- "Invalid length for `targeting_types`, number of items must be less than or equal to 5."
      }
      if (length(self$`targeting_types`) < 1) {
        invalid_fields["targeting_types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# TargetingTypeFilter$unlock()
#
## Below is an example to define the print function
# TargetingTypeFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTypeFilter$lock()

