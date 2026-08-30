#' Create a new DynamicTitlesGetStatus
#'
#' @description
#' DynamicTitlesGetStatus Class
#'
#' @docType class
#' @title DynamicTitlesGetStatus
#' @description DynamicTitlesGetStatus Class
#' @format An \code{R6Class} generator object
#' @field generated_count The count of generated titles. integer [optional]
#' @field is_ready Whether dynamic titles have been generated and are ready to be reviewed for the ad group. character [optional]
#' @field reviewed_count The count of advertiser reviewed titles. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DynamicTitlesGetStatus <- R6::R6Class(
  "DynamicTitlesGetStatus",
  public = list(
    `generated_count` = NULL,
    `is_ready` = NULL,
    `reviewed_count` = NULL,

    #' @description
    #' Initialize a new DynamicTitlesGetStatus class.
    #'
    #' @param generated_count The count of generated titles.
    #' @param is_ready Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
    #' @param reviewed_count The count of advertiser reviewed titles.
    #' @param ... Other optional arguments.
    initialize = function(`generated_count` = NULL, `is_ready` = NULL, `reviewed_count` = NULL, ...) {
      if (!is.null(`generated_count`)) {
        if (!(is.numeric(`generated_count`) && length(`generated_count`) == 1)) {
          stop(paste("Error! Invalid data for `generated_count`. Must be an integer:", `generated_count`))
        }
        self$`generated_count` <- `generated_count`
      }
      if (!is.null(`is_ready`)) {
        if (!(is.logical(`is_ready`) && length(`is_ready`) == 1)) {
          stop(paste("Error! Invalid data for `is_ready`. Must be a boolean:", `is_ready`))
        }
        self$`is_ready` <- `is_ready`
      }
      if (!is.null(`reviewed_count`)) {
        if (!(is.numeric(`reviewed_count`) && length(`reviewed_count`) == 1)) {
          stop(paste("Error! Invalid data for `reviewed_count`. Must be an integer:", `reviewed_count`))
        }
        self$`reviewed_count` <- `reviewed_count`
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
    #' @return DynamicTitlesGetStatus as a base R list.
    #' @examples
    #' # convert array of DynamicTitlesGetStatus (x) to a data frame
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
    #' Convert DynamicTitlesGetStatus to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DynamicTitlesGetStatusObject <- list()
      if (!is.null(self$`generated_count`)) {
        DynamicTitlesGetStatusObject[["generated_count"]] <-
          self$`generated_count`
      }
      if (!is.null(self$`is_ready`)) {
        DynamicTitlesGetStatusObject[["is_ready"]] <-
          self$`is_ready`
      }
      if (!is.null(self$`reviewed_count`)) {
        DynamicTitlesGetStatusObject[["reviewed_count"]] <-
          self$`reviewed_count`
      }
      return(DynamicTitlesGetStatusObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesGetStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesGetStatus
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`generated_count`)) {
        self$`generated_count` <- this_object$`generated_count`
      }
      if (!is.null(this_object$`is_ready`)) {
        self$`is_ready` <- this_object$`is_ready`
      }
      if (!is.null(this_object$`reviewed_count`)) {
        self$`reviewed_count` <- this_object$`reviewed_count`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DynamicTitlesGetStatus in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesGetStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesGetStatus
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`generated_count` <- this_object$`generated_count`
      self$`is_ready` <- this_object$`is_ready`
      self$`reviewed_count` <- this_object$`reviewed_count`
      self
    },

    #' @description
    #' Validate JSON input with respect to DynamicTitlesGetStatus and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DynamicTitlesGetStatus
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
# DynamicTitlesGetStatus$unlock()
#
## Below is an example to define the print function
# DynamicTitlesGetStatus$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DynamicTitlesGetStatus$lock()

