#' Create a new ScheduleBidOptions
#'
#' @description
#' Object describing the schedule level bid level changes.
#'
#' @docType class
#' @title ScheduleBidOptions
#' @description ScheduleBidOptions Class
#' @format An \code{R6Class} generator object
#' @field age_bucket_multipliers  \link{ScheduleAgeBucketMultipliers} [optional]
#' @field app_type_multipliers  \link{ScheduleAppTypeMultipliers} [optional]
#' @field audience_multipliers  \link{ScheduleAudienceMultipliers} [optional]
#' @field gender_multipliers  \link{ScheduleBidOptionsGenderMultipliers} [optional]
#' @field placement_multipliers  \link{ScheduleBidOptionsPlacementMultipliers} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ScheduleBidOptions <- R6::R6Class(
  "ScheduleBidOptions",
  public = list(
    `age_bucket_multipliers` = NULL,
    `app_type_multipliers` = NULL,
    `audience_multipliers` = NULL,
    `gender_multipliers` = NULL,
    `placement_multipliers` = NULL,

    #' @description
    #' Initialize a new ScheduleBidOptions class.
    #'
    #' @param age_bucket_multipliers age_bucket_multipliers
    #' @param app_type_multipliers app_type_multipliers
    #' @param audience_multipliers audience_multipliers
    #' @param gender_multipliers gender_multipliers
    #' @param placement_multipliers placement_multipliers
    #' @param ... Other optional arguments.
    initialize = function(`age_bucket_multipliers` = NULL, `app_type_multipliers` = NULL, `audience_multipliers` = NULL, `gender_multipliers` = NULL, `placement_multipliers` = NULL, ...) {
      if (!is.null(`age_bucket_multipliers`)) {
        stopifnot(R6::is.R6(`age_bucket_multipliers`))
        self$`age_bucket_multipliers` <- `age_bucket_multipliers`
      }
      if (!is.null(`app_type_multipliers`)) {
        stopifnot(R6::is.R6(`app_type_multipliers`))
        self$`app_type_multipliers` <- `app_type_multipliers`
      }
      if (!is.null(`audience_multipliers`)) {
        stopifnot(R6::is.R6(`audience_multipliers`))
        self$`audience_multipliers` <- `audience_multipliers`
      }
      if (!is.null(`gender_multipliers`)) {
        stopifnot(R6::is.R6(`gender_multipliers`))
        self$`gender_multipliers` <- `gender_multipliers`
      }
      if (!is.null(`placement_multipliers`)) {
        stopifnot(R6::is.R6(`placement_multipliers`))
        self$`placement_multipliers` <- `placement_multipliers`
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
    #' @return ScheduleBidOptions as a base R list.
    #' @examples
    #' # convert array of ScheduleBidOptions (x) to a data frame
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
    #' Convert ScheduleBidOptions to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ScheduleBidOptionsObject <- list()
      if (!is.null(self$`age_bucket_multipliers`)) {
        ScheduleBidOptionsObject[["age_bucket_multipliers"]] <-
          self$extractSimpleType(self$`age_bucket_multipliers`)
      }
      if (!is.null(self$`app_type_multipliers`)) {
        ScheduleBidOptionsObject[["app_type_multipliers"]] <-
          self$extractSimpleType(self$`app_type_multipliers`)
      }
      if (!is.null(self$`audience_multipliers`)) {
        ScheduleBidOptionsObject[["audience_multipliers"]] <-
          self$extractSimpleType(self$`audience_multipliers`)
      }
      if (!is.null(self$`gender_multipliers`)) {
        ScheduleBidOptionsObject[["gender_multipliers"]] <-
          self$extractSimpleType(self$`gender_multipliers`)
      }
      if (!is.null(self$`placement_multipliers`)) {
        ScheduleBidOptionsObject[["placement_multipliers"]] <-
          self$extractSimpleType(self$`placement_multipliers`)
      }
      return(ScheduleBidOptionsObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleBidOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleBidOptions
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`age_bucket_multipliers`)) {
        `age_bucket_multipliers_object` <- ScheduleAgeBucketMultipliers$new()
        `age_bucket_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`age_bucket_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`age_bucket_multipliers` <- `age_bucket_multipliers_object`
      }
      if (!is.null(this_object$`app_type_multipliers`)) {
        `app_type_multipliers_object` <- ScheduleAppTypeMultipliers$new()
        `app_type_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`app_type_multipliers` <- `app_type_multipliers_object`
      }
      if (!is.null(this_object$`audience_multipliers`)) {
        `audience_multipliers_object` <- ScheduleAudienceMultipliers$new()
        `audience_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`audience_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`audience_multipliers` <- `audience_multipliers_object`
      }
      if (!is.null(this_object$`gender_multipliers`)) {
        `gender_multipliers_object` <- ScheduleBidOptionsGenderMultipliers$new()
        `gender_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`gender_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`gender_multipliers` <- `gender_multipliers_object`
      }
      if (!is.null(this_object$`placement_multipliers`)) {
        `placement_multipliers_object` <- ScheduleBidOptionsPlacementMultipliers$new()
        `placement_multipliers_object`$fromJSON(jsonlite::toJSON(this_object$`placement_multipliers`, auto_unbox = TRUE, digits = NA))
        self$`placement_multipliers` <- `placement_multipliers_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ScheduleBidOptions in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleBidOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleBidOptions
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`age_bucket_multipliers` <- ScheduleAgeBucketMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`age_bucket_multipliers`, auto_unbox = TRUE, digits = NA))
      self$`app_type_multipliers` <- ScheduleAppTypeMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`app_type_multipliers`, auto_unbox = TRUE, digits = NA))
      self$`audience_multipliers` <- ScheduleAudienceMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`audience_multipliers`, auto_unbox = TRUE, digits = NA))
      self$`gender_multipliers` <- ScheduleBidOptionsGenderMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`gender_multipliers`, auto_unbox = TRUE, digits = NA))
      self$`placement_multipliers` <- ScheduleBidOptionsPlacementMultipliers$new()$fromJSON(jsonlite::toJSON(this_object$`placement_multipliers`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ScheduleBidOptions and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ScheduleBidOptions
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
# ScheduleBidOptions$unlock()
#
## Below is an example to define the print function
# ScheduleBidOptions$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ScheduleBidOptions$lock()

