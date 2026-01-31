#' Create a new CatalogsRetailItemsBatch
#'
#' @description
#' Object describing the catalogs retail items batch
#'
#' @docType class
#' @title CatalogsRetailItemsBatch
#' @description CatalogsRetailItemsBatch Class
#' @format An \code{R6Class} generator object
#' @field batch_id Id of the catalogs items batch character [optional]
#' @field catalog_type  \link{CatalogsType}
#' @field completed_time Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss character [optional]
#' @field created_time Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. character
#' @field items Array with the catalogs items processing records part of the catalogs items batch list(\link{ItemProcessingRecord}) [optional]
#' @field status  \link{BatchOperationStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailItemsBatch <- R6::R6Class(
  "CatalogsRetailItemsBatch",
  public = list(
    `batch_id` = NULL,
    `catalog_type` = NULL,
    `completed_time` = NULL,
    `created_time` = NULL,
    `items` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailItemsBatch class.
    #'
    #' @param catalog_type catalog_type
    #' @param created_time Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
    #' @param batch_id Id of the catalogs items batch
    #' @param completed_time Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
    #' @param items Array with the catalogs items processing records part of the catalogs items batch
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `created_time`, `batch_id` = NULL, `completed_time` = NULL, `items` = NULL, `status` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`created_time`)) {
        if (!(is.character(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be a string:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`batch_id`)) {
        if (!(is.character(`batch_id`) && length(`batch_id`) == 1)) {
          stop(paste("Error! Invalid data for `batch_id`. Must be a string:", `batch_id`))
        }
        self$`batch_id` <- `batch_id`
      }
      if (!is.null(`completed_time`)) {
        if (!is.character(`completed_time`)) {
          stop(paste("Error! Invalid data for `completed_time`. Must be a string:", `completed_time`))
        }
        self$`completed_time` <- `completed_time`
      }
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
    #' @return CatalogsRetailItemsBatch as a base R list.
    #' @examples
    #' # convert array of CatalogsRetailItemsBatch (x) to a data frame
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
    #' Convert CatalogsRetailItemsBatch to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsRetailItemsBatchObject <- list()
      if (!is.null(self$`batch_id`)) {
        CatalogsRetailItemsBatchObject[["batch_id"]] <-
          self$`batch_id`
      }
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailItemsBatchObject[["catalog_type"]] <-
          self$`catalog_type`$toSimpleType()
      }
      if (!is.null(self$`completed_time`)) {
        CatalogsRetailItemsBatchObject[["completed_time"]] <-
          self$`completed_time`
      }
      if (!is.null(self$`created_time`)) {
        CatalogsRetailItemsBatchObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`items`)) {
        CatalogsRetailItemsBatchObject[["items"]] <-
          lapply(self$`items`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`status`)) {
        CatalogsRetailItemsBatchObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      return(CatalogsRetailItemsBatchObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailItemsBatch
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemsBatch
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`batch_id`)) {
        self$`batch_id` <- this_object$`batch_id`
      }
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
      if (!is.null(this_object$`completed_time`)) {
        self$`completed_time` <- this_object$`completed_time`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemProcessingRecord]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- BatchOperationStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsRetailItemsBatch in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailItemsBatch
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemsBatch
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`batch_id` <- this_object$`batch_id`
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`completed_time` <- this_object$`completed_time`
      self$`created_time` <- this_object$`created_time`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemProcessingRecord]", loadNamespace("openapi"))
      self$`status` <- BatchOperationStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailItemsBatch and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemsBatch: the required field `catalog_type` is missing."))
      }
      # check the required field `created_time`
      if (!is.null(input_json$`created_time`)) {
        if (!(is.character(input_json$`created_time`) && length(input_json$`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be a string:", input_json$`created_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemsBatch: the required field `created_time` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailItemsBatch
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
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
# CatalogsRetailItemsBatch$unlock()
#
## Below is an example to define the print function
# CatalogsRetailItemsBatch$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailItemsBatch$lock()

