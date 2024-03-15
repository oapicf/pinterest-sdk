#' Create a new TargetingSpecSHOPPINGRETARGETING
#'
#' @description
#' TargetingSpecSHOPPINGRETARGETING Class
#'
#' @docType class
#' @title TargetingSpecSHOPPINGRETARGETING
#' @description TargetingSpecSHOPPINGRETARGETING Class
#' @format An \code{R6Class} generator object
#' @field lookback_window Number of days ago to start lookback timeframe for dynamic retargeting integer [optional]
#' @field tag_types Event types to target for dynamic retargeting list(integer) [optional]
#' @field exclusion_window Number of days ago to stop lookback timeframe for dynamic retargeting integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingSpecSHOPPINGRETARGETING <- R6::R6Class(
  "TargetingSpecSHOPPINGRETARGETING",
  public = list(
    `lookback_window` = NULL,
    `tag_types` = NULL,
    `exclusion_window` = NULL,
    #' Initialize a new TargetingSpecSHOPPINGRETARGETING class.
    #'
    #' @description
    #' Initialize a new TargetingSpecSHOPPINGRETARGETING class.
    #'
    #' @param lookback_window Number of days ago to start lookback timeframe for dynamic retargeting
    #' @param tag_types Event types to target for dynamic retargeting
    #' @param exclusion_window Number of days ago to stop lookback timeframe for dynamic retargeting
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`lookback_window` = NULL, `tag_types` = NULL, `exclusion_window` = NULL, ...) {
      if (!is.null(`lookback_window`)) {
        if (!(is.numeric(`lookback_window`) && length(`lookback_window`) == 1)) {
          stop(paste("Error! Invalid data for `lookback_window`. Must be an integer:", `lookback_window`))
        }
        self$`lookback_window` <- `lookback_window`
      }
      if (!is.null(`tag_types`)) {
        stopifnot(is.vector(`tag_types`), length(`tag_types`) != 0)
        sapply(`tag_types`, function(x) stopifnot(is.character(x)))
        self$`tag_types` <- `tag_types`
      }
      if (!is.null(`exclusion_window`)) {
        if (!(is.numeric(`exclusion_window`) && length(`exclusion_window`) == 1)) {
          stop(paste("Error! Invalid data for `exclusion_window`. Must be an integer:", `exclusion_window`))
        }
        self$`exclusion_window` <- `exclusion_window`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TargetingSpecSHOPPINGRETARGETING in JSON format
    #' @export
    toJSON = function() {
      TargetingSpecSHOPPINGRETARGETINGObject <- list()
      if (!is.null(self$`lookback_window`)) {
        TargetingSpecSHOPPINGRETARGETINGObject[["lookback_window"]] <-
          self$`lookback_window`
      }
      if (!is.null(self$`tag_types`)) {
        TargetingSpecSHOPPINGRETARGETINGObject[["tag_types"]] <-
          self$`tag_types`
      }
      if (!is.null(self$`exclusion_window`)) {
        TargetingSpecSHOPPINGRETARGETINGObject[["exclusion_window"]] <-
          self$`exclusion_window`
      }
      TargetingSpecSHOPPINGRETARGETINGObject
    },
    #' Deserialize JSON string into an instance of TargetingSpecSHOPPINGRETARGETING
    #'
    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecSHOPPINGRETARGETING
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecSHOPPINGRETARGETING
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`lookback_window`)) {
        self$`lookback_window` <- this_object$`lookback_window`
      }
      if (!is.null(this_object$`tag_types`)) {
        self$`tag_types` <- ApiClient$new()$deserializeObj(this_object$`tag_types`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`exclusion_window`)) {
        self$`exclusion_window` <- this_object$`exclusion_window`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TargetingSpecSHOPPINGRETARGETING in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`lookback_window`)) {
          sprintf(
          '"lookback_window":
            %d
                    ',
          self$`lookback_window`
          )
        },
        if (!is.null(self$`tag_types`)) {
          sprintf(
          '"tag_types":
             [%s]
          ',
          paste(unlist(lapply(self$`tag_types`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`exclusion_window`)) {
          sprintf(
          '"exclusion_window":
            %d
                    ',
          self$`exclusion_window`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TargetingSpecSHOPPINGRETARGETING
    #'
    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecSHOPPINGRETARGETING
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecSHOPPINGRETARGETING
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`lookback_window` <- this_object$`lookback_window`
      self$`tag_types` <- ApiClient$new()$deserializeObj(this_object$`tag_types`, "array[integer]", loadNamespace("openapi"))
      self$`exclusion_window` <- this_object$`exclusion_window`
      self
    },
    #' Validate JSON input with respect to TargetingSpecSHOPPINGRETARGETING
    #'
    #' @description
    #' Validate JSON input with respect to TargetingSpecSHOPPINGRETARGETING and throw an exception if invalid
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
    #' @return String representation of TargetingSpecSHOPPINGRETARGETING
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
# TargetingSpecSHOPPINGRETARGETING$unlock()
#
## Below is an example to define the print function
# TargetingSpecSHOPPINGRETARGETING$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingSpecSHOPPINGRETARGETING$lock()

