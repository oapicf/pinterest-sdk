#' Create a new AccountTemplate
#'
#' @description
#' AccountTemplate Class
#'
#' @docType class
#' @title AccountTemplate
#' @description AccountTemplate Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id ID of the Ad Account that owns the template character [optional]
#' @field ad_account_ids IDs of the Ad Accounts that have access to this template list(character) [optional]
#' @field ade_columns A list of ADE columns list(character) [optional]
#' @field attribution_type Attribution type for Brand/Category/SKU reports \link{AnyType} [optional]
#' @field click_window_days The length of the sliding window over which click conversions will be attributed numeric [optional]
#' @field columns A list of columns to be included in the report list(\link{ReportingColumn}) [optional]
#' @field conversion_report_time_type Conversion report time type \link{ConversionReportTimeType} [optional]
#' @field creation_source The surface used to create this template \link{CreationSource} [optional]
#' @field custom_column_ids A list of custom column IDs list(character) [optional]
#' @field display_metadata Additional metadata about this reporting template character [optional]
#' @field engagement_window_days The length of the sliding window over which engagement conversions will be attributed numeric [optional]
#' @field filters_json A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values character [optional]
#' @field granularity  \link{Granularity} [optional]
#' @field id Template ID character
#' @field ingestion_sources The filter on the conversion ingestion source method for conversion metrics list(\link{IngestionSource}) [optional]
#' @field is_default A boolean representing if this is the default view that loads for this template type character [optional]
#' @field is_deleted A boolean that indicates if the template has been deleted character [optional]
#' @field is_owned_by_user A boolean value that indicates if the user owns the template character [optional]
#' @field is_scheduled A boolean value that indicates if this template has been used to create a scheduled report character [optional]
#' @field name Template Name character [optional]
#' @field report_end_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will end numeric [optional]
#' @field report_format  \link{DataOutputFormat} [optional]
#' @field report_level  \link{MetricsReportingLevel} [optional]
#' @field report_start_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will start numeric [optional]
#' @field reporting_time_zone Timezone for reporting data \link{ReportingTimeZone} [optional]
#' @field sort_by Unified metric sort configuration \link{AnyType} [optional]
#' @field type Type of the template character [optional]
#' @field updated_time Time of last update in seconds since Unix epoch numeric [optional]
#' @field user_id ID of the user who created the template character [optional]
#' @field view_window_days The length of the sliding window over which view conversions will be attributed numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AccountTemplate <- R6::R6Class(
  "AccountTemplate",
  public = list(
    `ad_account_id` = NULL,
    `ad_account_ids` = NULL,
    `ade_columns` = NULL,
    `attribution_type` = NULL,
    `click_window_days` = NULL,
    `columns` = NULL,
    `conversion_report_time_type` = NULL,
    `creation_source` = NULL,
    `custom_column_ids` = NULL,
    `display_metadata` = NULL,
    `engagement_window_days` = NULL,
    `filters_json` = NULL,
    `granularity` = NULL,
    `id` = NULL,
    `ingestion_sources` = NULL,
    `is_default` = NULL,
    `is_deleted` = NULL,
    `is_owned_by_user` = NULL,
    `is_scheduled` = NULL,
    `name` = NULL,
    `report_end_relative_days_in_past` = NULL,
    `report_format` = NULL,
    `report_level` = NULL,
    `report_start_relative_days_in_past` = NULL,
    `reporting_time_zone` = NULL,
    `sort_by` = NULL,
    `type` = NULL,
    `updated_time` = NULL,
    `user_id` = NULL,
    `view_window_days` = NULL,

    #' @description
    #' Initialize a new AccountTemplate class.
    #'
    #' @param id Template ID
    #' @param ad_account_id ID of the Ad Account that owns the template
    #' @param ad_account_ids IDs of the Ad Accounts that have access to this template
    #' @param ade_columns A list of ADE columns
    #' @param attribution_type Attribution type for Brand/Category/SKU reports
    #' @param click_window_days The length of the sliding window over which click conversions will be attributed
    #' @param columns A list of columns to be included in the report
    #' @param conversion_report_time_type Conversion report time type
    #' @param creation_source The surface used to create this template
    #' @param custom_column_ids A list of custom column IDs
    #' @param display_metadata Additional metadata about this reporting template
    #' @param engagement_window_days The length of the sliding window over which engagement conversions will be attributed
    #' @param filters_json A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
    #' @param granularity granularity
    #' @param ingestion_sources The filter on the conversion ingestion source method for conversion metrics
    #' @param is_default A boolean representing if this is the default view that loads for this template type
    #' @param is_deleted A boolean that indicates if the template has been deleted
    #' @param is_owned_by_user A boolean value that indicates if the user owns the template
    #' @param is_scheduled A boolean value that indicates if this template has been used to create a scheduled report
    #' @param name Template Name
    #' @param report_end_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will end
    #' @param report_format report_format
    #' @param report_level report_level
    #' @param report_start_relative_days_in_past The number of days prior to the day the report will be delivered at which the report will start
    #' @param reporting_time_zone Timezone for reporting data
    #' @param sort_by Unified metric sort configuration
    #' @param type Type of the template
    #' @param updated_time Time of last update in seconds since Unix epoch
    #' @param user_id ID of the user who created the template
    #' @param view_window_days The length of the sliding window over which view conversions will be attributed
    #' @param ... Other optional arguments.
    initialize = function(`id`, `ad_account_id` = NULL, `ad_account_ids` = NULL, `ade_columns` = NULL, `attribution_type` = NULL, `click_window_days` = NULL, `columns` = NULL, `conversion_report_time_type` = NULL, `creation_source` = NULL, `custom_column_ids` = NULL, `display_metadata` = NULL, `engagement_window_days` = NULL, `filters_json` = NULL, `granularity` = NULL, `ingestion_sources` = NULL, `is_default` = NULL, `is_deleted` = NULL, `is_owned_by_user` = NULL, `is_scheduled` = NULL, `name` = NULL, `report_end_relative_days_in_past` = NULL, `report_format` = NULL, `report_level` = NULL, `report_start_relative_days_in_past` = NULL, `reporting_time_zone` = NULL, `sort_by` = NULL, `type` = NULL, `updated_time` = NULL, `user_id` = NULL, `view_window_days` = NULL, ...) {
      if (!missing(`id`)) {
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
      if (!is.null(`ade_columns`)) {
        stopifnot(is.vector(`ade_columns`), length(`ade_columns`) != 0)
        sapply(`ade_columns`, function(x) stopifnot(is.character(x)))
        self$`ade_columns` <- `ade_columns`
      }
      if (!is.null(`attribution_type`)) {
        stopifnot(R6::is.R6(`attribution_type`))
        self$`attribution_type` <- `attribution_type`
      }
      if (!is.null(`click_window_days`)) {
        self$`click_window_days` <- `click_window_days`
      }
      if (!is.null(`columns`)) {
        stopifnot(is.vector(`columns`), length(`columns`) != 0)
        sapply(`columns`, function(x) stopifnot(R6::is.R6(x)))
        self$`columns` <- `columns`
      }
      if (!is.null(`conversion_report_time_type`)) {
        if (!(`conversion_report_time_type` %in% c())) {
          stop(paste("Error! \"", `conversion_report_time_type`, "\" cannot be assigned to `conversion_report_time_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_report_time_type`))
        self$`conversion_report_time_type` <- `conversion_report_time_type`
      }
      if (!is.null(`creation_source`)) {
        if (!(`creation_source` %in% c())) {
          stop(paste("Error! \"", `creation_source`, "\" cannot be assigned to `creation_source`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creation_source`))
        self$`creation_source` <- `creation_source`
      }
      if (!is.null(`custom_column_ids`)) {
        stopifnot(is.vector(`custom_column_ids`), length(`custom_column_ids`) != 0)
        sapply(`custom_column_ids`, function(x) stopifnot(is.character(x)))
        self$`custom_column_ids` <- `custom_column_ids`
      }
      if (!is.null(`display_metadata`)) {
        if (!(is.character(`display_metadata`) && length(`display_metadata`) == 1)) {
          stop(paste("Error! Invalid data for `display_metadata`. Must be a string:", `display_metadata`))
        }
        self$`display_metadata` <- `display_metadata`
      }
      if (!is.null(`engagement_window_days`)) {
        self$`engagement_window_days` <- `engagement_window_days`
      }
      if (!is.null(`filters_json`)) {
        if (!(is.character(`filters_json`) && length(`filters_json`) == 1)) {
          stop(paste("Error! Invalid data for `filters_json`. Must be a string:", `filters_json`))
        }
        self$`filters_json` <- `filters_json`
      }
      if (!is.null(`granularity`)) {
        if (!(`granularity` %in% c())) {
          stop(paste("Error! \"", `granularity`, "\" cannot be assigned to `granularity`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`granularity`))
        self$`granularity` <- `granularity`
      }
      if (!is.null(`ingestion_sources`)) {
        stopifnot(is.vector(`ingestion_sources`), length(`ingestion_sources`) != 0)
        sapply(`ingestion_sources`, function(x) stopifnot(R6::is.R6(x)))
        self$`ingestion_sources` <- `ingestion_sources`
      }
      if (!is.null(`is_default`)) {
        if (!(is.logical(`is_default`) && length(`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", `is_default`))
        }
        self$`is_default` <- `is_default`
      }
      if (!is.null(`is_deleted`)) {
        if (!(is.logical(`is_deleted`) && length(`is_deleted`) == 1)) {
          stop(paste("Error! Invalid data for `is_deleted`. Must be a boolean:", `is_deleted`))
        }
        self$`is_deleted` <- `is_deleted`
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
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`report_end_relative_days_in_past`)) {
        self$`report_end_relative_days_in_past` <- `report_end_relative_days_in_past`
      }
      if (!is.null(`report_format`)) {
        if (!(`report_format` %in% c())) {
          stop(paste("Error! \"", `report_format`, "\" cannot be assigned to `report_format`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_format`))
        self$`report_format` <- `report_format`
      }
      if (!is.null(`report_level`)) {
        if (!(`report_level` %in% c())) {
          stop(paste("Error! \"", `report_level`, "\" cannot be assigned to `report_level`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_level`))
        self$`report_level` <- `report_level`
      }
      if (!is.null(`report_start_relative_days_in_past`)) {
        self$`report_start_relative_days_in_past` <- `report_start_relative_days_in_past`
      }
      if (!is.null(`reporting_time_zone`)) {
        if (!(`reporting_time_zone` %in% c())) {
          stop(paste("Error! \"", `reporting_time_zone`, "\" cannot be assigned to `reporting_time_zone`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`reporting_time_zone`))
        self$`reporting_time_zone` <- `reporting_time_zone`
      }
      if (!is.null(`sort_by`)) {
        stopifnot(R6::is.R6(`sort_by`))
        self$`sort_by` <- `sort_by`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`updated_time`)) {
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`user_id`)) {
        if (!(is.character(`user_id`) && length(`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be a string:", `user_id`))
        }
        self$`user_id` <- `user_id`
      }
      if (!is.null(`view_window_days`)) {
        self$`view_window_days` <- `view_window_days`
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
    #' @return AccountTemplate as a base R list.
    #' @examples
    #' # convert array of AccountTemplate (x) to a data frame
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
    #' Convert AccountTemplate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AccountTemplateObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AccountTemplateObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`ad_account_ids`)) {
        AccountTemplateObject[["ad_account_ids"]] <-
          self$`ad_account_ids`
      }
      if (!is.null(self$`ade_columns`)) {
        AccountTemplateObject[["ade_columns"]] <-
          self$`ade_columns`
      }
      if (!is.null(self$`attribution_type`)) {
        AccountTemplateObject[["attribution_type"]] <-
          self$extractSimpleType(self$`attribution_type`)
      }
      if (!is.null(self$`click_window_days`)) {
        AccountTemplateObject[["click_window_days"]] <-
          self$`click_window_days`
      }
      if (!is.null(self$`columns`)) {
        AccountTemplateObject[["columns"]] <-
          self$extractSimpleType(self$`columns`)
      }
      if (!is.null(self$`conversion_report_time_type`)) {
        AccountTemplateObject[["conversion_report_time_type"]] <-
          self$extractSimpleType(self$`conversion_report_time_type`)
      }
      if (!is.null(self$`creation_source`)) {
        AccountTemplateObject[["creation_source"]] <-
          self$extractSimpleType(self$`creation_source`)
      }
      if (!is.null(self$`custom_column_ids`)) {
        AccountTemplateObject[["custom_column_ids"]] <-
          self$`custom_column_ids`
      }
      if (!is.null(self$`display_metadata`)) {
        AccountTemplateObject[["display_metadata"]] <-
          self$`display_metadata`
      }
      if (!is.null(self$`engagement_window_days`)) {
        AccountTemplateObject[["engagement_window_days"]] <-
          self$`engagement_window_days`
      }
      if (!is.null(self$`filters_json`)) {
        AccountTemplateObject[["filters_json"]] <-
          self$`filters_json`
      }
      if (!is.null(self$`granularity`)) {
        AccountTemplateObject[["granularity"]] <-
          self$extractSimpleType(self$`granularity`)
      }
      if (!is.null(self$`id`)) {
        AccountTemplateObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ingestion_sources`)) {
        AccountTemplateObject[["ingestion_sources"]] <-
          self$extractSimpleType(self$`ingestion_sources`)
      }
      if (!is.null(self$`is_default`)) {
        AccountTemplateObject[["is_default"]] <-
          self$`is_default`
      }
      if (!is.null(self$`is_deleted`)) {
        AccountTemplateObject[["is_deleted"]] <-
          self$`is_deleted`
      }
      if (!is.null(self$`is_owned_by_user`)) {
        AccountTemplateObject[["is_owned_by_user"]] <-
          self$`is_owned_by_user`
      }
      if (!is.null(self$`is_scheduled`)) {
        AccountTemplateObject[["is_scheduled"]] <-
          self$`is_scheduled`
      }
      if (!is.null(self$`name`)) {
        AccountTemplateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`report_end_relative_days_in_past`)) {
        AccountTemplateObject[["report_end_relative_days_in_past"]] <-
          self$`report_end_relative_days_in_past`
      }
      if (!is.null(self$`report_format`)) {
        AccountTemplateObject[["report_format"]] <-
          self$extractSimpleType(self$`report_format`)
      }
      if (!is.null(self$`report_level`)) {
        AccountTemplateObject[["report_level"]] <-
          self$extractSimpleType(self$`report_level`)
      }
      if (!is.null(self$`report_start_relative_days_in_past`)) {
        AccountTemplateObject[["report_start_relative_days_in_past"]] <-
          self$`report_start_relative_days_in_past`
      }
      if (!is.null(self$`reporting_time_zone`)) {
        AccountTemplateObject[["reporting_time_zone"]] <-
          self$extractSimpleType(self$`reporting_time_zone`)
      }
      if (!is.null(self$`sort_by`)) {
        AccountTemplateObject[["sort_by"]] <-
          self$extractSimpleType(self$`sort_by`)
      }
      if (!is.null(self$`type`)) {
        AccountTemplateObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`updated_time`)) {
        AccountTemplateObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`user_id`)) {
        AccountTemplateObject[["user_id"]] <-
          self$`user_id`
      }
      if (!is.null(self$`view_window_days`)) {
        AccountTemplateObject[["view_window_days"]] <-
          self$`view_window_days`
      }
      return(AccountTemplateObject)
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
    #' Deserialize JSON string into an instance of AccountTemplate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AccountTemplate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`ad_account_ids`)) {
        self$`ad_account_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_account_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ade_columns`)) {
        self$`ade_columns` <- ApiClient$new()$deserializeObj(this_object$`ade_columns`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`attribution_type`)) {
        `attribution_type_object` <- AnyType$new()
        `attribution_type_object`$fromJSON(jsonlite::toJSON(this_object$`attribution_type`, auto_unbox = TRUE, digits = NA))
        self$`attribution_type` <- `attribution_type_object`
      }
      if (!is.null(this_object$`click_window_days`)) {
        self$`click_window_days` <- this_object$`click_window_days`
      }
      if (!is.null(this_object$`columns`)) {
        self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[ReportingColumn]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`conversion_report_time_type`)) {
        `conversion_report_time_type_object` <- ConversionReportTimeType$new()
        `conversion_report_time_type_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_report_time_type`, auto_unbox = TRUE, digits = NA))
        self$`conversion_report_time_type` <- `conversion_report_time_type_object`
      }
      if (!is.null(this_object$`creation_source`)) {
        `creation_source_object` <- CreationSource$new()
        `creation_source_object`$fromJSON(jsonlite::toJSON(this_object$`creation_source`, auto_unbox = TRUE, digits = NA))
        self$`creation_source` <- `creation_source_object`
      }
      if (!is.null(this_object$`custom_column_ids`)) {
        self$`custom_column_ids` <- ApiClient$new()$deserializeObj(this_object$`custom_column_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`display_metadata`)) {
        self$`display_metadata` <- this_object$`display_metadata`
      }
      if (!is.null(this_object$`engagement_window_days`)) {
        self$`engagement_window_days` <- this_object$`engagement_window_days`
      }
      if (!is.null(this_object$`filters_json`)) {
        self$`filters_json` <- this_object$`filters_json`
      }
      if (!is.null(this_object$`granularity`)) {
        `granularity_object` <- Granularity$new()
        `granularity_object`$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
        self$`granularity` <- `granularity_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ingestion_sources`)) {
        self$`ingestion_sources` <- ApiClient$new()$deserializeObj(this_object$`ingestion_sources`, "array[IngestionSource]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`is_default`)) {
        self$`is_default` <- this_object$`is_default`
      }
      if (!is.null(this_object$`is_deleted`)) {
        self$`is_deleted` <- this_object$`is_deleted`
      }
      if (!is.null(this_object$`is_owned_by_user`)) {
        self$`is_owned_by_user` <- this_object$`is_owned_by_user`
      }
      if (!is.null(this_object$`is_scheduled`)) {
        self$`is_scheduled` <- this_object$`is_scheduled`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`report_end_relative_days_in_past`)) {
        self$`report_end_relative_days_in_past` <- this_object$`report_end_relative_days_in_past`
      }
      if (!is.null(this_object$`report_format`)) {
        `report_format_object` <- DataOutputFormat$new()
        `report_format_object`$fromJSON(jsonlite::toJSON(this_object$`report_format`, auto_unbox = TRUE, digits = NA))
        self$`report_format` <- `report_format_object`
      }
      if (!is.null(this_object$`report_level`)) {
        `report_level_object` <- MetricsReportingLevel$new()
        `report_level_object`$fromJSON(jsonlite::toJSON(this_object$`report_level`, auto_unbox = TRUE, digits = NA))
        self$`report_level` <- `report_level_object`
      }
      if (!is.null(this_object$`report_start_relative_days_in_past`)) {
        self$`report_start_relative_days_in_past` <- this_object$`report_start_relative_days_in_past`
      }
      if (!is.null(this_object$`reporting_time_zone`)) {
        `reporting_time_zone_object` <- ReportingTimeZone$new()
        `reporting_time_zone_object`$fromJSON(jsonlite::toJSON(this_object$`reporting_time_zone`, auto_unbox = TRUE, digits = NA))
        self$`reporting_time_zone` <- `reporting_time_zone_object`
      }
      if (!is.null(this_object$`sort_by`)) {
        `sort_by_object` <- AnyType$new()
        `sort_by_object`$fromJSON(jsonlite::toJSON(this_object$`sort_by`, auto_unbox = TRUE, digits = NA))
        self$`sort_by` <- `sort_by_object`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`user_id`)) {
        self$`user_id` <- this_object$`user_id`
      }
      if (!is.null(this_object$`view_window_days`)) {
        self$`view_window_days` <- this_object$`view_window_days`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AccountTemplate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AccountTemplate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AccountTemplate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`ad_account_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_account_ids`, "array[character]", loadNamespace("openapi"))
      self$`ade_columns` <- ApiClient$new()$deserializeObj(this_object$`ade_columns`, "array[character]", loadNamespace("openapi"))
      self$`attribution_type` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`attribution_type`, auto_unbox = TRUE, digits = NA))
      self$`click_window_days` <- this_object$`click_window_days`
      self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[ReportingColumn]", loadNamespace("openapi"))
      self$`conversion_report_time_type` <- ConversionReportTimeType$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_report_time_type`, auto_unbox = TRUE, digits = NA))
      self$`creation_source` <- CreationSource$new()$fromJSON(jsonlite::toJSON(this_object$`creation_source`, auto_unbox = TRUE, digits = NA))
      self$`custom_column_ids` <- ApiClient$new()$deserializeObj(this_object$`custom_column_ids`, "array[character]", loadNamespace("openapi"))
      self$`display_metadata` <- this_object$`display_metadata`
      self$`engagement_window_days` <- this_object$`engagement_window_days`
      self$`filters_json` <- this_object$`filters_json`
      self$`granularity` <- Granularity$new()$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`ingestion_sources` <- ApiClient$new()$deserializeObj(this_object$`ingestion_sources`, "array[IngestionSource]", loadNamespace("openapi"))
      self$`is_default` <- this_object$`is_default`
      self$`is_deleted` <- this_object$`is_deleted`
      self$`is_owned_by_user` <- this_object$`is_owned_by_user`
      self$`is_scheduled` <- this_object$`is_scheduled`
      self$`name` <- this_object$`name`
      self$`report_end_relative_days_in_past` <- this_object$`report_end_relative_days_in_past`
      self$`report_format` <- DataOutputFormat$new()$fromJSON(jsonlite::toJSON(this_object$`report_format`, auto_unbox = TRUE, digits = NA))
      self$`report_level` <- MetricsReportingLevel$new()$fromJSON(jsonlite::toJSON(this_object$`report_level`, auto_unbox = TRUE, digits = NA))
      self$`report_start_relative_days_in_past` <- this_object$`report_start_relative_days_in_past`
      self$`reporting_time_zone` <- ReportingTimeZone$new()$fromJSON(jsonlite::toJSON(this_object$`reporting_time_zone`, auto_unbox = TRUE, digits = NA))
      self$`sort_by` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`sort_by`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self$`updated_time` <- this_object$`updated_time`
      self$`user_id` <- this_object$`user_id`
      self$`view_window_days` <- this_object$`view_window_days`
      self
    },

    #' @description
    #' Validate JSON input with respect to AccountTemplate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AccountTemplate: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AccountTemplate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
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
# AccountTemplate$unlock()
#
## Below is an example to define the print function
# AccountTemplate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AccountTemplate$lock()

