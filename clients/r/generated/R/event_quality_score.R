#' Create a new EventQualityScore
#'
#' @description
#' Schema for GET Conversion EQS response.
#'
#' @docType class
#' @title EventQualityScore
#' @description EventQualityScore Class
#' @format An \code{R6Class} generator object
#' @field ingestion_source  \link{IngestionSourceOptions}
#' @field lookback_period  \link{LookbackPeriodOptions}
#' @field overall_status  \link{OverallStatusOptions}
#' @field quality_components  \link{QualityComponents}
#' @field source_platform  \link{SourcePlatformOptions}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EventQualityScore <- R6::R6Class(
  "EventQualityScore",
  public = list(
    `ingestion_source` = NULL,
    `lookback_period` = NULL,
    `overall_status` = NULL,
    `quality_components` = NULL,
    `source_platform` = NULL,

    #' @description
    #' Initialize a new EventQualityScore class.
    #'
    #' @param ingestion_source ingestion_source
    #' @param lookback_period lookback_period
    #' @param overall_status overall_status
    #' @param quality_components quality_components
    #' @param source_platform source_platform
    #' @param ... Other optional arguments.
    initialize = function(`ingestion_source`, `lookback_period`, `overall_status`, `quality_components`, `source_platform`, ...) {
      if (!missing(`ingestion_source`)) {
        if (!(`ingestion_source` %in% c())) {
          stop(paste("Error! \"", `ingestion_source`, "\" cannot be assigned to `ingestion_source`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`ingestion_source`))
        self$`ingestion_source` <- `ingestion_source`
      }
      if (!missing(`lookback_period`)) {
        if (!(`lookback_period` %in% c())) {
          stop(paste("Error! \"", `lookback_period`, "\" cannot be assigned to `lookback_period`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`lookback_period`))
        self$`lookback_period` <- `lookback_period`
      }
      if (!missing(`overall_status`)) {
        if (!(`overall_status` %in% c())) {
          stop(paste("Error! \"", `overall_status`, "\" cannot be assigned to `overall_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`overall_status`))
        self$`overall_status` <- `overall_status`
      }
      if (!missing(`quality_components`)) {
        stopifnot(R6::is.R6(`quality_components`))
        self$`quality_components` <- `quality_components`
      }
      if (!missing(`source_platform`)) {
        if (!(`source_platform` %in% c())) {
          stop(paste("Error! \"", `source_platform`, "\" cannot be assigned to `source_platform`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`source_platform`))
        self$`source_platform` <- `source_platform`
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
    #' @return EventQualityScore as a base R list.
    #' @examples
    #' # convert array of EventQualityScore (x) to a data frame
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
    #' Convert EventQualityScore to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EventQualityScoreObject <- list()
      if (!is.null(self$`ingestion_source`)) {
        EventQualityScoreObject[["ingestion_source"]] <-
          self$`ingestion_source`$toSimpleType()
      }
      if (!is.null(self$`lookback_period`)) {
        EventQualityScoreObject[["lookback_period"]] <-
          self$`lookback_period`$toSimpleType()
      }
      if (!is.null(self$`overall_status`)) {
        EventQualityScoreObject[["overall_status"]] <-
          self$`overall_status`$toSimpleType()
      }
      if (!is.null(self$`quality_components`)) {
        EventQualityScoreObject[["quality_components"]] <-
          self$`quality_components`$toSimpleType()
      }
      if (!is.null(self$`source_platform`)) {
        EventQualityScoreObject[["source_platform"]] <-
          self$`source_platform`$toSimpleType()
      }
      return(EventQualityScoreObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of EventQualityScore
    #'
    #' @param input_json the JSON input
    #' @return the instance of EventQualityScore
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ingestion_source`)) {
        `ingestion_source_object` <- IngestionSourceOptions$new()
        `ingestion_source_object`$fromJSON(jsonlite::toJSON(this_object$`ingestion_source`, auto_unbox = TRUE, digits = NA))
        self$`ingestion_source` <- `ingestion_source_object`
      }
      if (!is.null(this_object$`lookback_period`)) {
        `lookback_period_object` <- LookbackPeriodOptions$new()
        `lookback_period_object`$fromJSON(jsonlite::toJSON(this_object$`lookback_period`, auto_unbox = TRUE, digits = NA))
        self$`lookback_period` <- `lookback_period_object`
      }
      if (!is.null(this_object$`overall_status`)) {
        `overall_status_object` <- OverallStatusOptions$new()
        `overall_status_object`$fromJSON(jsonlite::toJSON(this_object$`overall_status`, auto_unbox = TRUE, digits = NA))
        self$`overall_status` <- `overall_status_object`
      }
      if (!is.null(this_object$`quality_components`)) {
        `quality_components_object` <- QualityComponents$new()
        `quality_components_object`$fromJSON(jsonlite::toJSON(this_object$`quality_components`, auto_unbox = TRUE, digits = NA))
        self$`quality_components` <- `quality_components_object`
      }
      if (!is.null(this_object$`source_platform`)) {
        `source_platform_object` <- SourcePlatformOptions$new()
        `source_platform_object`$fromJSON(jsonlite::toJSON(this_object$`source_platform`, auto_unbox = TRUE, digits = NA))
        self$`source_platform` <- `source_platform_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EventQualityScore in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EventQualityScore
    #'
    #' @param input_json the JSON input
    #' @return the instance of EventQualityScore
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ingestion_source` <- IngestionSourceOptions$new()$fromJSON(jsonlite::toJSON(this_object$`ingestion_source`, auto_unbox = TRUE, digits = NA))
      self$`lookback_period` <- LookbackPeriodOptions$new()$fromJSON(jsonlite::toJSON(this_object$`lookback_period`, auto_unbox = TRUE, digits = NA))
      self$`overall_status` <- OverallStatusOptions$new()$fromJSON(jsonlite::toJSON(this_object$`overall_status`, auto_unbox = TRUE, digits = NA))
      self$`quality_components` <- QualityComponents$new()$fromJSON(jsonlite::toJSON(this_object$`quality_components`, auto_unbox = TRUE, digits = NA))
      self$`source_platform` <- SourcePlatformOptions$new()$fromJSON(jsonlite::toJSON(this_object$`source_platform`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to EventQualityScore and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ingestion_source`
      if (!is.null(input_json$`ingestion_source`)) {
        stopifnot(R6::is.R6(input_json$`ingestion_source`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EventQualityScore: the required field `ingestion_source` is missing."))
      }
      # check the required field `lookback_period`
      if (!is.null(input_json$`lookback_period`)) {
        stopifnot(R6::is.R6(input_json$`lookback_period`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EventQualityScore: the required field `lookback_period` is missing."))
      }
      # check the required field `overall_status`
      if (!is.null(input_json$`overall_status`)) {
        stopifnot(R6::is.R6(input_json$`overall_status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EventQualityScore: the required field `overall_status` is missing."))
      }
      # check the required field `quality_components`
      if (!is.null(input_json$`quality_components`)) {
        stopifnot(R6::is.R6(input_json$`quality_components`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EventQualityScore: the required field `quality_components` is missing."))
      }
      # check the required field `source_platform`
      if (!is.null(input_json$`source_platform`)) {
        stopifnot(R6::is.R6(input_json$`source_platform`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EventQualityScore: the required field `source_platform` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EventQualityScore
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ingestion_source` is null
      if (is.null(self$`ingestion_source`)) {
        return(FALSE)
      }

      # check if the required `lookback_period` is null
      if (is.null(self$`lookback_period`)) {
        return(FALSE)
      }

      # check if the required `overall_status` is null
      if (is.null(self$`overall_status`)) {
        return(FALSE)
      }

      # check if the required `quality_components` is null
      if (is.null(self$`quality_components`)) {
        return(FALSE)
      }

      # check if the required `source_platform` is null
      if (is.null(self$`source_platform`)) {
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
      # check if the required `ingestion_source` is null
      if (is.null(self$`ingestion_source`)) {
        invalid_fields["ingestion_source"] <- "Non-nullable required field `ingestion_source` cannot be null."
      }

      # check if the required `lookback_period` is null
      if (is.null(self$`lookback_period`)) {
        invalid_fields["lookback_period"] <- "Non-nullable required field `lookback_period` cannot be null."
      }

      # check if the required `overall_status` is null
      if (is.null(self$`overall_status`)) {
        invalid_fields["overall_status"] <- "Non-nullable required field `overall_status` cannot be null."
      }

      # check if the required `quality_components` is null
      if (is.null(self$`quality_components`)) {
        invalid_fields["quality_components"] <- "Non-nullable required field `quality_components` cannot be null."
      }

      # check if the required `source_platform` is null
      if (is.null(self$`source_platform`)) {
        invalid_fields["source_platform"] <- "Non-nullable required field `source_platform` cannot be null."
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
# EventQualityScore$unlock()
#
## Below is an example to define the print function
# EventQualityScore$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EventQualityScore$lock()

