#' Create a new MMMReportCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title MMMReportCreate
#' @description MMMReportCreate Class
#' @format An \code{R6Class} generator object
#' @field advertiser_ids Advertiser IDs for multi-advertiser report list(character) [optional]
#' @field columns Metric and entity columns list(\link{MMMReportingColumn})
#' @field countries A List of countries for filtering list(\link{TargetingAdvertiserCountry}) [optional]
#' @field custom_column_ids List of custom column IDs list(character) [optional]
#' @field end_date Metric report end date (UTC). Format: YYYY-MM-DD character
#' @field granularity DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. \link{MMMReportGranularity}
#' @field level Level of the report \link{MMMReportLevel}
#' @field report_name Name of the Marketing Mix Modeling (MMM) report character
#' @field start_date Metric report start date (UTC). Format: YYYY-MM-DD character
#' @field targeting_types List of targeting types list(\link{MMMReportingTargetingType})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MMMReportCreate <- R6::R6Class(
  "MMMReportCreate",
  public = list(
    `advertiser_ids` = NULL,
    `columns` = NULL,
    `countries` = NULL,
    `custom_column_ids` = NULL,
    `end_date` = NULL,
    `granularity` = NULL,
    `level` = NULL,
    `report_name` = NULL,
    `start_date` = NULL,
    `targeting_types` = NULL,

    #' @description
    #' Initialize a new MMMReportCreate class.
    #'
    #' @param columns Metric and entity columns
    #' @param end_date Metric report end date (UTC). Format: YYYY-MM-DD
    #' @param granularity DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
    #' @param level Level of the report
    #' @param report_name Name of the Marketing Mix Modeling (MMM) report
    #' @param start_date Metric report start date (UTC). Format: YYYY-MM-DD
    #' @param targeting_types List of targeting types
    #' @param advertiser_ids Advertiser IDs for multi-advertiser report
    #' @param countries A List of countries for filtering
    #' @param custom_column_ids List of custom column IDs
    #' @param ... Other optional arguments.
    initialize = function(`columns`, `end_date`, `granularity`, `level`, `report_name`, `start_date`, `targeting_types`, `advertiser_ids` = NULL, `countries` = NULL, `custom_column_ids` = NULL, ...) {
      if (!missing(`columns`)) {
        stopifnot(is.vector(`columns`), length(`columns`) != 0)
        sapply(`columns`, function(x) stopifnot(R6::is.R6(x)))
        self$`columns` <- `columns`
      }
      if (!missing(`end_date`)) {
        if (!(is.character(`end_date`) && length(`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!missing(`granularity`)) {
        if (!(`granularity` %in% c())) {
          stop(paste("Error! \"", `granularity`, "\" cannot be assigned to `granularity`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`granularity`))
        self$`granularity` <- `granularity`
      }
      if (!missing(`level`)) {
        if (!(`level` %in% c())) {
          stop(paste("Error! \"", `level`, "\" cannot be assigned to `level`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`level`))
        self$`level` <- `level`
      }
      if (!missing(`report_name`)) {
        if (!(is.character(`report_name`) && length(`report_name`) == 1)) {
          stop(paste("Error! Invalid data for `report_name`. Must be a string:", `report_name`))
        }
        self$`report_name` <- `report_name`
      }
      if (!missing(`start_date`)) {
        if (!(is.character(`start_date`) && length(`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
      }
      if (!missing(`targeting_types`)) {
        stopifnot(is.vector(`targeting_types`), length(`targeting_types`) != 0)
        sapply(`targeting_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`targeting_types` <- `targeting_types`
      }
      if (!is.null(`advertiser_ids`)) {
        stopifnot(is.vector(`advertiser_ids`), length(`advertiser_ids`) != 0)
        sapply(`advertiser_ids`, function(x) stopifnot(is.character(x)))
        self$`advertiser_ids` <- `advertiser_ids`
      }
      if (!is.null(`countries`)) {
        stopifnot(is.vector(`countries`), length(`countries`) != 0)
        sapply(`countries`, function(x) stopifnot(R6::is.R6(x)))
        self$`countries` <- `countries`
      }
      if (!is.null(`custom_column_ids`)) {
        stopifnot(is.vector(`custom_column_ids`), length(`custom_column_ids`) != 0)
        sapply(`custom_column_ids`, function(x) stopifnot(is.character(x)))
        self$`custom_column_ids` <- `custom_column_ids`
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
    #' @return MMMReportCreate as a base R list.
    #' @examples
    #' # convert array of MMMReportCreate (x) to a data frame
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
    #' Convert MMMReportCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MMMReportCreateObject <- list()
      if (!is.null(self$`advertiser_ids`)) {
        MMMReportCreateObject[["advertiser_ids"]] <-
          self$`advertiser_ids`
      }
      if (!is.null(self$`columns`)) {
        MMMReportCreateObject[["columns"]] <-
          self$extractSimpleType(self$`columns`)
      }
      if (!is.null(self$`countries`)) {
        MMMReportCreateObject[["countries"]] <-
          self$extractSimpleType(self$`countries`)
      }
      if (!is.null(self$`custom_column_ids`)) {
        MMMReportCreateObject[["custom_column_ids"]] <-
          self$`custom_column_ids`
      }
      if (!is.null(self$`end_date`)) {
        MMMReportCreateObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`granularity`)) {
        MMMReportCreateObject[["granularity"]] <-
          self$extractSimpleType(self$`granularity`)
      }
      if (!is.null(self$`level`)) {
        MMMReportCreateObject[["level"]] <-
          self$extractSimpleType(self$`level`)
      }
      if (!is.null(self$`report_name`)) {
        MMMReportCreateObject[["report_name"]] <-
          self$`report_name`
      }
      if (!is.null(self$`start_date`)) {
        MMMReportCreateObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`targeting_types`)) {
        MMMReportCreateObject[["targeting_types"]] <-
          self$extractSimpleType(self$`targeting_types`)
      }
      return(MMMReportCreateObject)
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
    #' Deserialize JSON string into an instance of MMMReportCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of MMMReportCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`advertiser_ids`)) {
        self$`advertiser_ids` <- ApiClient$new()$deserializeObj(this_object$`advertiser_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`columns`)) {
        self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[MMMReportingColumn]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`countries`)) {
        self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[TargetingAdvertiserCountry]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_column_ids`)) {
        self$`custom_column_ids` <- ApiClient$new()$deserializeObj(this_object$`custom_column_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`granularity`)) {
        `granularity_object` <- MMMReportGranularity$new()
        `granularity_object`$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
        self$`granularity` <- `granularity_object`
      }
      if (!is.null(this_object$`level`)) {
        `level_object` <- MMMReportLevel$new()
        `level_object`$fromJSON(jsonlite::toJSON(this_object$`level`, auto_unbox = TRUE, digits = NA))
        self$`level` <- `level_object`
      }
      if (!is.null(this_object$`report_name`)) {
        self$`report_name` <- this_object$`report_name`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`targeting_types`)) {
        self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[MMMReportingTargetingType]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MMMReportCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MMMReportCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of MMMReportCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`advertiser_ids` <- ApiClient$new()$deserializeObj(this_object$`advertiser_ids`, "array[character]", loadNamespace("openapi"))
      self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[MMMReportingColumn]", loadNamespace("openapi"))
      self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[TargetingAdvertiserCountry]", loadNamespace("openapi"))
      self$`custom_column_ids` <- ApiClient$new()$deserializeObj(this_object$`custom_column_ids`, "array[character]", loadNamespace("openapi"))
      self$`end_date` <- this_object$`end_date`
      self$`granularity` <- MMMReportGranularity$new()$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
      self$`level` <- MMMReportLevel$new()$fromJSON(jsonlite::toJSON(this_object$`level`, auto_unbox = TRUE, digits = NA))
      self$`report_name` <- this_object$`report_name`
      self$`start_date` <- this_object$`start_date`
      self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[MMMReportingTargetingType]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to MMMReportCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `columns`
      if (!is.null(input_json$`columns`)) {
        stopifnot(is.vector(input_json$`columns`), length(input_json$`columns`) != 0)
        tmp <- sapply(input_json$`columns`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MMMReportCreate: the required field `columns` is missing."))
      }
      # check the required field `end_date`
      if (!is.null(input_json$`end_date`)) {
        if (!(is.character(input_json$`end_date`) && length(input_json$`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", input_json$`end_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MMMReportCreate: the required field `end_date` is missing."))
      }
      # check the required field `granularity`
      if (!is.null(input_json$`granularity`)) {
        stopifnot(R6::is.R6(input_json$`granularity`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MMMReportCreate: the required field `granularity` is missing."))
      }
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        stopifnot(R6::is.R6(input_json$`level`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MMMReportCreate: the required field `level` is missing."))
      }
      # check the required field `report_name`
      if (!is.null(input_json$`report_name`)) {
        if (!(is.character(input_json$`report_name`) && length(input_json$`report_name`) == 1)) {
          stop(paste("Error! Invalid data for `report_name`. Must be a string:", input_json$`report_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MMMReportCreate: the required field `report_name` is missing."))
      }
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MMMReportCreate: the required field `start_date` is missing."))
      }
      # check the required field `targeting_types`
      if (!is.null(input_json$`targeting_types`)) {
        stopifnot(is.vector(input_json$`targeting_types`), length(input_json$`targeting_types`) != 0)
        tmp <- sapply(input_json$`targeting_types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MMMReportCreate: the required field `targeting_types` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MMMReportCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
        return(FALSE)
      }

      if (length(self$`custom_column_ids`) > 20) {
        return(FALSE)
      }

      # check if the required `end_date` is null
      if (is.null(self$`end_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        return(FALSE)
      }

      # check if the required `granularity` is null
      if (is.null(self$`granularity`)) {
        return(FALSE)
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        return(FALSE)
      }

      # check if the required `report_name` is null
      if (is.null(self$`report_name`)) {
        return(FALSE)
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`start_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        return(FALSE)
      }

      # check if the required `targeting_types` is null
      if (is.null(self$`targeting_types`)) {
        return(FALSE)
      }

      if (length(self$`targeting_types`) > 7) {
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
      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
        invalid_fields["columns"] <- "Non-nullable required field `columns` cannot be null."
      }

      if (length(self$`custom_column_ids`) > 20) {
        invalid_fields["custom_column_ids"] <- "Invalid length for `custom_column_ids`, number of items must be less than or equal to 20."
      }

      # check if the required `end_date` is null
      if (is.null(self$`end_date`)) {
        invalid_fields["end_date"] <- "Non-nullable required field `end_date` cannot be null."
      }

      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
      }

      # check if the required `granularity` is null
      if (is.null(self$`granularity`)) {
        invalid_fields["granularity"] <- "Non-nullable required field `granularity` cannot be null."
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        invalid_fields["level"] <- "Non-nullable required field `level` cannot be null."
      }

      # check if the required `report_name` is null
      if (is.null(self$`report_name`)) {
        invalid_fields["report_name"] <- "Non-nullable required field `report_name` cannot be null."
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        invalid_fields["start_date"] <- "Non-nullable required field `start_date` cannot be null."
      }

      if (!str_detect(self$`start_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["start_date"] <- "Invalid value for `start_date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
      }

      # check if the required `targeting_types` is null
      if (is.null(self$`targeting_types`)) {
        invalid_fields["targeting_types"] <- "Non-nullable required field `targeting_types` cannot be null."
      }

      if (length(self$`targeting_types`) > 7) {
        invalid_fields["targeting_types"] <- "Invalid length for `targeting_types`, number of items must be less than or equal to 7."
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
# MMMReportCreate$unlock()
#
## Below is an example to define the print function
# MMMReportCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MMMReportCreate$lock()

