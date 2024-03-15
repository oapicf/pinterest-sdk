#' Create a new CatalogsHotelItemsBatch
#'
#' @description
#' Object describing the catalogs hotel items batch
#'
#' @docType class
#' @title CatalogsHotelItemsBatch
#' @description CatalogsHotelItemsBatch Class
#' @format An \code{R6Class} generator object
#' @field batch_id Id of the catalogs items batch character [optional]
#' @field created_time Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD character [optional]
#' @field completed_time Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD character [optional]
#' @field status  \link{BatchOperationStatus} [optional]
#' @field catalog_type  \link{CatalogsType}
#' @field items Array with the catalogs items processing records part of the catalogs items batch list(\link{HotelProcessingRecord}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelItemsBatch <- R6::R6Class(
  "CatalogsHotelItemsBatch",
  public = list(
    `batch_id` = NULL,
    `created_time` = NULL,
    `completed_time` = NULL,
    `status` = NULL,
    `catalog_type` = NULL,
    `items` = NULL,
    #' Initialize a new CatalogsHotelItemsBatch class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelItemsBatch class.
    #'
    #' @param catalog_type catalog_type
    #' @param batch_id Id of the catalogs items batch
    #' @param created_time Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
    #' @param completed_time Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
    #' @param status status
    #' @param items Array with the catalogs items processing records part of the catalogs items batch
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type`, `batch_id` = NULL, `created_time` = NULL, `completed_time` = NULL, `status` = NULL, `items` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!is.null(`batch_id`)) {
        if (!(is.character(`batch_id`) && length(`batch_id`) == 1)) {
          stop(paste("Error! Invalid data for `batch_id`. Must be a string:", `batch_id`))
        }
        self$`batch_id` <- `batch_id`
      }
      if (!is.null(`created_time`)) {
        if (!is.character(`created_time`)) {
          stop(paste("Error! Invalid data for `created_time`. Must be a string:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`completed_time`)) {
        if (!is.character(`completed_time`)) {
          stop(paste("Error! Invalid data for `completed_time`. Must be a string:", `completed_time`))
        }
        self$`completed_time` <- `completed_time`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelItemsBatch in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelItemsBatchObject <- list()
      if (!is.null(self$`batch_id`)) {
        CatalogsHotelItemsBatchObject[["batch_id"]] <-
          self$`batch_id`
      }
      if (!is.null(self$`created_time`)) {
        CatalogsHotelItemsBatchObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`completed_time`)) {
        CatalogsHotelItemsBatchObject[["completed_time"]] <-
          self$`completed_time`
      }
      if (!is.null(self$`status`)) {
        CatalogsHotelItemsBatchObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelItemsBatchObject[["catalog_type"]] <-
          self$`catalog_type`$toJSON()
      }
      if (!is.null(self$`items`)) {
        CatalogsHotelItemsBatchObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      CatalogsHotelItemsBatchObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelItemsBatch
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelItemsBatch
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelItemsBatch
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`batch_id`)) {
        self$`batch_id` <- this_object$`batch_id`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`completed_time`)) {
        self$`completed_time` <- this_object$`completed_time`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- BatchOperationStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[HotelProcessingRecord]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelItemsBatch in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`batch_id`)) {
          sprintf(
          '"batch_id":
            "%s"
                    ',
          self$`batch_id`
          )
        },
        if (!is.null(self$`created_time`)) {
          sprintf(
          '"created_time":
            "%s"
                    ',
          self$`created_time`
          )
        },
        if (!is.null(self$`completed_time`)) {
          sprintf(
          '"completed_time":
            "%s"
                    ',
          self$`completed_time`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
          %s
          ',
          jsonlite::toJSON(self$`catalog_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsHotelItemsBatch
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelItemsBatch
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelItemsBatch
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`batch_id` <- this_object$`batch_id`
      self$`created_time` <- this_object$`created_time`
      self$`completed_time` <- this_object$`completed_time`
      self$`status` <- BatchOperationStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[HotelProcessingRecord]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsHotelItemsBatch
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelItemsBatch and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelItemsBatch: the required field `catalog_type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelItemsBatch
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
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
# CatalogsHotelItemsBatch$unlock()
#
## Below is an example to define the print function
# CatalogsHotelItemsBatch$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelItemsBatch$lock()

