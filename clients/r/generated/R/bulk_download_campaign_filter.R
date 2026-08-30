#' Create a new BulkDownloadCampaignFilter
#'
#' @description
#' BulkDownloadCampaignFilter Class
#'
#' @docType class
#' @title BulkDownloadCampaignFilter
#' @description BulkDownloadCampaignFilter Class
#' @format An \code{R6Class} generator object
#' @field campaign_status  list(\link{SummaryStatus}) [optional]
#' @field end_time Unix UTC timestamp. character [optional]
#' @field name Campaign name character [optional]
#' @field objective_type  list(\link{ConversionObjectiveType}) [optional]
#' @field start_time Unix UTC timestamp. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkDownloadCampaignFilter <- R6::R6Class(
  "BulkDownloadCampaignFilter",
  public = list(
    `campaign_status` = NULL,
    `end_time` = NULL,
    `name` = NULL,
    `objective_type` = NULL,
    `start_time` = NULL,

    #' @description
    #' Initialize a new BulkDownloadCampaignFilter class.
    #'
    #' @param campaign_status campaign_status
    #' @param end_time Unix UTC timestamp.
    #' @param name Campaign name
    #' @param objective_type objective_type
    #' @param start_time Unix UTC timestamp.
    #' @param ... Other optional arguments.
    initialize = function(`campaign_status` = NULL, `end_time` = NULL, `name` = NULL, `objective_type` = NULL, `start_time` = NULL, ...) {
      if (!is.null(`campaign_status`)) {
        stopifnot(is.vector(`campaign_status`), length(`campaign_status`) != 0)
        sapply(`campaign_status`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaign_status` <- `campaign_status`
      }
      if (!is.null(`end_time`)) {
        if (!(is.character(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be a string:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`objective_type`)) {
        stopifnot(is.vector(`objective_type`), length(`objective_type`) != 0)
        sapply(`objective_type`, function(x) stopifnot(R6::is.R6(x)))
        self$`objective_type` <- `objective_type`
      }
      if (!is.null(`start_time`)) {
        if (!(is.character(`start_time`) && length(`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be a string:", `start_time`))
        }
        self$`start_time` <- `start_time`
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
    #' @return BulkDownloadCampaignFilter as a base R list.
    #' @examples
    #' # convert array of BulkDownloadCampaignFilter (x) to a data frame
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
    #' Convert BulkDownloadCampaignFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkDownloadCampaignFilterObject <- list()
      if (!is.null(self$`campaign_status`)) {
        BulkDownloadCampaignFilterObject[["campaign_status"]] <-
          self$extractSimpleType(self$`campaign_status`)
      }
      if (!is.null(self$`end_time`)) {
        BulkDownloadCampaignFilterObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`name`)) {
        BulkDownloadCampaignFilterObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`objective_type`)) {
        BulkDownloadCampaignFilterObject[["objective_type"]] <-
          self$extractSimpleType(self$`objective_type`)
      }
      if (!is.null(self$`start_time`)) {
        BulkDownloadCampaignFilterObject[["start_time"]] <-
          self$`start_time`
      }
      return(BulkDownloadCampaignFilterObject)
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
    #' Deserialize JSON string into an instance of BulkDownloadCampaignFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadCampaignFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaign_status`)) {
        self$`campaign_status` <- ApiClient$new()$deserializeObj(this_object$`campaign_status`, "array[SummaryStatus]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`objective_type`)) {
        self$`objective_type` <- ApiClient$new()$deserializeObj(this_object$`objective_type`, "array[ConversionObjectiveType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkDownloadCampaignFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadCampaignFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadCampaignFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaign_status` <- ApiClient$new()$deserializeObj(this_object$`campaign_status`, "array[SummaryStatus]", loadNamespace("openapi"))
      self$`end_time` <- this_object$`end_time`
      self$`name` <- this_object$`name`
      self$`objective_type` <- ApiClient$new()$deserializeObj(this_object$`objective_type`, "array[ConversionObjectiveType]", loadNamespace("openapi"))
      self$`start_time` <- this_object$`start_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkDownloadCampaignFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkDownloadCampaignFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`end_time`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`start_time`, "^\\d+$")) {
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
      if (!str_detect(self$`end_time`, "^\\d+$")) {
        invalid_fields["end_time"] <- "Invalid value for `end_time`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`start_time`, "^\\d+$")) {
        invalid_fields["start_time"] <- "Invalid value for `start_time`, must conform to the pattern ^\\d+$."
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
# BulkDownloadCampaignFilter$unlock()
#
## Below is an example to define the print function
# BulkDownloadCampaignFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkDownloadCampaignFilter$lock()

