#' Create a new AdsAnalyticsCreateAsyncRequest
#'
#' @description
#' AdsAnalyticsCreateAsyncRequest Class
#'
#' @docType class
#' @title AdsAnalyticsCreateAsyncRequest
#' @description AdsAnalyticsCreateAsyncRequest Class
#' @format An \code{R6Class} generator object
#' @field start_date Metric report start date (UTC). Format: YYYY-MM-DD character
#' @field end_date Metric report end date (UTC). Format: YYYY-MM-DD character
#' @field granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly \link{Granularity}
#' @field click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. \link{ConversionAttributionWindowDays} [optional]
#' @field engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. \link{ConversionAttributionWindowDays} [optional]
#' @field view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. \link{ConversionAttributionWindowDays} [optional]
#' @field conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. \link{ConversionReportTimeType} [optional]
#' @field attribution_types List of types of attribution for the conversion report list(\link{ConversionReportAttributionType}) [optional]
#' @field campaign_ids List of campaign ids list(character) [optional]
#' @field campaign_statuses List of status values for filtering list(\link{CampaignSummaryStatus}) [optional]
#' @field campaign_objective_types List of values for filtering. [\"WEB_SESSIONS\"] in BETA. list(\link{ObjectiveType}) [optional]
#' @field ad_group_ids List of ad group ids list(character) [optional]
#' @field ad_group_statuses List of values for filtering list(\link{AdGroupSummaryStatus}) [optional]
#' @field ad_ids List of ad ids [This parameter is no supported for Product Item Level Reports] list(character) [optional]
#' @field ad_statuses List of values for filtering [This parameter is not supported for Product Item Level Reports] list(\link{PinPromotionSummaryStatus}) [optional]
#' @field product_group_ids List of product group ids list(character) [optional]
#' @field product_group_statuses List of values for filtering list(\link{ProductGroupSummaryStatus}) [optional]
#' @field product_item_ids List of product item ids list(character) [optional]
#' @field targeting_types List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. list(\link{AdsAnalyticsTargetingType}) [optional]
#' @field metrics_filters List of metrics filters list(\link{AdsAnalyticsMetricsFilter}) [optional]
#' @field columns Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. list(\link{ReportingColumnAsync})
#' @field level Level of the report \link{MetricsReportingLevel}
#' @field report_format Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. \link{DataOutputFormat} [optional]
#' @field primary_sort Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. character [optional]
#' @field start_hour Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. integer [optional]
#' @field end_hour Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsCreateAsyncRequest <- R6::R6Class(
  "AdsAnalyticsCreateAsyncRequest",
  public = list(
    `start_date` = NULL,
    `end_date` = NULL,
    `granularity` = NULL,
    `click_window_days` = NULL,
    `engagement_window_days` = NULL,
    `view_window_days` = NULL,
    `conversion_report_time` = NULL,
    `attribution_types` = NULL,
    `campaign_ids` = NULL,
    `campaign_statuses` = NULL,
    `campaign_objective_types` = NULL,
    `ad_group_ids` = NULL,
    `ad_group_statuses` = NULL,
    `ad_ids` = NULL,
    `ad_statuses` = NULL,
    `product_group_ids` = NULL,
    `product_group_statuses` = NULL,
    `product_item_ids` = NULL,
    `targeting_types` = NULL,
    `metrics_filters` = NULL,
    `columns` = NULL,
    `level` = NULL,
    `report_format` = NULL,
    `primary_sort` = NULL,
    `start_hour` = NULL,
    `end_hour` = NULL,

    #' @description
    #' Initialize a new AdsAnalyticsCreateAsyncRequest class.
    #'
    #' @param start_date Metric report start date (UTC). Format: YYYY-MM-DD
    #' @param end_date Metric report end date (UTC). Format: YYYY-MM-DD
    #' @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
    #' @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
    #' @param level Level of the report
    #' @param click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.. Default to ConversionAttributionWindowDays_30_.
    #' @param engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.. Default to ConversionAttributionWindowDays_30_.
    #' @param view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.. Default to ConversionAttributionWindowDays_1_.
    #' @param conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.. Default to "TIME_OF_AD_ACTION".
    #' @param attribution_types List of types of attribution for the conversion report
    #' @param campaign_ids List of campaign ids
    #' @param campaign_statuses List of status values for filtering
    #' @param campaign_objective_types List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
    #' @param ad_group_ids List of ad group ids
    #' @param ad_group_statuses List of values for filtering
    #' @param ad_ids List of ad ids [This parameter is no supported for Product Item Level Reports]
    #' @param ad_statuses List of values for filtering [This parameter is not supported for Product Item Level Reports]
    #' @param product_group_ids List of product group ids
    #' @param product_group_statuses List of values for filtering
    #' @param product_item_ids List of product item ids
    #' @param targeting_types List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    #' @param metrics_filters List of metrics filters
    #' @param report_format Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.. Default to "JSON".
    #' @param primary_sort Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
    #' @param start_hour Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
    #' @param end_hour Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
    #' @param ... Other optional arguments.
    initialize = function(`start_date`, `end_date`, `granularity`, `columns`, `level`, `click_window_days` = ConversionAttributionWindowDays_30_, `engagement_window_days` = ConversionAttributionWindowDays_30_, `view_window_days` = ConversionAttributionWindowDays_1_, `conversion_report_time` = "TIME_OF_AD_ACTION", `attribution_types` = NULL, `campaign_ids` = NULL, `campaign_statuses` = NULL, `campaign_objective_types` = NULL, `ad_group_ids` = NULL, `ad_group_statuses` = NULL, `ad_ids` = NULL, `ad_statuses` = NULL, `product_group_ids` = NULL, `product_group_statuses` = NULL, `product_item_ids` = NULL, `targeting_types` = NULL, `metrics_filters` = NULL, `report_format` = "JSON", `primary_sort` = NULL, `start_hour` = NULL, `end_hour` = NULL, ...) {
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
        if (!(`granularity` %in% c())) {
          stop(paste("Error! \"", `granularity`, "\" cannot be assigned to `granularity`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`granularity`))
        self$`granularity` <- `granularity`
      }
      if (!missing(`columns`)) {
        stopifnot(is.vector(`columns`), length(`columns`) != 0)
        sapply(`columns`, function(x) stopifnot(R6::is.R6(x)))
        self$`columns` <- `columns`
      }
      if (!missing(`level`)) {
        if (!(`level` %in% c())) {
          stop(paste("Error! \"", `level`, "\" cannot be assigned to `level`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`level`))
        self$`level` <- `level`
      }
      if (!is.null(`click_window_days`)) {
        if (!(`click_window_days` %in% c())) {
          stop(paste("Error! \"", `click_window_days`, "\" cannot be assigned to `click_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`click_window_days`))
        self$`click_window_days` <- `click_window_days`
      }
      if (!is.null(`engagement_window_days`)) {
        if (!(`engagement_window_days` %in% c())) {
          stop(paste("Error! \"", `engagement_window_days`, "\" cannot be assigned to `engagement_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`engagement_window_days`))
        self$`engagement_window_days` <- `engagement_window_days`
      }
      if (!is.null(`view_window_days`)) {
        if (!(`view_window_days` %in% c())) {
          stop(paste("Error! \"", `view_window_days`, "\" cannot be assigned to `view_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`view_window_days`))
        self$`view_window_days` <- `view_window_days`
      }
      if (!is.null(`conversion_report_time`)) {
        if (!(`conversion_report_time` %in% c())) {
          stop(paste("Error! \"", `conversion_report_time`, "\" cannot be assigned to `conversion_report_time`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_report_time`))
        self$`conversion_report_time` <- `conversion_report_time`
      }
      if (!is.null(`attribution_types`)) {
        stopifnot(is.vector(`attribution_types`), length(`attribution_types`) != 0)
        sapply(`attribution_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`attribution_types` <- `attribution_types`
      }
      if (!is.null(`campaign_ids`)) {
        stopifnot(is.vector(`campaign_ids`), length(`campaign_ids`) != 0)
        sapply(`campaign_ids`, function(x) stopifnot(is.character(x)))
        self$`campaign_ids` <- `campaign_ids`
      }
      if (!is.null(`campaign_statuses`)) {
        stopifnot(is.vector(`campaign_statuses`), length(`campaign_statuses`) != 0)
        sapply(`campaign_statuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaign_statuses` <- `campaign_statuses`
      }
      if (!is.null(`campaign_objective_types`)) {
        stopifnot(is.vector(`campaign_objective_types`), length(`campaign_objective_types`) != 0)
        sapply(`campaign_objective_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaign_objective_types` <- `campaign_objective_types`
      }
      if (!is.null(`ad_group_ids`)) {
        stopifnot(is.vector(`ad_group_ids`), length(`ad_group_ids`) != 0)
        sapply(`ad_group_ids`, function(x) stopifnot(is.character(x)))
        self$`ad_group_ids` <- `ad_group_ids`
      }
      if (!is.null(`ad_group_statuses`)) {
        stopifnot(is.vector(`ad_group_statuses`), length(`ad_group_statuses`) != 0)
        sapply(`ad_group_statuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`ad_group_statuses` <- `ad_group_statuses`
      }
      if (!is.null(`ad_ids`)) {
        stopifnot(is.vector(`ad_ids`), length(`ad_ids`) != 0)
        sapply(`ad_ids`, function(x) stopifnot(is.character(x)))
        self$`ad_ids` <- `ad_ids`
      }
      if (!is.null(`ad_statuses`)) {
        stopifnot(is.vector(`ad_statuses`), length(`ad_statuses`) != 0)
        sapply(`ad_statuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`ad_statuses` <- `ad_statuses`
      }
      if (!is.null(`product_group_ids`)) {
        stopifnot(is.vector(`product_group_ids`), length(`product_group_ids`) != 0)
        sapply(`product_group_ids`, function(x) stopifnot(is.character(x)))
        self$`product_group_ids` <- `product_group_ids`
      }
      if (!is.null(`product_group_statuses`)) {
        stopifnot(is.vector(`product_group_statuses`), length(`product_group_statuses`) != 0)
        sapply(`product_group_statuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`product_group_statuses` <- `product_group_statuses`
      }
      if (!is.null(`product_item_ids`)) {
        stopifnot(is.vector(`product_item_ids`), length(`product_item_ids`) != 0)
        sapply(`product_item_ids`, function(x) stopifnot(is.character(x)))
        self$`product_item_ids` <- `product_item_ids`
      }
      if (!is.null(`targeting_types`)) {
        stopifnot(is.vector(`targeting_types`), length(`targeting_types`) != 0)
        sapply(`targeting_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`targeting_types` <- `targeting_types`
      }
      if (!is.null(`metrics_filters`)) {
        stopifnot(is.vector(`metrics_filters`), length(`metrics_filters`) != 0)
        sapply(`metrics_filters`, function(x) stopifnot(R6::is.R6(x)))
        self$`metrics_filters` <- `metrics_filters`
      }
      if (!is.null(`report_format`)) {
        if (!(`report_format` %in% c())) {
          stop(paste("Error! \"", `report_format`, "\" cannot be assigned to `report_format`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_format`))
        self$`report_format` <- `report_format`
      }
      if (!is.null(`primary_sort`)) {
        if (!(`primary_sort` %in% c("BY_ID", "BY_DATE"))) {
          stop(paste("Error! \"", `primary_sort`, "\" cannot be assigned to `primary_sort`. Must be \"BY_ID\", \"BY_DATE\".", sep = ""))
        }
        if (!(is.character(`primary_sort`) && length(`primary_sort`) == 1)) {
          stop(paste("Error! Invalid data for `primary_sort`. Must be a string:", `primary_sort`))
        }
        self$`primary_sort` <- `primary_sort`
      }
      if (!is.null(`start_hour`)) {
        if (!(is.numeric(`start_hour`) && length(`start_hour`) == 1)) {
          stop(paste("Error! Invalid data for `start_hour`. Must be an integer:", `start_hour`))
        }
        self$`start_hour` <- `start_hour`
      }
      if (!is.null(`end_hour`)) {
        if (!(is.numeric(`end_hour`) && length(`end_hour`) == 1)) {
          stop(paste("Error! Invalid data for `end_hour`. Must be an integer:", `end_hour`))
        }
        self$`end_hour` <- `end_hour`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsCreateAsyncRequest in JSON format
    toJSON = function() {
      AdsAnalyticsCreateAsyncRequestObject <- list()
      if (!is.null(self$`start_date`)) {
        AdsAnalyticsCreateAsyncRequestObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`end_date`)) {
        AdsAnalyticsCreateAsyncRequestObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`granularity`)) {
        AdsAnalyticsCreateAsyncRequestObject[["granularity"]] <-
          self$`granularity`$toJSON()
      }
      if (!is.null(self$`click_window_days`)) {
        AdsAnalyticsCreateAsyncRequestObject[["click_window_days"]] <-
          self$`click_window_days`$toJSON()
      }
      if (!is.null(self$`engagement_window_days`)) {
        AdsAnalyticsCreateAsyncRequestObject[["engagement_window_days"]] <-
          self$`engagement_window_days`$toJSON()
      }
      if (!is.null(self$`view_window_days`)) {
        AdsAnalyticsCreateAsyncRequestObject[["view_window_days"]] <-
          self$`view_window_days`$toJSON()
      }
      if (!is.null(self$`conversion_report_time`)) {
        AdsAnalyticsCreateAsyncRequestObject[["conversion_report_time"]] <-
          self$`conversion_report_time`$toJSON()
      }
      if (!is.null(self$`attribution_types`)) {
        AdsAnalyticsCreateAsyncRequestObject[["attribution_types"]] <-
          lapply(self$`attribution_types`, function(x) x$toJSON())
      }
      if (!is.null(self$`campaign_ids`)) {
        AdsAnalyticsCreateAsyncRequestObject[["campaign_ids"]] <-
          self$`campaign_ids`
      }
      if (!is.null(self$`campaign_statuses`)) {
        AdsAnalyticsCreateAsyncRequestObject[["campaign_statuses"]] <-
          lapply(self$`campaign_statuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`campaign_objective_types`)) {
        AdsAnalyticsCreateAsyncRequestObject[["campaign_objective_types"]] <-
          lapply(self$`campaign_objective_types`, function(x) x$toJSON())
      }
      if (!is.null(self$`ad_group_ids`)) {
        AdsAnalyticsCreateAsyncRequestObject[["ad_group_ids"]] <-
          self$`ad_group_ids`
      }
      if (!is.null(self$`ad_group_statuses`)) {
        AdsAnalyticsCreateAsyncRequestObject[["ad_group_statuses"]] <-
          lapply(self$`ad_group_statuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`ad_ids`)) {
        AdsAnalyticsCreateAsyncRequestObject[["ad_ids"]] <-
          self$`ad_ids`
      }
      if (!is.null(self$`ad_statuses`)) {
        AdsAnalyticsCreateAsyncRequestObject[["ad_statuses"]] <-
          lapply(self$`ad_statuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`product_group_ids`)) {
        AdsAnalyticsCreateAsyncRequestObject[["product_group_ids"]] <-
          self$`product_group_ids`
      }
      if (!is.null(self$`product_group_statuses`)) {
        AdsAnalyticsCreateAsyncRequestObject[["product_group_statuses"]] <-
          lapply(self$`product_group_statuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`product_item_ids`)) {
        AdsAnalyticsCreateAsyncRequestObject[["product_item_ids"]] <-
          self$`product_item_ids`
      }
      if (!is.null(self$`targeting_types`)) {
        AdsAnalyticsCreateAsyncRequestObject[["targeting_types"]] <-
          lapply(self$`targeting_types`, function(x) x$toJSON())
      }
      if (!is.null(self$`metrics_filters`)) {
        AdsAnalyticsCreateAsyncRequestObject[["metrics_filters"]] <-
          lapply(self$`metrics_filters`, function(x) x$toJSON())
      }
      if (!is.null(self$`columns`)) {
        AdsAnalyticsCreateAsyncRequestObject[["columns"]] <-
          lapply(self$`columns`, function(x) x$toJSON())
      }
      if (!is.null(self$`level`)) {
        AdsAnalyticsCreateAsyncRequestObject[["level"]] <-
          self$`level`$toJSON()
      }
      if (!is.null(self$`report_format`)) {
        AdsAnalyticsCreateAsyncRequestObject[["report_format"]] <-
          self$`report_format`$toJSON()
      }
      if (!is.null(self$`primary_sort`)) {
        AdsAnalyticsCreateAsyncRequestObject[["primary_sort"]] <-
          self$`primary_sort`
      }
      if (!is.null(self$`start_hour`)) {
        AdsAnalyticsCreateAsyncRequestObject[["start_hour"]] <-
          self$`start_hour`
      }
      if (!is.null(self$`end_hour`)) {
        AdsAnalyticsCreateAsyncRequestObject[["end_hour"]] <-
          self$`end_hour`
      }
      AdsAnalyticsCreateAsyncRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsCreateAsyncRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsCreateAsyncRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`granularity`)) {
        `granularity_object` <- Granularity$new()
        `granularity_object`$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
        self$`granularity` <- `granularity_object`
      }
      if (!is.null(this_object$`click_window_days`)) {
        `click_window_days_object` <- ConversionAttributionWindowDays$new()
        `click_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`click_window_days`, auto_unbox = TRUE, digits = NA))
        self$`click_window_days` <- `click_window_days_object`
      }
      if (!is.null(this_object$`engagement_window_days`)) {
        `engagement_window_days_object` <- ConversionAttributionWindowDays$new()
        `engagement_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`engagement_window_days`, auto_unbox = TRUE, digits = NA))
        self$`engagement_window_days` <- `engagement_window_days_object`
      }
      if (!is.null(this_object$`view_window_days`)) {
        `view_window_days_object` <- ConversionAttributionWindowDays$new()
        `view_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`view_window_days`, auto_unbox = TRUE, digits = NA))
        self$`view_window_days` <- `view_window_days_object`
      }
      if (!is.null(this_object$`conversion_report_time`)) {
        `conversion_report_time_object` <- ConversionReportTimeType$new()
        `conversion_report_time_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_report_time`, auto_unbox = TRUE, digits = NA))
        self$`conversion_report_time` <- `conversion_report_time_object`
      }
      if (!is.null(this_object$`attribution_types`)) {
        self$`attribution_types` <- ApiClient$new()$deserializeObj(this_object$`attribution_types`, "array[ConversionReportAttributionType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`campaign_ids`)) {
        self$`campaign_ids` <- ApiClient$new()$deserializeObj(this_object$`campaign_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`campaign_statuses`)) {
        self$`campaign_statuses` <- ApiClient$new()$deserializeObj(this_object$`campaign_statuses`, "array[CampaignSummaryStatus]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`campaign_objective_types`)) {
        self$`campaign_objective_types` <- ApiClient$new()$deserializeObj(this_object$`campaign_objective_types`, "array[ObjectiveType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_group_ids`)) {
        self$`ad_group_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_group_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_group_statuses`)) {
        self$`ad_group_statuses` <- ApiClient$new()$deserializeObj(this_object$`ad_group_statuses`, "array[AdGroupSummaryStatus]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_ids`)) {
        self$`ad_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_statuses`)) {
        self$`ad_statuses` <- ApiClient$new()$deserializeObj(this_object$`ad_statuses`, "array[PinPromotionSummaryStatus]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_group_ids`)) {
        self$`product_group_ids` <- ApiClient$new()$deserializeObj(this_object$`product_group_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_group_statuses`)) {
        self$`product_group_statuses` <- ApiClient$new()$deserializeObj(this_object$`product_group_statuses`, "array[ProductGroupSummaryStatus]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_item_ids`)) {
        self$`product_item_ids` <- ApiClient$new()$deserializeObj(this_object$`product_item_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`targeting_types`)) {
        self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[AdsAnalyticsTargetingType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`metrics_filters`)) {
        self$`metrics_filters` <- ApiClient$new()$deserializeObj(this_object$`metrics_filters`, "array[AdsAnalyticsMetricsFilter]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`columns`)) {
        self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[ReportingColumnAsync]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`level`)) {
        `level_object` <- MetricsReportingLevel$new()
        `level_object`$fromJSON(jsonlite::toJSON(this_object$`level`, auto_unbox = TRUE, digits = NA))
        self$`level` <- `level_object`
      }
      if (!is.null(this_object$`report_format`)) {
        `report_format_object` <- DataOutputFormat$new()
        `report_format_object`$fromJSON(jsonlite::toJSON(this_object$`report_format`, auto_unbox = TRUE, digits = NA))
        self$`report_format` <- `report_format_object`
      }
      if (!is.null(this_object$`primary_sort`)) {
        if (!is.null(this_object$`primary_sort`) && !(this_object$`primary_sort` %in% c("BY_ID", "BY_DATE"))) {
          stop(paste("Error! \"", this_object$`primary_sort`, "\" cannot be assigned to `primary_sort`. Must be \"BY_ID\", \"BY_DATE\".", sep = ""))
        }
        self$`primary_sort` <- this_object$`primary_sort`
      }
      if (!is.null(this_object$`start_hour`)) {
        self$`start_hour` <- this_object$`start_hour`
      }
      if (!is.null(this_object$`end_hour`)) {
        self$`end_hour` <- this_object$`end_hour`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsCreateAsyncRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
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
          %s
          ',
          jsonlite::toJSON(self$`granularity`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`click_window_days`)) {
          sprintf(
          '"click_window_days":
          %s
          ',
          jsonlite::toJSON(self$`click_window_days`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`engagement_window_days`)) {
          sprintf(
          '"engagement_window_days":
          %s
          ',
          jsonlite::toJSON(self$`engagement_window_days`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`view_window_days`)) {
          sprintf(
          '"view_window_days":
          %s
          ',
          jsonlite::toJSON(self$`view_window_days`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`conversion_report_time`)) {
          sprintf(
          '"conversion_report_time":
          %s
          ',
          jsonlite::toJSON(self$`conversion_report_time`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`attribution_types`)) {
          sprintf(
          '"attribution_types":
          [%s]
',
          paste(sapply(self$`attribution_types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`campaign_ids`)) {
          sprintf(
          '"campaign_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`campaign_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`campaign_statuses`)) {
          sprintf(
          '"campaign_statuses":
          [%s]
',
          paste(sapply(self$`campaign_statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`campaign_objective_types`)) {
          sprintf(
          '"campaign_objective_types":
          [%s]
',
          paste(sapply(self$`campaign_objective_types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`ad_group_ids`)) {
          sprintf(
          '"ad_group_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`ad_group_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`ad_group_statuses`)) {
          sprintf(
          '"ad_group_statuses":
          [%s]
',
          paste(sapply(self$`ad_group_statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`ad_ids`)) {
          sprintf(
          '"ad_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`ad_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`ad_statuses`)) {
          sprintf(
          '"ad_statuses":
          [%s]
',
          paste(sapply(self$`ad_statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`product_group_ids`)) {
          sprintf(
          '"product_group_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`product_group_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`product_group_statuses`)) {
          sprintf(
          '"product_group_statuses":
          [%s]
',
          paste(sapply(self$`product_group_statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`product_item_ids`)) {
          sprintf(
          '"product_item_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`product_item_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
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
        if (!is.null(self$`metrics_filters`)) {
          sprintf(
          '"metrics_filters":
          [%s]
',
          paste(sapply(self$`metrics_filters`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
        if (!is.null(self$`level`)) {
          sprintf(
          '"level":
          %s
          ',
          jsonlite::toJSON(self$`level`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`primary_sort`)) {
          sprintf(
          '"primary_sort":
            "%s"
                    ',
          self$`primary_sort`
          )
        },
        if (!is.null(self$`start_hour`)) {
          sprintf(
          '"start_hour":
            %d
                    ',
          self$`start_hour`
          )
        },
        if (!is.null(self$`end_hour`)) {
          sprintf(
          '"end_hour":
            %d
                    ',
          self$`end_hour`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsCreateAsyncRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsCreateAsyncRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`start_date` <- this_object$`start_date`
      self$`end_date` <- this_object$`end_date`
      self$`granularity` <- Granularity$new()$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
      self$`click_window_days` <- ConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`click_window_days`, auto_unbox = TRUE, digits = NA))
      self$`engagement_window_days` <- ConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`engagement_window_days`, auto_unbox = TRUE, digits = NA))
      self$`view_window_days` <- ConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`view_window_days`, auto_unbox = TRUE, digits = NA))
      self$`conversion_report_time` <- ConversionReportTimeType$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_report_time`, auto_unbox = TRUE, digits = NA))
      self$`attribution_types` <- ApiClient$new()$deserializeObj(this_object$`attribution_types`, "array[ConversionReportAttributionType]", loadNamespace("openapi"))
      self$`campaign_ids` <- ApiClient$new()$deserializeObj(this_object$`campaign_ids`, "array[character]", loadNamespace("openapi"))
      self$`campaign_statuses` <- ApiClient$new()$deserializeObj(this_object$`campaign_statuses`, "array[CampaignSummaryStatus]", loadNamespace("openapi"))
      self$`campaign_objective_types` <- ApiClient$new()$deserializeObj(this_object$`campaign_objective_types`, "array[ObjectiveType]", loadNamespace("openapi"))
      self$`ad_group_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_group_ids`, "array[character]", loadNamespace("openapi"))
      self$`ad_group_statuses` <- ApiClient$new()$deserializeObj(this_object$`ad_group_statuses`, "array[AdGroupSummaryStatus]", loadNamespace("openapi"))
      self$`ad_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_ids`, "array[character]", loadNamespace("openapi"))
      self$`ad_statuses` <- ApiClient$new()$deserializeObj(this_object$`ad_statuses`, "array[PinPromotionSummaryStatus]", loadNamespace("openapi"))
      self$`product_group_ids` <- ApiClient$new()$deserializeObj(this_object$`product_group_ids`, "array[character]", loadNamespace("openapi"))
      self$`product_group_statuses` <- ApiClient$new()$deserializeObj(this_object$`product_group_statuses`, "array[ProductGroupSummaryStatus]", loadNamespace("openapi"))
      self$`product_item_ids` <- ApiClient$new()$deserializeObj(this_object$`product_item_ids`, "array[character]", loadNamespace("openapi"))
      self$`targeting_types` <- ApiClient$new()$deserializeObj(this_object$`targeting_types`, "array[AdsAnalyticsTargetingType]", loadNamespace("openapi"))
      self$`metrics_filters` <- ApiClient$new()$deserializeObj(this_object$`metrics_filters`, "array[AdsAnalyticsMetricsFilter]", loadNamespace("openapi"))
      self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[ReportingColumnAsync]", loadNamespace("openapi"))
      self$`level` <- MetricsReportingLevel$new()$fromJSON(jsonlite::toJSON(this_object$`level`, auto_unbox = TRUE, digits = NA))
      self$`report_format` <- DataOutputFormat$new()$fromJSON(jsonlite::toJSON(this_object$`report_format`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`primary_sort`) && !(this_object$`primary_sort` %in% c("BY_ID", "BY_DATE"))) {
        stop(paste("Error! \"", this_object$`primary_sort`, "\" cannot be assigned to `primary_sort`. Must be \"BY_ID\", \"BY_DATE\".", sep = ""))
      }
      self$`primary_sort` <- this_object$`primary_sort`
      self$`start_hour` <- this_object$`start_hour`
      self$`end_hour` <- this_object$`end_hour`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsAnalyticsCreateAsyncRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsCreateAsyncRequest: the required field `start_date` is missing."))
      }
      # check the required field `end_date`
      if (!is.null(input_json$`end_date`)) {
        if (!(is.character(input_json$`end_date`) && length(input_json$`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", input_json$`end_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsCreateAsyncRequest: the required field `end_date` is missing."))
      }
      # check the required field `granularity`
      if (!is.null(input_json$`granularity`)) {
        stopifnot(R6::is.R6(input_json$`granularity`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsCreateAsyncRequest: the required field `granularity` is missing."))
      }
      # check the required field `columns`
      if (!is.null(input_json$`columns`)) {
        stopifnot(is.vector(input_json$`columns`), length(input_json$`columns`) != 0)
        tmp <- sapply(input_json$`columns`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsCreateAsyncRequest: the required field `columns` is missing."))
      }
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        stopifnot(R6::is.R6(input_json$`level`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsCreateAsyncRequest: the required field `level` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsAnalyticsCreateAsyncRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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

      if (length(self$`campaign_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`campaign_ids`) < 1) {
        return(FALSE)
      }

      if (length(self$`campaign_statuses`) > 6) {
        return(FALSE)
      }
      if (length(self$`campaign_statuses`) < 1) {
        return(FALSE)
      }

      if (length(self$`campaign_objective_types`) > 7) {
        return(FALSE)
      }
      if (length(self$`campaign_objective_types`) < 1) {
        return(FALSE)
      }

      if (length(self$`ad_group_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`ad_group_ids`) < 1) {
        return(FALSE)
      }

      if (length(self$`ad_group_statuses`) > 6) {
        return(FALSE)
      }
      if (length(self$`ad_group_statuses`) < 1) {
        return(FALSE)
      }

      if (length(self$`ad_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`ad_ids`) < 1) {
        return(FALSE)
      }

      if (length(self$`ad_statuses`) > 6) {
        return(FALSE)
      }
      if (length(self$`ad_statuses`) < 1) {
        return(FALSE)
      }

      if (length(self$`product_group_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`product_group_ids`) < 1) {
        return(FALSE)
      }

      if (length(self$`product_group_statuses`) > 6) {
        return(FALSE)
      }
      if (length(self$`product_group_statuses`) < 1) {
        return(FALSE)
      }

      if (length(self$`product_item_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`product_item_ids`) < 1) {
        return(FALSE)
      }

      if (length(self$`targeting_types`) > 5) {
        return(FALSE)
      }
      if (length(self$`targeting_types`) < 1) {
        return(FALSE)
      }

      if (length(self$`metrics_filters`) < 1) {
        return(FALSE)
      }

      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
        return(FALSE)
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        return(FALSE)
      }

      if (self$`start_hour` > 23) {
        return(FALSE)
      }
      if (self$`start_hour` < 0) {
        return(FALSE)
      }

      if (self$`end_hour` > 23) {
        return(FALSE)
      }
      if (self$`end_hour` < 0) {
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

      if (length(self$`campaign_ids`) > 500) {
        invalid_fields["campaign_ids"] <- "Invalid length for `campaign_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`campaign_ids`) < 1) {
        invalid_fields["campaign_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`campaign_statuses`) > 6) {
        invalid_fields["campaign_statuses"] <- "Invalid length for `campaign_statuses`, number of items must be less than or equal to 6."
      }
      if (length(self$`campaign_statuses`) < 1) {
        invalid_fields["campaign_statuses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`campaign_objective_types`) > 7) {
        invalid_fields["campaign_objective_types"] <- "Invalid length for `campaign_objective_types`, number of items must be less than or equal to 7."
      }
      if (length(self$`campaign_objective_types`) < 1) {
        invalid_fields["campaign_objective_types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`ad_group_ids`) > 500) {
        invalid_fields["ad_group_ids"] <- "Invalid length for `ad_group_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`ad_group_ids`) < 1) {
        invalid_fields["ad_group_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`ad_group_statuses`) > 6) {
        invalid_fields["ad_group_statuses"] <- "Invalid length for `ad_group_statuses`, number of items must be less than or equal to 6."
      }
      if (length(self$`ad_group_statuses`) < 1) {
        invalid_fields["ad_group_statuses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`ad_ids`) > 500) {
        invalid_fields["ad_ids"] <- "Invalid length for `ad_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`ad_ids`) < 1) {
        invalid_fields["ad_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`ad_statuses`) > 6) {
        invalid_fields["ad_statuses"] <- "Invalid length for `ad_statuses`, number of items must be less than or equal to 6."
      }
      if (length(self$`ad_statuses`) < 1) {
        invalid_fields["ad_statuses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`product_group_ids`) > 500) {
        invalid_fields["product_group_ids"] <- "Invalid length for `product_group_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`product_group_ids`) < 1) {
        invalid_fields["product_group_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`product_group_statuses`) > 6) {
        invalid_fields["product_group_statuses"] <- "Invalid length for `product_group_statuses`, number of items must be less than or equal to 6."
      }
      if (length(self$`product_group_statuses`) < 1) {
        invalid_fields["product_group_statuses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`product_item_ids`) > 500) {
        invalid_fields["product_item_ids"] <- "Invalid length for `product_item_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`product_item_ids`) < 1) {
        invalid_fields["product_item_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`targeting_types`) > 5) {
        invalid_fields["targeting_types"] <- "Invalid length for `targeting_types`, number of items must be less than or equal to 5."
      }
      if (length(self$`targeting_types`) < 1) {
        invalid_fields["targeting_types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`metrics_filters`) < 1) {
        invalid_fields["metrics_filters"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
        invalid_fields["columns"] <- "Non-nullable required field `columns` cannot be null."
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        invalid_fields["level"] <- "Non-nullable required field `level` cannot be null."
      }

      if (self$`start_hour` > 23) {
        invalid_fields["start_hour"] <- "Invalid value for `start_hour`, must be smaller than or equal to 23."
      }
      if (self$`start_hour` < 0) {
        invalid_fields["start_hour"] <- "Invalid value for `start_hour`, must be bigger than or equal to 0."
      }

      if (self$`end_hour` > 23) {
        invalid_fields["end_hour"] <- "Invalid value for `end_hour`, must be smaller than or equal to 23."
      }
      if (self$`end_hour` < 0) {
        invalid_fields["end_hour"] <- "Invalid value for `end_hour`, must be bigger than or equal to 0."
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
# AdsAnalyticsCreateAsyncRequest$unlock()
#
## Below is an example to define the print function
# AdsAnalyticsCreateAsyncRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsAnalyticsCreateAsyncRequest$lock()

