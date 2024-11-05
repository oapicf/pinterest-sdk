#' Create a new TemplateResponse
#'
#' @description
#' Template fields
#'
#' @docType class
#' @title TemplateResponse
#' @description TemplateResponse Class
#' @format An \code{R6Class} generator object
#' @field id Template ID character [optional]
#' @field ad_account_id ID of the Ad Account that owns the template character [optional]
#' @field ad_account_ids IDs of the Ad Accounts that have access to this template list(character) [optional]
#' @field user_id ID of the user who created the template character [optional]
#' @field name Template Name character [optional]
#' @field report_start_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will start numeric [optional]
#' @field report_end_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will end numeric [optional]
#' @field date_range  \link{TemplateResponseDateRange} [optional]
#' @field report_level  \link{MetricsReportingLevel} [optional]
#' @field report_format  \link{DataOutputFormat} [optional]
#' @field columns A list of columns to be included in the report list(character) [optional]
#' @field granularity  \link{Granularity} [optional]
#' @field view_window_days The length of the sliding window over which view conversions will be attributed numeric [optional]
#' @field click_window_days The length of the sliding window over which click conversions will be attributed numeric [optional]
#' @field engagement_window_days The length of the sliding window over which engagement conversions will be attributed numeric [optional]
#' @field conversion_report_time_type Conversion report time type character [optional]
#' @field filters_json A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values character [optional]
#' @field is_owned_by_user A boolean value that indicates if the user owns the template character [optional]
#' @field is_scheduled A boolean value that indicates if this template has been used to create a scheduled report character [optional]
#' @field creation_source The surface used to create this template character [optional]
#' @field is_deleted A boolean that indicates if the template has been deleted character [optional]
#' @field updated_time Time of last update in seconds since Unix epoch numeric [optional]
#' @field custom_column_ids A list of custom column IDs list(character) [optional]
#' @field type Reporting template type character [optional]
#' @field ingestion_sources The filter on the conversion ingestion source method for conversion metrics list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TemplateResponse <- R6::R6Class(
  "TemplateResponse",
  public = list(
    `id` = NULL,
    `ad_account_id` = NULL,
    `ad_account_ids` = NULL,
    `user_id` = NULL,
    `name` = NULL,
    `report_start_relative_days_in_past` = NULL,
    `report_end_relative_days_in_past` = NULL,
    `date_range` = NULL,
    `report_level` = NULL,
    `report_format` = NULL,
    `columns` = NULL,
    `granularity` = NULL,
    `view_window_days` = NULL,
    `click_window_days` = NULL,
    `engagement_window_days` = NULL,
    `conversion_report_time_type` = NULL,
    `filters_json` = NULL,
    `is_owned_by_user` = NULL,
    `is_scheduled` = NULL,
    `creation_source` = NULL,
    `is_deleted` = NULL,
    `updated_time` = NULL,
    `custom_column_ids` = NULL,
    `type` = NULL,
    `ingestion_sources` = NULL,

    #' @description
    #' Initialize a new TemplateResponse class.
    #'
    #' @param id Template ID
    #' @param ad_account_id ID of the Ad Account that owns the template
    #' @param ad_account_ids IDs of the Ad Accounts that have access to this template
    #' @param user_id ID of the user who created the template
    #' @param name Template Name
    #' @param report_start_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will start
    #' @param report_end_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will end
    #' @param date_range date_range
    #' @param report_level report_level
    #' @param report_format report_format
    #' @param columns A list of columns to be included in the report
    #' @param granularity granularity
    #' @param view_window_days The length of the sliding window over which view conversions will be attributed
    #' @param click_window_days The length of the sliding window over which click conversions will be attributed
    #' @param engagement_window_days The length of the sliding window over which engagement conversions will be attributed
    #' @param conversion_report_time_type Conversion report time type
    #' @param filters_json A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
    #' @param is_owned_by_user A boolean value that indicates if the user owns the template
    #' @param is_scheduled A boolean value that indicates if this template has been used to create a scheduled report
    #' @param creation_source The surface used to create this template
    #' @param is_deleted A boolean that indicates if the template has been deleted
    #' @param updated_time Time of last update in seconds since Unix epoch
    #' @param custom_column_ids A list of custom column IDs
    #' @param type Reporting template type
    #' @param ingestion_sources The filter on the conversion ingestion source method for conversion metrics
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `ad_account_id` = NULL, `ad_account_ids` = NULL, `user_id` = NULL, `name` = NULL, `report_start_relative_days_in_past` = NULL, `report_end_relative_days_in_past` = NULL, `date_range` = NULL, `report_level` = NULL, `report_format` = NULL, `columns` = NULL, `granularity` = NULL, `view_window_days` = NULL, `click_window_days` = NULL, `engagement_window_days` = NULL, `conversion_report_time_type` = NULL, `filters_json` = NULL, `is_owned_by_user` = NULL, `is_scheduled` = NULL, `creation_source` = NULL, `is_deleted` = NULL, `updated_time` = NULL, `custom_column_ids` = NULL, `type` = NULL, `ingestion_sources` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`ad_account_ids`)) {
        stopifnot(is.vector(`ad_account_ids`), length(`ad_account_ids`) != 0)
        sapply(`ad_account_ids`, function(x) stopifnot(is.character(x)))
        self$`ad_account_ids` <- `ad_account_ids`
      }
      if (!is.null(`user_id`)) {
        if (!(is.character(`user_id`) && length(`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be a string:", `user_id`))
        }
        self$`user_id` <- `user_id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`report_start_relative_days_in_past`)) {
        self$`report_start_relative_days_in_past` <- `report_start_relative_days_in_past`
      }
      if (!is.null(`report_end_relative_days_in_past`)) {
        self$`report_end_relative_days_in_past` <- `report_end_relative_days_in_past`
      }
      if (!is.null(`date_range`)) {
        stopifnot(R6::is.R6(`date_range`))
        self$`date_range` <- `date_range`
      }
      if (!is.null(`report_level`)) {
        if (!(`report_level` %in% c())) {
          stop(paste("Error! \"", `report_level`, "\" cannot be assigned to `report_level`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_level`))
        self$`report_level` <- `report_level`
      }
      if (!is.null(`report_format`)) {
        if (!(`report_format` %in% c())) {
          stop(paste("Error! \"", `report_format`, "\" cannot be assigned to `report_format`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_format`))
        self$`report_format` <- `report_format`
      }
      if (!is.null(`columns`)) {
        stopifnot(is.vector(`columns`), length(`columns`) != 0)
        sapply(`columns`, function(x) stopifnot(is.character(x)))
        self$`columns` <- `columns`
      }
      if (!is.null(`granularity`)) {
        if (!(`granularity` %in% c())) {
          stop(paste("Error! \"", `granularity`, "\" cannot be assigned to `granularity`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`granularity`))
        self$`granularity` <- `granularity`
      }
      if (!is.null(`view_window_days`)) {
        self$`view_window_days` <- `view_window_days`
      }
      if (!is.null(`click_window_days`)) {
        self$`click_window_days` <- `click_window_days`
      }
      if (!is.null(`engagement_window_days`)) {
        self$`engagement_window_days` <- `engagement_window_days`
      }
      if (!is.null(`conversion_report_time_type`)) {
        if (!(`conversion_report_time_type` %in% c("TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"))) {
          stop(paste("Error! \"", `conversion_report_time_type`, "\" cannot be assigned to `conversion_report_time_type`. Must be \"TIME_OF_AD_ACTION\", \"TIME_OF_CONVERSION\".", sep = ""))
        }
        if (!(is.character(`conversion_report_time_type`) && length(`conversion_report_time_type`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_report_time_type`. Must be a string:", `conversion_report_time_type`))
        }
        self$`conversion_report_time_type` <- `conversion_report_time_type`
      }
      if (!is.null(`filters_json`)) {
        if (!(is.character(`filters_json`) && length(`filters_json`) == 1)) {
          stop(paste("Error! Invalid data for `filters_json`. Must be a string:", `filters_json`))
        }
        self$`filters_json` <- `filters_json`
      }
      if (!is.null(`is_owned_by_user`)) {
        if (!(is.logical(`is_owned_by_user`) && length(`is_owned_by_user`) == 1)) {
          stop(paste("Error! Invalid data for `is_owned_by_user`. Must be a boolean:", `is_owned_by_user`))
        }
        self$`is_owned_by_user` <- `is_owned_by_user`
      }
      if (!is.null(`is_scheduled`)) {
        if (!(is.logical(`is_scheduled`) && length(`is_scheduled`) == 1)) {
          stop(paste("Error! Invalid data for `is_scheduled`. Must be a boolean:", `is_scheduled`))
        }
        self$`is_scheduled` <- `is_scheduled`
      }
      if (!is.null(`creation_source`)) {
        if (!(`creation_source` %in% c("ADS_API", "ADS_MANAGER_REPORTING_PAGE", "ADS_MANAGER_REPORT_BUILDER"))) {
          stop(paste("Error! \"", `creation_source`, "\" cannot be assigned to `creation_source`. Must be \"ADS_API\", \"ADS_MANAGER_REPORTING_PAGE\", \"ADS_MANAGER_REPORT_BUILDER\".", sep = ""))
        }
        if (!(is.character(`creation_source`) && length(`creation_source`) == 1)) {
          stop(paste("Error! Invalid data for `creation_source`. Must be a string:", `creation_source`))
        }
        self$`creation_source` <- `creation_source`
      }
      if (!is.null(`is_deleted`)) {
        if (!(is.logical(`is_deleted`) && length(`is_deleted`) == 1)) {
          stop(paste("Error! Invalid data for `is_deleted`. Must be a boolean:", `is_deleted`))
        }
        self$`is_deleted` <- `is_deleted`
      }
      if (!is.null(`updated_time`)) {
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`custom_column_ids`)) {
        stopifnot(is.vector(`custom_column_ids`), length(`custom_column_ids`) != 0)
        sapply(`custom_column_ids`, function(x) stopifnot(is.character(x)))
        self$`custom_column_ids` <- `custom_column_ids`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c("UNSPECIFIED", "BULK", "OVERVIEW", "TABLE"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"UNSPECIFIED\", \"BULK\", \"OVERVIEW\", \"TABLE\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`ingestion_sources`)) {
        stopifnot(is.vector(`ingestion_sources`), length(`ingestion_sources`) != 0)
        sapply(`ingestion_sources`, function(x) stopifnot(is.character(x)))
        self$`ingestion_sources` <- `ingestion_sources`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponse in JSON format
    toJSON = function() {
      TemplateResponseObject <- list()
      if (!is.null(self$`id`)) {
        TemplateResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ad_account_id`)) {
        TemplateResponseObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`ad_account_ids`)) {
        TemplateResponseObject[["ad_account_ids"]] <-
          self$`ad_account_ids`
      }
      if (!is.null(self$`user_id`)) {
        TemplateResponseObject[["user_id"]] <-
          self$`user_id`
      }
      if (!is.null(self$`name`)) {
        TemplateResponseObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`report_start_relative_days_in_past`)) {
        TemplateResponseObject[["report_start_relative_days_in_past"]] <-
          self$`report_start_relative_days_in_past`
      }
      if (!is.null(self$`report_end_relative_days_in_past`)) {
        TemplateResponseObject[["report_end_relative_days_in_past"]] <-
          self$`report_end_relative_days_in_past`
      }
      if (!is.null(self$`date_range`)) {
        TemplateResponseObject[["date_range"]] <-
          self$`date_range`$toJSON()
      }
      if (!is.null(self$`report_level`)) {
        TemplateResponseObject[["report_level"]] <-
          self$`report_level`$toJSON()
      }
      if (!is.null(self$`report_format`)) {
        TemplateResponseObject[["report_format"]] <-
          self$`report_format`$toJSON()
      }
      if (!is.null(self$`columns`)) {
        TemplateResponseObject[["columns"]] <-
          self$`columns`
      }
      if (!is.null(self$`granularity`)) {
        TemplateResponseObject[["granularity"]] <-
          self$`granularity`$toJSON()
      }
      if (!is.null(self$`view_window_days`)) {
        TemplateResponseObject[["view_window_days"]] <-
          self$`view_window_days`
      }
      if (!is.null(self$`click_window_days`)) {
        TemplateResponseObject[["click_window_days"]] <-
          self$`click_window_days`
      }
      if (!is.null(self$`engagement_window_days`)) {
        TemplateResponseObject[["engagement_window_days"]] <-
          self$`engagement_window_days`
      }
      if (!is.null(self$`conversion_report_time_type`)) {
        TemplateResponseObject[["conversion_report_time_type"]] <-
          self$`conversion_report_time_type`
      }
      if (!is.null(self$`filters_json`)) {
        TemplateResponseObject[["filters_json"]] <-
          self$`filters_json`
      }
      if (!is.null(self$`is_owned_by_user`)) {
        TemplateResponseObject[["is_owned_by_user"]] <-
          self$`is_owned_by_user`
      }
      if (!is.null(self$`is_scheduled`)) {
        TemplateResponseObject[["is_scheduled"]] <-
          self$`is_scheduled`
      }
      if (!is.null(self$`creation_source`)) {
        TemplateResponseObject[["creation_source"]] <-
          self$`creation_source`
      }
      if (!is.null(self$`is_deleted`)) {
        TemplateResponseObject[["is_deleted"]] <-
          self$`is_deleted`
      }
      if (!is.null(self$`updated_time`)) {
        TemplateResponseObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`custom_column_ids`)) {
        TemplateResponseObject[["custom_column_ids"]] <-
          self$`custom_column_ids`
      }
      if (!is.null(self$`type`)) {
        TemplateResponseObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`ingestion_sources`)) {
        TemplateResponseObject[["ingestion_sources"]] <-
          self$`ingestion_sources`
      }
      TemplateResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`ad_account_ids`)) {
        self$`ad_account_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_account_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`user_id`)) {
        self$`user_id` <- this_object$`user_id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`report_start_relative_days_in_past`)) {
        self$`report_start_relative_days_in_past` <- this_object$`report_start_relative_days_in_past`
      }
      if (!is.null(this_object$`report_end_relative_days_in_past`)) {
        self$`report_end_relative_days_in_past` <- this_object$`report_end_relative_days_in_past`
      }
      if (!is.null(this_object$`date_range`)) {
        `date_range_object` <- TemplateResponseDateRange$new()
        `date_range_object`$fromJSON(jsonlite::toJSON(this_object$`date_range`, auto_unbox = TRUE, digits = NA))
        self$`date_range` <- `date_range_object`
      }
      if (!is.null(this_object$`report_level`)) {
        `report_level_object` <- MetricsReportingLevel$new()
        `report_level_object`$fromJSON(jsonlite::toJSON(this_object$`report_level`, auto_unbox = TRUE, digits = NA))
        self$`report_level` <- `report_level_object`
      }
      if (!is.null(this_object$`report_format`)) {
        `report_format_object` <- DataOutputFormat$new()
        `report_format_object`$fromJSON(jsonlite::toJSON(this_object$`report_format`, auto_unbox = TRUE, digits = NA))
        self$`report_format` <- `report_format_object`
      }
      if (!is.null(this_object$`columns`)) {
        self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`granularity`)) {
        `granularity_object` <- Granularity$new()
        `granularity_object`$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
        self$`granularity` <- `granularity_object`
      }
      if (!is.null(this_object$`view_window_days`)) {
        self$`view_window_days` <- this_object$`view_window_days`
      }
      if (!is.null(this_object$`click_window_days`)) {
        self$`click_window_days` <- this_object$`click_window_days`
      }
      if (!is.null(this_object$`engagement_window_days`)) {
        self$`engagement_window_days` <- this_object$`engagement_window_days`
      }
      if (!is.null(this_object$`conversion_report_time_type`)) {
        if (!is.null(this_object$`conversion_report_time_type`) && !(this_object$`conversion_report_time_type` %in% c("TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"))) {
          stop(paste("Error! \"", this_object$`conversion_report_time_type`, "\" cannot be assigned to `conversion_report_time_type`. Must be \"TIME_OF_AD_ACTION\", \"TIME_OF_CONVERSION\".", sep = ""))
        }
        self$`conversion_report_time_type` <- this_object$`conversion_report_time_type`
      }
      if (!is.null(this_object$`filters_json`)) {
        self$`filters_json` <- this_object$`filters_json`
      }
      if (!is.null(this_object$`is_owned_by_user`)) {
        self$`is_owned_by_user` <- this_object$`is_owned_by_user`
      }
      if (!is.null(this_object$`is_scheduled`)) {
        self$`is_scheduled` <- this_object$`is_scheduled`
      }
      if (!is.null(this_object$`creation_source`)) {
        if (!is.null(this_object$`creation_source`) && !(this_object$`creation_source` %in% c("ADS_API", "ADS_MANAGER_REPORTING_PAGE", "ADS_MANAGER_REPORT_BUILDER"))) {
          stop(paste("Error! \"", this_object$`creation_source`, "\" cannot be assigned to `creation_source`. Must be \"ADS_API\", \"ADS_MANAGER_REPORTING_PAGE\", \"ADS_MANAGER_REPORT_BUILDER\".", sep = ""))
        }
        self$`creation_source` <- this_object$`creation_source`
      }
      if (!is.null(this_object$`is_deleted`)) {
        self$`is_deleted` <- this_object$`is_deleted`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`custom_column_ids`)) {
        self$`custom_column_ids` <- ApiClient$new()$deserializeObj(this_object$`custom_column_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("UNSPECIFIED", "BULK", "OVERVIEW", "TABLE"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"UNSPECIFIED\", \"BULK\", \"OVERVIEW\", \"TABLE\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`ingestion_sources`)) {
        self$`ingestion_sources` <- ApiClient$new()$deserializeObj(this_object$`ingestion_sources`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`ad_account_ids`)) {
          sprintf(
          '"ad_account_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`ad_account_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`user_id`)) {
          sprintf(
          '"user_id":
            "%s"
                    ',
          self$`user_id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`report_start_relative_days_in_past`)) {
          sprintf(
          '"report_start_relative_days_in_past":
            %d
                    ',
          self$`report_start_relative_days_in_past`
          )
        },
        if (!is.null(self$`report_end_relative_days_in_past`)) {
          sprintf(
          '"report_end_relative_days_in_past":
            %d
                    ',
          self$`report_end_relative_days_in_past`
          )
        },
        if (!is.null(self$`date_range`)) {
          sprintf(
          '"date_range":
          %s
          ',
          jsonlite::toJSON(self$`date_range`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`report_level`)) {
          sprintf(
          '"report_level":
          %s
          ',
          jsonlite::toJSON(self$`report_level`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`report_format`)) {
          sprintf(
          '"report_format":
          %s
          ',
          jsonlite::toJSON(self$`report_format`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`columns`)) {
          sprintf(
          '"columns":
             [%s]
          ',
          paste(unlist(lapply(self$`columns`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`granularity`)) {
          sprintf(
          '"granularity":
          %s
          ',
          jsonlite::toJSON(self$`granularity`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`view_window_days`)) {
          sprintf(
          '"view_window_days":
            %d
                    ',
          self$`view_window_days`
          )
        },
        if (!is.null(self$`click_window_days`)) {
          sprintf(
          '"click_window_days":
            %d
                    ',
          self$`click_window_days`
          )
        },
        if (!is.null(self$`engagement_window_days`)) {
          sprintf(
          '"engagement_window_days":
            %d
                    ',
          self$`engagement_window_days`
          )
        },
        if (!is.null(self$`conversion_report_time_type`)) {
          sprintf(
          '"conversion_report_time_type":
            "%s"
                    ',
          self$`conversion_report_time_type`
          )
        },
        if (!is.null(self$`filters_json`)) {
          sprintf(
          '"filters_json":
            "%s"
                    ',
          self$`filters_json`
          )
        },
        if (!is.null(self$`is_owned_by_user`)) {
          sprintf(
          '"is_owned_by_user":
            %s
                    ',
          tolower(self$`is_owned_by_user`)
          )
        },
        if (!is.null(self$`is_scheduled`)) {
          sprintf(
          '"is_scheduled":
            %s
                    ',
          tolower(self$`is_scheduled`)
          )
        },
        if (!is.null(self$`creation_source`)) {
          sprintf(
          '"creation_source":
            "%s"
                    ',
          self$`creation_source`
          )
        },
        if (!is.null(self$`is_deleted`)) {
          sprintf(
          '"is_deleted":
            %s
                    ',
          tolower(self$`is_deleted`)
          )
        },
        if (!is.null(self$`updated_time`)) {
          sprintf(
          '"updated_time":
            %d
                    ',
          self$`updated_time`
          )
        },
        if (!is.null(self$`custom_column_ids`)) {
          sprintf(
          '"custom_column_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`custom_column_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`ingestion_sources`)) {
          sprintf(
          '"ingestion_sources":
             [%s]
          ',
          paste(unlist(lapply(self$`ingestion_sources`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`ad_account_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_account_ids`, "array[character]", loadNamespace("openapi"))
      self$`user_id` <- this_object$`user_id`
      self$`name` <- this_object$`name`
      self$`report_start_relative_days_in_past` <- this_object$`report_start_relative_days_in_past`
      self$`report_end_relative_days_in_past` <- this_object$`report_end_relative_days_in_past`
      self$`date_range` <- TemplateResponseDateRange$new()$fromJSON(jsonlite::toJSON(this_object$`date_range`, auto_unbox = TRUE, digits = NA))
      self$`report_level` <- MetricsReportingLevel$new()$fromJSON(jsonlite::toJSON(this_object$`report_level`, auto_unbox = TRUE, digits = NA))
      self$`report_format` <- DataOutputFormat$new()$fromJSON(jsonlite::toJSON(this_object$`report_format`, auto_unbox = TRUE, digits = NA))
      self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[character]", loadNamespace("openapi"))
      self$`granularity` <- Granularity$new()$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
      self$`view_window_days` <- this_object$`view_window_days`
      self$`click_window_days` <- this_object$`click_window_days`
      self$`engagement_window_days` <- this_object$`engagement_window_days`
      if (!is.null(this_object$`conversion_report_time_type`) && !(this_object$`conversion_report_time_type` %in% c("TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"))) {
        stop(paste("Error! \"", this_object$`conversion_report_time_type`, "\" cannot be assigned to `conversion_report_time_type`. Must be \"TIME_OF_AD_ACTION\", \"TIME_OF_CONVERSION\".", sep = ""))
      }
      self$`conversion_report_time_type` <- this_object$`conversion_report_time_type`
      self$`filters_json` <- this_object$`filters_json`
      self$`is_owned_by_user` <- this_object$`is_owned_by_user`
      self$`is_scheduled` <- this_object$`is_scheduled`
      if (!is.null(this_object$`creation_source`) && !(this_object$`creation_source` %in% c("ADS_API", "ADS_MANAGER_REPORTING_PAGE", "ADS_MANAGER_REPORT_BUILDER"))) {
        stop(paste("Error! \"", this_object$`creation_source`, "\" cannot be assigned to `creation_source`. Must be \"ADS_API\", \"ADS_MANAGER_REPORTING_PAGE\", \"ADS_MANAGER_REPORT_BUILDER\".", sep = ""))
      }
      self$`creation_source` <- this_object$`creation_source`
      self$`is_deleted` <- this_object$`is_deleted`
      self$`updated_time` <- this_object$`updated_time`
      self$`custom_column_ids` <- ApiClient$new()$deserializeObj(this_object$`custom_column_ids`, "array[character]", loadNamespace("openapi"))
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("UNSPECIFIED", "BULK", "OVERVIEW", "TABLE"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"UNSPECIFIED\", \"BULK\", \"OVERVIEW\", \"TABLE\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`ingestion_sources` <- ApiClient$new()$deserializeObj(this_object$`ingestion_sources`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TemplateResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TemplateResponse
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
# TemplateResponse$unlock()
#
## Below is an example to define the print function
# TemplateResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TemplateResponse$lock()

