#' Create a new CampaignDeliveryEstimatesCampaign
#'
#' @description
#' Campaign configuration for delivery estimates.
#'
#' @docType class
#' @title CampaignDeliveryEstimatesCampaign
#' @description CampaignDeliveryEstimatesCampaign Class
#' @format An \code{R6Class} generator object
#' @field ad_groups  list(\link{AdGroupDeliveryEstimates})
#' @field budget_duration_type Duration type of the budget \link{BudgetDurationType}
#' @field daily_spend_cap Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. integer [optional]
#' @field end_date End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. character [optional]
#' @field lifetime_spend_cap Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. integer [optional]
#' @field objective_type  \link{DeliveryEstimateObjectiveType}
#' @field start_date Start date of the date range for an ad campaign, pattern YYYY-MM-DD. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignDeliveryEstimatesCampaign <- R6::R6Class(
  "CampaignDeliveryEstimatesCampaign",
  public = list(
    `ad_groups` = NULL,
    `budget_duration_type` = NULL,
    `daily_spend_cap` = NULL,
    `end_date` = NULL,
    `lifetime_spend_cap` = NULL,
    `objective_type` = NULL,
    `start_date` = NULL,

    #' @description
    #' Initialize a new CampaignDeliveryEstimatesCampaign class.
    #'
    #' @param ad_groups ad_groups
    #' @param budget_duration_type Duration type of the budget
    #' @param objective_type objective_type
    #' @param start_date Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
    #' @param daily_spend_cap Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
    #' @param end_date End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
    #' @param lifetime_spend_cap Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
    #' @param ... Other optional arguments.
    initialize = function(`ad_groups`, `budget_duration_type`, `objective_type`, `start_date`, `daily_spend_cap` = NULL, `end_date` = NULL, `lifetime_spend_cap` = NULL, ...) {
      if (!missing(`ad_groups`)) {
        stopifnot(is.vector(`ad_groups`), length(`ad_groups`) != 0)
        sapply(`ad_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`ad_groups` <- `ad_groups`
      }
      if (!missing(`budget_duration_type`)) {
        if (!(`budget_duration_type` %in% c())) {
          stop(paste("Error! \"", `budget_duration_type`, "\" cannot be assigned to `budget_duration_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`budget_duration_type`))
        self$`budget_duration_type` <- `budget_duration_type`
      }
      if (!missing(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
      }
      if (!missing(`start_date`)) {
        if (!(is.character(`start_date`) && length(`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
      }
      if (!is.null(`daily_spend_cap`)) {
        if (!(is.numeric(`daily_spend_cap`) && length(`daily_spend_cap`) == 1)) {
          stop(paste("Error! Invalid data for `daily_spend_cap`. Must be an integer:", `daily_spend_cap`))
        }
        self$`daily_spend_cap` <- `daily_spend_cap`
      }
      if (!is.null(`end_date`)) {
        if (!(is.character(`end_date`) && length(`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!is.null(`lifetime_spend_cap`)) {
        if (!(is.numeric(`lifetime_spend_cap`) && length(`lifetime_spend_cap`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_spend_cap`. Must be an integer:", `lifetime_spend_cap`))
        }
        self$`lifetime_spend_cap` <- `lifetime_spend_cap`
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
    #' @return CampaignDeliveryEstimatesCampaign as a base R list.
    #' @examples
    #' # convert array of CampaignDeliveryEstimatesCampaign (x) to a data frame
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
    #' Convert CampaignDeliveryEstimatesCampaign to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignDeliveryEstimatesCampaignObject <- list()
      if (!is.null(self$`ad_groups`)) {
        CampaignDeliveryEstimatesCampaignObject[["ad_groups"]] <-
          self$extractSimpleType(self$`ad_groups`)
      }
      if (!is.null(self$`budget_duration_type`)) {
        CampaignDeliveryEstimatesCampaignObject[["budget_duration_type"]] <-
          self$extractSimpleType(self$`budget_duration_type`)
      }
      if (!is.null(self$`daily_spend_cap`)) {
        CampaignDeliveryEstimatesCampaignObject[["daily_spend_cap"]] <-
          self$`daily_spend_cap`
      }
      if (!is.null(self$`end_date`)) {
        CampaignDeliveryEstimatesCampaignObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`lifetime_spend_cap`)) {
        CampaignDeliveryEstimatesCampaignObject[["lifetime_spend_cap"]] <-
          self$`lifetime_spend_cap`
      }
      if (!is.null(self$`objective_type`)) {
        CampaignDeliveryEstimatesCampaignObject[["objective_type"]] <-
          self$extractSimpleType(self$`objective_type`)
      }
      if (!is.null(self$`start_date`)) {
        CampaignDeliveryEstimatesCampaignObject[["start_date"]] <-
          self$`start_date`
      }
      return(CampaignDeliveryEstimatesCampaignObject)
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
    #' Deserialize JSON string into an instance of CampaignDeliveryEstimatesCampaign
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDeliveryEstimatesCampaign
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_groups`)) {
        self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupDeliveryEstimates]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`budget_duration_type`)) {
        `budget_duration_type_object` <- BudgetDurationType$new()
        `budget_duration_type_object`$fromJSON(jsonlite::toJSON(this_object$`budget_duration_type`, auto_unbox = TRUE, digits = NA))
        self$`budget_duration_type` <- `budget_duration_type_object`
      }
      if (!is.null(this_object$`daily_spend_cap`)) {
        self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`lifetime_spend_cap`)) {
        self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      }
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- DeliveryEstimateObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignDeliveryEstimatesCampaign in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignDeliveryEstimatesCampaign
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDeliveryEstimatesCampaign
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupDeliveryEstimates]", loadNamespace("openapi"))
      self$`budget_duration_type` <- BudgetDurationType$new()$fromJSON(jsonlite::toJSON(this_object$`budget_duration_type`, auto_unbox = TRUE, digits = NA))
      self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      self$`end_date` <- this_object$`end_date`
      self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      self$`objective_type` <- DeliveryEstimateObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self$`start_date` <- this_object$`start_date`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignDeliveryEstimatesCampaign and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_groups`
      if (!is.null(input_json$`ad_groups`)) {
        stopifnot(is.vector(input_json$`ad_groups`), length(input_json$`ad_groups`) != 0)
        tmp <- sapply(input_json$`ad_groups`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignDeliveryEstimatesCampaign: the required field `ad_groups` is missing."))
      }
      # check the required field `budget_duration_type`
      if (!is.null(input_json$`budget_duration_type`)) {
        stopifnot(R6::is.R6(input_json$`budget_duration_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignDeliveryEstimatesCampaign: the required field `budget_duration_type` is missing."))
      }
      # check the required field `objective_type`
      if (!is.null(input_json$`objective_type`)) {
        stopifnot(R6::is.R6(input_json$`objective_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignDeliveryEstimatesCampaign: the required field `objective_type` is missing."))
      }
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignDeliveryEstimatesCampaign: the required field `start_date` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignDeliveryEstimatesCampaign
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_groups` is null
      if (is.null(self$`ad_groups`)) {
        return(FALSE)
      }

      if (length(self$`ad_groups`) > 10) {
        return(FALSE)
      }
      if (length(self$`ad_groups`) < 1) {
        return(FALSE)
      }

      # check if the required `budget_duration_type` is null
      if (is.null(self$`budget_duration_type`)) {
        return(FALSE)
      }

      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        return(FALSE)
      }

      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
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
      # check if the required `ad_groups` is null
      if (is.null(self$`ad_groups`)) {
        invalid_fields["ad_groups"] <- "Non-nullable required field `ad_groups` cannot be null."
      }

      if (length(self$`ad_groups`) > 10) {
        invalid_fields["ad_groups"] <- "Invalid length for `ad_groups`, number of items must be less than or equal to 10."
      }
      if (length(self$`ad_groups`) < 1) {
        invalid_fields["ad_groups"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      # check if the required `budget_duration_type` is null
      if (is.null(self$`budget_duration_type`)) {
        invalid_fields["budget_duration_type"] <- "Non-nullable required field `budget_duration_type` cannot be null."
      }

      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
      }

      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
        invalid_fields["objective_type"] <- "Non-nullable required field `objective_type` cannot be null."
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
# CampaignDeliveryEstimatesCampaign$unlock()
#
## Below is an example to define the print function
# CampaignDeliveryEstimatesCampaign$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignDeliveryEstimatesCampaign$lock()

