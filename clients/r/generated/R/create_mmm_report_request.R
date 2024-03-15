#' Create a new CreateMMMReportRequest
#'
#' @description
#' CreateMMMReportRequest Class
#'
#' @docType class
#' @title CreateMMMReportRequest
#' @description CreateMMMReportRequest Class
#' @format An \code{R6Class} generator object
#' @field report_name Name of the Marketing Mix Modeling (MMM) report character
#' @field start_date Metric report start date (UTC). Format: YYYY-MM-DD character
#' @field end_date Metric report end date (UTC). Format: YYYY-MM-DD character
#' @field granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. character
#' @field level Level of the report character
#' @field targeting_types List of targeting types list(\link{MMMReportingTargetingType})
#' @field columns Metric and entity columns list(\link{MMMReportingColumn})
#' @field countries A List of countries for filtering list(\link{TargetingAdvertiserCountry}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateMMMReportRequest <- R6::R6Class(
  "CreateMMMReportRequest",
  public = list(
    `report_name` = NULL,
    `start_date` = NULL,
    `end_date` = NULL,
    `granularity` = NULL,
    `level` = NULL,
    `targeting_types` = NULL,
    `columns` = NULL,
    `countries` = NULL,
    #' Initialize a new CreateMMMReportRequest class.
    #'
    #' @description
    #' Initialize a new CreateMMMReportRequest class.
    #'
    #' @param report_name Name of the Marketing Mix Modeling (MMM) report
    #' @param start_date Metric report start date (UTC). Format: YYYY-MM-DD
    #' @param end_date Metric report end date (UTC). Format: YYYY-MM-DD
    #' @param granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
    #' @param level Level of the report
    #' @param targeting_types List of targeting types
    #' @param columns Metric and entity columns
    #' @param countries A List of countries for filtering
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`report_name`, `start_date`, `end_date`, `granularity`, `level`, `targeting_types`, `columns`, `countries` = NULL, ...) {
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
      if (!missing(`end_date`)) {
        if (!(is.character(`end_date`) && length(`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!missing(`granularity`)) {
        if (!(`granularity` %in% c("DAY", "WEEK"))) {
          stop(paste("Error! \"", `granularity`, "\" cannot be assigned to `granularity`. Must be \"DAY\", \"WEEK\".", sep = ""))
        }
        if (!(is.character(`granularity`) && length(`granularity`) == 1)) {
          stop(paste("Error! Invalid data for `granularity`. Must be a string:", `granularity`))
        }
        self$`granularity` <- `granularity`
      }
      if (!missing(`level`)) {
        if (!(`level` %in% c("CAMPAIGN_TARGETING", "AD_GROUP_TARGETING"))) {
          stop(paste("Error! \"", `level`, "\" cannot be assigned to `level`. Must be \"CAMPAIGN_TARGETING\", \"AD_GROUP_TARGETING\".", sep = ""))
        }
        if (!(is.character(`level`) && length(`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be a string:", `level`))
        }
        self$`level` <- `level`
      }
      if (!missing(`targeting_types`)) {
        stopifnot(is.vector(`targeting_types`), length(`targeting_types`) != 0)
        sapply(`targeting_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`targeting_types` <- `targeting_types`
      }
      if (!missing(`columns`)) {
        stopifnot(is.vector(`columns`), length(`columns`) != 0)
        sapply(`columns`, function(x) stopifnot(R6::is.R6(x)))
        self$`columns` <- `columns`
      }
      if (!is.null(`countries`)) {
        stopifnot(is.vector(`countries`), length(`countries`) != 0)
        sapply(`countries`, function(x) stopifnot(R6::is.R6(x)))
        self$`countries` <- `countries`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateMMMReportRequest in JSON format
    #' @export
    toJSON = function() {
      CreateMMMReportRequestObject <- list()
      if (!is.null(self$`report_name`)) {
        CreateMMMReportRequestObject[["report_name"]] <-
          self$`report_name`
      }
      if (!is.null(self$`start_date`)) {
        CreateMMMReportRequestObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`end_date`)) {
        CreateMMMReportRequestObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`granularity`)) {
        CreateMMMReportRequestObject[["granularity"]] <-
          self$`granularity`
      }
      if (!is.null(self$`level`)) {
        CreateMMMReportRequestObject[["level"]] <-
          self$`level`
      }
      if (!is.null(self$`targeting_types`)) {
        CreateMMMReportRequestObject[["targeting_types"]] <-
          lapply(self$`targeting_types`, function(x) x$toJSON())
      }
      if (!is.null(self$`columns`)) {
        CreateMMMReportRequestObject[["columns"]] <-
          lapply(self$`columns`, function(x) x$toJSON())
      }
      if (!is.null(self$`countries`)) {
        CreateMMMReportRequestObject[["countries"]] <-
          lapply(self$`countries`, function(x) x$toJSON())
      }
      CreateMMMReportRequestObject
    },
    #' Deserialize JSON string into an instance of CreateMMMReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateMMMReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMMMReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_name`)) {
        self$`report_name` <- this_object$`report_name`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`granularity`)) {
        if (!is.null(this_object$`granularity`) && !(this_object$`granularity` %in% c("DAY", "WEEK"))) {
          stop(paste("Error! \"", this_object$`granularity`, "\" cannot be assigned to `granularity`. Must be \"DAY\", \"WEEK\".", sep = ""))
        }
        self$`granularity` <- this_object$`granularity`
      }
      if (!is.null(this_object$`level`)) {
        if (!is.null(this_object$`level`) && !(this_object$`level` %in% c("CAMPAIGN_TARGETING", "AD_GROUP_TARGETING"))) {
          stop(paste("Error! \"", this_object$`level`, "\" cannot be assigned to `level`. Must be \"CAMPAIGN_TARGETING\", \"AD_GROUP_TARGETING\".", sep = ""))
        }
        self$`level` <- this_object$`level`
      }
      if (!is.null(this_object$`targeting_types`)) {
        self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[MMMReportingTargetingType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`columns`)) {
        self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[MMMReportingColumn]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`countries`)) {
        self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[TargetingAdvertiserCountry]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateMMMReportRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`report_name`)) {
          sprintf(
          '"report_name":
            "%s"
                    ',
          self$`report_name`
          )
        },
        if (!is.null(self$`start_date`)) {
          sprintf(
          '"start_date":
            "%s"
                    ',
          self$`start_date`
          )
        },
        if (!is.null(self$`end_date`)) {
          sprintf(
          '"end_date":
            "%s"
                    ',
          self$`end_date`
          )
        },
        if (!is.null(self$`granularity`)) {
          sprintf(
          '"granularity":
            "%s"
                    ',
          self$`granularity`
          )
        },
        if (!is.null(self$`level`)) {
          sprintf(
          '"level":
            "%s"
                    ',
          self$`level`
          )
        },
        if (!is.null(self$`targeting_types`)) {
          sprintf(
          '"targeting_types":
          [%s]
',
          paste(sapply(self$`targeting_types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`columns`)) {
          sprintf(
          '"columns":
          [%s]
',
          paste(sapply(self$`columns`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`countries`)) {
          sprintf(
          '"countries":
          [%s]
',
          paste(sapply(self$`countries`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateMMMReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateMMMReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMMMReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`report_name` <- this_object$`report_name`
      self$`start_date` <- this_object$`start_date`
      self$`end_date` <- this_object$`end_date`
      if (!is.null(this_object$`granularity`) && !(this_object$`granularity` %in% c("DAY", "WEEK"))) {
        stop(paste("Error! \"", this_object$`granularity`, "\" cannot be assigned to `granularity`. Must be \"DAY\", \"WEEK\".", sep = ""))
      }
      self$`granularity` <- this_object$`granularity`
      if (!is.null(this_object$`level`) && !(this_object$`level` %in% c("CAMPAIGN_TARGETING", "AD_GROUP_TARGETING"))) {
        stop(paste("Error! \"", this_object$`level`, "\" cannot be assigned to `level`. Must be \"CAMPAIGN_TARGETING\", \"AD_GROUP_TARGETING\".", sep = ""))
      }
      self$`level` <- this_object$`level`
      self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[MMMReportingTargetingType]", loadNamespace("openapi"))
      self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[MMMReportingColumn]", loadNamespace("openapi"))
      self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[TargetingAdvertiserCountry]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CreateMMMReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateMMMReportRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `report_name`
      if (!is.null(input_json$`report_name`)) {
        if (!(is.character(input_json$`report_name`) && length(input_json$`report_name`) == 1)) {
          stop(paste("Error! Invalid data for `report_name`. Must be a string:", input_json$`report_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMMMReportRequest: the required field `report_name` is missing."))
      }
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMMMReportRequest: the required field `start_date` is missing."))
      }
      # check the required field `end_date`
      if (!is.null(input_json$`end_date`)) {
        if (!(is.character(input_json$`end_date`) && length(input_json$`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", input_json$`end_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMMMReportRequest: the required field `end_date` is missing."))
      }
      # check the required field `granularity`
      if (!is.null(input_json$`granularity`)) {
        if (!(is.character(input_json$`granularity`) && length(input_json$`granularity`) == 1)) {
          stop(paste("Error! Invalid data for `granularity`. Must be a string:", input_json$`granularity`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMMMReportRequest: the required field `granularity` is missing."))
      }
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        if (!(is.character(input_json$`level`) && length(input_json$`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be a string:", input_json$`level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMMMReportRequest: the required field `level` is missing."))
      }
      # check the required field `targeting_types`
      if (!is.null(input_json$`targeting_types`)) {
        stopifnot(is.vector(input_json$`targeting_types`), length(input_json$`targeting_types`) != 0)
        tmp <- sapply(input_json$`targeting_types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMMMReportRequest: the required field `targeting_types` is missing."))
      }
      # check the required field `columns`
      if (!is.null(input_json$`columns`)) {
        stopifnot(is.vector(input_json$`columns`), length(input_json$`columns`) != 0)
        tmp <- sapply(input_json$`columns`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMMMReportRequest: the required field `columns` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateMMMReportRequest
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
      # check if the required `report_name` is null
      if (is.null(self$`report_name`)) {
        return(FALSE)
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        return(FALSE)
      }

      # check if the required `end_date` is null
      if (is.null(self$`end_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
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

      # check if the required `targeting_types` is null
      if (is.null(self$`targeting_types`)) {
        return(FALSE)
      }

      if (length(self$`targeting_types`) > 5) {
        return(FALSE)
      }
      if (length(self$`targeting_types`) < 1) {
        return(FALSE)
      }

      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
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
      # check if the required `report_name` is null
      if (is.null(self$`report_name`)) {
        invalid_fields["report_name"] <- "Non-nullable required field `report_name` cannot be null."
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        invalid_fields["start_date"] <- "Non-nullable required field `start_date` cannot be null."
      }

      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["start_date"] <- "Invalid value for `start_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      # check if the required `end_date` is null
      if (is.null(self$`end_date`)) {
        invalid_fields["end_date"] <- "Non-nullable required field `end_date` cannot be null."
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      # check if the required `granularity` is null
      if (is.null(self$`granularity`)) {
        invalid_fields["granularity"] <- "Non-nullable required field `granularity` cannot be null."
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        invalid_fields["level"] <- "Non-nullable required field `level` cannot be null."
      }

      # check if the required `targeting_types` is null
      if (is.null(self$`targeting_types`)) {
        invalid_fields["targeting_types"] <- "Non-nullable required field `targeting_types` cannot be null."
      }

      if (length(self$`targeting_types`) > 5) {
        invalid_fields["targeting_types"] <- "Invalid length for `targeting_types`, number of items must be less than or equal to 5."
      }
      if (length(self$`targeting_types`) < 1) {
        invalid_fields["targeting_types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
        invalid_fields["columns"] <- "Non-nullable required field `columns` cannot be null."
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
# CreateMMMReportRequest$unlock()
#
## Below is an example to define the print function
# CreateMMMReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateMMMReportRequest$lock()

