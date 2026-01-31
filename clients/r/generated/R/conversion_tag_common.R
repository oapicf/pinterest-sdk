#' Create a new ConversionTagCommon
#'
#' @description
#' ConversionTagCommon Class
#'
#' @docType class
#' @title ConversionTagCommon
#' @description ConversionTagCommon Class
#' @format An \code{R6Class} generator object
#' @field code_snippet Tag code snippet. character [optional]
#' @field configs  \link{ConversionTagConfigs} [optional]
#' @field enhanced_match_status The enhanced match status of the tag \link{EnhancedMatchStatusType} [optional]
#' @field id Tag ID. character [optional]
#' @field last_fired_time_ms Time for the last event fired. numeric [optional]
#' @field name Conversion tag name. character
#' @field version Version number. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionTagCommon <- R6::R6Class(
  "ConversionTagCommon",
  public = list(
    `code_snippet` = NULL,
    `configs` = NULL,
    `enhanced_match_status` = NULL,
    `id` = NULL,
    `last_fired_time_ms` = NULL,
    `name` = NULL,
    `version` = NULL,

    #' @description
    #' Initialize a new ConversionTagCommon class.
    #'
    #' @param name Conversion tag name.
    #' @param code_snippet Tag code snippet.
    #' @param configs configs
    #' @param enhanced_match_status The enhanced match status of the tag
    #' @param id Tag ID.
    #' @param last_fired_time_ms Time for the last event fired.
    #' @param version Version number.
    #' @param ... Other optional arguments.
    initialize = function(`name`, `code_snippet` = NULL, `configs` = NULL, `enhanced_match_status` = NULL, `id` = NULL, `last_fired_time_ms` = NULL, `version` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`code_snippet`)) {
        if (!(is.character(`code_snippet`) && length(`code_snippet`) == 1)) {
          stop(paste("Error! Invalid data for `code_snippet`. Must be a string:", `code_snippet`))
        }
        self$`code_snippet` <- `code_snippet`
      }
      if (!is.null(`configs`)) {
        stopifnot(R6::is.R6(`configs`))
        self$`configs` <- `configs`
      }
      if (!is.null(`enhanced_match_status`)) {
        if (!(`enhanced_match_status` %in% c())) {
          stop(paste("Error! \"", `enhanced_match_status`, "\" cannot be assigned to `enhanced_match_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`enhanced_match_status`))
        self$`enhanced_match_status` <- `enhanced_match_status`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`last_fired_time_ms`)) {
        self$`last_fired_time_ms` <- `last_fired_time_ms`
      }
      if (!is.null(`version`)) {
        if (!(is.character(`version`) && length(`version`) == 1)) {
          stop(paste("Error! Invalid data for `version`. Must be a string:", `version`))
        }
        self$`version` <- `version`
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
    #' @return ConversionTagCommon as a base R list.
    #' @examples
    #' # convert array of ConversionTagCommon (x) to a data frame
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
    #' Convert ConversionTagCommon to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionTagCommonObject <- list()
      if (!is.null(self$`code_snippet`)) {
        ConversionTagCommonObject[["code_snippet"]] <-
          self$`code_snippet`
      }
      if (!is.null(self$`configs`)) {
        ConversionTagCommonObject[["configs"]] <-
          self$`configs`$toSimpleType()
      }
      if (!is.null(self$`enhanced_match_status`)) {
        ConversionTagCommonObject[["enhanced_match_status"]] <-
          self$`enhanced_match_status`$toSimpleType()
      }
      if (!is.null(self$`id`)) {
        ConversionTagCommonObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`last_fired_time_ms`)) {
        ConversionTagCommonObject[["last_fired_time_ms"]] <-
          self$`last_fired_time_ms`
      }
      if (!is.null(self$`name`)) {
        ConversionTagCommonObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`version`)) {
        ConversionTagCommonObject[["version"]] <-
          self$`version`
      }
      return(ConversionTagCommonObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionTagCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagCommon
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code_snippet`)) {
        self$`code_snippet` <- this_object$`code_snippet`
      }
      if (!is.null(this_object$`configs`)) {
        `configs_object` <- ConversionTagConfigs$new()
        `configs_object`$fromJSON(jsonlite::toJSON(this_object$`configs`, auto_unbox = TRUE, digits = NA))
        self$`configs` <- `configs_object`
      }
      if (!is.null(this_object$`enhanced_match_status`)) {
        `enhanced_match_status_object` <- EnhancedMatchStatusType$new()
        `enhanced_match_status_object`$fromJSON(jsonlite::toJSON(this_object$`enhanced_match_status`, auto_unbox = TRUE, digits = NA))
        self$`enhanced_match_status` <- `enhanced_match_status_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`last_fired_time_ms`)) {
        self$`last_fired_time_ms` <- this_object$`last_fired_time_ms`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`version`)) {
        self$`version` <- this_object$`version`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionTagCommon in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionTagCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagCommon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code_snippet` <- this_object$`code_snippet`
      self$`configs` <- ConversionTagConfigs$new()$fromJSON(jsonlite::toJSON(this_object$`configs`, auto_unbox = TRUE, digits = NA))
      self$`enhanced_match_status` <- EnhancedMatchStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`enhanced_match_status`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`last_fired_time_ms` <- this_object$`last_fired_time_ms`
      self$`name` <- this_object$`name`
      self$`version` <- this_object$`version`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionTagCommon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionTagCommon: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionTagCommon
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# ConversionTagCommon$unlock()
#
## Below is an example to define the print function
# ConversionTagCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionTagCommon$lock()

