#' Create a new BulkDownloadRequestCampaignFilter
#'
#' @description
#' BulkDownloadRequestCampaignFilter Class
#'
#' @docType class
#' @title BulkDownloadRequestCampaignFilter
#' @description BulkDownloadRequestCampaignFilter Class
#' @format An \code{R6Class} generator object
#' @field start_time Unix UTC timestamp. character [optional]
#' @field end_time Unix UTC timestamp. character [optional]
#' @field name Campaign name character [optional]
#' @field campaign_status  list(\link{CampaignSummaryStatus}) [optional]
#' @field objective_type  list(\link{ObjectiveType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkDownloadRequestCampaignFilter <- R6::R6Class(
  "BulkDownloadRequestCampaignFilter",
  public = list(
    `start_time` = NULL,
    `end_time` = NULL,
    `name` = NULL,
    `campaign_status` = NULL,
    `objective_type` = NULL,
    #' Initialize a new BulkDownloadRequestCampaignFilter class.
    #'
    #' @description
    #' Initialize a new BulkDownloadRequestCampaignFilter class.
    #'
    #' @param start_time Unix UTC timestamp.
    #' @param end_time Unix UTC timestamp.
    #' @param name Campaign name
    #' @param campaign_status campaign_status
    #' @param objective_type objective_type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`start_time` = NULL, `end_time` = NULL, `name` = NULL, `campaign_status` = NULL, `objective_type` = NULL, ...) {
      if (!is.null(`start_time`)) {
        if (!(is.character(`start_time`) && length(`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be a string:", `start_time`))
        }
        self$`start_time` <- `start_time`
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
      if (!is.null(`campaign_status`)) {
        stopifnot(is.vector(`campaign_status`), length(`campaign_status`) != 0)
        sapply(`campaign_status`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaign_status` <- `campaign_status`
      }
      if (!is.null(`objective_type`)) {
        stopifnot(is.vector(`objective_type`), length(`objective_type`) != 0)
        sapply(`objective_type`, function(x) stopifnot(R6::is.R6(x)))
        self$`objective_type` <- `objective_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkDownloadRequestCampaignFilter in JSON format
    #' @export
    toJSON = function() {
      BulkDownloadRequestCampaignFilterObject <- list()
      if (!is.null(self$`start_time`)) {
        BulkDownloadRequestCampaignFilterObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        BulkDownloadRequestCampaignFilterObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`name`)) {
        BulkDownloadRequestCampaignFilterObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`campaign_status`)) {
        BulkDownloadRequestCampaignFilterObject[["campaign_status"]] <-
          lapply(self$`campaign_status`, function(x) x$toJSON())
      }
      if (!is.null(self$`objective_type`)) {
        BulkDownloadRequestCampaignFilterObject[["objective_type"]] <-
          lapply(self$`objective_type`, function(x) x$toJSON())
      }
      BulkDownloadRequestCampaignFilterObject
    },
    #' Deserialize JSON string into an instance of BulkDownloadRequestCampaignFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadRequestCampaignFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadRequestCampaignFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`campaign_status`)) {
        self$`campaign_status` <- ApiClient$new()$deserializeObj(this_object$`campaign_status`, "array[CampaignSummaryStatus]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`objective_type`)) {
        self$`objective_type` <- ApiClient$new()$deserializeObj(this_object$`objective_type`, "array[ObjectiveType]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkDownloadRequestCampaignFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`start_time`)) {
          sprintf(
          '"start_time":
            "%s"
                    ',
          self$`start_time`
          )
        },
        if (!is.null(self$`end_time`)) {
          sprintf(
          '"end_time":
            "%s"
                    ',
          self$`end_time`
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
        if (!is.null(self$`campaign_status`)) {
          sprintf(
          '"campaign_status":
          [%s]
',
          paste(sapply(self$`campaign_status`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`objective_type`)) {
          sprintf(
          '"objective_type":
          [%s]
',
          paste(sapply(self$`objective_type`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BulkDownloadRequestCampaignFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadRequestCampaignFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadRequestCampaignFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`start_time` <- this_object$`start_time`
      self$`end_time` <- this_object$`end_time`
      self$`name` <- this_object$`name`
      self$`campaign_status` <- ApiClient$new()$deserializeObj(this_object$`campaign_status`, "array[CampaignSummaryStatus]", loadNamespace("openapi"))
      self$`objective_type` <- ApiClient$new()$deserializeObj(this_object$`objective_type`, "array[ObjectiveType]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to BulkDownloadRequestCampaignFilter
    #'
    #' @description
    #' Validate JSON input with respect to BulkDownloadRequestCampaignFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkDownloadRequestCampaignFilter
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
      if (!str_detect(self$`start_time`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`end_time`, "^\\d+$")) {
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
      if (!str_detect(self$`start_time`, "^\\d+$")) {
        invalid_fields["start_time"] <- "Invalid value for `start_time`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`end_time`, "^\\d+$")) {
        invalid_fields["end_time"] <- "Invalid value for `end_time`, must conform to the pattern ^\\d+$."
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
# BulkDownloadRequestCampaignFilter$unlock()
#
## Below is an example to define the print function
# BulkDownloadRequestCampaignFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkDownloadRequestCampaignFilter$lock()

