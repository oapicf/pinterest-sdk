#' Create a new BulkDownloadCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title BulkDownloadCreate
#' @description BulkDownloadCreate Class
#' @format An \code{R6Class} generator object
#' @field campaign_filter  \link{BulkDownloadCampaignFilter} [optional]
#' @field entity_ids All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. list(character) [optional]
#' @field entity_types All entity types specified will be downloaded. Fewer types result in faster downloads. list(\link{BulkEntityType}) [optional]
#' @field output_format  \link{BulkOutputFormat} [optional]
#' @field updated_since Unix UTC timestamp to retrieve all entities that have changed since this time. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkDownloadCreate <- R6::R6Class(
  "BulkDownloadCreate",
  public = list(
    `campaign_filter` = NULL,
    `entity_ids` = NULL,
    `entity_types` = NULL,
    `output_format` = NULL,
    `updated_since` = NULL,

    #' @description
    #' Initialize a new BulkDownloadCreate class.
    #'
    #' @param campaign_filter campaign_filter
    #' @param entity_ids All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
    #' @param entity_types All entity types specified will be downloaded. Fewer types result in faster downloads.
    #' @param output_format output_format
    #' @param updated_since Unix UTC timestamp to retrieve all entities that have changed since this time.
    #' @param ... Other optional arguments.
    initialize = function(`campaign_filter` = NULL, `entity_ids` = NULL, `entity_types` = NULL, `output_format` = NULL, `updated_since` = NULL, ...) {
      if (!is.null(`campaign_filter`)) {
        stopifnot(R6::is.R6(`campaign_filter`))
        self$`campaign_filter` <- `campaign_filter`
      }
      if (!is.null(`entity_ids`)) {
        stopifnot(is.vector(`entity_ids`), length(`entity_ids`) != 0)
        sapply(`entity_ids`, function(x) stopifnot(is.character(x)))
        self$`entity_ids` <- `entity_ids`
      }
      if (!is.null(`entity_types`)) {
        stopifnot(is.vector(`entity_types`), length(`entity_types`) != 0)
        sapply(`entity_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`entity_types` <- `entity_types`
      }
      if (!is.null(`output_format`)) {
        if (!(`output_format` %in% c())) {
          stop(paste("Error! \"", `output_format`, "\" cannot be assigned to `output_format`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`output_format`))
        self$`output_format` <- `output_format`
      }
      if (!is.null(`updated_since`)) {
        if (!(is.character(`updated_since`) && length(`updated_since`) == 1)) {
          stop(paste("Error! Invalid data for `updated_since`. Must be a string:", `updated_since`))
        }
        self$`updated_since` <- `updated_since`
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
    #' @return BulkDownloadCreate as a base R list.
    #' @examples
    #' # convert array of BulkDownloadCreate (x) to a data frame
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
    #' Convert BulkDownloadCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkDownloadCreateObject <- list()
      if (!is.null(self$`campaign_filter`)) {
        BulkDownloadCreateObject[["campaign_filter"]] <-
          self$extractSimpleType(self$`campaign_filter`)
      }
      if (!is.null(self$`entity_ids`)) {
        BulkDownloadCreateObject[["entity_ids"]] <-
          self$`entity_ids`
      }
      if (!is.null(self$`entity_types`)) {
        BulkDownloadCreateObject[["entity_types"]] <-
          self$extractSimpleType(self$`entity_types`)
      }
      if (!is.null(self$`output_format`)) {
        BulkDownloadCreateObject[["output_format"]] <-
          self$extractSimpleType(self$`output_format`)
      }
      if (!is.null(self$`updated_since`)) {
        BulkDownloadCreateObject[["updated_since"]] <-
          self$`updated_since`
      }
      return(BulkDownloadCreateObject)
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
    #' Deserialize JSON string into an instance of BulkDownloadCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaign_filter`)) {
        `campaign_filter_object` <- BulkDownloadCampaignFilter$new()
        `campaign_filter_object`$fromJSON(jsonlite::toJSON(this_object$`campaign_filter`, auto_unbox = TRUE, digits = NA))
        self$`campaign_filter` <- `campaign_filter_object`
      }
      if (!is.null(this_object$`entity_ids`)) {
        self$`entity_ids` <- ApiClient$new()$deserializeObj(this_object$`entity_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`entity_types`)) {
        self$`entity_types` <- ApiClient$new()$deserializeObj(this_object$`entity_types`, "array[BulkEntityType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`output_format`)) {
        `output_format_object` <- BulkOutputFormat$new()
        `output_format_object`$fromJSON(jsonlite::toJSON(this_object$`output_format`, auto_unbox = TRUE, digits = NA))
        self$`output_format` <- `output_format_object`
      }
      if (!is.null(this_object$`updated_since`)) {
        self$`updated_since` <- this_object$`updated_since`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkDownloadCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaign_filter` <- BulkDownloadCampaignFilter$new()$fromJSON(jsonlite::toJSON(this_object$`campaign_filter`, auto_unbox = TRUE, digits = NA))
      self$`entity_ids` <- ApiClient$new()$deserializeObj(this_object$`entity_ids`, "array[character]", loadNamespace("openapi"))
      self$`entity_types` <- ApiClient$new()$deserializeObj(this_object$`entity_types`, "array[BulkEntityType]", loadNamespace("openapi"))
      self$`output_format` <- BulkOutputFormat$new()$fromJSON(jsonlite::toJSON(this_object$`output_format`, auto_unbox = TRUE, digits = NA))
      self$`updated_since` <- this_object$`updated_since`
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkDownloadCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkDownloadCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`entity_types`) > 6) {
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

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (length(self$`entity_types`) > 6) {
        invalid_fields["entity_types"] <- "Invalid length for `entity_types`, number of items must be less than or equal to 6."
      }
      if (length(self$`entity_types`) < 1) {
        invalid_fields["entity_types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (!str_detect(self$`updated_since`, "^\\d+$")) {
        invalid_fields["updated_since"] <- "Invalid value for `updated_since`, must conform to the pattern ^\\d+$."
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
# BulkDownloadCreate$unlock()
#
## Below is an example to define the print function
# BulkDownloadCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkDownloadCreate$lock()

