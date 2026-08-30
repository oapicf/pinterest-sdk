#' Create a new ConversionProductReportCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title ConversionProductReportCreate
#' @description ConversionProductReportCreate Class
#' @format An \code{R6Class} generator object
#' @field ad_group_ids List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. list(character) [optional]
#' @field campaign_ids List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. list(character) [optional]
#' @field campaign_objective_types List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. list(\link{ConversionObjectiveType}) [optional]
#' @field click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. \link{ConversionAttributionWindowDays} [optional]
#' @field columns Metric and entity columns list(\link{ConversionProductReportingColumn})
#' @field conversion_product_attribution_type Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. \link{ConversionProductAttributionType} [optional]
#' @field conversion_product_breakdown Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. \link{ConversionProductReportBreakdownType} [optional]
#' @field conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. \link{ConversionReportTimeType} [optional]
#' @field end_date Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. character
#' @field granularity Report granularity for time-based metric aggregation \link{ConversionProductReportGranularity}
#' @field level Level of the report \link{ConversionProductReportLevel}
#' @field product_sku_ids List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. list(character) [optional]
#' @field report_name Name of the conversion product report character
#' @field start_date Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. character
#' @field view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. \link{ConversionAttributionWindowDays} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionProductReportCreate <- R6::R6Class(
  "ConversionProductReportCreate",
  public = list(
    `ad_group_ids` = NULL,
    `campaign_ids` = NULL,
    `campaign_objective_types` = NULL,
    `click_window_days` = NULL,
    `columns` = NULL,
    `conversion_product_attribution_type` = NULL,
    `conversion_product_breakdown` = NULL,
    `conversion_report_time` = NULL,
    `end_date` = NULL,
    `granularity` = NULL,
    `level` = NULL,
    `product_sku_ids` = NULL,
    `report_name` = NULL,
    `start_date` = NULL,
    `view_window_days` = NULL,

    #' @description
    #' Initialize a new ConversionProductReportCreate class.
    #'
    #' @param columns Metric and entity columns
    #' @param end_date Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
    #' @param granularity Report granularity for time-based metric aggregation
    #' @param level Level of the report
    #' @param report_name Name of the conversion product report
    #' @param start_date Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
    #' @param ad_group_ids List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
    #' @param campaign_ids List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
    #' @param campaign_objective_types List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
    #' @param click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    #' @param conversion_product_attribution_type Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
    #' @param conversion_product_breakdown Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
    #' @param conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    #' @param product_sku_ids List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
    #' @param view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    #' @param ... Other optional arguments.
    initialize = function(`columns`, `end_date`, `granularity`, `level`, `report_name`, `start_date`, `ad_group_ids` = NULL, `campaign_ids` = NULL, `campaign_objective_types` = NULL, `click_window_days` = NULL, `conversion_product_attribution_type` = NULL, `conversion_product_breakdown` = NULL, `conversion_report_time` = NULL, `product_sku_ids` = NULL, `view_window_days` = NULL, ...) {
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
      if (!is.null(`ad_group_ids`)) {
        stopifnot(is.vector(`ad_group_ids`), length(`ad_group_ids`) != 0)
        sapply(`ad_group_ids`, function(x) stopifnot(is.character(x)))
        self$`ad_group_ids` <- `ad_group_ids`
      }
      if (!is.null(`campaign_ids`)) {
        stopifnot(is.vector(`campaign_ids`), length(`campaign_ids`) != 0)
        sapply(`campaign_ids`, function(x) stopifnot(is.character(x)))
        self$`campaign_ids` <- `campaign_ids`
      }
      if (!is.null(`campaign_objective_types`)) {
        stopifnot(is.vector(`campaign_objective_types`), length(`campaign_objective_types`) != 0)
        sapply(`campaign_objective_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaign_objective_types` <- `campaign_objective_types`
      }
      if (!is.null(`click_window_days`)) {
        if (!(`click_window_days` %in% c())) {
          stop(paste("Error! \"", `click_window_days`, "\" cannot be assigned to `click_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`click_window_days`))
        self$`click_window_days` <- `click_window_days`
      }
      if (!is.null(`conversion_product_attribution_type`)) {
        if (!(`conversion_product_attribution_type` %in% c())) {
          stop(paste("Error! \"", `conversion_product_attribution_type`, "\" cannot be assigned to `conversion_product_attribution_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_product_attribution_type`))
        self$`conversion_product_attribution_type` <- `conversion_product_attribution_type`
      }
      if (!is.null(`conversion_product_breakdown`)) {
        if (!(`conversion_product_breakdown` %in% c())) {
          stop(paste("Error! \"", `conversion_product_breakdown`, "\" cannot be assigned to `conversion_product_breakdown`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_product_breakdown`))
        self$`conversion_product_breakdown` <- `conversion_product_breakdown`
      }
      if (!is.null(`conversion_report_time`)) {
        if (!(`conversion_report_time` %in% c())) {
          stop(paste("Error! \"", `conversion_report_time`, "\" cannot be assigned to `conversion_report_time`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_report_time`))
        self$`conversion_report_time` <- `conversion_report_time`
      }
      if (!is.null(`product_sku_ids`)) {
        stopifnot(is.vector(`product_sku_ids`), length(`product_sku_ids`) != 0)
        sapply(`product_sku_ids`, function(x) stopifnot(is.character(x)))
        self$`product_sku_ids` <- `product_sku_ids`
      }
      if (!is.null(`view_window_days`)) {
        if (!(`view_window_days` %in% c())) {
          stop(paste("Error! \"", `view_window_days`, "\" cannot be assigned to `view_window_days`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`view_window_days`))
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
    #' @return ConversionProductReportCreate as a base R list.
    #' @examples
    #' # convert array of ConversionProductReportCreate (x) to a data frame
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
    #' Convert ConversionProductReportCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionProductReportCreateObject <- list()
      if (!is.null(self$`ad_group_ids`)) {
        ConversionProductReportCreateObject[["ad_group_ids"]] <-
          self$`ad_group_ids`
      }
      if (!is.null(self$`campaign_ids`)) {
        ConversionProductReportCreateObject[["campaign_ids"]] <-
          self$`campaign_ids`
      }
      if (!is.null(self$`campaign_objective_types`)) {
        ConversionProductReportCreateObject[["campaign_objective_types"]] <-
          self$extractSimpleType(self$`campaign_objective_types`)
      }
      if (!is.null(self$`click_window_days`)) {
        ConversionProductReportCreateObject[["click_window_days"]] <-
          self$extractSimpleType(self$`click_window_days`)
      }
      if (!is.null(self$`columns`)) {
        ConversionProductReportCreateObject[["columns"]] <-
          self$extractSimpleType(self$`columns`)
      }
      if (!is.null(self$`conversion_product_attribution_type`)) {
        ConversionProductReportCreateObject[["conversion_product_attribution_type"]] <-
          self$extractSimpleType(self$`conversion_product_attribution_type`)
      }
      if (!is.null(self$`conversion_product_breakdown`)) {
        ConversionProductReportCreateObject[["conversion_product_breakdown"]] <-
          self$extractSimpleType(self$`conversion_product_breakdown`)
      }
      if (!is.null(self$`conversion_report_time`)) {
        ConversionProductReportCreateObject[["conversion_report_time"]] <-
          self$extractSimpleType(self$`conversion_report_time`)
      }
      if (!is.null(self$`end_date`)) {
        ConversionProductReportCreateObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`granularity`)) {
        ConversionProductReportCreateObject[["granularity"]] <-
          self$extractSimpleType(self$`granularity`)
      }
      if (!is.null(self$`level`)) {
        ConversionProductReportCreateObject[["level"]] <-
          self$extractSimpleType(self$`level`)
      }
      if (!is.null(self$`product_sku_ids`)) {
        ConversionProductReportCreateObject[["product_sku_ids"]] <-
          self$`product_sku_ids`
      }
      if (!is.null(self$`report_name`)) {
        ConversionProductReportCreateObject[["report_name"]] <-
          self$`report_name`
      }
      if (!is.null(self$`start_date`)) {
        ConversionProductReportCreateObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`view_window_days`)) {
        ConversionProductReportCreateObject[["view_window_days"]] <-
          self$extractSimpleType(self$`view_window_days`)
      }
      return(ConversionProductReportCreateObject)
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
    #' Deserialize JSON string into an instance of ConversionProductReportCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionProductReportCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_group_ids`)) {
        self$`ad_group_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_group_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`campaign_ids`)) {
        self$`campaign_ids` <- ApiClient$new()$deserializeObj(this_object$`campaign_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`campaign_objective_types`)) {
        self$`campaign_objective_types` <- ApiClient$new()$deserializeObj(this_object$`campaign_objective_types`, "array[ConversionObjectiveType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`click_window_days`)) {
        `click_window_days_object` <- ConversionAttributionWindowDays$new()
        `click_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`click_window_days`, auto_unbox = TRUE, digits = NA))
        self$`click_window_days` <- `click_window_days_object`
      }
      if (!is.null(this_object$`columns`)) {
        self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[ConversionProductReportingColumn]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`conversion_product_attribution_type`)) {
        `conversion_product_attribution_type_object` <- ConversionProductAttributionType$new()
        `conversion_product_attribution_type_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_product_attribution_type`, auto_unbox = TRUE, digits = NA))
        self$`conversion_product_attribution_type` <- `conversion_product_attribution_type_object`
      }
      if (!is.null(this_object$`conversion_product_breakdown`)) {
        `conversion_product_breakdown_object` <- ConversionProductReportBreakdownType$new()
        `conversion_product_breakdown_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_product_breakdown`, auto_unbox = TRUE, digits = NA))
        self$`conversion_product_breakdown` <- `conversion_product_breakdown_object`
      }
      if (!is.null(this_object$`conversion_report_time`)) {
        `conversion_report_time_object` <- ConversionReportTimeType$new()
        `conversion_report_time_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_report_time`, auto_unbox = TRUE, digits = NA))
        self$`conversion_report_time` <- `conversion_report_time_object`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`granularity`)) {
        `granularity_object` <- ConversionProductReportGranularity$new()
        `granularity_object`$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
        self$`granularity` <- `granularity_object`
      }
      if (!is.null(this_object$`level`)) {
        `level_object` <- ConversionProductReportLevel$new()
        `level_object`$fromJSON(jsonlite::toJSON(this_object$`level`, auto_unbox = TRUE, digits = NA))
        self$`level` <- `level_object`
      }
      if (!is.null(this_object$`product_sku_ids`)) {
        self$`product_sku_ids` <- ApiClient$new()$deserializeObj(this_object$`product_sku_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`report_name`)) {
        self$`report_name` <- this_object$`report_name`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`view_window_days`)) {
        `view_window_days_object` <- ConversionAttributionWindowDays$new()
        `view_window_days_object`$fromJSON(jsonlite::toJSON(this_object$`view_window_days`, auto_unbox = TRUE, digits = NA))
        self$`view_window_days` <- `view_window_days_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionProductReportCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionProductReportCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionProductReportCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_group_ids` <- ApiClient$new()$deserializeObj(this_object$`ad_group_ids`, "array[character]", loadNamespace("openapi"))
      self$`campaign_ids` <- ApiClient$new()$deserializeObj(this_object$`campaign_ids`, "array[character]", loadNamespace("openapi"))
      self$`campaign_objective_types` <- ApiClient$new()$deserializeObj(this_object$`campaign_objective_types`, "array[ConversionObjectiveType]", loadNamespace("openapi"))
      self$`click_window_days` <- ConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`click_window_days`, auto_unbox = TRUE, digits = NA))
      self$`columns` <- ApiClient$new()$deserializeObj(this_object$`columns`, "array[ConversionProductReportingColumn]", loadNamespace("openapi"))
      self$`conversion_product_attribution_type` <- ConversionProductAttributionType$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_product_attribution_type`, auto_unbox = TRUE, digits = NA))
      self$`conversion_product_breakdown` <- ConversionProductReportBreakdownType$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_product_breakdown`, auto_unbox = TRUE, digits = NA))
      self$`conversion_report_time` <- ConversionReportTimeType$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_report_time`, auto_unbox = TRUE, digits = NA))
      self$`end_date` <- this_object$`end_date`
      self$`granularity` <- ConversionProductReportGranularity$new()$fromJSON(jsonlite::toJSON(this_object$`granularity`, auto_unbox = TRUE, digits = NA))
      self$`level` <- ConversionProductReportLevel$new()$fromJSON(jsonlite::toJSON(this_object$`level`, auto_unbox = TRUE, digits = NA))
      self$`product_sku_ids` <- ApiClient$new()$deserializeObj(this_object$`product_sku_ids`, "array[character]", loadNamespace("openapi"))
      self$`report_name` <- this_object$`report_name`
      self$`start_date` <- this_object$`start_date`
      self$`view_window_days` <- ConversionAttributionWindowDays$new()$fromJSON(jsonlite::toJSON(this_object$`view_window_days`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionProductReportCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `columns`
      if (!is.null(input_json$`columns`)) {
        stopifnot(is.vector(input_json$`columns`), length(input_json$`columns`) != 0)
        tmp <- sapply(input_json$`columns`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionProductReportCreate: the required field `columns` is missing."))
      }
      # check the required field `end_date`
      if (!is.null(input_json$`end_date`)) {
        if (!(is.character(input_json$`end_date`) && length(input_json$`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", input_json$`end_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionProductReportCreate: the required field `end_date` is missing."))
      }
      # check the required field `granularity`
      if (!is.null(input_json$`granularity`)) {
        stopifnot(R6::is.R6(input_json$`granularity`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionProductReportCreate: the required field `granularity` is missing."))
      }
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        stopifnot(R6::is.R6(input_json$`level`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionProductReportCreate: the required field `level` is missing."))
      }
      # check the required field `report_name`
      if (!is.null(input_json$`report_name`)) {
        if (!(is.character(input_json$`report_name`) && length(input_json$`report_name`) == 1)) {
          stop(paste("Error! Invalid data for `report_name`. Must be a string:", input_json$`report_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionProductReportCreate: the required field `report_name` is missing."))
      }
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionProductReportCreate: the required field `start_date` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionProductReportCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`ad_group_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`ad_group_ids`) < 1) {
        return(FALSE)
      }

      if (length(self$`campaign_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`campaign_ids`) < 1) {
        return(FALSE)
      }

      if (length(self$`campaign_objective_types`) > 7) {
        return(FALSE)
      }
      if (length(self$`campaign_objective_types`) < 1) {
        return(FALSE)
      }

      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
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

      if (length(self$`product_sku_ids`) > 30000) {
        return(FALSE)
      }
      if (length(self$`product_sku_ids`) < 2) {
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

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (length(self$`ad_group_ids`) > 500) {
        invalid_fields["ad_group_ids"] <- "Invalid length for `ad_group_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`ad_group_ids`) < 1) {
        invalid_fields["ad_group_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`campaign_ids`) > 500) {
        invalid_fields["campaign_ids"] <- "Invalid length for `campaign_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`campaign_ids`) < 1) {
        invalid_fields["campaign_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`campaign_objective_types`) > 7) {
        invalid_fields["campaign_objective_types"] <- "Invalid length for `campaign_objective_types`, number of items must be less than or equal to 7."
      }
      if (length(self$`campaign_objective_types`) < 1) {
        invalid_fields["campaign_objective_types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      # check if the required `columns` is null
      if (is.null(self$`columns`)) {
        invalid_fields["columns"] <- "Non-nullable required field `columns` cannot be null."
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

      if (length(self$`product_sku_ids`) > 30000) {
        invalid_fields["product_sku_ids"] <- "Invalid length for `product_sku_ids`, number of items must be less than or equal to 30000."
      }
      if (length(self$`product_sku_ids`) < 2) {
        invalid_fields["product_sku_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 2."
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
# ConversionProductReportCreate$unlock()
#
## Below is an example to define the print function
# ConversionProductReportCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionProductReportCreate$lock()

