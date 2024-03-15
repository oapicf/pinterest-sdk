#' Create a new BulkDownloadRequest
#'
#' @description
#' Ad entities to get in bulk request.
#'
#' @docType class
#' @title BulkDownloadRequest
#' @description BulkDownloadRequest Class
#' @format An \code{R6Class} generator object
#' @field entity_types All entity types specified will be downloaded. Fewer types result in faster downloads. list(\link{BulkEntityType}) [optional]
#' @field entity_ids All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. list(character) [optional]
#' @field updated_since Unix UTC timestamp to retrieve all entities that have changed since this time. character [optional]
#' @field campaign_filter  \link{BulkDownloadRequestCampaignFilter} [optional]
#' @field output_format  \link{BulkOutputFormat} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkDownloadRequest <- R6::R6Class(
  "BulkDownloadRequest",
  public = list(
    `entity_types` = NULL,
    `entity_ids` = NULL,
    `updated_since` = NULL,
    `campaign_filter` = NULL,
    `output_format` = NULL,
    #' Initialize a new BulkDownloadRequest class.
    #'
    #' @description
    #' Initialize a new BulkDownloadRequest class.
    #'
    #' @param entity_types All entity types specified will be downloaded. Fewer types result in faster downloads.
    #' @param entity_ids All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
    #' @param updated_since Unix UTC timestamp to retrieve all entities that have changed since this time.
    #' @param campaign_filter campaign_filter
    #' @param output_format output_format. Default to "JSON".
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`entity_types` = NULL, `entity_ids` = NULL, `updated_since` = NULL, `campaign_filter` = NULL, `output_format` = "JSON", ...) {
      if (!is.null(`entity_types`)) {
        stopifnot(is.vector(`entity_types`), length(`entity_types`) != 0)
        sapply(`entity_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`entity_types` <- `entity_types`
      }
      if (!is.null(`entity_ids`)) {
        stopifnot(is.vector(`entity_ids`), length(`entity_ids`) != 0)
        sapply(`entity_ids`, function(x) stopifnot(is.character(x)))
        self$`entity_ids` <- `entity_ids`
      }
      if (!is.null(`updated_since`)) {
        if (!(is.character(`updated_since`) && length(`updated_since`) == 1)) {
          stop(paste("Error! Invalid data for `updated_since`. Must be a string:", `updated_since`))
        }
        self$`updated_since` <- `updated_since`
      }
      if (!is.null(`campaign_filter`)) {
        stopifnot(R6::is.R6(`campaign_filter`))
        self$`campaign_filter` <- `campaign_filter`
      }
      if (!is.null(`output_format`)) {
        if (!(`output_format` %in% c())) {
          stop(paste("Error! \"", `output_format`, "\" cannot be assigned to `output_format`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`output_format`))
        self$`output_format` <- `output_format`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkDownloadRequest in JSON format
    #' @export
    toJSON = function() {
      BulkDownloadRequestObject <- list()
      if (!is.null(self$`entity_types`)) {
        BulkDownloadRequestObject[["entity_types"]] <-
          lapply(self$`entity_types`, function(x) x$toJSON())
      }
      if (!is.null(self$`entity_ids`)) {
        BulkDownloadRequestObject[["entity_ids"]] <-
          self$`entity_ids`
      }
      if (!is.null(self$`updated_since`)) {
        BulkDownloadRequestObject[["updated_since"]] <-
          self$`updated_since`
      }
      if (!is.null(self$`campaign_filter`)) {
        BulkDownloadRequestObject[["campaign_filter"]] <-
          self$`campaign_filter`$toJSON()
      }
      if (!is.null(self$`output_format`)) {
        BulkDownloadRequestObject[["output_format"]] <-
          self$`output_format`$toJSON()
      }
      BulkDownloadRequestObject
    },
    #' Deserialize JSON string into an instance of BulkDownloadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entity_types`)) {
        self$`entity_types` <- ApiClient$new()$deserializeObj(this_object$`entity_types`, "array[BulkEntityType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`entity_ids`)) {
        self$`entity_ids` <- ApiClient$new()$deserializeObj(this_object$`entity_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`updated_since`)) {
        self$`updated_since` <- this_object$`updated_since`
      }
      if (!is.null(this_object$`campaign_filter`)) {
        `campaign_filter_object` <- BulkDownloadRequestCampaignFilter$new()
        `campaign_filter_object`$fromJSON(jsonlite::toJSON(this_object$`campaign_filter`, auto_unbox = TRUE, digits = NA))
        self$`campaign_filter` <- `campaign_filter_object`
      }
      if (!is.null(this_object$`output_format`)) {
        `output_format_object` <- BulkOutputFormat$new()
        `output_format_object`$fromJSON(jsonlite::toJSON(this_object$`output_format`, auto_unbox = TRUE, digits = NA))
        self$`output_format` <- `output_format_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkDownloadRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`entity_types`)) {
          sprintf(
          '"entity_types":
          [%s]
',
          paste(sapply(self$`entity_types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`entity_ids`)) {
          sprintf(
          '"entity_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`entity_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`updated_since`)) {
          sprintf(
          '"updated_since":
            "%s"
                    ',
          self$`updated_since`
          )
        },
        if (!is.null(self$`campaign_filter`)) {
          sprintf(
          '"campaign_filter":
          %s
          ',
          jsonlite::toJSON(self$`campaign_filter`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`output_format`)) {
          sprintf(
          '"output_format":
          %s
          ',
          jsonlite::toJSON(self$`output_format`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BulkDownloadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entity_types` <- ApiClient$new()$deserializeObj(this_object$`entity_types`, "array[BulkEntityType]", loadNamespace("openapi"))
      self$`entity_ids` <- ApiClient$new()$deserializeObj(this_object$`entity_ids`, "array[character]", loadNamespace("openapi"))
      self$`updated_since` <- this_object$`updated_since`
      self$`campaign_filter` <- BulkDownloadRequestCampaignFilter$new()$fromJSON(jsonlite::toJSON(this_object$`campaign_filter`, auto_unbox = TRUE, digits = NA))
      self$`output_format` <- BulkOutputFormat$new()$fromJSON(jsonlite::toJSON(this_object$`output_format`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to BulkDownloadRequest
    #'
    #' @description
    #' Validate JSON input with respect to BulkDownloadRequest and throw an exception if invalid
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
    #' @return String representation of BulkDownloadRequest
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
      if (length(self$`entity_types`) > 5) {
        return(FALSE)
      }
      if (length(self$`entity_types`) < 1) {
        return(FALSE)
      }

      if (!str_detect(self$`updated_since`, "^\\d+$")) {
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
      if (length(self$`entity_types`) > 5) {
        invalid_fields["entity_types"] <- "Invalid length for `entity_types`, number of items must be less than or equal to 5."
      }
      if (length(self$`entity_types`) < 1) {
        invalid_fields["entity_types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (!str_detect(self$`updated_since`, "^\\d+$")) {
        invalid_fields["updated_since"] <- "Invalid value for `updated_since`, must conform to the pattern ^\\d+$."
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
# BulkDownloadRequest$unlock()
#
## Below is an example to define the print function
# BulkDownloadRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkDownloadRequest$lock()

